package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class du5 extends tb8 implements bu5 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public List E;
    public v14 F;
    public v14 G;
    public ArrayList H;
    public eu5 I;
    public ju5 J;
    public xi2 K;
    public xi2 L;
    public final boolean r;
    public ud4 s;
    public Function0 t;
    public final as4 u;
    public cp1 v;
    public Collection w;
    public final bu5 x;
    public final int y;
    public final boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du5(fi1 fi1Var, bu5 bu5Var, up upVar, as4 as4Var, cp1 cp1Var, boolean z, sy4 sy4Var, int i, s67 s67Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(fi1Var, upVar, sy4Var, null, s67Var);
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
        if (i == 0) {
            z(5);
            throw null;
        }
        if (s67Var == null) {
            z(6);
            throw null;
        }
        this.r = z;
        this.w = null;
        this.E = Collections.EMPTY_LIST;
        this.u = as4Var;
        this.v = cp1Var;
        this.x = bu5Var == null ? this : bu5Var;
        this.y = i;
        this.z = z2;
        this.A = z3;
        this.B = z4;
        this.C = z5;
        this.D = z6;
    }

    public static du5 E0(fi1 fi1Var, as4 as4Var, cp1 cp1Var, boolean z, sy4 sy4Var, int i, s67 s67Var) {
        tp tpVar = yl7.p;
        if (fi1Var == null) {
            z(7);
            throw null;
        }
        if (cp1Var == null) {
            z(10);
            throw null;
        }
        if (sy4Var == null) {
            z(11);
            throw null;
        }
        if (i == 0) {
            z(12);
            throw null;
        }
        if (s67Var != null) {
            return new du5(fi1Var, null, tpVar, as4Var, cp1Var, z, sy4Var, i, s67Var, false, false, false, false, false);
        }
        z(13);
        throw null;
    }

    public static xw2 G0(m58 m58Var, zt5 zt5Var) {
        if (zt5Var == null) {
            z(31);
            throw null;
        }
        xw2 xw2Var = zt5Var.x;
        if (xw2Var != null) {
            return xw2Var.d(m58Var);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public static /* synthetic */ void z(int i) {
        String str;
        int i2;
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case ep1.b /* 9 */:
                objArr[0] = "modality";
                break;
            case 3:
            case ep1.c /* 10 */:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case ep1.d /* 12 */:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[0] = "typeParameters";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // o.qo4
    public final boolean A() {
        return this.B;
    }

    @Override // o.bu5
    public final boolean C() {
        return this.D;
    }

    @Override // o.zi0
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final du5 Y(fi1 fi1Var, as4 as4Var, cp1 cp1Var) {
        cu5 cu5Var = new cu5(this);
        cu5Var.a = fi1Var;
        cu5Var.d = null;
        cu5Var.b = as4Var;
        if (cp1Var != null) {
            cu5Var.c = cp1Var;
            cu5Var.e = 2;
            cu5Var.g = false;
            du5 du5VarA = cu5Var.a();
            if (du5VarA != null) {
                return du5VarA;
            }
            z(42);
            throw null;
        }
        Object[] objArr = new Object[3];
        switch (8) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case ep1.b /* 9 */:
            case 11:
            case 13:
            case 14:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case ep1.c /* 10 */:
                objArr[0] = "kind";
                break;
            case ep1.d /* 12 */:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        switch (8) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case ep1.b /* 9 */:
            case 11:
            case 13:
            case 14:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case ep1.c /* 10 */:
                objArr[2] = "setKind";
                break;
            case ep1.d /* 12 */:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public du5 F0(fi1 fi1Var, as4 as4Var, cp1 cp1Var, bu5 bu5Var, int i, sy4 sy4Var) {
        if (fi1Var == null) {
            z(32);
            throw null;
        }
        if (as4Var == null) {
            z(33);
            throw null;
        }
        if (cp1Var == null) {
            z(34);
            throw null;
        }
        if (i == 0) {
            z(35);
            throw null;
        }
        if (sy4Var == null) {
            z(36);
            throw null;
        }
        return new du5(fi1Var, bu5Var, getAnnotations(), as4Var, cp1Var, this.r, sy4Var, i, s67.h, this.z, s(), this.B, p(), this.D);
    }

    @Override // o.sb8
    public final u51 H() {
        ud4 ud4Var = this.s;
        if (ud4Var != null) {
            return (u51) ud4Var.a();
        }
        return null;
    }

    public final void H0(eu5 eu5Var, ju5 ju5Var, xi2 xi2Var, xi2 xi2Var2) {
        this.I = eu5Var;
        this.J = ju5Var;
        this.K = xi2Var;
        this.L = xi2Var2;
    }

    public final void I0(ud4 ud4Var, Function0 function0) {
        if (function0 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.t = function0;
        if (ud4Var == null) {
            ud4Var = (ud4) function0.a();
        }
        this.s = ud4Var;
    }

    public void J0(oz3 oz3Var) {
    }

    public final void K0(oz3 oz3Var, List list, v14 v14Var, v14 v14Var2, List list2) {
        if (oz3Var == null) {
            z(17);
            throw null;
        }
        if (list == null) {
            z(18);
            throw null;
        }
        if (list2 == null) {
            z(19);
            throw null;
        }
        this.q = oz3Var;
        this.H = new ArrayList(list);
        this.G = v14Var2;
        this.F = v14Var;
        this.E = list2;
    }

    @Override // o.tb8, o.xi0
    public final v14 O() {
        return this.F;
    }

    @Override // o.xi0
    public Object Q(sp1 sp1Var) {
        return null;
    }

    @Override // o.sb8
    public final boolean R() {
        return this.r;
    }

    @Override // o.tb8, o.xi0
    public final v14 S() {
        return this.G;
    }

    @Override // o.bu5
    public final xi2 T() {
        return this.L;
    }

    @Override // o.bu5
    public final xi2 V() {
        return this.K;
    }

    @Override // o.xi0
    public final List X() {
        List list = this.E;
        if (list != null) {
            return list;
        }
        z(22);
        throw null;
    }

    @Override // o.sb8
    public final boolean Z() {
        return this.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [o.bu5] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // o.ii1, o.gi1, o.fi1
    public final bu5 a() {
        bu5 bu5VarA;
        bu5 bu5Var = this.x;
        ?? r1 = this;
        if (bu5Var != this) {
            bu5VarA = bu5Var.a();
        }
        if (r1 != 0) {
            r1 = bu5VarA;
            return r1;
        }
        r1 = bu5VarA;
        z(38);
        throw null;
    }

    @Override // o.bu5
    public final ju5 b() {
        return this.J;
    }

    @Override // o.ie7
    public final bu5 d(m58 m58Var) {
        if (m58Var == null) {
            z(27);
            throw null;
        }
        k58 k58Var = m58Var.a;
        if (k58Var.e()) {
            return this;
        }
        cu5 cu5Var = new cu5(this);
        cu5Var.f = k58Var;
        cu5Var.d = a();
        return cu5Var.a();
    }

    @Override // o.zi0
    public final void d0(Collection collection) {
        if (collection != null) {
            this.w = collection;
        } else {
            z(40);
            throw null;
        }
    }

    @Override // o.ki1
    public final cp1 e() {
        cp1 cp1Var = this.v;
        if (cp1Var != null) {
            return cp1Var;
        }
        z(25);
        throw null;
    }

    @Override // o.bu5
    public final eu5 getGetter() {
        return this.I;
    }

    @Override // o.tb8, o.xi0
    public final oz3 getReturnType() {
        oz3 type = getType();
        if (type != null) {
            return type;
        }
        z(23);
        throw null;
    }

    @Override // o.tb8, o.xi0
    public final List getTypeParameters() {
        ArrayList arrayList = this.H;
        if (arrayList != null) {
            return arrayList;
        }
        yq4.t(this, "typeParameters == null for ");
        return null;
    }

    @Override // o.qo4
    public final boolean h0() {
        return false;
    }

    @Override // o.xi0, o.zi0
    public final Collection j() {
        Collection collection = this.w;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        z(41);
        throw null;
    }

    @Override // o.zi0
    public final int k() {
        int i = this.y;
        if (i != 0) {
            return i;
        }
        z(39);
        throw null;
    }

    @Override // o.bu5
    public final ArrayList n() {
        ArrayList arrayList = new ArrayList(2);
        eu5 eu5Var = this.I;
        if (eu5Var != null) {
            arrayList.add(eu5Var);
        }
        ju5 ju5Var = this.J;
        if (ju5Var != null) {
            arrayList.add(ju5Var);
        }
        return arrayList;
    }

    @Override // o.fi1
    public final Object o(ji1 ji1Var, Object obj) {
        return ji1Var.i(this, obj);
    }

    public boolean p() {
        return this.C;
    }

    @Override // o.qo4
    public final as4 r() {
        as4 as4Var = this.u;
        if (as4Var != null) {
            return as4Var;
        }
        z(24);
        throw null;
    }

    @Override // o.sb8
    public boolean s() {
        return this.A;
    }
}
