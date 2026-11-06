package o;

/* JADX INFO: loaded from: classes.dex */
public final class rw4 extends lm4 implements uu3 {
    public final ek5 p;
    public Object q;

    public rw4(ek5 ek5Var, Object obj, Object obj2) {
        super(obj, obj2, (byte) 0);
        this.p = ek5Var;
        this.q = obj2;
    }

    @Override // o.lm4, java.util.Map.Entry
    public final Object getValue() {
        return this.q;
    }

    @Override // o.lm4, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.q;
        this.q = obj;
        ck5 ck5Var = (ck5) this.p.n;
        bk5 bk5Var = ck5Var.p;
        Object obj3 = this.n;
        if (!bk5Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = ck5Var.f333o;
        if (!z) {
            bk5Var.put(obj3, obj);
        } else {
            if (!z) {
                yq4.p();
                return null;
            }
            t28 t28Var = ck5Var.m[ck5Var.n];
            Object obj4 = t28Var.m[t28Var.f2073o];
            bk5Var.put(obj3, obj);
            ck5Var.c(obj4 != null ? obj4.hashCode() : 0, bk5Var.f435o, obj4, 0);
        }
        ck5Var.s = bk5Var.q;
        return obj2;
    }
}
