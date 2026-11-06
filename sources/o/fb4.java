package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fb4 extends gb4 {
    @Override // o.gb4
    public final void a(long j, Object obj) {
        ((e2) ((ql3) d98.j(j, obj))).m = false;
    }

    @Override // o.gb4
    public final void b(ny2 ny2Var, Object obj, long j) {
        ql3 ql3VarZ = (ql3) d98.j(j, ny2Var);
        ql3 ql3Var = (ql3) d98.j(j, obj);
        int size = ql3VarZ.size();
        int size2 = ql3Var.size();
        if (size > 0 && size2 > 0) {
            if (!((e2) ql3VarZ).m) {
                ql3VarZ = ql3VarZ.z(size2 + size);
            }
            ql3VarZ.addAll(ql3Var);
        }
        if (size > 0) {
            ql3Var = ql3VarZ;
        }
        d98.p(j, ny2Var, ql3Var);
    }

    @Override // o.gb4
    public final List c(long j, Object obj) {
        ql3 ql3Var = (ql3) d98.j(j, obj);
        if (((e2) ql3Var).m) {
            return ql3Var;
        }
        int size = ql3Var.size();
        ql3 ql3VarZ = ql3Var.z(size == 0 ? 10 : size * 2);
        d98.p(j, obj, ql3VarZ);
        return ql3VarZ;
    }
}
