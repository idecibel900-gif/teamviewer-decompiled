package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class uv8 extends c98 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv8(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override // o.c98
    public final double k(long j, Object obj) {
        byte b = this.b;
        Unsafe unsafe = this.a;
        switch (b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(unsafe.getLong(obj, j));
    }

    @Override // o.c98
    public final float l(long j, Object obj) {
        byte b = this.b;
        Unsafe unsafe = this.a;
        switch (b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(unsafe.getInt(obj, j));
    }

    @Override // o.c98
    public final void m(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!vv8.e) {
                    vv8.f(obj, j, z);
                } else {
                    vv8.e(obj, j, z);
                }
                break;
            default:
                if (!vv8.e) {
                    vv8.f(obj, j, z);
                } else {
                    vv8.e(obj, j, z);
                }
                break;
        }
    }

    @Override // o.c98
    public final void n(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // o.c98
    public final void o(Object obj, long j, float f) {
        byte b = this.b;
        Unsafe unsafe = this.a;
        switch (b) {
            case 0:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // o.c98
    public final boolean p(long j, Object obj) {
        switch (this.b) {
            case 0:
                return vv8.e ? vv8.i(j, obj) : vv8.j(j, obj);
            default:
                return vv8.e ? vv8.i(j, obj) : vv8.j(j, obj);
        }
    }
}
