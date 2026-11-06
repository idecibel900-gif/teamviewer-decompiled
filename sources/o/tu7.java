package o;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class tu7 {
    public static final h72 a = new h72(new jv6((byte) 28), (byte) 0);

    public static final void a(fs4 fs4Var, ye5 ye5Var, vx4 vx4Var, ru7 ru7Var, yy0 yy0Var, iw2 iw2Var, he5 he5Var, yy0 yy0Var2, ux2 ux2Var, int i) {
        he5 he5VarF;
        ux2Var.Y(1879465207);
        int i2 = (i & 6) == 0 ? (ux2Var.f(fs4Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= ux2Var.f(ye5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(vx4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var.f(ru7Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ux2Var.h(iw2Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ux2Var.f(he5Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ux2Var.h(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= ux2Var.h(yy0Var2) ? 67108864 : 33554432;
        }
        if (ux2Var.N(i2 & 1, (38347923 & i2) != 38347922)) {
            aw awVar = e01.a;
            if (he5Var == null) {
                ux2Var.W(-2015147137);
                boolean z = (i2 & 896) == 256;
                Object objK = ux2Var.K();
                if (z || objK == awVar) {
                    objK = new eq5(vx4Var, (byte) 1);
                    ux2Var.g0(objK);
                }
                he5VarF = nv1.F((Function0) objK, false, ux2Var);
                ux2Var.p(false);
            } else {
                ux2Var.W(-2015148191);
                ux2Var.p(false);
                he5VarF = he5Var;
            }
            j04 j04Var = (j04) ux2Var.j(b11.n);
            boolean zD = ux2Var.d(j04Var.ordinal()) | ((i2 & 7168) == 2048);
            Object objK2 = ux2Var.K();
            if (zD || objK2 == awVar) {
                objK2 = j04Var == j04.n ? new ru7(ru7Var.b, ru7Var.a) : ru7Var;
                ux2Var.g0(objK2);
            }
            ru7 ru7Var2 = (ru7) objK2;
            l76 l76VarU = lv1.U(ou7.d, ux2Var);
            if (!im3.n((cv7) vx4Var.a.f1933o.getValue(), vx4Var.b())) {
                cv7 cv7Var = (cv7) vx4Var.a.f1933o.getValue();
                cv7 cv7VarB = vx4Var.b();
                ru7Var2.getClass();
                re5[] re5VarArr = new re5[3];
                int i3 = 0;
                for (int i4 = 3; i3 < i4; i4 = 3) {
                    int i5 = i3;
                    re5VarArr[i5] = new re5(0);
                    i3 = i5 + 1;
                }
                ArrayList arrayList = new ArrayList(3);
                int i6 = 0;
                for (int i7 = 3; i6 < i7; i7 = 3) {
                    arrayList.add(yl7.G);
                    i6++;
                }
                i76 i76Var = new i76();
                i76Var.m = 3;
                i76 i76Var2 = new i76();
                i76Var2.m = 3;
                i76 i76Var3 = new i76();
                i76Var3.m = -1;
                i76 i76Var4 = new i76();
                i76Var4.m = -1;
                ru7Var2.a(new ue5(re5VarArr, cv7Var, cv7VarB, i76Var, i76Var3, arrayList, i76Var2, i76Var4));
                g76 g76Var = new g76();
                g76 g76Var2 = new g76();
                i76 i76Var5 = new i76();
                i76Var5.m = 3;
                i76 i76Var6 = new i76();
                i76Var6.m = -1;
                ru7Var2.a(new xe5(i76Var, i76Var2, i76Var3, i76Var4, re5VarArr, arrayList, g76Var, i76Var5, g76Var2, i76Var6));
                ru7Var2.a(new ue5(i76Var, i76Var3, i76Var5, i76Var6, re5VarArr, arrayList, g76Var, g76Var2));
                ru7Var2.a(new l64(re5VarArr, arrayList, (byte) 7));
                l76VarU.a = new ou7((qe5) arrayList.get(ru7Var2.b(yu7.m)), (qe5) arrayList.get(ru7Var2.b(yu7.n)), (qe5) arrayList.get(ru7Var2.b(yu7.f2646o)));
            }
            ou7 ou7Var = (ou7) l76VarU.a;
            Object objK3 = ux2Var.K();
            if (objK3 == awVar) {
                objK3 = new vu7();
                ux2Var.g0(objK3);
            }
            vu7 vu7Var = (vu7) objK3;
            vu7Var.e = vx4Var;
            vu7Var.a = ru7Var2;
            byte b = vu7Var.h;
            for (int i8 = 0; i8 < b; i8++) {
                yu7 yu7VarC = vu7Var.c(i8);
                se5 se5VarA = vu7Var.a(i8);
                se5VarA.a.setValue(ou7Var.a(yu7VarC));
                se5VarA.g = false;
            }
            ux2Var.W(407832974);
            u18 u18VarG0 = ck3.g0(vx4Var.a, "ThreePaneScaffoldState", ux2Var, 56);
            ux2Var.p(false);
            Object objK4 = ux2Var.K();
            if (objK4 == awVar) {
                objK4 = new bv7(vu7Var);
                ux2Var.g0(objK4);
            }
            bv7 bv7Var = (bv7) objK4;
            bv7Var.f460o = vx4Var;
            bv7Var.n = u18VarG0;
            bt1.d(au8.O(-2135424586, new dw1(u18VarG0, vx4Var, bv7Var, zu1.P(ux2Var), fs4Var, ye5Var, ru7Var, iw2Var, he5VarF, vu7Var, yy0Var2, ou7Var, yy0Var), ux2Var), ux2Var, 6);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new t74(fs4Var, ye5Var, vx4Var, ru7Var, yy0Var, iw2Var, he5Var, yy0Var2, i, (byte) 2);
        }
    }

    public static final void b(fs4 fs4Var, ye5 ye5Var, cv7 cv7Var, ru7 ru7Var, yy0 yy0Var, iw2 iw2Var, he5 he5Var, yy0 yy0Var2, ux2 ux2Var, int i) {
        fs4 fs4Var2;
        int i2;
        ye5 ye5Var2;
        ru7 ru7Var2;
        yy0 yy0Var3;
        iw2 iw2Var2;
        he5 he5Var2;
        yy0 yy0Var4;
        ux2Var.Y(1570615767);
        if ((i & 6) == 0) {
            fs4Var2 = fs4Var;
            i2 = (ux2Var.f(fs4Var2) ? 4 : 2) | i;
        } else {
            fs4Var2 = fs4Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            ye5Var2 = ye5Var;
            i2 |= ux2Var.f(ye5Var2) ? 32 : 16;
        } else {
            ye5Var2 = ye5Var;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.f(cv7Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            ru7Var2 = ru7Var;
            i2 |= ux2Var.f(ru7Var2) ? 2048 : 1024;
        } else {
            ru7Var2 = ru7Var;
        }
        if ((i & 24576) == 0) {
            yy0Var3 = yy0Var;
            i2 |= ux2Var.h(yy0Var3) ? 16384 : 8192;
        } else {
            yy0Var3 = yy0Var;
        }
        if ((196608 & i) == 0) {
            iw2Var2 = iw2Var;
            i2 |= ux2Var.h(iw2Var2) ? 131072 : 65536;
        } else {
            iw2Var2 = iw2Var;
        }
        if ((1572864 & i) == 0) {
            he5Var2 = he5Var;
            i2 |= ux2Var.f(he5Var2) ? 1048576 : 524288;
        } else {
            he5Var2 = he5Var;
        }
        hc1 hc1Var = null;
        if ((12582912 & i) == 0) {
            i2 |= ux2Var.h(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            yy0Var4 = yy0Var2;
            i2 |= ux2Var.h(yy0Var4) ? 67108864 : 33554432;
        } else {
            yy0Var4 = yy0Var2;
        }
        if (ux2Var.N(i2 & 1, (38347923 & i2) != 38347922)) {
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                objK = new vx4(cv7Var);
                ux2Var.g0(objK);
            }
            vx4 vx4Var = (vx4) objK;
            boolean z = (i2 & 896) == 256;
            Object objK2 = ux2Var.K();
            if (z || objK2 == awVar) {
                objK2 = new mf7(vx4Var, cv7Var, hc1Var, (byte) 4);
                ux2Var.g0(objK2);
            }
            ck3.i(cv7Var, (hw2) objK2, ux2Var);
            a(fs4Var2, ye5Var2, vx4Var, ru7Var2, yy0Var3, iw2Var2, he5Var2, yy0Var4, ux2Var, (i2 & 14) | 384 | (i2 & 112) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (i2 & 234881024));
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new t74(fs4Var, ye5Var, cv7Var, ru7Var, yy0Var, iw2Var, he5Var, yy0Var2, i, (byte) 1);
        }
    }
}
