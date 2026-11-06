package o;

/* JADX INFO: loaded from: classes.dex */
public final class yh4 {
    public final int a;

    public /* synthetic */ yh4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yh4) {
            return this.a == ((yh4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fx3.f(this.a, "RawRes(resId=", ")");
    }
}
