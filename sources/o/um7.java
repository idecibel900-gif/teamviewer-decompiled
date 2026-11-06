package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class um7 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View m;
    public final /* synthetic */ vm7 n;

    public um7(vm7 vm7Var, View view) {
        this.n = vm7Var;
        this.m = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.m;
        if (view2.getVisibility() == 0) {
            this.n.c(view2);
        }
    }
}
