package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class hc5 {
    public static final List b = lv0.P0(ServiceLoader.load(rg2.class, rg2.class.getClassLoader()));
    public static final hc5 c;
    public static final cr d;
    public final pz3 a;

    static {
        cr crVar = new cr((byte) 29);
        d = crVar;
        c = new hc5(crVar);
    }

    public hc5(pz3 pz3Var) {
        if (pz3Var != null) {
            this.a = pz3Var;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case ep1.b /* 9 */:
                objArr[0] = "candidateSet";
                break;
            case ep1.c /* 10 */:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case ep1.d /* 12 */:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[0] = "result";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 22:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i == 11 || i == 12) {
            objArr[1] = "filterOverrides";
        } else if (i == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case ep1.d /* 12 */:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(oz3 oz3Var, oz3 oz3Var2, i48 i48Var) {
        if (oz3Var == null) {
            a(44);
            throw null;
        }
        if (oz3Var2 == null) {
            a(45);
            throw null;
        }
        if (ct1.K(oz3Var) && ct1.K(oz3Var2)) {
            return true;
        }
        return yl7.n(i48Var, oz3Var.r0(), oz3Var2.r0());
    }

    public static void c(zi0 zi0Var, LinkedHashSet linkedHashSet) {
        if (zi0Var == null) {
            a(17);
            throw null;
        }
        if (zi0Var.k() != 2) {
            linkedHashSet.add(zi0Var);
        } else {
            if (zi0Var.j().isEmpty()) {
                yq4.t(zi0Var, "No overridden descriptors found for (fake override) ");
                return;
            }
            Iterator it = zi0Var.j().iterator();
            while (it.hasNext()) {
                c((zi0) it.next(), linkedHashSet);
            }
        }
    }

    public static ArrayList d(xi0 xi0Var) {
        v14 v14VarS = xi0Var.S();
        ArrayList arrayList = new ArrayList();
        if (v14VarS != null) {
            arrayList.add(v14VarS.getType());
        }
        Iterator it = xi0Var.J().iterator();
        while (it.hasNext()) {
            arrayList.add(((qb8) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    public static void e(Collection collection, ns4 ns4Var, qs1 qs1Var) {
        as4 as4VarR;
        as4 as4Var;
        boolean z;
        if (collection == null) {
            a(83);
            throw null;
        }
        if (ns4Var == null) {
            a(84);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                boolean zIsEmpty = arrayList.isEmpty();
                if (!zIsEmpty) {
                    collection = arrayList;
                }
                Iterator it2 = collection.iterator();
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        boolean zA = ns4Var.A();
                        as4 as4Var2 = as4.q;
                        if (zA && ns4Var.r() != as4Var2 && ns4Var.r() != as4.f355o) {
                            z2 = true;
                        }
                        if (z3 && !z4) {
                            as4Var = as4.p;
                            break;
                        }
                        if (z3 || !z4) {
                            HashSet<zi0> hashSet = new HashSet();
                            for (zi0 zi0Var : collection) {
                                if (zi0Var == null) {
                                    a(15);
                                    throw null;
                                }
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                c(zi0Var, linkedHashSet);
                                hashSet.addAll(linkedHashSet);
                            }
                            if (!hashSet.isEmpty()) {
                                fi1 fi1Var = (fi1) hashSet.iterator().next();
                                int i = bp1.a;
                                fi1Var.getClass();
                                ps4 ps4VarD = zo1.d(fi1Var);
                                ps4VarD.getClass();
                                if (ps4VarD.L(ck3.D) != null) {
                                    io.sentry.h2.f();
                                    return;
                                }
                            }
                            if (hashSet.size() > 1) {
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                for (Object obj : hashSet) {
                                    Iterator it3 = linkedHashSet2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            linkedHashSet2.add(obj);
                                            break;
                                        }
                                        xi0 xi0Var = (xi0) obj;
                                        xi0 xi0Var2 = (xi0) it3.next();
                                        if (!q(xi0Var, xi0Var2)) {
                                            if (q(xi0Var2, xi0Var)) {
                                                break;
                                            }
                                        } else {
                                            it3.remove();
                                        }
                                    }
                                }
                                hashSet = linkedHashSet2;
                            }
                            as4 as4VarR2 = ns4Var.r();
                            if (as4VarR2 == null) {
                                a(92);
                                throw null;
                            }
                            as4VarR = as4Var2;
                            for (zi0 zi0Var2 : hashSet) {
                                as4 as4VarR3 = (z2 && zi0Var2.r() == as4Var2) ? as4VarR2 : zi0Var2.r();
                                if (as4VarR3.compareTo(as4VarR) < 0) {
                                    as4VarR = as4VarR3;
                                }
                            }
                        } else {
                            as4VarR = z2 ? ns4Var.r() : as4Var2;
                            if (as4VarR == null) {
                                a(90);
                                throw null;
                            }
                        }
                        as4Var = as4VarR;
                        break;
                    }
                    zi0 zi0Var3 = (zi0) it2.next();
                    int iOrdinal = zi0Var3.r().ordinal();
                    if (iOrdinal == 0) {
                        as4Var = as4.n;
                        break;
                    } else if (iOrdinal == 1) {
                        yq4.t(zi0Var3, "Member cannot have SEALED modality: ");
                        return;
                    } else if (iOrdinal == 2) {
                        z3 = true;
                    } else if (iOrdinal == 3) {
                        z4 = true;
                    }
                }
                zi0 zi0VarY = ((zi0) s(collection, new o48((byte) 20))).Y(ns4Var, as4Var, zIsEmpty ? dp1.h : dp1.g);
                qs1Var.U(zi0VarY, collection);
                qs1Var.z(zi0VarY);
                return;
            }
            Object next = it.next();
            zi0 zi0Var4 = (zi0) next;
            if (!dp1.e(zi0Var4.e())) {
                if (ns4Var == null) {
                    dp1.a(3);
                    throw null;
                }
                z = dp1.c(dp1.m, zi0Var4, ns4Var) == null;
            }
            if (z) {
                arrayList.add(next);
            }
        }
    }

    public static ArrayList g(Object obj, LinkedList linkedList, Function1 function1, Function1 function2) {
        if (obj == null) {
            a(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        xi0 xi0Var = (xi0) function1.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            xi0 xi0Var2 = (xi0) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                int iJ = j(xi0Var, xi0Var2);
                if (iJ == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iJ == 3) {
                    function2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static gc5 i(xi0 xi0Var, xi0 xi0Var2) {
        boolean z;
        gc5 gc5VarC;
        if (xi0Var == null) {
            a(38);
            throw null;
        }
        if (xi0Var2 == null) {
            a(39);
            throw null;
        }
        boolean z2 = xi0Var instanceof xw2;
        if ((z2 && !(xi0Var2 instanceof xw2)) || (((z = xi0Var instanceof bu5)) && !(xi0Var2 instanceof bu5))) {
            return gc5.c("Member kind mismatch");
        }
        if (!z2 && !z) {
            an4.i(xi0Var, "This type of CallableDescriptor cannot be checked for overridability: ");
            return null;
        }
        if (!xi0Var.getName().equals(xi0Var2.getName())) {
            return gc5.c("Name mismatch");
        }
        if ((xi0Var.S() == null) != (xi0Var2.S() == null)) {
            gc5VarC = gc5.c("Receiver presence mismatch");
        } else {
            gc5VarC = xi0Var.J().size() != xi0Var2.J().size() ? gc5.c("Value parameter number mismatch") : null;
        }
        if (gc5VarC != null) {
            return gc5VarC;
        }
        return null;
    }

    public static int j(xi0 xi0Var, xi0 xi0Var2) {
        hc5 hc5Var = c;
        int iB = hc5Var.l(xi0Var2, xi0Var, null).b();
        int iB2 = hc5Var.m(xi0Var, xi0Var2, null, false).b();
        if (iB == 1 && iB2 == 1) {
            return 1;
        }
        return (iB == 3 || iB2 == 3) ? 3 : 2;
    }

    public static boolean k(xi0 xi0Var, xi0 xi0Var2) {
        if (xi0Var == null) {
            a(65);
            throw null;
        }
        if (xi0Var2 == null) {
            a(66);
            throw null;
        }
        oz3 returnType = xi0Var.getReturnType();
        oz3 returnType2 = xi0Var2.getReturnType();
        if (p(xi0Var, xi0Var2)) {
            i48 i48VarF = c.f(xi0Var.getTypeParameters(), xi0Var2.getTypeParameters());
            if (xi0Var instanceof xw2) {
                return o(xi0Var, returnType, xi0Var2, returnType2, i48VarF);
            }
            if (!(xi0Var instanceof bu5)) {
                io.sentry.h2.h(xi0Var.getClass(), "Unexpected callable: ");
                return false;
            }
            bu5 bu5Var = (bu5) xi0Var;
            bu5 bu5Var2 = (bu5) xi0Var2;
            ju5 ju5VarB = bu5Var.b();
            ju5 ju5VarB2 = bu5Var2.b();
            if ((ju5VarB == null || ju5VarB2 == null) ? true : p(ju5VarB, ju5VarB2)) {
                if (bu5Var.R() && bu5Var2.R()) {
                    return yl7.n(i48VarF, returnType.r0(), returnType2.r0());
                }
                if ((bu5Var.R() || !bu5Var2.R()) && o(xi0Var, returnType, xi0Var2, returnType2, i48VarF)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o(xi0 xi0Var, oz3 oz3Var, xi0 xi0Var2, oz3 oz3Var2, i48 i48Var) {
        if (xi0Var == null) {
            a(71);
            throw null;
        }
        if (oz3Var == null) {
            a(72);
            throw null;
        }
        if (xi0Var2 == null) {
            a(73);
            throw null;
        }
        if (oz3Var2 != null) {
            return yl7.s(yl7.f2619o, i48Var, oz3Var.r0(), oz3Var2.r0());
        }
        a(74);
        throw null;
    }

    public static boolean p(xi0 xi0Var, xi0 xi0Var2) {
        Integer numB = dp1.b(xi0Var.e(), xi0Var2.e());
        return numB == null || numB.intValue() >= 0;
    }

    public static boolean q(xi0 xi0Var, xi0 xi0Var2) {
        z06 z06Var = z06.s;
        if (xi0Var == null) {
            a(13);
            throw null;
        }
        if (xi0Var2 == null) {
            a(14);
            throw null;
        }
        if (!xi0Var.equals(xi0Var2) && z06Var.m(xi0Var.a(), xi0Var2.a(), false)) {
            return true;
        }
        xi0 xi0VarA = xi0Var2.a();
        int i = zo1.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        zo1.b(xi0Var.a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (z06Var.m(xi0VarA, (xi0) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(zi0 zi0Var, Function1 function1) {
        cp1 cp1Var;
        cp1 cp1VarF;
        cp1 cp1Var2;
        if (zi0Var == null) {
            a(105);
            throw null;
        }
        for (zi0 zi0Var2 : zi0Var.j()) {
            if (zi0Var2.e() == dp1.g) {
                r(zi0Var2, function1);
            }
        }
        if (zi0Var.e() != dp1.g) {
            return;
        }
        Collection<zi0> collectionJ = zi0Var.j();
        if (collectionJ == null) {
            a(107);
            throw null;
        }
        if (!collectionJ.isEmpty()) {
            Iterator it = collectionJ.iterator();
            loop3: while (true) {
                cp1Var = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    cp1 cp1VarE = ((zi0) it.next()).e();
                    if (cp1Var != null) {
                        Integer numB = dp1.b(cp1VarE, cp1Var);
                        if (numB != null) {
                            if (numB.intValue() > 0) {
                            }
                        }
                    }
                    cp1Var = cp1VarE;
                }
            }
            if (cp1Var == null) {
                cp1VarF = null;
                break;
            }
            Iterator it2 = collectionJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    cp1VarF = cp1Var;
                    break;
                }
                Integer numB2 = dp1.b(cp1Var, ((zi0) it2.next()).e());
                if (numB2 == null || numB2.intValue() < 0) {
                    cp1VarF = null;
                    break;
                }
            }
        } else {
            cp1VarF = dp1.k;
        }
        if (cp1VarF == null) {
            cp1VarF = null;
            break;
        }
        if (zi0Var.k() == 2) {
            for (zi0 zi0Var3 : collectionJ) {
                if (zi0Var3.r() != as4.q && !zi0Var3.e().equals(cp1VarF)) {
                    cp1VarF = null;
                    break;
                }
            }
        } else {
            cp1VarF = dp1.f(cp1VarF.a.m());
        }
        if (cp1VarF == null) {
            if (function1 != null) {
                function1.invoke(zi0Var);
            }
            cp1Var2 = dp1.e;
        } else {
            cp1Var2 = cp1VarF;
        }
        if (zi0Var instanceof du5) {
            du5 du5Var = (du5) zi0Var;
            if (cp1Var2 == null) {
                du5.z(20);
                throw null;
            }
            du5Var.v = cp1Var2;
            Iterator it3 = ((bu5) zi0Var).n().iterator();
            while (it3.hasNext()) {
                r((zt5) it3.next(), cp1VarF == null ? null : function1);
            }
            return;
        }
        if (zi0Var instanceof zw2) {
            zw2 zw2Var = (zw2) zi0Var;
            if (cp1Var2 != null) {
                zw2Var.x = cp1Var2;
                return;
            } else {
                zw2.z(10);
                throw null;
            }
        }
        zt5 zt5Var = (zt5) zi0Var;
        zt5Var.w = cp1Var2;
        if (cp1Var2 != zt5Var.t.e()) {
            zt5Var.q = false;
        }
    }

    public static Object s(Collection collection, Function1 function1) {
        Object next;
        oz3 returnType;
        if (collection.size() == 1) {
            Object objL0 = lv0.l0(collection);
            if (objL0 != null) {
                return objL0;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(mv0.Z(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(function1.invoke(it.next()));
        }
        Object objL1 = lv0.l0(collection);
        xi0 xi0Var = (xi0) function1.invoke(objL1);
        for (Object obj : collection) {
            xi0 xi0Var2 = (xi0) function1.invoke(obj);
            if (xi0Var2 == null) {
                a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
            } while (k(xi0Var2, (xi0) it2.next()));
            if (k(xi0Var2, xi0Var) && !k(xi0Var, xi0Var2)) {
                objL1 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objL1 != null) {
                return objL1;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objL2 = lv0.l0(arrayList);
            if (objL2 != null) {
                return objL2;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            returnType = ((xi0) function1.invoke(next)).getReturnType();
            returnType.getClass();
        } while (returnType.r0() instanceof um2);
        if (next != null) {
            return next;
        }
        Object objL3 = lv0.l0(arrayList);
        if (objL3 != null) {
            return objL3;
        }
        a(82);
        throw null;
    }

    public final i48 f(List list, List list2) {
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        uz3 uz3Var = uz3.a;
        pz3 pz3Var = this.a;
        tz3 tz3Var = tz3.a;
        if (zIsEmpty) {
            return new i48(true, true, new a65((HashMap) null, pz3Var), tz3Var, uz3Var);
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(((d58) list.get(i)).q(), ((d58) list2.get(i)).q());
        }
        return new i48(true, true, new a65(map, pz3Var), tz3Var, uz3Var);
    }

    public final void h(sy4 sy4Var, Collection collection, Collection collection2, ns4 ns4Var, qs1 qs1Var) {
        Integer numB;
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (ns4Var == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            zi0 zi0Var = (zi0) it.next();
            if (zi0Var == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            v17 v17Var = new v17();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                zi0 zi0Var2 = (zi0) it2.next();
                int iB = l(zi0Var2, zi0Var, ns4Var).b();
                boolean z = !dp1.e(zi0Var2.e()) && dp1.c(dp1.m, zi0Var2, zi0Var) == null;
                int iB2 = ua5.B(iB);
                if (iB2 == 0) {
                    if (z) {
                        v17Var.add(zi0Var2);
                    }
                    arrayList.add(zi0Var2);
                } else if (iB2 == 2) {
                    if (z) {
                        qs1Var.I(zi0Var2, zi0Var);
                    }
                    arrayList.add(zi0Var2);
                }
            }
            qs1Var.U(zi0Var, v17Var);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            fi1 fi1VarI = ((zi0) linkedHashSet.iterator().next()).i();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((zi0) it3.next()).i() != fi1VarI) {
                        LinkedList<zi0> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            zi0 zi0Var3 = null;
                            for (zi0 zi0Var4 : linkedList) {
                                if (zi0Var3 == null || ((numB = dp1.b(zi0Var3.e(), zi0Var4.e())) != null && numB.intValue() < 0)) {
                                    zi0Var3 = zi0Var4;
                                }
                            }
                            zi0Var3.getClass();
                            e(g(zi0Var3, linkedList, new o48((byte) 21), new y2(qs1Var, zi0Var3, (byte) 16)), ns4Var, qs1Var);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((zi0) it4.next()), ns4Var, qs1Var);
        }
    }

    public final gc5 l(xi0 xi0Var, xi0 xi0Var2, ns4 ns4Var) {
        if (xi0Var == null) {
            a(19);
            throw null;
        }
        if (xi0Var2 != null) {
            return m(xi0Var, xi0Var2, ns4Var, false);
        }
        a(20);
        throw null;
    }

    public final gc5 m(xi0 xi0Var, xi0 xi0Var2, ns4 ns4Var, boolean z) {
        if (xi0Var == null) {
            a(22);
            throw null;
        }
        if (xi0Var2 == null) {
            a(23);
            throw null;
        }
        gc5 gc5VarN = n(xi0Var, xi0Var2, z);
        boolean z2 = gc5VarN.b() == 1;
        List<rg2> list = b;
        for (rg2 rg2Var : list) {
            if (rg2Var.a() != 1 && (!z2 || rg2Var.a() != 2)) {
                int iB = ua5.B(rg2Var.b(xi0Var, xi0Var2, ns4Var));
                if (iB == 0) {
                    z2 = true;
                } else if (iB == 1) {
                    return gc5.c("External condition");
                }
            }
        }
        if (!z2) {
            return gc5VarN;
        }
        for (rg2 rg2Var2 : list) {
            if (rg2Var2.a() == 1) {
                int iB2 = ua5.B(rg2Var2.b(xi0Var, xi0Var2, ns4Var));
                if (iB2 == 0) {
                    throw new IllegalStateException("Contract violation in " + rg2Var2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (iB2 == 1) {
                    return gc5.c("External condition");
                }
            }
        }
        gc5 gc5Var = gc5.c;
        if (gc5Var != null) {
            return gc5Var;
        }
        gc5.a(0);
        throw null;
    }

    public final gc5 n(xi0 xi0Var, xi0 xi0Var2, boolean z) {
        if (xi0Var == null) {
            a(28);
            throw null;
        }
        if (xi0Var2 == null) {
            a(29);
            throw null;
        }
        gc5 gc5VarI = i(xi0Var, xi0Var2);
        if (gc5VarI != null) {
            return gc5VarI;
        }
        ArrayList arrayListD = d(xi0Var);
        ArrayList arrayListD2 = d(xi0Var2);
        List typeParameters = xi0Var.getTypeParameters();
        List typeParameters2 = xi0Var2.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i = 0; i < arrayListD.size(); i++) {
                if (!qz3.a.a((oz3) arrayListD.get(i), (oz3) arrayListD2.get(i))) {
                    return gc5.c("Type parameter number mismatch");
                }
            }
            return new gc5(3, "Type parameter number mismatch");
        }
        i48 i48VarF = f(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            d58 d58Var = (d58) typeParameters.get(i2);
            d58 d58Var2 = (d58) typeParameters2.get(i2);
            if (d58Var == null) {
                a(47);
                throw null;
            }
            if (d58Var2 == null) {
                a(48);
                throw null;
            }
            List<oz3> upperBounds = d58Var.getUpperBounds();
            ArrayList arrayList = new ArrayList(d58Var2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (oz3 oz3Var : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!b(oz3Var, (oz3) listIterator.next(), i48VarF));
                    listIterator.remove();
                }
            }
            return gc5.c("Type parameter bounds mismatch");
        }
        for (int i3 = 0; i3 < arrayListD.size(); i3++) {
            if (!b((oz3) arrayListD.get(i3), (oz3) arrayListD2.get(i3), i48VarF)) {
                return gc5.c("Value parameter type mismatch");
            }
        }
        if ((xi0Var instanceof xw2) && (xi0Var2 instanceof xw2) && ((xw2) xi0Var).l() != ((xw2) xi0Var2).l()) {
            return new gc5(3, "Incompatible suspendability");
        }
        if (z) {
            oz3 returnType = xi0Var.getReturnType();
            oz3 returnType2 = xi0Var2.getReturnType();
            if (returnType != null && returnType2 != null && ((!ct1.K(returnType2) || !ct1.K(returnType)) && !yl7.s(yl7.f2619o, i48VarF, returnType2.r0(), returnType.r0()))) {
                return new gc5(3, "Return type mismatch");
            }
        }
        gc5 gc5Var = gc5.c;
        if (gc5Var != null) {
            return gc5Var;
        }
        gc5.a(0);
        throw null;
    }
}
