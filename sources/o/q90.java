package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class q90 extends k90 {
    public final /* synthetic */ s90 a;

    public q90(s90 s90Var) {
        this.a = s90Var;
    }

    @Override // o.k90
    public final void b(View view, int i) {
        if (i == 5) {
            this.a.cancel();
        }
    }
}
