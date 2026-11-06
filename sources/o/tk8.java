package o;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public class tk8 extends x67 {
    public final /* synthetic */ byte a;
    public final Window b;
    public final Object c;

    public tk8(Window window, l07 l07Var, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = window.getInsetsController();
                this.b = window;
                break;
            default:
                this.b = window;
                this.c = l07Var;
                break;
        }
    }

    public final void A(int i) {
        byte b = this.a;
        Window window = this.b;
        switch (b) {
            case 0:
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
                break;
            default:
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
                break;
        }
    }

    @Override // o.x67
    public final void p() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                for (int i = 1; i <= 512; i <<= 1) {
                    if ((519 & i) != 0) {
                        if (i == 1) {
                            z(4);
                        } else if (i == 2) {
                            z(2);
                        } else if (i == 8) {
                            ((l07) ((l07) obj).n).E();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) obj).hide(519);
                break;
        }
    }

    @Override // o.x67
    public void u(boolean z) {
        byte b = this.a;
        Window window = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    A(16);
                } else {
                    window.clearFlags(134217728);
                    window.addFlags(Integer.MIN_VALUE);
                    z(16);
                }
                break;
            default:
                if (window == null) {
                    WindowInsetsController windowInsetsController = (WindowInsetsController) this.c;
                    if (!z) {
                        windowInsetsController.setSystemBarsAppearance(0, 16);
                    } else {
                        windowInsetsController.setSystemBarsAppearance(16, 16);
                    }
                } else if (!z) {
                    A(16);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                break;
        }
    }

    @Override // o.x67
    public void v(boolean z) {
        byte b = this.a;
        Window window = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    A(8192);
                } else {
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    z(8192);
                }
                break;
            default:
                if (window == null) {
                    WindowInsetsController windowInsetsController = (WindowInsetsController) this.c;
                    if (!z) {
                        windowInsetsController.setSystemBarsAppearance(0, 8);
                    } else {
                        windowInsetsController.setSystemBarsAppearance(8, 8);
                    }
                } else if (!z) {
                    A(8192);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                break;
        }
    }

    @Override // o.x67
    public void w() {
        byte b = this.a;
        Window window = this.b;
        switch (b) {
            case 0:
                window.getDecorView().setTag(356039078, 2);
                A(2048);
                z(4096);
                break;
            default:
                if (window == null) {
                    ((WindowInsetsController) this.c).setSystemBarsBehavior(2);
                } else {
                    window.getDecorView().setTag(356039078, 2);
                    A(2048);
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4096);
                }
                break;
        }
    }

    public void z(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }
}
