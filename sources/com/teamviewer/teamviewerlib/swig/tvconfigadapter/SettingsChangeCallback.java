package com.teamviewer.teamviewerlib.swig.tvconfigadapter;

/* JADX INFO: loaded from: classes.dex */
public class SettingsChangeCallback {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public SettingsChangeCallback() {
        this(SettingsChangeCallbackSWIGJNI.new_SettingsChangeCallback(), true);
        SettingsChangeCallbackSWIGJNI.SettingsChangeCallback_director_connect(this, this.swigCPtr, true, true);
    }

    public static long getCPtr(SettingsChangeCallback settingsChangeCallback) {
        if (settingsChangeCallback == null) {
            return 0L;
        }
        return settingsChangeCallback.swigCPtr;
    }

    public void OnSettingsChanged() {
        Class<?> cls = getClass();
        long j = this.swigCPtr;
        if (cls == SettingsChangeCallback.class) {
            SettingsChangeCallbackSWIGJNI.SettingsChangeCallback_OnSettingsChanged(j, this);
        } else {
            SettingsChangeCallbackSWIGJNI.SettingsChangeCallback_OnSettingsChangedSwigExplicitSettingsChangeCallback(j, this);
        }
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    SettingsChangeCallbackSWIGJNI.delete_SettingsChangeCallback(j);
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

    public void swigDirectorDisconnect() {
        swigSetCMemOwn(false);
        delete();
    }

    public void swigReleaseOwnership() {
        swigSetCMemOwn(false);
        SettingsChangeCallbackSWIGJNI.SettingsChangeCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }

    public void swigTakeOwnership() {
        swigSetCMemOwn(true);
        SettingsChangeCallbackSWIGJNI.SettingsChangeCallback_change_ownership(this, this.swigCPtr, true);
    }

    public SettingsChangeCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
