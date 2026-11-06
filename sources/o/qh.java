package o;

/* JADX INFO: loaded from: classes.dex */
public final class qh {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qh) {
            return this.a == ((qh) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fx3.f(this.a, "AndroidContentDataType(androidAutofillType=", ")");
    }
}
