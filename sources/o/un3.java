package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class un3 extends wr0 implements tn3 {
    public Boolean Q;
    public Boolean R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un3(ns4 ns4Var, un3 un3Var, up upVar, boolean z, int i, s67 s67Var) {
        super(ns4Var, un3Var, upVar, z, i, s67Var);
        if (ns4Var == null) {
            z(0);
            throw null;
        }
        if (upVar == null) {
            z(1);
            throw null;
        }
        if (i == 0) {
            z(2);
            throw null;
        }
        if (s67Var == null) {
            z(3);
            throw null;
        }
        this.Q = null;
        this.R = null;
    }

    public static un3 S0(ns4 ns4Var, up upVar, boolean z, ng6 ng6Var) {
        if (ns4Var != null) {
            return new un3(ns4Var, null, upVar, z, 1, ng6Var);
        }
        z(4);
        throw null;
    }

    public static /* synthetic */ void z(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
        switch (i) {
            case 1:
            case 5:
            case ep1.b /* 9 */:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case ep1.c /* 10 */:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case ep1.d /* 12 */:
                objArr[0] = "newOwner";
                break;
            case 11:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                break;
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // o.wr0, o.zw2
    public final /* bridge */ /* synthetic */ zw2 E0(int i, up upVar, fi1 fi1Var, xw2 xw2Var, sy4 sy4Var, s67 s67Var) {
        return T0(fi1Var, xw2Var, i, upVar, s67Var);
    }

    @Override // o.tn3
    public final tn3 F(oz3 oz3Var, ArrayList arrayList, oz3 oz3Var2, vd5 vd5Var) {
        un3 un3VarT0 = T0(i(), null, k(), getAnnotations(), c());
        un3VarT0.H0(oz3Var == null ? null : io1.O(un3VarT0, oz3Var, yl7.p), this.v, ea2.m, getTypeParameters(), r47.l(arrayList, J(), un3VarT0), oz3Var2, r(), e());
        if (vd5Var != null) {
            sp1 sp1Var = (sp1) vd5Var.m;
            Object obj = vd5Var.n;
            Map linkedHashMap = un3VarT0.O;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                un3VarT0.O = linkedHashMap;
            }
            linkedHashMap.put(sp1Var, obj);
        }
        return un3VarT0;
    }

    @Override // o.zw2
    public final void J0(boolean z) {
        this.Q = Boolean.valueOf(z);
    }

    @Override // o.zw2
    public final void K0(boolean z) {
        this.R = Boolean.valueOf(z);
    }

    @Override // o.wr0
    /* JADX INFO: renamed from: M0 */
    public final /* bridge */ /* synthetic */ wr0 E0(int i, up upVar, fi1 fi1Var, xw2 xw2Var, sy4 sy4Var, s67 s67Var) {
        return T0(fi1Var, xw2Var, i, upVar, s67Var);
    }

    public final un3 T0(fi1 fi1Var, xw2 xw2Var, int i, up upVar, s67 s67Var) {
        if (fi1Var == null) {
            z(7);
            throw null;
        }
        if (i == 0) {
            z(8);
            throw null;
        }
        if (upVar == null) {
            z(9);
            throw null;
        }
        if (s67Var == null) {
            z(10);
            throw null;
        }
        if (i != 1 && i != 4) {
            StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            sb.append("\nnewOwner: ");
            sb.append(fi1Var);
            String strD = ua5.D(i);
            sb.append("\nkind: ");
            sb.append(strD);
            throw new IllegalStateException(sb.toString());
        }
        ns4 ns4Var = (ns4) fi1Var;
        un3 un3Var = (un3) xw2Var;
        if (i == 0) {
            z(13);
            throw null;
        }
        un3 un3Var2 = new un3(ns4Var, un3Var, upVar, this.P, i, s67Var);
        Boolean bool = this.Q;
        bool.getClass();
        un3Var2.Q = bool;
        Boolean bool2 = this.R;
        bool2.getClass();
        un3Var2.R = bool2;
        return un3Var2;
    }

    @Override // o.zw2, o.xi0
    public final boolean x() {
        return this.R.booleanValue();
    }
}
