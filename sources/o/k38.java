package o;

/* JADX INFO: loaded from: classes.dex */
public final class k38 {
    public final int a;
    public final String b;
    public final String c;

    public k38(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k38)) {
            return false;
        }
        k38 k38Var = (k38) obj;
        return this.a == k38Var.a && this.b.equals(k38Var.b) && this.c.equals(k38Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + to7.e(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request(sessionId=");
        sb.append(this.a);
        sb.append(", encryptedSessionKey=");
        sb.append(this.b);
        sb.append(", encryptedPayload=");
        return e41.l(sb, this.c, ")");
    }
}
