package com.teamviewer.teamviewerlib.swig.tvconfigadapter;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public class CrashReportingConfigurationAdapter {
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CrashReportingConfigurationAdapter(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static CrashReportingConfigurationAdapter Create(AppType appType) {
        long jCrashReportingConfigurationAdapter_Create = CrashReportingConfigurationAdapterSWIGJNI.CrashReportingConfigurationAdapter_Create(appType.swigValue());
        if (jCrashReportingConfigurationAdapter_Create == 0) {
            return null;
        }
        return new CrashReportingConfigurationAdapter(jCrashReportingConfigurationAdapter_Create, true);
    }

    public static long getCPtr(CrashReportingConfigurationAdapter crashReportingConfigurationAdapter) {
        if (crashReportingConfigurationAdapter == null) {
            return 0L;
        }
        return crashReportingConfigurationAdapter.swigCPtr;
    }

    public void AddSettingsChangeCallback(VoidSignalCallback voidSignalCallback) {
        CrashReportingConfigurationAdapterSWIGJNI.CrashReportingConfigurationAdapter_AddSettingsChangeCallback(this.swigCPtr, this, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
    }

    public String GetConfigurationString() {
        return CrashReportingConfigurationAdapterSWIGJNI.CrashReportingConfigurationAdapter_GetConfigurationString(this.swigCPtr, this);
    }

    public void RegisterForConfig() {
        CrashReportingConfigurationAdapterSWIGJNI.CrashReportingConfigurationAdapter_RegisterForConfig(this.swigCPtr, this);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    CrashReportingConfigurationAdapterSWIGJNI.delete_CrashReportingConfigurationAdapter(j);
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
