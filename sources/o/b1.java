package o;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ c1 n;

    public /* synthetic */ b1(c1 c1Var, byte b) {
        this.m = b;
        this.n = c1Var;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        Object value;
        r97 r97Var;
        PointF pointF;
        byte b = this.m;
        f88 f88Var = f88.a;
        c1 c1Var = this.n;
        switch (b) {
            case 0:
                vd5 vd5Var = (vd5) obj;
                float fFloatValue = ((Number) vd5Var.n).floatValue() / ((Number) vd5Var.m).floatValue();
                l97 l97Var = c1Var.b;
                do {
                    value = l97Var.getValue();
                    r97Var = (r97) value;
                    pointF = r97Var.a;
                } while (!l97Var.j(value, r97Var.b(pointF.x * fFloatValue, pointF.y * fFloatValue)));
                break;
            case 1:
                c1Var.k();
                break;
            default:
                c1Var.k();
                break;
        }
        return f88Var;
    }
}
