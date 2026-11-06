package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class ys7 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2638o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys7(vh8 vh8Var, boolean z, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = (byte) 6;
        this.f2638o = vh8Var;
        this.n = z;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.f2638o;
        switch (b) {
            case 0:
                return new ys7(obj2, hc1Var, (byte) 0);
            case 1:
                return new ys7(obj2, hc1Var, (byte) 1);
            case 2:
                return new ys7(obj2, hc1Var, (byte) 2);
            case 3:
                return new ys7(obj2, hc1Var, (byte) 3);
            case 4:
                ys7 ys7Var = new ys7(obj2, hc1Var, (byte) 4);
                ys7Var.n = ((Boolean) obj).booleanValue();
                return ys7Var;
            case 5:
                return new ys7(obj2, hc1Var, (byte) 5);
            case 6:
                return new ys7((vh8) obj2, this.n, hc1Var);
            default:
                return new ys7(obj2, hc1Var, (byte) 7);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                return ((ys7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 1:
                return ((ys7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 2:
                return ((ys7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 3:
                return ((ys7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((ys7) create(bool, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 5:
                ((ys7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return ne1.m;
            case 6:
                ((ys7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            default:
                return ((ys7) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.m;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        Object obj2 = this.f2638o;
        hc1 hc1Var = null;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (z) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                ha4 ha4Var = (ha4) obj2;
                this.n = true;
                ha4Var.getClass();
                yx6.l(ha4Var.a.a, new q5(new zw4(), ha4Var, (byte) 6), this);
                return ne1Var;
            case 1:
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                i76 i76Var = new i76();
                kv7 kv7Var = (kv7) obj2;
                yx6 yx6Var = kv7Var.A.a;
                q5 q5Var = new q5(i76Var, kv7Var, (byte) 13);
                this.n = true;
                yx6.l(yx6Var, q5Var, this);
                return ne1Var;
            case 2:
                boolean z3 = this.n;
                if (!z3) {
                    ct1.a0(obj);
                    this.n = true;
                    if (((vg1) obj2).invoke(this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z3) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 3:
                boolean z4 = this.n;
                if (!z4) {
                    ct1.a0(obj);
                    this.n = true;
                    if (((e38) obj2).f(this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z4) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
            case 4:
                ct1.a0(obj);
                boolean z5 = this.n;
                Context context = (Context) obj2;
                String str = gd5.a;
                PackageManager packageManager = context.getPackageManager();
                packageManager.getClass();
                gd5.a(packageManager, new ComponentName(context, (Class<?>) RescheduleReceiver.class), z5, ed5.n);
                return f88Var;
            case 5:
                boolean z6 = this.n;
                if (z6) {
                    if (!z6) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ct1.a0(obj);
                    }
                    return null;
                }
                ct1.a0(obj);
                th8 th8Var = (th8) obj2;
                vh8 vh8Var = th8Var.q0;
                if (vh8Var == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                t36 t36Var = vh8Var.s;
                yi yiVar = new yi(th8Var, (byte) 17);
                this.n = true;
                if (t36Var.m.b(yiVar, this) == ne1Var) {
                    return ne1Var;
                }
                hk0.b();
                return null;
            case 6:
                ct1.a0(obj);
                l97 l97Var = ((vh8) obj2).r;
                Boolean boolValueOf = Boolean.valueOf(this.n);
                l97Var.getClass();
                l97Var.l(null, boolValueOf);
                return f88Var;
            default:
                boolean z7 = this.n;
                if (!z7) {
                    ct1.a0(obj);
                    this.n = true;
                    ((l07) obj2).getClass();
                    Object objJ0 = im3.j0(g22.a, new l5(2, hc1Var, (byte) 22), this);
                    if (objJ0 != ne1Var) {
                        objJ0 = f88Var;
                    }
                    if (objJ0 == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z7) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                return f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys7(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f2638o = obj;
    }
}
