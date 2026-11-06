package o;

import android.graphics.Typeface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class rk5 implements ym5, ce1, du0, le7 {
    public static rk5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ rk5 f1928o = new rk5((byte) 19);
    public final /* synthetic */ byte m;

    public rk5(xd4 xd4Var) {
        this.m = (byte) 6;
        String str = xd4.d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static h58 d(d58 d58Var, po3 po3Var, lh7 lh7Var, oz3 oz3Var) {
        po3Var.getClass();
        if (!po3Var.c) {
            po3Var = po3.a(po3Var, so3.m, false, null, null, 61);
        }
        int iOrdinal = po3Var.b.ordinal();
        ub8 ub8Var = ub8.f2197o;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new w87(oz3Var, ub8Var);
            }
            gk0.s();
            return null;
        }
        if (!d58Var.B().n) {
            return new w87(bp1.e(d58Var).n(), ub8Var);
        }
        List parameters = oz3Var.o0().getParameters();
        parameters.getClass();
        return !parameters.isEmpty() ? new w87(oz3Var, ub8.q) : p58.l(d58Var, po3Var);
    }

    public static Typeface f(String str, ms2 ms2Var, int i) {
        if (i == 0 && im3.n(ms2Var, ms2.f1503o) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iT = pm8.t(ms2Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iT) : Typeface.create(str, iT);
    }

    public static void g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ArrayList arrayList2 = new ArrayList(mv0.Z(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new ll8(iIntValue, ((Number) it2.next()).intValue()));
            }
            qv0.c0(arrayList, arrayList2);
        }
        lv0.T0(arrayList);
    }

    public static fj7 l(int i) {
        Object next;
        jc2 jc2Var = fj7.r;
        jc2Var.getClass();
        j1 j1Var = new j1(jc2Var, (byte) 0);
        do {
            if (!j1Var.hasNext()) {
                next = null;
                break;
            }
            next = j1Var.next();
        } while (((fj7) next).m != i);
        fj7 fj7Var = (fj7) next;
        return fj7Var == null ? fj7.f803o : fj7Var;
    }

    @Override // o.du0
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // o.ym5
    public Typeface b(wy2 wy2Var, ms2 ms2Var, int i) {
        String strConcat = wy2Var.f;
        int i2 = ms2Var.m / 100;
        if (i2 >= 0 && i2 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceF = f(strConcat, ms2Var, i);
            if (!im3.n(typefaceF, Typeface.create(Typeface.DEFAULT, pm8.t(ms2Var, i))) && !im3.n(typefaceF, f(null, ms2Var, i))) {
                typeface = typefaceF;
            }
        }
        return typeface == null ? f(wy2Var.f, ms2Var, i) : typeface;
    }

    @Override // o.ym5
    public Typeface c(ms2 ms2Var, int i) {
        return f(null, ms2Var, i);
    }

    public k58 e(k48 k48Var, List list) {
        k48Var.getClass();
        list.getClass();
        List parameters = k48Var.getParameters();
        parameters.getClass();
        d58 d58Var = (d58) lv0.w0(parameters);
        if (d58Var != null) {
            byte b = 1;
            if (d58Var.U()) {
                List parameters2 = k48Var.getParameters();
                parameters2.getClass();
                ArrayList arrayList = new ArrayList(mv0.Z(parameters2, 10));
                Iterator it = parameters2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((d58) it.next()).q());
                }
                return new x87(xm4.U(lv0.V0(arrayList, list)), b);
            }
        }
        return new rg3((d58[]) parameters.toArray(new d58[0]), (h58[]) list.toArray(new h58[0]), false);
    }

    public oz3 h(tn3 tn3Var, xi0 xi0Var, boolean z, yc4 yc4Var, lp lpVar, s48 s48Var, boolean z2, Function1 function1) {
        zz6 zz6Var = new zz6((so) xi0Var, z, yc4Var, lpVar, false);
        oz3 oz3Var = (oz3) function1.invoke(tn3Var);
        Collection collectionJ = tn3Var.j();
        collectionJ.getClass();
        Collection<zi0> collection = collectionJ;
        ArrayList arrayList = new ArrayList(mv0.Z(collection, 10));
        for (zi0 zi0Var : collection) {
            zi0Var.getClass();
            arrayList.add((oz3) function1.invoke(zi0Var));
        }
        return j(zz6Var, oz3Var, arrayList, s48Var, z2);
    }

    @Override // o.le7
    public bo7 i(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = gg6.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? h57.j(bundle) : h57.j(null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01db  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:122:0x0203  */
    /* JADX WARN: Code duplicated, block: B:126:0x020b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0211  */
    /* JADX WARN: Code duplicated, block: B:130:0x021a  */
    /* JADX WARN: Code duplicated, block: B:132:0x021d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0222  */
    /* JADX WARN: Code duplicated, block: B:136:0x0226  */
    /* JADX WARN: Code duplicated, block: B:137:0x022c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x022e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0231  */
    /* JADX WARN: Code duplicated, block: B:141:0x0234  */
    /* JADX WARN: Code duplicated, block: B:142:0x0237  */
    /* JADX WARN: Code duplicated, block: B:150:0x0246  */
    /* JADX WARN: Code duplicated, block: B:157:0x0259  */
    /* JADX WARN: Code duplicated, block: B:160:0x025d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262  */
    /* JADX WARN: Code duplicated, block: B:175:0x027f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0284  */
    /* JADX WARN: Code duplicated, block: B:179:0x0287  */
    /* JADX WARN: Code duplicated, block: B:184:0x0291  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:339:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:341:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x01df A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x012c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0136  */
    /* JADX WARN: Code duplicated, block: B:73:0x0160  */
    /* JADX WARN: Code duplicated, block: B:75:0x0176  */
    /* JADX WARN: Code duplicated, block: B:77:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0182  */
    /* JADX WARN: Code duplicated, block: B:81:0x0188  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:87:0x019c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c5  */
    /* JADX WARN: Multi-variable type inference failed */
    public oz3 j(zz6 zz6Var, oz3 oz3Var, List list, s48 s48Var, boolean z) {
        int size;
        boolean z2;
        ea2 ea2Var;
        Iterable iterableY0;
        d58 d58VarD;
        boolean z3;
        Iterable annotations;
        Iterator it;
        fw4 fw4Var;
        lp lpVar;
        op opVar;
        y2 y2Var;
        Iterator it2;
        c65 c65Var;
        uo3[] uo3VarArr;
        d58 d58Var;
        b65 b65Var;
        c65 c65Var2;
        lp lpVar2;
        vo3 vo3Var;
        xn3 xn3Var;
        c65 c65VarB;
        c65 c65Var3;
        c65 c65Var4;
        b65 b65Var2;
        boolean z4;
        c65 c65VarA;
        uo3 uo3Var;
        b65 b65Var3;
        boolean z5;
        boolean z6;
        c65 c65VarB2;
        c65 c65VarA2;
        xn3 xn3Var2;
        uo3 uo3Var2;
        b65 b65Var4;
        boolean z7;
        Object next;
        c65 c65VarG;
        Object objI;
        za6 za6VarH;
        c65 c65VarG2;
        boolean z8;
        c65 c65Var5;
        c65 c65VarA3;
        boolean z9;
        ht2 ht2VarD;
        fw4 fw4Var2;
        k48 k48VarC;
        boolean z10;
        uo3 uo3Var3;
        sz3 sz3Var;
        b65 b65VarC;
        fw4 fw4Var3;
        q58 q58VarF;
        zz6 zz6Var2 = zz6Var;
        so soVar = (so) zz6Var2.c;
        yc4 yc4Var = (yc4) zz6Var2.d;
        xz2 xz2Var = xz2.W;
        boolean z11 = zz6Var2.a;
        oz3Var.getClass();
        ArrayList arrayListD = zz6Var.d(oz3Var);
        ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList.add(zz6Var2.d((sz3) it3.next()));
        }
        if (!z11 || list.isEmpty()) {
            size = arrayListD.size();
            break;
        }
        Iterator it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                size = arrayListD.size();
                break;
            }
            sz3 sz3Var2 = (sz3) it4.next();
            sz3Var2.getClass();
            if (!((q35) ((io3) yc4Var.m).l).a(oz3Var, (oz3) sz3Var2)) {
                size = 1;
                break;
            }
        }
        uo3[] uo3VarArr2 = new uo3[size];
        int i = 0;
        while (i < size) {
            z2 z2Var = (z2) arrayListD.get(i);
            lp lpVar3 = (lp) zz6Var2.e;
            sz3 sz3Var3 = z2Var.a;
            d58 d58Var2 = z2Var.c;
            b65 b65Var5 = b65.m;
            boolean z12 = z11;
            fw4 fw4Var4 = fw4.n;
            ArrayList arrayList2 = arrayListD;
            fw4 fw4Var5 = fw4.m;
            ArrayList arrayList3 = arrayList;
            b65 b65Var6 = b65.n;
            b65 b65Var7 = b65.f402o;
            int i2 = size;
            if (sz3Var3 != null) {
                if (d58Var2 == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ea2Var = ea2.m;
                if (sz3Var3 != null) {
                    iterableY0 = ((oz3) sz3Var3).getAnnotations();
                } else {
                    iterableY0 = ea2Var;
                }
                if (sz3Var3 != null || (k48VarC = xz2Var.c(sz3Var3)) == null) {
                    d58VarD = null;
                } else {
                    d58VarD = db8.D(k48VarC);
                }
                if (lpVar3 == lp.TYPE_PARAMETER_BOUNDS) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 != 0) {
                    if (!z3) {
                        Object obj = yc4Var.m;
                    }
                    if (soVar != null || (annotations = soVar.getAnnotations()) == null) {
                        annotations = ea2Var;
                    }
                    iterableY0 = lv0.y0(annotations, iterableY0);
                }
                Object obj2 = yc4Var.m;
                it = iterableY0.iterator();
                Iterable iterable = iterableY0;
                fw4Var = null;
                while (true) {
                    if (it.hasNext()) {
                        lpVar = lpVar3;
                        break;
                    }
                    Iterator it5 = it;
                    ht2VarD = op.d(it.next());
                    lpVar = lpVar3;
                    if (lv0.h0(ur3.n, ht2VarD)) {
                        fw4Var2 = fw4Var5;
                    } else {
                        if (lv0.h0(ur3.f2242o, ht2VarD)) {
                            fw4Var2 = fw4Var4;
                        } else {
                            continue;
                        }
                        it = it5;
                        lpVar3 = lpVar;
                    }
                    if (fw4Var == null && fw4Var != fw4Var2) {
                        fw4Var = null;
                        break;
                    }
                    fw4Var = fw4Var2;
                    it = it5;
                    lpVar3 = lpVar;
                }
                opVar = ((io3) yc4Var.m).j;
                y2Var = new y2(zz6Var2, z2Var, (byte) 0);
                it2 = iterable.iterator();
                c65Var = null;
                while (true) {
                    if (it2.hasNext()) {
                        uo3VarArr = uo3VarArr2;
                        d58Var = d58VarD;
                        b65Var = null;
                        c65Var2 = c65Var;
                        break;
                    }
                    d58Var = d58VarD;
                    next = it2.next();
                    c65VarG = opVar.g(next, ((Boolean) y2Var.invoke(next)).booleanValue());
                    if (c65VarG != null) {
                        uo3VarArr = uo3VarArr2;
                        c65Var5 = c65VarG;
                    } else {
                        objI = opVar.i(next);
                        if (objI == null) {
                            uo3VarArr = uo3VarArr2;
                        } else {
                            za6VarH = opVar.h(next);
                            if (za6VarH == null) {
                                za6VarH = opVar.a.a.a;
                            }
                            uo3VarArr = uo3VarArr2;
                            if (za6VarH == za6.IGNORE) {
                                c65Var5 = null;
                            } else {
                                c65VarG2 = opVar.g(objI, ((Boolean) y2Var.invoke(objI)).booleanValue());
                                if (c65VarG2 != null) {
                                    if (za6VarH == za6.WARN) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    opVar = opVar;
                                    b65Var = null;
                                    c65VarA3 = c65.a(c65VarG2, null, z8, 1);
                                }
                            }
                            if (c65Var == null) {
                                c65Var = c65VarA3;
                            } else {
                                boolean z13 = c65Var.b;
                                if (c65VarA3 != null && !c65VarA3.equals(c65Var) && (!(z9 = c65VarA3.b) || z13)) {
                                    if (z9 || !z13) {
                                        c65Var2 = b65Var;
                                        break;
                                    }
                                    c65Var = c65VarA3;
                                }
                            }
                            opVar = opVar;
                            d58VarD = d58Var;
                            uo3VarArr2 = uo3VarArr;
                            c65Var = c65Var;
                        }
                        opVar = opVar;
                        b65Var = null;
                        c65VarA3 = null;
                        if (c65Var == null) {
                            c65Var = c65VarA3;
                        } else {
                            boolean z14 = c65Var.b;
                            if (c65VarA3 != null) {
                                continue;
                            }
                        }
                        opVar = opVar;
                        d58VarD = d58Var;
                        uo3VarArr2 = uo3VarArr;
                        c65Var = c65Var;
                    }
                    b65Var = null;
                    c65VarA3 = c65Var5;
                    if (c65Var == null) {
                        c65Var = c65VarA3;
                    } else {
                        boolean z15 = c65Var.b;
                        if (c65VarA3 != null) {
                            continue;
                        }
                    }
                    opVar = opVar;
                    d58VarD = d58Var;
                    uo3VarArr2 = uo3VarArr;
                    c65Var = c65Var;
                }
                if (c65Var2 != 0) {
                    b65Var4 = c65Var2.a;
                    if (b65Var4 == b65Var7 || d58Var == null) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    uo3Var = new uo3(b65Var4, fw4Var, z7, c65Var2.b);
                } else {
                    if (!z2 || z3) {
                        lpVar2 = lpVar;
                    } else {
                        lpVar2 = lp.TYPE_USE;
                    }
                    vo3Var = z2Var.b;
                    if (vo3Var != null) {
                        xn3Var2 = (xn3) vo3Var.a.get(lpVar2);
                    } else {
                        xn3Var = b65Var;
                    }
                    if (d58Var != null) {
                        xn3Var = xn3Var2;
                        c65VarB = zz6.b(d58Var);
                    } else {
                        xn3Var = xn3Var2;
                        c65VarB = b65Var;
                    }
                    if (c65VarB != 0) {
                        c65VarA2 = c65.a(c65VarB, b65Var7, false, 2);
                    } else if (xn3Var != 0) {
                        c65Var4 = xn3Var.a;
                    } else {
                        c65Var3 = b65Var;
                    }
                    if (c65VarB != 0) {
                        c65Var3 = c65Var4;
                        b65Var2 = c65VarB.a;
                    } else {
                        c65Var3 = c65Var4;
                        b65Var2 = b65Var;
                    }
                    if (b65Var2 == b65Var7 && (d58Var == null || xn3Var == 0 || !xn3Var.c)) {
                        z4 = false;
                    } else {
                        c65Var3 = c65VarA2;
                        c65Var3 = c65VarA2;
                        z4 = true;
                    }
                    if (d58Var2 != null || (c65VarB2 = zz6.b(d58Var2)) == null) {
                        c65VarA = b65Var;
                    } else if (c65VarB2.a == b65Var6) {
                        c65VarA = c65VarB2;
                        c65VarA = c65.a(c65VarB2, b65Var5, false, 2);
                    }
                    if (c65VarA != 0) {
                        b65 b65Var8 = c65VarA.a;
                        if (c65Var3 == 0) {
                            c65Var3 = c65VarA;
                        } else {
                            b65 b65Var9 = c65Var3.a;
                            boolean z16 = c65Var3.b;
                            z6 = c65VarA.b;
                            if ((z6 || z16) && ((!z6 && z16) || (b65Var8.compareTo(b65Var9) >= 0 && b65Var8.compareTo(b65Var9) > 0))) {
                                c65Var3 = c65VarA;
                            }
                        }
                    }
                    if (c65Var3 != 0) {
                        b65Var3 = c65Var3.a;
                    } else {
                        b65Var3 = null;
                    }
                    if (c65Var3 == 0 && c65Var3.b) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    uo3Var = new uo3(b65Var3, fw4Var, z4, z5);
                }
                uo3Var2 = uo3Var;
            } else {
                if (d58Var2 != null) {
                    ub8 ub8VarB = d58Var2.B();
                    ub8VarB.getClass();
                    q58VarF = o77.f(ub8VarB);
                } else {
                    q58VarF = null;
                }
                if (q58VarF == q58.IN) {
                    uo3Var2 = uo3.e;
                    uo3VarArr = uo3VarArr2;
                } else {
                    if (d58Var2 == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ea2Var = ea2.m;
                    if (sz3Var3 != null) {
                        iterableY0 = ((oz3) sz3Var3).getAnnotations();
                    } else {
                        iterableY0 = ea2Var;
                    }
                    if (sz3Var3 != null) {
                        d58VarD = null;
                    } else {
                        d58VarD = null;
                    }
                    if (lpVar3 == lp.TYPE_PARAMETER_BOUNDS) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 != 0) {
                        if (!z3) {
                            Object obj3 = yc4Var.m;
                        }
                        if (soVar != null) {
                            annotations = ea2Var;
                        } else {
                            annotations = ea2Var;
                        }
                        iterableY0 = lv0.y0(annotations, iterableY0);
                    }
                    Object obj4 = yc4Var.m;
                    it = iterableY0.iterator();
                    Iterable iterable2 = iterableY0;
                    fw4Var = null;
                    while (true) {
                        if (it.hasNext()) {
                            lpVar = lpVar3;
                            break;
                        }
                        Iterator it6 = it;
                        ht2VarD = op.d(it.next());
                        lpVar = lpVar3;
                        if (lv0.h0(ur3.n, ht2VarD)) {
                            fw4Var2 = fw4Var5;
                        } else {
                            if (lv0.h0(ur3.f2242o, ht2VarD)) {
                                fw4Var2 = fw4Var4;
                            } else {
                                continue;
                            }
                            it = it6;
                            lpVar3 = lpVar;
                        }
                        if (fw4Var == null) {
                        }
                        fw4Var = fw4Var2;
                        it = it6;
                        lpVar3 = lpVar;
                    }
                    opVar = ((io3) yc4Var.m).j;
                    y2Var = new y2(zz6Var2, z2Var, (byte) 0);
                    it2 = iterable2.iterator();
                    c65Var = null;
                    while (true) {
                        if (it2.hasNext()) {
                            uo3VarArr = uo3VarArr2;
                            d58Var = d58VarD;
                            b65Var = null;
                            c65Var2 = c65Var;
                            break;
                        }
                        d58Var = d58VarD;
                        next = it2.next();
                        c65VarG = opVar.g(next, ((Boolean) y2Var.invoke(next)).booleanValue());
                        if (c65VarG != null) {
                            uo3VarArr = uo3VarArr2;
                            c65Var5 = c65VarG;
                        } else {
                            objI = opVar.i(next);
                            if (objI == null) {
                                uo3VarArr = uo3VarArr2;
                            } else {
                                za6VarH = opVar.h(next);
                                if (za6VarH == null) {
                                    za6VarH = opVar.a.a.a;
                                }
                                uo3VarArr = uo3VarArr2;
                                if (za6VarH == za6.IGNORE) {
                                    c65Var5 = null;
                                } else {
                                    c65VarG2 = opVar.g(objI, ((Boolean) y2Var.invoke(objI)).booleanValue());
                                    if (c65VarG2 != null) {
                                        if (za6VarH == za6.WARN) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        opVar = opVar;
                                        b65Var = null;
                                        c65VarA3 = c65.a(c65VarG2, null, z8, 1);
                                    }
                                }
                                if (c65Var == null) {
                                    c65Var = c65VarA3;
                                } else {
                                    boolean z17 = c65Var.b;
                                    if (c65VarA3 != null) {
                                        continue;
                                    }
                                }
                                opVar = opVar;
                                d58VarD = d58Var;
                                uo3VarArr2 = uo3VarArr;
                                c65Var = c65Var;
                            }
                            opVar = opVar;
                            b65Var = null;
                            c65VarA3 = null;
                            if (c65Var == null) {
                                c65Var = c65VarA3;
                            } else {
                                boolean z18 = c65Var.b;
                                if (c65VarA3 != null) {
                                    continue;
                                }
                            }
                            opVar = opVar;
                            d58VarD = d58Var;
                            uo3VarArr2 = uo3VarArr;
                            c65Var = c65Var;
                        }
                        b65Var = null;
                        c65VarA3 = c65Var5;
                        if (c65Var == null) {
                            c65Var = c65VarA3;
                        } else {
                            boolean z19 = c65Var.b;
                            if (c65VarA3 != null) {
                                continue;
                            }
                        }
                        opVar = opVar;
                        d58VarD = d58Var;
                        uo3VarArr2 = uo3VarArr;
                        c65Var = c65Var;
                    }
                    if (c65Var2 != 0) {
                        b65Var4 = c65Var2.a;
                        if (b65Var4 == b65Var7) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        uo3Var = new uo3(b65Var4, fw4Var, z7, c65Var2.b);
                    } else {
                        if (z2) {
                            lpVar2 = lpVar;
                        } else {
                            lpVar2 = lpVar;
                        }
                        vo3Var = z2Var.b;
                        if (vo3Var != null) {
                            xn3Var2 = (xn3) vo3Var.a.get(lpVar2);
                        } else {
                            xn3Var = b65Var;
                        }
                        if (d58Var != null) {
                            xn3Var = xn3Var2;
                            c65VarB = zz6.b(d58Var);
                        } else {
                            xn3Var = xn3Var2;
                            c65VarB = b65Var;
                        }
                        if (c65VarB != 0) {
                            c65VarA2 = c65.a(c65VarB, b65Var7, false, 2);
                        } else if (xn3Var != 0) {
                            c65Var4 = xn3Var.a;
                        } else {
                            c65Var3 = b65Var;
                        }
                        if (c65VarB != 0) {
                            c65Var3 = c65Var4;
                            b65Var2 = c65VarB.a;
                        } else {
                            c65Var3 = c65Var4;
                            b65Var2 = b65Var;
                        }
                        if (b65Var2 == b65Var7) {
                            c65Var3 = c65VarA2;
                            c65Var3 = c65VarA2;
                            z4 = true;
                        } else {
                            c65Var3 = c65VarA2;
                            c65Var3 = c65VarA2;
                            z4 = true;
                        }
                        if (d58Var2 != null) {
                            c65VarA = b65Var;
                        } else {
                            c65VarA = b65Var;
                        }
                        if (c65VarA != 0) {
                            b65 b65Var10 = c65VarA.a;
                            if (c65Var3 == 0) {
                                c65Var3 = c65VarA;
                            } else {
                                b65 b65Var11 = c65Var3.a;
                                boolean z110 = c65Var3.b;
                                z6 = c65VarA.b;
                                if (z6) {
                                    c65Var3 = c65VarA;
                                } else {
                                    c65Var3 = c65VarA;
                                }
                            }
                        }
                        if (c65Var3 != 0) {
                            b65Var3 = c65Var3.a;
                        } else {
                            b65Var3 = null;
                        }
                        if (c65Var3 == 0) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        uo3Var = new uo3(b65Var3, fw4Var, z4, z5);
                    }
                    uo3Var2 = uo3Var;
                }
            }
            ArrayList<uo3> arrayList4 = new ArrayList();
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                z2 z2Var2 = (z2) lv0.p0(i, (List) it7.next());
                if (z2Var2 == null || (sz3Var = z2Var2.a) == null) {
                    uo3Var3 = null;
                } else {
                    b65 b65VarC2 = zz6.c(sz3Var);
                    if (b65VarC2 == null) {
                        oz3 oz3VarJ = x37.j((oz3) sz3Var);
                        b65VarC = oz3VarJ != null ? zz6.c(oz3VarJ) : null;
                    } else {
                        b65VarC = b65VarC2;
                    }
                    String str = mo3.a;
                    g07 g07VarD = xz2Var.d(sz3Var);
                    ed2 ed2Var = p58.a;
                    ys0 ys0VarA = g07VarD.o0().a();
                    ns4 ns4Var = ys0VarA instanceof ns4 ? (ns4) ys0VarA : null;
                    if (mo3.k.containsKey(ns4Var != null ? zo1.g(ns4Var) : null)) {
                        fw4Var3 = fw4Var5;
                    } else {
                        ys0 ys0VarA2 = xz2Var.z(sz3Var).o0().a();
                        ns4 ns4Var2 = ys0VarA2 instanceof ns4 ? (ns4) ys0VarA2 : null;
                        fw4Var3 = mo3.j.containsKey(ns4Var2 != null ? zo1.g(ns4Var2) : null) ? fw4Var4 : null;
                    }
                    uo3Var3 = new uo3(b65VarC, fw4Var3, xz2Var.Z(sz3Var) || (((oz3) sz3Var).r0() instanceof h55), b65VarC != b65VarC2);
                }
                if (uo3Var3 != null) {
                    arrayList4.add(uo3Var3);
                }
            }
            boolean z20 = i == 0 && z12;
            boolean z21 = i == 0 && (soVar instanceof qb8) && ((qb8) soVar).v != null;
            b65 b65Var12 = uo3Var2.a;
            ArrayList arrayList5 = new ArrayList();
            for (uo3 uo3Var4 : arrayList4) {
                ArrayList arrayList6 = arrayList4;
                b65 b65Var13 = uo3Var4.d ? null : uo3Var4.a;
                if (b65Var13 != null) {
                    arrayList5.add(b65Var13);
                }
                arrayList4 = arrayList6;
            }
            ArrayList arrayList7 = arrayList4;
            Set setT0 = lv0.T0(arrayList5);
            b65 b65Var14 = uo3Var2.d ? null : b65Var12;
            b65 b65Var15 = b65Var14 == b65Var5 ? b65Var5 : (b65) v67.r(setT0, b65Var7, b65Var6, b65Var14, z20);
            if (b65Var15 == null) {
                ArrayList arrayList8 = new ArrayList();
                Iterator it8 = arrayList7.iterator();
                while (it8.hasNext()) {
                    b65 b65Var16 = ((uo3) it8.next()).a;
                    if (b65Var16 != null) {
                        arrayList8.add(b65Var16);
                    }
                }
                Set setT1 = lv0.T0(arrayList8);
                if (b65Var12 != b65Var5) {
                    b65Var5 = (b65) v67.r(setT1, b65Var7, b65Var6, b65Var12, z20);
                }
            } else {
                b65Var5 = b65Var15;
            }
            ArrayList arrayList9 = new ArrayList();
            Iterator it9 = arrayList7.iterator();
            while (it9.hasNext()) {
                fw4 fw4Var6 = ((uo3) it9.next()).b;
                if (fw4Var6 != null) {
                    arrayList9.add(fw4Var6);
                }
            }
            fw4 fw4Var7 = (fw4) v67.r(lv0.T0(arrayList9), fw4Var4, fw4Var5, uo3Var2.b, z20);
            b65 b65Var17 = (b65Var5 == null || z || (z21 && b65Var5 == b65Var6)) ? null : b65Var5;
            if (b65Var17 != b65Var7) {
                z10 = false;
            } else {
                if (!uo3Var2.c) {
                    if (!arrayList7.isEmpty()) {
                        Iterator it10 = arrayList7.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                if (((uo3) it10.next()).c) {
                                }
                            }
                        }
                    }
                    z10 = false;
                }
                z10 = true;
            }
            uo3VarArr[i] = new uo3(b65Var17, fw4Var7, z10, (b65Var17 == null || b65Var15 == b65Var5) ? false : true);
            i++;
            zz6Var2 = zz6Var;
            z11 = z12;
            arrayListD = arrayList2;
            arrayList = arrayList3;
            size = i2;
            yc4Var = yc4Var;
            uo3VarArr2 = uo3VarArr;
        }
        return (oz3) aw.s(oz3Var.r0(), new y2(s48Var, uo3VarArr2, (byte) 1), 0, zz6Var.b).f1562o;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0288  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:147:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:149:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:150:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:154:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02df  */
    /* JADX WARN: Code duplicated, block: B:158:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:163:0x0301  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0179  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2, types: [o.xi0] */
    /* JADX WARN: Type inference failed for: r25v0, types: [o.rk5] */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.fi1, o.xi0, o.zi0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [o.tn3] */
    /* JADX WARN: Type inference failed for: r6v38 */
    public ArrayList k(yc4 yc4Var, Collection collection) {
        up annotations;
        oz3 type;
        zp5 zp5Var;
        vd5 vd5Var;
        ArrayList arrayList;
        int i;
        int i2;
        oz3 type2;
        v14 v14VarS;
        eu5 eu5Var;
        e24 e24Var = e24.N;
        yc4Var.getClass();
        Collection<??> collection2 = collection;
        byte b = 10;
        ArrayList arrayList2 = new ArrayList(mv0.Z(collection2, 10));
        for (?? F : collection2) {
            if ((F instanceof tn3) && (F.k() != 2 || F.a().j().size() != 1)) {
                ys0 ys0VarE = yo1.E(F);
                byte b2 = 0;
                if (ys0VarE == null) {
                    annotations = ((g2) F).getAnnotations();
                } else {
                    b24 b24Var = ys0VarE instanceof b24 ? (b24) ys0VarE : null;
                    List list = b24Var != null ? (List) b24Var.w.getValue() : null;
                    if (list == null || list.isEmpty()) {
                        annotations = ((g2) F).getAnnotations();
                    } else {
                        ArrayList arrayList3 = new ArrayList(mv0.Z(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(new y14(yc4Var, (q76) it.next(), true));
                        }
                        ArrayList arrayListY0 = lv0.y0(((g2) F).getAnnotations(), arrayList3);
                        annotations = arrayListY0.isEmpty() ? yl7.p : new wp(arrayListY0, b2);
                    }
                }
                yc4 yc4VarO = pm8.o(yc4Var, annotations);
                ?? r12 = (!(F instanceof ho3) || (eu5Var = ((du5) F).I) == null || eu5Var.q) ? F : eu5Var;
                v14 v14VarS2 = F.S();
                lp lpVar = lp.VALUE_PARAMETER;
                if (v14VarS2 != null) {
                    xw2 xw2Var = r12 instanceof xw2 ? (xw2) r12 : null;
                    qb8 qb8Var = xw2Var != null ? (qb8) xw2Var.Q(eo3.R) : null;
                    type = h((tn3) F, qb8Var, false, qb8Var != null ? pm8.o(yc4VarO, qb8Var.getAnnotations()) : yc4VarO, lpVar, null, false, e24.K);
                } else {
                    type = null;
                }
                eo3 eo3Var = F instanceof eo3 ? (eo3) F : null;
                if (eo3Var != null) {
                    fi1 fi1VarI = eo3Var.i();
                    fi1VarI.getClass();
                    ns4 ns4Var = (ns4) fi1VarI;
                    String strE = io1.E(eo3Var, 3);
                    String str = mo3.a;
                    it2 it2VarI = bp1.g(ns4Var).i();
                    it2VarI.getClass();
                    js0 js0VarG = mo3.g(it2VarI);
                    zp5Var = (zp5) yp5.d.get((js0VarG != null ? fs3.e(js0VarG) : au8.w(ns4Var, xz2.Y)) + '.' + strE);
                    if (zp5Var != null) {
                        String str2 = zp5Var.c;
                        if (str2 != null && !bc7.N(false, str2, "2.")) {
                            hk0.l("Check failed.");
                            return null;
                        }
                        if (str2 != null) {
                            zp5Var = zp5Var.d;
                        }
                    } else {
                        zp5Var = null;
                    }
                } else {
                    zp5Var = null;
                }
                if (zp5Var != null) {
                    zp5Var.b.size();
                    ((eo3) F).J().size();
                }
                boolean z = qo3.n.invoke(fo3.a) == za6.STRICT && (F instanceof xw2) && im3.n(F.Q(eo3.S), Boolean.TRUE);
                List<qb8> listJ = r12.J();
                listJ.getClass();
                ArrayList arrayList4 = new ArrayList(mv0.Z(listJ, 10));
                for (qb8 qb8Var2 : listJ) {
                    arrayList4.add(h((tn3) F, qb8Var2, false, qb8Var2 != null ? pm8.o(yc4VarO, qb8Var2.getAnnotations()) : yc4VarO, lpVar, zp5Var != null ? (s48) lv0.p0(qb8Var2.r, zp5Var.b) : null, z, new h16(qb8Var2, b)));
                }
                bu5 bu5Var = F instanceof bu5 ? (bu5) F : null;
                tn3 tn3Var = (tn3) F;
                oz3 oz3VarH = h(tn3Var, r12, true, yc4VarO, (bu5Var == null || !xo1.S(bu5Var)) ? lp.METHOD_RETURN_TYPE : lp.FIELD, zp5Var != null ? zp5Var.a : null, false, e24.L);
                oz3 returnType = F.getReturnType();
                returnType.getClass();
                if (p58.c(returnType, e24Var, null)) {
                    vd5Var = new vd5(mo8.j, new vn1());
                } else {
                    v14 v14VarS3 = F.S();
                    if (v14VarS3 != null ? p58.c(v14VarS3.getType(), e24Var, null) : false) {
                        vd5Var = new vd5(mo8.j, new vn1());
                    } else {
                        List listJ2 = F.J();
                        listJ2.getClass();
                        if (!listJ2.isEmpty()) {
                            Iterator it2 = listJ2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    oz3 type3 = ((qb8) it2.next()).getType();
                                    type3.getClass();
                                    if (p58.c(type3, e24Var, null)) {
                                        vd5Var = new vd5(mo8.j, new vn1());
                                    }
                                }
                            }
                        }
                        vd5Var = null;
                    }
                }
                if (type != null || oz3VarH != null) {
                    if (type == null) {
                        v14VarS = F.S();
                        if (v14VarS != null) {
                            type = v14VarS.getType();
                        } else {
                            type = null;
                        }
                    }
                    arrayList = new ArrayList(mv0.Z(arrayList4, 10));
                    i = 0;
                    for (Object obj : arrayList4) {
                        i2 = i + 1;
                        if (i < 0) {
                            qf0.U();
                            throw null;
                        }
                        type2 = (oz3) obj;
                        if (type2 == null) {
                            type2 = ((qb8) F.J().get(i)).getType();
                            type2.getClass();
                        }
                        arrayList.add(type2);
                        i = i2;
                    }
                    if (oz3VarH == null) {
                        oz3VarH = F.getReturnType();
                        oz3VarH.getClass();
                    }
                    F = tn3Var.F(type, arrayList, oz3VarH, vd5Var);
                } else if (!arrayList4.isEmpty()) {
                    Iterator it3 = arrayList4.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((oz3) it3.next()) != null) {
                            }
                        } else if (vd5Var == null) {
                            continue;
                        }
                        if (type == null) {
                            v14VarS = F.S();
                            if (v14VarS != null) {
                                type = v14VarS.getType();
                            } else {
                                type = null;
                            }
                        }
                        arrayList = new ArrayList(mv0.Z(arrayList4, 10));
                        i = 0;
                        while (r7.hasNext()) {
                            i2 = i + 1;
                            if (i < 0) {
                                qf0.U();
                                throw null;
                            }
                            type2 = (oz3) obj;
                            if (type2 == null) {
                                type2 = ((qb8) F.J().get(i)).getType();
                                type2.getClass();
                            }
                            arrayList.add(type2);
                            i = i2;
                        }
                        if (oz3VarH == null) {
                            oz3VarH = F.getReturnType();
                            oz3VarH.getClass();
                        }
                        F = tn3Var.F(type, arrayList, oz3VarH, vd5Var);
                    }
                } else if (vd5Var == null) {
                    if (type == null) {
                        v14VarS = F.S();
                        if (v14VarS != null) {
                            type = v14VarS.getType();
                        } else {
                            type = null;
                        }
                    }
                    arrayList = new ArrayList(mv0.Z(arrayList4, 10));
                    i = 0;
                    while (r7.hasNext()) {
                        i2 = i + 1;
                        if (i < 0) {
                            qf0.U();
                            throw null;
                        }
                        type2 = (oz3) obj;
                        if (type2 == null) {
                            type2 = ((qb8) F.J().get(i)).getType();
                            type2.getClass();
                        }
                        arrayList.add(type2);
                        i = i2;
                    }
                    if (oz3VarH == null) {
                        oz3VarH = F.getReturnType();
                        oz3VarH.getClass();
                    }
                    F = tn3Var.F(type, arrayList, oz3VarH, vd5Var);
                } else {
                    continue;
                }
            }
            arrayList2.add(F);
        }
        return arrayList2;
    }

    public String toString() {
        switch (this.m) {
            case ep1.c /* 10 */:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ rk5(byte b) {
        this.m = b;
    }

    public rk5(aw awVar) {
        this.m = (byte) 9;
    }
}
