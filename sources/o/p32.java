package o;

/* JADX INFO: loaded from: classes.dex */
public final class p32 implements ex5 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f1700o = new Object();
    public volatile ex5 m;
    public volatile Object n;

    public static ex5 a(ex5 ex5Var) {
        if (ex5Var instanceof p32) {
            return ex5Var;
        }
        p32 p32Var = new p32();
        p32Var.n = f1700o;
        p32Var.m = ex5Var;
        return p32Var;
    }

    @Override // o.ex5
    public final Object get() {
        Object obj;
        Object obj2 = this.n;
        Object obj3 = f1700o;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.n;
                if (obj == obj3) {
                    obj = this.m.get();
                    Object obj4 = this.n;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.n = obj;
                    this.m = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
