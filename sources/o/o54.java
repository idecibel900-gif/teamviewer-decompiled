package o;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class o54 extends oz3 {
    public final xd4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Function0 f1631o;
    public final vd4 p;

    public o54(xd4 xd4Var, Function0 function0) {
        this.n = xd4Var;
        this.f1631o = function0;
        this.p = new vd4(xd4Var, function0);
    }

    @Override // o.oz3
    public final zo4 I() {
        return s0().I();
    }

    @Override // o.oz3
    public final List m0() {
        return s0().m0();
    }

    @Override // o.oz3
    public final g48 n0() {
        return s0().n0();
    }

    @Override // o.oz3
    public final k48 o0() {
        return s0().o0();
    }

    @Override // o.oz3
    public final boolean p0() {
        return s0().p0();
    }

    @Override // o.oz3
    public final oz3 q0(uz3 uz3Var) {
        return new o54(this.n, new a3(uz3Var, this, (byte) 27));
    }

    @Override // o.oz3
    public final m98 r0() {
        oz3 oz3VarS0 = s0();
        while (oz3VarS0 instanceof o54) {
            oz3VarS0 = ((o54) oz3VarS0).s0();
        }
        oz3VarS0.getClass();
        return (m98) oz3VarS0;
    }

    public final oz3 s0() {
        return (oz3) this.p.a();
    }

    public final String toString() {
        vd4 vd4Var = this.p;
        return (vd4Var.f2201o == wd4.m || vd4Var.f2201o == wd4.n) ? "<Not computed yet>" : s0().toString();
    }
}
