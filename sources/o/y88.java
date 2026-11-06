package o;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class y88 implements u14, Serializable {
    public Function0 m;
    public Object n;

    @Override // o.u14
    public final boolean a() {
        return this.n != jk0.Q;
    }

    @Override // o.u14
    public final Object getValue() {
        Object obj = this.n;
        if (obj != jk0.Q) {
            return obj;
        }
        Function0 function0 = this.m;
        function0.getClass();
        Object objA = function0.a();
        this.n = objA;
        this.m = null;
        return objA;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
