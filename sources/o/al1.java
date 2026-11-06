package o;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class al1 implements PointerInputEventHandler {
    public static final al1 b = new al1(0);
    public static final al1 c = new al1(1);
    public static final al1 d = new al1(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ al1(byte b2) {
        this.a = b2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(nn5 nn5Var, hc1 hc1Var) {
        byte b2 = this.a;
        f88 f88Var = f88.a;
        switch (b2) {
            case 0:
                return f88Var;
            case 1:
                Object objD = un7.d(nn5Var, new le5((byte) 19), hc1Var);
                return objD == ne1.m ? objD : f88Var;
            default:
                return f88Var;
        }
    }
}
