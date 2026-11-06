package o;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class f7 extends dt2 {
    public final /* synthetic */ byte v = 0;
    public final /* synthetic */ View w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.w = actionMenuItemView;
    }

    @Override // o.dt2
    public final kz6 e() {
        h7 h7Var;
        byte b = this.v;
        View view = this.w;
        switch (b) {
            case 0:
                g7 g7Var = ((ActionMenuItemView) view).z;
                if (g7Var == null || (h7Var = ((i7) g7Var).a.G) == null) {
                    return null;
                }
                return h7Var.a();
            default:
                h7 h7Var2 = ((j7) view).p.F;
                if (h7Var2 == null) {
                    return null;
                }
                return h7Var2.a();
        }
    }

    @Override // o.dt2
    public final boolean f() {
        kz6 kz6VarE;
        byte b = this.v;
        View view = this.w;
        switch (b) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                ip4 ip4Var = actionMenuItemView.x;
                return ip4Var != null && ip4Var.c(actionMenuItemView.u) && (kz6VarE = e()) != null && kz6VarE.a();
            default:
                ((j7) view).p.n();
                return true;
        }
    }

    @Override // o.dt2
    public boolean g() {
        switch (this.v) {
            case 1:
                l7 l7Var = ((j7) this.w).p;
                if (l7Var.H != null) {
                    return false;
                }
                l7Var.g();
                return true;
            default:
                return super.g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(j7 j7Var, j7 j7Var2) {
        super(j7Var2);
        this.w = j7Var;
    }
}
