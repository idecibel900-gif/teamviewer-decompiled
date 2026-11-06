package o;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ez2 extends ap4 {
    public static final /* synthetic */ fw3[] d;
    public final d0 b;
    public final vd4 c;

    static {
        x86 x86Var = w86.a;
        d = new fw3[]{x86Var.g(new gu5(x86Var.b(ez2.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public ez2(xd4 xd4Var, d0 d0Var) {
        xd4Var.getClass();
        this.b = d0Var;
        this.c = new vd4(xd4Var, new a3(this, (byte) 15));
    }

    @Override // o.ap4, o.zo4
    public final Collection a(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        List list = (List) i67.s(this.c, d[0]);
        if (list.isEmpty()) {
            return ea2.m;
        }
        u17 u17Var = new u17();
        for (Object obj : list) {
            if ((obj instanceof c07) && im3.n(((c07) obj).getName(), sy4Var)) {
                u17Var.add(obj);
            }
        }
        return u17Var;
    }

    @Override // o.ap4, o.zo4
    public final Collection d(sy4 sy4Var, t35 t35Var) {
        sy4Var.getClass();
        List list = (List) i67.s(this.c, d[0]);
        if (list.isEmpty()) {
            return ea2.m;
        }
        u17 u17Var = new u17();
        for (Object obj : list) {
            if ((obj instanceof bu5) && im3.n(((bu5) obj).getName(), sy4Var)) {
                u17Var.add(obj);
            }
        }
        return u17Var;
    }

    @Override // o.ap4, o.zo4
    public final Collection e(no1 no1Var, Function1 function1) {
        no1Var.getClass();
        if (!no1Var.a(no1.n.b)) {
            return ea2.m;
        }
        return (List) i67.s(this.c, d[0]);
    }

    public List h() {
        sy4 sy4Var = eu0.e;
        ol5 ol5Var = s67.h;
        d0 d0Var = this.b;
        c07 c07VarN0 = c07.N0(d0Var, sy4Var, 1, ol5Var);
        v14 v14VarQ0 = d0Var.q0();
        g07 g07VarE = bp1.e(d0Var).e();
        as4 as4Var = as4.p;
        cp1 cp1Var = dp1.c;
        ea2 ea2Var = ea2.m;
        c07VarN0.H0(null, v14VarQ0, ea2Var, ea2Var, ea2Var, g07VarE, as4Var, cp1Var);
        return qf0.K(c07VarN0);
    }
}
