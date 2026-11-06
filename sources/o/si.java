package o;

/* JADX INFO: loaded from: classes.dex */
public final class si implements im5 {
    public final int m;

    public si(int i) {
        this.m = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si) && this.m == ((si) obj).m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m);
    }

    public final String toString() {
        return fx3.f(this.m, "AndroidFontResolveInterceptor(fontWeightAdjustment=", ")");
    }
}
