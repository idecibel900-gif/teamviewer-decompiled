package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class gw4 extends as0 {
    public final ms0 s;
    public as4 t;
    public cp1 u;
    public ss0 v;
    public ArrayList w;
    public final ArrayList x;
    public final xd4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw4(ha2 ha2Var, sy4 sy4Var, xd4 xd4Var) {
        super(xd4Var, ha2Var, sy4Var, s67.h);
        if (sy4Var == null) {
            A0(2);
            throw null;
        }
        if (xd4Var == null) {
            A0(4);
            throw null;
        }
        this.x = new ArrayList();
        this.y = xd4Var;
        this.s = ms0.n;
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 15:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case ep1.b /* 9 */:
            case ep1.d /* 12 */:
            case 14:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 15:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                i2 = 2;
                break;
            case 6:
            case ep1.b /* 9 */:
            case ep1.d /* 12 */:
            case 14:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 15:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case ep1.b /* 9 */:
                objArr[0] = "visibility";
                break;
            case ep1.d /* 12 */:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case ep1.b /* 9 */:
            case ep1.d /* 12 */:
            case 14:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case ep1.c /* 10 */:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[1] = "getStaticScope";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 15:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case ep1.b /* 9 */:
                objArr[2] = "setVisibility";
                break;
            case ep1.d /* 12 */:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 15:
            case 17:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                throw new IllegalStateException(str2);
            case 6:
            case ep1.b /* 9 */:
            case ep1.d /* 12 */:
            case 14:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // o.qo4
    public final boolean A() {
        return false;
    }

    @Override // o.ns4, o.qo4, o.ki1
    public final cp1 e() {
        cp1 cp1Var = this.u;
        if (cp1Var != null) {
            return cp1Var;
        }
        A0(10);
        throw null;
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
        ms0 ms0Var = this.s;
        if (ms0Var != null) {
            return ms0Var;
        }
        A0(8);
        throw null;
    }

    @Override // o.ns4, o.zs0
    public final List k0() {
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            return arrayList;
        }
        A0(15);
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
        A0(19);
        throw null;
    }

    @Override // o.ns4
    public final zo4 p0() {
        return yo4.b;
    }

    @Override // o.ys0
    public final k48 q() {
        ss0 ss0Var = this.v;
        if (ss0Var != null) {
            return ss0Var;
        }
        A0(11);
        throw null;
    }

    @Override // o.ns4, o.qo4
    public final as4 r() {
        as4 as4Var = this.t;
        if (as4Var != null) {
            return as4Var;
        }
        A0(7);
        throw null;
    }

    public final String toString() {
        return gi1.B0(this);
    }

    @Override // o.ns4
    public final wr0 u0() {
        return null;
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
    public final Collection z() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        A0(13);
        throw null;
    }

    @Override // o.ns4
    public final boolean z0() {
        return false;
    }
}
