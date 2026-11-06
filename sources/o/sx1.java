package o;

/* JADX INFO: loaded from: classes.dex */
public final class sx1 implements tx1 {
    public final l33 a;

    public sx1(l33 l33Var) {
        this.a = l33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sx1) && this.a.equals(((sx1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Group(groupInfo=" + this.a + ")";
    }
}
