package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pf2 {
    public final ArrayList a;
    public final int b;

    public pf2(int i, ArrayList arrayList) {
        this.a = new ArrayList(arrayList);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pf2) {
            return this.a.equals(((pf2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "{ " + this.a + " }";
    }
}
