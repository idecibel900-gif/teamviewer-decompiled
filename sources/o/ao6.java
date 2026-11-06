package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class ao6 implements bl0, ug8 {
    public static final /* synthetic */ long r = defpackage.a.a.objectFieldOffset(ao6.class.getDeclaredField("state$volatile"));
    public final de1 m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f344o;
    private volatile /* synthetic */ Object state$volatile = e8.t;
    public ArrayList n = new ArrayList(2);
    public int p = -1;
    public Object q = e8.w;

    public ao6(de1 de1Var) {
        this.m = de1Var;
    }

    @Override // o.ug8
    public final void a(tn6 tn6Var, int i) {
        this.f344o = tn6Var;
        this.p = i;
    }

    @Override // o.bl0
    public final void b(Throwable th) {
        ao6 ao6Var;
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = r;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == e8.u) {
                return;
            }
            hr2 hr2Var = e8.v;
            while (true) {
                Unsafe unsafe2 = defpackage.a.a;
                ao6Var = this;
                if (unsafe2.compareAndSwapObject(ao6Var, r, objectVolatile, hr2Var)) {
                    ArrayList arrayList = ao6Var.n;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((yn6) it.next()).a();
                    }
                    ao6Var.q = e8.w;
                    ao6Var.n = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(ao6Var, j) != objectVolatile) {
                    break;
                } else {
                    this = ao6Var;
                }
            }
            this = ao6Var;
        }
    }

    public final Object c(jc1 jc1Var) {
        Unsafe unsafe = defpackage.a.a;
        long j = r;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        objectVolatile.getClass();
        yn6 yn6Var = (yn6) objectVolatile;
        Object obj = yn6Var.d;
        Object obj2 = this.q;
        ArrayList<yn6> arrayList = this.n;
        if (arrayList != null) {
            for (yn6 yn6Var2 : arrayList) {
                if (yn6Var2 != yn6Var) {
                    yn6Var2.a();
                }
            }
            defpackage.a.a.putObjectVolatile(this, j, e8.u);
            this.q = e8.w;
            this.n = null;
        }
        Object objD = yn6Var.c.d(yn6Var.a, obj, obj2);
        hc1 hc1Var = yn6Var.e;
        return obj == e8.x ? ((Function1) hc1Var).invoke(jc1Var) : ((hw2) hc1Var).invoke(objD, jc1Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object d(jc1 jc1Var) {
        zn6 zn6Var;
        Object obj;
        gl0 gl0Var;
        Unsafe unsafe;
        if (jc1Var instanceof zn6) {
            zn6Var = (zn6) jc1Var;
            int i = zn6Var.f2722o;
            if ((i & Integer.MIN_VALUE) != 0) {
                zn6Var.f2722o = i - Integer.MIN_VALUE;
            } else {
                zn6Var = new zn6(this, jc1Var);
            }
        } else {
            zn6Var = new zn6(this, jc1Var);
        }
        zn6 zn6Var2 = zn6Var;
        Object obj2 = zn6Var2.m;
        int i2 = zn6Var2.f2722o;
        Object obj3 = ne1.m;
        if (i2 == 0) {
            ct1.a0(obj2);
            zn6Var2.f2722o = 1;
            gl0 gl0Var2 = new gl0(1, vt1.A(zn6Var2));
            gl0Var2.t();
            loop0: while (true) {
                Unsafe unsafe2 = defpackage.a.a;
                long j = r;
                Object objectVolatile = unsafe2.getObjectVolatile(this, j);
                gl0 gl0Var3 = gl0Var2;
                hr2 hr2Var = e8.t;
                obj = f88.a;
                if (objectVolatile == hr2Var) {
                    gl0 gl0Var4 = gl0Var3;
                    while (true) {
                        Unsafe unsafe3 = defpackage.a.a;
                        gl0Var = gl0Var4;
                        if (unsafe3.compareAndSwapObject(this, r, objectVolatile, gl0Var4)) {
                            gl0Var.w(this);
                            break loop0;
                        }
                        if (unsafe3.getObjectVolatile(this, j) != objectVolatile) {
                            break;
                        }
                        gl0Var4 = gl0Var;
                    }
                    gl0Var2 = gl0Var;
                } else {
                    gl0Var = gl0Var3;
                    if (!(objectVolatile instanceof List)) {
                        if (!(objectVolatile instanceof yn6)) {
                            hk0.f(objectVolatile, "unexpected state: ");
                            return null;
                        }
                        yn6 yn6Var = (yn6) objectVolatile;
                        Object obj4 = this.q;
                        iw2 iw2Var = yn6Var.f;
                        gl0Var.g(obj, iw2Var != null ? (iw2) iw2Var.d(this, yn6Var.d, obj4) : null);
                        break;
                    }
                    do {
                        unsafe = defpackage.a.a;
                        if (unsafe.compareAndSwapObject(this, r, objectVolatile, hr2Var)) {
                            Iterator it = ((Iterable) objectVolatile).iterator();
                            while (it.hasNext()) {
                                yn6 yn6VarE = e(it.next());
                                yn6VarE.getClass();
                                yn6VarE.g = null;
                                yn6VarE.h = -1;
                                f(yn6VarE, true);
                            }
                            break;
                        }
                    } while (unsafe.getObjectVolatile(this, j) == objectVolatile);
                    gl0Var2 = gl0Var;
                }
            }
            Object objQ = gl0Var.q();
            if (objQ == obj3) {
                obj = objQ;
            }
            if (obj != obj3) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(obj2);
                return obj2;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ct1.a0(obj2);
        zn6Var2.f2722o = 2;
        Object objC = c(zn6Var2);
        return objC == obj3 ? obj3 : objC;
    }

    public final yn6 e(Object obj) {
        Object next;
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((yn6) next).a != obj);
        yn6 yn6Var = (yn6) next;
        if (yn6Var != null) {
            return yn6Var;
        }
        an4.h(obj, " is not found", "Clause with object ");
        return null;
    }

    public final void f(yn6 yn6Var, boolean z) {
        Object obj = yn6Var.a;
        Unsafe unsafe = defpackage.a.a;
        long j = r;
        if (unsafe.getObjectVolatile(this, j) instanceof yn6) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.n;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((yn6) it.next()).a == obj) {
                        yq4.k(obj, "Cannot use select clauses on the same object: ");
                        return;
                    }
                }
            }
        }
        yn6Var.b.d(obj, this, yn6Var.d);
        if (this.q != e8.w) {
            defpackage.a.a.putObjectVolatile(this, j, yn6Var);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.n;
            arrayList2.getClass();
            arrayList2.add(yn6Var);
        }
        yn6Var.g = this.f344o;
        yn6Var.h = this.p;
        this.f344o = null;
        this.p = -1;
    }

    public final int g(Object obj, Object obj2) {
        ao6 ao6Var;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            Unsafe unsafe3 = defpackage.a.a;
            long j = r;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof fl0) {
                yn6 yn6VarE = this.e(obj);
                if (yn6VarE != null) {
                    iw2 iw2Var = yn6VarE.f;
                    iw2 iw2Var2 = iw2Var != null ? (iw2) iw2Var.d(this, yn6VarE.d, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = defpackage.a.a;
                        ao6Var = this;
                        if (unsafe4.compareAndSwapObject(ao6Var, r, objectVolatile, yn6VarE)) {
                            fl0 fl0Var = (fl0) objectVolatile;
                            ao6Var.q = obj2;
                            hr2 hr2VarO = fl0Var.o(f88.a, iw2Var2);
                            if (hr2VarO == null) {
                                ao6Var.q = e8.w;
                                return 2;
                            }
                            fl0Var.s(hr2VarO);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(ao6Var, j) != objectVolatile) {
                            break;
                        }
                        this = ao6Var;
                    }
                } else {
                    continue;
                }
            } else {
                ao6Var = this;
                if (im3.n(objectVolatile, e8.u) || (objectVolatile instanceof yn6)) {
                    return 3;
                }
                if (im3.n(objectVolatile, e8.v)) {
                    return 2;
                }
                if (im3.n(objectVolatile, e8.t)) {
                    List listK = qf0.K(obj);
                    do {
                        unsafe2 = defpackage.a.a;
                        if (unsafe2.compareAndSwapObject(ao6Var, r, objectVolatile, listK)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(ao6Var, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        hk0.f(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    ArrayList arrayListB0 = lv0.B0((Collection) objectVolatile, obj);
                    do {
                        unsafe = defpackage.a.a;
                        if (unsafe.compareAndSwapObject(ao6Var, r, objectVolatile, arrayListB0)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(ao6Var, j) == objectVolatile);
                }
            }
            this = ao6Var;
        }
    }
}
