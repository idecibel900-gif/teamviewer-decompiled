package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ac2 extends v04 implements g04 {
    public u18 A;
    public n18 B;
    public n18 C;
    public n18 D;
    public bc2 E;
    public hf2 F;
    public dy6 G;
    public Function0 H;
    public ob2 I;
    public long J = -9223372034707292160L;
    public he K;
    public final zb2 L;
    public final zb2 M;

    public ac2(u18 u18Var, n18 n18Var, n18 n18Var2, n18 n18Var3, bc2 bc2Var, hf2 hf2Var, dy6 dy6Var, Function0 function0, ob2 ob2Var) {
        this.A = u18Var;
        this.B = n18Var;
        this.C = n18Var2;
        this.D = n18Var3;
        this.E = bc2Var;
        this.F = hf2Var;
        this.G = dy6Var;
        this.H = function0;
        this.I = ob2Var;
        t61.b(0, 0, 0, 0, 15);
        this.L = new zb2(this, (byte) 0);
        this.M = new zb2(this, (byte) 1);
    }

    @Override // o.es4
    public final void M0() {
        this.J = -9223372034707292160L;
    }

    public final he U0() {
        he heVar;
        he heVar2;
        if (this.A.f().c(mb2.m, mb2.n)) {
            um0 um0Var = this.E.a.c;
            if (um0Var != null && (heVar2 = um0Var.a) != null) {
                return heVar2;
            }
            um0 um0Var2 = this.F.a.c;
            if (um0Var2 != null) {
                return um0Var2.a;
            }
            return null;
        }
        um0 um0Var3 = this.F.a.c;
        if (um0Var3 != null && (heVar = um0Var3.a) != null) {
            return heVar;
        }
        um0 um0Var4 = this.E.a.c;
        if (um0Var4 != null) {
            return um0Var4.a;
        }
        return null;
    }

    @Override // o.g04
    public final void Y(i04 i04Var) {
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x010d  */
    @Override // o.r04
    public final eo4 a(fo4 fo4Var, zn4 zn4Var, long j) {
        m18 m18VarA;
        m18 m18VarA2;
        d18 d18Var;
        m18 m18VarA3;
        m18 m18VarA4;
        long j2;
        long j3;
        m18 m18VarA5;
        no noVar;
        mo moVar;
        float fFloatValue;
        if (this.A.a.p0() == this.A.d.getValue()) {
            this.K = null;
        } else if (this.K == null) {
            he heVarU0 = U0();
            if (heVarU0 == null) {
                heVarU0 = xz2.f2564o;
            }
            this.K = heVarU0;
        }
        boolean zB0 = fo4Var.b0();
        fa2 fa2Var = fa2.m;
        if (zB0) {
            jl5 jl5VarC = zn4Var.C(j);
            long j4 = (((long) jl5VarC.m) << 32) | (((long) jl5VarC.n) & 4294967295L);
            this.J = j4;
            return fo4Var.u((int) (j4 >> 32), (int) (j4 & 4294967295L), fa2Var, new xn(jl5VarC, (byte) 1));
        }
        if (!((Boolean) this.H.a()).booleanValue()) {
            jl5 jl5VarC2 = zn4Var.C(j);
            return fo4Var.u(jl5VarC2.m, jl5VarC2.n, fa2Var, new xn(jl5VarC2, (byte) 2));
        }
        ob2 ob2Var = this.I;
        n18 n18Var = ob2Var.a;
        dy6 dy6Var = ob2Var.b;
        n18 n18Var2 = ob2Var.c;
        u18 u18Var = ob2Var.d;
        bc2 bc2Var = ob2Var.e;
        t18 t18Var = bc2Var.a;
        hf2 hf2Var = ob2Var.f;
        n18 n18Var3 = ob2Var.g;
        if (n18Var != null) {
            m18VarA = n18Var.a(new qb2(bc2Var, hf2Var, (byte) 0), dy6Var.a() ? Float.valueOf(dy6Var.f) : null, null, new rb2(bc2Var, hf2Var, dy6Var, (byte) 0));
        } else {
            m18VarA = null;
        }
        if (n18Var2 != null) {
            qb2 qb2Var = new qb2(bc2Var, hf2Var, (byte) 1);
            Float fValueOf = dy6Var.a() ? Float.valueOf(dy6Var.g) : null;
            if (dy6Var.a()) {
                pc8 pc8Var = dy6Var.j;
                if (pc8Var != null) {
                    float fB = pc8Var.b();
                    Float fValueOf2 = Float.valueOf(fB);
                    if (Float.isNaN(fB)) {
                        fValueOf2 = null;
                    }
                    if (fValueOf2 != null) {
                        fFloatValue = fValueOf2.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                } else {
                    fFloatValue = 0.0f;
                }
                moVar = new mo(fFloatValue);
            } else {
                moVar = null;
            }
            m18VarA2 = n18Var2.a(qb2Var, fValueOf, moVar, new rb2(bc2Var, hf2Var, dy6Var, (byte) 1));
        } else {
            m18VarA2 = null;
        }
        if (u18Var.a.p0() == mb2.m) {
            pi6 pi6Var = t18Var.d;
            if (pi6Var != null) {
                d18Var = new d18(pi6Var.b);
            } else {
                pi6 pi6Var2 = hf2Var.a.d;
                if (pi6Var2 != null) {
                    d18Var = new d18(pi6Var2.b);
                } else {
                    d18Var = null;
                }
            }
        } else {
            pi6 pi6Var3 = hf2Var.a.d;
            if (pi6Var3 != null) {
                d18Var = new d18(pi6Var3.b);
            } else {
                pi6 pi6Var4 = t18Var.d;
                if (pi6Var4 != null) {
                    d18Var = new d18(pi6Var4.b);
                } else {
                    d18Var = null;
                }
            }
        }
        if (n18Var3 != null) {
            m18VarA3 = n18Var3.a(zm.w, dy6Var.a() ? new d18(dy6Var.h) : null, null, new sb2(d18Var, bc2Var, hf2Var, dy6Var));
        } else {
            m18VarA3 = null;
        }
        sb2 sb2Var = new sb2(dy6Var, m18VarA, m18VarA2, m18VarA3);
        jl5 jl5VarC3 = zn4Var.C(j);
        long j5 = (((long) jl5VarC3.m) << 32) | (((long) jl5VarC3.n) & 4294967295L);
        long j6 = !dl3.b(this.J, -9223372034707292160L) ? this.J : j5;
        n18 n18Var4 = this.B;
        if (n18Var4 != null) {
            m18VarA4 = n18Var4.a(this.L, null, null, new yb2(this, j6, (byte) 0));
        } else {
            m18VarA4 = null;
        }
        long jD = t61.d(j, m18VarA4 != null ? ((dl3) m18VarA4.getValue()).a : j5);
        n18 n18Var5 = this.C;
        if (n18Var5 != null) {
            j2 = 0;
            j3 = ((vk3) n18Var5.a(zm.z, null, null, new yb2(this, j6, (byte) 2)).getValue()).a;
        } else {
            j2 = 0;
            j3 = 0;
        }
        n18 n18Var6 = this.D;
        if (n18Var6 != null) {
            dy6 dy6Var2 = this.G;
            vk3 vk3Var = dy6Var2.a() ? new vk3(dy6Var2.i) : null;
            if (this.G.a()) {
                float fB2 = nc8.b(j2);
                Float fValueOf3 = Float.valueOf(fB2);
                if (Float.isNaN(fB2)) {
                    fValueOf3 = null;
                }
                float fFloatValue2 = fValueOf3 != null ? fValueOf3.floatValue() : 0.0f;
                float fC = nc8.c(j2);
                Float fValueOf4 = !Float.isNaN(fC) ? Float.valueOf(fC) : null;
                noVar = new no(fFloatValue2, fValueOf4 != null ? fValueOf4.floatValue() : 0.0f);
            } else {
                noVar = null;
            }
            m18VarA5 = n18Var6.a(this.M, vk3Var, noVar, new yb2(this, j6, (byte) 1));
        } else {
            m18VarA5 = null;
        }
        return fo4Var.u((int) (jD >> 32), (int) (jD & 4294967295L), fa2Var, new xb2(this, m18VarA5, j5, j6, jD, jl5VarC3, j3, sb2Var));
    }
}
