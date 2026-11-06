package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zt5 extends ii1 implements xw2 {
    public boolean q;
    public final boolean r;
    public final as4 s;
    public final bu5 t;
    public final boolean u;
    public final int v;
    public cp1 w;
    public xw2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt5(as4 as4Var, cp1 cp1Var, bu5 bu5Var, up upVar, sy4 sy4Var, boolean z, boolean z2, boolean z3, int i, s67 s67Var) {
        super(bu5Var.i(), upVar, sy4Var, s67Var);
        if (as4Var == null) {
            z(0);
            throw null;
        }
        if (cp1Var == null) {
            z(1);
            throw null;
        }
        if (upVar == null) {
            z(3);
            throw null;
        }
        if (s67Var == null) {
            z(5);
            throw null;
        }
        this.x = null;
        this.s = as4Var;
        this.w = cp1Var;
        this.t = bu5Var;
        this.q = z;
        this.r = z2;
        this.u = z3;
        this.v = i;
    }

    public static /* synthetic */ void z(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case ep1.b /* 9 */:
                objArr[1] = "getTypeParameters";
                break;
            case ep1.c /* 10 */:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case ep1.d /* 12 */:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // o.qo4
    public final boolean A() {
        return false;
    }

    @Override // o.xw2
    public final boolean D() {
        return false;
    }

    public final ArrayList D0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (bu5 bu5Var : this.t.j()) {
            ii1 getter = z ? bu5Var.getGetter() : bu5Var.b();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // o.xw2
    public final boolean E() {
        return false;
    }

    @Override // o.xw2
    public final xw2 N() {
        return this.x;
    }

    @Override // o.xi0
    public final v14 O() {
        return this.t.O();
    }

    @Override // o.xi0
    public final Object Q(sp1 sp1Var) {
        return null;
    }

    @Override // o.xi0
    public final v14 S() {
        return this.t.S();
    }

    @Override // o.xi0
    public final List X() {
        List listX = this.t.X();
        if (listX != null) {
            return listX;
        }
        z(14);
        throw null;
    }

    @Override // o.zi0
    public final zi0 Y(fi1 fi1Var, as4 as4Var, cp1 cp1Var) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // o.xw2
    public final boolean c0() {
        return false;
    }

    @Override // o.xw2, o.ie7
    public final xw2 d(m58 m58Var) {
        if (m58Var != null) {
            return this;
        }
        z(7);
        throw null;
    }

    @Override // o.zi0
    public final void d0(Collection collection) {
        if (collection != null) {
            return;
        }
        z(16);
        throw null;
    }

    @Override // o.ki1
    public final cp1 e() {
        cp1 cp1Var = this.w;
        if (cp1Var != null) {
            return cp1Var;
        }
        z(11);
        throw null;
    }

    @Override // o.xw2
    public final boolean f0() {
        return false;
    }

    @Override // o.xi0
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        z(9);
        throw null;
    }

    @Override // o.qo4
    public final boolean h0() {
        return false;
    }

    @Override // o.zi0
    public final int k() {
        int i = this.v;
        if (i != 0) {
            return i;
        }
        z(6);
        throw null;
    }

    @Override // o.xw2
    public final boolean l() {
        return false;
    }

    @Override // o.xw2
    public final boolean l0() {
        return false;
    }

    @Override // o.xw2
    public final boolean m() {
        return this.u;
    }

    @Override // o.qo4
    public final boolean p() {
        return this.r;
    }

    @Override // o.qo4
    public final as4 r() {
        as4 as4Var = this.s;
        if (as4Var != null) {
            return as4Var;
        }
        z(10);
        throw null;
    }

    @Override // o.xi0
    public final boolean x() {
        return false;
    }

    @Override // o.ie7
    public final /* bridge */ /* synthetic */ hi1 d(m58 m58Var) {
        d(m58Var);
        return this;
    }
}
