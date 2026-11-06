package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.node.LayoutNode;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class gk {
    public static final h72 a = new h72(new e5(14), (byte) 0);
    public static final h72 b = new h72(new ti4((byte) 4), (byte) 0);

    /* JADX WARN: Code duplicated, block: B:102:0x0227  */
    /* JADX WARN: Code duplicated, block: B:103:0x022d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0251  */
    /* JADX WARN: Code duplicated, block: B:108:0x025b  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111  */
    /* JADX WARN: Code duplicated, block: B:58:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x011b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Code duplicated, block: B:69:0x0155  */
    /* JADX WARN: Code duplicated, block: B:72:0x015c  */
    /* JADX WARN: Code duplicated, block: B:73:0x015e  */
    /* JADX WARN: Code duplicated, block: B:79:0x017a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0199  */
    /* JADX WARN: Code duplicated, block: B:83:0x019b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:99:0x0202  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r26v0, types: [o.ux2] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void a(bp5 bp5Var, Function0 function0, cp5 cp5Var, yy0 yy0Var, ux2 ux2Var, int i, int i2) {
        int i3;
        Function0 function1;
        cp5 cp5Var2;
        int i4;
        boolean z;
        Function0 function2;
        j56 j56VarR;
        Function0 function3;
        View view;
        in1 in1Var;
        String str;
        j04 j04Var;
        sx2 sx2VarY;
        px4 px4VarT;
        Object objK;
        aw awVar;
        Object obj;
        UUID uuid;
        boolean zBooleanValue;
        Object objK2;
        String str2;
        ?? r13;
        yo5 yo5Var;
        int i5;
        ?? r4;
        int i6;
        ?? r5;
        boolean z2;
        Object objK3;
        yo5 yo5Var2;
        ?? r6;
        ?? r7;
        boolean z3;
        Object objK4;
        ?? r8;
        int i7;
        Object obj2;
        boolean zH;
        Object obj3;
        boolean zH2;
        Object obj4;
        boolean zH3;
        Object obj5;
        int i8;
        int i9;
        bp5 bp5Var2 = bp5Var;
        ux2Var.Y(-1772091631);
        if ((i & 6) == 0) {
            i3 = (ux2Var.f(bp5Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                function1 = function0;
                i3 |= ux2Var.h(function1) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                cp5Var2 = cp5Var;
                if (ux2Var.f(cp5Var2)) {
                    i9 = 256;
                } else {
                    i9 = 128;
                }
                i3 |= i9;
            } else {
                cp5Var2 = cp5Var;
            }
            if ((i & 3072) == 0) {
                if (ux2Var.h(yy0Var)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i3 |= i8;
            }
            i4 = i3;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (ux2Var.N(i4 & 1, z)) {
                if (i10 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                view = (View) ux2Var.j(lh.f);
                in1Var = (in1) ux2Var.j(b11.h);
                str = (String) ux2Var.j(a);
                j04Var = (j04) ux2Var.j(b11.n);
                sx2VarY = kh.y(ux2Var);
                px4VarT = h57.t(yy0Var, ux2Var);
                Object[] objArr = new Object[0];
                objK = ux2Var.K();
                awVar = e01.a;
                obj = objK;
                if (objK == awVar) {
                    e5 e5Var = new e5((byte) 15);
                    ux2Var.g0(e5Var);
                    obj = e5Var;
                }
                uuid = (UUID) zu1.L(objArr, (Function0) obj, ux2Var, 48);
                zBooleanValue = ((Boolean) ux2Var.j(b)).booleanValue();
                objK2 = ux2Var.K();
                if (objK2 == awVar) {
                    str2 = str;
                    r13 = 1;
                    yo5 yo5Var3 = new yo5(function3, cp5Var2, str2, view, in1Var, bp5Var2, uuid, zBooleanValue);
                    bp5Var2 = bp5Var2;
                    yo5Var3.m(sx2VarY, new yy0(-297523940, true, new zj(yo5Var3, px4VarT, true ? 1 : 0)));
                    ux2Var.g0(yo5Var3);
                    objK2 = yo5Var3;
                } else {
                    str2 = str;
                    r13 = 1;
                }
                yo5Var = (yo5) objK2;
                boolean zH4 = ux2Var.h(yo5Var);
                i5 = i4 & 112;
                if (i5 == 32) {
                    r4 = r13;
                } else {
                    r4 = 0;
                }
                int i11 = (zH4 ? 1 : 0) | r4;
                i6 = i4 & 896;
                if (i6 == 256) {
                    r5 = r13;
                } else {
                    r5 = 0;
                }
                z2 = ((((i11 == true ? 1 : 0) | r5) == true ? 1 : 0) | (ux2Var.f(str2) ? 1 : 0) ? 1 : 0) | (ux2Var.d(j04Var.ordinal()) ? 1 : 0);
                objK3 = ux2Var.K();
                if (!z2 || objK3 == awVar) {
                    yo5Var2 = yo5Var;
                    l8 l8Var = new l8(yo5Var2, function3, cp5Var, str2, j04Var);
                    ux2Var.g0(l8Var);
                    objK3 = l8Var;
                } else {
                    yo5Var2 = yo5Var;
                }
                ck3.e(yo5Var2, (Function1) objK3, ux2Var);
                boolean zH5 = ux2Var.h(yo5Var2);
                if (i5 == 32) {
                    r6 = r13;
                } else {
                    r6 = 0;
                }
                int i12 = (zH5 ? 1 : 0) | r6;
                if (i6 == 256) {
                    r7 = r13;
                } else {
                    r7 = 0;
                }
                z3 = ((((i12 == true ? 1 : 0) | r7) == true ? 1 : 0) | (ux2Var.f(str2) ? 1 : 0) ? 1 : 0) | (ux2Var.d(j04Var.ordinal()) ? 1 : 0);
                objK4 = ux2Var.K();
                if (z3 || objK4 == awVar) {
                    bk bkVar = new bk(yo5Var2, function3, cp5Var, str2, j04Var, (byte) 0);
                    ux2Var.g0(bkVar);
                    objK4 = bkVar;
                }
                ck3.k((Function0) objK4, ux2Var);
                boolean zH6 = ux2Var.h(yo5Var2);
                if ((i4 & 14) == 4) {
                    r8 = r13;
                } else {
                    r8 = 0;
                }
                i7 = (zH6 ? 1 : 0) | r8;
                Object objK5 = ux2Var.K();
                obj2 = objK5;
                if (i7 == 0 || objK5 == awVar) {
                    g0 g0Var = new g0(yo5Var2, bp5Var2, (byte) 8);
                    ux2Var.g0(g0Var);
                    obj2 = g0Var;
                }
                ck3.e(bp5Var2, (Function1) obj2, ux2Var);
                zH = ux2Var.h(yo5Var2);
                Object objK6 = ux2Var.K();
                obj3 = objK6;
                if (zH || objK6 == awVar) {
                    h0 h0Var = new h0(yo5Var2, null, (byte) 11);
                    ux2Var.g0(h0Var);
                    obj3 = h0Var;
                }
                ck3.i(yo5Var2, (hw2) obj3, ux2Var);
                zH2 = ux2Var.h(yo5Var2);
                Object objK7 = ux2Var.K();
                obj4 = objK7;
                if (zH2 || objK7 == awVar) {
                    ak akVar = new ak(yo5Var2, r13);
                    ux2Var.g0(akVar);
                    obj4 = akVar;
                }
                fs4 fs4VarR0 = db8.r0(cs4.b, (Function1) obj4);
                zH3 = ux2Var.h(yo5Var2) | ux2Var.d(j04Var.ordinal());
                Object objK8 = ux2Var.K();
                obj5 = objK8;
                if (zH3 || objK8 == awVar) {
                    dk dkVar = new dk(yo5Var2, j04Var, (byte) 0);
                    ux2Var.g0(dkVar);
                    obj5 = dkVar;
                }
                do4 do4Var = (do4) obj5;
                int iHashCode = Long.hashCode(ux2Var.T);
                yj5 yj5VarL = ux2Var.l();
                fs4 fs4VarS = uf0.s(ux2Var, fs4VarR0);
                yz0.c.getClass();
                ux2Var.a0();
                if (ux2Var.S) {
                    ux2Var.k(LayoutNode.e0);
                } else {
                    ux2Var.j0();
                }
                o67.n(do4Var, d82.v, ux2Var);
                o67.n(yj5VarL, d82.u, ux2Var);
                o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                o67.l(ux2Var);
                o67.n(fs4VarS, d82.t, ux2Var);
                ux2Var.p(r13);
                function2 = function3;
            } else {
                ux2Var.Q();
                function2 = function1;
            }
            j56VarR = ux2Var.r();
            if (j56VarR != null) {
                j56VarR.d = new ck(bp5Var2, function2, cp5Var, yy0Var, i, i2, (byte) 0);
            }
        }
        i3 |= 48;
        function1 = function0;
        if ((i & 384) == 0) {
            cp5Var2 = cp5Var;
            if (ux2Var.f(cp5Var2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        } else {
            cp5Var2 = cp5Var;
        }
        if ((i & 3072) == 0) {
            if (ux2Var.h(yy0Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        i4 = i3;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (ux2Var.N(i4 & 1, z)) {
            if (i10 != 0) {
                function3 = null;
            } else {
                function3 = function1;
            }
            view = (View) ux2Var.j(lh.f);
            in1Var = (in1) ux2Var.j(b11.h);
            str = (String) ux2Var.j(a);
            j04Var = (j04) ux2Var.j(b11.n);
            sx2VarY = kh.y(ux2Var);
            px4VarT = h57.t(yy0Var, ux2Var);
            Object[] objArr2 = new Object[0];
            objK = ux2Var.K();
            awVar = e01.a;
            obj = objK;
            if (objK == awVar) {
                e5 e5Var2 = new e5((byte) 15);
                ux2Var.g0(e5Var2);
                obj = e5Var2;
            }
            uuid = (UUID) zu1.L(objArr2, (Function0) obj, ux2Var, 48);
            zBooleanValue = ((Boolean) ux2Var.j(b)).booleanValue();
            objK2 = ux2Var.K();
            if (objK2 == awVar) {
                str2 = str;
                r13 = 1;
                yo5 yo5Var4 = new yo5(function3, cp5Var2, str2, view, in1Var, bp5Var2, uuid, zBooleanValue);
                bp5Var2 = bp5Var2;
                yo5Var4.m(sx2VarY, new yy0(-297523940, true, new zj(yo5Var4, px4VarT, true ? 1 : 0)));
                ux2Var.g0(yo5Var4);
                objK2 = yo5Var4;
            } else {
                str2 = str;
                r13 = 1;
            }
            yo5Var = (yo5) objK2;
            boolean zH7 = ux2Var.h(yo5Var);
            i5 = i4 & 112;
            if (i5 == 32) {
                r4 = r13;
            } else {
                r4 = 0;
            }
            int i13 = (zH7 ? 1 : 0) | r4;
            i6 = i4 & 896;
            if (i6 == 256) {
                r5 = r13;
            } else {
                r5 = 0;
            }
            z2 = ((((i13 == true ? 1 : 0) | r5) == true ? 1 : 0) | (ux2Var.f(str2) ? 1 : 0) ? 1 : 0) | (ux2Var.d(j04Var.ordinal()) ? 1 : 0);
            objK3 = ux2Var.K();
            if (z2) {
                yo5Var2 = yo5Var;
                l8 l8Var2 = new l8(yo5Var2, function3, cp5Var, str2, j04Var);
                ux2Var.g0(l8Var2);
                objK3 = l8Var2;
            } else {
                yo5Var2 = yo5Var;
                l8 l8Var3 = new l8(yo5Var2, function3, cp5Var, str2, j04Var);
                ux2Var.g0(l8Var3);
                objK3 = l8Var3;
            }
            ck3.e(yo5Var2, (Function1) objK3, ux2Var);
            boolean zH8 = ux2Var.h(yo5Var2);
            if (i5 == 32) {
                r6 = r13;
            } else {
                r6 = 0;
            }
            int i14 = (zH8 ? 1 : 0) | r6;
            if (i6 == 256) {
                r7 = r13;
            } else {
                r7 = 0;
            }
            z3 = ((((i14 == true ? 1 : 0) | r7) == true ? 1 : 0) | (ux2Var.f(str2) ? 1 : 0) ? 1 : 0) | (ux2Var.d(j04Var.ordinal()) ? 1 : 0);
            objK4 = ux2Var.K();
            if (z3) {
                bk bkVar2 = new bk(yo5Var2, function3, cp5Var, str2, j04Var, (byte) 0);
                ux2Var.g0(bkVar2);
                objK4 = bkVar2;
            } else {
                bk bkVar3 = new bk(yo5Var2, function3, cp5Var, str2, j04Var, (byte) 0);
                ux2Var.g0(bkVar3);
                objK4 = bkVar3;
            }
            ck3.k((Function0) objK4, ux2Var);
            boolean zH9 = ux2Var.h(yo5Var2);
            if ((i4 & 14) == 4) {
                r8 = r13;
            } else {
                r8 = 0;
            }
            i7 = (zH9 ? 1 : 0) | r8;
            Object objK9 = ux2Var.K();
            obj2 = objK9;
            if (i7 == 0) {
                g0 g0Var2 = new g0(yo5Var2, bp5Var2, (byte) 8);
                ux2Var.g0(g0Var2);
                obj2 = g0Var2;
            } else {
                g0 g0Var3 = new g0(yo5Var2, bp5Var2, (byte) 8);
                ux2Var.g0(g0Var3);
                obj2 = g0Var3;
            }
            ck3.e(bp5Var2, (Function1) obj2, ux2Var);
            zH = ux2Var.h(yo5Var2);
            Object objK10 = ux2Var.K();
            obj3 = objK10;
            if (zH) {
                h0 h0Var2 = new h0(yo5Var2, null, (byte) 11);
                ux2Var.g0(h0Var2);
                obj3 = h0Var2;
            } else {
                h0 h0Var3 = new h0(yo5Var2, null, (byte) 11);
                ux2Var.g0(h0Var3);
                obj3 = h0Var3;
            }
            ck3.i(yo5Var2, (hw2) obj3, ux2Var);
            zH2 = ux2Var.h(yo5Var2);
            Object objK11 = ux2Var.K();
            obj4 = objK11;
            if (zH2) {
                ak akVar2 = new ak(yo5Var2, r13);
                ux2Var.g0(akVar2);
                obj4 = akVar2;
            } else {
                ak akVar3 = new ak(yo5Var2, r13);
                ux2Var.g0(akVar3);
                obj4 = akVar3;
            }
            fs4 fs4VarR1 = db8.r0(cs4.b, (Function1) obj4);
            zH3 = ux2Var.h(yo5Var2) | ux2Var.d(j04Var.ordinal());
            Object objK12 = ux2Var.K();
            obj5 = objK12;
            if (zH3) {
                dk dkVar2 = new dk(yo5Var2, j04Var, (byte) 0);
                ux2Var.g0(dkVar2);
                obj5 = dkVar2;
            } else {
                dk dkVar3 = new dk(yo5Var2, j04Var, (byte) 0);
                ux2Var.g0(dkVar3);
                obj5 = dkVar3;
            }
            do4 do4Var2 = (do4) obj5;
            int iHashCode2 = Long.hashCode(ux2Var.T);
            yj5 yj5VarL2 = ux2Var.l();
            fs4 fs4VarS2 = uf0.s(ux2Var, fs4VarR1);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(do4Var2, d82.v, ux2Var);
            o67.n(yj5VarL2, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS2, d82.t, ux2Var);
            ux2Var.p(r13);
            function2 = function3;
        } else {
            ux2Var.Q();
            function2 = function1;
        }
        j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ck(bp5Var2, function2, cp5Var, yy0Var, i, i2, (byte) 0);
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
