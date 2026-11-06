package o;

/* JADX INFO: loaded from: classes2.dex */
public final class bg2 {
    public final Object a;
    public final int b;

    public bg2(int i, Object obj) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bg2)) {
            return false;
        }
        bg2 bg2Var = (bg2) obj;
        return this.a == bg2Var.a && this.b == bg2Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
