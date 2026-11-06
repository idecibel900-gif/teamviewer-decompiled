package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class bf1 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof bf1) {
            return this.a.equals(((bf1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ")";
    }
}
