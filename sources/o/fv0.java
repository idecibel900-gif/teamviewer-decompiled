package o;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fv0 {
    public el0 A;
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public Bitmap F;
    public float G;
    public float H;
    public int[] I;
    public boolean J;
    public final TextPaint K;
    public final TextPaint L;
    public TimeInterpolator M;
    public TimeInterpolator N;
    public float O;
    public float P;
    public float Q;
    public ColorStateList R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;
    public final ViewGroup a;
    public float a0;
    public boolean b;
    public float b0;
    public float c;
    public CharSequence c0;
    public boolean d;
    public float e;
    public float f;
    public int g;
    public final Rect h;
    public final Rect i;
    public final RectF j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f831o;
    public ColorStateList p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public el0 z;
    public int k = 16;
    public int l = 16;
    public float m = 15.0f;
    public float n = 15.0f;
    public boolean E = true;
    public int d0 = 1;
    public float e0 = 0.0f;
    public float f0 = 1.0f;
    public int g0 = 1;

    public fv0(ViewGroup viewGroup) {
        this.a = viewGroup;
        TextPaint textPaint = new TextPaint(129);
        this.K = textPaint;
        this.L = new TextPaint(textPaint);
        this.i = new Rect();
        this.h = new Rect();
        this.j = new RectF();
        float f = this.e;
        this.f = ua5.c(1.0f, f, 0.5f, f);
    }

    public static int a(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float g(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return lo.a(f, f2, f3);
    }

    public final float b() {
        if (this.B == null) {
            return 0.0f;
        }
        float f = this.n;
        TextPaint textPaint = this.L;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.w);
        textPaint.setLetterSpacing(this.W);
        CharSequence charSequence = this.B;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final boolean c(CharSequence charSequence) {
        WeakHashMap weakHashMap = be8.a;
        boolean z = this.a.getLayoutDirection() == 1;
        if (this.E) {
            return (z ? yp7.d : yp7.c).f(charSequence.length(), charSequence);
        }
        return z;
    }

    public final void d(float f, boolean z) {
        boolean z2;
        float f2;
        boolean z3;
        if (this.B == null) {
            return;
        }
        float fWidth = this.i.width();
        float fWidth2 = this.h.width();
        if (Math.abs(f - this.n) < 0.001f) {
            f2 = this.n;
            this.G = 1.0f;
            Typeface typeface = this.y;
            Typeface typeface2 = this.w;
            if (typeface != typeface2) {
                this.y = typeface2;
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            float f3 = this.m;
            Typeface typeface3 = this.y;
            Typeface typeface4 = this.x;
            if (typeface3 != typeface4) {
                this.y = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (Math.abs(f - f3) < 0.001f) {
                this.G = 1.0f;
            } else {
                this.G = f / this.m;
            }
            float f4 = this.n / this.m;
            fWidth = (!z && fWidth2 * f4 > fWidth) ? Math.min(fWidth / f4, fWidth2) : fWidth2;
            f2 = f3;
            z3 = z2;
        }
        if (fWidth > 0.0f) {
            z3 = this.H != f2 || this.J || z3;
            this.H = f2;
            this.J = false;
        }
        if (this.C == null || z3) {
            float f5 = this.H;
            TextPaint textPaint = this.K;
            textPaint.setTextSize(f5);
            textPaint.setTypeface(this.y);
            textPaint.setLinearText(this.G != 1.0f);
            boolean zC = c(this.B);
            this.D = zC;
            int i = this.d0;
            if (i <= 1 || (zC && !this.d)) {
                i = 1;
            }
            CharSequence charSequenceEllipsize = this.B;
            int i2 = (int) fWidth;
            int length = charSequenceEllipsize.length();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
            float f6 = this.e0;
            float f7 = this.f0;
            int i3 = this.g0;
            if (charSequenceEllipsize == null) {
                charSequenceEllipsize = "";
            }
            int iMax = Math.max(0, i2);
            if (i == 1) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, truncateAt);
            }
            int iMin = Math.min(charSequenceEllipsize.length(), length);
            if (zC && i == 1) {
                alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
            builderObtain.setAlignment(alignment2);
            builderObtain.setIncludePad(false);
            builderObtain.setTextDirection(zC ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            if (truncateAt != null) {
                builderObtain.setEllipsize(truncateAt);
            }
            builderObtain.setMaxLines(i);
            if (f6 != 0.0f || f7 != 1.0f) {
                builderObtain.setLineSpacing(f6, f7);
            }
            if (i > 1) {
                builderObtain.setHyphenationFrequency(i3);
            }
            StaticLayout staticLayoutBuild = builderObtain.build();
            staticLayoutBuild.getClass();
            this.Y = staticLayoutBuild;
            this.C = staticLayoutBuild.getText();
        }
    }

    public final void e(Canvas canvas) {
        int iSave = canvas.save();
        if (this.C == null || !this.b) {
            return;
        }
        int i = this.d0;
        StaticLayout staticLayout = this.Y;
        float lineStart = (this.u + (i > 1 ? staticLayout.getLineStart(0) : staticLayout.getLineLeft(0))) - (this.b0 * 2.0f);
        float f = this.H;
        TextPaint textPaint = this.K;
        textPaint.setTextSize(f);
        float f2 = this.u;
        float f3 = this.v;
        float f4 = this.G;
        if (f4 != 1.0f && !this.d) {
            canvas.scale(f4, f4, f2, f3);
        }
        if (this.d0 <= 1 || ((this.D && !this.d) || (this.d && this.c <= this.f))) {
            canvas.translate(f2, f3);
            this.Y.draw(canvas);
        } else {
            int alpha = textPaint.getAlpha();
            canvas.translate(lineStart, f3);
            float f5 = alpha;
            textPaint.setAlpha((int) (this.a0 * f5));
            this.Y.draw(canvas);
            textPaint.setAlpha((int) (this.Z * f5));
            int lineBaseline = this.Y.getLineBaseline(0);
            CharSequence charSequence = this.c0;
            float f6 = lineBaseline;
            canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f6, textPaint);
            if (!this.d) {
                String strTrim = this.c0.toString().trim();
                if (strTrim.endsWith("…")) {
                    strTrim = strTrim.substring(0, strTrim.length() - 1);
                }
                String str = strTrim;
                textPaint.setAlpha(alpha);
                canvas.drawText(str, 0, Math.min(this.Y.getLineEnd(0), str.length()), 0.0f, f6, (Paint) textPaint);
            }
            canvas = canvas;
        }
        canvas.restoreToCount(iSave);
    }

    public final int f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.I;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    public final void h() {
        boolean z;
        Rect rect = this.i;
        if (rect.width() <= 0 || rect.height() <= 0) {
            z = false;
        } else {
            Rect rect2 = this.h;
            if (rect2.width() <= 0 || rect2.height() <= 0) {
                z = false;
            } else {
                z = true;
            }
        }
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x025e  */
    public final void i(boolean z) {
        float lineStart;
        float f;
        StaticLayout staticLayout;
        ViewGroup viewGroup = this.a;
        if ((viewGroup.getHeight() <= 0 || viewGroup.getWidth() <= 0) && !z) {
            return;
        }
        float f2 = this.H;
        d(this.n, z);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.K;
        if (charSequence != null && (staticLayout = this.Y) != null) {
            this.c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.c0;
        float fA = 0.0f;
        float fMeasureText = charSequence2 != null ? textPaint.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int absoluteGravity = Gravity.getAbsoluteGravity(this.l, this.D ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.i;
        if (i == 48) {
            this.r = rect.top;
        } else if (i != 80) {
            this.r = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.r = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.t = rect.centerX() - (fMeasureText / 2.0f);
        } else if (i2 != 5) {
            this.t = rect.left;
        } else {
            this.t = rect.right - fMeasureText;
        }
        d(this.m, z);
        StaticLayout staticLayout2 = this.Y;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        CharSequence charSequence3 = this.C;
        float fMeasureText2 = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.Y;
        if (staticLayout3 != null && this.d0 > 1) {
            fMeasureText2 = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.Y;
        if (staticLayout4 != null) {
            lineStart = this.d0 > 1 ? staticLayout4.getLineStart(0) : staticLayout4.getLineLeft(0);
        } else {
            lineStart = 0.0f;
        }
        this.b0 = lineStart;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.k, this.D ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.h;
        if (i3 == 48) {
            this.q = rect2.top;
        } else if (i3 != 80) {
            this.q = rect2.centerY() - (height / 2.0f);
        } else {
            this.q = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.s = rect2.centerX() - (fMeasureText2 / 2.0f);
        } else if (i4 != 5) {
            this.s = rect2.left;
        } else {
            this.s = rect2.right - fMeasureText2;
        }
        Bitmap bitmap = this.F;
        if (bitmap != null) {
            bitmap.recycle();
            this.F = null;
        }
        o(f2);
        float f3 = this.c;
        boolean z2 = this.d;
        RectF rectF = this.j;
        if (z2) {
            if (f3 < this.f) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = g(rect2.left, rect.left, f3, this.M);
            rectF.top = g(this.q, this.r, f3, this.M);
            rectF.right = g(rect2.right, rect.right, f3, this.M);
            rectF.bottom = g(rect2.bottom, rect.bottom, f3, this.M);
        }
        if (!this.d) {
            this.u = g(this.s, this.t, f3, this.M);
            this.v = g(this.q, this.r, f3, this.M);
            o(g(this.m, this.n, f3, this.N));
            f = f3;
        } else if (f3 < this.f) {
            this.u = this.s;
            this.v = this.q;
            o(this.m);
            f = 0.0f;
        } else {
            this.u = this.t;
            this.v = this.r - Math.max(0, this.g);
            o(this.n);
            f = 1.0f;
        }
        rh2 rh2Var = lo.b;
        this.Z = 1.0f - g(0.0f, 1.0f, 1.0f - f3, rh2Var);
        WeakHashMap weakHashMap = be8.a;
        viewGroup.postInvalidateOnAnimation();
        this.a0 = g(1.0f, 0.0f, f3, rh2Var);
        viewGroup.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.p;
        ColorStateList colorStateList2 = this.f831o;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f, f(colorStateList2), f(this.p)));
        } else {
            textPaint.setColor(f(colorStateList));
        }
        float f4 = this.W;
        float f5 = this.X;
        if (f4 != f5) {
            textPaint.setLetterSpacing(g(f5, f4, f3, rh2Var));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        textPaint.setShadowLayer(lo.a(this.S, this.O, f3), lo.a(this.T, this.P, f3), lo.a(this.U, this.Q, f3), a(f3, f(this.V), f(this.R)));
        if (this.d) {
            float f6 = this.f;
            if (f3 <= f6) {
                float f7 = this.e;
                if (f3 < f7) {
                    fA = 1.0f;
                } else if (f3 <= f6) {
                    fA = lo.a(1.0f, 0.0f, (f3 - f7) / (f6 - f7));
                }
            } else if (f3 >= f6) {
                if (f3 > 1.0f) {
                    fA = 1.0f;
                } else {
                    fA = lo.a(0.0f, 1.0f, (f3 - f6) / (1.0f - f6));
                }
            }
            textPaint.setAlpha((int) (fA * 255.0f));
        }
        viewGroup.postInvalidateOnAnimation();
    }

    public final void j(int i) {
        ViewGroup viewGroup = this.a;
        ap7 ap7Var = new ap7(viewGroup.getContext(), i);
        ColorStateList colorStateList = ap7Var.a;
        if (colorStateList != null) {
            this.p = colorStateList;
        }
        float f = ap7Var.k;
        if (f != 0.0f) {
            this.n = f;
        }
        ColorStateList colorStateList2 = ap7Var.b;
        if (colorStateList2 != null) {
            this.R = colorStateList2;
        }
        this.P = ap7Var.f;
        this.Q = ap7Var.g;
        this.O = ap7Var.h;
        this.W = ap7Var.j;
        el0 el0Var = this.A;
        if (el0Var != null) {
            el0Var.c = true;
        }
        ev0 ev0Var = new ev0(this, (byte) 0);
        ap7Var.a();
        this.A = new el0(ev0Var, ap7Var.n);
        ap7Var.c(viewGroup.getContext(), this.A);
        i(false);
    }

    public final void k(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            i(false);
        }
    }

    public final void l(int i) {
        if (this.l != i) {
            this.l = i;
            i(false);
        }
    }

    public final void m(int i) {
        ViewGroup viewGroup = this.a;
        ap7 ap7Var = new ap7(viewGroup.getContext(), i);
        ColorStateList colorStateList = ap7Var.a;
        if (colorStateList != null) {
            this.f831o = colorStateList;
        }
        float f = ap7Var.k;
        if (f != 0.0f) {
            this.m = f;
        }
        ColorStateList colorStateList2 = ap7Var.b;
        if (colorStateList2 != null) {
            this.V = colorStateList2;
        }
        this.T = ap7Var.f;
        this.U = ap7Var.g;
        this.S = ap7Var.h;
        this.X = ap7Var.j;
        el0 el0Var = this.z;
        if (el0Var != null) {
            el0Var.c = true;
        }
        ev0 ev0Var = new ev0(this, (byte) 1);
        ap7Var.a();
        this.z = new el0(ev0Var, ap7Var.n);
        ap7Var.c(viewGroup.getContext(), this.z);
        i(false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0143  */
    public final void n(float f) {
        float f2;
        float fA = 0.0f;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.c) {
            this.c = f;
            boolean z = this.d;
            Rect rect = this.i;
            Rect rect2 = this.h;
            RectF rectF = this.j;
            if (z) {
                if (f < this.f) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, f, this.M);
                rectF.top = g(this.q, this.r, f, this.M);
                rectF.right = g(rect2.right, rect.right, f, this.M);
                rectF.bottom = g(rect2.bottom, rect.bottom, f, this.M);
            }
            if (!this.d) {
                this.u = g(this.s, this.t, f, this.M);
                this.v = g(this.q, this.r, f, this.M);
                o(g(this.m, this.n, f, this.N));
                f2 = f;
            } else if (f < this.f) {
                this.u = this.s;
                this.v = this.q;
                o(this.m);
                f2 = 0.0f;
            } else {
                this.u = this.t;
                this.v = this.r - Math.max(0, this.g);
                o(this.n);
                f2 = 1.0f;
            }
            rh2 rh2Var = lo.b;
            this.Z = 1.0f - g(0.0f, 1.0f, 1.0f - f, rh2Var);
            WeakHashMap weakHashMap = be8.a;
            ViewGroup viewGroup = this.a;
            viewGroup.postInvalidateOnAnimation();
            this.a0 = g(1.0f, 0.0f, f, rh2Var);
            viewGroup.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.p;
            ColorStateList colorStateList2 = this.f831o;
            TextPaint textPaint = this.K;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f2, f(colorStateList2), f(this.p)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            float f3 = this.W;
            float f4 = this.X;
            if (f3 != f4) {
                textPaint.setLetterSpacing(g(f4, f3, f, rh2Var));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            textPaint.setShadowLayer(lo.a(this.S, this.O, f), lo.a(this.T, this.P, f), lo.a(this.U, this.Q, f), a(f, f(this.V), f(this.R)));
            if (this.d) {
                float f5 = this.f;
                if (f <= f5) {
                    float f6 = this.e;
                    if (f < f6) {
                        fA = 1.0f;
                    } else if (f <= f5) {
                        fA = lo.a(1.0f, 0.0f, (f - f6) / (f5 - f6));
                    }
                } else if (f >= f5) {
                    if (f > 1.0f) {
                        fA = 1.0f;
                    } else {
                        fA = lo.a(0.0f, 1.0f, (f - f5) / (1.0f - f5));
                    }
                }
                textPaint.setAlpha((int) (fA * 255.0f));
            }
            viewGroup.postInvalidateOnAnimation();
        }
    }

    public final void o(float f) {
        d(f, false);
        WeakHashMap weakHashMap = be8.a;
        this.a.postInvalidateOnAnimation();
    }
}
