package o;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class lg2 extends jg2 {
    public final WindowLayoutComponent a;
    public final f71 b;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public lg2(WindowLayoutComponent windowLayoutComponent, f71 f71Var) {
        this.a = windowLayoutComponent;
        this.b = f71Var;
    }

    @Override // o.jg2, o.ej8
    public void a(Context context, xv xvVar, zr zrVar) {
        LinkedHashMap linkedHashMap = this.d;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.e;
            if (multicastConsumer != null) {
                multicastConsumer.a(zrVar);
                linkedHashMap2.put(zrVar, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(zrVar, context);
                multicastConsumer2.a(zrVar);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(ea2.m));
                } else {
                    this.f.put(multicastConsumer2, this.b.a(this.a, w86.a.b(WindowLayoutInfo.class), (Activity) context, new kg2(1, multicastConsumer2, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o.jg2, o.ej8
    public void b(zr zrVar) {
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.e;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(zrVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.d;
            ReentrantLock reentrantLock2 = multicastConsumer.b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(zrVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(zrVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    e71 e71Var = (e71) this.f.remove(multicastConsumer);
                    if (e71Var != null) {
                        e71Var.a.invoke(e71Var.b, e71Var.c);
                    }
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
