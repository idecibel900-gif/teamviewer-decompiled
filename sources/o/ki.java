package o;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ki implements PointerInputEventHandler {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ki(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(nn5 nn5Var, hc1 hc1Var) {
        byte b = this.a;
        byte b2 = 1;
        byte b3 = 5;
        hc1 hc1Var2 = null;
        Object obj = this.b;
        ne1 ne1Var = ne1.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                Object objN = it1.n(nn5Var, new ji((li) obj, hc1Var2, (byte) 0), hc1Var);
                return objN == ne1Var ? objN : f88Var;
            case 1:
                Object objD = un7.d(nn5Var, new or((Function0) obj, b3), hc1Var);
                return objD == ne1Var ? objD : f88Var;
            case 2:
                Object objU0 = ((vg7) nn5Var).U0(new c50((od1) obj, hc1Var2, b2), hc1Var);
                return objU0 == ne1Var ? objU0 : f88Var;
            case 3:
                Object objN2 = it1.n(nn5Var, new mo6((bd7) obj, null), hc1Var);
                return objN2 == ne1Var ? objN2 : f88Var;
            case 4:
                Object objN3 = it1.n(nn5Var, new ji(new nu6(1, (jp7) obj, jp7.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, (byte) 11), hc1Var2, b2), hc1Var);
                if (objN3 != ne1Var) {
                    objN3 = f88Var;
                }
                return objN3 == ne1Var ? objN3 : f88Var;
            case 5:
                pr7 pr7Var = (pr7) obj;
                io.sentry.android.core.n1 n1Var = pr7Var.A;
                nr7 nr7Var = pr7Var.z;
                vg7 vg7Var = (vg7) nn5Var;
                vg7Var.getClass();
                Object objN4 = it1.n(nn5Var, new mo6(new ae(vn4.p0(vg7Var).N), n1Var, nr7Var, null), hc1Var);
                if (objN4 != ne1Var) {
                    objN4 = f88Var;
                }
                return objN4 == ne1Var ? objN4 : f88Var;
            default:
                Object objJ = hm3.j(new k9(nn5Var, (zp7) obj, hc1Var2, b3), hc1Var);
                if (objJ != ne1Var) {
                    objJ = f88Var;
                }
                return objJ == ne1Var ? objJ : f88Var;
        }
    }
}
