package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class lf1 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;

    public /* synthetic */ lf1(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    public void a(c76 c76Var) {
        View view = c76Var.m;
        this.b = view.getLeft();
        this.c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public wc6 b() {
        return new wc6(this.b, this.c);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("<");
                sb.append(this.b);
                sb.append(' ');
                return e41.j(sb, this.c, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ lf1(byte b) {
        this.a = b;
    }
}
