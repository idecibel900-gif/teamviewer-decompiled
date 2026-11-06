package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sw1 implements iw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f2063o;
    public final /* synthetic */ List p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ sw1(ArrayList arrayList, List list, Function0 function0, Function0 function1, Function1 function2, l33 l33Var, fs4 fs4Var, px4 px4Var, boolean z) {
        this.r = px4Var;
        this.n = z;
        this.s = l33Var;
        this.f2063o = function0;
        this.t = function1;
        this.u = fs4Var;
        this.v = arrayList;
        this.p = list;
        this.q = function2;
    }

    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        byte b = this.m;
        f88 f88Var = f88.a;
        byte b2 = 18;
        Object obj4 = this.v;
        Object obj5 = this.u;
        Object obj6 = this.t;
        Object obj7 = this.s;
        Object obj8 = this.r;
        switch (b) {
            case 0:
                lr0 lr0Var = (lr0) obj8;
                final Function1 function1 = (Function1) obj7;
                final fx1 fx1Var = (fx1) obj6;
                final i97 i97Var = (i97) obj5;
                final i97 i97Var2 = (i97) obj4;
                xu7 xu7Var = (xu7) obj;
                ux2 ux2Var = (ux2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                xu7Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ux2Var.f(xu7Var) : ux2Var.h(xu7Var) ? 4 : 2;
                }
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ux2Var.Q();
                } else if (lr0Var.b == ov1.m) {
                    final List list = this.p;
                    final boolean z = this.n;
                    final Function0 function0 = this.f2063o;
                    final Function1 function2 = this.q;
                    ne5.a(xu7Var, null, null, null, null, au8.O(1127723192, new iw2() { // from class: o.ow1
                        @Override // o.iw2
                        public final Object d(Object obj9, Object obj10, Object obj11) {
                            ux2 ux2Var2 = (ux2) obj10;
                            int iIntValue2 = ((Integer) obj11).intValue();
                            ((tn) obj9).getClass();
                            if (ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                gw1 gw1Var = (gw1) i97Var.getValue();
                                xv1 xv1Var = (xv1) i97Var2.getValue();
                                fx1 fx1Var2 = fx1Var;
                                boolean zH = ux2Var2.h(fx1Var2);
                                Object objK = ux2Var2.K();
                                aw awVar = e01.a;
                                if (zH || objK == awVar) {
                                    objK = new ax1(0, fx1Var2, fx1.class, "toggleEdit", "toggleEdit()V", 0, (byte) 1);
                                    ux2Var2.g0(objK);
                                }
                                Function0 function3 = (Function0) ((pu3) objK);
                                boolean zH2 = ux2Var2.h(fx1Var2);
                                Object objK2 = ux2Var2.K();
                                if (zH2 || objK2 == awVar) {
                                    ew1 ew1Var = new ew1(1, fx1Var2, fx1.class, "updateIsSaveEnable", "updateIsSaveEnable(Z)V", 0, (byte) 8);
                                    ux2Var2.g0(ew1Var);
                                    objK2 = ew1Var;
                                }
                                Function1 function4 = (Function1) ((pu3) objK2);
                                boolean zH3 = ux2Var2.h(fx1Var2);
                                Object objK3 = ux2Var2.K();
                                if (zH3 || objK3 == awVar) {
                                    ew1 ew1Var2 = new ew1(1, fx1Var2, fx1.class, "updateIsSaving", "updateIsSaving(Z)V", 0, (byte) 9);
                                    ux2Var2.g0(ew1Var2);
                                    objK3 = ew1Var2;
                                }
                                Function1 function5 = (Function1) ((pu3) objK3);
                                boolean zH4 = ux2Var2.h(fx1Var2);
                                Object objK4 = ux2Var2.K();
                                if (zH4 || objK4 == awVar) {
                                    ew1 ew1Var3 = new ew1(1, fx1Var2, fx1.class, "updateIsErrorStateActive", "updateIsErrorStateActive(Z)V", 0, (byte) 10);
                                    ux2Var2.g0(ew1Var3);
                                    objK4 = ew1Var3;
                                }
                                wo1.c(gw1Var, xv1Var, list, z, function0, function2, function1, function3, function4, function5, (Function1) ((pu3) objK4), null, ux2Var2, 0);
                            } else {
                                ux2Var2.Q();
                            }
                            return f88.a;
                        }
                    }, ux2Var), ux2Var, (iIntValue & 14) | 1572864);
                }
                break;
            default:
                final px4 px4Var = (px4) obj8;
                final l33 l33Var = (l33) obj7;
                final Function0 function3 = (Function0) obj6;
                final fs4 fs4Var = (fs4) obj5;
                final ArrayList arrayList = (ArrayList) obj4;
                ux2 ux2Var2 = (ux2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((lw0) obj).getClass();
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ux2Var2.Q();
                } else {
                    Object value = px4Var.getValue();
                    Object objK = ux2Var2.K();
                    if (objK == e01.a) {
                        objK = new ji2(b2);
                        ux2Var2.g0(objK);
                    }
                    final List list2 = this.p;
                    final Function0 function4 = this.f2063o;
                    final Function1 function5 = this.q;
                    final boolean z2 = this.n;
                    im3.a(value, null, (Function1) objK, null, "GroupsBottomSheetContent", null, au8.O(-41633153, new jw2() { // from class: o.x33
                        @Override // o.jw2
                        public final Object i(Object obj9, Object obj10, Object obj11, Object obj12) {
                            y33 y33Var = (y33) obj10;
                            ux2 ux2Var3 = (ux2) obj11;
                            int iIntValue3 = ((Integer) obj12).intValue();
                            ((jn) obj9).getClass();
                            y33Var.getClass();
                            if ((iIntValue3 & 48) == 0) {
                                iIntValue3 |= ux2Var3.d(y33Var.ordinal()) ? 32 : 16;
                            }
                            if (ux2Var3.N(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                int iOrdinal = y33Var.ordinal();
                                l33 l33Var2 = l33Var;
                                Function0 function6 = function3;
                                if (iOrdinal != 0) {
                                    ArrayList arrayList2 = arrayList;
                                    Function1 function7 = function5;
                                    if (iOrdinal == 1 || iOrdinal == 2) {
                                        ux2Var3.W(953676695);
                                        iq8.a(l33Var2, arrayList2, list2, function6, function7, null, y33Var == y33.n ? 0 : 1, null, ux2Var3, 0);
                                        ux2Var3.p(false);
                                    } else {
                                        if (iOrdinal != 3) {
                                            throw fx3.m(-1354751078, ux2Var3, false);
                                        }
                                        ux2Var3.W(954393756);
                                        pm8.a(arrayList2, function6, function7, null, l33Var2, null, null, ux2Var3, 0, 104);
                                        ux2Var3.p(false);
                                    }
                                } else {
                                    ux2Var3.W(952418839);
                                    px4 px4Var2 = px4Var;
                                    boolean zF = ux2Var3.f(px4Var2) | ux2Var3.h(l33Var2);
                                    Object objK2 = ux2Var3.K();
                                    aw awVar = e01.a;
                                    if (zF || objK2 == awVar) {
                                        objK2 = new ql1(px4Var2, l33Var2, (byte) 10);
                                        ux2Var3.g0(objK2);
                                    }
                                    Function0 function8 = (Function0) objK2;
                                    boolean zF2 = ux2Var3.f(px4Var2);
                                    Object objK3 = ux2Var3.K();
                                    if (zF2 || objK3 == awVar) {
                                        objK3 = new la(px4Var2, (byte) 25);
                                        ux2Var3.g0(objK3);
                                    }
                                    lv1.e(z2, function8, function4, (Function0) objK3, function6, androidx.compose.foundation.layout.b.c(ka0.F(fs4Var, 16.0f, 0.0f, 16.0f, 16.0f, 2), 1.0f), ux2Var3, 0);
                                    ux2Var3.p(false);
                                }
                            } else {
                                ux2Var3.Q();
                            }
                            return f88.a;
                        }
                    }, ux2Var2), ux2Var2, 1597824);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ sw1(lr0 lr0Var, List list, boolean z, Function0 function0, Function1 function1, Function1 function2, fx1 fx1Var, px4 px4Var, px4 px4Var2) {
        this.r = lr0Var;
        this.p = list;
        this.n = z;
        this.f2063o = function0;
        this.q = function1;
        this.s = function2;
        this.t = fx1Var;
        this.u = px4Var;
        this.v = px4Var2;
    }
}
