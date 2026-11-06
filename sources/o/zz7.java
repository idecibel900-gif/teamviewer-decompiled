package o;

/* JADX INFO: loaded from: classes.dex */
public final class zz7 extends y57 {
    public boolean c = false;
    public final /* synthetic */ byte d;
    public final /* synthetic */ a08 e;

    /* JADX WARN: Multi-variable type inference failed */
    public zz7(a08 a08Var, int i) {
        this.e = a08Var;
        this.d = i;
    }

    @Override // o.y57, o.ef8
    public final void a() {
        this.c = true;
    }

    @Override // o.y57, o.ef8
    public final void b() {
        this.e.a.setVisibility(0);
    }

    @Override // o.ef8
    public final void c() {
        if (this.c) {
            return;
        }
        this.e.a.setVisibility(this.d);
    }
}
