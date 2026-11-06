package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e9 implements hw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f694o;
    public final /* synthetic */ pw2 p;
    public final /* synthetic */ pw2 q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e9(ArrayList arrayList, Function0 function0, Function1 function1, fs4 fs4Var, l33 l33Var, me1 me1Var, p9 p9Var, int i, int i2) {
        this.f694o = arrayList;
        this.p = function0;
        this.q = function1;
        this.r = fs4Var;
        this.s = l33Var;
        this.t = me1Var;
        this.u = p9Var;
        this.n = i2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        ArrayList arrayList;
        Object obj4;
        Object obj5;
        int i;
        final lf1 lf1Var;
        Object obj6;
        Integer numValueOf;
        final int iIntValue;
        int iQ0;
        int iB;
        Object obj7;
        Object obj8;
        int iQ1;
        int iQ2;
        int i2;
        byte b = this.m;
        Object obj9 = this.u;
        Object obj10 = this.t;
        Object obj11 = this.s;
        Object obj12 = this.r;
        pw2 pw2Var = this.q;
        pw2 pw2Var2 = this.p;
        Object obj13 = this.f694o;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                pm8.a((ArrayList) obj13, (Function0) pw2Var2, (Function1) pw2Var, (fs4) obj12, (l33) obj11, (me1) obj10, (p9) obj9, (ux2) obj, yo1.Y(1), this.n);
                return f88.a;
            default:
                final qj8 qj8Var = (qj8) obj13;
                hw2 hw2Var = (hw2) pw2Var;
                hw2 hw2Var2 = (hw2) obj12;
                hw2 hw2Var3 = (hw2) obj11;
                li6 li6Var = (li6) obj10;
                yy0 yy0Var = (yy0) obj9;
                final md7 md7Var = (md7) obj;
                r61 r61Var = (r61) obj2;
                final int i3 = r61.i(r61Var.a);
                final int iH = r61.h(r61Var.a);
                long jB = r61.b(r61Var.a, 0, 0, 0, 0, 10);
                int iC = qj8Var.c(md7Var, md7Var.getLayoutDirection());
                int iA = qj8Var.a(md7Var, md7Var.getLayoutDirection());
                int iB2 = qj8Var.b(md7Var);
                List listM0 = md7Var.m0(mi6.m, (hw2) pw2Var2);
                ArrayList arrayList2 = new ArrayList(listM0.size());
                int i4 = 0;
                for (int size = listM0.size(); i4 < size; size = size) {
                    arrayList2.add(((zn4) listM0.get(i4)).C(jB));
                    i4++;
                }
                if (arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                    obj3 = null;
                } else {
                    obj3 = arrayList2.get(0);
                    int i5 = ((jl5) obj3).n;
                    int size2 = arrayList2.size() - 1;
                    if (1 <= size2) {
                        int i6 = i5;
                        Object obj14 = obj3;
                        int i7 = 1;
                        while (true) {
                            Object obj15 = arrayList2.get(i7);
                            arrayList = arrayList2;
                            int i8 = ((jl5) obj15).n;
                            if (i6 < i8) {
                                i6 = i8;
                                obj14 = obj15;
                            }
                            if (i7 != size2) {
                                i7++;
                                arrayList2 = arrayList;
                            } else {
                                obj3 = obj14;
                            }
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                }
                jl5 jl5Var = (jl5) obj3;
                int i9 = jl5Var != null ? jl5Var.n : 0;
                List listM1 = md7Var.m0(mi6.f1473o, hw2Var);
                final ArrayList arrayList3 = new ArrayList(listM1.size());
                int size3 = listM1.size();
                int i10 = 0;
                while (i10 < size3) {
                    arrayList3.add(((zn4) listM1.get(i10)).C(t61.i((-iC) - iA, -iB2, jB)));
                    i10++;
                    size3 = size3;
                    listM1 = listM1;
                    li6Var = li6Var;
                    yy0Var = yy0Var;
                }
                yy0 yy0Var2 = yy0Var;
                li6 li6Var2 = li6Var;
                if (arrayList3.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList3.get(0);
                    int i11 = ((jl5) obj4).n;
                    int size4 = arrayList3.size() - 1;
                    if (1 <= size4) {
                        int i12 = 1;
                        while (true) {
                            Object obj16 = arrayList3.get(i12);
                            Object obj17 = obj4;
                            int i13 = ((jl5) obj16).n;
                            if (i11 < i13) {
                                i11 = i13;
                                obj4 = obj16;
                            } else {
                                obj4 = obj17;
                            }
                            if (i12 != size4) {
                                i12++;
                            }
                        }
                    }
                }
                jl5 jl5Var2 = (jl5) obj4;
                int i14 = jl5Var2 != null ? jl5Var2.n : 0;
                if (arrayList3.isEmpty()) {
                    i = i14;
                    obj5 = null;
                } else {
                    obj5 = arrayList3.get(0);
                    int i15 = ((jl5) obj5).m;
                    int size5 = arrayList3.size() - 1;
                    if (1 <= size5) {
                        int i16 = 1;
                        while (true) {
                            Object obj18 = arrayList3.get(i16);
                            i = i14;
                            int i17 = ((jl5) obj18).m;
                            if (i15 < i17) {
                                i15 = i17;
                                obj5 = obj18;
                            }
                            if (i16 != size5) {
                                i16++;
                                i14 = i;
                            }
                        }
                    } else {
                        i = i14;
                    }
                }
                jl5 jl5Var3 = (jl5) obj5;
                int i18 = jl5Var3 != null ? jl5Var3.m : 0;
                List listM2 = md7Var.m0(mi6.p, hw2Var2);
                final ArrayList arrayList4 = new ArrayList(listM2.size());
                int size6 = listM2.size();
                int i19 = 0;
                while (i19 < size6) {
                    int i20 = i18;
                    List list = listM2;
                    jl5 jl5VarC = ((zn4) listM2.get(i19)).C(t61.i((-iC) - iA, -iB2, jB));
                    if (jl5VarC.n == 0 || jl5VarC.m == 0) {
                        jl5VarC = null;
                    }
                    if (jl5VarC != null) {
                        arrayList4.add(jl5VarC);
                    }
                    i19++;
                    i18 = i20;
                    listM2 = list;
                }
                final int i21 = i18;
                boolean zIsEmpty = arrayList4.isEmpty();
                byte b2 = this.n;
                if (zIsEmpty) {
                    lf1Var = null;
                } else {
                    if (arrayList4.isEmpty()) {
                        obj7 = null;
                    } else {
                        obj7 = arrayList4.get(0);
                        int i22 = ((jl5) obj7).m;
                        int size7 = arrayList4.size() - 1;
                        if (1 <= size7) {
                            int i23 = 1;
                            while (true) {
                                Object obj19 = arrayList4.get(i23);
                                int i24 = ((jl5) obj19).m;
                                if (i22 < i24) {
                                    i22 = i24;
                                    obj7 = obj19;
                                }
                                if (i23 != size7) {
                                    i23++;
                                }
                            }
                        }
                    }
                    obj7.getClass();
                    int i25 = ((jl5) obj7).m;
                    if (arrayList4.isEmpty()) {
                        obj8 = null;
                    } else {
                        obj8 = arrayList4.get(0);
                        int i26 = ((jl5) obj8).n;
                        int size8 = arrayList4.size() - 1;
                        if (1 <= size8) {
                            int i27 = 1;
                            while (true) {
                                Object obj20 = arrayList4.get(i27);
                                int i28 = ((jl5) obj20).n;
                                if (i26 < i28) {
                                    i26 = i28;
                                    obj8 = obj20;
                                }
                                if (i27 != size8) {
                                    i27++;
                                }
                            }
                        }
                    }
                    obj8.getClass();
                    int i29 = ((jl5) obj8).n;
                    j04 j04Var = j04.m;
                    if (b2 == 0) {
                        if (md7Var.getLayoutDirection() == j04Var) {
                            iQ1 = md7Var.q0(16.0f);
                            i2 = iQ1 + iC;
                        } else {
                            iQ2 = md7Var.q0(16.0f);
                            i2 = ((i3 - iQ2) - i25) - iA;
                        }
                    } else if (b2 != 2 && b2 != 3) {
                        i2 = (((i3 - i25) + iC) - iA) / 2;
                    } else if (md7Var.getLayoutDirection() == j04Var) {
                        iQ2 = md7Var.q0(16.0f);
                        i2 = ((i3 - iQ2) - i25) - iA;
                    } else {
                        iQ1 = md7Var.q0(16.0f);
                        i2 = iQ1 + iC;
                    }
                    lf1Var = new lf1(i2, i29, (byte) 2);
                }
                List listM3 = md7Var.m0(mi6.q, hw2Var3);
                final ArrayList arrayList5 = new ArrayList(listM3.size());
                int size9 = listM3.size();
                for (int i30 = 0; i30 < size9; i30++) {
                    arrayList5.add(((zn4) listM3.get(i30)).C(jB));
                }
                if (arrayList5.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList5.get(0);
                    int i31 = ((jl5) obj6).n;
                    int size10 = arrayList5.size() - 1;
                    if (1 <= size10) {
                        int i32 = 1;
                        while (true) {
                            Object obj21 = arrayList5.get(i32);
                            int i33 = ((jl5) obj21).n;
                            if (i31 < i33) {
                                i31 = i33;
                                obj6 = obj21;
                            }
                            if (i32 != size10) {
                                i32++;
                            }
                        }
                    }
                }
                jl5 jl5Var4 = (jl5) obj6;
                Integer numValueOf2 = jl5Var4 != null ? Integer.valueOf(jl5Var4.n) : null;
                if (lf1Var != null) {
                    int i34 = lf1Var.c;
                    if (numValueOf2 == null || b2 == 3) {
                        iQ0 = md7Var.q0(16.0f) + i34;
                        iB = qj8Var.b(md7Var);
                    } else {
                        iQ0 = numValueOf2.intValue() + i34;
                        iB = md7Var.q0(16.0f);
                    }
                    numValueOf = Integer.valueOf(iB + iQ0);
                } else {
                    numValueOf = null;
                }
                if (i != 0) {
                    iIntValue = i + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : qj8Var.b(md7Var));
                } else {
                    iIntValue = 0;
                }
                vj3 vj3Var = new vj3(qj8Var, md7Var);
                li6Var2.a.setValue(new pd5(ka0.p(vj3Var, md7Var.getLayoutDirection()), arrayList.isEmpty() ? vj3Var.d() : md7Var.O(i9), ka0.o(vj3Var, md7Var.getLayoutDirection()), numValueOf2 != null ? md7Var.O(numValueOf2.intValue()) : vj3Var.c()));
                List listM4 = md7Var.m0(mi6.n, new yy0(-278021671, true, new l64(yy0Var2, li6Var2, (byte) 16)));
                final ArrayList arrayList6 = new ArrayList(listM4.size());
                int size11 = listM4.size();
                for (int i35 = 0; i35 < size11; i35++) {
                    arrayList6.add(((zn4) listM4.get(i35)).C(jB));
                }
                final Integer num = numValueOf;
                final ArrayList arrayList7 = arrayList;
                final Integer num2 = numValueOf2;
                return md7Var.u(i3, iH, fa2.m, new Function1() { // from class: o.ki6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj22) {
                        int i36;
                        il5 il5Var = (il5) obj22;
                        ArrayList arrayList8 = arrayList6;
                        int size12 = arrayList8.size();
                        for (int i37 = 0; i37 < size12; i37++) {
                            il5Var.g((jl5) arrayList8.get(i37), 0, 0, 0.0f);
                        }
                        ArrayList arrayList9 = arrayList7;
                        int size13 = arrayList9.size();
                        for (int i38 = 0; i38 < size13; i38++) {
                            il5Var.g((jl5) arrayList9.get(i38), 0, 0, 0.0f);
                        }
                        ArrayList arrayList10 = arrayList3;
                        int size14 = arrayList10.size();
                        int i39 = 0;
                        while (true) {
                            i36 = iH;
                            if (i39 >= size14) {
                                break;
                            }
                            jl5 jl5Var5 = (jl5) arrayList10.get(i39);
                            int i40 = i3 - i21;
                            md7 md7Var2 = md7Var;
                            j04 layoutDirection = md7Var2.getLayoutDirection();
                            qj8 qj8Var2 = qj8Var;
                            il5Var.g(jl5Var5, ((qj8Var2.c(md7Var2, layoutDirection) + i40) - qj8Var2.a(md7Var2, md7Var2.getLayoutDirection())) / 2, i36 - iIntValue, 0.0f);
                            i39++;
                        }
                        ArrayList arrayList11 = arrayList5;
                        int size15 = arrayList11.size();
                        for (int i41 = 0; i41 < size15; i41++) {
                            jl5 jl5Var6 = (jl5) arrayList11.get(i41);
                            Integer num3 = num2;
                            il5Var.g(jl5Var6, 0, i36 - (num3 != null ? num3.intValue() : 0), 0.0f);
                        }
                        lf1 lf1Var2 = lf1Var;
                        if (lf1Var2 != null) {
                            ArrayList arrayList12 = arrayList4;
                            int size16 = arrayList12.size();
                            for (int i42 = 0; i42 < size16; i42++) {
                                jl5 jl5Var7 = (jl5) arrayList12.get(i42);
                                int i43 = lf1Var2.b;
                                Integer num4 = num;
                                num4.getClass();
                                il5Var.g(jl5Var7, i43, i36 - num4.intValue(), 0.0f);
                            }
                        }
                        return f88.a;
                    }
                });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ e9(qj8 qj8Var, hw2 hw2Var, hw2 hw2Var2, hw2 hw2Var3, int i, hw2 hw2Var4, li6 li6Var, yy0 yy0Var) {
        this.f694o = qj8Var;
        this.p = hw2Var;
        this.q = hw2Var2;
        this.r = hw2Var3;
        this.n = i;
        this.s = hw2Var4;
        this.t = li6Var;
        this.u = yy0Var;
    }
}
