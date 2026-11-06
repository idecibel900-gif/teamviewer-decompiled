package com.teamviewer.remotecontrolviewlib.activity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.teamviewer.teamviewer.market.mobile.R;
import o.ck3;
import o.ei7;
import o.j93;
import o.r38;
import o.w10;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public final class TrustedDeviceRequestActivity extends ei7 {
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
            ck3VarH.n0(false);
        }
        setTitle(getString(R.string.tv_trusted_device_request_title_text));
        if (bundle == null) {
            w10 w10Var = new w10(D());
            String stringExtra = getIntent().getStringExtra("ARG_DYNGATE_ID_KEY");
            if (stringExtra == null) {
                stringExtra = "";
            }
            String stringExtra2 = getIntent().getStringExtra("ARG_LOCATION_KEY");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            String stringExtra3 = getIntent().getStringExtra("ARG_IP_ADDRESS_KEY");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            String stringExtra4 = getIntent().getStringExtra("ARG_TIMESTAMP_KEY");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            String stringExtra5 = getIntent().getStringExtra("ARG_TOKEN_KEY");
            String str = stringExtra5 != null ? stringExtra5 : "";
            int intExtra = getIntent().getIntExtra("ARG_NOTIFICATION_ID_KEY", 0);
            boolean booleanExtra = getIntent().getBooleanExtra("ARG_DECLINED_FROM_NOTIFICATION", false);
            r38 r38Var = new r38();
            Bundle bundle2 = new Bundle();
            bundle2.putString("ARG_DYNGATE_ID_KEY", stringExtra);
            bundle2.putString("ARG_LOCATION_KEY", stringExtra2);
            bundle2.putString("ARG_IP_ADDRESS_KEY", stringExtra3);
            bundle2.putString("ARG_TIMESTAMP_KEY", stringExtra4);
            bundle2.putString("ARG_TOKEN_KEY", str);
            bundle2.putInt("ARG_NOTIFICATION_ID_KEY", intExtra);
            bundle2.putBoolean("ARG_DECLINED_FROM_NOTIFICATION", booleanExtra);
            r38Var.u0(bundle2);
            w10Var.k(R.id.main, r38Var, null);
            w10Var.f();
        }
    }
}
