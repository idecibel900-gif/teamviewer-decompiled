package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ln8 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ nn8 f1387o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln8(nn8 nn8Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1387o = nn8Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        nn8 nn8Var = this.f1387o;
        switch (b) {
            case 0:
                return new ln8(nn8Var, hc1Var, (byte) 0);
            default:
                return new ln8(nn8Var, hc1Var, (byte) 1);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((ln8) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object jn8Var;
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        nn8 nn8Var = this.f1387o;
        hc1 hc1Var = null;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    this.n = true;
                    Object objE = nn8Var.e(this);
                    return objE == ne1Var ? ne1Var : objE;
                }
                if (z) {
                    ct1.a0(obj);
                    return obj;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.n;
                byte b2 = 0;
                try {
                    if (!z2) {
                        ct1.a0(obj);
                        dp3 dp3Var = nn8Var.l;
                        ln8 ln8Var = new ln8(nn8Var, hc1Var, b2);
                        this.n = true;
                        obj = im3.j0(dp3Var, ln8Var, this);
                        if (obj == ne1Var) {
                            return ne1Var;
                        }
                    } else {
                        if (!z2) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ct1.a0(obj);
                    }
                    jn8Var = (kn8) obj;
                    break;
                } catch (en8 e) {
                    jn8Var = new in8(e.m);
                } catch (CancellationException unused) {
                    jn8Var = new gn8();
                } catch (Throwable th) {
                    we4.f().e(on8.a, "Unexpected error in WorkerWrapper", th);
                    jn8Var = new jn8(false);
                }
                g76 g76Var = new g76();
                nn8Var.g.o(new io.sentry.android.core.internal.util.j(jn8Var, (Object) g76Var, (Object) nn8Var, (byte) 19));
                return Boolean.valueOf(g76Var.m);
        }
    }
}
