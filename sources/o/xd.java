package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xd implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ hw2 n;

    public /* synthetic */ xd(int i, hw2 hw2Var) {
        this.m = (byte) 5;
        this.n = hw2Var;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        nh6 nh6Var;
        byte b = this.m;
        cs4 cs4Var = cs4.b;
        tg3 tg3Var = LayoutNode.e0;
        f88 f88Var = f88.a;
        hw2 hw2Var = this.n;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fs4 fs4VarF = ka0.A(cs4Var, yd.a).f(new z53(xz2.A));
                    do4 do4VarC = ua0.c(xz2.f2564o, false);
                    int iHashCode = Long.hashCode(ux2Var.T);
                    yj5 yj5VarL = ux2Var.l();
                    fs4 fs4VarS = uf0.s(ux2Var, fs4VarF);
                    yz0.c.getClass();
                    ux2Var.a0();
                    if (ux2Var.S) {
                        ux2Var.k(tg3Var);
                    } else {
                        ux2Var.j0();
                    }
                    o67.n(do4VarC, d82.v, ux2Var);
                    o67.n(yj5VarL, d82.u, ux2Var);
                    o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
                    o67.l(ux2Var);
                    o67.n(fs4VarS, d82.t, ux2Var);
                    hw2Var.invoke(ux2Var, 0);
                    ux2Var.p(true);
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            case 1:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fs4 fs4VarF2 = ka0.A(new s14(1.0f, false), ka0.j(0.0f, 0.0f, 0.0f, ((Boolean) qp5.a.getValue()).booleanValue() ? 16.0f : 24.0f, 7)).f(new z53(xz2.A));
                    do4 do4VarC2 = ua0.c(xz2.f2564o, false);
                    int iHashCode2 = Long.hashCode(ux2Var2.T);
                    yj5 yj5VarL2 = ux2Var2.l();
                    fs4 fs4VarS2 = uf0.s(ux2Var2, fs4VarF2);
                    yz0.c.getClass();
                    ux2Var2.a0();
                    if (ux2Var2.S) {
                        ux2Var2.k(tg3Var);
                    } else {
                        ux2Var2.j0();
                    }
                    o67.n(do4VarC2, d82.v, ux2Var2);
                    o67.n(yj5VarL2, d82.u, ux2Var2);
                    o67.n(Integer.valueOf(iHashCode2), d82.w, ux2Var2);
                    o67.l(ux2Var2);
                    o67.n(fs4VarS2, d82.t, ux2Var2);
                    hw2Var.invoke(ux2Var2, 0);
                    ux2Var2.p(true);
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
            case 2:
                jh6 jh6Var = (jh6) obj;
                List list = (List) hw2Var.invoke(jh6Var, obj2);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj3 = list.get(i);
                    if (obj3 != null && (nh6Var = jh6Var.n) != null && !nh6Var.a(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 3:
                ux2 ux2Var3 = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fs4 fs4VarB = androidx.compose.foundation.layout.b.b(cs4Var, ga0.L, 0.0f, 2);
                    do4 do4VarC3 = ua0.c(xz2.f2564o, false);
                    int iHashCode3 = Long.hashCode(ux2Var3.T);
                    yj5 yj5VarL3 = ux2Var3.l();
                    fs4 fs4VarS3 = uf0.s(ux2Var3, fs4VarB);
                    yz0.c.getClass();
                    ux2Var3.a0();
                    if (ux2Var3.S) {
                        ux2Var3.k(tg3Var);
                    } else {
                        ux2Var3.j0();
                    }
                    o67.n(do4VarC3, d82.v, ux2Var3);
                    o67.n(yj5VarL3, d82.u, ux2Var3);
                    o67.n(Integer.valueOf(iHashCode3), d82.w, ux2Var3);
                    o67.l(ux2Var3);
                    o67.n(fs4VarS3, d82.t, ux2Var3);
                    hw2Var.invoke(ux2Var3, 0);
                    ux2Var3.p(true);
                } else {
                    ux2Var3.Q();
                }
                return f88Var;
            case 4:
                ux2 ux2Var4 = (ux2) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (ux2Var4.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qs7.a(ot7.a(k68.a(es5.g, ux2Var4), 0L, 0L, null, null, 0L, 0L, null, 16744447), hw2Var, ux2Var4, 0);
                } else {
                    ux2Var4.Q();
                }
                return f88Var;
            case 5:
                ((Integer) obj2).getClass();
                nm7.c(hw2Var, (ux2) obj, yo1.Y(1));
                return f88Var;
            default:
                ux2 ux2Var5 = (ux2) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (ux2Var5.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    fs4 fs4VarW = hm3.w(cs4Var, "Container");
                    do4 do4VarC4 = ua0.c(xz2.f2564o, true);
                    int iHashCode4 = Long.hashCode(ux2Var5.T);
                    yj5 yj5VarL4 = ux2Var5.l();
                    fs4 fs4VarS4 = uf0.s(ux2Var5, fs4VarW);
                    yz0.c.getClass();
                    ux2Var5.a0();
                    if (ux2Var5.S) {
                        ux2Var5.k(tg3Var);
                    } else {
                        ux2Var5.j0();
                    }
                    o67.n(do4VarC4, d82.v, ux2Var5);
                    o67.n(yj5VarL4, d82.u, ux2Var5);
                    o67.n(Integer.valueOf(iHashCode4), d82.w, ux2Var5);
                    o67.l(ux2Var5);
                    o67.n(fs4VarS4, d82.t, ux2Var5);
                    hw2Var.invoke(ux2Var5, 0);
                    ux2Var5.p(true);
                } else {
                    ux2Var5.Q();
                }
                return f88Var;
        }
    }

    public /* synthetic */ xd(hw2 hw2Var, byte b) {
        this.m = b;
        this.n = hw2Var;
    }
}
