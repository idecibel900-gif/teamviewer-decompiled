package o;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes.dex */
public final class qh2 extends ao7 {
    public final /* synthetic */ zf6 e;
    public final /* synthetic */ vc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh2(String str, zf6 zf6Var, vc vcVar) {
        super(str, true);
        this.e = zf6Var;
        this.f = vcVar;
    }

    @Override // o.ao7
    public final long a() throws InterruptedException {
        yf6 yf6Var;
        zf6 zf6Var = this.e;
        try {
            yf6Var = zf6Var.d();
        } catch (Throwable th) {
            yf6Var = new yf6(zf6Var, th, 2);
        }
        vc vcVar = this.f;
        if (!((CopyOnWriteArrayList) vcVar.p).contains(zf6Var)) {
            return -1L;
        }
        ((LinkedBlockingDeque) vcVar.q).put(yf6Var);
        return -1L;
    }
}
