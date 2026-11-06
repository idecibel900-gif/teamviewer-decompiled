package o;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class f50 implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k08 b;

    public /* synthetic */ f50(k08 k08Var, byte b) {
        this.a = b;
        this.b = k08Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(nn5 nn5Var, hc1 hc1Var) {
        byte b = this.a;
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        k08 k08Var = this.b;
        switch (b) {
            case 0:
                Object objJ = hm3.j(new e50(nn5Var, k08Var, null, (byte) 0), hc1Var);
                return objJ == ne1Var ? objJ : f88Var;
            default:
                Object objJ2 = hm3.j(new e50(nn5Var, k08Var, null, (byte) 1), hc1Var);
                return objJ2 == ne1Var ? objJ2 : f88Var;
        }
    }
}
