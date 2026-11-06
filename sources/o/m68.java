package o;

/* JADX INFO: loaded from: classes2.dex */
public final class m68 implements Comparable {
    public final byte m;

    public /* synthetic */ m68(byte b) {
        this.m = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return im3.t(this.m & 255, ((m68) obj).m & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m68) {
            return this.m == ((m68) obj).m;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.m);
    }

    public final String toString() {
        return String.valueOf(this.m & 255);
    }
}
