package o;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bj5 extends cx2 implements Function0 {
    public final /* synthetic */ List n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ px4 f431o;
    public final /* synthetic */ px4 p;
    public final /* synthetic */ zi5 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj5(List list, px4 px4Var, px4 px4Var2, zi5 zi5Var) {
        super(0, hm3.class, "onDismiss", "PermissionRequestor$lambda$8$onDismiss(Ljava/util/List;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/teamviewer/arpermissionslib/ui/Permission;)V", 0);
        this.n = list;
        this.f431o = px4Var;
        this.p = px4Var2;
        this.q = zi5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        this.f431o.setValue(Boolean.FALSE);
        this.p.setValue(null);
        for (zi5 zi5Var : this.n) {
            if (im3.n(zi5Var.a, this.q.a)) {
                zi5Var.c.a();
                return f88.a;
            }
        }
        an4.j("Collection contains no element matching the predicate.");
        return null;
    }
}
