package o;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class b98 extends c98 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b98(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // o.c98
    public final boolean a(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (e98.g) {
                    return e98.e(j, obj);
                }
                return ((byte) ((e98.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            case 1:
                if (e98.g) {
                    return e98.e(j, obj);
                }
                return ((byte) ((e98.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
            default:
                return this.a.getBoolean(obj, j);
        }
    }

    @Override // o.c98
    public final double c(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(this.a.getLong(obj, j));
            case 1:
                return Double.longBitsToDouble(this.a.getLong(obj, j));
            default:
                return this.a.getDouble(obj, j);
        }
    }

    @Override // o.c98
    public final float d(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(this.a.getInt(obj, j));
            case 1:
                return Float.intBitsToFloat(this.a.getInt(obj, j));
            default:
                return this.a.getFloat(obj, j);
        }
    }

    @Override // o.c98
    public final void e(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!e98.g) {
                    e98.l(z ? (byte) 1 : (byte) 0, j, obj);
                } else {
                    e98.k(z ? (byte) 1 : (byte) 0, j, obj);
                }
                break;
            case 1:
                if (!e98.g) {
                    e98.l(z ? (byte) 1 : (byte) 0, j, obj);
                } else {
                    e98.k(z ? (byte) 1 : (byte) 0, j, obj);
                }
                break;
            default:
                this.a.putBoolean(obj, j, z);
                break;
        }
    }

    @Override // o.c98
    public final void f(byte b, long j, Object obj) {
        switch (this.b) {
            case 0:
                if (!e98.g) {
                    e98.l(b, j, obj);
                } else {
                    e98.k(b, j, obj);
                }
                break;
            case 1:
                if (!e98.g) {
                    e98.l(b, j, obj);
                } else {
                    e98.k(b, j, obj);
                }
                break;
            default:
                this.a.putByte(obj, j, b);
                break;
        }
    }

    @Override // o.c98
    public final void g(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            case 1:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.a.putDouble(obj, j, d);
                break;
        }
    }

    @Override // o.c98
    public final void h(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                break;
            case 1:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                this.a.putFloat(obj, j, f);
                break;
        }
    }

    @Override // o.c98
    public boolean i() {
        switch (this.b) {
            case 2:
                if (!super.i()) {
                    return false;
                }
                try {
                    Class<?> cls = this.a.getClass();
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getByte", Object.class, cls2);
                    cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                    cls.getMethod("getBoolean", Object.class, cls2);
                    cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                    cls.getMethod("getFloat", Object.class, cls2);
                    cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                    cls.getMethod("getDouble", Object.class, cls2);
                    cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                    return true;
                } catch (Throwable th) {
                    e98.i(th);
                    return false;
                }
            default:
                return super.i();
        }
    }

    @Override // o.c98
    public final boolean j() {
        switch (this.b) {
            case 0:
            case 1:
                return false;
            default:
                Unsafe unsafe = this.a;
                if (unsafe == null) {
                    return false;
                }
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (e98.c() == null) {
                        return false;
                    }
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        e98.i(th);
                        return false;
                    }
                } catch (Throwable th2) {
                    e98.i(th2);
                    return false;
                }
        }
    }
}
