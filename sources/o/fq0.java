package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fq0 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f821o;

    public /* synthetic */ fq0(Function1 function1, boolean z, byte b) {
        this.m = b;
        this.n = function1;
        this.f821o = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        boolean z = this.f821o;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                function1.invoke(Boolean.valueOf(!z));
                break;
            case 1:
                function1.invoke(Boolean.valueOf(!z));
                break;
            default:
                function1.invoke(Boolean.valueOf(!z));
                break;
        }
        return f88Var;
    }
}
