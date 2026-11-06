package o;

import android.content.Context;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jv6 implements Function0 {
    public final /* synthetic */ byte m;

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                int i = SettingsActivity.Q;
                return new gp5();
            case 1:
                return h57.p(null);
            case 2:
                return new tx6();
            case 3:
                return f88Var;
            case 4:
                return qf0.L(new w57(R.string.solutions_qs_card_headline, R.string.solutions_qs_card_explanatory_text, R.drawable.solutions_qs_logo, "com.teamviewer.quicksupport.market", "qs"), new w57(R.string.solutions_assistar_card_headline, R.string.solutions_pilot_card_explanatory_text, R.drawable.solutions_pilot_logo, "com.teamviewer.pilot", "pilot"), new w57(R.string.solutions_host_card_headline, R.string.solutions_host_card_explanatory_text, R.drawable.solutions_host_logo, "com.teamviewer.host.market", "host"), new w57(R.string.solutions_meeting_card_headline, R.string.solutions_meeting_card_explanatory_text, R.drawable.solutions_teamviewer_meetings_logo, "com.teamviewer.blizz.market", "blizz"));
            case 5:
                return h57.p(null);
            case 7:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(q31.x);
                Context context = d82.M;
                if (context == null) {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    break;
                } else {
                    String string = context.getString(R.string.session_copy_link);
                    string.getClass();
                    fx3.r(string, 1, context, bu7.MAIN);
                    break;
                }
            case 6:
                return f88Var;
            case 8:
                IStatisticsHandler iStatisticsHandler2 = ga7.a;
                ga7.a(q31.z);
                Context context2 = d82.M;
                if (context2 != null) {
                    String string2 = context2.getString(R.string.session_copy_code);
                    string2.getClass();
                    fx3.r(string2, 1, context2, bu7.MAIN);
                } else {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                }
                return f88Var;
            case ep1.b /* 9 */:
                IStatisticsHandler iStatisticsHandler3 = ga7.a;
                ga7.a(q31.w);
                return f88Var;
            case ep1.c /* 10 */:
                IStatisticsHandler iStatisticsHandler4 = ga7.a;
                ga7.a(q31.y);
                return f88Var;
            case 11:
                return new w32(0.0f);
            case ep1.d /* 12 */:
                return new yf5(0);
            case 13:
                return h57.p(Boolean.TRUE);
            case 14:
                return h57.p(Boolean.FALSE);
            case 15:
                return h57.p(Boolean.FALSE);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                c36 c36Var = zu1.c;
                if (c36Var != null) {
                    return new gi7(c36Var.d, c36Var.b);
                }
                hk0.g("Required value was null.");
                return null;
            case 17:
                c36 c36Var2 = zu1.c;
                if (c36Var2 != null) {
                    return new pk7(c36Var2.d, c36Var2.b);
                }
                hk0.g("Required value was null.");
                return null;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                c36 c36Var3 = zu1.c;
                if (c36Var3 != null) {
                    return new fl7(c36Var3.d, c36Var3.b, c36Var3.c);
                }
                hk0.g("Required value was null.");
                return null;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return f88Var;
            case 20:
            case 21:
                return null;
            case 22:
                return l68.a;
            case 23:
                return new vk3(0L);
            case 24:
                return new vk3(0L);
            case 25:
                return sl1.a;
            case 26:
                long j = vv0.a;
                long j2 = vv0.c;
                long j3 = vv0.b;
                long j4 = vv0.d;
                long j5 = vv0.e;
                long j6 = vv0.f;
                long j7 = vv0.g;
                long j8 = vv0.h;
                long j9 = vv0.i;
                long j10 = vv0.j;
                long j11 = vv0.k;
                long j12 = vv0.l;
                long j13 = vv0.m;
                long j14 = vv0.n;
                long j15 = vv0.f2349o;
                long j16 = vv0.p;
                long j17 = vv0.q;
                long j18 = vv0.r;
                long j19 = vv0.s;
                long j20 = vv0.t;
                long j21 = vv0.u;
                long j22 = vv0.v;
                long j23 = vv0.w;
                long j24 = vv0.x;
                long j25 = vv0.B;
                long j26 = vv0.C;
                long j27 = vv0.D;
                return bw0.d(j, j3, j4, j5, vv0.A, j6, j7, j8, j9, j10, j11, j12, j13, j19, j20, j21, j22, j23, j24, vv0.E, vv0.y, vv0.z, j14, j15, j16, j17, j18, vv0.F, vv0.G, j26, j27, j25, j2, 1610612736, 65500);
            case 27:
                long j28 = vv0.X;
                long j29 = vv0.Z;
                long j30 = vv0.Y;
                long j31 = vv0.a0;
                long j32 = vv0.b0;
                long j33 = vv0.c0;
                long j34 = vv0.d0;
                long j35 = vv0.e0;
                long j36 = vv0.f0;
                long j37 = vv0.g0;
                long j38 = vv0.h0;
                long j39 = vv0.i0;
                long j40 = vv0.j0;
                long j41 = vv0.k0;
                long j42 = vv0.l0;
                long j43 = vv0.m0;
                long j44 = vv0.n0;
                long j45 = vv0.o0;
                long j46 = vv0.p0;
                long j47 = vv0.q0;
                long j48 = vv0.r0;
                long j49 = vv0.s0;
                long j50 = vv0.t0;
                long j51 = vv0.u0;
                long j52 = vv0.v0;
                long j53 = vv0.w0;
                long j54 = vv0.x0;
                long j55 = vv0.y0;
                long j56 = vv0.z0;
                long j57 = vv0.A0;
                long j58 = vv0.B0;
                long j59 = vv0.C0;
                long j60 = vv0.D0;
                h72 h72Var = bw0.a;
                return new zv0(j28, j30, j31, j32, j54, j33, j34, j35, j36, j37, j38, j39, j40, j46, j47, j48, j49, j50, j51, j58, j52, j53, j41, j42, j43, j44, j45, j59, j60, sv0.j, sv0.m, sv0.k, j56, j57, j55, sv0.l, sv0.g, j29, sv0.a, sv0.b, sv0.h, sv0.i, sv0.c, sv0.d, sv0.n, sv0.f2058o, sv0.e, sv0.f);
            case 28:
                h72 h72Var2 = tu7.a;
                return vl1.a;
            default:
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ jv6(byte b) {
        this.m = b;
    }
}
