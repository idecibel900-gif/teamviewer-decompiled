package o;

/* JADX INFO: loaded from: classes2.dex */
public final class lo3 {
    public final js0 a;
    public final js0 b;
    public final js0 c;

    public lo3(js0 js0Var, js0 js0Var2, js0 js0Var3) {
        this.a = js0Var;
        this.b = js0Var2;
        this.c = js0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo3)) {
            return false;
        }
        lo3 lo3Var = (lo3) obj;
        return this.a.equals(lo3Var.a) && this.b.equals(lo3Var.b) && this.c.equals(lo3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
    }
}
