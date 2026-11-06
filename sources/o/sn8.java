package o;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class sn8 implements m01, s84 {
    public final AndroidComposeView m;
    public final s01 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2036o;
    public x84 p;
    public yy0 q = qf0.h;

    public sn8(AndroidComposeView androidComposeView, s01 s01Var) {
        this.m = androidComposeView;
        this.n = s01Var;
    }

    public final void a() {
        if (!this.f2036o) {
            this.f2036o = true;
            AndroidComposeView androidComposeView = this.m;
            androidComposeView.getView().setTag(R.id.wrapped_composition_tag, null);
            x84 x84Var = this.p;
            if (x84Var != null) {
                x84Var.f(this);
            }
            this.p = null;
            u22 u22Var = androidComposeView.s;
            if (u22Var != null) {
                u22Var.n.a();
            }
            androidComposeView.s = null;
        }
        this.n.m();
    }

    public final void b(hw2 hw2Var) {
        this.m.setOnReadyForComposition(new w18(this, (yy0) hw2Var, (byte) 10));
    }

    @Override // o.s84
    public final void e(LifecycleOwner lifecycleOwner, l84 l84Var) {
        if (l84Var == l84.ON_DESTROY) {
            a();
        } else {
            if (l84Var != l84.ON_CREATE || this.f2036o) {
                return;
            }
            b(this.q);
        }
    }
}
