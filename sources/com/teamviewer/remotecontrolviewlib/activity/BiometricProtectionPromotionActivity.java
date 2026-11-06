package com.teamviewer.remotecontrolviewlib.activity;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.teamviewer.teamviewer.market.mobile.R;
import o.bf1;
import o.c36;
import o.ck3;
import o.dl5;
import o.fx3;
import o.h57;
import o.hk0;
import o.im3;
import o.pn5;
import o.q26;
import o.r10;
import o.ua5;
import o.v60;
import o.ve8;
import o.w10;
import o.w86;
import o.wt3;
import o.x60;
import o.xr;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
public final class BiometricProtectionPromotionActivity extends xr {
    public v60 N;

    @Override // o.xt2, o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_biometric_protection_promotion);
        I((Toolbar) findViewById(R.id.biometric_protection_promotion_toolbar));
        ck3 ck3VarH = H();
        if (ck3VarH != null) {
            ck3VarH.o0();
            ck3VarH.p0();
            ck3VarH.n0(true);
        }
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return;
        }
        dl5 dl5Var = new dl5(new q26(c36Var, (byte) 17), (byte) 2);
        ve8 g0 = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, g0, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(v60.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.N = (v60) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        if (bundle == null) {
            w10 w10Var = new w10(D());
            w10Var.k(R.id.fragment_content, new x60(), null);
            w10Var.f();
        }
        if (c().b) {
            return;
        }
        c().b(new r10((byte) 2, this, false));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // o.xt2, android.app.Activity
    public final void onResume() {
        super.onResume();
        v60 v60Var = this.N;
        if (v60Var != null) {
            fx3.q(v60Var.n, "lock_promoted", true);
        } else {
            im3.e0("viewModel");
            throw null;
        }
    }
}
