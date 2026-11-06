package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sd6 extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ td6 f2012o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sd6(td6 td6Var, byte b) {
        super(1);
        this.n = b;
        this.f2012o = td6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        td6 td6Var = this.f2012o;
        switch (b) {
            case 0:
                return Double.valueOf(td6Var.n.e(ct1.t(((Number) obj).doubleValue(), td6Var.e, td6Var.f)));
            default:
                return Double.valueOf(ct1.t(td6Var.k.e(((Number) obj).doubleValue()), td6Var.e, td6Var.f));
        }
    }
}
