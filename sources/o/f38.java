package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f38 implements sa1, k30 {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final int c;
    public final uv0 d;
    public final uv0 e;
    public final uv0 f;

    public f38(p30 p30Var, qx6 qx6Var) {
        this.a = qx6Var.e;
        this.c = qx6Var.a;
        uv0 uv0VarD = qx6Var.b.d();
        this.d = uv0VarD;
        uv0 uv0VarD2 = qx6Var.c.d();
        this.e = uv0VarD2;
        uv0 uv0VarD3 = qx6Var.d.d();
        this.f = uv0VarD3;
        p30Var.d(uv0VarD);
        p30Var.d(uv0VarD2);
        p30Var.d(uv0VarD3);
        uv0VarD.a(this);
        uv0VarD2.a(this);
        uv0VarD3.a(this);
    }

    @Override // o.k30
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((k30) arrayList.get(i)).a();
            i++;
        }
    }

    @Override // o.sa1
    public final void b(List list, List list2) {
    }

    public final void d(k30 k30Var) {
        this.b.add(k30Var);
    }
}
