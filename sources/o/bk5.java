package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class bk5 extends w1 implements Map, vu3 {
    public zj5 m;
    public aw n = new aw(27);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s28 f435o;
    public Object p;
    public int q;
    public int r;

    public bk5(zj5 zj5Var) {
        this.m = zj5Var;
        this.f435o = zj5Var.m;
        this.r = zj5Var.n;
    }

    @Override // o.w1
    public final Set a() {
        return new dk5(this, (byte) 0);
    }

    @Override // o.w1
    public final Set b() {
        return new dk5(this, (byte) 1);
    }

    @Override // o.w1
    public final int c() {
        return this.r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f435o = s28.e;
        g(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f435o.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // o.w1
    public final Collection d() {
        return new km4(this, (byte) 1);
    }

    /* JADX INFO: renamed from: e */
    public zj5 f() {
        s28 s28Var = this.f435o;
        zj5 zj5Var = this.m;
        if (s28Var != zj5Var.m) {
            this.n = new aw((byte) 27);
            zj5Var = new zj5(this.f435o, this.r);
        }
        this.m = zj5Var;
        return zj5Var;
    }

    public /* bridge */ zj5 f() {
        return f();
    }

    public final void g(int i) {
        this.r = i;
        this.q++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f435o.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.p = null;
        this.f435o = this.f435o.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zj5 zj5VarE = null;
        zj5 zj5Var = map instanceof zj5 ? (zj5) map : null;
        if (zj5Var == null) {
            bk5 bk5Var = map instanceof bk5 ? (bk5) map : null;
            if (bk5Var != null) {
                zj5VarE = bk5Var.f();
            }
        } else {
            zj5VarE = zj5Var;
        }
        if (zj5VarE == null) {
            super.putAll(map);
            return;
        }
        hn1 hn1Var = new hn1();
        hn1Var.a = 0;
        int i = this.r;
        this.f435o = this.f435o.m(zj5VarE.m, 0, hn1Var, this);
        int i2 = (zj5VarE.n + i) - hn1Var.a;
        if (i != i2) {
            g(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.r;
        s28 s28VarO = this.f435o.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (s28VarO == null) {
            s28VarO = s28.e;
        }
        this.f435o = s28VarO;
        return i != this.r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.p = null;
        s28 s28VarN = this.f435o.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (s28VarN == null) {
            s28VarN = s28.e;
        }
        this.f435o = s28VarN;
        return this.p;
    }
}
