package o;

/* JADX INFO: loaded from: classes.dex */
public final class zd7 {
    public final kt5 a;

    public zd7(kt5 kt5Var) {
        this.a = kt5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zd7) && this.a.equals(((zd7) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "SubscriptionPlanData(productDetails=" + this.a + ")";
    }
}
