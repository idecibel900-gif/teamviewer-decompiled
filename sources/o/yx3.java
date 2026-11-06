package o;

/* JADX INFO: loaded from: classes.dex */
public final class yx3 {
    public static final yx3 c = new yx3(0, 0, 127);
    public final int a;
    public final int b;

    public yx3(int i, int i2, int i3) {
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? -1 : i2;
        this.a = i;
        this.b = i2;
    }

    public final bf3 a(boolean z) {
        af3 af3Var;
        int i = this.a;
        zx3 zx3Var = new zx3(i);
        if (i == 0) {
            zx3Var = null;
            af3Var = null;
        } else {
            af3Var = null;
        }
        int i2 = zx3Var != null ? zx3Var.a : 1;
        int i3 = this.b;
        af3 af3Var2 = new af3(i3);
        if (i3 == -1) {
            af3Var2 = af3Var;
        }
        return new bf3(z, 0, true, i2, af3Var2 != null ? af3Var2.a : 1, kd4.f1251o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx3)) {
            return false;
        }
        yx3 yx3Var = (yx3) obj;
        return this.a == yx3Var.a && this.b == yx3Var.b;
    }

    public final int hashCode() {
        return fx3.a(this.b, fx3.a(this.a, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return fx3.h("KeyboardOptions(capitalization=Unspecified, autoCorrectEnabled=null, keyboardType=", zx3.a(this.a), ", imeAction=", af3.a(this.b), ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)");
    }
}
