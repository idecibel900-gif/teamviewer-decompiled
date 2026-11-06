package o;

import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class si5 extends FrameLayout.LayoutParams implements ui5 {
    public ti5 m;

    @Override // o.ui5
    public final ti5 a() {
        ti5 ti5Var = this.m;
        if (ti5Var != null) {
            return ti5Var;
        }
        ti5 ti5Var2 = new ti5();
        this.m = ti5Var2;
        return ti5Var2;
    }

    @Override // android.view.ViewGroup.LayoutParams
    public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        ((ViewGroup.LayoutParams) this).width = typedArray.getLayoutDimension(i, 0);
        ((ViewGroup.LayoutParams) this).height = typedArray.getLayoutDimension(i2, 0);
    }
}
