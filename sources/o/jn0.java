package o;

/* JADX INFO: loaded from: classes2.dex */
public final class jn0 {
    public static final in0 b = new in0();
    public final Object a;

    public /* synthetic */ jn0(Object obj) {
        this.a = obj;
    }

    public static final Object a(Object obj) {
        if (obj instanceof in0) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jn0) {
            return im3.n(this.a, ((jn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof hn0) {
            return ((hn0) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
