package o;

import java.util.HashSet;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l82 implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l82(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((Class) obj2).isInstance((x35) obj);
            case 1:
                return ((Boolean) ((qi4) obj2).invoke(obj)).booleanValue();
            default:
                return ((HashSet) obj2).add((o82) obj);
        }
    }
}
