package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h58 {
    public ub8 a() {
        return ub8.q;
    }

    public abstract oz3 b();

    public boolean c() {
        return true;
    }

    public h58 d(uz3 uz3Var) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h58)) {
            return false;
        }
        h58 h58Var = (h58) obj;
        return c() == h58Var.c() && a() == h58Var.a() && b().equals(h58Var.b());
    }

    public final int hashCode() {
        int iHashCode = a().hashCode();
        if (p58.m(b())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == ub8.f2197o) {
            return b().toString();
        }
        return a() + " " + b();
    }
}
