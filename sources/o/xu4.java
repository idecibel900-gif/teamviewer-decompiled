package o;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xu4 {
    public final yc4 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public xu4(yc4 yc4Var, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iH;
        int i5;
        this.a = yc4Var;
        this.b = i;
        if (r61.k(j) != 0 || r61.j(j) != 0) {
            li3.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) yc4Var.p;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= size) {
                i3 = 0;
                z = false;
                break;
            }
            df5 df5Var = (df5) arrayList2.get(i6);
            qj qjVar = df5Var.a;
            int i8 = r61.i(j);
            if (r61.d(j)) {
                i4 = i6;
                iH = r61.h(j) - ((int) Math.ceil(f));
                if (iH < 0) {
                    iH = 0;
                }
            } else {
                i4 = i6;
                iH = r61.h(j);
            }
            i3 = 0;
            mj mjVar = new mj(qjVar, this.b - i7, i2, t61.b(0, i8, 0, iH, 5));
            float f2 = mjVar.f + f;
            ts7 ts7Var = mjVar.d;
            int i9 = i7 + ts7Var.g;
            arrayList.add(new cf5(mjVar, df5Var.b, df5Var.c, i7, i9, f, f2));
            if (!ts7Var.d) {
                if (i9 == this.b) {
                    i5 = i4;
                    if (i5 != qf0.D((ArrayList) this.a.p)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i9;
                f = f2;
            }
            z = true;
            i7 = i9;
            f = f2;
            break;
        }
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = r61.i(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = i3; i10 < size2; i10++) {
            cf5 cf5Var = (cf5) arrayList.get(i10);
            List list = cf5Var.a.g;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i11 = i3; i11 < size3; i11++) {
                v56 v56Var = (v56) list.get(i11);
                arrayList4.add(v56Var != null ? cf5Var.a(v56Var) : null);
            }
            qv0.c0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.n).size()) {
            int size4 = ((List) this.a.n).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i12 = i3; i12 < size4; i12++) {
                arrayList5.add(null);
            }
            arrayList3 = lv0.A0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void i(xu4 xu4Var, ll0 ll0Var, long j, lw6 lw6Var, vp7 vp7Var, v52 v52Var) {
        ll0Var.g();
        ArrayList arrayList = xu4Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cf5 cf5Var = (cf5) arrayList.get(i);
            cf5Var.a.e(ll0Var, j, lw6Var, vp7Var, v52Var);
            ll0Var.o(0.0f, cf5Var.a.f);
        }
        ll0Var.p();
    }

    public static void j(xu4 xu4Var, ll0 ll0Var, sb0 sb0Var, float f, lw6 lw6Var, vp7 vp7Var, v52 v52Var) {
        ll0Var.g();
        ArrayList arrayList = xu4Var.h;
        if (arrayList.size() <= 1 || (sb0Var instanceof t57)) {
            ga0.m(xu4Var, ll0Var, sb0Var, f, lw6Var, vp7Var, v52Var);
        } else {
            if (!(sb0Var instanceof iw6)) {
                gk0.s();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float f2 = 0.0f;
            for (int i = 0; i < size; i++) {
                mj mjVar = ((cf5) arrayList.get(i)).a;
                f2 += mjVar.f;
                fMax = Math.max(fMax, mjVar.c());
            }
            Shader shaderC = ((iw6) sb0Var).c((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderC.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                mj mjVar2 = ((cf5) arrayList.get(i2)).a;
                mjVar2.f(ll0Var, new tb0(shaderC), f, lw6Var, vp7Var, v52Var);
                ll0Var.o(0.0f, mjVar2.f);
                matrix.setTranslate(0.0f, -mjVar2.f);
                shaderC.setLocalMatrix(matrix);
            }
        }
        ll0Var.p();
    }

    public final void a(long j, float[] fArr) {
        k(gt7.f(j));
        l(gt7.e(j));
        i76 i76Var = new i76();
        i76Var.m = 0;
        ct1.I(this.h, j, new a90(j, fArr, i76Var, new h76()));
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        cf5 cf5Var = (cf5) arrayList.get(ct1.G(i, arrayList));
        mj mjVar = cf5Var.a;
        return mjVar.d.d(i - cf5Var.d) + cf5Var.f;
    }

    public final int c(int i, boolean z) {
        int iE;
        m(i);
        ArrayList arrayList = this.h;
        cf5 cf5Var = (cf5) arrayList.get(ct1.G(i, arrayList));
        mj mjVar = cf5Var.a;
        int i2 = i - cf5Var.d;
        ts7 ts7Var = mjVar.d;
        if (z) {
            Layout layout = ts7Var.f;
            ThreadLocal threadLocal = xs7.a;
            if (layout.getEllipsisCount(i2) <= 0 || ts7Var.b != TextUtils.TruncateAt.END) {
                yc4 yc4VarC = ts7Var.c();
                Layout layout2 = (Layout) yc4VarC.m;
                iE = yc4VarC.O(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iE = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iE = ts7Var.e(i2);
        }
        return iE + cf5Var.b;
    }

    public final int d(int i) {
        int iF;
        int length = ((xo) this.a.m).n.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            iF = arrayList.size() - 1;
        } else {
            iF = i < 0 ? 0 : ct1.F(i, arrayList);
        }
        cf5 cf5Var = (cf5) arrayList.get(iF);
        return cf5Var.a.d.f(cf5Var.d(i)) + cf5Var.d;
    }

    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        cf5 cf5Var = (cf5) arrayList.get(ct1.H(arrayList, f));
        int i = cf5Var.c - cf5Var.b;
        int i2 = cf5Var.d;
        if (i == 0) {
            return i2;
        }
        mj mjVar = cf5Var.a;
        float f2 = f - cf5Var.f;
        ts7 ts7Var = mjVar.d;
        int i3 = (int) (f2 - 0.0f);
        int i4 = ts7Var.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = ts7Var.f.getLineForVertical(i3 - ts7Var.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        cf5 cf5Var = (cf5) arrayList.get(ct1.G(i, arrayList));
        mj mjVar = cf5Var.a;
        return mjVar.d.h(i - cf5Var.d) + cf5Var.f;
    }

    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        cf5 cf5Var = (cf5) arrayList.get(ct1.H(arrayList, fIntBitsToFloat));
        int i2 = cf5Var.c;
        int i3 = cf5Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        mj mjVar = cf5Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - cf5Var.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        ts7 ts7Var = mjVar.d;
        int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) - 0.0f);
        Layout layout = ts7Var.f;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - ts7Var.h);
        if (lineForVertical >= ts7Var.g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (ts7Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final long h(v56 v56Var, int i, ds7 ds7Var) {
        long jB;
        long j;
        float f = v56Var.b;
        ArrayList arrayList = this.h;
        int iH = ct1.H(arrayList, f);
        float f2 = ((cf5) arrayList.get(iH)).g;
        float f3 = v56Var.d;
        if (f2 >= f3 || iH == arrayList.size() - 1) {
            cf5 cf5Var = (cf5) arrayList.get(iH);
            return cf5Var.b(cf5Var.a.b(cf5Var.c(v56Var), i, ds7Var), true);
        }
        int iH2 = ct1.H(arrayList, f3);
        long jB2 = gt7.b;
        while (true) {
            jB = gt7.b;
            if (!gt7.b(jB2, jB) || iH > iH2) {
                break;
            }
            cf5 cf5Var2 = (cf5) arrayList.get(iH);
            jB2 = cf5Var2.b(cf5Var2.a.b(cf5Var2.c(v56Var), i, ds7Var), true);
            iH++;
        }
        if (gt7.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = gt7.b;
            if (!gt7.b(jB, j) || iH > iH2) {
                break;
            }
            cf5 cf5Var3 = (cf5) arrayList.get(iH2);
            jB = cf5Var3.b(cf5Var3.a.b(cf5Var3.c(v56Var), i, ds7Var), true);
            iH2--;
        }
        return gt7.b(jB, j) ? jB2 : h57.a((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void k(int i) {
        xo xoVar = (xo) this.a.m;
        if (i < 0 || i >= xoVar.n.length()) {
            li3.a("offset(" + i + ") is out of bounds [0, " + xoVar.n.length() + ")");
        }
    }

    public final void l(int i) {
        xo xoVar = (xo) this.a.m;
        if (i < 0 || i > xoVar.n.length()) {
            li3.a("offset(" + i + ") is out of bounds [0, " + xoVar.n.length() + "]");
        }
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        li3.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
    }
}
