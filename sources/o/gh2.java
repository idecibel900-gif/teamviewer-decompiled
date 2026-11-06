package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class gh2 extends y18 {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ gh2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // o.r18
    public final void c(s18 s18Var) {
        switch (this.a) {
            case 0:
                View view = (View) this.b;
                qf8 qf8Var = of8.a;
                qf8Var.n(view, 1.0f);
                qf8Var.getClass();
                s18Var.v(this);
                break;
            case 1:
                ((s18) this.b).x();
                s18Var.v(this);
                break;
            default:
                c00 c00Var = (c00) this.b;
                int i = c00Var.K - 1;
                c00Var.K = i;
                if (i == 0) {
                    c00Var.L = false;
                    c00Var.m();
                }
                s18Var.v(this);
                break;
        }
    }

    @Override // o.y18, o.r18
    public void e(s18 s18Var) {
        switch (this.a) {
            case 2:
                c00 c00Var = (c00) this.b;
                if (!c00Var.L) {
                    c00Var.E();
                    c00Var.L = true;
                }
                break;
        }
    }

    public /* synthetic */ gh2() {
        this.a = (byte) 2;
    }
}
