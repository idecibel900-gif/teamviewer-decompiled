package o;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uv0 extends ey3 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uv0(List list, byte b) {
        super(list);
        this.h = b;
    }

    public static float j(dy3 dy3Var, float f) {
        Object obj = dy3Var.b;
        if (obj == null || dy3Var.c == null) {
            hk0.l("Missing values for keyframe.");
            return 0.0f;
        }
        float fFloatValue = dy3Var.i;
        if (fFloatValue == -3987645.8f) {
            fFloatValue = ((Float) obj).floatValue();
            dy3Var.i = fFloatValue;
        }
        float fFloatValue2 = dy3Var.j;
        if (fFloatValue2 == -3987645.8f) {
            fFloatValue2 = ((Float) dy3Var.c).floatValue();
            dy3Var.j = fFloatValue2;
        }
        return lr4.e(fFloatValue, fFloatValue2, f);
    }

    @Override // o.o30
    public final Object e(dy3 dy3Var, float f) {
        int iIntValue;
        Object obj;
        switch (this.h) {
            case 0:
                return Integer.valueOf(k(dy3Var, f));
            case 1:
                return Float.valueOf(j(dy3Var, f));
            case 2:
                Object obj2 = dy3Var.b;
                if (obj2 == null) {
                    hk0.l("Missing values for keyframe.");
                    return null;
                }
                Object obj3 = dy3Var.c;
                if (obj3 == null) {
                    iIntValue = dy3Var.k;
                    if (iIntValue == 784923401) {
                        iIntValue = ((Integer) obj2).intValue();
                        dy3Var.k = iIntValue;
                    }
                } else {
                    int i = dy3Var.l;
                    if (i == 784923401) {
                        iIntValue = ((Integer) obj3).intValue();
                        dy3Var.l = iIntValue;
                    } else {
                        iIntValue = i;
                    }
                }
                int iIntValue2 = dy3Var.k;
                if (iIntValue2 == 784923401) {
                    iIntValue2 = ((Integer) obj2).intValue();
                    dy3Var.k = iIntValue2;
                }
                PointF pointF = lr4.a;
                return Integer.valueOf((int) ((f * (iIntValue - iIntValue2)) + iIntValue2));
            default:
                return (f != 1.0f || (obj = dy3Var.c) == null) ? (j32) dy3Var.b : (j32) obj;
        }
    }

    public float i() {
        return j(this.c.e(), b());
    }

    public int k(dy3 dy3Var, float f) {
        if (dy3Var.b != null && dy3Var.c != null) {
            return yo1.A(lr4.b(f, 0.0f, 1.0f), ((Integer) dy3Var.b).intValue(), ((Integer) dy3Var.c).intValue());
        }
        hk0.l("Missing values for keyframe.");
        return 0;
    }
}
