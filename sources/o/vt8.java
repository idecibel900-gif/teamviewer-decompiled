package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class vt8 extends BroadcastReceiver {
    public g60 a;
    public boolean b = false;
    public final ht8 c;

    public vt8(lh7 lh7Var) {
        this.c = lh7Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            tr8.h("ProxyBillingReceiver", "Null intent!");
            return;
        }
        tr8.g("ProxyBillingReceiver", "Received intent action: ".concat(String.valueOf(intent.getAction())));
        boolean zEquals = Objects.equals(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
        ht8 ht8Var = this.c;
        if (zEquals) {
            if (!intent.hasExtra("RESPONSE_CODE")) {
                tr8.h("ProxyBillingReceiver", "Missing RESPONSE_CODE in intent.");
                if (ht8Var != null) {
                    ((lh7) ht8Var).O(null, intent.getLongExtra("billingClientTransactionId", 0L));
                    return;
                }
                return;
            }
            io.sentry.android.replay.screenshot.h hVarA = g60.a();
            hVarA.m = intent.getIntExtra("RESPONSE_CODE", 0);
            String stringExtra = intent.getStringExtra("DEBUG_MESSAGE");
            if (stringExtra == null) {
                stringExtra = "";
            }
            hVarA.f166o = stringExtra;
            g60 g60VarP = hVarA.p();
            this.a = g60VarP;
            if (ht8Var != null) {
                ((lh7) ht8Var).O(g60VarP, intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        if (!Objects.equals(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
            tr8.h("ProxyBillingReceiver", "Unexpected broadcast action: ".concat(String.valueOf(intent.getAction())));
            return;
        }
        this.b = true;
        if (ht8Var != null) {
            long longExtra = intent.getLongExtra("billingClientTransactionId", 0L);
            lh7 lh7Var = (lh7) ht8Var;
            try {
                pw8 pw8VarO = qw8.o();
                pw8VarO.b();
                qw8.t((qw8) pw8VarO.n, 4);
                mw8 mw8Var = mw8.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
                pw8VarO.b();
                qw8.p((qw8) pw8VarO.n, mw8Var);
                qw8 qw8Var = (qw8) pw8VarO.a();
                zw8 zw8VarQ = ax8.q();
                sw8 sw8Var = (sw8) lh7Var.n;
                if (longExtra != 0) {
                    rw8 rw8Var = (rw8) sw8Var.l();
                    rw8Var.e(longExtra);
                    sw8Var = (sw8) rw8Var.a();
                }
                zw8VarQ.c(sw8Var);
                zw8VarQ.b();
                ax8.u((ax8) zw8VarQ.n, qw8Var);
                ((io.sentry.android.core.u0) lh7Var.f1364o).p((ax8) zw8VarQ.a());
            } catch (Throwable th) {
                tr8.i("BillingLogger", "Unable to log.", th);
            }
        }
    }
}
