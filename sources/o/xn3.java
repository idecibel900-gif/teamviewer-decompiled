package o;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class xn3 {
    public final c65 a;
    public final Collection b;
    public final boolean c;

    public xn3(c65 c65Var, Collection collection) {
        this(c65Var, collection, c65Var.a == b65.f402o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn3)) {
            return false;
        }
        xn3 xn3Var = (xn3) obj;
        return im3.n(this.a, xn3Var.a) && im3.n(this.b, xn3Var.b) && this.c == xn3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.a + ", qualifierApplicabilityTypes=" + this.b + ", definitelyNotNull=" + this.c + ')';
    }

    public xn3(c65 c65Var, Collection collection, boolean z) {
        collection.getClass();
        this.a = c65Var;
        this.b = collection;
        this.c = z;
    }
}
