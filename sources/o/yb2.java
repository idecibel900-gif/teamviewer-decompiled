package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yb2 extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v04 f2594o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yb2(v04 v04Var, long j, byte b) {
        super(1);
        this.n = b;
        this.f2594o = v04Var;
        this.p = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Function1 function2;
        Function1 function3;
        Function1 function4;
        int iOrdinal;
        byte b = this.n;
        long jB = 0;
        long j = this.p;
        v04 v04Var = this.f2594o;
        switch (b) {
            case 0:
                ac2 ac2Var = (ac2) v04Var;
                int iOrdinal2 = ((mb2) obj).ordinal();
                if (iOrdinal2 == 0) {
                    um0 um0Var = ac2Var.E.a.c;
                    if (um0Var != null && (function1 = um0Var.b) != null) {
                        j = ((dl3) function1.invoke(new dl3(j))).a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        gk0.s();
                        return null;
                    }
                    um0 um0Var2 = ac2Var.F.a.c;
                    if (um0Var2 != null && (function2 = um0Var2.b) != null) {
                        j = ((dl3) function2.invoke(new dl3(j))).a;
                    }
                }
                return new dl3(j);
            case 1:
                mb2 mb2Var = (mb2) obj;
                ac2 ac2Var2 = (ac2) v04Var;
                if (mb2Var == mb2.f1456o && ac2Var2.F.a.b == null) {
                    jB = ac2Var2.G.i;
                } else {
                    f17 f17Var = ac2Var2.E.a.b;
                    long j2 = (f17Var == null || (function4 = f17Var.a) == null) ? 0L : ((vk3) function4.invoke(new dl3(j))).a;
                    f17 f17Var2 = ac2Var2.F.a.b;
                    long j3 = (f17Var2 == null || (function3 = f17Var2.a) == null) ? 0L : ((vk3) function3.invoke(new dl3(j))).a;
                    int iOrdinal3 = mb2Var.ordinal();
                    if (iOrdinal3 == 0) {
                        jB = j2;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            gk0.s();
                            return null;
                        }
                        jB = j3;
                    }
                }
                return new vk3(jB);
            case 2:
                mb2 mb2Var2 = (mb2) obj;
                ac2 ac2Var3 = (ac2) v04Var;
                if (ac2Var3.K != null && ac2Var3.U0() != null && !im3.n(ac2Var3.K, ac2Var3.U0()) && (iOrdinal = mb2Var2.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        gk0.s();
                        return null;
                    }
                    um0 um0Var3 = ac2Var3.F.a.c;
                    if (um0Var3 != null) {
                        Function1 function5 = um0Var3.b;
                        long j4 = this.p;
                        long j5 = ((dl3) function5.invoke(new dl3(j4))).a;
                        he heVarU0 = ac2Var3.U0();
                        heVarU0.getClass();
                        j04 j04Var = j04.m;
                        long jA = heVarU0.a(j4, j5, j04Var);
                        he heVar = ac2Var3.K;
                        heVar.getClass();
                        jB = vk3.b(jA, heVar.a(j4, j5, j04Var));
                    }
                }
                return new vk3(jB);
            default:
                on onVar = (on) v04Var;
                if (im3.n(obj, onVar.C.b())) {
                    jB = dl3.b(onVar.J, -9223372034707292160L) ? j : onVar.J;
                } else {
                    i97 i97Var = (i97) onVar.C.c.g(obj);
                    if (i97Var != null) {
                        jB = ((dl3) i97Var.getValue()).a;
                    }
                }
                return new dl3(jB);
        }
    }
}
