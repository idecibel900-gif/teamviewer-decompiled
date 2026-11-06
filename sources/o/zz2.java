package o;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zz2 extends ey3 {
    public final /* synthetic */ byte h;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz2(List list, byte b) {
        super(list);
        this.h = b;
        switch (b) {
            case 1:
                super(list);
                this.i = new PointF();
                break;
            case 2:
                super(list);
                this.i = new ri6(1.0f, 1.0f);
                break;
            default:
                int iMax = 0;
                for (int i = 0; i < list.size(); i++) {
                    yz2 yz2Var = (yz2) ((dy3) list.get(i)).b;
                    if (yz2Var != null) {
                        iMax = Math.max(iMax, yz2Var.b.length);
                    }
                }
                this.i = new yz2(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // o.o30
    public final Object e(dy3 dy3Var, float f) {
        Object obj;
        byte b = this.h;
        Object obj2 = this.i;
        switch (b) {
            case 0:
                yz2 yz2Var = (yz2) obj2;
                yz2 yz2Var2 = (yz2) dy3Var.b;
                yz2 yz2Var3 = (yz2) dy3Var.c;
                int[] iArr = yz2Var.b;
                float[] fArr = yz2Var.a;
                boolean zEquals = yz2Var2.equals(yz2Var3);
                int[] iArr2 = yz2Var2.b;
                if (zEquals || f <= 0.0f) {
                    yz2Var.a(yz2Var2);
                } else if (f >= 1.0f) {
                    yz2Var.a(yz2Var3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = yz2Var3.b;
                    if (length != iArr3.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr2.length);
                        sb.append(" vs ");
                        hk0.g(to7.l(sb, iArr3.length, ")"));
                        return null;
                    }
                    for (int i = 0; i < iArr2.length; i++) {
                        fArr[i] = lr4.e(yz2Var2.a[i], yz2Var3.a[i], f);
                        iArr[i] = yo1.A(f, iArr2[i], iArr3[i]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return yz2Var;
            case 1:
                return i(dy3Var, f, f);
            default:
                ri6 ri6Var = (ri6) obj2;
                Object obj3 = dy3Var.b;
                if (obj3 == null || (obj = dy3Var.c) == null) {
                    hk0.l("Missing values for keyframe.");
                    return null;
                }
                ri6 ri6Var2 = (ri6) obj3;
                ri6 ri6Var3 = (ri6) obj;
                float fE = lr4.e(ri6Var2.a, ri6Var3.a, f);
                float fE2 = lr4.e(ri6Var2.b, ri6Var3.b, f);
                ri6Var.a = fE;
                ri6Var.b = fE2;
                return ri6Var;
        }
    }

    @Override // o.o30
    public /* bridge */ /* synthetic */ Object f(dy3 dy3Var, float f, float f2, float f3) {
        switch (this.h) {
            case 1:
                return i(dy3Var, f2, f3);
            default:
                return super.f(dy3Var, f, f2, f3);
        }
    }

    public PointF i(dy3 dy3Var, float f, float f2) {
        Object obj;
        PointF pointF = (PointF) this.i;
        Object obj2 = dy3Var.b;
        if (obj2 == null || (obj = dy3Var.c) == null) {
            hk0.l("Missing values for keyframe.");
            return null;
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        float f3 = pointF2.x;
        float fC = ua5.c(pointF3.x, f3, f, f3);
        float f4 = pointF2.y;
        pointF.set(fC, ua5.c(pointF3.y, f4, f2, f4));
        return pointF;
    }
}
