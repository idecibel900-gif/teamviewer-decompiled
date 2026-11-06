package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1242o;

    public /* synthetic */ ka(Function1 function1, int i, byte b) {
        this.m = b;
        this.n = function1;
        this.f1242o = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.f1242o;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                function1.invoke(Integer.valueOf(i));
                break;
            default:
                function1.invoke(Integer.valueOf(i));
                break;
        }
        return f88Var;
    }
}
