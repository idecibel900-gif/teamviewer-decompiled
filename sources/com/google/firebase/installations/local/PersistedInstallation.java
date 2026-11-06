package com.google.firebase.installations.local;

import com.google.firebase.FirebaseApp;
import io.sentry.android.core.v0;
import io.sentry.config.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PersistedInstallation {
    private File dataFile;
    private final FirebaseApp firebaseApp;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(FirebaseApp firebaseApp) {
        this.firebaseApp = firebaseApp;
    }

    private File getDataFile() {
        if (this.dataFile == null) {
            synchronized (this) {
                try {
                    if (this.dataFile == null) {
                        String str = "PersistedInstallation." + this.firebaseApp.getPersistenceKey() + ".json";
                        File file = new File(this.firebaseApp.getApplicationContext().getNoBackupFilesDir(), str);
                        this.dataFile = file;
                        if (file.exists()) {
                            return this.dataFile;
                        }
                        File file2 = new File(this.firebaseApp.getApplicationContext().getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo(this.dataFile)) {
                            v0.d("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.dataFile;
    }

    private JSONObject readJSONFromFile() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            File dataFile = getDataFile();
            FileInputStream fileInputStreamC = a.c(dataFile, new FileInputStream(dataFile));
            while (true) {
                try {
                    int i = fileInputStreamC.read(bArr, 0, 16384);
                    if (i < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStreamC.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStreamC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public void clearDataFile() {
        getDataFile().delete();
    }

    public PersistedInstallationEntry insertOrUpdatePersistedInstallationEntry(PersistedInstallationEntry persistedInstallationEntry) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", persistedInstallationEntry.getFirebaseInstallationId());
            jSONObject.put("Status", persistedInstallationEntry.getRegistrationStatus().ordinal());
            jSONObject.put("AuthToken", persistedInstallationEntry.getAuthToken());
            jSONObject.put("RefreshToken", persistedInstallationEntry.getRefreshToken());
            jSONObject.put("TokenCreationEpochInSecs", persistedInstallationEntry.getTokenCreationEpochInSecs());
            jSONObject.put("ExpiresInSecs", persistedInstallationEntry.getExpiresInSecs());
            jSONObject.put("FisError", persistedInstallationEntry.getFisError());
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.firebaseApp.getApplicationContext().getFilesDir());
            FileOutputStream fileOutputStreamG = a.g(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
            fileOutputStreamG.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStreamG.close();
            if (!fileCreateTempFile.renameTo(getDataFile())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return persistedInstallationEntry;
    }

    public PersistedInstallationEntry readPersistedInstallationEntryValue() {
        JSONObject jSONFromFile = readJSONFromFile();
        String strOptString = jSONFromFile.optString("Fid", null);
        int iOptInt = jSONFromFile.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONFromFile.optString("AuthToken", null);
        String strOptString3 = jSONFromFile.optString("RefreshToken", null);
        long jOptLong = jSONFromFile.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONFromFile.optLong("ExpiresInSecs", 0L);
        return PersistedInstallationEntry.builder().setFirebaseInstallationId(strOptString).setRegistrationStatus(RegistrationStatus.values()[iOptInt]).setAuthToken(strOptString2).setRefreshToken(strOptString3).setTokenCreationEpochInSecs(jOptLong).setExpiresInSecs(jOptLong2).setFisError(jSONFromFile.optString("FisError", null)).build();
    }
}
