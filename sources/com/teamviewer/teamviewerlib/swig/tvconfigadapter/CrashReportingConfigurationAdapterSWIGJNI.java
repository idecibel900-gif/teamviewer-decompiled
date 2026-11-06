package com.teamviewer.teamviewerlib.swig.tvconfigadapter;

import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public class CrashReportingConfigurationAdapterSWIGJNI {
    public static final native void CrashReportingConfigurationAdapter_AddSettingsChangeCallback(long j, CrashReportingConfigurationAdapter crashReportingConfigurationAdapter, long j2, VoidSignalCallback voidSignalCallback);

    public static final native long CrashReportingConfigurationAdapter_Create(int i);

    public static final native String CrashReportingConfigurationAdapter_GetConfigurationString(long j, CrashReportingConfigurationAdapter crashReportingConfigurationAdapter);

    public static final native void CrashReportingConfigurationAdapter_RegisterForConfig(long j, CrashReportingConfigurationAdapter crashReportingConfigurationAdapter);

    public static final native void delete_CrashReportingConfigurationAdapter(long j);
}
