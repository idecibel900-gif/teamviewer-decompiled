package o;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ge3 {
    public final Context a;
    public he3 b;
    public Object c;
    public vn7 d;
    public je3 e;
    public final Map f;
    public de1 g;
    public de1 h;
    public de1 i;
    public final ii0 j;
    public final ii0 k;
    public final ii0 l;
    public Function1 m;
    public Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function1 f885o;
    public a17 p;
    public oi6 q;
    public pp5 r;
    public Object s;

    public ge3(ke3 ke3Var, Context context) {
        this.a = context;
        this.b = ke3Var.u;
        this.c = ke3Var.b;
        this.d = ke3Var.c;
        this.e = ke3Var.d;
        this.f = ke3Var.e;
        ie3 ie3Var = ke3Var.t;
        this.g = ie3Var.a;
        this.h = ie3Var.b;
        this.i = ie3Var.c;
        this.j = ie3Var.d;
        this.k = ie3Var.e;
        this.l = ie3Var.f;
        this.m = ie3Var.g;
        this.n = ie3Var.h;
        this.f885o = ie3Var.i;
        this.p = ie3Var.j;
        this.q = ie3Var.k;
        this.r = ie3Var.l;
        this.s = ke3Var.s;
    }

    public final ke3 a() {
        tg2 tg2Var;
        Object obj = this.c;
        if (obj == null) {
            obj = u55.a;
        }
        Object obj2 = obj;
        vn7 vn7Var = this.d;
        je3 je3Var = this.e;
        Boolean bool = Boolean.FALSE;
        Map mapZ = this.f;
        if (im3.n(mapZ, bool)) {
            mapZ.getClass();
            mapZ = uf0.z(e8.g(mapZ));
        } else if (mapZ == null) {
            throw new AssertionError();
        }
        Map map = mapZ;
        map.getClass();
        he3 he3Var = this.b;
        sj2 sj2Var = he3Var.a;
        ii0 ii0Var = this.j;
        if (ii0Var == null) {
            ii0Var = he3Var.e;
        }
        ii0 ii0Var2 = ii0Var;
        ii0 ii0Var3 = this.k;
        if (ii0Var3 == null) {
            ii0Var3 = he3Var.f;
        }
        ii0 ii0Var4 = ii0Var3;
        ii0 ii0Var5 = this.l;
        if (ii0Var5 == null) {
            ii0Var5 = he3Var.g;
        }
        ii0 ii0Var6 = ii0Var5;
        de1 de1Var = this.g;
        if (de1Var == null) {
            de1Var = he3Var.b;
        }
        de1 de1Var2 = de1Var;
        de1 de1Var3 = this.h;
        if (de1Var3 == null) {
            de1Var3 = he3Var.c;
        }
        de1 de1Var4 = de1Var3;
        de1 de1Var5 = this.i;
        if (de1Var5 == null) {
            de1Var5 = he3Var.d;
        }
        de1 de1Var6 = de1Var5;
        Function1 function1 = this.m;
        Function1 function2 = this.n;
        Function1 function3 = this.f885o;
        a17 a17Var = this.p;
        if (a17Var == null) {
            a17Var = he3Var.k;
        }
        a17 a17Var2 = a17Var;
        oi6 oi6Var = this.q;
        if (oi6Var == null) {
            oi6Var = he3Var.l;
        }
        oi6 oi6Var2 = oi6Var;
        pp5 pp5Var = this.r;
        if (pp5Var == null) {
            pp5Var = he3Var.m;
        }
        pp5 pp5Var2 = pp5Var;
        Object obj3 = this.s;
        if (obj3 instanceof sg2) {
            tg2Var = new tg2(uf0.z(((sg2) obj3).a));
        } else {
            if (!(obj3 instanceof tg2)) {
                throw new AssertionError();
            }
            tg2Var = (tg2) obj3;
        }
        return new ke3(this.a, obj2, vn7Var, je3Var, map, sj2Var, de1Var2, de1Var4, de1Var6, ii0Var2, ii0Var4, ii0Var6, function1, function2, function3, a17Var2, oi6Var2, pp5Var2, tg2Var, new ie3(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f885o, this.p, this.q, this.r), this.b);
    }

    public ge3(Context context) {
        this.a = context;
        this.b = he3.f965o;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = fa2.m;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        o48 o48Var = o48.v;
        this.m = o48Var;
        this.n = o48Var;
        this.f885o = o48Var;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = tg2.b;
    }
}
