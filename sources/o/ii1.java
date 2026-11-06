package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ii1 extends gi1 implements hi1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fi1 f1064o;
    public final s67 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii1(fi1 fi1Var, up upVar, sy4 sy4Var, s67 s67Var) {
        super(upVar, sy4Var);
        if (fi1Var == null) {
            z(0);
            throw null;
        }
        if (upVar == null) {
            z(1);
            throw null;
        }
        if (sy4Var == null) {
            z(2);
            throw null;
        }
        if (s67Var == null) {
            z(3);
            throw null;
        }
        this.f1064o = fi1Var;
        this.p = s67Var;
    }

    public static /* synthetic */ void z(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // o.gi1, o.fi1
    /* JADX INFO: renamed from: C0 */
    public hi1 a() {
        return this;
    }

    public s67 c() {
        s67 s67Var = this.p;
        if (s67Var != null) {
            return s67Var;
        }
        z(6);
        throw null;
    }

    public fi1 i() {
        fi1 fi1Var = this.f1064o;
        if (fi1Var != null) {
            return fi1Var;
        }
        z(5);
        throw null;
    }
}
