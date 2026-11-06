package o;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f3 extends d3 {
    public final jk0 c;
    public final /* synthetic */ g3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(g3 g3Var, xd4 xd4Var) {
        super(xd4Var);
        jk0 jk0Var = jk0.O;
        if (xd4Var == null) {
            l(0);
            throw null;
        }
        this.d = g3Var;
        this.c = jk0Var;
    }

    public static /* synthetic */ void l(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case ep1.b /* 9 */:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i == 2) {
            objArr[1] = "getParameters";
        } else if (i == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case ep1.b /* 9 */:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // o.k48
    public final ys0 a() {
        return this.d;
    }

    @Override // o.k48
    public final boolean c() {
        return true;
    }

    @Override // o.d3
    public final Collection e() {
        List listE0 = this.d.E0();
        if (listE0 != null) {
            return listE0;
        }
        l(1);
        throw null;
    }

    @Override // o.d3
    public final jk0 g() {
        jk0 jk0Var = this.c;
        if (jk0Var != null) {
            return jk0Var;
        }
        l(5);
        throw null;
    }

    @Override // o.k48
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        l(2);
        throw null;
    }

    @Override // o.k48
    public final wy3 h() {
        wy3 wy3VarE = bp1.e(this.d);
        if (wy3VarE != null) {
            return wy3VarE;
        }
        l(4);
        throw null;
    }

    @Override // o.d3
    public final boolean j(ys0 ys0Var) {
        if (!(ys0Var instanceof d58)) {
            return false;
        }
        return z06.s.n(this.d, (d58) ys0Var, true, u.p);
    }

    @Override // o.d3
    public final List k(List list) {
        List listD0 = this.d.D0(list);
        if (listD0 != null) {
            return listD0;
        }
        l(8);
        throw null;
    }

    public final String toString() {
        return this.d.getName().m;
    }
}
