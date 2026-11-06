package o;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class ph2 extends d2 {
    public final io.sentry.c n = new io.sentry.c(4);

    @Override // o.d2
    public final Random a() {
        Object obj = this.n.get();
        obj.getClass();
        return (Random) obj;
    }
}
