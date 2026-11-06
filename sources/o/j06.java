package o;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j06 extends iw6 implements yl3 {
    public final ArrayList c;
    public final List d;
    public final long e;
    public final float f;
    public final int g;

    public j06(ArrayList arrayList, List list, long j, float f, int i) {
        this.c = arrayList;
        this.d = list;
        this.e = j;
        this.f = f;
        this.g = i;
    }

    @Override // o.yl3
    public final Object b(float f, Object obj) {
        if (obj == null) {
            obj = new t57(rv0.g);
        }
        boolean z = obj instanceof t57;
        ArrayList arrayList = this.c;
        if (z) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                long j = ((rv0) arrayList.get(i)).a;
                arrayList2.add(new rv0(((t57) obj).a));
            }
            obj = new j06(arrayList2, this.d, this.e, this.f, this.g);
        }
        if (!(obj instanceof j06)) {
            return null;
        }
        j06 j06Var = (j06) obj;
        ArrayList arrayListW = ck3.W(arrayList, j06Var.c, f);
        ArrayList arrayListX = ck3.X(this.d, j06Var.d, f);
        long jN = ct1.N(this.e, j06Var.e, f);
        float fG = vs1.G(this.f, j06Var.f, f);
        if (f >= 0.5f) {
            this = j06Var;
        }
        return new j06(arrayListW, arrayListX, jN, fG, this.g);
    }

    @Override // o.iw6
    public final Shader c(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.e;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jU = vt1.u(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jU >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jU & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        float fB = this.f;
        if (fB == Float.POSITIVE_INFINITY) {
            fB = y07.b(j) / 2.0f;
        }
        float f = fB;
        ArrayList arrayList = this.c;
        List list = this.d;
        xk0.M(arrayList, list);
        int i3 = Build.VERSION.SDK_INT;
        int i4 = this.g;
        if (i3 >= 29) {
            return a03.a.b(jFloatToRawIntBits, f, xk0.K(arrayList), list != null ? lv0.N0(list) : null, i4);
        }
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), f, xk0.A(arrayList), xk0.B(list, arrayList), ck3.u0(i4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j06)) {
            return false;
        }
        j06 j06Var = (j06) obj;
        return this.c.equals(j06Var.c) && im3.n(this.d, j06Var.d) && t65.b(this.e, j06Var.e) && this.f == j06Var.f && this.g == j06Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        List list = this.d;
        return Integer.hashCode(this.g) + e41.e(this.f, fx3.c((iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.e), 31);
    }

    public final String toString() {
        String str;
        long j = this.e;
        String str2 = "";
        String strG = (9223372034707292159L & j) != 9205357640488583168L ? fx3.g("center=", t65.g(j), ", ") : "";
        float f = this.f;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
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
        StringBuilder sb = new StringBuilder("RadialGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        sb.append(this.d);
        sb.append(", ");
        e41.t(sb, strG, str2, "tileMode=", str);
        sb.append(")");
        return sb.toString();
    }
}
