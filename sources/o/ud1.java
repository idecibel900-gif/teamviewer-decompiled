package o;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class ud1 implements PointerInputEventHandler {
    public final /* synthetic */ zp7 a;
    public final /* synthetic */ pr7 b;

    public ud1(zp7 zp7Var, pr7 pr7Var) {
        this.a = zp7Var;
        this.b = pr7Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(nn5 nn5Var, hc1 hc1Var) {
        Object objJ = hm3.j(new s11((Object) nn5Var, (Object) this.a, (Object) this.b, (hc1) null, (byte) 1), hc1Var);
        return objJ == ne1.m ? objJ : f88.a;
    }
}
