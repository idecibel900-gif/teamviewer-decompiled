package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class od1 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ j64 n;

    public /* synthetic */ od1(j64 j64Var, byte b) {
        this.m = b;
        this.n = j64Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        j64 j64Var = this.n;
        switch (b) {
            case 0:
                i04 i04Var = (i04) obj;
                ws7 ws7VarD = j64Var.d();
                if (ws7VarD != null) {
                    ws7VarD.c = i04Var;
                }
                return f88Var;
            case 1:
                bg5 bg5Var = j64Var.t;
                zr7 zr7Var = (zr7) obj;
                String str = zr7Var.a.n;
                xo xoVar = j64Var.j;
                if (!im3.n(str, xoVar != null ? xoVar.n : null)) {
                    j64Var.k.setValue(n43.m);
                    if (((Boolean) bg5Var.getValue()).booleanValue()) {
                        bg5Var.setValue(Boolean.FALSE);
                    } else {
                        j64Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = gt7.b;
                j64Var.f(j);
                j64Var.e(j);
                j64Var.u.invoke(zr7Var);
                j56 j56Var = j64Var.b;
                s01 s01Var = j56Var.a;
                if (s01Var != null) {
                    s01Var.s(j56Var, null);
                }
                return f88Var;
            case 2:
                j64Var.r.b(((af3) obj).a);
                return f88Var;
            case 3:
                return Boolean.valueOf(j64Var.r.b(((af3) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                j64Var.q.setValue(bool);
                return f88Var;
        }
    }
}
