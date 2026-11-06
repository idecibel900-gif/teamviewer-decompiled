package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s81 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h71 f1991o;

    public /* synthetic */ s81(Function1 function1, h71 h71Var, byte b) {
        this.m = b;
        this.n = function1;
        this.f1991o = h71Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        h71 h71Var = this.f1991o;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                function1.invoke(Integer.valueOf(h71Var.m));
                break;
            case 1:
                function1.invoke(h71Var);
                break;
            default:
                function1.invoke(h71Var);
                break;
        }
        return f88Var;
    }
}
