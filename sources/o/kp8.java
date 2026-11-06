package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class kp8 extends xp8 {
    public final Context a;
    public final /* synthetic */ rz2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp8(rz2 rz2Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), (byte) 0);
        this.b = rz2Var;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            io.sentry.android.core.v0.j("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = sz2.a;
        rz2 rz2Var = this.b;
        Context context = this.a;
        int iB = rz2Var.b(context, i2);
        int i3 = wz2.c;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = rz2Var.a(iB, context, "n");
            rz2Var.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
