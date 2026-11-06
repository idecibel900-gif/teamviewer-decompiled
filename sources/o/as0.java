package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class as0 extends d0 {
    public final fi1 q;
    public final s67 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as0(xd4 xd4Var, fi1 fi1Var, sy4 sy4Var, s67 s67Var) {
        super(xd4Var, sy4Var);
        if (xd4Var == null) {
            A0(0);
            throw null;
        }
        if (fi1Var == null) {
            A0(1);
            throw null;
        }
        if (sy4Var == null) {
            A0(2);
            throw null;
        }
        this.q = fi1Var;
        this.r = s67Var;
    }

    public static /* synthetic */ void A0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // o.hi1
    public final s67 c() {
        s67 s67Var = this.r;
        if (s67Var != null) {
            return s67Var;
        }
        A0(5);
        throw null;
    }

    @Override // o.fi1
    public final fi1 i() {
        fi1 fi1Var = this.q;
        if (fi1Var != null) {
            return fi1Var;
        }
        A0(4);
        throw null;
    }

    @Override // o.qo4
    public boolean p() {
        return false;
    }
}
