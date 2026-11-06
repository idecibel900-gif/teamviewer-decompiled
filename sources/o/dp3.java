package o;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public class dp3 extends op3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f642o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp3(bp3 bp3Var) {
        super(true);
        boolean z = true;
        J(bp3Var);
        Unsafe unsafe = defpackage.a.a;
        long j = op3.m;
        pq0 pq0Var = (pq0) unsafe.getObjectVolatile(this, j);
        qq0 qq0Var = pq0Var instanceof qq0 ? (qq0) pq0Var : null;
        if (qq0Var == null) {
            z = false;
            break;
        }
        op3 op3VarL = qq0Var.l();
        while (!op3VarL.B()) {
            pq0 pq0Var2 = (pq0) defpackage.a.a.getObjectVolatile(op3VarL, j);
            qq0 qq0Var2 = pq0Var2 instanceof qq0 ? (qq0) pq0Var2 : null;
            if (qq0Var2 == null) {
                z = false;
                break;
            }
            op3VarL = qq0Var2.l();
        }
        this.f642o = z;
    }

    @Override // o.op3
    public final boolean B() {
        return this.f642o;
    }

    @Override // o.op3
    public final boolean C() {
        return true;
    }
}
