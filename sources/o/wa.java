package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wa implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ px4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ px4 f2393o;

    public /* synthetic */ wa(px4 px4Var, px4 px4Var2, byte b) {
        this.m = b;
        this.n = px4Var;
        this.f2393o = px4Var2;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.f2393o;
        px4 px4Var2 = this.n;
        switch (b) {
            case 0:
                ((Function1) px4Var2.getValue()).invoke((d37) obj);
                ((Function0) px4Var.getValue()).a();
                break;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    ((Function1) px4Var.getValue()).invoke(f27.a);
                } else {
                    ((Function0) px4Var2.getValue()).a();
                }
                break;
            case 2:
                if (!((Boolean) obj).booleanValue()) {
                    ((Function1) px4Var.getValue()).invoke(m27.a);
                } else {
                    ((Function0) px4Var2.getValue()).a();
                }
                break;
            case 3:
                d37 d37Var = (d37) obj;
                ((Function1) px4Var2.getValue()).invoke(d37Var);
                if (im3.n(d37Var, o27.a)) {
                    ((Function0) px4Var.getValue()).a();
                }
                break;
            case 4:
                if (!((Boolean) obj).booleanValue()) {
                    ((Function1) px4Var2.getValue()).invoke(a37.a);
                } else {
                    ((Function1) px4Var2.getValue()).invoke(b37.a);
                    ((Function0) px4Var.getValue()).a();
                }
                break;
            default:
                ((Function1) px4Var2.getValue()).invoke(null);
                ((Function0) px4Var.getValue()).a();
                break;
        }
        return f88Var;
    }
}
