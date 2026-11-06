package o;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ju5 extends zt5 {
    public qb8 y;
    public final ju5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju5(bu5 bu5Var, up upVar, as4 as4Var, cp1 cp1Var, boolean z, boolean z2, boolean z3, int i, ju5 ju5Var, s67 s67Var) {
        super(as4Var, cp1Var, bu5Var, upVar, sy4.g("<set-" + bu5Var.getName() + ">"), z, z2, z3, i, s67Var);
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
        this.z = ju5Var != null ? ju5Var : this;
    }

    public static qb8 E0(ju5 ju5Var, oz3 oz3Var, up upVar) {
        if (oz3Var == null) {
            z(8);
            throw null;
        }
        if (upVar != null) {
            return new qb8(ju5Var, null, 0, upVar, a87.g, oz3Var, false, false, false, null, s67.h);
        }
        z(9);
        throw null;
    }

    public static /* synthetic */ void z(int i) {
        String str;
        int i2;
        switch (i) {
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case ep1.b /* 9 */:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case ep1.c /* 10 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case ep1.d /* 12 */:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case ep1.b /* 9 */:
                objArr[2] = "createSetterParameter";
                break;
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // o.ii1, o.gi1, o.fi1
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final ju5 a() {
        ju5 ju5Var = this.z;
        if (ju5Var != null) {
            return ju5Var;
        }
        z(13);
        throw null;
    }

    @Override // o.xi0
    public final List J() {
        qb8 qb8Var = this.y;
        if (qb8Var == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(qb8Var);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        z(11);
        throw null;
    }

    @Override // o.xi0
    public final oz3 getReturnType() {
        return bp1.e(this).w();
    }

    @Override // o.zi0
    public final Collection j() {
        return D0(false);
    }

    @Override // o.fi1
    public final Object o(ji1 ji1Var, Object obj) {
        return ji1Var.w(this, obj);
    }
}
