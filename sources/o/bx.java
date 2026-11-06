package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class bx extends u51 {
    public final Function1 b;

    public bx(List list, Function1 function1) {
        super(list);
        this.b = function1;
    }

    @Override // o.u51
    public final oz3 a(ps4 ps4Var) {
        ys0 ys0VarA;
        ps4Var.getClass();
        oz3 oz3Var = (oz3) this.b.invoke(ps4Var);
        if (!wy3.y(oz3Var) && (((ys0VarA = oz3Var.o0().a()) == null || wy3.r(ys0VarA) == null) && !wy3.B(oz3Var, s87.W.i()) && !wy3.B(oz3Var, s87.X.i()) && !wy3.B(oz3Var, s87.Y.i()))) {
            wy3.B(oz3Var, s87.Z.i());
        }
        return oz3Var;
    }
}
