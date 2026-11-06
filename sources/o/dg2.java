package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dg2 {
    public static final /* synthetic */ int b = 0;
    public final Map a;

    static {
        new dg2(0);
    }

    public dg2() {
        this.a = new HashMap();
    }

    public final void a(my2 my2Var) {
        this.a.put(new bg2(my2Var.d.m, my2Var.a), my2Var);
    }

    public dg2(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
