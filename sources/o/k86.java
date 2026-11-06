package o;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class k86 extends e86 implements rn3 {
    public final ht2 a;

    public k86(ht2 ht2Var) {
        ht2Var.getClass();
        this.a = ht2Var;
    }

    @Override // o.rn3
    public final q76 a(ht2 ht2Var) {
        ht2Var.getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k86) {
            return im3.n(this.a, ((k86) obj).a);
        }
        return false;
    }

    @Override // o.rn3
    public final Collection getAnnotations() {
        return ea2.m;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k86.class.getName() + ": " + this.a;
    }
}
