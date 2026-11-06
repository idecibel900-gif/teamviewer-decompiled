package o;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vs7 {
    public final us7 a;
    public final xu4 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public vs7(us7 us7Var, xu4 xu4Var, long j) {
        float lineBaseline;
        this.a = us7Var;
        this.b = xu4Var;
        this.c = j;
        ArrayList arrayList = xu4Var.h;
        float fH = 0.0f;
        if (arrayList.isEmpty()) {
            lineBaseline = 0.0f;
        } else {
            ts7 ts7Var = ((cf5) arrayList.get(0)).a.d;
            Paint.FontMetricsInt fontMetricsInt = ts7Var.l;
            lineBaseline = ts7Var.h + ((ts7Var.g + (-1) != 0 || fontMetricsInt == null) ? ts7Var.f.getLineBaseline(0) : ts7Var.h(0) - fontMetricsInt.ascent) + 0.0f;
        }
        this.d = lineBaseline;
        if (!arrayList.isEmpty()) {
            cf5 cf5Var = (cf5) lv0.v0(arrayList);
            ts7 ts7Var2 = cf5Var.a.d;
            int i = ts7Var2.g - 1;
            Paint.FontMetricsInt fontMetricsInt2 = ts7Var2.l;
            fH = ts7Var2.h + (fontMetricsInt2 != null ? ts7Var2.h(i) - fontMetricsInt2.ascent : ts7Var2.f.getLineBaseline(i)) + 0.0f + cf5Var.f;
        }
        this.e = fH;
        this.f = xu4Var.g;
    }

    public final rb6 a(int i) {
        xu4 xu4Var = this.b;
        xu4Var.l(i);
        int length = ((xo) xu4Var.a.m).n.length();
        ArrayList arrayList = xu4Var.h;
        cf5 cf5Var = (cf5) arrayList.get(i == length ? arrayList.size() - 1 : ct1.F(i, arrayList));
        return cf5Var.a.d.f.isRtlCharAt(cf5Var.d(i)) ? rb6.n : rb6.m;
    }

    public final v56 b(int i) {
        float fJ;
        float fJ2;
        float fI;
        float fI2;
        xu4 xu4Var = this.b;
        xu4Var.k(i);
        ArrayList arrayList = xu4Var.h;
        cf5 cf5Var = (cf5) arrayList.get(ct1.F(i, arrayList));
        mj mjVar = cf5Var.a;
        int iD = cf5Var.d(i);
        CharSequence charSequence = mjVar.e;
        if (iD < 0 || iD >= charSequence.length()) {
            li3.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + ")");
        }
        ts7 ts7Var = mjVar.d;
        int iF = ts7Var.f(iD);
        float fH = ts7Var.h(iF);
        float fD = ts7Var.d(iF);
        Layout layout = ts7Var.f;
        boolean z = layout.getParagraphDirection(iF) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fI = ts7Var.j(iD, false);
                fI2 = ts7Var.j(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fI = ts7Var.i(iD, false);
                fI2 = ts7Var.i(iD + 1, true);
            } else {
                fJ = ts7Var.j(iD, false);
                fJ2 = ts7Var.j(iD + 1, true);
            }
            float f = fI;
            fJ = fI2;
            fJ2 = f;
        } else {
            fJ = ts7Var.i(iD, false);
            fJ2 = ts7Var.i(iD + 1, true);
        }
        RectF rectF = new RectF(fJ, fH, fJ2, fD);
        return cf5Var.a(new v56(rectF.left, rectF.top + 0.0f, rectF.right, rectF.bottom + 0.0f));
    }

    public final v56 c(int i) {
        xu4 xu4Var = this.b;
        xu4Var.l(i);
        int length = ((xo) xu4Var.a.m).n.length();
        ArrayList arrayList = xu4Var.h;
        cf5 cf5Var = (cf5) arrayList.get(i == length ? arrayList.size() - 1 : ct1.F(i, arrayList));
        mj mjVar = cf5Var.a;
        int iD = cf5Var.d(i);
        CharSequence charSequence = mjVar.e;
        ts7 ts7Var = mjVar.d;
        if (iD < 0 || iD > charSequence.length()) {
            li3.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float fI = ts7Var.i(iD, false);
        int iF = ts7Var.f(iD);
        return cf5Var.a(new v56(fI, ts7Var.h(iF) + 0.0f, fI, ts7Var.d(iF) + 0.0f));
    }

    public final boolean d() {
        long j = this.c;
        float f = (int) (j >> 32);
        xu4 xu4Var = this.b;
        return f < xu4Var.d || xu4Var.c || ((float) ((int) (j & 4294967295L))) < xu4Var.e;
    }

    public final float e(int i) {
        xu4 xu4Var = this.b;
        xu4Var.m(i);
        ArrayList arrayList = xu4Var.h;
        cf5 cf5Var = (cf5) arrayList.get(ct1.G(i, arrayList));
        mj mjVar = cf5Var.a;
        int i2 = i - cf5Var.d;
        ts7 ts7Var = mjVar.d;
        return ts7Var.f.getLineLeft(i2) + (i2 == ts7Var.g + (-1) ? ts7Var.j : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vs7) {
            vs7 vs7Var = (vs7) obj;
            if (im3.n(this.a, vs7Var.a) && this.b == vs7Var.b && dl3.b(this.c, vs7Var.c) && this.d == vs7Var.d && this.e == vs7Var.e && this.f.equals(vs7Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final float f(int i) {
        xu4 xu4Var = this.b;
        xu4Var.m(i);
        ArrayList arrayList = xu4Var.h;
        cf5 cf5Var = (cf5) arrayList.get(ct1.G(i, arrayList));
        mj mjVar = cf5Var.a;
        int i2 = i - cf5Var.d;
        ts7 ts7Var = mjVar.d;
        return ts7Var.f.getLineRight(i2) + (i2 == ts7Var.g + (-1) ? ts7Var.k : 0.0f);
    }

    public final int g(int i) {
        xu4 xu4Var = this.b;
        xu4Var.m(i);
        ArrayList arrayList = xu4Var.h;
        cf5 cf5Var = (cf5) arrayList.get(ct1.G(i, arrayList));
        mj mjVar = cf5Var.a;
        return mjVar.d.f.getLineStart(i - cf5Var.d) + cf5Var.b;
    }

    public final rb6 h(int i) {
        xu4 xu4Var = this.b;
        xu4Var.l(i);
        int length = ((xo) xu4Var.a.m).n.length();
        ArrayList arrayList = xu4Var.h;
        cf5 cf5Var = (cf5) arrayList.get(i == length ? arrayList.size() - 1 : ct1.F(i, arrayList));
        mj mjVar = cf5Var.a;
        int iD = cf5Var.d(i);
        ts7 ts7Var = mjVar.d;
        return ts7Var.f.getParagraphDirection(ts7Var.f(iD)) == 1 ? rb6.m : rb6.n;
    }

    public final int hashCode() {
        return this.f.hashCode() + e41.e(this.e, e41.e(this.d, fx3.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final rj i(int i, int i2) {
        xu4 xu4Var = this.b;
        xo xoVar = (xo) xu4Var.a.m;
        if (i < 0 || i > i2 || i2 > xoVar.n.length()) {
            int length = xoVar.n.length();
            StringBuilder sbJ = fx3.j(i, i2, "Start(", ") or End(", ") is out of range [0..");
            sbJ.append(length);
            sbJ.append("), or start > end!");
            li3.a(sbJ.toString());
        }
        if (i == i2) {
            return tj.a();
        }
        rj rjVarA = tj.a();
        ct1.I(xu4Var.h, h57.a(i, i2), new tj3(rjVarA, i, i2, (byte) 3));
        return rjVarA;
    }

    public final long j(int i) {
        int iT;
        int iS;
        int iS2;
        xu4 xu4Var = this.b;
        xu4Var.l(i);
        int length = ((xo) xu4Var.a.m).n.length();
        ArrayList arrayList = xu4Var.h;
        cf5 cf5Var = (cf5) arrayList.get(i == length ? arrayList.size() - 1 : ct1.F(i, arrayList));
        mj mjVar = cf5Var.a;
        int iD = cf5Var.d(i);
        cv0 cv0VarK = mjVar.d.k();
        if (cv0VarK.q(cv0VarK.t(iD))) {
            cv0VarK.a(iD);
            iT = iD;
            while (iT != -1 && (!cv0VarK.q(iT) || cv0VarK.m(iT))) {
                iT = cv0VarK.t(iT);
            }
        } else {
            cv0VarK.a(iD);
            if (cv0VarK.p(iD)) {
                iT = (!cv0VarK.n(iD) || cv0VarK.l(iD)) ? cv0VarK.t(iD) : iD;
            } else {
                iT = cv0VarK.l(iD) ? cv0VarK.t(iD) : -1;
            }
        }
        if (iT == -1) {
            iT = iD;
        }
        if (cv0VarK.m(cv0VarK.s(iD))) {
            cv0VarK.a(iD);
            iS = iD;
            while (iS != -1 && (cv0VarK.q(iS) || !cv0VarK.m(iS))) {
                iS = cv0VarK.s(iS);
            }
        } else {
            cv0VarK.a(iD);
            if (cv0VarK.l(iD)) {
                if (!cv0VarK.n(iD) || cv0VarK.p(iD)) {
                    iS2 = cv0VarK.s(iD);
                    iS = iS2;
                } else {
                    iS = iD;
                }
            } else if (cv0VarK.p(iD)) {
                iS2 = cv0VarK.s(iD);
                iS = iS2;
            } else {
                iS = -1;
            }
        }
        if (iS != -1) {
            iD = iS;
        }
        return cf5Var.b(h57.a(iT, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + dl3.c(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
