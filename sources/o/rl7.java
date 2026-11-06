package o;

/* JADX INFO: loaded from: classes.dex */
public final class rl7 {
    public final zk7 a;
    public final pw6 b;

    public rl7(zk7 zk7Var, pw6 pw6Var) {
        pw6Var.getClass();
        this.a = zk7Var;
        this.b = pw6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl7)) {
            return false;
        }
        rl7 rl7Var = (rl7) obj;
        return this.a.equals(rl7Var.a) && im3.n(this.b, rl7Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TVSnackbarLeadingIconData(image=" + this.a + ", clipShape=" + this.b + ", applyColorFilter=false)";
    }
}
