package o;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lh6 implements kh6 {
    public static final a65 q = new a65((byte) 20, (Object) new qo2(18), (Object) new le5((byte) 20), false);
    public final Map m;
    public final jx4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public nh6 f1363o;
    public final y46 p;

    public lh6(Map map) {
        this.m = map;
        long[] jArr = ti6.a;
        this.n = new jx4();
        this.p = new y46((Object) this, (byte) 7);
    }

    @Override // o.kh6
    public final void b(Object obj) {
        if (this.n.k(obj) == null) {
            this.m.remove(obj);
        }
    }

    @Override // o.kh6
    public final void c(Object obj, yy0 yy0Var, ux2 ux2Var, int i) {
        int i2;
        ux2Var.Y(533563200);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (ux2Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var.h(yy0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var.h(this) ? 256 : 128;
        }
        if (ux2Var.N(i2 & 1, (i2 & 147) != 146)) {
            ux2Var.Z(obj);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (objK == awVar) {
                y46 y46Var = this.p;
                if (!((Boolean) y46Var.invoke(obj)).booleanValue()) {
                    an4.q(obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.", "Type of the key ");
                    return;
                }
                Map map = (Map) this.m.get(obj);
                h72 h72Var = ph6.a;
                qh6 qh6Var = new qh6(new oh6(map, y46Var));
                ux2Var.g0(qh6Var);
                objK = qh6Var;
            }
            qh6 qh6Var2 = (qh6) objK;
            j51.m(new dx5[]{ph6.a.a(qh6Var2), hd4.a.a(qh6Var2)}, yy0Var, ux2Var, (i2 & 112) | 8);
            boolean zH = ux2Var.h(this) | ux2Var.h(obj) | ux2Var.h(qh6Var2);
            Object objK2 = ux2Var.K();
            if (zH || objK2 == awVar) {
                objK2 = new xn5(this, obj, qh6Var2, b);
                ux2Var.g0(objK2);
            }
            ck3.e(f88.a, (Function1) objK2, ux2Var);
            if (ux2Var.y && ux2Var.G.i == ux2Var.z) {
                ux2Var.z = -1;
                ux2Var.y = false;
            }
            ux2Var.p(false);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new ci((Object) this, obj, (Object) yy0Var, i, (byte) 18);
        }
    }
}
