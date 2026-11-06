package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class pn3 implements dp5 {
    public static final /* synthetic */ fw3[] e;
    public final ht2 a;
    public final s67 b;
    public final vd4 c;
    public final r76 d;

    static {
        x86 x86Var = w86.a;
        e = new fw3[]{x86Var.g(new gu5(x86Var.b(pn3.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public pn3(yc4 yc4Var, q76 q76Var, ht2 ht2Var) {
        yc4Var.getClass();
        io3 io3Var = (io3) yc4Var.m;
        ht2Var.getClass();
        this.a = ht2Var;
        this.b = q76Var != null ? d82.z(q76Var) : s67.h;
        this.c = new vd4(io3Var.a, new e3((byte) 9, yc4Var, this, false));
        this.d = q76Var != null ? (r76) lv0.n0(q76Var.b()) : null;
    }

    @Override // o.hp
    public final s67 c() {
        return this.b;
    }

    @Override // o.hp
    public final ht2 d() {
        return this.a;
    }

    @Override // o.hp
    public Map e() {
        return fa2.m;
    }

    @Override // o.hp
    public final oz3 getType() {
        return (g07) i67.s(this.c, e[0]);
    }
}
