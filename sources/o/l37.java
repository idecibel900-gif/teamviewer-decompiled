package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l37 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ o37 n;

    public /* synthetic */ l37(o37 o37Var, byte b) {
        this.m = b;
        this.n = o37Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        o37 o37Var = this.n;
        switch (b) {
            case 0:
                o37Var.a();
                return Boolean.TRUE;
            case 1:
                o37Var.a();
                return f88Var;
            default:
                gl0 gl0Var = o37Var.b;
                if (gl0Var.r() instanceof z45) {
                    gl0Var.resumeWith(z37.n);
                }
                return f88Var;
        }
    }
}
