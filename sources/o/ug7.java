package o;

/* JADX INFO: loaded from: classes.dex */
public final class ug7 implements in1, hc1 {
    public final /* synthetic */ vg7 m;
    public final gl0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public gl0 f2213o;
    public cn5 p = cn5.n;
    public final /* synthetic */ vg7 q;

    public ug7(vg7 vg7Var, gl0 gl0Var) {
        this.q = vg7Var;
        this.m = vg7Var;
        this.n = gl0Var;
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
        return f / this.m.getDensity();
    }

    @Override // o.in1
    public final float Z() {
        return this.m.Z();
    }

    public final Object a(cn5 cn5Var, i30 i30Var) {
        gl0 gl0Var = new gl0(1, vt1.A(i30Var));
        gl0Var.t();
        this.p = cn5Var;
        this.f2213o = gl0Var;
        return gl0Var.q();
    }

    public final long b() {
        vg7 vg7Var = this.q;
        long jW0 = vg7Var.w0(vn4.p0(vg7Var).N.d());
        long j = vg7Var.J;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jW0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jW0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final ee8 c() {
        return vn4.p0(this.q).N;
    }

    @Override // o.in1
    public final float d0(float f) {
        return this.m.getDensity() * f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j, hw2 hw2Var, i30 i30Var) throws Throwable {
        rg7 rg7Var;
        Throwable th;
        n87 n87Var;
        gl0 gl0Var;
        if (i30Var instanceof rg7) {
            rg7Var = (rg7) i30Var;
            int i = rg7Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                rg7Var.p = i - Integer.MIN_VALUE;
            } else {
                rg7Var = new rg7(this, i30Var);
            }
        } else {
            rg7Var = new rg7(this, i30Var);
        }
        Object objInvoke = rg7Var.n;
        int i2 = rg7Var.p;
        if (i2 != 0) {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            n87Var = rg7Var.m;
            try {
                ct1.a0(objInvoke);
                n87Var.j(dl0.m);
                return objInvoke;
            } catch (Throwable th2) {
                th = th2;
                n87Var.j(dl0.m);
                throw th;
            }
        }
        ct1.a0(objInvoke);
        if (j <= 0 && (gl0Var = this.f2213o) != null) {
            gl0Var.resumeWith(new sc6(new dn5(j)));
        }
        n87 n87VarR = im3.R(this.q.I0(), null, null, new sg7(j, this, null), 3);
        try {
            rg7Var.m = n87VarR;
            rg7Var.p = 1;
            objInvoke = hw2Var.invoke(this, rg7Var);
            Object obj = ne1.m;
            if (objInvoke == obj) {
                return obj;
            }
            n87Var = n87VarR;
            n87Var.j(dl0.m);
            return objInvoke;
        } catch (Throwable th3) {
            th = th3;
            n87Var = n87VarR;
            n87Var.j(dl0.m);
            throw th;
        }
    }

    @Override // o.hc1
    public final de1 getContext() {
        return ba2.m;
    }

    @Override // o.in1
    public final float getDensity() {
        return this.m.getDensity();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(long j, hw2 hw2Var, jc1 jc1Var) {
        tg7 tg7Var;
        if (jc1Var instanceof tg7) {
            tg7Var = (tg7) jc1Var;
            int i = tg7Var.f2109o;
            if ((i & Integer.MIN_VALUE) != 0) {
                tg7Var.f2109o = i - Integer.MIN_VALUE;
            } else {
                tg7Var = new tg7(this, jc1Var);
            }
        } else {
            tg7Var = new tg7(this, jc1Var);
        }
        Object obj = tg7Var.m;
        int i2 = tg7Var.f2109o;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ct1.a0(obj);
                    return obj;
                }
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
            tg7Var.f2109o = 1;
            Object objE = e(j, hw2Var, tg7Var);
            Object obj2 = ne1.m;
            return objE == obj2 ? obj2 : objE;
        } catch (dn5 unused) {
            return null;
        }
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

    @Override // o.hc1
    public final void resumeWith(Object obj) {
        vg7 vg7Var = this.q;
        synchronized (vg7Var.G) {
            vg7Var.F.j(this);
        }
        this.n.resumeWith(obj);
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
