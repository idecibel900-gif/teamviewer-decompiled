package o;

/* JADX INFO: loaded from: classes.dex */
public final class wr5 implements in1 {
    public final /* synthetic */ in1 m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2438o;
    public final my4 p = new my4();

    public wr5(in1 in1Var) {
        this.m = in1Var;
    }

    @Override // o.in1
    public final float A0(long j) {
        return this.m.A0(j);
    }

    @Override // o.in1
    public final long I(float f) {
        return this.m.I(f);
    }

    @Override // o.in1
    public final float O(int i) {
        return this.m.O(i);
    }

    @Override // o.in1
    public final float R(float f) {
        return this.m.R(f);
    }

    @Override // o.in1
    public final float Z() {
        return this.m.Z();
    }

    public final void a() {
        this.f2438o = true;
        my4 my4Var = this.p;
        if (my4Var.d()) {
            my4Var.j(null);
        }
    }

    public final void b() {
        this.n = true;
        my4 my4Var = this.p;
        if (my4Var.d()) {
            my4Var.j(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(jc1 jc1Var) {
        ur5 ur5Var;
        if (jc1Var instanceof ur5) {
            ur5Var = (ur5) jc1Var;
            int i = ur5Var.f2244o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ur5Var.f2244o = i - Integer.MIN_VALUE;
            } else {
                ur5Var = new ur5(this, jc1Var);
            }
        } else {
            ur5Var = new ur5(this, jc1Var);
        }
        Object obj = ur5Var.m;
        int i2 = ur5Var.f2244o;
        if (i2 == 0) {
            ct1.a0(obj);
            ur5Var.f2244o = 1;
            Object objE = this.p.e(ur5Var);
            ne1 ne1Var = ne1.m;
            if (objE == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
        }
        this.n = false;
        this.f2438o = false;
        return f88.a;
    }

    @Override // o.in1
    public final float d0(float f) {
        return this.m.d0(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(jc1 jc1Var) {
        vr5 vr5Var;
        if (jc1Var instanceof vr5) {
            vr5Var = (vr5) jc1Var;
            int i = vr5Var.f2338o;
            if ((i & Integer.MIN_VALUE) != 0) {
                vr5Var.f2338o = i - Integer.MIN_VALUE;
            } else {
                vr5Var = new vr5(this, jc1Var);
            }
        } else {
            vr5Var = new vr5(this, jc1Var);
        }
        Object obj = vr5Var.m;
        int i2 = vr5Var.f2338o;
        my4 my4Var = this.p;
        if (i2 == 0) {
            ct1.a0(obj);
            if (!this.n && !this.f2438o) {
                vr5Var.f2338o = 1;
                Object objE = my4Var.e(vr5Var);
                ne1 ne1Var = ne1.m;
                if (objE == ne1Var) {
                    return ne1Var;
                }
            }
            return Boolean.valueOf(this.n);
        }
        if (i2 != 1) {
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ct1.a0(obj);
        my4Var.j(null);
        return Boolean.valueOf(this.n);
    }

    @Override // o.in1
    public final float getDensity() {
        return this.m.getDensity();
    }

    @Override // o.in1
    public final int l0(long j) {
        return this.m.l0(j);
    }

    @Override // o.in1
    public final long q(float f) {
        return this.m.q(f);
    }

    @Override // o.in1
    public final int q0(float f) {
        return this.m.q0(f);
    }

    @Override // o.in1
    public final long r(long j) {
        return this.m.r(j);
    }

    @Override // o.in1
    public final float v(long j) {
        return this.m.v(j);
    }

    @Override // o.in1
    public final long w0(long j) {
        return this.m.w0(j);
    }
}
