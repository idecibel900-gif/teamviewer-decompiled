package o;

import android.content.Context;
import android.content.res.Resources;
import android.net.NetworkRequest;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import com.journeyapps.barcodescanner.BarcodeView;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class io1 {
    public static int a;
    public static on3 b;
    public static el5 c;

    public static void A(Object obj, String str) {
        if (obj != null) {
            return;
        }
        yq4.l(str);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final mj0 B(hw3 hw3Var, boolean z) {
        ms3 ms3Var;
        Method method;
        mj0 xj0Var;
        bt3 bt3Var;
        mj0 zj0Var;
        Method methodN;
        if (ou3.m.c(hw3Var.B().t)) {
            return fv7.a;
        }
        js0 js0Var = og6.a;
        zu1 zu1VarB = og6.b(hw3Var.B().w());
        int i = 6;
        byte b2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if (zu1VarB instanceof ws3) {
            ws3 ws3Var = (ws3) zu1VarB;
            ty4 ty4Var = ws3Var.g;
            dt3 dt3Var = ws3Var.f;
            int i2 = dt3Var.n;
            int i3 = 4;
            if (z) {
                if ((i2 & 4) == 4) {
                    bt3Var = dt3Var.q;
                } else {
                    bt3Var = null;
                }
            } else if ((i2 & 8) == 8) {
                bt3Var = dt3Var.r;
            } else {
                bt3Var = null;
            }
            Method methodI = bt3Var != null ? hw3Var.B().r.i(ty4Var.getString(bt3Var.f453o), ty4Var.getString(bt3Var.p)) : null;
            if (methodI != null) {
                if (!Modifier.isStatic(methodI.getModifiers())) {
                    zj0Var = hw3Var.z() ? new xj0(methodI, hw3Var.B().B()) : new bk0(b2, i, methodI, objArr7 == true ? 1 : 0);
                } else if (hw3Var.B().w().getAnnotations().o0(pa8.a)) {
                    zj0Var = hw3Var.z() ? new yj0(methodI, objArr6 == true ? 1 : 0, i3) : new bk0((byte) 1, i3, methodI, 1 == true ? 1 : 0);
                } else {
                    zj0Var = hw3Var.z() ? new zj0(methodI, hw3Var.B().B()) : new bk0((byte) 2, i, methodI, objArr5 == true ? 1 : 0);
                }
                xj0Var = zj0Var;
            } else if (pi3.d(hw3Var.B().w()) && im3.n(hw3Var.B().w().e(), dp1.d)) {
                Class clsV = n67.v(hw3Var.B().w().i());
                if (clsV == null || (methodN = n67.n(clsV, hw3Var.B().w())) == null) {
                    throw new kz3("Underlying property of inline class " + hw3Var.B() + " should have a field");
                }
                xj0Var = hw3Var.z() ? new vl3(methodN, hw3Var.B().B()) : new wl3(methodN, qf0.K(methodN.getDeclaringClass()));
            } else {
                Field field = (Field) hw3Var.B().v.getValue();
                if (field == null) {
                    gk0.k(hw3Var.B(), "No accessors or field is found for property ");
                    return null;
                }
                xj0Var = C(hw3Var, z, field);
            }
        } else if (zu1VarB instanceof us3) {
            xj0Var = C(hw3Var, z, ((us3) zu1VarB).d);
        } else {
            if (!(zu1VarB instanceof vs3)) {
                if (!(zu1VarB instanceof xs3)) {
                    gk0.s();
                    return null;
                }
                if (z) {
                    ms3Var = ((xs3) zu1VarB).d;
                } else {
                    ms3Var = ((xs3) zu1VarB).e;
                    if (ms3Var == null) {
                        gk0.k(hw3Var.B(), "No setter found for property ");
                        return null;
                    }
                }
                ou3 ou3Var = hw3Var.B().r;
                os3 os3Var = ms3Var.d;
                Method methodI2 = ou3Var.i(os3Var.e, os3Var.f);
                if (methodI2 != null) {
                    Modifier.isStatic(methodI2.getModifiers());
                    return hw3Var.z() ? new xj0(methodI2, hw3Var.B().B()) : new bk0(objArr2 == true ? 1 : 0, i, methodI2, objArr == true ? 1 : 0);
                }
                gk0.k(hw3Var.B(), "No accessor found for property ");
                return null;
            }
            if (z) {
                method = ((vs3) zu1VarB).d;
            } else {
                vs3 vs3Var = (vs3) zu1VarB;
                method = vs3Var.e;
                if (method == null) {
                    gk0.k(vs3Var.d, "No source found for setter of Java method property: ");
                    return null;
                }
            }
            xj0Var = hw3Var.z() ? new xj0(method, hw3Var.B().B()) : new bk0(objArr4 == true ? 1 : 0, i, method, objArr3 == true ? 1 : 0);
        }
        return n67.j(hw3Var.A(), xj0Var, false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ck0 C(hw3 hw3Var, boolean z, Field field) {
        bu5 bu5VarC = hw3Var.B().w();
        fi1 fi1VarI = bu5VarC.i();
        fi1VarI.getClass();
        boolean z2 = true;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        char c5 = 1;
        char c6 = 1;
        byte b2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (zo1.l(fi1VarI)) {
            fi1 fi1VarI2 = fi1VarI.i();
            if ((zo1.n(fi1VarI2, ms0.n) || zo1.n(fi1VarI2, ms0.q)) && (!(bu5VarC instanceof cq1) || !kt3.d(((cq1) bu5VarC).M))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    if (hw3Var.B().w().getAnnotations().o0(pa8.a)) {
                        byte b3 = 2;
                        if (z) {
                        }
                    }
                    if (z) {
                        if (hw3Var.z()) {
                        }
                    }
                    if (hw3Var.z()) {
                    }
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            if (hw3Var.B().w().getAnnotations().o0(pa8.a)) {
                byte b4 = 2;
                return z ? new rj0(field, objArr2 == true ? 1 : 0, b4) : new vj0(field, D(hw3Var), objArr == true ? 1 : 0, b4);
            }
            if (z) {
                return hw3Var.z() ? new qj0(field, false) : new rj0(field, c5 == true ? 1 : 0, c4 == true ? 1 : 0);
            }
            return hw3Var.z() ? new uj0(field, D(hw3Var), false) : new vj0(field, D(hw3Var), c3 == true ? 1 : 0, c2 == true ? 1 : 0);
        }
        if (z) {
            return hw3Var.z() ? new pj0(field, hw3Var.B().B()) : new rj0(field, z2, b2);
        }
        return hw3Var.z() ? new tj0(field, D(hw3Var), hw3Var.B().B()) : new vj0(field, D(hw3Var), c6 == true ? 1 : 0, objArr3 == true ? 1 : 0);
    }

    public static final boolean D(hw3 hw3Var) {
        return !p58.e(hw3Var.B().w().getType());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static String E(xw2 xw2Var, int i) {
        String strB;
        dk0 dk0Var = dk0.f630o;
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        xw2Var.getClass();
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (xw2Var instanceof z61) {
                strB = "<init>";
            } else {
                strB = ((gi1) xw2Var).getName().b();
                strB.getClass();
            }
            sb.append(strB);
        }
        sb.append("(");
        v14 v14VarS = xw2Var.S();
        if (v14VarS != null) {
            oz3 type = v14VarS.getType();
            type.getClass();
            sb.append((pt3) au8.G(type, c58.k, dk0Var));
        }
        Iterator it = xw2Var.J().iterator();
        while (it.hasNext()) {
            oz3 type2 = ((qb8) it.next()).getType();
            type2.getClass();
            sb.append((pt3) au8.G(type2, c58.k, dk0Var));
        }
        sb.append(")");
        if (z) {
            if (xw2Var instanceof z61) {
                sb.append("V");
            } else {
                oz3 returnType = xw2Var.getReturnType();
                returnType.getClass();
                sy4 sy4Var = wy3.e;
                if (wy3.D(returnType, s87.d)) {
                    oz3 returnType2 = xw2Var.getReturnType();
                    returnType2.getClass();
                    if (!p58.e(returnType2) && !(xw2Var instanceof eu5)) {
                        sb.append("V");
                    }
                }
                oz3 returnType3 = xw2Var.getReturnType();
                returnType3.getClass();
                sb.append((pt3) au8.G(returnType3, c58.k, dk0Var));
            }
        }
        return sb.toString();
    }

    public static final String F(xi0 xi0Var) {
        if (!zo1.o(xi0Var)) {
            fi1 fi1VarI = xi0Var.i();
            ns4 ns4Var = fi1VarI instanceof ns4 ? (ns4) fi1VarI : null;
            if (ns4Var != null && !ns4Var.getName().n) {
                xi0 xi0VarA = xi0Var.a();
                c07 c07Var = xi0VarA instanceof c07 ? (c07) xi0VarA : null;
                if (c07Var != null) {
                    String strE = E(c07Var, 3);
                    String str = mo3.a;
                    it2 it2VarI = bp1.g(ns4Var).i();
                    it2VarI.getClass();
                    js0 js0VarG = mo3.g(it2VarI);
                    return (js0VarG != null ? fs3.e(js0VarG) : au8.w(ns4Var, xz2.Y)) + '.' + strE;
                }
            }
        }
        return null;
    }

    public static final boolean G(g42 g42Var, long j) {
        if (!g42Var.m.z) {
            return false;
        }
        ti3 ti3Var = (ti3) vn4.p0(g42Var).S.d;
        if (!ti3Var.q0.z) {
            return false;
        }
        long jP = ti3Var.P(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jP >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jP & 4294967295L));
        long j2 = g42Var.C;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    public static ax2 H(tw2 tw2Var, boolean z) {
        String lowerCase;
        tw2Var.getClass();
        List list = tw2Var.w;
        ax2 ax2Var = new ax2(tw2Var, null, 1, z);
        v14 v14VarQ0 = tw2Var.q0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((d58) obj).B() != ub8.p) {
                break;
            }
            arrayList.add(obj);
        }
        ex exVarU0 = lv0.U0(arrayList);
        ArrayList arrayList2 = new ArrayList(mv0.Z(exVarU0, 10));
        Iterator it = exVarU0.iterator();
        while (true) {
            p62 p62Var = (p62) it;
            if (!p62Var.n.hasNext()) {
                g07 g07VarW = ((d58) lv0.v0(list)).W();
                as4 as4Var = as4.q;
                cp1 cp1Var = dp1.e;
                ea2 ea2Var = ea2.m;
                ax2Var.H0(null, v14VarQ0, ea2Var, ea2Var, arrayList2, g07VarW, as4Var, cp1Var);
                ax2 ax2Var2 = ax2Var;
                ax2Var2.I = true;
                return ax2Var2;
            }
            sg3 sg3Var = (sg3) p62Var.next();
            int i = sg3Var.a;
            d58 d58Var = (d58) sg3Var.b;
            String strB = d58Var.getName().b();
            strB.getClass();
            if (strB.equals("T")) {
                lowerCase = "instance";
            } else if (strB.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            ax2 ax2Var3 = ax2Var;
            tp tpVar = yl7.p;
            sy4 sy4VarE = sy4.e(lowerCase);
            g07 g07VarW2 = d58Var.W();
            g07VarW2.getClass();
            arrayList2.add(new qb8(ax2Var3, null, i, tpVar, sy4VarE, g07VarW2, false, false, false, null, s67.h));
            ax2Var = ax2Var3;
        }
    }

    public static v14 I(xi0 xi0Var, oz3 oz3Var, sy4 sy4Var, up upVar, int i) {
        if (upVar == null) {
            a(33);
            throw null;
        }
        if (oz3Var == null) {
            return null;
        }
        xb1 xb1Var = new xb1(xi0Var, oz3Var, sy4Var);
        e96 e96Var = uy4.a;
        return new v14(xi0Var, xb1Var, upVar, sy4.e(uy4.b + '_' + i));
    }

    public static eu5 J(bu5 bu5Var, up upVar) {
        return P(bu5Var, upVar, true, bu5Var.c());
    }

    public static ju5 K(bu5 bu5Var, up upVar) {
        tp tpVar = yl7.p;
        s67 s67VarC = bu5Var.c();
        if (s67VarC != null) {
            return R(bu5Var, upVar, tpVar, true, bu5Var.e(), s67VarC);
        }
        a(6);
        throw null;
    }

    public static du5 L(ns4 ns4Var) {
        if (ns4Var == null) {
            a(26);
            throw null;
        }
        ps4 ps4VarD = zo1.d(ns4Var);
        ps4VarD.getClass();
        ns4 ns4VarQ = vs1.q(ps4VarD, p87.w);
        if (ns4VarQ == null) {
            return null;
        }
        tp tpVar = yl7.p;
        cp1 cp1Var = dp1.e;
        sy4 sy4Var = t87.b;
        s67 s67VarC = ns4Var.c();
        as4 as4Var = as4.n;
        du5 du5VarE0 = du5.E0(ns4Var, as4Var, cp1Var, false, sy4Var, 4, s67VarC);
        eu5 eu5Var = new eu5(du5VarE0, tpVar, as4Var, cp1Var, false, false, false, 4, null, ns4Var.c());
        du5VarE0.H0(eu5Var, null, null, null);
        g48.n.getClass();
        g48 g48Var = g48.f858o;
        k48 k48VarQ = ns4VarQ.q();
        List listSingletonList = Collections.singletonList(new w87(ns4Var.W()));
        g48Var.getClass();
        k48VarQ.getClass();
        listSingletonList.getClass();
        g07 g07VarP = bt1.P(listSingletonList, g48Var, k48VarQ, false);
        List list = Collections.EMPTY_LIST;
        du5VarE0.K0(g07VarP, list, null, null, list);
        eu5Var.F0(du5VarE0.getReturnType());
        return du5VarE0;
    }

    public static c07 M(ns4 ns4Var) {
        if (ns4Var == null) {
            a(24);
            throw null;
        }
        tp tpVar = yl7.p;
        c07 c07VarN0 = c07.N0(ns4Var, t87.c, 4, ns4Var.c());
        qb8 qb8Var = new qb8(c07VarN0, null, 0, tpVar, sy4.e("value"), bp1.e(ns4Var).u(), false, false, false, null, ns4Var.c());
        List list = Collections.EMPTY_LIST;
        return c07VarN0.H0(null, null, list, list, Collections.singletonList(qb8Var), ns4Var.W(), as4.n, dp1.e);
    }

    public static c07 N(ns4 ns4Var) {
        if (ns4Var == null) {
            a(22);
            throw null;
        }
        c07 c07VarN0 = c07.N0(ns4Var, t87.a, 4, ns4Var.c());
        List list = Collections.EMPTY_LIST;
        return c07VarN0.H0(null, null, list, list, list, bp1.e(ns4Var).g(ns4Var.W()), as4.n, dp1.e);
    }

    public static v14 O(xi0 xi0Var, oz3 oz3Var, up upVar) {
        if (oz3Var == null) {
            return null;
        }
        return new v14(xi0Var, new yf2(xi0Var, oz3Var), upVar);
    }

    public static eu5 P(bu5 bu5Var, up upVar, boolean z, s67 s67Var) {
        if (upVar == null) {
            a(18);
            throw null;
        }
        if (s67Var != null) {
            return new eu5(bu5Var, upVar, bu5Var.r(), bu5Var.e(), z, false, false, 1, null, s67Var);
        }
        a(19);
        throw null;
    }

    public static a35 Q(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                we4 we4VarF = we4.f();
                String str = a35.b;
                we4VarF.k(a35.b, fx3.f(i, "Ignoring adding capability '", "'"), e);
            }
        }
        int[] iArr3 = e8.p;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr3[i2];
            if (!cx.C0(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    we4 we4VarF2 = we4.f();
                    String str2 = a35.b;
                    we4VarF2.k(a35.b, fx3.f(i3, "Ignoring removing default capability '", "'"), e2);
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest networkRequestBuild = builder.build();
        networkRequestBuild.getClass();
        return new a35(networkRequestBuild);
    }

    public static ju5 R(bu5 bu5Var, up upVar, up upVar2, boolean z, cp1 cp1Var, s67 s67Var) {
        if (upVar == null) {
            a(8);
            throw null;
        }
        if (upVar2 == null) {
            a(9);
            throw null;
        }
        if (cp1Var == null) {
            a(10);
            throw null;
        }
        if (s67Var == null) {
            a(11);
            throw null;
        }
        ju5 ju5Var = new ju5(bu5Var, upVar, bu5Var.r(), cp1Var, z, false, false, 1, null, s67Var);
        ju5Var.y = ju5.E0(ju5Var, bu5Var.getType(), upVar2);
        return ju5Var;
    }

    public static final boolean S(br2 br2Var, m5 m5Var) {
        int iOrdinal = br2Var.Z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                br2 br2VarL = xs1.L(br2Var);
                if (br2VarL != null) {
                    return S(br2VarL, m5Var) || T(br2Var, br2VarL, 1, m5Var);
                }
                hk0.l("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return br2Var.W0().a ? ((Boolean) m5Var.invoke(br2Var)).booleanValue() : a0(br2Var, m5Var);
                }
                gk0.s();
                return false;
            }
        }
        return a0(br2Var, m5Var);
    }

    public static final boolean T(final br2 br2Var, final br2 br2Var2, final int i, final m5 m5Var) {
        if (f0(br2Var, br2Var2, i, m5Var)) {
            return true;
        }
        final br2 br2VarG = ((lq2) vn4.q0(br2Var).getFocusOwner()).g();
        Boolean bool = (Boolean) im3.a0(br2Var, i, new Function1() { // from class: o.b95
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                s50 s50Var = (s50) obj;
                br2 br2Var3 = br2Var;
                if (br2VarG != ((lq2) vn4.q0(br2Var3).getFocusOwner()).g()) {
                    return Boolean.TRUE;
                }
                boolean zF0 = io1.f0(br2Var3, br2Var2, i, m5Var);
                Boolean boolValueOf = Boolean.valueOf(zF0);
                if (zF0 || !s50Var.a()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static el5 U() {
        el5 el5Var = c;
        if (el5Var != null) {
            return el5Var;
        }
        im3.e0("factory");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object V(gv7 gv7Var, iw2 iw2Var, Throwable th, jc1 jc1Var) {
        ro2 ro2Var;
        if (jc1Var instanceof ro2) {
            ro2Var = (ro2) jc1Var;
            int i = ro2Var.f1938o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ro2Var.f1938o = i - Integer.MIN_VALUE;
            } else {
                ro2Var = new ro2(jc1Var);
            }
        } else {
            ro2Var = new ro2(jc1Var);
        }
        Object obj = ro2Var.n;
        int i2 = ro2Var.f1938o;
        try {
            if (i2 == 0) {
                ct1.a0(obj);
                ro2Var.m = th;
                ro2Var.f1938o = 1;
                Object objD = iw2Var.d(gv7Var, th, ro2Var);
                Object obj2 = ne1.m;
                if (objD == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = ro2Var.m;
                ct1.a0(obj);
            }
            return f88.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                ct1.q(th2, th);
            }
            throw th2;
        }
    }

    public static boolean W(xw2 xw2Var) {
        if (xw2Var.k() != 4) {
            return false;
        }
        fi1 fi1VarI = xw2Var.i();
        int i = zo1.a;
        return zo1.n(fi1VarI, ms0.f1501o);
    }

    public static final boolean X(LayoutNode layoutNode) {
        if (layoutNode.u == null) {
            return false;
        }
        LayoutNode layoutNodeF = layoutNode.F();
        return (layoutNodeF != null ? layoutNodeF.u : null) == null || layoutNode.getLayoutDelegate().b;
    }

    public static final l33 Y(List list, l33 l33Var) {
        k33 k33Var;
        l33 l33Var2 = null;
        Object obj = null;
        l33Var2 = null;
        if (l33Var != null && (k33Var = l33Var.a) != null) {
            for (Object obj2 : list) {
                if (im3.n(((l33) obj2).a, k33Var)) {
                    obj = obj2;
                    break;
                }
            }
            l33Var2 = (l33) obj;
            if (l33Var2 == null) {
                return l33Var;
            }
        }
        return l33Var2;
    }

    public static final boolean Z(br2 br2Var, m5 m5Var) {
        Object[] objArr = new br2[16];
        if (!br2Var.m.z) {
            ki3.c("visitChildren called on an unattached node");
        }
        xx4 xx4Var = new xx4(new es4[16]);
        es4 es4Var = br2Var.m;
        es4 es4Var2 = es4Var.r;
        if (es4Var2 == null) {
            vn4.V(xx4Var, es4Var);
        } else {
            xx4Var.b(es4Var2);
        }
        int i = 0;
        while (true) {
            int i2 = xx4Var.f2559o;
            if (i2 == 0) {
                break;
            }
            es4 es4VarL0 = (es4) xx4Var.k(i2 - 1);
            if ((es4VarL0.p & 1024) == 0) {
                vn4.V(xx4Var, es4VarL0);
            } else {
                while (es4VarL0 != null) {
                    if ((es4VarL0.f737o & 1024) != 0) {
                        xx4 xx4Var2 = null;
                        while (es4VarL0 != null) {
                            if (es4VarL0 instanceof br2) {
                                br2 br2Var2 = (br2) es4VarL0;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = br2Var2;
                                i = i3;
                            } else if ((es4VarL0.f737o & 1024) != 0 && (es4VarL0 instanceof vm1)) {
                                int i4 = 0;
                                for (es4 es4Var3 = ((vm1) es4VarL0).B; es4Var3 != null; es4Var3 = es4Var3.r) {
                                    if ((es4Var3.f737o & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            es4VarL0 = es4Var3;
                                        } else {
                                            if (xx4Var2 == null) {
                                                xx4Var2 = new xx4(new es4[16]);
                                            }
                                            if (es4VarL0 != null) {
                                                xx4Var2.b(es4VarL0);
                                                es4VarL0 = null;
                                            }
                                            xx4Var2.b(es4Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            es4VarL0 = vn4.l0(xx4Var2);
                        }
                        break;
                    }
                    es4VarL0 = es4VarL0.r;
                }
            }
        }
        Arrays.sort(objArr, 0, i, gj2.f899o);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                br2 br2Var3 = (br2) objArr[i5];
                if (xs1.R(br2Var3) && y(br2Var3, m5Var)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case ep1.b /* 9 */:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[0] = "sourceElement";
                break;
            case ep1.c /* 10 */:
                objArr[0] = "visibility";
                break;
            case ep1.d /* 12 */:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
                objArr[2] = "createSetter";
                break;
            case ep1.d /* 12 */:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static final boolean a0(br2 br2Var, m5 m5Var) {
        Object[] objArr = new br2[16];
        if (!br2Var.m.z) {
            ki3.c("visitChildren called on an unattached node");
        }
        xx4 xx4Var = new xx4(new es4[16]);
        es4 es4Var = br2Var.m;
        es4 es4Var2 = es4Var.r;
        if (es4Var2 == null) {
            vn4.V(xx4Var, es4Var);
        } else {
            xx4Var.b(es4Var2);
        }
        int i = 0;
        while (true) {
            int i2 = xx4Var.f2559o;
            if (i2 == 0) {
                break;
            }
            es4 es4VarL0 = (es4) xx4Var.k(i2 - 1);
            if ((es4VarL0.p & 1024) == 0) {
                vn4.V(xx4Var, es4VarL0);
            } else {
                while (es4VarL0 != null) {
                    if ((es4VarL0.f737o & 1024) != 0) {
                        xx4 xx4Var2 = null;
                        while (es4VarL0 != null) {
                            if (es4VarL0 instanceof br2) {
                                br2 br2Var2 = (br2) es4VarL0;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = br2Var2;
                                i = i3;
                            } else if ((es4VarL0.f737o & 1024) != 0 && (es4VarL0 instanceof vm1)) {
                                int i4 = 0;
                                for (es4 es4Var3 = ((vm1) es4VarL0).B; es4Var3 != null; es4Var3 = es4Var3.r) {
                                    if ((es4Var3.f737o & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            es4VarL0 = es4Var3;
                                        } else {
                                            if (xx4Var2 == null) {
                                                xx4Var2 = new xx4(new es4[16]);
                                            }
                                            if (es4VarL0 != null) {
                                                xx4Var2.b(es4VarL0);
                                                es4VarL0 = null;
                                            }
                                            xx4Var2.b(es4Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            es4VarL0 = vn4.l0(xx4Var2);
                        }
                        break;
                    }
                    es4VarL0 = es4VarL0.r;
                }
            }
        }
        Arrays.sort(objArr, 0, i, gj2.f899o);
        for (int i5 = 0; i5 < i; i5++) {
            br2 br2Var3 = (br2) objArr[i5];
            if (xs1.R(br2Var3) && S(br2Var3, m5Var)) {
                return true;
            }
        }
        return false;
    }

    public static final void b(BarcodeView barcodeView, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2 ux2Var2;
        ux2Var.Y(-714526452);
        int i2 = (ux2Var.h(barcodeView) ? 4 : 2) | i;
        byte b2 = 0;
        if (ux2Var.N(i2 & 1, (i2 & 19) != 18)) {
            boolean zH = ux2Var.h(barcodeView);
            Object objK = ux2Var.K();
            if (zH || objK == e01.a) {
                objK = new xx5(barcodeView, b2);
                ux2Var.g0(objK);
            }
            fs4Var2 = fs4Var;
            ux2Var2 = ux2Var;
            di1.b((Function1) objK, fs4Var2, null, ux2Var2, 48, 4);
        } else {
            fs4Var2 = fs4Var;
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new l64((byte) 14, i, barcodeView, fs4Var2);
        }
    }

    public static TypedValue b0(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public static final void c(h71 h71Var, xv1 xv1Var, gw1 gw1Var, boolean z, Function0 function0, Function1 function1, Function1 function2, Function1 function3, vx6 vx6Var, Function1 function4, Function1 function5, Function0 function6, Function1 function7, Function0 function8, ux2 ux2Var, int i, int i2) {
        int i3;
        vs1 oz1Var;
        ?? r15;
        f88 f88Var;
        ux2Var.Y(-951307680);
        int i4 = (ux2Var.h(h71Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= ux2Var.h(xv1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= ux2Var.h(gw1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= ux2Var.g(z) ? 2048 : 1024;
        }
        int i5 = i4 | (ux2Var.h(function0) ? 16384 : 8192) | (ux2Var.h(function1) ? 131072 : 65536) | (ux2Var.h(function2) ? 1048576 : 524288) | (ux2Var.h(function3) ? 8388608 : 4194304) | (ux2Var.f(vx6Var) ? 67108864 : 33554432);
        if ((i & 805306368) == 0) {
            i5 |= ux2Var.h(function4) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (ux2Var.h(function5) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.h(function6) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.h(function7) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.h(function8) ? 2048 : 1024;
        }
        int i6 = i3;
        byte b2 = 1;
        byte b3 = 0;
        if (ux2Var.N(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            if (xv1Var.d) {
                oz1Var = new nz1(new qv1(function7, b3), xv1Var.a, xv1Var.b, new rv1(function7, xv1Var, b3));
            } else {
                boolean z2 = !z;
                a9 a9Var = new a9(function6, (byte) 27);
                h71 h71Var2 = gw1Var.a;
                oz1Var = new oz1(z2, a9Var, (h71Var2 != null ? h71Var2.t : null) == b91.m, new qv1(function7, b2));
            }
            xs1.c(oz1Var, null, ux2Var, 8, 2);
            if (h71Var == null) {
                ux2Var.W(2083127228);
                ux2Var.p(false);
                r15 = 0;
                f88Var = null;
            } else {
                ux2Var.W(2083127229);
                r15 = 0;
                qf0.g(h71Var, xv1Var.d, function1, function3, function0, null, function2, function4, function5, vx6Var, function8, null, ux2Var, ((i5 >> 9) & 896) | ((i5 >> 12) & 7168) | (i5 & 57344) | (i5 & 3670016) | (29360128 & (i5 >> 6)) | ((i6 << 24) & 234881024) | ((i5 << 3) & 1879048192), (i6 >> 9) & 14);
                ux2Var.p(false);
                f88Var = f88.a;
            }
            if (f88Var == null) {
                ux2Var.W(621403273);
                wo1.d(m77.z(R.string.device_tab_contact_details_empty_message, ux2Var), ux2Var, r15);
                ux2Var.p(r15);
            } else {
                ux2Var.W(621386843);
                ux2Var.p(r15);
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pv1(h71Var, xv1Var, gw1Var, z, function0, function1, function2, function3, vx6Var, function4, function5, function6, function7, function8, i, i2);
        }
    }

    public static boolean c0(Context context, int i, boolean z) {
        TypedValue typedValueB0 = b0(context, i);
        if (typedValueB0 == null || typedValueB0.type != 18) {
            return z;
        }
        return typedValueB0.data != 0;
    }

    public static final void d(boolean z, ns1 ns1Var, xv1 xv1Var, List list, Function0 function0, Function0 function1, Function1 function2, Function1 function3, Function1 function4, vx6 vx6Var, Function1 function5, Function0 function6, Function1 function7, Function1 function8, ux2 ux2Var, int i, int i2) {
        int i3;
        ns1 ns1Var2;
        int i4;
        vs1 pz1Var;
        ux2Var.Y(328199695);
        if ((i & 6) == 0) {
            i3 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            ns1Var2 = ns1Var;
            i3 |= ux2Var.h(ns1Var2) ? 32 : 16;
        } else {
            ns1Var2 = ns1Var;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.h(xv1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? ux2Var.f(list) : ux2Var.h(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ux2Var.h(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ux2Var.h(function1) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ux2Var.h(function2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= ux2Var.h(function3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= ux2Var.h(function4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= (i & 1073741824) == 0 ? ux2Var.f(vx6Var) : ux2Var.h(vx6Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ux2Var.h(function5) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ux2Var.h(function6) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ux2Var.h(function7) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ux2Var.h(function8) ? 2048 : 1024;
        }
        int i5 = i4;
        if (ux2Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            String strZ = m77.z(R.string.device_tab_device_details_title, ux2Var);
            if (xv1Var == null || !xv1Var.d || function5 == null) {
                pz1Var = new pz1(new ur(strZ), !z, new a9(function0, (byte) 28), function5 != null ? new qv1(function5, (byte) 3) : null);
            } else {
                pz1Var = new qz1(new qv1(function5, (byte) 2), xv1Var.a, xv1Var.b, new rv1(function5, xv1Var, (byte) 1));
            }
            xs1.c(pz1Var, null, ux2Var, 8, 2);
            int i6 = i3 >> 3;
            int i7 = i5 << 18;
            vt1.a(ns1Var2, xv1Var.d, function2, function4, function1, list, null, function3, function7, function8, function6, null, vx6Var, null, ux2Var, (i6 & 57344) | (i6 & 14) | ((i3 >> 12) & 896) | ((i3 >> 15) & 7168) | (458752 & (i3 << 6)) | (i3 & 29360128) | (234881024 & i7) | (i7 & 1879048192), ((i5 >> 3) & 14) | ((i3 >> 21) & 896), 10304);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pv1(z, ns1Var, xv1Var, list, function0, function1, function2, function3, function4, vx6Var, function5, function6, function7, function8, i, i2);
        }
    }

    public static int d0(View view, int i) {
        Context context = view.getContext();
        String canonicalName = view.getClass().getCanonicalName();
        TypedValue typedValueB0 = b0(context, i);
        if (typedValueB0 != null) {
            return typedValueB0.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", canonicalName, context.getResources().getResourceName(i)));
    }

    /* JADX WARN: Code duplicated, block: B:207:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:208:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:210:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:211:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:214:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:215:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:221:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:224:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:226:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:228:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:229:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:232:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:233:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:237:0x04ff  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v30 */
    public static final void e(final gw1 gw1Var, final lr0 lr0Var, final l33 l33Var, final xv1 xv1Var, final boolean z, final String str, final boolean z2, final Function1 function1, final Function1 function2, final Function0 function0, final Function0 function3, final Function0 function4, final Function0 function5, final Function0 function6, final Function0 function7, final Function1 function8, final Function1 function9, final Function1 function10, final Function1 function11, final Function1 function12, final List list, final fs4 fs4Var, final Function1 function13, final List list2, final gl4 gl4Var, ux2 ux2Var, final int i) {
        byte b2;
        aw awVar;
        Function0 function14;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objK;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objK2;
        aw awVar2;
        int i2;
        boolean z11;
        f88 f88Var;
        aw awVar3;
        aw awVar4;
        int i3;
        boolean z12;
        boolean z13;
        Function0 function15;
        Function0 function16;
        ux2 ux2Var2 = ux2Var;
        gw1Var.getClass();
        lr0Var.getClass();
        xv1Var.getClass();
        str.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        function7.getClass();
        function8.getClass();
        function9.getClass();
        function10.getClass();
        function11.getClass();
        function12.getClass();
        list.getClass();
        ux2Var2.Y(362973257);
        int i4 = i | (ux2Var2.h(gw1Var) ? 4 : 2) | (ux2Var2.h(lr0Var) ? 32 : 16) | (ux2Var2.h(l33Var) ? 256 : 128) | (ux2Var2.h(xv1Var) ? 2048 : 1024) | (ux2Var2.g(z) ? 16384 : 8192) | (ux2Var2.f(str) ? 131072 : 65536) | (ux2Var2.g(z2) ? 1048576 : 524288) | (ux2Var2.h(function1) ? 8388608 : 4194304) | (ux2Var2.h(function2) ? 67108864 : 33554432) | (ux2Var2.h(function0) ? 536870912 : 268435456);
        int i5 = (ux2Var2.h(function3) ? 4 : 2) | (ux2Var2.h(function4) ? 32 : 16) | (ux2Var2.h(function5) ? 256 : 128) | (ux2Var2.h(function6) ? 2048 : 1024) | (ux2Var2.h(function7) ? 16384 : 8192) | (ux2Var2.h(function8) ? 131072 : 65536) | (ux2Var2.h(function9) ? 1048576 : 524288) | (ux2Var2.h(function10) ? 8388608 : 4194304) | (ux2Var2.h(function11) ? 67108864 : 33554432) | (ux2Var2.h(function12) ? 536870912 : 268435456);
        int i6 = 48 | (ux2Var2.f(list) ? 4 : 2) | (ux2Var2.h(function13) ? 256 : 128) | (ux2Var2.f(list2) ? 2048 : 1024) | (ux2Var2.h(gl4Var) ? 16384 : 8192);
        if (ux2Var2.N(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 306783379) == 306783378 && (i6 & 9363) == 9362) ? false : true)) {
            ux2Var2.S();
            if ((i & 1) != 0 && !ux2Var2.x()) {
                ux2Var2.Q();
            }
            ux2Var2.q();
            Object objK3 = ux2Var2.K();
            aw awVar5 = e01.a;
            if (objK3 == awVar5) {
                objK3 = ck3.w(ux2Var2);
                ux2Var2.g0(objK3);
            }
            me1 me1Var = (me1) objK3;
            Object objK4 = ux2Var2.K();
            if (objK4 == awVar5) {
                yx6 yx6VarL = au8.l(0, 7, null);
                ux2Var2.g0(yx6VarL);
                objK4 = yx6VarL;
            }
            nx4 nx4Var = (nx4) objK4;
            boolean zH = ux2Var2.h(me1Var) | ux2Var2.h(nx4Var);
            Object objK5 = ux2Var2.K();
            if (zH || objK5 == awVar5) {
                objK5 = new uv1(me1Var, nx4Var, (byte) 0);
                ux2Var2.g0(objK5);
            }
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            fs4 fs4VarF = fs4Var.f(fillElement);
            Function1 function17 = (Function1) objK5;
            h72 h72Var = un4.a;
            h72 h72Var2 = h72Var;
            fs4 fs4VarS = au8.s(fs4VarF, ((rn4) ux2Var2.j(h72Var)).a.p, kh.V);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.x, ux2Var2, 0);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarS);
            yz0.c.getClass();
            ux2Var2.a0();
            nx4 nx4Var2 = nx4Var;
            boolean z14 = ux2Var2.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z14) {
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
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var2, 0);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS3 = uf0.s(ux2Var2, fillElement);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(kw0VarA, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS3, iz0Var4, ux2Var2);
            tx1 tx1Var = gw1Var.d;
            if (tx1Var == null) {
                ux2Var2.W(1067185400);
                ux2Var2.p(false);
                awVar2 = awVar5;
                z11 = false;
                h72Var2 = h72Var2;
                i2 = i5;
                f88Var = null;
            } else {
                ux2Var2.W(1067185401);
                if (tx1Var instanceof sx1) {
                    b2 = 0;
                } else if (tx1Var instanceof rx1) {
                    b2 = 1;
                } else {
                    b2 = tx1Var instanceof qx1 ? (byte) 2 : (byte) -2;
                }
                f88 f88Var2 = f88.a;
                if (b2 == 0) {
                    ux2Var2.W(-591699954);
                    l33 l33VarY = Y(list, ((sx1) tx1Var).a);
                    ns1 ns1Var = gw1Var.b;
                    int i7 = i4 & 57344;
                    int i8 = i5 & 14;
                    byte b3 = 4;
                    int i9 = i4 & 1879048192;
                    boolean z15 = (i7 == 16384) | (i8 == 4) | (i9 == 536870912);
                    Object objK6 = ux2Var2.K();
                    if (z15) {
                        awVar = awVar5;
                    } else {
                        awVar = awVar5;
                        if (objK6 != awVar) {
                            function14 = function3;
                        }
                        Function0 function18 = (Function0) objK6;
                        if (i8 == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i7 == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z16 = z3 | z4;
                        if (i9 == 536870912) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z5 | z16;
                        objK = ux2Var2.K();
                        if (z6 || objK == awVar) {
                            objK = new tu(function14, z, function0, (byte) 3);
                            ux2Var2.g0(objK);
                        }
                        Function0 function19 = (Function0) objK;
                        if (i8 == 4) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (i7 == 16384) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolean z17 = z8 | z7;
                        if (i9 == 536870912) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = z17 | z9;
                        objK2 = ux2Var2.K();
                        if (z10 || objK2 == awVar) {
                            objK2 = new tu(function14, z, function0, b3);
                            ux2Var2.g0(objK2);
                        }
                        int i10 = i6 << 15;
                        awVar2 = awVar;
                        i2 = i5;
                        t23.b(z, str, z2, function1, function18, function19, null, l33VarY, list2, gl4Var, ns1Var, function11, (Function0) objK2, function13, null, ux2Var, ((i4 >> 12) & 8190) | (i10 & 234881024) | (i10 & 1879048192), ((i5 >> 21) & 112) | ((i6 << 3) & 7168));
                        ux2Var2 = ux2Var;
                        z11 = false;
                        ux2Var2.p(false);
                        f88Var = f88Var2;
                    }
                    function14 = function3;
                    objK6 = new tu(z, function14, function0, (byte) 2);
                    ux2Var2.g0(objK6);
                    Function0 function110 = (Function0) objK6;
                    if (i8 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i7 == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z18 = z3 | z4;
                    if (i9 == 536870912) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | z18;
                    objK = ux2Var2.K();
                    if (z6) {
                        objK = new tu(function14, z, function0, (byte) 3);
                        ux2Var2.g0(objK);
                    } else {
                        objK = new tu(function14, z, function0, (byte) 3);
                        ux2Var2.g0(objK);
                    }
                    Function0 function111 = (Function0) objK;
                    if (i8 == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (i7 == 16384) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z19 = z8 | z7;
                    if (i9 == 536870912) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    z10 = z19 | z9;
                    objK2 = ux2Var2.K();
                    if (z10) {
                        objK2 = new tu(function14, z, function0, b3);
                        ux2Var2.g0(objK2);
                    } else {
                        objK2 = new tu(function14, z, function0, b3);
                        ux2Var2.g0(objK2);
                    }
                    int i11 = i6 << 15;
                    awVar2 = awVar;
                    i2 = i5;
                    t23.b(z, str, z2, function1, function110, function111, null, l33VarY, list2, gl4Var, ns1Var, function11, (Function0) objK2, function13, null, ux2Var, ((i4 >> 12) & 8190) | (i11 & 234881024) | (i11 & 1879048192), ((i5 >> 21) & 112) | ((i6 << 3) & 7168));
                    ux2Var2 = ux2Var;
                    z11 = false;
                    ux2Var2.p(false);
                    f88Var = f88Var2;
                } else if (b2 == 1) {
                    ux2Var2.W(-590059310);
                    ns1 ns1Var2 = gw1Var.b;
                    if (ns1Var2 == null) {
                        ux2Var2.W(-590059311);
                        ux2Var2.p(false);
                        z12 = false;
                        nx4Var2 = nx4Var2;
                        function17 = function17;
                        i3 = i5;
                        awVar4 = awVar5;
                        f88Var = null;
                    } else {
                        ux2Var2.W(-590059310);
                        boolean z20 = ((i4 & 57344) == 16384) | ((i5 & 7168) == 2048) | ((i4 & 1879048192) == 536870912);
                        Object objK7 = ux2Var2.K();
                        if (z20) {
                            awVar3 = awVar5;
                        } else {
                            awVar3 = awVar5;
                            if (objK7 == awVar3) {
                            }
                            int i12 = i4 >> 15;
                            int i13 = i5 << 3;
                            awVar4 = awVar3;
                            i3 = i5;
                            d(z, ns1Var2, xv1Var, list, function0, function7, function8, function9, function10, nx4Var2, function17, (Function0) objK7, function11, function2, ux2Var2, ((i4 >> 12) & 14) | ((i4 >> 3) & 896) | ((i6 << 9) & 7168) | (i12 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024), ((i5 >> 18) & 896) | (i12 & 7168));
                            nx4Var2 = nx4Var2;
                            function17 = function17;
                            z12 = false;
                            ux2Var2.p(false);
                            f88Var = f88Var2;
                        }
                        objK7 = new tu(z, function6, function0, (byte) 5);
                        ux2Var2.g0(objK7);
                        int i14 = i4 >> 15;
                        int i15 = i5 << 3;
                        awVar4 = awVar3;
                        i3 = i5;
                        d(z, ns1Var2, xv1Var, list, function0, function7, function8, function9, function10, nx4Var2, function17, (Function0) objK7, function11, function2, ux2Var2, ((i4 >> 12) & 14) | ((i4 >> 3) & 896) | ((i6 << 9) & 7168) | (i14 & 57344) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024), ((i5 >> 18) & 896) | (i14 & 7168));
                        nx4Var2 = nx4Var2;
                        function17 = function17;
                        z12 = false;
                        ux2Var2.p(false);
                        f88Var = f88Var2;
                    }
                    ux2Var2.p(z12);
                    z11 = z12;
                    i2 = i3;
                    awVar2 = awVar4;
                } else {
                    if (b2 != 2) {
                        throw fx3.m(-711824219, ux2Var2, false);
                    }
                    ux2Var2.W(-588532033);
                    h71 h71Var = ((qx1) tx1Var).a;
                    ?? r4 = ((i5 & 112) == 32) | ((i4 & 1879048192) == 536870912);
                    Object objK8 = ux2Var2.K();
                    if (r4 != false || objK8 == awVar5) {
                        objK8 = new sv1(function4, function0, (byte) 2);
                        ux2Var2.g0(objK8);
                    }
                    c(h71Var, xv1Var, gw1Var, z, function7, function8, function9, function10, nx4Var2, function11, function2, function0, function17, (Function0) objK8, ux2Var2, ((i4 >> 6) & 112) | ((i4 << 6) & 896) | ((i4 >> 3) & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | ((i5 << 3) & 1879048192), (i4 >> 24) & 126);
                    ux2Var2.p(false);
                    z11 = false;
                    f88Var = f88Var2;
                    i2 = i5;
                    awVar2 = awVar5;
                }
                ux2Var2.p(z11);
            }
            if (f88Var == null) {
                ux2Var2.W(1071681486);
                int iOrdinal = lr0Var.b.ordinal();
                if (iOrdinal != 0) {
                    byte b4 = 1;
                    if (iOrdinal != 1) {
                        if (iOrdinal != 3) {
                            ux2Var2.W(1075372253);
                            ux2Var2.p(z11);
                        } else {
                            ux2Var2.W(1074275845);
                            ?? r18 = z11 ? 1 : 0;
                            SupportSession supportSession = gw1Var.c;
                            int i16 = i2;
                            ?? r5 = ((i16 & 896) == 256 ? 1 : r18 == true ? 1 : 0) | ((i4 & 1879048192) == 536870912 ? 1 : r18 == true ? 1 : 0);
                            Object objK9 = ux2Var2.K();
                            if (r5 != 0 || objK9 == awVar2) {
                                function16 = function0;
                                objK9 = new sv1(function5, function16, b4);
                                ux2Var2.g0(objK9);
                            } else {
                                function16 = function0;
                            }
                            u(supportSession, xv1Var, z, function16, function7, function8, function9, function10, function11, function12, list, nx4Var2, function17, (Function0) objK9, ux2Var2, ((i4 >> 6) & 1008) | ((i4 >> 18) & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), i6 & 14);
                            z11 = false;
                            ux2Var2.p(false);
                        }
                        z13 = z11;
                    } else {
                        Function1 function20 = function17;
                        int i17 = i2;
                        aw awVar6 = awVar2;
                        ux2Var2.W(1073129713);
                        h71 h71Var2 = gw1Var.a;
                        ?? r3 = ((i17 & 112) == 32 ? 1 : z11 ? 1 : 0) | ((i4 & 1879048192) == 536870912 ? 1 : z11 ? 1 : 0);
                        Object objK10 = ux2Var2.K();
                        if (r3 != 0 || objK10 == awVar6) {
                            objK10 = new sv1(function4, function0, z11 ? (byte) 1 : (byte) 0);
                            ux2Var2.g0(objK10);
                        }
                        c(h71Var2, xv1Var, gw1Var, z, function7, function8, function9, function10, nx4Var2, function11, function2, function0, function20, (Function0) objK10, ux2Var2, ((i4 >> 6) & 112) | ((i4 << 6) & 896) | ((i4 >> 3) & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128) | ((i17 << 3) & 1879048192), (i4 >> 24) & 126);
                        ux2Var2.p(false);
                        z13 = false;
                    }
                } else {
                    ?? r2 = z11 ? 1 : 0;
                    int i18 = i2;
                    aw awVar7 = awVar2;
                    ux2Var2.W(1071701977);
                    l33 l33VarY2 = Y(list, l33Var);
                    ns1 ns1Var3 = gw1Var.b;
                    int i19 = i4 & 57344;
                    int i20 = i18 & 14;
                    int i21 = i4 & 1879048192;
                    int i22 = (i19 == 16384 ? (char) 1 : r2 == true ? 1 : 0) | (i20 == 4 ? (char) 1 : (char) 0) | (i21 == 536870912 ? 1 : 0);
                    Object objK11 = ux2Var2.K();
                    if (i22 != 0 || objK11 == awVar7) {
                        function15 = function3;
                        objK11 = new tu(z, function15, function0, (byte) 6);
                        ux2Var2.g0(objK11);
                    } else {
                        function15 = function3;
                    }
                    Function0 function21 = (Function0) objK11;
                    boolean z21 = (i19 == 16384) | (i20 == 4) | (i21 == 536870912);
                    Object objK12 = ux2Var2.K();
                    if (z21 || objK12 == awVar7) {
                        objK12 = new tu(function15, z, function0, (byte) 7);
                        ux2Var2.g0(objK12);
                    }
                    Function0 function22 = (Function0) objK12;
                    boolean z22 = (i20 == 4) | (i19 == 16384) | (i21 == 536870912);
                    Object objK13 = ux2Var2.K();
                    if (z22 || objK13 == awVar7) {
                        objK13 = new tu(function15, z, function0, (byte) 1);
                        ux2Var2.g0(objK13);
                    }
                    int i23 = i6 << 15;
                    t23.b(z, str, z2, function1, function21, function22, null, l33VarY2, list2, gl4Var, ns1Var3, function11, (Function0) objK13, function13, null, ux2Var, ((i4 >> 12) & 8190) | (i23 & 234881024) | (i23 & 1879048192), ((i18 >> 21) & 112) | ((i6 << 3) & 7168));
                    ux2Var2 = ux2Var;
                    z13 = false;
                    ux2Var2.p(false);
                }
                ux2Var2.p(z13);
            } else {
                z13 = z11 ? 1 : 0;
                ux2Var2.W(1696995880);
                ux2Var2.p(z13);
            }
            ux2Var2.p(true);
            if (z && z2) {
                ux2Var2.W(-1835775510);
                lv1.B(androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.b.b, 2.0f), 0.0f, ((rn4) ux2Var2.j(h72Var2)).a.B, ux2Var2, 6);
                ux2Var2.p(z13);
            } else {
                ux2Var2.W(-1835570507);
                ux2Var2.p(z13);
            }
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2(lr0Var, l33Var, xv1Var, z, str, z2, function1, function2, function0, function3, function4, function5, function6, function7, function8, function9, function10, function11, function12, list, fs4Var, function13, list2, gl4Var, i) { // from class: o.tv1
                public final /* synthetic */ Function0 A;
                public final /* synthetic */ Function1 B;
                public final /* synthetic */ Function1 C;
                public final /* synthetic */ Function1 D;
                public final /* synthetic */ Function1 E;
                public final /* synthetic */ Function1 F;
                public final /* synthetic */ List G;
                public final /* synthetic */ fs4 H;
                public final /* synthetic */ Function1 I;
                public final /* synthetic */ List J;
                public final /* synthetic */ gl4 K;
                public final /* synthetic */ lr0 n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ l33 f2147o;
                public final /* synthetic */ xv1 p;
                public final /* synthetic */ boolean q;
                public final /* synthetic */ String r;
                public final /* synthetic */ boolean s;
                public final /* synthetic */ Function1 t;
                public final /* synthetic */ Function1 u;
                public final /* synthetic */ Function0 v;
                public final /* synthetic */ Function0 w;
                public final /* synthetic */ Function0 x;
                public final /* synthetic */ Function0 y;
                public final /* synthetic */ Function0 z;

                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(1);
                    io1.e(this.m, this.n, this.f2147o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (ux2) obj, iY);
                    return f88.a;
                }
            };
        }
    }

    public static final fs4 e0(fs4 fs4Var, float f) {
        return f == 0.0f ? fs4Var : di1.u(fs4Var, 0.0f, 0.0f, 0.0f, 0.0f, f, null, false, 1048319);
    }

    public static final void f(int i, String str, String str2, fs4 fs4Var, ux2 ux2Var, int i2) {
        int i3;
        ux2 ux2Var2;
        str.getClass();
        str2.getClass();
        ux2Var.Y(-2117297064);
        if ((i2 & 6) == 0) {
            i3 = (ux2Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ux2Var.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ux2Var.f(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            ux2Var2 = ux2Var;
            j51.g(fs4Var.f(androidx.compose.foundation.layout.b.c), null, false, au8.O(-911402706, new ma2(i, str, str2), ux2Var), ux2Var2, 3072, 6);
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new na2(i, str, str2, fs4Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:158:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[ADDED_TO_REGION, LOOP:6: B:92:0x013a->B:120:0x0187, LOOP_START, PHI: r13
      0x013a: PHI (r13v13 o.es4) = (r13v7 o.es4), (r13v14 o.es4) binds: [B:91:0x0138, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    public static final boolean f0(br2 br2Var, br2 br2Var2, int i, m5 m5Var) {
        es4 es4Var;
        es4 es4Var2;
        LayoutNode layoutNodeP0;
        nf nfVar;
        es4 es4VarL0;
        xx4 xx4Var;
        if (br2Var.Z0() != wq2.n) {
            hk0.l("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new br2[16];
        if (!br2Var.m.z) {
            ki3.c("visitChildren called on an unattached node");
        }
        xx4 xx4Var2 = new xx4(new es4[16]);
        es4 es4Var3 = br2Var.m;
        es4 es4Var4 = es4Var3.r;
        if (es4Var4 == null) {
            vn4.V(xx4Var2, es4Var3);
        } else {
            xx4Var2.b(es4Var4);
        }
        int i2 = 0;
        while (true) {
            int i3 = xx4Var2.f2559o;
            es4Var = null;
            if (i3 == 0) {
                break;
            }
            es4 es4VarL1 = (es4) xx4Var2.k(i3 - 1);
            if ((es4VarL1.p & 1024) == 0) {
                vn4.V(xx4Var2, es4VarL1);
            } else {
                while (es4VarL1 != null) {
                    if ((es4VarL1.f737o & 1024) != 0) {
                        xx4 xx4Var3 = null;
                        while (es4VarL1 != null) {
                            if (es4VarL1 instanceof br2) {
                                br2 br2Var3 = (br2) es4VarL1;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = br2Var3;
                                i2 = i4;
                            } else if ((es4VarL1.f737o & 1024) != 0 && (es4VarL1 instanceof vm1)) {
                                int i5 = 0;
                                for (es4 es4Var5 = ((vm1) es4VarL1).B; es4Var5 != null; es4Var5 = es4Var5.r) {
                                    if ((es4Var5.f737o & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            es4VarL1 = es4Var5;
                                        } else {
                                            if (xx4Var3 == null) {
                                                xx4Var3 = new xx4(new es4[16]);
                                            }
                                            if (es4VarL1 != null) {
                                                xx4Var3.b(es4VarL1);
                                                es4VarL1 = null;
                                            }
                                            xx4Var3.b(es4Var5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            es4VarL1 = vn4.l0(xx4Var3);
                        }
                        break;
                    }
                    es4VarL1 = es4VarL1.r;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, gj2.f899o);
        if (i != 1) {
            if (i != 2) {
                hk0.l("This function should only be used for 1-D focus search");
                return false;
            }
            yk3 yk3VarB0 = ct1.b0(0, i2);
            int i6 = yk3VarB0.m;
            int i7 = yk3VarB0.n;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        br2 br2Var4 = (br2) objArr[i7];
                        if (xs1.R(br2Var4) && y(br2Var4, m5Var)) {
                            return true;
                        }
                    }
                    if (im3.n(objArr[i7], br2Var2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!br2Var.m.z) {
                    ki3.c("visitAncestors called on an unattached node");
                }
                es4Var2 = br2Var.m.q;
                layoutNodeP0 = vn4.p0(br2Var);
                loop5: while (layoutNodeP0 != null) {
                    if ((((es4) layoutNodeP0.S.g).p & 1024) != 0) {
                        while (es4Var2 != null) {
                            if ((es4Var2.f737o & 1024) != 0) {
                                es4VarL0 = es4Var2;
                                xx4Var = null;
                                while (es4VarL0 != null) {
                                    if (es4VarL0 instanceof br2) {
                                        es4Var = es4VarL0;
                                        break loop5;
                                    }
                                    if ((es4VarL0.f737o & 1024) == 0) {
                                    }
                                    es4VarL0 = vn4.l0(xx4Var);
                                }
                            }
                            es4Var2 = es4Var2.q;
                        }
                    }
                    layoutNodeP0 = layoutNodeP0.F();
                    if (layoutNodeP0 != null) {
                    }
                }
                if (es4Var != null) {
                    return ((Boolean) m5Var.invoke(br2Var)).booleanValue();
                }
            }
            return false;
        }
        yk3 yk3VarB1 = ct1.b0(0, i2);
        int i8 = yk3VarB1.m;
        int i9 = yk3VarB1.n;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    br2 br2Var5 = (br2) objArr[i8];
                    if (xs1.R(br2Var5) && S(br2Var5, m5Var)) {
                        return true;
                    }
                }
                if (im3.n(objArr[i8], br2Var2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && br2Var.W0().a) {
            if (!br2Var.m.z) {
                ki3.c("visitAncestors called on an unattached node");
            }
            es4Var2 = br2Var.m.q;
            layoutNodeP0 = vn4.p0(br2Var);
            loop5: while (layoutNodeP0 != null) {
                if ((((es4) layoutNodeP0.S.g).p & 1024) != 0) {
                    while (es4Var2 != null) {
                        if ((es4Var2.f737o & 1024) != 0) {
                            es4VarL0 = es4Var2;
                            xx4Var = null;
                            while (es4VarL0 != null) {
                                if (es4VarL0 instanceof br2) {
                                    es4Var = es4VarL0;
                                    break loop5;
                                }
                                if ((es4VarL0.f737o & 1024) == 0 && (es4VarL0 instanceof vm1)) {
                                    int i10 = 0;
                                    for (es4 es4Var6 = ((vm1) es4VarL0).B; es4Var6 != null; es4Var6 = es4Var6.r) {
                                        if ((es4Var6.f737o & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                es4VarL0 = es4Var6;
                                            } else {
                                                if (xx4Var == null) {
                                                    xx4Var = new xx4(new es4[16]);
                                                }
                                                if (es4VarL0 != null) {
                                                    xx4Var.b(es4VarL0);
                                                    es4VarL0 = null;
                                                }
                                                xx4Var.b(es4Var6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                es4VarL0 = vn4.l0(xx4Var);
                            }
                        }
                        es4Var2 = es4Var2.q;
                    }
                }
                layoutNodeP0 = layoutNodeP0.F();
                es4Var2 = (layoutNodeP0 != null || (nfVar = layoutNodeP0.S) == null) ? null : (kn7) nfVar.f;
            }
            if (es4Var != null) {
                return ((Boolean) m5Var.invoke(br2Var)).booleanValue();
            }
        }
        return false;
    }

    public static final void g(boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        function1.getClass();
        ux2Var2.Y(1334058940);
        int i2 = i | (ux2Var2.g(z) ? 4 : 2) | (ux2Var2.h(function1) ? 32 : 16) | 384;
        if (ux2Var2.N(i2 & 1, (i2 & 147) != 146)) {
            cs4 cs4Var = cs4.b;
            fs4 fs4VarF = ka0.F(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), 0.0f, 16.0f, 0.0f, 16.0f, 5);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
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
            o67.n(dg6VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            String strZ = m77.z(R.string.feedback_checkbox, ux2Var2);
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(cs4Var, "TVTA-settings-feedback-checkboxTag");
            boolean zF = ux2Var2.f(strZ);
            Object objK = ux2Var2.K();
            if (zF || objK == e01.a) {
                objK = new fy(strZ, (byte) 9);
                ux2Var2.g0(objK);
            }
            di1.e(z, function1, cp6.a(fs4VarA, false, (Function1) objK), false, null, ux2Var2, i2 & 126, 56);
            qs7.b(strZ, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((rn4) ux2Var2.j(un4.a)).b.k, ux2Var, 0, 0, 131070);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new lc(z, function1, fs4Var2, i, (byte) 1);
        }
    }

    public static final void g0(String str, Function1 function1, Function0 function0, String str2) {
        function1.invoke(new ul7(sl7.f2030o, str, g37.n, str2, null, function0, 168));
    }

    public static final void h(String str, boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        ux2 ux2Var2;
        fs4 fs4Var2;
        function1.getClass();
        ux2Var.Y(1956946311);
        byte b2 = 2;
        int i2 = i | (ux2Var.f(str) ? 4 : 2) | (ux2Var.g(z) ? 32 : 16) | (ux2Var.h(function1) ? 256 : 128) | 221184;
        byte b3 = 0;
        if (ux2Var.N(i2 & 1, (74899 & i2) != 74898)) {
            String strValueOf = String.valueOf(str.length());
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
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
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            fs4 fs4VarC = androidx.compose.foundation.layout.b.c(cs4Var, 1.0f);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new ji2(b3);
                ux2Var.g0(objK);
            }
            bt1.e(str, function1, androidx.compose.ui.platform.a.a(ka0.z(fs4VarC, (Function1) objK), "TVTA-settings-feedback-commentTextField"), false, false, null, au8.O(-606056425, new iz0((byte) 29), ux2Var), null, null, null, new yy0(1120533109, true, new mb(z, strValueOf, b2)), !z, null, new yx3(0, 1, 119), null, false, 5, 5, ((rn4) ux2Var.j(un4.a)).c.b, null, ux2Var, (i2 & 14) | 1572864 | ((i2 >> 3) & 112), 12779520, 5328824);
            ux2Var2 = ux2Var;
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new nb(str, z, function1, fs4Var2, i, (byte) 2);
        }
    }

    public static final long h0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final void i(go2 go2Var, Function1 function1, Function1 function2, ux2 ux2Var, int i) {
        go2Var.getClass();
        function1.getClass();
        function2.getClass();
        ux2Var.Y(-1321079552);
        int i2 = (ux2Var.f(go2Var) ? 4 : 2) | i | (ux2Var.h(function1) ? 32 : 16) | (ux2Var.h(function2) ? 256 : 128);
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) ux2Var.j(lh.b);
            Resources resources = (Resources) ux2Var.j(lh.c);
            px4 px4VarT = h57.t(function1, ux2Var);
            boolean z = false;
            px4 px4VarT2 = h57.t(function2, ux2Var);
            if ((i2 & 14) == 4) {
                z = true;
            }
            boolean zF = ux2Var.f(px4VarT) | z | ux2Var.h(context) | ux2Var.h(resources) | ux2Var.f(px4VarT2);
            Object objK = ux2Var.K();
            if (zF || objK == e01.a) {
                aj ajVar = new aj(go2Var, context, resources, px4VarT, px4VarT2, null, (byte) 8);
                ux2Var.g0(ajVar);
                objK = ajVar;
            }
            ck3.i(go2Var, (hw2) objK, ux2Var);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new f9((Object) go2Var, (Object) function1, (Object) function2, i, (byte) 13);
        }
    }

    public static final vy1 i0(d37 d37Var) {
        d37Var.getClass();
        if (d37Var instanceof r27) {
            return ky1.d;
        }
        if (d37Var instanceof i27) {
            return new by1(((i27) d37Var).a);
        }
        if (d37Var instanceof h27) {
            return new ay1(((h27) d37Var).a);
        }
        if (d37Var instanceof g27) {
            return new zx1(((g27) d37Var).a);
        }
        if (d37Var instanceof w17) {
            return ux1.d;
        }
        if (d37Var instanceof x17) {
            return vx1.d;
        }
        if (d37Var instanceof q27) {
            return jy1.d;
        }
        if (d37Var instanceof p27) {
            return iy1.d;
        }
        if (d37Var instanceof o27) {
            return hy1.d;
        }
        if (d37Var instanceof n27) {
            return gy1.d;
        }
        if (d37Var instanceof f27) {
            return ly1.d;
        }
        if (d37Var instanceof m27) {
            return fy1.d;
        }
        if (d37Var instanceof j27) {
            return cy1.d;
        }
        if (d37Var instanceof e27) {
            return yx1.d;
        }
        if (d37Var instanceof d27) {
            return xx1.d;
        }
        if (d37Var instanceof l27) {
            return ey1.d;
        }
        if (d37Var instanceof k27) {
            return dy1.d;
        }
        boolean z = d37Var instanceof z17;
        sl7 sl7Var = sl7.m;
        g37 g37Var = g37.m;
        if (z) {
            return new wx1(sl7Var, R.string.remote_device_added, g37Var);
        }
        boolean z2 = d37Var instanceof y17;
        sl7 sl7Var2 = sl7.f2030o;
        if (z2) {
            return new wx1(sl7Var2, R.string.remote_device_could_not_be_added, g37Var);
        }
        if (d37Var instanceof a27) {
            return new wx1(sl7Var2, R.string.add_remote_device_to_your_account_error_case_text, g37Var);
        }
        if (d37Var instanceof b27) {
            return new wx1(sl7Var, R.string.assignment_link_copied_to_clipboard, g37Var);
        }
        if (d37Var instanceof c27) {
            return new wx1(sl7Var2, R.string.share_remote_device_link_email_apps_not_found_exception, g37Var);
        }
        if (d37Var instanceof t27) {
            return new wx1(sl7Var, R.string.scan_qr_pin_verified, g37Var);
        }
        if (d37Var instanceof s27) {
            return new wx1(sl7Var2, R.string.scan_qr_pin_maximum_attempts, g37Var);
        }
        if (d37Var instanceof c37) {
            return uy1.d;
        }
        if (d37Var instanceof z27) {
            return new ry1(((z27) d37Var).a);
        }
        if (d37Var instanceof y27) {
            return new qy1(((y27) d37Var).a);
        }
        if (d37Var instanceof v27) {
            return new ny1(((v27) d37Var).a);
        }
        if (d37Var instanceof u27) {
            return new my1(((u27) d37Var).a);
        }
        if (d37Var instanceof x27) {
            return py1.d;
        }
        if (d37Var instanceof w27) {
            return oy1.d;
        }
        if (d37Var instanceof a37) {
            return sy1.d;
        }
        if (d37Var instanceof b37) {
            return ty1.d;
        }
        gk0.s();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0125  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void j(final vh3 vh3Var, final Function0 function0, final Function0 function1, fs4 fs4Var, String str, ux2 ux2Var, final int i, final int i2) {
        fs4 fs4Var2;
        int i3;
        String str2;
        int i4;
        final byte b2;
        final byte b3;
        boolean z;
        final fs4 fs4Var3;
        final String str3;
        j56 j56VarR;
        fs4 fs4Var4;
        String str4;
        px4 px4VarT;
        boolean zF;
        Object objK;
        vh3Var.getClass();
        function0.getClass();
        function1.getClass();
        ux2Var.Y(-65633879);
        int i5 = (ux2Var.h(vh3Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= ux2Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= ux2Var.h(function1) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                fs4Var2 = fs4Var;
                i5 |= ux2Var.f(fs4Var2) ? 2048 : 1024;
            }
            i3 = i2 & 16;
            if (i3 != 0) {
                if ((i & 24576) == 0) {
                    str2 = str;
                    if (ux2Var.f(str2)) {
                        i4 = 16384;
                    } else {
                        i4 = 8192;
                    }
                    i5 |= i4;
                }
                b2 = 0;
                b3 = 1;
                if ((i5 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (ux2Var.N(i5 & 1, z)) {
                    if (i6 != 0) {
                        fs4Var4 = cs4.b;
                    } else {
                        fs4Var4 = fs4Var2;
                    }
                    if (i3 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    int i7 = i5 >> 3;
                    px4VarT = h57.t(function0, ux2Var);
                    zF = ux2Var.f(px4VarT);
                    objK = ux2Var.K();
                    if (zF || objK == e01.a) {
                        objK = new r11(px4VarT, null, b3);
                        ux2Var.g0(objK);
                    }
                    ck3.i(f88.a, (hw2) objK, ux2Var);
                    uf0.b(function1, au8.O(1584191585, new wh3(str4, function1, b2), ux2Var), fs4Var4, null, au8.O(1488701149, new hw2() { // from class: o.xh3
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b4 = b2;
                            f88 f88Var = f88.a;
                            vh3 vh3Var2 = vh3Var;
                            switch (b4) {
                                case 0:
                                    ux2 ux2Var2 = (ux2) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        ux2Var2.Q();
                                    } else {
                                        qs7.b(vh3Var2.a, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var2, 0, 24960, 241662);
                                    }
                                    break;
                                default:
                                    ux2 ux2Var3 = (ux2) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        ux2Var3.Q();
                                    } else {
                                        String str5 = vh3Var2.b;
                                        if (str5 != null) {
                                            ux2Var3.W(765609451);
                                            hk6 hk6VarW = im3.W(ux2Var3);
                                            Object objK2 = ux2Var3.K();
                                            if (objK2 == e01.a) {
                                                objK2 = ck3.w(ux2Var3);
                                                ux2Var3.g0(objK2);
                                            }
                                            qs7.b(str5, o77.t(cs4.b, hk6VarW, (me1) objK2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262140);
                                            ux2Var3.p(false);
                                        } else {
                                            ux2Var3.W(765609450);
                                            ux2Var3.p(false);
                                        }
                                    }
                                    break;
                            }
                            return f88Var;
                        }
                    }, ux2Var), au8.O(-1756396932, new hw2() { // from class: o.xh3
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b4 = b3;
                            f88 f88Var = f88.a;
                            vh3 vh3Var2 = vh3Var;
                            switch (b4) {
                                case 0:
                                    ux2 ux2Var2 = (ux2) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        ux2Var2.Q();
                                    } else {
                                        qs7.b(vh3Var2.a, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var2, 0, 24960, 241662);
                                    }
                                    break;
                                default:
                                    ux2 ux2Var3 = (ux2) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        ux2Var3.Q();
                                    } else {
                                        String str5 = vh3Var2.b;
                                        if (str5 != null) {
                                            ux2Var3.W(765609451);
                                            hk6 hk6VarW = im3.W(ux2Var3);
                                            Object objK2 = ux2Var3.K();
                                            if (objK2 == e01.a) {
                                                objK2 = ck3.w(ux2Var3);
                                                ux2Var3.g0(objK2);
                                            }
                                            qs7.b(str5, o77.t(cs4.b, hk6VarW, (me1) objK2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262140);
                                            ux2Var3.p(false);
                                        } else {
                                            ux2Var3.W(765609450);
                                            ux2Var3.p(false);
                                        }
                                    }
                                    break;
                            }
                            return f88Var;
                        }
                    }, ux2Var), null, 0L, 0L, 0L, 0L, null, ux2Var, ((i5 >> 6) & 14) | 1769520 | (i7 & 896), 0, 16280);
                    fs4Var3 = fs4Var4;
                    str3 = str4;
                } else {
                    ux2Var.Q();
                    fs4Var3 = fs4Var2;
                    str3 = str2;
                }
                j56VarR = ux2Var.r();
                if (j56VarR != null) {
                    j56VarR.d = new hw2() { // from class: o.yh3
                        @Override // o.hw2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            io1.j(vh3Var, function0, function1, fs4Var3, str3, (ux2) obj, yo1.Y(i | 1), i2);
                            return f88.a;
                        }
                    };
                }
            }
            i5 |= 24576;
            str2 = str;
            b2 = 0;
            b3 = 1;
            if ((i5 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i5 & 1, z)) {
                if (i6 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if (i3 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                int i8 = i5 >> 3;
                px4VarT = h57.t(function0, ux2Var);
                zF = ux2Var.f(px4VarT);
                objK = ux2Var.K();
                if (zF) {
                    objK = new r11(px4VarT, null, b3);
                    ux2Var.g0(objK);
                } else {
                    objK = new r11(px4VarT, null, b3);
                    ux2Var.g0(objK);
                }
                ck3.i(f88.a, (hw2) objK, ux2Var);
                uf0.b(function1, au8.O(1584191585, new wh3(str4, function1, b2), ux2Var), fs4Var4, null, au8.O(1488701149, new hw2() { // from class: o.xh3
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = b2;
                        f88 f88Var = f88.a;
                        vh3 vh3Var2 = vh3Var;
                        switch (b4) {
                            case 0:
                                ux2 ux2Var2 = (ux2) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    qs7.b(vh3Var2.a, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var2, 0, 24960, 241662);
                                }
                                break;
                            default:
                                ux2 ux2Var3 = (ux2) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                } else {
                                    String str5 = vh3Var2.b;
                                    if (str5 != null) {
                                        ux2Var3.W(765609451);
                                        hk6 hk6VarW = im3.W(ux2Var3);
                                        Object objK2 = ux2Var3.K();
                                        if (objK2 == e01.a) {
                                            objK2 = ck3.w(ux2Var3);
                                            ux2Var3.g0(objK2);
                                        }
                                        qs7.b(str5, o77.t(cs4.b, hk6VarW, (me1) objK2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262140);
                                        ux2Var3.p(false);
                                    } else {
                                        ux2Var3.W(765609450);
                                        ux2Var3.p(false);
                                    }
                                }
                                break;
                        }
                        return f88Var;
                    }
                }, ux2Var), au8.O(-1756396932, new hw2() { // from class: o.xh3
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = b3;
                        f88 f88Var = f88.a;
                        vh3 vh3Var2 = vh3Var;
                        switch (b4) {
                            case 0:
                                ux2 ux2Var2 = (ux2) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    qs7.b(vh3Var2.a, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var2, 0, 24960, 241662);
                                }
                                break;
                            default:
                                ux2 ux2Var3 = (ux2) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                } else {
                                    String str5 = vh3Var2.b;
                                    if (str5 != null) {
                                        ux2Var3.W(765609451);
                                        hk6 hk6VarW = im3.W(ux2Var3);
                                        Object objK2 = ux2Var3.K();
                                        if (objK2 == e01.a) {
                                            objK2 = ck3.w(ux2Var3);
                                            ux2Var3.g0(objK2);
                                        }
                                        qs7.b(str5, o77.t(cs4.b, hk6VarW, (me1) objK2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262140);
                                        ux2Var3.p(false);
                                    } else {
                                        ux2Var3.W(765609450);
                                        ux2Var3.p(false);
                                    }
                                }
                                break;
                        }
                        return f88Var;
                    }
                }, ux2Var), null, 0L, 0L, 0L, 0L, null, ux2Var, ((i5 >> 6) & 14) | 1769520 | (i8 & 896), 0, 16280);
                fs4Var3 = fs4Var4;
                str3 = str4;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var2;
                str3 = str2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.yh3
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        io1.j(vh3Var, function0, function1, fs4Var3, str3, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i5 |= 3072;
        fs4Var2 = fs4Var;
        i3 = i2 & 16;
        if (i3 != 0) {
            if ((i & 24576) == 0) {
                str2 = str;
                if (ux2Var.f(str2)) {
                    i4 = 16384;
                } else {
                    i4 = 8192;
                }
                i5 |= i4;
            }
            b2 = 0;
            b3 = 1;
            if ((i5 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i5 & 1, z)) {
                if (i6 != 0) {
                    fs4Var4 = cs4.b;
                } else {
                    fs4Var4 = fs4Var2;
                }
                if (i3 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                int i9 = i5 >> 3;
                px4VarT = h57.t(function0, ux2Var);
                zF = ux2Var.f(px4VarT);
                objK = ux2Var.K();
                if (zF) {
                    objK = new r11(px4VarT, null, b3);
                    ux2Var.g0(objK);
                } else {
                    objK = new r11(px4VarT, null, b3);
                    ux2Var.g0(objK);
                }
                ck3.i(f88.a, (hw2) objK, ux2Var);
                uf0.b(function1, au8.O(1584191585, new wh3(str4, function1, b2), ux2Var), fs4Var4, null, au8.O(1488701149, new hw2() { // from class: o.xh3
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = b2;
                        f88 f88Var = f88.a;
                        vh3 vh3Var2 = vh3Var;
                        switch (b4) {
                            case 0:
                                ux2 ux2Var2 = (ux2) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    qs7.b(vh3Var2.a, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var2, 0, 24960, 241662);
                                }
                                break;
                            default:
                                ux2 ux2Var3 = (ux2) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                } else {
                                    String str5 = vh3Var2.b;
                                    if (str5 != null) {
                                        ux2Var3.W(765609451);
                                        hk6 hk6VarW = im3.W(ux2Var3);
                                        Object objK2 = ux2Var3.K();
                                        if (objK2 == e01.a) {
                                            objK2 = ck3.w(ux2Var3);
                                            ux2Var3.g0(objK2);
                                        }
                                        qs7.b(str5, o77.t(cs4.b, hk6VarW, (me1) objK2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262140);
                                        ux2Var3.p(false);
                                    } else {
                                        ux2Var3.W(765609450);
                                        ux2Var3.p(false);
                                    }
                                }
                                break;
                        }
                        return f88Var;
                    }
                }, ux2Var), au8.O(-1756396932, new hw2() { // from class: o.xh3
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = b3;
                        f88 f88Var = f88.a;
                        vh3 vh3Var2 = vh3Var;
                        switch (b4) {
                            case 0:
                                ux2 ux2Var2 = (ux2) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    ux2Var2.Q();
                                } else {
                                    qs7.b(vh3Var2.a, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var2, 0, 24960, 241662);
                                }
                                break;
                            default:
                                ux2 ux2Var3 = (ux2) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                    ux2Var3.Q();
                                } else {
                                    String str5 = vh3Var2.b;
                                    if (str5 != null) {
                                        ux2Var3.W(765609451);
                                        hk6 hk6VarW = im3.W(ux2Var3);
                                        Object objK2 = ux2Var3.K();
                                        if (objK2 == e01.a) {
                                            objK2 = ck3.w(ux2Var3);
                                            ux2Var3.g0(objK2);
                                        }
                                        qs7.b(str5, o77.t(cs4.b, hk6VarW, (me1) objK2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262140);
                                        ux2Var3.p(false);
                                    } else {
                                        ux2Var3.W(765609450);
                                        ux2Var3.p(false);
                                    }
                                }
                                break;
                        }
                        return f88Var;
                    }
                }, ux2Var), null, 0L, 0L, 0L, 0L, null, ux2Var, ((i5 >> 6) & 14) | 1769520 | (i9 & 896), 0, 16280);
                fs4Var3 = fs4Var4;
                str3 = str4;
            } else {
                ux2Var.Q();
                fs4Var3 = fs4Var2;
                str3 = str2;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new hw2() { // from class: o.yh3
                    @Override // o.hw2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        io1.j(vh3Var, function0, function1, fs4Var3, str3, (ux2) obj, yo1.Y(i | 1), i2);
                        return f88.a;
                    }
                };
            }
        }
        i5 |= 24576;
        str2 = str;
        b2 = 0;
        b3 = 1;
        if ((i5 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i5 & 1, z)) {
            if (i6 != 0) {
                fs4Var4 = cs4.b;
            } else {
                fs4Var4 = fs4Var2;
            }
            if (i3 != 0) {
                str4 = "";
            } else {
                str4 = str2;
            }
            int i10 = i5 >> 3;
            px4VarT = h57.t(function0, ux2Var);
            zF = ux2Var.f(px4VarT);
            objK = ux2Var.K();
            if (zF) {
                objK = new r11(px4VarT, null, b3);
                ux2Var.g0(objK);
            } else {
                objK = new r11(px4VarT, null, b3);
                ux2Var.g0(objK);
            }
            ck3.i(f88.a, (hw2) objK, ux2Var);
            uf0.b(function1, au8.O(1584191585, new wh3(str4, function1, b2), ux2Var), fs4Var4, null, au8.O(1488701149, new hw2() { // from class: o.xh3
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b2;
                    f88 f88Var = f88.a;
                    vh3 vh3Var2 = vh3Var;
                    switch (b4) {
                        case 0:
                            ux2 ux2Var2 = (ux2) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                ux2Var2.Q();
                            } else {
                                qs7.b(vh3Var2.a, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var2, 0, 24960, 241662);
                            }
                            break;
                        default:
                            ux2 ux2Var3 = (ux2) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                ux2Var3.Q();
                            } else {
                                String str5 = vh3Var2.b;
                                if (str5 != null) {
                                    ux2Var3.W(765609451);
                                    hk6 hk6VarW = im3.W(ux2Var3);
                                    Object objK2 = ux2Var3.K();
                                    if (objK2 == e01.a) {
                                        objK2 = ck3.w(ux2Var3);
                                        ux2Var3.g0(objK2);
                                    }
                                    qs7.b(str5, o77.t(cs4.b, hk6VarW, (me1) objK2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262140);
                                    ux2Var3.p(false);
                                } else {
                                    ux2Var3.W(765609450);
                                    ux2Var3.p(false);
                                }
                            }
                            break;
                    }
                    return f88Var;
                }
            }, ux2Var), au8.O(-1756396932, new hw2() { // from class: o.xh3
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    f88 f88Var = f88.a;
                    vh3 vh3Var2 = vh3Var;
                    switch (b4) {
                        case 0:
                            ux2 ux2Var2 = (ux2) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                                ux2Var2.Q();
                            } else {
                                qs7.b(vh3Var2.a, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, null, ux2Var2, 0, 24960, 241662);
                            }
                            break;
                        default:
                            ux2 ux2Var3 = (ux2) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!ux2Var3.N(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                ux2Var3.Q();
                            } else {
                                String str5 = vh3Var2.b;
                                if (str5 != null) {
                                    ux2Var3.W(765609451);
                                    hk6 hk6VarW = im3.W(ux2Var3);
                                    Object objK2 = ux2Var3.K();
                                    if (objK2 == e01.a) {
                                        objK2 = ck3.w(ux2Var3);
                                        ux2Var3.g0(objK2);
                                    }
                                    qs7.b(str5, o77.t(cs4.b, hk6VarW, (me1) objK2), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ux2Var3, 0, 0, 262140);
                                    ux2Var3.p(false);
                                } else {
                                    ux2Var3.W(765609450);
                                    ux2Var3.p(false);
                                }
                            }
                            break;
                    }
                    return f88Var;
                }
            }, ux2Var), null, 0L, 0L, 0L, 0L, null, ux2Var, ((i5 >> 6) & 14) | 1769520 | (i10 & 896), 0, 16280);
            fs4Var3 = fs4Var4;
            str3 = str4;
        } else {
            ux2Var.Q();
            fs4Var3 = fs4Var2;
            str3 = str2;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.yh3
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    io1.j(vh3Var, function0, function1, fs4Var3, str3, (ux2) obj, yo1.Y(i | 1), i2);
                    return f88.a;
                }
            };
        }
    }

    public static final void k(final List list, final f74 f74Var, final fs4 fs4Var, final c74 c74Var, final r74 r74Var, final p74 p74Var, final k74 k74Var, final nd5 nd5Var, final w44 w44Var, final Function1 function1, final Function1 function2, final Function1 function3, final li liVar, ux2 ux2Var, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        f74Var.getClass();
        ux2Var.Y(-674241070);
        if ((i & 6) == 0) {
            i4 = (ux2Var.f(list) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= ux2Var.f(f74Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= ux2Var.f(fs4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= ux2Var.d(0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= ux2Var.d(c74Var == null ? -1 : c74Var.ordinal()) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= ux2Var.d(r74Var.ordinal()) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= ux2Var.d(0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= ux2Var.f(p74Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= ux2Var.f(k74Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= ux2Var.f(nd5Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (ux2Var.f(w44Var) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i7 = i5 | 48;
        if ((i2 & 384) == 0) {
            i7 |= ux2Var.h(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i7 |= ux2Var.h(null) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i7 |= ux2Var.h(null) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i7 |= ux2Var.h(null) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i7 |= ux2Var.h(function1) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i7 |= ux2Var.h(function2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i7 |= ux2Var.h(null) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i7 |= ux2Var.h(function3) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (ux2Var.f(liVar) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if (ux2Var.N(i4 & 1, ((i4 & 306783379) == 306783378 && (i7 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            ux2Var.S();
            if ((i & 1) != 0 && !ux2Var.x()) {
                ux2Var.Q();
            }
            ux2Var.q();
            int i8 = i7 & 1879048192;
            boolean z = ((i4 & 458752) == 131072) | ((i4 & 7168) == 2048) | ((i4 & 112) == 32) | ((i4 & 3670016) == 1048576) | ((((i4 & 234881024) ^ 100663296) > 67108864 && ux2Var.f(k74Var)) || (i4 & 100663296) == 67108864) | ((i7 & 234881024) == 67108864) | (i8 == 536870912);
            Object objK = ux2Var.K();
            if (z || objK == e01.a) {
                yy0 yy0Var = r74Var != r74.m ? null : new yy0(1531918000, true, new c91(f74Var, k74Var, function3));
                ux2Var.g0(yy0Var);
                objK = yy0Var;
            } else {
                i4 = i4;
                i8 = i8;
            }
            final iw2 iw2Var = (iw2) objK;
            final long jI = et1.I(f74Var.a.b, rv0.h);
            int i9 = i4;
            int i10 = i7 << 3;
            ep1.f(list, au8.O(-1106981705, new mw2() { // from class: o.d74
                @Override // o.mw2
                public final Object h(Object obj, Integer num, j74 j74Var, Boolean bool, Object obj2, Object obj3, Integer num2) {
                    int i11;
                    j74 j74Var2;
                    w14 w14Var = (w14) obj;
                    int iIntValue = num.intValue();
                    boolean zBooleanValue = bool.booleanValue();
                    Function0 function0 = (Function0) obj2;
                    ux2 ux2Var2 = (ux2) obj3;
                    int iIntValue2 = num2.intValue();
                    w14Var.getClass();
                    function0.getClass();
                    if ((iIntValue2 & 6) == 0) {
                        i11 = (ux2Var2.f(w14Var) ? 4 : 2) | iIntValue2;
                    } else {
                        i11 = iIntValue2;
                    }
                    if ((iIntValue2 & 48) == 0) {
                        i11 |= ux2Var2.d(iIntValue) ? 32 : 16;
                    }
                    if ((iIntValue2 & 384) == 0) {
                        j74Var2 = j74Var;
                        i11 |= ux2Var2.f(j74Var2) ? 256 : 128;
                    } else {
                        j74Var2 = j74Var;
                    }
                    if ((iIntValue2 & 3072) == 0) {
                        i11 |= ux2Var2.g(zBooleanValue) ? 2048 : 1024;
                    }
                    if ((iIntValue2 & 24576) == 0) {
                        i11 |= ux2Var2.h(function0) ? 16384 : 8192;
                    }
                    if (ux2Var2.N(i11 & 1, (74899 & i11) != 74898)) {
                        ux2Var2.W(-1332859949);
                        int i12 = i11 & 14;
                        int i13 = i11 >> 3;
                        lq1.f(w14Var, j74Var2, zBooleanValue, function0, f74Var, null, g74.m, c74Var, p74Var, jI, iw2Var, ux2Var2, i12 | (i13 & 112) | (i13 & 896) | (i13 & 7168));
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.Q();
                    }
                    return f88.a;
                }
            }, ux2Var), fs4Var, w44Var, nd5Var, r74Var, function1, function2, function3, liVar, ux2Var, (i9 & 14) | 48 | (i9 & 896) | ((i7 << 9) & 7168) | ((i9 >> 15) & 57344) | ((i7 << 12) & 458752) | ((i9 << 3) & 3670016) | (29360128 & i10) | (i10 & 234881024) | i8, ((i7 >> 6) & 1022) | ((i6 << 9) & 7168));
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.e74
                @Override // o.hw2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    int iY3 = yo1.Y(i3);
                    io1.k(list, f74Var, fs4Var, c74Var, r74Var, p74Var, k74Var, nd5Var, w44Var, function1, function2, function3, liVar, (ux2) obj, iY, iY2, iY3);
                    return f88.a;
                }
            };
        }
    }

    public static final void l(fs4 fs4Var, gi7 gi7Var, String str, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        gi7 gi7Var2;
        String str2;
        fs4 fs4Var3;
        final gi7 gi7Var3;
        String str3;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(-1284366513);
        int i2 = i | 406;
        final byte b2 = 0;
        final byte b3 = 1;
        if (ux2Var2.N(i2 & 1, (i2 & 147) != 146)) {
            ux2Var2.S();
            if ((i & 1) == 0 || ux2Var2.x()) {
                dl5 dl5Var = new dl5(new jv6((byte) 16), b3);
                we8 we8VarA = id4.a(ux2Var2);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                gi7 gi7Var4 = (gi7) g57.t(w86.a.b(gi7.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var2);
                fs4Var3 = cs4.b;
                gi7Var3 = gi7Var4;
                str3 = "TVTA-settings-lockDevice";
            } else {
                ux2Var2.Q();
                fs4Var3 = fs4Var;
                gi7Var3 = gi7Var;
                str3 = str;
            }
            ux2Var2.q();
            Context context = (Context) ux2Var2.j(lh.b);
            int iIntValue = ((Number) gi7Var3.q.getValue()).intValue();
            sk7 sk7Var = new sk7(y57.g(R.string.settings_lockDevice), y57.g(iIntValue), new yk7(R.drawable.lock), null, 8);
            boolean zH = ux2Var2.h(gi7Var3);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (zH || objK == awVar) {
                objK = new Function0() { // from class: o.yd4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object a() {
                        byte b4 = b2;
                        f88 f88Var = f88.a;
                        gi7 gi7Var5 = gi7Var3;
                        switch (b4) {
                            case 0:
                                IStatisticsHandler iStatisticsHandler = ga7.a;
                                ga7.a(ew6.OnLockDeviceClicked);
                                gi7Var5.p.setValue(Boolean.TRUE);
                                break;
                            default:
                                gi7Var5.p.setValue(Boolean.FALSE);
                                break;
                        }
                        return f88Var;
                    }
                };
                ux2Var2.g0(objK);
            }
            x37.e(sk7Var, fs4Var3, null, (Function0) objK, str3, ux2Var2, 24624, 36);
            fs4 fs4Var4 = fs4Var3;
            String str4 = str3;
            if (((Boolean) gi7Var3.p.getValue()).booleanValue()) {
                ux2Var2.W(1301764698);
                String strZ = m77.z(iIntValue, ux2Var2);
                boolean zH2 = ux2Var2.h(gi7Var3) | ux2Var2.h(context);
                Object objK2 = ux2Var2.K();
                if (zH2 || objK2 == awVar) {
                    objK2 = new o43(gi7Var3, context, (byte) 8);
                    ux2Var2.g0(objK2);
                }
                Function1 function1 = (Function1) objK2;
                boolean zH3 = ux2Var2.h(gi7Var3);
                Object objK3 = ux2Var2.K();
                if (zH3 || objK3 == awVar) {
                    objK3 = new Function0() { // from class: o.yd4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object a() {
                            byte b4 = b3;
                            f88 f88Var = f88.a;
                            gi7 gi7Var5 = gi7Var3;
                            switch (b4) {
                                case 0:
                                    IStatisticsHandler iStatisticsHandler = ga7.a;
                                    ga7.a(ew6.OnLockDeviceClicked);
                                    gi7Var5.p.setValue(Boolean.TRUE);
                                    break;
                                default:
                                    gi7Var5.p.setValue(Boolean.FALSE);
                                    break;
                            }
                            return f88Var;
                        }
                    };
                    ux2Var2.g0(objK3);
                }
                wo1.j(strZ, function1, (Function0) objK3, null, ux2Var, 0);
                ux2Var2 = ux2Var;
                ux2Var2.p(false);
            } else {
                ux2Var2.W(1302157747);
                ux2Var2.p(false);
            }
            fs4Var2 = fs4Var4;
            str2 = str4;
            gi7Var2 = gi7Var3;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
            gi7Var2 = gi7Var;
            str2 = str;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new f9(fs4Var2, (Object) gi7Var2, (Object) str2, i, (byte) 16);
        }
    }

    public static final void m(boolean z, Function1 function1, fs4 fs4Var, ux2 ux2Var, int i) {
        int i2;
        Function1 function2;
        fs4 fs4Var2;
        ux2Var.Y(725195962);
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
            i2 |= ux2Var.f("TVTA-settings-remoteCursor") ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            fs4Var2 = fs4Var;
            i2 |= ux2Var.f(fs4Var2) ? 2048 : 1024;
        } else {
            fs4Var2 = fs4Var;
        }
        if (ux2Var.N(i2 & 1, (i2 & 1171) != 1170)) {
            l47.d(new sk7(y57.g(R.string.settings_remoteCursor), null, new yk7(R.drawable.cursor), null, 26), z, function2, fs4Var2, "TVTA-settings-remoteCursor", m77.z(R.string.settings_remoteCursor, ux2Var), ux2Var, ((i2 << 3) & 1008) | (i2 & 7168) | ((i2 << 6) & 57344), 32);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new kc(z, function1, fs4Var, i, (byte) 2);
        }
    }

    public static final void n(a06 a06Var, List list, Function0 function0, Function1 function1, fs4 fs4Var, tx5 tx5Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        tx5 tx5Var2;
        ux2 ux2Var2;
        int i2;
        int i3;
        tx5 tx5Var3;
        fs4 fs4Var3;
        Object obj;
        Function0 function2;
        Object fy5Var;
        tx5 tx5Var4;
        px4 px4Var;
        yf5 yf5Var;
        byte b2;
        int i4;
        char c2;
        Context context;
        byte b3;
        aw awVar;
        boolean z;
        ux2 ux2Var3;
        ux2 ux2Var4 = ux2Var;
        a06Var.getClass();
        function0.getClass();
        function1.getClass();
        ux2Var4.Y(-1494136057);
        int i5 = i | (ux2Var4.f(a06Var) ? 4 : 2) | (ux2Var4.f(list) ? 32 : 16) | (ux2Var4.h(function0) ? 256 : 128) | (ux2Var4.h(function1) ? 2048 : 1024) | 90112;
        byte b4 = 1;
        if (ux2Var4.N(i5 & 1, (74899 & i5) != 74898)) {
            ux2Var4.S();
            if ((i & 1) == 0 || ux2Var4.x()) {
                dl5 dl5Var = new dl5(new x85((byte) 19), b4);
                we8 we8VarA = id4.a(ux2Var4);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                i2 = 0;
                tx5 tx5Var5 = (tx5) g57.t(w86.a.b(tx5.class), we8VarA, null, dl5Var, h57.k(we8VarA), ux2Var4);
                i3 = i5 & (-458753);
                tx5Var3 = tx5Var5;
                fs4Var3 = cs4.b;
            } else {
                ux2Var4.Q();
                fs4Var3 = fs4Var;
                i3 = i5 & (-458753);
                i2 = 0;
                tx5Var3 = tx5Var;
            }
            ux2Var4.q();
            Context context2 = (Context) ux2Var4.j(lh.b);
            Resources resources = (Resources) ux2Var4.j(lh.c);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) ux2Var4.j(dd4.a);
            Object objK = ux2Var4.K();
            aw awVar2 = e01.a;
            if (objK == awVar2) {
                objK = ck3.w(ux2Var4);
                ux2Var4.g0(objK);
            }
            me1 me1Var = (me1) objK;
            px4 px4VarG = g57.g(a06Var.f, ux2Var4);
            int i6 = (!a06Var.c || a06Var.a()) ? i2 : 1;
            Object[] objArr = new Object[i2];
            Object objK2 = ux2Var4.K();
            if (objK2 == awVar2) {
                objK2 = new x85((byte) 20);
                ux2Var4.g0(objK2);
            }
            px4 px4Var2 = (px4) zu1.L(objArr, (Function0) objK2, ux2Var4, 48);
            Object[] objArr2 = new Object[0];
            Object objK3 = ux2Var4.K();
            byte b5 = 22;
            if (objK3 == awVar2) {
                objK3 = new x85(b5);
                ux2Var4.g0(objK3);
            }
            yf5 yf5Var2 = (yf5) zu1.L(objArr2, (Function0) objK3, ux2Var4, 48);
            boolean zH = ux2Var4.h(tx5Var3) | ux2Var4.f(px4Var2) | ux2Var4.f(yf5Var2);
            Object objK4 = ux2Var4.K();
            if (zH || objK4 == awVar2) {
                objK4 = new n5((Object) tx5Var3, (Object) px4Var2, (Object) yf5Var2, (byte) 24);
                ux2Var4.g0(objK4);
            }
            Function0 function3 = (Function0) objK4;
            int i7 = i6;
            Object[] objArr3 = new Object[0];
            Object objK5 = ux2Var4.K();
            if (objK5 == awVar2) {
                objK5 = new x85((byte) 21);
                ux2Var4.g0(objK5);
            }
            px4 px4Var3 = (px4) zu1.L(objArr3, (Function0) objK5, ux2Var4, 48);
            e8 e8Var = new e8((byte) 2);
            boolean zH2 = ux2Var4.h(tx5Var3);
            Object objK6 = ux2Var4.K();
            if (zH2 || objK6 == awVar2) {
                objK6 = new qx5(tx5Var3, (byte) 1);
                ux2Var4.g0(objK6);
            }
            qk4 qk4VarX0 = db8.x0(e8Var, (Function1) objK6, ux2Var4);
            e8 e8Var2 = new e8((byte) 3);
            int i8 = i3 & 896;
            int i9 = i3;
            boolean zH3 = ux2Var4.h(context2) | (i8 == 256) | ux2Var4.h(tx5Var3);
            Object objK7 = ux2Var4.K();
            if (zH3 || objK7 == awVar2) {
                objK7 = new xn5(context2, function0, tx5Var3, (byte) 1);
                ux2Var4.g0(objK7);
            }
            qk4 qk4VarX1 = db8.x0(e8Var2, (Function1) objK7, ux2Var4);
            Object objK8 = ux2Var4.K();
            if (objK8 == awVar2) {
                objK8 = new q37();
                ux2Var4.g0(objK8);
            }
            q37 q37Var = (q37) objK8;
            boolean z2 = (i9 & 14) == 4;
            Object objK9 = ux2Var4.K();
            if (z2 || objK9 == awVar2) {
                objK9 = new s21(q37Var, a06Var, (byte) 3);
                ux2Var4.g0(objK9);
            }
            Function1 function4 = (Function1) objK9;
            Object objK10 = ux2Var4.K();
            if (objK10 == awVar2) {
                objK10 = new t21(q37Var, (byte) 3);
                ux2Var4.g0(objK10);
            }
            Function0 function5 = (Function0) objK10;
            Object objK11 = ux2Var4.K();
            if (objK11 == awVar2) {
                BarcodeView barcodeView = new BarcodeView(context2);
                barcodeView.setDecoderFactory(new gy8(qf0.K(v20.x)));
                ux2Var4.g0(barcodeView);
                obj = barcodeView;
            } else {
                obj = objK11;
            }
            BarcodeView barcodeView2 = (BarcodeView) obj;
            boolean zH4 = ux2Var4.h(barcodeView2) | ux2Var4.h(tx5Var3);
            Object objK12 = ux2Var4.K();
            byte b6 = 27;
            if (zH4 || objK12 == awVar2) {
                objK12 = new o43(barcodeView2, tx5Var3, b6);
                ux2Var4.g0(objK12);
            }
            ck3.e(barcodeView2, (Function1) objK12, ux2Var4);
            boolean zH5 = ux2Var4.h(barcodeView2) | ux2Var4.h(lifecycleOwner);
            Object objK13 = ux2Var4.K();
            if (zH5 || objK13 == awVar2) {
                objK13 = new wx5(lifecycleOwner, barcodeView2, (byte) 0);
                ux2Var4.g0(objK13);
            }
            ck3.e(lifecycleOwner, (Function1) objK13, ux2Var4);
            px4 px4VarT = h57.t(function1, ux2Var4);
            int i10 = i9 & 112;
            tx5 tx5Var6 = tx5Var3;
            boolean zH6 = (i10 == 32) | ux2Var4.h(context2) | ux2Var4.f(px4Var3) | ux2Var4.h(qk4VarX0) | ux2Var4.h(tx5Var3) | ux2Var4.h(me1Var) | ux2Var4.h(resources) | ux2Var4.f(function4) | ux2Var4.f(function3) | ux2Var4.f(px4VarT) | ux2Var4.f(px4Var2) | ux2Var4.f(yf5Var2);
            Object objK14 = ux2Var4.K();
            if (zH6 || objK14 == awVar2) {
                function2 = function3;
                tx5Var4 = tx5Var6;
                px4Var = px4Var2;
                yf5Var = yf5Var2;
                b2 = 0;
                i4 = 256;
                c2 = 22;
                context = context2;
                b3 = 3;
                fy5Var = new fy5(context, px4Var3, qk4VarX0, tx5Var4, list, me1Var, resources, function4, function5, function2, px4VarT, px4Var, yf5Var, null);
                ux2Var4.g0(fy5Var);
            } else {
                px4Var = px4Var2;
                context = context2;
                yf5Var = yf5Var2;
                function2 = function3;
                tx5Var4 = tx5Var6;
                c2 = 22;
                b3 = 3;
                i4 = 256;
                b2 = 0;
                fy5Var = objK14;
            }
            ck3.i(f88.a, (hw2) fy5Var, ux2Var4);
            yy0 yy0VarO = au8.O(-654017589, new v4(function0, (byte) 26), ux2Var4);
            yy0 yy0VarO2 = au8.O(1878123981, new l21(q37Var, b3), ux2Var4);
            yy0 yy0VarO3 = au8.O(-1940813930, new ay5(barcodeView2, i7, b2), ux2Var4);
            Context context3 = context;
            tx5 tx5Var7 = tx5Var4;
            int i11 = i4;
            fs4 fs4Var4 = fs4Var3;
            nv1.g(fs4Var4, yy0VarO, null, yy0VarO2, null, 0, 0L, 0L, null, yy0VarO3, ux2Var, 805309494, 500);
            ux2 ux2Var5 = ux2Var;
            if (((Boolean) tx5Var7.q.getValue()).booleanValue()) {
                ux2Var5.W(1241744040);
                boolean zH7 = ux2Var5.h(tx5Var7) | (i8 == i11);
                Object objK15 = ux2Var5.K();
                awVar = awVar2;
                if (zH7 || objK15 == awVar) {
                    objK15 = new ql1(tx5Var7, function0, (byte) 26);
                    ux2Var5.g0(objK15);
                }
                Function0 function6 = (Function0) objK15;
                boolean zH8 = ux2Var5.h(context3) | ux2Var5.h(qk4VarX1);
                Object objK16 = ux2Var5.K();
                if (zH8 || objK16 == awVar) {
                    objK16 = new ql1(context3, qk4VarX1, (byte) 27);
                    ux2Var5.g0(objK16);
                }
                z = false;
                ck3.b(0, function6, (Function0) objK16, ux2Var5, null);
                ux2Var5.p(false);
            } else {
                awVar = awVar2;
                z = false;
                ux2Var5.W(1242192827);
                ux2Var5.p(false);
            }
            if (((Boolean) tx5Var7.p.getValue()).booleanValue()) {
                ux2Var5.W(1242261368);
                boolean zBooleanValue = ((Boolean) px4VarG.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) tx5Var7.u.getValue()).booleanValue();
                String str = (String) tx5Var7.s.getValue();
                boolean z3 = (str == null || str.length() == 0) ? true : z;
                int iZ = yf5Var.z();
                String str2 = (String) px4Var.getValue();
                px4 px4Var4 = px4Var;
                boolean zF = ux2Var5.f(px4Var4);
                Object objK17 = ux2Var5.K();
                if (zF || objK17 == awVar) {
                    objK17 = new va(px4Var4, (byte) 22);
                    ux2Var5.g0(objK17);
                }
                Function1 function7 = (Function1) objK17;
                boolean zH9 = ux2Var5.h(tx5Var7) | ux2Var5.f(px4Var4);
                Object objK18 = ux2Var5.K();
                if (zH9 || objK18 == awVar) {
                    objK18 = new ql1(tx5Var7, px4Var4, (byte) 28);
                    ux2Var5.g0(objK18);
                }
                xo1.r(zBooleanValue, zBooleanValue2, z3, iZ, str2, function7, (Function0) objK18, function2, null, null, ux2Var5, 0);
                ux2 ux2Var6 = ux2Var5;
                ux2Var6.p(z);
                ux2Var3 = ux2Var6;
            } else {
                ux2Var5.W(1242725531);
                ux2Var5.p(z);
                ux2Var3 = ux2Var5;
            }
            tx5Var2 = tx5Var7;
            fs4Var2 = fs4Var4;
            ux2Var2 = ux2Var3;
        } else {
            ux2Var4.Q();
            fs4Var2 = fs4Var;
            tx5Var2 = tx5Var;
            ux2Var2 = ux2Var4;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new q41((Object) a06Var, (Object) list, (pw2) function0, (pw2) function1, fs4Var2, (oe8) tx5Var2, i, (byte) 3);
        }
    }

    public static final void o(x46 x46Var, fs4 fs4Var, Function0 function0, Function0 function1, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        ux2 ux2Var2 = ux2Var;
        x46Var.getClass();
        f95 f95Var = x46Var.c;
        ux2Var2.Y(-1327989608);
        int i2 = i | (ux2Var2.h(x46Var) ? 4 : 2) | 48 | (ux2Var2.h(function0) ? 256 : 128) | (ux2Var2.h(function1) ? 2048 : 1024);
        byte b2 = 0;
        if (ux2Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = f95Var != f95.n;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarJ = iq8.j(androidx.compose.foundation.layout.b.c(cs4Var, 1.0f), sf6.a(12.0f));
            xg3 xg3Var = (xg3) ux2Var2.j(ug3.a);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = ua5.s(ux2Var2);
            }
            boolean z2 = z;
            fs4 fs4VarD = ka0.D(androidx.compose.foundation.b.a(fs4VarJ, (mw4) objK, xg3Var, z2, null, function0, 24), 0.0f, 8.0f, 1);
            dg6 dg6VarA = cg6.a(iq8.a, xz2.y, ux2Var2, 48);
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
            o67.n(dg6VarA, d82.v, ux2Var2);
            o67.n(yj5VarL, d82.u, ux2Var2);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
            o67.l(ux2Var2);
            o67.n(fs4VarS, d82.t, ux2Var2);
            p(f95Var, x46Var.d, null, ux2Var2, 0);
            boolean zH = ux2Var2.h(x46Var);
            Object objK2 = ux2Var2.K();
            if (zH || objK2 == awVar) {
                objK2 = new y46(x46Var, b2);
                ux2Var2.g0(objK2);
            }
            fs4 fs4VarF = ka0.F(cp6.a(cs4Var, false, (Function1) objK2).f(new s14(1.0f, true)), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            String str = x46Var.b;
            h72 h72Var = un4.a;
            qs7.b(str, fs4VarF, ((rn4) ux2Var2.j(h72Var)).a.q, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var2.j(h72Var)).b.j, ux2Var, 0, 24960, 110584);
            td3.b(lv1.T(R.drawable.ic_connect, ux2Var, 0), m77.z(R.string.connect_content_description, ux2Var), androidx.compose.foundation.layout.b.l(ka0.F(cs4Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 20.0f), rv0.b(z2 ? 1.0f : 0.38f, ((rn4) ux2Var.j(h72Var)).a.a), ux2Var, 392, 0);
            ux2Var2 = ux2Var;
            nv1.f(i2 & 8064, function0, function1, ux2Var2, null, z2);
            ux2Var2.p(true);
            fs4Var2 = cs4Var;
        } else {
            ux2Var2.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new z8((Object) x46Var, fs4Var2, (Object) function0, (Object) function1, i, (byte) 14);
        }
    }

    public static final void p(f95 f95Var, jz1 jz1Var, fs4 fs4Var, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        es1 es1Var;
        es1 es1Var2;
        ux2Var.Y(-1183564423);
        int i2 = (ux2Var.d(f95Var.ordinal()) ? 4 : 2) | i | (ux2Var.d(jz1Var == null ? -1 : jz1Var.ordinal()) ? 32 : 16) | 384;
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            f95Var.getClass();
            int i3 = jz1Var != null ? z46.a[jz1Var.ordinal()] : -1;
            as1 as1Var = as1.m;
            if (i3 != 1) {
                if (i3 != 2) {
                    int iOrdinal = f95Var.ordinal();
                    if (iOrdinal == 1) {
                        es1Var = new es1(as1Var, fs1.f825o);
                    } else if (iOrdinal != 2) {
                        es1Var2 = new es1(as1.f353o, fs1.p);
                    } else {
                        es1Var = new es1(as1Var, fs1.m);
                    }
                } else {
                    es1Var2 = new es1(as1.n, ds1.n0(f95Var));
                }
                hi7 hi7Var = hi7.Size40dp;
                cs4 cs4Var = cs4.b;
                ds1.e(es1Var2, hi7Var, ka0.F(cs4Var, 16.0f, 0.0f, 16.0f, 0.0f, 10), ux2Var, 48);
                fs4Var2 = cs4Var;
            } else {
                es1Var = new es1(as1Var, ds1.n0(f95Var));
            }
            es1Var2 = es1Var;
            hi7 hi7Var2 = hi7.Size40dp;
            cs4 cs4Var2 = cs4.b;
            ds1.e(es1Var2, hi7Var2, ka0.F(cs4Var2, 16.0f, 0.0f, 16.0f, 0.0f, 10), ux2Var, 48);
            fs4Var2 = cs4Var2;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new f9((Object) f95Var, (Object) jz1Var, (Object) fs4Var2, i, (byte) 21);
        }
    }

    public static final void q(boolean z, boolean z2, Function1 function1, int i, Function0 function0, fs4 fs4Var, String str, ux2 ux2Var, int i2) {
        String str2;
        function1.getClass();
        function0.getClass();
        ux2Var.Y(-125491132);
        int i3 = i2 | (ux2Var.g(z) ? 4 : 2) | (ux2Var.g(z2) ? 32 : 16) | (ux2Var.h(function1) ? 256 : 128) | (ux2Var.d(i) ? 2048 : 1024) | (ux2Var.h(function0) ? 16384 : 8192) | (ux2Var.f(fs4Var) ? 131072 : 65536) | 1572864;
        if (ux2Var.N(i3 & 1, (599187 & i3) != 599186)) {
            if (z) {
                ux2Var.W(-1884481124);
                x(i, ((i3 >> 6) & 7168) | ((i3 >> 9) & 126) | 384, function0, ux2Var, fs4Var);
                ux2Var.p(false);
            } else {
                ux2Var.W(-1884313941);
                m(z2, function1, fs4Var, ux2Var, ((i3 >> 6) & 7168) | ((i3 >> 3) & 126) | 384);
                ux2Var.p(false);
            }
            str2 = "TVTA-settings-remoteCursor";
        } else {
            ux2Var.Q();
            str2 = str;
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ic(z, z2, function1, i, function0, fs4Var, str2, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:40:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:64:0x0104  */
    /* JADX WARN: Code duplicated, block: B:66:0x0153  */
    /* JADX WARN: Code duplicated, block: B:69:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void r(List list, String str, Function1 function1, Function0 function0, fs4 fs4Var, boolean z, String str2, xy6 xy6Var, ux2 ux2Var, int i, int i2) {
        boolean z2;
        int i3;
        String str3;
        int i4;
        boolean z3;
        fs4 fs4Var2;
        xy6 xy6Var2;
        boolean z4;
        String str4;
        j56 j56VarR;
        int i5;
        xy6 xy6VarR;
        fs4 fs4Var3;
        boolean z5;
        ArrayList arrayList;
        Object objK;
        list.getClass();
        str.getClass();
        function1.getClass();
        function0.getClass();
        ux2Var.Y(238007164);
        int i6 = i | (ux2Var.f(list) ? 4 : 2) | (ux2Var.f(str) ? 32 : 16) | (ux2Var.h(function1) ? 256 : 128) | (ux2Var.h(function0) ? 2048 : 1024);
        int i7 = i6 | 24576;
        int i8 = i2 & 32;
        if (i8 != 0) {
            i3 = i6 | 221184;
            z2 = z;
        } else {
            z2 = z;
            i3 = i7 | (ux2Var.g(z2) ? 131072 : 65536);
        }
        int i9 = i2 & 64;
        if (i9 == 0) {
            if ((i & 1572864) == 0) {
                str3 = str2;
                i3 |= ux2Var.f(str3) ? 1048576 : 524288;
            }
            i4 = i3 | 4194304;
            if ((4793491 & i4) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ux2Var.N(i4 & 1, z3)) {
                ux2Var.S();
                if ((i & 1) != 0 || ux2Var.x()) {
                    boolean z6 = i8 == 0 ? z2 : true;
                    if (i9 != 0) {
                        str3 = "TVTA-devicesScreen-selectContactDeviceBottomSheet";
                    }
                    i5 = i4 & (-29360129);
                    xy6VarR = yo1.R(null, ux2Var, 6, 2);
                    fs4Var3 = cs4.b;
                    z5 = z6;
                } else {
                    ux2Var.Q();
                    i5 = i4 & (-29360129);
                    xy6VarR = xy6Var;
                    z5 = z2;
                    fs4Var3 = fs4Var;
                }
                String str5 = str3;
                ux2Var.q();
                Function1 function1K = et1.K(xy6VarR, function0, ux2Var, (i5 >> 6) & 112);
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((z31) obj).i == f95.f778o) {
                        arrayList.add(obj);
                    }
                }
                objK = ux2Var.K();
                if (objK == e01.a) {
                    objK = new fk6((byte) 5);
                    ux2Var.g0(objK);
                }
                yo1.k(function0, androidx.compose.ui.platform.a.a(cp6.a(fs4Var3, false, (Function1) objK), str5), xy6VarR, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-205146274, new h5(str5, str, arrayList, function1K, function1, z5), ux2Var), ux2Var, (i5 >> 9) & 14, 3072, 8184);
                xy6Var2 = xy6VarR;
                z4 = z5;
                str4 = str5;
                fs4Var2 = fs4Var3;
            } else {
                ux2Var.Q();
                fs4Var2 = fs4Var;
                xy6Var2 = xy6Var;
                z4 = z2;
                str4 = str3;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new pm6(list, str, function1, function0, fs4Var2, z4, str4, xy6Var2, i, i2);
            }
        }
        i3 |= 1572864;
        str3 = str2;
        i4 = i3 | 4194304;
        if ((4793491 & i4) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ux2Var.N(i4 & 1, z3)) {
            ux2Var.S();
            if ((i & 1) != 0) {
                if (i8 == 0) {
                }
                if (i9 != 0) {
                    str3 = "TVTA-devicesScreen-selectContactDeviceBottomSheet";
                }
                i5 = i4 & (-29360129);
                xy6VarR = yo1.R(null, ux2Var, 6, 2);
                fs4Var3 = cs4.b;
                z5 = z6;
            } else {
                if (i8 == 0) {
                }
                if (i9 != 0) {
                    str3 = "TVTA-devicesScreen-selectContactDeviceBottomSheet";
                }
                i5 = i4 & (-29360129);
                xy6VarR = yo1.R(null, ux2Var, 6, 2);
                fs4Var3 = cs4.b;
                z5 = z6;
            }
            String str6 = str3;
            ux2Var.q();
            Function1 function1K2 = et1.K(xy6VarR, function0, ux2Var, (i5 >> 6) & 112);
            arrayList = new ArrayList();
            while (r5.hasNext()) {
                if (((z31) obj).i == f95.f778o) {
                    arrayList.add(obj);
                }
            }
            objK = ux2Var.K();
            if (objK == e01.a) {
                objK = new fk6((byte) 5);
                ux2Var.g0(objK);
            }
            yo1.k(function0, androidx.compose.ui.platform.a.a(cp6.a(fs4Var3, false, (Function1) objK), str6), xy6VarR, 0.0f, false, null, 0L, 0L, 0L, null, null, null, au8.O(-205146274, new h5(str6, str, arrayList, function1K2, function1, z5), ux2Var), ux2Var, (i5 >> 9) & 14, 3072, 8184);
            xy6Var2 = xy6VarR;
            z4 = z5;
            str4 = str6;
            fs4Var2 = fs4Var3;
        } else {
            ux2Var.Q();
            fs4Var2 = fs4Var;
            xy6Var2 = xy6Var;
            z4 = z2;
            str4 = str3;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new pm6(list, str, function1, function0, fs4Var2, z4, str4, xy6Var2, i, i2);
        }
    }

    public static final void s(boolean z, nr6 nr6Var, or6 or6Var, fs4 fs4Var, SupportSession supportSession, ux2 ux2Var, int i) {
        int i2;
        ux2 ux2Var2;
        int i3;
        aw awVar;
        boolean z2;
        w44 w44Var;
        or6Var.getClass();
        List list = or6Var.a;
        boolean z3 = or6Var.c;
        ux2Var.Y(-1032610246);
        if ((i & 6) == 0) {
            i2 = (ux2Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(nr6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(or6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.h(supportSession) ? 16384 : 8192;
        }
        if (ux2Var.N(i2 & 1, (i2 & 9363) != 9362)) {
            w44 w44VarA = z44.a(or6Var.j, or6Var.k, ux2Var, 0);
            Object objK = ux2Var.K();
            aw awVar2 = e01.a;
            if (objK == awVar2) {
                objK = ck3.w(ux2Var);
                ux2Var.g0(objK);
            }
            me1 me1Var = (me1) objK;
            Object[] objArr = new Object[0];
            boolean zH = ux2Var.h(or6Var);
            Object objK2 = ux2Var.K();
            byte b2 = 14;
            if (zH || objK2 == awVar2) {
                objK2 = new y26(or6Var, b2);
                ux2Var.g0(objK2);
            }
            px4 px4Var = (px4) zu1.L(objArr, (Function0) objK2, ux2Var, 0);
            rr6 rr6Var = or6Var.i;
            boolean zF = ux2Var.f(px4Var) | ux2Var.h(or6Var) | ux2Var.f(w44VarA);
            Object objK3 = ux2Var.K();
            if (zF || objK3 == awVar2) {
                i3 = i2;
                awVar = awVar2;
                ko2 ko2Var = new ko2((Object) or6Var, (Object) w44VarA, (Object) px4Var, (hc1) null, (byte) 20);
                ux2Var.g0(ko2Var);
                objK3 = ko2Var;
            } else {
                i3 = i2;
                awVar = awVar2;
            }
            ck3.i(rr6Var, (hw2) objK3, ux2Var);
            boolean zH2 = ux2Var.h(nr6Var) | ux2Var.f(w44VarA);
            Object objK4 = ux2Var.K();
            if (zH2 || objK4 == awVar) {
                objK4 = new py5((Object) nr6Var, (Object) w44VarA, (byte) 10);
                ux2Var.g0(objK4);
            }
            ck3.e(f88.a, (Function1) objK4, ux2Var);
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4Var);
            yz0.c.getClass();
            ux2Var.a0();
            boolean z4 = ux2Var.S;
            tg3 tg3Var = LayoutNode.e0;
            if (z4) {
                ux2Var.k(tg3Var);
            } else {
                ux2Var.j0();
            }
            iz0 iz0Var = d82.v;
            o67.n(kw0VarA, iz0Var, ux2Var);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var);
            o67.l(ux2Var);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var);
            ux2Var2 = ux2Var;
            t((z3 || list.isEmpty()) ? false : true, or6Var.i, androidx.compose.foundation.layout.b.c(cs4.b, 1.0f), nr6Var.a, ux2Var2, 384);
            if (z3) {
                ux2Var2.W(1229728008);
                FillElement fillElement = androidx.compose.foundation.layout.b.c;
                do4 do4VarC = ua0.c(xz2.s, false);
                int iHashCode2 = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL2 = ux2Var2.l();
                fs4 fs4VarS2 = uf0.s(ux2Var2, fillElement);
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(tg3Var);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC, iz0Var, ux2Var2);
                o67.n(yj5VarL2, iz0Var2, ux2Var2);
                e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
                o67.n(fs4VarS2, iz0Var4, ux2Var2);
                st5.a(null, 0L, 0.0f, 0L, 0, 0.0f, ux2Var2, 0, 63);
                ux2Var2.p(true);
                ux2Var2.p(false);
                z2 = true;
            } else if (list.isEmpty()) {
                ux2Var2.W(1230007938);
                f(R.drawable.tv_no_sessions, m77.z(R.string.tv_service_queue_empty_state_title, ux2Var2), m77.z(R.string.tv_service_queue_empty_state_subtitle, ux2Var2), new s14(1.0f, true), ux2Var2, 0);
                ux2Var2.p(false);
                z2 = true;
            } else {
                z2 = true;
                ux2Var2.W(1230452695);
                FillElement fillElement2 = androidx.compose.foundation.layout.b.c;
                boolean zH3 = ux2Var2.h(or6Var) | ((i3 & 14) == 4) | ux2Var2.h(supportSession) | ux2Var2.h(nr6Var) | ux2Var2.h(me1Var) | ux2Var2.f(w44VarA);
                Object objK5 = ux2Var2.K();
                if (zH3 || objK5 == awVar) {
                    jd1 jd1Var = new jd1(or6Var, z, supportSession, nr6Var, me1Var, w44VarA, (byte) 2);
                    w44Var = w44VarA;
                    ux2Var2.g0(jd1Var);
                    objK5 = jd1Var;
                } else {
                    w44Var = w44VarA;
                }
                yo1.i(6, 508, (Function1) objK5, null, null, null, null, ux2Var2, w44Var, fillElement2, null, false);
                ux2Var2 = ux2Var2;
                ux2Var2.p(false);
            }
            ux2Var2.p(z2);
        } else {
            ux2Var2 = ux2Var;
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new q23(z, nr6Var, or6Var, fs4Var, supportSession, i, (byte) 1);
        }
    }

    public static final void t(boolean z, rr6 rr6Var, fs4 fs4Var, Function0 function0, ux2 ux2Var, int i) {
        int i2;
        int i3;
        ux2 ux2Var2 = ux2Var;
        ux2Var2.Y(1658610154);
        int i4 = i | (ux2Var2.g(z) ? 4 : 2) | (ux2Var2.d(rr6Var.ordinal()) ? 32 : 16) | (ux2Var2.h(function0) ? 2048 : 1024);
        if (ux2Var2.N(i4 & 1, (i4 & 1171) != 1170)) {
            int iOrdinal = rr6Var.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                i2 = 491500425;
                i3 = R.string.sort_name_label;
            } else if (iOrdinal == 2) {
                i2 = 491503972;
                i3 = R.string.service_queue_sort_status_waiting;
            } else {
                if (iOrdinal != 3) {
                    throw fx3.m(491497673, ux2Var2, false);
                }
                i2 = 491507463;
                i3 = R.string.service_queue_sort_status_not_joined;
            }
            String strM = to7.m(ux2Var2, i2, i3, ux2Var2, false);
            i97 i97VarA = vm.a(rr6Var == rr6.n ? 180.0f : 0.0f, null, "serviceQueueSortRotation", ux2Var2, 3072, 22);
            fs4 fs4VarB = ka0.B(fs4Var, 8.0f);
            cw cwVar = iq8.g;
            x50 x50Var = xz2.y;
            dg6 dg6VarA = cg6.a(cwVar, x50Var, ux2Var2, 54);
            int iHashCode = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL = ux2Var2.l();
            fs4 fs4VarS = uf0.s(ux2Var2, fs4VarB);
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
            o67.n(dg6VarA, iz0Var, ux2Var2);
            iz0 iz0Var2 = d82.u;
            o67.n(yj5VarL, iz0Var2, ux2Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            iz0 iz0Var3 = d82.w;
            o67.n(numValueOf, iz0Var3, ux2Var2);
            o67.l(ux2Var2);
            iz0 iz0Var4 = d82.t;
            o67.n(fs4VarS, iz0Var4, ux2Var2);
            qf6 qf6VarA = sf6.a(8.0f);
            cs4 cs4Var = cs4.b;
            fs4 fs4VarJ = iq8.j(cs4Var, qf6VarA);
            boolean z3 = (i4 & 7168) == 2048;
            Object objK = ux2Var2.K();
            if (z3 || objK == e01.a) {
                objK = new yv1(function0, (byte) 25);
                ux2Var2.g0(objK);
            }
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(ka0.C(androidx.compose.foundation.b.b(fs4VarJ, z, null, null, (Function0) objK, 14), 8.0f, 6.0f), "TVTA-devicesScreen-serviceQueue-sortingItem");
            dg6 dg6VarA2 = cg6.a(new ew(8.0f, new hk0((byte) 2)), x50Var, ux2Var2, 54);
            int iHashCode2 = Long.hashCode(ux2Var2.T);
            yj5 yj5VarL2 = ux2Var2.l();
            fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarA);
            ux2Var2.a0();
            if (ux2Var2.S) {
                ux2Var2.k(tg3Var);
            } else {
                ux2Var2.j0();
            }
            o67.n(dg6VarA2, iz0Var, ux2Var2);
            o67.n(yj5VarL2, iz0Var2, ux2Var2);
            e41.r(iHashCode2, ux2Var2, iz0Var3, ux2Var2);
            o67.n(fs4VarS2, iz0Var4, ux2Var2);
            h72 h72Var = un4.a;
            qs7.b(strM, androidx.compose.ui.platform.a.a(cs4Var, "TVTA-devicesScreen-serviceQueue-sortingLabel"), rv0.b(z ? 1.0f : 0.38f, ((rn4) ux2Var2.j(h72Var)).a.s), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var2.j(h72Var)).b.m, ux2Var2, 48, 24960, 110584);
            fs4 fs4VarA2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.l(e0(cs4Var, ((Number) i97VarA.getValue()).floatValue()), 18.0f), "TVTA-devicesScreen-serviceQueue-sortingIcon");
            td3.b(lv1.T(R.drawable.ic_sort, ux2Var2, 0), m77.z(R.string.sort_by, ux2Var2), fs4VarA2, rv0.b(z ? 1.0f : 0.38f, ((rn4) ux2Var2.j(h72Var)).a.s), ux2Var2, 8, 0);
            ux2Var2 = ux2Var2;
            ux2Var2.p(true);
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new na(z, rr6Var, fs4Var, function0, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    public static final void u(final SupportSession supportSession, final xv1 xv1Var, final boolean z, final Function0 function0, final Function0 function1, final Function1 function2, final Function1 function3, final Function1 function4, final Function1 function5, final Function1 function6, final List list, final vx6 vx6Var, final Function1 function7, final Function0 function8, ux2 ux2Var, final int i, final int i2) {
        ?? r2;
        ux2Var.Y(-1074279176);
        int i3 = (ux2Var.h(supportSession) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= ux2Var.h(xv1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ux2Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ux2Var.h(function0) ? 2048 : 1024;
        }
        int i4 = i3 | (ux2Var.h(function1) ? 16384 : 8192) | (ux2Var.h(function2) ? 131072 : 65536) | (ux2Var.h(function3) ? 1048576 : 524288) | (ux2Var.h(function4) ? 8388608 : 4194304) | (ux2Var.h(function5) ? 67108864 : 33554432) | (ux2Var.h(function6) ? 536870912 : 268435456);
        int i5 = (i2 & 6) == 0 ? i2 | ((i2 & 8) == 0 ? ux2Var.f(list) : ux2Var.h(list) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i5 |= (i2 & 64) == 0 ? ux2Var.f(vx6Var) : ux2Var.h(vx6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= ux2Var.h(function7) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= ux2Var.h(function8) ? 2048 : 1024;
        }
        int i6 = i5;
        if (ux2Var.N(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            f88 f88Var = null;
            xs1.c(xv1Var.d ? new sz1(new n5((Object) xv1Var, (Object) function7, (Object) function1, (byte) 12), xv1Var.a, xv1Var.b, new qv1(function7, (byte) 4)) : new tz1(!z, new a9(function0, (byte) 29), new a9(function1, (byte) 26)), null, ux2Var, 8, 2);
            if (supportSession == null) {
                ux2Var.W(-2048591400);
                r2 = 0;
                ux2Var.p(false);
            } else {
                ux2Var.W(-2048591399);
                boolean z2 = xv1Var.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    l33 l33Var = (l33) obj;
                    if (bt1.A(l33Var) != null && l33Var.d) {
                        arrayList.add(obj);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (hashSet.add(((l33) obj2).a)) {
                        arrayList2.add(obj2);
                    }
                }
                it1.i(supportSession, null, z2, arrayList2, function2, function3, function4, function1, vx6Var, function5, function8, function6, null, ux2Var, ((i4 >> 3) & 4186112) | ((i4 << 9) & 29360128) | ((i6 << 21) & 234881024) | (1879048192 & (i4 << 3)), ((i6 >> 9) & 14) | ((i4 >> 24) & 112));
                r2 = 0;
                ux2Var.p(false);
                f88Var = f88.a;
            }
            if (f88Var == null) {
                ux2Var.W(-1590085636);
                wo1.d(m77.z(R.string.session_info_empty_message, ux2Var), ux2Var, r2);
                ux2Var.p(r2);
            } else {
                ux2Var.W(-1590104422);
                ux2Var.p(r2);
            }
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new hw2() { // from class: o.vv1
                @Override // o.hw2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iY = yo1.Y(i | 1);
                    int iY2 = yo1.Y(i2);
                    io1.u(supportSession, xv1Var, z, function0, function1, function2, function3, function4, function5, function6, list, vx6Var, function7, function8, (ux2) obj3, iY, iY2);
                    return f88.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void v(eg3 eg3Var, boolean z, a06 a06Var, dw6 dw6Var, iv6 iv6Var, Function1 function1, boolean z2, fs4 fs4Var, String str, ux2 ux2Var, int i) {
        iv6 iv6Var2;
        ux2 ux2Var2;
        fs4 fs4Var2;
        String str2;
        String str3;
        int i2;
        fs4 fs4Var3;
        Object ko2Var;
        aw awVar;
        px4 px4Var;
        boolean z3;
        a06Var.getClass();
        dw6Var.getClass();
        boolean z4 = dw6Var.a;
        function1.getClass();
        ux2Var.Y(1613651542);
        int i3 = i | (ux2Var.d(eg3Var == null ? -1 : eg3Var.ordinal()) ? 4 : 2) | (ux2Var.g(z) ? 32 : 16) | (ux2Var.f(a06Var) ? 256 : 128) | (ux2Var.f(dw6Var) ? 2048 : 1024) | (ux2Var.f(iv6Var) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i3 |= ux2Var.h(function1) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= ux2Var.g(z2) ? 1048576 : 524288;
        }
        int i4 = i3 | 46137344;
        if (ux2Var.N(i4 & 1, (38347923 & i4) != 38347922)) {
            ux2Var.S();
            if ((i & 1) == 0 || ux2Var.x()) {
                str3 = n37.f;
                if (str3 == null) {
                    im3.e0("versionString");
                    throw null;
                }
                i2 = i4 & (-234881025);
                fs4Var3 = cs4.b;
            } else {
                ux2Var.Q();
                i2 = i4 & (-234881025);
                fs4Var3 = fs4Var;
                str3 = str;
            }
            ux2Var.q();
            Context context = (Context) ux2Var.j(lh.b);
            String str4 = z4 ? "ACCOUNT" : "LOGIN";
            Object[] objArr = new Object[0];
            boolean zF = ux2Var.f(str4);
            Object objK = ux2Var.K();
            String str5 = str3;
            aw awVar2 = e01.a;
            if (zF || objK == awVar2) {
                objK = new lz1(str4, (byte) 7);
                ux2Var.g0(objK);
            }
            px4 px4Var2 = (px4) zu1.L(objArr, (Function0) objK, ux2Var, 0);
            Boolean boolValueOf = Boolean.valueOf(z4);
            int i5 = i2 & 112;
            boolean zF2 = ux2Var.f(px4Var2) | (i5 == 32) | ((i2 & 7168) == 2048) | ((458752 & i2) == 131072);
            Object objK2 = ux2Var.K();
            if (zF2 || objK2 == awVar2) {
                awVar = awVar2;
                ko2Var = new ko2(px4Var2, z, dw6Var, function1, (hc1) null);
                px4Var = px4Var2;
                ux2Var.g0(ko2Var);
            } else {
                awVar = awVar2;
                px4Var = px4Var2;
                ko2Var = objK2;
            }
            ck3.i(boolValueOf, (hw2) ko2Var, ux2Var);
            fs4 fs4VarA = androidx.compose.ui.platform.a.a(im3.Z(a06Var.a() ? ka0.C(fs4Var3, 16.0f, 0.0f) : fs4Var3, im3.W(ux2Var), true), "TVTA-settings-column");
            kw0 kw0VarA = iw0.a(iq8.c, xz2.A, ux2Var, 0);
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
            o67.n(kw0VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            ux2Var.W(-1101141802);
            ux2Var.p(false);
            ux2Var.W(-1100818410);
            ux2Var.p(false);
            ux2Var.W(-1100550570);
            ux2Var.p(false);
            px4 px4Var3 = px4Var;
            fs4 fs4Var4 = fs4Var3;
            iv6 iv6Var3 = iv6Var;
            List<bw6> listL = qf0.L(new bw6(R.string.settings_account, qf0.L(au8.O(-1235264185, new qv6(dw6Var, iv6Var, function1, px4Var3, z), ux2Var), au8.O(397633544, new gg4(eg3Var, (byte) 15), ux2Var))), new bw6(R.string.settings_general, qf0.L(au8.O(-1317378196, new rv6(function1, px4Var3, z, (byte) 4), ux2Var), au8.O(315519533, new rv6(function1, px4Var3, z, (byte) 5), ux2Var))), new bw6(R.string.settings_control, qf0.L(au8.O(450609175, new qv6(z, dw6Var, iv6Var, function1, px4Var3, (byte) 3), ux2Var), ck3.w)), new bw6(R.string.settings_configuration, qf0.L(ck3.x, au8.O(1324034399, new qv6(z, dw6Var, iv6Var, function1, px4Var3, (byte) 4), ux2Var), au8.O(1092771680, new qv6(z, dw6Var, iv6Var, function1, px4Var3, (byte) 5), ux2Var), au8.O(861508961, new qv6(z, dw6Var, iv6Var, function1, px4Var3, (byte) 6), ux2Var))), new bw6(R.string.settings_security, qf0.L(au8.O(127348050, new na((Object) dw6Var, function1, px4Var3, z, (byte) 5), ux2Var), au8.O(-792429903, new qv6(z, dw6Var, iv6Var, function1, px4Var3, (byte) 0), ux2Var), ck3.y, au8.O(1662981487, new na((Object) context, function1, px4Var3, z, (byte) 4), ux2Var))), new bw6(R.string.settings_logging, qf0.L(au8.O(-743074987, new qv6(z, dw6Var, iv6Var, function1, px4Var3, (byte) 1), ux2Var), au8.O(889822742, new rv6(function1, px4Var3, z, (byte) 0), ux2Var))), new bw6(R.string.settings_about, qf0.L(au8.O(-386562009, new rv6(function1, px4Var3, z, (byte) 1), ux2Var), au8.O(-845197528, new rv6(function1, px4Var3, z, (byte) 2), ux2Var), au8.O(-1303833047, new rv6(function1, px4Var3, z, (byte) 3), ux2Var), au8.O(-1762468566, new l64(str5, iv6Var3, (byte) 18), ux2Var), ck3.z)));
            ux2Var.W(-727898434);
            for (bw6 bw6Var : listL) {
                i67.b(m77.z(bw6Var.a, ux2Var), bw6Var.b, null, null, null, ux2Var, 0);
                iv6Var3 = iv6Var;
            }
            iv6Var2 = iv6Var3;
            ux2Var2 = ux2Var;
            ux2Var2.p(false);
            if (z2) {
                ux2Var2.W(-1089721216);
                boolean z5 = a06Var.c;
                boolean z6 = (57344 & i2) == 16384;
                Object objK3 = ux2Var2.K();
                if (z6 || objK3 == awVar) {
                    z3 = false;
                    objK3 = new sv6(iv6Var2, 0 == true ? 1 : 0);
                    ux2Var2.g0(objK3);
                } else {
                    z3 = false;
                }
                db8.a(z5, z, (Function0) objK3, null, null, null, ux2Var, i5 | 384);
                ux2Var2 = ux2Var;
                ux2Var2.p(z3);
            } else {
                ux2Var2.W(-1089474890);
                ux2Var2.p(false);
            }
            ux2Var2.p(true);
            str2 = str5;
            fs4Var2 = fs4Var4;
        } else {
            iv6Var2 = iv6Var;
            ux2Var2 = ux2Var;
            ux2Var2.Q();
            fs4Var2 = fs4Var;
            str2 = str;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new mv6(eg3Var, z, a06Var, dw6Var, iv6Var2, function1, z2, fs4Var2, str2, i);
        }
    }

    public static final void w(Function1 function1, px4 px4Var, String str) {
        function1.invoke(str);
        px4Var.setValue(str);
    }

    public static final void x(int i, int i2, Function0 function0, ux2 ux2Var, fs4 fs4Var) {
        int i3;
        Function0 function1;
        ux2Var.Y(751155351);
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
            i3 |= ux2Var.f("TVTA-settings-remoteCursor") ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ux2Var.f(fs4Var) ? 2048 : 1024;
        }
        if (ux2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = (i3 >> 6) & 112;
            int i5 = i3 << 6;
            x37.e(new sk7(y57.g(R.string.settings_remoteCursor), y57.g(i), new yk7(R.drawable.cursor), null, 24), fs4Var, null, function1, "TVTA-settings-remoteCursor", ux2Var, (i5 & 57344) | i4 | (i5 & 7168), 36);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new jc(i, function0, fs4Var, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    public static final boolean y(br2 br2Var, m5 m5Var) {
        int iOrdinal = br2Var.Z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                br2 br2VarL = xs1.L(br2Var);
                if (br2VarL == null) {
                    hk0.l("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = br2VarL.Z0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (y(br2VarL, m5Var) || T(br2Var, br2VarL, 2, m5Var) || (br2VarL.W0().a && ((Boolean) m5Var.invoke(br2VarL)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            gk0.s();
                            return false;
                        }
                        hk0.l("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return T(br2Var, br2VarL, 2, m5Var);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    gk0.s();
                    return false;
                }
                if (!Z(br2Var, m5Var)) {
                    if (!(br2Var.W0().a ? ((Boolean) m5Var.invoke(br2Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return Z(br2Var, m5Var);
    }

    public static ye5 z(bj8 bj8Var) {
        int i;
        float f;
        int i2;
        float f2;
        ll8 ll8Var = bj8Var.a;
        np5 np5Var = bj8Var.b;
        float f3 = ll8Var.a;
        List list = ll8.c;
        float f4 = 360.0f;
        if (w32.b(f3, 0.0f) || w32.b(f3, 600.0f)) {
            f = 0.0f;
            i = 1;
        } else {
            if (w32.b(f3, 840.0f)) {
                i = 2;
            } else {
                f4 = 412.0f;
                i = 3;
            }
            f = 24.0f;
        }
        float f5 = f4;
        boolean z = np5Var.a;
        ArrayList<s53> arrayList = np5Var.b;
        if (z || (i == 1 && w32.b(ll8Var.b, 900.0f))) {
            i2 = 2;
            f2 = 24.0f;
        } else {
            f2 = 0.0f;
            i2 = 1;
        }
        ArrayList arrayList2 = new ArrayList();
        for (s53 s53Var : arrayList) {
            v56 v56Var = (s53Var.c && s53Var.d) ? s53Var.a : null;
            if (v56Var != null) {
                arrayList2.add(v56Var);
            }
        }
        return new ye5(i, f, i2, f2, f5, 420.0f, arrayList2);
    }
}
