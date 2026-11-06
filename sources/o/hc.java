package o;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hc implements zd1 {
    public final zd1 a;
    public final float b;

    public hc(float f, zd1 zd1Var) {
        while (zd1Var instanceof hc) {
            zd1Var = ((hc) zd1Var).a;
            f += ((hc) zd1Var).b;
        }
        this.a = zd1Var;
        this.b = f;
    }

    @Override // o.zd1
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj;
        return this.a.equals(hcVar.a) && this.b == hcVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
