package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class vf1 implements LeadingMarginSpan {
    public final float m;
    public final float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2304o;
    public final int p;

    public vf1(float f, float f2, float f3, in1 in1Var, float f4) {
        this.m = f;
        this.n = f2;
        int iS0 = vn4.s0(f + f3);
        this.f2304o = iS0;
        this.p = vn4.s0(f4) - iS0;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i, final int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Integer numValueOf;
        if (canvas == null) {
            return;
        }
        final float f = (i3 + i5) / 2.0f;
        int i8 = i - this.f2304o;
        if (i8 < 0) {
            i8 = 0;
        }
        final int i9 = i8;
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        paint.setStyle(Paint.Style.FILL);
        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.m)) << 32) | (((long) Float.floatToRawIntBits(this.n)) & 4294967295L);
        Function0 function0 = new Function0(this) { // from class: o.uf1
            @Override // kotlin.jvm.functions.Function0
            public final Object a() {
                long j = jFloatToRawIntBits;
                float fB = y07.b(j) / 2.0f;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
                v56 v56VarV = qs1.v(0L, j);
                lf6 lf6Var = new lf6(v56VarV.a, v56VarV.b, v56VarV.c, v56VarV.d, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2);
                new pb5(lf6Var);
                float f2 = i9;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f3 = f;
                if (xo1.T(lf6Var)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
                    canvas2.drawRoundRect(f2, f3 - (lf6Var.a() / 2.0f), (lf6Var.b() * i2) + f2, (lf6Var.a() / 2.0f) + f3, fIntBitsToFloat, fIntBitsToFloat, paint2);
                } else {
                    rj rjVarA = tj.a();
                    rj.c(rjVarA, lf6Var);
                    canvas2.save();
                    canvas2.translate(f2, f3 - (lf6Var.a() / 2.0f));
                    canvas2.drawPath(rjVarA.a, paint2);
                    canvas2.restore();
                }
                return f88.a;
            }
        };
        if (Float.isNaN(Float.NaN)) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(Double.NaN));
        }
        function0.a();
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.p;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
