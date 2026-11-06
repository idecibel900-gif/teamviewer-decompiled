package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cw6 {
    public final int a;
    public final ArrayList b;

    public cw6(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw6)) {
            return false;
        }
        cw6 cw6Var = (cw6) obj;
        return this.a == cw6Var.a && this.b.equals(cw6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SettingsSection(sectionTitleId=" + this.a + ", sectionComposables=" + this.b + ")";
    }
}
