package o;

import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m58 {
    public static final m58 b = new m58(k58.a);
    public final k58 a;

    public m58(k58 k58Var) {
        this.a = k58Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case ep1.d /* 12 */:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case ep1.d /* 12 */:
                case 13:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case ep1.b /* 9 */:
            case 14:
                objArr[0] = "type";
                break;
            case ep1.c /* 10 */:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case ep1.d /* 12 */:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case ep1.d /* 12 */:
            case 13:
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case ep1.b /* 9 */:
            case ep1.c /* 10 */:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case ep1.d /* 12 */:
                case 13:
                    break;
                default:
                    switch (i) {
                        case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static ub8 b(ub8 ub8Var, ub8 ub8Var2) {
        if (ub8Var == null) {
            a(38);
            throw null;
        }
        if (ub8Var2 == null) {
            a(39);
            throw null;
        }
        ub8 ub8Var3 = ub8.f2197o;
        if (ub8Var == ub8Var3) {
            if (ub8Var2 != null) {
                return ub8Var2;
            }
            a(40);
            throw null;
        }
        if (ub8Var2 == ub8Var3) {
            if (ub8Var != null) {
                return ub8Var;
            }
            a(41);
            throw null;
        }
        if (ub8Var == ub8Var2) {
            if (ub8Var2 != null) {
                return ub8Var2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + ub8Var + "' and projection kind '" + ub8Var2 + "' cannot be combined");
    }

    public static int c(ub8 ub8Var, ub8 ub8Var2) {
        ub8 ub8Var3 = ub8.q;
        ub8 ub8Var4 = ub8.p;
        if (ub8Var == ub8Var4 && ub8Var2 == ub8Var3) {
            return 3;
        }
        return (ub8Var == ub8Var3 && ub8Var2 == ub8Var4) ? 2 : 1;
    }

    public static m58 d(oz3 oz3Var) {
        if (oz3Var == null) {
            a(6);
            throw null;
        }
        return new m58(m48.b.e(oz3Var.o0(), oz3Var.m0()));
    }

    public static m58 e(k58 k58Var, k58 k58Var2) {
        if (k58Var == null) {
            a(3);
            throw null;
        }
        if (k58Var2 == null) {
            a(4);
            throw null;
        }
        if (k58Var.e()) {
            k58Var = k58Var2;
        } else if (!k58Var2.e()) {
            k58Var = new u12(k58Var, k58Var2);
        }
        return new m58(k58Var);
    }

    public static String g(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (bt1.H(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final oz3 f(oz3 oz3Var, ub8 ub8Var) {
        if (oz3Var == null) {
            a(9);
            throw null;
        }
        if (this.a.e()) {
            return oz3Var;
        }
        try {
            oz3 oz3VarB = i(new w87(oz3Var, ub8Var), null, 0).b();
            if (oz3VarB != null) {
                return oz3VarB;
            }
            a(12);
            throw null;
        } catch (l58 e) {
            return hd2.c(gd2.w, e.getMessage());
        }
    }

    public final oz3 h(oz3 oz3Var, ub8 ub8Var) throws l58 {
        if (oz3Var == null) {
            a(14);
            throw null;
        }
        if (ub8Var == null) {
            a(15);
            throw null;
        }
        k58 k58Var = this.a;
        h58 w87Var = new w87(k58Var.f(oz3Var, ub8Var), ub8Var);
        if (!k58Var.e()) {
            try {
                w87Var = i(w87Var, null, 0);
            } catch (l58 unused) {
                w87Var = null;
            }
        }
        if (k58Var.a() || k58Var.b()) {
            boolean zB = k58Var.b();
            if (w87Var == null) {
                w87Var = null;
            } else if (!w87Var.c()) {
                oz3 oz3VarB = w87Var.b();
                oz3VarB.getClass();
                if (p58.c(oz3VarB, ek.t, null)) {
                    ub8 ub8VarA = w87Var.a();
                    ub8VarA.getClass();
                    if (ub8VarA == ub8.q) {
                        w87Var = new w87((oz3) db8.f(oz3VarB).b, ub8VarA);
                    } else if (zB) {
                        w87Var = new w87((oz3) db8.f(oz3VarB).a, ub8VarA);
                    } else {
                        wl0 wl0Var = new wl0();
                        m58 m58Var = new m58(wl0Var);
                        if (!wl0Var.e()) {
                            try {
                                w87Var = m58Var.i(w87Var, null, 0);
                            } catch (l58 unused2) {
                                w87Var = null;
                            }
                        }
                    }
                }
            }
        }
        if (w87Var == null) {
            return null;
        }
        return w87Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:105:0x0214  */
    /* JADX WARN: Code duplicated, block: B:107:0x021c  */
    /* JADX WARN: Code duplicated, block: B:108:0x021f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0222  */
    /* JADX WARN: Code duplicated, block: B:111:0x0225  */
    /* JADX WARN: Code duplicated, block: B:114:0x022a  */
    /* JADX WARN: Code duplicated, block: B:116:0x022e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0236  */
    /* JADX WARN: Code duplicated, block: B:120:0x0245  */
    /* JADX WARN: Code duplicated, block: B:125:0x0266  */
    /* JADX WARN: Code duplicated, block: B:127:0x028a  */
    /* JADX WARN: Code duplicated, block: B:129:0x028d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0291  */
    /* JADX WARN: Code duplicated, block: B:134:0x0297  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:144:0x02be  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0141  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:0x017e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0181  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0192 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x019e  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01be  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final h58 i(h58 h58Var, d58 d58Var, int i) throws l58 {
        oz3 oz3VarB;
        ub8 ub8VarA;
        m98 m98VarR0;
        i iVar;
        g07 g07Var;
        ub8 ub8Var;
        List parameters;
        List listM0;
        ArrayList arrayList;
        boolean z;
        oz3 oz3VarX;
        d58 d58Var2;
        h58 h58Var2;
        h58 h58VarI;
        int iB;
        char c;
        m58 m58Var;
        rg3 rg3Var;
        int iC;
        so soVarR0;
        ag1 ag1Var;
        oz3 oz3VarI;
        up upVarC;
        int iB2;
        m58 m58Var2 = this;
        oz3 oz3VarH = null;
        if (h58Var == null) {
            a(18);
            throw null;
        }
        k58 k58Var = m58Var2.a;
        if (i > 100) {
            an4.t("Recursion too deep. Most likely infinite loop while substituting ", g(h58Var), "; substitution: ", g(k58Var));
            return null;
        }
        if (!h58Var.c()) {
            oz3 oz3VarB2 = h58Var.b();
            if (oz3VarB2 instanceof r58) {
                r58 r58Var = (r58) oz3VarB2;
                m98 m98VarJ0 = r58Var.j0();
                oz3 oz3VarZ = r58Var.z();
                h58 h58VarI2 = m58Var2.i(new w87(m98VarJ0, h58Var.a()), d58Var, i + 1);
                return h58VarI2.c() ? h58VarI2 : new w87(x37.u(h58VarI2.b().r0(), m58Var2.h(oz3VarZ, h58Var.a())), h58VarI2.a());
            }
            oz3VarB2.getClass();
            oz3VarB2.r0();
            if (!(oz3VarB2.r0() instanceof y06)) {
                h58 h58VarD = k58Var.d(oz3VarB2);
                if (h58VarD == null) {
                    h58VarD = null;
                } else if (oz3VarB2.getAnnotations().o0(s87.y)) {
                    k48 k48VarO0 = h58VarD.b().o0();
                    if (k48VarO0 instanceof i35) {
                        h58 h58Var3 = ((i35) k48VarO0).a;
                        ub8 ub8VarA2 = h58Var3.a();
                        if (c(h58Var.a(), ub8VarA2) == 3) {
                            h58VarD = new w87(h58Var3.b());
                        } else if (d58Var != null && c(d58Var.B(), ub8VarA2) == 3) {
                            h58VarD = new w87(h58Var3.b());
                        }
                    }
                }
                ub8 ub8VarA3 = h58Var.a();
                int i2 = 0;
                if (h58VarD == null && (oz3VarB2.r0() instanceof um2)) {
                    so soVarR1 = oz3VarB2.r0();
                    ag1 ag1Var2 = soVarR1 instanceof ag1 ? (ag1) soVarR1 : null;
                    if (!(ag1Var2 != null ? ag1Var2.e0() : false)) {
                        um2 um2Var = (um2) oz3VarB2.r0();
                        g07 g07Var2 = um2Var.f2226o;
                        g07 g07Var3 = um2Var.n;
                        int i3 = i + 1;
                        h58 h58VarI3 = m58Var2.i(new w87(g07Var3, ub8VarA3), d58Var, i3);
                        h58 h58VarI4 = m58Var2.i(new w87(g07Var2, ub8VarA3), d58Var, i3);
                        ub8 ub8VarA4 = h58VarI3.a();
                        if (h58VarI3.b() != g07Var3 || h58VarI4.b() != g07Var2) {
                            return new w87(bt1.v(m77.o(h58VarI3.b()), m77.o(h58VarI4.b())), ub8VarA4);
                        }
                    } else if (!wy3.E(oz3VarB2)) {
                        if (h58VarD != null) {
                            iC = c(ub8VarA3, h58VarD.a());
                            if (!(oz3VarB2.o0() instanceof xl0)) {
                                iB2 = ua5.B(iC);
                                if (iB2 != 1) {
                                    return new w87(oz3VarB2.o0().h().o(), ub8.q);
                                }
                                if (iB2 == 2) {
                                    throw new l58("Out-projection in in-position");
                                }
                            }
                            soVarR0 = oz3VarB2.r0();
                            if (soVarR0 instanceof ag1) {
                                ag1Var = (ag1) soVarR0;
                            } else {
                                ag1Var = null;
                            }
                            if (ag1Var != null) {
                                ag1Var = null;
                            } else {
                                ag1Var = null;
                            }
                            if (h58VarD.c()) {
                                return h58VarD;
                            }
                            if (ag1Var != null) {
                                oz3VarI = ag1Var.i0(h58VarD.b());
                            } else {
                                oz3VarI = p58.i(h58VarD.b(), oz3VarB2.p0());
                            }
                            if (!oz3VarB2.getAnnotations().isEmpty()) {
                                upVarC = k58Var.c(oz3VarB2.getAnnotations());
                                if (upVarC != null) {
                                    a(33);
                                    throw null;
                                }
                                if (upVarC.o0(s87.y)) {
                                    upVarC = new dl2(upVarC, new xp5((byte) 29));
                                }
                                oz3VarI = n37.s(oz3VarI, new wp(new up[]{oz3VarI.getAnnotations(), upVarC}));
                            }
                            if (iC == 1) {
                                ub8VarA3 = b(ub8VarA3, h58VarD.a());
                            }
                            return new w87(oz3VarI, ub8VarA3);
                        }
                        oz3VarB = h58Var.b();
                        ub8VarA = h58Var.a();
                        if (!(oz3VarB.o0().a() instanceof d58)) {
                            m98VarR0 = oz3VarB.r0();
                            if (m98VarR0 instanceof i) {
                                iVar = (i) m98VarR0;
                            } else {
                                iVar = null;
                            }
                            if (iVar != null) {
                                g07Var = iVar.f1021o;
                            } else {
                                g07Var = null;
                            }
                            ub8Var = ub8.f2197o;
                            if (g07Var != null) {
                                if (k58Var instanceof rg3) {
                                    rg3Var = (rg3) k58Var;
                                    if (rg3Var.d) {
                                        m58Var = new m58(new rg3(rg3Var.b, rg3Var.c, false));
                                    } else {
                                        m58Var = m58Var2;
                                    }
                                } else {
                                    m58Var = m58Var2;
                                }
                                oz3VarH = m58Var.h(g07Var, ub8Var);
                            }
                            parameters = oz3VarB.o0().getParameters();
                            listM0 = oz3VarB.m0();
                            arrayList = new ArrayList(parameters.size());
                            z = false;
                            while (i2 < parameters.size()) {
                                d58Var2 = (d58) parameters.get(i2);
                                h58Var2 = (h58) listM0.get(i2);
                                h58VarI = m58Var2.i(h58Var2, d58Var2, i + 1);
                                iB = ua5.B(c(d58Var2.B(), h58VarI.a()));
                                if (iB != 0) {
                                    if (iB != 1) {
                                        c = 2;
                                        if (iB == 2) {
                                        }
                                    } else {
                                        c = 2;
                                    }
                                    h58VarI = p58.k(d58Var2);
                                } else {
                                    c = 2;
                                    if (d58Var2.B() != ub8Var) {
                                        h58VarI = new w87(h58VarI.b(), ub8Var);
                                    }
                                }
                                if (h58VarI != h58Var2) {
                                    z = true;
                                }
                                arrayList.add(h58VarI);
                                i2++;
                                m58Var2 = this;
                            }
                            if (z) {
                                listM0 = arrayList;
                            }
                            up upVarC2 = k58Var.c(oz3VarB.getAnnotations());
                            listM0.getClass();
                            upVarC2.getClass();
                            oz3VarX = m77.x(oz3VarB, listM0, upVarC2, 4);
                            if (oz3VarX instanceof g07) {
                                oz3VarX = x37.t((g07) oz3VarX, (g07) oz3VarH);
                            }
                            return new w87(oz3VarX, ub8VarA);
                        }
                    }
                } else if (!wy3.E(oz3VarB2) && !ct1.K(oz3VarB2)) {
                    if (h58VarD != null) {
                        iC = c(ub8VarA3, h58VarD.a());
                        if (!(oz3VarB2.o0() instanceof xl0)) {
                            iB2 = ua5.B(iC);
                            if (iB2 != 1) {
                                return new w87(oz3VarB2.o0().h().o(), ub8.q);
                            }
                            if (iB2 == 2) {
                                throw new l58("Out-projection in in-position");
                            }
                        }
                        soVarR0 = oz3VarB2.r0();
                        if (soVarR0 instanceof ag1) {
                            ag1Var = (ag1) soVarR0;
                        } else {
                            ag1Var = null;
                        }
                        if (ag1Var != null || !ag1Var.e0()) {
                            ag1Var = null;
                        }
                        if (h58VarD.c()) {
                            return h58VarD;
                        }
                        if (ag1Var != null) {
                            oz3VarI = ag1Var.i0(h58VarD.b());
                        } else {
                            oz3VarI = p58.i(h58VarD.b(), oz3VarB2.p0());
                        }
                        if (!oz3VarB2.getAnnotations().isEmpty()) {
                            upVarC = k58Var.c(oz3VarB2.getAnnotations());
                            if (upVarC != null) {
                                a(33);
                                throw null;
                            }
                            if (upVarC.o0(s87.y)) {
                                upVarC = new dl2(upVarC, new xp5((byte) 29));
                            }
                            oz3VarI = n37.s(oz3VarI, new wp(new up[]{oz3VarI.getAnnotations(), upVarC}));
                        }
                        if (iC == 1) {
                            ub8VarA3 = b(ub8VarA3, h58VarD.a());
                        }
                        return new w87(oz3VarI, ub8VarA3);
                    }
                    oz3VarB = h58Var.b();
                    ub8VarA = h58Var.a();
                    if (!(oz3VarB.o0().a() instanceof d58)) {
                        m98VarR0 = oz3VarB.r0();
                        if (m98VarR0 instanceof i) {
                            iVar = (i) m98VarR0;
                        } else {
                            iVar = null;
                        }
                        if (iVar != null) {
                            g07Var = iVar.f1021o;
                        } else {
                            g07Var = null;
                        }
                        ub8Var = ub8.f2197o;
                        if (g07Var != null) {
                            if (k58Var instanceof rg3) {
                                rg3Var = (rg3) k58Var;
                                if (rg3Var.d) {
                                    m58Var = m58Var2;
                                } else {
                                    m58Var = new m58(new rg3(rg3Var.b, rg3Var.c, false));
                                }
                            } else {
                                m58Var = m58Var2;
                            }
                            oz3VarH = m58Var.h(g07Var, ub8Var);
                        }
                        parameters = oz3VarB.o0().getParameters();
                        listM0 = oz3VarB.m0();
                        arrayList = new ArrayList(parameters.size());
                        z = false;
                        while (i2 < parameters.size()) {
                            d58Var2 = (d58) parameters.get(i2);
                            h58Var2 = (h58) listM0.get(i2);
                            h58VarI = m58Var2.i(h58Var2, d58Var2, i + 1);
                            iB = ua5.B(c(d58Var2.B(), h58VarI.a()));
                            if (iB != 0) {
                                if (iB != 1) {
                                    c = 2;
                                    if (iB == 2) {
                                    }
                                } else {
                                    c = 2;
                                }
                                h58VarI = p58.k(d58Var2);
                            } else {
                                c = 2;
                                if (d58Var2.B() != ub8Var && !h58VarI.c()) {
                                    h58VarI = new w87(h58VarI.b(), ub8Var);
                                }
                            }
                            if (h58VarI != h58Var2) {
                                z = true;
                            }
                            arrayList.add(h58VarI);
                            i2++;
                            m58Var2 = this;
                        }
                        if (z) {
                            listM0 = arrayList;
                        }
                        up upVarC3 = k58Var.c(oz3VarB.getAnnotations());
                        listM0.getClass();
                        upVarC3.getClass();
                        oz3VarX = m77.x(oz3VarB, listM0, upVarC3, 4);
                        if ((oz3VarX instanceof g07) && (oz3VarH instanceof g07)) {
                            oz3VarX = x37.t((g07) oz3VarX, (g07) oz3VarH);
                        }
                        return new w87(oz3VarX, ub8VarA);
                    }
                }
            }
        }
        return h58Var;
    }
}
