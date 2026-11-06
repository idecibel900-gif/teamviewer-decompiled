package o;

/* JADX INFO: loaded from: classes2.dex */
public final class g78 implements Comparable {
    public final short m;

    public /* synthetic */ g78(short s) {
        this.m = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return im3.t(this.m & 65535, ((g78) obj).m & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g78) {
            return this.m == ((g78) obj).m;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.m);
    }

    public final String toString() {
        return String.valueOf(this.m & 65535);
    }
}
