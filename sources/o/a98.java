package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class a98 extends c98 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a98(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // o.c98
    public final boolean a(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (d98.h) {
                    if (d98.f(j, obj) == 0) {
                        return false;
                    }
                } else if (d98.g(j, obj) == 0) {
                    return false;
                }
                return true;
            case 1:
                if (d98.h) {
                    if (d98.f(j, obj) == 0) {
                        return false;
                    }
                } else if (d98.g(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                return this.a.getBoolean(obj, j);
        }
    }

    @Override // o.c98
    public final byte b(long j, Object obj) {
        switch (this.b) {
            case 0:
                return d98.h ? d98.f(j, obj) : d98.g(j, obj);
            case 1:
                return d98.h ? d98.f(j, obj) : d98.g(j, obj);
            default:
                return this.a.getByte(obj, j);
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
                if (!d98.h) {
                    d98.m(z ? (byte) 1 : (byte) 0, j, obj);
                } else {
                    d98.l(z ? (byte) 1 : (byte) 0, j, obj);
                }
                break;
            case 1:
                if (!d98.h) {
                    d98.m(z ? (byte) 1 : (byte) 0, j, obj);
                } else {
                    d98.l(z ? (byte) 1 : (byte) 0, j, obj);
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
                if (!d98.h) {
                    d98.m(b, j, obj);
                } else {
                    d98.l(b, j, obj);
                }
                break;
            case 1:
                if (!d98.h) {
                    d98.m(b, j, obj);
                } else {
                    d98.l(b, j, obj);
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
}
