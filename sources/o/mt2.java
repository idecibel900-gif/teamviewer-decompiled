package o;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class mt2 extends tt2 {
    public final /* synthetic */ qt2 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ e8 c;
    public final /* synthetic */ a8 d;
    public final /* synthetic */ ut2 e;

    public mt2(ut2 ut2Var, qt2 qt2Var, AtomicReference atomicReference, e8 e8Var, a8 a8Var) {
        this.e = ut2Var;
        this.a = qt2Var;
        this.b = atomicReference;
        this.c = e8Var;
        this.d = a8Var;
    }

    @Override // o.tt2
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        ut2 ut2Var = this.e;
        sb.append(ut2Var.q);
        sb.append("_rq#");
        sb.append(ut2Var.k0.getAndIncrement());
        String string = sb.toString();
        ut2 ut2Var2 = this.a.a;
        wt2 wt2Var = ut2Var2.G;
        this.b.set((wt2Var != null ? wt2Var.w : ut2Var2.p0()).u.c(string, ut2Var, this.c, this.d));
    }
}
