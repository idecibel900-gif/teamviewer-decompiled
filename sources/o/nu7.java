package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nu7 implements qu4 {
    public final he5 a;
    public final vu7 b;
    public final bg5 c;
    public final bg5 d;
    public final bg5 e;

    public nu7(ye5 ye5Var, cv7 cv7Var, he5 he5Var, ru7 ru7Var, vu7 vu7Var) {
        this.a = he5Var;
        this.b = vu7Var;
        this.c = h57.p(ye5Var);
        this.d = h57.p(cv7Var);
        this.e = h57.p(ru7Var);
    }

    @Override // o.qu4
    public final eo4 c(final fo4 fo4Var, List list, final long j) {
        zn4 zn4Var;
        ArrayList arrayList = (ArrayList) list;
        int i = 0;
        final zn4 zn4Var2 = (zn4) lv0.o0((List) arrayList.get(0));
        final zn4 zn4Var3 = (zn4) lv0.o0((List) arrayList.get(1));
        final zn4 zn4Var4 = (zn4) lv0.o0((List) arrayList.get(2));
        final zn4 zn4Var5 = (zn4) lv0.o0((List) arrayList.get(3));
        List listSubList = arrayList.subList(0, 3);
        int size = listSubList.size();
        while (true) {
            if (i >= size) {
                zn4Var = (zn4) lv0.o0((List) arrayList.get(4));
                break;
            }
            List list2 = (List) listSubList.get(i);
            if (list2.size() > 1) {
                zn4Var = (zn4) list2.get(1);
                break;
            }
            i++;
        }
        final zn4 zn4Var6 = zn4Var;
        return fo4Var.u(r61.i(j), r61.h(j), fa2.m, new Function1() { // from class: o.lu7
            /* JADX WARN: Code duplicated, block: B:168:0x0583  */
            /* JADX WARN: Code duplicated, block: B:169:0x0586  */
            /* JADX WARN: Code duplicated, block: B:171:0x0599  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                he5 he5Var;
                nu7 nu7Var;
                he5 he5Var2;
                nu7 nu7Var2;
                sa4 sa4Var;
                zk3 zk3Var;
                sa4 sa4Var2;
                vu7 vu7Var;
                sa4 sa4Var3;
                int i2;
                sa4 sa4Var4;
                int i3;
                int i4;
                int iMax;
                int i5;
                int iMin;
                int i6;
                int i7;
                int i8;
                int iMax2;
                nu7 nu7Var3 = this;
                vu7 vu7Var2 = nu7Var3.b;
                bg5 bg5Var = nu7Var3.d;
                bg5 bg5Var2 = nu7Var3.e;
                il5 il5Var = (il5) obj;
                if (il5Var.b() != null) {
                    long j2 = j;
                    long jI = (((long) r61.i(j2)) << 32) | (((long) r61.h(j2)) & 4294967295L);
                    he5 he5Var3 = nu7Var3.a;
                    vu7Var2.g = jI;
                    int i9 = r61.i(j2);
                    int iH = r61.h(j2);
                    zk3 zk3Var2 = new zk3(0, 0, i9, iH);
                    ru7 ru7Var = (ru7) bg5Var2.getValue();
                    cv7 cv7Var = (cv7) bg5Var.getValue();
                    er7 er7Var = new er7(xz2.Q, (byte) 2);
                    fo4 fo4Var2 = fo4Var;
                    zn4 zn4Var7 = zn4Var2;
                    zn4 zn4Var8 = zn4Var3;
                    zn4 zn4Var9 = zn4Var4;
                    int i10 = iH;
                    sa4 sa4VarF = nu7Var3.f(fo4Var2, ru7Var, zn4Var7, cv7Var, zn4Var8, zn4Var9, jI, er7Var);
                    sa4 sa4VarF2 = nu7Var3.f(fo4Var2, (ru7) bg5Var2.getValue(), zn4Var7, (cv7) bg5Var.getValue(), zn4Var8, zn4Var9, jI, new yr7((byte) 8));
                    sa4 sa4VarF3 = nu7Var3.f(fo4Var2, (ru7) bg5Var2.getValue(), zn4Var7, (cv7) bg5Var.getValue(), zn4Var8, zn4Var9, jI, new yr7((byte) 9));
                    sa4 sa4VarF4 = nu7Var3.f(fo4Var2, (ru7) bg5Var2.getValue(), zn4Var7, (cv7) bg5Var.getValue(), zn4Var8, zn4Var9, jI, new er7(xz2.R, (byte) 2));
                    zn4 zn4Var10 = zn4Var5;
                    f10 f10Var = zn4Var10 != null ? new f10(zn4Var10, fo4Var2) : null;
                    int iQ0 = il5Var.q0(nu7Var3.g().b);
                    int iQ1 = il5Var.q0(nu7Var3.g().d);
                    if (fo4Var2.b0()) {
                        he5Var = he5Var3;
                        nu7Var = nu7Var3;
                    } else {
                        int iF = zk3Var2.f();
                        j04 layoutDirection = fo4Var2.getLayoutDirection();
                        he5Var = he5Var3;
                        yf5 yf5Var = he5Var.e;
                        nu7Var = nu7Var3;
                        if (iF != yf5Var.z() || !im3.n(he5Var.h, fo4Var2) || he5Var.i != layoutDirection) {
                            yf5Var.A(iF);
                            he5Var.h = fo4Var2;
                            he5Var.i = layoutDirection;
                            n47 n47VarC = el5.c();
                            Function1 function1E = n47VarC != null ? n47VarC.e() : null;
                            n47 n47VarF = el5.f(n47VarC);
                            try {
                                nv1.M((List) he5Var.g.getValue(), iF, fo4Var2, he5Var.i);
                                if (!he5Var.d() && he5Var.b().a() != null) {
                                    fe5 fe5VarA = he5Var.b().a();
                                    fe5VarA.getClass();
                                    j04 j04Var = he5Var.i;
                                    int iB = fe5VarA.b(iF, fo4Var2);
                                    if (j04Var == j04.n) {
                                        iB = iF - iB;
                                    }
                                    he5Var.e(iB);
                                } else if (he5Var.a() != -1) {
                                    he5Var.e(he5Var.a());
                                }
                                el5.h(n47VarC, n47VarF, function1E);
                            } catch (Throwable th) {
                                el5.h(n47VarC, n47VarF, function1E);
                                throw th;
                            }
                        }
                    }
                    if (!(he5Var.c() == -1 && Float.isNaN(he5Var.b().b.z()) && he5Var.a() == -1) && sa4VarF.a() == 2) {
                        if (he5Var.a() != -1) {
                            int i11 = iQ0 / 2;
                            if (he5Var.a() <= i11) {
                                zk3 zk3VarA = he5Var.d() ? zk3.a(zk3Var2, he5Var.a() * 2, 0, 0, 0, 14) : zk3Var2;
                                pe5 pe5Var = (pe5) sa4VarF.get(1);
                                boolean zB0 = fo4Var2.b0();
                                zk3 zk3Var3 = zk3VarA;
                                nu7Var2 = nu7Var;
                                he5 he5Var4 = he5Var;
                                nu7Var2.i(zk3Var3, iQ1, pe5Var, sa4VarF2, zB0);
                                sa4Var2 = sa4VarF2;
                                vu7Var = vu7Var2;
                                sa4Var3 = sa4VarF;
                                zk3Var = zk3Var2;
                                he5Var2 = he5Var4;
                            } else {
                                nu7 nu7Var4 = nu7Var;
                                he5 he5Var5 = he5Var;
                                sa4Var = sa4VarF2;
                                if (he5Var5.a() >= zk3Var2.f() - i11) {
                                    zk3 zk3VarA2 = he5Var5.d() ? zk3.a(zk3Var2, 0, 0, (he5Var5.a() * 2) - i9, 0, 11) : zk3Var2;
                                    pe5 pe5Var2 = (pe5) sa4VarF.get(0);
                                    boolean zB1 = fo4Var2.b0();
                                    zk3 zk3Var4 = zk3VarA2;
                                    nu7Var2 = nu7Var4;
                                    he5Var2 = he5Var5;
                                    nu7Var2.i(zk3Var4, iQ1, pe5Var2, sa4Var, zB1);
                                } else {
                                    he5Var2 = he5Var5;
                                    nu7Var2 = nu7Var4;
                                    nu7Var2.i(zk3.a(zk3Var2, 0, 0, he5Var2.a() - i11, 0, 11), iQ1, (pe5) sa4VarF.get(0), sa4Var, fo4Var2.b0());
                                    nu7Var2.i(zk3.a(zk3Var2, he5Var2.a() + i11, 0, 0, 0, 14), iQ1, (pe5) sa4VarF.get(1), sa4Var, fo4Var2.b0());
                                }
                                sa4Var2 = sa4Var;
                                vu7Var = vu7Var2;
                                sa4Var3 = sa4VarF;
                                zk3Var = zk3Var2;
                            }
                        } else {
                            he5Var2 = he5Var;
                            nu7Var2 = nu7Var;
                            sa4Var = sa4VarF2;
                            int i12 = r61.i(j2);
                            if (he5Var2.c() == 0 || he5Var2.b().b.z() == 0.0f) {
                                pe5 pe5Var3 = (pe5) sa4VarF.get(1);
                                boolean zB2 = fo4Var2.b0();
                                zk3Var = zk3Var2;
                                nu7Var2.i(zk3Var, iQ1, pe5Var3, sa4Var, zB2);
                            } else {
                                int i13 = i12 - iQ0;
                                if (he5Var2.c() >= i13 || he5Var2.b().b.z() >= 1.0f) {
                                    pe5 pe5Var4 = (pe5) sa4VarF.get(0);
                                    boolean zB3 = fo4Var2.b0();
                                    zk3Var = zk3Var2;
                                    nu7Var2.i(zk3Var, iQ1, pe5Var4, sa4Var, zB3);
                                } else {
                                    int iC = he5Var2.c() != -1 ? he5Var2.c() : (int) (he5Var2.b().b.z() * i13);
                                    nu7Var2.i(zk3.a(zk3Var2, 0, 0, iC, 0, 11), iQ1, (pe5) sa4VarF.get(0), sa4Var, fo4Var2.b0());
                                    nu7Var2.i(zk3.a(zk3Var2, iC + iQ0, 0, 0, 0, 14), iQ1, (pe5) sa4VarF.get(1), sa4Var, fo4Var2.b0());
                                    sa4Var2 = sa4Var;
                                    vu7Var = vu7Var2;
                                    sa4Var3 = sa4VarF;
                                    zk3Var = zk3Var2;
                                }
                            }
                            sa4Var2 = sa4Var;
                            vu7Var = vu7Var2;
                            sa4Var3 = sa4VarF;
                        }
                        i2 = iQ0;
                    } else {
                        int iMin2 = i9;
                        he5Var2 = he5Var;
                        nu7Var2 = nu7Var;
                        sa4 sa4Var5 = sa4VarF2;
                        int i14 = iQ1;
                        int i15 = 0;
                        if (nu7Var2.g().g.isEmpty()) {
                            vu7Var = vu7Var2;
                            boolean zB4 = fo4Var2.b0();
                            sa4Var2 = sa4Var5;
                            sa4Var3 = sa4VarF;
                            zk3Var = zk3Var2;
                            i2 = iQ0;
                            nu7Var2.j(zk3Var, i2, i14, sa4Var3, sa4Var2, zB4);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            int i16 = 0;
                            for (v56 v56Var : nu7Var2.g().g) {
                                nu7 nu7Var5 = nu7Var2;
                                i04 i04VarB = il5Var.b();
                                i04VarB.getClass();
                                vu7 vu7Var3 = vu7Var2;
                                sa4 sa4Var6 = sa4VarF;
                                zk3 zk3VarT = vs1.T(v56Var.i(i04VarB.D(0L)));
                                int i17 = zk3VarT.c;
                                int i18 = zk3VarT.a;
                                if (i18 <= i16) {
                                    iMax2 = Math.max(i16, i17);
                                    i7 = i10;
                                    i8 = 0;
                                } else {
                                    if (i17 >= iMin2) {
                                        iMin2 = Math.min(i18, iMin2);
                                        i14 = i14;
                                        i7 = i10;
                                        i8 = 0;
                                    } else {
                                        i7 = i10;
                                        i8 = 0;
                                        arrayList2.add(new zk3(i16, 0, i18, i7));
                                        iMax2 = Math.max(i17, i18 + iQ0);
                                    }
                                    i15 = i8;
                                    i10 = i7;
                                    nu7Var2 = nu7Var5;
                                    vu7Var2 = vu7Var3;
                                    sa4VarF = sa4Var6;
                                    i14 = i14;
                                }
                                i16 = iMax2;
                                i15 = i8;
                                i10 = i7;
                                nu7Var2 = nu7Var5;
                                vu7Var2 = vu7Var3;
                                sa4VarF = sa4Var6;
                                i14 = i14;
                            }
                            nu7 nu7Var6 = nu7Var2;
                            int i19 = i14;
                            int i20 = i15;
                            vu7Var = vu7Var2;
                            sa4 sa4Var7 = sa4VarF;
                            int i21 = i10;
                            if (i16 < iMin2) {
                                arrayList2.add(new zk3(i16, i20, iMin2, i21));
                            }
                            if (arrayList2.isEmpty()) {
                                sa4Var2 = sa4Var5;
                                zk3Var = zk3Var2;
                                nu7Var2 = nu7Var6;
                                sa4Var3 = sa4Var7;
                                i2 = iQ0;
                            } else {
                                if (arrayList2.size() == 1) {
                                    sa4Var2 = sa4Var5;
                                    nu7Var2 = nu7Var6;
                                    sa4Var3 = sa4Var7;
                                    i2 = iQ0;
                                    nu7Var2.j((zk3) arrayList2.get(i20), i2, i19, sa4Var3, sa4Var2, fo4Var2.b0());
                                } else {
                                    nu7Var2 = nu7Var6;
                                    sa4VarF = sa4Var7;
                                    iQ0 = iQ0;
                                    if (arrayList2.size() >= sa4VarF.a()) {
                                        int iA = sa4VarF.a();
                                        for (int i22 = 0; i22 < iA; i22++) {
                                            nu7Var2.i((zk3) arrayList2.get(i22), i19, (pe5) sa4VarF.get(i22), sa4Var5, fo4Var2.b0());
                                        }
                                    } else if (((zk3) arrayList2.get(i20)).f() > ((zk3) arrayList2.get(1)).f()) {
                                        nu7Var2.j((zk3) arrayList2.get(i20), iQ0, i19, sa4VarF.subList(i20, 2), sa4Var5, fo4Var2.b0());
                                        sa4Var5 = sa4Var5;
                                        nu7Var2.i((zk3) arrayList2.get(1), i19, (pe5) sa4VarF.get(2), sa4Var5, fo4Var2.b0());
                                    } else {
                                        nu7Var2.i((zk3) arrayList2.get(i20), i19, (pe5) sa4VarF.get(i20), sa4Var5, fo4Var2.b0());
                                        sa4Var2 = sa4Var5;
                                        i2 = iQ0;
                                        nu7Var2.j((zk3) arrayList2.get(1), i2, i19, sa4VarF.subList(1, 3), sa4Var2, fo4Var2.b0());
                                        sa4Var3 = sa4VarF;
                                    }
                                    sa4Var2 = sa4Var5;
                                    sa4Var3 = sa4VarF;
                                    zk3Var = zk3Var2;
                                    i2 = iQ0;
                                }
                                zk3Var = zk3Var2;
                            }
                        }
                    }
                    if (sa4Var3.a() != 2 || f10Var == null) {
                        sa4Var4 = sa4Var3;
                        he5 he5Var6 = he5Var2;
                        if (!fo4Var2.b0()) {
                            he5Var6.f = -1;
                        }
                    } else {
                        if (he5Var2.d()) {
                            i4 = -1;
                            if (he5Var2.a() != -1) {
                                iMax = he5Var2.a();
                            }
                            i5 = i2 / 2;
                            if (iMax == i4) {
                                sa4Var4 = sa4Var3;
                            } else {
                                int i23 = zk3Var.c;
                                int iV = ct1.v(iMax, i5, i23 - i5);
                                iMin = Math.min(iV, i23 - iV);
                                i6 = f10Var.a;
                                if (iMin < i6 / 2) {
                                    i6 = (i6 - iMin) * 2;
                                }
                                f10Var.b = true;
                                f10Var.c = i6;
                                f10Var.d = zk3Var.c();
                                sa4Var4 = sa4Var3;
                                f10Var.f = new vk3((((long) ((int) (zk3Var.b() & 4294967295L))) & 4294967295L) | (((long) iV) << 32));
                            }
                        } else {
                            i4 = -1;
                        }
                        pe5 pe5Var5 = (pe5) sa4Var3.get(0);
                        pe5 pe5Var6 = (pe5) sa4Var3.get(1);
                        zk3 zk3Var5 = pe5Var5.j;
                        if (zk3Var5 != null && pe5Var6.j != null) {
                            int iMax3 = Math.max(zk3Var5 != null ? zk3Var5.f() : 0, 0) + (zk3Var5 != null ? zk3Var5.a : 0);
                            zk3 zk3Var6 = pe5Var6.j;
                            iMax = ((zk3Var6 != null ? zk3Var6.a : 0) + iMax3) / 2;
                        } else if (zk3Var5 != null) {
                            iMax = Math.max(zk3Var5 != null ? zk3Var5.f() : 0, 0) + (zk3Var5 != null ? zk3Var5.a : 0);
                        } else {
                            iMax = pe5Var6.j != null ? 0 : i4;
                        }
                        if (!fo4Var2.b0()) {
                            he5Var2.f = iMax;
                        }
                        i5 = i2 / 2;
                        if (iMax == i4) {
                            sa4Var4 = sa4Var3;
                        } else {
                            int i24 = zk3Var.c;
                            int iV2 = ct1.v(iMax, i5, i24 - i5);
                            iMin = Math.min(iV2, i24 - iV2);
                            i6 = f10Var.a;
                            if (iMin < i6 / 2) {
                                i6 = (i6 - iMin) * 2;
                            }
                            f10Var.b = true;
                            f10Var.c = i6;
                            f10Var.d = zk3Var.c();
                            sa4Var4 = sa4Var3;
                            f10Var.f = new vk3((((long) ((int) (zk3Var.b() & 4294967295L))) & 4294967295L) | (((long) iV2) << 32));
                        }
                    }
                    j04 layoutDirection2 = fo4Var2.getLayoutDirection();
                    boolean zB5 = fo4Var2.b0();
                    int iA2 = sa4VarF3.a();
                    int i25 = 0;
                    while (i25 < iA2) {
                        pe5 pe5Var7 = (pe5) sa4VarF3.get(i25);
                        f10 f10Var2 = f10Var;
                        long jMin = (((long) Math.min(pe5Var7.e, zk3Var.f())) << 32) | (((long) Math.min(pe5Var7.f, zk3Var.c())) & 4294967295L);
                        long jD = zk3Var.d();
                        sa4 sa4Var8 = sa4VarF3;
                        il5 il5Var2 = il5Var;
                        nu7Var2.h(vs1.e((((long) Math.round((1.0f + (layoutDirection2 == j04.m ? 0.0f : -0.0f)) * ((((int) (jD >> 32)) - ((int) (jMin >> 32))) / 2.0f))) << 32) | (((long) Math.round(((((int) (jD & 4294967295L)) - ((int) (jMin & 4294967295L))) / 2.0f) * 1.0f)) & 4294967295L), jMin), pe5Var7, zB5);
                        i25++;
                        f10Var = f10Var2;
                        sa4VarF3 = sa4Var8;
                        il5Var = il5Var2;
                    }
                    f10 f10Var3 = f10Var;
                    sa4 sa4Var9 = sa4VarF3;
                    il5 il5Var3 = il5Var;
                    int iA3 = sa4VarF4.a();
                    int i26 = 0;
                    while (i26 < iA3) {
                        pe5 pe5Var8 = (pe5) sa4VarF4.get(i26);
                        if (!pe5Var8.h) {
                            break;
                        }
                        vu7 vu7Var4 = vu7Var;
                        se5 se5VarB = vu7Var4.b(pe5Var8.c);
                        long j3 = se5VarB.e;
                        pe5Var8.j = new zk3((int) (j3 >> 32), (int) (j3 & 4294967295L), qf0.G(se5VarB), ((int) (se5VarB.e & 4294967295L)) + ((int) (se5VarB.d & 4294967295L)));
                        pe5Var8.i = se5VarB.f - 0.1f;
                        i26++;
                        vu7Var = vu7Var4;
                    }
                    int iA4 = sa4Var4.a();
                    for (int i27 = 0; i27 < iA4; i27++) {
                        ((pe5) sa4Var4.get(i27)).a(il5Var3, zk3Var);
                    }
                    int iA5 = sa4Var2.a();
                    for (int i28 = 0; i28 < iA5; i28++) {
                        ((pe5) sa4Var2.get(i28)).a(il5Var3, zk3Var);
                    }
                    if (f10Var3 != null && f10Var3.b) {
                        jl5 jl5VarC = ((zn4) f10Var3.e).C(t61.b(f10Var3.c, 0, 0, f10Var3.d, 6));
                        vk3 vk3Var = (vk3) f10Var3.f;
                        il5Var3.g(jl5VarC, (vk3Var != null ? (int) (vk3Var.a >> 32) : 0) - (jl5VarC.m / 2), (vk3Var != null ? (int) (vk3Var.a & 4294967295L) : 0) - (jl5VarC.n / 2), 0.0f);
                    }
                    zn4 zn4Var11 = zn4Var6;
                    if (zn4Var11 != null) {
                        int iF2 = zk3Var.f();
                        int iC2 = zk3Var.c();
                        if (!((iF2 >= 0) & (iC2 >= 0))) {
                            mi3.a("width and height must be >= 0");
                        }
                        i3 = 0;
                        il5Var3.g(zn4Var11.C(t61.h(iF2, iF2, iC2, iC2)), 0, 0, 0.0f);
                    } else {
                        i3 = 0;
                    }
                    int iA6 = sa4Var9.a();
                    for (int i29 = i3; i29 < iA6; i29++) {
                        ((pe5) sa4Var9.get(i29)).a(il5Var3, zk3Var);
                    }
                    int iA7 = sa4VarF4.a();
                    for (int i30 = i3; i30 < iA7; i30++) {
                        ((pe5) sa4VarF4.get(i30)).a(il5Var3, zk3Var);
                    }
                }
                return f88.a;
            }
        });
    }

    public final sa4 f(final fo4 fo4Var, ru7 ru7Var, final zn4 zn4Var, final cv7 cv7Var, final zn4 zn4Var2, final zn4 zn4Var3, final long j, final Function1 function1) {
        final sa4 sa4VarT = qf0.t();
        Function1 function2 = new Function1() { // from class: o.mu7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                yu7 yu7Var = (yu7) obj;
                ce5 ce5VarA = cv7Var.a(yu7Var);
                if (((Boolean) function1.invoke(ce5VarA)).booleanValue()) {
                    int iOrdinal = yu7Var.ordinal();
                    nu7 nu7Var = this;
                    sa4 sa4Var = sa4VarT;
                    fo4 fo4Var2 = fo4Var;
                    long j2 = j;
                    if (iOrdinal == 0) {
                        int iQ0 = fo4Var2.q0(nu7Var.g().e);
                        int iQ1 = fo4Var2.q0(nu7Var.g().f);
                        zn4 zn4Var4 = zn4Var;
                        if (zn4Var4 != null) {
                            sa4Var.add(new pe5(zn4Var4, 10, yu7Var, ce5VarA, iQ0, iQ1, fo4Var2, j2));
                        }
                    } else if (iOrdinal == 1) {
                        int iQ2 = fo4Var2.q0(nu7Var.g().e);
                        int iQ3 = fo4Var2.q0(nu7Var.g().f);
                        zn4 zn4Var5 = zn4Var2;
                        if (zn4Var5 != null) {
                            sa4Var.add(new pe5(zn4Var5, 5, yu7Var, ce5VarA, iQ2, iQ3, fo4Var2, j2));
                        }
                    } else {
                        if (iOrdinal != 2) {
                            gk0.s();
                            return null;
                        }
                        int iQ4 = fo4Var2.q0(nu7Var.g().e);
                        int iQ5 = fo4Var2.q0(nu7Var.g().f);
                        zn4 zn4Var6 = zn4Var3;
                        if (zn4Var6 != null) {
                            sa4Var.add(new pe5(zn4Var6, 1, yu7Var, ce5VarA, iQ4, iQ5, fo4Var2, j2));
                        }
                    }
                }
                return f88.a;
            }
        };
        function2.invoke(ru7Var.a);
        function2.invoke(yu7.m);
        function2.invoke(ru7Var.b);
        return qf0.r(sa4VarT);
    }

    public final ye5 g() {
        return (ye5) this.c.getValue();
    }

    public final void h(zk3 zk3Var, pe5 pe5Var, boolean z) {
        pe5Var.j = zk3Var;
        se5 se5VarB = this.b.b(pe5Var.c);
        if (!z && !im3.n(pe5Var.d, xz2.R)) {
            se5VarB.f = pe5Var.i;
            return;
        }
        zk3 zk3Var2 = pe5Var.j;
        if (zk3Var2 != null) {
            if (!se5VarB.g) {
                se5VarB.b = se5VarB.h ? se5VarB.d : zk3Var2.d();
                se5VarB.c = se5VarB.h ? se5VarB.e : zk3Var2.e();
                se5VarB.g = true;
            }
            se5VarB.d = zk3Var2.d();
            se5VarB.e = zk3Var2.e();
            se5VarB.h = true;
        }
    }

    public final void i(zk3 zk3Var, int i, pe5 pe5Var, List list, boolean z) {
        zk3 zk3Var2;
        pe5 pe5Var2 = list.isEmpty() ? null : (pe5) list.get(0);
        yu7 yu7Var = pe5Var.c;
        int iC = zk3Var.c();
        pe5Var.f = iC;
        if (pe5Var2 != null) {
            zk3 zk3VarA = zk3.a(zk3Var, 0, zk3Var.b + iC + i, 0, 0, 13);
            zk3Var2 = zk3Var;
            h(zk3VarA, pe5Var2, z);
        } else {
            zk3Var2 = zk3Var;
        }
        h(zk3.a(zk3Var2, 0, 0, 0, zk3Var2.b + pe5Var.f, 7), pe5Var, z);
    }

    public final void j(zk3 zk3Var, int i, int i2, List list, sa4 sa4Var, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        int iF = zk3Var.f() - ((list.size() - 1) * i);
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ((pe5) list.get(i4)).e;
        }
        if (iF > i3) {
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                yq4.p();
                return;
            }
            Object next = it.next();
            if (it.hasNext()) {
                byte b = ((pe5) next).b;
                do {
                    Object next2 = it.next();
                    byte b2 = ((pe5) next2).b;
                    if (b < b2) {
                        next = next2;
                        b = b2;
                    }
                } while (it.hasNext());
            }
            pe5 pe5Var = (pe5) next;
            pe5Var.e = (iF - i3) + pe5Var.e;
        } else if (iF < i3) {
            float f = iF / i3;
            int size2 = list.size();
            for (int i5 = 0; i5 < size2; i5++) {
                pe5 pe5Var2 = (pe5) list.get(i5);
                pe5Var2.e = (int) (pe5Var2.e * f);
            }
        }
        int i6 = zk3Var.a;
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            pe5 pe5Var3 = (pe5) list.get(i7);
            int i8 = pe5Var3.e;
            i(new zk3(i6, zk3Var.b, i6 + i8, zk3Var.d), i2, pe5Var3, sa4Var, z);
            i6 += i8 + i;
        }
    }
}
