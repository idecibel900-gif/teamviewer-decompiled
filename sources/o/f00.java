package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f00 extends j50 {
    public final ArrayList a;

    public f00(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j50)) {
            return false;
        }
        return this.a.equals(((f00) ((j50) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
