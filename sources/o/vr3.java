package o;

import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class vr3 implements bs0 {
    public static final cr d;
    public static final /* synthetic */ fw3[] e;
    public static final ht2 f;
    public static final sy4 g;
    public static final js0 h;
    public final qs4 a;
    public final Function1 b;
    public final vd4 c;

    static {
        x86 x86Var = w86.a;
        e = new fw3[]{x86Var.g(new gu5(x86Var.b(vr3.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        d = new cr((byte) 21);
        f = t87.l;
        it2 it2Var = s87.c;
        sy4 sy4VarF = it2Var.f();
        sy4VarF.getClass();
        g = sy4VarF;
        ht2 ht2VarG = it2Var.g();
        ht2 ht2VarE = ht2VarG.e();
        sy4 sy4VarF2 = ht2VarG.f();
        sy4VarF2.getClass();
        h = new js0(ht2VarE, sy4VarF2);
    }

    public vr3(xd4 xd4Var, qs4 qs4Var) {
        ek ekVar = ek.M;
        this.a = qs4Var;
        this.b = ekVar;
        this.c = new vd4(xd4Var, new e3((Object) this, (Object) xd4Var, (byte) 10));
    }

    @Override // o.bs0
    public final Collection a(ht2 ht2Var) {
        ht2Var.getClass();
        if (!ht2Var.equals(f)) {
            return la2.m;
        }
        return lv1.V((cs0) i67.s(this.c, e[0]));
    }

    @Override // o.bs0
    public final boolean b(ht2 ht2Var, sy4 sy4Var) {
        ht2Var.getClass();
        sy4Var.getClass();
        return sy4Var.equals(g) && ht2Var.equals(f);
    }

    @Override // o.bs0
    public final ns4 c(js0 js0Var) {
        js0Var.getClass();
        if (!js0Var.equals(h)) {
            return null;
        }
        return (cs0) i67.s(this.c, e[0]);
    }
}
