package o;

import android.view.autofill.AutofillValue;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class ip6 {
    public final LayoutNode a;
    public final ja2 b;
    public final tk3 c;
    public final zw4 d = new zw4(2);

    public ip6(LayoutNode layoutNode, ja2 ja2Var, kw4 kw4Var) {
        this.a = layoutNode;
        this.b = ja2Var;
        this.c = kw4Var;
    }

    public final fp6 a() {
        return new fp6(this.b, false, this.a, new ap6());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    public final void b(LayoutNode layoutNode, ap6 ap6Var) {
        qh qhVar;
        qh qhVar2;
        String str;
        String str2;
        xv7 xv7Var;
        xv7 xv7Var2;
        pi piVar;
        pi piVar2;
        zw4 zw4Var = this.d;
        Object[] objArr = zw4Var.a;
        int i = zw4Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            yf yfVar = (yf) objArr[i2];
            yfVar.getClass();
            ap6 ap6VarH = layoutNode.H();
            int i3 = layoutNode.n;
            a65 a65Var = yfVar.m;
            AndroidComposeView androidComposeView = yfVar.f2603o;
            if (ap6Var != null) {
                Object objG = ap6Var.m.g(kp6.s);
                if (objG == null) {
                    objG = null;
                }
                qhVar = (qh) objG;
            } else {
                qhVar = null;
            }
            if (ap6VarH != null) {
                Object objG2 = ap6VarH.m.g(kp6.s);
                if (objG2 == null) {
                    objG2 = null;
                }
                qhVar2 = (qh) objG2;
            } else {
                qhVar2 = null;
            }
            qh qhVar3 = yl7.t;
            if (!im3.n(qhVar2, qhVar3)) {
                if (im3.n(qhVar, qhVar3) && !im3.n(qhVar2, qhVar3)) {
                    a65Var.J0(androidComposeView, i3, true);
                }
                if (ap6Var != null) {
                    Object objG3 = ap6Var.m.g(kp6.F);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    xo xoVar = (xo) objG3;
                    if (xoVar != null) {
                        str = xoVar.n;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (ap6VarH != null) {
                    Object objG4 = ap6VarH.m.g(kp6.F);
                    if (objG4 == null) {
                        objG4 = null;
                    }
                    xo xoVar2 = (xo) objG4;
                    if (xoVar2 != null) {
                        str2 = xoVar2.n;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                if (str != str2) {
                    if (str == null) {
                        a65Var.J0(androidComposeView, i3, true);
                    } else if (str2 == null) {
                        a65Var.J0(androidComposeView, i3, false);
                    } else if (im3.n(qhVar2, yl7.u)) {
                        a65Var.C0().notifyValueChanged(androidComposeView, i3, AutofillValue.forText(au8.U(str2)));
                    }
                }
                if (ap6Var != null) {
                    Object objG5 = ap6Var.m.g(kp6.L);
                    if (objG5 == null) {
                        objG5 = null;
                    }
                    xv7Var = (xv7) objG5;
                } else {
                    xv7Var = null;
                }
                if (ap6VarH != null) {
                    Object objG6 = ap6VarH.m.g(kp6.L);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    xv7Var2 = (xv7) objG6;
                } else {
                    xv7Var2 = null;
                }
                if (xv7Var != xv7Var2) {
                    if (xv7Var == null) {
                        a65Var.J0(androidComposeView, i3, true);
                    } else if (xv7Var2 == null) {
                        a65Var.J0(androidComposeView, i3, false);
                    } else if (im3.n(qhVar2, yl7.v)) {
                        int iOrdinal = xv7Var2.ordinal();
                        Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                        if (bool != null) {
                            a65Var.C0().notifyValueChanged(androidComposeView, i3, AutofillValue.forToggle(bool.booleanValue()));
                        }
                    }
                }
                if (ap6Var != null) {
                    Object objG7 = ap6Var.m.g(kp6.t);
                    if (objG7 == null) {
                        objG7 = null;
                    }
                    piVar = (pi) objG7;
                } else {
                    piVar = null;
                }
                if (ap6VarH != null) {
                    Object objG8 = ap6VarH.m.g(kp6.t);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    piVar2 = (pi) objG8;
                } else {
                    piVar2 = null;
                }
                if (!im3.n(piVar, piVar2)) {
                    if (piVar == null) {
                        a65Var.J0(androidComposeView, i3, true);
                    } else if (piVar2 == null) {
                        a65Var.J0(androidComposeView, i3, false);
                    } else {
                        a65Var.C0().notifyValueChanged(androidComposeView, i3, piVar2.a);
                    }
                }
            } else if (!im3.n(qhVar, qhVar3)) {
                a65Var.J0(androidComposeView, i3, false);
            }
            boolean z = ap6Var != null && ap6Var.m.b(kp6.r);
            boolean z2 = ap6VarH != null && ap6VarH.m.b(kp6.r);
            if (z != z2) {
                lw4 lw4Var = yfVar.t;
                if (z2) {
                    lw4Var.a(i3);
                } else {
                    lw4Var.e(i3);
                }
            }
        }
    }
}
