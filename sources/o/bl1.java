package o;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bl1 {
    public static final bl1 a = new bl1();

    public final void a(p07 p07Var, ux2 ux2Var, int i) {
        ux2 ux2Var2 = ux2Var;
        float f = p07Var.h;
        ux2Var2.Y(2137486921);
        int i2 = i | (ux2Var2.f(p07Var) ? 4 : 2);
        byte b = 15;
        if (ux2Var2.N(i2 & 1, (i2 & 3) != 2)) {
            m08 m08Var = p07Var.k;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                hk0.g("The expandedHeight is expected to be specified and finite");
                return;
            }
            boolean zF = ux2Var2.f(m08Var) | ux2Var2.f(null);
            Object objK = ux2Var2.K();
            aw awVar = e01.a;
            if (zF || objK == awVar) {
                objK = d57.b(new a3(p07Var, (byte) 6));
                ux2Var2.g0(objK);
            }
            i97 i97VarA = r07.a(((rv0) ((i97) objK).getValue()).a, xs1.c0(du4.f656o, ux2Var2), ux2Var2, 0, 12);
            yy0 yy0VarO = au8.O(-1658896622, new t0(p07Var, (byte) 14), ux2Var2);
            ux2Var2.W(690075377);
            ux2Var2.p(false);
            fs4 fs4Var = p07Var.a;
            cs4 cs4Var = cs4.b;
            fs4 fs4VarF = fs4Var.f(cs4Var);
            boolean zF2 = ux2Var2.f(i97VarA);
            Object objK2 = ux2Var2.K();
            if (zF2 || objK2 == awVar) {
                objK2 = new yk1(i97VarA, (byte) 0);
                ux2Var2.g0(objK2);
            }
            fs4 fs4VarB = j51.B(fs4VarF, (Function1) objK2);
            Object objK3 = ux2Var2.K();
            if (objK3 == awVar) {
                objK3 = new h31(b);
                ux2Var2.g0(objK3);
            }
            fs4 fs4VarA = cp6.a(fs4VarB, false, (Function1) objK3);
            Object objK4 = ux2Var2.K();
            if (objK4 == awVar) {
                objK4 = al1.b;
                ux2Var2.g0(objK4);
            }
            fs4 fs4VarA2 = qg7.a(fs4VarA, f88.a, (PointerInputEventHandler) objK4);
            do4 do4VarC = ua0.c(xz2.f2564o, false);
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
            fs4 fs4VarK = iq8.k(pm8.L(cs4Var, p07Var.j));
            h72 h72Var = qr.a;
            boolean z = (i2 & 14) == 4;
            Object objK5 = ux2Var2.K();
            if (z || objK5 == awVar) {
                objK5 = new zk1();
                ux2Var2.g0(objK5);
            }
            jn2 jn2Var = (jn2) objK5;
            long j = m08Var.c;
            long j2 = m08Var.d;
            long j3 = m08Var.e;
            long j4 = m08Var.f;
            yy0 yy0Var = p07Var.b;
            ot7 ot7Var = p07Var.c;
            ot7 ot7Var2 = p07Var.d;
            w50 w50Var = p07Var.e;
            yy0 yy0Var2 = p07Var.f;
            float f2 = p07Var.h;
            nd5 nd5Var = p07Var.i;
            Object objK6 = ux2Var2.K();
            if (objK6 == awVar) {
                objK6 = new y01((byte) 27);
                ux2Var2.g0(objK6);
            }
            qr.f(fs4VarK, jn2Var, j, j2, j4, j3, yy0Var, ot7Var, ot7Var2, (Function0) objK6, w50Var, yy0Var2, yy0VarO, f2, nd5Var, ux2Var2, 0);
            ux2Var2 = ux2Var2;
            ux2Var2.p(true);
        } else {
            ux2Var2.Q();
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new c9((byte) 15, i, (Object) this, (Object) p07Var);
        }
    }
}
