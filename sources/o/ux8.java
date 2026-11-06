package o;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ux8 {
    public static final Object g = new Object();
    public static ux8 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile xp8 c;
    public final d51 d;
    public final short e;
    public final int f;

    public ux8(Context context, Looper looper) {
        qz qzVar = new qz(this, (byte) 4);
        this.b = context.getApplicationContext();
        xp8 xp8Var = new xp8(looper, qzVar);
        Looper.getMainLooper();
        this.c = xp8Var;
        this.d = d51.a();
        this.e = (short) 5000;
        this.f = 300000;
    }

    public final w41 a(nx8 nx8Var, pt8 pt8Var, String str) {
        w41 w41VarA;
        HashMap map = this.a;
        synchronized (map) {
            try {
                qx8 qx8Var = (qx8) map.get(nx8Var);
                if (qx8Var == null) {
                    qx8Var = new qx8(this, nx8Var);
                    qx8Var.a.put(pt8Var, pt8Var);
                    w41VarA = qx8Var.a(str, null);
                    map.put(nx8Var, qx8Var);
                } else {
                    this.c.removeMessages(0, nx8Var);
                    if (qx8Var.a.containsKey(pt8Var)) {
                        String string = nx8Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    qx8Var.a.put(pt8Var, pt8Var);
                    byte b = qx8Var.b;
                    if (b == 1) {
                        pt8Var.onServiceConnected(qx8Var.f, qx8Var.d);
                    } else if (b == 2) {
                        w41VarA = qx8Var.a(str, null);
                    }
                    w41VarA = null;
                }
                if (qx8Var.c) {
                    return w41.r;
                }
                if (w41VarA == null) {
                    w41VarA = new w41(-1, null, null);
                }
                return w41VarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, ServiceConnection serviceConnection, boolean z) {
        nx8 nx8Var = new nx8(str, z);
        nv1.t(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.a;
        synchronized (map) {
            try {
                qx8 qx8Var = (qx8) map.get(nx8Var);
                if (qx8Var == null) {
                    String string = nx8Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!qx8Var.a.containsKey(serviceConnection)) {
                    String string2 = nx8Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                qx8Var.a.remove(serviceConnection);
                if (qx8Var.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, nx8Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
