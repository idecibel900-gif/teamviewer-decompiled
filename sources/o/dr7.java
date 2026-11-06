package o;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class dr7 implements PointerInputEventHandler {
    public final /* synthetic */ me1 a;
    public final /* synthetic */ px4 b;
    public final /* synthetic */ mw4 c;
    public final /* synthetic */ px4 d;

    public dr7(me1 me1Var, px4 px4Var, mw4 mw4Var, px4 px4Var2) {
        this.a = me1Var;
        this.b = px4Var;
        this.c = mw4Var;
        this.d = px4Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(nn5 nn5Var, hc1 hc1Var) {
        cr7 cr7Var = new cr7(this.a, this.b, this.c, null);
        ts6 ts6Var = new ts6(this.d, (byte) 6);
        m52 m52Var = un7.a;
        Object objJ = hm3.j(new aj(nn5Var, cr7Var, ts6Var, new wr5(nn5Var), null, (byte) 14), hc1Var);
        f88 f88Var = f88.a;
        ne1 ne1Var = ne1.m;
        if (objJ != ne1Var) {
            objJ = f88Var;
        }
        return objJ == ne1Var ? objJ : f88Var;
    }
}
