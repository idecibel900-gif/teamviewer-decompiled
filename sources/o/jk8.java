package o;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class jk8 extends ik8 {
    public jk8(sk8 sk8Var, WindowInsets windowInsets) {
        super(sk8Var, windowInsets);
    }

    @Override // o.pk8
    public sk8 a() {
        return sk8.g(this.c.consumeDisplayCutout(), null);
    }

    @Override // o.hk8, o.pk8
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk8)) {
            return false;
        }
        jk8 jk8Var = (jk8) obj;
        return Objects.equals(this.c, jk8Var.c) && Objects.equals(this.g, jk8Var.g) && hk8.M(this.h, jk8Var.h);
    }

    @Override // o.pk8
    public h22 h() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new h22(displayCutout);
    }

    @Override // o.pk8
    public int hashCode() {
        return this.c.hashCode();
    }

    public jk8(sk8 sk8Var, jk8 jk8Var) {
        super(sk8Var, jk8Var);
    }
}
