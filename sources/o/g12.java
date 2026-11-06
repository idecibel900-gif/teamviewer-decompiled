package o;

/* JADX INFO: loaded from: classes.dex */
public final class g12 implements j12 {
    public final int a;

    public /* synthetic */ g12(int i) {
        this.a = i;
    }

    public static void a(int i) {
        if (i > 0) {
            return;
        }
        hk0.g("px must be > 0.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g12) {
            return this.a == ((g12) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fx3.f(this.a, "Pixels(px=", ")");
    }
}
