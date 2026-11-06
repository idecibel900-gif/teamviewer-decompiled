package o;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ag3 implements mx5 {
    public final /* synthetic */ gu0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ ag3(gu0 gu0Var, Function0 function0, Function1 function1) {
        this.a = gu0Var;
        this.b = function0;
        this.c = function1;
    }

    @Override // o.mx5
    public void a(g60 g60Var, List list) {
        g60Var.getClass();
        list.getClass();
        if (hm3.u(this.a)) {
            if (g60Var.a == 0) {
                this.c.invoke(list);
                return;
            }
            this.b.a();
            ye4.a.g("InAppPurchaseHandler", "Error getting purchases: " + g60Var.a);
        }
    }

    public void b(g60 g60Var, yy5 yy5Var) {
        g60Var.getClass();
        List list = yy5Var.a;
        if (hm3.u(this.a)) {
            ye4.a("InAppPurchaseHandler", "Product list loaded");
            if (g60Var.a == 0) {
                list.getClass();
                if (!list.isEmpty()) {
                    Object objM0 = lv0.m0(list);
                    objM0.getClass();
                    this.c.invoke(objM0);
                    return;
                }
            }
            ye4.a.g("InAppPurchaseHandler", "Error querying product details: " + g60Var.a);
            this.b.a();
        }
    }

    public /* synthetic */ ag3(gu0 gu0Var, Function1 function1, Function0 function0) {
        this.a = gu0Var;
        this.c = function1;
        this.b = function0;
    }
}
