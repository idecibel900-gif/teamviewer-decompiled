package o;

/* JADX INFO: loaded from: classes.dex */
public final class yj5 extends zj5 implements x01, u01 {
    public static final yj5 p = new yj5(s28.e, 0);

    @Override // o.u01
    public final Object T(zw5 zw5Var) {
        return di1.z(this, zw5Var);
    }

    @Override // o.zj5
    public final bk5 a() {
        xj5 xj5Var = new xj5(this);
        xj5Var.s = this;
        return xj5Var;
    }

    @Override // o.zj5
    public final bk5 b() {
        xj5 xj5Var = new xj5(this);
        xj5Var.s = this;
        return xj5Var;
    }

    @Override // o.zj5, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof zw5) {
            return super.containsKey((zw5) obj);
        }
        return false;
    }

    @Override // o.zj5, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof lb8) {
            return super.containsValue((lb8) obj);
        }
        return false;
    }

    public final yj5 d(zw5 zw5Var, lb8 lb8Var) {
        io.sentry.android.core.u0 u0VarU = this.m.u(zw5Var.hashCode(), 0, zw5Var, lb8Var);
        return u0VarU == null ? this : new yj5((s28) u0VarU.f127o, this.n + (u0VarU.n ? 1 : 0));
    }

    @Override // o.zj5, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof zw5) {
            return (lb8) super.get((zw5) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof zw5) ? obj2 : (lb8) super.getOrDefault((zw5) obj, (lb8) obj2);
    }
}
