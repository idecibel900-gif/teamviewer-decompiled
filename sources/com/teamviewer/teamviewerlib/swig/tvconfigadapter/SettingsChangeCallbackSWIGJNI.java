package com.teamviewer.teamviewerlib.swig.tvconfigadapter;

/* JADX INFO: loaded from: classes.dex */
public class SettingsChangeCallbackSWIGJNI {
    static {
        swig_module_init();
    }

    public static final native void SettingsChangeCallback_OnSettingsChanged(long j, SettingsChangeCallback settingsChangeCallback);

    public static final native void SettingsChangeCallback_OnSettingsChangedSwigExplicitSettingsChangeCallback(long j, SettingsChangeCallback settingsChangeCallback);

    public static final native void SettingsChangeCallback_change_ownership(SettingsChangeCallback settingsChangeCallback, long j, boolean z);

    public static final native void SettingsChangeCallback_director_connect(SettingsChangeCallback settingsChangeCallback, long j, boolean z, boolean z2);

    public static void SwigDirector_SettingsChangeCallback_OnSettingsChanged(SettingsChangeCallback settingsChangeCallback) {
        settingsChangeCallback.OnSettingsChanged();
    }

    public static final native void delete_SettingsChangeCallback(long j);

    public static final native long new_SettingsChangeCallback();

    private static final native void swig_module_init();
}
