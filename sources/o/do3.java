package o;

/* JADX INFO: loaded from: classes2.dex */
public final class do3 implements rg2 {
    @Override // o.rg2
    public final int a() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.rg2
    public final int b(xi0 xi0Var, xi0 xi0Var2, ns4 ns4Var) {
        boolean z;
        xw2 xw2Var;
        xi0Var.getClass();
        xi0Var2.getClass();
        if ((xi0Var instanceof zi0) && (xi0Var2 instanceof xw2) && !wy3.z(xi0Var2)) {
            int i = ig0.l;
            xw2 xw2Var2 = (xw2) xi0Var2;
            gi1 gi1Var = (gi1) xw2Var2;
            sy4 name = gi1Var.getName();
            name.getClass();
            if (y77.e.contains(name)) {
                zi0 zi0VarO = o77.o((zi0) xi0Var);
                z = xi0Var instanceof xw2;
                if (z) {
                    xw2Var = (xw2) xi0Var;
                } else {
                    xw2Var = null;
                }
                if (xw2Var == null) {
                    if (ns4Var instanceof b24) {
                        if (yo1.z(xi0Var, xi0Var2)) {
                            return 3;
                        }
                    } else if (yo1.z(xi0Var, xi0Var2)) {
                        return 3;
                    }
                } else if (ns4Var instanceof b24) {
                    if (yo1.z(xi0Var, xi0Var2)) {
                        return 3;
                    }
                } else if (yo1.z(xi0Var, xi0Var2)) {
                    return 3;
                }
            } else {
                sy4 name2 = gi1Var.getName();
                name2.getClass();
                if (y77.j.contains(name2)) {
                    zi0 zi0VarO2 = o77.o((zi0) xi0Var);
                    z = xi0Var instanceof xw2;
                    if (z) {
                        xw2Var = (xw2) xi0Var;
                    } else {
                        xw2Var = null;
                    }
                    if ((xw2Var == null && xw2Var2.c0() == xw2Var.c0()) || (zi0VarO2 != null && xw2Var2.c0())) {
                        if ((ns4Var instanceof b24) || xw2Var2.N() != null || zi0VarO2 == null || o77.p(ns4Var, zi0VarO2)) {
                            if (yo1.z(xi0Var, xi0Var2)) {
                                return 3;
                            }
                        } else if ((zi0VarO2 instanceof xw2) && z && ig0.a((xw2) zi0VarO2) != null) {
                            String strE = io1.E(xw2Var2, 2);
                            xw2 xw2VarA = ((xw2) xi0Var).a();
                            xw2VarA.getClass();
                            if (strE.equals(io1.E(xw2VarA, 2))) {
                                if (yo1.z(xi0Var, xi0Var2)) {
                                    return 3;
                                }
                            }
                        }
                    }
                } else if (yo1.z(xi0Var, xi0Var2)) {
                    return 3;
                }
            }
        } else if (yo1.z(xi0Var, xi0Var2)) {
            return 3;
        }
        return 2;
    }
}
