package o;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class iu2 implements a8 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ su2 n;

    public /* synthetic */ iu2(su2 su2Var, byte b) {
        this.m = b;
        this.n = su2Var;
    }

    @Override // o.a8
    public final void a(Object obj) {
        byte b = this.m;
        su2 su2Var = this.n;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                nu2 nu2Var = (nu2) su2Var.G.pollFirst();
                if (nu2Var == null) {
                    io.sentry.android.core.v0.j("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = nu2Var.m;
                    if (su2Var.c.M(str) == null) {
                        io.sentry.android.core.v0.j("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            case 1:
                z7 z7Var = (z7) obj;
                nu2 nu2Var2 = (nu2) su2Var.G.pollLast();
                if (nu2Var2 == null) {
                    io.sentry.android.core.v0.j("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = nu2Var2.m;
                    int i2 = nu2Var2.n;
                    ut2 ut2VarM = su2Var.c.M(str2);
                    if (ut2VarM == null) {
                        io.sentry.android.core.v0.j("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        ut2VarM.T(i2, z7Var.m, z7Var.n);
                    }
                }
                break;
            default:
                z7 z7Var2 = (z7) obj;
                nu2 nu2Var3 = (nu2) su2Var.G.pollFirst();
                if (nu2Var3 == null) {
                    io.sentry.android.core.v0.j("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = nu2Var3.m;
                    int i3 = nu2Var3.n;
                    ut2 ut2VarM2 = su2Var.c.M(str3);
                    if (ut2VarM2 == null) {
                        io.sentry.android.core.v0.j("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        ut2VarM2.T(i3, z7Var2.m, z7Var2.n);
                    }
                }
                break;
        }
    }
}
