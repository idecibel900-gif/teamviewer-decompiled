package o;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class cy8 {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final hr2 b;
    public boolean g;
    public final Intent h;
    public xs8 l;
    public hu8 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final ow8 j = new IBinder.DeathRecipient() { // from class: o.ow8
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            cy8 cy8Var = this.a;
            cy8Var.b.a("reportBinderDeath", new Object[0]);
            if (cy8Var.i.get() != null) {
                io.sentry.h2.f();
                return;
            }
            cy8Var.b.a("%s : Binder has died.", cy8Var.c);
            for (bw8 bw8Var : cy8Var.d) {
                RemoteException remoteException = new RemoteException(String.valueOf(cy8Var.c).concat(" : Binder has died."));
                do7 do7Var = bw8Var.m;
                if (do7Var != null) {
                    do7Var.b(remoteException);
                }
            }
            cy8Var.d.clear();
            synchronized (cy8Var.f) {
                cy8Var.c();
            }
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [o.ow8] */
    public cy8(Context context, hr2 hr2Var, Intent intent) {
        this.a = context;
        this.b = hr2Var;
        this.h = intent;
    }

    public static void b(cy8 cy8Var, gu8 gu8Var) {
        hu8 hu8Var = cy8Var.m;
        hr2 hr2Var = cy8Var.b;
        ArrayList<bw8> arrayList = cy8Var.d;
        if (hu8Var != null || cy8Var.g) {
            if (!cy8Var.g) {
                gu8Var.run();
                return;
            } else {
                hr2Var.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(gu8Var);
                return;
            }
        }
        hr2Var.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(gu8Var);
        xs8 xs8Var = new xs8(cy8Var, (byte) 1);
        cy8Var.l = xs8Var;
        cy8Var.g = true;
        if (cy8Var.a.bindService(cy8Var.h, xs8Var, 1)) {
            return;
        }
        hr2Var.a("Failed to bind to the service.", new Object[0]);
        cy8Var.g = false;
        for (bw8 bw8Var : arrayList) {
            ey8 ey8Var = new ey8("Failed to bind to the service.");
            do7 do7Var = bw8Var.m;
            if (do7Var != null) {
                do7Var.b(ey8Var);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((do7) it.next()).b(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
