package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cw8 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ tx8 n;

    public /* synthetic */ cw8(tx8 tx8Var, byte b) {
        this.m = b;
        this.n = tx8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.m) {
            case 0:
                tx8 tx8Var = this.n;
                synchronized (tx8Var) {
                    if (tx8Var.a == 1) {
                        tx8Var.b("Timed out while binding");
                    }
                    break;
                }
                return;
            case 1:
                break;
            default:
                this.n.b("Service disconnected");
                return;
        }
        while (true) {
            tx8 tx8Var2 = this.n;
            synchronized (tx8Var2) {
                try {
                    if (tx8Var2.a != 2) {
                        return;
                    }
                    ArrayDeque arrayDeque = tx8Var2.d;
                    if (arrayDeque.isEmpty()) {
                        tx8Var2.d();
                        return;
                    }
                    yx8 yx8Var = (yx8) arrayDeque.poll();
                    SparseArray sparseArray = tx8Var2.e;
                    int i = yx8Var.a;
                    sparseArray.put(i, yx8Var);
                    ((ScheduledExecutorService) tx8Var2.f.d).schedule(new st8((Object) tx8Var2, (Object) yx8Var, (byte) 5), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(yx8Var)));
                    }
                    gy8 gy8Var = tx8Var2.f;
                    Messenger messenger = tx8Var2.b;
                    byte b = yx8Var.c;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = b;
                    messageObtain.arg1 = i;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", yx8Var.a());
                    bundle.putString("pkg", ((Context) gy8Var.c).getPackageName());
                    bundle.putBundle("data", yx8Var.d);
                    messageObtain.setData(bundle);
                    try {
                        lh7 lh7Var = tx8Var2.c;
                        Messenger messenger2 = (Messenger) lh7Var.n;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            dt8 dt8Var = (dt8) lh7Var.f1364o;
                            if (dt8Var == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            dt8Var.m.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        tx8Var2.b(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
