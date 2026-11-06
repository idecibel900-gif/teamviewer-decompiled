package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z91 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ qa1 n;

    public /* synthetic */ z91(qa1 qa1Var, byte b) {
        this.m = b;
        this.n = qa1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        Object value;
        ka1 ka1Var;
        Object value2;
        ka1 ka1Var2;
        Object value3;
        byte b = this.m;
        hc1 hc1Var = null;
        f88 f88Var = f88.a;
        qa1 qa1Var = this.n;
        switch (b) {
            case 0:
                l97 l97Var = qa1Var.r;
                do {
                    value = l97Var.getValue();
                    ka1Var = (ka1) value;
                } while (!l97Var.j(value, ka1.a(ka1Var, null, null, false, false, false, false, !ka1Var.g, false, null, null, 0, 0, false, null, false, null, false, false, 262079)));
                break;
            case 1:
                l97 l97Var2 = qa1Var.r;
                do {
                    value2 = l97Var2.getValue();
                    ka1Var2 = (ka1) value2;
                } while (!l97Var2.j(value2, ka1.a(ka1Var2, null, null, false, false, false, !ka1Var2.f, false, false, null, null, 0, 0, false, null, false, null, false, false, 262111)));
                break;
            case 2:
                h71 h71Var = ((ka1) qa1Var.r.getValue()).n;
                if (h71Var != null) {
                    qa1Var.W0();
                    im3.R(e8.n(qa1Var), qa1Var.q, null, new ff(h71Var, qa1Var, hc1Var, (byte) 4), 2);
                }
                break;
            case 3:
                qa1Var.W0();
                break;
            case 4:
                qa1Var.V0();
                break;
            default:
                Integer num = qa1Var.E;
                if (num != null) {
                    List list = qa1Var.u;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((h71) obj).m != num.intValue()) {
                            arrayList.add(obj);
                        }
                    }
                    qa1Var.u = arrayList;
                    List list2 = qa1Var.w;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (((h71) obj2).m != num.intValue()) {
                            arrayList2.add(obj2);
                        }
                    }
                    qa1Var.w = arrayList2;
                    qa1Var.E = null;
                    qa1Var.D = null;
                    qa1Var.B = null;
                    qa1Var.C = false;
                }
                l97 l97Var3 = qa1Var.r;
                do {
                    value3 = l97Var3.getValue();
                } while (!l97Var3.j(value3, ka1.a((ka1) value3, null, null, false, false, false, false, false, false, null, null, 0, 0, false, null, false, ea2.m, false, false, 16383)));
                if (num != null) {
                    qa1.b1(qa1Var, 7);
                }
                break;
        }
        return f88Var;
    }
}
