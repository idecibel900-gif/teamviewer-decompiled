package o;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jf extends og7 implements Function1 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1156o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(1, hc1Var);
        this.m = b;
        this.f1156o = obj;
        this.p = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.p;
        Object obj3 = this.f1156o;
        hc1 hc1Var = (hc1) obj;
        switch (b) {
            case 0:
                return new jf((nf) obj3, (iw2) obj2, hc1Var, (byte) 0).invokeSuspend(f88Var);
            case 1:
                return new jf((el) obj3, (fp7) obj2, hc1Var, (byte) 1).invokeSuspend(f88Var);
            case 2:
                return new jf((n40) obj3, (m40) obj2, hc1Var, (byte) 2).invokeSuspend(f88Var);
            case 3:
                return new jf((ho2) obj3, (k76) obj2, hc1Var, (byte) 3).invokeSuspend(f88Var);
            default:
                return new jf((vx4) obj3, (cv7) obj2, hc1Var, (byte) 4).invokeSuspend(f88Var);
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        cl clVar;
        Object objA;
        byte b = this.m;
        Object obj2 = this.p;
        ne1 ne1Var = ne1.m;
        Object obj3 = this.f1156o;
        f88 f88Var = f88.a;
        byte b2 = 1;
        hc1 hc1Var = null;
        switch (b) {
            case 0:
                nf nfVar = (nf) obj3;
                boolean z = this.n;
                if (!z) {
                    ct1.a0(obj);
                    hf hfVar = new hf(nfVar, b2);
                    j0 j0Var = new j0((iw2) obj2, nfVar, hc1Var, (byte) 6);
                    this.n = true;
                    if (uf0.v(hfVar, j0Var, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                uj1 uj1VarE = nfVar.e();
                wf5 wf5Var = (wf5) nfVar.i;
                Object objA2 = uj1VarE.a(wf5Var.z());
                if (objA2 != null) {
                    if (Math.abs(wf5Var.z() - nfVar.e().f(objA2)) < 0.5f && ((Boolean) ((Function1) nfVar.b).invoke(objA2)).booleanValue()) {
                        ((bg5) nfVar.e).setValue(objA2);
                        ((bg5) nfVar.d).setValue(objA2);
                    }
                }
                return f88Var;
            case 1:
                el elVar = (el) obj3;
                br5 br5Var = elVar.e;
                View view = elVar.a;
                boolean z2 = this.n;
                byte b3 = 26;
                try {
                    if (!z2) {
                        ct1.a0(obj);
                        dl dlVar = new dl();
                        fp7 fp7Var = (fp7) obj2;
                        cl clVar2 = new cl(dlVar, new al(elVar, fp7Var, (byte) 0), new al(elVar, fp7Var, b2), view);
                        Function1 function1 = elVar.b;
                        if (function1 != null && (clVar = (cl) function1.invoke(clVar2)) != null) {
                            clVar2 = clVar;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (looperMyLooper == (handler != null ? handler.getLooper() : null)) {
                            ActionMode actionModeStartActionMode = view.startActionMode(new fo2(clVar2), 1);
                            if (actionModeStartActionMode != null) {
                                elVar.h = actionModeStartActionMode;
                            }
                            return f88Var;
                        }
                        io.sentry.android.core.internal.util.j jVar = elVar.i;
                        if (jVar == null) {
                            jVar = new io.sentry.android.core.internal.util.j(elVar, clVar2, dlVar, b2);
                            elVar.i = jVar;
                        }
                        view.post(jVar);
                        this.n = true;
                        Object objM = dlVar.a.m(this);
                        if (objM != ne1Var) {
                            objM = f88Var;
                        }
                        if (objM == ne1Var) {
                            return ne1Var;
                        }
                    } else {
                        if (!z2) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ct1.a0(obj);
                    }
                    br5Var.a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    Handler handler2 = view.getHandler();
                    if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable b5Var = elVar.j;
                        if (b5Var == null) {
                            b5Var = new io.sentry.b5(elVar, b3);
                            elVar.j = b5Var;
                        }
                        view.post(b5Var);
                    } else {
                        ActionMode actionMode = elVar.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    io.sentry.android.core.internal.util.j jVar2 = elVar.i;
                    if (jVar2 != null) {
                        view.removeCallbacks(jVar2);
                    }
                    elVar.h = null;
                    return f88Var;
                } catch (Throwable th) {
                    br5Var.a();
                    Looper looperMyLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable b5Var2 = elVar.j;
                        if (b5Var2 == null) {
                            b5Var2 = new io.sentry.b5(elVar, b3);
                            elVar.j = b5Var2;
                        }
                        view.post(b5Var2);
                    } else {
                        ActionMode actionMode2 = elVar.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    io.sentry.android.core.internal.util.j jVar3 = elVar.i;
                    if (jVar3 != null) {
                        view.removeCallbacks(jVar3);
                    }
                    elVar.h = null;
                    throw th;
                }
            case 2:
                m40 m40Var = (m40) obj2;
                bg5 bg5Var = ((n40) obj3).c;
                boolean z3 = this.n;
                try {
                    if (!z3) {
                        ct1.a0(obj);
                        bg5Var.setValue(m40Var);
                        this.n = true;
                        Object objM2 = m40Var.b.m(this);
                        if (objM2 != ne1Var) {
                            objM2 = f88Var;
                        }
                        if (objM2 == ne1Var) {
                            return ne1Var;
                        }
                    } else {
                        if (!z3) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ct1.a0(obj);
                    }
                    bg5Var.setValue(null);
                    return f88Var;
                } catch (Throwable th2) {
                    bg5Var.setValue(null);
                    throw th2;
                }
            case 3:
                k76 k76Var = (k76) obj2;
                boolean z4 = this.n;
                if (!z4) {
                    ct1.a0(obj);
                    ho2 ho2Var = (ho2) obj3;
                    hr2 hr2Var = g68.s;
                    Object obj4 = k76Var.m;
                    if (obj4 == hr2Var) {
                        obj4 = null;
                    }
                    this.n = true;
                    if (ho2Var.c(obj4, this) == ne1Var) {
                        return ne1Var;
                    }
                } else {
                    if (!z4) {
                        hk0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ct1.a0(obj);
                }
                k76Var.m = null;
                return f88Var;
            default:
                vx4 vx4Var = (vx4) obj3;
                boolean z5 = this.n;
                try {
                    if (!z5) {
                        ct1.a0(obj);
                        vx4Var.b.setValue(Boolean.FALSE);
                        rn6 rn6Var = vx4Var.a;
                        cv7 cv7Var = (cv7) obj2;
                        this.n = true;
                        u18 u18Var = rn6Var.q;
                        if (u18Var == null || (objA = jy4.a(rn6Var.x, new lf(rn6Var, cv7Var, u18Var, null, (byte) 1), this)) != ne1Var) {
                            objA = f88Var;
                        }
                        if (objA == ne1Var) {
                            return ne1Var;
                        }
                    } else {
                        if (!z5) {
                            hk0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ct1.a0(obj);
                    }
                    vx4Var.b.setValue(Boolean.FALSE);
                    return f88Var;
                } catch (Throwable th3) {
                    vx4Var.b.setValue(Boolean.FALSE);
                    throw th3;
                }
        }
    }
}
