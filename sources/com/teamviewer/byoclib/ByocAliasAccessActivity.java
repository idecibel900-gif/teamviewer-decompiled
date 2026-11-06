package com.teamviewer.byoclib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.security.KeyChain;
import android.security.KeyChainAliasCallback;
import com.teamviewer.byoclib.ByocAliasAccessActivity;
import o.ub7;
import o.yg0;

/* JADX INFO: loaded from: classes.dex */
public final class ByocAliasAccessActivity extends Activity {
    public static final /* synthetic */ int p = 0;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f58o;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        yg0 yg0Var = yg0.a;
        Intent intent = getIntent();
        intent.getClass();
        String stringExtra = intent.getStringExtra("configured_alias");
        this.f58o = stringExtra;
        if (stringExtra == null || ub7.b0(stringExtra)) {
            this.n = true;
            yg0.a(null);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (isFinishing() && !this.n) {
            yg0 yg0Var = yg0.a;
            yg0.a(null);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.m) {
            return;
        }
        String str = this.f58o;
        if (str != null && !ub7.b0(str)) {
            this.m = true;
            KeyChain.choosePrivateKeyAlias(this, new KeyChainAliasCallback() { // from class: o.wg0
                @Override // android.security.KeyChainAliasCallback
                public final void alias(String str2) {
                    ByocAliasAccessActivity byocAliasAccessActivity = this.a;
                    byocAliasAccessActivity.n = true;
                    yg0 yg0Var = yg0.a;
                    yg0.a(str2);
                    byocAliasAccessActivity.runOnUiThread(new pc0((Object) byocAliasAccessActivity, (byte) 1));
                }
            }, null, null, null, str);
        } else {
            this.n = true;
            yg0 yg0Var = yg0.a;
            yg0.a(null);
            finish();
        }
    }
}
