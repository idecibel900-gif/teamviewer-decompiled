package o;

import androidx.lifecycle.LifecycleOwner;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class en implements q22 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ en(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // o.q22
    public final void a() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((j57) obj3).remove(obj2);
                ((pn) obj).c.k(obj2);
                break;
            case 1:
                ((LifecycleOwner) obj3).getR().f((q84) obj2);
                u10 u10Var = (u10) ((k76) obj).m;
                if (u10Var != null) {
                    u10Var.a();
                }
                break;
            default:
                lh6 lh6Var = (lh6) obj3;
                qh6 qh6Var = (qh6) obj;
                if (lh6Var.n.k(obj2) == qh6Var) {
                    Map map = lh6Var.m;
                    Map mapE = qh6Var.e();
                    if (!mapE.isEmpty()) {
                        map.put(obj2, mapE);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}
