package o;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kc7 extends td2 {
    public final td2 a;
    public boolean b;
    public final ThreadLocal c = ThreadLocal.withInitial(new sn0((byte) 7));

    public kc7(td2 td2Var) {
        this.a = td2Var;
        this.b = td2Var.f();
    }

    @Override // o.td2
    public boolean b(o82 o82Var, o82 o82Var2) {
        return g(o82Var, o82Var2);
    }

    @Override // o.td2
    public final boolean c(o82 o82Var, q54 q54Var) {
        return g(o82Var, q54Var);
    }

    @Override // o.td2
    public void e() {
        this.c.remove();
        this.a.e();
    }

    @Override // o.td2
    public final boolean f() {
        return this.b;
    }

    public boolean g(o82 o82Var, x35 x35Var) {
        return false;
    }

    public final boolean h(final o82 o82Var, x35 x35Var) {
        return ((Boolean) ((Map) ((Map) this.c.get()).computeIfAbsent(o82Var, new k82((byte) 4))).computeIfAbsent(x35Var, new Function() { // from class: o.ec7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(this.a.a.d(o82Var, (x35) obj));
            }
        })).booleanValue();
    }
}
