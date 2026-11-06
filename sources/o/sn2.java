package o;

/* JADX INFO: loaded from: classes.dex */
public final class sn2 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final km e;
    public jl3 f;
    public jl3 g;

    public sn2(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new km(new w32(f), vn4.l0, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, o.f88] */
    public final Object a(jl3 jl3Var, jc1 jc1Var) {
        qn2 qn2Var;
        float f;
        km kmVar = this.e;
        if (jc1Var instanceof qn2) {
            qn2Var = (qn2) jc1Var;
            int i = qn2Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                qn2Var.p = i - Integer.MIN_VALUE;
            } else {
                qn2Var = new qn2(this, jc1Var);
            }
        } else {
            qn2Var = new qn2(this, jc1Var);
        }
        Object obj = qn2Var.n;
        int i2 = qn2Var.p;
        try {
            if (i2 == 0) {
                ct1.a0(obj);
                if (jl3Var instanceof yr5) {
                    f = this.b;
                } else if (jl3Var instanceof j63) {
                    f = this.c;
                } else {
                    f = jl3Var instanceof dq2 ? this.d : this.a;
                }
                this.g = jl3Var;
                if (!w32.b(((w32) kmVar.e.getValue()).m, f)) {
                    jl3 jl3Var2 = this.f;
                    qn2Var.m = jl3Var;
                    qn2Var.p = 1;
                    Object objA = s82.a(kmVar, f, jl3Var2, jl3Var, qn2Var);
                    ne1 ne1Var = ne1.m;
                    if (objA == ne1Var) {
                        return ne1Var;
                    }
                }
            } else {
                if (i2 != 1) {
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jl3Var = qn2Var.m;
                ct1.a0(obj);
            }
            this.f = jl3Var;
            this = f88.a;
            return this;
        } catch (Throwable th) {
            this.f = jl3Var;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(jc1 jc1Var) {
        rn2 rn2Var;
        float f;
        if (jc1Var instanceof rn2) {
            rn2Var = (rn2) jc1Var;
            int i = rn2Var.f1932o;
            if ((i & Integer.MIN_VALUE) != 0) {
                rn2Var.f1932o = i - Integer.MIN_VALUE;
            } else {
                rn2Var = new rn2(this, jc1Var);
            }
        } else {
            rn2Var = new rn2(this, jc1Var);
        }
        Object obj = rn2Var.m;
        int i2 = rn2Var.f1932o;
        try {
            if (i2 == 0) {
                ct1.a0(obj);
                jl3 jl3Var = this.g;
                if (jl3Var instanceof yr5) {
                    f = this.b;
                } else if (jl3Var instanceof j63) {
                    f = this.c;
                } else {
                    f = jl3Var instanceof dq2 ? this.d : this.a;
                }
                km kmVar = this.e;
                if (!w32.b(((w32) kmVar.e.getValue()).m, f)) {
                    w32 w32Var = new w32(f);
                    rn2Var.f1932o = 1;
                    Object objE = kmVar.e(w32Var, rn2Var);
                    ne1 ne1Var = ne1.m;
                    if (objE == ne1Var) {
                        return ne1Var;
                    }
                }
                return f88.a;
            }
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
            this.f = this.g;
            return f88.a;
        } catch (Throwable th) {
            this.f = this.g;
            throw th;
        }
    }
}
