package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ye5 {
    public final int a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;
    public final List g;

    public ye5(int i, float f, int i2, float f2, float f3, float f4, List list) {
        this.a = i;
        this.b = f;
        this.c = i2;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye5)) {
            return false;
        }
        ye5 ye5Var = (ye5) obj;
        return this.a == ye5Var.a && w32.b(this.b, ye5Var.b) && this.c == ye5Var.c && w32.b(this.d, ye5Var.d) && w32.b(this.e, ye5Var.e) && w32.b(this.f, ye5Var.f) && im3.n(this.g, ye5Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + e41.e(this.f, e41.e(this.e, e41.e(this.d, (e41.e(this.b, this.a * 31, 31) + this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strC = w32.c(this.b);
        String strC2 = w32.c(this.d);
        String strC3 = w32.c(this.e);
        String strC4 = w32.c(this.f);
        int size = this.g.size();
        StringBuilder sb = new StringBuilder("PaneScaffoldDirective(maxHorizontalPartitions=");
        sb.append(this.a);
        sb.append(", horizontalPartitionSpacerSize=");
        sb.append(strC);
        sb.append(", maxVerticalPartitions=");
        sb.append(this.c);
        sb.append(", verticalPartitionSpacerSize=");
        sb.append(strC2);
        sb.append(", defaultPanePreferredWidth=");
        e41.t(sb, strC3, ", defaultPanePreferredHeight=", strC4, ", number of excluded bounds=");
        return to7.l(sb, size, ")");
    }
}
