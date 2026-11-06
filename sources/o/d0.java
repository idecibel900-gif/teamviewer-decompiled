package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d0 extends ns4 {
    public final sy4 m;
    public final vd4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final vd4 f573o;
    public final vd4 p;

    public d0(xd4 xd4Var, sy4 sy4Var) {
        byte b = 0;
        if (xd4Var == null) {
            A0(0);
            throw null;
        }
        byte b2 = 1;
        if (sy4Var == null) {
            A0(1);
            throw null;
        }
        this.m = sy4Var;
        this.n = new vd4(xd4Var, new c0(this, b));
        this.f573o = new vd4(xd4Var, new c0(this, b2));
        this.p = new vd4(xd4Var, new c0(this, (byte) 2));
    }

    public static /* synthetic */ void A0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case ep1.b /* 9 */:
            case ep1.d /* 12 */:
            case 14:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case ep1.c /* 10 */:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case ep1.b /* 9 */:
            case ep1.d /* 12 */:
            case 14:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
                break;
            case 7:
            case 8:
            case ep1.c /* 10 */:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // o.ie7
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public ns4 d(m58 m58Var) {
        if (m58Var != null) {
            return m58Var.a.e() ? this : new k54(this, m58Var);
        }
        A0(18);
        throw null;
    }

    @Override // o.ns4, o.ys0
    public final g07 W() {
        g07 g07Var = (g07) this.n.a();
        if (g07Var != null) {
            return g07Var;
        }
        A0(20);
        throw null;
    }

    @Override // o.fi1
    public final fi1 a() {
        return this;
    }

    @Override // o.fi1
    public final ys0 a() {
        return this;
    }

    @Override // o.fi1
    public final sy4 getName() {
        sy4 sy4Var = this.m;
        if (sy4Var != null) {
            return sy4Var;
        }
        A0(2);
        throw null;
    }

    @Override // o.ns4
    public final zo4 j0(k58 k58Var) {
        bp1.h(zo1.d(this));
        zo4 zo4VarM0 = m0(k58Var, uz3.a);
        if (zo4VarM0 != null) {
            return zo4VarM0;
        }
        A0(16);
        throw null;
    }

    @Override // o.fi1
    public final Object o(ji1 ji1Var, Object obj) {
        return ji1Var.u(this, obj);
    }

    @Override // o.ns4
    public final v14 q0() {
        v14 v14Var = (v14) this.p.a();
        if (v14Var != null) {
            return v14Var;
        }
        A0(5);
        throw null;
    }

    @Override // o.ns4
    public zo4 r0() {
        zo4 zo4Var = (zo4) this.f573o.a();
        if (zo4Var != null) {
            return zo4Var;
        }
        A0(4);
        throw null;
    }
}
