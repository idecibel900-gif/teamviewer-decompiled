package o;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class kh7 implements u14, Serializable {
    public Function0 m;
    public volatile Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f1267o;

    public kh7(Function0 function0) {
        function0.getClass();
        this.m = function0;
        this.n = jk0.Q;
        this.f1267o = this;
    }

    @Override // o.u14
    public final boolean a() {
        return this.n != jk0.Q;
    }

    @Override // o.u14
    public final Object getValue() {
        Object objA;
        Object obj = this.n;
        jk0 jk0Var = jk0.Q;
        if (obj != jk0Var) {
            return obj;
        }
        synchronized (this.f1267o) {
            objA = this.n;
            if (objA == jk0Var) {
                Function0 function0 = this.m;
                function0.getClass();
                objA = function0.a();
                this.n = objA;
                this.m = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
