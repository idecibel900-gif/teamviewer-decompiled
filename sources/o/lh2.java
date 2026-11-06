package o;

/* JADX INFO: loaded from: classes.dex */
public final class lh2 implements zf6 {
    public final yf6 a;

    public lh2(Throwable th) {
        this.a = new yf6(this, th, 2);
    }

    @Override // o.zf6
    public final zf6 a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // o.zf6
    public final b46 b() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // o.zf6
    public final boolean c() {
        return false;
    }

    @Override // o.zf6, o.me2
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // o.zf6
    public final yf6 d() {
        return this.a;
    }

    @Override // o.zf6
    public final yf6 g() {
        return this.a;
    }
}
