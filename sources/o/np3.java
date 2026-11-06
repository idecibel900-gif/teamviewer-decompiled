package o;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class np3 implements ng3 {
    public static final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ long f1589o;
    public static final /* synthetic */ long p;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final l45 m;

    static {
        Unsafe unsafe = defpackage.a.a;
        f1589o = unsafe.objectFieldOffset(np3.class.getDeclaredField("_isCompleting$volatile"));
        p = unsafe.objectFieldOffset(np3.class.getDeclaredField("_rootCause$volatile"));
        n = unsafe.objectFieldOffset(np3.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public np3(l45 l45Var, Throwable th) {
        this.m = l45Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thB = b();
        if (thB == null) {
            defpackage.a.a.putObjectVolatile(this, p, th);
            return;
        }
        if (th == thB) {
            return;
        }
        Unsafe unsafe = defpackage.a.a;
        long j = n;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                hk0.f(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    public final Throwable b() {
        return (Throwable) defpackage.a.a.getObjectVolatile(this, p);
    }

    public final boolean c() {
        return b() != null;
    }

    public final boolean d() {
        return defpackage.a.a.getIntVolatile(this, f1589o) == 1;
    }

    @Override // o.ng3
    public final boolean e() {
        return b() == null;
    }

    @Override // o.ng3
    public final l45 f() {
        return this.m;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = defpackage.a.a;
        long j = n;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                hk0.f(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable thB = b();
        if (thB != null) {
            arrayList.add(0, thB);
        }
        if (th != null && !th.equals(thB)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, ka0.q);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + c() + ", completing=" + d() + ", rootCause=" + b() + ", exceptions=" + defpackage.a.a.getObjectVolatile(this, n) + ", list=" + this.m + ']';
    }
}
