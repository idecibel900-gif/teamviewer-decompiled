package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.teamviewer.teamviewer.market.mobile.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o20 extends Drawable implements aq7 {
    public WeakReference A;
    public WeakReference B;
    public final WeakReference m;
    public final qn4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bq7 f1621o;
    public final Rect p;
    public final float q;
    public final float r;
    public final float s;
    public final n20 t;
    public float u;
    public float v;
    public int w;
    public float x;
    public float y;
    public float z;

    public o20(Context context) {
        ap7 ap7Var;
        Context context2;
        WeakReference weakReference = new WeakReference(context);
        this.m = weakReference;
        xk0.o(context, xk0.y, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.p = new Rect();
        this.n = new qn4();
        this.q = resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
        this.s = resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.r = resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
        bq7 bq7Var = new bq7(this);
        this.f1621o = bq7Var;
        bq7Var.a.setTextAlign(Paint.Align.CENTER);
        n20 n20Var = new n20();
        n20Var.f1534o = 255;
        n20Var.p = -1;
        n20Var.n = new ap7(context, R.style.TextAppearance_MaterialComponents_Badge).a.getDefaultColor();
        n20Var.r = context.getString(R.string.mtrl_badge_numberless_content_description);
        n20Var.s = R.plurals.mtrl_badge_content_description;
        n20Var.t = R.string.mtrl_exceed_max_badge_number_content_description;
        n20Var.v = true;
        this.t = n20Var;
        Context context3 = (Context) weakReference.get();
        if (context3 == null || bq7Var.f == (ap7Var = new ap7(context3, R.style.TextAppearance_MaterialComponents_Badge)) || (context2 = (Context) weakReference.get()) == null) {
            return;
        }
        bq7Var.b(ap7Var, context2);
        i();
    }

    @Override // o.aq7
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        if (d() <= this.w) {
            return NumberFormat.getInstance().format(d());
        }
        Context context = (Context) this.m.get();
        return context == null ? "" : context.getString(R.string.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.w), "+");
    }

    public final String c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean zE = e();
        n20 n20Var = this.t;
        if (!zE) {
            return n20Var.r;
        }
        if (n20Var.s <= 0 || (context = (Context) this.m.get()) == null) {
            return null;
        }
        int iD = d();
        int i = this.w;
        return iD <= i ? context.getResources().getQuantityString(n20Var.s, d(), Integer.valueOf(d())) : context.getString(n20Var.t, Integer.valueOf(i));
    }

    public final int d() {
        if (e()) {
            return this.t.p;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty() || this.t.f1534o == 0 || !isVisible()) {
            return;
        }
        this.n.draw(canvas);
        if (e()) {
            Rect rect = new Rect();
            String strB = b();
            bq7 bq7Var = this.f1621o;
            bq7Var.a.getTextBounds(strB, 0, strB.length(), rect);
            canvas.drawText(strB, this.u, this.v + (rect.height() / 2), bq7Var.a);
        }
    }

    public final boolean e() {
        return this.t.p != -1;
    }

    public final void f(int i) {
        n20 n20Var = this.t;
        if (n20Var.u != i) {
            n20Var.u = i;
            WeakReference weakReference = this.A;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = (View) this.A.get();
            WeakReference weakReference2 = this.B;
            h(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
        }
    }

    public final void g(int i) {
        n20 n20Var = this.t;
        if (n20Var.q != i) {
            n20Var.q = i;
            this.w = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
            this.f1621o.d = true;
            i();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.t.f1534o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.p.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.p.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.A = new WeakReference(view);
        this.B = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    public final void i() {
        float f;
        float f2;
        Context context = (Context) this.m.get();
        WeakReference weakReference = this.A;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.p;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference2 = this.B;
        FrameLayout frameLayout = weakReference2 != null ? (FrameLayout) weakReference2.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect3);
        }
        n20 n20Var = this.t;
        int i = n20Var.x + n20Var.z;
        int i2 = n20Var.u;
        if (i2 == 8388691 || i2 == 8388693) {
            this.v = rect3.bottom - i;
        } else {
            this.v = rect3.top + i;
        }
        int iD = d();
        float f3 = this.r;
        if (iD <= 9) {
            if (!e()) {
                f3 = this.q;
            }
            this.x = f3;
            this.z = f3;
            this.y = f3;
        } else {
            this.x = f3;
            this.z = f3;
            this.y = (this.f1621o.a(b()) / 2.0f) + this.s;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(e() ? R.dimen.mtrl_badge_text_horizontal_edge_offset : R.dimen.mtrl_badge_horizontal_edge_offset);
        int i3 = n20Var.w + n20Var.y;
        int i4 = n20Var.u;
        if (i4 == 8388659 || i4 == 8388691) {
            WeakHashMap weakHashMap = be8.a;
            if (view.getLayoutDirection() == 0) {
                float f4 = rect3.left;
                f = this.y;
                f2 = (f4 - f) + dimensionPixelSize + i3;
            } else {
                float f5 = rect3.right;
                f = this.y;
                f2 = ((f5 + f) - dimensionPixelSize) - i3;
            }
            this.u = f2;
        } else {
            WeakHashMap weakHashMap2 = be8.a;
            if (view.getLayoutDirection() == 0) {
                float f6 = rect3.right;
                f = this.y;
                f2 = ((f6 + f) - dimensionPixelSize) - i3;
            } else {
                float f7 = rect3.left;
                f = this.y;
                f2 = (f7 - f) + dimensionPixelSize + i3;
            }
            this.u = f2;
        }
        float f8 = this.v;
        float f9 = this.z;
        rect2.set((int) (f2 - f), (int) (f8 - f9), (int) (f2 + f), (int) (f8 + f9));
        float f10 = this.x;
        qn4 qn4Var = this.n;
        y85 y85VarE = qn4Var.m.a.e();
        y85VarE.e = new n(f10);
        y85VarE.f = new n(f10);
        y85VarE.g = new n(f10);
        y85VarE.h = new n(f10);
        qn4Var.setShapeAppearanceModel(y85VarE.a());
        if (rect.equals(rect2)) {
            return;
        }
        qn4Var.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, o.aq7
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.t.f1534o = i;
        this.f1621o.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
