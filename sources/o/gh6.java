package o;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class gh6 implements u14, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f894o = AtomicReferenceFieldUpdater.newUpdater(gh6.class, Object.class, "n");
    public volatile Function0 m;
    public volatile Object n;

    @Override // o.u14
    public final boolean a() {
        return this.n != jk0.Q;
    }

    @Override // o.u14
    public final Object getValue() {
        Object obj = this.n;
        jk0 jk0Var = jk0.Q;
        if (obj != jk0Var) {
            return obj;
        }
        Function0 function0 = this.m;
        if (function0 != null) {
            Object objA = function0.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f894o;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jk0Var, objA)) {
                if (atomicReferenceFieldUpdater.get(this) != jk0Var) {
                }
            }
            this.m = null;
            return objA;
        }
        return this.n;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
