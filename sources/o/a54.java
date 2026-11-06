package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class a54 implements Function0 {
    public final /* synthetic */ byte m;
    public final b54 n;

    public /* synthetic */ a54(b54 b54Var, byte b) {
        this.m = b;
        this.n = b54Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        b54 b54Var = this.n;
        switch (b) {
            case 0:
                qs4 qs4Var = b54Var.f397o;
                qs4Var.C0();
                l01 l01Var = (l01) qs4Var.w.getValue();
                ht2 ht2Var = b54Var.p;
                l01Var.getClass();
                ht2Var.getClass();
                ArrayList arrayList = new ArrayList();
                l01Var.b(ht2Var, arrayList);
                return arrayList;
            case 1:
                qs4 qs4Var2 = b54Var.f397o;
                qs4Var2.C0();
                return Boolean.valueOf(et1.E((l01) qs4Var2.w.getValue(), b54Var.p));
            default:
                vd4 vd4Var = b54Var.r;
                fw3[] fw3VarArr = b54.t;
                boolean zBooleanValue = ((Boolean) i67.s(vd4Var, fw3VarArr[1])).booleanValue();
                ht2 ht2Var2 = b54Var.p;
                qs4 qs4Var3 = b54Var.f397o;
                if (zBooleanValue) {
                    return yo4.b;
                }
                List list = (List) i67.s(b54Var.q, fw3VarArr[0]);
                ArrayList arrayList2 = new ArrayList(mv0.Z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ad5) it.next()).I());
                }
                return kh.p("package view scope for " + ht2Var2 + " in " + qs4Var3.getName(), lv0.B0(arrayList2, new pd7(qs4Var3, ht2Var2)));
        }
    }
}
