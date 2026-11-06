package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class be2 extends fe1 {
    public static final /* synthetic */ int r = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f416o;
    public boolean p;
    public kw q;

    @Override // o.fe1
    public final fe1 N0(int i) {
        xs1.x(i);
        return this;
    }

    public final void O0(boolean z) {
        long j = this.f416o - (z ? 4294967296L : 1L);
        this.f416o = j;
        if (j <= 0 && this.p) {
            shutdown();
        }
    }

    public final void P0(c22 c22Var) {
        kw kwVar = this.q;
        if (kwVar == null) {
            kwVar = new kw();
            this.q = kwVar;
        }
        kwVar.addLast(c22Var);
    }

    public final void Q0(boolean z) {
        this.f416o = (z ? 4294967296L : 1L) + this.f416o;
        if (z) {
            return;
        }
        this.p = true;
    }

    public abstract long R0();

    public final boolean S0() {
        kw kwVar = this.q;
        if (kwVar == null) {
            return false;
        }
        c22 c22Var = (c22) (kwVar.isEmpty() ? null : kwVar.removeFirst());
        if (c22Var == null) {
            return false;
        }
        c22Var.run();
        return true;
    }

    public abstract void shutdown();
}
