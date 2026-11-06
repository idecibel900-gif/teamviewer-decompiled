package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class zi1 implements xc6 {
    public final uu4 a;
    public final ArrayList b = new ArrayList();

    public zi1(uu4 uu4Var) {
        this.a = uu4Var;
    }

    @Override // o.xc6
    public final void a(wc6 wc6Var) {
        this.b.add(wc6Var);
    }

    public cj3 b(nl5 nl5Var) {
        return new cj3((Object) new j93(nl5Var), (byte) 25);
    }
}
