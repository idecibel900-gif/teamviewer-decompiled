package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gi1 extends g2 implements fi1 {
    public final sy4 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi1(up upVar, sy4 sy4Var) {
        super(upVar);
        if (upVar == null) {
            z(0);
            throw null;
        }
        if (sy4Var == null) {
            z(1);
            throw null;
        }
        this.n = sy4Var;
    }

    public static String B0(fi1 fi1Var) {
        try {
            return qo1.e.v(fi1Var) + "[" + fi1Var.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(fi1Var)) + "]";
        } catch (Throwable unused) {
            return fi1Var.getClass().getSimpleName() + " " + fi1Var.getName();
        }
    }

    public static /* synthetic */ void z(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i != 2 && i != 3) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (i != 5 && i != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public fi1 a() {
        return this;
    }

    @Override // o.fi1
    public final sy4 getName() {
        sy4 sy4Var = this.n;
        if (sy4Var != null) {
            return sy4Var;
        }
        z(2);
        throw null;
    }

    public String toString() {
        return B0(this);
    }
}
