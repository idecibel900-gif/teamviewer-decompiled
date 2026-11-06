package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class js2 implements hs2 {
    public final float[] a;
    public final float[] b;

    public js2(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            hk0.g("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // o.hs2
    public final float a(float f) {
        return et1.H(f, this.b, this.a);
    }

    @Override // o.hs2
    public final float b(float f) {
        return et1.H(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof js2)) {
            return false;
        }
        js2 js2Var = (js2) obj;
        return Arrays.equals(this.a, js2Var.a) && Arrays.equals(this.b, js2Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.a);
        string.getClass();
        String string2 = Arrays.toString(this.b);
        string2.getClass();
        return "FontScaleConverter{fromSpValues=" + string + ", toDpValues=" + string2 + "}";
    }
}
