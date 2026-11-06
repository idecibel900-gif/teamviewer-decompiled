package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class lh4 extends yz3 implements hw2 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ qh4 f1362o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ fs4 q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lh4(qh4 qh4Var, Function0 function0, fs4 fs4Var, int i, byte b) {
        super(2);
        this.n = b;
        this.f1362o = qh4Var;
        this.p = function0;
        this.q = fs4Var;
        this.r = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.n;
        f88 f88Var = f88.a;
        int i = this.r;
        fs4 fs4Var = this.q;
        Function0 function0 = this.p;
        qh4 qh4Var = this.f1362o;
        ux2 ux2Var = (ux2) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ct1.f(qh4Var, function0, fs4Var, ux2Var, yo1.Y(i | 1));
                break;
            default:
                ct1.f(qh4Var, function0, fs4Var, ux2Var, yo1.Y(i | 1));
                break;
        }
        return f88Var;
    }
}
