package o;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.DyngateViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IPLSynchronizationStateViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
import java.util.concurrent.CancellationException;
import java.util.function.DoubleUnaryOperator;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ds1 implements un6 {
    public static int m;
    public static we3 n;

    public static final void A(de1 de1Var, CancellationException cancellationException) {
        bp3 bp3Var = (bp3) de1Var.l0(z06.z);
        if (bp3Var != null) {
            bp3Var.j(cancellationException);
        }
    }

    public static final Object B(bp3 bp3Var, jc1 jc1Var) {
        bp3Var.j(null);
        Object objX0 = bp3Var.x0(jc1Var);
        return objX0 == ne1.m ? objX0 : f88.a;
    }

    public static final long C(long j, g72 g72Var) {
        long j2;
        int iOrdinal = g72Var.ordinal();
        if (iOrdinal == 2) {
            j2 = 1;
        } else if (iOrdinal == 3) {
            j2 = 1000;
        } else if (iOrdinal == 4) {
            j2 = 60000;
        } else if (iOrdinal == 5) {
            j2 = 3600000;
        } else {
            if (iOrdinal != 6) {
                hk0.f(g72Var, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (iNumberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        } else if (j <= 4611686018427387903L) {
            return j;
        }
        return 4611686018427387903L;
    }

    public static void D(sj2 sj2Var, wg5 wg5Var) {
        if (sj2Var.F(wg5Var)) {
            return;
        }
        try {
            sj2Var.c0(wg5Var, false).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void G(sj2 sj2Var, wg5 wg5Var) throws IOException {
        try {
            IOException iOException = null;
            for (wg5 wg5Var2 : sj2Var.G(wg5Var)) {
                try {
                    if (sj2Var.J(wg5Var2).c) {
                        G(sj2Var, wg5Var2);
                    }
                    sj2Var.u(wg5Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void H(de1 de1Var) {
        bp3 bp3Var = (bp3) de1Var.l0(z06.z);
        if (bp3Var != null && !bp3Var.e()) {
            throw bp3Var.z();
        }
    }

    public static final View I(es4 es4Var) {
        ge8 ge8Var = vn4.p0(es4Var.m).B;
        View interopView = ge8Var != null ? ge8Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        hk0.l("Could not fetch interop view");
        return null;
    }

    public static final bp3 J(de1 de1Var) {
        bp3 bp3Var = (bp3) de1Var.l0(z06.z);
        if (bp3Var != null) {
            return bp3Var;
        }
        hk0.f(de1Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final int K(xu4 xu4Var, long j, ee8 ee8Var) {
        float fG = ee8Var != null ? ee8Var.g() : 0.0f;
        int i = (int) (4294967295L & j);
        int iE = xu4Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < xu4Var.f(iE) - fG || Float.intBitsToFloat(i) > xu4Var.b(iE) + fG) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fG) || Float.intBitsToFloat(i2) > xu4Var.d + fG) {
            return -1;
        }
        return iE;
    }

    public static final int L(j64 j64Var, long j, ee8 ee8Var) {
        long jN;
        int iK;
        ws7 ws7VarD = j64Var.d();
        if (ws7VarD != null) {
            xu4 xu4Var = ws7VarD.a.b;
            i04 i04VarC = j64Var.c();
            if (i04VarC != null && (iK = K(xu4Var, (jN = i04VarC.N(j)), ee8Var)) != -1) {
                return xu4Var.g(t65.a((xu4Var.b(iK) + xu4Var.f(iK)) / 2.0f, 1, jN));
            }
        }
        return -1;
    }

    public static final long M(j64 j64Var, v56 v56Var, int i) {
        yq4 yq4Var = d82.O;
        ws7 ws7VarD = j64Var.d();
        xu4 xu4Var = ws7VarD != null ? ws7VarD.a.b : null;
        i04 i04VarC = j64Var.c();
        return (xu4Var == null || i04VarC == null) ? gt7.b : xu4Var.h(v56Var.i(i04VarC.N(0L)), i, yq4Var);
    }

    public static final long N(j64 j64Var, v56 v56Var, v56 v56Var2, int i) {
        long jM = M(j64Var, v56Var, i);
        if (gt7.c(jM)) {
            return gt7.b;
        }
        long jM2 = M(j64Var, v56Var2, i);
        if (gt7.c(jM2)) {
            return gt7.b;
        }
        int i2 = (int) (jM >> 32);
        int i3 = (int) (jM2 & 4294967295L);
        return h57.a(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final int O(fq6 fq6Var, fq6[] fq6VarArr) {
        fq6VarArr.getClass();
        int iHashCode = (fq6Var.a().hashCode() * 31) + Arrays.hashCode(fq6VarArr);
        int iE = fq6Var.e();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iE > 0)) {
                break;
            }
            int i2 = iE - 1;
            int i3 = i * 31;
            String strA = fq6Var.h(fq6Var.e() - iE).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i = i3 + iHashCode2;
            iE = i2;
        }
        int iE2 = fq6Var.e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iE2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iE2 - 1;
            int i5 = iHashCode3 * 31;
            it1 it1VarK = fq6Var.h(fq6Var.e() - iE2).k();
            iHashCode3 = i5 + (it1VarK != null ? it1VarK.hashCode() : 0);
            iE2 = i4;
        }
    }

    public static final t22 Q(bp3 bp3Var, boolean z, jp3 jp3Var) {
        if (bp3Var instanceof op3) {
            return ((op3) bp3Var).K(z, jp3Var);
        }
        return bp3Var.u(jp3Var.m(), z, new ew1(1, jp3Var, jp3.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, (byte) 24));
    }

    public static final boolean R(de1 de1Var) {
        bp3 bp3Var = (bp3) de1Var.l0(z06.z);
        if (bp3Var != null) {
            return bp3Var.e();
        }
        return true;
    }

    public static final boolean S(vs7 vs7Var, int i) {
        xu4 xu4Var = vs7Var.b;
        int iD = xu4Var.d(i);
        return i == vs7Var.g(iD) || i == xu4Var.c(iD, false) ? vs7Var.h(i) != vs7Var.a(i) : vs7Var.a(i) != vs7Var.a(i - 1);
    }

    public static final boolean T(String str) {
        str.getClass();
        String strL = bc7.L(str, " ", "");
        Pattern patternCompile = Pattern.compile("^[0-9]{7,10}$");
        patternCompile.getClass();
        return patternCompile.matcher(strL).matches();
    }

    public static final boolean U(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean V(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean W(int i) {
        int type;
        return (!V(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static u14 X(l54 l54Var, Function0 function0) {
        jk0 jk0Var = jk0.Q;
        function0.getClass();
        int iOrdinal = l54Var.ordinal();
        if (iOrdinal == 0) {
            return new kh7(function0);
        }
        if (iOrdinal == 1) {
            gh6 gh6Var = new gh6();
            gh6Var.m = function0;
            gh6Var.n = jk0Var;
            return gh6Var;
        }
        if (iOrdinal != 2) {
            gk0.s();
            return null;
        }
        y88 y88Var = new y88();
        y88Var.m = function0;
        y88Var.n = jk0Var;
        return y88Var;
    }

    public static kh7 Y(Function0 function0) {
        function0.getClass();
        return new kh7(function0);
    }

    public static final String a0(String str) {
        str.getClass();
        return bc7.L(str, " ", "");
    }

    public static final a06 d0(Configuration configuration, ml8 ml8Var, l51 l51Var, ux2 ux2Var) {
        configuration.getClass();
        Object objK = ux2Var.K();
        Object obj = e01.a;
        if (objK == obj) {
            objK = ck3.w(ux2Var);
            ux2Var.g0(objK);
        }
        me1 me1Var = (me1) objK;
        boolean zF = ux2Var.f(configuration) | ux2Var.f(me1Var) | ux2Var.f(ml8Var);
        Object objK2 = ux2Var.K();
        if (zF || objK2 == obj) {
            objK2 = new a06(configuration, me1Var, ml8Var, l51Var);
            ux2Var.g0(objK2);
        }
        return (a06) objK2;
    }

    public static final void e(es1 es1Var, hi7 hi7Var, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        gs1 gs1Var;
        int i3;
        ux2 ux2Var2 = ux2Var;
        es1Var.getClass();
        as1 as1Var = es1Var.a;
        hi7Var.getClass();
        float f = hi7Var.m;
        ux2Var2.Y(693357430);
        if ((i & 6) == 0) {
            i2 = (ux2Var2.f(es1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.d(hi7Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var2.f(fs4Var) ? 256 : 128;
        }
        int i4 = i2;
        if (ux2Var2.N(i4 & 1, (i4 & 147) != 146)) {
            int iOrdinal = es1Var.b.ordinal();
            if (iOrdinal == 0) {
                ux2Var2.W(-1671565980);
                h72 h72Var = vf2.a;
                gs1Var = new gs1(((tf2) ux2Var2.j(h72Var)).b, ((tf2) ux2Var2.j(h72Var)).c, vl7.Online, R.string.online_content_description);
                ux2Var2.p(false);
            } else if (iOrdinal == 1) {
                ux2Var2.W(-1671555408);
                h72 h72Var2 = vf2.a;
                gs1Var = new gs1(((tf2) ux2Var2.j(h72Var2)).g, ((tf2) ux2Var2.j(h72Var2)).h, vl7.Away, R.string.sleeping_content_description);
                ux2Var2.p(false);
            } else if (iOrdinal == 2) {
                ux2Var2.W(-1671544499);
                h72 h72Var3 = un4.a;
                gs1Var = new gs1(((rn4) ux2Var2.j(h72Var3)).a.H, ((rn4) ux2Var2.j(h72Var3)).a.s, vl7.Offline, R.string.offline_content_description);
                ux2Var2.p(false);
            } else if (iOrdinal == 3) {
                ux2Var2.W(-1671533713);
                h72 h72Var4 = un4.a;
                gs1Var = new gs1(((rn4) ux2Var2.j(h72Var4)).a.c, ((rn4) ux2Var2.j(h72Var4)).a.d, null, R.string.unknown_content_description);
                ux2Var2.p(false);
            } else {
                if (iOrdinal != 4) {
                    throw fx3.m(-1671566130, ux2Var2, false);
                }
                ux2Var2.W(-1671523724);
                h72 h72Var5 = un4.a;
                gs1Var = new gs1(((rn4) ux2Var2.j(h72Var5)).a.H, ((rn4) ux2Var2.j(h72Var5)).a.s, null, R.string.unknown_content_description);
                ux2Var2.p(false);
            }
            gs1 gs1Var2 = gs1Var;
            fs4 fs4VarS = au8.s(androidx.compose.foundation.layout.b.l(fs4Var, f), gs1Var2.a, sf6.a);
            do4 do4VarC = ua0.c(xz2.s, false);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarS);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(do4VarC, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS2, d82.t, ux2Var2);
            int iOrdinal2 = as1Var.ordinal();
            if (iOrdinal2 == 0) {
                i3 = R.drawable.device_avatar_desktop;
            } else if (iOrdinal2 == 1) {
                i3 = R.drawable.device_avatar_mobile;
            } else {
                if (iOrdinal2 != 2) {
                    gk0.s();
                    return;
                }
                i3 = R.drawable.device_avatar_unknown;
            }
            ud5 ud5VarT = lv1.T(i3, ux2Var2, 0);
            String strZ = m77.z(gs1Var2.d, ux2Var2);
            if (as1Var != as1.f353o) {
                f = hi7Var.f977o;
            }
            cs4 cs4Var = cs4.b;
            td3.b(ud5VarT, strZ, androidx.compose.foundation.layout.b.l(cs4Var, f), gs1Var2.b, ux2Var, 8, 0);
            ux2Var2 = ux2Var;
            if (gs1Var2.c != null) {
                ux2Var2.W(-44164961);
                o67.c(hi7Var, gs1Var2.c, ya0.a.a(cs4Var, xz2.w), ux2Var2, (i4 >> 3) & 14, 0);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-43942970);
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) es1Var, (Object) hi7Var, (Object) fs4Var, i, (byte) 7);
        }
    }

    public static final Object e0(LifecycleOwner lifecycleOwner, m84 m84Var, hw2 hw2Var, og7 og7Var) {
        Object objF0 = f0(lifecycleOwner.getR(), m84Var, hw2Var, og7Var);
        return objF0 == ne1.m ? objF0 : f88.a;
    }

    public static final void f(final ls1 ls1Var, final boolean z, final hi7 hi7Var, fs4 fs4Var, ux2 ux2Var, final int i, final int i2) {
        f95 f95Var;
        hi7Var.getClass();
        ux2Var.Y(-1195111826);
        int i3 = (ux2Var.d(ls1Var == null ? -1 : ls1Var.ordinal()) ? 4 : 2) | i | (ux2Var.g(z) ? 32 : 16);
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                fs4Var = cs4.b;
            }
            as1 as1Var = z ? as1.n : as1.m;
            int i5 = ls1Var == null ? -1 : cs1.a[ls1Var.ordinal()];
            if (i5 == -1) {
                f95Var = f95.s;
            } else if (i5 == 1) {
                f95Var = f95.f778o;
            } else if (i5 == 2) {
                f95Var = f95.r;
            } else {
                if (i5 != 3) {
                    gk0.s();
                    return;
                }
                f95Var = f95.n;
            }
            e(new es1(as1Var, n0(f95Var)), hi7Var, fs4Var, ux2Var, (i3 >> 3) & 1008);
        } else {
            ux2Var.Q();
        }
        final fs4 fs4Var2 = fs4Var;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.bs1
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ds1.f(ls1Var, z, hi7Var, fs4Var2, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final Object f0(x84 x84Var, m84 m84Var, hw2 hw2Var, og7 og7Var) {
        Object objJ;
        if (m84Var != m84.n) {
            return (x84Var.i != m84.m && (objJ = hm3.j(new bj((Object) x84Var, (Object) m84Var, (Object) hw2Var, (hc1) null, (byte) 18), og7Var)) == ne1.m) ? objJ : f88.a;
        }
        hk0.g("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    public static final void g(Function0 function0, ux2 ux2Var, int i) {
        function0.getClass();
        ux2Var.Y(1915623123);
        int i2 = 2;
        int i3 = i | (ux2Var.h(function0) ? 4 : 2);
        if (ux2Var.N(i3 & 1, (i3 & 3) != 2)) {
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new l5(i2, null, (byte) 8);
                ux2Var.g0(objK);
            }
            ck3.i(f88.a, (hw2) objK, ux2Var);
            uf0.b(function0, au8.O(317491595, new v4(function0, (byte) 16), ux2Var), null, null, xk0.h, xk0.i, null, 0L, 0L, 0L, 0L, null, ux2Var, (i3 & 14) | 1769520, 0, 16284);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new v4(function0, i, (byte) 17);
        }
    }

    public static final Object g0(hw2 hw2Var) {
        Thread.interrupted();
        return vn4.u0(ba2.m, new i9(hw2Var, null, (byte) 21));
    }

    public static ComputerDetailsViewModel h(PListComputerID pListComputerID) {
        long jPartnerlistViewModelLocator_GetComputerDetailsViewModel__SWIG_0 = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetComputerDetailsViewModel__SWIG_0(pListComputerID.a, pListComputerID);
        if (jPartnerlistViewModelLocator_GetComputerDetailsViewModel__SWIG_0 == 0) {
            return null;
        }
        return new ComputerDetailsViewModel(jPartnerlistViewModelLocator_GetComputerDetailsViewModel__SWIG_0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h0(tk6 tk6Var, float f, jc1 jc1Var) {
        vj6 vj6Var;
        h76 h76Var;
        if (jc1Var instanceof vj6) {
            vj6Var = (vj6) jc1Var;
            int i = vj6Var.f2320o;
            if ((i & Integer.MIN_VALUE) != 0) {
                vj6Var.f2320o = i - Integer.MIN_VALUE;
            } else {
                vj6Var = new vj6(jc1Var);
            }
        } else {
            vj6Var = new vj6(jc1Var);
        }
        Object obj = vj6Var.n;
        int i2 = vj6Var.f2320o;
        if (i2 == 0) {
            ct1.a0(obj);
            h76 h76Var2 = new h76();
            hw2 wj6Var = new wj6(h76Var2, f, null);
            vj6Var.m = h76Var2;
            vj6Var.f2320o = 1;
            Object objE = tk6Var.e(ay4.m, wj6Var, vj6Var);
            Object obj2 = ne1.m;
            if (objE == obj2) {
                return obj2;
            }
            h76Var = h76Var2;
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h76Var = vj6Var.m;
            ct1.a0(obj);
        }
        return new Float(h76Var.m);
    }

    public static ComputerEditViewModel i(PListComputerID pListComputerID) {
        long jPartnerlistViewModelLocator_GetComputerEditViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetComputerEditViewModel(pListComputerID.a, pListComputerID);
        if (jPartnerlistViewModelLocator_GetComputerEditViewModel == 0) {
            return null;
        }
        ComputerEditViewModel computerEditViewModel = new ComputerEditViewModel();
        computerEditViewModel.b = true;
        computerEditViewModel.a = jPartnerlistViewModelLocator_GetComputerEditViewModel;
        return computerEditViewModel;
    }

    public static Stream i0(x35 x35Var, Class cls) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(new j45(x35Var, cls), 273), false);
    }

    public static DyngateViewModel j(PListDyngateID pListDyngateID) {
        long jPartnerlistViewModelLocator_GetDyngateViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetDyngateViewModel(pListDyngateID.a, pListDyngateID);
        if (jPartnerlistViewModelLocator_GetDyngateViewModel == 0) {
            return null;
        }
        DyngateViewModel dyngateViewModel = new DyngateViewModel();
        dyngateViewModel.b = true;
        dyngateViewModel.a = jPartnerlistViewModelLocator_GetDyngateViewModel;
        return dyngateViewModel;
    }

    public static final Rect j0(zk3 zk3Var) {
        return new Rect(zk3Var.a, zk3Var.b, zk3Var.c, zk3Var.d);
    }

    public static GroupListElementViewModel k(PListGroupID pListGroupID) {
        long jPartnerlistViewModelLocator_GetGroupListElementViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetGroupListElementViewModel(PListGroupID.a(pListGroupID), pListGroupID);
        if (jPartnerlistViewModelLocator_GetGroupListElementViewModel == 0) {
            return null;
        }
        GroupListElementViewModel groupListElementViewModel = new GroupListElementViewModel(GroupListElementViewModelSWIGJNI.GroupListElementViewModel_SWIGSmartPtrUpcast(jPartnerlistViewModelLocator_GetGroupListElementViewModel));
        groupListElementViewModel.d = true;
        groupListElementViewModel.c = jPartnerlistViewModelLocator_GetGroupListElementViewModel;
        return groupListElementViewModel;
    }

    public static final RectF k0(v56 v56Var) {
        return new RectF(v56Var.a, v56Var.b, v56Var.c, v56Var.d);
    }

    public static GroupListViewModel l(boolean z) {
        long jPartnerlistViewModelLocator_GetGroupListViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetGroupListViewModel(z);
        if (jPartnerlistViewModelLocator_GetGroupListViewModel == 0) {
            return null;
        }
        GroupListViewModel groupListViewModel = new GroupListViewModel();
        groupListViewModel.b = true;
        groupListViewModel.a = jPartnerlistViewModelLocator_GetGroupListViewModel;
        return groupListViewModel;
    }

    public static final v56 l0(Rect rect) {
        return new v56(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static GroupMemberListElementViewModel m(GroupMemberId groupMemberId) {
        long jPartnerlistViewModelLocator_GetGroupMemberListElementViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetGroupMemberListElementViewModel(groupMemberId == null ? 0L : groupMemberId.a, groupMemberId);
        if (jPartnerlistViewModelLocator_GetGroupMemberListElementViewModel == 0) {
            return null;
        }
        GroupMemberListElementViewModel groupMemberListElementViewModel = new GroupMemberListElementViewModel();
        groupMemberListElementViewModel.b = true;
        groupMemberListElementViewModel.a = jPartnerlistViewModelLocator_GetGroupMemberListElementViewModel;
        return groupMemberListElementViewModel;
    }

    public static final v56 m0(RectF rectF) {
        return new v56(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static MachineListElementViewModel n(MachineId machineId) {
        long jPartnerlistViewModelLocator_GetMachineListElementViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetMachineListElementViewModel(machineId.a, machineId);
        if (jPartnerlistViewModelLocator_GetMachineListElementViewModel == 0) {
            return null;
        }
        MachineListElementViewModel machineListElementViewModel = new MachineListElementViewModel();
        machineListElementViewModel.b = true;
        machineListElementViewModel.a = jPartnerlistViewModelLocator_GetMachineListElementViewModel;
        return machineListElementViewModel;
    }

    public static final fs1 n0(f95 f95Var) {
        f95Var.getClass();
        int iOrdinal = f95Var.ordinal();
        if (iOrdinal == 1) {
            return fs1.f825o;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 5 ? fs1.q : fs1.n;
        }
        return fs1.m;
    }

    public static MachineListViewModel o(PListContactID pListContactID, boolean z, boolean z2) {
        long jPartnerlistViewModelLocator_GetMachineListViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetMachineListViewModel(pListContactID.a, pListContactID, z, z2);
        if (jPartnerlistViewModelLocator_GetMachineListViewModel == 0) {
            return null;
        }
        MachineListViewModel machineListViewModel = new MachineListViewModel();
        machineListViewModel.b = true;
        machineListViewModel.a = jPartnerlistViewModelLocator_GetMachineListViewModel;
        return machineListViewModel;
    }

    public static final ExtractedText o0(zr7 zr7Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = zr7Var.a.n;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = zr7Var.b;
        extractedText.selectionStart = gt7.f(j);
        extractedText.selectionEnd = gt7.e(j);
        extractedText.flags = !ub7.R(zr7Var.a.n, '\n') ? 1 : 0;
        return extractedText;
    }

    public static IPLSynchronizationStateViewModel p() {
        long jPartnerlistViewModelLocator_GetPLSynchronizationStateViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetPLSynchronizationStateViewModel();
        if (jPartnerlistViewModelLocator_GetPLSynchronizationStateViewModel == 0) {
            return null;
        }
        IPLSynchronizationStateViewModel iPLSynchronizationStateViewModel = new IPLSynchronizationStateViewModel();
        iPLSynchronizationStateViewModel.b = true;
        iPLSynchronizationStateViewModel.a = jPartnerlistViewModelLocator_GetPLSynchronizationStateViewModel;
        return iPLSynchronizationStateViewModel;
    }

    public static final long p0(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x013b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0143  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0153  */
    /* JADX WARN: Code duplicated, block: B:77:0x015f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0184  */
    /* JADX WARN: Code duplicated, block: B:81:0x018b  */
    /* JADX WARN: Code duplicated, block: B:84:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cc  */
    public static vi q(int i, int i2, int i3, int i4) {
        ColorSpace rgb;
        String str;
        float[] fArrA;
        a18 a18Var;
        byte b;
        td6 td6Var;
        float[] fArr;
        ColorSpace rgb2;
        ColorSpace.Rgb rgb3;
        ColorSpace colorSpace;
        int i5 = (i4 & 4) != 0 ? 0 : i3;
        td6 td6Var2 = ew0.e;
        mo8.w(i5);
        Bitmap.Config configW = mo8.w(i5);
        if (im3.n(td6Var2, td6Var2)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (im3.n(td6Var2, ew0.q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (im3.n(td6Var2, ew0.r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (im3.n(td6Var2, ew0.f746o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (im3.n(td6Var2, ew0.j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (im3.n(td6Var2, ew0.i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (im3.n(td6Var2, ew0.t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (im3.n(td6Var2, ew0.s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (im3.n(td6Var2, ew0.k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (im3.n(td6Var2, ew0.l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (im3.n(td6Var2, ew0.g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (im3.n(td6Var2, ew0.h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (im3.n(td6Var2, ew0.f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (im3.n(td6Var2, ew0.m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (im3.n(td6Var2, ew0.p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!im3.n(td6Var2, ew0.n)) {
                int i6 = Build.VERSION.SDK_INT;
                ColorSpace.Rgb.TransferParameters transferParameters = null;
                if (i6 >= 34) {
                    if (im3.n(td6Var2, ew0.v)) {
                        colorSpace = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
                    } else {
                        colorSpace = im3.n(td6Var2, ew0.w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    }
                    if (colorSpace != null) {
                        rgb2 = colorSpace;
                    } else if (i6 < 36) {
                        if (im3.n(td6Var2, ew0.x)) {
                            rgb = ColorSpace.get(ColorSpace.Named.OK_LAB);
                        } else {
                            rgb = null;
                        }
                        if (rgb != null) {
                            if (td6Var2 != null) {
                                str = td6Var2.a;
                                fArrA = td6Var2.d.a();
                                a18Var = td6Var2.g;
                                if (a18Var != null) {
                                    b = 0;
                                    ColorSpace.Rgb.TransferParameters transferParameters2 = new ColorSpace.Rgb.TransferParameters(a18Var.b, a18Var.c, a18Var.d, a18Var.e, a18Var.f, a18Var.g, a18Var.a);
                                    td6Var = td6Var2;
                                    transferParameters = transferParameters2;
                                } else {
                                    b = 0;
                                    td6Var = td6Var2;
                                }
                                fArr = td6Var.i;
                                if (transferParameters != null) {
                                    rgb3 = new ColorSpace.Rgb(str, td6Var.h, fArrA, transferParameters);
                                    if (Float.isNaN(fArr[b])) {
                                        rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                                    }
                                    rgb2 = rgb3;
                                } else {
                                    float[] fArr2 = td6Var.h;
                                    final sd6 sd6Var = td6Var.l;
                                    final byte b2 = b;
                                    DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: o.dw0
                                        @Override // java.util.function.DoubleUnaryOperator
                                        public final double applyAsDouble(double d) {
                                            byte b3 = b2;
                                            Function1 function1 = sd6Var;
                                            switch (b3) {
                                                case 0:
                                                    break;
                                            }
                                            return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                                        }
                                    };
                                    final sd6 sd6Var2 = td6Var.f2103o;
                                    final byte b3 = 1;
                                    rgb2 = new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: o.dw0
                                        @Override // java.util.function.DoubleUnaryOperator
                                        public final double applyAsDouble(double d) {
                                            byte b4 = b3;
                                            Function1 function1 = sd6Var2;
                                            switch (b4) {
                                                case 0:
                                                    break;
                                            }
                                            return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                                        }
                                    }, td6Var.e, td6Var.f);
                                }
                            } else {
                                rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                            }
                        }
                    } else if (td6Var2 != null) {
                        str = td6Var2.a;
                        fArrA = td6Var2.d.a();
                        a18Var = td6Var2.g;
                        if (a18Var != null) {
                            b = 0;
                            ColorSpace.Rgb.TransferParameters transferParameters3 = new ColorSpace.Rgb.TransferParameters(a18Var.b, a18Var.c, a18Var.d, a18Var.e, a18Var.f, a18Var.g, a18Var.a);
                            td6Var = td6Var2;
                            transferParameters = transferParameters3;
                        } else {
                            b = 0;
                            td6Var = td6Var2;
                        }
                        fArr = td6Var.i;
                        if (transferParameters != null) {
                            rgb3 = new ColorSpace.Rgb(str, td6Var.h, fArrA, transferParameters);
                            if (Float.isNaN(fArr[b])) {
                                rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                            }
                            rgb2 = rgb3;
                        } else {
                            float[] fArr3 = td6Var.h;
                            final Function1 sd6Var3 = td6Var.l;
                            final byte b4 = b;
                            DoubleUnaryOperator doubleUnaryOperator2 = new DoubleUnaryOperator() { // from class: o.dw0
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d) {
                                    byte b5 = b4;
                                    Function1 function1 = sd6Var3;
                                    switch (b5) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                                }
                            };
                            final Function1 sd6Var4 = td6Var.f2103o;
                            final byte b5 = 1;
                            rgb2 = new ColorSpace.Rgb(str, fArr3, fArrA, doubleUnaryOperator2, new DoubleUnaryOperator() { // from class: o.dw0
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d) {
                                    byte b6 = b5;
                                    Function1 function1 = sd6Var4;
                                    switch (b6) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                                }
                            }, td6Var.e, td6Var.f);
                        }
                    } else {
                        rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                } else if (i6 < 36) {
                    if (im3.n(td6Var2, ew0.x)) {
                        rgb = ColorSpace.get(ColorSpace.Named.OK_LAB);
                    } else {
                        rgb = null;
                    }
                    if (rgb != null) {
                        if (td6Var2 != null) {
                            str = td6Var2.a;
                            fArrA = td6Var2.d.a();
                            a18Var = td6Var2.g;
                            if (a18Var != null) {
                                b = 0;
                                ColorSpace.Rgb.TransferParameters transferParameters4 = new ColorSpace.Rgb.TransferParameters(a18Var.b, a18Var.c, a18Var.d, a18Var.e, a18Var.f, a18Var.g, a18Var.a);
                                td6Var = td6Var2;
                                transferParameters = transferParameters4;
                            } else {
                                b = 0;
                                td6Var = td6Var2;
                            }
                            fArr = td6Var.i;
                            if (transferParameters != null) {
                                rgb3 = new ColorSpace.Rgb(str, td6Var.h, fArrA, transferParameters);
                                if (Float.isNaN(fArr[b])) {
                                    rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                                }
                                rgb2 = rgb3;
                            } else {
                                float[] fArr4 = td6Var.h;
                                final Function1 sd6Var5 = td6Var.l;
                                final byte b6 = b;
                                DoubleUnaryOperator doubleUnaryOperator3 = new DoubleUnaryOperator() { // from class: o.dw0
                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        byte b7 = b6;
                                        Function1 function1 = sd6Var5;
                                        switch (b7) {
                                            case 0:
                                                break;
                                        }
                                        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                                    }
                                };
                                final Function1 sd6Var6 = td6Var.f2103o;
                                final byte b7 = 1;
                                rgb2 = new ColorSpace.Rgb(str, fArr4, fArrA, doubleUnaryOperator3, new DoubleUnaryOperator() { // from class: o.dw0
                                    @Override // java.util.function.DoubleUnaryOperator
                                    public final double applyAsDouble(double d) {
                                        byte b8 = b7;
                                        Function1 function1 = sd6Var6;
                                        switch (b8) {
                                            case 0:
                                                break;
                                        }
                                        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                                    }
                                }, td6Var.e, td6Var.f);
                            }
                        } else {
                            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                    }
                } else if (td6Var2 != null) {
                    str = td6Var2.a;
                    fArrA = td6Var2.d.a();
                    a18Var = td6Var2.g;
                    if (a18Var != null) {
                        b = 0;
                        ColorSpace.Rgb.TransferParameters transferParameters5 = new ColorSpace.Rgb.TransferParameters(a18Var.b, a18Var.c, a18Var.d, a18Var.e, a18Var.f, a18Var.g, a18Var.a);
                        td6Var = td6Var2;
                        transferParameters = transferParameters5;
                    } else {
                        b = 0;
                        td6Var = td6Var2;
                    }
                    fArr = td6Var.i;
                    if (transferParameters != null) {
                        rgb3 = new ColorSpace.Rgb(str, td6Var.h, fArrA, transferParameters);
                        if (Float.isNaN(fArr[b]) || Arrays.equals(rgb3.getTransform(), fArr)) {
                            rgb2 = rgb3;
                        } else {
                            rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr5 = td6Var.h;
                        final Function1 sd6Var7 = td6Var.l;
                        final byte b8 = b;
                        DoubleUnaryOperator doubleUnaryOperator4 = new DoubleUnaryOperator() { // from class: o.dw0
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                byte b9 = b8;
                                Function1 function1 = sd6Var7;
                                switch (b9) {
                                    case 0:
                                        break;
                                }
                                return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                            }
                        };
                        final Function1 sd6Var8 = td6Var.f2103o;
                        final byte b9 = 1;
                        rgb2 = new ColorSpace.Rgb(str, fArr5, fArrA, doubleUnaryOperator4, new DoubleUnaryOperator() { // from class: o.dw0
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                byte b10 = b9;
                                Function1 function1 = sd6Var8;
                                switch (b10) {
                                    case 0:
                                        break;
                                }
                                return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
                            }
                        }, td6Var.e, td6Var.f);
                    }
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new vi(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configW, true, rgb2));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb2 = rgb;
        return new vi(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configW, true, rgb2));
    }

    public static final String q0(fq6 fq6Var) {
        return lv0.t0(ct1.b0(0, fq6Var.e()), ", ", fq6Var.a() + '(', ")", new fj3((Object) fq6Var, (byte) 22), 24);
    }

    public static dp3 r() {
        return new dp3(null);
    }

    public static final void s(Boolean bool, Object obj, LifecycleOwner lifecycleOwner, Function1 function1, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(696924721);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.h(function1) ? 2048 : 1024;
        }
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                lifecycleOwner = (LifecycleOwner) ux2Var.j(dd4.a);
            } else {
                ux2Var.Q();
            }
            int i3 = i2 & (-897);
            ux2Var.q();
            boolean zF = ux2Var.f(bool) | ux2Var.f(obj) | ux2Var.f(lifecycleOwner);
            Object objK = ux2Var.K();
            if (zF || objK == e01.a) {
                objK = new c94(lifecycleOwner.getR());
                ux2Var.g0(objK);
            }
            t(lifecycleOwner, (c94) objK, function1, ux2Var, (i3 >> 3) & 896);
        } else {
            ux2Var.Q();
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new p5((Object) bool, obj, (Object) lifecycleOwner2, (Object) function1, i, (byte) 10);
        }
    }

    public static final void t(LifecycleOwner lifecycleOwner, c94 c94Var, Function1 function1, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(228371534);
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(lifecycleOwner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(c94Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(function1) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = ux2Var.h(c94Var) | ((i2 & 896) == 256) | ux2Var.h(lifecycleOwner);
            Object objK = ux2Var.K();
            if (zH || objK == e01.a) {
                objK = new m5((Object) lifecycleOwner, (Object) c94Var, (Object) function1, (byte) 25);
                ux2Var.g0(objK);
            }
            ck3.d(lifecycleOwner, c94Var, (Function1) objK, ux2Var);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) lifecycleOwner, (Object) c94Var, (Object) function1, i, (byte) 12);
        }
    }

    public static final void u(fs4 fs4Var, ux2 ux2Var, int i) {
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(615344849);
        if (ux2Var2.N(i & 1, (i & 3) != 2)) {
            fs4 fs4VarF = fs4Var.f(androidx.compose.foundation.layout.b.c);
            do4 do4VarC = ua0.c(xz2.s, false);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarF);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(do4VarC, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            qs7.b("Monitoring overview content", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var, 6, 0, 262142);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var, i, (byte) 4);
        }
    }

    public static final void v(int i, String str, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        String str2;
        function0.getClass();
        ux2Var.Y(29291716);
        int i2 = (ux2Var.h(function0) ? 4 : 2) | i | (ux2Var.f(fs4Var) ? 32 : 16) | 384;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            str2 = "TVTA-settings-privacyPolicy";
            x37.e(new sk7(y57.g(R.string.tv_options_PrivacyPolicy), null, new yk7(R.drawable.shield_lock), null, 26), fs4Var, null, function0, "TVTA-settings-privacyPolicy", ux2Var, ((i2 << 9) & 7168) | (i2 & 112) | 24576, 36);
        } else {
            ux2Var.Q();
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new gd1(function0, fs4Var, str2, i, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01af  */
    /* JADX WARN: Code duplicated, block: B:104:0x0228  */
    /* JADX WARN: Code duplicated, block: B:106:0x0232  */
    /* JADX WARN: Code duplicated, block: B:107:0x0281  */
    /* JADX WARN: Code duplicated, block: B:110:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:116:0x034e  */
    /* JADX WARN: Code duplicated, block: B:119:0x035c  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[PHI: r9 r10 r12 r16
      0x00fc: PHI (r9v33 o.fs4) = (r9v6 o.fs4), (r9v3 o.fs4), (r9v3 o.fs4) binds: [B:91:0x0114, B:80:0x00f6, B:81:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r10v20 boolean) = (r10v10 boolean), (r10v7 boolean), (r10v7 boolean) binds: [B:91:0x0114, B:80:0x00f6, B:81:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r12v12 o.hw2) = (r12v5 o.hw2), (r12v3 o.hw2), (r12v3 o.hw2) binds: [B:91:0x0114, B:80:0x00f6, B:81:0x00f8] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r16v10 int) = (r16v6 int), (r16v5 int), (r16v11 int) binds: [B:91:0x0114, B:80:0x00f6, B:81:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0105  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0113  */
    /* JADX WARN: Code duplicated, block: B:92:0x0116  */
    /* JADX WARN: Code duplicated, block: B:95:0x0127  */
    /* JADX WARN: Code duplicated, block: B:98:0x0185  */
    /* JADX WARN: Code duplicated, block: B:99:0x018b  */
    public static final void w(final String str, final String str2, final boolean z, final boolean z2, final Function0 function0, fs4 fs4Var, boolean z3, final String str3, hw2 hw2Var, hw2 hw2Var2, ux2 ux2Var, final int i, final int i2) {
        fs4 fs4Var2;
        boolean z4;
        int i3;
        int i4;
        hw2 hw2Var3;
        int i5;
        int i6;
        hw2 hw2Var4;
        int i7;
        int i8;
        boolean z5;
        ux2 ux2Var2;
        final boolean z6;
        hw2 hw2Var5;
        final hw2 hw2Var6;
        j56 j56VarR;
        int i9;
        cs4 cs4Var;
        hw2 hw2Var7;
        fs4 fs4Var3;
        boolean z7;
        Object objK;
        aw awVar;
        h72 h72Var;
        fs4 fs4VarC;
        fs4 fs4Var4;
        h72 h72Var2;
        aw awVar2;
        int i10;
        cq7 cq7VarL;
        ux2 ux2Var3;
        hw2 hw2Var8;
        Object objK2;
        str.getClass();
        str2.getClass();
        function0.getClass();
        ux2Var.Y(83421622);
        int i11 = (ux2Var.f(str) ? 4 : 2) | i | (ux2Var.f(str2) ? 32 : 16);
        if ((i & 384) == 0) {
            i11 |= ux2Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i11 |= ux2Var.g(z2) ? 2048 : 1024;
        }
        int i12 = i11 | (ux2Var.h(function0) ? 16384 : 8192);
        int i13 = i2 & 32;
        if (i13 == 0) {
            if ((196608 & i) == 0) {
                fs4Var2 = fs4Var;
                i12 |= ux2Var.f(fs4Var2) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                z4 = z3;
                int i14 = ux2Var.g(z4) ? 1048576 : 524288;
                i3 = i12 | i14;
                i4 = i2 & 256;
                if (i4 != 0) {
                    if ((100663296 & i) == 0) {
                        hw2Var3 = hw2Var;
                        if (ux2Var.h(hw2Var3)) {
                            i5 = 67108864;
                        } else {
                            i5 = 33554432;
                        }
                        i3 |= i5;
                    }
                    i6 = i2 & 512;
                    if (i6 != 0) {
                        if ((805306368 & i) == 0) {
                            hw2Var4 = hw2Var2;
                            if (ux2Var.h(hw2Var4)) {
                                i7 = 536870912;
                            } else {
                                i7 = 268435456;
                            }
                            i3 |= i7;
                        }
                        i8 = i3;
                        if ((i3 & 306783379) != 306783378) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (ux2Var.N(i8 & 1, z5)) {
                            ux2Var.S();
                            i9 = i & 1;
                            cs4Var = cs4.b;
                            if (i9 != 0 || ux2Var.x()) {
                                if (i13 != 0) {
                                    fs4Var2 = cs4Var;
                                }
                                if ((i2 & 64) != 0) {
                                    z4 = z;
                                    i8 &= -3670017;
                                }
                                if (i4 != 0) {
                                    hw2Var3 = null;
                                }
                                if (i6 != 0) {
                                    hw2Var7 = null;
                                    fs4Var3 = fs4Var2;
                                    z7 = z4;
                                    hw2Var5 = hw2Var3;
                                }
                                ux2Var.q();
                                objK = ux2Var.K();
                                awVar = e01.a;
                                if (objK == awVar) {
                                    objK = ua5.s(ux2Var);
                                }
                                fs4 fs4VarC2 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                                h72Var = un4.a;
                                fs4 fs4Var5 = fs4Var3;
                                fs4 fs4VarA = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC2, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                                boolean z8 = z7;
                                do4 do4VarC = ua0.c(xz2.f2564o, false);
                                int iHashCode = Long.hashCode(ux2Var.T);
                                yj5 yj5VarL = ux2Var.l();
                                fs4 fs4VarS = uf0.s(ux2Var, fs4VarA);
                                yz0.c.getClass();
                                ux2Var.a0();
                                if (ux2Var.S) {
                                    ux2Var.k(LayoutNode.e0);
                                } else {
                                    ux2Var.j0();
                                }
                                o67.n(do4VarC, d82.v, ux2Var);
                                o67.n(yj5VarL, d82.u, ux2Var);
                                o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                                o67.l(ux2Var);
                                o67.n(fs4VarS, d82.t, ux2Var);
                                fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                                if (z2) {
                                    ux2Var.W(-1650437224);
                                    fs4Var4 = fs4VarC;
                                    h72Var2 = h72Var;
                                    awVar2 = awVar;
                                    i10 = i8;
                                    cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                                    ux2Var3 = ux2Var;
                                    ux2Var3.p(false);
                                } else {
                                    fs4Var4 = fs4VarC;
                                    h72Var2 = h72Var;
                                    awVar2 = awVar;
                                    i10 = i8;
                                    if (z) {
                                        ux2Var.W(-1650359011);
                                        cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                                        ux2Var3 = ux2Var;
                                        ux2Var3.p(false);
                                    } else {
                                        ux2Var.W(-1650300235);
                                        cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                                        ux2Var3 = ux2Var;
                                        ux2Var3.p(false);
                                    }
                                }
                                cq7 cq7Var = cq7VarL;
                                qf6 qf6Var = ((rn4) ux2Var3.j(h72Var2)).c.b;
                                if (z2) {
                                    hw2Var8 = hw2Var7;
                                } else {
                                    hw2Var8 = hw2Var5;
                                }
                                objK2 = ux2Var3.K();
                                if (objK2 == awVar2) {
                                    objK2 = new fk6((byte) 9);
                                    ux2Var3.g0(objK2);
                                }
                                ux2 ux2Var4 = ux2Var3;
                                bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var, cq7Var, ux2Var4, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                                ux2Var2 = ux2Var4;
                                ux2Var2.p(true);
                                fs4Var2 = fs4Var5;
                                hw2Var6 = hw2Var7;
                                z6 = z8;
                            } else {
                                ux2Var.Q();
                                if ((i2 & 64) != 0) {
                                    i8 &= -3670017;
                                }
                            }
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                            hw2Var7 = hw2Var4;
                            ux2Var.q();
                            objK = ux2Var.K();
                            awVar = e01.a;
                            if (objK == awVar) {
                                objK = ua5.s(ux2Var);
                            }
                            fs4 fs4VarC3 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                            h72Var = un4.a;
                            fs4 fs4Var6 = fs4Var3;
                            fs4 fs4VarA2 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC3, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                            boolean z9 = z7;
                            do4 do4VarC2 = ua0.c(xz2.f2564o, false);
                            int iHashCode2 = Long.hashCode(ux2Var.T);
                            yj5 yj5VarL2 = ux2Var.l();
                            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarA2);
                            yz0.c.getClass();
                            ux2Var.a0();
                            if (ux2Var.S) {
                                ux2Var.k(LayoutNode.e0);
                            } else {
                                ux2Var.j0();
                            }
                            o67.n(do4VarC2, d82.v, ux2Var);
                            o67.n(yj5VarL2, d82.u, ux2Var);
                            o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var);
                            o67.l(ux2Var);
                            o67.n(fs4VarS2, d82.t, ux2Var);
                            fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                            if (z2) {
                                ux2Var.W(-1650437224);
                                fs4Var4 = fs4VarC;
                                h72Var2 = h72Var;
                                awVar2 = awVar;
                                i10 = i8;
                                cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                                ux2Var3 = ux2Var;
                                ux2Var3.p(false);
                            } else {
                                fs4Var4 = fs4VarC;
                                h72Var2 = h72Var;
                                awVar2 = awVar;
                                i10 = i8;
                                if (z) {
                                    ux2Var.W(-1650359011);
                                    cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                                    ux2Var3 = ux2Var;
                                    ux2Var3.p(false);
                                } else {
                                    ux2Var.W(-1650300235);
                                    cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                                    ux2Var3 = ux2Var;
                                    ux2Var3.p(false);
                                }
                            }
                            cq7 cq7Var2 = cq7VarL;
                            qf6 qf6Var2 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                            if (z2) {
                                hw2Var8 = hw2Var7;
                            } else {
                                hw2Var8 = hw2Var5;
                            }
                            objK2 = ux2Var3.K();
                            if (objK2 == awVar2) {
                                objK2 = new fk6((byte) 9);
                                ux2Var3.g0(objK2);
                            }
                            ux2 ux2Var5 = ux2Var3;
                            bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var2, cq7Var2, ux2Var5, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                            ux2Var2 = ux2Var5;
                            ux2Var2.p(true);
                            fs4Var2 = fs4Var6;
                            hw2Var6 = hw2Var7;
                            z6 = z9;
                        } else {
                            ux2Var2 = ux2Var;
                            ux2Var2.Q();
                            z6 = z4;
                            hw2Var5 = hw2Var3;
                            hw2Var6 = hw2Var4;
                        }
                        j56VarR = ux2Var2.r();
                        if (j56VarR != null) {
                            final fs4 fs4Var7 = fs4Var2;
                            final hw2 hw2Var9 = hw2Var5;
                            j56VarR.d = new hw2() { // from class: o.yo6
                                @Override // o.hw2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    ds1.w(str, str2, z, z2, function0, fs4Var7, z6, str3, hw2Var9, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                                    return f88.a;
                                }
                            };
                        }
                    }
                    i3 |= 805306368;
                    hw2Var4 = hw2Var2;
                    i8 = i3;
                    if ((i3 & 306783379) != 306783378) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (ux2Var.N(i8 & 1, z5)) {
                        ux2Var.S();
                        i9 = i & 1;
                        cs4Var = cs4.b;
                        if (i9 != 0) {
                            if (i13 != 0) {
                                fs4Var2 = cs4Var;
                            }
                            if ((i2 & 64) != 0) {
                                z4 = z;
                                i8 &= -3670017;
                            }
                            if (i4 != 0) {
                                hw2Var3 = null;
                            }
                            if (i6 != 0) {
                                hw2Var7 = null;
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                            } else {
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                                hw2Var7 = hw2Var4;
                            }
                        } else {
                            if (i13 != 0) {
                                fs4Var2 = cs4Var;
                            }
                            if ((i2 & 64) != 0) {
                                z4 = z;
                                i8 &= -3670017;
                            }
                            if (i4 != 0) {
                                hw2Var3 = null;
                            }
                            if (i6 != 0) {
                                hw2Var7 = null;
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                            } else {
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                                hw2Var7 = hw2Var4;
                            }
                        }
                        ux2Var.q();
                        objK = ux2Var.K();
                        awVar = e01.a;
                        if (objK == awVar) {
                            objK = ua5.s(ux2Var);
                        }
                        fs4 fs4VarC4 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                        h72Var = un4.a;
                        fs4 fs4Var8 = fs4Var3;
                        fs4 fs4VarA3 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC4, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                        boolean z10 = z7;
                        do4 do4VarC3 = ua0.c(xz2.f2564o, false);
                        int iHashCode3 = Long.hashCode(ux2Var.T);
                        yj5 yj5VarL3 = ux2Var.l();
                        fs4 fs4VarS3 = uf0.s(ux2Var, fs4VarA3);
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(do4VarC3, d82.v, ux2Var);
                        o67.n(yj5VarL3, d82.u, ux2Var);
                        o67.n(Integer.valueOf(iHashCode3), d82.w, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS3, d82.t, ux2Var);
                        fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                        if (z2) {
                            ux2Var.W(-1650437224);
                            fs4Var4 = fs4VarC;
                            h72Var2 = h72Var;
                            awVar2 = awVar;
                            i10 = i8;
                            cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        } else {
                            fs4Var4 = fs4VarC;
                            h72Var2 = h72Var;
                            awVar2 = awVar;
                            i10 = i8;
                            if (z) {
                                ux2Var.W(-1650359011);
                                cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                                ux2Var3 = ux2Var;
                                ux2Var3.p(false);
                            } else {
                                ux2Var.W(-1650300235);
                                cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                                ux2Var3 = ux2Var;
                                ux2Var3.p(false);
                            }
                        }
                        cq7 cq7Var3 = cq7VarL;
                        qf6 qf6Var3 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                        if (z2) {
                            hw2Var8 = hw2Var7;
                        } else {
                            hw2Var8 = hw2Var5;
                        }
                        objK2 = ux2Var3.K();
                        if (objK2 == awVar2) {
                            objK2 = new fk6((byte) 9);
                            ux2Var3.g0(objK2);
                        }
                        ux2 ux2Var6 = ux2Var3;
                        bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var3, cq7Var3, ux2Var6, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                        ux2Var2 = ux2Var6;
                        ux2Var2.p(true);
                        fs4Var2 = fs4Var8;
                        hw2Var6 = hw2Var7;
                        z6 = z10;
                    } else {
                        ux2Var2 = ux2Var;
                        ux2Var2.Q();
                        z6 = z4;
                        hw2Var5 = hw2Var3;
                        hw2Var6 = hw2Var4;
                    }
                    j56VarR = ux2Var2.r();
                    if (j56VarR != null) {
                        final fs4 fs4Var9 = fs4Var2;
                        final hw2 hw2Var10 = hw2Var5;
                        j56VarR.d = new hw2() { // from class: o.yo6
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ds1.w(str, str2, z, z2, function0, fs4Var9, z6, str3, hw2Var10, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                                return f88.a;
                            }
                        };
                    }
                }
                i3 |= 100663296;
                hw2Var3 = hw2Var;
                i6 = i2 & 512;
                if (i6 != 0) {
                    if ((805306368 & i) == 0) {
                        hw2Var4 = hw2Var2;
                        if (ux2Var.h(hw2Var4)) {
                            i7 = 536870912;
                        } else {
                            i7 = 268435456;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if ((i3 & 306783379) != 306783378) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (ux2Var.N(i8 & 1, z5)) {
                        ux2Var.S();
                        i9 = i & 1;
                        cs4Var = cs4.b;
                        if (i9 != 0) {
                            if (i13 != 0) {
                                fs4Var2 = cs4Var;
                            }
                            if ((i2 & 64) != 0) {
                                z4 = z;
                                i8 &= -3670017;
                            }
                            if (i4 != 0) {
                                hw2Var3 = null;
                            }
                            if (i6 != 0) {
                                hw2Var7 = null;
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                            } else {
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                                hw2Var7 = hw2Var4;
                            }
                        } else {
                            if (i13 != 0) {
                                fs4Var2 = cs4Var;
                            }
                            if ((i2 & 64) != 0) {
                                z4 = z;
                                i8 &= -3670017;
                            }
                            if (i4 != 0) {
                                hw2Var3 = null;
                            }
                            if (i6 != 0) {
                                hw2Var7 = null;
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                            } else {
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                                hw2Var7 = hw2Var4;
                            }
                        }
                        ux2Var.q();
                        objK = ux2Var.K();
                        awVar = e01.a;
                        if (objK == awVar) {
                            objK = ua5.s(ux2Var);
                        }
                        fs4 fs4VarC5 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                        h72Var = un4.a;
                        fs4 fs4Var10 = fs4Var3;
                        fs4 fs4VarA4 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC5, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                        boolean z11 = z7;
                        do4 do4VarC4 = ua0.c(xz2.f2564o, false);
                        int iHashCode4 = Long.hashCode(ux2Var.T);
                        yj5 yj5VarL4 = ux2Var.l();
                        fs4 fs4VarS4 = uf0.s(ux2Var, fs4VarA4);
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(do4VarC4, d82.v, ux2Var);
                        o67.n(yj5VarL4, d82.u, ux2Var);
                        o67.n(Integer.valueOf(iHashCode4), d82.w, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS4, d82.t, ux2Var);
                        fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                        if (z2) {
                            ux2Var.W(-1650437224);
                            fs4Var4 = fs4VarC;
                            h72Var2 = h72Var;
                            awVar2 = awVar;
                            i10 = i8;
                            cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        } else {
                            fs4Var4 = fs4VarC;
                            h72Var2 = h72Var;
                            awVar2 = awVar;
                            i10 = i8;
                            if (z) {
                                ux2Var.W(-1650359011);
                                cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                                ux2Var3 = ux2Var;
                                ux2Var3.p(false);
                            } else {
                                ux2Var.W(-1650300235);
                                cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                                ux2Var3 = ux2Var;
                                ux2Var3.p(false);
                            }
                        }
                        cq7 cq7Var4 = cq7VarL;
                        qf6 qf6Var4 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                        if (z2) {
                            hw2Var8 = hw2Var7;
                        } else {
                            hw2Var8 = hw2Var5;
                        }
                        objK2 = ux2Var3.K();
                        if (objK2 == awVar2) {
                            objK2 = new fk6((byte) 9);
                            ux2Var3.g0(objK2);
                        }
                        ux2 ux2Var7 = ux2Var3;
                        bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var4, cq7Var4, ux2Var7, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                        ux2Var2 = ux2Var7;
                        ux2Var2.p(true);
                        fs4Var2 = fs4Var10;
                        hw2Var6 = hw2Var7;
                        z6 = z11;
                    } else {
                        ux2Var2 = ux2Var;
                        ux2Var2.Q();
                        z6 = z4;
                        hw2Var5 = hw2Var3;
                        hw2Var6 = hw2Var4;
                    }
                    j56VarR = ux2Var2.r();
                    if (j56VarR != null) {
                        final fs4 fs4Var11 = fs4Var2;
                        final hw2 hw2Var11 = hw2Var5;
                        j56VarR.d = new hw2() { // from class: o.yo6
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ds1.w(str, str2, z, z2, function0, fs4Var11, z6, str3, hw2Var11, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                                return f88.a;
                            }
                        };
                    }
                }
                i3 |= 805306368;
                hw2Var4 = hw2Var2;
                i8 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (ux2Var.N(i8 & 1, z5)) {
                    ux2Var.S();
                    i9 = i & 1;
                    cs4Var = cs4.b;
                    if (i9 != 0) {
                        if (i13 != 0) {
                            fs4Var2 = cs4Var;
                        }
                        if ((i2 & 64) != 0) {
                            z4 = z;
                            i8 &= -3670017;
                        }
                        if (i4 != 0) {
                            hw2Var3 = null;
                        }
                        if (i6 != 0) {
                            hw2Var7 = null;
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                        } else {
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                            hw2Var7 = hw2Var4;
                        }
                    } else {
                        if (i13 != 0) {
                            fs4Var2 = cs4Var;
                        }
                        if ((i2 & 64) != 0) {
                            z4 = z;
                            i8 &= -3670017;
                        }
                        if (i4 != 0) {
                            hw2Var3 = null;
                        }
                        if (i6 != 0) {
                            hw2Var7 = null;
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                        } else {
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                            hw2Var7 = hw2Var4;
                        }
                    }
                    ux2Var.q();
                    objK = ux2Var.K();
                    awVar = e01.a;
                    if (objK == awVar) {
                        objK = ua5.s(ux2Var);
                    }
                    fs4 fs4VarC6 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                    h72Var = un4.a;
                    fs4 fs4Var12 = fs4Var3;
                    fs4 fs4VarA5 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC6, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                    boolean z12 = z7;
                    do4 do4VarC5 = ua0.c(xz2.f2564o, false);
                    int iHashCode5 = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL5 = ux2Var.l();
                    fs4 fs4VarS5 = uf0.s(ux2Var, fs4VarA5);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC5, d82.v, ux2Var);
                    o67.n(yj5VarL5, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode5), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS5, d82.t, ux2Var);
                    fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    if (z2) {
                        ux2Var.W(-1650437224);
                        fs4Var4 = fs4VarC;
                        h72Var2 = h72Var;
                        awVar2 = awVar;
                        i10 = i8;
                        cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                        ux2Var3 = ux2Var;
                        ux2Var3.p(false);
                    } else {
                        fs4Var4 = fs4VarC;
                        h72Var2 = h72Var;
                        awVar2 = awVar;
                        i10 = i8;
                        if (z) {
                            ux2Var.W(-1650359011);
                            cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        } else {
                            ux2Var.W(-1650300235);
                            cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        }
                    }
                    cq7 cq7Var5 = cq7VarL;
                    qf6 qf6Var5 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                    if (z2) {
                        hw2Var8 = hw2Var7;
                    } else {
                        hw2Var8 = hw2Var5;
                    }
                    objK2 = ux2Var3.K();
                    if (objK2 == awVar2) {
                        objK2 = new fk6((byte) 9);
                        ux2Var3.g0(objK2);
                    }
                    ux2 ux2Var8 = ux2Var3;
                    bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var5, cq7Var5, ux2Var8, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                    ux2Var2 = ux2Var8;
                    ux2Var2.p(true);
                    fs4Var2 = fs4Var12;
                    hw2Var6 = hw2Var7;
                    z6 = z12;
                } else {
                    ux2Var2 = ux2Var;
                    ux2Var2.Q();
                    z6 = z4;
                    hw2Var5 = hw2Var3;
                    hw2Var6 = hw2Var4;
                }
                j56VarR = ux2Var2.r();
                if (j56VarR != null) {
                    final fs4 fs4Var13 = fs4Var2;
                    final hw2 hw2Var12 = hw2Var5;
                    j56VarR.d = new hw2() { // from class: o.yo6
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ds1.w(str, str2, z, z2, function0, fs4Var13, z6, str3, hw2Var12, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                            return f88.a;
                        }
                    };
                }
            }
            z4 = z3;
            i3 = i12 | i14;
            i4 = i2 & 256;
            if (i4 != 0) {
                if ((100663296 & i) == 0) {
                    hw2Var3 = hw2Var;
                    if (ux2Var.h(hw2Var3)) {
                        i5 = 67108864;
                    } else {
                        i5 = 33554432;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 512;
                if (i6 != 0) {
                    if ((805306368 & i) == 0) {
                        hw2Var4 = hw2Var2;
                        if (ux2Var.h(hw2Var4)) {
                            i7 = 536870912;
                        } else {
                            i7 = 268435456;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if ((i3 & 306783379) != 306783378) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (ux2Var.N(i8 & 1, z5)) {
                        ux2Var.S();
                        i9 = i & 1;
                        cs4Var = cs4.b;
                        if (i9 != 0) {
                            if (i13 != 0) {
                                fs4Var2 = cs4Var;
                            }
                            if ((i2 & 64) != 0) {
                                z4 = z;
                                i8 &= -3670017;
                            }
                            if (i4 != 0) {
                                hw2Var3 = null;
                            }
                            if (i6 != 0) {
                                hw2Var7 = null;
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                            } else {
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                                hw2Var7 = hw2Var4;
                            }
                        } else {
                            if (i13 != 0) {
                                fs4Var2 = cs4Var;
                            }
                            if ((i2 & 64) != 0) {
                                z4 = z;
                                i8 &= -3670017;
                            }
                            if (i4 != 0) {
                                hw2Var3 = null;
                            }
                            if (i6 != 0) {
                                hw2Var7 = null;
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                            } else {
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                                hw2Var7 = hw2Var4;
                            }
                        }
                        ux2Var.q();
                        objK = ux2Var.K();
                        awVar = e01.a;
                        if (objK == awVar) {
                            objK = ua5.s(ux2Var);
                        }
                        fs4 fs4VarC7 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                        h72Var = un4.a;
                        fs4 fs4Var14 = fs4Var3;
                        fs4 fs4VarA6 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC7, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                        boolean z13 = z7;
                        do4 do4VarC6 = ua0.c(xz2.f2564o, false);
                        int iHashCode6 = Long.hashCode(ux2Var.T);
                        yj5 yj5VarL6 = ux2Var.l();
                        fs4 fs4VarS6 = uf0.s(ux2Var, fs4VarA6);
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(do4VarC6, d82.v, ux2Var);
                        o67.n(yj5VarL6, d82.u, ux2Var);
                        o67.n(Integer.valueOf(iHashCode6), d82.w, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS6, d82.t, ux2Var);
                        fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                        if (z2) {
                            ux2Var.W(-1650437224);
                            fs4Var4 = fs4VarC;
                            h72Var2 = h72Var;
                            awVar2 = awVar;
                            i10 = i8;
                            cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        } else {
                            fs4Var4 = fs4VarC;
                            h72Var2 = h72Var;
                            awVar2 = awVar;
                            i10 = i8;
                            if (z) {
                                ux2Var.W(-1650359011);
                                cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                                ux2Var3 = ux2Var;
                                ux2Var3.p(false);
                            } else {
                                ux2Var.W(-1650300235);
                                cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                                ux2Var3 = ux2Var;
                                ux2Var3.p(false);
                            }
                        }
                        cq7 cq7Var6 = cq7VarL;
                        qf6 qf6Var6 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                        if (z2) {
                            hw2Var8 = hw2Var7;
                        } else {
                            hw2Var8 = hw2Var5;
                        }
                        objK2 = ux2Var3.K();
                        if (objK2 == awVar2) {
                            objK2 = new fk6((byte) 9);
                            ux2Var3.g0(objK2);
                        }
                        ux2 ux2Var9 = ux2Var3;
                        bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var6, cq7Var6, ux2Var9, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                        ux2Var2 = ux2Var9;
                        ux2Var2.p(true);
                        fs4Var2 = fs4Var14;
                        hw2Var6 = hw2Var7;
                        z6 = z13;
                    } else {
                        ux2Var2 = ux2Var;
                        ux2Var2.Q();
                        z6 = z4;
                        hw2Var5 = hw2Var3;
                        hw2Var6 = hw2Var4;
                    }
                    j56VarR = ux2Var2.r();
                    if (j56VarR != null) {
                        final fs4 fs4Var15 = fs4Var2;
                        final hw2 hw2Var13 = hw2Var5;
                        j56VarR.d = new hw2() { // from class: o.yo6
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ds1.w(str, str2, z, z2, function0, fs4Var15, z6, str3, hw2Var13, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                                return f88.a;
                            }
                        };
                    }
                }
                i3 |= 805306368;
                hw2Var4 = hw2Var2;
                i8 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (ux2Var.N(i8 & 1, z5)) {
                    ux2Var.S();
                    i9 = i & 1;
                    cs4Var = cs4.b;
                    if (i9 != 0) {
                        if (i13 != 0) {
                            fs4Var2 = cs4Var;
                        }
                        if ((i2 & 64) != 0) {
                            z4 = z;
                            i8 &= -3670017;
                        }
                        if (i4 != 0) {
                            hw2Var3 = null;
                        }
                        if (i6 != 0) {
                            hw2Var7 = null;
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                        } else {
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                            hw2Var7 = hw2Var4;
                        }
                    } else {
                        if (i13 != 0) {
                            fs4Var2 = cs4Var;
                        }
                        if ((i2 & 64) != 0) {
                            z4 = z;
                            i8 &= -3670017;
                        }
                        if (i4 != 0) {
                            hw2Var3 = null;
                        }
                        if (i6 != 0) {
                            hw2Var7 = null;
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                        } else {
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                            hw2Var7 = hw2Var4;
                        }
                    }
                    ux2Var.q();
                    objK = ux2Var.K();
                    awVar = e01.a;
                    if (objK == awVar) {
                        objK = ua5.s(ux2Var);
                    }
                    fs4 fs4VarC8 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                    h72Var = un4.a;
                    fs4 fs4Var16 = fs4Var3;
                    fs4 fs4VarA7 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC8, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                    boolean z14 = z7;
                    do4 do4VarC7 = ua0.c(xz2.f2564o, false);
                    int iHashCode7 = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL7 = ux2Var.l();
                    fs4 fs4VarS7 = uf0.s(ux2Var, fs4VarA7);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC7, d82.v, ux2Var);
                    o67.n(yj5VarL7, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode7), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS7, d82.t, ux2Var);
                    fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    if (z2) {
                        ux2Var.W(-1650437224);
                        fs4Var4 = fs4VarC;
                        h72Var2 = h72Var;
                        awVar2 = awVar;
                        i10 = i8;
                        cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                        ux2Var3 = ux2Var;
                        ux2Var3.p(false);
                    } else {
                        fs4Var4 = fs4VarC;
                        h72Var2 = h72Var;
                        awVar2 = awVar;
                        i10 = i8;
                        if (z) {
                            ux2Var.W(-1650359011);
                            cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        } else {
                            ux2Var.W(-1650300235);
                            cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        }
                    }
                    cq7 cq7Var7 = cq7VarL;
                    qf6 qf6Var7 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                    if (z2) {
                        hw2Var8 = hw2Var7;
                    } else {
                        hw2Var8 = hw2Var5;
                    }
                    objK2 = ux2Var3.K();
                    if (objK2 == awVar2) {
                        objK2 = new fk6((byte) 9);
                        ux2Var3.g0(objK2);
                    }
                    ux2 ux2Var10 = ux2Var3;
                    bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var7, cq7Var7, ux2Var10, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                    ux2Var2 = ux2Var10;
                    ux2Var2.p(true);
                    fs4Var2 = fs4Var16;
                    hw2Var6 = hw2Var7;
                    z6 = z14;
                } else {
                    ux2Var2 = ux2Var;
                    ux2Var2.Q();
                    z6 = z4;
                    hw2Var5 = hw2Var3;
                    hw2Var6 = hw2Var4;
                }
                j56VarR = ux2Var2.r();
                if (j56VarR != null) {
                    final fs4 fs4Var17 = fs4Var2;
                    final hw2 hw2Var14 = hw2Var5;
                    j56VarR.d = new hw2() { // from class: o.yo6
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ds1.w(str, str2, z, z2, function0, fs4Var17, z6, str3, hw2Var14, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                            return f88.a;
                        }
                    };
                }
            }
            i3 |= 100663296;
            hw2Var3 = hw2Var;
            i6 = i2 & 512;
            if (i6 != 0) {
                if ((805306368 & i) == 0) {
                    hw2Var4 = hw2Var2;
                    if (ux2Var.h(hw2Var4)) {
                        i7 = 536870912;
                    } else {
                        i7 = 268435456;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (ux2Var.N(i8 & 1, z5)) {
                    ux2Var.S();
                    i9 = i & 1;
                    cs4Var = cs4.b;
                    if (i9 != 0) {
                        if (i13 != 0) {
                            fs4Var2 = cs4Var;
                        }
                        if ((i2 & 64) != 0) {
                            z4 = z;
                            i8 &= -3670017;
                        }
                        if (i4 != 0) {
                            hw2Var3 = null;
                        }
                        if (i6 != 0) {
                            hw2Var7 = null;
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                        } else {
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                            hw2Var7 = hw2Var4;
                        }
                    } else {
                        if (i13 != 0) {
                            fs4Var2 = cs4Var;
                        }
                        if ((i2 & 64) != 0) {
                            z4 = z;
                            i8 &= -3670017;
                        }
                        if (i4 != 0) {
                            hw2Var3 = null;
                        }
                        if (i6 != 0) {
                            hw2Var7 = null;
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                        } else {
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                            hw2Var7 = hw2Var4;
                        }
                    }
                    ux2Var.q();
                    objK = ux2Var.K();
                    awVar = e01.a;
                    if (objK == awVar) {
                        objK = ua5.s(ux2Var);
                    }
                    fs4 fs4VarC9 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                    h72Var = un4.a;
                    fs4 fs4Var18 = fs4Var3;
                    fs4 fs4VarA8 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC9, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                    boolean z15 = z7;
                    do4 do4VarC8 = ua0.c(xz2.f2564o, false);
                    int iHashCode8 = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL8 = ux2Var.l();
                    fs4 fs4VarS8 = uf0.s(ux2Var, fs4VarA8);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC8, d82.v, ux2Var);
                    o67.n(yj5VarL8, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode8), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS8, d82.t, ux2Var);
                    fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    if (z2) {
                        ux2Var.W(-1650437224);
                        fs4Var4 = fs4VarC;
                        h72Var2 = h72Var;
                        awVar2 = awVar;
                        i10 = i8;
                        cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                        ux2Var3 = ux2Var;
                        ux2Var3.p(false);
                    } else {
                        fs4Var4 = fs4VarC;
                        h72Var2 = h72Var;
                        awVar2 = awVar;
                        i10 = i8;
                        if (z) {
                            ux2Var.W(-1650359011);
                            cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        } else {
                            ux2Var.W(-1650300235);
                            cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        }
                    }
                    cq7 cq7Var8 = cq7VarL;
                    qf6 qf6Var8 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                    if (z2) {
                        hw2Var8 = hw2Var7;
                    } else {
                        hw2Var8 = hw2Var5;
                    }
                    objK2 = ux2Var3.K();
                    if (objK2 == awVar2) {
                        objK2 = new fk6((byte) 9);
                        ux2Var3.g0(objK2);
                    }
                    ux2 ux2Var11 = ux2Var3;
                    bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var8, cq7Var8, ux2Var11, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                    ux2Var2 = ux2Var11;
                    ux2Var2.p(true);
                    fs4Var2 = fs4Var18;
                    hw2Var6 = hw2Var7;
                    z6 = z15;
                } else {
                    ux2Var2 = ux2Var;
                    ux2Var2.Q();
                    z6 = z4;
                    hw2Var5 = hw2Var3;
                    hw2Var6 = hw2Var4;
                }
                j56VarR = ux2Var2.r();
                if (j56VarR != null) {
                    final fs4 fs4Var19 = fs4Var2;
                    final hw2 hw2Var15 = hw2Var5;
                    j56VarR.d = new hw2() { // from class: o.yo6
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ds1.w(str, str2, z, z2, function0, fs4Var19, z6, str3, hw2Var15, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                            return f88.a;
                        }
                    };
                }
            }
            i3 |= 805306368;
            hw2Var4 = hw2Var2;
            i8 = i3;
            if ((i3 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (ux2Var.N(i8 & 1, z5)) {
                ux2Var.S();
                i9 = i & 1;
                cs4Var = cs4.b;
                if (i9 != 0) {
                    if (i13 != 0) {
                        fs4Var2 = cs4Var;
                    }
                    if ((i2 & 64) != 0) {
                        z4 = z;
                        i8 &= -3670017;
                    }
                    if (i4 != 0) {
                        hw2Var3 = null;
                    }
                    if (i6 != 0) {
                        hw2Var7 = null;
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                    } else {
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                        hw2Var7 = hw2Var4;
                    }
                } else {
                    if (i13 != 0) {
                        fs4Var2 = cs4Var;
                    }
                    if ((i2 & 64) != 0) {
                        z4 = z;
                        i8 &= -3670017;
                    }
                    if (i4 != 0) {
                        hw2Var3 = null;
                    }
                    if (i6 != 0) {
                        hw2Var7 = null;
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                    } else {
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                        hw2Var7 = hw2Var4;
                    }
                }
                ux2Var.q();
                objK = ux2Var.K();
                awVar = e01.a;
                if (objK == awVar) {
                    objK = ua5.s(ux2Var);
                }
                fs4 fs4VarC10 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                h72Var = un4.a;
                fs4 fs4Var110 = fs4Var3;
                fs4 fs4VarA9 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC10, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                boolean z16 = z7;
                do4 do4VarC9 = ua0.c(xz2.f2564o, false);
                int iHashCode9 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL9 = ux2Var.l();
                fs4 fs4VarS9 = uf0.s(ux2Var, fs4VarA9);
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4VarC9, d82.v, ux2Var);
                o67.n(yj5VarL9, d82.u, ux2Var);
                o67.n(Integer.valueOf(iHashCode9), d82.w, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS9, d82.t, ux2Var);
                fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                if (z2) {
                    ux2Var.W(-1650437224);
                    fs4Var4 = fs4VarC;
                    h72Var2 = h72Var;
                    awVar2 = awVar;
                    i10 = i8;
                    cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                    ux2Var3 = ux2Var;
                    ux2Var3.p(false);
                } else {
                    fs4Var4 = fs4VarC;
                    h72Var2 = h72Var;
                    awVar2 = awVar;
                    i10 = i8;
                    if (z) {
                        ux2Var.W(-1650359011);
                        cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                        ux2Var3 = ux2Var;
                        ux2Var3.p(false);
                    } else {
                        ux2Var.W(-1650300235);
                        cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                        ux2Var3 = ux2Var;
                        ux2Var3.p(false);
                    }
                }
                cq7 cq7Var9 = cq7VarL;
                qf6 qf6Var9 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                if (z2) {
                    hw2Var8 = hw2Var7;
                } else {
                    hw2Var8 = hw2Var5;
                }
                objK2 = ux2Var3.K();
                if (objK2 == awVar2) {
                    objK2 = new fk6((byte) 9);
                    ux2Var3.g0(objK2);
                }
                ux2 ux2Var12 = ux2Var3;
                bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var9, cq7Var9, ux2Var12, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                ux2Var2 = ux2Var12;
                ux2Var2.p(true);
                fs4Var2 = fs4Var110;
                hw2Var6 = hw2Var7;
                z6 = z16;
            } else {
                ux2Var2 = ux2Var;
                ux2Var2.Q();
                z6 = z4;
                hw2Var5 = hw2Var3;
                hw2Var6 = hw2Var4;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                final fs4 fs4Var111 = fs4Var2;
                final hw2 hw2Var16 = hw2Var5;
                j56VarR.d = new hw2() { // from class: o.yo6
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ds1.w(str, str2, z, z2, function0, fs4Var111, z6, str3, hw2Var16, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i12 |= 196608;
        fs4Var2 = fs4Var;
        if ((i2 & 64) == 0) {
            z4 = z3;
            if (ux2Var.g(z4)) {
            }
            i3 = i12 | i14;
            i4 = i2 & 256;
            if (i4 != 0) {
                if ((100663296 & i) == 0) {
                    hw2Var3 = hw2Var;
                    if (ux2Var.h(hw2Var3)) {
                        i5 = 67108864;
                    } else {
                        i5 = 33554432;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 512;
                if (i6 != 0) {
                    if ((805306368 & i) == 0) {
                        hw2Var4 = hw2Var2;
                        if (ux2Var.h(hw2Var4)) {
                            i7 = 536870912;
                        } else {
                            i7 = 268435456;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if ((i3 & 306783379) != 306783378) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (ux2Var.N(i8 & 1, z5)) {
                        ux2Var.S();
                        i9 = i & 1;
                        cs4Var = cs4.b;
                        if (i9 != 0) {
                            if (i13 != 0) {
                                fs4Var2 = cs4Var;
                            }
                            if ((i2 & 64) != 0) {
                                z4 = z;
                                i8 &= -3670017;
                            }
                            if (i4 != 0) {
                                hw2Var3 = null;
                            }
                            if (i6 != 0) {
                                hw2Var7 = null;
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                            } else {
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                                hw2Var7 = hw2Var4;
                            }
                        } else {
                            if (i13 != 0) {
                                fs4Var2 = cs4Var;
                            }
                            if ((i2 & 64) != 0) {
                                z4 = z;
                                i8 &= -3670017;
                            }
                            if (i4 != 0) {
                                hw2Var3 = null;
                            }
                            if (i6 != 0) {
                                hw2Var7 = null;
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                            } else {
                                fs4Var3 = fs4Var2;
                                z7 = z4;
                                hw2Var5 = hw2Var3;
                                hw2Var7 = hw2Var4;
                            }
                        }
                        ux2Var.q();
                        objK = ux2Var.K();
                        awVar = e01.a;
                        if (objK == awVar) {
                            objK = ua5.s(ux2Var);
                        }
                        fs4 fs4VarC11 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                        h72Var = un4.a;
                        fs4 fs4Var112 = fs4Var3;
                        fs4 fs4VarA10 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC11, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                        boolean z17 = z7;
                        do4 do4VarC10 = ua0.c(xz2.f2564o, false);
                        int iHashCode10 = Long.hashCode(ux2Var.T);
                        yj5 yj5VarL10 = ux2Var.l();
                        fs4 fs4VarS10 = uf0.s(ux2Var, fs4VarA10);
                        yz0.c.getClass();
                        ux2Var.a0();
                        if (ux2Var.S) {
                            ux2Var.k(LayoutNode.e0);
                        } else {
                            ux2Var.j0();
                        }
                        o67.n(do4VarC10, d82.v, ux2Var);
                        o67.n(yj5VarL10, d82.u, ux2Var);
                        o67.n(Integer.valueOf(iHashCode10), d82.w, ux2Var);
                        o67.l(ux2Var);
                        o67.n(fs4VarS10, d82.t, ux2Var);
                        fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                        if (z2) {
                            ux2Var.W(-1650437224);
                            fs4Var4 = fs4VarC;
                            h72Var2 = h72Var;
                            awVar2 = awVar;
                            i10 = i8;
                            cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        } else {
                            fs4Var4 = fs4VarC;
                            h72Var2 = h72Var;
                            awVar2 = awVar;
                            i10 = i8;
                            if (z) {
                                ux2Var.W(-1650359011);
                                cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                                ux2Var3 = ux2Var;
                                ux2Var3.p(false);
                            } else {
                                ux2Var.W(-1650300235);
                                cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                                ux2Var3 = ux2Var;
                                ux2Var3.p(false);
                            }
                        }
                        cq7 cq7Var10 = cq7VarL;
                        qf6 qf6Var10 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                        if (z2) {
                            hw2Var8 = hw2Var7;
                        } else {
                            hw2Var8 = hw2Var5;
                        }
                        objK2 = ux2Var3.K();
                        if (objK2 == awVar2) {
                            objK2 = new fk6((byte) 9);
                            ux2Var3.g0(objK2);
                        }
                        ux2 ux2Var13 = ux2Var3;
                        bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var10, cq7Var10, ux2Var13, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                        ux2Var2 = ux2Var13;
                        ux2Var2.p(true);
                        fs4Var2 = fs4Var112;
                        hw2Var6 = hw2Var7;
                        z6 = z17;
                    } else {
                        ux2Var2 = ux2Var;
                        ux2Var2.Q();
                        z6 = z4;
                        hw2Var5 = hw2Var3;
                        hw2Var6 = hw2Var4;
                    }
                    j56VarR = ux2Var2.r();
                    if (j56VarR != null) {
                        final fs4 fs4Var113 = fs4Var2;
                        final hw2 hw2Var17 = hw2Var5;
                        j56VarR.d = new hw2() { // from class: o.yo6
                            @Override // o.hw2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ds1.w(str, str2, z, z2, function0, fs4Var113, z6, str3, hw2Var17, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                                return f88.a;
                            }
                        };
                    }
                }
                i3 |= 805306368;
                hw2Var4 = hw2Var2;
                i8 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (ux2Var.N(i8 & 1, z5)) {
                    ux2Var.S();
                    i9 = i & 1;
                    cs4Var = cs4.b;
                    if (i9 != 0) {
                        if (i13 != 0) {
                            fs4Var2 = cs4Var;
                        }
                        if ((i2 & 64) != 0) {
                            z4 = z;
                            i8 &= -3670017;
                        }
                        if (i4 != 0) {
                            hw2Var3 = null;
                        }
                        if (i6 != 0) {
                            hw2Var7 = null;
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                        } else {
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                            hw2Var7 = hw2Var4;
                        }
                    } else {
                        if (i13 != 0) {
                            fs4Var2 = cs4Var;
                        }
                        if ((i2 & 64) != 0) {
                            z4 = z;
                            i8 &= -3670017;
                        }
                        if (i4 != 0) {
                            hw2Var3 = null;
                        }
                        if (i6 != 0) {
                            hw2Var7 = null;
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                        } else {
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                            hw2Var7 = hw2Var4;
                        }
                    }
                    ux2Var.q();
                    objK = ux2Var.K();
                    awVar = e01.a;
                    if (objK == awVar) {
                        objK = ua5.s(ux2Var);
                    }
                    fs4 fs4VarC12 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                    h72Var = un4.a;
                    fs4 fs4Var114 = fs4Var3;
                    fs4 fs4VarA11 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC12, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                    boolean z18 = z7;
                    do4 do4VarC11 = ua0.c(xz2.f2564o, false);
                    int iHashCode11 = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL11 = ux2Var.l();
                    fs4 fs4VarS11 = uf0.s(ux2Var, fs4VarA11);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC11, d82.v, ux2Var);
                    o67.n(yj5VarL11, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode11), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS11, d82.t, ux2Var);
                    fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    if (z2) {
                        ux2Var.W(-1650437224);
                        fs4Var4 = fs4VarC;
                        h72Var2 = h72Var;
                        awVar2 = awVar;
                        i10 = i8;
                        cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                        ux2Var3 = ux2Var;
                        ux2Var3.p(false);
                    } else {
                        fs4Var4 = fs4VarC;
                        h72Var2 = h72Var;
                        awVar2 = awVar;
                        i10 = i8;
                        if (z) {
                            ux2Var.W(-1650359011);
                            cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        } else {
                            ux2Var.W(-1650300235);
                            cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        }
                    }
                    cq7 cq7Var11 = cq7VarL;
                    qf6 qf6Var11 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                    if (z2) {
                        hw2Var8 = hw2Var7;
                    } else {
                        hw2Var8 = hw2Var5;
                    }
                    objK2 = ux2Var3.K();
                    if (objK2 == awVar2) {
                        objK2 = new fk6((byte) 9);
                        ux2Var3.g0(objK2);
                    }
                    ux2 ux2Var14 = ux2Var3;
                    bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var11, cq7Var11, ux2Var14, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                    ux2Var2 = ux2Var14;
                    ux2Var2.p(true);
                    fs4Var2 = fs4Var114;
                    hw2Var6 = hw2Var7;
                    z6 = z18;
                } else {
                    ux2Var2 = ux2Var;
                    ux2Var2.Q();
                    z6 = z4;
                    hw2Var5 = hw2Var3;
                    hw2Var6 = hw2Var4;
                }
                j56VarR = ux2Var2.r();
                if (j56VarR != null) {
                    final fs4 fs4Var115 = fs4Var2;
                    final hw2 hw2Var18 = hw2Var5;
                    j56VarR.d = new hw2() { // from class: o.yo6
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ds1.w(str, str2, z, z2, function0, fs4Var115, z6, str3, hw2Var18, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                            return f88.a;
                        }
                    };
                }
            }
            i3 |= 100663296;
            hw2Var3 = hw2Var;
            i6 = i2 & 512;
            if (i6 != 0) {
                if ((805306368 & i) == 0) {
                    hw2Var4 = hw2Var2;
                    if (ux2Var.h(hw2Var4)) {
                        i7 = 536870912;
                    } else {
                        i7 = 268435456;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (ux2Var.N(i8 & 1, z5)) {
                    ux2Var.S();
                    i9 = i & 1;
                    cs4Var = cs4.b;
                    if (i9 != 0) {
                        if (i13 != 0) {
                            fs4Var2 = cs4Var;
                        }
                        if ((i2 & 64) != 0) {
                            z4 = z;
                            i8 &= -3670017;
                        }
                        if (i4 != 0) {
                            hw2Var3 = null;
                        }
                        if (i6 != 0) {
                            hw2Var7 = null;
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                        } else {
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                            hw2Var7 = hw2Var4;
                        }
                    } else {
                        if (i13 != 0) {
                            fs4Var2 = cs4Var;
                        }
                        if ((i2 & 64) != 0) {
                            z4 = z;
                            i8 &= -3670017;
                        }
                        if (i4 != 0) {
                            hw2Var3 = null;
                        }
                        if (i6 != 0) {
                            hw2Var7 = null;
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                        } else {
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                            hw2Var7 = hw2Var4;
                        }
                    }
                    ux2Var.q();
                    objK = ux2Var.K();
                    awVar = e01.a;
                    if (objK == awVar) {
                        objK = ua5.s(ux2Var);
                    }
                    fs4 fs4VarC13 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                    h72Var = un4.a;
                    fs4 fs4Var116 = fs4Var3;
                    fs4 fs4VarA12 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC13, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                    boolean z19 = z7;
                    do4 do4VarC12 = ua0.c(xz2.f2564o, false);
                    int iHashCode12 = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL12 = ux2Var.l();
                    fs4 fs4VarS12 = uf0.s(ux2Var, fs4VarA12);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC12, d82.v, ux2Var);
                    o67.n(yj5VarL12, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode12), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS12, d82.t, ux2Var);
                    fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    if (z2) {
                        ux2Var.W(-1650437224);
                        fs4Var4 = fs4VarC;
                        h72Var2 = h72Var;
                        awVar2 = awVar;
                        i10 = i8;
                        cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                        ux2Var3 = ux2Var;
                        ux2Var3.p(false);
                    } else {
                        fs4Var4 = fs4VarC;
                        h72Var2 = h72Var;
                        awVar2 = awVar;
                        i10 = i8;
                        if (z) {
                            ux2Var.W(-1650359011);
                            cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        } else {
                            ux2Var.W(-1650300235);
                            cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        }
                    }
                    cq7 cq7Var12 = cq7VarL;
                    qf6 qf6Var12 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                    if (z2) {
                        hw2Var8 = hw2Var7;
                    } else {
                        hw2Var8 = hw2Var5;
                    }
                    objK2 = ux2Var3.K();
                    if (objK2 == awVar2) {
                        objK2 = new fk6((byte) 9);
                        ux2Var3.g0(objK2);
                    }
                    ux2 ux2Var15 = ux2Var3;
                    bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var12, cq7Var12, ux2Var15, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                    ux2Var2 = ux2Var15;
                    ux2Var2.p(true);
                    fs4Var2 = fs4Var116;
                    hw2Var6 = hw2Var7;
                    z6 = z19;
                } else {
                    ux2Var2 = ux2Var;
                    ux2Var2.Q();
                    z6 = z4;
                    hw2Var5 = hw2Var3;
                    hw2Var6 = hw2Var4;
                }
                j56VarR = ux2Var2.r();
                if (j56VarR != null) {
                    final fs4 fs4Var117 = fs4Var2;
                    final hw2 hw2Var19 = hw2Var5;
                    j56VarR.d = new hw2() { // from class: o.yo6
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ds1.w(str, str2, z, z2, function0, fs4Var117, z6, str3, hw2Var19, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                            return f88.a;
                        }
                    };
                }
            }
            i3 |= 805306368;
            hw2Var4 = hw2Var2;
            i8 = i3;
            if ((i3 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (ux2Var.N(i8 & 1, z5)) {
                ux2Var.S();
                i9 = i & 1;
                cs4Var = cs4.b;
                if (i9 != 0) {
                    if (i13 != 0) {
                        fs4Var2 = cs4Var;
                    }
                    if ((i2 & 64) != 0) {
                        z4 = z;
                        i8 &= -3670017;
                    }
                    if (i4 != 0) {
                        hw2Var3 = null;
                    }
                    if (i6 != 0) {
                        hw2Var7 = null;
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                    } else {
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                        hw2Var7 = hw2Var4;
                    }
                } else {
                    if (i13 != 0) {
                        fs4Var2 = cs4Var;
                    }
                    if ((i2 & 64) != 0) {
                        z4 = z;
                        i8 &= -3670017;
                    }
                    if (i4 != 0) {
                        hw2Var3 = null;
                    }
                    if (i6 != 0) {
                        hw2Var7 = null;
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                    } else {
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                        hw2Var7 = hw2Var4;
                    }
                }
                ux2Var.q();
                objK = ux2Var.K();
                awVar = e01.a;
                if (objK == awVar) {
                    objK = ua5.s(ux2Var);
                }
                fs4 fs4VarC14 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                h72Var = un4.a;
                fs4 fs4Var118 = fs4Var3;
                fs4 fs4VarA13 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC14, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                boolean z110 = z7;
                do4 do4VarC13 = ua0.c(xz2.f2564o, false);
                int iHashCode13 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL13 = ux2Var.l();
                fs4 fs4VarS13 = uf0.s(ux2Var, fs4VarA13);
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4VarC13, d82.v, ux2Var);
                o67.n(yj5VarL13, d82.u, ux2Var);
                o67.n(Integer.valueOf(iHashCode13), d82.w, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS13, d82.t, ux2Var);
                fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                if (z2) {
                    ux2Var.W(-1650437224);
                    fs4Var4 = fs4VarC;
                    h72Var2 = h72Var;
                    awVar2 = awVar;
                    i10 = i8;
                    cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                    ux2Var3 = ux2Var;
                    ux2Var3.p(false);
                } else {
                    fs4Var4 = fs4VarC;
                    h72Var2 = h72Var;
                    awVar2 = awVar;
                    i10 = i8;
                    if (z) {
                        ux2Var.W(-1650359011);
                        cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                        ux2Var3 = ux2Var;
                        ux2Var3.p(false);
                    } else {
                        ux2Var.W(-1650300235);
                        cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                        ux2Var3 = ux2Var;
                        ux2Var3.p(false);
                    }
                }
                cq7 cq7Var13 = cq7VarL;
                qf6 qf6Var13 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                if (z2) {
                    hw2Var8 = hw2Var7;
                } else {
                    hw2Var8 = hw2Var5;
                }
                objK2 = ux2Var3.K();
                if (objK2 == awVar2) {
                    objK2 = new fk6((byte) 9);
                    ux2Var3.g0(objK2);
                }
                ux2 ux2Var16 = ux2Var3;
                bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var13, cq7Var13, ux2Var16, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                ux2Var2 = ux2Var16;
                ux2Var2.p(true);
                fs4Var2 = fs4Var118;
                hw2Var6 = hw2Var7;
                z6 = z110;
            } else {
                ux2Var2 = ux2Var;
                ux2Var2.Q();
                z6 = z4;
                hw2Var5 = hw2Var3;
                hw2Var6 = hw2Var4;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                final fs4 fs4Var119 = fs4Var2;
                final hw2 hw2Var110 = hw2Var5;
                j56VarR.d = new hw2() { // from class: o.yo6
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ds1.w(str, str2, z, z2, function0, fs4Var119, z6, str3, hw2Var110, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        z4 = z3;
        i3 = i12 | i14;
        i4 = i2 & 256;
        if (i4 != 0) {
            if ((100663296 & i) == 0) {
                hw2Var3 = hw2Var;
                if (ux2Var.h(hw2Var3)) {
                    i5 = 67108864;
                } else {
                    i5 = 33554432;
                }
                i3 |= i5;
            }
            i6 = i2 & 512;
            if (i6 != 0) {
                if ((805306368 & i) == 0) {
                    hw2Var4 = hw2Var2;
                    if (ux2Var.h(hw2Var4)) {
                        i7 = 536870912;
                    } else {
                        i7 = 268435456;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i3 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (ux2Var.N(i8 & 1, z5)) {
                    ux2Var.S();
                    i9 = i & 1;
                    cs4Var = cs4.b;
                    if (i9 != 0) {
                        if (i13 != 0) {
                            fs4Var2 = cs4Var;
                        }
                        if ((i2 & 64) != 0) {
                            z4 = z;
                            i8 &= -3670017;
                        }
                        if (i4 != 0) {
                            hw2Var3 = null;
                        }
                        if (i6 != 0) {
                            hw2Var7 = null;
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                        } else {
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                            hw2Var7 = hw2Var4;
                        }
                    } else {
                        if (i13 != 0) {
                            fs4Var2 = cs4Var;
                        }
                        if ((i2 & 64) != 0) {
                            z4 = z;
                            i8 &= -3670017;
                        }
                        if (i4 != 0) {
                            hw2Var3 = null;
                        }
                        if (i6 != 0) {
                            hw2Var7 = null;
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                        } else {
                            fs4Var3 = fs4Var2;
                            z7 = z4;
                            hw2Var5 = hw2Var3;
                            hw2Var7 = hw2Var4;
                        }
                    }
                    ux2Var.q();
                    objK = ux2Var.K();
                    awVar = e01.a;
                    if (objK == awVar) {
                        objK = ua5.s(ux2Var);
                    }
                    fs4 fs4VarC15 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                    h72Var = un4.a;
                    fs4 fs4Var1110 = fs4Var3;
                    fs4 fs4VarA14 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC15, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                    boolean z111 = z7;
                    do4 do4VarC14 = ua0.c(xz2.f2564o, false);
                    int iHashCode14 = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL14 = ux2Var.l();
                    fs4 fs4VarS14 = uf0.s(ux2Var, fs4VarA14);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(LayoutNode.e0);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC14, d82.v, ux2Var);
                    o67.n(yj5VarL14, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode14), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS14, d82.t, ux2Var);
                    fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                    if (z2) {
                        ux2Var.W(-1650437224);
                        fs4Var4 = fs4VarC;
                        h72Var2 = h72Var;
                        awVar2 = awVar;
                        i10 = i8;
                        cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                        ux2Var3 = ux2Var;
                        ux2Var3.p(false);
                    } else {
                        fs4Var4 = fs4VarC;
                        h72Var2 = h72Var;
                        awVar2 = awVar;
                        i10 = i8;
                        if (z) {
                            ux2Var.W(-1650359011);
                            cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        } else {
                            ux2Var.W(-1650300235);
                            cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                            ux2Var3 = ux2Var;
                            ux2Var3.p(false);
                        }
                    }
                    cq7 cq7Var14 = cq7VarL;
                    qf6 qf6Var14 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                    if (z2) {
                        hw2Var8 = hw2Var7;
                    } else {
                        hw2Var8 = hw2Var5;
                    }
                    objK2 = ux2Var3.K();
                    if (objK2 == awVar2) {
                        objK2 = new fk6((byte) 9);
                        ux2Var3.g0(objK2);
                    }
                    ux2 ux2Var17 = ux2Var3;
                    bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var14, cq7Var14, ux2Var17, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                    ux2Var2 = ux2Var17;
                    ux2Var2.p(true);
                    fs4Var2 = fs4Var1110;
                    hw2Var6 = hw2Var7;
                    z6 = z111;
                } else {
                    ux2Var2 = ux2Var;
                    ux2Var2.Q();
                    z6 = z4;
                    hw2Var5 = hw2Var3;
                    hw2Var6 = hw2Var4;
                }
                j56VarR = ux2Var2.r();
                if (j56VarR != null) {
                    final fs4 fs4Var1111 = fs4Var2;
                    final hw2 hw2Var111 = hw2Var5;
                    j56VarR.d = new hw2() { // from class: o.yo6
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ds1.w(str, str2, z, z2, function0, fs4Var1111, z6, str3, hw2Var111, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                            return f88.a;
                        }
                    };
                }
            }
            i3 |= 805306368;
            hw2Var4 = hw2Var2;
            i8 = i3;
            if ((i3 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (ux2Var.N(i8 & 1, z5)) {
                ux2Var.S();
                i9 = i & 1;
                cs4Var = cs4.b;
                if (i9 != 0) {
                    if (i13 != 0) {
                        fs4Var2 = cs4Var;
                    }
                    if ((i2 & 64) != 0) {
                        z4 = z;
                        i8 &= -3670017;
                    }
                    if (i4 != 0) {
                        hw2Var3 = null;
                    }
                    if (i6 != 0) {
                        hw2Var7 = null;
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                    } else {
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                        hw2Var7 = hw2Var4;
                    }
                } else {
                    if (i13 != 0) {
                        fs4Var2 = cs4Var;
                    }
                    if ((i2 & 64) != 0) {
                        z4 = z;
                        i8 &= -3670017;
                    }
                    if (i4 != 0) {
                        hw2Var3 = null;
                    }
                    if (i6 != 0) {
                        hw2Var7 = null;
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                    } else {
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                        hw2Var7 = hw2Var4;
                    }
                }
                ux2Var.q();
                objK = ux2Var.K();
                awVar = e01.a;
                if (objK == awVar) {
                    objK = ua5.s(ux2Var);
                }
                fs4 fs4VarC16 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                h72Var = un4.a;
                fs4 fs4Var1112 = fs4Var3;
                fs4 fs4VarA15 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC16, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                boolean z112 = z7;
                do4 do4VarC15 = ua0.c(xz2.f2564o, false);
                int iHashCode15 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL15 = ux2Var.l();
                fs4 fs4VarS15 = uf0.s(ux2Var, fs4VarA15);
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4VarC15, d82.v, ux2Var);
                o67.n(yj5VarL15, d82.u, ux2Var);
                o67.n(Integer.valueOf(iHashCode15), d82.w, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS15, d82.t, ux2Var);
                fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                if (z2) {
                    ux2Var.W(-1650437224);
                    fs4Var4 = fs4VarC;
                    h72Var2 = h72Var;
                    awVar2 = awVar;
                    i10 = i8;
                    cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                    ux2Var3 = ux2Var;
                    ux2Var3.p(false);
                } else {
                    fs4Var4 = fs4VarC;
                    h72Var2 = h72Var;
                    awVar2 = awVar;
                    i10 = i8;
                    if (z) {
                        ux2Var.W(-1650359011);
                        cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                        ux2Var3 = ux2Var;
                        ux2Var3.p(false);
                    } else {
                        ux2Var.W(-1650300235);
                        cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                        ux2Var3 = ux2Var;
                        ux2Var3.p(false);
                    }
                }
                cq7 cq7Var15 = cq7VarL;
                qf6 qf6Var15 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                if (z2) {
                    hw2Var8 = hw2Var7;
                } else {
                    hw2Var8 = hw2Var5;
                }
                objK2 = ux2Var3.K();
                if (objK2 == awVar2) {
                    objK2 = new fk6((byte) 9);
                    ux2Var3.g0(objK2);
                }
                ux2 ux2Var18 = ux2Var3;
                bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var15, cq7Var15, ux2Var18, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                ux2Var2 = ux2Var18;
                ux2Var2.p(true);
                fs4Var2 = fs4Var1112;
                hw2Var6 = hw2Var7;
                z6 = z112;
            } else {
                ux2Var2 = ux2Var;
                ux2Var2.Q();
                z6 = z4;
                hw2Var5 = hw2Var3;
                hw2Var6 = hw2Var4;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                final fs4 fs4Var1113 = fs4Var2;
                final hw2 hw2Var112 = hw2Var5;
                j56VarR.d = new hw2() { // from class: o.yo6
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ds1.w(str, str2, z, z2, function0, fs4Var1113, z6, str3, hw2Var112, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i3 |= 100663296;
        hw2Var3 = hw2Var;
        i6 = i2 & 512;
        if (i6 != 0) {
            if ((805306368 & i) == 0) {
                hw2Var4 = hw2Var2;
                if (ux2Var.h(hw2Var4)) {
                    i7 = 536870912;
                } else {
                    i7 = 268435456;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((i3 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (ux2Var.N(i8 & 1, z5)) {
                ux2Var.S();
                i9 = i & 1;
                cs4Var = cs4.b;
                if (i9 != 0) {
                    if (i13 != 0) {
                        fs4Var2 = cs4Var;
                    }
                    if ((i2 & 64) != 0) {
                        z4 = z;
                        i8 &= -3670017;
                    }
                    if (i4 != 0) {
                        hw2Var3 = null;
                    }
                    if (i6 != 0) {
                        hw2Var7 = null;
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                    } else {
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                        hw2Var7 = hw2Var4;
                    }
                } else {
                    if (i13 != 0) {
                        fs4Var2 = cs4Var;
                    }
                    if ((i2 & 64) != 0) {
                        z4 = z;
                        i8 &= -3670017;
                    }
                    if (i4 != 0) {
                        hw2Var3 = null;
                    }
                    if (i6 != 0) {
                        hw2Var7 = null;
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                    } else {
                        fs4Var3 = fs4Var2;
                        z7 = z4;
                        hw2Var5 = hw2Var3;
                        hw2Var7 = hw2Var4;
                    }
                }
                ux2Var.q();
                objK = ux2Var.K();
                awVar = e01.a;
                if (objK == awVar) {
                    objK = ua5.s(ux2Var);
                }
                fs4 fs4VarC17 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
                h72Var = un4.a;
                fs4 fs4Var1114 = fs4Var3;
                fs4 fs4VarA16 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC17, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
                boolean z113 = z7;
                do4 do4VarC16 = ua0.c(xz2.f2564o, false);
                int iHashCode16 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL16 = ux2Var.l();
                fs4 fs4VarS16 = uf0.s(ux2Var, fs4VarA16);
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4VarC16, d82.v, ux2Var);
                o67.n(yj5VarL16, d82.u, ux2Var);
                o67.n(Integer.valueOf(iHashCode16), d82.w, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS16, d82.t, ux2Var);
                fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                if (z2) {
                    ux2Var.W(-1650437224);
                    fs4Var4 = fs4VarC;
                    h72Var2 = h72Var;
                    awVar2 = awVar;
                    i10 = i8;
                    cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                    ux2Var3 = ux2Var;
                    ux2Var3.p(false);
                } else {
                    fs4Var4 = fs4VarC;
                    h72Var2 = h72Var;
                    awVar2 = awVar;
                    i10 = i8;
                    if (z) {
                        ux2Var.W(-1650359011);
                        cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                        ux2Var3 = ux2Var;
                        ux2Var3.p(false);
                    } else {
                        ux2Var.W(-1650300235);
                        cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                        ux2Var3 = ux2Var;
                        ux2Var3.p(false);
                    }
                }
                cq7 cq7Var16 = cq7VarL;
                qf6 qf6Var16 = ((rn4) ux2Var3.j(h72Var2)).c.b;
                if (z2) {
                    hw2Var8 = hw2Var7;
                } else {
                    hw2Var8 = hw2Var5;
                }
                objK2 = ux2Var3.K();
                if (objK2 == awVar2) {
                    objK2 = new fk6((byte) 9);
                    ux2Var3.g0(objK2);
                }
                ux2 ux2Var19 = ux2Var3;
                bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var16, cq7Var16, ux2Var19, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
                ux2Var2 = ux2Var19;
                ux2Var2.p(true);
                fs4Var2 = fs4Var1114;
                hw2Var6 = hw2Var7;
                z6 = z113;
            } else {
                ux2Var2 = ux2Var;
                ux2Var2.Q();
                z6 = z4;
                hw2Var5 = hw2Var3;
                hw2Var6 = hw2Var4;
            }
            j56VarR = ux2Var2.r();
            if (j56VarR != null) {
                final fs4 fs4Var1115 = fs4Var2;
                final hw2 hw2Var113 = hw2Var5;
                j56VarR.d = new hw2() { // from class: o.yo6
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ds1.w(str, str2, z, z2, function0, fs4Var1115, z6, str3, hw2Var113, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i3 |= 805306368;
        hw2Var4 = hw2Var2;
        i8 = i3;
        if ((i3 & 306783379) != 306783378) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (ux2Var.N(i8 & 1, z5)) {
            ux2Var.S();
            i9 = i & 1;
            cs4Var = cs4.b;
            if (i9 != 0) {
                if (i13 != 0) {
                    fs4Var2 = cs4Var;
                }
                if ((i2 & 64) != 0) {
                    z4 = z;
                    i8 &= -3670017;
                }
                if (i4 != 0) {
                    hw2Var3 = null;
                }
                if (i6 != 0) {
                    hw2Var7 = null;
                    fs4Var3 = fs4Var2;
                    z7 = z4;
                    hw2Var5 = hw2Var3;
                } else {
                    fs4Var3 = fs4Var2;
                    z7 = z4;
                    hw2Var5 = hw2Var3;
                    hw2Var7 = hw2Var4;
                }
            } else {
                if (i13 != 0) {
                    fs4Var2 = cs4Var;
                }
                if ((i2 & 64) != 0) {
                    z4 = z;
                    i8 &= -3670017;
                }
                if (i4 != 0) {
                    hw2Var3 = null;
                }
                if (i6 != 0) {
                    hw2Var7 = null;
                    fs4Var3 = fs4Var2;
                    z7 = z4;
                    hw2Var5 = hw2Var3;
                } else {
                    fs4Var3 = fs4Var2;
                    z7 = z4;
                    hw2Var5 = hw2Var3;
                    hw2Var7 = hw2Var4;
                }
            }
            ux2Var.q();
            objK = ux2Var.K();
            awVar = e01.a;
            if (objK == awVar) {
                objK = ua5.s(ux2Var);
            }
            fs4 fs4VarC18 = androidx.compose.foundation.layout.b.c(fs4Var3, 1.0f);
            h72Var = un4.a;
            fs4 fs4Var1116 = fs4Var3;
            fs4 fs4VarA17 = androidx.compose.foundation.b.a(androidx.compose.ui.platform.a.a(iq8.j(fs4VarC18, ((rn4) ux2Var.j(h72Var)).c.b), str3), (mw4) objK, (xg3) ux2Var.j(ug3.a), z7, null, function0, 24);
            boolean z114 = z7;
            do4 do4VarC17 = ua0.c(xz2.f2564o, false);
            int iHashCode17 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL17 = ux2Var.l();
            fs4 fs4VarS17 = uf0.s(ux2Var, fs4VarA17);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(do4VarC17, d82.v, ux2Var);
            o67.n(yj5VarL17, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode17), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS17, d82.t, ux2Var);
            fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            if (z2) {
                ux2Var.W(-1650437224);
                fs4Var4 = fs4VarC;
                h72Var2 = h72Var;
                awVar2 = awVar;
                i10 = i8;
                cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ((rn4) ux2Var.j(h72Var)).a.w, ux2Var, 2111823867, 4091);
                ux2Var3 = ux2Var;
                ux2Var3.p(false);
            } else {
                fs4Var4 = fs4VarC;
                h72Var2 = h72Var;
                awVar2 = awVar;
                i10 = i8;
                if (z) {
                    ux2Var.W(-1650359011);
                    cq7VarL = yl7.l(((rn4) ux2Var.j(h72Var2)).a.q, 0L, 0L, 0L, 0L, ((rn4) ux2Var.j(h72Var2)).a.A, ((rn4) ux2Var.j(h72Var2)).a.s, ((rn4) ux2Var.j(h72Var2)).a.s, 0L, ux2Var, 2111823867, 4095);
                    ux2Var3 = ux2Var;
                    ux2Var3.p(false);
                } else {
                    ux2Var.W(-1650300235);
                    cq7VarL = yl7.l(rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.q), 0L, 0L, 0L, 0L, rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.A), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), rv0.b(0.38f, ((rn4) ux2Var.j(h72Var2)).a.s), 0L, ux2Var, 2111823867, 4095);
                    ux2Var3 = ux2Var;
                    ux2Var3.p(false);
                }
            }
            cq7 cq7Var17 = cq7VarL;
            qf6 qf6Var17 = ((rn4) ux2Var3.j(h72Var2)).c.b;
            if (z2) {
                hw2Var8 = hw2Var7;
            } else {
                hw2Var8 = hw2Var5;
            }
            objK2 = ux2Var3.K();
            if (objK2 == awVar2) {
                objK2 = new fk6((byte) 9);
                ux2Var3.g0(objK2);
            }
            ux2 ux2Var110 = ux2Var3;
            bt1.e(str, (Function1) objK2, fs4Var4, false, true, null, au8.O(97799190, new qa(str2, (byte) 8), ux2Var3), null, null, ka0.j, hw2Var8, z2, null, null, null, true, 0, 0, qf6Var17, cq7Var17, ux2Var110, (i10 & 14) | 806907312, (i10 & 7168) | 12582912, 1953184);
            ux2Var2 = ux2Var110;
            ux2Var2.p(true);
            fs4Var2 = fs4Var1116;
            hw2Var6 = hw2Var7;
            z6 = z114;
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
            z6 = z4;
            hw2Var5 = hw2Var3;
            hw2Var6 = hw2Var4;
        }
        j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            final fs4 fs4Var1117 = fs4Var2;
            final hw2 hw2Var114 = hw2Var5;
            j56VarR.d = new hw2() { // from class: o.yo6
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ds1.w(str, str2, z, z2, function0, fs4Var1117, z6, str3, hw2Var114, hw2Var6, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final void x(fs4 fs4Var, xy6 xy6Var, Function1 function1, Function0 function0, rr6 rr6Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        xy6 xy6VarR;
        int i2;
        rr6Var.getClass();
        ux2Var.Y(2123545103);
        int i3 = i | 22 | (ux2Var.h(function1) ? 256 : 128) | (ux2Var.h(function0) ? 2048 : 1024) | (ux2Var.d(rr6Var.ordinal()) ? 16384 : 8192);
        if (ux2Var.N(i3 & 1, (i3 & 9363) != 9362)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                xy6VarR = yo1.R(null, ux2Var, 6, 2);
                i2 = i3 & (-113);
                fs4Var2 = cs4.b;
            } else {
                ux2Var.Q();
                xy6VarR = xy6Var;
                i2 = i3 & (-113);
                fs4Var2 = fs4Var;
            }
            ux2Var.q();
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new fk6((byte) 27);
                ux2Var.g0(objK);
            }
            yo1.k(function0, cp6.a(fs4Var2, false, (Function1) objK), xy6VarR, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-1668484115, new sd(rr6Var, function1, (byte) 13), ux2Var), ux2Var, (i2 >> 9) & 14, 3072, 8184);
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6VarR = xy6Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new o31(fs4Var2, xy6VarR, function1, function0, (Enum) rr6Var, i, (byte) 10);
        }
    }

    public static final void y(List list, rr6 rr6Var, fs4 fs4Var, Function1 function1, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        iz0 iz0Var = d82.t;
        iz0 iz0Var2 = d82.w;
        iz0 iz0Var3 = d82.u;
        iz0 iz0Var4 = d82.v;
        ux2Var2.Y(-1157431864);
        int i2 = i | (ux2Var2.f(list) ? 4 : 2) | (ux2Var2.d(rr6Var.ordinal()) ? 32 : 16) | 384 | (ux2Var2.h(function1) ? 2048 : 1024);
        if (ux2Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
            h72 h72Var = un4.a;
            long j = ((rn4) ux2Var2.j(h72Var)).a.a;
            long j2 = ((rn4) ux2Var2.j(h72Var)).a.a;
            long j3 = rv0.h;
            int i3 = i2;
            boolean z = false;
            k06 k06VarZ = xs1.z(j, j2, j3, j3, ux2Var2);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var2, cs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z2 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z2) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, iz0Var4, ux2Var2);
            o67.n(yj5VarL, iz0Var3, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), iz0Var2, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, iz0Var, ux2Var2);
            ux2Var2.W(1898715587);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qr6 qr6Var = (qr6) it.next();
                fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                boolean z3 = qr6Var.b == rr6Var ? true : z;
                pe6 pe6Var = new pe6(3);
                int i4 = i3;
                boolean zF = ((i4 & 7168) == 2048) | ux2Var2.f(qr6Var);
                Object objK = ux2Var2.K();
                if (zF || objK == e01.a) {
                    objK = new a26((Object) function1, (Object) qr6Var, (byte) 12);
                    ux2Var2.g0(objK);
                }
                fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.C(g68.A(fs4VarC, z3, pe6Var, (Function0) objK), 24.0f, 16.0f), qr6Var.d);
                dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarA);
                yz0.c.getClass();
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(dg6VarA, iz0Var4, ux2Var2);
                o67.n(yj5VarL2, iz0Var3, ux2Var2);
                o67.n(Integer.valueOf(iHashCode2), iz0Var2, ux2Var2);
                o67.l(ux2Var2);
                o67.n(fs4VarS2, iz0Var, ux2Var2);
                s14 s14Var = new s14(1.0f, true);
                String str = qr6Var.a;
                h72 h72Var2 = un4.a;
                iz0 iz0Var5 = iz0Var;
                iz0 iz0Var6 = iz0Var2;
                tg3 tg3Var2 = tg3Var;
                iz0 iz0Var7 = iz0Var4;
                cs4 cs4Var2 = cs4Var;
                qs7.b(str, s14Var, ((rn4) ux2Var2.j(h72Var2)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var2)).b.j, ux2Var, 0, 0, 131064);
                bt1.j(qr6Var.b == rr6Var, null, false, k06VarZ, ux2Var, 48, 44);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                iz0Var4 = iz0Var7;
                iz0Var = iz0Var5;
                iz0Var2 = iz0Var6;
                cs4Var = cs4Var2;
                tg3Var = tg3Var2;
                i3 = i4;
                z = false;
            }
            ux2Var2.p(z);
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) list, (Object) rr6Var, fs4Var2, (Object) function1, i, (byte) 15);
        }
    }

    public abstract Object E(s1 s1Var);

    public abstract String F();

    public void P(pg6 pg6Var, Object obj) {
        pg6Var.getClass();
        if (obj == null) {
            return;
        }
        ug6 ug6VarJ0 = pg6Var.J0(F());
        try {
            z(ug6VarJ0, obj);
            ug6VarJ0.F0();
            iq8.l(ug6VarJ0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq8.l(ug6VarJ0, th);
                throw th2;
            }
        }
    }

    public abstract int Z(int i);

    @Override // o.un6
    public int a(int i) {
        int iZ = Z(i);
        if (iZ == -1 || Z(iZ) == -1) {
            return -1;
        }
        return iZ;
    }

    @Override // o.un6
    public int b(int i) {
        int iC0 = c0(i);
        if (iC0 == -1 || c0(iC0) == -1) {
            return -1;
        }
        return iC0;
    }

    public abstract s1 b0(yh0 yh0Var);

    @Override // o.un6
    public int c(int i) {
        return c0(i);
    }

    public abstract int c0(int i);

    @Override // o.un6
    public int d(int i) {
        return Z(i);
    }

    public abstract void r0(s1 s1Var);

    public abstract void z(ug6 ug6Var, Object obj);
}
