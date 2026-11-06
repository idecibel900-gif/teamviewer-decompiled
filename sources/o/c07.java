package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class c07 extends zw2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c07(fi1 fi1Var, c07 c07Var, up upVar, sy4 sy4Var, int i, s67 s67Var) {
        super(i, upVar, fi1Var, c07Var, sy4Var, s67Var);
        if (fi1Var == null) {
            z(0);
            throw null;
        }
        if (upVar == null) {
            z(1);
            throw null;
        }
        if (sy4Var == null) {
            z(2);
            throw null;
        }
        if (i == 0) {
            z(3);
            throw null;
        }
        if (s67Var != null) {
        } else {
            z(4);
            throw null;
        }
    }

    public static c07 N0(fi1 fi1Var, sy4 sy4Var, int i, s67 s67Var) {
        tp tpVar = yl7.p;
        if (sy4Var == null) {
            z(7);
            throw null;
        }
        if (i == 0) {
            z(8);
            throw null;
        }
        if (s67Var != null) {
            return new c07(fi1Var, null, tpVar, sy4Var, i, s67Var);
        }
        z(9);
        throw null;
    }

    public static /* synthetic */ void z(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case ep1.b /* 9 */:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case ep1.c /* 10 */:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case ep1.d /* 12 */:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case ep1.b /* 9 */:
                objArr[2] = "create";
                break;
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // o.zw2
    public zw2 E0(int i, up upVar, fi1 fi1Var, xw2 xw2Var, sy4 sy4Var, s67 s67Var) {
        if (fi1Var == null) {
            z(25);
            throw null;
        }
        if (i == 0) {
            z(26);
            throw null;
        }
        if (upVar == null) {
            z(27);
            throw null;
        }
        c07 c07Var = (c07) xw2Var;
        if (sy4Var == null) {
            sy4Var = getName();
        }
        return new c07(fi1Var, c07Var, upVar, sy4Var, i, s67Var);
    }

    @Override // o.zi0
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public c07 Y(fi1 fi1Var, as4 as4Var, cp1 cp1Var) {
        return (c07) D0(fi1Var, as4Var, cp1Var);
    }

    @Override // o.ii1, o.gi1, o.fi1
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final c07 a() {
        c07 c07Var = (c07) super.a();
        if (c07Var != null) {
            return c07Var;
        }
        z(24);
        throw null;
    }

    @Override // o.zw2
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final c07 H0(v14 v14Var, v14 v14Var2, List list, List list2, List list3, oz3 oz3Var, as4 as4Var, cp1 cp1Var) {
        if (list == null) {
            z(14);
            throw null;
        }
        if (list2 == null) {
            z(15);
            throw null;
        }
        if (list3 == null) {
            z(16);
            throw null;
        }
        if (cp1Var != null) {
            return Q0(v14Var, v14Var2, list, list2, list3, oz3Var, as4Var, cp1Var, null);
        }
        z(17);
        throw null;
    }

    public c07 Q0(v14 v14Var, v14 v14Var2, List list, List list2, List list3, oz3 oz3Var, as4 as4Var, cp1 cp1Var, Map map) {
        if (list == null) {
            z(19);
            throw null;
        }
        if (list2 == null) {
            z(20);
            throw null;
        }
        if (list3 == null) {
            z(21);
            throw null;
        }
        if (cp1Var == null) {
            z(22);
            throw null;
        }
        super.H0(v14Var, v14Var2, list, list2, list3, oz3Var, as4Var, cp1Var);
        if (map != null && !map.isEmpty()) {
            this.O = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // o.zw2, o.xw2
    public ww2 g0() {
        return I0(m58.b);
    }
}
