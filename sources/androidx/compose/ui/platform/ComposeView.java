package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import o.bg5;
import o.h57;
import o.hw2;
import o.j56;
import o.t0;
import o.u0;
import o.ux2;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends u0 {
    public static final /* synthetic */ int x = 0;
    public final bg5 v;
    public boolean w;

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet);
        this.v = h57.p(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // o.u0
    public final void a(int i, ux2 ux2Var) {
        ux2Var.Y(420213850);
        int i2 = (ux2Var.h(this) ? 4 : 2) | i;
        if (ux2Var.N(i2 & 1, (i2 & 3) != 2)) {
            hw2 hw2Var = (hw2) this.v.getValue();
            if (hw2Var == null) {
                ux2Var.W(-1238823553);
            } else {
                ux2Var.W(98585282);
                hw2Var.invoke(ux2Var, 0);
            }
            ux2Var.p(false);
        } else {
            ux2Var.Q();
        }
        j56 j56VarR = ux2Var.r();
        if (j56VarR != null) {
            j56VarR.d = new t0((byte) 8, i, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // o.u0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.w;
    }

    public final void setContent(hw2 hw2Var) {
        this.w = true;
        this.v.setValue(hw2Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            d();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public ComposeView(Context context) {
        this(context, null, 6);
    }
}
