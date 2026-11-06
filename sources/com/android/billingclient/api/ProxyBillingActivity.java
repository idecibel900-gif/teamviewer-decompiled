package com.android.billingclient.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import io.sentry.android.replay.screenshot.h;
import o.dx8;
import o.ex8;
import o.g60;
import o.gt8;
import o.hm3;
import o.lh7;
import o.mw8;
import o.rw8;
import o.sw8;
import o.tr8;
import o.ua5;
import o.vt8;

/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30o;
    public int p;
    public long q;
    public boolean r;
    public vt8 s;
    public lh7 t;

    public static int a(Intent intent, int i) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return 22;
            }
            return i == 5 ? 139 : 1;
        }
        if (i == -1) {
            return 113;
        }
        if (i == 0) {
            return 114;
        }
        if (i != 3) {
            return i != 4 ? 117 : 116;
        }
        return 115;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    public final Intent b(int i, long j, boolean z) {
        g60 g60Var;
        Intent intentC = c();
        mw8 mw8Var = mw8.BROADCAST_ACTION_UNSPECIFIED;
        if (z) {
            vt8 vt8Var = this.s;
            if (vt8Var != null && (g60Var = vt8Var.a) != null) {
                intentC.putExtra("RESPONSE_CODE", g60Var.a);
                intentC.putExtra("DEBUG_MESSAGE", g60Var.c);
            } else if (vt8Var == null || vt8Var.b) {
                intentC.putExtra("RESPONSE_CODE", 6);
                intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                h hVarA = g60.a();
                hVarA.m = 6;
                hVarA.f166o = "An internal error occurred.";
                intentC.putExtra("FAILURE_LOGGING_PAYLOAD", gt8.b(i, 2, hVarA.p(), null, mw8Var).b());
            } else {
                intentC.putExtra("RESPONSE_CODE", 3);
                intentC.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
                h hVarA2 = g60.a();
                hVarA2.m = 3;
                hVarA2.f166o = "Play Store is blocked.";
                intentC.putExtra("FAILURE_LOGGING_PAYLOAD", gt8.b(142, 2, hVarA2.p(), null, mw8Var).b());
            }
        } else {
            intentC.putExtra("RESPONSE_CODE", 6);
            intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            h hVarA3 = g60.a();
            hVarA3.m = 6;
            hVarA3.f166o = "An internal error occurred.";
            intentC.putExtra("FAILURE_LOGGING_PAYLOAD", gt8.b(i, 2, hVarA3.p(), null, mw8Var).b());
        }
        intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentC.putExtra("billingClientTransactionId", j);
        intentC.putExtra("wasServiceAutoReconnected", this.r);
        return intentC;
    }

    public final Intent c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070 A[PHI: r11
      0x0070: PHI (r11v1 int) = (r11v0 int), (r11v16 int) binds: [B:28:0x006b, B:30:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x0110  */
    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0070, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x008c, please report this as an issue */
    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        int i3;
        int i4;
        String string;
        Intent intentC;
        boolean z2;
        int i5;
        ResultReceiver resultReceiver;
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            i3 = tr8.e(intent, "ProxyBillingActivity").a;
            i4 = -1;
            if (i2 != -1) {
                tr8.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            } else if (i3 != 0) {
                i2 = -1;
                tr8.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            }
            if (true != z) {
                tr8.h("ProxyBillingActivity", "Got null data with resultCode " + i4 + "!");
            } else if (intent.getExtras() == null) {
                tr8.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (ua5.a(a(intent, i4), 1)) {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent2.setPackage(getApplicationContext().getPackageName());
                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent2;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.q);
                intentC.putExtra("wasServiceAutoReconnected", this.r);
            } else {
                int iA = a(intent, i4);
                long j = this.q;
                if (intent == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intentC = b(iA, j, z2);
            }
            if (i == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else if (i == 110) {
            if (intent == null) {
                z = false;
            } else {
                z = true;
            }
            i3 = tr8.e(intent, "ProxyBillingActivity").a;
            i4 = -1;
            if (i2 != -1) {
                tr8.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            } else if (i3 != 0) {
                i2 = -1;
                tr8.h("ProxyBillingActivity", "Activity finished with resultCode " + i2 + " and billing's responseCode: " + i3);
                i4 = i2;
            }
            if (true != z) {
                tr8.h("ProxyBillingActivity", "Got null data with resultCode " + i4 + "!");
            } else if (intent.getExtras() == null) {
                tr8.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (ua5.a(a(intent, i4), 1)) {
                int iA2 = a(intent, i4);
                long j2 = this.q;
                if (intent == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                intentC = b(iA2, j2, z2);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent3 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent3.setPackage(getApplicationContext().getPackageName());
                    intent3.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent3;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.q);
                intentC.putExtra("wasServiceAutoReconnected", this.r);
            }
            if (i == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else if (i == 101) {
            int i6 = tr8.a;
            if (intent == null) {
                tr8.h("ProxyBillingActivity", "Got null intent!");
                intent = null;
            } else {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    tr8.h("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i5 = extras2.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                }
                resultReceiver = this.m;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i5, extras);
                }
            }
            i5 = 0;
            resultReceiver = this.m;
            if (resultReceiver != null) {
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                resultReceiver.send(i5, extras);
            }
        } else {
            tr8.h("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.n = false;
        vt8 vt8Var = this.s;
        if (vt8Var != null) {
            vt8Var.a = null;
        }
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d4  */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean zContainsKey;
        int i;
        PendingIntent pendingIntent;
        ProxyBillingActivity proxyBillingActivity;
        IntentSender.SendIntentException sendIntentException;
        ResultReceiver resultReceiver;
        Intent intentB;
        Bundle bundle2;
        Bundle bundle3;
        super.onCreate(bundle);
        if (bundle == null) {
            zContainsKey = getIntent() == null ? false : getIntent().hasExtra("IN_APP_MESSAGE_INTENT");
        } else {
            zContainsKey = bundle.containsKey("in_app_message_result_receiver");
        }
        if (!zContainsKey) {
            try {
                i = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                tr8.i("ProxyBillingActivity", "Failed to get package info for current package.", e);
                i = -1;
            }
            if (this.t == null) {
                Context applicationContext = getApplicationContext();
                rw8 rw8VarY = sw8.y();
                rw8VarY.h(getPackageName());
                rw8VarY.i();
                rw8VarY.d(i);
                rw8VarY.c(Build.VERSION.SDK_INT);
                rw8VarY.g();
                this.t = new lh7(applicationContext, (sw8) rw8VarY.a());
            }
            synchronized (this) {
                try {
                    this.s = new vt8(this.t);
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
                    intentFilter.addAction("com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION");
                    hm3.z(this, this.s, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
                } catch (NoSuchMethodError | RuntimeException e2) {
                    this.s = null;
                    boolean z = e2 instanceof NoSuchMethodError;
                    lh7 lh7Var = this.t;
                    if (z) {
                        dx8 dx8VarO = ex8.o();
                        dx8VarO.b();
                        ex8.p((ex8) dx8VarO.n, 2);
                        lh7Var.P((ex8) dx8VarO.a());
                    } else {
                        dx8 dx8VarO2 = ex8.o();
                        dx8VarO2.b();
                        ex8.p((ex8) dx8VarO2.n, 1);
                        lh7Var.P((ex8) dx8VarO2.a());
                    }
                    tr8.i("ProxyBillingActivity", "Failed to register receiver.", e2);
                }
            }
        }
        if (bundle != null) {
            tr8.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.n = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.m = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f30o = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.p = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.q = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.r = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        tr8.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.p = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f30o = true;
                this.p = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.m = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.p = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.q = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.r = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.n = true;
            int i2 = Build.VERSION.SDK_INT;
            try {
                try {
                    if (i2 < 36) {
                        if (i2 >= 34) {
                            bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                        } else {
                            bundle2 = null;
                        }
                        proxyBillingActivity = this;
                        proxyBillingActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.p, new Intent(), 0, 0, 0, bundle2);
                        return;
                    }
                    bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
                    proxyBillingActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.p, new Intent(), 0, 0, 0, bundle2);
                    return;
                } catch (IntentSender.SendIntentException e3) {
                    e = e3;
                    sendIntentException = e;
                    tr8.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", sendIntentException);
                    resultReceiver = proxyBillingActivity.m;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    } else {
                        intentB = proxyBillingActivity.b(137, proxyBillingActivity.q, false);
                        if (proxyBillingActivity.f30o) {
                            intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        proxyBillingActivity.sendBroadcast(intentB);
                    }
                    proxyBillingActivity.n = false;
                    proxyBillingActivity.finish();
                }
                bundle2 = bundle3;
                proxyBillingActivity = this;
            } catch (IntentSender.SendIntentException e4) {
                sendIntentException = e4;
                proxyBillingActivity = this;
                tr8.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", sendIntentException);
                resultReceiver = proxyBillingActivity.m;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                } else {
                    intentB = proxyBillingActivity.b(137, proxyBillingActivity.q, false);
                    if (proxyBillingActivity.f30o) {
                        intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    proxyBillingActivity.sendBroadcast(intentB);
                }
                proxyBillingActivity.n = false;
                proxyBillingActivity.finish();
            }
        } catch (IntentSender.SendIntentException e5) {
            e = e5;
            proxyBillingActivity = this;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        g60 g60Var;
        super.onDestroy();
        vt8 vt8Var = this.s;
        if (vt8Var != null) {
            g60Var = vt8Var.a;
            try {
                unregisterReceiver(vt8Var);
            } catch (RuntimeException e) {
                tr8.i("ProxyBillingActivity", "Failed to unregister receiver.", e);
            }
        } else {
            g60Var = null;
        }
        if (isFinishing() && this.n) {
            Intent intentC = c();
            if (g60Var != null) {
                intentC.putExtra("RESPONSE_CODE", g60Var.a);
                intentC.putExtra("DEBUG_MESSAGE", g60Var.c);
            } else {
                intentC.putExtra("RESPONSE_CODE", 1);
                intentC.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.f30o) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.p;
            if (i == 110 || i == 100) {
                intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentC.putExtra("billingClientTransactionId", this.q);
            }
            sendBroadcast(intentC);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.m;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.n);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f30o);
        bundle.putInt("activity_code", this.p);
        bundle.putLong("billingClientTransactionId", this.q);
        bundle.putBoolean("wasServiceAutoReconnected", this.r);
    }
}
