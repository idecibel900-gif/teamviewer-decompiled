package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class wr0 extends zw2 implements z61 {
    public final boolean P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr0(ns4 ns4Var, z61 z61Var, up upVar, boolean z, int i, s67 s67Var) {
        super(i, upVar, ns4Var, z61Var, a87.e, s67Var);
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
        this.P = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public static /* synthetic */ void z(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
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
        if (i != 21 && i != 27) {
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
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case ep1.b /* 9 */:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case ep1.c /* 10 */:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case ep1.d /* 12 */:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                    objArr[1] = "getConstructedClass";
                    break;
                case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case ep1.b /* 9 */:
                objArr[2] = "createSynthesized";
                break;
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 21 && i != 27) {
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

    @Override // o.zw2
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public wr0 E0(int i, up upVar, fi1 fi1Var, xw2 xw2Var, sy4 sy4Var, s67 s67Var) {
        if (fi1Var == null) {
            z(23);
            throw null;
        }
        if (i == 0) {
            z(24);
            throw null;
        }
        if (upVar == null) {
            z(25);
            throw null;
        }
        if (i == 1 || i == 4) {
            return new wr0((ns4) fi1Var, this, upVar, this.P, 1, s67Var);
        }
        StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
        sb.append(this);
        sb.append("\nnewOwner: ");
        sb.append(fi1Var);
        String strD = ua5.D(i);
        sb.append("\nkind: ");
        sb.append(strD);
        throw new IllegalStateException(sb.toString());
    }

    @Override // o.ii1, o.fi1
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final ns4 i() {
        ns4 ns4Var = (ns4) super.i();
        if (ns4Var != null) {
            return ns4Var;
        }
        z(17);
        throw null;
    }

    @Override // o.ii1, o.gi1, o.fi1
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final wr0 a() {
        wr0 wr0Var = (wr0) super.a();
        if (wr0Var != null) {
            return wr0Var;
        }
        z(19);
        throw null;
    }

    public final void P0(List list, cp1 cp1Var) {
        if (list == null) {
            z(13);
            throw null;
        }
        if (cp1Var != null) {
            Q0(list, cp1Var, i().k0());
        } else {
            z(14);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public final void Q0(List list, cp1 cp1Var, List list2) {
        v14 v14VarQ0;
        List listE0;
        if (list == null) {
            z(10);
            throw null;
        }
        if (cp1Var == null) {
            z(11);
            throw null;
        }
        if (list2 == null) {
            z(12);
            throw null;
        }
        ns4 ns4VarI = i();
        if (ns4VarI.g()) {
            fi1 fi1VarI = ns4VarI.i();
            if (fi1VarI instanceof ns4) {
                v14VarQ0 = ((ns4) fi1VarI).q0();
            } else {
                v14VarQ0 = null;
            }
        } else {
            v14VarQ0 = null;
        }
        ns4 ns4VarI2 = i();
        if (ns4VarI2.e0().isEmpty()) {
            listE0 = Collections.EMPTY_LIST;
            if (listE0 == null) {
                z(16);
                throw null;
            }
        } else {
            listE0 = ns4VarI2.e0();
            if (listE0 == null) {
                z(15);
                throw null;
            }
        }
        H0(null, v14VarQ0, listE0, list2, list, null, as4.n, cp1Var);
    }

    @Override // o.zw2, o.xw2, o.ie7
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final wr0 d(m58 m58Var) {
        if (m58Var != null) {
            return (wr0) super.d(m58Var);
        }
        z(20);
        throw null;
    }

    @Override // o.zi0
    public final zi0 Y(fi1 fi1Var, as4 as4Var, cp1 cp1Var) {
        return (wr0) D0(fi1Var, as4Var, cp1Var);
    }

    @Override // o.zw2, o.zi0
    public final void d0(Collection collection) {
        if (collection != null) {
            return;
        }
        z(22);
        throw null;
    }

    @Override // o.zw2, o.zi0
    public final Collection j() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        z(21);
        throw null;
    }

    @Override // o.zw2, o.fi1
    public final Object o(ji1 ji1Var, Object obj) {
        return ji1Var.z(this, obj);
    }

    @Override // o.z61
    public final boolean t() {
        return this.P;
    }

    @Override // o.z61
    public final ns4 u() {
        ns4 ns4VarI = i();
        if (ns4VarI != null) {
            return ns4VarI;
        }
        z(18);
        throw null;
    }
}
