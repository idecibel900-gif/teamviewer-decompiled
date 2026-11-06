package o;

/* JADX INFO: loaded from: classes.dex */
public final class es7 {
    public static final es7 c = new es7(h67.k(0), h67.k(0));
    public final long a;
    public final long b;

    public es7(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es7)) {
            return false;
        }
        es7 es7Var = (es7) obj;
        return qt7.a(this.a, es7Var.a) && qt7.a(this.b, es7Var.b);
    }

    public final int hashCode() {
        rt7[] rt7VarArr = qt7.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return fx3.h("TextIndent(firstLine=", qt7.d(this.a), ", restLine=", qt7.d(this.b), ")");
    }
}
