package com.teamviewer.remotecontrolviewlib.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.h2;
import o.a7;
import o.bb3;
import o.ck3;
import o.e8;
import o.ei7;
import o.gp5;
import o.j93;
import o.jv6;
import o.k8;
import o.kh7;
import o.kv6;
import o.nv6;
import o.w10;
import o.y26;
import o.y46;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public final class SettingsActivity extends ei7 implements bb3 {
    public static final /* synthetic */ int Q = 0;
    public final kh7 N = new kh7(new y26(this, 16));
    public final kh7 O = new kh7(new jv6((byte) 0));
    public final k8 P = (k8) C(new h2(this, 7), new e8(3));

    @Override // o.bb3
    public final void i(Intent intent) {
        this.P.a(intent, null);
    }

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
        if (bundle == null) {
            w10 w10Var = new w10(D());
            w10Var.k(R.id.main, new nv6(), null);
            w10Var.f();
        }
        ((kv6) this.N.getValue()).f1308o.observe(this, new a7(new y46((Object) this, (byte) 14), (byte) 9));
        gp5 gp5Var = (gp5) this.O.getValue();
        View viewFindViewById = findViewById(R.id.post_purchase_compose_view);
        viewFindViewById.getClass();
        gp5Var.c(bundle, (ComposeView) viewFindViewById);
    }

    @Override // o.my0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        c().d();
        return true;
    }

    @Override // o.my0, o.ly0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        ((gp5) this.O.getValue()).b(bundle);
    }
}
