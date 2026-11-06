package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zo1 {
    public static final /* synthetic */ int a = 0;

    static {
        new ht2("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case ep1.d /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case ep1.d /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case ep1.d /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case ep1.d /* 12 */:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case ep1.d /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case ep1.d /* 12 */:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(xi0 xi0Var, LinkedHashSet linkedHashSet) {
        if (xi0Var == null) {
            a(73);
            throw null;
        }
        if (linkedHashSet.contains(xi0Var)) {
            return;
        }
        Iterator it = xi0Var.a().j().iterator();
        while (it.hasNext()) {
            xi0 xi0VarA = ((xi0) it.next()).a();
            b(xi0VarA, linkedHashSet);
            linkedHashSet.add(xi0VarA);
        }
    }

    public static ns4 c(oz3 oz3Var) {
        if (oz3Var == null) {
            a(45);
            throw null;
        }
        k48 k48VarO0 = oz3Var.o0();
        if (k48VarO0 == null) {
            a(46);
            throw null;
        }
        ns4 ns4Var = (ns4) k48VarO0.a();
        if (ns4Var != null) {
            return ns4Var;
        }
        a(47);
        throw null;
    }

    public static ps4 d(fi1 fi1Var) {
        if (fi1Var == null) {
            a(21);
            throw null;
        }
        ps4 ps4VarE = e(fi1Var);
        if (ps4VarE != null) {
            return ps4VarE;
        }
        a(22);
        throw null;
    }

    public static ps4 e(fi1 fi1Var) {
        if (fi1Var == null) {
            a(23);
            throw null;
        }
        while (fi1Var != null) {
            if (fi1Var instanceof ps4) {
                return (ps4) fi1Var;
            }
            if (fi1Var instanceof b54) {
                return ((b54) fi1Var).f397o;
            }
            fi1Var = fi1Var.i();
        }
        return null;
    }

    public static z06 f(fi1 fi1Var) {
        z06 z06Var = z06.I;
        if (fi1Var == null) {
            a(82);
            throw null;
        }
        if (fi1Var instanceof ju5) {
            fi1Var = ((ju5) fi1Var).t;
        }
        if (fi1Var instanceof hi1) {
            ((hi1) fi1Var).c().getClass();
        }
        return z06Var;
    }

    public static it2 g(fi1 fi1Var) {
        if (fi1Var != null) {
            ht2 ht2VarH = h(fi1Var);
            return ht2VarH != null ? ht2VarH.i() : g(fi1Var.i()).b(fi1Var.getName());
        }
        a(2);
        throw null;
    }

    public static ht2 h(fi1 fi1Var) {
        if (fi1Var == null) {
            a(5);
            throw null;
        }
        if ((fi1Var instanceof ps4) || hd2.f(fi1Var)) {
            return ht2.c;
        }
        if (fi1Var instanceof b54) {
            return ((b54) fi1Var).p;
        }
        if (fi1Var instanceof ad5) {
            return ((bd5) ((ad5) fi1Var)).q;
        }
        return null;
    }

    public static fi1 i(fi1 fi1Var, Class cls, boolean z) {
        if (fi1Var == null) {
            return null;
        }
        if (z) {
            fi1Var = fi1Var.i();
        }
        while (fi1Var != null) {
            if (cls.isInstance(fi1Var)) {
                return fi1Var;
            }
            fi1Var = fi1Var.i();
        }
        return null;
    }

    public static ns4 j(ns4 ns4Var) {
        if (ns4Var == null) {
            a(44);
            throw null;
        }
        Iterator it = ns4Var.q().b().iterator();
        while (it.hasNext()) {
            ns4 ns4VarC = c((oz3) it.next());
            if (ns4VarC.i0() != ms0.n) {
                return ns4VarC;
            }
        }
        return null;
    }

    public static boolean k(fi1 fi1Var) {
        return n(fi1Var, ms0.m) && fi1Var.getName().equals(a87.a);
    }

    public static boolean l(fi1 fi1Var) {
        return n(fi1Var, ms0.r) && ((ns4) fi1Var).w0();
    }

    public static boolean m(fi1 fi1Var) {
        if (fi1Var != null) {
            return n(fi1Var, ms0.p);
        }
        a(36);
        throw null;
    }

    public static boolean n(fi1 fi1Var, ms0 ms0Var) {
        return (fi1Var instanceof ns4) && ((ns4) fi1Var).i0() == ms0Var;
    }

    public static boolean o(fi1 fi1Var) {
        if (fi1Var == null) {
            a(1);
            throw null;
        }
        while (fi1Var != null) {
            if (k(fi1Var) || ((fi1Var instanceof ki1) && ((ki1) fi1Var).e() == dp1.f)) {
                return true;
            }
            fi1Var = fi1Var.i();
        }
        return false;
    }

    public static boolean p(oz3 oz3Var, fi1 fi1Var) {
        if (oz3Var == null) {
            a(30);
            throw null;
        }
        if (fi1Var == null) {
            a(31);
            throw null;
        }
        ys0 ys0VarA = oz3Var.o0().a();
        if (ys0VarA == null) {
            return false;
        }
        fi1 fi1VarA = ys0VarA.a();
        return (fi1VarA instanceof ys0) && (fi1Var instanceof ys0) && ((ys0) fi1Var).q().equals(((ys0) fi1VarA).q());
    }

    public static boolean q(fi1 fi1Var) {
        return (n(fi1Var, ms0.m) || n(fi1Var, ms0.n)) && ((ns4) fi1Var).r() == as4.f355o;
    }

    public static boolean r(oz3 oz3Var, fi1 fi1Var) {
        if (oz3Var == null) {
            a(32);
            throw null;
        }
        if (fi1Var == null) {
            a(33);
            throw null;
        }
        if (p(oz3Var, fi1Var)) {
            return true;
        }
        Iterator it = oz3Var.o0().b().iterator();
        while (it.hasNext()) {
            if (r((oz3) it.next(), fi1Var)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(fi1 fi1Var) {
        return fi1Var != null && (fi1Var.i() instanceof ad5);
    }

    public static zi0 t(zi0 zi0Var) {
        while (zi0Var.k() == 2) {
            Collection collectionJ = zi0Var.j();
            if (collectionJ.isEmpty()) {
                yq4.t(zi0Var, "Fake override should have at least one overridden descriptor: ");
                return null;
            }
            zi0Var = (zi0) collectionJ.iterator().next();
        }
        return zi0Var;
    }
}
