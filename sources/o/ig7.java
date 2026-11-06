package o;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ig7 {
    public static final h72 a = new h72(new jv6((byte) 11), (byte) 0);

    public static final void a(fs4 fs4Var, pw6 pw6Var, long j, long j2, float f, float f2, final hw2 hw2Var, ux2 ux2Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            fs4Var = cs4.b;
        }
        final fs4 fs4Var2 = fs4Var;
        if ((i2 & 2) != 0) {
            pw6Var = kh.V;
        }
        final pw6 pw6Var2 = pw6Var;
        if ((i2 & 4) != 0) {
            j = ((rn4) ux2Var.j(un4.a)).a.p;
        }
        final long j3 = j;
        long jA = (i2 & 8) != 0 ? bw0.a(j3, ux2Var) : j2;
        float f3 = (i2 & 16) != 0 ? 0.0f : f;
        final float f4 = (i2 & 32) != 0 ? 0.0f : f2;
        h72 h72Var = a;
        final float f5 = ((w32) ux2Var.j(h72Var)).m + f3;
        final d90 d90Var = null;
        j51.m(new dx5[]{wa1.a.a(new rv0(jA)), h72Var.a(new w32(f5))}, au8.O(421772006, new hw2() { // from class: o.gg7
            @Override // o.hw2
            public final Object invoke(Object obj, Object obj2) {
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean zN = ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2);
                f88 f88Var = f88.a;
                if (!zN) {
                    ux2Var2.Q();
                    return f88Var;
                }
                fs4 fs4VarC = ig7.c(fs4Var2, pw6Var2, ig7.d(j3, f5, ux2Var2), d90Var, ((in1) ux2Var2.j(b11.h)).d0(f4));
                Object objK = ux2Var2.K();
                aw awVar = e01.a;
                if (objK == awVar) {
                    objK = new vs6((byte) 14);
                    ux2Var2.g0(objK);
                }
                fs4 fs4VarA = cp6.a(fs4VarC, false, (Function1) objK);
                Object objK2 = ux2Var2.K();
                if (objK2 == awVar) {
                    objK2 = al1.d;
                    ux2Var2.g0(objK2);
                }
                fs4 fs4VarA2 = qg7.a(fs4VarA, f88Var, (PointerInputEventHandler) objK2);
                do4 do4VarC = ua0.c(xz2.f2564o, true);
                int iHashCode = Long.hashCode(ux2Var2.T);
                yj5 yj5VarL = ux2Var2.l();
                fs4 fs4VarS = uf0.s(ux2Var2, fs4VarA2);
                yz0.c.getClass();
                ux2Var2.a0();
                if (ux2Var2.S) {
                    ux2Var2.k(LayoutNode.e0);
                } else {
                    ux2Var2.j0();
                }
                o67.n(do4VarC, d82.v, ux2Var2);
                o67.n(yj5VarL, d82.u, ux2Var2);
                o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                o67.l(ux2Var2);
                o67.n(fs4VarS, d82.t, ux2Var2);
                hw2Var.invoke(ux2Var2, 0);
                ux2Var2.p(true);
                return f88Var;
            }
        }, ux2Var), ux2Var, 56);
    }

    public static final void b(final Function0 function0, final fs4 fs4Var, boolean z, final pw6 pw6Var, final long j, long j2, float f, float f2, d90 d90Var, mw4 mw4Var, final yy0 yy0Var, ux2 ux2Var, int i, int i2) {
        final mw4 mw4Var2;
        final boolean z2 = (i2 & 4) != 0 ? true : z;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        final float f4 = (i2 & 128) != 0 ? 0.0f : f2;
        final d90 d90Var2 = (i2 & 256) != 0 ? null : d90Var;
        if (mw4Var == null) {
            ux2Var.W(-1701074900);
            Object objK = ux2Var.K();
            if (objK == e01.a) {
                objK = ua5.s(ux2Var);
            }
            ux2Var.p(false);
            mw4Var2 = (mw4) objK;
        } else {
            ux2Var.W(2023335947);
            ux2Var.p(false);
            mw4Var2 = mw4Var;
        }
        h72 h72Var = a;
        final float f5 = ((w32) ux2Var.j(h72Var)).m + f3;
        j51.m(new dx5[]{wa1.a.a(new rv0(j2)), h72Var.a(new w32(f5))}, au8.O(849208527, new hw2() { // from class: o.hg7
            @Override // o.hw2
            public final Object invoke(Object obj, Object obj2) {
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ux2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b63 b63Var = ml3.a;
                    fs4 fs4VarF = fs4Var.f(jr4.b);
                    h72 h72Var2 = zd6.a;
                    me6 me6Var = ((ne6) ux2Var2.j(h72Var2)).a;
                    fs4 fs4VarF2 = fs4VarF.f(cs4.b);
                    long jD = ig7.d(j, f5, ux2Var2);
                    float fD0 = ((in1) ux2Var2.j(b11.h)).d0(f4);
                    pw6 pw6Var2 = pw6Var;
                    fs4 fs4VarC = ig7.c(fs4VarF2, pw6Var2, jD, d90Var2, fD0);
                    me6 me6Var2 = ((ne6) ux2Var2.j(h72Var2)).a;
                    fs4 fs4VarQ = ck3.q(androidx.compose.foundation.b.a(fs4VarC, mw4Var2, zd6.a(false, 0.0f, 0L, pw6Var2, 215), z2, null, function0, 24));
                    do4 do4VarC = ua0.c(xz2.f2564o, true);
                    int iHashCode = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL = ux2Var2.l();
                    fs4 fs4VarS = uf0.s(ux2Var2, fs4VarQ);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(LayoutNode.e0);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var2);
                    o67.n(yj5VarL, d82.u, ux2Var2);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var2);
                    o67.l(ux2Var2);
                    o67.n(fs4VarS, d82.t, ux2Var2);
                    yy0Var.invoke(ux2Var2, 0);
                    ux2Var2.p(true);
                } else {
                    ux2Var2.Q();
                }
                return f88.a;
            }
        }, ux2Var), ux2Var, 56);
    }

    public static final fs4 c(fs4 fs4Var, pw6 pw6Var, long j, d90 d90Var, float f) {
        pw6 pw6Var2;
        fs4 fs4VarU;
        fs4 c90Var = cs4.b;
        if (f > 0.0f) {
            pw6Var2 = pw6Var;
            fs4VarU = di1.u(c90Var, 0.0f, 0.0f, 0.0f, f, 0.0f, pw6Var2, false, 1042399);
        } else {
            pw6Var2 = pw6Var;
            fs4VarU = c90Var;
        }
        fs4 fs4VarF = fs4Var.f(fs4VarU);
        if (d90Var != null) {
            c90Var = new c90(d90Var.a, d90Var.b, pw6Var2);
        }
        return iq8.j(au8.s(fs4VarF.f(c90Var), j, pw6Var2), pw6Var2);
    }

    public static final long d(long j, float f, ux2 ux2Var) {
        zv0 zv0Var = ((rn4) ux2Var.j(un4.a)).a;
        boolean zBooleanValue = ((Boolean) ux2Var.j(bw0.a)).booleanValue();
        long j2 = zv0Var.p;
        int i = rv0.i;
        if (z68.a(j, j2) && zBooleanValue) {
            return w32.b(f, 0.0f) ? j2 : j51.x(rv0.b(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, zv0Var.t), j2);
        }
        return j;
    }
}
