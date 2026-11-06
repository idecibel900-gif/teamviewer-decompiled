package o;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class im extends og7 implements Function1 {
    public ko m;
    public g76 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1075o;
    public final /* synthetic */ km p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ wn7 r;
    public final /* synthetic */ long s;
    public final /* synthetic */ Function1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(km kmVar, Object obj, wn7 wn7Var, long j, Function1 function1, hc1 hc1Var) {
        super(1, hc1Var);
        this.p = kmVar;
        this.q = obj;
        this.r = wn7Var;
        this.s = j;
        this.t = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j = this.s;
        Function1 function1 = this.t;
        return new im(this.p, this.q, this.r, j, function1, (hc1) obj).invokeSuspend(f88.a);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        km kmVar;
        ko koVar;
        g76 g76Var;
        CancellationException cancellationException;
        wn7 wn7Var = this.r;
        boolean z = this.f1075o;
        km kmVar2 = this.p;
        if (!z) {
            ct1.a0(obj);
            try {
                kmVar2.c.f1284o = (qo) kmVar2.a.b().invoke(this.q);
                kmVar2.e.setValue(wn7Var.f2432o);
                kmVar2.d.setValue(Boolean.TRUE);
                ko koVar2 = kmVar2.c;
                ko koVar3 = new ko(koVar2.m, koVar2.n.getValue(), mo8.j(koVar2.f1284o), koVar2.p, Long.MIN_VALUE, koVar2.r);
                g76 g76Var2 = new g76();
                long j = this.s;
                hm hmVar = new hm(kmVar2, koVar3, this.t, g76Var2, (byte) 0);
                kmVar = kmVar2;
                try {
                    this.m = koVar3;
                    this.n = g76Var2;
                    this.f1075o = true;
                    Object objD = i67.d(koVar3, wn7Var, j, hmVar, this);
                    ne1 ne1Var = ne1.m;
                    if (objD == ne1Var) {
                        return ne1Var;
                    }
                    koVar = koVar3;
                    g76Var = g76Var2;
                } catch (CancellationException e) {
                    e = e;
                    cancellationException = e;
                    kmVar.c();
                    throw cancellationException;
                }
            } catch (CancellationException e2) {
                e = e2;
                kmVar = kmVar2;
                cancellationException = e;
                kmVar.c();
                throw cancellationException;
            }
        } else {
            if (!z) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g76Var = this.n;
            koVar = this.m;
            try {
                ct1.a0(obj);
                kmVar = kmVar2;
            } catch (CancellationException e3) {
                cancellationException = e3;
                kmVar = kmVar2;
                kmVar.c();
                throw cancellationException;
            }
        }
        fo foVar = g76Var.m ? fo.m : fo.n;
        kmVar.c();
        return new ho(koVar, foVar);
    }
}
