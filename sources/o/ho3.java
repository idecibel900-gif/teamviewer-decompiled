package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class ho3 extends du5 implements tn3 {
    public final boolean M;
    public final vd5 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho3(fi1 fi1Var, up upVar, as4 as4Var, cp1 cp1Var, boolean z, sy4 sy4Var, s67 s67Var, bu5 bu5Var, int i, boolean z2, vd5 vd5Var) {
        super(fi1Var, bu5Var, upVar, as4Var, cp1Var, z, sy4Var, i, s67Var, false, false, false, false, false);
        if (fi1Var == null) {
            z(0);
            throw null;
        }
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
        if (sy4Var == null) {
            z(4);
            throw null;
        }
        if (s67Var == null) {
            z(5);
            throw null;
        }
        if (i == 0) {
            z(6);
            throw null;
        }
        this.M = z2;
        this.N = vd5Var;
    }

    public static ho3 L0(fi1 fi1Var, z14 z14Var, cp1 cp1Var, boolean z, sy4 sy4Var, ng6 ng6Var, boolean z2) {
        if (fi1Var == null) {
            z(7);
            throw null;
        }
        if (sy4Var != null) {
            return new ho3(fi1Var, z14Var, as4.n, cp1Var, z, sy4Var, ng6Var, null, 1, z2, null);
        }
        z(11);
        throw null;
    }

    public static /* synthetic */ void z(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 21 ? 3 : 2];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case ep1.b /* 9 */:
                objArr[0] = "modality";
                break;
            case 3:
            case ep1.c /* 10 */:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case ep1.d /* 12 */:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[0] = "source";
                break;
            case 6:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // o.tn3
    public final tn3 F(oz3 oz3Var, ArrayList arrayList, oz3 oz3Var2, vd5 vd5Var) {
        oz3 oz3Var3;
        eu5 eu5Var;
        ju5 ju5Var;
        bu5 bu5VarA = a() == this ? null : a();
        ho3 ho3Var = new ho3(i(), getAnnotations(), r(), e(), this.r, getName(), c(), bu5VarA, k(), this.M, vd5Var);
        eu5 eu5Var2 = this.I;
        if (eu5Var2 != null) {
            eu5 eu5Var3 = new eu5(ho3Var, eu5Var2.getAnnotations(), eu5Var2.r(), eu5Var2.e(), eu5Var2.q, eu5Var2.r, eu5Var2.u, k(), bu5VarA == null ? null : bu5VarA.getGetter(), eu5Var2.c());
            eu5Var3.x = eu5Var2.x;
            oz3Var3 = oz3Var2;
            eu5Var3.y = oz3Var3;
            eu5Var = eu5Var3;
        } else {
            oz3Var3 = oz3Var2;
            eu5Var = null;
        }
        ju5 ju5Var2 = this.J;
        if (ju5Var2 != null) {
            ju5Var = new ju5(ho3Var, ju5Var2.getAnnotations(), ju5Var2.r(), ju5Var2.e(), ju5Var2.q, ju5Var2.r, ju5Var2.u, k(), bu5VarA == null ? null : bu5VarA.b(), ju5Var2.c());
            ju5Var.x = ju5Var.x;
            qb8 qb8Var = (qb8) ju5Var2.J().get(0);
            if (qb8Var == null) {
                ju5.z(6);
                throw null;
            }
            ju5Var.y = qb8Var;
        } else {
            ju5Var = null;
        }
        ho3Var.H0(eu5Var, ju5Var, this.K, this.L);
        Function0 function0 = this.t;
        if (function0 != null) {
            ho3Var.I0(this.s, function0);
        }
        ho3Var.d0(j());
        ho3Var.K0(oz3Var3, getTypeParameters(), this.F, oz3Var != null ? io1.O(this, oz3Var, yl7.p) : null, ea2.m);
        return ho3Var;
    }

    @Override // o.du5
    public final du5 F0(fi1 fi1Var, as4 as4Var, cp1 cp1Var, bu5 bu5Var, int i, sy4 sy4Var) {
        if (fi1Var == null) {
            z(13);
            throw null;
        }
        if (as4Var == null) {
            z(14);
            throw null;
        }
        if (cp1Var == null) {
            z(15);
            throw null;
        }
        if (i == 0) {
            z(16);
            throw null;
        }
        if (sy4Var == null) {
            z(17);
            throw null;
        }
        return new ho3(fi1Var, getAnnotations(), as4Var, cp1Var, this.r, sy4Var, s67.h, bu5Var, i, this.M, this.N);
    }

    @Override // o.du5
    public final void J0(oz3 oz3Var) {
    }

    @Override // o.du5, o.xi0
    public final Object Q(sp1 sp1Var) {
        vd5 vd5Var = this.N;
        if (vd5Var == null || !((sp1) vd5Var.m).equals(sp1Var)) {
            return null;
        }
        return vd5Var.n;
    }

    @Override // o.du5, o.sb8
    public final boolean s() {
        oz3 type = getType();
        if (!this.M) {
            return false;
        }
        type.getClass();
        if (((!wy3.F(type) && !h98.a(type)) || p58.e(type)) && !wy3.G(type)) {
            return false;
        }
        wp wpVar = u48.a;
        ht2 ht2Var = tr3.p;
        ht2Var.getClass();
        return !db8.F(type, ht2Var) || wy3.G(type);
    }

    @Override // o.tb8, o.xi0
    public final boolean x() {
        return false;
    }
}
