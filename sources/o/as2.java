package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class as2 implements c71 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ as2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // o.c71
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                bs2 bs2Var = (bs2) obj;
                if (bs2Var == null) {
                    bs2Var = new bs2(-3);
                }
                ((cj3) this.b).S(bs2Var);
                return;
            case 1:
                bs2 bs2Var2 = (bs2) obj;
                synchronized (cs2.c) {
                    try {
                        a07 a07Var = cs2.d;
                        ArrayList arrayList = (ArrayList) a07Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        a07Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((c71) arrayList.get(i)).accept(bs2Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                yy5 yy5Var = new yy5(new ArrayList(), new ArrayList());
                ((ag3) this.b).b((g60) obj, yy5Var);
                return;
        }
    }
}
