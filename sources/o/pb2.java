package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class pb2 extends yz3 implements hw2 {
    public final /* synthetic */ u18 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f1722o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb2(u18 u18Var, Function0 function0, int i) {
        super(2);
        this.n = u18Var;
        this.f1722o = function0;
        this.p = i;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iY = yo1.Y(this.p | 1);
        wb2.a(this.n, this.f1722o, (ux2) obj, iY);
        return f88.a;
    }
}
