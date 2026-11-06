package o;

/* JADX INFO: loaded from: classes.dex */
public final class s10 {
    public final j93 a;
    public final o75 b;

    public s10(j93 j93Var, o75 o75Var) {
        this.a = j93Var;
        this.b = o75Var;
        if ((j93Var == null ? o75Var : j93Var) != null) {
            return;
        }
        hk0.g("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(io.sentry.l6 l6Var) {
        j93 j93Var = this.a;
        if (j93Var != null) {
            j93.z(j93Var, (q10) l6Var.b);
            return;
        }
        o75 o75Var = this.b;
        if (o75Var != null) {
            o75Var.b((r10) l6Var.a);
        } else {
            hk0.l("Unreachable");
        }
    }

    public final void b(io.sentry.l6 l6Var) {
        if (this.a != null) {
            ((q10) l6Var.b).e();
        } else if (this.b != null) {
            ((r10) l6Var.a).e();
        } else {
            hk0.l("Unreachable");
        }
    }
}
