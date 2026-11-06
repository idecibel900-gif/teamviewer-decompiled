package o;

/* JADX INFO: loaded from: classes.dex */
public final class wq7 extends n37 {
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
        if (!(obj instanceof wq7)) {
            return false;
        }
        w50 w50Var = xz2.A;
        return w50Var.equals(w50Var) && w50Var.equals(w50Var);
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + e41.e(-1.0f, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        w50 w50Var = xz2.A;
        return "Cutout(isAlwaysMinimized=false, minimizedAlignment=" + w50Var + ", expandedAlignment=" + w50Var + ")";
    }
}
