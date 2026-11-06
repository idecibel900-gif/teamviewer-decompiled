package o;

/* JADX INFO: loaded from: classes.dex */
public final class wm7 {
    public final float a;
    public final float b;
    public final float c;

    public wm7(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm7)) {
            return false;
        }
        wm7 wm7Var = (wm7) obj;
        return w32.b(this.a, wm7Var.a) && w32.b(this.b, wm7Var.b) && w32.b(this.c, wm7Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + e41.e(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        float f = this.a;
        String strC = w32.c(f);
        float f2 = this.b;
        String strC2 = w32.c(f + f2);
        return e41.m(e41.o("TabPosition(left=", strC, ", right=", strC2, ", width="), w32.c(f2), ", contentWidth=", w32.c(this.c), ")");
    }
}
