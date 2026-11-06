package o;

import android.content.Context;
import android.view.View;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class h7 extends yp4 {
    public final /* synthetic */ byte l = 0;
    public final /* synthetic */ l7 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(l7 l7Var, Context context, gd7 gd7Var, View view) {
        super(context, gd7Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = l7Var;
        if ((gd7Var.A.x & 32) != 32) {
            View view2 = l7Var.v;
            this.e = view2 == null ? (View) l7Var.t : view2;
        }
        df6 df6Var = l7Var.J;
        this.h = df6Var;
        wp4 wp4Var = this.i;
        if (wp4Var != null) {
            wp4Var.k(df6Var);
        }
    }

    @Override // o.yp4
    public final void c() {
        byte b = this.l;
        l7 l7Var = this.m;
        switch (b) {
            case 0:
                l7Var.G = null;
                l7Var.K = 0;
                super.c();
                break;
            default:
                jp4 jp4Var = l7Var.f1334o;
                if (jp4Var != null) {
                    jp4Var.c(true);
                }
                l7Var.F = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(l7 l7Var, Context context, jp4 jp4Var, View view) {
        super(context, jp4Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = l7Var;
        this.f = 8388613;
        df6 df6Var = l7Var.J;
        this.h = df6Var;
        wp4 wp4Var = this.i;
        if (wp4Var != null) {
            wp4Var.k(df6Var);
        }
    }
}
