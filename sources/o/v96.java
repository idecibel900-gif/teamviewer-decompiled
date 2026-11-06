package o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v96 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ a65 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a65 f2290o;

    public /* synthetic */ v96(a65 a65Var, a65 a65Var2, byte b) {
        this.m = b;
        this.n = a65Var;
        this.f2290o = a65Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        a65 a65Var = this.f2290o;
        a65 a65Var2 = this.n;
        byte b2 = 1;
        List list = (List) obj;
        switch (b) {
            case 0:
                a65 a65VarB = vt1.B(new u96(a65Var2, a65Var, b2), new v96(a65Var2, a65Var, b2));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Map.Entry entry = (Map.Entry) ((Function1) a65VarB.f302o).invoke(list.get(i));
                    entry.getClass();
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                return linkedHashMap;
            default:
                Object obj2 = list.get(0);
                obj2.getClass();
                Object objInvoke = ((Function1) a65Var2.f302o).invoke(obj2);
                Object obj3 = list.get(1);
                obj3.getClass();
                return new lm4(objInvoke, ((Function1) a65Var.f302o).invoke(obj3));
        }
    }
}
