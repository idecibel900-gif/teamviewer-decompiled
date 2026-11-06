package o;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class wu7 {
    public static final List a = qf0.K(new qu7(kh.P, null));
    public static final List b = qf0.K(new qu7(db8.D, null));

    public static final ul1 a(ye5 ye5Var, ux2 ux2Var, int i) {
        byte b2 = 1;
        if ((i & 1) != 0) {
            ye5Var = io1.z(i67.m(ux2Var));
        }
        ru7 ru7Var = xa4.a;
        z06 z06Var = o8.a;
        pu7 pu7Var = new pu7(z06Var, z06Var, z06Var);
        Object[] objArr = new Object[0];
        a65 a65VarB = vt1.B(new xt7(b2), new yr7((byte) 10));
        a65 a65VarB2 = vt1.B(new t0(a65VarB, (byte) 16), new m5((Object) ye5Var, (Object) pu7Var, (Object) a65VarB, (byte) 12));
        List list = a;
        boolean zH = ux2Var.h(list) | ux2Var.f(ye5Var) | ux2Var.h(pu7Var) | ux2Var.g(true);
        Object objK = ux2Var.K();
        if (zH || objK == e01.a) {
            objK = new b67(list, ye5Var, pu7Var, (byte) 2);
            ux2Var.g0(objK);
        }
        ul1 ul1Var = (ul1) zu1.O(objArr, a65VarB2, (Function0) objK, ux2Var, 0);
        ul1Var.b.setValue(ye5Var);
        ul1Var.d.setValue(pu7Var);
        ul1Var.c.setValue(true);
        return ul1Var;
    }
}
