package com.teamviewer.remotecontrolviewlib.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.teamviewer.teamviewer.market.mobile.R;
import o.bf1;
import o.c36;
import o.ck3;
import o.dl5;
import o.e06;
import o.ei7;
import o.h57;
import o.hk0;
import o.ij4;
import o.im3;
import o.j93;
import o.pn5;
import o.q26;
import o.r10;
import o.ua5;
import o.ut2;
import o.uu6;
import o.ve8;
import o.w10;
import o.w86;
import o.wt3;
import o.ye4;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
public final class SessionSettingsActivity extends ei7 {
    public uu6 N;

    @Override // o.xt2, o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ut2 e06Var;
        super.onCreate(bundle);
        setContentView(R.layout.activity_options);
        I((Toolbar) findViewById(R.id.toolbar));
        ck3 ck3VarH = H();
        if (ck3VarH == null && !new j93(this).W()) {
            ye4.c("ToolbarActivityDelegate", "Could not find action bar!");
            ck3VarH = null;
        }
        if (ck3VarH != null) {
            ck3VarH.n0(true);
        }
        c36 c36Var = zu1.c;
        if (c36Var == null) {
            hk0.g("Required value was null.");
            return;
        }
        dl5 dl5Var = new dl5(new q26(c36Var, (byte) 8), (byte) 2);
        ve8 ve8VarO = getG0();
        bf1 bf1VarK = h57.k(this);
        pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(uu6.class);
        String strC = wt3VarB.c();
        if (strC == null) {
            hk0.g("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.N = (uu6) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        boolean z = false;
        if (bundle == null) {
            Intent intent = getIntent();
            Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("extra_settings_type", 0)) : null;
            if (numValueOf != null && numValueOf.intValue() == 1) {
                e06Var = new e06();
            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                boolean booleanExtra = getIntent().getBooleanExtra("extra_disable_instructions", true);
                ij4 ij4Var = new ij4();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("extra_disable_instructions", booleanExtra);
                ij4Var.u0(bundle2);
                e06Var = ij4Var;
            } else {
                ye4.c("SessionSettingsActivity", "Got invalid settings type: " + numValueOf);
                e06Var = null;
            }
            if (e06Var != null) {
                w10 w10Var = new w10(D());
                w10Var.k(R.id.main, e06Var, null);
                w10Var.f();
            }
        }
        if (c().b) {
            return;
        }
        c().b(new r10((byte) 13, this, z));
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
    public final void onPause() {
        super.onPause();
        uu6 uu6Var = this.N;
        if (uu6Var != null) {
            uu6Var.v = null;
        } else {
            im3.e0("viewModel");
            throw null;
        }
    }

    @Override // o.ei7, o.xt2, android.app.Activity
    public final void onResume() {
        super.onResume();
        uu6 uu6Var = this.N;
        if (uu6Var != null) {
            uu6Var.v = this;
        } else {
            im3.e0("viewModel");
            throw null;
        }
    }
}
