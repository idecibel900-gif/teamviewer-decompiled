package o;

/* JADX INFO: loaded from: classes2.dex */
public final class cp1 {
    public final p7 a;
    public final /* synthetic */ byte b;

    public cp1(p7 p7Var, byte b) {
        this.b = b;
        p7Var.getClass();
        this.a = p7Var;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0226 A[ADDED_TO_REGION, LOOP:1: B:129:0x0226->B:141:0x0257, LOOP_START, PHI: r12
      0x0226: PHI (r12v1 o.fi1) = (r12v0 o.fi1), (r12v2 o.fi1) binds: [B:127:0x0223, B:141:0x0257] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x0228  */
    /* JADX WARN: Code duplicated, block: B:132:0x022b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0257 A[LOOP:1: B:129:0x0226->B:141:0x0257, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:151:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [o.fi1] */
    /* JADX WARN: Type inference failed for: r11v0, types: [o.fi1, o.ki1] */
    /* JADX WARN: Type inference failed for: r11v1, types: [o.fi1] */
    /* JADX WARN: Type inference failed for: r11v2, types: [o.fi1] */
    /* JADX WARN: Type inference failed for: r11v3, types: [o.fi1] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final boolean a(v46 v46Var, ki1 ki1Var, fi1 fi1Var) {
        fi1 fi1VarI;
        ns4 ns4Var;
        switch (this.b) {
            case 0:
                if (fi1Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
                }
                if (zo1.s(ki1Var) && zo1.f(fi1Var) != z06.I) {
                    return dp1.d(ki1Var, fi1Var);
                }
                if (ki1Var instanceof z61) {
                    ((z61) ki1Var).i();
                }
                while (ki1Var != 0) {
                    ki1Var = ki1Var.i();
                    if (((ki1Var instanceof ns4) && !zo1.l(ki1Var)) || (ki1Var instanceof ad5)) {
                        if (ki1Var == 0) {
                            return false;
                        }
                        while (fi1Var != null) {
                            if (ki1Var != fi1Var) {
                                if (!(fi1Var instanceof ad5)) {
                                    fi1Var = fi1Var.i();
                                } else if ((ki1Var instanceof ad5) || !((bd5) ((ad5) ki1Var)).q.equals(((bd5) ((ad5) fi1Var)).q) || !zo1.d(fi1Var).equals(zo1.d(ki1Var))) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        return false;
                    }
                }
                if (ki1Var == 0) {
                    return false;
                }
                while (fi1Var != null) {
                    if (ki1Var != fi1Var) {
                        if (!(fi1Var instanceof ad5)) {
                            return ki1Var instanceof ad5 ? false : false;
                        }
                        fi1Var = fi1Var.i();
                    }
                    return true;
                }
                return false;
            case 1:
                if (fi1Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
                }
                if (!dp1.a.a(v46Var, ki1Var, fi1Var)) {
                    return false;
                }
                if (v46Var == dp1.m) {
                    return true;
                }
                if (v46Var == dp1.l || (fi1VarI = zo1.i(ki1Var, ns4.class, true)) == null || !(v46Var instanceof ff3)) {
                    return false;
                }
                return ((ff3) v46Var).m.n0().equals(fi1VarI.a());
            case 2:
                if (fi1Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                ns4 ns4Var2 = (ns4) zo1.i(ki1Var, ns4.class, true);
                ns4 ns4Var3 = (ns4) zo1.i(fi1Var, ns4.class, false);
                if (ns4Var3 == null) {
                    return false;
                }
                if (ns4Var2 == null || !zo1.l(ns4Var2) || (ns4Var = (ns4) zo1.i(ns4Var2, ns4.class, true)) == null || !zo1.r(ns4Var3.W(), ns4Var.n0())) {
                    ?? T = ki1Var instanceof zi0 ? zo1.t((zi0) ki1Var) : ki1Var;
                    ns4 ns4Var4 = (ns4) zo1.i(T, ns4.class, true);
                    if (ns4Var4 == null) {
                        return false;
                    }
                    if (zo1.r(ns4Var3.W(), ns4Var4.n0()) && v46Var != dp1.n) {
                        if ((T instanceof zi0) && !(T instanceof z61) && v46Var != dp1.m) {
                            if (v46Var != dp1.l && v46Var != null) {
                                oz3 type = v46Var.getType();
                                if (!zo1.r(type, ns4Var3)) {
                                    type.r0();
                                }
                            }
                        }
                    }
                    return a(v46Var, ki1Var, ns4Var3.i());
                }
                return true;
            case 3:
                if (fi1Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
                }
                if (!zo1.d(fi1Var).b0(zo1.d(ki1Var))) {
                    return false;
                }
                dp1.f641o.getClass();
                return true;
            case 4:
                if (fi1Var != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case 5:
                if (fi1Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 6:
                if (fi1Var == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case 7:
                if (fi1Var != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            case 8:
                if (fi1Var != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
            case ep1.b /* 9 */:
                if (fi1Var != null) {
                    return ao3.b(ki1Var, fi1Var);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case ep1.c /* 10 */:
                if (fi1Var != null) {
                    return ao3.c(v46Var, ki1Var, fi1Var);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            default:
                if (fi1Var != null) {
                    return ao3.c(v46Var, ki1Var, fi1Var);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    public final String toString() {
        return this.a.e();
    }
}
