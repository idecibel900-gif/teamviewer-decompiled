package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class my8 extends BroadcastReceiver {
    public boolean a;
    public final boolean b;
    public final /* synthetic */ ny8 c;

    public my8(ny8 ny8Var, boolean z) {
        this.c = ny8Var;
        this.b = z;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context) {
        if (!this.a) {
            tr8.h("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.a = false;
        }
    }

    public final void c(Bundle bundle, g60 g60Var, int i, mw8 mw8Var, long j, boolean z) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            ht8 ht8Var = this.c.c;
            if (byteArray != null) {
                ((lh7) ht8Var).L(gw8.s(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z);
            } else {
                ((lh7) ht8Var).L(gt8.b(23, i, g60Var, null, mw8Var), j, z);
            }
        } catch (Throwable unused) {
            tr8.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        mw8 mw8Var;
        g60 g60VarE;
        ht8 ht8Var;
        int iIntValue;
        ny8 ny8Var = this.c;
        ht8 ht8Var2 = ny8Var.c;
        ar arVar = ny8Var.b;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        mw8 mw8Var2 = mw8.LOCAL_PURCHASES_UPDATED_ACTION;
        mw8 mw8Var3 = mw8.PURCHASES_UPDATED_ACTION;
        mw8 mw8Var4 = mw8.ALTERNATIVE_BILLING_ACTION;
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    mw8Var = mw8Var4;
                } else {
                    mw8Var = mw8.BROADCAST_ACTION_UNSPECIFIED;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                mw8Var = mw8Var2;
            } else {
                mw8Var = mw8.BROADCAST_ACTION_UNSPECIFIED;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            mw8Var = mw8Var3;
        } else {
            mw8Var = mw8.BROADCAST_ACTION_UNSPECIFIED;
        }
        int i = (mw8Var.equals(mw8Var2) || mw8Var.equals(mw8Var4)) ? 2 : mw8Var.equals(mw8Var3) ? 32 : 1;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            tr8.h("BillingBroadcastManager", "Bundle is null.");
            g60 g60Var = jt8.f;
            ((lh7) ht8Var2).J(gt8.b(11, i, g60Var, null, mw8Var));
            if (arVar != null) {
                arVar.o(g60Var, null);
                return;
            }
            return;
        }
        if (i == 2) {
            int i2 = tr8.a;
            io.sentry.android.replay.screenshot.h hVarA = g60.a();
            hVarA.m = tr8.a("BillingBroadcastManager", intent.getExtras());
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                tr8.h("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    tr8.g("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                } else {
                    if (obj instanceof Integer) {
                        iIntValue = ((Integer) obj).intValue();
                    } else {
                        tr8.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                    }
                    hVarA.n = iIntValue;
                    hVarA.f166o = tr8.f("BillingBroadcastManager", intent.getExtras());
                    g60VarE = hVarA.p();
                }
            }
            iIntValue = 0;
            hVarA.n = iIntValue;
            hVarA.f166o = tr8.f("BillingBroadcastManager", intent.getExtras());
            g60VarE = hVarA.p();
        } else {
            g60VarE = tr8.e(intent, "BillingBroadcastManager");
        }
        long j = extras.getLong("billingClientTransactionId", 0L);
        boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!mw8Var.equals(mw8Var3) && !mw8Var.equals(mw8Var2)) {
            if (mw8Var.equals(mw8Var4)) {
                if (g60VarE.a != 0) {
                    g60 g60Var2 = g60VarE;
                    c(extras, g60Var2, i, mw8Var, j, z);
                    nr8 nr8Var = yr8.n;
                    arVar.o(g60Var2, ds8.q);
                    return;
                }
                tr8.h("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                g60 g60Var3 = jt8.f;
                ((lh7) ht8Var2).L(gt8.b(141, i, g60Var3, null, mw8Var), j, z);
                nr8 nr8Var2 = yr8.n;
                arVar.o(g60Var3, ds8.q);
                return;
            }
            return;
        }
        g60 g60Var4 = g60VarE;
        int i3 = i;
        as8 as8Var = ny8Var.g;
        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            ht8Var = ht8Var2;
            lx5 lx5VarJ = tr8.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"), as8Var);
            if (lx5VarJ == null) {
                tr8.g("BillingHelper", "Couldn't find single purchase data as well.");
                arrayList = null;
            } else {
                arrayList.add(lx5VarJ);
            }
        } else {
            ht8Var = ht8Var2;
            tr8.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i4 = 0; i4 < stringArrayList.size() && i4 < stringArrayList2.size(); i4++) {
                lx5 lx5VarJ2 = tr8.j(stringArrayList.get(i4), stringArrayList2.get(i4), as8Var);
                if (lx5VarJ2 != null) {
                    arrayList.add(lx5VarJ2);
                }
            }
        }
        if (g60Var4.a == 0) {
            iw8 iw8VarC = gt8.c(i3, mw8Var);
            lh7 lh7Var = (lh7) ht8Var;
            lh7Var.getClass();
            try {
                hw8 hw8Var = (hw8) iw8VarC.l();
                ww8 ww8Var = (ww8) iw8VarC.q().l();
                ww8Var.b();
                yw8.p((yw8) ww8Var.n, z);
                hw8Var.b();
                iw8.t((iw8) hw8Var.n, (yw8) ww8Var.a());
                iw8 iw8Var = (iw8) hw8Var.a();
                sw8 sw8Var = (sw8) lh7Var.n;
                if (j != 0) {
                    rw8 rw8Var = (rw8) sw8Var.l();
                    rw8Var.e(j);
                    sw8Var = (sw8) rw8Var.a();
                }
                lh7Var.T(iw8Var, sw8Var);
            } catch (Throwable th) {
                tr8.i("BillingLogger", "Unable to log.", th);
            }
        } else {
            c(extras, g60Var4, i3, mw8Var, j, z);
        }
        arVar.o(g60Var4, arrayList);
    }
}
