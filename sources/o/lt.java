package o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class lt extends ac4 implements nt {
    public CharSequence N;
    public ht O;
    public final Rect P;
    public int Q;
    public final /* synthetic */ ot R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt(ot otVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.R = otVar;
        this.P = new Rect();
        this.A = otVar;
        this.J = true;
        this.K.setFocusable(true);
        this.B = new jt(this, (byte) 0);
    }

    @Override // o.nt
    public final CharSequence e() {
        return this.N;
    }

    @Override // o.nt
    public final void h(CharSequence charSequence) {
        this.N = charSequence;
    }

    @Override // o.nt
    public final void l(int i) {
        this.Q = i;
    }

    @Override // o.nt
    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        zs zsVar = this.K;
        boolean zIsShowing = zsVar.isShowing();
        r();
        zsVar.setInputMethodMode(2);
        g();
        o62 o62Var = this.f313o;
        byte b = 1;
        o62Var.setChoiceMode(1);
        o62Var.setTextDirection(i);
        o62Var.setTextAlignment(i2);
        ot otVar = this.R;
        int selectedItemPosition = otVar.getSelectedItemPosition();
        o62 o62Var2 = this.f313o;
        if (zsVar.isShowing() && o62Var2 != null) {
            o62Var2.setListSelectionHidden(false);
            o62Var2.setSelection(selectedItemPosition);
            if (o62Var2.getChoiceMode() != 0) {
                o62Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = otVar.getViewTreeObserver()) == null) {
            return;
        }
        ft ftVar = new ft(this, b);
        viewTreeObserver.addOnGlobalLayoutListener(ftVar);
        zsVar.setOnDismissListener(new kt(this, ftVar));
    }

    @Override // o.ac4, o.nt
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.O = (ht) listAdapter;
    }

    public final void r() {
        int i;
        zs zsVar = this.K;
        Drawable background = zsVar.getBackground();
        ot otVar = this.R;
        Rect rect = otVar.t;
        if (background != null) {
            background.getPadding(rect);
            boolean z = pf8.a;
            i = otVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = otVar.getPaddingLeft();
        int paddingRight = otVar.getPaddingRight();
        int width = otVar.getWidth();
        int i2 = otVar.s;
        if (i2 == -2) {
            int iA = otVar.a(this.O, zsVar.getBackground());
            int i3 = (otVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i2);
        }
        boolean z2 = pf8.a;
        this.r = otVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.q) - this.Q) + i : paddingLeft + this.Q + i;
    }
}
