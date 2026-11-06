package com.teamviewer.remotecontrolviewlib.activity;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.teamviewer.teamviewer.market.mobile.R;
import o.ck3;
import o.ei7;
import o.ht6;
import o.im3;
import o.it1;
import o.j93;
import o.r10;
import o.w10;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public final class SessionInfoActivity extends ei7 {
    @Override // o.xt2, o.my0, o.ly0, android.app.Activity
    public final void onCreate(Bundle bundle) {
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
        if (bundle == null || !bundle.getBoolean("change")) {
            w10 w10Var = new w10(D());
            if (it1.c == null) {
                im3.e0("viewFactory");
                throw null;
            }
            w10Var.k(R.id.main, new ht6(), null);
            w10Var.f();
        }
        if (c().b) {
            return;
        }
        c().b(new r10((byte) 12, this, false));
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
}
