package o;

/* JADX INFO: loaded from: classes.dex */
public final class wh1 {
    public final l97 a;

    public wh1() {
        this.a = im3.k(p78.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void a(en0 en0Var, jc1 jc1Var) {
        n65 n65Var;
        if (jc1Var instanceof n65) {
            n65Var = (n65) jc1Var;
            int i = n65Var.f1545o;
            if ((i & Integer.MIN_VALUE) != 0) {
                n65Var.f1545o = i - Integer.MIN_VALUE;
            } else {
                n65Var = new n65(this, jc1Var);
            }
        } else {
            n65Var = new n65(this, jc1Var);
        }
        Object obj = n65Var.m;
        int i2 = n65Var.f1545o;
        if (i2 != 0) {
            if (i2 == 1) {
                throw ua5.q(obj);
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
        } else {
            ct1.a0(obj);
            n65Var.f1545o = 1;
            this.a.b(en0Var, n65Var);
        }
    }

    public g97 b() {
        return (g97) this.a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    public void c(g97 g97Var) {
        l97 l97Var;
        Object value;
        g97 g97Var2;
        g97Var.getClass();
        do {
            l97Var = this.a;
            value = l97Var.getValue();
            g97Var2 = (g97) value;
            if (g97Var2 instanceof h36 ? true : im3.n(g97Var2, p78.b)) {
                g97Var2 = g97Var;
            } else if (g97Var2 instanceof qg1) {
                if (g97Var.a > g97Var2.a) {
                    g97Var2 = g97Var;
                }
            } else if (!(g97Var2 instanceof gl2)) {
                gk0.s();
                return;
            }
        } while (!l97Var.j(value, g97Var2));
    }

    public wh1(int i) {
        this.a = im3.k(new int[i]);
    }
}
