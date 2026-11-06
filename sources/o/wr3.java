package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class wr3 implements Function0 {
    public final /* synthetic */ byte m;
    public final qs4 n;

    public /* synthetic */ wr3(qs4 qs4Var, byte b) {
        this.m = b;
        this.n = qs4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        qs4 qs4Var = this.n;
        switch (b) {
            case 0:
                return new xr3(qs4Var);
            case 1:
                d22 d22Var = qs4Var.s;
                if (d22Var == null) {
                    String str = qs4Var.getName().m;
                    str.getClass();
                    hk0.p(str, " were not set before querying module content", "Dependencies of module ");
                    return null;
                }
                List list = d22Var.m;
                qs4Var.C0();
                list.contains(qs4Var);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((qs4) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    dd5 dd5Var = ((qs4) it2.next()).t;
                    dd5Var.getClass();
                    arrayList.add(dd5Var);
                }
                return new l01(arrayList, "CompositeProvider@ModuleDescriptor for " + qs4Var.getName());
            default:
                return qs4Var.y(t87.i).s;
        }
    }
}
