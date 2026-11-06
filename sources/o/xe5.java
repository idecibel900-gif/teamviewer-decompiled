package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xe5 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2511o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Serializable v;
    public final /* synthetic */ Serializable w;

    public /* synthetic */ xe5(List list, Function1 function1, Function1 function2, Function1 function3, hw2 hw2Var, fs4 fs4Var, Function1 function4, iw2 iw2Var, String str, String str2, int i) {
        this.n = list;
        this.f2511o = function1;
        this.p = function2;
        this.q = function3;
        this.r = hw2Var;
        this.s = fs4Var;
        this.t = function4;
        this.u = iw2Var;
        this.v = str;
        this.w = str2;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Serializable serializable = this.w;
        Serializable serializable2 = this.v;
        Object obj3 = this.u;
        Object obj4 = this.t;
        Object obj5 = this.s;
        Object obj6 = this.r;
        Object obj7 = this.q;
        Object obj8 = this.p;
        Object obj9 = this.f2511o;
        Object obj10 = this.n;
        switch (b) {
            case 0:
                i76 i76Var = (i76) obj9;
                i76 i76Var2 = (i76) obj8;
                i76 i76Var3 = (i76) obj7;
                re5[] re5VarArr = (re5[]) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                g76 g76Var = (g76) serializable2;
                i76 i76Var4 = (i76) obj6;
                g76 g76Var2 = (g76) serializable;
                i76 i76Var5 = (i76) obj5;
                int iIntValue = ((Integer) obj).intValue();
                qe5 qe5Var = yl7.M;
                qe5 qe5Var2 = yl7.N;
                boolean z = ((i76) obj10).m < iIntValue;
                boolean z2 = i76Var.m < iIntValue;
                boolean z3 = i76Var2.m > iIntValue;
                boolean z4 = i76Var3.m > iIntValue;
                if (re5VarArr[iIntValue].a == 1) {
                    if (z3 || z4) {
                        if (!z && !z2) {
                            g76Var2.m = true;
                            i76Var5.m = Math.max(i76Var5.m, iIntValue);
                        } else if (!z3) {
                            g76Var.m = true;
                            i76Var4.m = Math.min(i76Var4.m, iIntValue);
                        } else if (z) {
                            qe5Var = yl7.P;
                        } else {
                            g76Var2.m = true;
                            i76Var5.m = Math.max(i76Var5.m, iIntValue);
                        }
                        arrayList.set(iIntValue, qe5Var);
                    } else {
                        g76Var.m = true;
                        i76Var4.m = Math.min(i76Var4.m, iIntValue);
                    }
                    qe5Var = qe5Var2;
                    arrayList.set(iIntValue, qe5Var);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                vt1.i((List) obj10, (Function1) obj9, (Function1) obj8, (Function1) obj7, (hw2) obj6, (fs4) obj5, (Function1) obj4, (iw2) obj3, (String) serializable2, (String) serializable, (ux2) obj, yo1.Y(14183425));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ xe5(i76 i76Var, i76 i76Var2, i76 i76Var3, i76 i76Var4, re5[] re5VarArr, ArrayList arrayList, g76 g76Var, i76 i76Var5, g76 g76Var2, i76 i76Var6) {
        this.n = i76Var;
        this.f2511o = i76Var2;
        this.p = i76Var3;
        this.q = i76Var4;
        this.t = re5VarArr;
        this.u = arrayList;
        this.v = g76Var;
        this.r = i76Var5;
        this.w = g76Var2;
        this.s = i76Var6;
    }
}
