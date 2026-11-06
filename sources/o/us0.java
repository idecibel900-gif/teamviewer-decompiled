package o;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class us0 {
    public final int a;
    public final Method b;

    public us0(Method method, int i) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us0)) {
            return false;
        }
        us0 us0Var = (us0) obj;
        return this.a == us0Var.a && this.b.getName().equals(us0Var.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
