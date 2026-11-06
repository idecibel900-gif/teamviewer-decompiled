package com.teamviewer.teamviewerlib.swig.tvconfigadapter;

/* JADX INFO: loaded from: classes.dex */
public class ISessionDurationConditionHelper {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public ISessionDurationConditionHelper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ISessionDurationConditionHelper iSessionDurationConditionHelper) {
        if (iSessionDurationConditionHelper == null) {
            return 0L;
        }
        return iSessionDurationConditionHelper.swigCPtr;
    }

    public boolean IsSessionDurationConditionSatisfied(long j) {
        return ISessionDurationConditionHelperSWIGJNI.ISessionDurationConditionHelper_IsSessionDurationConditionSatisfied(this.swigCPtr, this, j);
    }

    public void OnConfigurationChanged() {
        ISessionDurationConditionHelperSWIGJNI.ISessionDurationConditionHelper_OnConfigurationChanged(this.swigCPtr, this);
    }

    public void RegisterForConfigurationChanged(SettingsChangeCallback settingsChangeCallback) {
        ISessionDurationConditionHelperSWIGJNI.ISessionDurationConditionHelper_RegisterForConfigurationChanged(this.swigCPtr, this, SettingsChangeCallback.getCPtr(settingsChangeCallback), settingsChangeCallback);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ISessionDurationConditionHelperSWIGJNI.delete_ISessionDurationConditionHelper(j);
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

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }
}
