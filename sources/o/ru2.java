package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ru2 implements pu2 {
    public final /* synthetic */ su2 a;

    public ru2(su2 su2Var) {
        this.a = su2Var;
    }

    @Override // o.pu2
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zX;
        su2 su2Var = this.a;
        ArrayList arrayList3 = su2Var.f2054o;
        if (su2.M(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + su2Var.a);
        }
        if (su2Var.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zX = false;
        } else {
            w10 w10Var = (w10) ua5.j(1, su2Var.d);
            su2Var.h = w10Var;
            Iterator it = w10Var.a.iterator();
            while (it.hasNext()) {
                ut2 ut2Var = ((ev2) it.next()).b;
                if (ut2Var != null) {
                    ut2Var.y = true;
                }
            }
            zX = su2Var.X(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(su2.H((w10) it2.next()));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    io.sentry.h2.f();
                    return false;
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zX;
    }
}
