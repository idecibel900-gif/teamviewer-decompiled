package o;

/* JADX INFO: loaded from: classes.dex */
public final class ju4 {
    public final long a;
    public final long b;
    public final boolean c;

    public ju4(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final ju4 a(ju4 ju4Var) {
        return new ju4(t65.e(this.a, ju4Var.a), Math.max(this.b, ju4Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju4)) {
            return false;
        }
        ju4 ju4Var = (ju4) obj;
        return t65.b(this.a, ju4Var.a) && this.b == ju4Var.b && this.c == ju4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fx3.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + t65.g(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ")";
    }
}
