package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class er7 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ er7(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                hr7 hr7Var = (hr7) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                wf5 wf5Var = hr7Var.a;
                float fZ = wf5Var.z() + fFloatValue;
                wf5 wf5Var2 = hr7Var.b;
                if (fZ > wf5Var2.z()) {
                    fFloatValue = wf5Var2.z() - wf5Var.z();
                } else if (fZ < 0.0f) {
                    fFloatValue = -wf5Var.z();
                }
                wf5Var.A(wf5Var.z() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 1:
                bt7 bt7Var = (bt7) obj2;
                wo woVar = (wo) obj;
                to toVar = (to) woVar.a;
                if (toVar instanceof fa4) {
                    fa4 fa4Var = (fa4) toVar;
                    if (fa4Var.b == null) {
                        return wo.a(woVar, new fa4(fa4Var.a, bt7Var, fa4Var.c), 0, 14);
                    }
                }
                if (!(toVar instanceof ea4)) {
                    return woVar;
                }
                ea4 ea4Var = (ea4) toVar;
                return ea4Var.b == null ? wo.a(woVar, new ea4(ea4Var.a, bt7Var, ea4Var.c), 0, 14) : woVar;
            case 2:
                return Boolean.valueOf(im3.n((ce5) obj, (be5) obj2));
            case 3:
                h38 h38Var = (h38) obj2;
                rs0 rs0Var = (rs0) obj;
                rs0Var.getClass();
                rs0.a(rs0Var, "first", h38Var.a.d());
                rs0.a(rs0Var, "second", h38Var.b.d());
                rs0.a(rs0Var, "third", h38Var.c.d());
                return f88Var;
            default:
                h37 h37Var = (h37) obj;
                h37Var.getClass();
                vh8 vh8Var = ((th8) obj2).q0;
                hc1 hc1Var = null;
                if (vh8Var != null) {
                    im3.R(e8.n(vh8Var), null, null, new mf7(vh8Var, h37Var, hc1Var, (byte) 9), 3);
                    return f88Var;
                }
                im3.e0("viewModel");
                throw null;
        }
    }
}
