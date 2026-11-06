package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class h07 extends g07 {
    public final k48 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f938o;
    public final boolean p;
    public final zo4 q;
    public final Function1 r;

    public h07(k48 k48Var, List list, boolean z, zo4 zo4Var, Function1 function1) {
        k48Var.getClass();
        list.getClass();
        zo4Var.getClass();
        this.n = k48Var;
        this.f938o = list;
        this.p = z;
        this.q = zo4Var;
        this.r = function1;
        if (!(zo4Var instanceof cd2) || (zo4Var instanceof hv7)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + zo4Var + '\n' + k48Var);
    }

    @Override // o.oz3
    public final zo4 I() {
        return this.q;
    }

    @Override // o.oz3
    public final List m0() {
        return this.f938o;
    }

    @Override // o.oz3
    public final g48 n0() {
        g48.n.getClass();
        return g48.f858o;
    }

    @Override // o.oz3
    public final k48 o0() {
        return this.n;
    }

    @Override // o.oz3
    public final boolean p0() {
        return this.p;
    }

    @Override // o.oz3
    public final oz3 q0(uz3 uz3Var) {
        g07 g07Var = (g07) this.r.invoke(uz3Var);
        return g07Var == null ? this : g07Var;
    }

    @Override // o.m98
    /* JADX INFO: renamed from: t0 */
    public final m98 q0(uz3 uz3Var) {
        g07 g07Var = (g07) this.r.invoke(uz3Var);
        return g07Var == null ? this : g07Var;
    }

    @Override // o.g07, o.m98
    /* JADX INFO: renamed from: v0 */
    public final g07 s0(boolean z) {
        if (z == this.p) {
            return this;
        }
        return z ? new g55(this, (byte) 1) : new g55(this, (byte) 0);
    }

    @Override // o.m98
    /* JADX INFO: renamed from: w0 */
    public final g07 u0(g48 g48Var) {
        g48Var.getClass();
        return g48Var.isEmpty() ? this : new j07(this, g48Var);
    }
}
