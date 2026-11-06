package o;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class q94 implements LineHeightSpan {
    public final float m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1812o;
    public final boolean p;
    public final float q;
    public final int r;
    public int s = Integer.MIN_VALUE;
    public int t = Integer.MIN_VALUE;
    public int u = Integer.MIN_VALUE;
    public int v = Integer.MIN_VALUE;
    public int w;
    public int x;

    public q94(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.m = f;
        this.n = i;
        this.f1812o = z;
        this.p = z2;
        this.q = f2;
        this.r = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            li3.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.n;
        int i7 = this.r;
        boolean z3 = this.p;
        boolean z4 = this.f1812o;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.s == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.m);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.q;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i9);
                }
                int i10 = (int) dCeil;
                int i11 = fontMetricsInt.descent;
                int i12 = i10 + i11;
                this.u = i12;
                int i13 = i12 - iCeil;
                this.t = i13;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i13 = fontMetricsInt.ascent;
                    }
                    this.s = i13;
                    if (z3) {
                        i12 = i11;
                    }
                    this.v = i12;
                    this.w = fontMetricsInt.ascent - i13;
                    this.x = i12 - i11;
                } else if (i7 == 2) {
                    int i14 = fontMetricsInt.ascent;
                    this.s = z4 ? Math.max(i14, i13) : Math.min(i14, i13);
                    int i15 = fontMetricsInt.descent;
                    int i16 = this.u;
                    this.v = z3 ? Math.min(i15, i16) : Math.max(i15, i16);
                    this.w = 0;
                    this.x = 0;
                }
            } else {
                int i17 = fontMetricsInt.ascent;
                this.t = i17;
                int i18 = fontMetricsInt.descent;
                this.u = i18;
                this.s = i17;
                this.v = i18;
                this.w = 0;
                this.x = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.s : this.t;
        fontMetricsInt.descent = z2 ? this.v : this.u;
    }
}
