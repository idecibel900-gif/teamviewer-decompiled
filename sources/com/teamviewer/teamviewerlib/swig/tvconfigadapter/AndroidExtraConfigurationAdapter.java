package com.teamviewer.teamviewerlib.swig.tvconfigadapter;

import com.teamviewer.incomingrcsharedlib.communication.SignedMessage;
import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;
import o.i21;
import o.oi;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public class AndroidExtraConfigurationAdapter {
    public static final int BlockInstalledOEMAddonForHost = 8;
    public static final int BlockInstalledOEMAddonForQS = 7;
    public static final int CheckRevocationListForHost = 6;
    public static final int CheckRevocationListForQS = 5;
    public static final int RevocationListFeatureIndex = 1;
    public static final int SamsungBackwardCompatibleKeyFeatureIndex = 3;
    public static final int SamsungKpeStandardKeyFeatureIndex = 4;
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public AndroidExtraConfigurationAdapter(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static AndroidExtraConfigurationAdapter Create() {
        long jAndroidExtraConfigurationAdapter_Create = AndroidExtraConfigurationAdapterSWIGJNI.AndroidExtraConfigurationAdapter_Create();
        if (jAndroidExtraConfigurationAdapter_Create == 0) {
            return null;
        }
        return new AndroidExtraConfigurationAdapter(jAndroidExtraConfigurationAdapter_Create, true);
    }

    public static long getCPtr(AndroidExtraConfigurationAdapter androidExtraConfigurationAdapter) {
        if (androidExtraConfigurationAdapter == null) {
            return 0L;
        }
        return androidExtraConfigurationAdapter.swigCPtr;
    }

    private static SignedMessage getSignedMessageFromAddress(long j) {
        BCommandNativeImpl bCommandNativeImpl = new BCommandNativeImpl(j);
        byte[] bArr = (byte[]) bCommandNativeImpl.m(i21.SignedFields).n;
        byte[][] bArr2 = new byte[bArr.length][];
        byte b = 0;
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte[]) bCommandNativeImpl.m(new oi(bArr, i, b)).n;
        }
        SignedMessage signedMessage = new SignedMessage(bArr, bArr2, (byte[]) bCommandNativeImpl.m(i21.Signature).n);
        bCommandNativeImpl.k();
        return signedMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte lambda$getSignedMessageFromAddress$0(byte[] bArr, int i) {
        return bArr[i];
    }

    public void AddSettingsChangeCallback(SettingsChangeCallback settingsChangeCallback) {
        AndroidExtraConfigurationAdapterSWIGJNI.AndroidExtraConfigurationAdapter_AddSettingsChangeCallback(this.swigCPtr, this, SettingsChangeCallback.getCPtr(settingsChangeCallback), settingsChangeCallback);
    }

    public String GetSamsungBackwardCompatibleKey() {
        return AndroidExtraConfigurationAdapterSWIGJNI.AndroidExtraConfigurationAdapter_GetSamsungBackwardCompatibleKey(this.swigCPtr, this);
    }

    public String GetSamsungKpeStandardKey() {
        return AndroidExtraConfigurationAdapterSWIGJNI.AndroidExtraConfigurationAdapter_GetSamsungKpeStandardKey(this.swigCPtr, this);
    }

    public long GetSignedMessageRepresentation(int i) {
        return AndroidExtraConfigurationAdapterSWIGJNI.AndroidExtraConfigurationAdapter_GetSignedMessageRepresentation(this.swigCPtr, this, i);
    }

    public void RegisterForExtra() {
        AndroidExtraConfigurationAdapterSWIGJNI.AndroidExtraConfigurationAdapter_RegisterForExtra(this.swigCPtr, this);
    }

    public void RemoveSettingsChangeCallback(SettingsChangeCallback settingsChangeCallback) {
        AndroidExtraConfigurationAdapterSWIGJNI.AndroidExtraConfigurationAdapter_RemoveSettingsChangeCallback(this.swigCPtr, this, SettingsChangeCallback.getCPtr(settingsChangeCallback), settingsChangeCallback);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    AndroidExtraConfigurationAdapterSWIGJNI.delete_AndroidExtraConfigurationAdapter(j);
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

    public SignedMessage getSignedMessageFromIndex(int i) {
        long jGetSignedMessageRepresentation = GetSignedMessageRepresentation(i);
        if (jGetSignedMessageRepresentation != 0) {
            return getSignedMessageFromAddress(jGetSignedMessageRepresentation);
        }
        ye4.c("AndroidExtraConfigurationAdapter", "Cannot verify with addon. Message not provided.");
        return null;
    }

    public SignedMessage getSignedRevocationList() {
        long jGetSignedMessageRepresentation = GetSignedMessageRepresentation(1);
        if (jGetSignedMessageRepresentation != 0) {
            return getSignedMessageFromAddress(jGetSignedMessageRepresentation);
        }
        ye4.c("AndroidExtraConfigurationAdapter", "Cannot verify with addon. No revocation list available.");
        return null;
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }
}
