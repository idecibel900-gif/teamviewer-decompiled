package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class j24 implements dd5 {
    public final yc4 a;
    public final sd4 b;

    public j24(io3 io3Var) {
        this.a = new yc4(io3Var, z06.K, new di3(null));
        this.b = new sd4(io3Var.a, new ConcurrentHashMap(3, 1.0f, 2), new o48((byte) 19), (byte) 0);
    }

    @Override // o.dd5
    public final boolean a(ht2 ht2Var) {
        ht2Var.getClass();
        return false;
    }

    @Override // o.dd5
    public final void b(ht2 ht2Var, ArrayList arrayList) {
        ht2Var.getClass();
        arrayList.add(c(ht2Var));
    }

    public final i24 c(ht2 ht2Var) throws Throwable {
        ht2Var.getClass();
        Object objInvoke = this.b.invoke(new td4(ht2Var, new e3((byte) 16, this, new k86(ht2Var), false)));
        if (objInvoke != null) {
            return (i24) objInvoke;
        }
        sd4.c(3);
        throw null;
    }

    @Override // o.dd5
    public final Collection f(ht2 ht2Var, Function1 function1) {
        ht2Var.getClass();
        List list = (List) c(ht2Var).w.a();
        return list == null ? ea2.m : list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((io3) this.a.m).h;
    }
}
