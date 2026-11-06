package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kv0 extends s0 {
    public final nw3 a;

    public kv0(nw3 nw3Var) {
        this.a = nw3Var;
    }

    @Override // o.nw3
    public void a(bb7 bb7Var, Object obj) {
        int iH = h(obj);
        fq6 fq6VarD = d();
        fq6VarD.getClass();
        bb7 bb7VarA = bb7Var.a(fq6VarD);
        Iterator itG = g(obj);
        for (int i = 0; i < iH; i++) {
            bb7VarA.n(d(), i, this.a, itG.next());
        }
        bb7VarA.s(fq6VarD);
    }

    @Override // o.s0
    public void j(k01 k01Var, int i, Object obj) {
        m(i, obj, k01Var.C(d(), i, this.a, null));
    }

    public void m(int i, Object obj, Object obj2) {
        ((fs5) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }
}
