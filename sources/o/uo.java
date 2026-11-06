package o;

/* JADX INFO: loaded from: classes.dex */
public final class uo {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public /* synthetic */ uo(int i, int i2, int i3, Object obj, String str) {
        this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
    }

    public final wo a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            li3.b("Item.end should be set first");
        }
        return new wo(this.a, this.b, i, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        return im3.n(this.a, uoVar.a) && this.b == uoVar.b && this.c == uoVar.c && im3.n(this.d, uoVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + fx3.a(this.c, fx3.a(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public uo(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
