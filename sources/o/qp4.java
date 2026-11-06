package o;

import android.view.ActionProvider;

/* JADX INFO: loaded from: classes.dex */
public final class qp4 implements ActionProvider.VisibilityListener {
    public nx3 a;
    public final ActionProvider b;

    public qp4(tp4 tp4Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        nx3 nx3Var = this.a;
        if (nx3Var != null) {
            jp4 jp4Var = ((pp4) nx3Var.n).n;
            jp4Var.h = true;
            jp4Var.r(true);
        }
    }
}
