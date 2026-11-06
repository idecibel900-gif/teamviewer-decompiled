package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ue5 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2205o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ue5(fs4 fs4Var, q37 q37Var, hw6 hw6Var, a06 a06Var, Function1 function1, iv6 iv6Var, px4 px4Var, px4 px4Var2) {
        this.m = (byte) 4;
        this.r = fs4Var;
        this.t = q37Var;
        this.u = hw6Var;
        this.n = a06Var;
        this.f2205o = function1;
        this.p = iv6Var;
        this.q = px4Var;
        this.s = px4Var2;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01c1  */
    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        qe5 qe5Var;
        byte b = this.m;
        int i = 1;
        f88 f88Var = f88.a;
        Object obj3 = this.s;
        Object obj4 = this.q;
        Object obj5 = this.p;
        Object obj6 = this.f2205o;
        Object obj7 = this.n;
        Object obj8 = this.u;
        Object obj9 = this.t;
        Object obj10 = this.r;
        switch (b) {
            case 0:
                re5[] re5VarArr = (re5[]) obj10;
                i76 i76Var = (i76) obj7;
                i76 i76Var2 = (i76) obj6;
                ArrayList arrayList = (ArrayList) obj3;
                i76 i76Var3 = (i76) obj5;
                i76 i76Var4 = (i76) obj4;
                int iIntValue = ((Integer) obj).intValue();
                yu7 yu7Var = (yu7) obj2;
                ce5 ce5VarA = ((cv7) obj9).a(yu7Var);
                ce5 ce5VarA2 = ((cv7) obj8).a(yu7Var);
                be5 be5Var = xz2.R;
                boolean zEquals = ce5VarA.equals(be5Var);
                boolean zEquals2 = ce5VarA2.equals(be5Var);
                if (!zEquals && !zEquals2) {
                    i = 3;
                } else if (zEquals && zEquals2) {
                    i = 0;
                } else if (zEquals || !zEquals2) {
                    if (!zEquals || zEquals2) {
                        i = 0;
                    } else {
                        i = 2;
                    }
                }
                re5VarArr[iIntValue] = new re5(i);
                if (i == 3) {
                    i76Var.m = Math.min(i76Var.m, iIntValue);
                    i76Var2.m = Math.max(i76Var2.m, iIntValue);
                    arrayList.set(iIntValue, yl7.H);
                } else if (i == 2) {
                    i76Var3.m = Math.min(i76Var3.m, iIntValue);
                    i76Var4.m = Math.max(i76Var4.m, iIntValue);
                }
                break;
            case 1:
                i76 i76Var5 = (i76) obj6;
                i76 i76Var6 = (i76) obj5;
                i76 i76Var7 = (i76) obj4;
                re5[] re5VarArr2 = (re5[]) obj10;
                ArrayList arrayList2 = (ArrayList) obj3;
                g76 g76Var = (g76) obj9;
                g76 g76Var2 = (g76) obj8;
                int iIntValue2 = ((Integer) obj).intValue();
                boolean z = ((i76) obj7).m < iIntValue2;
                boolean z2 = i76Var5.m > iIntValue2;
                boolean z3 = i76Var6.m < iIntValue2;
                boolean z4 = (z2 || (i76Var7.m > iIntValue2)) ? false : true;
                i = (z || z3) ? 0 : 1;
                if (re5VarArr2[iIntValue2].a == 2) {
                    if (z4 && !g76Var.m) {
                        qe5Var = yl7.J;
                    } else if (i != 0 && !g76Var2.m) {
                        qe5Var = yl7.I;
                    } else if (z4) {
                        qe5Var = yl7.L;
                    } else {
                        qe5Var = i != 0 ? yl7.K : yl7.O;
                    }
                    arrayList2.set(iIntValue2, qe5Var);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                lq1.g((SupportSession) obj10, (fs4) obj9, (xy6) obj8, (Function0) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (ux2) obj, yo1.Y(14155777));
                break;
            case 3:
                ((Integer) obj2).getClass();
                qs1.w((SupportSession) obj10, (it6) obj9, (List) obj8, (Function1) obj7, (Function1) obj6, (Function1) obj5, (Function1) obj4, (fs4) obj3, (ux2) obj, yo1.Y(12582913));
                break;
            default:
                fs4 fs4Var = (fs4) obj10;
                q37 q37Var = (q37) obj9;
                hw6 hw6Var = (hw6) obj8;
                a06 a06Var = (a06) obj7;
                Function1 function1 = (Function1) obj6;
                iv6 iv6Var = (iv6) obj5;
                i97 i97Var = (i97) obj4;
                i97 i97Var2 = (i97) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!ux2Var.N(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    Object objK = ux2Var.K();
                    byte b2 = 4;
                    if (objK == e01.a) {
                        objK = new vs6((byte) 4);
                        ux2Var.g0(objK);
                    }
                    nv1.g(au8.s(cp6.a(fs4Var, false, (Function1) objK), ((rn4) ux2Var.j(un4.a)).a.p, kh.V), null, null, au8.O(297293465, new l21(q37Var, b2), ux2Var), null, 0, 0L, 0L, null, au8.O(-336369040, new od4(hw6Var, a06Var, function1, iv6Var, i97Var, i97Var2, (byte) 3), ux2Var), ux2Var, 805309440, 502);
                }
                break;
        }
        return f88Var;
    }

    public /* synthetic */ ue5(SupportSession supportSession, Object obj, Object obj2, pw2 pw2Var, pw2 pw2Var2, pw2 pw2Var3, pw2 pw2Var4, Object obj3, int i, byte b) {
        this.m = b;
        this.r = supportSession;
        this.t = obj;
        this.u = obj2;
        this.n = pw2Var;
        this.f2205o = pw2Var2;
        this.p = pw2Var3;
        this.q = pw2Var4;
        this.s = obj3;
    }

    public /* synthetic */ ue5(i76 i76Var, i76 i76Var2, i76 i76Var3, i76 i76Var4, re5[] re5VarArr, ArrayList arrayList, g76 g76Var, g76 g76Var2) {
        this.m = (byte) 1;
        this.n = i76Var;
        this.f2205o = i76Var2;
        this.p = i76Var3;
        this.q = i76Var4;
        this.r = re5VarArr;
        this.s = arrayList;
        this.t = g76Var;
        this.u = g76Var2;
    }

    public /* synthetic */ ue5(re5[] re5VarArr, cv7 cv7Var, cv7 cv7Var2, i76 i76Var, i76 i76Var2, ArrayList arrayList, i76 i76Var3, i76 i76Var4) {
        this.m = (byte) 0;
        this.r = re5VarArr;
        this.t = cv7Var;
        this.u = cv7Var2;
        this.n = i76Var;
        this.f2205o = i76Var2;
        this.s = arrayList;
        this.p = i76Var3;
        this.q = i76Var4;
    }
}
