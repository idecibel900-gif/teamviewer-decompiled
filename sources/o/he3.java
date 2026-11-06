package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class he3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final he3 f965o;
    public final sj2 a;
    public final de1 b;
    public final de1 c;
    public final de1 d;
    public final ii0 e;
    public final ii0 f;
    public final ii0 g;
    public final Function1 h;
    public final Function1 i;
    public final Function1 j;
    public final a17 k;
    public final oi6 l;
    public final pp5 m;
    public final tg2 n;

    static {
        o48 o48Var = o48.v;
        lt3 lt3Var = sj2.m;
        tk1 tk1Var = g22.a;
        gk1 gk1Var = gk1.f901o;
        p46 p46Var = a17.a;
        pp5 pp5Var = pp5.m;
        tg2 tg2Var = tg2.b;
        ba2 ba2Var = ba2.m;
        ii0 ii0Var = ii0.f1063o;
        f965o = new he3(lt3Var, ba2Var, gk1Var, gk1Var, ii0Var, ii0Var, ii0Var, o48Var, o48Var, o48Var, p46Var, oi6.n, pp5Var, tg2Var);
    }

    public he3(sj2 sj2Var, de1 de1Var, de1 de1Var2, de1 de1Var3, ii0 ii0Var, ii0 ii0Var2, ii0 ii0Var3, Function1 function1, Function1 function2, Function1 function3, a17 a17Var, oi6 oi6Var, pp5 pp5Var, tg2 tg2Var) {
        this.a = sj2Var;
        this.b = de1Var;
        this.c = de1Var2;
        this.d = de1Var3;
        this.e = ii0Var;
        this.f = ii0Var2;
        this.g = ii0Var3;
        this.h = function1;
        this.i = function2;
        this.j = function3;
        this.k = a17Var;
        this.l = oi6Var;
        this.m = pp5Var;
        this.n = tg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he3)) {
            return false;
        }
        he3 he3Var = (he3) obj;
        return im3.n(this.a, he3Var.a) && im3.n(this.b, he3Var.b) && im3.n(this.c, he3Var.c) && im3.n(this.d, he3Var.d) && this.e == he3Var.e && this.f == he3Var.f && this.g == he3Var.g && im3.n(this.h, he3Var.h) && im3.n(this.i, he3Var.i) && im3.n(this.j, he3Var.j) && im3.n(this.k, he3Var.k) && this.l == he3Var.l && this.m == he3Var.m && im3.n(this.n, he3Var.n);
    }

    public final int hashCode() {
        return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ua5.d(ua5.d(ua5.d((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ")";
    }
}
