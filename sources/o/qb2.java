package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qb2 extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ bc2 f1818o;
    public final /* synthetic */ hf2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb2(bc2 bc2Var, hf2 hf2Var, byte b) {
        super(1);
        this.n = b;
        this.f1818o = bc2Var;
        this.p = hf2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rl2 rl2Var;
        rl2 rl2Var2;
        rl2 rl2Var3;
        rl2 rl2Var4;
        byte b = this.n;
        hf2 hf2Var = this.p;
        mb2 mb2Var = mb2.f1456o;
        bc2 bc2Var = this.f1818o;
        mb2 mb2Var2 = mb2.n;
        mb2 mb2Var3 = mb2.m;
        switch (b) {
            case 0:
                o18 o18Var = (o18) obj;
                if (o18Var.c(mb2Var3, mb2Var2)) {
                    ih2 ih2Var = bc2Var.a.a;
                    return (ih2Var == null || (rl2Var2 = ih2Var.b) == null) ? wb2.b : rl2Var2;
                }
                if (!o18Var.c(mb2Var2, mb2Var)) {
                    return wb2.b;
                }
                ih2 ih2Var2 = hf2Var.a.a;
                return (ih2Var2 == null || (rl2Var = ih2Var2.b) == null) ? wb2.b : rl2Var;
            default:
                o18 o18Var2 = (o18) obj;
                if (o18Var2.c(mb2Var3, mb2Var2)) {
                    pi6 pi6Var = bc2Var.a.d;
                    return (pi6Var == null || (rl2Var4 = pi6Var.c) == null) ? wb2.b : rl2Var4;
                }
                if (!o18Var2.c(mb2Var2, mb2Var)) {
                    return wb2.b;
                }
                pi6 pi6Var2 = hf2Var.a.d;
                return (pi6Var2 == null || (rl2Var3 = pi6Var2.c) == null) ? wb2.b : rl2Var3;
        }
    }
}
