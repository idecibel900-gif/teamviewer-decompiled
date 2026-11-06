package com.teamviewer.teamviewerlib.swig.tvconfigadapter;

/* JADX INFO: loaded from: classes.dex */
public class AndroidExtraConfigurationAdapterSWIGJNI {
    public static final native void AndroidExtraConfigurationAdapter_AddSettingsChangeCallback(long j, AndroidExtraConfigurationAdapter androidExtraConfigurationAdapter, long j2, SettingsChangeCallback settingsChangeCallback);

    public static final native long AndroidExtraConfigurationAdapter_Create();

    public static final native String AndroidExtraConfigurationAdapter_GetSamsungBackwardCompatibleKey(long j, AndroidExtraConfigurationAdapter androidExtraConfigurationAdapter);

    public static final native String AndroidExtraConfigurationAdapter_GetSamsungKpeStandardKey(long j, AndroidExtraConfigurationAdapter androidExtraConfigurationAdapter);

    public static final native long AndroidExtraConfigurationAdapter_GetSignedMessageRepresentation(long j, AndroidExtraConfigurationAdapter androidExtraConfigurationAdapter, int i);

    public static final native void AndroidExtraConfigurationAdapter_RegisterForExtra(long j, AndroidExtraConfigurationAdapter androidExtraConfigurationAdapter);

    public static final native void AndroidExtraConfigurationAdapter_RemoveSettingsChangeCallback(long j, AndroidExtraConfigurationAdapter androidExtraConfigurationAdapter, long j2, SettingsChangeCallback settingsChangeCallback);

    public static final native void delete_AndroidExtraConfigurationAdapter(long j);
}
