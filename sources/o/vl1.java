package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vl1 {
    public static final vl1 a = new vl1();

    public final void a(nf nfVar, ux2 ux2Var, int i) {
        vu7 vu7Var = (vu7) nfVar.k;
        ru7 ru7Var = (ru7) nfVar.e;
        ux2Var.Y(-59484306);
        int i2 = (ux2Var.h(nfVar) ? 4 : 2) | i;
        byte b = 18;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            j04 j04Var = (j04) ux2Var.j(b11.n);
            vc vcVar = vu7Var.f;
            vx4 vx4Var = (vx4) nfVar.d;
            boolean zF = ux2Var.f(ru7Var) | ux2Var.d(j04Var.ordinal());
            Object objK = ux2Var.K();
            Object obj = e01.a;
            if (zF || objK == obj) {
                if (j04Var == j04.n) {
                    ru7Var = new ru7(ru7Var.b, ru7Var.a);
                }
                ux2Var.g0(ru7Var);
                objK = ru7Var;
            }
            ru7 ru7Var2 = (ru7) objK;
            cv7 cv7VarB = vx4Var.b();
            yy0 yy0Var = (yy0) nfVar.f;
            yy0 yy0Var2 = (yy0) nfVar.g;
            hw2 hw2Var = (hw2) nfVar.h;
            if (hw2Var == null) {
                hw2Var = iq8.u;
            }
            List listL = qf0.L(yy0Var, yy0Var2, hw2Var, au8.O(-1040725425, new t0(nfVar, (byte) 17), ux2Var), au8.O(-2077735826, new t0(cv7VarB, b), ux2Var));
            boolean zF2 = ux2Var.f((he5) nfVar.i);
            Object objK2 = ux2Var.K();
            if (zF2 || objK2 == obj) {
                Object nu7Var = new nu7((ye5) nfVar.c, cv7VarB, (he5) nfVar.i, ru7Var2, vu7Var);
                ux2Var.g0(nu7Var);
                objK2 = nu7Var;
            }
            nu7 nu7Var2 = (nu7) objK2;
            nu7Var2.c.setValue((ye5) nfVar.c);
            nu7Var2.d.setValue(cv7VarB);
            nu7Var2.e.setValue(ru7Var2);
            yo1.a(vx4Var, vcVar, ux2Var, 0);
            fs4 fs4VarT = di1.t((fs4) nfVar.b, new fj3((Object) vcVar, (byte) 25));
            yy0 yy0VarQ = zu1.q(listL);
            boolean zF3 = ux2Var.f(nu7Var2);
            Object objK3 = ux2Var.K();
            if (zF3 || objK3 == obj) {
                objK3 = new ru4(nu7Var2);
                ux2Var.g0(objK3);
            }
            do4 do4Var = (do4) objK3;
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarT);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(do4Var, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            hw2 hw2Var2 = d82.w;
            if (ux2Var.S || !im3.n(ux2Var.K(), Integer.valueOf(iHashCode))) {
                ux2Var.g0(Integer.valueOf(iHashCode));
                ux2Var.b(Integer.valueOf(iHashCode), hw2Var2);
            }
            o67.n(fs4VarS, d82.t, ux2Var);
            yy0VarQ.invoke(ux2Var, 0);
            ux2Var.p(true);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new c9((byte) 18, i, (Object) this, (Object) nfVar);
        }
    }
}
