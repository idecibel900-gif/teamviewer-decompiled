package o;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b2 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Collection n;

    public /* synthetic */ b2(Collection collection, byte b) {
        this.m = b;
        this.n = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zContains;
        byte b = this.m;
        Collection<?> collection = this.n;
        switch (b) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
