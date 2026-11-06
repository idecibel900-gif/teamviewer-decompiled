package o;

/* JADX INFO: loaded from: classes.dex */
public final class e87 implements rl2 {
    public final float a;
    public final float b;
    public final Object c;

    public e87(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e87) {
            e87 e87Var = (e87) obj;
            if (e87Var.a == this.a && e87Var.b == this.b && im3.n(e87Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.rl2, o.jo
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final l07 a(yn1 yn1Var) {
        Object obj = this.c;
        return new l07(this.a, this.b, obj == null ? null : (qo) yn1Var.b().invoke(obj));
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + e41.e(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ e87(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
