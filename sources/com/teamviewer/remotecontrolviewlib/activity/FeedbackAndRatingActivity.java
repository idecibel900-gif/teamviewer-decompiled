package com.teamviewer.remotecontrolviewlib.activity;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.teamviewer.teamviewer.market.mobile.R;
import o.ck3;
import o.ei7;
import o.ii2;
import o.j93;
import o.w10;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public final class FeedbackAndRatingActivity extends ei7 {
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
        int intExtra = getIntent().getIntExtra("RatingValue", 0);
        if (bundle == null) {
            w10 w10Var = new w10(D());
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RatingId", intExtra);
            bundle2.putBoolean("ScamProtectionFeedback", false);
            bundle2.putBoolean("RatingControlsId", 1 <= intExtra && intExtra < 6);
            ii2 ii2Var = new ii2();
            ii2Var.u0(bundle2);
            w10Var.k(R.id.main, ii2Var, null);
            w10Var.f();
        }
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
