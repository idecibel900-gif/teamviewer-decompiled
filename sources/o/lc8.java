package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lc8 extends yz3 implements Function1 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ mc8 f1351o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc8(mc8 mc8Var, byte b) {
        super(1);
        this.n = b;
        this.f1351o = mc8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        byte b = this.n;
        mc8 mc8Var = this.f1351o;
        switch (b) {
            case 0:
                o18 o18Var = (o18) obj;
                mb2 mb2Var = mb2.m;
                mb2 mb2Var2 = mb2.n;
                if (o18Var.c(mb2Var, mb2Var2)) {
                    t18 t18Var = mc8Var.B.a;
                    return wb2.c;
                }
                if (!o18Var.c(mb2Var2, mb2.f1456o)) {
                    return wb2.c;
                }
                t18 t18Var2 = mc8Var.C.a;
                return wb2.c;
            default:
                int iOrdinal = ((mb2) obj).ordinal();
                if (iOrdinal == 0) {
                    t18 t18Var3 = mc8Var.B.a;
                    j = rv0.g;
                } else if (iOrdinal == 1) {
                    t18 t18Var4 = mc8Var.B.a;
                    t18 t18Var5 = mc8Var.C.a;
                    j = rv0.g;
                } else {
                    if (iOrdinal != 2) {
                        gk0.s();
                        return null;
                    }
                    t18 t18Var6 = mc8Var.C.a;
                    j = mc8Var.D.e;
                }
                return new rv0(j);
        }
    }
}
