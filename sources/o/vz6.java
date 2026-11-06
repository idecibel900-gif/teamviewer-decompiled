package o;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class vz6 implements ej8 {
    public static volatile vz6 c;
    public static final ReentrantLock d = new ReentrantLock();
    public final xf2 a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public vz6(tz6 tz6Var) {
        this.a = tz6Var;
        if (tz6Var != null) {
            tz6Var.d(new g95(this));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.ej8
    public final void a(Context context, xv xvVar, zr zrVar) {
        Object next;
        WindowManager.LayoutParams attributes;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        ea2 ea2Var = ea2.m;
        if (activity == null) {
            zrVar.accept(new bl8(ea2Var));
            return;
        }
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            xf2 xf2Var = this.a;
            if (xf2Var == null) {
                zrVar.accept(new bl8(ea2Var));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            boolean z = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (((uz6) it.next()).a.equals(activity)) {
                        z = true;
                        break;
                    }
                }
            }
            uz6 uz6Var = new uz6(activity, xvVar, zrVar);
            copyOnWriteArrayList.add(uz6Var);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!activity.equals(((uz6) next).a));
                uz6 uz6Var2 = (uz6) next;
                bl8 bl8Var = uz6Var2 != null ? uz6Var2.c : null;
                if (bl8Var != null) {
                    uz6Var.c = bl8Var;
                    uz6Var.b.accept(bl8Var);
                }
            } else {
                tz6 tz6Var = (tz6) xf2Var;
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    tz6Var.c(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new eu2(tz6Var, activity));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o.ej8
    public final void b(zr zrVar) {
        synchronized (d) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    uz6 uz6Var = (uz6) it.next();
                    if (uz6Var.b == zrVar) {
                        arrayList.add(uz6Var);
                    }
                }
                this.b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((uz6) it2.next()).a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((uz6) it3.next()).a.equals(activity)) {
                                }
                            }
                        }
                    }
                    xf2 xf2Var = this.a;
                    if (xf2Var != null) {
                        ((tz6) xf2Var).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
