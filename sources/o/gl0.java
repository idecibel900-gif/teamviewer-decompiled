package o;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public class gl0 extends c22 implements fl0, oe1, ug8 {
    public static final /* synthetic */ long r;
    public static final /* synthetic */ long s;
    public static final /* synthetic */ long t;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final hc1 p;
    public final de1 q;

    static {
        Unsafe unsafe = defpackage.a.a;
        r = unsafe.objectFieldOffset(gl0.class.getDeclaredField("_decisionAndIndex$volatile"));
        t = unsafe.objectFieldOffset(gl0.class.getDeclaredField("_state$volatile"));
        s = unsafe.objectFieldOffset(gl0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public gl0(int i, hc1 hc1Var) {
        super(i);
        this.p = hc1Var;
        this.q = hc1Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = r7.m;
    }

    public static Object E(z45 z45Var, Object obj, int i, iw2 iw2Var) {
        if (obj instanceof xx0) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (iw2Var != null || (z45Var instanceof bl0)) {
            return new vx0(obj, z45Var instanceof bl0 ? (bl0) z45Var : null, iw2Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(z45 z45Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + z45Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        gl0 gl0Var;
        hc1 hc1Var = this.p;
        Throwable th = null;
        a22 a22Var = hc1Var instanceof a22 ? (a22) hc1Var : null;
        if (a22Var != null) {
            long j = a22.t;
            loop0: while (true) {
                Object objectVolatile = defpackage.a.a.getObjectVolatile(a22Var, j);
                hr2 hr2Var = ga0.t;
                if (objectVolatile == hr2Var) {
                    while (true) {
                        Unsafe unsafe = defpackage.a.a;
                        gl0 gl0Var2 = this;
                        gl0Var = gl0Var2;
                        if (unsafe.compareAndSwapObject(a22Var, a22.t, hr2Var, gl0Var2)) {
                            break loop0;
                        } else if (unsafe.getObjectVolatile(a22Var, j) != hr2Var) {
                            break;
                        } else {
                            this = gl0Var;
                        }
                    }
                    this = gl0Var;
                } else {
                    gl0Var = this;
                    if (!(objectVolatile instanceof Throwable)) {
                        hk0.f(objectVolatile, "Inconsistent state ");
                        return;
                    }
                    while (true) {
                        Unsafe unsafe2 = defpackage.a.a;
                        if (unsafe2.compareAndSwapObject(a22Var, a22.t, objectVolatile, (Object) null)) {
                            th = (Throwable) objectVolatile;
                            break;
                        } else if (unsafe2.getObjectVolatile(a22Var, j) != objectVolatile) {
                            hk0.g("Failed requirement.");
                            return;
                        }
                    }
                }
            }
            if (th == null) {
                return;
            }
            gl0Var.m();
            gl0Var.f(th);
        }
    }

    public final void C(Object obj, int i, iw2 iw2Var) {
        gl0 gl0Var;
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = t;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof z45)) {
                gl0 gl0Var2 = this;
                if (objectVolatile instanceof jl0) {
                    jl0 jl0Var = (jl0) objectVolatile;
                    if (unsafe.compareAndSwapInt(jl0Var, jl0.c, 0, 1)) {
                        if (iw2Var != null) {
                            gl0Var2.k(iw2Var, jl0Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                hk0.f(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objE = E((z45) objectVolatile, obj, i, iw2Var);
            while (true) {
                Unsafe unsafe2 = defpackage.a.a;
                gl0Var = this;
                if (unsafe2.compareAndSwapObject(gl0Var, t, objectVolatile, objE)) {
                    if (!gl0Var.y()) {
                        gl0Var.m();
                    }
                    gl0Var.n(i);
                    return;
                } else if (unsafe2.getObjectVolatile(gl0Var, j) != objectVolatile) {
                    break;
                } else {
                    this = gl0Var;
                }
            }
            this = gl0Var;
        }
    }

    public final void D(fe1 fe1Var) {
        hc1 hc1Var = this.p;
        a22 a22Var = hc1Var instanceof a22 ? (a22) hc1Var : null;
        C(f88.a, (a22Var != null ? a22Var.p : null) == fe1Var ? 4 : this.f478o, null);
    }

    @Override // o.ug8
    public final void a(tn6 tn6Var, int i) {
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = r;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                hk0.l("invokeOnCancellation should be called at most once");
                return;
            }
            gl0 gl0Var = this;
            if (unsafe.compareAndSwapInt(gl0Var, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                gl0Var.w(tn6Var);
                return;
            }
            this = gl0Var;
        }
    }

    @Override // o.c22
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        gl0 gl0Var;
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = t;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof z45) {
                hk0.l("Not completed");
                return;
            }
            if (objectVolatile instanceof xx0) {
                return;
            }
            if (objectVolatile instanceof vx0) {
                vx0 vx0Var = (vx0) objectVolatile;
                if (vx0Var.e != null) {
                    hk0.l("Must be called at most once");
                    return;
                }
                vx0 vx0VarA = vx0.a(vx0Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = defpackage.a.a;
                    gl0 gl0Var2 = this;
                    if (unsafe2.compareAndSwapObject(gl0Var2, t, objectVolatile, vx0VarA)) {
                        bl0 bl0Var = vx0Var.b;
                        if (bl0Var != null) {
                            gl0Var2.j(bl0Var, cancellationException);
                        }
                        iw2 iw2Var = vx0Var.c;
                        if (iw2Var != null) {
                            gl0Var2.k(iw2Var, cancellationException, vx0Var.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(gl0Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        gl0Var = gl0Var2;
                        break;
                    }
                    this = gl0Var2;
                }
            } else {
                gl0 gl0Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                vx0 vx0Var2 = new vx0(objectVolatile, (bl0) null, (iw2) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    vx0 vx0Var3 = vx0Var2;
                    Unsafe unsafe3 = defpackage.a.a;
                    gl0Var = gl0Var3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(gl0Var, t, objectVolatile, vx0Var3);
                    vx0Var2 = vx0Var3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(gl0Var, j) != objectVolatile) {
                        break;
                    } else {
                        gl0Var3 = gl0Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = gl0Var;
        }
    }

    @Override // o.c22
    public final hc1 c() {
        return this.p;
    }

    @Override // o.c22
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // o.c22
    public final Object e(Object obj) {
        return obj instanceof vx0 ? ((vx0) obj).a : obj;
    }

    @Override // o.fl0
    public final boolean f(Throwable th) {
        Throwable cancellationException;
        gl0 gl0Var;
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = t;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof z45)) {
                return false;
            }
            boolean z = (objectVolatile instanceof bl0) || (objectVolatile instanceof tn6);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            jl0 jl0Var = new jl0(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = defpackage.a.a;
                gl0Var = this;
                if (unsafe2.compareAndSwapObject(gl0Var, t, objectVolatile, jl0Var)) {
                    z45 z45Var = (z45) objectVolatile;
                    if (z45Var instanceof bl0) {
                        gl0Var.j((bl0) objectVolatile, th);
                    } else if (z45Var instanceof tn6) {
                        gl0Var.l((tn6) objectVolatile, th);
                    }
                    if (!gl0Var.y()) {
                        gl0Var.m();
                    }
                    gl0Var.n(gl0Var.f478o);
                    return true;
                }
                if (unsafe2.getObjectVolatile(gl0Var, j) != objectVolatile) {
                    break;
                }
                this = gl0Var;
            }
            this = gl0Var;
        }
    }

    @Override // o.fl0
    public final void g(Object obj, iw2 iw2Var) {
        C(obj, this.f478o, iw2Var);
    }

    @Override // o.oe1
    public final oe1 getCallerFrame() {
        hc1 hc1Var = this.p;
        if (hc1Var instanceof oe1) {
            return (oe1) hc1Var;
        }
        return null;
    }

    @Override // o.hc1
    public final de1 getContext() {
        return this.q;
    }

    @Override // o.c22
    public final Object i() {
        return r();
    }

    public final void j(bl0 bl0Var, Throwable th) {
        try {
            bl0Var.b(th);
        } catch (Throwable th2) {
            ck3.T(new yx0("Exception in invokeOnCancellation handler for " + this, th2), this.q);
        }
    }

    public final void k(iw2 iw2Var, Throwable th, Object obj) {
        de1 de1Var = this.q;
        try {
            iw2Var.d(th, obj, de1Var);
        } catch (Throwable th2) {
            ck3.T(new yx0("Exception in resume onCancellation handler for " + this, th2), de1Var);
        }
    }

    public final void l(tn6 tn6Var, Throwable th) {
        de1 de1Var = this.q;
        int intVolatile = defpackage.a.a.getIntVolatile(this, r) & 536870911;
        if (intVolatile == 536870911) {
            hk0.l("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            tn6Var.h(intVolatile, de1Var);
        } catch (Throwable th2) {
            ck3.T(new yx0("Exception in invokeOnCancellation handler for " + this, th2), de1Var);
        }
    }

    public final void m() {
        Unsafe unsafe = defpackage.a.a;
        long j = s;
        t22 t22Var = (t22) unsafe.getObjectVolatile(this, j);
        if (t22Var == null) {
            return;
        }
        t22Var.a();
        unsafe.putObjectVolatile(this, j, r45.m);
    }

    public final void n(int i) {
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = r;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    hk0.l("Already resumed");
                    return;
                }
                boolean z = i == 4;
                hc1 hc1Var = this.p;
                if (!z && (hc1Var instanceof a22)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.f478o;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        a22 a22Var = (a22) hc1Var;
                        fe1 fe1Var = a22Var.p;
                        de1 context = a22Var.q.getContext();
                        if (ga0.v(fe1Var, context)) {
                            ga0.u(fe1Var, context, this);
                            return;
                        }
                        be2 be2VarA = du7.a();
                        if (be2VarA.f416o >= 4294967296L) {
                            be2VarA.P0(this);
                            return;
                        }
                        be2VarA.Q0(true);
                        try {
                            it1.K(this, hc1Var, true);
                            do {
                            } while (be2VarA.S0());
                        } catch (Throwable th) {
                            try {
                                this.h(th);
                            } finally {
                                be2VarA.O0(true);
                            }
                        }
                        return;
                    }
                }
                it1.K(this, hc1Var, z);
                return;
            }
            gl0 gl0Var = this;
            if (unsafe.compareAndSwapInt(gl0Var, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = gl0Var;
            }
        }
    }

    @Override // o.fl0
    public final hr2 o(Object obj, iw2 iw2Var) {
        gl0 gl0Var;
        hr2 hr2Var = ck3.k;
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = t;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof z45)) {
                return null;
            }
            Object objE = E((z45) objectVolatile, obj, this.f478o, iw2Var);
            while (true) {
                Unsafe unsafe2 = defpackage.a.a;
                gl0Var = this;
                if (unsafe2.compareAndSwapObject(gl0Var, t, objectVolatile, objE)) {
                    if (!gl0Var.y()) {
                        gl0Var.m();
                    }
                    return hr2Var;
                }
                if (unsafe2.getObjectVolatile(gl0Var, j) != objectVolatile) {
                    break;
                }
                this = gl0Var;
            }
            this = gl0Var;
        }
    }

    public Throwable p(op3 op3Var) {
        return op3Var.z();
    }

    public final Object q() {
        bp3 bp3Var;
        boolean zY = y();
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = r;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    hk0.l("Already suspended");
                    return null;
                }
                if (zY) {
                    this.B();
                }
                Object objR = this.r();
                if (objR instanceof xx0) {
                    throw ((xx0) objR).a;
                }
                int i2 = this.f478o;
                if ((i2 != 1 && i2 != 2) || (bp3Var = (bp3) this.q.l0(z06.z)) == null || bp3Var.e()) {
                    return this.e(objR);
                }
                CancellationException cancellationExceptionZ = bp3Var.z();
                this.b(cancellationExceptionZ);
                throw cancellationExceptionZ;
            }
            gl0 gl0Var = this;
            if (unsafe.compareAndSwapInt(gl0Var, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((t22) unsafe.getObjectVolatile(gl0Var, s)) == null) {
                    gl0Var.u();
                }
                if (zY) {
                    gl0Var.B();
                }
                return ne1.m;
            }
            this = gl0Var;
        }
    }

    public final Object r() {
        return defpackage.a.a.getObjectVolatile(this, t);
    }

    @Override // o.hc1
    public final void resumeWith(Object obj) {
        Throwable thA = tc6.a(obj);
        if (thA != null) {
            obj = new xx0(thA, false);
        }
        C(obj, this.f478o, null);
    }

    @Override // o.fl0
    public final void s(Object obj) {
        n(this.f478o);
    }

    public final void t() {
        t22 t22VarU = u();
        if (t22VarU != null && x()) {
            t22VarU.a();
            defpackage.a.a.putObjectVolatile(this, s, r45.m);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(A());
        sb.append('(');
        sb.append(di1.G(this.p));
        sb.append("){");
        Object objR = r();
        if (objR instanceof z45) {
            str = "Active";
        } else {
            str = objR instanceof jl0 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(di1.r(this));
        return sb.toString();
    }

    public final t22 u() {
        bp3 bp3Var = (bp3) this.q.l0(z06.z);
        if (bp3Var == null) {
            return null;
        }
        t22 t22VarQ = ds1.Q(bp3Var, true, new nq0(this));
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = s;
            gl0 gl0Var = this;
            if (unsafe.compareAndSwapObject(gl0Var, j, (Object) null, t22VarQ) || unsafe.getObjectVolatile(gl0Var, j) != null) {
                break;
            }
            this = gl0Var;
        }
        return t22VarQ;
    }

    public final void v(Function1 function1) {
        w(new al0(function1, (byte) 1));
    }

    public final void w(z45 z45Var) {
        z45 z45Var2;
        gl0 gl0Var;
        gl0 gl0Var2;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = defpackage.a.a;
            long j = t;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof r7) {
                while (true) {
                    Unsafe unsafe3 = defpackage.a.a;
                    gl0 gl0Var3 = this;
                    z45 z45Var3 = z45Var;
                    gl0Var = gl0Var3;
                    z45Var2 = z45Var3;
                    if (unsafe3.compareAndSwapObject(gl0Var3, t, objectVolatile, z45Var3)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(gl0Var, j) != objectVolatile) {
                        break;
                    }
                    this = gl0Var;
                    z45Var = z45Var2;
                }
            } else {
                z45Var2 = z45Var;
                gl0Var = this;
                if ((objectVolatile instanceof bl0) || (objectVolatile instanceof tn6)) {
                    z(z45Var2, objectVolatile);
                    throw null;
                }
                if (objectVolatile instanceof xx0) {
                    xx0 xx0Var = (xx0) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(xx0Var, xx0.b, 0, 1)) {
                        z(z45Var2, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof jl0) {
                        Throwable th = xx0Var.a;
                        if (z45Var2 instanceof bl0) {
                            gl0Var.j((bl0) z45Var2, th);
                            return;
                        } else {
                            gl0Var.l((tn6) z45Var2, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof vx0) {
                    vx0 vx0Var = (vx0) objectVolatile;
                    if (vx0Var.b != null) {
                        z(z45Var2, objectVolatile);
                        throw null;
                    }
                    if (z45Var2 instanceof tn6) {
                        return;
                    }
                    bl0 bl0Var = (bl0) z45Var2;
                    Throwable th2 = vx0Var.e;
                    if (th2 != null) {
                        gl0Var.j(bl0Var, th2);
                        return;
                    }
                    vx0 vx0VarA = vx0.a(vx0Var, bl0Var, null, 29);
                    do {
                        unsafe = defpackage.a.a;
                        if (unsafe.compareAndSwapObject(gl0Var, t, objectVolatile, vx0VarA)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(gl0Var, j) == objectVolatile);
                } else {
                    if (z45Var2 instanceof tn6) {
                        return;
                    }
                    vx0 vx0Var2 = new vx0(objectVolatile, (bl0) z45Var2, (iw2) null, (Throwable) null, 28);
                    while (true) {
                        vx0 vx0Var3 = vx0Var2;
                        Unsafe unsafe4 = defpackage.a.a;
                        gl0Var2 = gl0Var;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(gl0Var2, t, objectVolatile, vx0Var3);
                        vx0Var2 = vx0Var3;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(gl0Var2, j) != objectVolatile) {
                            break;
                        } else {
                            gl0Var = gl0Var2;
                        }
                    }
                }
                this = gl0Var2;
                z45Var = z45Var2;
            }
            gl0Var2 = gl0Var;
            this = gl0Var2;
            z45Var = z45Var2;
        }
    }

    public final boolean x() {
        return !(r() instanceof z45);
    }

    public final boolean y() {
        if (this.f478o == 2) {
            return defpackage.a.a.getObjectVolatile((a22) this.p, a22.t) != null;
        }
        return false;
    }
}
