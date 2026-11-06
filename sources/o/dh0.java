package o;

/* JADX INFO: loaded from: classes.dex */
public final class dh0 {
    public final ak7 a;

    public dh0(ak7 ak7Var) {
        ak7Var.getClass();
        this.a = ak7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh0) && im3.n(this.a, ((dh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResumeSavedAuthCommand(command=" + this.a + ")";
    }
}
