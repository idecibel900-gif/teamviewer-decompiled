package o;

/* JADX INFO: loaded from: classes.dex */
public final class oz {
    public final int a;

    public /* synthetic */ oz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oz) {
            return this.a == ((oz) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fx3.f(this.a, "AutoClearFocusBehavior(value=", ")");
    }
}
