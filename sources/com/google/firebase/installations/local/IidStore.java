package com.google.firebase.installations.local;

import android.util.Base64;
import com.google.firebase.FirebaseApp;
import com.google.firebase.datastorage.JavaDataStorage;
import io.sentry.android.core.v0;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import o.er5;
import o.to7;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class IidStore {
    private final String defaultSenderId;
    private final JavaDataStorage iidDataStore;
    private static final er5 STORE_KEY_PUB = new er5("|S||P|");
    private static final er5 STORE_KEY_ID = new er5("|S|id");
    private static final String[] ALLOWABLE_SCOPES = {"*", "FCM", "GCM", ""};

    public IidStore(FirebaseApp firebaseApp) {
        this.iidDataStore = new JavaDataStorage(firebaseApp.getApplicationContext(), "com.google.android.gms.appid");
        this.defaultSenderId = getDefaultSenderId(firebaseApp);
    }

    private er5 createTokenKey(String str, String str2) {
        return new er5(to7.k("|T|", str, "|", str2));
    }

    private static String getDefaultSenderId(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:") && !applicationId.startsWith("2:")) {
            return applicationId;
        }
        String[] strArrSplit = applicationId.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String getIdFromPublicKey(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            v0.j("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String parseIidTokenFromJson(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey parseKey(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            v0.j("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    private String readInstanceIdFromLocalStorage() {
        return (String) this.iidDataStore.getSync(STORE_KEY_ID, null);
    }

    private String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
        PublicKey key;
        String str = (String) this.iidDataStore.getSync(STORE_KEY_PUB, null);
        if (str == null || (key = parseKey(str)) == null) {
            return null;
        }
        return getIdFromPublicKey(key);
    }

    public String readIid() {
        String instanceIdFromLocalStorage = readInstanceIdFromLocalStorage();
        return instanceIdFromLocalStorage != null ? instanceIdFromLocalStorage : readPublicKeyFromLocalStorageAndCalculateInstanceId();
    }

    public String readToken() {
        for (String str : ALLOWABLE_SCOPES) {
            String str2 = (String) this.iidDataStore.getSync(createTokenKey(this.defaultSenderId, str), null);
            if (str2 != null && !str2.isEmpty()) {
                return str2.startsWith("{") ? parseIidTokenFromJson(str2) : str2;
            }
        }
        return null;
    }
}
