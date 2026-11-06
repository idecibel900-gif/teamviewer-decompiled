package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import o.f7;
import o.g7;
import o.ip4;
import o.iq4;
import o.jp4;
import o.m7;
import o.pp4;
import o.yt;
import o.zz5;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends yt implements iq4, View.OnClickListener, m7 {
    public boolean A;
    public boolean B;
    public final int C;
    public int D;
    public final int E;
    public pp4 u;
    public CharSequence v;
    public Drawable w;
    public ip4 x;
    public f7 y;
    public g7 z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.A = h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zz5.c, 0, 0);
        this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.E = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.D = -1;
        setSaveEnabled(false);
    }

    @Override // o.iq4
    public final void a(pp4 pp4Var) {
        this.u = pp4Var;
        setIcon(pp4Var.getIcon());
        setTitle(pp4Var.getTitleCondensed());
        setId(pp4Var.a);
        setVisibility(pp4Var.isVisible() ? 0 : 8);
        setEnabled(pp4Var.isEnabled());
        if (pp4Var.hasSubMenu() && this.y == null) {
            this.y = new f7(this);
        }
    }

    @Override // o.m7
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // o.m7
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.u.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // o.iq4
    public pp4 getItemData() {
        return this.u;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void i() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.v);
        if (this.w != null && ((this.u.y & 4) != 4 || (!this.A && !this.B))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.v : null);
        CharSequence charSequence = this.u.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.u.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.u.r;
        if (TextUtils.isEmpty(charSequence2)) {
            setTooltipText(z3 ? null : this.u.e);
        } else {
            setTooltipText(charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ip4 ip4Var = this.x;
        if (ip4Var != null) {
            ip4Var.c(this.u);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A = h();
        i();
    }

    @Override // o.yt, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.D) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.C;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.w == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.w.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f7 f7Var;
        if (this.u.hasSubMenu() && (f7Var = this.y) != null && f7Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.B != z) {
            this.B = z;
            pp4 pp4Var = this.u;
            if (pp4Var != null) {
                jp4 jp4Var = pp4Var.n;
                jp4Var.k = true;
                jp4Var.r(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.w = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.E;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(ip4 ip4Var) {
        this.x = ip4Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.D = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(g7 g7Var) {
        this.z = g7Var;
    }

    public void setTitle(CharSequence charSequence) {
        this.v = charSequence;
        i();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
