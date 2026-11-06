package o;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class x14 implements Function0 {
    public final /* synthetic */ byte m;
    public final y14 n;

    public /* synthetic */ x14(y14 y14Var, byte b) {
        this.m = b;
        this.n = y14Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() throws IllegalAccessException, InvocationTargetException {
        byte b = this.m;
        y14 y14Var = this.n;
        switch (b) {
            case 0:
                return p76.a(et1.z(et1.x(y14Var.b.a))).a();
            case 1:
                ht2 ht2VarD = y14Var.d();
                q76 q76Var = y14Var.b;
                yc4 yc4Var = y14Var.a;
                if (ht2VarD == null) {
                    return hd2.c(gd2.Q, q76Var.toString());
                }
                io3 io3Var = (io3) yc4Var.m;
                wy3 wy3Var = io3Var.h.p;
                wy3Var.getClass();
                String str = mo3.a;
                js0 js0VarF = mo3.f(ht2VarD);
                ns4 ns4VarI = js0VarF != null ? wy3Var.i(js0VarF.a()) : null;
                if (ns4VarI == null) {
                    a86 a86Var = new a86(et1.z(et1.x(q76Var.a)));
                    xk1 xk1Var = (xk1) io3Var.f.n;
                    if (xk1Var == null) {
                        im3.e0("resolver");
                        throw null;
                    }
                    ns4VarI = xk1Var.T(a86Var);
                    if (ns4VarI == null) {
                        qs4 qs4Var = io3Var.h;
                        ht2 ht2VarE = ht2VarD.e();
                        sy4 sy4VarF = ht2VarD.f();
                        sy4VarF.getClass();
                        ns4VarI = vs1.t(qs4Var, new js0(ht2VarE, sy4VarF), (j93) io3Var.d.c().l);
                    }
                }
                return ns4VarI.W();
            default:
                ArrayList<r76> arrayListB = y14Var.b.b();
                ArrayList arrayList = new ArrayList();
                for (r76 r76Var : arrayListB) {
                    sy4 sy4Var = r76Var.a;
                    if (sy4Var == null) {
                        sy4Var = tr3.b;
                    }
                    u51 u51VarA = y14Var.a(r76Var);
                    vd5 vd5Var = u51VarA != null ? new vd5(sy4Var, u51VarA) : null;
                    if (vd5Var != null) {
                        arrayList.add(vd5Var);
                    }
                }
                return xm4.U(arrayList);
        }
    }
}
