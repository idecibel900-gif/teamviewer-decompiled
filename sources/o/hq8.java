package o;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class hq8 implements d85, x75, s75, t75 {
    public final CountDownLatch m;

    public /* synthetic */ hq8() {
        this.m = new CountDownLatch(1);
    }

    @Override // o.t75
    public /* synthetic */ void m(bo7 bo7Var) {
        this.m.countDown();
    }

    @Override // o.s75
    public void onCanceled() {
        this.m.countDown();
    }

    @Override // o.x75
    public void onFailure(Exception exc) {
        this.m.countDown();
    }

    @Override // o.d85
    public void onSuccess(Object obj) {
        this.m.countDown();
    }
}
