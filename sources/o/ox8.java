package o;

/* JADX INFO: loaded from: classes.dex */
public final class ox8 extends bw8 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1689o;

    public /* synthetic */ ox8(Object obj, byte b) {
        this.n = b;
        this.f1689o = obj;
    }

    @Override // o.bw8
    public final void a() {
        switch (this.n) {
            case 0:
                synchronized (((cy8) this.f1689o).f) {
                    try {
                        if (((cy8) this.f1689o).k.get() > 0 && ((cy8) this.f1689o).k.decrementAndGet() > 0) {
                            ((cy8) this.f1689o).b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        cy8 cy8Var = (cy8) this.f1689o;
                        if (cy8Var.m != null) {
                            cy8Var.b.a("Unbind from service.", new Object[0]);
                            cy8 cy8Var2 = (cy8) this.f1689o;
                            cy8Var2.a.unbindService(cy8Var2.l);
                            cy8Var = (cy8) this.f1689o;
                            cy8Var.g = false;
                            cy8Var.m = null;
                            cy8Var.l = null;
                        }
                        cy8Var.c();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                cy8 cy8Var3 = (cy8) ((xs8) this.f1689o).b;
                cy8Var3.b.a("unlinkToDeath", new Object[0]);
                ((ct8) cy8Var3.m).c.unlinkToDeath(cy8Var3.j, 0);
                cy8Var3.m = null;
                cy8Var3.g = false;
                return;
        }
    }
}
