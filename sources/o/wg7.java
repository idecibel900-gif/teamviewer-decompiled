package o;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wg7 extends iw6 implements yl3 {
    public final long c;
    public final ArrayList d;
    public final List e;

    public wg7(long j, ArrayList arrayList, List list) {
        this.c = j;
        this.d = arrayList;
        this.e = list;
    }

    @Override // o.yl3
    public final Object b(float f, Object obj) {
        if (obj == null) {
            obj = new t57(rv0.g);
        }
        boolean z = obj instanceof t57;
        List list = this.e;
        ArrayList arrayList = this.d;
        long j = this.c;
        if (z) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                long j2 = ((rv0) arrayList.get(i)).a;
                arrayList2.add(new rv0(((t57) obj).a));
            }
            obj = new wg7(j, arrayList2, list);
        }
        if (!(obj instanceof wg7)) {
            return null;
        }
        wg7 wg7Var = (wg7) obj;
        return new wg7(ct1.N(j, wg7Var.c, f), ck3.W(arrayList, wg7Var.d, f), ck3.X(list, wg7Var.e, f));
    }

    @Override // o.iw6
    public final Shader c(long j) {
        long jFloatToRawIntBits;
        long j2 = this.c;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            jFloatToRawIntBits = vt1.u(j);
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat(i2);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        }
        ArrayList arrayList = this.d;
        List list = this.e;
        xk0.M(arrayList, list);
        if (Build.VERSION.SDK_INT >= 29) {
            return a03.a.c(jFloatToRawIntBits, xk0.K(arrayList), list != null ? lv0.N0(list) : null);
        }
        return new SweepGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), xk0.A(arrayList), xk0.B(list, arrayList));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg7)) {
            return false;
        }
        wg7 wg7Var = (wg7) obj;
        return t65.b(this.c, wg7Var.c) && this.d.equals(wg7Var.d) && im3.n(this.e, wg7Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (Long.hashCode(this.c) * 31)) * 31;
        List list = this.e;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        long j = this.c;
        return "SweepGradient(" + ((9223372034707292159L & j) != 9205357640488583168L ? fx3.g("center=", t65.g(j), ", ") : "") + "colors=" + this.d + ", stops=" + this.e + ")";
    }
}
