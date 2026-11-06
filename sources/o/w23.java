package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w23 implements Function1 {
    public final /* synthetic */ long m;
    public final /* synthetic */ boolean n;

    public /* synthetic */ w23(long j, boolean z) {
        this.m = j;
        this.n = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<ns1> list = (List) obj;
        list.getClass();
        ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
        for (ns1 ns1VarA : list) {
            if (ns1VarA.a == this.m) {
                ns1VarA = ns1.a(ns1VarA, 0L, null, null, null, null, this.n, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194239);
            }
            arrayList.add(ns1VarA);
        }
        return arrayList;
    }
}
