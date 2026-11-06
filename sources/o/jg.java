package o;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jg implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ k76 n;

    public /* synthetic */ jg(k76 k76Var, byte b) {
        this.m = b;
        this.n = k76Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        boolean z = true;
        k76 k76Var = this.n;
        switch (b) {
            case 0:
                Class cls = AndroidComposeView.U0;
                k76Var.m = (br2) obj;
                return Boolean.TRUE;
            case 1:
                zy2 zy2Var = (zy2) obj;
                if (im3.n(zy2Var.N(), "waiting")) {
                    k76Var.m = zy2Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                i63 i63Var = (i63) obj;
                Object obj2 = k76Var.m;
                if (obj2 == null && i63Var.C) {
                    k76Var.m = i63Var;
                } else if (obj2 != null) {
                    i63Var.getClass();
                }
                return Boolean.TRUE;
            case 3:
                um1 um1Var = (l28) obj;
                if (((es4) um1Var).m.z) {
                    k76Var.m = um1Var;
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                l28 l28Var = (l28) obj;
                l28Var.getClass();
                x34 x34Var = ((n28) l28Var).A;
                List listN = (List) k76Var.m;
                if (listN != null) {
                    listN.add(x34Var);
                } else {
                    listN = qf0.N(x34Var);
                }
                k76Var.m = listN;
                return k28.n;
        }
    }
}
