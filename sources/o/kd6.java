package o;

/* JADX INFO: loaded from: classes2.dex */
public final class kd6 implements zf6 {
    public final b46 a;

    public kd6(b46 b46Var) {
        b46Var.getClass();
        this.a = b46Var;
    }

    @Override // o.zf6
    public final zf6 a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // o.zf6
    public final b46 b() {
        return this.a;
    }

    @Override // o.zf6
    public final boolean c() {
        return true;
    }

    @Override // o.zf6, o.me2
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // o.zf6
    public final yf6 d() {
        throw new IllegalStateException("already connected");
    }

    @Override // o.zf6
    public final yf6 g() {
        throw new IllegalStateException("already connected");
    }
}
