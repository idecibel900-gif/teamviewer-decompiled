package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class m66 extends ViewGroup.MarginLayoutParams {
    public c76 m;
    public final Rect n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1441o;
    public boolean p;

    public m66(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new Rect();
        this.f1441o = true;
        this.p = false;
    }

    public m66(int i, int i2) {
        super(i, i2);
        this.n = new Rect();
        this.f1441o = true;
        this.p = false;
    }

    public m66(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.n = new Rect();
        this.f1441o = true;
        this.p = false;
    }

    public m66(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.n = new Rect();
        this.f1441o = true;
        this.p = false;
    }

    public m66(m66 m66Var) {
        super((ViewGroup.LayoutParams) m66Var);
        this.n = new Rect();
        this.f1441o = true;
        this.p = false;
    }
}
