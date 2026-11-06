package o;

import android.app.Activity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iq1 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1089o;
    public final /* synthetic */ Object p;

    public /* synthetic */ iq1(byte b, Object obj, Object obj2, boolean z) {
        this.m = b;
        this.n = z;
        this.p = obj;
        this.f1089o = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.f1089o;
        Object obj3 = this.p;
        boolean z = this.n;
        switch (b) {
            case 0:
                Function1 function1 = (Function1) obj3;
                px4 px4Var = (px4) obj2;
                zr7 zr7Var = (zr7) obj;
                zr7Var.getClass();
                if (!z) {
                    px4Var.setValue(zr7Var);
                    function1.invoke(zr7Var.a.n);
                }
                return f88Var;
            case 1:
                Activity activity = (Activity) obj3;
                px4 px4Var2 = (px4) obj2;
                ((r22) obj).getClass();
                return !z ? new fc((byte) 3) : new l9(activity, px4Var2, (byte) 4);
            default:
                String str = (String) obj3;
                o37 o37Var = (o37) obj2;
                op6 op6Var = (op6) obj;
                if (z) {
                    lp6.g(op6Var, 0);
                }
                l37 l37Var = new l37(o37Var, (byte) 0);
                fw3[] fw3VarArr = lp6.a;
                op6Var.d(zo6.v, new m3(null, l37Var));
                lp6.h(op6Var, str);
                return f88Var;
        }
    }
}
