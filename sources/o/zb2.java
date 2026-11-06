package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zb2 extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ac2 f2688o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zb2(ac2 ac2Var, byte b) {
        super(1);
        this.n = b;
        this.f2688o = ac2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rl2 rl2Var;
        rl2 rl2Var2;
        byte b = this.n;
        mb2 mb2Var = mb2.f1456o;
        mb2 mb2Var2 = mb2.n;
        mb2 mb2Var3 = mb2.m;
        ac2 ac2Var = this.f2688o;
        switch (b) {
            case 0:
                o18 o18Var = (o18) obj;
                boolean zC = o18Var.c(mb2Var3, mb2Var2);
                Object obj2 = null;
                if (zC) {
                    um0 um0Var = ac2Var.E.a.c;
                    if (um0Var != null) {
                        obj2 = um0Var.c;
                    }
                } else if (o18Var.c(mb2Var2, mb2Var)) {
                    um0 um0Var2 = ac2Var.F.a.c;
                    if (um0Var2 != null) {
                        obj2 = um0Var2.c;
                    }
                } else {
                    obj2 = wb2.e;
                }
                return obj2 == null ? wb2.e : obj2;
            default:
                o18 o18Var2 = (o18) obj;
                if (o18Var2.c(mb2Var3, mb2Var2)) {
                    f17 f17Var = ac2Var.E.a.b;
                    return (f17Var == null || (rl2Var2 = f17Var.b) == null) ? wb2.d : rl2Var2;
                }
                if (!o18Var2.c(mb2Var2, mb2Var)) {
                    return wb2.d;
                }
                f17 f17Var2 = ac2Var.F.a.b;
                return (f17Var2 == null || (rl2Var = f17Var2.b) == null) ? wb2.d : rl2Var;
        }
    }
}
