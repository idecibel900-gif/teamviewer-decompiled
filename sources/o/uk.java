package o;

/* JADX INFO: loaded from: classes.dex */
public final class uk {
    public pw6 a;
    public long b;
    public j04 c;
    public float d;

    public uk(pw6 pw6Var, long j, j04 j04Var, float f, kw6 kw6Var) {
        this.a = pw6Var;
        this.b = j;
        this.c = j04Var;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk)) {
            return false;
        }
        uk ukVar = (uk) obj;
        return im3.n(this.a, ukVar.a) && y07.a(this.b, ukVar.b) && this.c == ukVar.c && Float.compare(this.d, ukVar.d) == 0 && im3.n(null, null);
    }

    public final int hashCode() {
        return e41.e(this.d, (this.c.hashCode() + fx3.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
    }

    public final String toString() {
        return "ShadowKey(shape=" + this.a + ", size=" + y07.d(this.b) + ", layoutDirection=" + this.c + ", density=" + this.d + ", shadow=" + ((Object) null) + ")";
    }
}
