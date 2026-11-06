package o;

import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pv6 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ px4 f1781o;

    public /* synthetic */ pv6(Function1 function1, px4 px4Var, byte b) {
        this.m = b;
        this.n = function1;
        this.f1781o = px4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.f1781o;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(ew6.OnPrivacyPolicyClicked);
                io1.w(function1, px4Var, "PRIVACY_POLICY_WEB");
                break;
            case 1:
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(ew6.OnAudioClicked);
                io1.w(function1, px4Var, "MUSIC_AND_SOUND");
                break;
            case 2:
                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                ga7.a(ew6.OnLogFileClicked);
                io1.w(function1, px4Var, "LOGFILE");
                break;
            case 3:
                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                ga7.a(ew6.OnThirdPartyCopyrightsClicked);
                io1.w(function1, px4Var, "COPYRIGHT");
                break;
            case 4:
                IStatisticsHandler iStatisticsHandler5 = ga7.a;
                ga7.a(ew6.OnRemoteCursorClicked);
                io1.w(function1, px4Var, "REMOTE_CURSOR");
                break;
            case 5:
                IStatisticsHandler iStatisticsHandler6 = ga7.a;
                ga7.a(ew6.OnHideWallpaperClicked);
                io1.w(function1, px4Var, "WALLPAPER");
                break;
            case 6:
                IStatisticsHandler iStatisticsHandler7 = ga7.a;
                ga7.a(ew6.OnSavePasswordsClicked);
                io1.w(function1, px4Var, "PASSWORDS");
                break;
            case 7:
                IStatisticsHandler iStatisticsHandler8 = ga7.a;
                ga7.a(ew6.OnPermissionsClicked);
                io1.w(function1, px4Var, "PERMISSIONS");
                break;
            case 8:
                IStatisticsHandler iStatisticsHandler9 = ga7.a;
                ga7.a(ew6.OnTwoFactorAuthenticationClicked);
                io1.w(function1, px4Var, "TFA");
                break;
            case ep1.b /* 9 */:
                IStatisticsHandler iStatisticsHandler10 = ga7.a;
                ga7.a(ew6.OnUDPClicked);
                io1.w(function1, px4Var, "UDP");
                break;
            case ep1.c /* 10 */:
                IStatisticsHandler iStatisticsHandler11 = ga7.a;
                ga7.a(ew6.OnBiometricsClicked);
                io1.w(function1, px4Var, "BIOMETRICS");
                break;
            case 11:
                IStatisticsHandler iStatisticsHandler12 = ga7.a;
                ga7.a(ew6.OnFeedbackClicked);
                io1.w(function1, px4Var, "FEEDBACK");
                break;
            case ep1.d /* 12 */:
                IStatisticsHandler iStatisticsHandler13 = ga7.a;
                ga7.a(ew6.OnAdvancedLoggingClicked);
                io1.w(function1, px4Var, "ADVANCED_LOGGING");
                break;
            default:
                IStatisticsHandler iStatisticsHandler14 = ga7.a;
                ga7.a(ew6.OnEULAClicked);
                io1.w(function1, px4Var, "EULA_WEB");
                break;
        }
        return f88Var;
    }
}
