package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class eo3 extends c07 implements tn3 {
    public static final sp1 R = new sp1();
    public static final sp1 S = new sp1();
    public int P;
    public final boolean Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo3(fi1 fi1Var, c07 c07Var, up upVar, sy4 sy4Var, int i, s67 s67Var, boolean z) {
        super(fi1Var, c07Var, upVar, sy4Var, i, s67Var);
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
        this.P = 0;
        this.Q = z;
    }

    public static eo3 R0(fi1 fi1Var, z14 z14Var, sy4 sy4Var, ng6 ng6Var, boolean z) {
        if (fi1Var == null) {
            z(5);
            throw null;
        }
        if (sy4Var != null) {
            return new eo3(fi1Var, null, z14Var, sy4Var, 1, ng6Var, z);
        }
        z(7);
        throw null;
    }

    public static /* synthetic */ void z(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case ep1.b /* 9 */:
                objArr[0] = "contextReceiverParameters";
                break;
            case ep1.c /* 10 */:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case ep1.d /* 12 */:
                objArr[0] = "visibility";
                break;
            case 13:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
                objArr[2] = "initialize";
                break;
            case 13:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 21:
                break;
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // o.c07, o.zw2
    public final zw2 E0(int i, up upVar, fi1 fi1Var, xw2 xw2Var, sy4 sy4Var, s67 s67Var) {
        if (fi1Var == null) {
            z(14);
            throw null;
        }
        if (i == 0) {
            z(15);
            throw null;
        }
        if (upVar == null) {
            z(16);
            throw null;
        }
        c07 c07Var = (c07) xw2Var;
        if (sy4Var == null) {
            sy4Var = getName();
        }
        eo3 eo3Var = new eo3(fi1Var, c07Var, upVar, sy4Var, i, s67Var, this.Q);
        int i2 = this.P;
        boolean z = false;
        if (i2 != 1) {
            if (i2 == 2) {
                z = true;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw null;
                }
                z = true;
            }
        }
        eo3Var.S0(z, e41.c(i2));
        return eo3Var;
    }

    @Override // o.tn3
    public final tn3 F(oz3 oz3Var, ArrayList arrayList, oz3 oz3Var2, vd5 vd5Var) {
        ArrayList arrayListL = r47.l(arrayList, J(), this);
        v14 v14VarO = oz3Var == null ? null : io1.O(this, oz3Var, yl7.p);
        yw2 yw2VarI0 = I0(m58.b);
        yw2VarI0.s = arrayListL;
        yw2VarI0.w = oz3Var2;
        yw2VarI0.u = v14VarO;
        yw2VarI0.B = true;
        yw2VarI0.A = true;
        eo3 eo3Var = (eo3) yw2VarI0.J.F0(yw2VarI0);
        if (vd5Var != null) {
            sp1 sp1Var = (sp1) vd5Var.m;
            Object obj = vd5Var.n;
            Map linkedHashMap = eo3Var.O;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                eo3Var.O = linkedHashMap;
            }
            linkedHashMap.put(sp1Var, obj);
        }
        if (eo3Var != null) {
            return eo3Var;
        }
        z(21);
        throw null;
    }

    @Override // o.c07
    public final c07 Q0(v14 v14Var, v14 v14Var2, List list, List list2, List list3, oz3 oz3Var, as4 as4Var, cp1 cp1Var, Map map) {
        cq0 cq0Var;
        if (list == null) {
            z(9);
            throw null;
        }
        if (list2 == null) {
            z(10);
            throw null;
        }
        if (list3 == null) {
            z(11);
            throw null;
        }
        if (cp1Var == null) {
            z(12);
            throw null;
        }
        super.Q0(v14Var, v14Var2, list, list2, list3, oz3Var, as4Var, cp1Var, map);
        for (kq0 kq0Var : wa5.a) {
            e96 e96Var = kq0Var.b;
            sy4 sy4Var = kq0Var.a;
            if (sy4Var == null || im3.n(getName(), sy4Var)) {
                if (e96Var != null) {
                    String strB = getName().b();
                    strB.getClass();
                    if (!e96Var.c(strB)) {
                        continue;
                    }
                }
                Collection collection = kq0Var.c;
                if (collection == null || collection.contains(getName())) {
                    for (zp0 zp0Var : kq0Var.e) {
                        if (zp0Var.a(this) != null) {
                            cq0Var = new cq0(false);
                            this.y = cq0Var.a;
                            return this;
                        }
                    }
                    cq0Var = ((String) kq0Var.d.invoke(this)) != null ? new cq0(false) : cq0.c;
                    this.y = cq0Var.a;
                    return this;
                }
            }
        }
        cq0Var = cq0.b;
        this.y = cq0Var.a;
        return this;
    }

    public final void S0(boolean z, boolean z2) {
        int i;
        if (z) {
            i = z2 ? 4 : 2;
        } else {
            i = z2 ? 3 : 1;
        }
        this.P = i;
    }

    @Override // o.zw2, o.xi0
    public final boolean x() {
        return e41.c(this.P);
    }
}
