package o;

/* JADX INFO: loaded from: classes.dex */
public final class gf extends e52 {
    public nf V;
    public ca0 W;
    public ym2 X;
    public in1 Y;

    @Override // o.es4
    public final void M0() {
        r1(this.W);
    }

    @Override // o.e52
    public final Object Y0(bj bjVar, tb tbVar) {
        Object objB = nf.b(this.V, new bf(bjVar, this, null), tbVar);
        return objB == ne1.m ? objB : f88.a;
    }

    @Override // o.um1, o.ln5
    public final void c() {
        E();
        if (this.z) {
            in1 in1Var = vn4.p0(this).L;
            in1 in1Var2 = this.Y;
            if (in1Var2 == null || !in1Var2.equals(in1Var)) {
                this.Y = in1Var;
                r1(this.W);
            }
        }
    }

    @Override // o.e52
    public final boolean m1() {
        return ((bg5) this.V.f).getValue() != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p1(float f, jc1 jc1Var) {
        cf cfVar;
        h76 h76Var;
        if (jc1Var instanceof cf) {
            cfVar = (cf) jc1Var;
            int i = cfVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                cfVar.p = i - Integer.MIN_VALUE;
            } else {
                cfVar = new cf(this, jc1Var);
            }
        } else {
            cfVar = new cf(this, jc1Var);
        }
        Object obj = cfVar.n;
        int i2 = cfVar.p;
        if (i2 == 0) {
            ct1.a0(obj);
            this.V.getClass();
            h76 h76Var2 = new h76();
            h76Var2.m = f;
            nf nfVar = this.V;
            ef efVar = new ef(this, h76Var2, f, null);
            cfVar.m = h76Var2;
            cfVar.p = 2;
            Object objB = nf.b(nfVar, efVar, cfVar);
            ne1 ne1Var = ne1.m;
            if (objB == ne1Var) {
                return ne1Var;
            }
            h76Var = h76Var2;
        } else {
            if (i2 == 1) {
                ct1.a0(obj);
                return obj;
            }
            if (i2 != 2) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h76Var = cfVar.m;
            ct1.a0(obj);
        }
        return new Float(h76Var.m);
    }

    public final boolean q1() {
        return vn4.p0(this).M == j04.n && this.C == gb5.n;
    }

    public final void r1(ca0 ca0Var) {
        ym2 h47Var = ca0Var;
        if (ca0Var == null) {
            z38 z38Var = ve.a;
            t2 t2Var = ve.b;
            in1 in1Var = vn4.p0(this).L;
            this.Y = in1Var;
            h47Var = new h47(new iu((Object) this.V, (Object) t2Var, (Object) new y(in1Var, (byte) 4), (byte) 3), z38Var);
        }
        this.X = h47Var;
    }
}
