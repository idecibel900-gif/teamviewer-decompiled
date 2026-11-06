package o;

import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class vk8 extends tk8 {
    @Override // o.tk8, o.x67
    public final void u(boolean z) {
        ((WindowInsetsController) this.c).setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // o.tk8, o.x67
    public final void v(boolean z) {
        ((WindowInsetsController) this.c).setSystemBarsAppearance(z ? 8 : 0, 8);
    }

    @Override // o.tk8, o.x67
    public final void w() {
        ((WindowInsetsController) this.c).setSystemBarsBehavior(2);
    }
}
