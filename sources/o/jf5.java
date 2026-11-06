package o;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class jf5 extends xo1 {
    public final /* synthetic */ byte f;
    public final /* synthetic */ xo1 g;

    public /* synthetic */ jf5(xo1 xo1Var, byte b) {
        this.f = b;
        this.g = xo1Var;
    }

    @Override // o.xo1
    public final void E(fb6 fb6Var, Object obj) {
        byte b = this.f;
        xo1 xo1Var = this.g;
        switch (b) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        xo1Var.E(fb6Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        xo1Var.E(fb6Var, Array.get(obj, i));
                    }
                    break;
                }
                break;
        }
    }
}
