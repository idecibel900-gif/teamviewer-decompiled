package o;

/* JADX INFO: loaded from: classes.dex */
public final class rn5 {
    public final int a;

    public /* synthetic */ rn5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rn5) {
            return this.a == ((rn5) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fx3.f(this.a, "PointerKeyboardModifiers(packedValue=", ")");
    }
}
