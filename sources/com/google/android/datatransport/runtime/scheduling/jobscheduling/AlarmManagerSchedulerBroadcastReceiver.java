package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.concurrent.Executor;
import o.ed;
import o.fp1;
import o.iu;
import o.j28;
import o.s98;
import o.u00;
import o.us5;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        j28.b(context);
        iu iuVarA = u00.a();
        iuVarA.O(queryParameter);
        iuVarA.n = us5.b(iIntValue);
        if (queryParameter2 != null) {
            iuVarA.p = Base64.decode(queryParameter2, 0);
        }
        fp1 fp1Var = j28.a().d;
        ((Executor) fp1Var.e).execute(new s98(fp1Var, iuVarA.f(), i, new ed((byte) 0)));
    }
}
