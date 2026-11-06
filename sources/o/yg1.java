package o;

/* JADX INFO: loaded from: classes.dex */
public final class yg1 {
    public long a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg1)) {
            return false;
        }
        yg1 yg1Var = (yg1) obj;
        return this.a == yg1Var.a && Float.compare(this.b, yg1Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.a + ", dataPoint=" + this.b + ")";
    }
}
