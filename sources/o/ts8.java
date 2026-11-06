package o;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class ts8 extends o77 {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafeB;
        try {
            try {
                unsafeB = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    unsafeB = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new z88((byte) 2));
                } catch (Exception unused2) {
                    unsafeB = B();
                }
            }
            try {
                c = unsafeB.objectFieldOffset(vs8.class.getDeclaredField("o"));
                b = unsafeB.objectFieldOffset(vs8.class.getDeclaredField("n"));
                d = unsafeB.objectFieldOffset(vs8.class.getDeclaredField("m"));
                e = unsafeB.objectFieldOffset(us8.class.getDeclaredField("a"));
                f = unsafeB.objectFieldOffset(us8.class.getDeclaredField("b"));
                a = unsafeB;
            } catch (NoSuchFieldException e2) {
                gk0.r(e2);
            }
        } catch (Exception e3) {
            an4.n("Could not initialize intrinsics", e3);
        }
    }

    public static /* synthetic */ Unsafe B() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // o.o77
    public final boolean A(vs8 vs8Var, us8 us8Var, us8 us8Var2) {
        return x37.v(a, vs8Var, c, us8Var, us8Var2);
    }

    @Override // o.o77
    public final qs8 u(ot8 ot8Var) {
        qs8 qs8Var;
        qs8 qs8Var2 = qs8.d;
        do {
            qs8Var = ot8Var.n;
            if (qs8Var2 == qs8Var) {
                break;
            }
        } while (!y(ot8Var, qs8Var, qs8Var2));
        return qs8Var;
    }

    @Override // o.o77
    public final us8 v(ot8 ot8Var) {
        us8 us8Var;
        us8 us8Var2 = us8.c;
        do {
            us8Var = ot8Var.f2342o;
            if (us8Var2 == us8Var) {
                break;
            }
        } while (!A(ot8Var, us8Var, us8Var2));
        return us8Var;
    }

    @Override // o.o77
    public final void w(us8 us8Var, us8 us8Var2) {
        a.putObject(us8Var, f, us8Var2);
    }

    @Override // o.o77
    public final void x(us8 us8Var, Thread thread) {
        a.putObject(us8Var, e, thread);
    }

    @Override // o.o77
    public final boolean y(ot8 ot8Var, qs8 qs8Var, qs8 qs8Var2) {
        return x37.v(a, ot8Var, b, qs8Var, qs8Var2);
    }

    @Override // o.o77
    public final boolean z(vs8 vs8Var, Object obj, Object obj2) {
        return x37.v(a, vs8Var, d, obj, obj2);
    }
}
