package o;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class dt5 {
    public static final String l = we4.i("Processor");
    public final Context b;
    public final d11 c;
    public final yc4 d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public dt5(Context context, d11 d11Var, yc4 yc4Var, WorkDatabase workDatabase) {
        this.b = context;
        this.c = d11Var;
        this.d = yc4Var;
        this.e = workDatabase;
    }

    public static boolean d(String str, nn8 nn8Var, int i) {
        String str2 = l;
        if (nn8Var == null) {
            we4.f().c(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        nn8Var.l.i(new en8(i));
        we4 we4VarF = we4.f();
        StringBuilder sbP = ua5.p("WorkerWrapper interrupted for ", str, " (");
        sbP.append(nn8Var.a.c);
        sbP.append("), reason: ");
        sbP.append(i);
        we4VarF.c(str2, sbP.toString());
        return true;
    }

    public final void a(se2 se2Var) {
        synchronized (this.k) {
            this.j.add(se2Var);
        }
    }

    public final nn8 b(String str) {
        nn8 nn8Var = (nn8) this.f.remove(str);
        boolean z = nn8Var != null;
        if (!z) {
            nn8Var = (nn8) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        String str2 = qh7.v;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.b.startService(intent);
                        } catch (Throwable th) {
                            we4.f().e(l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return nn8Var;
    }

    public final nn8 c(String str) {
        nn8 nn8Var = (nn8) this.f.get(str);
        return nn8Var == null ? (nn8) this.g.get(str) : nn8Var;
    }
}
