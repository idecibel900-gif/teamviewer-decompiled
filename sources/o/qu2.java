package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qu2 implements pu2 {
    public final int a;
    public final boolean b;
    public final /* synthetic */ su2 c;

    /* JADX WARN: Multi-variable type inference failed */
    public qu2(su2 su2Var, int i, int i2) {
        this.c = su2Var;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.pu2
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        su2 su2Var = this.c;
        ut2 ut2Var = su2Var.A;
        int i = this.a;
        if (ut2Var == null || i >= 0 || !ut2Var.D().W(-1, 0)) {
            return su2Var.X(arrayList, arrayList2, i, this.b ? 1 : 0);
        }
        return false;
    }
}
