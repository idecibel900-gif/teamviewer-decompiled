package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qr5 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ rr5 f;

    public qr5(rr5 rr5Var, List list) {
        this.f = rr5Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            ni3.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
