package o;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eu5 extends zt5 {
    public oz3 y;
    public final eu5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu5(bu5 bu5Var, up upVar, as4 as4Var, cp1 cp1Var, boolean z, boolean z2, boolean z3, int i, eu5 eu5Var, s67 s67Var) {
        super(as4Var, cp1Var, bu5Var, upVar, sy4.g("<get-" + bu5Var.getName() + ">"), z, z2, z3, i, s67Var);
        if (upVar == null) {
            z(1);
            throw null;
        }
        if (as4Var == null) {
            z(2);
            throw null;
        }
        if (cp1Var == null) {
            z(3);
            throw null;
        }
        if (i == 0) {
            z(4);
            throw null;
        }
        if (s67Var == null) {
            z(5);
            throw null;
        }
        this.z = eu5Var != null ? eu5Var : this;
    }

    public static /* synthetic */ void z(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // o.ii1, o.gi1, o.fi1
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final eu5 a() {
        eu5 eu5Var = this.z;
        if (eu5Var != null) {
            return eu5Var;
        }
        z(8);
        throw null;
    }

    public final void F0(oz3 oz3Var) {
        if (oz3Var == null) {
            oz3Var = this.t.getType();
        }
        this.y = oz3Var;
    }

    @Override // o.xi0
    public final List J() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        z(7);
        throw null;
    }

    @Override // o.xi0
    public final oz3 getReturnType() {
        return this.y;
    }

    @Override // o.zi0
    public final Collection j() {
        return D0(true);
    }

    @Override // o.fi1
    public final Object o(ji1 ji1Var, Object obj) {
        return ji1Var.k(this, obj);
    }
}
