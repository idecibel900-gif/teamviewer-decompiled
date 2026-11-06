package o;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mg implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    public /* synthetic */ mg(w44 w44Var, int i) {
        this.m = (byte) 6;
        this.n = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        int i = this.n;
        switch (b) {
            case 0:
                Class cls = AndroidComposeView.U0;
                return Boolean.valueOf(((br2) obj).c1(i));
            case 1:
                Class cls2 = AndroidComposeView.U0;
                return Boolean.valueOf(((br2) obj).c1(i));
            case 2:
                return Boolean.valueOf(((br2) obj).c1(i));
            case 3:
                return Boolean.valueOf(((br2) obj).c1(i));
            case 4:
                return Boolean.valueOf(((br2) obj).U0(i));
            case 5:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    Integer num = ((ns1) obj2).d;
                    if (num == null || num.intValue() != i) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            default:
                v34 v34Var = (v34) obj;
                n47 n47VarC = el5.c();
                el5.h(n47VarC, el5.f(n47VarC), n47VarC != null ? n47VarC.e() : null);
                v34Var.getClass();
                return f88.a;
        }
    }

    public /* synthetic */ mg(int i, byte b) {
        this.m = b;
        this.n = i;
    }
}
