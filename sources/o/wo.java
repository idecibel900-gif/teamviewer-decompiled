package o;

/* JADX INFO: loaded from: classes.dex */
public final class wo {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public wo(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        li3.a("Reversed range is not supported");
    }

    public static wo a(wo woVar, to toVar, int i, int i2) {
        Object obj = toVar;
        if ((i2 & 1) != 0) {
            obj = woVar.a;
        }
        int i3 = woVar.b;
        if ((i2 & 4) != 0) {
            i = woVar.c;
        }
        return new wo(obj, i3, i, woVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo)) {
            return false;
        }
        wo woVar = (wo) obj;
        return im3.n(this.a, woVar.a) && this.b == woVar.b && this.c == woVar.c && im3.n(this.d, woVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + fx3.a(this.c, fx3.a(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public wo(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }
}
