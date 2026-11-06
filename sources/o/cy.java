package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cy implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ xy6 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f565o;

    public /* synthetic */ cy(xy6 xy6Var, Function0 function0, byte b) {
        this.m = b;
        this.n = xy6Var;
        this.f565o = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Function0 function0 = this.f565o;
        xy6 xy6Var = this.n;
        switch (b) {
            case 0:
                if (!xy6Var.e()) {
                    function0.a();
                }
                break;
            case 1:
                if (!xy6Var.e()) {
                    function0.a();
                }
                break;
            case 2:
                if (!xy6Var.e()) {
                    function0.a();
                }
                break;
            case 3:
                if (!xy6Var.e()) {
                    function0.a();
                }
                break;
            case 4:
                if (!xy6Var.e()) {
                    function0.a();
                }
                break;
            default:
                if (!xy6Var.e()) {
                    function0.a();
                }
                break;
        }
        return f88Var;
    }
}
