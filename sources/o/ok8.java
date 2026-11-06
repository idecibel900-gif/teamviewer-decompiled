package o;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ok8 extends nk8 {
    public ok8(sk8 sk8Var, WindowInsets windowInsets) {
        super(sk8Var, windowInsets);
    }

    @Override // o.hk8, o.pk8
    public List<Rect> f(int i) {
        return this.c.getBoundingRects(rk8.a(i));
    }

    @Override // o.hk8, o.pk8
    public List<Rect> g(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(rk8.a(i));
    }

    @Override // o.hk8, o.pk8
    public void q() {
    }

    public ok8(sk8 sk8Var, ok8 ok8Var) {
        super(sk8Var, ok8Var);
    }
}
