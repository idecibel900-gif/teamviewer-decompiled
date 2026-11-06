package o;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.KeyEvent;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g77 {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;

    public static final void a(hi7 hi7Var, fs4 fs4Var, ux2 ux2Var, int i) {
        ux2 ux2Var2;
        hi7Var.getClass();
        ux2Var.Y(14913602);
        int i2 = (ux2Var.d(hi7Var.ordinal()) ? 4 : 2) | i | 48;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            ud5 ud5VarA = re3.a((f62) b62.b.getValue(), ux2Var);
            float f = hi7Var.f977o;
            cs4 cs4Var = cs4.b;
            ux2Var2 = ux2Var;
            qs1.l(ud5VarA, null, iq8.j(androidx.compose.foundation.layout.b.l(cs4Var, f), sf6.a), null, rb1.a, 0.0f, null, ux2Var2, 24632, 104);
            fs4Var = cs4Var;
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new l64((byte) 26, i, hi7Var, fs4Var);
        }
    }

    public static final void b(final float f, final long j, final long j2, fs4 fs4Var, ux2 ux2Var, final int i) {
        final fs4 fs4Var2;
        ux2Var.Y(-1233550646);
        int i2 = i | (ux2Var.c(f) ? 4 : 2) | (ux2Var.e(j) ? 32 : 16) | (ux2Var.e(j2) ? 256 : 128) | 3072;
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            List listL = qf0.L(new rv0(j), new rv0(j2));
            rh3 rh3VarK = nv1.k(nv1.G("Shimmer Effect Transition", ux2Var, 0), 0.0f, 1000.0f, db8.J(db8.I0(1000, 2, q72.c), 6), "Shimmer Effect Animation", ux2Var, 29112, 0);
            t94 t94Var = new t94(listL, null, (((long) Float.floatToRawIntBits(200.0f)) << 32) | (((long) Float.floatToRawIntBits(200.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(((Number) rh3VarK.f1923o.getValue()).floatValue())) << 32) | (((long) Float.floatToRawIntBits(((Number) rh3VarK.f1923o.getValue()).floatValue())) & 4294967295L), 0);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.x, ux2Var, 48);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarS = uf0.s(ux2Var, cs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            b77.a(ux2Var, au8.r(iq8.j(androidx.compose.foundation.layout.b.l(cs4Var, f), sf6.a), t94Var, null, 6));
            ux2Var.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(f, j, j2, fs4Var2, i) { // from class: o.bm7
                public final /* synthetic */ float m;
                public final /* synthetic */ long n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ long f440o;
                public final /* synthetic */ fs4 p;

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(1);
                    g77.b(this.m, this.n, this.f440o, this.p, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final long c(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void d(final a06 a06Var, Function0 function0, final fs4 fs4Var, ux2 ux2Var, final int i) {
        final Function0 function1 = function0;
        a06Var.getClass();
        function1.getClass();
        ux2Var.Y(-685707777);
        int i2 = (ux2Var.f(a06Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            hk6 hk6VarW = im3.W(ux2Var);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = ck3.w(ux2Var);
                ux2Var.g0(objK);
            }
            me1 me1Var = (me1) objK;
            fs4 fs4VarF = fs4Var.f(androidx.compose.foundation.layout.b.c);
            do4 do4VarC = ua0.c(xz2.p, false);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarF);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(do4VarC, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var);
            cw cwVar = iq8.g;
            w50 w50Var = xz2.B;
            fs4 fs4VarD = ka0.D(o77.t(androidx.compose.foundation.layout.b.b, hk6VarW, me1Var), 24.0f, 0.0f, 2);
            boolean zA = a06Var.a();
            cs4 cs4Var = cs4.b;
            fs4 fs4VarF2 = fs4VarD.f(zA ? androidx.compose.foundation.layout.b.q(cs4Var, 768.0f, 1) : cs4Var);
            kw0 kw0VarA = iw0.a(cwVar, w50Var, ux2Var, 54);
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarF2);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            o67.n(kw0VarA, iz0Var, ux2Var);
            o67.n(yj5VarL2, iz0Var2, ux2Var);
            e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
            o67.n(fs4VarS2, iz0Var4, ux2Var);
            m77.l(null, ux2Var, 0);
            if (a06Var.d) {
                ux2Var.W(388547807);
            } else {
                ux2Var.W(-1234393274);
                m77.m(a06Var.a(), null, ux2Var, 0);
            }
            ux2Var.p(false);
            e(null, ux2Var, 0);
            b77.a(ux2Var, new s14(1.0f, true));
            function1 = function0;
            m77.g(function1, ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 0.0f, 0.0f, 24.0f, 7), null, false, "TVTA-waitingRoom-closeSession-TVButton", null, kh.q, ux2Var, ((i2 >> 3) & 14) | 1597488, 44);
            ux2Var.p(true);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.wg8
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    g77.d(a06Var, function1, fs4Var, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final void e(fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1195888716);
        int i2 = i | 6;
        byte b2 = 2;
        if (ux2Var2.N(i2 & 1, (i2 & 3) != 2)) {
            ew ewVar = new ew(8.0f, new hk0(b2));
            w50 w50Var = xz2.B;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarD = ka0.D(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 24.0f, 0.0f, 2);
            kw0 kw0VarA = iw0.a(ewVar, w50Var, ux2Var2, 54);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarD);
            yz0.c.getClass();
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(LayoutNode.e0);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            String strZ = m77.z(R.string.waiting_for_remote_screen_title, ux2Var2);
            h72 h72Var = un4.a;
            qs7.b(strZ, androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(h72Var)).b.h, ux2Var, 48, 0, 130040);
            qs7.b(m77.z(R.string.waiting_for_remote_screen_description, ux2Var), androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), ((rn4) ux2Var.j(h72Var)).a.s, 0L, null, 0L, new qo7(3), 0L, 0, false, 0, 0, null, ((rn4) ux2Var.j(h72Var)).b.l, ux2Var, 48, 0, 130040);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new bb(fs4Var2, i, (byte) 11);
        }
    }

    public static final Object f(Object obj, boolean z) {
        ts3 ts3Var;
        obj.getClass();
        if (z) {
            obj = (pt3) obj;
            if ((obj instanceof ot3) && (ts3Var = ((ot3) obj).i) != null) {
                String strD = fs3.b(ts3Var.p).d();
                strD.getClass();
                return new nt3(strD);
            }
        }
        return obj;
    }

    public static void g(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws qm3 {
        if (!k(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !k(b4) && !k(b5)) {
                int i2 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw qm3.a();
    }

    public static void h(byte b2, byte b3, byte b4, char[] cArr, int i) throws qm3 {
        if (k(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || k(b4)))) {
            throw qm3.a();
        }
        cArr[i] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    public static void i(byte b2, byte b3, char[] cArr, int i) throws qm3 {
        if (b2 < -62 || k(b3)) {
            throw qm3.a();
        }
        cArr[i] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static final boolean j(int i, KeyEvent keyEvent) {
        return ((int) (yo1.B(keyEvent) >> 32)) == i;
    }

    public static boolean k(byte b2) {
        return b2 > -65;
    }

    public static String l(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            hk0.g("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final float m(long j, float f, in1 in1Var) {
        if (qt7.a(j, qt7.c)) {
            return f;
        }
        long jB = qt7.b(j);
        if (rt7.a(jB, 4294967296L)) {
            return in1Var.A0(j);
        }
        if (rt7.a(jB, 8589934592L)) {
            return qt7.c(j) * f;
        }
        return Float.NaN;
    }

    public static final float n(long j, float f, in1 in1Var) {
        float fC;
        long jB = qt7.b(j);
        if (rt7.a(jB, 4294967296L)) {
            if (in1Var.Z() <= 1.05d) {
                return in1Var.A0(j);
            }
            fC = qt7.c(j) / qt7.c(in1Var.I(f));
        } else {
            if (!rt7.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = qt7.c(j);
        }
        return fC * f;
    }

    public static final void o(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(j51.U(j)), i, i2, 33);
        }
    }

    public static final void p(Spannable spannable, long j, in1 in1Var, int i, int i2) {
        long jB = qt7.b(j);
        if (rt7.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(vn4.s0(in1Var.A0(j)), false), i, i2, 33);
        } else if (rt7.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(qt7.c(j)), i, i2, 33);
        }
    }

    public static final void q(Spannable spannable, kd4 kd4Var, int i, int i2) {
        if (kd4Var != null) {
            ArrayList arrayList = new ArrayList(mv0.Z(kd4Var, 10));
            Iterator it = kd4Var.m.iterator();
            while (it.hasNext()) {
                arrayList.add(((jd4) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final Object r(qv7 qv7Var, hw2 hw2Var) {
        ds1.Q(qv7Var, true, new v22(im3.E(qv7Var.p.getContext()).Y(qv7Var.q, qv7Var, qv7Var.f577o)));
        return h67.p(qv7Var, false, qv7Var, hw2Var);
    }

    public static final xo s(String str, Map map, c77 c77Var, long j, ux2 ux2Var, int i) {
        c77 c77Var2;
        str.getClass();
        c77 c77Var3 = (i & 4) != 0 ? new c77(((rn4) ux2Var.j(un4.a)).a.a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534) : c77Var;
        long j2 = (i & 8) != 0 ? ((tf2) ux2Var.j(vf2.a)).p : j;
        boolean z = (i & 16) == 0;
        ux2Var.W(882949273);
        vo voVar = new vo();
        ux2Var.W(882950129);
        String strSubstring = str;
        for (Map.Entry entry : map.entrySet()) {
            ux2Var.W(945954946);
            String str2 = (String) entry.getKey();
            l77 l77Var = (l77) entry.getValue();
            int iZ = ub7.Z(strSubstring, str2, 0, z, 2);
            if (iZ >= 0) {
                String str3 = strSubstring;
                boolean z2 = z;
                c77 c77Var4 = c77Var3;
                int iF = voVar.f(new c77(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    voVar.b(str3.substring(0, iZ));
                    voVar.d(iF);
                    String strSubstring2 = str3.substring(iZ, str2.length() + iZ);
                    if (l77Var != null) {
                        if (l77Var instanceof i77) {
                            ux2Var.W(946420597);
                            c77Var2 = c77Var4;
                            bt7 bt7Var = new bt7(c77Var2, null, null, null);
                            boolean zH = ux2Var.h(l77Var);
                            Object objK = ux2Var.K();
                            if (zH || objK == e01.a) {
                                objK = new di7(l77Var);
                                ux2Var.g0(objK);
                            }
                            int iE = voVar.e(new ea4("", bt7Var, (di7) objK));
                            try {
                                voVar.b(strSubstring2);
                                voVar.d(iE);
                                ux2Var.p(false);
                            } catch (Throwable th) {
                                voVar.d(iE);
                                throw th;
                            }
                        } else {
                            c77Var2 = c77Var4;
                            if (l77Var instanceof k77) {
                                ux2Var.W(946880916);
                                ux2Var.p(false);
                                int iE2 = voVar.e(new fa4(((k77) l77Var).a, new bt7(c77Var2, null, null, null), null));
                                try {
                                    voVar.b(strSubstring2);
                                    voVar.d(iE2);
                                } catch (Throwable th2) {
                                    voVar.d(iE2);
                                    throw th2;
                                }
                            } else if (l77Var instanceof j77) {
                                ux2Var.W(947249723);
                                ux2Var.p(false);
                                int iF2 = voVar.f(c77Var2);
                                try {
                                    uo uoVar = new uo(voVar.m.length(), 0, 4, new db7(strSubstring2), strSubstring2);
                                    ArrayList arrayList = voVar.n;
                                    arrayList.add(uoVar);
                                    voVar.f2333o.add(uoVar);
                                    arrayList.size();
                                    voVar.b(strSubstring2);
                                    voVar.d(iF2);
                                } catch (Throwable th3) {
                                    voVar.d(iF2);
                                    throw th3;
                                }
                            }
                        }
                        strSubstring = str3.substring(str2.length() + iZ);
                        ux2Var.p(false);
                        z = z2;
                        c77Var3 = c77Var2;
                    }
                    throw fx3.m(446170088, ux2Var, false);
                } catch (Throwable th4) {
                    voVar.d(iF);
                    throw th4;
                }
            }
            ux2Var.p(false);
        }
        String str4 = strSubstring;
        ux2Var.p(false);
        int iF3 = voVar.f(new c77(j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
        try {
            voVar.b(str4);
            voVar.d(iF3);
            xo xoVarG = voVar.g();
            ux2Var.p(false);
            return xoVarG;
        } catch (Throwable th5) {
            voVar.d(iF3);
            throw th5;
        }
    }

    public static final void t(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object u(long j, hw2 hw2Var, jc1 jc1Var) {
        rv7 rv7Var;
        k76 k76Var;
        if (jc1Var instanceof rv7) {
            rv7Var = (rv7) jc1Var;
            int i = rv7Var.f1959o;
            if ((i & Integer.MIN_VALUE) != 0) {
                rv7Var.f1959o = i - Integer.MIN_VALUE;
            } else {
                rv7Var = new rv7(jc1Var);
            }
        } else {
            rv7Var = new rv7(jc1Var);
        }
        Object obj = rv7Var.n;
        int i2 = rv7Var.f1959o;
        if (i2 == 0) {
            ct1.a0(obj);
            if (j > 0) {
                k76 k76Var2 = new k76();
                try {
                    rv7Var.m = k76Var2;
                    rv7Var.f1959o = 1;
                    qv7 qv7Var = new qv7(j, rv7Var);
                    k76Var2.m = qv7Var;
                    Object objR = r(qv7Var, hw2Var);
                    ne1 ne1Var = ne1.m;
                    return objR == ne1Var ? ne1Var : objR;
                } catch (pv7 e2) {
                    e = e2;
                    k76Var = k76Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k76Var = rv7Var.m;
        try {
            ct1.a0(obj);
            return obj;
        } catch (pv7 e3) {
            e = e3;
        }
        if (e.m != k76Var.m) {
            throw e;
        }
        return null;
    }

    public static int v(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }
}
