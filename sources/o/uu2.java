package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class uu2 extends oe8 {
    public static final cm1 t = new cm1((byte) 1);
    public final boolean q;
    public final HashMap n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap f2249o = new HashMap();
    public final HashMap p = new HashMap();
    public boolean r = false;
    public boolean s = false;

    public uu2(boolean z) {
        this.q = z;
    }

    @Override // o.oe8
    public final void U0() {
        if (su2.M(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.r = true;
    }

    public final void V0(ut2 ut2Var) {
        if (this.s) {
            if (su2.M(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = ut2Var.q;
        HashMap map = this.n;
        if (map.containsKey(str)) {
            return;
        }
        map.put(ut2Var.q, ut2Var);
        if (su2.M(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + ut2Var);
        }
    }

    public final void W0(String str, boolean z) {
        if (su2.M(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        Y0(str, z);
    }

    public final void X0(ut2 ut2Var, boolean z) {
        if (su2.M(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + ut2Var);
        }
        Y0(ut2Var.q, z);
    }

    public final void Y0(String str, boolean z) {
        HashMap map = this.f2249o;
        uu2 uu2Var = (uu2) map.get(str);
        if (uu2Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(uu2Var.f2249o.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    uu2Var.W0((String) it.next(), true);
                }
            }
            uu2Var.U0();
            map.remove(str);
        }
        HashMap map2 = this.p;
        ve8 ve8Var = (ve8) map2.get(str);
        if (ve8Var != null) {
            ve8Var.a();
            map2.remove(str);
        }
    }

    public final void Z0(ut2 ut2Var) {
        if (this.s) {
            if (su2.M(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.n.remove(ut2Var.q) == null || !su2.M(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + ut2Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uu2.class != obj.getClass()) {
            return false;
        }
        uu2 uu2Var = (uu2) obj;
        return this.n.equals(uu2Var.n) && this.f2249o.equals(uu2Var.f2249o) && this.p.equals(uu2Var.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + ((this.f2249o.hashCode() + (this.n.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f2249o.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.p.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
