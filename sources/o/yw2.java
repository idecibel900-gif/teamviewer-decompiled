package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yw2 implements ww2 {
    public boolean A;
    public boolean B;
    public boolean C;
    public List D;
    public up E;
    public boolean F;
    public final LinkedHashMap G;
    public Boolean H;
    public boolean I;
    public final /* synthetic */ zw2 J;
    public k58 m;
    public fi1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public as4 f2650o;
    public cp1 p;
    public xw2 q;
    public int r;
    public List s;
    public final List t;
    public v14 u;
    public v14 v;
    public oz3 w;
    public sy4 x;
    public boolean y;
    public boolean z;

    public yw2(zw2 zw2Var, k58 k58Var, fi1 fi1Var, as4 as4Var, cp1 cp1Var, int i, List list, List list2, v14 v14Var, oz3 oz3Var) {
        if (k58Var == null) {
            a(0);
            throw null;
        }
        if (fi1Var == null) {
            a(1);
            throw null;
        }
        if (as4Var == null) {
            a(2);
            throw null;
        }
        if (cp1Var == null) {
            a(3);
            throw null;
        }
        if (i == 0) {
            a(4);
            throw null;
        }
        if (list == null) {
            a(5);
            throw null;
        }
        if (list2 == null) {
            a(6);
            throw null;
        }
        if (oz3Var == null) {
            a(7);
            throw null;
        }
        this.J = zw2Var;
        this.q = null;
        this.v = zw2Var.v;
        this.y = true;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = zw2Var.E;
        this.D = null;
        this.E = null;
        this.F = zw2Var.F;
        this.G = new LinkedHashMap();
        this.H = null;
        this.I = false;
        this.m = k58Var;
        this.n = fi1Var;
        this.f2650o = as4Var;
        this.p = cp1Var;
        this.r = i;
        this.s = list;
        this.t = list2;
        this.u = v14Var;
        this.w = oz3Var;
        this.x = null;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case ep1.b /* 9 */:
            case 11:
            case 13:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case ep1.c /* 10 */:
            case ep1.d /* 12 */:
            case 14:
            case 17:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case ep1.b /* 9 */:
            case 11:
            case 13:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i2 = 2;
                break;
            case ep1.c /* 10 */:
            case ep1.d /* 12 */:
            case 14:
            case 17:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case ep1.b /* 9 */:
            case 11:
            case 13:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case ep1.c /* 10 */:
                objArr[0] = "modality";
                break;
            case ep1.d /* 12 */:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i) {
            case ep1.b /* 9 */:
                objArr[1] = "setOwner";
                break;
            case ep1.c /* 10 */:
            case ep1.d /* 12 */:
            case 14:
            case 17:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[1] = "setCopyOverrides";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case ep1.b /* 9 */:
            case 11:
            case 13:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case ep1.c /* 10 */:
                objArr[2] = "setModality";
                break;
            case ep1.d /* 12 */:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case ep1.b /* 9 */:
            case 11:
            case 13:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(str2);
            case ep1.c /* 10 */:
            case ep1.d /* 12 */:
            case 14:
            case 17:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // o.ww2
    public final ww2 A() {
        this.D = ea2.m;
        return this;
    }

    @Override // o.ww2
    public final ww2 B(v14 v14Var) {
        this.v = v14Var;
        return this;
    }

    @Override // o.ww2
    public final ww2 C() {
        this.C = true;
        return this;
    }

    @Override // o.ww2
    public final ww2 D(fi1 fi1Var) {
        this.n = fi1Var;
        return this;
    }

    @Override // o.ww2
    public final ww2 I(oz3 oz3Var) {
        if (oz3Var != null) {
            this.w = oz3Var;
            return this;
        }
        a(23);
        throw null;
    }

    @Override // o.ww2
    public final ww2 J() {
        this.z = true;
        return this;
    }

    @Override // o.ww2
    public final ww2 b(List list) {
        this.s = list;
        return this;
    }

    @Override // o.ww2
    public final xw2 build() {
        return this.J.F0(this);
    }

    @Override // o.ww2
    public final ww2 f(int i) {
        if (i != 0) {
            this.r = i;
            return this;
        }
        a(14);
        throw null;
    }

    @Override // o.ww2
    public final ww2 g(cp1 cp1Var) {
        if (cp1Var != null) {
            this.p = cp1Var;
            return this;
        }
        a(12);
        throw null;
    }

    @Override // o.ww2
    public final ww2 l() {
        this.A = true;
        return this;
    }

    @Override // o.ww2
    public final ww2 o() {
        this.G.put(eo3.S, Boolean.TRUE);
        return this;
    }

    @Override // o.ww2
    public final ww2 q() {
        this.F = true;
        return this;
    }

    @Override // o.ww2
    public final ww2 s() {
        this.y = false;
        return this;
    }

    @Override // o.ww2
    public final ww2 t(as4 as4Var) {
        if (as4Var != null) {
            this.f2650o = as4Var;
            return this;
        }
        a(10);
        throw null;
    }

    @Override // o.ww2
    public final ww2 x(up upVar) {
        if (upVar != null) {
            this.E = upVar;
            return this;
        }
        a(35);
        throw null;
    }

    @Override // o.ww2
    public final ww2 y(sy4 sy4Var) {
        this.x = sy4Var;
        return this;
    }
}
