package o;

import android.graphics.Rect;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class im0 extends ds5 {
    public final /* synthetic */ byte a;

    @Override // o.ds5
    public final float a(x07 x07Var, x07 x07Var2) {
        switch (this.a) {
            case 0:
                if (x07Var.m <= 0 || x07Var.n <= 0) {
                    return 0.0f;
                }
                x07 x07VarA = x07Var.a(x07Var2);
                float f = x07VarA.m * 1.0f;
                float fPow = f / x07Var.m;
                if (fPow > 1.0f) {
                    fPow = (float) Math.pow(1.0f / fPow, 1.1d);
                }
                float f2 = ((x07VarA.n * 1.0f) / x07Var2.n) + (f / x07Var2.m);
                return ((1.0f / f2) / f2) * fPow;
            case 1:
                if (x07Var.m <= 0 || x07Var.n <= 0) {
                    return 0.0f;
                }
                x07 x07VarB = x07Var.b(x07Var2);
                float f3 = x07VarB.m;
                float fPow2 = (f3 * 1.0f) / x07Var.m;
                if (fPow2 > 1.0f) {
                    fPow2 = (float) Math.pow(1.0f / fPow2, 1.1d);
                }
                float f4 = ((x07Var2.n * 1.0f) / x07VarB.n) * ((x07Var2.m * 1.0f) / f3);
                return (((1.0f / f4) / f4) / f4) * fPow2;
            default:
                int i = x07Var.m;
                int i2 = x07Var.n;
                if (i <= 0 || i2 <= 0) {
                    return 0.0f;
                }
                int i3 = x07Var2.m;
                int i4 = x07Var2.n;
                float f5 = (i * 1.0f) / i3;
                if (f5 < 1.0f) {
                    f5 = 1.0f / f5;
                }
                float f6 = i2;
                float f7 = i4;
                float f8 = (f6 * 1.0f) / f7;
                if (f8 < 1.0f) {
                    f8 = 1.0f / f8;
                }
                float f9 = (1.0f / f5) / f8;
                float f10 = ((i * 1.0f) / f6) / ((i3 * 1.0f) / f7);
                if (f10 < 1.0f) {
                    f10 = 1.0f / f10;
                }
                return (((1.0f / f10) / f10) / f10) * f9;
        }
    }

    @Override // o.ds5
    public final Rect b(x07 x07Var, x07 x07Var2) {
        switch (this.a) {
            case 0:
                x07 x07VarA = x07Var.a(x07Var2);
                Log.i("im0", "Preview: " + x07Var + "; Scaled: " + x07VarA + "; Want: " + x07Var2);
                int i = x07VarA.m;
                int i2 = (i - x07Var2.m) / 2;
                int i3 = x07VarA.n;
                int i4 = (i3 - x07Var2.n) / 2;
                return new Rect(-i2, -i4, i - i2, i3 - i4);
            case 1:
                x07 x07VarB = x07Var.b(x07Var2);
                Log.i("im0", "Preview: " + x07Var + "; Scaled: " + x07VarB + "; Want: " + x07Var2);
                int i5 = x07VarB.m;
                int i6 = (i5 - x07Var2.m) / 2;
                int i7 = x07VarB.n;
                int i8 = (i7 - x07Var2.n) / 2;
                return new Rect(-i6, -i8, i5 - i6, i7 - i8);
            default:
                return new Rect(0, 0, x07Var2.m, x07Var2.n);
        }
    }
}
