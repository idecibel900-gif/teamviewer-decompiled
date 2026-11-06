package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class np5 {
    public final boolean a;
    public final ArrayList b;

    public np5(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np5)) {
            return false;
        }
        np5 np5Var = (np5) obj;
        return this.a == np5Var.a && this.b.equals(np5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Posture(isTabletop=" + this.a + ", hinges=[" + lv0.t0(this.b, ", ", null, null, null, 62) + "])";
    }
}
