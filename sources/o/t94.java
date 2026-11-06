package o;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t94 extends iw6 implements yl3 {
    public final List c;
    public final List d;
    public final long e;
    public final long f;
    public final int g;

    public t94(List list, List list2, long j, long j2, int i) {
        this.c = list;
        this.d = list2;
        this.e = j;
        this.f = j2;
        this.g = i;
    }

    @Override // o.yl3
    public final Object b(float f, Object obj) {
        if (obj == null) {
            obj = new t57(rv0.g);
        }
        boolean z = obj instanceof t57;
        List list = this.c;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                long j = ((rv0) list.get(i)).a;
                arrayList.add(new rv0(((t57) obj).a));
            }
            obj = new t94(arrayList, this.d, this.e, this.f, this.g);
        }
        if (!(obj instanceof t94)) {
            return null;
        }
        t94 t94Var = (t94) obj;
        ArrayList arrayListW = ck3.W(list, t94Var.c, f);
        ArrayList arrayListX = ck3.X(this.d, t94Var.d, f);
        long jY = ck3.Y(this.e, t94Var.e, f);
        long jY2 = ck3.Y(this.f, t94Var.f, f);
        if (f >= 0.5f) {
            this = t94Var;
        }
        return new t94(arrayListW, arrayListX, jY, jY2, this.g);
    }

    @Override // o.iw6
    public final Shader c(long j) {
        long j2 = this.e;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.c;
        List list2 = this.d;
        xk0.M(list, list2);
        int i5 = Build.VERSION.SDK_INT;
        int i6 = this.g;
        if (i5 >= 29) {
            return a03.a.a(jFloatToRawIntBits, jFloatToRawIntBits2, xk0.K(list), list2 != null ? lv0.N0(list2) : null, i6);
        }
        return new LinearGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)), xk0.A(list), xk0.B(list2, list), ck3.u0(i6));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t94)) {
            return false;
        }
        t94 t94Var = (t94) obj;
        return im3.n(this.c, t94Var.c) && im3.n(this.d, t94Var.d) && t65.b(this.e, t94Var.e) && t65.b(this.f, t94Var.f) && this.g == t94Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        List list = this.d;
        return Integer.hashCode(this.g) + fx3.c(fx3.c((iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        String str;
        long j = this.e;
        String strG = ((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? fx3.g("start=", t65.g(j), ", ") : "";
        long j2 = this.f;
        String strG2 = ((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? fx3.g("end=", t65.g(j2), ", ") : "";
        int i = this.g;
        if (i == 0) {
            str = "Clamp";
        } else if (i == 1) {
            str = "Repeated";
        } else if (i == 2) {
            str = "Mirror";
        } else {
            str = i == 3 ? "Decal" : "Unknown";
        }
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        sb.append(this.d);
        sb.append(", ");
        e41.t(sb, strG, strG2, "tileMode=", str);
        sb.append(")");
        return sb.toString();
    }
}
