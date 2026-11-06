package o;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z10 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Context n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f2660o;

    public /* synthetic */ z10(Context context, Function0 function0, byte b) {
        this.m = b;
        this.n = context;
        this.f2660o = function0;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        aw awVar = e01.a;
        Function0 function0 = this.f2660o;
        Context context = this.n;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    boolean zH = ux2Var.h(context) | ux2Var.f(function0);
                    Object objK = ux2Var.K();
                    if (zH || objK == awVar) {
                        objK = new b20(context, function0, (byte) 0);
                        ux2Var.g0(objK);
                    }
                    v67.d((Function0) objK, null, null, false, "TVTA-background-data-dialog-confirmButton", ga0.g, ux2Var, 221184, 14);
                }
                break;
            default:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    boolean zH2 = ux2Var2.h(context) | ux2Var2.f(function0);
                    Object objK2 = ux2Var2.K();
                    if (zH2 || objK2 == awVar) {
                        objK2 = new b20(context, function0, (byte) 2);
                        ux2Var2.g0(objK2);
                    }
                    v67.d((Function0) objK2, null, null, false, "TVTA-notification-channel-dialog-confirmButton", di1.i, ux2Var2, 221184, 14);
                }
                break;
        }
        return f88Var;
    }
}
