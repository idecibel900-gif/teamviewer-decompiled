package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dc1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f606o;

    public /* synthetic */ dc1(byte b, Function0 function0, boolean z) {
        this.m = b;
        this.n = z;
        this.f606o = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        Function0 function0 = this.f606o;
        boolean z = this.n;
        switch (b) {
            case 0:
                if (z) {
                    function0.a();
                }
                break;
            case 1:
                ga7.a(z ? q31.r : q31.q);
                function0.a();
                break;
            case 2:
                if (!z) {
                    function0.a();
                }
                break;
            case 3:
                if (!z) {
                    function0.a();
                }
                break;
            case 4:
                if (!z) {
                    function0.a();
                }
                break;
            case 5:
                if (!z) {
                    function0.a();
                }
                break;
            default:
                ga7.a(z ? q31.t : q31.s);
                function0.a();
                break;
        }
        return f88Var;
    }
}
