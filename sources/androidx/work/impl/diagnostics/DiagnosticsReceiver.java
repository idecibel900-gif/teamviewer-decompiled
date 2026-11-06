package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.List;
import o.dm8;
import o.ep3;
import o.gf2;
import o.nm8;
import o.qf0;
import o.we4;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = we4.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        we4 we4VarF = we4.f();
        String str = a;
        we4VarF.c(str, "Requesting diagnostics");
        try {
            context.getClass();
            nm8 nm8VarA = nm8.a(context);
            List listK = qf0.K(new ep3(DiagnosticsWorker.class, (byte) 8).g());
            if (listK.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new dm8(nm8VarA, null, gf2.n, listK).a();
        } catch (IllegalStateException e) {
            we4.f().e(str, "WorkManager is not initialized", e);
        }
    }
}
