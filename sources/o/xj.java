package o;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class xj implements me1 {
    public final View m;
    public final js7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final me1 f2521o;
    public final AtomicReference p = new AtomicReference(null);

    public xj(View view, js7 js7Var, me1 me1Var) {
        this.m = view;
        this.n = js7Var;
        this.f2521o = me1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(k64 k64Var, jc1 jc1Var) {
        wj wjVar;
        if (jc1Var instanceof wj) {
            wjVar = (wj) jc1Var;
            int i = wjVar.f2416o;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjVar.f2416o = i - Integer.MIN_VALUE;
            } else {
                wjVar = new wj(this, jc1Var);
            }
        } else {
            wjVar = new wj(this, jc1Var);
        }
        Object obj = wjVar.m;
        int i2 = wjVar.f2416o;
        if (i2 == 0) {
            ct1.a0(obj);
            g0 g0Var = new g0(k64Var, this, (byte) 7);
            hc1 hc1Var = null;
            h0 h0Var = new h0(this, hc1Var, (byte) 10);
            wjVar.f2416o = 1;
            if (hm3.j(new tb(g0Var, this.p, h0Var, hc1Var, (byte) 8), wjVar) == ne1.m) {
                return;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            ct1.a0(obj);
        }
        hk0.b();
    }

    @Override // o.me1
    public final de1 getCoroutineContext() {
        return this.f2521o.getCoroutineContext();
    }
}
