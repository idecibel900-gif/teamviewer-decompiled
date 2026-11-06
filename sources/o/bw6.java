package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bw6 {
    public final int a;
    public final List b;

    public bw6(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw6)) {
            return false;
        }
        bw6 bw6Var = (bw6) obj;
        return this.a == bw6Var.a && this.b.equals(bw6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SettingsSection(sectionTitleId=" + this.a + ", sectionComposables=" + this.b + ")";
    }
}
