package o;

/* JADX INFO: loaded from: classes2.dex */
public final class cb6 extends db6 {
    public final /* synthetic */ jo4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte[] d;

    public cb6(jo4 jo4Var, int i, byte[] bArr) {
        this.b = jo4Var;
        this.c = i;
        this.d = bArr;
    }

    @Override // o.db6
    public final long a() {
        return this.c;
    }

    @Override // o.db6
    public final jo4 b() {
        return this.b;
    }

    @Override // o.db6
    public final void d(nf0 nf0Var) {
        nf0Var.P(this.d, this.c);
    }
}
