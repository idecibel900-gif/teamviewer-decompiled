package o;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class v14 extends gi1 implements if5 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ byte f2263o = 1;
    public final fi1 p;
    public final v46 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v14(fi1 fi1Var, g2 g2Var, up upVar, sy4 sy4Var) {
        super(upVar, sy4Var);
        if (fi1Var == null) {
            z(3);
            throw null;
        }
        if (upVar == null) {
            z(5);
            throw null;
        }
        if (sy4Var == null) {
            z(6);
            throw null;
        }
        this.p = fi1Var;
        this.q = g2Var;
    }

    public static /* synthetic */ void C0(int i) {
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
            case 11:
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
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case ep1.b /* 9 */:
                objArr[1] = "getVisibility";
                break;
            case ep1.c /* 10 */:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void z(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case ep1.b /* 9 */:
                objArr[0] = "newOwner";
                break;
            case ep1.c /* 10 */:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case ep1.b /* 9 */:
                objArr[2] = "copy";
                break;
            case ep1.c /* 10 */:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final v46 D0() {
        byte b = this.f2263o;
        v46 v46Var = this.q;
        switch (b) {
            case 0:
                return (ff3) v46Var;
            default:
                g2 g2Var = (g2) v46Var;
                if (g2Var != null) {
                    return g2Var;
                }
                z(7);
                throw null;
        }
    }

    @Override // o.ie7
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final v14 d(m58 m58Var) {
        if (m58Var == null) {
            C0(3);
            throw null;
        }
        if (!m58Var.a.e()) {
            oz3 oz3VarH = i() instanceof ns4 ? m58Var.h(getType(), ub8.q) : m58Var.h(getType(), ub8.f2197o);
            if (oz3VarH == null) {
                return null;
            }
            if (oz3VarH != getType()) {
                return new v14(i(), new i18(oz3VarH), getAnnotations());
            }
        }
        return this;
    }

    @Override // o.xi0
    public final List J() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        C0(7);
        throw null;
    }

    @Override // o.xi0
    public final v14 O() {
        return null;
    }

    @Override // o.xi0
    public final v14 S() {
        return null;
    }

    @Override // o.gi1, o.fi1
    public final fi1 a() {
        return this;
    }

    @Override // o.gi1, o.fi1
    public final xi0 a() {
        return this;
    }

    @Override // o.hi1
    public final s67 c() {
        return s67.h;
    }

    @Override // o.ki1
    public final cp1 e() {
        cp1 cp1Var = dp1.f;
        if (cp1Var != null) {
            return cp1Var;
        }
        C0(9);
        throw null;
    }

    @Override // o.xi0
    public final oz3 getReturnType() {
        return getType();
    }

    @Override // o.g2, o.v46
    public final oz3 getType() {
        oz3 type = D0().getType();
        if (type != null) {
            return type;
        }
        C0(6);
        throw null;
    }

    @Override // o.xi0
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        C0(5);
        throw null;
    }

    @Override // o.fi1
    public final fi1 i() {
        byte b = this.f2263o;
        fi1 fi1Var = this.p;
        switch (b) {
            case 0:
                return (ns4) fi1Var;
            default:
                if (fi1Var != null) {
                    return fi1Var;
                }
                z(8);
                throw null;
        }
    }

    @Override // o.xi0, o.zi0
    public final Collection j() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        C0(8);
        throw null;
    }

    @Override // o.fi1
    public final Object o(ji1 ji1Var, Object obj) {
        return ji1Var.h(this, obj);
    }

    @Override // o.gi1
    public String toString() {
        switch (this.f2263o) {
            case 0:
                return "class " + ((ns4) this.p).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // o.xi0
    public final boolean x() {
        return false;
    }

    public v14(ns4 ns4Var) {
        super(yl7.p, a87.d);
        this.p = ns4Var;
        this.q = new ff3(ns4Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v14(fi1 fi1Var, g2 g2Var, up upVar) {
        this(fi1Var, g2Var, upVar, a87.d);
        if (fi1Var == null) {
            z(0);
            throw null;
        }
        if (upVar != null) {
        } else {
            z(2);
            throw null;
        }
    }
}
