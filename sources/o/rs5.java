package o;

/* JADX INFO: loaded from: classes2.dex */
public class rs5 extends ep3 {
    public boolean r;

    public static boolean H(x35 x35Var) {
        return (x35Var instanceof et7) && lb7.f(((et7) x35Var).Q());
    }

    public boolean I(x35 x35Var) {
        if (x35Var != null && (x35Var instanceof o82)) {
            o82 o82Var = (o82) x35Var;
            if (!o82Var.t("br") && !o82Var.e0()) {
                if ((o82Var.p.p & 1) == 0) {
                    if (!(o82Var.m instanceof i32)) {
                        o82 o82VarD0 = o82Var.d0();
                        for (int i = 0; i < 5 && o82VarD0 != null; i++) {
                            if (!o82VarD0.e0() && (o82VarD0.p.p & 1) != 0) {
                                o82VarD0 = o82VarD0.v();
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean J(x35 x35Var) {
        if (x35Var != null && x35Var != ((x35) this.n) && !this.r && !H(x35Var)) {
            if (I(x35Var)) {
                return true;
            }
            x35 x35VarI = x35Var.I();
            while (H(x35VarI)) {
                x35VarI = x35VarI.I();
            }
            if (I(x35VarI)) {
                return true;
            }
            o82 o82Var = x35Var.m;
            if (I(o82Var) && !o82Var.p.c(8)) {
                x35 x35VarP = o82Var.p();
                for (int i = 0; i < 5 && x35VarP != null; i++) {
                    if (!(x35VarP instanceof et7)) {
                        if (x35VarI == null) {
                            return true;
                        }
                        if ((x35VarI instanceof et7) || (!I(x35VarI) && (x35VarI instanceof o82))) {
                            break;
                        }
                        return true;
                    }
                    x35VarP = x35VarP.w();
                }
            }
        }
        return false;
    }

    @Override // o.ep3
    public final void b(o82 o82Var, int i) {
        if (J(o82Var)) {
            s(i);
        }
        o82Var.D((lq1) this.f733o, (h32) this.p);
        if (o82Var.p.c(64)) {
            this.r = true;
        }
    }

    @Override // o.ep3
    public final void c(q54 q54Var, int i) {
        if (J(q54Var)) {
            s(i);
        }
        q54Var.D((lq1) this.f733o, (h32) this.p);
    }

    @Override // o.ep3
    public final void d(o82 o82Var, int i) {
        x35 x35VarP = o82Var.p();
        while (H(x35VarP)) {
            x35VarP = x35VarP.w();
        }
        if (J(x35VarP)) {
            s(i);
        }
        o82Var.f0((lq1) this.f733o, (h32) this.p);
        if (this.r && o82Var.p.c(64)) {
            for (o82 o82Var2 = o82Var.m; o82Var2 != null; o82Var2 = o82Var2.m) {
                if ((o82Var2.p.p & 64) != 0) {
                    return;
                }
            }
            this.r = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000e A[PHI: r1
      0x000e: PHI (r1v3 int) = (r1v0 int), (r1v2 int), (r1v2 int) binds: [B:5:0x000c, B:27:0x004a, B:29:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.ep3
    public final void f(et7 et7Var, int i, int i2) {
        int i3 = 0;
        if (!this.r) {
            int i4 = 4;
            if (I(et7Var.m)) {
                x35 x35VarI = et7Var.I();
                x35 x35VarW = et7Var.w();
                if ((!(x35VarI instanceof o82) || I(x35VarI)) && (x35VarI == null || (!(x35VarI instanceof et7) && J(x35VarI)))) {
                    i4 = 12;
                }
                if (x35VarW != null && ((x35VarW instanceof et7) || !J(x35VarW))) {
                    while (H(x35VarW)) {
                        x35VarW = x35VarW.w();
                    }
                    if (!(x35VarW instanceof et7) || !lb7.i(((q54) x35VarW).Q().codePointAt(0))) {
                        i3 = i4;
                    }
                }
                i3 = i4 | 16;
            } else {
                i3 = i4;
            }
            if (!lb7.f(et7Var.Q()) && I(et7Var.m) && J(et7Var)) {
                s(i2);
            }
        }
        super.f(et7Var, i3, i2);
    }
}
