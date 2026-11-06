package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class cs0 extends as0 {
    public final as4 s;
    public final ms0 t;
    public final ss0 u;
    public zo4 v;
    public Set w;
    public wr0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs0(fi1 fi1Var, sy4 sy4Var, as4 as4Var, ms0 ms0Var, Collection collection, xd4 xd4Var) {
        super(xd4Var, fi1Var, sy4Var, s67.h);
        if (fi1Var == null) {
            A0(0);
            throw null;
        }
        if (sy4Var == null) {
            A0(1);
            throw null;
        }
        if (xd4Var == null) {
            A0(6);
            throw null;
        }
        this.s = as4Var;
        this.t = ms0Var;
        this.u = new ss0(this, Collections.EMPTY_LIST, collection, xd4Var);
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        switch (i) {
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case ep1.d /* 12 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                i2 = 2;
                break;
            case ep1.d /* 12 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case ep1.d /* 12 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case ep1.b /* 9 */:
                objArr[1] = "getAnnotations";
                break;
            case ep1.c /* 10 */:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case ep1.d /* 12 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                break;
            case ep1.d /* 12 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                throw new IllegalStateException(str2);
            case ep1.d /* 12 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // o.qo4
    public final boolean A() {
        return false;
    }

    public final void C0(zo4 zo4Var, Set set, wr0 wr0Var) {
        this.v = zo4Var;
        this.w = set;
        this.x = wr0Var;
    }

    @Override // o.zs0
    public final boolean g() {
        return false;
    }

    @Override // o.so
    public final up getAnnotations() {
        return yl7.p;
    }

    @Override // o.qo4
    public final boolean h0() {
        return false;
    }

    @Override // o.ns4
    public final ms0 i0() {
        ms0 ms0Var = this.t;
        if (ms0Var != null) {
            return ms0Var;
        }
        A0(15);
        throw null;
    }

    @Override // o.ys0
    public final k48 q() {
        ss0 ss0Var = this.u;
        if (ss0Var != null) {
            return ss0Var;
        }
        A0(10);
        throw null;
    }

    @Override // o.ns4, o.qo4
    public final as4 r() {
        as4 as4Var = this.s;
        if (as4Var != null) {
            return as4Var;
        }
        A0(16);
        throw null;
    }

    @Override // o.ns4
    public final zo4 t0(uz3 uz3Var) {
        zo4 zo4Var = this.v;
        if (zo4Var != null) {
            return zo4Var;
        }
        A0(13);
        throw null;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // o.ns4
    public final wr0 u0() {
        return this.x;
    }

    @Override // o.ns4
    public final Collection z() {
        Set set = this.w;
        if (set != null) {
            return set;
        }
        A0(11);
        throw null;
    }
}
