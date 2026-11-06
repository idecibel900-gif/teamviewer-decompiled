package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wy3 {
    public static final sy4 e = sy4.g("<built-ins module>");
    public qs4 a;
    public final vd4 b;
    public final sd4 c;
    public final xd4 d;

    public wy3(xd4 xd4Var) {
        this.d = xd4Var;
        xd4Var.a(new uy3(this, (byte) 0));
        byte b = 1;
        this.b = new vd4(xd4Var, new uy3(this, b));
        this.c = xd4Var.b(new qp(this, b));
    }

    public static boolean A(oz3 oz3Var, it2 it2Var) {
        if (oz3Var == null) {
            a(98);
            throw null;
        }
        if (it2Var != null) {
            return H(oz3Var.o0(), it2Var);
        }
        a(99);
        throw null;
    }

    public static boolean B(oz3 oz3Var, it2 it2Var) {
        if (it2Var != null) {
            return A(oz3Var, it2Var) && !oz3Var.p0();
        }
        a(136);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean C(ii1 ii1Var) {
        if (ii1Var.a().getAnnotations().o0(s87.m)) {
            return true;
        }
        if (!(ii1Var instanceof bu5)) {
            return false;
        }
        bu5 bu5Var = (bu5) ii1Var;
        boolean zR = bu5Var.R();
        eu5 getter = bu5Var.getGetter();
        ju5 ju5VarB = bu5Var.b();
        if (getter == null || !C(getter)) {
            return false;
        }
        if (zR) {
            return ju5VarB != null && C(ju5VarB);
        }
        return true;
    }

    public static boolean D(oz3 oz3Var, it2 it2Var) {
        if (oz3Var == null) {
            a(106);
            throw null;
        }
        if (it2Var != null) {
            return !oz3Var.p0() && A(oz3Var, it2Var);
        }
        a(107);
        throw null;
    }

    public static boolean E(oz3 oz3Var) {
        if (oz3Var == null) {
            a(137);
            throw null;
        }
        if (oz3Var != null) {
            return A(oz3Var, s87.b) && !p58.e(oz3Var);
        }
        a(139);
        throw null;
    }

    public static boolean F(oz3 oz3Var) {
        if (oz3Var.p0()) {
            return false;
        }
        ys0 ys0VarA = oz3Var.o0().a();
        return (ys0VarA instanceof ns4) && t((ns4) ys0VarA) != null;
    }

    public static boolean G(oz3 oz3Var) {
        return D(oz3Var, s87.f);
    }

    public static boolean H(k48 k48Var, it2 it2Var) {
        if (k48Var == null) {
            a(102);
            throw null;
        }
        if (it2Var != null) {
            ys0 ys0VarA = k48Var.a();
            return (ys0VarA instanceof ns4) && b((ns4) ys0VarA, it2Var);
        }
        a(103);
        throw null;
    }

    public static boolean I(fi1 fi1Var) {
        while (fi1Var != null) {
            if (fi1Var instanceof ad5) {
                return ((bd5) ((ad5) fi1Var)).q.h(t87.k);
            }
            fi1Var = fi1Var.i();
        }
        return false;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case ep1.d /* 12 */:
            case 14:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i2 = 2;
                break;
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case ep1.d /* 12 */:
            case 14:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 77:
            case 78:
            case 90:
            case 97:
            case 104:
            case 108:
            case 109:
            case 144:
            case 147:
            case 148:
            case 150:
            case 158:
            case 159:
            case 160:
            case 161:
                objArr[0] = "descriptor";
                break;
            case ep1.d /* 12 */:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 145:
            case 146:
            case 149:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 163:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case 162:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case ep1.d /* 12 */:
            case 14:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[1] = "getSuspendFunction";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case 25:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case 35:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case 64:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case ep1.b /* 9 */:
                objArr[2] = "isBuiltIn";
                break;
            case ep1.c /* 10 */:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case ep1.d /* 12 */:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case 90:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case 128:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case 139:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 140:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 141:
                objArr[2] = "isNullableAny";
                break;
            case 142:
                objArr[2] = "isDefaultBound";
                break;
            case 143:
                objArr[2] = "isUnit";
                break;
            case 144:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 145:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 146:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 147:
                objArr[2] = "isMemberOfAny";
                break;
            case 148:
            case 149:
                objArr[2] = "isEnum";
                break;
            case 150:
            case 151:
                objArr[2] = "isComparable";
                break;
            case 152:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case 159:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 161:
                objArr[2] = "isCloneable";
                break;
            case 162:
                objArr[2] = "isDeprecated";
                break;
            case 163:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(str2);
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case ep1.d /* 12 */:
            case 14:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(ns4 ns4Var, it2 it2Var) {
        if (ns4Var == null) {
            a(104);
            throw null;
        }
        if (it2Var != null) {
            return ns4Var.getName().equals(it2Var.f()) && it2Var.equals(zo1.g(ns4Var));
        }
        a(105);
        throw null;
    }

    public static ps5 r(ys0 ys0Var) {
        if (s87.b0.contains(ys0Var.getName())) {
            return (ps5) s87.d0.get(zo1.g(ys0Var));
        }
        return null;
    }

    public static ps5 t(ns4 ns4Var) {
        if (s87.a0.contains(ns4Var.getName())) {
            return (ps5) s87.c0.get(zo1.g(ns4Var));
        }
        return null;
    }

    public static boolean x(oz3 oz3Var) {
        if (oz3Var != null) {
            return A(oz3Var, s87.a);
        }
        a(140);
        throw null;
    }

    public static boolean y(oz3 oz3Var) {
        if (oz3Var != null) {
            return A(oz3Var, s87.g);
        }
        a(89);
        throw null;
    }

    public static boolean z(fi1 fi1Var) {
        if (fi1Var != null) {
            return zo1.i(fi1Var, eg0.class, false) != null;
        }
        a(9);
        throw null;
    }

    public final void c() {
        sy4 sy4Var = e;
        sy4Var.getClass();
        xd4 xd4Var = this.d;
        qs4 qs4Var = new qs4(sy4Var, xd4Var, this, 48);
        this.a = qs4Var;
        bg0.a.getClass();
        bg0 bg0Var = (bg0) ag0.b.getValue();
        qs4 qs4Var2 = this.a;
        Iterable iterableL = l();
        rl5 rl5VarP = p();
        cc ccVarD = d();
        dg0 dg0Var = (dg0) bg0Var;
        dg0Var.getClass();
        qs4Var2.getClass();
        iterableL.getClass();
        rl5VarP.getClass();
        ccVarD.getClass();
        Set set = t87.q;
        byte b = 0;
        cg0 cg0Var = new cg0(b, 1, dg0Var.b);
        set.getClass();
        Set<ht2> set2 = set;
        ArrayList arrayList = new ArrayList(mv0.Z(set2, 10));
        for (ht2 ht2Var : set2) {
            yf0.m.getClass();
            String strA = yf0.a(ht2Var);
            InputStream inputStream = (InputStream) cg0Var.invoke(strA);
            if (inputStream == null) {
                hk0.l("Resource not found in classpath: ".concat(strA));
                return;
            }
            arrayList.add(g68.m(ht2Var, xd4Var, qs4Var2, inputStream));
        }
        cd5 cd5Var = new cd5(arrayList);
        j93 j93Var = new j93(xd4Var, qs4Var2);
        xk1 xk1Var = new xk1((Object) cd5Var, (byte) 3);
        yf0 yf0Var = yf0.m;
        io.sentry.android.replay.screenshot.k kVar = new io.sentry.android.replay.screenshot.k(xd4Var, qs4Var2, xk1Var, new cj3(qs4Var2, j93Var, yf0Var), cd5Var, iterableL, j93Var, ccVarD, rl5VarP, yf0Var.a, null, new rk5(xd4Var), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((eg0) it.next()).E0(kVar);
        }
        qs4Var.t = cd5Var;
        qs4 qs4Var3 = this.a;
        qs4Var3.getClass();
        qs4Var3.s = new d22(cx.g1(new qs4[]{qs4Var3}));
    }

    public cc d() {
        return d82.n;
    }

    public final g07 e() {
        g07 g07VarW = j("Any").W();
        if (g07VarW != null) {
            return g07VarW;
        }
        a(51);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    public final oz3 f(oz3 oz3Var) {
        js0 js0VarF;
        js0 js0Var;
        ns4 ns4VarQ;
        g07 g07VarW;
        if (oz3Var == null) {
            a(68);
            throw null;
        }
        if (y(oz3Var)) {
            if (oz3Var.m0().size() != 1) {
                throw new IllegalStateException();
            }
            oz3 oz3VarB = ((h58) oz3Var.m0().get(0)).b();
            if (oz3VarB != null) {
                return oz3VarB;
            }
            a(69);
            throw null;
        }
        m98 m98VarH = p58.h(oz3Var, false);
        oz3 oz3Var2 = (oz3) ((vy3) this.b.a()).b.get(m98VarH);
        if (oz3Var2 != null) {
            return oz3Var2;
        }
        int i = zo1.a;
        ys0 ys0VarA = m98VarH.o0().a();
        ps4 ps4VarE = ys0VarA == null ? null : zo1.e(ys0VarA);
        if (ps4VarE != null) {
            ys0 ys0VarA2 = m98VarH.o0().a();
            if (ys0VarA2 == null) {
                g07VarW = null;
            } else {
                Set set = h98.a;
                sy4 name = ys0VarA2.getName();
                name.getClass();
                if (!h98.d.contains(name) || (js0VarF = bp1.f(ys0VarA2)) == null || (js0Var = (js0) h98.b.get(js0VarF)) == null || (ns4VarQ = vs1.q(ps4VarE, js0Var)) == null) {
                    g07VarW = null;
                } else {
                    g07VarW = ns4VarQ.W();
                }
            }
            if (g07VarW != null) {
                return g07VarW;
            }
        }
        yq4.t(oz3Var, "not array: ");
        return null;
    }

    public final g07 g(m98 m98Var) {
        if (m98Var != null) {
            return h(ub8.f2197o, m98Var, yl7.p);
        }
        a(84);
        throw null;
    }

    public final g07 h(ub8 ub8Var, oz3 oz3Var, up upVar) {
        if (oz3Var != null) {
            return bt1.O(i67.C(upVar), j("Array"), Collections.singletonList(new w87(oz3Var, ub8Var)));
        }
        a(80);
        throw null;
    }

    public final ns4 i(ht2 ht2Var) {
        if (ht2Var == null) {
            a(12);
            throw null;
        }
        ns4 ns4VarS = yo1.S(k(), ht2Var);
        if (ns4VarS != null) {
            return ns4VarS;
        }
        a(13);
        throw null;
    }

    public final ns4 j(String str) {
        if (str != null) {
            return (ns4) this.c.invoke(sy4.e(str));
        }
        a(14);
        throw null;
    }

    public final qs4 k() {
        this.a.getClass();
        qs4 qs4Var = this.a;
        if (qs4Var != null) {
            return qs4Var;
        }
        a(7);
        throw null;
    }

    public Iterable l() {
        List listSingletonList = Collections.singletonList(new xf0(this.d, k()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final g07 m() {
        g07 g07VarO = o();
        if (g07VarO != null) {
            return g07VarO;
        }
        a(53);
        throw null;
    }

    public final g07 n() {
        g07 g07VarW = j("Nothing").W();
        if (g07VarW != null) {
            return g07VarW;
        }
        a(49);
        throw null;
    }

    public final g07 o() {
        g07 g07VarV0 = e().s0(true);
        if (g07VarV0 != null) {
            return g07VarV0;
        }
        a(52);
        throw null;
    }

    public rl5 p() {
        return z06.D;
    }

    public final g07 q(ps5 ps5Var) {
        if (ps5Var == null) {
            a(74);
            throw null;
        }
        g07 g07Var = (g07) ((vy3) this.b.a()).a.get(ps5Var);
        if (g07Var != null) {
            return g07Var;
        }
        a(75);
        throw null;
    }

    public final g07 s(ps5 ps5Var) {
        if (ps5Var == null) {
            a(54);
            throw null;
        }
        g07 g07VarW = j(ps5Var.m.b()).W();
        if (g07VarW != null) {
            return g07VarW;
        }
        a(55);
        throw null;
    }

    public final g07 u() {
        g07 g07VarW = j("String").W();
        if (g07VarW != null) {
            return g07VarW;
        }
        a(66);
        throw null;
    }

    public final ns4 v(int i) {
        return i(t87.f.c(sy4.e(gx2.c.b + i)));
    }

    public final g07 w() {
        g07 g07VarW = j("Unit").W();
        if (g07VarW != null) {
            return g07VarW;
        }
        a(65);
        throw null;
    }
}
