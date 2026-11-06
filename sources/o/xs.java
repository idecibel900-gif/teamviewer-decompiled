package o;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class xs {
    public final TextView a;
    public final xk1 b;

    public xs(TextView textView) {
        this.a = textView;
        this.b = new xk1(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((nv1) this.b.n).y(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, zz5.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((nv1) this.b.n).K(z);
    }

    public final void d(boolean z) {
        ((nv1) this.b.n).L(z);
    }
}
