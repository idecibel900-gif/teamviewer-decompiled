package o;

/* JADX INFO: loaded from: classes2.dex */
public final class pt5 {
    public static final pt5 b = new pt5(new hu0());
    public final hu0 a;

    public pt5(hu0 hu0Var) {
        this.a = hu0Var;
        if (Float.isNaN(0.0f)) {
            hk0.g("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pt5) && this.a.equals(((pt5) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() + (Float.hashCode(0.0f) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.a + ", steps=0)";
    }
}
