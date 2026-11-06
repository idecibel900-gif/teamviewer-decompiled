package o;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tb8 extends ii1 implements sb8 {
    public oz3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb8(fi1 fi1Var, up upVar, sy4 sy4Var, oz3 oz3Var, s67 s67Var) {
        super(fi1Var, upVar, sy4Var, s67Var);
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
        this.q = oz3Var;
    }

    public static /* synthetic */ void z(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case ep1.b /* 9 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case ep1.c /* 10 */:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // o.xi0
    public final List J() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        z(6);
        throw null;
    }

    public v14 O() {
        return null;
    }

    public v14 S() {
        return null;
    }

    public oz3 getReturnType() {
        oz3 type = getType();
        if (type != null) {
            return type;
        }
        z(10);
        throw null;
    }

    @Override // o.g2, o.v46
    public final oz3 getType() {
        oz3 oz3Var = this.q;
        if (oz3Var != null) {
            return oz3Var;
        }
        z(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        z(8);
        throw null;
    }

    public boolean x() {
        return false;
    }
}
