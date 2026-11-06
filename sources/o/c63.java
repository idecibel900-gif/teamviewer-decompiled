package o;

/* JADX INFO: loaded from: classes.dex */
public final class c63 {
    public int a;
    public float b;
    public final Object c;

    public c63(ts7 ts7Var) {
        this.c = ts7Var;
        this.a = -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        ts7 ts7Var = (ts7) this.c;
        int i2 = 1;
        if (z) {
            int iE = it1.E(ts7Var.f, i, z);
            int lineStart = ts7Var.f.getLineStart(iE);
            int iE2 = ts7Var.e(iE);
            if (i == lineStart || i == iE2) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.a == i4) {
            return this.b;
        }
        float fI = z3 ? ts7Var.i(i, z) : ts7Var.j(i, z);
        if (z2) {
            this.a = i4;
            this.b = fI;
        }
        return fI;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(float f, jc1 jc1Var) {
        p96 p96Var;
        if (jc1Var instanceof p96) {
            p96Var = (p96) jc1Var;
            int i = p96Var.f1717o;
            if ((i & Integer.MIN_VALUE) != 0) {
                p96Var.f1717o = i - Integer.MIN_VALUE;
            } else {
                p96Var = new p96(this, jc1Var);
            }
        } else {
            p96Var = new p96(this, jc1Var);
        }
        Object objInvoke = p96Var.m;
        int i2 = p96Var.f1717o;
        if (i2 == 0) {
            ct1.a0(objInvoke);
            jv7 jv7Var = (jv7) this.c;
            Float f2 = new Float(f);
            p96Var.f1717o = 1;
            objInvoke = jv7Var.invoke(f2, p96Var);
            ne1 ne1Var = ne1.m;
            if (objInvoke == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(objInvoke);
        }
        this.b += ((Number) objInvoke).floatValue();
        return f88.a;
    }

    public c63(int i, jv7 jv7Var) {
        this.a = i;
        this.c = jv7Var;
    }
}
