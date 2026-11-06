package com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter;

import com.teamviewer.firebaseconfiglib.credential.FirebaseCredential;
import com.teamviewer.incomingrcsharedlib.communication.SignedMessage;
import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;
import java.io.UnsupportedEncodingException;
import o.aw;
import o.c72;
import o.i21;
import o.oi;
import o.ye4;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseConfigurationAdapter {
    public static final int HostFirebaseOptionFeatureID = 16;
    public static final int PilotFirebaseOptionFeatureID = 19;
    public static final int RCFirebaseOptionFeatureID = 18;
    private static final String TAG = "FirebaseConfigurationAdapter";
    private static final int validDurationInDay = 2;
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public FirebaseConfigurationAdapter(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static FirebaseConfigurationAdapter Create(int i) {
        long jFirebaseConfigurationAdapter_Create = FirebaseConfigurationAdapterSWIGJNI.FirebaseConfigurationAdapter_Create(i);
        if (jFirebaseConfigurationAdapter_Create == 0) {
            return null;
        }
        return new FirebaseConfigurationAdapter(jFirebaseConfigurationAdapter_Create, true);
    }

    public static long getCPtr(FirebaseConfigurationAdapter firebaseConfigurationAdapter) {
        if (firebaseConfigurationAdapter == null) {
            return 0L;
        }
        return firebaseConfigurationAdapter.swigCPtr;
    }

    public static SignedMessage getSignedMessage(long j) {
        BCommandNativeImpl bCommandNativeImpl = new BCommandNativeImpl(j);
        byte[] bArr = (byte[]) bCommandNativeImpl.m(i21.SignedFields).n;
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte[]) bCommandNativeImpl.m(new oi(bArr, i, (byte) 1)).n;
        }
        SignedMessage signedMessage = new SignedMessage(bArr, bArr2, (byte[]) bCommandNativeImpl.m(i21.Signature).n);
        bCommandNativeImpl.k();
        return signedMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte lambda$getSignedMessage$0(byte[] bArr, int i) {
        return bArr[i];
    }

    public void AddFirebaseConfigReadyCallback(FirebaseConfigReadyCallBack firebaseConfigReadyCallBack) {
        FirebaseConfigurationAdapterSWIGJNI.FirebaseConfigurationAdapter_AddFirebaseConfigReadyCallback(this.swigCPtr, this, FirebaseConfigReadyCallBack.getCPtr(firebaseConfigReadyCallBack), firebaseConfigReadyCallBack);
    }

    public long GetSignedMessageRepresentation(int i) {
        return FirebaseConfigurationAdapterSWIGJNI.FirebaseConfigurationAdapter_GetSignedMessageRepresentation(this.swigCPtr, this, i);
    }

    public void RegisterForFirebase() {
        FirebaseConfigurationAdapterSWIGJNI.FirebaseConfigurationAdapter_RegisterForFirebase(this.swigCPtr, this);
    }

    public void RemoveFirebaseConfigReadyCallback(FirebaseConfigReadyCallBack firebaseConfigReadyCallBack) {
        FirebaseConfigurationAdapterSWIGJNI.FirebaseConfigurationAdapter_RemoveFirebaseConfigReadyCallback(this.swigCPtr, this, FirebaseConfigReadyCallBack.getCPtr(firebaseConfigReadyCallBack), firebaseConfigReadyCallBack);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    FirebaseConfigurationAdapterSWIGJNI.delete_FirebaseConfigurationAdapter(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public String getApiKeyfromJSON(JSONObject jSONObject, int i) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("client");
            if (jSONArray.length() > i) {
                return jSONArray.getJSONObject(i).getJSONArray("api_key").getJSONObject(0).getString("current_key");
            }
            ye4.c(TAG, "getApiKeyfromJSON failed, index of client_info out of bound");
            return null;
        } catch (JSONException unused) {
            ye4.c(TAG, "JSON parser failed, cannot get api key");
            return null;
        }
    }

    public FirebaseCredential getCredential(int i) {
        JSONObject firebaseOptionAsJSON = getFirebaseOptionAsJSON(1);
        if (firebaseOptionAsJSON != null) {
            String projectIDfromJSON = getProjectIDfromJSON(firebaseOptionAsJSON);
            String firebaseUrlfromJSON = getFirebaseUrlfromJSON(firebaseOptionAsJSON);
            String storagebucketfromJSON = getStoragebucketfromJSON(firebaseOptionAsJSON);
            String sdkAppIDfromJSON = getSdkAppIDfromJSON(firebaseOptionAsJSON, i);
            String apiKeyfromJSON = getApiKeyfromJSON(firebaseOptionAsJSON, i);
            FirebaseCredential.Companion.getClass();
            aw awVar = c72.n;
            String strValueOf = String.valueOf((long) ((System.currentTimeMillis() / 1000.0d) + 172800.0d));
            if (projectIDfromJSON != null && firebaseUrlfromJSON != null && storagebucketfromJSON != null && sdkAppIDfromJSON != null && apiKeyfromJSON != null) {
                return new FirebaseCredential(projectIDfromJSON, firebaseUrlfromJSON, storagebucketfromJSON, sdkAppIDfromJSON, apiKeyfromJSON, strValueOf);
            }
            ye4.c(TAG, "not all credential retrieve successfully");
        }
        return null;
    }

    public JSONObject getFirebaseOptionAsJSON(int i) {
        SignedMessage signedFirebaseOption = getSignedFirebaseOption(i);
        if (signedFirebaseOption == null) {
            return null;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = signedFirebaseOption.m;
            if (i2 >= bArr.length) {
                i2 = -1;
                break;
            }
            if (bArr[i2] == 1) {
                break;
            }
            i2++;
        }
        try {
            try {
                return new JSONObject(new String(i2 == -1 ? null : signedFirebaseOption.n[i2], "UTF-8"));
            } catch (JSONException unused) {
                ye4.c(TAG, "getFirebaseOptionAsJSON failed, unable to transfer String to JSONObject");
                return null;
            }
        } catch (UnsupportedEncodingException unused2) {
            ye4.c(TAG, "getFirebaseOptionAsJSON failed, unable to transfer SignedMessage to String");
            return null;
        }
    }

    public String getFirebaseUrlfromJSON(JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject("project_info").getString("firebase_url");
        } catch (JSONException unused) {
            ye4.c(TAG, "JSON parser failed, cannot get firebase url");
            return null;
        }
    }

    public String getProjectIDfromJSON(JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject("project_info").getString("project_id");
        } catch (JSONException unused) {
            ye4.c(TAG, "JSON parser failed, cannot get project id");
            return null;
        }
    }

    public String getSdkAppIDfromJSON(JSONObject jSONObject, int i) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("client");
            if (jSONArray.length() > i) {
                return jSONArray.getJSONObject(i).getJSONObject("client_info").getString("mobilesdk_app_id");
            }
            ye4.c(TAG, "getSdkAppIDfromJSON failed, index of client_info out of bound");
            return null;
        } catch (JSONException unused) {
            ye4.c(TAG, "JSON parser failed, cannot get mobilesdk app id");
            return null;
        }
    }

    public SignedMessage getSignedFirebaseOption(int i) {
        long jGetSignedMessageRepresentation = GetSignedMessageRepresentation(i);
        if (jGetSignedMessageRepresentation != 0) {
            return getSignedMessage(jGetSignedMessageRepresentation);
        }
        ye4.c(TAG, "No Firebase option is available");
        return null;
    }

    public String getStoragebucketfromJSON(JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject("project_info").getString("storage_bucket");
        } catch (JSONException unused) {
            ye4.c(TAG, "JSON parser failed, cannot get storage bucket");
            return null;
        }
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }
}
