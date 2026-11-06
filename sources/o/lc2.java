package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class lc2 extends ap4 {
    public final sd4 b;
    public final sd4 c;
    public final vd4 d;
    public final /* synthetic */ mc2 e;

    public lc2(mc2 mc2Var, xd4 xd4Var) {
        byte b = 0;
        if (xd4Var == null) {
            h(0);
            throw null;
        }
        this.e = mc2Var;
        this.b = xd4Var.b(new kc2(this, b));
        this.c = xd4Var.b(new kc2(this, (byte) 1));
        this.d = new vd4(xd4Var, new a3(this, (byte) 12));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public static /* synthetic */ void h(int i) {
        String str;
        int i2;
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                case 17:
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                case 17:
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
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
            case 1:
            case 4:
            case 5:
            case 8:
            case ep1.c /* 10 */:
                objArr[0] = "name";
                break;
            case 2:
            case 6:
                objArr[0] = "location";
                break;
            case 3:
            case 7:
            case ep1.b /* 9 */:
            case ep1.d /* 12 */:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            case 11:
                objArr[0] = "fromSupertypes";
                break;
            case 13:
                objArr[0] = "kindFilter";
                break;
            case 14:
                objArr[0] = "nameFilter";
                break;
            case 20:
                objArr[0] = "p";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 3) {
            objArr[1] = "getContributedVariables";
        } else if (i == 7) {
            objArr[1] = "getContributedFunctions";
        } else if (i == 9) {
            objArr[1] = "getSupertypeScope";
        } else if (i != 12) {
            switch (i) {
                case 15:
                    objArr[1] = "getContributedDescriptors";
                    break;
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    objArr[1] = "computeAllDeclarations";
                    break;
                case 17:
                    objArr[1] = "getFunctionNames";
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    objArr[1] = "getClassifierNames";
                    break;
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    objArr[1] = "getVariableNames";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
            }
        } else {
            objArr[1] = "resolveFakeOverrides";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "getContributedVariables";
                break;
            case 3:
            case 7:
            case ep1.b /* 9 */:
            case ep1.d /* 12 */:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                break;
            case 4:
                objArr[2] = "computeProperties";
                break;
            case 5:
            case 6:
                objArr[2] = "getContributedFunctions";
                break;
            case 8:
                objArr[2] = "computeFunctions";
                break;
            case ep1.c /* 10 */:
            case 11:
                objArr[2] = "resolveFakeOverrides";
                break;
            case 13:
            case 14:
                objArr[2] = "getContributedDescriptors";
                break;
            case 20:
                objArr[2] = "printScopeStructure";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                case 17:
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // o.ap4, o.zo4
    public final Collection a(sy4 sy4Var, t35 t35Var) {
        if (sy4Var != null) {
            return (Collection) this.b.invoke(sy4Var);
        }
        h(5);
        throw null;
    }

    @Override // o.ap4, o.zo4
    public final Set b() {
        Set set = (Set) this.e.u.a();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // o.ap4, o.zo4
    public final Set c() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    @Override // o.ap4, o.zo4
    public final Collection d(sy4 sy4Var, t35 t35Var) {
        if (sy4Var != null) {
            return (Collection) this.c.invoke(sy4Var);
        }
        h(1);
        throw null;
    }

    @Override // o.ap4, o.zo4
    public final Collection e(no1 no1Var, Function1 function1) {
        if (no1Var == null) {
            h(13);
            throw null;
        }
        Collection collection = (Collection) this.d.a();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override // o.ap4, o.zo4
    public final Set f() {
        Set set = (Set) this.e.u.a();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    public final zo4 i() {
        zo4 zo4VarI = ((oz3) ((d3) this.e.q()).b().iterator().next()).I();
        if (zo4VarI != null) {
            return zo4VarI;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(sy4 sy4Var, Collection collection) {
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        hc5.c.h(sy4Var, collection, Collections.EMPTY_SET, this.e, new mp1(linkedHashSet, (byte) 1));
        return linkedHashSet;
    }
}
