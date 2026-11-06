package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gn6 implements jw2 {
    public final /* synthetic */ List m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f908o;
    public final /* synthetic */ iw2 p;
    public final /* synthetic */ Function1 q;
    public final /* synthetic */ int r;

    public gn6(List list, Object obj, Function1 function1, iw2 iw2Var, Function1 function2, int i) {
        this.m = list;
        this.n = obj;
        this.f908o = function1;
        this.p = iw2Var;
        this.q = function2;
        this.r = i;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.jw2
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        w14 w14Var = (w14) obj;
        int iIntValue = ((Number) obj2).intValue();
        ux2 ux2Var = (ux2) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (ux2Var.f(w14Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ux2Var.d(iIntValue) ? 32 : 16;
        }
        if (ux2Var.N(i & 1, (i & 147) != 146)) {
            Object obj5 = this.m.get(iIntValue);
            ux2Var.W(1858057108);
            boolean zN = im3.n(obj5, this.n);
            fs4 fs4VarJ = iq8.j(androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.b.c(cs4.b, 1.0f), "TVTA-devices-add-contact-bottom-sheet-group-item"), sf6.a(8.0f));
            pe6 pe6Var = new pe6(3);
            Function1 function1 = this.f908o;
            boolean zF = ux2Var.f(function1) | ux2Var.h(obj5);
            Object objK = ux2Var.K();
            if (zF || objK == e01.a) {
                objK = new cn6(function1, obj5, (byte) 1);
                ux2Var.g0(objK);
            }
            fs4 fs4VarC = ka0.C(g68.A(fs4VarJ, zN, pe6Var, (Function0) objK), 16.0f, 12.0f);
            dg6 dg6VarA = cg6.a(new ew(12.0f, new hk0((byte) 2)), xz2.y, ux2Var, 54);
            int iHashCode = Long.hashCode(ux2Var.T);
            yj5 yj5VarL = ux2Var.l();
            fs4 fs4VarS = uf0.s(ux2Var, fs4VarC);
            yz0.c.getClass();
            ux2Var.a0();
            if (ux2Var.S) {
                ux2Var.k(LayoutNode.e0);
            } else {
                ux2Var.j0();
            }
            o67.n(dg6VarA, d82.v, ux2Var);
            o67.n(yj5VarL, d82.u, ux2Var);
            o67.n(Integer.valueOf(iHashCode), d82.w, ux2Var);
            o67.l(ux2Var);
            o67.n(fs4VarS, d82.t, ux2Var);
            iw2 iw2Var = this.p;
            if (iw2Var == null) {
                ux2Var.W(-519422853);
            } else {
                ux2Var.W(-519422852);
                iw2Var.d(obj5, ux2Var, Integer.valueOf((this.r >> 3) & 8));
            }
            ux2Var.p(false);
            qs7.b((String) this.q.invoke(obj5), new s14(1.0f, true), 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((rn4) ux2Var.j(un4.a)).b.j, ux2Var, 0, 24960, 110588);
            bt1.j(zN, null, false, null, ux2Var, 48, 60);
            ux2Var.p(true);
            ux2Var.p(false);
        } else {
            ux2Var.Q();
        }
        return f88.a;
    }
}
