package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hm6 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ zl6 f989o;

    public /* synthetic */ hm6(Function1 function1, zl6 zl6Var, byte b) {
        this.m = b;
        this.n = function1;
        this.f989o = zl6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        zl6 zl6Var = this.f989o;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                function1.invoke(zl6Var);
                break;
            default:
                function1.invoke(zl6Var);
                break;
        }
        return f88Var;
    }
}
