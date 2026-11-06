package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a68 extends ReplacementSpan {
    public final z58 n;
    public TextPaint q;
    public final Paint.FontMetricsInt m = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public short f304o = -1;
    public float p = 1.0f;

    public a68(z58 z58Var) {
        io1.A(z58Var, "rasterizer cannot be null");
        this.n = z58Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.q;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.q = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.f304o, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        a92.a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        z58 z58Var = this.n;
        j93 j93Var = z58Var.b;
        Typeface typeface = (Typeface) j93Var.q;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) j93Var.f1141o, z58Var.a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.m;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        z58 z58Var = this.n;
        ar4 ar4VarB = z58Var.b();
        int iA = ar4VarB.a(14);
        this.p = fAbs / (iA != 0 ? ((ByteBuffer) ar4VarB.p).getShort(iA + ar4VarB.m) : (short) 0);
        ar4 ar4VarB2 = z58Var.b();
        int iA2 = ar4VarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) ar4VarB2.p).getShort(iA2 + ar4VarB2.m);
        }
        ar4 ar4VarB3 = z58Var.b();
        int iA3 = ar4VarB3.a(12);
        short s = (short) ((iA3 != 0 ? ((ByteBuffer) ar4VarB3.p).getShort(iA3 + ar4VarB3.m) : (short) 0) * this.p);
        this.f304o = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
