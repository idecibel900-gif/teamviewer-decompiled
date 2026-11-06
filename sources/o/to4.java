package o;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class to4 implements Function0 {
    public final vo4 m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qv5 f2130o;

    public to4(vo4 vo4Var, boolean z, qv5 qv5Var) {
        this.m = vo4Var;
        this.n = z;
        this.f2130o = qv5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        List listP0;
        vo4 vo4Var = this.m;
        fp1 fp1Var = vo4Var.a;
        sx3 sx3VarA = vo4Var.a((fi1) fp1Var.c);
        if (sx3VarA != null) {
            io.sentry.android.replay.screenshot.k kVar = (io.sentry.android.replay.screenshot.k) fp1Var.a;
            boolean z = this.n;
            qv5 qv5Var = this.f2130o;
            listP0 = z ? lv0.P0(((ap) kVar.e).s(sx3VarA, qv5Var)) : lv0.P0(((ap) kVar.e).b(sx3VarA, qv5Var));
        } else {
            listP0 = null;
        }
        return listP0 == null ? ea2.m : listP0;
    }
}
