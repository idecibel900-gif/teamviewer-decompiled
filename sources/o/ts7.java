package o;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ts7 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public cv0 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final q94[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f2140o = new Rect();
    public yc4 p;

    /* JADX WARN: Code duplicated, block: B:116:0x0216  */
    /* JADX WARN: Code duplicated, block: B:117:0x0218  */
    /* JADX WARN: Code duplicated, block: B:119:0x021d  */
    /* JADX WARN: Code duplicated, block: B:120:0x021f  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:89:0x019d A[PHI: r14
      0x019d: PHI (r14v7 int) = (r14v6 int), (r14v9 int) binds: [B:94:0x01af, B:87:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    public ts7(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, o04 o04Var) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutH;
        boolean z2;
        int i10;
        q94[] q94VarArr;
        int i11;
        int i12;
        long jA;
        int i13;
        long j;
        char c;
        int i14;
        long jA2;
        int i15;
        int i16;
        long jA3;
        ?? r13;
        boolean zIsFallbackLineSpacingEnabled;
        int topPadding;
        boolean zIsFallbackLineSpacingEnabled2;
        int i17;
        Paint.FontMetricsInt fontMetricsInt;
        boolean z3;
        ?? r15;
        q94 q94Var;
        q94 q94Var2;
        int i18;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = xs7.b(i2);
        Layout.Alignment alignment = ro7.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : ro7.b : ro7.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z4 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, i40.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = o04Var.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || o04Var.c() > f || z4) {
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutH = g57.h(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
                z2 = false;
            } else {
                if (iCeil < 0) {
                    li3.a("negative width");
                }
                if (iCeil < 0) {
                    li3.a("negative ellipsized width");
                }
                layoutH = Build.VERSION.SDK_INT >= 33 ? y3.f(charSequence, textPaint, iCeil, alignment2, metricsA, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                z2 = true;
            }
            this.f = layoutH;
            Trace.endSection();
            int iMin = Math.min(layoutH.getLineCount(), i9);
            this.g = iMin;
            int i19 = iMin - 1;
            this.d = iMin >= i9 && (layoutH.getEllipsisCount(i19) > 0 || layoutH.getLineEnd(i19) != charSequence.length());
            if (layoutH.getText() instanceof Spanned) {
                CharSequence text = layoutH.getText();
                text.getClass();
                if (m77.s((Spanned) text, q94.class) || layoutH.getText().length() <= 0) {
                    CharSequence text2 = layoutH.getText();
                    text2.getClass();
                    i10 = 0;
                    q94VarArr = (q94[]) ((Spanned) text2).getSpans(0, layoutH.getText().length(), q94.class);
                } else {
                    q94VarArr = null;
                    i10 = 0;
                }
            } else {
                q94VarArr = null;
                i10 = 0;
            }
            this.n = q94VarArr;
            if (q94VarArr == null || (q94Var2 = (q94) cx.S0(q94VarArr)) == null) {
                i11 = 2;
                i12 = i10;
            } else {
                if (q94Var2.f1812o) {
                    i11 = 2;
                    i18 = q94Var2.r == 2 ? 1 : i18;
                    i12 = i18;
                } else {
                    i11 = 2;
                }
                i18 = i10;
                i12 = i18;
            }
            int i20 = (q94VarArr == null || (q94Var = (q94) cx.S0(q94VarArr)) == null || !q94Var.p || q94Var.r != i11) ? i10 : 1;
            if (i12 == 0 || i20 == 0) {
                jA = xs7.b;
                if (z) {
                    i13 = 33;
                } else {
                    if (z2) {
                        BoringLayout boringLayout = (BoringLayout) layoutH;
                        i13 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            zIsFallbackLineSpacingEnabled2 = boringLayout.isFallbackLineSpacingEnabled();
                        } else {
                            r13 = i10;
                        }
                    } else {
                        i13 = 33;
                        StaticLayout staticLayout = (StaticLayout) layoutH;
                        int i21 = Build.VERSION.SDK_INT;
                        if (i21 >= 33) {
                            zIsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                        } else if (i21 >= 28) {
                            r13 = 1;
                        } else {
                            r13 = i10;
                        }
                    }
                    if (r13 == 0) {
                        r13 = zIsFallbackLineSpacingEnabled;
                        TextPaint paint = layoutH.getPaint();
                        CharSequence text3 = layoutH.getText();
                        c = ' ';
                        Rect rectV = zu1.v(paint, text3, layoutH.getLineStart(i10), layoutH.getLineEnd(i10));
                        int lineAscent = layoutH.getLineAscent(i10);
                        j = 4294967295L;
                        int i22 = rectV.top;
                        if (i22 < lineAscent) {
                            r13 = zIsFallbackLineSpacingEnabled2;
                            topPadding = lineAscent - i22;
                        } else {
                            r13 = zIsFallbackLineSpacingEnabled2;
                            topPadding = layoutH.getTopPadding();
                        }
                        i14 = 1;
                        rectV = iMin != 1 ? zu1.v(paint, text3, layoutH.getLineStart(i19), layoutH.getLineEnd(i19)) : rectV;
                        int lineDescent = layoutH.getLineDescent(i19);
                        int i23 = rectV.bottom;
                        int bottomPadding = i23 > lineDescent ? i23 - lineDescent : layoutH.getBottomPadding();
                        jA2 = (topPadding == 0 && bottomPadding == 0) ? jA2 : xs7.a(topPadding, bottomPadding);
                        if (i12 != 0) {
                            i15 = i10;
                        } else {
                            i15 = (int) (jA2 >> c);
                        }
                        if (i20 != 0) {
                            i16 = i10;
                        } else {
                            i16 = (int) (jA2 & j);
                        }
                        jA3 = xs7.a(i15, i16);
                    }
                    jA2 = jA;
                    if (i12 != 0) {
                        i15 = i10;
                    } else {
                        i15 = (int) (jA2 >> c);
                    }
                    if (i20 != 0) {
                        i16 = i10;
                    } else {
                        i16 = (int) (jA2 & j);
                    }
                    jA3 = xs7.a(i15, i16);
                }
                r13 = zIsFallbackLineSpacingEnabled;
                r13 = zIsFallbackLineSpacingEnabled2;
                c = ' ';
                j = 4294967295L;
                i14 = 1;
                jA2 = jA;
                if (i12 != 0) {
                    i15 = i10;
                } else {
                    i15 = (int) (jA2 >> c);
                }
                if (i20 != 0) {
                    i16 = i10;
                } else {
                    i16 = (int) (jA2 & j);
                }
                jA3 = xs7.a(i15, i16);
            } else {
                jA3 = xs7.b;
                jA = jA3;
                c = ' ';
                j = 4294967295L;
                i14 = 1;
                i13 = 33;
            }
            if (q94VarArr != null) {
                int length2 = q94VarArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i24 = iMax2; i24 < length2; i24++) {
                    q94 q94Var3 = q94VarArr[i24];
                    int i25 = q94Var3.w;
                    iMax = i25 < 0 ? Math.max(iMax, Math.abs(i25)) : iMax;
                    int i26 = q94Var3.x;
                    if (i26 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i26));
                    }
                }
                jA = (iMax == 0 && iMax2 == 0) ? xs7.b : xs7.a(iMax, iMax2);
            }
            this.h = Math.max((int) (jA3 >> c), (int) (jA >> c));
            this.i = Math.max((int) (jA3 & j), (int) (jA & j));
            TextPaint textPaint2 = this.a;
            q94[] q94VarArr2 = this.n;
            int i27 = this.g - i14;
            Layout layout = this.f;
            if (layout.getLineStart(i27) != layout.getLineEnd(i27) || q94VarArr2 == null || q94VarArr2.length == 0) {
                i17 = i10;
                fontMetricsInt = null;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                q94 q94Var4 = (q94) cx.R0(q94VarArr2);
                int length3 = spannableString.length();
                if (i27 == 0 || !(z3 = q94Var4.p)) {
                    boolean z5 = q94Var4.p;
                    z3 = z5 ? 1 : 0;
                    r15 = z5;
                } else {
                    r15 = i10;
                }
                spannableString.setSpan(new q94(q94Var4.m, length3, r15, z3, q94Var4.q, q94Var4.r), i10, spannableString.length(), i13);
                i17 = i10;
                StaticLayout staticLayoutH = g57.h(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, h04.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutH.getLineAscent(i17);
                fontMetricsInt.descent = staticLayoutH.getLineDescent(i17);
                fontMetricsInt.top = staticLayoutH.getLineTop(i17);
                fontMetricsInt.bottom = staticLayoutH.getLineBottom(i17);
            }
            this.m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) g(i19)) : i17;
            this.l = fontMetricsInt;
            Layout layout2 = this.f;
            this.j = it1.A(layout2, i19, layout2.getPaint());
            Layout layout3 = this.f;
            this.k = it1.B(layout3, i19, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.m;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final yc4 c() {
        yc4 yc4Var = this.p;
        if (yc4Var != null) {
            return yc4Var;
        }
        yc4 yc4Var2 = new yc4();
        yc4Var2.m = this.f;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iY = ub7.Y(((Layout) yc4Var2.m).getText(), '\n', length, 4);
            length = iY < 0 ? ((Layout) yc4Var2.m).getText().length() : iY + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) yc4Var2.m).getText().length());
        yc4Var2.p = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        yc4Var2.n = arrayList2;
        yc4Var2.f2598o = new boolean[((ArrayList) yc4Var2.p).size()];
        ((ArrayList) yc4Var2.p).size();
        this.p = yc4Var2;
        return yc4Var2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.l) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i) {
        ThreadLocal threadLocal = xs7.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int f(int i) {
        int i2 = this.g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float g(int i) {
        return d(i) - h(i);
    }

    public final float h(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float i(int i, boolean z) {
        return b(f(i)) + c().H(i, true, z);
    }

    public final float j(int i, boolean z) {
        return b(f(i)) + c().H(i, false, z);
    }

    public final cv0 k() {
        cv0 cv0Var = this.e;
        if (cv0Var != null) {
            return cv0Var;
        }
        Layout layout = this.f;
        cv0 cv0Var2 = new cv0(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = cv0Var2;
        return cv0Var2;
    }
}
