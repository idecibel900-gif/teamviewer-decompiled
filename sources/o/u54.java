package o;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class u54 {
    public final zi a;
    public final cj3 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public zr7 j;
    public vs7 k;
    public v65 l;
    public v56 m;
    public v56 n;
    public final Object c = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f2172o = new CursorAnchorInfo.Builder();
    public final float[] p = wn4.a();
    public final Matrix q = new Matrix();

    public u54(zi ziVar, cj3 cj3Var) {
        this.a = ziVar;
        this.b = cj3Var;
    }

    public final void a() {
        cj3 cj3Var = this.b;
        InputMethodManager inputMethodManagerG = cj3Var.G();
        View view = (View) cj3Var.n;
        if (!inputMethodManagerG.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        wn4.d(fArr);
        i04 i04Var = (i04) ((t54) this.a.f2705o).D.getValue();
        if (i04Var != null) {
            if (!i04Var.m()) {
                i04Var = null;
            }
            if (i04Var != null) {
                i04Var.h(fArr);
            }
        }
        v56 v56Var = this.n;
        v56Var.getClass();
        float f = -v56Var.a;
        v56 v56Var2 = this.n;
        v56Var2.getClass();
        wn4.g(fArr, f, -v56Var2.b);
        Matrix matrix = this.q;
        kh.A(matrix, fArr);
        zr7 zr7Var = this.j;
        zr7Var.getClass();
        long j = zr7Var.b;
        v65 v65Var = this.l;
        v65Var.getClass();
        vs7 vs7Var = this.k;
        vs7Var.getClass();
        xu4 xu4Var = vs7Var.b;
        v56 v56Var3 = this.m;
        v56Var3.getClass();
        float f2 = v56Var3.d;
        float f3 = v56Var3.b;
        v56 v56Var4 = this.n;
        v56Var4.getClass();
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder = this.f2172o;
        builder.reset();
        builder.setMatrix(matrix);
        gt7 gt7Var = zr7Var.c;
        int iF = gt7.f(j);
        builder.setSelectionRange(iF, gt7.e(j));
        rb6 rb6Var = rb6.n;
        if (z && iF >= 0) {
            int iQ = v65Var.q(iF);
            v56 v56VarC = vs7Var.c(iQ);
            float fU = ct1.u(v56VarC.a, 0.0f, (int) (vs7Var.c >> 32));
            boolean zU = it1.u(v56Var3, fU, v56VarC.b);
            boolean zU2 = it1.u(v56Var3, fU, v56VarC.d);
            boolean z5 = vs7Var.a(iQ) == rb6Var;
            int i = (zU || zU2) ? 1 : 0;
            if (!zU || !zU2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f4 = v56VarC.b;
            float f5 = v56VarC.d;
            builder.setInsertionMarkerLocation(fU, f4, f5, f5, i);
        }
        CursorAnchorInfo.Builder builder2 = builder;
        if (z2) {
            int iF2 = gt7Var != null ? gt7.f(gt7Var.a) : -1;
            int iE = gt7Var != null ? gt7.e(gt7Var.a) : -1;
            if (iF2 >= 0 && iF2 < iE) {
                builder2.setComposingText(iF2, zr7Var.a.n.subSequence(iF2, iE));
                int iQ2 = v65Var.q(iF2);
                int iQ3 = v65Var.q(iE);
                float[] fArr2 = new float[(iQ3 - iQ2) * 4];
                xu4Var.a(h57.a(iQ2, iQ3), fArr2);
                while (iF2 < iE) {
                    int iQ4 = v65Var.q(iF2);
                    int i2 = (iQ4 - iQ2) * 4;
                    float f6 = fArr2[i2];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f7 = fArr2[i2 + 1];
                    int i3 = iQ2;
                    float f8 = fArr2[i2 + 2];
                    float f9 = fArr2[i2 + 3];
                    int i4 = iE;
                    int i5 = (v56Var3.a < f8 ? 1 : 0) & (f6 < v56Var3.c ? 1 : 0) & (f3 < f9 ? 1 : 0) & (f7 < f2 ? 1 : 0);
                    if (!it1.u(v56Var3, f6, f7) || !it1.u(v56Var3, f8, f9)) {
                        i5 |= 2;
                    }
                    if (vs7Var.a(iQ4) == rb6Var) {
                        i5 |= 4;
                    }
                    int i6 = iF2;
                    builder3.addCharacterBounds(i6, f6, f7, f8, f9, i5);
                    builder2 = builder3;
                    iF2 = i6 + 1;
                    iQ2 = i3;
                    iE = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            c4.q(builder2, v56Var4);
        }
        if (i7 >= 34 && z4 && !v56Var3.f()) {
            int i8 = xu4Var.f - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iV = ct1.v(xu4Var.e(f3), 0, i8);
            int iV2 = ct1.v(xu4Var.e(f2), 0, i8);
            if (iV <= iV2) {
                while (true) {
                    builder2.addVisibleLineBounds(vs7Var.e(iV), xu4Var.f(iV), vs7Var.f(iV), xu4Var.b(iV));
                    if (iV == iV2) {
                        break;
                    } else {
                        iV++;
                    }
                }
            }
        }
        cj3Var.G().updateCursorAnchorInfo(view, builder2.build());
        this.e = false;
    }
}
