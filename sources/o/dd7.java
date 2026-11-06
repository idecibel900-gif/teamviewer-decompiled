package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo/dd7;", "Lo/ls4;", "Lo/ed7;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class dd7 extends ls4 {
    public final b42 b;

    public dd7(b42 b42Var) {
        this.b = b42Var;
    }

    @Override // o.ls4
    public final es4 create() {
        return new ed7(uf0.S, this.b);
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd7)) {
            return false;
        }
        dd7 dd7Var = (dd7) obj;
        yj yjVar = uf0.S;
        return yjVar.equals(yjVar) && im3.n(this.b, dd7Var.b);
    }

    public final int hashCode() {
        int iF = to7.f(1022 * 31, 31, false);
        b42 b42Var = this.b;
        return iF + (b42Var != null ? b42Var.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + uf0.S + ", overrideDescendants=false, touchBoundsExpansion=" + this.b + ")";
    }

    @Override // o.ls4
    public final void update(es4 es4Var) {
        ed7 ed7Var = (ed7) es4Var;
        yj yjVar = uf0.S;
        if (!im3.n(ed7Var.B, yjVar)) {
            ed7Var.B = yjVar;
            if (ed7Var.C) {
                ed7Var.W0();
            }
        }
        ed7Var.A = this.b;
    }
}
