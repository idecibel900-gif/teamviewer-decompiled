package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ie3 {
    public final de1 a;
    public final de1 b;
    public final de1 c;
    public final ii0 d;
    public final ii0 e;
    public final ii0 f;
    public final Function1 g;
    public final Function1 h;
    public final Function1 i;
    public final a17 j;
    public final oi6 k;
    public final pp5 l;

    public ie3(de1 de1Var, de1 de1Var2, de1 de1Var3, ii0 ii0Var, ii0 ii0Var2, ii0 ii0Var3, Function1 function1, Function1 function2, Function1 function3, a17 a17Var, oi6 oi6Var, pp5 pp5Var) {
        this.a = de1Var;
        this.b = de1Var2;
        this.c = de1Var3;
        this.d = ii0Var;
        this.e = ii0Var2;
        this.f = ii0Var3;
        this.g = function1;
        this.h = function2;
        this.i = function3;
        this.j = a17Var;
        this.k = oi6Var;
        this.l = pp5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie3)) {
            return false;
        }
        ie3 ie3Var = (ie3) obj;
        return im3.n(this.a, ie3Var.a) && im3.n(this.b, ie3Var.b) && im3.n(this.c, ie3Var.c) && this.d == ie3Var.d && this.e == ie3Var.e && this.f == ie3Var.f && this.g.equals(ie3Var.g) && this.h.equals(ie3Var.h) && this.i.equals(ie3Var.i) && im3.n(this.j, ie3Var.j) && this.k == ie3Var.k && this.l == ie3Var.l;
    }

    public final int hashCode() {
        de1 de1Var = this.a;
        int iHashCode = (de1Var == null ? 0 : de1Var.hashCode()) * 31;
        de1 de1Var2 = this.b;
        int iHashCode2 = (iHashCode + (de1Var2 == null ? 0 : de1Var2.hashCode())) * 31;
        de1 de1Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (de1Var3 == null ? 0 : de1Var3.hashCode())) * 31;
        ii0 ii0Var = this.d;
        int iHashCode4 = (iHashCode3 + (ii0Var == null ? 0 : ii0Var.hashCode())) * 31;
        ii0 ii0Var2 = this.e;
        int iHashCode5 = (iHashCode4 + (ii0Var2 == null ? 0 : ii0Var2.hashCode())) * 31;
        ii0 ii0Var3 = this.f;
        int iD = ua5.d(ua5.d(ua5.d((iHashCode5 + (ii0Var3 == null ? 0 : ii0Var3.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i);
        a17 a17Var = this.j;
        int iHashCode6 = (iD + (a17Var == null ? 0 : a17Var.hashCode())) * 31;
        oi6 oi6Var = this.k;
        int iHashCode7 = (iHashCode6 + (oi6Var == null ? 0 : oi6Var.hashCode())) * 31;
        pp5 pp5Var = this.l;
        return iHashCode7 + (pp5Var != null ? pp5Var.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=" + this.d + ", diskCachePolicy=" + this.e + ", networkCachePolicy=" + this.f + ", placeholderFactory=" + this.g + ", errorFactory=" + this.h + ", fallbackFactory=" + this.i + ", sizeResolver=" + this.j + ", scale=" + this.k + ", precision=" + this.l + ")";
    }
}
