package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class tx8 implements ServiceConnection {
    public byte a = 0;
    public final Messenger b;
    public lh7 c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ gy8 f;

    public tx8(gy8 gy8Var) {
        this.f = gy8Var;
        xp8 xp8Var = new xp8(Looper.getMainLooper(), new qz(this, (byte) 3));
        Looper.getMainLooper();
        this.b = new Messenger(xp8Var);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized boolean a(yx8 yx8Var) throws Throwable {
        tx8 tx8Var;
        Throwable th;
        try {
            try {
                byte b = this.a;
                byte b2 = 0;
                try {
                    if (b != 0) {
                        if (b == 1) {
                            this.d.add(yx8Var);
                            return true;
                        }
                        if (b != 2) {
                            return false;
                        }
                        this.d.add(yx8Var);
                        ((ScheduledExecutorService) this.f.d).execute(new cw8(this, (byte) 1));
                        return true;
                    }
                    this.d.add(yx8Var);
                    try {
                        if (this.a == 0) {
                            if (Log.isLoggable("MessengerIpcClient", 2)) {
                                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                            }
                            this.a = (byte) 1;
                            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                            intent.setPackage("com.google.android.gms");
                            try {
                                d51 d51VarA = d51.a();
                                gy8 gy8Var = this.f;
                                try {
                                    Context context = (Context) gy8Var.c;
                                    try {
                                        tx8Var = this;
                                        try {
                                            try {
                                                if (d51VarA.c(context, context.getClass().getName(), intent, tx8Var, 1, null)) {
                                                    cw8 cw8Var = new cw8(tx8Var, b2);
                                                    ((ScheduledExecutorService) gy8Var.d).schedule(cw8Var, 30L, TimeUnit.SECONDS);
                                                } else {
                                                    tx8Var.b("Unable to bind to service");
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        } catch (SecurityException e) {
                                            e = e;
                                            tx8Var.c("Unable to bind to service", e);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        tx8Var = this;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    tx8Var = this;
                                }
                            } catch (SecurityException e2) {
                                e = e2;
                                tx8Var = this;
                            }
                            return true;
                        }
                        tx8Var = this;
                        try {
                            throw new IllegalStateException();
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                    th = th;
                } catch (Throwable th7) {
                    th = th7;
                    tx8Var = this;
                }
            } catch (Throwable th8) {
                th = th8;
                th = th;
            }
        } catch (Throwable th9) {
            th = th9;
            tx8Var = this;
            th = th;
        }
        throw th;
    }

    public final synchronized void b(String str) {
        c(str, null);
    }

    public final synchronized void c(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            byte b = this.a;
            if (b == 0) {
                throw new IllegalStateException();
            }
            if (b != 1 && b != 2) {
                if (b != 3) {
                    return;
                }
                this.a = (byte) 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = (byte) 4;
            d51.a().b((Context) this.f.c, this);
            dy8 dy8Var = new dy8(str, securityException);
            ArrayDeque arrayDeque = this.d;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((yx8) it.next()).c(dy8Var);
            }
            arrayDeque.clear();
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.e;
                if (i >= sparseArray.size()) {
                    sparseArray.clear();
                    return;
                } else {
                    ((yx8) sparseArray.valueAt(i)).c(dy8Var);
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = (byte) 3;
                d51.a().b((Context) this.f.c, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.d).execute(new st8((Object) this, (Object) iBinder, (byte) 3));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.d).execute(new cw8(this, (byte) 2));
    }
}
