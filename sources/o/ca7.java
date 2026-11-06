package o;

/* JADX INFO: loaded from: classes.dex */
public final class ca7 implements lb8 {
    public final Object a;

    public ca7(Object obj) {
        this.a = obj;
    }

    @Override // o.lb8
    public final Object a(yj5 yj5Var) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ca7) && im3.n(this.a, ((ca7) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ")";
    }
}
