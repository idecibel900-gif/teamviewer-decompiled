package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bx2 extends bj0 implements rw2, pu3 {
    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    public bx2(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.m = i;
    }

    @Override // o.bj0
    public final rt3 computeReflected() {
        return w86.a.a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bx2) {
            bx2 bx2Var = (bx2) obj;
            return getName().equals(bx2Var.getName()) && getSignature().equals(bx2Var.getSignature()) && im3.n(getBoundReceiver(), bx2Var.getBoundReceiver()) && im3.n(getOwner(), bx2Var.getOwner());
        }
        if (obj instanceof pu3) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // o.rw2
    public final int getArity() {
        return this.m;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        rt3 rt3VarCompute = compute();
        if (rt3VarCompute != this) {
            return rt3VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public bx2(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public bx2(int i) {
        this(i, bj0.NO_RECEIVER, null, null, null, 0);
    }
}
