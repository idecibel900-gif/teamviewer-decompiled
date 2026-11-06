package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jq2 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1192o;

    public /* synthetic */ jq2(k76 k76Var, int i) {
        this.m = (byte) 0;
        this.f1192o = k76Var;
        this.n = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zC1;
        ArrayList arrayList;
        byte b = this.m;
        Object obj2 = this.f1192o;
        int i = this.n;
        switch (b) {
            case 0:
                zC1 = ((br2) obj).c1(i);
                ((k76) obj2).m = Boolean.valueOf(zC1);
                break;
            case 1:
                ls1 ls1Var = (ls1) obj2;
                List<ns1> list = (List) obj;
                list.getClass();
                ArrayList arrayList2 = new ArrayList(mv0.Z(list, 10));
                for (ns1 ns1VarA : list) {
                    Integer num = ns1VarA.d;
                    if (num != null && num.intValue() == i) {
                        arrayList = arrayList2;
                        ns1VarA = ns1.a(ns1VarA, 0L, null, ls1Var, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194299);
                    } else {
                        arrayList = arrayList2;
                    }
                    arrayList.add(ns1VarA);
                    arrayList2 = arrayList;
                    i = i;
                }
                return arrayList2;
            default:
                zC1 = ((List) obj).addAll(i, (Collection) obj2);
                break;
        }
        return Boolean.valueOf(zC1);
    }

    public /* synthetic */ jq2(byte b, int i, Object obj) {
        this.m = b;
        this.n = i;
        this.f1192o = obj;
    }
}
