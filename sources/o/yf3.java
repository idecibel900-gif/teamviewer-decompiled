package o;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yf3 implements ho2, qw2 {
    public final /* synthetic */ zf3 m;

    public yf3(zf3 zf3Var) {
        this.m = zf3Var;
    }

    @Override // o.qw2
    public final pw2 b() {
        return new p8(2, this.m, zf3.class, "handleNavigation", "handleNavigation(Lcom/teamviewer/remotecontrolviewmodellib/inapppurchase/InAppPurchaseContainerViewModel$InAppPurchaseDestination;)V", 4);
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        rf3 rf3Var = (rf3) obj;
        boolean zN = im3.n(rf3Var, lf3.a);
        zf3 zf3Var = this.m;
        if (zN) {
            Intent intent = new Intent();
            intent.putExtra("active_license", true);
            xt2 xt2VarC = zf3Var.C();
            if (xt2VarC != null) {
                xt2VarC.setResult(-1, intent);
                xt2VarC.finish();
            }
        } else if (im3.n(rf3Var, nf3.a)) {
            bg3 bg3Var = new bg3();
            Bundle bundle = new Bundle();
            bundle.putSerializable("current_navigation_category", zf3Var.a());
            zf3Var.u0(bundle);
            zf3Var.I0(bg3Var, false);
        } else if (im3.n(rf3Var, of3.a)) {
            zf3Var.I0(zf3Var.L0(), true);
        } else if (im3.n(rf3Var, pf3.a)) {
            Intent intent2 = new Intent();
            intent2.putExtra("purchase_successful", true);
            xt2 xt2VarC2 = zf3Var.C();
            if (xt2VarC2 != null) {
                xt2VarC2.setResult(-1, intent2);
                xt2VarC2.finish();
            }
        } else if (im3.n(rf3Var, qf3.a)) {
            mg0 mg0Var = new mg0();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("current_navigation_category", zf3Var.a());
            mg0Var.u0(bundle2);
            zf3Var.I0(mg0Var, false);
            View view = zf3Var.U;
            if (view != null) {
                view.post(new pc0(zf3Var, (byte) 17));
            }
        } else {
            if (!im3.n(rf3Var, mf3.a)) {
                gk0.s();
                return null;
            }
            rv2 rv2Var = new rv2();
            Bundle bundle3 = new Bundle();
            bundle3.putSerializable("current_navigation_category", zf3Var.a());
            rv2Var.u0(bundle3);
            zf3Var.I0(rv2Var, true);
            View view2 = zf3Var.U;
            if (view2 != null) {
                view2.post(new pc0(zf3Var, (byte) 17));
            }
        }
        return f88.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ho2) && (obj instanceof qw2)) {
            return im3.n(b(), ((qw2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
