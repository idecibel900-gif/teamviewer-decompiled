package o;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class gt2 extends ov7 {
    public ov7 e;

    public gt2(ov7 ov7Var) {
        ov7Var.getClass();
        this.e = ov7Var;
    }

    @Override // o.ov7
    public final ov7 a() {
        return this.e.a();
    }

    @Override // o.ov7
    public final ov7 b() {
        return this.e.b();
    }

    @Override // o.ov7
    public final long c() {
        return this.e.c();
    }

    @Override // o.ov7
    public final ov7 d(long j) {
        return this.e.d(j);
    }

    @Override // o.ov7
    public final boolean e() {
        return this.e.e();
    }

    @Override // o.ov7
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // o.ov7
    public final ov7 g(long j) {
        TimeUnit.MILLISECONDS.getClass();
        return this.e.g(j);
    }
}
