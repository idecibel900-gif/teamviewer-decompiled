package o;

import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public final class y62 implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ z62 a;

    public y62(z62 z62Var) {
        this.a = z62Var;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        z62 z62Var = this.a;
        z62Var.i = true;
        z62Var.k = System.currentTimeMillis();
        z62Var.e(false);
    }
}
