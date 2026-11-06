package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zw2 extends ii1 implements xw2 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public Collection J;
    public volatile e3 K;
    public final xw2 L;
    public final int M;
    public xw2 N;
    public Map O;
    public List q;
    public List r;
    public oz3 s;
    public List t;
    public v14 u;
    public v14 v;
    public as4 w;
    public cp1 x;
    public boolean y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw2(int i, up upVar, fi1 fi1Var, xw2 xw2Var, sy4 sy4Var, s67 s67Var) {
        super(fi1Var, upVar, sy4Var, s67Var);
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
        if (s67Var == null) {
            z(4);
            throw null;
        }
        this.x = dp1.i;
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = true;
        this.I = false;
        this.J = null;
        this.K = null;
        this.N = null;
        this.O = null;
        this.L = xw2Var == null ? this : xw2Var;
        this.M = i;
    }

    public static ArrayList G0(xw2 xw2Var, List list, m58 m58Var, boolean z, boolean z2, boolean[] zArr) throws l58 {
        if (list == null) {
            z(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qb8 qb8Var = (qb8) it.next();
            oz3 type = qb8Var.getType();
            ub8 ub8Var = ub8.p;
            oz3 oz3VarH = m58Var.h(type, ub8Var);
            oz3 oz3Var = qb8Var.v;
            oz3 oz3VarH2 = oz3Var == null ? null : m58Var.h(oz3Var, ub8Var);
            if (oz3VarH == null) {
                return null;
            }
            if ((oz3VarH != qb8Var.getType() || oz3Var != oz3VarH2) && zArr != null) {
                zArr[0] = true;
            }
            a3 a3Var = qb8Var instanceof pb8 ? new a3((List) ((pb8) qb8Var).x.getValue(), (byte) 13) : null;
            qb8 qb8Var2 = z ? null : qb8Var;
            int i = qb8Var.r;
            up annotations = qb8Var.getAnnotations();
            sy4 name = qb8Var.getName();
            boolean zE0 = qb8Var.E0();
            boolean z3 = qb8Var.t;
            boolean z4 = qb8Var.u;
            s67 s67VarC = z2 ? qb8Var.c() : s67.h;
            annotations.getClass();
            name.getClass();
            s67VarC.getClass();
            arrayList.add(a3Var == null ? new qb8(xw2Var, qb8Var2, i, annotations, name, oz3VarH, zE0, z3, z4, oz3VarH2, s67VarC) : new pb8(xw2Var, qb8Var2, i, annotations, name, oz3VarH, zE0, z3, z4, oz3VarH2, s67VarC, a3Var));
        }
        return arrayList;
    }

    public static /* synthetic */ void z(int i) {
        String str;
        int i2;
        switch (i) {
            case ep1.b /* 9 */:
            case 13:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case ep1.b /* 9 */:
            case 13:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case ep1.c /* 10 */:
                objArr[0] = "visibility";
                break;
            case ep1.b /* 9 */:
            case 13:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case ep1.d /* 12 */:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case ep1.b /* 9 */:
                objArr[1] = "initialize";
                break;
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[1] = "getVisibility";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[1] = "getTypeParameters";
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case ep1.b /* 9 */:
            case 13:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case ep1.c /* 10 */:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case ep1.d /* 12 */:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case ep1.b /* 9 */:
            case 13:
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case ep1.c /* 10 */:
            case 11:
            case ep1.d /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // o.qo4
    public final boolean A() {
        return this.D;
    }

    public boolean D() {
        return this.C;
    }

    public final xw2 D0(fi1 fi1Var, as4 as4Var, cp1 cp1Var) {
        xw2 xw2VarBuild = g0().D(fi1Var).t(as4Var).g(cp1Var).f(2).s().build();
        if (xw2VarBuild != null) {
            return xw2VarBuild;
        }
        z(26);
        throw null;
    }

    @Override // o.xw2
    public final boolean E() {
        if (this.y) {
            return true;
        }
        Iterator it = a().j().iterator();
        while (it.hasNext()) {
            if (((xw2) it.next()).E()) {
                return true;
            }
        }
        return false;
    }

    public abstract zw2 E0(int i, up upVar, fi1 fi1Var, xw2 xw2Var, sy4 sy4Var, s67 s67Var);

    /* JADX WARN: Code duplicated, block: B:103:0x0221  */
    /* JADX WARN: Code duplicated, block: B:106:0x0226  */
    /* JADX WARN: Code duplicated, block: B:114:0x0247  */
    /* JADX WARN: Code duplicated, block: B:116:0x024b  */
    /* JADX WARN: Code duplicated, block: B:118:0x024e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0256  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0113  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x011e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0164  */
    /* JADX WARN: Code duplicated, block: B:73:0x0166  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x0217  */
    public zw2 F0(yw2 yw2Var) throws l58 {
        up annotations;
        char c;
        v14 v14Var;
        v14 v14Var2;
        v14 v14Var3;
        v14 v14Var4;
        ArrayList arrayListG0;
        oz3 oz3VarH;
        char c2;
        boolean z;
        Boolean bool;
        boolean zBooleanValue;
        LinkedHashMap linkedHashMap;
        Map map;
        xw2 xw2Var;
        e3 e3Var;
        v14 v14VarD;
        char c3;
        oz3 oz3VarH2;
        char c4;
        ub8 ub8Var = ub8.p;
        boolean[] zArr = new boolean[1];
        char c5 = 0;
        if (yw2Var.E != null) {
            annotations = getAnnotations();
            up upVar = yw2Var.E;
            annotations.getClass();
            upVar.getClass();
            if (annotations.isEmpty()) {
                annotations = upVar;
            } else if (!upVar.isEmpty()) {
                annotations = new wp(new up[]{annotations, upVar});
            }
        } else {
            annotations = getAnnotations();
        }
        up upVar2 = annotations;
        fi1 fi1Var = yw2Var.n;
        xw2 xw2Var2 = yw2Var.q;
        int i = yw2Var.r;
        sy4 sy4Var = yw2Var.x;
        s67 s67VarC = yw2Var.A ? ((ii1) (xw2Var2 != null ? xw2Var2 : a())).c() : s67.h;
        if (s67VarC == null) {
            z(27);
            throw null;
        }
        zw2 zw2VarE0 = E0(i, upVar2, fi1Var, xw2Var2, sy4Var, s67VarC);
        List typeParameters = yw2Var.D;
        if (typeParameters == null) {
            typeParameters = getTypeParameters();
        }
        zArr[0] = (zArr[0] ? 1 : 0) | (!typeParameters.isEmpty() ? 1 : 0);
        ArrayList arrayList = new ArrayList(typeParameters.size());
        m58 m58VarZ = xo1.Z(typeParameters, yw2Var.m, zw2VarE0, arrayList, zArr);
        if (m58VarZ != null) {
            ArrayList arrayList2 = new ArrayList();
            if (yw2Var.t.isEmpty()) {
                c = c5;
                v14Var = yw2Var.u;
                if (v14Var != null) {
                    oz3VarH2 = m58VarZ.h(v14Var.getType(), ub8Var);
                    if (oz3VarH2 != null) {
                        yw2Var.u.D0();
                        v14 v14Var5 = new v14(zw2VarE0, new yf2(zw2VarE0, oz3VarH2), yw2Var.u.getAnnotations());
                        boolean z2 = zArr[c];
                        if (oz3VarH2 != yw2Var.u.getType()) {
                            c4 = 1;
                        } else {
                            c4 = c;
                        }
                        zArr[c] = c4 | (z2 ? 1 : 0);
                        v14Var2 = v14Var5;
                    }
                } else {
                    v14Var2 = null;
                }
                v14Var3 = yw2Var.v;
                if (v14Var3 != null) {
                    v14VarD = v14Var3.d(m58VarZ);
                    if (v14VarD != null) {
                        boolean z3 = zArr[c];
                        if (v14VarD != yw2Var.v) {
                            c3 = 1;
                        } else {
                            c3 = c;
                        }
                        zArr[c] = (z3 ? 1 : 0) | c3;
                        v14Var4 = v14VarD;
                    }
                } else {
                    v14Var4 = null;
                }
                arrayListG0 = G0(zw2VarE0, yw2Var.s, m58VarZ, yw2Var.B, yw2Var.A, zArr);
                if (arrayListG0 != null) {
                    boolean z4 = zArr[c];
                    if (oz3VarH != yw2Var.w) {
                        c2 = 1;
                    } else {
                        c2 = c;
                    }
                    z = (z4 ? 1 : 0) | c2;
                    zArr[c] = z;
                    if (z != 0) {
                    }
                    zw2VarE0.H0(v14Var2, v14Var4, arrayList2, arrayList, arrayListG0, oz3VarH, yw2Var.f2650o, yw2Var.p);
                    zw2VarE0.y = this.y;
                    zw2VarE0.z = this.z;
                    zw2VarE0.A = this.A;
                    zw2VarE0.B = this.B;
                    zw2VarE0.C = this.C;
                    zw2VarE0.G = this.G;
                    zw2VarE0.D = this.D;
                    zw2VarE0.J0(this.H);
                    zw2VarE0.E = yw2Var.C;
                    zw2VarE0.F = yw2Var.F;
                    bool = yw2Var.H;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = this.I;
                    }
                    zw2VarE0.K0(zBooleanValue);
                    if (yw2Var.G.isEmpty()) {
                        linkedHashMap = yw2Var.G;
                        map = this.O;
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            zw2VarE0.O = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            zw2VarE0.O = linkedHashMap;
                        }
                    } else {
                        linkedHashMap = yw2Var.G;
                        map = this.O;
                        if (map != null) {
                            while (r3.hasNext()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            zw2VarE0.O = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            zw2VarE0.O = linkedHashMap;
                        }
                    }
                    if (yw2Var.z) {
                        xw2Var = this.N;
                        if (xw2Var == null) {
                            xw2Var = this;
                        }
                        zw2VarE0.N = xw2Var.d(m58VarZ);
                    } else {
                        xw2Var = this.N;
                        if (xw2Var == null) {
                            xw2Var = this;
                        }
                        zw2VarE0.N = xw2Var.d(m58VarZ);
                    }
                    if (yw2Var.y) {
                        if (yw2Var.m.e()) {
                            e3Var = this.K;
                            if (e3Var != null) {
                                zw2VarE0.K = e3Var;
                                return zw2VarE0;
                            }
                            zw2VarE0.d0(j());
                            return zw2VarE0;
                        }
                        zw2VarE0.K = new e3((Object) this, (Object) m58VarZ, (byte) 6);
                    }
                    return zw2VarE0;
                }
            } else {
                int i2 = 0;
                for (v14 v14Var6 : yw2Var.t) {
                    oz3 oz3VarH3 = m58VarZ.h(v14Var6.getType(), ub8Var);
                    if (oz3VarH3 != null) {
                        char c6 = c5;
                        int i3 = i2 + 1;
                        arrayList2.add(io1.I(zw2VarE0, oz3VarH3, ((xb1) v14Var6.D0()).B0(), v14Var6.getAnnotations(), i2));
                        zArr[c6] = (zArr[c6] ? 1 : 0) | (oz3VarH3 != v14Var6.getType() ? (char) 1 : c6);
                        c5 = c6;
                        i2 = i3;
                    }
                }
                c = c5;
                v14Var = yw2Var.u;
                if (v14Var != null) {
                    oz3VarH2 = m58VarZ.h(v14Var.getType(), ub8Var);
                    if (oz3VarH2 != null) {
                        yw2Var.u.D0();
                        v14 v14Var7 = new v14(zw2VarE0, new yf2(zw2VarE0, oz3VarH2), yw2Var.u.getAnnotations());
                        boolean z5 = zArr[c];
                        if (oz3VarH2 != yw2Var.u.getType()) {
                            c4 = 1;
                        } else {
                            c4 = c;
                        }
                        zArr[c] = c4 | (z5 ? 1 : 0);
                        v14Var2 = v14Var7;
                    }
                } else {
                    v14Var2 = null;
                }
                v14Var3 = yw2Var.v;
                if (v14Var3 != null) {
                    v14VarD = v14Var3.d(m58VarZ);
                    if (v14VarD != null) {
                        boolean z6 = zArr[c];
                        if (v14VarD != yw2Var.v) {
                            c3 = 1;
                        } else {
                            c3 = c;
                        }
                        zArr[c] = (z6 ? 1 : 0) | c3;
                        v14Var4 = v14VarD;
                    }
                } else {
                    v14Var4 = null;
                }
                arrayListG0 = G0(zw2VarE0, yw2Var.s, m58VarZ, yw2Var.B, yw2Var.A, zArr);
                if (arrayListG0 != null && (oz3VarH = m58VarZ.h(yw2Var.w, ub8.q)) != null) {
                    boolean z7 = zArr[c];
                    if (oz3VarH != yw2Var.w) {
                        c2 = 1;
                    } else {
                        c2 = c;
                    }
                    z = (z7 ? 1 : 0) | c2;
                    zArr[c] = z;
                    if (z != 0 && yw2Var.I) {
                        return this;
                    }
                    zw2VarE0.H0(v14Var2, v14Var4, arrayList2, arrayList, arrayListG0, oz3VarH, yw2Var.f2650o, yw2Var.p);
                    zw2VarE0.y = this.y;
                    zw2VarE0.z = this.z;
                    zw2VarE0.A = this.A;
                    zw2VarE0.B = this.B;
                    zw2VarE0.C = this.C;
                    zw2VarE0.G = this.G;
                    zw2VarE0.D = this.D;
                    zw2VarE0.J0(this.H);
                    zw2VarE0.E = yw2Var.C;
                    zw2VarE0.F = yw2Var.F;
                    bool = yw2Var.H;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = this.I;
                    }
                    zw2VarE0.K0(zBooleanValue);
                    if (yw2Var.G.isEmpty() || this.O != null) {
                        linkedHashMap = yw2Var.G;
                        map = this.O;
                        if (map != null) {
                            while (r3.hasNext()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            zw2VarE0.O = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            zw2VarE0.O = linkedHashMap;
                        }
                    }
                    if (yw2Var.z || this.N != null) {
                        xw2Var = this.N;
                        if (xw2Var == null) {
                            xw2Var = this;
                        }
                        zw2VarE0.N = xw2Var.d(m58VarZ);
                    }
                    if (yw2Var.y && !a().j().isEmpty()) {
                        if (yw2Var.m.e()) {
                            e3Var = this.K;
                            if (e3Var != null) {
                                zw2VarE0.K = e3Var;
                                return zw2VarE0;
                            }
                            zw2VarE0.d0(j());
                            return zw2VarE0;
                        }
                        zw2VarE0.K = new e3((Object) this, (Object) m58VarZ, (byte) 6);
                    }
                    return zw2VarE0;
                }
            }
        }
        return null;
    }

    public void H0(v14 v14Var, v14 v14Var2, List list, List list2, List list3, oz3 oz3Var, as4 as4Var, cp1 cp1Var) {
        if (list == null) {
            z(5);
            throw null;
        }
        if (list2 == null) {
            z(6);
            throw null;
        }
        if (list3 == null) {
            z(7);
            throw null;
        }
        if (cp1Var == null) {
            z(8);
            throw null;
        }
        this.q = lv0.P0(list2);
        this.r = lv0.P0(list3);
        this.s = oz3Var;
        this.w = as4Var;
        this.x = cp1Var;
        this.u = v14Var;
        this.v = v14Var2;
        this.t = list;
        for (int i = 0; i < list2.size(); i++) {
            d58 d58Var = (d58) list2.get(i);
            if (d58Var.getIndex() != i) {
                StringBuilder sb = new StringBuilder();
                sb.append(d58Var);
                int index = d58Var.getIndex();
                sb.append(" index is ");
                sb.append(index);
                sb.append(" but position is ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            qb8 qb8Var = (qb8) list3.get(i2);
            if (qb8Var.r != i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(qb8Var);
                int i3 = qb8Var.r;
                sb2.append("index is ");
                sb2.append(i3);
                sb2.append(" but position is ");
                sb2.append(i2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final yw2 I0(m58 m58Var) {
        if (m58Var != null) {
            return new yw2(this, m58Var.a, i(), r(), e(), k(), J(), X(), this.u, getReturnType());
        }
        z(24);
        throw null;
    }

    @Override // o.xi0
    public final List J() {
        List list = this.r;
        if (list != null) {
            return list;
        }
        z(19);
        throw null;
    }

    public void J0(boolean z) {
        this.H = z;
    }

    public void K0(boolean z) {
        this.I = z;
    }

    public final void L0(g07 g07Var) {
        if (g07Var != null) {
            this.s = g07Var;
        } else {
            z(11);
            throw null;
        }
    }

    @Override // o.xw2
    public final xw2 N() {
        return this.N;
    }

    @Override // o.xi0
    public final v14 O() {
        return this.v;
    }

    public Object Q(sp1 sp1Var) {
        Map map = this.O;
        if (map == null) {
            return null;
        }
        return map.get(sp1Var);
    }

    @Override // o.xi0
    public final v14 S() {
        return this.u;
    }

    @Override // o.xi0
    public final List X() {
        List list = this.t;
        if (list != null) {
            return list;
        }
        z(13);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [o.xw2] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // o.ii1, o.gi1, o.fi1
    public xw2 a() {
        xw2 xw2VarA;
        xw2 xw2Var = this.L;
        ?? r1 = this;
        if (xw2Var != this) {
            xw2VarA = xw2Var.a();
        }
        if (r1 != 0) {
            r1 = xw2VarA;
            return r1;
        }
        r1 = xw2VarA;
        z(20);
        throw null;
    }

    @Override // o.xw2
    public final boolean c0() {
        return this.E;
    }

    @Override // o.ie7
    public xw2 d(m58 m58Var) {
        if (m58Var == null) {
            z(22);
            throw null;
        }
        if (m58Var.a.e()) {
            return this;
        }
        yw2 yw2VarI0 = I0(m58Var);
        yw2VarI0.q = a();
        yw2VarI0.A = true;
        yw2VarI0.I = true;
        return yw2VarI0.J.F0(yw2VarI0);
    }

    public void d0(Collection collection) {
        if (collection == null) {
            z(17);
            throw null;
        }
        this.J = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((xw2) it.next()).f0()) {
                this.F = true;
                return;
            }
        }
    }

    @Override // o.ki1
    public final cp1 e() {
        cp1 cp1Var = this.x;
        if (cp1Var != null) {
            return cp1Var;
        }
        z(16);
        throw null;
    }

    @Override // o.xw2
    public final boolean f0() {
        return this.F;
    }

    public ww2 g0() {
        return I0(m58.b);
    }

    public oz3 getReturnType() {
        return this.s;
    }

    @Override // o.xi0
    public final List getTypeParameters() {
        List list = this.q;
        if (list != null) {
            return list;
        }
        yq4.t(this, "typeParameters == null for ");
        return null;
    }

    @Override // o.qo4
    public final boolean h0() {
        return false;
    }

    public Collection j() {
        e3 e3Var = this.K;
        if (e3Var != null) {
            this.J = (Collection) e3Var.a();
            this.K = null;
        }
        Collection collection = this.J;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        z(14);
        throw null;
    }

    @Override // o.zi0
    public final int k() {
        int i = this.M;
        if (i != 0) {
            return i;
        }
        z(21);
        throw null;
    }

    public boolean l() {
        return this.G;
    }

    @Override // o.xw2
    public final boolean l0() {
        if (this.z) {
            return true;
        }
        Iterator it = a().j().iterator();
        while (it.hasNext()) {
            if (((xw2) it.next()).l0()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        return this.B;
    }

    public Object o(ji1 ji1Var, Object obj) {
        return ji1Var.r(this, obj);
    }

    public boolean p() {
        return this.A;
    }

    @Override // o.qo4
    public final as4 r() {
        as4 as4Var = this.w;
        if (as4Var != null) {
            return as4Var;
        }
        z(15);
        throw null;
    }

    public boolean x() {
        return this.I;
    }
}
