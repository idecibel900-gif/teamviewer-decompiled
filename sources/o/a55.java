package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class a55 implements Function1 {
    public final /* synthetic */ byte m;
    public final j93 n;

    public /* synthetic */ a55(j93 j93Var, byte b) {
        this.m = b;
        this.n = j93Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        j93 j93Var = this.n;
        switch (b) {
            case 0:
                ht2 ht2Var = (ht2) obj;
                ht2Var.getClass();
                return new ha2((ps4) j93Var.f1141o, ht2Var, (byte) 0);
            default:
                b55 b55Var = (b55) obj;
                b55Var.getClass();
                js0 js0Var = b55Var.a;
                List list = b55Var.b;
                if (js0Var.c) {
                    an4.u(js0Var, "Unresolved local class: ");
                    return null;
                }
                js0 js0VarE = js0Var.e();
                ps0 ps0VarP = js0VarE != null ? j93Var.P(js0VarE, lv0.j0(1, list)) : (ps0) ((sd4) j93Var.p).invoke(js0Var.a);
                boolean z = !js0Var.b.e().d();
                xd4 xd4Var = (xd4) j93Var.n;
                sy4 sy4VarF = js0Var.f();
                Integer num = (Integer) lv0.o0(list);
                return new c55(xd4Var, ps0VarP, sy4VarF, z, num != null ? num.intValue() : 0);
        }
    }
}
