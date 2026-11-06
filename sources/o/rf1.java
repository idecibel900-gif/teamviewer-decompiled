package o;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rf1 {
    public final AndroidComposeView a;
    public final iu b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public zr7 j;
    public vs7 k;
    public v65 l;
    public v56 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v56 f1919o;
    public final Object c = new Object();
    public Function1 m = ek.A;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = wn4.a();
    public final Matrix r = new Matrix();

    public rf1(AndroidComposeView androidComposeView, iu iuVar) {
        this.a = androidComposeView;
        this.b = iuVar;
    }

    public final void a() {
        iu iuVar = this.b;
        u14 u14Var = (u14) iuVar.p;
        InputMethodManager inputMethodManager = (InputMethodManager) u14Var.getValue();
        View view = (View) iuVar.f1103o;
        if (inputMethodManager.isActive(view)) {
            Function1 function1 = this.m;
            float[] fArr = this.q;
            function1.invoke(new wn4(fArr));
            this.a.p(fArr);
            Matrix matrix = this.r;
            kh.A(matrix, fArr);
            zr7 zr7Var = this.j;
            zr7Var.getClass();
            long j = zr7Var.b;
            v65 v65Var = this.l;
            v65Var.getClass();
            vs7 vs7Var = this.k;
            vs7Var.getClass();
            xu4 xu4Var = vs7Var.b;
            v56 v56Var = this.n;
            v56Var.getClass();
            float f = v56Var.d;
            float f2 = v56Var.b;
            v56 v56Var2 = this.f1919o;
            v56Var2.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
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
                boolean zR = db8.r(v56Var, fU, v56VarC.b);
                boolean zR2 = db8.r(v56Var, fU, v56VarC.d);
                boolean z5 = vs7Var.a(iQ) == rb6Var;
                int i = (zR || zR2) ? 1 : 0;
                if (!zR || !zR2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = v56VarC.b;
                float f4 = v56VarC.d;
                builder.setInsertionMarkerLocation(fU, f3, f4, f4, i);
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
                        float f5 = fArr2[i2];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = iE;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = iF2;
                        int i5 = (v56Var.a < f7 ? 1 : 0) & (f5 < v56Var.c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!db8.r(v56Var, f5, f6) || !db8.r(v56Var, f7, f8)) {
                            i5 |= 2;
                        }
                        if (vs7Var.a(iQ4) == rb6Var) {
                            i5 |= 4;
                        }
                        builder3.addCharacterBounds(i4, f5, f6, f7, f8, i5);
                        builder2 = builder3;
                        iF2 = i4 + 1;
                        iE = i3;
                    }
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                c4.p(builder2, v56Var2);
            }
            if (i6 >= 34 && z4 && !v56Var.f()) {
                int i7 = xu4Var.f - 1;
                if (i7 < 0) {
                    i7 = 0;
                }
                int iV = ct1.v(xu4Var.e(f2), 0, i7);
                int iV2 = ct1.v(xu4Var.e(f), 0, i7);
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
            ((InputMethodManager) u14Var.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.e = false;
        }
    }
}
