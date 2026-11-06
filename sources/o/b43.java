package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class b43 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ e43 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l33 f390o;

    public /* synthetic */ b43(e43 e43Var, l33 l33Var, byte b) {
        this.m = b;
        this.n = e43Var;
        this.f390o = l33Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        l33 l33Var = this.f390o;
        e43 e43Var = this.n;
        switch (b) {
            case 0:
                l97 l97Var = (l97) e43Var.n.f578o;
                String str = l33Var.b;
                if (str == null) {
                    str = "";
                }
                l97Var.l(null, new h13(l33Var, str));
                break;
            default:
                im3.R(e8.n(e43Var), null, null, new oa1(e43Var, l33Var, (hc1) null, (byte) 24), 3);
                break;
        }
        return f88Var;
    }
}
