package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class op3 implements bp3 {
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = defpackage.a.a;
        n = unsafe.objectFieldOffset(op3.class.getDeclaredField("_state$volatile"));
        m = unsafe.objectFieldOffset(op3.class.getDeclaredField("_parentHandle$volatile"));
    }

    public op3(boolean z) {
        this._state$volatile = z ? ka0.s : ka0.r;
    }

    public static qq0 Q(zd4 zd4Var) {
        while (zd4Var.k()) {
            zd4Var = zd4Var.j();
        }
        while (true) {
            zd4Var = zd4Var.i();
            if (!zd4Var.k()) {
                if (zd4Var instanceof qq0) {
                    return (qq0) zd4Var;
                }
                if (zd4Var instanceof l45) {
                    return null;
                }
            }
        }
    }

    public static String X(Object obj) {
        if (!(obj instanceof np3)) {
            if (obj instanceof ng3) {
                return ((ng3) obj).e() ? "Active" : "New";
            }
            return obj instanceof xx0 ? "Cancelled" : "Completed";
        }
        np3 np3Var = (np3) obj;
        if (np3Var.c()) {
            return "Cancelling";
        }
        return np3Var.d() ? "Completing" : "Active";
    }

    public final Throwable A(np3 np3Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (np3Var.c()) {
                return new cp3(t(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof pv7) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof pv7)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean B() {
        return true;
    }

    public boolean C() {
        return this instanceof qx0;
    }

    public final l45 D(ng3 ng3Var) {
        l45 l45VarF = ng3Var.f();
        if (l45VarF != null) {
            return l45VarF;
        }
        if (ng3Var instanceof u92) {
            return new l45();
        }
        if (ng3Var instanceof jp3) {
            V((jp3) ng3Var);
            return null;
        }
        hk0.f(ng3Var, "State should have list: ");
        return null;
    }

    public final Object E() {
        return defpackage.a.a.getObjectVolatile(this, n);
    }

    public Object F(jc1 jc1Var) {
        return h(jc1Var);
    }

    public boolean H(Throwable th) {
        return false;
    }

    @Override // o.de1
    public final de1 H0(de1 de1Var) {
        return xk0.G(this, de1Var);
    }

    public void I(yx0 yx0Var) {
        throw yx0Var;
    }

    public final void J(bp3 bp3Var) {
        long j = m;
        r45 r45Var = r45.m;
        if (bp3Var == null) {
            defpackage.a.a.putObjectVolatile(this, j, r45Var);
            return;
        }
        bp3Var.start();
        pq0 pq0VarC0 = bp3Var.c0(this);
        Unsafe unsafe = defpackage.a.a;
        unsafe.putObjectVolatile(this, j, pq0VarC0);
        if (L()) {
            pq0VarC0.a();
            unsafe.putObjectVolatile(this, j, r45Var);
        }
    }

    public final t22 K(boolean z, jp3 jp3Var) {
        op3 op3Var;
        jp3 jp3Var2;
        boolean zC;
        jp3Var.p = this;
        loop0: while (true) {
            Object objE = this.E();
            if (!(objE instanceof u92)) {
                op3Var = this;
                jp3Var2 = jp3Var;
                boolean z2 = objE instanceof ng3;
                r45 r45Var = r45.m;
                if (z2) {
                    ng3 ng3Var = (ng3) objE;
                    l45 l45VarF = ng3Var.f();
                    if (l45VarF == null) {
                        op3Var.V((jp3) objE);
                    } else {
                        if (jp3Var2.m()) {
                            np3 np3Var = ng3Var instanceof np3 ? (np3) ng3Var : null;
                            Throwable thB = np3Var != null ? np3Var.b() : null;
                            if (thB == null) {
                                zC = l45VarF.c(jp3Var2, 5);
                            } else if (z) {
                                jp3Var2.n(thB);
                                return r45Var;
                            }
                        } else {
                            zC = l45VarF.c(jp3Var2, 1);
                        }
                        if (zC) {
                            break;
                        }
                    }
                    this = op3Var;
                    jp3Var = jp3Var2;
                } else if (z) {
                    Object objE2 = op3Var.E();
                    xx0 xx0Var = objE2 instanceof xx0 ? (xx0) objE2 : null;
                    jp3Var2.n(xx0Var != null ? xx0Var.a : null);
                }
                return r45Var;
            }
            u92 u92Var = (u92) objE;
            if (u92Var.m) {
                while (true) {
                    Unsafe unsafe = defpackage.a.a;
                    long j = n;
                    op3Var = this;
                    jp3Var2 = jp3Var;
                    if (unsafe.compareAndSwapObject(op3Var, j, objE, jp3Var2)) {
                        break loop0;
                    }
                    if (unsafe.getObjectVolatile(op3Var, j) != objE) {
                        break;
                    }
                    this = op3Var;
                    jp3Var = jp3Var2;
                }
            } else {
                op3Var = this;
                jp3Var2 = jp3Var;
                op3Var.U(u92Var);
            }
            this = op3Var;
            jp3Var = jp3Var2;
        }
        return jp3Var2;
    }

    public final boolean L() {
        return !(E() instanceof ng3);
    }

    public boolean M() {
        return this instanceof w70;
    }

    public final boolean N(Object obj) {
        Object objY;
        do {
            objY = Y(E(), obj);
            if (objY == ka0.m) {
                return false;
            }
            if (objY == ka0.n) {
                return true;
            }
        } while (objY == ka0.f1243o);
        c(objY);
        return true;
    }

    public final Object O(Object obj) {
        Object objY;
        do {
            objY = Y(E(), obj);
            if (objY == ka0.m) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                xx0 xx0Var = obj instanceof xx0 ? (xx0) obj : null;
                throw new IllegalStateException(str, xx0Var != null ? xx0Var.a : null);
            }
        } while (objY == ka0.f1243o);
        return objY;
    }

    public String P() {
        return getClass().getSimpleName();
    }

    public final void R(l45 l45Var, Throwable th) {
        l45Var.c(new wa4(4), 4);
        Object objH = l45Var.h();
        objH.getClass();
        yx0 yx0Var = null;
        for (zd4 zd4VarI = (zd4) objH; !zd4VarI.equals(l45Var); zd4VarI = zd4VarI.i()) {
            if ((zd4VarI instanceof jp3) && ((jp3) zd4VarI).m()) {
                try {
                    ((jp3) zd4VarI).n(th);
                } catch (Throwable th2) {
                    if (yx0Var != null) {
                        ct1.q(yx0Var, th2);
                    } else {
                        yx0Var = new yx0("Exception in completion handler " + zd4VarI + " for " + this, th2);
                    }
                }
            }
        }
        if (yx0Var != null) {
            I(yx0Var);
        }
        r(th);
    }

    public void S(Object obj) {
    }

    public void T() {
    }

    public final void U(u92 u92Var) {
        l45 l45Var = new l45();
        Object kg3Var = u92Var.m ? l45Var : new kg3(l45Var);
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = n;
            op3 op3Var = this;
            u92 u92Var2 = u92Var;
            if (unsafe.compareAndSwapObject(op3Var, j, u92Var2, kg3Var) || unsafe.getObjectVolatile(op3Var, j) != u92Var2) {
                return;
            }
            this = op3Var;
            u92Var = u92Var2;
        }
    }

    public final void V(jp3 jp3Var) {
        jp3 jp3Var2;
        op3 op3Var;
        l45 l45Var = new l45();
        Unsafe unsafe = defpackage.a.a;
        unsafe.putObjectVolatile(l45Var, zd4.n, jp3Var);
        long j = zd4.m;
        unsafe.putObjectVolatile(l45Var, j, jp3Var);
        loop0: while (true) {
            if (jp3Var.h() != jp3Var) {
                jp3Var2 = jp3Var;
                break;
            }
            while (true) {
                Unsafe unsafe2 = defpackage.a.a;
                jp3Var2 = jp3Var;
                if (unsafe2.compareAndSwapObject(jp3Var2, zd4.m, jp3Var, l45Var)) {
                    l45Var.g(jp3Var2);
                    break loop0;
                }
                op3Var = this;
                jp3Var = jp3Var2;
                if (unsafe2.getObjectVolatile(jp3Var2, j) != jp3Var2) {
                    break;
                } else {
                    this = op3Var;
                }
            }
            this = op3Var;
        }
        zd4 zd4VarI = jp3Var2.i();
        while (true) {
            Unsafe unsafe3 = defpackage.a.a;
            long j2 = n;
            op3 op3Var2 = this;
            if (unsafe3.compareAndSwapObject(op3Var2, j2, jp3Var2, zd4VarI) || unsafe3.getObjectVolatile(op3Var2, j2) != jp3Var2) {
                return;
            } else {
                this = op3Var2;
            }
        }
    }

    public final int W(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof u92;
        long j = n;
        if (z) {
            if (((u92) obj).m) {
                return 0;
            }
            u92 u92Var = ka0.s;
            do {
                unsafe2 = defpackage.a.a;
                if (unsafe2.compareAndSwapObject(this, n, obj, u92Var)) {
                    T();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof kg3)) {
            return 0;
        }
        l45 l45Var = ((kg3) obj).m;
        do {
            unsafe = defpackage.a.a;
            if (unsafe.compareAndSwapObject(this, n, obj, l45Var)) {
                T();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    public final Object Y(Object obj, Object obj2) {
        if (!(obj instanceof ng3)) {
            return ka0.m;
        }
        if ((!(obj instanceof u92) && !(obj instanceof jp3)) || (obj instanceof qq0) || (obj2 instanceof xx0)) {
            op3 op3Var = this;
            ng3 ng3Var = (ng3) obj;
            l45 l45VarD = op3Var.D(ng3Var);
            if (l45VarD == null) {
                return ka0.f1243o;
            }
            np3 np3Var = ng3Var instanceof np3 ? (np3) ng3Var : null;
            if (np3Var == null) {
                np3Var = new np3(l45VarD, null);
            }
            np3 np3Var2 = np3Var;
            synchronized (np3Var2) {
                if (np3Var2.d()) {
                    return ka0.m;
                }
                defpackage.a.a.putIntVolatile(np3Var2, np3.f1589o, 1);
                if (np3Var2 != ng3Var) {
                    while (true) {
                        Unsafe unsafe = defpackage.a.a;
                        long j = n;
                        op3 op3Var2 = op3Var;
                        op3Var = op3Var2;
                        if (unsafe.compareAndSwapObject(op3Var2, j, ng3Var, np3Var2)) {
                            break;
                        }
                        if (unsafe.getObjectVolatile(op3Var, j) != ng3Var) {
                            return ka0.f1243o;
                        }
                    }
                }
                boolean zC = np3Var2.c();
                xx0 xx0Var = obj2 instanceof xx0 ? (xx0) obj2 : null;
                if (xx0Var != null) {
                    np3Var2.a(xx0Var.a);
                }
                Throwable thB = zC ? null : np3Var2.b();
                if (thB != null) {
                    op3Var.R(l45VarD, thB);
                }
                qq0 qq0VarQ = Q(l45VarD);
                if (qq0VarQ != null && op3Var.Z(np3Var2, qq0VarQ, obj2)) {
                    return ka0.n;
                }
                l45VarD.c(new wa4(2), 2);
                qq0 qq0VarQ2 = Q(l45VarD);
                return (qq0VarQ2 == null || !op3Var.Z(np3Var2, qq0VarQ2, obj2)) ? op3Var.y(np3Var2, obj2) : ka0.n;
            }
        }
        ng3 ng3Var2 = (ng3) obj;
        Object og3Var = obj2 instanceof ng3 ? new og3((ng3) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = defpackage.a.a;
            long j2 = n;
            op3 op3Var3 = this;
            if (unsafe2.compareAndSwapObject(op3Var3, j2, ng3Var2, og3Var)) {
                op3Var3.S(obj2);
                op3Var3.w(ng3Var2, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(op3Var3, j2) != ng3Var2) {
                return ka0.f1243o;
            }
            this = op3Var3;
        }
    }

    public final boolean Z(np3 np3Var, qq0 qq0Var, Object obj) {
        while (ds1.Q(qq0Var.q, false, new mp3(this, np3Var, qq0Var, obj)) == r45.m) {
            qq0Var = Q(qq0Var);
            if (qq0Var == null) {
                return false;
            }
        }
        return true;
    }

    @Override // o.de1
    public final Object b0(Object obj, hw2 hw2Var) {
        return hw2Var.invoke(obj, this);
    }

    public void c(Object obj) {
    }

    @Override // o.bp3
    public final pq0 c0(op3 op3Var) {
        op3 op3Var2;
        qq0 qq0Var = new qq0(op3Var);
        qq0Var.p = this;
        loop0: while (true) {
            Object objE = this.E();
            if (objE instanceof u92) {
                u92 u92Var = (u92) objE;
                if (u92Var.m) {
                    while (true) {
                        Unsafe unsafe = defpackage.a.a;
                        long j = n;
                        op3Var2 = this;
                        if (unsafe.compareAndSwapObject(op3Var2, j, objE, qq0Var)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(op3Var2, j) != objE) {
                            break;
                        }
                        this = op3Var2;
                    }
                } else {
                    op3Var2 = this;
                    op3Var2.U(u92Var);
                }
                this = op3Var2;
            } else {
                op3Var2 = this;
                boolean z = objE instanceof ng3;
                r45 r45Var = r45.m;
                Throwable thB = null;
                if (!z) {
                    Object objE2 = op3Var2.E();
                    xx0 xx0Var = objE2 instanceof xx0 ? (xx0) objE2 : null;
                    qq0Var.n(xx0Var != null ? xx0Var.a : null);
                    return r45Var;
                }
                l45 l45VarF = ((ng3) objE).f();
                if (l45VarF != null) {
                    if (l45VarF.c(qq0Var, 7)) {
                        break;
                    }
                    boolean zC = l45VarF.c(qq0Var, 3);
                    Object objE3 = op3Var2.E();
                    if (objE3 instanceof np3) {
                        thB = ((np3) objE3).b();
                    } else {
                        xx0 xx0Var2 = objE3 instanceof xx0 ? (xx0) objE3 : null;
                        if (xx0Var2 != null) {
                            thB = xx0Var2.a;
                        }
                    }
                    qq0Var.n(thB);
                    if (zC) {
                        break;
                    }
                    return r45Var;
                }
                op3Var2.V((jp3) objE);
                this = op3Var2;
            }
        }
        return qq0Var;
    }

    public void d(Object obj) {
        c(obj);
    }

    @Override // o.bp3
    public boolean e() {
        Object objE = E();
        return (objE instanceof ng3) && ((ng3) objE).e();
    }

    @Override // o.be1
    public final ce1 getKey() {
        return z06.z;
    }

    public final Object h(hc1 hc1Var) throws Throwable {
        Object objE;
        do {
            objE = E();
            if (!(objE instanceof ng3)) {
                if (objE instanceof xx0) {
                    throw ((xx0) objE).a;
                }
                return ka0.I(objE);
            }
        } while (W(objE) < 0);
        lp3 lp3Var = new lp3(vt1.A(hc1Var), this);
        lp3Var.t();
        lp3Var.w(new al0(ds1.Q(this, true, new yc6(lp3Var)), (byte) 2));
        return lp3Var.q();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
      0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0058 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:33:0x006b, B:34:0x006f), top: B:82:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0062 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:33:0x006b, B:34:0x006f), top: B:82:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006b A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:24:0x0049, B:26:0x0058, B:31:0x0062, B:33:0x006b, B:34:0x006f), top: B:82:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c7 A[LOOP:2: B:53:0x00ae->B:60:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
    public final boolean i(Object obj) {
        op3 op3Var;
        Throwable thX;
        Object objE;
        Throwable thB;
        hr2 hr2Var;
        Object objY;
        ng3 ng3Var;
        l45 l45VarD;
        np3 np3Var;
        Unsafe unsafe;
        long j;
        Object objY2 = ka0.m;
        if (C()) {
            do {
                Object objE2 = E();
                if (!(objE2 instanceof ng3) || ((objE2 instanceof np3) && ((np3) objE2).d())) {
                    objY2 = ka0.m;
                    break;
                }
                objY2 = Y(objE2, new xx0(x(obj), false));
            } while (objY2 == ka0.f1243o);
            if (objY2 != ka0.n) {
                if (objY2 == ka0.m) {
                    thX = null;
                    loop1: while (true) {
                        objE = this.E();
                        if (objE instanceof np3) {
                            if (objE instanceof ng3) {
                                if (thX == null) {
                                    thX = this.x(obj);
                                }
                                ng3Var = (ng3) objE;
                                if (ng3Var.e()) {
                                    l45VarD = this.D(ng3Var);
                                    if (l45VarD == null) {
                                        op3Var = this;
                                    } else {
                                        np3Var = new np3(l45VarD, thX);
                                        while (true) {
                                            unsafe = defpackage.a.a;
                                            j = n;
                                            op3Var = this;
                                            if (unsafe.compareAndSwapObject(op3Var, j, ng3Var, np3Var)) {
                                                op3Var.R(l45VarD, thX);
                                                objY = ka0.m;
                                            } else if (unsafe.getObjectVolatile(op3Var, j) != ng3Var) {
                                                this = op3Var;
                                            }
                                        }
                                    }
                                    this = op3Var;
                                } else {
                                    op3Var = this;
                                    objY = op3Var.Y(objE, new xx0(thX, false));
                                    if (objY != ka0.m) {
                                        hk0.f(objE, "Cannot happen in ");
                                        return false;
                                    }
                                    if (objY != ka0.f1243o) {
                                        this = op3Var;
                                    }
                                }
                            } else {
                                op3Var = this;
                                objY = ka0.p;
                            }
                            objY2 = objY;
                            break;
                        }
                        synchronized (objE) {
                            if (defpackage.a.a.getObjectVolatile((np3) objE, np3.n) == ka0.q) {
                                hr2Var = ka0.p;
                            } else {
                                boolean zC = ((np3) objE).c();
                                if (thX == null) {
                                    thX = this.x(obj);
                                }
                                ((np3) objE).a(thX);
                                thB = zC ? null : ((np3) objE).b();
                                if (thB != null) {
                                    this.R(((np3) objE).m, thB);
                                }
                                hr2Var = ka0.m;
                            }
                        }
                        op3Var = this;
                        objY2 = hr2Var;
                        break;
                    }
                }
                op3Var = this;
                if (objY2 != ka0.m && objY2 != ka0.n) {
                    if (objY2 == ka0.p) {
                        return false;
                    }
                    op3Var.c(objY2);
                    return true;
                }
            }
        } else {
            if (objY2 == ka0.m) {
                thX = null;
                loop1: while (true) {
                    objE = this.E();
                    if (objE instanceof np3) {
                        if (objE instanceof ng3) {
                            if (thX == null) {
                                thX = this.x(obj);
                            }
                            ng3Var = (ng3) objE;
                            if (ng3Var.e()) {
                                l45VarD = this.D(ng3Var);
                                if (l45VarD == null) {
                                    op3Var = this;
                                } else {
                                    np3Var = new np3(l45VarD, thX);
                                    while (true) {
                                        unsafe = defpackage.a.a;
                                        j = n;
                                        op3Var = this;
                                        if (unsafe.compareAndSwapObject(op3Var, j, ng3Var, np3Var)) {
                                            op3Var.R(l45VarD, thX);
                                            objY = ka0.m;
                                        } else if (unsafe.getObjectVolatile(op3Var, j) != ng3Var) {
                                            this = op3Var;
                                        }
                                    }
                                }
                                this = op3Var;
                            } else {
                                op3Var = this;
                                objY = op3Var.Y(objE, new xx0(thX, false));
                                if (objY != ka0.m) {
                                    hk0.f(objE, "Cannot happen in ");
                                    return false;
                                }
                                if (objY != ka0.f1243o) {
                                    this = op3Var;
                                }
                            }
                        } else {
                            op3Var = this;
                            objY = ka0.p;
                        }
                        objY2 = objY;
                        break;
                    }
                    synchronized (objE) {
                        if (defpackage.a.a.getObjectVolatile((np3) objE, np3.n) == ka0.q) {
                            hr2Var = ka0.p;
                        } else {
                            boolean zC2 = ((np3) objE).c();
                            if (thX == null) {
                                thX = this.x(obj);
                            }
                            ((np3) objE).a(thX);
                            if (zC2) {
                            }
                            if (thB != null) {
                                this.R(((np3) objE).m, thB);
                            }
                            hr2Var = ka0.m;
                        }
                        op3Var = this;
                        objY2 = hr2Var;
                        break;
                    }
                }
            }
            op3Var = this;
            if (objY2 != ka0.m) {
                if (objY2 == ka0.p) {
                    return false;
                }
                op3Var.c(objY2);
                return true;
            }
        }
        return true;
    }

    @Override // o.bp3
    public final boolean isCancelled() {
        Object objE = E();
        if (objE instanceof xx0) {
            return true;
        }
        return (objE instanceof np3) && ((np3) objE).c();
    }

    @Override // o.bp3, o.wm0
    public void j(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new cp3(t(), null, this);
        }
        p(cancellationException);
    }

    @Override // o.de1
    public final de1 k0(ce1 ce1Var) {
        return xk0.C(this, ce1Var);
    }

    @Override // o.de1
    public final be1 l0(ce1 ce1Var) {
        return xk0.v(this, ce1Var);
    }

    @Override // o.bp3
    public final t22 o0(Function1 function1) {
        return K(true, new cn3(function1));
    }

    public void p(CancellationException cancellationException) {
        i(cancellationException);
    }

    public final boolean r(Throwable th) {
        if (M()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        pq0 pq0Var = (pq0) defpackage.a.a.getObjectVolatile(this, m);
        if (pq0Var == null || pq0Var == r45.m) {
            return z;
        }
        return pq0Var.b(th) || z;
    }

    @Override // o.bp3
    public final boolean start() {
        int iW;
        do {
            iW = W(E());
            if (iW == 0) {
                return false;
            }
        } while (iW != 1);
        return true;
    }

    public String t() {
        return "Job was cancelled";
    }

    public final String toString() {
        return (P() + '{' + X(E()) + '}') + '@' + di1.r(this);
    }

    @Override // o.bp3
    public final t22 u(boolean z, boolean z2, ew1 ew1Var) {
        return K(z2, z ? new bn3(ew1Var) : new cn3(ew1Var));
    }

    public boolean v(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return i(th) && B();
    }

    public final void w(ng3 ng3Var, Object obj) {
        Unsafe unsafe = defpackage.a.a;
        long j = m;
        pq0 pq0Var = (pq0) unsafe.getObjectVolatile(this, j);
        if (pq0Var != null) {
            pq0Var.a();
            unsafe.putObjectVolatile(this, j, r45.m);
        }
        yx0 yx0Var = null;
        xx0 xx0Var = obj instanceof xx0 ? (xx0) obj : null;
        Throwable th = xx0Var != null ? xx0Var.a : null;
        if (ng3Var instanceof jp3) {
            try {
                ((jp3) ng3Var).n(th);
                return;
            } catch (Throwable th2) {
                I(new yx0("Exception in completion handler " + ng3Var + " for " + this, th2));
                return;
            }
        }
        l45 l45VarF = ng3Var.f();
        if (l45VarF != null) {
            l45VarF.c(new wa4(1), 1);
            Object objH = l45VarF.h();
            objH.getClass();
            for (zd4 zd4VarI = (zd4) objH; !zd4VarI.equals(l45VarF); zd4VarI = zd4VarI.i()) {
                if (zd4VarI instanceof jp3) {
                    try {
                        ((jp3) zd4VarI).n(th);
                    } catch (Throwable th3) {
                        if (yx0Var != null) {
                            ct1.q(yx0Var, th3);
                        } else {
                            yx0Var = new yx0("Exception in completion handler " + zd4VarI + " for " + this, th3);
                        }
                    }
                }
            }
            if (yx0Var != null) {
                I(yx0Var);
            }
        }
    }

    public final Throwable x(Object obj) {
        Throwable thB;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        op3 op3Var = (op3) obj;
        Object objE = op3Var.E();
        if (objE instanceof np3) {
            thB = ((np3) objE).b();
        } else if (objE instanceof xx0) {
            thB = ((xx0) objE).a;
        } else {
            if (objE instanceof ng3) {
                hk0.f(objE, "Cannot be cancelling child in this state: ");
                return null;
            }
            thB = null;
        }
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        return cancellationException == null ? new cp3("Parent job is ".concat(X(objE)), thB, op3Var) : cancellationException;
    }

    @Override // o.bp3
    public final Object x0(jc1 jc1Var) {
        Object objE;
        f88 f88Var;
        do {
            objE = E();
            boolean z = objE instanceof ng3;
            f88Var = f88.a;
            if (!z) {
                ds1.H(jc1Var.getContext());
                return f88Var;
            }
        } while (W(objE) < 0);
        gl0 gl0Var = new gl0(1, vt1.A(jc1Var));
        gl0Var.t();
        gl0Var.w(new al0(ds1.Q(this, true, new zc6(gl0Var)), (byte) 2));
        Object objQ = gl0Var.q();
        ne1 ne1Var = ne1.m;
        if (objQ != ne1Var) {
            objQ = f88Var;
        }
        return objQ == ne1Var ? objQ : f88Var;
    }

    public final Object y(np3 np3Var, Object obj) throws Throwable {
        Throwable th;
        op3 op3Var;
        np3 np3Var2;
        xx0 xx0Var = obj instanceof xx0 ? (xx0) obj : null;
        Throwable th2 = xx0Var != null ? xx0Var.a : null;
        synchronized (np3Var) {
            try {
                np3Var.c();
                ArrayList<Throwable> arrayListG = np3Var.g(th2);
                Throwable thA = A(np3Var, arrayListG);
                if (thA != null) {
                    try {
                        if (arrayListG.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                            for (Throwable th3 : arrayListG) {
                                if (th3 != thA && th3 != thA && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    ct1.q(thA, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                if (thA != null && thA != th2) {
                    obj = new xx0(thA, false);
                }
                if (thA != null && (r(thA) || H(thA))) {
                    obj.getClass();
                    defpackage.a.a.compareAndSwapInt((xx0) obj, xx0.b, 0, 1);
                }
                S(obj);
                Object og3Var = obj instanceof ng3 ? new og3((ng3) obj) : obj;
                while (true) {
                    Unsafe unsafe = defpackage.a.a;
                    long j = n;
                    op3Var = this;
                    np3Var2 = np3Var;
                    if (unsafe.compareAndSwapObject(op3Var, j, np3Var2, og3Var) || unsafe.getObjectVolatile(op3Var, j) != np3Var2) {
                        break;
                    }
                    this = op3Var;
                    np3Var = np3Var2;
                }
                op3Var.w(np3Var2, obj);
                return obj;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // o.bp3
    public final CancellationException z() {
        CancellationException cancellationException;
        Object objE = E();
        if (objE instanceof np3) {
            Throwable thB = ((np3) objE).b();
            if (thB == null) {
                hk0.f(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
            return cancellationException == null ? new cp3(strConcat, thB, this) : cancellationException;
        }
        if (objE instanceof ng3) {
            hk0.f(this, "Job is still new or active: ");
            return null;
        }
        if (!(objE instanceof xx0)) {
            return new cp3(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((xx0) objE).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new cp3(t(), th, this) : cancellationException;
    }
}
