package o;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class ce4 {
    public static final hr2 e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Unsafe unsafe = defpackage.a.a;
        f = unsafe.objectFieldOffset(ce4.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(ce4.class.getDeclaredField("_state$volatile"));
        e = new hr2("REMOVE_FROZEN", (byte) 14);
    }

    public ce4(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            hk0.l("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        hk0.l("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        ce4 ce4Var = this;
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(ce4Var, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = ce4Var.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = ce4Var.b;
            AtomicReferenceArray atomicReferenceArray = ce4Var.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(ce4Var, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    ce4 ce4VarC = this;
                    while ((defpackage.a.a.getLongVolatile(ce4VarC, j) & 1152921504606846976L) != 0) {
                        ce4VarC = ce4VarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = ce4VarC.d;
                        int i4 = ce4VarC.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof be4) && ((be4) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            ce4VarC = null;
                        }
                        if (ce4VarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                ce4Var = this;
            } else {
                int i5 = ce4Var.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = defpackage.a.a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            ce4 ce4Var = this;
            if (defpackage.a.a.compareAndSwapLong(ce4Var, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = ce4Var;
        }
    }

    public final ce4 c() {
        Unsafe unsafe;
        long j;
        long longVolatile;
        long j2;
        Unsafe unsafe2;
        do {
            unsafe = defpackage.a.a;
            j = g;
            longVolatile = unsafe.getLongVolatile(this, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j2 = longVolatile;
                break;
            }
            j2 = 1152921504606846976L | longVolatile;
        } while (!unsafe.compareAndSwapLong(this, j, longVolatile, j2));
        while (true) {
            Unsafe unsafe3 = defpackage.a.a;
            long j3 = f;
            ce4 ce4Var = (ce4) unsafe3.getObjectVolatile(this, j3);
            if (ce4Var != null) {
                return ce4Var;
            }
            ce4 ce4Var2 = new ce4(this.a * 2, this.b);
            int i = (int) (1073741823 & j2);
            int i2 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object be4Var = this.d.get(i4);
                if (be4Var == null) {
                    be4Var = new be4(i);
                }
                ce4Var2.d.set(ce4Var2.c & i, be4Var);
                i++;
            }
            defpackage.a.a.putLongVolatile(ce4Var2, g, j2 & (-1152921504606846977L));
            do {
                unsafe2 = defpackage.a.a;
                if (unsafe2.compareAndSwapObject(this, f, (Object) null, ce4Var2)) {
                    break;
                }
            } while (unsafe2.getObjectVolatile(this, j3) == null);
        }
    }

    public final Object d() {
        ce4 ce4VarC = this;
        while (true) {
            Unsafe unsafe = defpackage.a.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(ce4VarC, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return e;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = ce4VarC.c;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 != i4) {
                AtomicReferenceArray atomicReferenceArray = ce4VarC.d;
                Object obj = atomicReferenceArray.get(i4);
                boolean z = ce4VarC.b;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof be4)) {
                    long j2 = (i + 1) & 1073741823;
                    if (unsafe.compareAndSwapLong(ce4VarC, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i4, null);
                        return obj;
                    }
                    ce4VarC = this;
                    if (z) {
                        while (true) {
                            Unsafe unsafe2 = defpackage.a.a;
                            long j3 = g;
                            long longVolatile2 = unsafe2.getLongVolatile(ce4VarC, j3);
                            int i5 = (int) (longVolatile2 & 1073741823);
                            if ((longVolatile2 & 1152921504606846976L) != 0) {
                                ce4VarC = ce4VarC.c();
                            } else {
                                if (unsafe2.compareAndSwapLong(ce4VarC, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                    ce4VarC.d.set(ce4VarC.c & i5, null);
                                    ce4VarC = null;
                                } else {
                                    continue;
                                }
                            }
                            if (ce4VarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
