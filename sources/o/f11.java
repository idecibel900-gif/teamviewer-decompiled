package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f11 implements lb8 {
    public final Function1 a;

    public f11(Function1 function1) {
        this.a = function1;
    }

    @Override // o.lb8
    public final Object a(yj5 yj5Var) {
        return this.a.invoke(yj5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f11) && im3.n(this.a, ((f11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
