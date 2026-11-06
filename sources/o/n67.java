package o;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class n67 {
    public static String A(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append("@");
            sb.append(hexString);
            String string = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb2 = new StringBuilder(string.length() + 8 + name2.length() + 1);
            e41.t(sb2, "<", string, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case ep1.c /* 10 */:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case ep1.b /* 9 */:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case ep1.b /* 9 */:
                objArr[2] = "capture";
                break;
            case ep1.c /* 10 */:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void b(final nl7 nl7Var, final long j, fs4 fs4Var, String str, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2Var.Y(217202276);
        int i2 = i | (ux2Var.f(nl7Var) ? 4 : 2) | (ux2Var.e(j) ? 32 : 16) | 384 | (ux2Var.f(str) ? 2048 : 1024);
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            cs4 cs4Var = cs4.b;
            if (nl7Var != null) {
                ux2Var.W(-1842522832);
                au8.p(nl7Var.b, androidx.compose.ui.platform.a.a(cs4Var, str.concat("-TVSnackbarActionButton")), false, sf6.a(6.0f), null, null, au8.O(-1382940228, new iw2() { // from class: o.pl7
                    @Override // o.iw2
                    public final Object d(Object obj, Object obj2, Object obj3) {
                        ux2 ux2Var2 = (ux2) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((eg6) obj).getClass();
                        if (ux2Var2.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                            qs7.b(nl7Var.a, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.m, ux2Var2, 0, 0, 131066);
                        } else {
                            ux2Var2.Q();
                        }
                        return f88.a;
                    }
                }, ux2Var), ux2Var, 805306368, 500);
                ux2Var.p(false);
            } else {
                ux2Var.W(-1842165154);
                ux2Var.p(false);
            }
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ql7(nl7Var, j, fs4Var2, str, i);
        }
    }

    public static final void c(Function0 function0, long j, fs4 fs4Var, String str, String str2, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        cs4 cs4Var;
        ux2Var.Y(-1005936068);
        int i2 = i | (ux2Var.h(function0) ? 4 : 2) | (ux2Var.e(j) ? 32 : 16) | 384 | (ux2Var.f(str) ? 2048 : 1024) | (ux2Var.f(str2) ? 16384 : 8192);
        if (ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            cs4 cs4Var2 = cs4.b;
            if (function0 != null) {
                ux2Var.W(-1854345590);
                long j2 = rv0.g;
                long j3 = rv0.h;
                cs4Var = cs4Var2;
                xo1.g(function0, androidx.compose.ui.platform.a.a(cs4Var, str.concat("-TVSnackbarDismissButton")), false, sf6.a(6.0f), d82.l(((rn4) ux2Var.j(un4.a)).a, ((rv0) ux2Var.j(wa1.a)).a).a(j3, j2, j3, rv0.b(0.38f, j2)), au8.O(696207393, new th(str2, j), ux2Var), ux2Var, 1572864 | (i2 & 14));
                ux2Var.p(false);
            } else {
                cs4Var = cs4Var2;
                ux2Var.W(-1853882202);
                ux2Var.p(false);
            }
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new dx0(function0, j, fs4Var2, str, str2, i);
        }
    }

    public static final void d(boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        Function1 function2;
        fs4 fs4Var2;
        ux2Var.Y(1954042277);
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function2 = function1;
            i2 |= ux2Var.h(function2) ? 32 : 16;
        } else {
            function2 = function1;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f("TVTA-settings-soundAndMusic") ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            fs4Var2 = fs4Var;
            i2 |= ux2Var.f(fs4Var2) ? 2048 : 1024;
        } else {
            fs4Var2 = fs4Var;
        }
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            l47.d(new sk7(y57.g(R.string.settings_soundAndMusic), y57.g(R.string.settings_soundAndMusic_subtitle), new yk7(R.drawable.sound), null, 24), z, function2, fs4Var2, "TVTA-settings-soundAndMusic", m77.z(R.string.settings_soundAndMusic, ux2Var), ux2Var, ((i2 << 3) & 1008) | (i2 & 7168) | ((i2 << 6) & 57344), 32);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new kc(z, function1, fs4Var, i, (byte) 4);
        }
    }

    public static final void e(boolean z, boolean z2, Function1 function1, int i, Function0 function0, fs4 fs4Var, String str, ux2 ux2Var, int i2) {
        String str2;
        function1.getClass();
        function0.getClass();
        ux2Var.Y(395016150);
        int i3 = i2 | (ux2Var.g(z) ? 4 : 2) | (ux2Var.g(z2) ? 32 : 16) | (ux2Var.h(function1) ? 256 : 128) | (ux2Var.d(i) ? 2048 : 1024) | (ux2Var.h(function0) ? 16384 : 8192) | (ux2Var.f(fs4Var) ? 131072 : 65536) | 1572864;
        if (ux2Var.N(i3 & 1, (599187 & i3) != 599186)) {
            if (z) {
                ux2Var.W(-283979638);
                f(i, ((i3 >> 6) & 7168) | ((i3 >> 9) & 126) | 384, function0, ux2Var, fs4Var);
                ux2Var.p(false);
            } else {
                ux2Var.W(-283812455);
                d(z2, function1, fs4Var, ux2Var, ((i3 >> 6) & 7168) | ((i3 >> 3) & 126) | 384);
                ux2Var.p(false);
            }
            str2 = "TVTA-settings-soundAndMusic";
        } else {
            ux2Var.Q();
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ic(z, z2, function1, i, function0, fs4Var, str2, i2, (byte) 4);
        }
    }

    public static final void f(int i, int i2, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i3;
        Function0 function1;
        ux2Var.Y(-1536183960);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            function1 = function0;
            i3 |= ux2Var.h(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.f("TVTA-settings-soundAndMusic") ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = (i3 >> 6) & 112;
            int i5 = i3 << 6;
            x37.e(new sk7(y57.g(R.string.settings_soundAndMusic), y57.g(i), new yk7(R.drawable.sound), null, 24), fs4Var, null, function1, "TVTA-settings-soundAndMusic", ux2Var, (i5 & 57344) | i4 | (i5 & 7168), 36);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new jc(i, function0, fs4Var, i2, (byte) 4);
        }
    }

    public static final void g(o37 o37Var, fs4 fs4Var, String str, String str2, ux2 ux2Var, int i) {
        int i2;
        fs4 fs4Var2;
        String str3;
        String str4;
        long jC;
        long jC2;
        long jC3;
        long jC4;
        ux2Var.Y(-769487035);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(o37Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            fs4Var2 = fs4Var;
            i2 |= ux2Var.f(fs4Var2) ? 32 : 16;
        } else {
            fs4Var2 = fs4Var;
        }
        if ((i & 384) == 0) {
            str3 = str;
            i2 |= ux2Var.f(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i & 3072) == 0) {
            str4 = str2;
            i2 |= ux2Var.f(str4) ? 2048 : 1024;
        } else {
            str4 = str2;
        }
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2;
            ul7 ul7Var = o37Var.a;
            if (ul7Var != null) {
                ux2Var.W(-1547536160);
                sl7 sl7Var = ul7Var.a;
                ux2Var.W(248047376);
                switch (sl7Var.ordinal()) {
                    case 0:
                        ux2Var.W(733149962);
                        jC = bw0.c(uf0.K, ux2Var);
                        ux2Var.p(false);
                        break;
                    case 1:
                        ux2Var.W(733151988);
                        jC = ((tf2) ux2Var.j(vf2.a)).n;
                        ux2Var.p(false);
                        break;
                    case 2:
                        ux2Var.W(733154260);
                        jC = ((tf2) ux2Var.j(vf2.a)).n;
                        ux2Var.p(false);
                        break;
                    case 3:
                        ux2Var.W(733156565);
                        jC = ((tf2) ux2Var.j(vf2.a)).j;
                        ux2Var.p(false);
                        break;
                    case 4:
                        ux2Var.W(733158967);
                        jC = ((tf2) ux2Var.j(vf2.a)).b;
                        ux2Var.p(false);
                        break;
                    case 5:
                        ux2Var.W(733161424);
                        jC = ((tf2) ux2Var.j(vf2.a)).m;
                        ux2Var.p(false);
                        break;
                    case 6:
                        ux2Var.W(733163671);
                        jC = ((tf2) ux2Var.j(vf2.a)).d;
                        ux2Var.p(false);
                        break;
                    case 7:
                        ux2Var.W(733166102);
                        jC = ((tf2) ux2Var.j(vf2.a)).i;
                        ux2Var.p(false);
                        break;
                    case 8:
                        ux2Var.W(733168565);
                        jC = ((tf2) ux2Var.j(vf2.a)).f2104o;
                        ux2Var.p(false);
                        break;
                    default:
                        throw fx3.m(733148328, ux2Var, false);
                }
                long j = jC;
                ux2Var.p(false);
                switch (sl7Var.ordinal()) {
                    case 0:
                        ux2Var.W(-279682012);
                        jC2 = bw0.c(uf0.O, ux2Var);
                        ux2Var.p(false);
                        break;
                    case 1:
                        ux2Var.W(-279679679);
                        jC2 = ((rn4) ux2Var.j(un4.a)).a.q;
                        ux2Var.p(false);
                        break;
                    case 2:
                        ux2Var.W(-279677503);
                        jC2 = ((rn4) ux2Var.j(un4.a)).a.q;
                        ux2Var.p(false);
                        break;
                    case 3:
                        ux2Var.W(-279675295);
                        jC2 = ((rn4) ux2Var.j(un4.a)).a.q;
                        ux2Var.p(false);
                        break;
                    case 4:
                        ux2Var.W(-279673023);
                        jC2 = ((rn4) ux2Var.j(un4.a)).a.q;
                        ux2Var.p(false);
                        break;
                    case 5:
                        ux2Var.W(-279670751);
                        jC2 = ((rn4) ux2Var.j(un4.a)).a.b;
                        ux2Var.p(false);
                        break;
                    case 6:
                        ux2Var.W(-279668479);
                        jC2 = ((rn4) ux2Var.j(un4.a)).a.q;
                        ux2Var.p(false);
                        break;
                    case 7:
                        ux2Var.W(-279666239);
                        jC2 = ((rn4) ux2Var.j(un4.a)).a.q;
                        ux2Var.p(false);
                        break;
                    case 8:
                        ux2Var.W(-279663935);
                        jC2 = ((rn4) ux2Var.j(un4.a)).a.q;
                        ux2Var.p(false);
                        break;
                    default:
                        throw fx3.m(-279683676, ux2Var, false);
                }
                long j2 = jC2;
                switch (sl7Var.ordinal()) {
                    case 0:
                        ux2Var.W(-1274201005);
                        jC3 = bw0.c(uf0.I, ux2Var);
                        ux2Var.p(false);
                        break;
                    case 1:
                        ux2Var.W(-1274198705);
                        jC3 = ((rn4) ux2Var.j(un4.a)).a.a;
                        ux2Var.p(false);
                        break;
                    case 2:
                        ux2Var.W(-1274196593);
                        jC3 = ((rn4) ux2Var.j(un4.a)).a.a;
                        ux2Var.p(false);
                        break;
                    case 3:
                        ux2Var.W(-1274194449);
                        jC3 = ((rn4) ux2Var.j(un4.a)).a.a;
                        ux2Var.p(false);
                        break;
                    case 4:
                        ux2Var.W(-1274192241);
                        jC3 = ((rn4) ux2Var.j(un4.a)).a.a;
                        ux2Var.p(false);
                        break;
                    case 5:
                        ux2Var.W(-1274190033);
                        jC3 = ((rn4) ux2Var.j(un4.a)).a.a;
                        ux2Var.p(false);
                        break;
                    case 6:
                        ux2Var.W(-1274187825);
                        jC3 = ((rn4) ux2Var.j(un4.a)).a.a;
                        ux2Var.p(false);
                        break;
                    case 7:
                        ux2Var.W(-1274185649);
                        jC3 = ((rn4) ux2Var.j(un4.a)).a.a;
                        ux2Var.p(false);
                        break;
                    case 8:
                        ux2Var.W(-1274183409);
                        jC3 = ((rn4) ux2Var.j(un4.a)).a.a;
                        ux2Var.p(false);
                        break;
                    default:
                        throw fx3.m(-1274202685, ux2Var, false);
                }
                long j3 = jC3;
                switch (sl7Var.ordinal()) {
                    case 0:
                        ux2Var.W(2146334841);
                        jC4 = bw0.c(uf0.N, ux2Var);
                        ux2Var.p(false);
                        break;
                    case 1:
                        ux2Var.W(2146337584);
                        jC4 = ((rn4) ux2Var.j(un4.a)).a.s;
                        ux2Var.p(false);
                        break;
                    case 2:
                        ux2Var.W(2146339984);
                        jC4 = ((rn4) ux2Var.j(un4.a)).a.s;
                        ux2Var.p(false);
                        break;
                    case 3:
                        ux2Var.W(2146342416);
                        jC4 = ((rn4) ux2Var.j(un4.a)).a.s;
                        ux2Var.p(false);
                        break;
                    case 4:
                        ux2Var.W(2146344912);
                        jC4 = ((rn4) ux2Var.j(un4.a)).a.s;
                        ux2Var.p(false);
                        break;
                    case 5:
                        ux2Var.W(2146347401);
                        jC4 = ((rn4) ux2Var.j(un4.a)).a.b;
                        ux2Var.p(false);
                        break;
                    case 6:
                        ux2Var.W(2146349680);
                        jC4 = ((rn4) ux2Var.j(un4.a)).a.s;
                        ux2Var.p(false);
                        break;
                    case 7:
                        ux2Var.W(2146352144);
                        jC4 = ((rn4) ux2Var.j(un4.a)).a.s;
                        ux2Var.p(false);
                        break;
                    case 8:
                        ux2Var.W(2146354672);
                        jC4 = ((rn4) ux2Var.j(un4.a)).a.s;
                        ux2Var.p(false);
                        break;
                    default:
                        throw fx3.m(2146333226, ux2Var, false);
                }
                long j4 = jC4;
                h72 h72Var = un4.a;
                long j5 = ((rn4) ux2Var.j(h72Var)).a.q;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                    zf.f();
                    zf.c(j51.U(j5), j51.T(5));
                } else {
                    new PorterDuffColorFilter(j51.U(j5), j51.V(5));
                }
                long j6 = ((rn4) ux2Var.j(h72Var)).a.v;
                if (i4 >= 29) {
                    zf.f();
                    zf.c(j51.U(j6), j51.T(5));
                } else {
                    new PorterDuffColorFilter(j51.U(j6), j51.V(5));
                }
                switch (sl7Var.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        ol7 ol7Var = new ol7(j, j2, j3, j4);
                        nl7 nl7Var = ul7Var.f;
                        nl7 nl7Var2 = nl7Var != null ? new nl7(nl7Var.a, new a26((Object) nl7Var, (Object) o37Var, (byte) 20)) : null;
                        Function0 function0 = ul7Var.g;
                        int i5 = (57344 & (i3 << 6)) | ((i3 << 12) & 458752) | ((i3 << 9) & 3670016);
                        String str5 = str3;
                        h(ul7Var, ol7Var, nl7Var2, function0 != null ? new a26((Object) function0, (Object) o37Var, (byte) 21) : null, str5, fs4Var2, str4, ux2Var, i5);
                        ux2Var.p(false);
                        break;
                    default:
                        gk0.s();
                        return;
                }
            } else {
                ux2Var.W(-1547058171);
                x37.d(o37Var, fs4Var, null, 0L, 0L, 0L, 0L, 0L, ux2Var, i3 & 126, 508);
                ux2Var.p(false);
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new p5((Object) o37Var, fs4Var, (Object) str, (Object) str2, i, (byte) 16);
        }
    }

    public static final void h(ul7 ul7Var, ol7 ol7Var, nl7 nl7Var, Function0 function0, String str, fs4 fs4Var, String str2, ux2 ux2Var, int i) {
        int i2;
        Object obj;
        ol7 ol7Var2 = ol7Var;
        ux2Var.Y(542918079);
        if ((i & 6) == 0) {
            i2 = (ux2Var.f(ul7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(ol7Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ux2Var.f(nl7Var) : ux2Var.h(nl7Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            obj = function0;
            i2 |= ux2Var.h(obj) ? 2048 : 1024;
        } else {
            obj = function0;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.f(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ux2Var.f(str2) ? 1048576 : 524288;
        }
        if (ux2Var.N(i2 & 1, (599187 & i2) != 599186)) {
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.B(fs4Var, 12.0f), str.concat("-TVSnackbar"));
            qf6 qf6VarA = sf6.a(12.0f);
            long j = ol7Var2.a;
            ol7Var2 = ol7Var;
            x37.c(fs4VarA, au8.O(749687442, new f9((Object) nl7Var, (Object) ol7Var2, (Object) str, (byte) 27), ux2Var), au8.O(2004469459, new z8(obj, (Object) ol7Var, (Object) str, (Object) str2, (byte) 20), ux2Var), qf6VarA, j, 0L, 0L, 0L, au8.O(-2096958310, new f9((Object) ul7Var, (Object) ol7Var2, (Object) str, (byte) 28), ux2Var), ux2Var, 805306800, 456);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ta((Object) ul7Var, (Object) ol7Var2, (Object) nl7Var, (Object) function0, (Object) str, (Object) fs4Var, (Object) str2, i, (byte) 3);
        }
    }

    public static final Object i(Object obj, zi0 zi0Var) {
        oz3 oz3VarM;
        Class clsW;
        Method methodN;
        return (((zi0Var instanceof bu5) && pi3.d((sb8) zi0Var)) || (oz3VarM = m(zi0Var)) == null || (clsW = w(oz3VarM)) == null || (methodN = n(clsW, zi0Var)) == null) ? obj : methodN.invoke(obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[LOOP:1: B:20:0x0052->B:55:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if ((r0 != null ? o.pi3.e(r0) : false) == true) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final o.mj0 j(o.zi0 r3, o.mj0 r4, boolean r5) {
        /*
            r3.getClass()
            boolean r0 = o.pi3.a(r3)
            if (r0 != 0) goto Laa
            java.util.List r0 = r3.X()
            r0.getClass()
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L18
            goto L40
        L18:
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            o.v14 r1 = (o.v14) r1
            o.oz3 r1 = r1.getType()
            o.k48 r1 = r1.o0()
            o.ys0 r1 = r1.a()
            if (r1 == 0) goto L3b
            boolean r1 = o.pi3.e(r1)
            goto L3c
        L3b:
            r1 = r2
        L3c:
            if (r1 == 0) goto L1c
            goto Laa
        L40:
            java.util.List r0 = r3.J()
            r0.getClass()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L4e
            goto L78
        L4e:
            java.util.Iterator r0 = r0.iterator()
        L52:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r0.next()
            o.qb8 r1 = (o.qb8) r1
            o.oz3 r1 = r1.getType()
            r1.getClass()
            o.k48 r1 = r1.o0()
            o.ys0 r1 = r1.a()
            if (r1 == 0) goto L74
            boolean r1 = o.pi3.e(r1)
            goto L75
        L74:
            r1 = r2
        L75:
            if (r1 == 0) goto L52
            goto Laa
        L78:
            o.oz3 r0 = r3.getReturnType()
            r1 = 1
            if (r0 == 0) goto L92
            o.k48 r0 = r0.o0()
            o.ys0 r0 = r0.a()
            if (r0 == 0) goto L8e
            boolean r0 = o.pi3.b(r0)
            goto L8f
        L8e:
            r0 = r2
        L8f:
            if (r0 != r1) goto L92
            goto Laa
        L92:
            o.oz3 r0 = m(r3)
            if (r0 == 0) goto La9
            o.k48 r0 = r0.o0()
            o.ys0 r0 = r0.a()
            if (r0 == 0) goto La6
            boolean r2 = o.pi3.e(r0)
        La6:
            if (r2 != r1) goto La9
            goto Laa
        La9:
            return r4
        Laa:
            o.ib8 r0 = new o.ib8
            r0.<init>(r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.n67.j(o.zi0, o.mj0, boolean):o.mj0");
    }

    public static final long k() {
        return Thread.currentThread().getId();
    }

    public static final LifecycleOwner l(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            LifecycleOwner lifecycleOwner = tag instanceof LifecycleOwner ? (LifecycleOwner) tag : null;
            if (lifecycleOwner != null) {
                return lifecycleOwner;
            }
            Object objQ = i67.q(view);
            view = objQ instanceof View ? (View) objQ : null;
        }
        return null;
    }

    public static final oz3 m(zi0 zi0Var) {
        v14 v14VarS = zi0Var.S();
        v14 v14VarO = zi0Var.O();
        if (v14VarS != null) {
            return v14VarS.getType();
        }
        if (v14VarO != null) {
            if (zi0Var instanceof z61) {
                return v14VarO.getType();
            }
            fi1 fi1VarI = zi0Var.i();
            ns4 ns4Var = fi1VarI instanceof ns4 ? (ns4) fi1VarI : null;
            if (ns4Var != null) {
                return ns4Var.W();
            }
        }
        return null;
    }

    public static final Method n(Class cls, zi0 zi0Var) {
        zi0Var.getClass();
        try {
            return cls.getDeclaredMethod("unbox-impl", null);
        } catch (NoSuchMethodException unused) {
            yq4.n("No unbox method found in inline class: ", cls, " (calling ", zi0Var);
            return null;
        }
    }

    public static final ArrayList o(g07 g07Var) {
        ArrayList arrayListP = p(m77.o(g07Var));
        if (arrayListP == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(mv0.Z(arrayListP, 10));
        Iterator it = arrayListP.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        ys0 ys0VarA = g07Var.o0().a();
        ys0VarA.getClass();
        Class clsJ = pa8.j((ns4) ys0VarA);
        clsJ.getClass();
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsJ.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final ArrayList p(g07 g07Var) {
        ?? K;
        if (!pi3.f(g07Var)) {
            return null;
        }
        ys0 ys0VarA = g07Var.o0().a();
        ys0VarA.getClass();
        int i = bp1.a;
        jb8 jb8VarV0 = ((ns4) ys0VarA).v0();
        su4 su4Var = jb8VarV0 instanceof su4 ? (su4) jb8VarV0 : null;
        su4Var.getClass();
        ArrayList<vd5> arrayList = su4Var.a;
        ArrayList arrayList2 = new ArrayList();
        for (vd5 vd5Var : arrayList) {
            sy4 sy4Var = (sy4) vd5Var.m;
            ArrayList arrayListP = p((g07) vd5Var.n);
            if (arrayListP != null) {
                K = new ArrayList(mv0.Z(arrayListP, 10));
                Iterator it = arrayListP.iterator();
                while (it.hasNext()) {
                    K.add(sy4Var.c() + '-' + ((String) it.next()));
                }
            } else {
                K = qf0.K(sy4Var.c());
            }
            qv0.c0(arrayList2, K);
        }
        return arrayList2;
    }

    public static void q(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            pendingIntent.send();
            return;
        }
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (i >= 36) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(activityOptionsMakeBasic.toBundle());
        } catch (PendingIntent.CanceledException e) {
            io.sentry.android.core.v0.c("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }

    public static void r(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            b4.j(window, z);
        } else {
            if (i >= 30) {
                b4.i(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final long s(String str, long j, long j2, long j3) {
        String property;
        int i = yh7.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lP = bc7.P(property);
        if (lP == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lP.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int t(int i, int i2, String str) {
        return (int) s(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static String u(b53 b53Var) throws NoSuchAlgorithmException {
        int iOrdinal = b53Var.ordinal();
        if (iOrdinal == 1) {
            return "HmacSha1";
        }
        if (iOrdinal == 3) {
            return "HmacSha256";
        }
        if (iOrdinal == 4) {
            return "HmacSha512";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + b53Var);
    }

    public static final Class v(fi1 fi1Var) {
        if (!(fi1Var instanceof ns4) || !pi3.b(fi1Var)) {
            return null;
        }
        ns4 ns4Var = (ns4) fi1Var;
        Class clsJ = pa8.j(ns4Var);
        if (clsJ != null) {
            return clsJ;
        }
        StringBuilder sb = new StringBuilder("Class object for the class ");
        sb.append(ns4Var.getName());
        js0 js0VarF = bp1.f((ys0) fi1Var);
        sb.append(" cannot be found (classId=");
        sb.append(js0VarF);
        sb.append(')');
        throw new kz3(sb.toString());
    }

    public static final Class w(oz3 oz3Var) {
        g07 g07VarG;
        Class clsV = v(oz3Var.o0().a());
        if (clsV == null) {
            return null;
        }
        if (p58.e(oz3Var) && ((g07VarG = pi3.g(oz3Var)) == null || p58.e(g07VarG) || wy3.F(g07VarG))) {
            return null;
        }
        return clsV;
    }

    public static final double x(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static String z(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(A(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(A(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
