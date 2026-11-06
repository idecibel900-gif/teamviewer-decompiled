package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ge5 extends og7 implements Function1 {
    public final /* synthetic */ he5 m;
    public final /* synthetic */ ie5 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f886o;
    public final /* synthetic */ fe5 p;
    public final /* synthetic */ rl2 q;
    public final /* synthetic */ ym2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge5(he5 he5Var, ie5 ie5Var, List list, fe5 fe5Var, rl2 rl2Var, ym2 ym2Var, hc1 hc1Var) {
        super(1, hc1Var);
        this.m = he5Var;
        this.n = ie5Var;
        this.f886o = list;
        this.p = fe5Var;
        this.q = rl2Var;
        this.r = ym2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rl2 rl2Var = this.q;
        ym2 ym2Var = this.r;
        ge5 ge5Var = new ge5(this.m, this.n, this.f886o, this.p, rl2Var, ym2Var, (hc1) obj);
        f88 f88Var = f88.a;
        ge5Var.invokeSuspend(f88Var);
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        ct1.a0(obj);
        ie5 ie5Var = this.n;
        he5 he5Var = this.m;
        he5Var.b.setValue(ie5Var);
        bg5 bg5Var = he5Var.g;
        List list = this.f886o;
        bg5Var.setValue(list);
        in1 in1Var = he5Var.h;
        if (in1Var != null) {
            nv1.M(list, he5Var.e.z(), in1Var, he5Var.i);
        }
        if (!lv0.h0(list, he5Var.b().a())) {
            he5Var.b().d.setValue(this.p);
        }
        return f88.a;
    }
}
