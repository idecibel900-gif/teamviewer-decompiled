package com.teamviewer.remotecontrolviewlib.activity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.teamviewer.teamviewer.market.mobile.R;
import o.ck3;
import o.ei7;
import o.j93;
import o.o11;
import o.w10;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
public final class ConditionalAccessAuthenticationConnectionRequestActivity extends ei7 {
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
        setTitle(getString(R.string.conditional_access_authentication_notification_content_title));
        if (bundle == null) {
            w10 w10Var = new w10(D());
            String stringExtra = getIntent().getStringExtra("SESSION_ID");
            long j = stringExtra != null ? Long.parseLong(stringExtra) : 0L;
            String stringExtra2 = getIntent().getStringExtra("SOURCE_COMPANY_NAME");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            String stringExtra3 = getIntent().getStringExtra("TARGET_COMPANY_NAME");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            String stringExtra4 = getIntent().getStringExtra("SOURCE_ACCOUNT_NAME");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            String stringExtra5 = getIntent().getStringExtra("TARGET_ACCOUNT_NAME");
            if (stringExtra5 == null) {
                stringExtra5 = "";
            }
            String stringExtra6 = getIntent().getStringExtra("SOURCE_DEVICE_NAME");
            if (stringExtra6 == null) {
                stringExtra6 = "";
            }
            String stringExtra7 = getIntent().getStringExtra("TARGET_DEVICE_NAME");
            if (stringExtra7 == null) {
                stringExtra7 = "";
            }
            String str = stringExtra6;
            long longExtra = getIntent().getLongExtra("TIMESTAMP", 0L);
            o11 o11Var = new o11();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("SESSION_ID", j);
            bundle2.putString("SOURCE_COMPANY_NAME", stringExtra2);
            bundle2.putString("TARGET_COMPANY_NAME", stringExtra3);
            bundle2.putString("SOURCE_ACCOUNT_NAME", stringExtra4);
            bundle2.putString("TARGET_ACCOUNT_NAME", stringExtra5);
            bundle2.putString("SOURCE_DEVICE_NAME", str);
            bundle2.putString("TARGET_DEVICE_NAME", stringExtra7);
            bundle2.putLong("TIMESTAMP", longExtra);
            o11Var.u0(bundle2);
            w10Var.k(R.id.main, o11Var, null);
            w10Var.f();
        }
    }
}
