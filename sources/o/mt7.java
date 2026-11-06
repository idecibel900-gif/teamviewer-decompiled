package o;

/* JADX INFO: loaded from: classes.dex */
public final class mt7 {
    public final String a;
    public String b;
    public boolean c = false;
    public ff5 d = null;

    public mt7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt7)) {
            return false;
        }
        mt7 mt7Var = (mt7) obj;
        return im3.n(this.a, mt7Var.a) && im3.n(this.b, mt7Var.b) && this.c == mt7Var.c && im3.n(this.d, mt7Var.d);
    }

    public final int hashCode() {
        int iF = to7.f(to7.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ff5 ff5Var = this.d;
        return iF + (ff5Var == null ? 0 : ff5Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ")";
    }
}
