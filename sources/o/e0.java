package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e0 extends d3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(xd4 xd4Var) {
        super(xd4Var);
        if (xd4Var != null) {
        } else {
            l(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void l(int i) {
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i == 2) {
            objArr[0] = "classifier";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i == 3 || i == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i != 1) {
            if (i == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // o.d3
    public final oz3 f() {
        ns4 ns4VarM = m();
        if (ns4VarM == null) {
            wy3.a(108);
            throw null;
        }
        sy4 sy4Var = wy3.e;
        if (wy3.b(ns4VarM, s87.a) || wy3.b(ns4VarM, s87.b)) {
            return null;
        }
        return h().e();
    }

    @Override // o.k48
    public final wy3 h() {
        wy3 wy3VarE = bp1.e(m());
        if (wy3VarE != null) {
            return wy3VarE;
        }
        l(1);
        throw null;
    }

    @Override // o.d3
    public final boolean j(ys0 ys0Var) {
        boolean z;
        if (ys0Var instanceof ns4) {
            ns4 ns4VarM = m();
            ns4VarM.getClass();
            if (!im3.n(ns4VarM.getName(), ys0Var.getName())) {
                z = false;
                break;
            }
            fi1 fi1VarI = ns4VarM.i();
            fi1 fi1VarI2 = ys0Var.i();
            while (true) {
                if (fi1VarI != null && fi1VarI2 != null) {
                    if (!(fi1VarI instanceof ps4)) {
                        if (!(fi1VarI2 instanceof ps4)) {
                            if (fi1VarI instanceof ad5) {
                                if (!(fi1VarI2 instanceof ad5) || !im3.n(((bd5) ((ad5) fi1VarI)).q, ((bd5) ((ad5) fi1VarI2)).q)) {
                                    break;
                                }
                            } else if (!(fi1VarI2 instanceof ad5) && im3.n(fi1VarI.getName(), fi1VarI2.getName())) {
                                fi1VarI = fi1VarI.i();
                                fi1VarI2 = fi1VarI2.i();
                            }
                        }
                        z = false;
                        break;
                    }
                    z = fi1VarI2 instanceof ps4;
                    break;
                }
                z = true;
                break;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public abstract ns4 m();
}
