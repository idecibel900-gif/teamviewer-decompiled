package androidx.compose.foundation.text.modifiers;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import o.es4;
import o.fx3;
import o.im3;
import o.ls4;
import o.mr2;
import o.ot7;
import o.to7;
import o.vn4;
import o.wo7;
import o.xo;
import o.xv0;
import o.yo1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Lo/ls4;", "Lo/wo7;", "Lo/xv0;", "color", "Lo/xv0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextAnnotatedStringElement extends ls4 {
    public final xo b;
    public final ot7 c;
    private final xv0 color = null;
    public final mr2 d;
    public final Function1 e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final List j;
    public final Function1 k;
    public final Function1 l;

    public TextAnnotatedStringElement(xo xoVar, ot7 ot7Var, mr2 mr2Var, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, Function1 function3) {
        this.b = xoVar;
        this.c = ot7Var;
        this.d = mr2Var;
        this.e = function1;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = list;
        this.k = function2;
        this.l = function3;
    }

    @Override // o.ls4
    public final es4 create() {
        xv0 xv0Var = this.color;
        wo7 wo7Var = new wo7();
        wo7Var.A = this.b;
        wo7Var.B = this.c;
        wo7Var.C = this.d;
        wo7Var.D = this.e;
        wo7Var.E = this.f;
        wo7Var.F = this.g;
        wo7Var.G = this.h;
        wo7Var.H = this.i;
        wo7Var.I = this.j;
        wo7Var.J = this.k;
        wo7Var.K = xv0Var;
        wo7Var.L = this.l;
        return wo7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return im3.n(this.color, textAnnotatedStringElement.color) && im3.n(this.b, textAnnotatedStringElement.b) && im3.n(this.c, textAnnotatedStringElement.c) && im3.n(this.j, textAnnotatedStringElement.j) && im3.n(this.d, textAnnotatedStringElement.d) && this.e == textAnnotatedStringElement.e && this.l == textAnnotatedStringElement.l && this.f == textAnnotatedStringElement.f && this.g == textAnnotatedStringElement.g && this.h == textAnnotatedStringElement.h && this.i == textAnnotatedStringElement.i && this.k == textAnnotatedStringElement.k;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + to7.h(this.c, this.b.hashCode() * 31, 31)) * 31;
        Function1 function1 = this.e;
        int iF = (((to7.f(fx3.a(this.f, (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.g) + this.h) * 31) + this.i) * 31;
        List list = this.j;
        int iHashCode2 = (iF + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function2 = this.k;
        int iHashCode3 = (iHashCode2 + (function2 != null ? function2.hashCode() : 0)) * 961;
        xv0 xv0Var = this.color;
        int iHashCode4 = (iHashCode3 + (xv0Var != null ? xv0Var.hashCode() : 0)) * 31;
        Function1 function3 = this.l;
        return iHashCode4 + (function3 != null ? function3.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    @Override // o.ls4
    public final void update(es4 es4Var) {
        boolean z;
        wo7 wo7Var = (wo7) es4Var;
        xv0 xv0Var = this.color;
        boolean zN = im3.n(xv0Var, wo7Var.K);
        wo7Var.K = xv0Var;
        boolean z2 = false;
        boolean z3 = true;
        ot7 ot7Var = this.c;
        if (zN) {
            ot7 ot7Var2 = wo7Var.B;
            if (ot7Var == ot7Var2) {
                ot7Var.getClass();
            } else if (!ot7Var.a.b(ot7Var2.a)) {
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        String str = wo7Var.A.n;
        xo xoVar = this.b;
        boolean zN2 = im3.n(str, xoVar.n);
        boolean z4 = (zN2 && im3.n(wo7Var.A.m, xoVar.m)) ? false : true;
        if (z4) {
            wo7Var.A = xoVar;
        }
        if (!zN2) {
            wo7Var.P = null;
        }
        boolean z5 = !wo7Var.B.d(ot7Var);
        wo7Var.B = ot7Var;
        List list = wo7Var.I;
        List list2 = this.j;
        if (!im3.n(list, list2)) {
            wo7Var.I = list2;
            z5 = true;
        }
        int i = wo7Var.H;
        int i2 = this.i;
        if (i != i2) {
            wo7Var.H = i2;
            z5 = true;
        }
        int i3 = wo7Var.G;
        int i4 = this.h;
        if (i3 != i4) {
            wo7Var.G = i4;
            z5 = true;
        }
        boolean z6 = wo7Var.F;
        boolean z7 = this.g;
        if (z6 != z7) {
            wo7Var.F = z7;
            z5 = true;
        }
        mr2 mr2Var = wo7Var.C;
        mr2 mr2Var2 = this.d;
        if (!im3.n(mr2Var, mr2Var2)) {
            wo7Var.C = mr2Var2;
            z5 = true;
        }
        int i5 = wo7Var.E;
        int i6 = this.f;
        if (i5 != i6) {
            wo7Var.E = i6;
            z5 = true;
        }
        Function1 function1 = wo7Var.D;
        Function1 function2 = this.e;
        if (function1 != function2) {
            wo7Var.D = function2;
            z2 = true;
        }
        Function1 function3 = wo7Var.J;
        Function1 function4 = this.k;
        if (function3 != function4) {
            wo7Var.J = function4;
            z2 = true;
        }
        Function1 function5 = wo7Var.L;
        Function1 function6 = this.l;
        if (function5 != function6) {
            wo7Var.L = function6;
        } else {
            z3 = z2;
        }
        if (z4 || z5 || z3) {
            wo7Var.U0().g(wo7Var.A, wo7Var.B, wo7Var.C, wo7Var.E, wo7Var.F, wo7Var.G, wo7Var.H, wo7Var.I);
        }
        if (wo7Var.z) {
            if (z4 || (z && wo7Var.O != null)) {
                vn4.p0(wo7Var).U();
            }
            if (z4 || z5 || z3) {
                vn4.p0(wo7Var).S();
                yo1.H(wo7Var);
            }
            if (z) {
                yo1.H(wo7Var);
            }
        }
    }
}
