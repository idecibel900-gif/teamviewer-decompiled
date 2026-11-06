package o;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public final class x62 implements View.OnTouchListener {
    public final /* synthetic */ AutoCompleteTextView m;
    public final /* synthetic */ z62 n;

    public x62(z62 z62Var, AutoCompleteTextView autoCompleteTextView) {
        this.n = z62Var;
        this.m = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            z62 z62Var = this.n;
            long j = jCurrentTimeMillis - z62Var.k;
            if (j < 0 || j > 300) {
                z62Var.i = false;
            }
            z62Var.f(this.m);
        }
        return false;
    }
}
