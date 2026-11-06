package o;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class cv2 {
    public static final bv2 a = bv2.a;

    public static bv2 a(ut2 ut2Var) {
        while (ut2Var != null) {
            if (ut2Var.O()) {
                ut2Var.G();
            }
            ut2Var = ut2Var.I;
        }
        return a;
    }

    public static void b(cg8 cg8Var) {
        if (su2.M(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(cg8Var.m.getClass().getName()), cg8Var);
        }
    }

    public static final void c(ut2 ut2Var, String str) {
        ut2Var.getClass();
        str.getClass();
        b(new yu2(ut2Var, "Attempting to reuse fragment " + ut2Var + " with previous ID " + str));
        a(ut2Var).getClass();
    }
}
