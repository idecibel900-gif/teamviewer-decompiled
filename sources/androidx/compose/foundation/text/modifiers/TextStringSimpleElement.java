package androidx.compose.foundation.text.modifiers;

import kotlin.Metadata;
import o.es4;
import o.ff5;
import o.fx3;
import o.im3;
import o.ls4;
import o.mr2;
import o.nt7;
import o.ot7;
import o.to7;
import o.vn4;
import o.xv0;
import o.yo1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Lo/ls4;", "Lo/nt7;", "Lo/xv0;", "color", "Lo/xv0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextStringSimpleElement extends ls4 {
    public final String b;
    public final ot7 c;
    private final xv0 color = null;
    public final mr2 d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;

    public TextStringSimpleElement(String str, ot7 ot7Var, mr2 mr2Var, int i, boolean z, int i2, int i3) {
        this.b = str;
        this.c = ot7Var;
        this.d = mr2Var;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
    }

    @Override // o.ls4
    public final es4 create() {
        xv0 xv0Var = this.color;
        nt7 nt7Var = new nt7();
        nt7Var.A = this.b;
        nt7Var.B = this.c;
        nt7Var.C = this.d;
        nt7Var.D = this.e;
        nt7Var.E = this.f;
        nt7Var.F = this.g;
        nt7Var.G = this.h;
        nt7Var.H = xv0Var;
        return nt7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return im3.n(this.color, textStringSimpleElement.color) && im3.n(this.b, textStringSimpleElement.b) && im3.n(this.c, textStringSimpleElement.c) && im3.n(this.d, textStringSimpleElement.d) && this.e == textStringSimpleElement.e && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g && this.h == textStringSimpleElement.h;
    }

    public final int hashCode() {
        int iF = (((to7.f(fx3.a(this.e, (this.d.hashCode() + to7.h(this.c, this.b.hashCode() * 31, 31)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
        xv0 xv0Var = this.color;
        return iF + (xv0Var != null ? xv0Var.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // o.ls4
    public final void update(es4 es4Var) {
        boolean z;
        nt7 nt7Var = (nt7) es4Var;
        xv0 xv0Var = this.color;
        boolean zN = im3.n(xv0Var, nt7Var.H);
        nt7Var.H = xv0Var;
        boolean z2 = false;
        boolean z3 = true;
        ot7 ot7Var = this.c;
        if (zN) {
            ot7 ot7Var2 = nt7Var.B;
            if (ot7Var == ot7Var2) {
                ot7Var.getClass();
            } else if (!ot7Var.a.b(ot7Var2.a)) {
                z = true;
            }
            z = false;
        } else {
            z = true;
        }
        String str = nt7Var.A;
        String str2 = this.b;
        if (!im3.n(str, str2)) {
            nt7Var.A = str2;
            nt7Var.L = null;
            z2 = true;
        }
        boolean z4 = !nt7Var.B.d(ot7Var);
        nt7Var.B = ot7Var;
        int i = nt7Var.G;
        int i2 = this.h;
        if (i != i2) {
            nt7Var.G = i2;
            z4 = true;
        }
        int i3 = nt7Var.F;
        int i4 = this.g;
        if (i3 != i4) {
            nt7Var.F = i4;
            z4 = true;
        }
        boolean z5 = nt7Var.E;
        boolean z6 = this.f;
        if (z5 != z6) {
            nt7Var.E = z6;
            z4 = true;
        }
        mr2 mr2Var = nt7Var.C;
        mr2 mr2Var2 = this.d;
        if (!im3.n(mr2Var, mr2Var2)) {
            nt7Var.C = mr2Var2;
            z4 = true;
        }
        int i5 = nt7Var.D;
        int i6 = this.e;
        if (i5 == i6) {
            z3 = z4;
        } else {
            nt7Var.D = i6;
        }
        if (z2 || z3) {
            ff5 ff5VarU0 = nt7Var.U0();
            String str3 = nt7Var.A;
            ot7 ot7Var3 = nt7Var.B;
            mr2 mr2Var3 = nt7Var.C;
            int i7 = nt7Var.D;
            boolean z7 = nt7Var.E;
            int i8 = nt7Var.F;
            int i9 = nt7Var.G;
            ff5VarU0.a = str3;
            ff5VarU0.b = ot7Var3;
            ff5VarU0.c = mr2Var3;
            ff5VarU0.d = i7;
            ff5VarU0.e = z7;
            ff5VarU0.f = i8;
            ff5VarU0.g = i9;
            ff5VarU0.s = (ff5VarU0.s << 2) | 2;
            ff5VarU0.c();
        }
        if (nt7Var.z) {
            if (z2 || (z && nt7Var.K != null)) {
                vn4.p0(nt7Var).U();
            }
            if (z2 || z3) {
                vn4.p0(nt7Var).S();
                yo1.H(nt7Var);
            }
            if (z) {
                yo1.H(nt7Var);
            }
        }
    }
}
