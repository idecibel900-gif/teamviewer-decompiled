package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class tc6 implements Serializable {
    public final Object m;

    public /* synthetic */ tc6(Object obj) {
        this.m = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof sc6) {
            return ((sc6) obj).m;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tc6) {
            return im3.n(this.m, ((tc6) obj).m);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.m;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.m;
        if (obj instanceof sc6) {
            return ((sc6) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
