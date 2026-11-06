package o;

/* JADX INFO: loaded from: classes.dex */
public final class jt7 {
    public final long a;
    public final long b;

    public jt7(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt7)) {
            return false;
        }
        jt7 jt7Var = (jt7) obj;
        long j = jt7Var.a;
        int i = rv0.i;
        return z68.a(this.a, j) && z68.a(this.b, jt7Var.b);
    }

    public final int hashCode() {
        int i = rv0.i;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return fx3.h("SelectionColors(selectionHandleColor=", rv0.h(this.a), ", selectionBackgroundColor=", rv0.h(this.b), ")");
    }
}
