package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tu implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f2142o;
    public final /* synthetic */ Function0 p;

    public /* synthetic */ tu(Function0 function0, boolean z, Function0 function1, byte b) {
        this.m = b;
        this.n = function0;
        this.f2142o = z;
        this.p = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        Function0 function0 = this.p;
        boolean z = this.f2142o;
        Function0 function1 = this.n;
        switch (b) {
            case 0:
                if (!z) {
                    function0.a();
                } else {
                    function1.a();
                }
                break;
            case 1:
                function1.a();
                if (!z && function0 != null) {
                    function0.a();
                }
                break;
            case 2:
                if (!z) {
                    function1.a();
                }
                if (function0 != null) {
                    function0.a();
                }
                break;
            case 3:
                function1.a();
                if (!z && function0 != null) {
                    function0.a();
                }
                break;
            case 4:
                function1.a();
                if (!z && function0 != null) {
                    function0.a();
                }
                break;
            case 5:
                if (z) {
                    function1.a();
                } else if (function0 != null) {
                    function0.a();
                }
                break;
            case 6:
                if (!z) {
                    function1.a();
                }
                if (function0 != null) {
                    function0.a();
                }
                break;
            default:
                function1.a();
                if (!z && function0 != null) {
                    function0.a();
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ tu(boolean z, Function0 function0, Function0 function1, byte b) {
        this.m = b;
        this.f2142o = z;
        this.n = function0;
        this.p = function1;
    }
}
