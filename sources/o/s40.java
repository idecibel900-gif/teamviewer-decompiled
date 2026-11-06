package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s40 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ at7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f1982o;

    public /* synthetic */ s40(at7 at7Var, Function1 function1, byte b) {
        this.m = b;
        this.n = at7Var;
        this.f1982o = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        Function1 function1 = this.f1982o;
        at7 at7Var = this.n;
        switch (b) {
            case 0:
                vs7 vs7Var = (vs7) obj;
                if (at7Var != null) {
                    at7Var.a.setValue(vs7Var);
                }
                if (function1 != null) {
                    function1.invoke(vs7Var);
                }
                return f88.a;
            default:
                at7Var.c.add(function1);
                return new l9(at7Var, function1, (byte) 20);
        }
    }
}
