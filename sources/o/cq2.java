package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.compose.ui.node.Owner;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class cq2 extends es4 implements qq2, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View A;
    public ViewTreeObserver B;
    public final bq2 C;
    public final bq2 D;

    /* JADX WARN: Type inference failed for: r0v0, types: [o.bq2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.bq2] */
    public cq2() {
        final byte b = 0;
        this.C = new Function1(this) { // from class: o.bq2
            public final /* synthetic */ cq2 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                f88 f88Var = f88.a;
                cq2 cq2Var = this.n;
                cl0 cl0Var = (cl0) obj;
                switch (b2) {
                    case 0:
                        View viewI = ds1.I(cq2Var);
                        if (!viewI.isFocused() && !viewI.hasFocus()) {
                            iq2 focusOwner = vn4.q0(cq2Var).getFocusOwner();
                            View viewY = e8.y(cq2Var);
                            Integer numC = fq2.c(cl0Var.a);
                            int[] iArr = new int[2];
                            viewY.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            viewI.getLocationOnScreen(iArr2);
                            br2 br2VarH = xs1.H(((lq2) focusOwner).c);
                            Rect rect = null;
                            v56 v56VarJ = br2VarH != null ? xs1.J(br2VarH) : null;
                            if (v56VarJ != null) {
                                int i = (int) v56VarJ.a;
                                int i2 = iArr[0];
                                int i3 = iArr2[0];
                                int i4 = (int) v56VarJ.b;
                                int i5 = iArr[1];
                                int i6 = iArr2[1];
                                rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) v56VarJ.c) + i2) - i3, (((int) v56VarJ.d) + i5) - i6);
                            }
                            if (!fq2.b(viewI, numC, rect)) {
                                cl0Var.b = true;
                            }
                        }
                        break;
                    default:
                        ds1.I(cq2Var);
                        break;
                }
                return f88Var;
            }
        };
        final byte b2 = 1;
        this.D = new Function1(this) { // from class: o.bq2
            public final /* synthetic */ cq2 n;

            {
                this.n = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                f88 f88Var = f88.a;
                cq2 cq2Var = this.n;
                cl0 cl0Var = (cl0) obj;
                switch (b3) {
                    case 0:
                        View viewI = ds1.I(cq2Var);
                        if (!viewI.isFocused() && !viewI.hasFocus()) {
                            iq2 focusOwner = vn4.q0(cq2Var).getFocusOwner();
                            View viewY = e8.y(cq2Var);
                            Integer numC = fq2.c(cl0Var.a);
                            int[] iArr = new int[2];
                            viewY.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            viewI.getLocationOnScreen(iArr2);
                            br2 br2VarH = xs1.H(((lq2) focusOwner).c);
                            Rect rect = null;
                            v56 v56VarJ = br2VarH != null ? xs1.J(br2VarH) : null;
                            if (v56VarJ != null) {
                                int i = (int) v56VarJ.a;
                                int i2 = iArr[0];
                                int i3 = iArr2[0];
                                int i4 = (int) v56VarJ.b;
                                int i5 = iArr[1];
                                int i6 = iArr2[1];
                                rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) v56VarJ.c) + i2) - i3, (((int) v56VarJ.d) + i5) - i6);
                            }
                            if (!fq2.b(viewI, numC, rect)) {
                                cl0Var.b = true;
                            }
                        }
                        break;
                    default:
                        ds1.I(cq2Var);
                        break;
                }
                return f88Var;
            }
        };
    }

    @Override // o.es4
    public final void M0() {
        ViewTreeObserver viewTreeObserver = e8.y(this).getViewTreeObserver();
        this.B = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // o.es4
    public final void N0() {
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.B = null;
        e8.y(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.A = null;
    }

    public final br2 U0() {
        boolean z;
        if (!this.m.z) {
            ki3.c("visitLocalDescendants called on an unattached node");
        }
        es4 es4Var = this.m;
        if ((es4Var.p & 1024) != 0) {
            boolean z2 = false;
            for (es4 es4Var2 = es4Var.r; es4Var2 != null; es4Var2 = es4Var2.r) {
                if ((es4Var2.f737o & 1024) != 0) {
                    es4 es4VarL0 = es4Var2;
                    xx4 xx4Var = null;
                    while (es4VarL0 != null) {
                        if (es4VarL0 instanceof br2) {
                            br2 br2Var = (br2) es4VarL0;
                            if (z2) {
                                return br2Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (es4VarL0.f737o & 1024) != 0 && (es4VarL0 instanceof vm1)) {
                            int i = 0;
                            for (es4 es4Var3 = ((vm1) es4VarL0).B; es4Var3 != null; es4Var3 = es4Var3.r) {
                                if ((es4Var3.f737o & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        es4VarL0 = es4Var3;
                                    } else {
                                        if (xx4Var == null) {
                                            xx4Var = new xx4(new es4[16]);
                                        }
                                        if (es4VarL0 != null) {
                                            xx4Var.b(es4VarL0);
                                            es4VarL0 = null;
                                        }
                                        xx4Var.b(es4Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        es4VarL0 = vn4.l0(xx4Var);
                    }
                }
            }
        }
        hk0.l("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (vn4.p0(this).A == null) {
            return;
        }
        View viewI = ds1.I(this);
        iq2 focusOwner = vn4.q0(this).getFocusOwner();
        Owner ownerQ0 = vn4.q0(this);
        boolean z2 = true;
        if (view != null && !view.equals(ownerQ0)) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                } else {
                    if (parent == viewI.getParent()) {
                        z = true;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            z = false;
            break;
        }
        if (view2 != null && !view2.equals(ownerQ0)) {
            ViewParent parent2 = view2.getParent();
            while (true) {
                if (parent2 == null) {
                    z2 = false;
                    break;
                } else if (parent2 == viewI.getParent()) {
                    break;
                } else {
                    parent2 = parent2.getParent();
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (z && z2) {
            this.A = view2;
            return;
        }
        if (z2) {
            this.A = view2;
            br2 br2VarU0 = U0();
            if (br2VarU0.Z0().a()) {
                return;
            }
            vs1.N(br2VarU0);
            return;
        }
        if (!z) {
            this.A = null;
            return;
        }
        this.A = null;
        if (U0().Z0().b()) {
            ((lq2) focusOwner).c(8, false, false);
        }
    }

    @Override // o.qq2
    public final void v0(mq2 mq2Var) {
        mq2Var.d(false);
        mq2Var.e(this.C);
        mq2Var.c(this.D);
    }
}
