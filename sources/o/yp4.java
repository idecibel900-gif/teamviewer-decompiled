package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public class yp4 {
    public final Context a;
    public final jp4 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public fq4 h;
    public wp4 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final xp4 k = new xp4(this);

    public yp4(Context context, jp4 jp4Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = jp4Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final wp4 a() {
        wp4 r87Var = this.i;
        if (r87Var == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iMin = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (iMin >= dimensionPixelSize) {
                r87Var = new fm0(context2, this.e, this.d, this.c);
            } else {
                r87Var = new r87(context2, this.b, this.e, this.d, this.c);
            }
            r87Var.n(this.b);
            r87Var.t(this.k);
            r87Var.p(this.e);
            r87Var.k(this.h);
            r87Var.q(this.g);
            r87Var.r(this.f);
            this.i = r87Var;
        }
        return r87Var;
    }

    public final boolean b() {
        wp4 wp4Var = this.i;
        return wp4Var != null && wp4Var.a();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        wp4 wp4VarA = a();
        wp4VarA.u(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            wp4VarA.s(i);
            wp4VarA.v(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            wp4VarA.m = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        wp4VarA.g();
    }
}
