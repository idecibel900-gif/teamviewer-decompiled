package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u96 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ a65 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a65 f2188o;

    public /* synthetic */ u96(a65 a65Var, a65 a65Var2, byte b) {
        this.m = b;
        this.n = a65Var;
        this.f2188o = a65Var2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        a65 a65Var = this.f2188o;
        a65 a65Var2 = this.n;
        jh6 jh6Var = (jh6) obj;
        switch (b) {
            case 0:
                byte b2 = 1;
                a65 a65VarB = vt1.B(new u96(a65Var2, a65Var, b2), new v96(a65Var2, a65Var, b2));
                sa4 sa4VarT = qf0.t();
                Iterator it = ((Map) obj2).entrySet().iterator();
                while (it.hasNext()) {
                    Object objInvoke = ((hw2) a65VarB.n).invoke(jh6Var, (Map.Entry) it.next());
                    objInvoke.getClass();
                    sa4VarT.add(objInvoke);
                }
                return qf0.r(sa4VarT);
            default:
                Map.Entry entry = (Map.Entry) obj2;
                return qf0.L(((hw2) a65Var2.n).invoke(jh6Var, entry.getKey()), ((hw2) a65Var.n).invoke(jh6Var, entry.getValue()));
        }
    }
}
