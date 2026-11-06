package o;

import com.teamviewer.teamviewerlib.swig.tvclientprotobufstatistics.EventType;

/* JADX INFO: loaded from: classes.dex */
public enum ew6 implements q93 {
    ScreenOpened(EventType.View, "settings-screen", null, 20),
    OnAccountClicked(null, "account-clicked", null, 23),
    OnPermissionsClicked(null, "permissions-clicked", null, 23),
    OnFeedbackClicked(null, "feedback-clicked", null, 23),
    OnRemoteCursorClicked(null, "remote-cursor-clicked", null, 23),
    OnEnableRemoteCursor(null, "remote-cursor-enabled", null, 23),
    OnDisableRemoteCursor(null, "remote-cursor-disabled", null, 23),
    OnInteractionMethodClicked(null, "interaction-method-clicked", null, 23),
    OnInteractionMethodAdjustedTouchMode(null, "interaction-method-adjusted", "touch-mode", 7),
    OnInteractionMethodAdjustedMouseMode(null, "interaction-method-adjusted", "mouse-mode", 7),
    OnQualityClicked(null, "quality-clicked", null, 23),
    OnQualityAdjustedAutomatic(null, "quality-adjusted", "automatic", 7),
    OnQualityAdjustedOptimizeQuality(null, "quality-adjusted", "optimize-quality", 7),
    OnQualityAdjustedOptimizeSpeed(null, "quality-adjusted", "optimize-speed", 7),
    OnHideWallpaperClicked(null, "hide-wallpaper-clicked", null, 23),
    OnEnableHideWallpaper(null, "hide-wallpaper-enabled", null, 23),
    OnDisableHideWallpaper(null, "hide-wallpaper-disabled", null, 23),
    OnBiometricsClicked(null, "biometrics-clicked", null, 23),
    OnEnableBiometrics(null, "biometrics-enabled", null, 23),
    OnDisableBiometrics(null, "biometrics-disabled", null, 23),
    OnBiometricsAdjustedImmediately(null, "biometrics-adjusted", "immediately", 7),
    OnBiometricsAdjusted1min(null, "biometrics-adjusted", "1min", 7),
    OnBiometricsAdjusted5min(null, "biometrics-adjusted", "5min", 7),
    OnBiometricsAdjusted10min(null, "biometrics-adjusted", "10min", 7),
    OnSavePasswordsClicked(null, "save-passwords-clicked", null, 23),
    OnEnableSavePasswords(null, "save-passwords-enabled", null, 23),
    OnDisableSavePasswords(null, "save-passwords-disabled", null, 23),
    OnUDPClicked(null, "udp-clicked", null, 23),
    OnEnableUDP(null, "udp-enabled", null, 23),
    OnDisableUDP(null, "udp-disabled", null, 23),
    OnAudioClicked(null, "audio-clicked", null, 23),
    OnEnableAudio(null, "audio-enabled", null, 23),
    OnDisableAudio(null, "audio-disabled", null, 23),
    OnLockDeviceClicked(null, "lock-device-clicked", null, 23),
    OnLockDeviceAdjustedAutomatic(null, "lock-device-adjusted", "automatic", 7),
    OnLockDeviceAdjustedAlways(null, "lock-device-adjusted", "always", 7),
    OnLockDeviceAdjustedNever(null, "lock-device-adjusted", "never", 7),
    OnAdvancedLoggingClicked(null, "advanced-logging-clicked", null, 23),
    OnEnableAdvancedLogging(null, "advanced-logging-enabled", null, 23),
    OnDisableAdvancedLogging(null, "advanced-logging-disabled", null, 23),
    OnLogFileClicked(null, "log-file-clicked", null, 23),
    OnLogFileShared(null, "log-file-shared", null, 23),
    OnEULAClicked(null, "eula-clicked", null, 23),
    OnPrivacyPolicyClicked(null, "privacy-policy-clicked", null, 23),
    OnThirdPartyCopyrightsClicked(null, "third-party-copyrights-clicked", null, 23),
    OnTeamViewerVersionGUIDClicked(null, "teamviewer-version-guid", null, 23),
    OnTwoFactorAuthenticationClicked(null, "2fa-clicked", null, 23),
    OnRemoteTwoFactorAuthenticationSelected(null, "remote-2fa-selected", null, 23),
    OnClassicTwoFactorAuthenticationSelected(null, "classic-2fa-selected", null, 23);

    public final EventType m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f748o;
    public final String p;

    ew6(EventType eventType, String str, String str2, int i) {
        eventType = (i & 1) != 0 ? EventType.Event : eventType;
        boolean z = (i & 2) != 0;
        str2 = (i & 16) != 0 ? "" : str2;
        this.m = eventType;
        this.n = z;
        this.f748o = str;
        this.p = str2;
    }

    @Override // o.q93
    public final String a() {
        return "settings";
    }

    @Override // o.q93
    public final boolean c() {
        return this.n;
    }

    @Override // o.q93
    public final String e() {
        return this.f748o;
    }

    @Override // o.q93
    public final EventType getType() {
        return this.m;
    }

    @Override // o.q93
    public final String getValue() {
        return this.p;
    }
}
