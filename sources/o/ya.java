package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ya implements jw2 {
    public final /* synthetic */ byte m = 0;
    public final /* synthetic */ l33 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f2592o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ List r;

    public /* synthetic */ ya(ib ibVar, hb hbVar, l33 l33Var, List list, Function0 function0) {
        this.p = ibVar;
        this.q = hbVar;
        this.n = l33Var;
        this.r = list;
        this.f2592o = function0;
    }

    @Override // o.jw2
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.m;
        f88 f88Var = f88.a;
        byte b2 = 4;
        aw awVar = e01.a;
        Object obj5 = this.q;
        Object obj6 = this.p;
        switch (b) {
            case 0:
                ib ibVar = (ib) obj6;
                hb hbVar = (hb) obj5;
                ea0 ea0Var = (ea0) obj2;
                ux2 ux2Var = (ux2) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((jn) obj).getClass();
                ea0Var.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= ux2Var.d(ea0Var.ordinal()) ? 32 : 16;
                }
                if (ux2Var.N(iIntValue & 1, (iIntValue & 145) != 144)) {
                    int iOrdinal = ea0Var.ordinal();
                    List list = this.r;
                    if (iOrdinal == 0) {
                        ux2Var.W(358441404);
                        au8.b(ibVar, hbVar, this.n, list.isEmpty(), this.f2592o, null, ux2Var, 0);
                        ux2Var.p(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw fx3.m(150108632, ux2Var, false);
                        }
                        ux2Var.W(358975410);
                        List list2 = ibVar.e;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            UUID uuidB = bt1.B((l33) it.next());
                            if (uuidB != null) {
                                arrayList.add(uuidB);
                            }
                        }
                        Set setT0 = lv0.T0(arrayList);
                        fs4 fs4VarF = ka0.F(cs4.b, 16.0f, 24.0f, 16.0f, 0.0f, 8);
                        boolean zH = ux2Var.h(hbVar) | ux2Var.h(list);
                        Object objK = ux2Var.K();
                        if (zH || objK == awVar) {
                            objK = new g0(hbVar, list, b2);
                            ux2Var.g0(objK);
                        }
                        Function1 function1 = (Function1) objK;
                        boolean zH2 = ux2Var.h(hbVar);
                        Object objK2 = ux2Var.K();
                        if (zH2 || objK2 == awVar) {
                            objK2 = new ab(hbVar, (byte) 0);
                            ux2Var.g0(objK2);
                        }
                        jx0.c(list, setT0, function1, (Function0) objK2, fs4VarF, "TVTA-devices-add-remote-device-to-your-account-bottom-sheet-group-selector", ux2Var, 196608);
                        ux2Var.p(false);
                    }
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            default:
                ob obVar = (ob) obj6;
                ja jaVar = (ja) obj5;
                ArrayList arrayList2 = (ArrayList) this.r;
                ea0 ea0Var2 = (ea0) obj2;
                ux2 ux2Var2 = (ux2) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((jn) obj).getClass();
                ea0Var2.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ux2Var2.d(ea0Var2.ordinal()) ? 32 : 16;
                }
                if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    int iOrdinal2 = ea0Var2.ordinal();
                    if (iOrdinal2 == 0) {
                        ux2Var2.W(-1479617842);
                        kh.b(obVar, jaVar, this.n, this.f2592o, null, ux2Var2, 0);
                        ux2Var2.p(false);
                    } else {
                        if (iOrdinal2 != 1) {
                            throw fx3.m(-186278569, ux2Var2, false);
                        }
                        ux2Var2.W(-1479195250);
                        l33 l33Var = obVar.c;
                        boolean zH3 = ux2Var2.h(jaVar);
                        Object objK3 = ux2Var2.K();
                        if (zH3 || objK3 == awVar) {
                            objK3 = new q0(jaVar, (byte) 4);
                            ux2Var2.g0(objK3);
                        }
                        jx0.d(arrayList2, l33Var, (Function1) objK3, ka0.F(cs4.b, 16.0f, 16.0f, 16.0f, 0.0f, 8), 0L, ux2Var2, 0);
                        ux2Var2.p(false);
                    }
                } else {
                    ux2Var2.Q();
                }
                return f88Var;
        }
    }

    public /* synthetic */ ya(ob obVar, ja jaVar, l33 l33Var, Function0 function0, ArrayList arrayList) {
        this.p = obVar;
        this.q = jaVar;
        this.n = l33Var;
        this.f2592o = function0;
        this.r = arrayList;
    }
}
