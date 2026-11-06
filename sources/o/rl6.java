package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rl6 implements Function1 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ bn6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ql6 f1930o;

    public /* synthetic */ rl6(ql6 ql6Var, bn6 bn6Var) {
        this.f1930o = ql6Var;
        this.n = bn6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        ql6 ql6Var = this.f1930o;
        bn6 bn6Var = this.n;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                if (str.length() == 0 && (ql6Var instanceof pl6)) {
                    ((pl6) ql6Var).c.invoke(new n5(bn6Var, str, ql6Var, (byte) 28));
                } else {
                    bn6Var.E = null;
                    bn6Var.i1(str);
                }
                break;
            default:
                ll6 ll6Var = (ll6) obj;
                ll6Var.getClass();
                bt1.m(ql6Var, new a26(ll6Var, bn6Var, (byte) 9));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ rl6(bn6 bn6Var, ql6 ql6Var) {
        this.n = bn6Var;
        this.f1930o = ql6Var;
    }
}
