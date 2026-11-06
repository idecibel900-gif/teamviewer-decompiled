package o;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends ClickableSpan {
    public final int m;
    public final g4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1535o;

    public n3(int i, g4 g4Var, int i2) {
        this.m = i;
        this.n = g4Var;
        this.f1535o = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.m);
        this.n.a.performAction(this.f1535o, bundle);
    }
}
