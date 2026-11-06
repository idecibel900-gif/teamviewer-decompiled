package o;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class r47 {
    public static long a = 3000;
    public static long b = 30000;
    public static int c = 3;
    public static volatile boolean d = true;

    public r47() {
        new ConcurrentHashMap();
    }

    public static final js0 A(sy4 sy4Var) {
        ht2 ht2Var = p87.a;
        js0 js0Var = p87.k;
        return new js0(js0Var.a, sy4.e(sy4Var.c().concat(js0Var.f().c())));
    }

    public static final js0 B(String str) {
        ht2 ht2Var = p87.a;
        return new js0(p87.b, sy4.e(str));
    }

    public static wh8 C(Context context, Function0 function0, Function1 function1, Function1 function2, ux2 ux2Var, int i) {
        context.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        e8 e8Var = new e8((byte) 3);
        boolean zF = ((((i & 112) ^ 48) > 32 && ux2Var.f(function0)) || (i & 48) == 32) | ux2Var.f(function1) | ux2Var.h(context) | ux2Var.f(function2);
        Object objK = ux2Var.K();
        aw awVar = e01.a;
        if (zF || objK == awVar) {
            objK = new hm(function0, function1, context, function2);
            ux2Var.g0(objK);
        }
        qk4 qk4VarX0 = db8.x0(e8Var, (Function1) objK, ux2Var);
        Object objK2 = ux2Var.K();
        if (objK2 == awVar) {
            objK2 = new wh8(context, qk4VarX0);
            ux2Var.g0(objK2);
        }
        return (wh8) objK2;
    }

    public static final js0 D(js0 js0Var) {
        ht2 ht2Var = p87.a;
        return new js0(p87.a, sy4.e("U".concat(js0Var.f().c())));
    }

    public static final void a(int i, int i2, Integer num, fs4 fs4Var, ux2 ux2Var, int i3) {
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(373703757);
        int i4 = i3 | (ux2Var2.d(i) ? 4 : 2) | (ux2Var2.d(i2) ? 32 : 16) | (ux2Var2.f(num) ? 256 : 128);
        if (ux2Var2.N(i4 & 1, (i4 & 1171) != 1170)) {
            dg6 dg6VarA = cg6.a(iq8.a, xz2.x, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(dg6VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            s14 s14Var = new s14(1.0f, true);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, s14Var);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            String strZ = m77.z(i, ux2Var2);
            h72 h72Var = un4.a;
            qs7.b(strZ, null, ((tf2) ux2Var2.j(vf2.a)).l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.g, ux2Var, 0, 0, 131066);
            cs4 cs4Var = cs4.b;
            b77.a(ux2Var, androidx.compose.foundation.layout.b.d(cs4Var, 4.0f));
            qs7.b(m77.z(i2, ux2Var), null, ((rn4) ux2Var.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.k, ux2Var, 0, 0, 131066);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            if (num != null) {
                ux2Var2.W(444883505);
                qs1.l(lv1.T(num.intValue(), ux2Var2, (i4 >> 6) & 14), m77.z(i, ux2Var2), ka0.F(cs4Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), null, null, 0.0f, new t70(5, ((rn4) ux2Var2.j(h72Var)).a.s), ux2Var2, 392, 56);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(445177881);
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new x81(i, i2, num, fs4Var, i3, (byte) 1);
        }
    }

    public static final void b(rd7 rd7Var, fs4 fs4Var, ux2 ux2Var, int i) {
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-2925086);
        int i2 = i | (ux2Var2.f(rd7Var) ? 4 : 2);
        if (ux2Var2.N(i2 & 1, (i2 & 19) != 18)) {
            dg6 dg6VarA = cg6.a(iq8.a, xz2.x, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4Var);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            rd7Var.getClass();
            vo voVar = new vo();
            String strZ = m77.z(rd7Var.a, ux2Var2);
            int length = m77.z(rd7Var.b, ux2Var2).length();
            h72 h72Var = un4.a;
            int iF = voVar.f(new c77(((rn4) ux2Var2.j(h72Var)).a.q, 0L, ms2.r, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530));
            try {
                yk3 yk3VarB0 = ct1.b0(0, length);
                strZ.getClass();
                yk3VarB0.getClass();
                voVar.b(strZ.substring(yk3VarB0.m, yk3VarB0.n + 1));
                voVar.d(iF);
                yk3 yk3VarB1 = ct1.b0(length, strZ.length());
                yk3VarB1.getClass();
                voVar.b(strZ.substring(yk3VarB1.m, yk3VarB1.n + 1));
                qs7.c(voVar.g(), null, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, 0L, 0L, 0, false, 0, 0, null, null, ((rn4) ux2Var2.j(h72Var)).b.k, ux2Var, 0, 0, 262138);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
            } catch (Throwable th) {
                voVar.d(iF);
                throw th;
            }
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new l64((byte) 23, i, rd7Var, fs4Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(ge7 ge7Var, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        ge7 ge7Var2;
        byte b2;
        ux2 ux2Var2;
        px4 px4Var;
        int i3;
        boolean z;
        ux2 ux2Var3;
        Object obj;
        ux2 ux2Var4 = ux2Var;
        ux2Var4.Y(924568388);
        byte b3 = 2;
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? ux2Var4.f(ge7Var) : ux2Var4.h(ge7Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        byte b4 = 16;
        if ((i & 48) == 0) {
            i2 |= ux2Var4.f(fs4Var) ? 32 : 16;
        }
        if (ux2Var4.N(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            boolean z2 = (i2 & 14) == 4 || ((i2 & 8) != 0 && ux2Var4.h(ge7Var));
            Object objK = ux2Var4.K();
            aw awVar = e01.a;
            Object obj2 = objK;
            if (z2 || objK == awVar) {
                y26 y26Var = new y26(ge7Var, (byte) 22);
                ux2Var4.g0(y26Var);
                obj2 = y26Var;
            }
            px4 px4Var2 = (px4) zu1.L(objArr, (Function0) obj2, ux2Var4, 0);
            boolean z3 = ge7Var.h;
            boolean zG = ux2Var4.g(z3);
            Object objK2 = ux2Var4.K();
            Object obj3 = objK2;
            if (zG || objK2 == awVar) {
                Integer numValueOf = Integer.valueOf(z3 ? 300 : 0);
                ux2Var4.g0(numValueOf);
                obj3 = numValueOf;
            }
            int iIntValue = ((Number) obj3).intValue();
            boolean zG2 = ux2Var4.g(((Boolean) px4Var2.getValue()).booleanValue());
            Object objK3 = ux2Var4.K();
            Object obj4 = objK3;
            if (zG2 || objK3 == awVar) {
                yf5 yf5Var = new yf5(((Boolean) px4Var2.getValue()).booleanValue() ? R.drawable.expandable_list_up_icon : R.drawable.expandable_list_down_icon);
                ux2Var4.g0(yf5Var);
                obj4 = yf5Var;
            }
            yf5 yf5Var2 = (yf5) obj4;
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var4, 0);
            int iHashCode = Long.hashCode(ux2Var4.T);
            yj5 yj5VarL = ux2Var4.l();
            fs4 fs4VarS = uf0.s(ux2Var4, fs4Var);
            yz0.c.getClass();
            ux2Var4.a0();
            boolean z4 = ux2Var4.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z4) {
                ux2Var4.k(tg3Var);
            } else {
                ux2Var4.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(kw0VarA, iz0Var, ux2Var4);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var4);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf2, iz0Var3, ux2Var4);
            o67.l(ux2Var4);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var4);
            if (z3) {
                ux2Var4.W(1357472130);
                boolean zF = ux2Var4.f(px4Var2);
                Object objK4 = ux2Var4.K();
                if (zF || objK4 == awVar) {
                    obj = objK4;
                    j44 j44Var = new j44(px4Var2, b4);
                    ux2Var4.g0(j44Var);
                    obj = j44Var;
                }
                cs4 cs4Var = cs4.b;
                fs4 fs4VarB = androidx.compose.foundation.b.b(cs4Var, false, null, null, (Function0) obj, 15);
                dg6 dg6VarA = cg6.a(new ew(8.0f, new hk0(b3)), xz2.y, ux2Var4, 54);
                int iHashCode2 = Long.hashCode(ux2Var4.T);
                yj5 yj5VarL2 = ux2Var4.l();
                fs4 fs4VarS2 = uf0.s(ux2Var4, fs4VarB);
                ux2Var4.a0();
                if (ux2Var4.S) {
                    ux2Var4.k(tg3Var);
                } else {
                    ux2Var4.j0();
                }
                o67.n(dg6VarA, iz0Var, ux2Var4);
                o67.n(yj5VarL2, iz0Var2, ux2Var4);
                e41.r(iHashCode2, ux2Var4, iz0Var3, ux2Var4);
                o67.n(fs4VarS2, iz0Var4, ux2Var4);
                String strZ = m77.z(R.string.in_app_purchase_toggle_benefits_label, ux2Var4);
                h72 h72Var = un4.a;
                i3 = iIntValue;
                px4Var = px4Var2;
                qs7.b(strZ, null, ((rn4) ux2Var4.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var4.j(h72Var)).b.k, ux2Var, 0, 0, 131066);
                fs4 fs4VarL = androidx.compose.foundation.layout.b.l(cs4Var, 20.0f);
                ud5 ud5VarT = lv1.T(yf5Var2.z(), ux2Var, 0);
                String strZ2 = m77.z(R.string.in_app_purchase_toggle_benefits_label, ux2Var);
                long j = ((rn4) ux2Var.j(h72Var)).a.q;
                int i4 = rv0.i;
                qs1.l(ud5VarT, strZ2, fs4VarL, null, null, 0.0f, new t70(5, j), ux2Var, 392, 56);
                ux2 ux2Var5 = ux2Var;
                z = true;
                ux2Var5.p(true);
                b77.a(ux2Var5, androidx.compose.foundation.layout.b.d(cs4Var, 16.0f));
                ux2Var5.p(false);
                ux2Var3 = ux2Var5;
            } else {
                px4Var = px4Var2;
                i3 = iIntValue;
                z = true;
                ux2Var4.W(1358431208);
                ux2Var4.p(false);
                ux2Var3 = ux2Var4;
            }
            ge7Var2 = ge7Var;
            vn4.H(((Boolean) px4Var.getValue()).booleanValue(), null, wb2.d(db8.I0(i3, 6, null), 12), wb2.j(null, 13), null, au8.O(303201298, new vd7(ge7Var2, z ? (byte) 1 : (byte) 0), ux2Var3), ux2Var3, 1597446, 18);
            ux2Var3.p(z);
            b2 = z;
            ux2Var2 = ux2Var3;
        } else {
            ge7Var2 = ge7Var;
            b2 = 1;
            ux2Var4.Q();
            ux2Var2 = ux2Var4;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new xd7(ge7Var2, fs4Var, i, b2);
        }
    }

    public static final void d(ge7 ge7Var, Function0 function0, Function0 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        Function0 function2;
        aw awVar;
        cs4 cs4Var;
        boolean z;
        byte b2;
        ux2 ux2Var2 = ux2Var;
        ge7Var.getClass();
        function0.getClass();
        function1.getClass();
        ux2Var2.Y(-696458057);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ux2Var2.f(ge7Var) : ux2Var2.h(ge7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var2.h(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var2.f(fs4Var) ? 2048 : 1024;
        }
        if (ux2Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
            fs4 fs4VarZ = im3.Z(ka0.C(fs4Var, 24.0f, 16.0f), im3.W(ux2Var2), true);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarZ);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z2 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z2) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(kw0VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            int i3 = i2;
            qs7.b(m77.z(ge7Var.c, ux2Var2), null, ep1.r(ux2Var2).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ep1.s(ux2Var2).j, ux2Var, 0, 0, 131066);
            ux2Var2 = ux2Var;
            cs4 cs4Var2 = cs4.b;
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var2, 24.0f));
            fe7 fe7Var = ge7Var.k;
            aw awVar2 = e01.a;
            if (fe7Var != null) {
                ux2Var2.W(-1540034971);
                fs4 fs4VarS2 = au8.s(iq8.j(androidx.compose.foundation.layout.b.c(cs4Var2, 1.0f), sf6.a(12.0f)), ep1.r(ux2Var2).r, kh.V);
                boolean z3 = (i3 & 896) == 256;
                Object objK = ux2Var2.K();
                if (z3 || objK == awVar2) {
                    b2 = 2;
                    objK = new yd7(function1, b2);
                    ux2Var2.g0(objK);
                } else {
                    b2 = 2;
                }
                fs4 fs4VarB = ka0.B(androidx.compose.foundation.b.b(fs4VarS2, false, null, null, (Function0) objK, 15), 16.0f);
                dg6 dg6VarA = cg6.a(new ew(16.0f, new hk0(b2)), xz2.y, ux2Var2, 54);
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS3 = uf0.s(ux2Var2, fs4VarB);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(dg6VarA, iz0Var, ux2Var2);
                o67.n(yj5VarL2, iz0Var2, ux2Var2);
                e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS3, iz0Var4, ux2Var2);
                fs4 fs4VarL = androidx.compose.foundation.layout.b.l(cs4Var2, 24.0f);
                ud5 ud5VarT = lv1.T(R.drawable.ic_pencil_circle, ux2Var2, 0);
                String strZ = m77.z(R.string.in_app_purchase_your_plan_label, ux2Var2);
                long j = ep1.r(ux2Var2).q;
                int i4 = rv0.i;
                awVar = awVar2;
                qs1.l(ud5VarT, strZ, fs4VarL, null, null, 0.0f, new t70(5, j), ux2Var2, 392, 56);
                cs4Var = cs4Var2;
                qs7.b(m77.z(R.string.in_app_purchase_your_plan_label, ux2Var2), new s14(1.0f, true), ep1.r(ux2Var2).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ep1.s(ux2Var2).j, ux2Var, 0, 0, 131064);
                ux2Var2 = ux2Var;
                z = false;
                qs1.l(lv1.T(R.drawable.ic_caret_right, ux2Var2, 0), m77.z(R.string.in_app_purchase_your_plan_label, ux2Var2), androidx.compose.foundation.layout.b.l(cs4Var, 16.0f), null, null, 0.0f, new t70(5, ep1.r(ux2Var2).q), ux2Var2, 392, 56);
                ux2Var2.p(true);
                b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var, 24.0f));
                ux2Var2.p(false);
            } else {
                awVar = awVar2;
                cs4Var = cs4Var2;
                z = false;
                ux2Var2.W(-1538531967);
                ux2Var2.p(false);
            }
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            boolean z4 = (i3 & 112) == 32 ? true : z;
            Object objK2 = ux2Var2.K();
            if (z4 || objK2 == awVar) {
                function2 = function0;
                objK2 = new yv1(function2, (byte) 29);
                ux2Var2.g0(objK2);
            } else {
                function2 = function0;
            }
            int i5 = i3 & 14;
            e(ge7Var, (Function0) objK2, fillElement, ux2Var2, 384 | i5);
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var, 24.0f));
            f(ge7Var, null, ux2Var2, i5);
            ux2Var2.p(true);
        } else {
            function2 = function0;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new p5((Object) ge7Var, (Object) function2, (Object) function1, fs4Var, i, (byte) 14);
        }
    }

    public static final void e(ge7 ge7Var, Function0 function0, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        Function0 function1;
        iz0 iz0Var;
        iz0 iz0Var2;
        tg3 tg3Var;
        iz0 iz0Var3;
        cs4 cs4Var;
        iz0 iz0Var4;
        boolean z;
        int i3;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-2068396739);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ux2Var2.f(ge7Var) : ux2Var2.h(ge7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var2.f(fs4Var) ? 256 : 128;
        }
        int i4 = i2;
        if (ux2Var2.N(i4 & 1, (i4 & 147) != 146)) {
            fs4 fs4VarC = ka0.C(uf0.i(au8.s(fs4Var, ep1.r(ux2Var2).r, sf6.a(16.0f)), 1.0f, ep1.r(ux2Var2).B, sf6.a(16.0f)), 16.0f, 12.0f);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.B, ux2Var2, 48);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarC);
            yz0.c.getClass();
            ux2Var2.a0();
            boolean z2 = ux2Var2.S;
            tg3 tg3Var2 = LayoutNode.e0;
            if (z2) {
                ux2Var2.k(tg3Var2);
            } else {
                ux2Var2.j0();
            }
            iz0 iz0Var5 = d82.v;
            o67.n(kw0VarA, iz0Var5, ux2Var2);
            iz0 iz0Var6 = d82.u;
            o67.n(yj5VarL, iz0Var6, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var7 = d82.w;
            o67.n(numValueOf, iz0Var7, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var8 = d82.t;
            o67.n(fs4VarS, iz0Var8, ux2Var2);
            int i5 = ge7Var.a;
            int i6 = ge7Var.b;
            Integer num = ge7Var.e;
            cs4 cs4Var2 = cs4.b;
            a(i5, i6, num, ka0.D(cs4Var2, 0.0f, 12.0f, 1), ux2Var2, 3072);
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var2, 16.0f));
            String strA = ge7Var.a();
            if (strA == null || ub7.b0(strA)) {
                iz0Var = iz0Var6;
                iz0Var2 = iz0Var7;
                tg3Var = tg3Var2;
                iz0Var3 = iz0Var5;
                cs4Var = cs4Var2;
                iz0Var4 = iz0Var8;
                z = true;
                i3 = 48;
                ux2Var2.W(-206499793);
                ux2Var2.p(false);
            } else {
                ux2Var2.W(-207357005);
                fs4 fs4VarC2 = androidx.compose.foundation.layout.b.c(cs4Var2, 1.0f);
                dg6 dg6VarA = cg6.a(iq8.a, xz2.z, ux2Var2, 48);
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarC2);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var2);
                } else {
                    ux2Var2.j0();
                }
                o67.n(dg6VarA, iz0Var5, ux2Var2);
                o67.n(yj5VarL2, iz0Var6, ux2Var2);
                e41.r(iHashCode2, ux2Var2, iz0Var7, ux2Var2);
                o67.n(fs4VarS2, iz0Var8, ux2Var2);
                String strA2 = ge7Var.a();
                if (strA2 == null) {
                    strA2 = "";
                }
                i3 = 48;
                iz0Var = iz0Var6;
                iz0Var2 = iz0Var7;
                tg3Var = tg3Var2;
                iz0Var3 = iz0Var5;
                iz0Var4 = iz0Var8;
                z = true;
                qs7.b(strA2, null, ((tf2) ux2Var2.j(vf2.a)).l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ep1.s(ux2Var2).e, ux2Var, 0, 0, 131066);
                fs4 fs4VarF = ka0.F(cs4Var2, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                String strB = ge7Var.b();
                cs4Var = cs4Var2;
                qs7.b(m77.A(R.string.in_app_purchase_price_cycle_label, new Object[]{strB != null ? strB : ""}, ux2Var), fs4VarF, ep1.r(ux2Var).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ep1.s(ux2Var).j, ux2Var, 48, 0, 131064);
                ux2Var2 = ux2Var;
                ux2Var2.p(true);
                b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var, 32.0f));
                ux2Var2.p(false);
            }
            qs7.b(m77.z(ge7Var.d, ux2Var2), androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), ep1.r(ux2Var2).q, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ep1.s(ux2Var2).k, ux2Var, 48, 0, 131064);
            ux2Var2 = ux2Var;
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var, 16.0f));
            lv1.k(null, 0.0f, ep1.r(ux2Var2).B, ux2Var2, 0, 3);
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var, 16.0f));
            int i7 = r18 & 14;
            c(ge7Var, androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f)), ux2Var2, i3 | i7);
            b77.a(ux2Var2, androidx.compose.foundation.layout.b.d(cs4Var, 32.0f));
            if (ge7Var.g != null) {
                ux2Var2.W(-205764814);
                fs4 fs4VarC3 = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
                do4 do4VarC = ua0.c(xz2.t, false);
                int iHashCode3 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL3 = ux2Var2.l();
                fs4 fs4VarS3 = uf0.s(ux2Var2, fs4VarC3);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC, iz0Var3, ux2Var2);
                o67.n(yj5VarL3, iz0Var, ux2Var2);
                e41.r(iHashCode3, ux2Var2, iz0Var2, ux2Var2);
                o67.n(fs4VarS3, iz0Var4, ux2Var2);
                boolean z3 = ((i7 == 4 || ((i4 & 8) != 0 && ux2Var2.h(ge7Var))) ? z : false) | ((r18 & 112) == 32 ? z : false);
                Object objK = ux2Var2.K();
                if (z3 || objK == e01.a) {
                    function1 = function0;
                    objK = new a26((Object) function1, (Object) ge7Var, (byte) 17);
                    ux2Var2.g0(objK);
                } else {
                    function1 = function0;
                }
                m77.g((Function0) objK, androidx.compose.foundation.layout.b.d(cs4Var, 40.0f), null, false, null, null, au8.O(-182783686, new vd7(ge7Var, (byte) 0), ux2Var2), ux2Var, 1572912, 60);
                ux2Var2 = ux2Var;
                ux2Var2.p(z);
                ux2Var2.p(false);
            } else {
                function1 = function0;
                ux2Var2.W(-205029649);
                ux2Var2.p(false);
            }
            ux2Var2.p(z);
        } else {
            function1 = function0;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new ci(ge7Var, function1, fs4Var, i);
        }
    }

    public static final void f(ge7 ge7Var, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-1535874028);
        final byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ux2Var.f(ge7Var) : ux2Var.h(ge7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        final byte b3 = 1;
        final byte b4 = 0;
        if (ux2Var.N(i3 & 1, (i3 & 19) != 18)) {
            final Activity activity = (Activity) ux2Var.j(tc4.a);
            if (activity == null) {
                j56 j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new y71(ge7Var, i);
                    return;
                }
                return;
            }
            final String strZ = m77.z(R.string.legal_agreement_privacy_policy_url, ux2Var);
            final String strZ2 = m77.z(R.string.legal_agreement_EULA_url, ux2Var);
            boolean zC = ge7Var.c();
            Object obj = e01.a;
            if (zC) {
                ux2Var.W(-936172948);
                boolean zH = ux2Var.h(activity) | ux2Var.f(strZ);
                Object objK = ux2Var.K();
                if (zH || objK == obj) {
                    objK = new Function0() { // from class: o.wd7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b5 = b4;
                            f88 f88Var = f88.a;
                            String str = strZ;
                            Activity activity2 = activity;
                            switch (b5) {
                                case 0:
                                    r47.z(activity2, str);
                                    break;
                                case 1:
                                    r47.z(activity2, str);
                                    break;
                                case 2:
                                    r47.z(activity2, str);
                                    break;
                                default:
                                    r47.z(activity2, str);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var.g0(objK);
                }
                Function0 function0 = (Function0) objK;
                boolean zH2 = ux2Var.h(activity) | ux2Var.f(strZ2);
                Object objK2 = ux2Var.K();
                if (zH2 || objK2 == obj) {
                    objK2 = new Function0() { // from class: o.wd7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b5 = b3;
                            f88 f88Var = f88.a;
                            String str = strZ2;
                            Activity activity2 = activity;
                            switch (b5) {
                                case 0:
                                    r47.z(activity2, str);
                                    break;
                                case 1:
                                    r47.z(activity2, str);
                                    break;
                                case 2:
                                    r47.z(activity2, str);
                                    break;
                                default:
                                    r47.z(activity2, str);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var.g0(objK2);
                }
                g(R.string.in_app_purchase_terms_description_non_recurring, function0, (Function0) objK2, ux2Var, (i3 << 6) & 7168);
                ux2Var.p(false);
            } else {
                ux2Var.W(-935797414);
                boolean zH3 = ux2Var.h(activity) | ux2Var.f(strZ);
                Object objK3 = ux2Var.K();
                if (zH3 || objK3 == obj) {
                    objK3 = new Function0() { // from class: o.wd7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b5 = b2;
                            f88 f88Var = f88.a;
                            String str = strZ;
                            Activity activity2 = activity;
                            switch (b5) {
                                case 0:
                                    r47.z(activity2, str);
                                    break;
                                case 1:
                                    r47.z(activity2, str);
                                    break;
                                case 2:
                                    r47.z(activity2, str);
                                    break;
                                default:
                                    r47.z(activity2, str);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var.g0(objK3);
                }
                Function0 function1 = (Function0) objK3;
                boolean zH4 = ux2Var.h(activity) | ux2Var.f(strZ2);
                Object objK4 = ux2Var.K();
                if (zH4 || objK4 == obj) {
                    final byte b5 = 3;
                    objK4 = new Function0() { // from class: o.wd7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b6 = b5;
                            f88 f88Var = f88.a;
                            String str = strZ2;
                            Activity activity2 = activity;
                            switch (b6) {
                                case 0:
                                    r47.z(activity2, str);
                                    break;
                                case 1:
                                    r47.z(activity2, str);
                                    break;
                                case 2:
                                    r47.z(activity2, str);
                                    break;
                                default:
                                    r47.z(activity2, str);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var.g0(objK4);
                }
                g(R.string.in_app_purchase_terms_description, function1, (Function0) objK4, ux2Var, (i3 << 6) & 7168);
                ux2Var.p(false);
            }
            fs4Var = cs4.b;
        } else {
            ux2Var.Q();
        }
        j56 j56VarR2 = ux2Var.r();
        if (j56VarR2 != null) {
            j56VarR2.d = new xd7(ge7Var, fs4Var, i, b4);
        }
    }

    public static final void g(int i, Function0 function0, Function0 function1, ux2 ux2Var, int i2) {
        int i3;
        ux2Var.Y(1313655337);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.h(function1) ? 256 : 128;
        }
        int i4 = i2 & 3072;
        cs4 cs4Var = cs4.b;
        if (i4 == 0) {
            i3 |= ux2Var.f(cs4Var) ? 2048 : 1024;
        }
        int i5 = i3;
        byte b2 = 1;
        byte b3 = 0;
        if (ux2Var.N(i5 & 1, (i5 & 1171) != 1170)) {
            String strZ = m77.z(R.string.in_app_purchase_privacy_policy_label, ux2Var);
            String strZ2 = m77.z(R.string.in_app_purchase_terms_of_use_label, ux2Var);
            String strA = m77.A(R.string.in_app_purchase_terms_and_condition_label, new Object[]{strZ, strZ2}, ux2Var);
            boolean z = (i5 & 112) == 32;
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (z || objK == obj) {
                objK = new yd7(function0, b3);
                ux2Var.g0(objK);
            }
            vd5 vd5Var = new vd5(strZ, new i77((Function0) objK));
            b3 = (i5 & 896) == 256 ? (byte) 1 : (byte) 0;
            Object objK2 = ux2Var.K();
            if (b3 != 0 || objK2 == obj) {
                objK2 = new yd7(function1, b2);
                ux2Var.g0(objK2);
            }
            xo xoVarS = g77.s(strA, xm4.R(vd5Var, new vd5(strZ2, new i77((Function0) objK2))), null, 0L, ux2Var, 28);
            vo voVar = new vo();
            voVar.b(m77.z(i, ux2Var));
            voVar.b(" ");
            voVar.c(xoVarS);
            qs7.c(voVar.g(), cs4Var, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, null, ((rn4) ux2Var.j(un4.a)).b.k, ux2Var, (i5 >> 6) & 112, 0, 262140);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new x81(i, function0, function1, i2);
        }
    }

    public static final void h(vk7 vk7Var, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(-535795212);
        int i3 = i & 6;
        byte b2 = 2;
        int i4 = R.raw.lottie_animation_onboarding_tv;
        if (i3 == 0) {
            i2 = (ux2Var.d(R.raw.lottie_animation_onboarding_tv) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? ux2Var.f(vk7Var) : ux2Var.h(vk7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            xh4 xh4VarH = vt1.H(new yh4(i4), ux2Var);
            kh4 kh4VarG = g68.g((qh4) xh4VarH.getValue(), vk7Var.a, ux2Var, 914);
            qh4 qh4Var = (qh4) xh4VarH.getValue();
            boolean zF = ux2Var.f(kh4VarG);
            Object objK = ux2Var.K();
            if (zF || objK == e01.a) {
                objK = new k31(kh4VarG, b2);
                ux2Var.g0(objK);
            }
            ct1.f(qh4Var, (Function0) objK, fs4Var, ux2Var, i2 & 896);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pa((byte) 14, i, (Object) vk7Var, (Object) fs4Var);
        }
    }

    public static final js0 i(String str) {
        ht2 ht2Var = p87.a;
        return new js0(p87.a, sy4.e(str));
    }

    public static final js0 k(String str) {
        ht2 ht2Var = p87.a;
        return new js0(p87.c, sy4.e(str));
    }

    public static final ArrayList l(ArrayList arrayList, List list, xw2 xw2Var) {
        oz3 oz3VarF;
        list.getClass();
        arrayList.size();
        list.size();
        ArrayList<vd5> arrayListV0 = lv0.V0(arrayList, list);
        ArrayList arrayList2 = new ArrayList(mv0.Z(arrayListV0, 10));
        for (vd5 vd5Var : arrayListV0) {
            oz3 oz3Var = (oz3) vd5Var.m;
            qb8 qb8Var = (qb8) vd5Var.n;
            int i = qb8Var.r;
            up annotations = qb8Var.getAnnotations();
            sy4 name = qb8Var.getName();
            name.getClass();
            boolean zE0 = qb8Var.E0();
            boolean z = qb8Var.t;
            boolean z2 = qb8Var.u;
            if (qb8Var.v != null) {
                int i2 = bp1.a;
                ps4 ps4VarD = zo1.d(xw2Var);
                ps4VarD.getClass();
                oz3VarF = ps4VarD.h().f(oz3Var);
            } else {
                oz3VarF = null;
            }
            oz3 oz3Var2 = oz3VarF;
            s67 s67VarC = qb8Var.c();
            s67VarC.getClass();
            arrayList2.add(new qb8(xw2Var, null, i, annotations, name, oz3Var, zE0, z, z2, oz3Var2, s67VarC));
        }
        return arrayList2;
    }

    public static final boolean q(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return im3.n(ub7.x0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    public static final Object r(lo5 lo5Var, String str, jc1 jc1Var) {
        Object objD = lo5Var.d(str, new yr7((byte) 12), jc1Var);
        return objD == ne1.m ? objD : f88.a;
    }

    public static View s(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static final String t(Collection collection) {
        return !collection.isEmpty() ? vb7.B(lv0.t0(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final u24 u(ns4 ns4Var) {
        ns4 ns4Var2;
        ns4Var.getClass();
        int i = bp1.a;
        Iterator it = ns4Var.W().o0().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                ns4Var2 = null;
                break;
            }
            oz3 oz3Var = (oz3) it.next();
            if (!wy3.x(oz3Var)) {
                ys0 ys0VarA = oz3Var.o0().a();
                if (zo1.n(ys0VarA, ms0.m) || zo1.n(ys0VarA, ms0.f1501o)) {
                    ys0VarA.getClass();
                    ns4Var2 = (ns4) ys0VarA;
                    break;
                }
            }
        }
        if (ns4Var2 == null) {
            return null;
        }
        zo4 zo4VarP0 = ns4Var2.p0();
        u24 u24Var = zo4VarP0 instanceof u24 ? (u24) zo4VarP0 : null;
        return u24Var == null ? u(ns4Var2) : u24Var;
    }

    public static final xo v(zr7 zr7Var) {
        xo xoVar = zr7Var.a;
        long j = zr7Var.b;
        xoVar.getClass();
        return xoVar.subSequence(gt7.f(j), gt7.e(j));
    }

    public static final xo w(zr7 zr7Var, int i) {
        xo xoVar = zr7Var.a;
        xo xoVar2 = zr7Var.a;
        long j = zr7Var.b;
        int iE = gt7.e(j);
        int iE2 = gt7.e(j);
        int length = iE2 + i;
        if (((i ^ length) & (iE2 ^ length)) < 0) {
            length = xoVar2.n.length();
        }
        return xoVar.subSequence(iE, Math.min(length, xoVar2.n.length()));
    }

    public static final xo x(zr7 zr7Var, int i) {
        xo xoVar = zr7Var.a;
        long j = zr7Var.b;
        int iF = gt7.f(j);
        int i2 = iF - i;
        if (((iF ^ i2) & (i ^ iF)) < 0) {
            i2 = 0;
        }
        return xoVar.subSequence(Math.max(0, i2), gt7.f(j));
    }

    public static final LinkedHashMap y(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iQ = xm4.Q(mv0.Z(setEntrySet, 10));
        if (iQ < 16) {
            iQ = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iQ);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap2;
    }

    public static final void z(Activity activity, String str) {
        str.getClass();
        Uri uri = Uri.parse(str);
        uri.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public void j() {
    }

    public abstract Typeface m(Context context, es2 es2Var, Resources resources, int i);

    public abstract Typeface n(Context context, ps2[] ps2VarArr, int i);

    public Typeface o(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface p(Context context, Resources resources, int i, String str);
}
