package o;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x23 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2472o;

    public /* synthetic */ x23(i34 i34Var, long j) {
        this.m = (byte) 1;
        this.f2472o = i34Var;
        this.n = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        long j = this.n;
        f88 f88Var = f88.a;
        Object obj2 = this.f2472o;
        switch (b) {
            case 0:
                ls1 ls1Var = (ls1) obj2;
                List<ns1> list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
                for (ns1 ns1VarA : list) {
                    if (ns1VarA.a == j) {
                        ns1VarA = ns1.a(ns1VarA, 0L, null, ls1Var, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194299);
                    }
                    arrayList.add(ns1VarA);
                }
                return arrayList;
            case 1:
                i34 i34Var = (i34) obj2;
                i34Var.d(vk3.b(((vk3) ((km) obj).d()).a, j));
                i34Var.c.a();
                return f88Var;
            default:
                u52.k0((u52) obj, this.n, 0L, ct1.u(((Number) ((Function0) obj2).a()).floatValue(), 0.0f, 1.0f), 118);
                return f88Var;
        }
    }

    public /* synthetic */ x23(byte b, long j, Object obj) {
        this.m = b;
        this.n = j;
        this.f2472o = obj;
    }
}
