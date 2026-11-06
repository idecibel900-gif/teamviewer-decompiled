package o;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class d98 {
    public static final Logger a = Logger.getLogger(d98.class.getName());
    public static final Unsafe b;
    public static final Class c;
    public static final c98 d;
    public static final boolean e;
    public static final boolean f;
    public static final long g;
    public static final boolean h;

    static {
        Unsafe unsafe;
        boolean z;
        boolean z2;
        c98 c98Var;
        a98 a98Var = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new z88((byte) 0));
        } catch (Throwable unused) {
            unsafe = null;
        }
        b = unsafe;
        c = tf.a;
        Class cls = Long.TYPE;
        boolean zD = d(cls);
        Class cls2 = Integer.TYPE;
        boolean zD2 = d(cls2);
        if (unsafe != null) {
            if (!tf.a()) {
                a98Var = new a98(unsafe, (byte) 2);
            } else if (zD) {
                a98Var = new a98(unsafe, (byte) 1);
            } else if (zD2) {
                a98Var = new a98(unsafe, (byte) 0);
            }
        }
        d = a98Var;
        Class cls3 = Byte.TYPE;
        Class<Field> cls4 = Field.class;
        if (unsafe == null) {
            z = false;
        } else {
            try {
                Class<?> cls5 = unsafe.getClass();
                cls5.getMethod("objectFieldOffset", cls4);
                cls5.getMethod("getLong", Object.class, cls);
                if (c() == null) {
                    z = false;
                } else {
                    if (!tf.a()) {
                        cls5.getMethod("getByte", cls);
                        cls5.getMethod("putByte", cls, cls3);
                        cls5.getMethod("getInt", cls);
                        cls5.getMethod("putInt", cls, cls2);
                        cls5.getMethod("getLong", cls);
                        cls5.getMethod("putLong", cls, cls);
                        cls5.getMethod("copyMemory", cls, cls, cls);
                        cls5.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                    }
                    cls4 = cls4;
                    z = true;
                }
            } catch (Throwable th) {
                a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
        }
        e = z;
        Unsafe unsafe2 = b;
        if (unsafe2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls6 = unsafe2.getClass();
                cls6.getMethod("objectFieldOffset", cls4);
                cls6.getMethod("arrayBaseOffset", Class.class);
                cls6.getMethod("arrayIndexScale", Class.class);
                cls6.getMethod("getInt", Object.class, cls);
                cls6.getMethod("putInt", Object.class, cls, cls2);
                cls6.getMethod("getLong", Object.class, cls);
                cls6.getMethod("putLong", Object.class, cls, cls);
                cls6.getMethod("getObject", Object.class, cls);
                cls6.getMethod("putObject", Object.class, cls, Object.class);
                if (!tf.a()) {
                    cls6.getMethod("getByte", Object.class, cls);
                    cls6.getMethod("putByte", Object.class, cls, cls3);
                    cls6.getMethod("getBoolean", Object.class, cls);
                    cls6.getMethod("putBoolean", Object.class, cls, Boolean.TYPE);
                    cls6.getMethod("getFloat", Object.class, cls);
                    cls6.getMethod("putFloat", Object.class, cls, Float.TYPE);
                    cls6.getMethod("getDouble", Object.class, cls);
                    cls6.getMethod("putDouble", Object.class, cls, Double.TYPE);
                }
                z2 = true;
            } catch (Throwable th2) {
                a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                z2 = false;
            }
        }
        f = z2;
        g = a(byte[].class);
        a(boolean[].class);
        b(boolean[].class);
        a(int[].class);
        b(int[].class);
        a(long[].class);
        b(long[].class);
        a(float[].class);
        b(float[].class);
        a(double[].class);
        b(double[].class);
        a(Object[].class);
        b(Object[].class);
        Field fieldC = c();
        if (fieldC != null && (c98Var = d) != null) {
            c98Var.a.objectFieldOffset(fieldC);
        }
        h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(Class cls) {
        if (f) {
            return d.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f) {
            d.a.arrayIndexScale(cls);
        }
    }

    public static Field c() {
        Field declaredField;
        Field declaredField2;
        if (tf.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean d(Class cls) {
        if (!tf.a()) {
            return false;
        }
        try {
            Class cls2 = c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte e(long j, byte[] bArr) {
        return d.b(g + j, bArr);
    }

    public static byte f(long j, Object obj) {
        return (byte) ((h((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte g(long j, Object obj) {
        return (byte) ((h((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int h(long j, Object obj) {
        return d.a.getInt(obj, j);
    }

    public static long i(long j, Object obj) {
        return d.a.getLong(obj, j);
    }

    public static Object j(long j, Object obj) {
        return d.a.getObject(obj, j);
    }

    public static void k(long j, byte b2, byte[] bArr) {
        d.f(b2, g + j, bArr);
    }

    public static void l(byte b2, long j, Object obj) {
        long j2 = (-4) & j;
        int iH = h(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        n(((b2 & 255) << i) | (iH & (~(255 << i))), j2, obj);
    }

    public static void m(byte b2, long j, Object obj) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        n(((b2 & 255) << i) | (h(j2, obj) & (~(255 << i))), j2, obj);
    }

    public static void n(int i, long j, Object obj) {
        d.a.putInt(obj, j, i);
    }

    public static void o(Object obj, long j, long j2) {
        d.a.putLong(obj, j, j2);
    }

    public static void p(long j, Object obj, Object obj2) {
        d.a.putObject(obj, j, obj2);
    }
}
