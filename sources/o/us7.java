package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class us7 {
    public final xo a;
    public final ot7 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final in1 g;
    public final j04 h;
    public final mr2 i;
    public final long j;

    public us7(xo xoVar, ot7 ot7Var, List list, int i, boolean z, int i2, in1 in1Var, j04 j04Var, mr2 mr2Var, long j) {
        this.a = xoVar;
        this.b = ot7Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = in1Var;
        this.h = j04Var;
        this.i = mr2Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us7)) {
            return false;
        }
        us7 us7Var = (us7) obj;
        return im3.n(this.a, us7Var.a) && im3.n(this.b, us7Var.b) && im3.n(this.c, us7Var.c) && this.d == us7Var.d && this.e == us7Var.e && this.f == us7Var.f && im3.n(this.g, us7Var.g) && this.h == us7Var.h && im3.n(this.i, us7Var.i) && r61.c(this.j, us7Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + fx3.a(this.f, to7.f((to7.g(this.c, to7.h(this.b, this.a.hashCode() * 31, 31), 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        int i = this.f;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 5) {
            str = "MiddleEllipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = i == 4 ? "StartEllipsis" : "Invalid";
        }
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + str + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + r61.m(this.j) + ")";
    }
}
