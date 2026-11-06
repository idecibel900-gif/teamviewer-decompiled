package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface o78 {
    default String a(ux2 ux2Var) {
        String strA;
        ux2Var.W(1423435460);
        if (this instanceof n78) {
            ux2Var.W(2121879081);
            ux2Var.p(false);
            strA = ((n78) this).a;
        } else {
            if (!(this instanceof m78)) {
                throw fx3.m(2121877899, ux2Var, false);
            }
            ux2Var.W(2121881830);
            m78 m78Var = (m78) this;
            Object[] objArr = m78Var.b;
            int length = objArr.length;
            int i = m78Var.a;
            if (length == 0) {
                strA = to7.m(ux2Var, 1720875732, i, ux2Var, false);
            } else {
                ux2Var.W(1720876603);
                strA = m77.A(i, Arrays.copyOf(objArr, objArr.length), ux2Var);
                ux2Var.p(false);
            }
            ux2Var.p(false);
        }
        ux2Var.p(false);
        return strA;
    }
}
