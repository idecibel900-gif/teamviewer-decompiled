package o;

import android.net.NetworkRequest;

/* JADX INFO: loaded from: classes.dex */
public final class a35 {
    public static final String b = we4.i("NetworkRequestCompat");
    public final Object a;

    public a35(NetworkRequest networkRequest) {
        this.a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a35) && im3.n(this.a, ((a35) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.a + ")";
    }
}
