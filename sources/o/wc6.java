package o;

/* JADX INFO: loaded from: classes.dex */
public class wc6 {
    public final float a;
    public final float b;

    public wc6(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static float a(wc6 wc6Var, wc6 wc6Var2) {
        return xs1.B(wc6Var.a, wc6Var.b, wc6Var2.a, wc6Var2.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wc6) {
            wc6 wc6Var = (wc6) obj;
            if (this.a == wc6Var.a && this.b == wc6Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "(" + this.a + ',' + this.b + ')';
    }
}
