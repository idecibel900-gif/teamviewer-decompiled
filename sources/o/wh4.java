package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class wh4 extends yz3 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xh4 f2415o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh4(xh4 xh4Var, byte b) {
        super(0);
        this.n = b;
        this.f2415o = xh4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.n;
        boolean z = false;
        xh4 xh4Var = this.f2415o;
        switch (b) {
            case 0:
                return Boolean.valueOf((((qh4) xh4Var.n.getValue()) == null && ((Throwable) xh4Var.f2517o.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) xh4Var.f2517o.getValue()) != null);
            case 2:
                if (((qh4) xh4Var.n.getValue()) == null && ((Throwable) xh4Var.f2517o.getValue()) == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(((qh4) xh4Var.n.getValue()) != null);
        }
    }
}
