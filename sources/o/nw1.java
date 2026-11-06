package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nw1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1607o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ nw1(boolean z, Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.n = z;
        this.f1607o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj = this.q;
        Object obj2 = this.p;
        Object obj3 = this.f1607o;
        boolean z = this.n;
        switch (b) {
            case 0:
                ul1 ul1Var = (ul1) obj3;
                Function0 function0 = (Function0) obj2;
                Function0 function1 = (Function0) obj;
                if (z && ul1.c(ul1Var)) {
                    if (function0 != null) {
                        function0.a();
                    }
                } else if (z) {
                    function1.a();
                } else if (ul1.c(ul1Var) && function0 != null) {
                    function0.a();
                }
                break;
            default:
                w44 w44Var = (w44) obj3;
                Long l = (Long) obj2;
                px4 px4Var = (px4) obj;
                if (z) {
                    a65 a65Var = w44.y;
                    byte b2 = 0;
                    if (w44Var.j.a()) {
                        im3.R(((o44) w44Var.f.getValue()).h, null, null, new t44(w44Var, null, b2), 3);
                    }
                    w44Var.m(0, false);
                }
                px4Var.setValue(l);
                break;
        }
        return f88Var;
    }
}
