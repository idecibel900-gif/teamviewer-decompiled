package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class qx8 implements ServiceConnection {
    public final HashMap a = new HashMap();
    public byte b = 2;
    public boolean c;
    public IBinder d;
    public final nx8 e;
    public ComponentName f;
    public final /* synthetic */ ux8 g;

    public qx8(ux8 ux8Var, nx8 nx8Var) {
        this.g = ux8Var;
        this.e = nx8Var;
    }

    public final w41 a(String str, Executor executor) {
        try {
            Intent intentA = tq8.a(this.g.b, this.e);
            this.b = (byte) 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(qr8.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                ux8 ux8Var = this.g;
                d51 d51Var = ux8Var.d;
                Context context = ux8Var.b;
                nx8 nx8Var = this.e;
                boolean zC = d51Var.c(context, str, intentA, this, 4225, executor);
                this.c = zC;
                if (zC) {
                    ux8Var.c.sendMessageDelayed(ux8Var.c.obtainMessage(1, nx8Var), ux8Var.f);
                    return w41.r;
                }
                this.b = (byte) 2;
                try {
                    ux8Var.d.b(ux8Var.b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new w41(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (mq8 e) {
            return e.m;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ux8 ux8Var = this.g;
        synchronized (ux8Var.a) {
            try {
                ux8Var.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = (byte) 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ux8 ux8Var = this.g;
        synchronized (ux8Var.a) {
            try {
                ux8Var.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = (byte) 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
