package o;

/* JADX INFO: loaded from: classes.dex */
public final class vt5 {
    public final String a;

    public vt5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vt5) && im3.n(this.a, ((vt5) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(Integer.MAX_VALUE) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return fx3.g("PromotionCardTitleData(text=", this.a, ", maxLines=2147483647)");
    }
}
