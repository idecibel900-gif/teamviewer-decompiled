package o;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public abstract class um5 {
    public static final h72 a = new h72(new x85((byte) 16), (byte) 1);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(t54 t54Var, bj bjVar, jc1 jc1Var) {
        sm5 sm5Var;
        if (jc1Var instanceof sm5) {
            sm5Var = (sm5) jc1Var;
            int i = sm5Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                sm5Var.n = i - Integer.MIN_VALUE;
            } else {
                sm5Var = new sm5(jc1Var);
            }
        } else {
            sm5Var = new sm5(jc1Var);
        }
        Object obj = sm5Var.m;
        int i2 = sm5Var.n;
        if (i2 != 0) {
            if (i2 == 1) {
                throw ua5.q(obj);
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return;
        }
        ct1.a0(obj);
        if (!t54Var.m.z) {
            hk0.g("establishTextInputSession called from an unattached node");
            return;
        }
        Owner ownerQ0 = vn4.q0(t54Var);
        yj5 yj5Var = (yj5) vn4.p0(t54Var).O;
        yj5Var.getClass();
        if (di1.z(yj5Var, a) != null) {
            io.sentry.h2.f();
        } else {
            sm5Var.n = 1;
            b(ownerQ0, bjVar, sm5Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(Owner owner, hw2 hw2Var, jc1 jc1Var) {
        tm5 tm5Var;
        if (jc1Var instanceof tm5) {
            tm5Var = (tm5) jc1Var;
            int i = tm5Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                tm5Var.n = i - Integer.MIN_VALUE;
            } else {
                tm5Var = new tm5(jc1Var);
            }
        } else {
            tm5Var = new tm5(jc1Var);
        }
        Object obj = tm5Var.m;
        int i2 = tm5Var.n;
        if (i2 == 0) {
            ct1.a0(obj);
            tm5Var.n = 1;
            ((AndroidComposeView) owner).J(hw2Var, tm5Var);
        } else {
            if (i2 == 1) {
                throw ua5.q(obj);
            }
            if (i2 == 2) {
                throw ua5.q(obj);
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
