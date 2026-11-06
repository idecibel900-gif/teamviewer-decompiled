package o;

/* JADX INFO: loaded from: classes.dex */
public final class fk1 implements zn4 {
    public final /* synthetic */ byte m;
    public final zn4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Enum f804o;
    public final Enum p;

    public /* synthetic */ fk1(zn4 zn4Var, Enum r2, Enum r3, byte b) {
        this.m = b;
        this.n = zn4Var;
        this.f804o = r2;
        this.p = r3;
    }

    @Override // o.zn4
    public final jl5 C(long j) {
        byte b = this.m;
        Enum r1 = this.f804o;
        Enum r2 = this.p;
        zn4 zn4Var = this.n;
        switch (b) {
            case 0:
                fm3 fm3Var = (fm3) r2;
                cm3 cm3Var = (cm3) r1;
                cm3 cm3Var2 = cm3.n;
                if (fm3Var == fm3.m) {
                    return new dm2(cm3Var == cm3Var2 ? zn4Var.o(r61.h(j)) : zn4Var.k(r61.h(j)), r61.d(j) ? r61.h(j) : 32767, (byte) 0);
                }
                return new dm2(r61.e(j) ? r61.i(j) : 32767, cm3Var == cm3Var2 ? zn4Var.a(r61.i(j)) : zn4Var.V(r61.i(j)), (byte) 0);
            case 1:
                io4 io4Var = (io4) r2;
                ho4 ho4Var = (ho4) r1;
                ho4 ho4Var2 = ho4.n;
                if (io4Var == io4.m) {
                    return new dm2(ho4Var == ho4Var2 ? zn4Var.o(r61.h(j)) : zn4Var.k(r61.h(j)), r61.d(j) ? r61.h(j) : 32767, (byte) 1);
                }
                return new dm2(r61.e(j) ? r61.i(j) : 32767, ho4Var == ho4Var2 ? zn4Var.a(r61.i(j)) : zn4Var.V(r61.i(j)), (byte) 1);
            default:
                n45 n45Var = (n45) r2;
                m45 m45Var = (m45) r1;
                m45 m45Var2 = m45.n;
                if (n45Var == n45.m) {
                    return new dm2(m45Var == m45Var2 ? zn4Var.o(r61.h(j)) : zn4Var.k(r61.h(j)), r61.d(j) ? r61.h(j) : 32767, (byte) 2);
                }
                return new dm2(r61.e(j) ? r61.i(j) : 32767, m45Var == m45Var2 ? zn4Var.a(r61.i(j)) : zn4Var.V(r61.i(j)), (byte) 2);
        }
    }

    @Override // o.zn4
    public final Object E() {
        switch (this.m) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.n.E();
    }

    @Override // o.zn4
    public final int V(int i) {
        switch (this.m) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.n.V(i);
    }

    @Override // o.zn4
    public final int a(int i) {
        switch (this.m) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.n.a(i);
    }

    @Override // o.zn4
    public final int k(int i) {
        switch (this.m) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.n.k(i);
    }

    @Override // o.zn4
    public final int o(int i) {
        switch (this.m) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.n.o(i);
    }
}
