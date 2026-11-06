package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ei implements do4 {
    public static final ei b = new ei(0);
    public static final ei c = new ei(1);
    public static final ei d = new ei(2);
    public static final ei e = new ei(3);
    public static final ei f = new ei(4);
    public static final h31 g = new h31((byte) 26);
    public static final ei h = new ei(5);
    public static final ei i = new ei(6);
    public static final ei j = new ei(7);
    public static final ei k = new ei(8);
    public final /* synthetic */ byte a;

    public /* synthetic */ ei(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0118 A[PHI: r4 r6
      0x0118: PHI (r4v9 int) = (r4v8 int), (r4v13 int), (r4v13 int) binds: [B:68:0x0132, B:61:0x010c, B:63:0x0112] A[DONT_GENERATE, DONT_INLINE]
      0x0118: PHI (r6v19 int) = (r6v18 int), (r6v25 int), (r6v25 int) binds: [B:68:0x0132, B:61:0x010c, B:63:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.do4
    public final eo4 c(fo4 fo4Var, List list, long j2) {
        Object obj;
        Object obj2;
        int iQ0;
        int iMax;
        int i2;
        int iW;
        byte b2 = this.a;
        fa2 fa2Var = fa2.m;
        switch (b2) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iK = 0;
                int iJ = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    jl5 jl5VarC = ((zn4) list.get(i3)).C(j2);
                    iK = Math.max(iK, jl5VarC.m);
                    iJ = Math.max(iJ, jl5VarC.n);
                    arrayList.add(jl5VarC);
                }
                if (list.isEmpty()) {
                    iK = r61.k(j2);
                    iJ = r61.j(j2);
                }
                return fo4Var.u(iK, iJ, fa2Var, new di(arrayList, (byte) 0));
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return fo4Var.u(0, 0, fa2Var, ek.n);
                }
                if (size2 == 1) {
                    jl5 jl5VarC2 = ((zn4) list.get(0)).C(j2);
                    return fo4Var.u(jl5VarC2.m, jl5VarC2.n, fa2Var, new t(jl5VarC2, (byte) 7));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax2 = 0;
                int iMax3 = 0;
                for (int i4 = 0; i4 < size3; i4++) {
                    jl5 jl5VarC3 = ((zn4) list.get(i4)).C(j2);
                    iMax2 = Math.max(iMax2, jl5VarC3.m);
                    iMax3 = Math.max(iMax3, jl5VarC3.n);
                    arrayList2.add(jl5VarC3);
                }
                return fo4Var.u(iMax2, iMax3, fa2Var, new fk(arrayList2, (byte) 0));
            case 2:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    arrayList3.add(((zn4) list.get(i5)).C(j2));
                }
                return fo4Var.u(r61.i(j2), r61.h(j2), fa2Var, new di(arrayList3, (byte) 1));
            case 3:
                return fo4Var.u(r61.k(j2), r61.j(j2), fa2Var, new px((byte) 9));
            case 4:
                return fo4Var.u(r61.i(j2), r61.h(j2), fa2Var, g);
            case 5:
                return fo4Var.u(r61.k(j2), r61.j(j2), fa2Var, new ji2((byte) 22));
            case 6:
                ArrayList arrayList4 = new ArrayList(list.size());
                int size5 = list.size();
                int iMax4 = 0;
                int iMax5 = 0;
                for (int i6 = 0; i6 < size5; i6++) {
                    jl5 jl5VarC4 = ((zn4) list.get(i6)).C(j2);
                    iMax4 = Math.max(iMax4, jl5VarC4.m);
                    iMax5 = Math.max(iMax5, jl5VarC4.n);
                    arrayList4.add(jl5VarC4);
                }
                return fo4Var.u(iMax4, iMax5, fa2Var, new di(arrayList4, (byte) 3));
            case 7:
                return fo4Var.u(r61.g(j2) ? r61.i(j2) : 0, r61.f(j2) ? r61.h(j2) : 0, fa2Var, new vs6((byte) 6));
            case 8:
                return fo4Var.u(r61.k(j2), r61.j(j2), fa2Var, new yr7((byte) 17));
            default:
                int iMin = Math.min(r61.i(j2), fo4Var.q0(600.0f));
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size6) {
                        obj = list.get(i7);
                        if (!im3.n(hm3.p((zn4) obj), "action")) {
                            i7++;
                        }
                    } else {
                        obj = null;
                    }
                }
                zn4 zn4Var = (zn4) obj;
                final jl5 jl5VarC5 = zn4Var != null ? zn4Var.C(j2) : null;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 < size7) {
                        obj2 = list.get(i8);
                        if (!im3.n(hm3.p((zn4) obj2), "dismissAction")) {
                            i8++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                zn4 zn4Var2 = (zn4) obj2;
                jl5 jl5VarC6 = zn4Var2 != null ? zn4Var2.C(j2) : null;
                int i9 = jl5VarC5 != null ? jl5VarC5.m : 0;
                int i10 = jl5VarC5 != null ? jl5VarC5.n : 0;
                int i11 = jl5VarC6 != null ? jl5VarC6.m : 0;
                int i12 = jl5VarC6 != null ? jl5VarC6.n : 0;
                int iQ1 = ((iMin - i9) - i11) - (i11 == 0 ? fo4Var.q0(8.0f) : 0);
                int iK2 = r61.k(j2);
                if (iQ1 < iK2) {
                    iQ1 = iK2;
                }
                int size8 = list.size();
                int i13 = 0;
                while (i13 < size8) {
                    zn4 zn4Var3 = (zn4) list.get(i13);
                    int i14 = i12;
                    if (im3.n(hm3.p(zn4Var3), "text")) {
                        final jl5 jl5VarC7 = zn4Var3.C(r61.b(j2, 0, iQ1, 0, 0, 9));
                        b63 b63Var = le.a;
                        int iW2 = jl5VarC7.W(b63Var);
                        int iW3 = jl5VarC7.W(le.b);
                        final int i15 = iMin - i11;
                        final int i16 = i15 - i9;
                        if (iW2 == iW3 || !(iW2 != Integer.MIN_VALUE && iW3 != Integer.MIN_VALUE)) {
                            iMax = Math.max(fo4Var.q0(uf0.Q), Math.max(i10, i14));
                            iQ0 = (iMax - jl5VarC7.n) / 2;
                            if (jl5VarC5 == null || (iW = jl5VarC5.W(b63Var)) == Integer.MIN_VALUE) {
                                i2 = 0;
                            } else {
                                i2 = (iW2 + iQ0) - iW;
                            }
                        } else {
                            iQ0 = fo4Var.q0(30.0f) - iW2;
                            iMax = Math.max(fo4Var.q0(uf0.R), jl5VarC7.n + iQ0);
                            if (jl5VarC5 != null) {
                                i2 = (iMax - jl5VarC5.n) / 2;
                            } else {
                                i2 = 0;
                            }
                        }
                        final int i17 = i2;
                        final int i18 = iQ0;
                        final int i19 = jl5VarC6 != null ? (iMax - jl5VarC6.n) / 2 : 0;
                        final jl5 jl5Var = jl5VarC6;
                        return fo4Var.u(iMin, iMax, fa2Var, new Function1() { // from class: o.w37
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                il5 il5Var = (il5) obj3;
                                il5.k(il5Var, jl5VarC7, 0, i18);
                                jl5 jl5Var2 = jl5VarC5;
                                if (jl5Var2 != null) {
                                    il5.k(il5Var, jl5Var2, i16, i17);
                                }
                                jl5 jl5Var3 = jl5Var;
                                if (jl5Var3 != null) {
                                    il5.k(il5Var, jl5Var3, i15, i19);
                                }
                                return f88.a;
                            }
                        });
                    }
                    i13++;
                    i12 = i14;
                }
                gc4.b("Collection contains no element matching the predicate.");
                hk0.b();
                return null;
        }
    }
}
