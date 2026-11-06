package o;

import java.util.Collection;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class lp1 implements Function0 {
    public final /* synthetic */ byte m;
    public final np1 n;

    public /* synthetic */ lp1(np1 np1Var, byte b) {
        this.m = b;
        this.n = np1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        np1 np1Var = this.n;
        switch (b) {
            case 0:
                no1 no1Var = no1.m;
                zo4.a.getClass();
                return np1Var.i(no1Var, e24.s);
            default:
                uz3 uz3Var = np1Var.g;
                pp1 pp1Var = np1Var.j;
                uz3Var.getClass();
                pp1Var.getClass();
                Collection collectionB = ((d3) pp1Var.q()).b();
                collectionB.getClass();
                return collectionB;
        }
    }
}
