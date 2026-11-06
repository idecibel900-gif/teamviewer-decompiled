package o;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class ex implements Iterable, su3 {
    public final /* synthetic */ byte m;
    public final Object n;

    public /* synthetic */ ex(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                return hm3.v((Object[]) obj);
            case 1:
                return new p62((Iterator) ((Function0) obj).a());
            case 2:
                return ((zp6) obj).iterator();
            default:
                return new j1((hc2) obj);
        }
    }
}
