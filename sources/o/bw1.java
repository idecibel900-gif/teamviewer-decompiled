package o;

import android.content.SharedPreferences;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bw1 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ hz1 n;

    public /* synthetic */ bw1(hz1 hz1Var, byte b) {
        this.m = b;
        this.n = hz1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        int i = 0;
        f88 f88Var = f88.a;
        hz1 hz1Var = this.n;
        switch (b) {
            case 0:
                d37 d37Var = (d37) obj;
                d37Var.getClass();
                hz1Var.W0(d37Var);
                return f88Var;
            case 1:
                d37 d37Var2 = (d37) obj;
                d37Var2.getClass();
                hz1Var.W0(d37Var2);
                return f88Var;
            case 2:
                ((String) obj).getClass();
                im3.R(e8.n(hz1Var), null, null, new yy1(hz1Var, null, (byte) 0), 3);
                return f88Var;
            case 3:
                ov1 ov1Var = (ov1) obj;
                ov1Var.getClass();
                SharedPreferences sharedPreferences = hz1Var.p;
                sharedPreferences.getClass();
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.getClass();
                int iOrdinal = ov1Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        i = 2;
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                gk0.s();
                                return null;
                            }
                            i = 3;
                        }
                    } else {
                        i = 1;
                    }
                }
                editorEdit.putInt("KEY_SELECTED_DEVICE_TAB_CHIP", i);
                editorEdit.apply();
                l97 l97Var = hz1Var.t;
                l97Var.l(null, lr0.a((lr0) l97Var.getValue(), ov1Var));
                return f88Var;
            case 4:
                List list = (List) obj;
                list.getClass();
                l97 l97Var2 = hz1Var.v;
                ch2 ch2Var = (ch2) l97Var2.getValue();
                boolean z = !list.isEmpty();
                ch2Var.getClass();
                l97Var2.l(null, new ch2(z, list));
                return f88Var;
            default:
                d37 d37Var3 = (d37) obj;
                d37Var3.getClass();
                hz1Var.W0(d37Var3);
                return f88Var;
        }
    }
}
