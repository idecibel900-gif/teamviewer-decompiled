package o;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class gq2 {
    public final lq2 a;
    public final AndroidComposeView b;
    public final kx4 c;
    public final kx4 d;
    public boolean e;

    public gq2(lq2 lq2Var, AndroidComposeView androidComposeView) {
        this.a = lq2Var;
        this.b = androidComposeView;
        kx4 kx4Var = ui6.a;
        this.c = new kx4();
        this.d = new kx4();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        ax1 ax1Var = new ax1(0, this, gq2.class, "invalidateNodes", "invalidateNodes()V", 0, (byte) 4);
        zw4 zw4Var = this.b.C0;
        if (zw4Var.g(ax1Var) < 0) {
            zw4Var.a(ax1Var);
        }
        this.e = true;
    }
}
