package o;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class px0 implements Comparator {
    public final /* synthetic */ Function1[] m;

    public /* synthetic */ px0(Function1[] function1Arr) {
        this.m = function1Arr;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        for (Function1 function1 : this.m) {
            int iQ = db8.q((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
            if (iQ != 0) {
                return iQ;
            }
        }
        return 0;
    }
}
