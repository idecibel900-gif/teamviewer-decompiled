package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class qo1 implements so1 {
    public static final qo1 c;
    public static final qo1 d;
    public static final qo1 e;
    public final uo1 a;
    public final kh7 b = new kh7(new a3(this, 7));

    static {
        uo1 uo1Var = new uo1();
        la2 la2Var = la2.m;
        uo1Var.d(la2Var);
        uo1Var.a = true;
        new qo1(uo1Var);
        uo1 uo1Var2 = new uo1();
        uo1Var2.i();
        uo1Var2.a = true;
        new qo1(uo1Var2);
        uo1 uo1Var3 = new uo1();
        uo1Var3.i();
        uo1Var3.d(la2Var);
        uo1Var3.a = true;
        new qo1(uo1Var3);
        uo1 uo1Var4 = new uo1();
        uo1Var4.i();
        uo1Var4.d(la2Var);
        uo1Var4.l();
        uo1Var4.a = true;
        new qo1(uo1Var4);
        uo1 uo1Var5 = new uo1();
        uo1Var5.d(la2Var);
        at0 at0Var = at0.c;
        uo1Var5.g(at0Var);
        tf5 tf5Var = tf5.n;
        uo1Var5.m(tf5Var);
        uo1Var5.a = true;
        new qo1(uo1Var5);
        uo1 uo1Var6 = new uo1();
        uo1Var6.i();
        uo1Var6.d(la2Var);
        uo1Var6.g(at0Var);
        uo1Var6.f();
        uo1Var6.m(tf5.f2106o);
        uo1Var6.a();
        uo1Var6.c();
        uo1Var6.l();
        uo1Var6.h();
        uo1Var6.a = true;
        new qo1(uo1Var6);
        uo1 uo1Var7 = new uo1();
        uo1Var7.d(ro1.n);
        uo1Var7.a = true;
        c = new qo1(uo1Var7);
        uo1 uo1Var8 = new uo1();
        uo1Var8.d(ro1.f1937o);
        uo1Var8.a = true;
        new qo1(uo1Var8);
        uo1 uo1Var9 = new uo1();
        uo1Var9.g(at0Var);
        uo1Var9.m(tf5Var);
        uo1Var9.a = true;
        d = new qo1(uo1Var9);
        uo1 uo1Var10 = new uo1();
        uo1Var10.b();
        uo1Var10.g(at0.b);
        uo1Var10.d(ro1.f1937o);
        uo1Var10.a = true;
        e = new qo1(uo1Var10);
        uo1 uo1Var11 = new uo1();
        uo1Var11.k();
        uo1Var11.d(ro1.f1937o);
        uo1Var11.a = true;
        new qo1(uo1Var11);
    }

    public qo1(uo1 uo1Var) {
        this.a = uo1Var;
    }

    public static void W(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean i0(oz3 oz3Var) {
        if (!wo1.P(oz3Var)) {
            return false;
        }
        List listM0 = oz3Var.m0();
        if (listM0 != null && listM0.isEmpty()) {
            return true;
        }
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            if (((h58) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static as4 u(qo4 qo4Var) {
        boolean z = qo4Var instanceof ns4;
        as4 as4Var = as4.q;
        ms0 ms0Var = ms0.n;
        as4 as4Var2 = as4.n;
        if (z) {
            return ((ns4) qo4Var).i0() == ms0Var ? as4Var : as4Var2;
        }
        fi1 fi1VarI = qo4Var.i();
        ns4 ns4Var = fi1VarI instanceof ns4 ? (ns4) fi1VarI : null;
        if (ns4Var == null || !(qo4Var instanceof zi0)) {
            return as4Var2;
        }
        zi0 zi0Var = (zi0) qo4Var;
        Collection collectionJ = zi0Var.j();
        collectionJ.getClass();
        boolean zIsEmpty = collectionJ.isEmpty();
        as4 as4Var3 = as4.p;
        if (!zIsEmpty && ns4Var.r() != as4Var2) {
            return as4Var3;
        }
        if (ns4Var.i0() != ms0Var || im3.n(zi0Var.e(), dp1.a)) {
            return as4Var2;
        }
        return zi0Var.r() == as4Var ? as4Var : as4Var3;
    }

    public final String A(u51 u51Var) {
        to1 to1Var = this.a.v;
        fw3 fw3Var = uo1.Y[20];
        to1Var.getClass();
        fw3Var.getClass();
        Function1 function1 = (Function1) to1Var.m;
        if (function1 != null) {
            return (String) function1.invoke(u51Var);
        }
        if (u51Var instanceof bx) {
            Iterable iterable = (Iterable) ((bx) u51Var).a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strA = A((u51) it.next());
                if (strA != null) {
                    arrayList.add(strA);
                }
            }
            return lv0.t0(arrayList, ", ", "{", "}", null, 56);
        }
        if (u51Var instanceof sp) {
            return ub7.i0(w((hp) ((sp) u51Var).a, null), "@");
        }
        if (!(u51Var instanceof iu3)) {
            return u51Var.toString();
        }
        hu3 hu3Var = (hu3) ((iu3) u51Var).a;
        if (hu3Var instanceof fu3) {
            return ((fu3) hu3Var).a + "::class";
        }
        if (!(hu3Var instanceof gu3)) {
            gk0.s();
            return null;
        }
        ns0 ns0Var = ((gu3) hu3Var).a;
        String strB = ns0Var.a.a().b();
        int i = ns0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            strB = to7.i('>', "kotlin.Array<", strB);
        }
        return strB.concat("::class");
    }

    public final void B(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            v14 v14Var = (v14) it.next();
            x(sb, v14Var, pp.RECEIVER);
            oz3 type = v14Var.getType();
            type.getClass();
            sb.append(F(type));
            if (i == list.size() - 1) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    public final void C(StringBuilder sb, g07 g07Var) {
        to1 to1Var;
        x(sb, g07Var, null);
        if (ct1.K(g07Var)) {
            boolean z = g07Var instanceof ed2;
            uo1 uo1Var = this.a;
            if (z && ((ed2) g07Var).p.n) {
                to1 to1Var2 = uo1Var.V;
                fw3 fw3Var = uo1.Y[47];
                to1Var2.getClass();
                fw3Var.getClass();
                if (((Boolean) to1Var2.m).booleanValue()) {
                    hd2 hd2Var = hd2.a;
                    if (z) {
                        boolean z2 = ((ed2) g07Var).p.n;
                    }
                    k48 k48VarO0 = g07Var.o0();
                    k48VarO0.getClass();
                    sb.append(D(((fd2) k48VarO0).b[0]));
                } else {
                    if (z) {
                        to1Var = uo1Var.X;
                        fw3 fw3Var2 = uo1.Y[49];
                        to1Var.getClass();
                        fw3Var2.getClass();
                        if (((Boolean) to1Var.m).booleanValue()) {
                            sb.append(g07Var.o0().toString());
                        } else {
                            sb.append(((ed2) g07Var).t);
                        }
                    } else {
                        sb.append(g07Var.o0().toString());
                    }
                    sb.append(Y(g07Var.m0()));
                }
            } else {
                if (z) {
                    to1Var = uo1Var.X;
                    fw3 fw3Var3 = uo1.Y[49];
                    to1Var.getClass();
                    fw3Var3.getClass();
                    if (((Boolean) to1Var.m).booleanValue()) {
                        sb.append(((ed2) g07Var).t);
                    } else {
                        sb.append(g07Var.o0().toString());
                    }
                } else {
                    sb.append(g07Var.o0().toString());
                }
                sb.append(Y(g07Var.m0()));
            }
        } else {
            k48 k48VarO1 = g07Var.o0();
            ys0 ys0VarA = g07Var.o0().a();
            ep3 ep3VarE = b77.e(g07Var, ys0VarA instanceof zs0 ? (zs0) ys0VarA : null, 0);
            if (ep3VarE == null) {
                sb.append(Z(k48VarO1));
                sb.append(Y(g07Var.m0()));
            } else {
                T(sb, ep3VarE);
            }
        }
        if (g07Var.p0()) {
            sb.append("?");
        }
        if (g07Var instanceof lm1) {
            sb.append(" & Any");
        }
    }

    public final String D(String str) {
        int iOrdinal = r().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return fx3.g("<font color=red><b>", str, "</b></font>");
        }
        gk0.s();
        return null;
    }

    public final String E(String str, String str2, wy3 wy3Var) {
        str.getClass();
        str2.getClass();
        if (lq1.Q(str, str2)) {
            return bc7.N(false, str2, "(") ? fx3.g("(", str, ")!") : str.concat("!");
        }
        String strS0 = ub7.s0(o().b(wy3Var.i(s87.C), this), "Collection");
        String strC = lq1.C(str, strS0.concat("Mutable"), str2, strS0, strS0.concat("(Mutable)"));
        if (strC != null) {
            return strC;
        }
        String strC2 = lq1.C(str, strS0.concat("MutableMap.MutableEntry"), str2, strS0.concat("Map.Entry"), strS0.concat("(Mutable)Map.(Mutable)Entry"));
        if (strC2 != null) {
            return strC2;
        }
        String strS1 = ub7.s0(o().b(wy3Var.j("Array"), this), "Array");
        String strC3 = lq1.C(str, strS1.concat(n("Array<")), str2, strS1.concat(n("Array<out ")), strS1.concat(n("Array<(out) ")));
        if (strC3 != null) {
            return strC3;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String F(oz3 oz3Var) {
        String strX = X(oz3Var);
        return ((!i0(oz3Var) || p58.e(oz3Var)) && !(oz3Var instanceof lm1)) ? strX : to7.i(')', "(", strX);
    }

    public final void G(sb8 sb8Var, StringBuilder sb) {
        u51 u51VarH;
        String strA;
        to1 to1Var = this.a.u;
        fw3 fw3Var = uo1.Y[19];
        to1Var.getClass();
        fw3Var.getClass();
        if (!((Boolean) to1Var.m).booleanValue() || (u51VarH = sb8Var.H()) == null || (strA = A(u51VarH)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(n(strA));
    }

    public final String H(String str) {
        int iOrdinal = r().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                gk0.s();
                return null;
            }
            to1 to1Var = this.a.W;
            fw3 fw3Var = uo1.Y[48];
            to1Var.getClass();
            fw3Var.getClass();
            if (!((Boolean) to1Var.m).booleanValue()) {
                return fx3.g("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void I(zi0 zi0Var, StringBuilder sb) {
        if (p().contains(ro1.MEMBER_KIND) && t() && zi0Var.k() != 1) {
            sb.append("/*");
            sb.append(g68.C(ua5.A(zi0Var.k())));
            sb.append("*/ ");
        }
    }

    public final void J(qo4 qo4Var, StringBuilder sb) {
        M("external", sb, qo4Var.p());
        boolean z = false;
        M("expect", sb, p().contains(ro1.EXPECT) && qo4Var.A());
        if (p().contains(ro1.ACTUAL) && qo4Var.h0()) {
            z = true;
        }
        M("actual", sb, z);
    }

    public final void K(as4 as4Var, StringBuilder sb, as4 as4Var2) {
        to1 to1Var = this.a.p;
        fw3 fw3Var = uo1.Y[14];
        to1Var.getClass();
        fw3Var.getClass();
        if (((Boolean) to1Var.m).booleanValue() || as4Var != as4Var2) {
            M(g68.C(as4Var.name()), sb, p().contains(ro1.MODALITY));
        }
    }

    public final void L(zi0 zi0Var, StringBuilder sb) {
        if (zo1.s(zi0Var) && zi0Var.r() == as4.n) {
            return;
        }
        to1 to1Var = this.a.B;
        fw3 fw3Var = uo1.Y[26];
        to1Var.getClass();
        fw3Var.getClass();
        if (((fc5) to1Var.m) == fc5.m && zi0Var.r() == as4.p && !zi0Var.j().isEmpty()) {
            return;
        }
        as4 as4VarR = zi0Var.r();
        as4VarR.getClass();
        K(as4VarR, sb, u(zi0Var));
    }

    public final void M(String str, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(H(str));
            sb.append(" ");
        }
    }

    public final String N(sy4 sy4Var, boolean z) {
        String strN = n(lq1.A(sy4Var));
        to1 to1Var = this.a.W;
        fw3 fw3Var = uo1.Y[48];
        to1Var.getClass();
        fw3Var.getClass();
        return (((Boolean) to1Var.m).booleanValue() && r() == qa6.n && z) ? fx3.g("<b>", strN, "</b>") : strN;
    }

    public final void O(fi1 fi1Var, StringBuilder sb, boolean z) {
        sy4 name = fi1Var.getName();
        name.getClass();
        sb.append(N(name, z));
    }

    public final void P(StringBuilder sb, oz3 oz3Var) throws IOException {
        m98 m98VarR0 = oz3Var.r0();
        i iVar = m98VarR0 instanceof i ? (i) m98VarR0 : null;
        if (iVar == null) {
            Q(sb, oz3Var);
            return;
        }
        g07 g07Var = iVar.f1021o;
        g07 g07Var2 = iVar.n;
        uo1 uo1Var = this.a;
        to1 to1Var = uo1Var.R;
        fw3[] fw3VarArr = uo1.Y;
        fw3 fw3Var = fw3VarArr[42];
        to1Var.getClass();
        fw3Var.getClass();
        boolean zBooleanValue = ((Boolean) to1Var.m).booleanValue();
        oa6 oa6Var = qa6.n;
        if (zBooleanValue) {
            Q(sb, g07Var2);
            to1 to1Var2 = uo1Var.S;
            fw3 fw3Var2 = fw3VarArr[43];
            to1Var2.getClass();
            fw3Var2.getClass();
            if (((Boolean) to1Var2.m).booleanValue()) {
                if (r() == oa6Var) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                Q(sb, g07Var);
                sb.append(" */");
                if (r() == oa6Var) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        Q(sb, g07Var);
        to1 to1Var3 = uo1Var.Q;
        fw3 fw3Var3 = fw3VarArr[41];
        to1Var3.getClass();
        fw3Var3.getClass();
        if (((Boolean) to1Var3.m).booleanValue()) {
            if (r() == oa6Var) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            Q(sb, g07Var2);
            sb.append(" */");
            if (r() == oa6Var) {
                sb.append("</i></font>");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:90:0x019c  */
    public final void Q(StringBuilder sb, oz3 oz3Var) throws IOException {
        sy4 sy4VarD;
        String strN;
        boolean z;
        uo1 uo1Var = this.a;
        if ((oz3Var instanceof o54) && uo1Var.o()) {
            vd4 vd4Var = ((o54) oz3Var).p;
            if (vd4Var.f2201o == wd4.m || vd4Var.f2201o == wd4.n) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        m98 m98VarR0 = oz3Var.r0();
        if (m98VarR0 instanceof um2) {
            sb.append(((um2) m98VarR0).w0(this, this));
            return;
        }
        if (!(m98VarR0 instanceof g07)) {
            gk0.s();
            return;
        }
        g07 g07Var = (g07) m98VarR0;
        if (g07Var.equals(p58.b) || g07Var.o0() == p58.a.n) {
            sb.append("???");
            return;
        }
        k48 k48VarO0 = g07Var.o0();
        if ((k48VarO0 instanceof fd2) && ((fd2) k48VarO0).a == gd2.v) {
            to1 to1Var = uo1Var.t;
            fw3 fw3Var = uo1.Y[18];
            to1Var.getClass();
            fw3Var.getClass();
            if (!((Boolean) to1Var.m).booleanValue()) {
                sb.append("???");
                return;
            }
            k48 k48VarO1 = g07Var.o0();
            k48VarO1.getClass();
            sb.append(D(((fd2) k48VarO1).b[0]));
            return;
        }
        if (ct1.K(g07Var)) {
            C(sb, g07Var);
            return;
        }
        if (!i0(g07Var)) {
            C(sb, g07Var);
            return;
        }
        int length = sb.length();
        ((qo1) this.b.getValue()).x(sb, g07Var, null);
        boolean z2 = sb.length() != length;
        oz3 oz3VarN = wo1.N(g07Var);
        List listG = wo1.G(g07Var);
        ys0 ys0VarA = g07Var.o0().a();
        boolean zN = im3.n(ys0VarA != null ? wo1.H(ys0VarA) : null, gx2.c);
        boolean zP0 = g07Var.p0();
        boolean z3 = zP0 || (z2 && oz3VarN != null);
        if (z3) {
            if (zN) {
                sb.insert(length, '(');
            } else {
                if (z2) {
                    qf0.J(ub7.c0(sb));
                    if (sb.charAt(sb.length() - 2) != ')') {
                        sb.insert(sb.length() - 1, "()");
                    }
                }
                sb.append("(");
            }
        }
        if (!listG.isEmpty()) {
            sb.append("context(");
            Iterator it = listG.subList(0, listG.size() - 1).iterator();
            while (it.hasNext()) {
                P(sb, (oz3) it.next());
                sb.append(", ");
            }
            P(sb, (oz3) lv0.v0(listG));
            sb.append(") ");
        }
        M("suspend", sb, zN);
        if (oz3VarN != null) {
            if (!i0(oz3VarN) || oz3VarN.p0()) {
                ys0 ys0VarA2 = oz3VarN.o0().a();
                if (im3.n(ys0VarA2 != null ? wo1.H(ys0VarA2) : null, gx2.c) || !oz3VarN.getAnnotations().isEmpty() || (oz3VarN instanceof lm1)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                sb.append("(");
            }
            P(sb, oz3VarN);
            if (z) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!wo1.P(g07Var) || g07Var.getAnnotations().u(s87.p) == null || g07Var.m0().size() > 1) {
            int i = 0;
            for (h58 h58Var : wo1.O(g07Var)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                to1 to1Var2 = uo1Var.U;
                fw3 fw3Var2 = uo1.Y[45];
                to1Var2.getClass();
                fw3Var2.getClass();
                if (((Boolean) to1Var2.m).booleanValue()) {
                    oz3 oz3VarB = h58Var.b();
                    oz3VarB.getClass();
                    sy4VarD = wo1.D(oz3VarB);
                } else {
                    sy4VarD = null;
                }
                byte b = 0;
                if (sy4VarD != null) {
                    sb.append(N(sy4VarD, false));
                    sb.append(": ");
                }
                h58Var.getClass();
                StringBuilder sb2 = new StringBuilder();
                lv0.s0(qf0.K(h58Var), sb2, ", ", null, null, new po1(this, b), 60);
                sb.append(sb2.toString());
                i = i2;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int iOrdinal = r().ordinal();
        if (iOrdinal == 0) {
            strN = n("->");
        } else {
            if (iOrdinal != 1) {
                gk0.s();
                return;
            }
            strN = "&rarr;";
        }
        sb.append(strN);
        sb.append(" ");
        wo1.P(g07Var);
        oz3 oz3VarB2 = ((h58) lv0.v0(g07Var.m0())).b();
        oz3VarB2.getClass();
        P(sb, oz3VarB2);
        if (z3) {
            sb.append(")");
        }
        if (zP0) {
            sb.append("?");
        }
    }

    public final void R(zi0 zi0Var, StringBuilder sb) {
        if (p().contains(ro1.OVERRIDE) && !zi0Var.j().isEmpty()) {
            to1 to1Var = this.a.B;
            fw3 fw3Var = uo1.Y[26];
            to1Var.getClass();
            fw3Var.getClass();
            if (((fc5) to1Var.m) != fc5.n) {
                M("override", sb, true);
                if (t()) {
                    sb.append("/*");
                    sb.append(zi0Var.j().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void S(ht2 ht2Var, String str, StringBuilder sb) {
        sb.append(H(str));
        it2 it2VarI = ht2Var.i();
        it2VarI.getClass();
        String strN = n(lq1.B(it2VarI.e()));
        if (strN.length() > 0) {
            sb.append(" ");
            sb.append(strN);
        }
    }

    public final void T(StringBuilder sb, ep3 ep3Var) {
        ep3 ep3Var2 = (ep3) ep3Var.p;
        zs0 zs0Var = (zs0) ep3Var.n;
        if (ep3Var2 != null) {
            T(sb, ep3Var2);
            sb.append('.');
            sy4 name = zs0Var.getName();
            name.getClass();
            sb.append(N(name, false));
        } else {
            k48 k48VarQ = zs0Var.q();
            k48VarQ.getClass();
            sb.append(Z(k48VarQ));
        }
        sb.append(Y((List) ep3Var.f733o));
    }

    public final void U(bu5 bu5Var, StringBuilder sb) {
        if (!q()) {
            uo1 uo1Var = this.a;
            to1 to1Var = uo1Var.g;
            fw3[] fw3VarArr = uo1.Y;
            fw3 fw3Var = fw3VarArr[5];
            to1Var.getClass();
            fw3Var.getClass();
            if (!((Boolean) to1Var.m).booleanValue()) {
                List listX = bu5Var.X();
                listX.getClass();
                B(sb, listX);
                if (p().contains(ro1.ANNOTATIONS)) {
                    x(sb, bu5Var, null);
                    xi2 xi2VarV = bu5Var.V();
                    if (xi2VarV != null) {
                        x(sb, xi2VarV, pp.FIELD);
                    }
                    xi2 xi2VarT = bu5Var.T();
                    if (xi2VarT != null) {
                        x(sb, xi2VarT, pp.PROPERTY_DELEGATE_FIELD);
                    }
                    to1 to1Var2 = uo1Var.H;
                    fw3 fw3Var2 = fw3VarArr[32];
                    to1Var2.getClass();
                    fw3Var2.getClass();
                    if (((au5) to1Var2.m) == au5.n) {
                        eu5 getter = bu5Var.getGetter();
                        if (getter != null) {
                            x(sb, getter, pp.PROPERTY_GETTER);
                        }
                        ju5 ju5VarB = bu5Var.b();
                        if (ju5VarB != null) {
                            x(sb, ju5VarB, pp.PROPERTY_SETTER);
                            List listJ = ju5VarB.J();
                            listJ.getClass();
                            qb8 qb8Var = (qb8) lv0.F0(listJ);
                            qb8Var.getClass();
                            x(sb, qb8Var, pp.SETTER_PARAMETER);
                        }
                    }
                }
                cp1 cp1VarE = bu5Var.e();
                cp1VarE.getClass();
                g0(cp1VarE, sb);
                M("const", sb, p().contains(ro1.CONST) && bu5Var.s());
                J(bu5Var, sb);
                L(bu5Var, sb);
                R(bu5Var, sb);
                M("lateinit", sb, p().contains(ro1.LATEINIT) && bu5Var.Z());
                I(bu5Var, sb);
            }
            d0(bu5Var, sb, false);
            List typeParameters = bu5Var.getTypeParameters();
            typeParameters.getClass();
            c0(sb, typeParameters, true);
            v14 v14VarS = bu5Var.S();
            if (v14VarS != null) {
                x(sb, v14VarS, pp.RECEIVER);
                oz3 type = v14VarS.getType();
                type.getClass();
                sb.append(F(type));
                sb.append(".");
            }
        }
        O(bu5Var, sb, true);
        sb.append(": ");
        oz3 type2 = bu5Var.getType();
        type2.getClass();
        sb.append(X(type2));
        V(sb, bu5Var);
        G(bu5Var, sb);
        List typeParameters2 = bu5Var.getTypeParameters();
        typeParameters2.getClass();
        h0(sb, typeParameters2);
    }

    public final void V(StringBuilder sb, xi0 xi0Var) {
        v14 v14VarS;
        to1 to1Var = this.a.F;
        fw3 fw3Var = uo1.Y[30];
        to1Var.getClass();
        fw3Var.getClass();
        if (((Boolean) to1Var.m).booleanValue() && (v14VarS = xi0Var.S()) != null) {
            sb.append(" on ");
            oz3 type = v14VarS.getType();
            type.getClass();
            sb.append(X(type));
        }
    }

    public final String X(oz3 oz3Var) {
        oz3Var.getClass();
        StringBuilder sb = new StringBuilder();
        to1 to1Var = this.a.y;
        fw3 fw3Var = uo1.Y[23];
        to1Var.getClass();
        fw3Var.getClass();
        P(sb, (oz3) ((Function1) to1Var.m).invoke(oz3Var));
        return sb.toString();
    }

    public final String Y(List list) throws IOException {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(n("<"));
        lv0.s0(list, sb, ", ", null, null, new po1(this, (byte) 0), 60);
        sb.append(n(">"));
        return sb.toString();
    }

    public final String Z(k48 k48Var) {
        k48Var.getClass();
        ys0 ys0VarA = k48Var.a();
        if ((ys0VarA instanceof d58) || (ys0VarA instanceof ns4) || (ys0VarA instanceof eq1)) {
            ys0VarA.getClass();
            return hd2.f(ys0VarA) ? ys0VarA.q().toString() : o().b(ys0VarA, this);
        }
        if (ys0VarA == null) {
            return k48Var instanceof zl3 ? ((zl3) k48Var).f(ek.B) : k48Var.toString();
        }
        yq4.u(ys0VarA.getClass(), "Unexpected classifier: ");
        return null;
    }

    @Override // o.so1
    public final void a() {
        this.a.a();
    }

    public final void a0(d58 d58Var, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(n("<"));
        }
        if (t()) {
            sb.append("/*");
            sb.append(d58Var.getIndex());
            sb.append("*/ ");
        }
        M("reified", sb, d58Var.w());
        String str = d58Var.B().m;
        boolean z2 = true;
        M(str, sb, str.length() > 0);
        x(sb, d58Var, null);
        O(d58Var, sb, z);
        int size = d58Var.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            oz3 oz3Var = (oz3) d58Var.getUpperBounds().iterator().next();
            if (oz3Var == null) {
                wy3.a(142);
                throw null;
            }
            if (!wy3.x(oz3Var) || !oz3Var.p0()) {
                sb.append(" : ");
                sb.append(X(oz3Var));
            }
        } else if (z) {
            for (oz3 oz3Var2 : d58Var.getUpperBounds()) {
                if (oz3Var2 == null) {
                    wy3.a(142);
                    throw null;
                }
                if (!wy3.x(oz3Var2) || !oz3Var2.p0()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(X(oz3Var2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(n(">"));
        }
    }

    @Override // o.so1
    public final void b() {
        this.a.b();
    }

    public final void b0(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0((d58) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // o.so1
    public final void c() {
        this.a.c();
    }

    public final void c0(StringBuilder sb, List list, boolean z) {
        to1 to1Var = this.a.w;
        fw3 fw3Var = uo1.Y[21];
        to1Var.getClass();
        fw3Var.getClass();
        if (((Boolean) to1Var.m).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(n("<"));
        b0(sb, list);
        sb.append(n(">"));
        if (z) {
            sb.append(" ");
        }
    }

    @Override // o.so1
    public final void d(Set set) {
        set.getClass();
        this.a.d(set);
    }

    public final void d0(sb8 sb8Var, StringBuilder sb, boolean z) {
        if (z || !(sb8Var instanceof qb8)) {
            sb.append(H(sb8Var.R() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // o.so1
    public final void e(LinkedHashSet linkedHashSet) {
        this.a.e(linkedHashSet);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0066  */
    public final void e0(qb8 qb8Var, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(H("value-parameter"));
            sb.append(" ");
        }
        if (t()) {
            sb.append("/*");
            sb.append(qb8Var.r);
            sb.append("*/ ");
        }
        x(sb, qb8Var, null);
        M("crossinline", sb, qb8Var.t);
        M("noinline", sb, qb8Var.u);
        uo1 uo1Var = this.a;
        to1 to1Var = uo1Var.r;
        fw3[] fw3VarArr = uo1.Y;
        fw3 fw3Var = fw3VarArr[16];
        to1Var.getClass();
        fw3Var.getClass();
        if (((Boolean) to1Var.m).booleanValue()) {
            xi0 xi0VarF0 = qb8Var.i();
            wr0 wr0Var = xi0VarF0 instanceof wr0 ? (wr0) xi0VarF0 : null;
            if (wr0Var == null || !wr0Var.P) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            to1 to1Var2 = uo1Var.s;
            fw3 fw3Var2 = fw3VarArr[17];
            to1Var2.getClass();
            fw3Var2.getClass();
            M("actual", sb, ((Boolean) to1Var2.m).booleanValue());
        }
        oz3 type = qb8Var.getType();
        type.getClass();
        oz3 oz3Var = qb8Var.v;
        oz3 oz3Var2 = oz3Var == null ? type : oz3Var;
        M("vararg", sb, oz3Var != null);
        if (z3 || (z2 && !q())) {
            d0(qb8Var, sb, z3);
        }
        if (z) {
            O(qb8Var, sb, z2);
            sb.append(": ");
        }
        sb.append(X(oz3Var2));
        G(qb8Var, sb);
        if (t() && oz3Var != null) {
            sb.append(" /*");
            sb.append(X(type));
            sb.append("*/");
        }
        to1 to1Var3 = uo1Var.z;
        fw3 fw3Var3 = fw3VarArr[24];
        to1Var3.getClass();
        fw3Var3.getClass();
        if (((Function1) to1Var3.m) != null) {
            if (uo1Var.o() ? qb8Var.E0() : bp1.a(qb8Var)) {
                StringBuilder sb2 = new StringBuilder(" = ");
                to1 to1Var4 = uo1Var.z;
                fw3 fw3Var4 = fw3VarArr[24];
                to1Var4.getClass();
                fw3Var4.getClass();
                Function1 function1 = (Function1) to1Var4.m;
                function1.getClass();
                sb2.append((String) function1.invoke(qb8Var));
                sb.append(sb2.toString());
            }
        }
    }

    @Override // o.so1
    public final void f() {
        this.a.f();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void f0(StringBuilder sb, List list, boolean z) {
        boolean z2;
        to1 to1Var = this.a.E;
        fw3 fw3Var = uo1.Y[29];
        to1Var.getClass();
        fw3Var.getClass();
        int iOrdinal = ((tf5) to1Var.m).ordinal();
        if (iOrdinal == 0) {
            z2 = true;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    gk0.s();
                    return;
                }
            } else if (!z) {
                z2 = true;
            }
            z2 = false;
        }
        int size = list.size();
        s().getClass();
        sb.append("(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            qb8 qb8Var = (qb8) it.next();
            s().getClass();
            qb8Var.getClass();
            e0(qb8Var, z2, sb, false);
            s().getClass();
            if (i != size - 1) {
                sb.append(", ");
            }
            i = i2;
        }
        s().getClass();
        sb.append(")");
    }

    @Override // o.so1
    public final void g(at0 at0Var) {
        this.a.g(at0Var);
    }

    public final boolean g0(cp1 cp1Var, StringBuilder sb) {
        if (!p().contains(ro1.VISIBILITY)) {
            return false;
        }
        uo1 uo1Var = this.a;
        to1 to1Var = uo1Var.n;
        fw3[] fw3VarArr = uo1.Y;
        fw3 fw3Var = fw3VarArr[12];
        to1Var.getClass();
        fw3Var.getClass();
        if (((Boolean) to1Var.m).booleanValue()) {
            cp1Var = dp1.f(cp1Var.a.m());
        }
        to1 to1Var2 = uo1Var.f2232o;
        fw3 fw3Var2 = fw3VarArr[13];
        to1Var2.getClass();
        fw3Var2.getClass();
        if (!((Boolean) to1Var2.m).booleanValue() && im3.n(cp1Var, dp1.k)) {
            return false;
        }
        sb.append(H(cp1Var.a.e()));
        sb.append(" ");
        return true;
    }

    @Override // o.so1
    public final void h() {
        this.a.h();
    }

    public final void h0(StringBuilder sb, List list) {
        to1 to1Var = this.a.w;
        fw3 fw3Var = uo1.Y[21];
        to1Var.getClass();
        fw3Var.getClass();
        if (((Boolean) to1Var.m).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d58 d58Var = (d58) it.next();
            List upperBounds = d58Var.getUpperBounds();
            upperBounds.getClass();
            for (oz3 oz3Var : lv0.j0(1, upperBounds)) {
                sy4 name = d58Var.getName();
                name.getClass();
                StringBuilder sb2 = new StringBuilder(N(name, false));
                sb2.append(" : ");
                oz3Var.getClass();
                sb2.append(X(oz3Var));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(H("where"));
        sb.append(" ");
        lv0.s0(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // o.so1
    public final void i() {
        this.a.i();
    }

    @Override // o.so1
    public final Set j() {
        return this.a.j();
    }

    @Override // o.so1
    public final void k() {
        this.a.k();
    }

    @Override // o.so1
    public final void l() {
        this.a.l();
    }

    @Override // o.so1
    public final void m(tf5 tf5Var) {
        this.a.m(tf5Var);
    }

    public final String n(String str) {
        return r().a(str);
    }

    public final at0 o() {
        to1 to1Var = this.a.b;
        uo1.Y[0].getClass();
        return (at0) to1Var.m;
    }

    public final Set p() {
        to1 to1Var = this.a.e;
        fw3 fw3Var = uo1.Y[3];
        to1Var.getClass();
        fw3Var.getClass();
        return (Set) to1Var.m;
    }

    public final boolean q() {
        to1 to1Var = this.a.f;
        fw3 fw3Var = uo1.Y[4];
        to1Var.getClass();
        fw3Var.getClass();
        return ((Boolean) to1Var.m).booleanValue();
    }

    public final qa6 r() {
        to1 to1Var = this.a.D;
        fw3 fw3Var = uo1.Y[28];
        to1Var.getClass();
        fw3Var.getClass();
        return (qa6) to1Var.m;
    }

    public final oo1 s() {
        to1 to1Var = this.a.C;
        fw3 fw3Var = uo1.Y[27];
        to1Var.getClass();
        fw3Var.getClass();
        return (oo1) to1Var.m;
    }

    public final boolean t() {
        to1 to1Var = this.a.j;
        fw3 fw3Var = uo1.Y[8];
        to1Var.getClass();
        fw3Var.getClass();
        return ((Boolean) to1Var.m).booleanValue();
    }

    public final String v(fi1 fi1Var) {
        fi1 fi1VarI;
        String str;
        StringBuilder sb = new StringBuilder();
        fi1Var.o(new xk1((Object) this, (byte) 2), sb);
        uo1 uo1Var = this.a;
        to1 to1Var = uo1Var.c;
        fw3[] fw3VarArr = uo1.Y;
        fw3VarArr[1].getClass();
        if (((Boolean) to1Var.m).booleanValue() && !(fi1Var instanceof ad5) && !(fi1Var instanceof b54) && (fi1VarI = fi1Var.i()) != null && !(fi1VarI instanceof ps4)) {
            sb.append(" ");
            int iOrdinal = r().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    gk0.s();
                    return null;
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            it2 it2VarG = zo1.g(fi1VarI);
            it2VarG.getClass();
            sb.append(it2VarG.a.isEmpty() ? "root package" : n(lq1.B(it2VarG.e())));
            to1 to1Var2 = uo1Var.d;
            fw3VarArr[2].getClass();
            if (((Boolean) to1Var2.m).booleanValue() && (fi1VarI instanceof ad5) && (fi1Var instanceof hi1)) {
                ((hi1) fi1Var).c().getClass();
            }
        }
        return sb.toString();
    }

    public final String w(hp hpVar, pp ppVar) throws IOException {
        wr0 wr0VarU0;
        List listJ;
        hpVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (ppVar != null) {
            sb.append(ppVar.m + ':');
        }
        oz3 type = hpVar.getType();
        sb.append(X(type));
        uo1 uo1Var = this.a;
        if (uo1Var.n().m) {
            Map mapE = hpVar.e();
            to1 to1Var = uo1Var.I;
            fw3 fw3Var = uo1.Y[33];
            to1Var.getClass();
            fw3Var.getClass();
            List list = null;
            ns4 ns4VarD = ((Boolean) to1Var.m).booleanValue() ? bp1.d(hpVar) : null;
            if (ns4VarD != null && (wr0VarU0 = ns4VarD.u0()) != null && (listJ = wr0VarU0.J()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listJ) {
                    if (((qb8) obj).E0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((qb8) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = ea2.m;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapE.containsKey((sy4) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(mv0.Z(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((sy4) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapE.entrySet();
            ArrayList arrayList5 = new ArrayList(mv0.Z(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                sy4 sy4Var = (sy4) entry.getKey();
                u51 u51Var = (u51) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sy4Var.b());
                sb2.append(" = ");
                sb2.append(!list.contains(sy4Var) ? A(u51Var) : "...");
                arrayList5.add(sb2.toString());
            }
            List listI0 = lv0.I0(lv0.A0(arrayList4, arrayList5));
            if (uo1Var.n().n || !listI0.isEmpty()) {
                lv0.s0(listI0, sb, ", ", "(", ")", null, 112);
            }
        }
        if (t() && (ct1.K(type) || (type.o0().a() instanceof c55))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public final void x(StringBuilder sb, so soVar, pp ppVar) {
        Set setJ;
        if (p().contains(ro1.ANNOTATIONS)) {
            boolean z = soVar instanceof oz3;
            uo1 uo1Var = this.a;
            if (z) {
                setJ = uo1Var.j();
            } else {
                to1 to1Var = uo1Var.K;
                fw3 fw3Var = uo1.Y[35];
                to1Var.getClass();
                fw3Var.getClass();
                setJ = (Set) to1Var.m;
            }
            to1 to1Var2 = uo1Var.M;
            fw3 fw3Var2 = uo1.Y[37];
            to1Var2.getClass();
            fw3Var2.getClass();
            Function1 function1 = (Function1) to1Var2.m;
            for (hp hpVar : soVar.getAnnotations()) {
                if (!lv0.h0(setJ, hpVar.d()) && !im3.n(hpVar.d(), s87.r) && (function1 == null || ((Boolean) function1.invoke(hpVar)).booleanValue())) {
                    sb.append(w(hpVar, ppVar));
                    to1 to1Var3 = uo1Var.J;
                    fw3 fw3Var3 = uo1.Y[34];
                    to1Var3.getClass();
                    fw3Var3.getClass();
                    if (((Boolean) to1Var3.m).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public final void z(zs0 zs0Var, StringBuilder sb) {
        List listK0 = zs0Var.k0();
        listK0.getClass();
        List parameters = zs0Var.q().getParameters();
        parameters.getClass();
        if (t() && zs0Var.g() && parameters.size() > listK0.size()) {
            sb.append(" /*captured type parameters: ");
            b0(sb, parameters.subList(listK0.size(), parameters.size()));
            sb.append("*/");
        }
    }
}
