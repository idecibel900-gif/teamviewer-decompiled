package o;

/* JADX INFO: loaded from: classes2.dex */
public final class gu3 extends hu3 {
    public final ns0 a;

    public gu3(ns0 ns0Var) {
        this.a = ns0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gu3) && this.a.equals(((gu3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.a + ')';
    }
}
