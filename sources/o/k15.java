package o;

import android.content.Intent;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class k15 implements hp4, f75 {
    public final /* synthetic */ NavigationView m;

    public /* synthetic */ k15(NavigationView navigationView) {
        this.m = navigationView;
    }

    @Override // o.hp4
    public boolean a(jp4 jp4Var, MenuItem menuItem) {
        l15 l15Var = this.m.t;
        if (l15Var == null) {
            return false;
        }
        cc0 cc0Var = (cc0) ((ar) l15Var).n;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.bottom_sheet_menu_rename_option) {
            s93 s93Var = cc0Var.G0;
            if (s93Var == null) {
                ye4.c("BuddyListBottomSheetFragment", "rename group: group is null");
                return true;
            }
            if (nv1.d == null) {
                im3.e0("dialogFactory");
                throw null;
            }
            fs7 fs7VarE = yi5.e((String) ((ec0) s93Var).f702o.getValue());
            fs7VarE.F0 = R.string.tv_renameGroup;
            fs7VarE.K0 = R.string.tv_renameGroup_positive;
            fs7VarE.O0 = R.string.tv_cancel;
            xk1 xk1Var = ct1.a;
            if (xk1Var != null) {
                xk1Var.L(fs7VarE);
            }
            if (xk1Var != null) {
                xk1.M(cc0Var.H0, new r02(fs7VarE, p02.Positive));
            }
            fs7VarE.N0();
            return true;
        }
        if (itemId != R.id.bottom_sheet_menu_delete_option) {
            if (itemId != R.id.bottom_sheet_menu_settings_option) {
                return true;
            }
            cc0Var.A0();
            if (it1.c != null) {
                cc0Var.y0(new Intent(cc0Var.E(), (Class<?>) SettingsActivity.class));
                return true;
            }
            im3.e0("viewFactory");
            throw null;
        }
        if (cc0Var.G0 == null) {
            ye4.c("BuddyListBottomSheetFragment", "rename group: group is null");
            return true;
        }
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.H0 = R.string.tv_partner_dialog_deleteGroupBody;
        gk7Var.F0 = R.string.tv_partner_dialog_deleteGroupHeader;
        gk7Var.O0 = R.string.tv_no;
        gk7Var.K0 = R.string.tv_yes;
        xk1 xk1Var2 = ct1.a;
        if (xk1Var2 != null) {
            xk1Var2.L(gk7Var);
        }
        if (xk1Var2 != null) {
            xk1.M(cc0Var.I0, new r02(gk7Var, p02.Positive));
        }
        gk7Var.N0();
        return true;
    }

    @Override // o.hp4
    public void h(jp4 jp4Var) {
    }

    @Override // o.f75
    public sk8 t(View view, sk8 sk8Var) {
        NavigationView navigationView = this.m;
        Rect rect = navigationView.n;
        if (rect == null) {
            rect = new Rect();
            navigationView.n = rect;
        }
        int iB = sk8Var.b();
        pk8 pk8Var = sk8Var.a;
        rect.set(iB, sk8Var.d(), sk8Var.c(), sk8Var.a());
        h15 h15Var = navigationView.s;
        h15Var.getClass();
        int iD = sk8Var.d();
        if (h15Var.D != iD) {
            h15Var.D = iD;
            int i = (h15Var.n.getChildCount() == 0 && h15Var.B) ? h15Var.D : 0;
            NavigationMenuView navigationMenuView = h15Var.m;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = h15Var.m;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, sk8Var.a());
        be8.b(h15Var.n, sk8Var);
        navigationView.setWillNotDraw(pk8Var.n().equals(nj3.e) || navigationView.m == null);
        navigationView.postInvalidateOnAnimation();
        return pk8Var.c();
    }
}
