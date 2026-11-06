package o;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class pk8 {
    public static final sk8 b;
    public final sk8 a;

    static {
        gk8 ak8Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            ak8Var = new fk8();
        } else if (i >= 35) {
            ak8Var = new ek8();
        } else if (i >= 34) {
            ak8Var = new dk8();
        } else if (i >= 31) {
            ak8Var = new ck8();
        } else if (i >= 30) {
            ak8Var = new bk8();
        } else {
            ak8Var = i >= 29 ? new ak8() : new yj8();
        }
        b = ak8Var.b().a.a().a.b().a.c();
    }

    public pk8(sk8 sk8Var) {
        this.a = sk8Var;
    }

    public void A(int i) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public sk8 a() {
        return this.a;
    }

    public sk8 b() {
        return this.a;
    }

    public sk8 c() {
        return this.a;
    }

    public void d(View view) {
    }

    public void e(sk8 sk8Var) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk8)) {
            return false;
        }
        pk8 pk8Var = (pk8) obj;
        return t() == pk8Var.t() && s() == pk8Var.s() && Objects.equals(n(), pk8Var.n()) && Objects.equals(l(), pk8Var.l()) && Objects.equals(h(), pk8Var.h());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public h22 h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public nj3 i(int i) {
        return nj3.e;
    }

    public nj3 j(int i) {
        if ((i & 8) == 0) {
            return nj3.e;
        }
        hk0.g("Unable to query the maximum insets for IME");
        return null;
    }

    public nj3 k() {
        return n();
    }

    public nj3 l() {
        return nj3.e;
    }

    public nj3 m() {
        return n();
    }

    public nj3 n() {
        return nj3.e;
    }

    public nj3 o() {
        return n();
    }

    public void p(View view) {
    }

    public void q() {
    }

    public sk8 r(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void v(l22 l22Var) {
    }

    public void w(nj3[] nj3VarArr) {
    }

    public void x(nj3 nj3Var) {
    }

    public void y(sk8 sk8Var) {
    }

    public void z(nj3 nj3Var) {
    }
}
