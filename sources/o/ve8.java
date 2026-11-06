package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ve8 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map mapV = xm4.V(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapV.values().iterator();
        while (it.hasNext()) {
            ((oe8) it.next()).S0();
        }
    }

    public final String toString() {
        String strF = w86.a.b(ve8.class).f();
        if (strF == null) {
            strF = "ViewModelStore";
        }
        int iHashCode = hashCode();
        qf0.s(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return strF + "@" + string + "(keys=" + lv0.T0(this.a.keySet()) + ")";
    }
}
