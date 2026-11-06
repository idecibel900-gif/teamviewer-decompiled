package o;

/* JADX INFO: loaded from: classes.dex */
public final class rd7 {
    public final int a;
    public final int b;

    public rd7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd7)) {
            return false;
        }
        rd7 rd7Var = (rd7) obj;
        return this.a == rd7Var.a && this.b == rd7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return fx3.d(this.a, this.b, "SubscriptionItem(labelResourceId=", ", titleResourceId=", ")");
    }
}
