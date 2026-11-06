package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iu5 extends bj0 implements fw3 {
    private final boolean syntheticJavaProperty;

    public iu5(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // o.bj0
    public rt3 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iu5) {
            iu5 iu5Var = (iu5) obj;
            return getOwner().equals(iu5Var.getOwner()) && getName().equals(iu5Var.getName()) && getSignature().equals(iu5Var.getSignature()) && im3.n(getBoundReceiver(), iu5Var.getBoundReceiver());
        }
        if (obj instanceof fw3) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // o.bj0
    public fw3 getReflected() {
        if (this.syntheticJavaProperty) {
            yq4.r("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        rt3 rt3VarCompute = compute();
        if (rt3VarCompute != this) {
            return (fw3) rt3VarCompute;
        }
        throw new lz3();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public String toString() {
        rt3 rt3VarCompute = compute();
        if (rt3VarCompute != this) {
            return rt3VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public iu5() {
        super(bj0.NO_RECEIVER, null, null, null, false);
        this.syntheticJavaProperty = false;
    }
}
