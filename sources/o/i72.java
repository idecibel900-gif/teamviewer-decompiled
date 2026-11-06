package o;

/* JADX INFO: loaded from: classes.dex */
public final class i72 implements lb8 {
    public final bg5 a;

    public i72(bg5 bg5Var) {
        this.a = bg5Var;
    }

    @Override // o.lb8
    public final Object a(yj5 yj5Var) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i72) && this.a == ((i72) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ")";
    }
}
