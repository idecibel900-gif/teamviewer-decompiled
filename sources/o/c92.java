package o;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class c92 extends zu1 {
    public final /* synthetic */ zu1 d;
    public final /* synthetic */ ThreadPoolExecutor e;

    public c92(zu1 zu1Var, ThreadPoolExecutor threadPoolExecutor) {
        this.d = zu1Var;
        this.e = threadPoolExecutor;
    }

    @Override // o.zu1
    public final void F(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        try {
            this.d.F(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // o.zu1
    public final void G(j93 j93Var) {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        try {
            this.d.G(j93Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
