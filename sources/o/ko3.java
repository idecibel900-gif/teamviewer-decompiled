package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ko3 extends pn3 {
    public static final /* synthetic */ fw3[] g;
    public final vd4 f;

    static {
        x86 x86Var = w86.a;
        g = new fw3[]{x86Var.g(new gu5(x86Var.b(ko3.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko3(q76 q76Var, yc4 yc4Var) {
        super(yc4Var, q76Var, s87.t);
        yc4Var.getClass();
        this.f = new vd4(((io3) yc4Var.m).a, new a3(this, (byte) 17));
    }

    @Override // o.pn3, o.hp
    public final Map e() {
        return (Map) i67.s(this.f, g[0]);
    }
}
