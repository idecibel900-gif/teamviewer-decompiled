package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p58 {
    public static final ed2 a = hd2.c(gd2.x, new String[0]);
    public static final ed2 b = hd2.c(gd2.u, new String[0]);
    public static final o58 c = new o58("NO_EXPECTED_TYPE");
    public static final o58 d = new o58("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 4:
            case 6:
            case 7:
            case ep1.b /* 9 */:
            case 11:
            case 15:
            case 17:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case ep1.c /* 10 */:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case ep1.d /* 12 */:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 11 || i == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 53) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case ep1.b /* 9 */:
            case 11:
            case 15:
            case 17:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case ep1.c /* 10 */:
                objArr[2] = "canHaveSubtypes";
                break;
            case ep1.d /* 12 */:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(oz3 oz3Var) {
        if (oz3Var == null) {
            a(28);
            throw null;
        }
        if (oz3Var.p0()) {
            return true;
        }
        return (oz3Var.r0() instanceof um2) && b(((um2) oz3Var.r0()).f2226o);
    }

    public static boolean c(oz3 oz3Var, Function1 function1, v17 v17Var) {
        if (oz3Var == null) {
            return false;
        }
        m98 m98VarR0 = oz3Var.r0();
        if (m(oz3Var)) {
            return ((Boolean) function1.invoke(m98VarR0)).booleanValue();
        }
        if (v17Var != null && v17Var.contains(oz3Var)) {
            return false;
        }
        if (((Boolean) function1.invoke(m98VarR0)).booleanValue()) {
            return true;
        }
        if (v17Var == null) {
            v17Var = new v17();
        }
        v17Var.add(oz3Var);
        um2 um2Var = m98VarR0 instanceof um2 ? (um2) m98VarR0 : null;
        if (um2Var != null && (c(um2Var.n, function1, v17Var) || c(um2Var.f2226o, function1, v17Var))) {
            return true;
        }
        if ((m98VarR0 instanceof lm1) && c(((lm1) m98VarR0).n, function1, v17Var)) {
            return true;
        }
        k48 k48VarO0 = oz3Var.o0();
        if (k48VarO0 instanceof zl3) {
            Iterator it = ((zl3) k48VarO0).b.iterator();
            while (it.hasNext()) {
                if (c((oz3) it.next(), function1, v17Var)) {
                    return true;
                }
            }
            return false;
        }
        for (h58 h58Var : oz3Var.m0()) {
            if (!h58Var.c() && c(h58Var.b(), function1, v17Var)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new w87(((d58) it.next()).W()));
        }
        return lv0.P0(arrayList);
    }

    public static boolean e(oz3 oz3Var) throws l58 {
        if (oz3Var == null) {
            a(27);
            throw null;
        }
        if (!oz3Var.p0() && (!(oz3Var.r0() instanceof um2) || !e(((um2) oz3Var.r0()).f2226o))) {
            if (!(oz3Var.r0() instanceof lm1)) {
                if (f(oz3Var)) {
                    if (!(oz3Var.o0().a() instanceof ns4)) {
                        m58 m58VarD = m58.d(oz3Var);
                        Collection<oz3> collectionB = oz3Var.o0().b();
                        ArrayList arrayList = new ArrayList(collectionB.size());
                        for (oz3 oz3Var2 : collectionB) {
                            if (oz3Var2 == null) {
                                a(21);
                                throw null;
                            }
                            oz3 oz3VarH = m58VarD.h(oz3Var2, ub8.f2197o);
                            oz3 oz3VarI = oz3VarH != null ? i(oz3VarH, oz3Var.p0()) : null;
                            if (oz3VarI != null) {
                                arrayList.add(oz3VarI);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((oz3) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                k48 k48VarO0 = oz3Var.o0();
                if (k48VarO0 instanceof zl3) {
                    Iterator it2 = ((zl3) k48VarO0).b.iterator();
                    while (it2.hasNext()) {
                        if (e((oz3) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(oz3 oz3Var) {
        if (oz3Var == null) {
            a(60);
            throw null;
        }
        if ((oz3Var.o0().a() instanceof d58 ? (d58) oz3Var.o0().a() : null) != null) {
            return true;
        }
        oz3Var.o0();
        return false;
    }

    public static m98 g(oz3 oz3Var) {
        if (oz3Var != null) {
            return h(oz3Var, true);
        }
        a(1);
        throw null;
    }

    public static m98 h(oz3 oz3Var, boolean z) {
        if (oz3Var == null) {
            a(3);
            throw null;
        }
        m98 m98VarS0 = oz3Var.r0().s0(z);
        if (m98VarS0 != null) {
            return m98VarS0;
        }
        a(4);
        throw null;
    }

    public static oz3 i(oz3 oz3Var, boolean z) {
        if (oz3Var != null) {
            return z ? h(oz3Var, true) : oz3Var;
        }
        a(8);
        throw null;
    }

    public static g07 j(g07 g07Var, boolean z) {
        if (g07Var == null) {
            a(5);
            throw null;
        }
        if (!z) {
            return g07Var;
        }
        g07 g07VarV0 = g07Var.s0(true);
        if (g07VarV0 != null) {
            return g07VarV0;
        }
        a(6);
        throw null;
    }

    public static w87 k(d58 d58Var) {
        if (d58Var != null) {
            return new w87(d58Var);
        }
        a(45);
        throw null;
    }

    public static h58 l(d58 d58Var, po3 po3Var) {
        if (d58Var != null) {
            return po3Var.a == n58.m ? new w87(f57.p(d58Var)) : new w87(d58Var);
        }
        a(46);
        throw null;
    }

    public static boolean m(oz3 oz3Var) {
        if (oz3Var != null) {
            return oz3Var == c || oz3Var == d;
        }
        a(0);
        throw null;
    }
}
