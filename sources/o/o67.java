package o;

import android.content.res.Resources;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IllegalFormatException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class o67 {
    public static final void a(boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        function1.getClass();
        ux2Var.Y(-1641046763);
        int i2 = i | (ux2Var.g(z) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | 384;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 3;
            cs4 cs4Var = cs4.b;
            l47.d(new sk7(y57.g(R.string.settings_soundAndMusic), y57.g(R.string.settings_soundAndMusic_subtitle), new yk7(R.drawable.sound), null, 24), z, function1, cs4Var, "TVTA-settings-soundAndMusic", m77.z(R.string.settings_soundAndMusic, ux2Var), ux2Var, (i3 & 896) | (i3 & 112) | 24576 | 3072, 32);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new lc(z, function1, fs4Var2, i, (byte) 4);
        }
    }

    public static final void b(int i, Function0 function0, Function0 function1, ux2 ux2Var, fs4 fs4Var) {
        fs4 fs4Var2;
        function0.getClass();
        function1.getClass();
        ux2Var.Y(88276095);
        int i2 = 16;
        int i3 = i | (ux2Var.h(function0) ? 4 : 2) | (ux2Var.h(function1) ? 32 : 16) | 384;
        if (ux2Var.N(i3 & 1, (i3 & 147) != 146)) {
            cw cwVar = iq8.e;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarZ = im3.Z(ka0.C(cs4Var, 40.0f, 16.0f), im3.W(ux2Var), true);
            kw0 kw0VarA = iw0.a(cwVar, xz2.A, ux2Var, 6);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarZ);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            n(kw0VarA, d82.v, ux2Var);
            n(yj5VarL, d82.u, ux2Var);
            n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            l(ux2Var);
            n(fs4VarS, d82.t, ux2Var);
            List listL = qf0.L(Integer.valueOf(R.string.settings_twoFactorAuthentication_classic_instruction_1), Integer.valueOf(R.string.settings_twoFactorAuthentication_classic_instruction_2), Integer.valueOf(R.string.settings_twoFactorAuthentication_classic_instruction_3), Integer.valueOf(R.string.settings_twoFactorAuthentication_common_instruction_4));
            int i4 = 10;
            ArrayList arrayList = new ArrayList(mv0.Z(listL, 10));
            int i5 = 0;
            for (Object obj : listL) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    qf0.U();
                    throw null;
                }
                String strZ = m77.z(((Number) obj).intValue(), ux2Var);
                List listA = ob7.a(strZ);
                String strE = fx3.e(i5, "TVTA-settings-tfa-step-");
                String strB = ob7.b(strZ);
                int iQ = xm4.Q(mv0.Z(listA, i4));
                if (iQ < i2) {
                    iQ = i2;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
                for (Object obj2 : listA) {
                    linkedHashMap.put(obj2, j77.a);
                }
                arrayList.add(new h77(strE, strB, linkedHashMap));
                i5 = i6;
                i2 = 16;
                i4 = 10;
            }
            v67.c((i3 >> 3) & 14, function1, ux2Var, null);
            v67.a(arrayList, null, ux2Var, 0);
            v67.b(i3 & 14, function0, ux2Var, null);
            ux2Var.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new u71(function0, function1, fs4Var2, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0119  */
    /* JADX WARN: Code duplicated, block: B:50:0x0123  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:54:0x0141  */
    /* JADX WARN: Code duplicated, block: B:55:0x014b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0167  */
    /* JADX WARN: Code duplicated, block: B:60:0x017b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0185  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void c(hi7 hi7Var, vl7 vl7Var, fs4 fs4Var, ux2 ux2Var, int i, int i2) {
        int i3;
        fs4 fs4Var2;
        boolean z;
        fs4 fs4Var3;
        j56 j56VarR;
        cs4 cs4Var;
        fs4 fs4Var4;
        boolean z2;
        tg3 tg3Var;
        al7 al7Var;
        boolean z3;
        ud5 ud5VarA;
        ud5 ud5Var;
        hi7Var.getClass();
        float f = hi7Var.p;
        vl7Var.getClass();
        ux2Var.Y(1831264334);
        if ((i & 6) == 0) {
            i3 = (ux2Var.d(hi7Var.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ux2Var.d(vl7Var.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                fs4Var2 = fs4Var;
                i3 |= ux2Var.f(fs4Var2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i3 & 1, z)) {
                cs4Var = cs4.b;
                if (i4 != 0) {
                    fs4Var4 = cs4Var;
                } else {
                    fs4Var4 = fs4Var2;
                }
                y50 y50Var = xz2.s;
                do4 do4VarC = ua0.c(y50Var, false);
                int iHashCode = Long.hashCode(ux2Var.T);
                yj5 yj5VarL = ux2Var.l();
                fs4 fs4VarS = uf0.s(ux2Var, fs4Var4);
                yz0.c.getClass();
                ux2Var.a0();
                z2 = ux2Var.S;
                tg3Var = LayoutNode.e0;
                if (z2) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                iz0 iz0Var = d82.v;
                n(do4VarC, iz0Var, ux2Var);
                iz0 iz0Var2 = d82.u;
                n(yj5VarL, iz0Var2, ux2Var);
                Integer numValueOf = Integer.valueOf(iHashCode);
                iz0 iz0Var3 = d82.w;
                n(numValueOf, iz0Var3, ux2Var);
                l(ux2Var);
                iz0 iz0Var4 = d82.t;
                n(fs4VarS, iz0Var4, ux2Var);
                fs4 fs4VarL = androidx.compose.foundation.layout.b.l(cs4Var, 2.0f + f);
                qf6 qf6Var = sf6.a;
                fs4 fs4VarJ = iq8.j(fs4VarL, qf6Var);
                fs4 fs4Var5 = fs4Var4;
                long j = vl7Var.n;
                pr0 pr0Var = kh.V;
                ua0.a(au8.s(fs4VarJ, j, pr0Var), ux2Var, 0);
                fs4 fs4VarS2 = au8.s(iq8.j(androidx.compose.foundation.layout.b.l(cs4Var, f), qf6Var), vl7Var.m, pr0Var);
                do4 do4VarC2 = ua0.c(y50Var, false);
                int iHashCode2 = Long.hashCode(ux2Var.T);
                yj5 yj5VarL2 = ux2Var.l();
                fs4 fs4VarS3 = uf0.s(ux2Var, fs4VarS2);
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(tg3Var);
                } else {
                    ux2Var.j0();
                }
                n(do4VarC2, iz0Var, ux2Var);
                n(yj5VarL2, iz0Var2, ux2Var);
                e41.r(iHashCode2, ux2Var, iz0Var3, ux2Var);
                n(fs4VarS3, iz0Var4, ux2Var);
                if (w32.a(hi7Var.m, hi7.Size32dp.m) > 0) {
                    ux2Var.W(1347421138);
                    al7Var = vl7Var.f2327o;
                    if (al7Var == null) {
                        ux2Var.W(-1179631383);
                        z3 = false;
                        ux2Var.p(false);
                        ud5VarA = null;
                    } else {
                        z3 = false;
                        ux2Var.W(1347420696);
                        ud5VarA = al7Var.a(ux2Var);
                        ux2Var.p(false);
                    }
                    ud5Var = ud5VarA;
                    if (ud5Var == null) {
                        ux2Var.W(-1179617681);
                        ux2Var.p(z3);
                    } else {
                        ux2Var.W(-1179617680);
                        qs1.l(ud5Var, null, null, null, null, 0.0f, null, ux2Var, 56, 124);
                        z3 = false;
                        ux2Var.p(false);
                    }
                    ux2Var.p(z3);
                } else {
                    ux2Var.W(-1179449071);
                    ux2Var.p(false);
                }
                ux2Var.p(true);
                ux2Var.p(true);
                fs4Var3 = fs4Var5;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new am(hi7Var, vl7Var, fs4Var3, i, i2);
            }
        }
        i3 |= 384;
        fs4Var2 = fs4Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i3 & 1, z)) {
            cs4Var = cs4.b;
            if (i4 != 0) {
                fs4Var4 = cs4Var;
            } else {
                fs4Var4 = fs4Var2;
            }
            y50 y50Var2 = xz2.s;
            do4 do4VarC3 = ua0.c(y50Var2, false);
            int iHashCode3 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL3 = ux2Var.l();
            fs4 fs4VarS4 = uf0.s(ux2Var, fs4Var4);
            yz0.c.getClass();
            ux2Var.a0();
            z2 = ux2Var.S;
            tg3Var = LayoutNode.e0;
            if (z2) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var5 = d82.v;
            n(do4VarC3, iz0Var5, ux2Var);
            iz0 iz0Var6 = d82.u;
            n(yj5VarL3, iz0Var6, ux2Var);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            iz0 iz0Var7 = d82.w;
            n(numValueOf2, iz0Var7, ux2Var);
            l(ux2Var);
            iz0 iz0Var8 = d82.t;
            n(fs4VarS4, iz0Var8, ux2Var);
            fs4 fs4VarL2 = androidx.compose.foundation.layout.b.l(cs4Var, 2.0f + f);
            qf6 qf6Var2 = sf6.a;
            fs4 fs4VarJ2 = iq8.j(fs4VarL2, qf6Var2);
            fs4 fs4Var6 = fs4Var4;
            long j2 = vl7Var.n;
            pr0 pr0Var2 = kh.V;
            ua0.a(au8.s(fs4VarJ2, j2, pr0Var2), ux2Var, 0);
            fs4 fs4VarS5 = au8.s(iq8.j(androidx.compose.foundation.layout.b.l(cs4Var, f), qf6Var2), vl7Var.m, pr0Var2);
            do4 do4VarC4 = ua0.c(y50Var2, false);
            int iHashCode4 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL4 = ux2Var.l();
            fs4 fs4VarS6 = uf0.s(ux2Var, fs4VarS5);
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            n(do4VarC4, iz0Var5, ux2Var);
            n(yj5VarL4, iz0Var6, ux2Var);
            e41.r(iHashCode4, ux2Var, iz0Var7, ux2Var);
            n(fs4VarS6, iz0Var8, ux2Var);
            if (w32.a(hi7Var.m, hi7.Size32dp.m) > 0) {
                ux2Var.W(1347421138);
                al7Var = vl7Var.f2327o;
                if (al7Var == null) {
                    ux2Var.W(-1179631383);
                    z3 = false;
                    ux2Var.p(false);
                    ud5VarA = null;
                } else {
                    z3 = false;
                    ux2Var.W(1347420696);
                    ud5VarA = al7Var.a(ux2Var);
                    ux2Var.p(false);
                }
                ud5Var = ud5VarA;
                if (ud5Var == null) {
                    ux2Var.W(-1179617681);
                    ux2Var.p(z3);
                } else {
                    ux2Var.W(-1179617680);
                    qs1.l(ud5Var, null, null, null, null, 0.0f, null, ux2Var, 56, 124);
                    z3 = false;
                    ux2Var.p(false);
                }
                ux2Var.p(z3);
            } else {
                ux2Var.W(-1179449071);
                ux2Var.p(false);
            }
            ux2Var.p(true);
            ux2Var.p(true);
            fs4Var3 = fs4Var6;
        } else {
            ux2Var.Q();
            fs4Var3 = fs4Var2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new am(hi7Var, vl7Var, fs4Var3, i, i2);
        }
    }

    public static float d(int i) {
        Set set = kj8.n;
        if (i == 2) {
            return 900.0f;
        }
        return i == 1 ? 480.0f : 0.0f;
    }

    public static final ep7 e(um1 um1Var) {
        qp7 qp7Var;
        cp7 cp7Var = new cp7();
        g57.p(um1Var, gp7.a, new y46(new y46((Object) cp7Var, (byte) 28), new nu6(1, cp7Var, cp7.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 12)));
        zw4 zw4Var = new zw4();
        zw4 zw4Var2 = cp7Var.a;
        Object[] objArr = zw4Var2.a;
        int i = zw4Var2.b;
        byte b = 0;
        int i2 = 0;
        boolean z = true;
        dp7 dp7Var = null;
        while (true) {
            qp7Var = qp7.b;
            if (i2 >= i) {
                break;
            }
            dp7 dp7Var2 = (dp7) objArr[i2];
            if (!z || dp7Var2 != qp7Var) {
                if (dp7Var2 == qp7Var && dp7Var == qp7Var) {
                    z = false;
                } else {
                    if (dp7Var2 != qp7Var) {
                        zw4 zw4Var3 = cp7Var.b;
                        Object[] objArr2 = zw4Var3.a;
                        int i3 = zw4Var3.b;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (((Boolean) ((Function1) objArr2[i4]).invoke(dp7Var2)).booleanValue()) {
                                    i4++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    zw4Var.a(dp7Var2);
                    z = false;
                    dp7Var = dp7Var2;
                }
            }
            i2++;
        }
        if (((dp7) (zw4Var.h() ? null : zw4Var.a[zw4Var.b - 1])) == qp7Var) {
            zw4Var.k(zw4Var.b - 1);
        }
        xw4 xw4Var = zw4Var.c;
        if (xw4Var == null) {
            xw4Var = new xw4(zw4Var, b);
            zw4Var.c = xw4Var;
        }
        return new ep7(xw4Var);
    }

    public static final long f() {
        return Thread.currentThread().getId();
    }

    public static final boolean g(long j, long j2) {
        return j == j2;
    }

    public static String h(Resources resources, int i, Object... objArr) {
        resources.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        return i(resources, locale, i, Arrays.copyOf(objArr, objArr.length));
    }

    public static String i(Resources resources, Locale locale, int i, Object... objArr) {
        resources.getClass();
        String string = resources.getString(i);
        string.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        try {
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
            return String.format(locale, string, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
        } catch (IllegalFormatException e) {
            ye4.c("StringHelperFuncs", "formatString() " + e.getMessage() + " with format=" + string);
            return string;
        }
    }

    public static final ai6 j(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            ai6 ai6Var = tag instanceof ai6 ? (ai6) tag : null;
            if (ai6Var != null) {
                return ai6Var;
            }
            Object objQ = i67.q(view);
            view = objQ instanceof View ? (View) objQ : null;
        }
        return null;
    }

    public static String[] k(String str) {
        List listK;
        Collection collectionK0;
        if (str.length() == 0) {
            return new String[0];
        }
        Pattern patternCompile = Pattern.compile(";");
        patternCompile.getClass();
        ub7.k0(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listK = arrayList;
        } else {
            listK = qf0.K(str.toString());
        }
        if (listK.isEmpty()) {
            collectionK0 = ea2.m;
        } else {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collectionK0 = lv0.K0(listK, listIterator.nextIndex() + 1);
                }
            }
            collectionK0 = ea2.m;
        }
        return (String[]) collectionK0.toArray(new String[0]);
    }

    public static final void l(ux2 ux2Var) {
        ux2Var.b(f88.a, new xt7((byte) 3));
    }

    public static String m(String str) {
        str.getClass();
        if (str.length() == 0) {
            return "";
        }
        String string = ub7.x0(str).toString();
        Pattern patternCompile = Pattern.compile("\\s");
        patternCompile.getClass();
        string.getClass();
        String strReplaceAll = patternCompile.matcher(string).replaceAll("");
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public static final void n(Object obj, hw2 hw2Var, ux2 ux2Var) {
        if (ux2Var.S || !im3.n(ux2Var.K(), obj)) {
            ux2Var.g0(obj);
            ux2Var.b(obj, hw2Var);
        }
    }

    public static void p(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public abstract i07 o(i48 i48Var, sz3 sz3Var);
}
