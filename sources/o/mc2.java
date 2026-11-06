package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mc2 extends as0 {
    public final ss0 s;
    public final lc2 t;
    public final f55 u;
    public final up v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc2(xd4 xd4Var, ns4 ns4Var, g07 g07Var, sy4 sy4Var, f55 f55Var, up upVar, s67 s67Var) {
        super(xd4Var, ns4Var, sy4Var, s67Var);
        if (xd4Var == null) {
            A0(6);
            throw null;
        }
        if (ns4Var == null) {
            A0(7);
            throw null;
        }
        if (g07Var == null) {
            A0(8);
            throw null;
        }
        if (f55Var == null) {
            A0(10);
            throw null;
        }
        this.v = upVar;
        this.s = new ss0(this, Collections.EMPTY_LIST, Collections.singleton(g07Var), xd4Var);
        this.t = new lc2(this, xd4Var);
        this.u = f55Var;
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case ep1.b /* 9 */:
                objArr[0] = "name";
                break;
            case 3:
            case ep1.c /* 10 */:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case ep1.d /* 12 */:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[1] = "getKind";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static mc2 C0(xd4 xd4Var, ns4 ns4Var, sy4 sy4Var, vd4 vd4Var, up upVar, s67 s67Var) {
        if (xd4Var == null) {
            A0(0);
            throw null;
        }
        if (ns4Var == null) {
            A0(1);
            throw null;
        }
        if (vd4Var != null) {
            return new mc2(xd4Var, ns4Var, ns4Var.W(), sy4Var, vd4Var, upVar, s67Var);
        }
        A0(3);
        throw null;
    }

    @Override // o.qo4
    public final boolean A() {
        return false;
    }

    @Override // o.ns4, o.qo4, o.ki1
    public final cp1 e() {
        cp1 cp1Var = dp1.e;
        if (cp1Var != null) {
            return cp1Var;
        }
        A0(20);
        throw null;
    }

    @Override // o.zs0
    public final boolean g() {
        return false;
    }

    @Override // o.so
    public final up getAnnotations() {
        up upVar = this.v;
        if (upVar != null) {
            return upVar;
        }
        A0(21);
        throw null;
    }

    @Override // o.qo4
    public final boolean h0() {
        return false;
    }

    @Override // o.ns4, o.zs0
    public final List k0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        A0(22);
        throw null;
    }

    @Override // o.ns4
    public final boolean m() {
        return false;
    }

    @Override // o.ns4
    public final Collection o0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        A0(23);
        throw null;
    }

    @Override // o.ns4
    public final zo4 p0() {
        return yo4.b;
    }

    @Override // o.ys0
    public final k48 q() {
        ss0 ss0Var = this.s;
        if (ss0Var != null) {
            return ss0Var;
        }
        A0(17);
        throw null;
    }

    @Override // o.ns4
    public final zo4 t0(uz3 uz3Var) {
        lc2 lc2Var = this.t;
        if (lc2Var != null) {
            return lc2Var;
        }
        A0(14);
        throw null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // o.ns4
    public final jb8 v0() {
        return null;
    }

    @Override // o.ns4
    public final boolean w0() {
        return false;
    }

    @Override // o.ns4
    public final boolean x0() {
        return false;
    }

    @Override // o.ns4
    public final boolean y0() {
        return false;
    }

    @Override // o.ns4
    public final boolean z0() {
        return false;
    }
}
