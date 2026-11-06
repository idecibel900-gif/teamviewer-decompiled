package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class es4 implements um1 {
    public fc1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f737o;
    public es4 q;
    public es4 r;
    public p65 s;
    public e45 t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public ql1 y;
    public boolean z;
    public es4 m = this;
    public int p = -1;

    public final me1 I0() {
        fc1 fc1Var = this.n;
        if (fc1Var != null) {
            return fc1Var;
        }
        fc1 fc1VarC = hm3.c(vn4.q0(this).getCoroutineContext().H0(new dp3((bp3) vn4.q0(this).getCoroutineContext().l0(z06.z))));
        this.n = fc1VarC;
        return fc1VarC;
    }

    public boolean J0() {
        return !(this instanceof f20);
    }

    public void K0() {
        if (this.z) {
            ki3.c("node attached multiple times");
        }
        if (this.t == null) {
            ki3.c("attach invoked on a node without a coordinator");
        }
        this.z = true;
        this.w = true;
    }

    public void L0() {
        if (!this.z) {
            ki3.c("Cannot detach a node that is not attached");
        }
        if (this.w) {
            ki3.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.x) {
            ki3.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.z = false;
        fc1 fc1Var = this.n;
        if (fc1Var != null) {
            hm3.f(fc1Var, new ks4("The Modifier.Node was detached"));
            this.n = null;
        }
    }

    public void M0() {
    }

    public void N0() {
    }

    public void O0() {
    }

    public void P0() {
        if (!this.z) {
            ki3.c("reset() called on an unattached node");
        }
        O0();
    }

    public void Q0() {
        if (!this.z) {
            ki3.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.w) {
            ki3.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.w = false;
        M0();
        this.x = true;
    }

    public void R0() {
        if (!this.z) {
            ki3.c("node detached multiple times");
        }
        if (this.t == null) {
            ki3.c("detach invoked on a node without a coordinator");
        }
        if (!this.x) {
            ki3.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.x = false;
        ql1 ql1Var = this.y;
        if (ql1Var != null) {
            ql1Var.a();
        }
        N0();
    }

    public void S0(es4 es4Var) {
        this.m = es4Var;
    }

    public void T0(e45 e45Var) {
        this.t = e45Var;
    }

    @Override // o.um1
    public final es4 f0() {
        return this.m;
    }
}
