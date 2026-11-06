package o;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class gp1 implements up {
    public static final /* synthetic */ fw3[] n;
    public final vd4 m;

    static {
        x86 x86Var = w86.a;
        n = new fw3[]{x86Var.g(new gu5(x86Var.b(gp1.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public gp1(xd4 xd4Var, Function0 function0) {
        xd4Var.getClass();
        this.m = new vd4(xd4Var, function0);
    }

    @Override // o.up
    public boolean isEmpty() {
        n[0].getClass();
        return ((List) this.m.a()).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        n[0].getClass();
        return ((List) this.m.a()).iterator();
    }

    @Override // o.up
    public final boolean o0(ht2 ht2Var) {
        return kh.u(this, ht2Var);
    }

    @Override // o.up
    public final hp u(ht2 ht2Var) {
        return kh.r(this, ht2Var);
    }
}
