package o;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fn extends yz3 implements iw2 {
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j57 f813o;
    public final /* synthetic */ pn p;
    public final /* synthetic */ yy0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(Object obj, j57 j57Var, pn pnVar, yy0 yy0Var) {
        super(3);
        this.n = obj;
        this.f813o = j57Var;
        this.p = pnVar;
        this.q = yy0Var;
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
    @Override // o.iw2
    public final Object d(Object obj, Object obj2, Object obj3) {
        bo boVar = (bo) obj;
        ux2 ux2Var = (ux2) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? ux2Var.f(boVar) : ux2Var.h(boVar) ? 4 : 2;
        }
        if (ux2Var.N(iIntValue & 1, (iIntValue & 19) != 18)) {
            j57 j57Var = this.f813o;
            boolean zF = ux2Var.f(j57Var);
            Object obj4 = this.n;
            boolean zH = zF | ux2Var.h(obj4);
            pn pnVar = this.p;
            boolean zH2 = zH | ux2Var.h(pnVar);
            Object objK = ux2Var.K();
            aw awVar = e01.a;
            if (zH2 || objK == awVar) {
                objK = new rb2(j57Var, obj4, pnVar, (byte) 2);
                ux2Var.g0(objK);
            }
            ck3.d(boVar, obj4, (Function1) objK, ux2Var);
            jx4 jx4Var = pnVar.c;
            boVar.getClass();
            jx4Var.m(obj4, ((co) boVar).a);
            Object objK2 = ux2Var.K();
            if (objK2 == awVar) {
                objK2 = new jn();
                ux2Var.g0(objK2);
            }
            this.q.i((jn) objK2, obj4, ux2Var, 0);
        } else {
            ux2Var.Q();
        }
        return f88.a;
    }
}
