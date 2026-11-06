package com.teamviewer.teamviewerlib.swig.tvconfigadapter;

/* JADX INFO: loaded from: classes.dex */
public class ISessionDurationConditionHelperSWIGJNI {
    public static final native boolean ISessionDurationConditionHelper_IsSessionDurationConditionSatisfied(long j, ISessionDurationConditionHelper iSessionDurationConditionHelper, long j2);

    public static final native void ISessionDurationConditionHelper_OnConfigurationChanged(long j, ISessionDurationConditionHelper iSessionDurationConditionHelper);

    public static final native void ISessionDurationConditionHelper_RegisterForConfigurationChanged(long j, ISessionDurationConditionHelper iSessionDurationConditionHelper, long j2, SettingsChangeCallback settingsChangeCallback);

    public static final native void delete_ISessionDurationConditionHelper(long j);
}
