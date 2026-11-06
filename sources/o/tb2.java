package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class tb2 extends yz3 implements Function0 {
    public final /* synthetic */ byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ dy6 f2097o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb2(dy6 dy6Var, byte b) {
        super(0);
        this.n = b;
        this.f2097o = dy6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.n;
        dy6 dy6Var = this.f2097o;
        switch (b) {
            case 0:
                return dy6Var;
            default:
                bg5 bg5Var = dy6Var.b;
                Boolean bool = Boolean.FALSE;
                bg5Var.setValue(bool);
                dy6Var.c(false);
                cg3 cg3Var = dy6Var.c;
                ((bg5) cg3Var.a).setValue(bool);
                ((bg5) cg3Var.c).setValue(bool);
                ((bg5) cg3Var.e).setValue(bool);
                ((bg5) cg3Var.g).setValue(bool);
                dy6Var.e = rv0.g;
                dy6Var.f = 1.0f;
                dy6Var.g = 1.0f;
                pc8 pc8Var = dy6Var.j;
                if (pc8Var != null) {
                    yg1[] yg1VarArr = pc8Var.d;
                    cx.N0(0, yg1VarArr.length, null, yg1VarArr);
                    pc8Var.e = 0;
                }
                dy6Var.h = d18.b;
                dy6Var.i = 0L;
                return f88.a;
        }
    }
}
