package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class l57 implements s97, Map, vu3 {
    public k57 m;
    public final w47 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w47 f1331o;
    public final w47 p;

    public l57() {
        zj5 zj5Var = zj5.f2711o;
        n47 n47VarH = v47.h();
        k57 k57Var = new k57(n47VarH.g(), zj5Var);
        if (!(n47VarH instanceof lz2)) {
            k57Var.b = new k57(1L, zj5Var);
        }
        this.m = k57Var;
        this.n = new w47(this, (byte) 0);
        this.f1331o = new w47(this, (byte) 1);
        this.p = new w47(this, (byte) 2);
    }

    public static boolean a(k57 k57Var, int i, zj5 zj5Var) {
        boolean z;
        synchronized (j51.x) {
            int i2 = k57Var.d;
            if (i2 == i) {
                k57Var.c = zj5Var;
                z = true;
                k57Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final k57 b() {
        return (k57) v47.s(this.m, this);
    }

    @Override // java.util.Map
    public final void clear() {
        n47 n47VarH;
        zj5 zj5Var = ((k57) v47.f(this.m)).c;
        zj5 zj5Var2 = zj5.f2711o;
        if (zj5Var2 != zj5Var) {
            k57 k57Var = this.m;
            synchronized (v47.c) {
                n47VarH = v47.h();
                k57 k57Var2 = (k57) v47.w(k57Var, this, n47VarH);
                synchronized (j51.x) {
                    k57Var2.c = zj5Var2;
                    k57Var2.d++;
                }
            }
            v47.l(n47VarH, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return b().c.containsValue(obj);
    }

    @Override // o.s97
    public final u97 d() {
        return this.m;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.n;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return b().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return b().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f1331o;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        zj5 zj5Var;
        int i;
        Object objPut;
        n47 n47VarH;
        boolean zA;
        do {
            synchronized (j51.x) {
                k57 k57Var = (k57) v47.f(this.m);
                zj5Var = k57Var.c;
                i = k57Var.d;
            }
            zj5Var.getClass();
            bk5 bk5VarB = zj5Var.b();
            objPut = bk5VarB.put(obj, obj2);
            zj5 zj5VarF = bk5VarB.f();
            if (im3.n(zj5VarF, zj5Var)) {
                break;
            }
            k57 k57Var2 = this.m;
            synchronized (v47.c) {
                n47VarH = v47.h();
                zA = a((k57) v47.w(k57Var2, this, n47VarH), i, zj5VarF);
            }
            v47.l(n47VarH, this);
        } while (!zA);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        zj5 zj5Var;
        int i;
        n47 n47VarH;
        boolean zA;
        do {
            synchronized (j51.x) {
                k57 k57Var = (k57) v47.f(this.m);
                zj5Var = k57Var.c;
                i = k57Var.d;
            }
            zj5Var.getClass();
            bk5 bk5VarB = zj5Var.b();
            bk5VarB.putAll(map);
            zj5 zj5VarF = bk5VarB.f();
            if (im3.n(zj5VarF, zj5Var)) {
                return;
            }
            k57 k57Var2 = this.m;
            synchronized (v47.c) {
                n47VarH = v47.h();
                zA = a((k57) v47.w(k57Var2, this, n47VarH), i, zj5VarF);
            }
            v47.l(n47VarH, this);
        } while (!zA);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        zj5 zj5Var;
        int i;
        V vRemove;
        n47 n47VarH;
        boolean zA;
        do {
            synchronized (j51.x) {
                k57 k57Var = (k57) v47.f(this.m);
                zj5Var = k57Var.c;
                i = k57Var.d;
            }
            zj5Var.getClass();
            bk5 bk5VarB = zj5Var.b();
            vRemove = bk5VarB.remove(obj);
            zj5 zj5VarF = bk5VarB.f();
            if (im3.n(zj5VarF, zj5Var)) {
                break;
            }
            k57 k57Var2 = this.m;
            synchronized (v47.c) {
                n47VarH = v47.h();
                zA = a((k57) v47.w(k57Var2, this, n47VarH), i, zj5VarF);
            }
            v47.l(n47VarH, this);
        } while (!zA);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        zj5 zj5Var = b().c;
        zj5Var.getClass();
        return zj5Var.n;
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((k57) v47.f(this.m)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.p;
    }

    @Override // o.s97
    public final void x(u97 u97Var) {
        this.m = (k57) u97Var;
    }
}
