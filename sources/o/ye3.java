package o;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class ye3 {
    public final Resources.Theme a;
    public final int b;

    public ye3(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye3)) {
            return false;
        }
        ye3 ye3Var = (ye3) obj;
        return im3.n(this.a, ye3Var.a) && this.b == ye3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(theme=" + this.a + ", id=" + this.b + ")";
    }
}
