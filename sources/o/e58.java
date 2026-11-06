package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e58 extends g3 {
    public final ArrayList w;
    public boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e58(int i, up upVar, fi1 fi1Var, xd4 xd4Var, sy4 sy4Var, ub8 ub8Var, boolean z) {
        super(i, upVar, fi1Var, xd4Var, sy4Var, ub8Var, z);
        if (fi1Var == null) {
            z(19);
            throw null;
        }
        if (upVar == null) {
            z(20);
            throw null;
        }
        if (ub8Var == null) {
            z(21);
            throw null;
        }
        if (sy4Var == null) {
            z(22);
            throw null;
        }
        if (xd4Var == null) {
            z(25);
            throw null;
        }
        this.w = new ArrayList(1);
        this.x = false;
    }

    public static e58 F0(int i, up upVar, fi1 fi1Var, xd4 xd4Var, sy4 sy4Var, ub8 ub8Var, boolean z) {
        if (fi1Var == null) {
            z(6);
            throw null;
        }
        if (upVar == null) {
            z(7);
            throw null;
        }
        if (ub8Var == null) {
            z(8);
            throw null;
        }
        if (sy4Var == null) {
            z(9);
            throw null;
        }
        if (xd4Var != null) {
            return new e58(i, upVar, fi1Var, xd4Var, sy4Var, ub8Var, z);
        }
        z(11);
        throw null;
    }

    public static e58 G0(d0 d0Var, ub8 ub8Var, sy4 sy4Var, int i, xd4 xd4Var) {
        tp tpVar = yl7.p;
        if (xd4Var == null) {
            z(4);
            throw null;
        }
        e58 e58VarF0 = F0(i, tpVar, d0Var, xd4Var, sy4Var, ub8Var, false);
        g07 g07VarM = bp1.e(d0Var).m();
        if (e58VarF0.x) {
            hk0.l("Type parameter descriptor is already initialized: ".concat(e58VarF0.H0()));
            return null;
        }
        if (!ct1.K(g07VarM)) {
            e58VarF0.w.add(g07VarM);
        }
        if (e58VarF0.x) {
            hk0.l("Type parameter descriptor is already initialized: ".concat(e58VarF0.H0()));
            return null;
        }
        e58VarF0.x = true;
        return e58VarF0;
    }

    public static /* synthetic */ void z(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case ep1.b /* 9 */:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case ep1.d /* 12 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case ep1.c /* 10 */:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[2] = "createForFurtherModification";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // o.g3
    public final List E0() {
        if (!this.x) {
            hk0.l("Type parameter descriptor is not initialized: ".concat(H0()));
            return null;
        }
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            return arrayList;
        }
        z(28);
        throw null;
    }

    public final String H0() {
        return getName() + " declared in " + zo1.g(i());
    }
}
