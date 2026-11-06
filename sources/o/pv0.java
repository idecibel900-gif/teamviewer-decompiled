package o;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class pv0 extends ov0 {
    public static void a0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void b0(List list, Comparator comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
