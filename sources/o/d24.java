package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class d24 implements Function0 {
    public final /* synthetic */ byte m;
    public final g24 n;

    public /* synthetic */ d24(g24 g24Var, byte b) {
        this.m = b;
        this.n = g24Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        g24 g24Var = this.n;
        switch (b) {
            case 0:
                Class<?>[] declaredClasses = g24Var.f850o.a.getDeclaredClasses();
                declaredClasses.getClass();
                return lv0.T0(bq6.l0(bq6.k0(new fl2(cx.A0(declaredClasses), false, e24.A), e24.B)));
            case 1:
                List listB = g24Var.f850o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (((g86) obj).a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iQ = xm4.Q(mv0.Z(arrayList, 10));
                if (iQ < 16) {
                    iQ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((g86) obj2).c(), obj2);
                }
                return linkedHashMap;
            default:
                return fv6.a0(g24Var.b(), g24Var.f());
        }
    }
}
