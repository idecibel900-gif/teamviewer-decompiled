package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hh4 extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kh4 f974o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh4(kh4 kh4Var, int i, byte b) {
        super(1);
        this.n = b;
        this.f974o = kh4Var;
        this.p = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.n;
        int i = this.p;
        kh4 kh4Var = this.f974o;
        switch (b) {
            case 0:
                break;
        }
        return Boolean.valueOf(kh4Var.b(i, ((Number) obj).longValue()));
    }
}
