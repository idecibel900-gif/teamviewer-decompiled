package o;

/* JADX INFO: loaded from: classes.dex */
public final class u38 {
    public final int a;
    public final String b;

    public u38(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u38)) {
            return false;
        }
        u38 u38Var = (u38) obj;
        return this.a == u38Var.a && this.b.equals(u38Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return e41.h("Response(sessionId=", ", token=", this.a, this.b, ")");
    }
}
