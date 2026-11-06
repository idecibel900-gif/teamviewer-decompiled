package o;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ke3 {
    public final Context a;
    public final Object b;
    public final vn7 c;
    public final je3 d;
    public final Map e;
    public final sj2 f;
    public final de1 g;
    public final de1 h;
    public final de1 i;
    public final ii0 j;
    public final ii0 k;
    public final ii0 l;
    public final Function1 m;
    public final Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Function1 f1255o;
    public final a17 p;
    public final oi6 q;
    public final pp5 r;
    public final tg2 s;
    public final ie3 t;
    public final he3 u;

    public ke3(Context context, Object obj, vn7 vn7Var, je3 je3Var, Map map, sj2 sj2Var, de1 de1Var, de1 de1Var2, de1 de1Var3, ii0 ii0Var, ii0 ii0Var2, ii0 ii0Var3, Function1 function1, Function1 function2, Function1 function3, a17 a17Var, oi6 oi6Var, pp5 pp5Var, tg2 tg2Var, ie3 ie3Var, he3 he3Var) {
        this.a = context;
        this.b = obj;
        this.c = vn7Var;
        this.d = je3Var;
        this.e = map;
        this.f = sj2Var;
        this.g = de1Var;
        this.h = de1Var2;
        this.i = de1Var3;
        this.j = ii0Var;
        this.k = ii0Var2;
        this.l = ii0Var3;
        this.m = function1;
        this.n = function2;
        this.f1255o = function3;
        this.p = a17Var;
        this.q = oi6Var;
        this.r = pp5Var;
        this.s = tg2Var;
        this.t = ie3Var;
        this.u = he3Var;
    }

    public static ge3 a(ke3 ke3Var) {
        Context context = ke3Var.a;
        ke3Var.getClass();
        return new ge3(ke3Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke3)) {
            return false;
        }
        ke3 ke3Var = (ke3) obj;
        return im3.n(this.a, ke3Var.a) && this.b.equals(ke3Var.b) && im3.n(this.c, ke3Var.c) && im3.n(this.d, ke3Var.d) && this.e.equals(ke3Var.e) && im3.n(this.f, ke3Var.f) && im3.n(this.g, ke3Var.g) && im3.n(this.h, ke3Var.h) && im3.n(this.i, ke3Var.i) && this.j == ke3Var.j && this.k == ke3Var.k && this.l == ke3Var.l && im3.n(this.m, ke3Var.m) && im3.n(this.n, ke3Var.n) && im3.n(this.f1255o, ke3Var.f1255o) && im3.n(this.p, ke3Var.p) && this.q == ke3Var.q && this.r == ke3Var.r && this.s.equals(ke3Var.s) && this.t.equals(ke3Var.t) && im3.n(this.u, ke3Var.u);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        vn7 vn7Var = this.c;
        int iHashCode2 = (iHashCode + (vn7Var == null ? 0 : vn7Var.hashCode())) * 31;
        je3 je3Var = this.d;
        return this.u.hashCode() + ((this.t.hashCode() + ((this.s.a.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ua5.d(ua5.d(ua5.d((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (je3Var != null ? je3Var.hashCode() : 0)) * 961)) * 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961, 31, this.m), 31, this.n), 31, this.f1255o)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=" + this.d + ", memoryCacheKey=null, memoryCacheKeyExtras=" + this.e + ", diskCacheKey=null, fileSystem=" + this.f + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.g + ", fetcherCoroutineContext=" + this.h + ", decoderCoroutineContext=" + this.i + ", memoryCachePolicy=" + this.j + ", diskCachePolicy=" + this.k + ", networkCachePolicy=" + this.l + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.m + ", errorFactory=" + this.n + ", fallbackFactory=" + this.f1255o + ", sizeResolver=" + this.p + ", scale=" + this.q + ", precision=" + this.r + ", extras=" + this.s + ", defined=" + this.t + ", defaults=" + this.u + ")";
    }
}
