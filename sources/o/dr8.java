package o;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class dr8 extends xp8 {
    public final /* synthetic */ com.google.android.gms.common.internal.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr8(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper, (byte) 2);
        this.a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        eq8 eq8Var;
        com.google.android.gms.common.internal.a aVar = this.a;
        int i = aVar.w.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (eq8Var = (eq8) message.obj) != null) {
                synchronized (eq8Var) {
                    eq8Var.a = null;
                }
                com.google.android.gms.common.internal.a aVar2 = eq8Var.c;
                synchronized (aVar2.k) {
                    aVar2.k.remove(eq8Var);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !aVar.m()) {
            eq8 eq8Var2 = (eq8) message.obj;
            if (eq8Var2 != null) {
                synchronized (eq8Var2) {
                    eq8Var2.a = null;
                }
                com.google.android.gms.common.internal.a aVar3 = eq8Var2.c;
                synchronized (aVar3.k) {
                    aVar3.k.remove(eq8Var2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            aVar.t = new w41(message.arg2, null, null);
            if (!aVar.u && !TextUtils.isEmpty(aVar.i()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.i());
                    if (!aVar.u) {
                        aVar.p(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            w41 w41Var = aVar.t;
            if (w41Var == null) {
                w41Var = new w41(8, null, null);
            }
            aVar.i.c(w41Var);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            w41 w41Var2 = aVar.t;
            if (w41Var2 == null) {
                w41Var2 = new w41(8, null, null);
            }
            aVar.i.c(w41Var2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            aVar.i.c(new w41(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            aVar.p(5, null);
            hj8 hj8Var = aVar.n;
            if (hj8Var != null) {
                ((tz2) hj8Var.n).d(message.arg2);
            }
            System.currentTimeMillis();
            aVar.o(5, 1, null);
            return;
        }
        if (i4 == 2 && !aVar.l()) {
            eq8 eq8Var3 = (eq8) message.obj;
            if (eq8Var3 != null) {
                synchronized (eq8Var3) {
                    eq8Var3.a = null;
                }
                com.google.android.gms.common.internal.a aVar4 = eq8Var3.c;
                synchronized (aVar4.k) {
                    aVar4.k.remove(eq8Var3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i5);
            io.sentry.android.core.v0.m("GmsClient", sb.toString(), new Exception());
            return;
        }
        eq8 eq8Var4 = (eq8) message.obj;
        synchronized (eq8Var4) {
            try {
                bool = eq8Var4.a;
                if (eq8Var4.b) {
                    String string = eq8Var4.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    io.sentry.android.core.v0.j("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar5 = eq8Var4.f;
            int i6 = eq8Var4.d;
            if (i6 != 0) {
                aVar5.p(1, null);
                Bundle bundle = eq8Var4.e;
                eq8Var4.b(new w41(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!eq8Var4.a()) {
                aVar5.p(1, null);
                eq8Var4.b(new w41(8, null, null));
            }
        }
        synchronized (eq8Var4) {
            eq8Var4.b = true;
        }
        synchronized (eq8Var4) {
            eq8Var4.a = null;
        }
        com.google.android.gms.common.internal.a aVar6 = eq8Var4.c;
        synchronized (aVar6.k) {
            aVar6.k.remove(eq8Var4);
        }
    }
}
