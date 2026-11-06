package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public final class ml5 extends ReplacementSpan {
    public Paint.FontMetricsInt m;
    public boolean n;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.m;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        im3.e0("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.n) {
            return 0;
        }
        li3.b("PlaceholderSpan is not laid out yet.");
        return 0;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.n = true;
        paint.getTextSize();
        this.m = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            li3.a("Invalid fontMetrics: line height can not be negative.");
        }
        throw null;
    }
}
