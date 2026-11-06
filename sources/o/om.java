package o;

import java.io.EOFException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class om {
    public static final jr3 a = jr3.b("k", "x", "y");

    public static nm a(or3 or3Var, qh4 qh4Var) throws sq3, EOFException {
        ArrayList arrayList = new ArrayList();
        if (or3Var.q() == 1) {
            or3Var.D0();
            while (or3Var.hasNext()) {
                or3 or3Var2 = or3Var;
                qh4 qh4Var2 = qh4Var;
                arrayList.add(new ah5(qh4Var2, fy3.b(or3Var2, qh4Var2, ta8.c(), d82.J, or3Var.q() == 3, false)));
                or3Var = or3Var2;
                qh4Var = qh4Var2;
            }
            or3Var.A0();
            gy3.b(arrayList);
        } else {
            arrayList.add(new dy3(qr3.b(or3Var, ta8.c())));
        }
        return new nm(arrayList);
    }

    public static tm b(or3 or3Var, qh4 qh4Var) {
        or3Var.u0();
        nm nmVarA = null;
        mm mmVarS = null;
        boolean z = false;
        mm mmVarS2 = null;
        while (or3Var.q() != 4) {
            int iZ = or3Var.z(a);
            if (iZ == 0) {
                nmVarA = a(or3Var, qh4Var);
            } else if (iZ != 1) {
                if (iZ != 2) {
                    or3Var.F();
                    or3Var.v();
                } else if (or3Var.q() == 6) {
                    or3Var.v();
                    z = true;
                } else {
                    mmVarS = e8.s(or3Var, qh4Var, true);
                }
            } else if (or3Var.q() == 6) {
                or3Var.v();
                z = true;
            } else {
                mmVarS2 = e8.s(or3Var, qh4Var, true);
            }
        }
        or3Var.Z();
        if (z) {
            qh4Var.a("Lottie doesn't support expressions.");
        }
        return nmVarA != null ? nmVarA : new pm(mmVarS2, mmVarS);
    }
}
