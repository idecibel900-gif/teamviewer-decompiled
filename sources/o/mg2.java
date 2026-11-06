package o;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class mg2 extends lg2 {
    public final ReentrantLock g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public mg2(WindowLayoutComponent windowLayoutComponent, f71 f71Var) {
        super(windowLayoutComponent, f71Var);
        this.g = new ReentrantLock();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    @Override // o.lg2, o.jg2, o.ej8
    public final void a(Context context, xv xvVar, zr zrVar) {
        LinkedHashMap linkedHashMap = this.h;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            tv4 tv4Var = (tv4) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.i;
            if (tv4Var != null) {
                tv4Var.a(zrVar);
                linkedHashMap2.put(zrVar, context);
            } else {
                tv4 tv4Var2 = new tv4(context);
                linkedHashMap.put(context, tv4Var2);
                linkedHashMap2.put(zrVar, context);
                tv4Var2.a(zrVar);
                this.a.addWindowLayoutInfoListener(context, tv4Var2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o.lg2, o.jg2, o.ej8
    public final void b(zr zrVar) {
        LinkedHashMap linkedHashMap = this.h;
        LinkedHashMap linkedHashMap2 = this.i;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(zrVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            tv4 tv4Var = (tv4) linkedHashMap.get(context);
            if (tv4Var == null) {
                reentrantLock.unlock();
                return;
            }
            ReentrantLock reentrantLock2 = tv4Var.b;
            reentrantLock2.lock();
            try {
                tv4Var.d.remove(zrVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(zrVar);
                if (tv4Var.d.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.a.removeWindowLayoutInfoListener(tv4Var);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
