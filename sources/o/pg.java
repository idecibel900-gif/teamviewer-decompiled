package o;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class pg extends es4 implements cb0, dp6, kx3, r04, l28 {
    public final q0 A = new q0(this, 8);
    public final /* synthetic */ AndroidComposeView B;

    public pg(AndroidComposeView androidComposeView) {
        this.B = androidComposeView;
    }

    @Override // o.kx3
    public final boolean A(KeyEvent keyEvent) {
        wp2 wp2Var;
        int[] iArr = fq2.a;
        long jB = yo1.B(keyEvent);
        byte b = 7;
        if (xw3.a(jB, xw3.b)) {
            wp2Var = new wp2(2);
        } else if (xw3.a(jB, xw3.c)) {
            wp2Var = new wp2(1);
        } else if (xw3.a(jB, xw3.p)) {
            wp2Var = new wp2(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (xw3.a(jB, xw3.g)) {
            wp2Var = new wp2(4);
        } else if (xw3.a(jB, xw3.f)) {
            wp2Var = new wp2(3);
        } else if (xw3.a(jB, xw3.d) || xw3.a(jB, xw3.C)) {
            wp2Var = new wp2(5);
        } else if (xw3.a(jB, xw3.e) || xw3.a(jB, xw3.D)) {
            wp2Var = new wp2(6);
        } else if (xw3.a(jB, xw3.h) || xw3.a(jB, xw3.r) || xw3.a(jB, xw3.E)) {
            wp2Var = new wp2(7);
        } else {
            wp2Var = (xw3.a(jB, xw3.a) || xw3.a(jB, xw3.u)) ? new wp2(8) : null;
        }
        if (wp2Var != null) {
            int i = wp2Var.a;
            if (yo1.F(keyEvent) == 2) {
                AndroidComposeView androidComposeView = this.B;
                br2 br2VarG = ((lq2) androidComposeView.getFocusOwner()).g();
                if (br2VarG != null && br2VarG.A && androidComposeView.t(i)) {
                    androidComposeView.getPlayNavigationSoundEffect().invoke(wp2Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                Boolean boolF = ((lq2) androidComposeView.getFocusOwner()).f(i, androidComposeView.getEmbeddedViewFocusRect(), new q0(wp2Var, b));
                if (boolF == null) {
                    return true;
                }
                if (boolF.booleanValue()) {
                    androidComposeView.getPlayNavigationSoundEffect().invoke(wp2Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                if (i != 1 && i != 2) {
                    return false;
                }
                Integer numC = fq2.c(i);
                int iIntValue = numC != null ? numC.intValue() : 2;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View rootView = androidComposeView.getRootView();
                rootView.getClass();
                View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, androidComposeView.getView(), iIntValue);
                if (viewFindNextFocus == null || viewFindNextFocus.equals(androidComposeView)) {
                    return ((lq2) androidComposeView.getFocusOwner()).i(i);
                }
            }
        }
        return false;
    }

    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        jl5 jl5VarC = zn4Var.C(j);
        return fo4Var.o0(jl5VarC.m, jl5VarC.n, fa2.m, this.A, new v0(jl5VarC, (byte) 1));
    }

    @Override // o.kx3
    public final boolean h(KeyEvent keyEvent) {
        return false;
    }

    @Override // o.l28
    public final Object k() {
        return "o.yk8";
    }

    @Override // o.cb0
    public final Object o(e45 e45Var, x8 x8Var, jc1 jc1Var) {
        long jP = e45Var.P(0L);
        v56 v56Var = (v56) x8Var.a();
        v56 v56VarI = v56Var != null ? v56Var.i(jP) : null;
        if (v56VarI != null) {
            this.B.requestRectangleOnScreen(new Rect((int) v56VarI.a, (int) v56VarI.b, (int) v56VarI.c, (int) v56VarI.d), false);
        }
        return f88.a;
    }

    @Override // o.dp6
    public final void z(op6 op6Var) {
    }
}
