package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ep5 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ gp5 n;

    public /* synthetic */ ep5(gp5 gp5Var, byte b) {
        this.m = b;
        this.n = gp5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        final gp5 gp5Var = this.n;
        Object[] objArr = 0;
        final byte b2 = 1;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    ut7.a(au8.O(-1489906856, new ep5(gp5Var, b2), ux2Var), ux2Var, 48);
                }
                break;
            default:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    boolean zBooleanValue = ((Boolean) gp5Var.b.getValue()).booleanValue();
                    aw awVar = e01.a;
                    if (zBooleanValue) {
                        ux2Var2.W(-1623055453);
                        boolean zF = ux2Var2.f(gp5Var);
                        Object objK = ux2Var2.K();
                        if (zF || objK == awVar) {
                            final Object[] objArr2 = objArr == true ? 1 : 0;
                            objK = new Function0() { // from class: o.fp5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b3 = objArr2;
                                    f88 f88Var2 = f88.a;
                                    gp5 gp5Var2 = gp5Var;
                                    switch (b3) {
                                        case 0:
                                            gp5Var2.b.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            gp5Var2.a.setValue(Boolean.FALSE);
                                            break;
                                    }
                                    return f88Var2;
                                }
                            };
                            ux2Var2.g0(objK);
                        }
                        lv1.v(hp5.q, (Function0) objK, null, null, null, null, ux2Var2, 6, 60);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1622833462);
                        ux2Var2.p(false);
                    }
                    if (!((Boolean) gp5Var.a.getValue()).booleanValue()) {
                        ux2Var2.W(-1622549750);
                        ux2Var2.p(false);
                    } else {
                        ux2Var2.W(-1622777507);
                        boolean zF2 = ux2Var2.f(gp5Var);
                        Object objK2 = ux2Var2.K();
                        if (zF2 || objK2 == awVar) {
                            objK2 = new Function0() { // from class: o.fp5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object a() {
                                    byte b3 = b2;
                                    f88 f88Var2 = f88.a;
                                    gp5 gp5Var2 = gp5Var;
                                    switch (b3) {
                                        case 0:
                                            gp5Var2.b.setValue(Boolean.FALSE);
                                            break;
                                        default:
                                            gp5Var2.a.setValue(Boolean.FALSE);
                                            break;
                                    }
                                    return f88Var2;
                                }
                            };
                            ux2Var2.g0(objK2);
                        }
                        lv1.v(ip5.q, (Function0) objK2, null, null, null, null, ux2Var2, 6, 60);
                        ux2Var2.p(false);
                    }
                }
                break;
        }
        return f88Var;
    }
}
