package o;

/* JADX INFO: loaded from: classes.dex */
public final class pd5 implements nd5 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public pd5(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            ii3.a("Padding must be non-negative");
        }
    }

    @Override // o.nd5
    public final float a(j04 j04Var) {
        return j04Var == j04.m ? this.a : this.c;
    }

    @Override // o.nd5
    public final float b(j04 j04Var) {
        return j04Var == j04.m ? this.c : this.a;
    }

    @Override // o.nd5
    public final float c() {
        return this.d;
    }

    @Override // o.nd5
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pd5)) {
            return false;
        }
        pd5 pd5Var = (pd5) obj;
        return w32.b(this.a, pd5Var.a) && w32.b(this.b, pd5Var.b) && w32.b(this.c, pd5Var.c) && w32.b(this.d, pd5Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + e41.e(this.c, e41.e(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String strC = w32.c(this.a);
        String strC2 = w32.c(this.b);
        return e41.m(e41.o("PaddingValues(start=", strC, ", top=", strC2, ", end="), w32.c(this.c), ", bottom=", w32.c(this.d), ")");
    }
}
