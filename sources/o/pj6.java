package o;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class pj6 extends FrameLayout {
    public Drawable m;
    public Rect n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Rect f1739o;
    public boolean p;
    public boolean q;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect = this.f1739o;
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.n == null || this.m == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.p) {
            rect.set(0, 0, width, this.n.top);
            this.m.setBounds(rect);
            this.m.draw(canvas);
        }
        if (this.q) {
            rect.set(0, height - this.n.bottom, width, height);
            this.m.setBounds(rect);
            this.m.draw(canvas);
        }
        Rect rect2 = this.n;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.m.setBounds(rect);
        this.m.draw(canvas);
        Rect rect3 = this.n;
        rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
        this.m.setBounds(rect);
        this.m.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.q = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.p = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.m = drawable;
    }
}
