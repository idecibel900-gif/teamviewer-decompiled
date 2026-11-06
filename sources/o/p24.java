package o;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class p24 implements Function0 {
    public final /* synthetic */ byte m;
    public final s24 n;

    public /* synthetic */ p24(s24 s24Var, byte b) {
        this.m = b;
        this.n = s24Var;
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
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        s24 s24Var = this.n;
        switch (b) {
            case 0:
                no1 no1Var = no1.m;
                zo4.a.getClass();
                Function1 function1 = e24.s;
                no1Var.getClass();
                List list = no1Var.a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean zA = no1Var.a(no1.l);
                t35 t35Var = t35.p;
                if (zA) {
                    for (sy4 sy4Var : s24Var.h(no1Var, function1)) {
                        function1.invoke(sy4Var);
                        ys0 ys0VarG = s24Var.g(sy4Var, t35Var);
                        if (ys0VarG != null) {
                            linkedHashSet.add(ys0VarG);
                        }
                    }
                }
                if (no1Var.a(no1.i) && !list.contains(jo1.a)) {
                    for (sy4 sy4Var2 : s24Var.i(no1Var, function1)) {
                        function1.invoke(sy4Var2);
                        linkedHashSet.addAll(s24Var.a(sy4Var2, t35Var));
                    }
                }
                if (no1Var.a(no1.j) && !list.contains(jo1.a)) {
                    for (sy4 sy4Var3 : s24Var.o(no1Var)) {
                        function1.invoke(sy4Var3);
                        linkedHashSet.addAll(s24Var.d(sy4Var3, t35Var));
                    }
                }
                return lv0.P0(linkedHashSet);
            case 1:
                return s24Var.k();
            case 2:
                return s24Var.i(no1.p, null);
            case 3:
                return s24Var.o(no1.q);
            default:
                return s24Var.h(no1.f1583o, null);
        }
    }
}
