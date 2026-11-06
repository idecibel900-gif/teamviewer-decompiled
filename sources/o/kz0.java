package o;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class kz0 extends ClickableSpan {
    public final ga4 m;

    public kz0(ga4 ga4Var) {
        this.m = ga4Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        di7 di7VarA = this.m.a();
        if (di7VarA != null) {
            ((i77) di7VarA.a).a.a();
        }
    }
}
