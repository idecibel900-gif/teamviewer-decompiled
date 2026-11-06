package o;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class n85 {
    public static final n85 a = new n85();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, jc1 jc1Var) {
        m85 m85Var;
        if (jc1Var instanceof m85) {
            m85Var = (m85) jc1Var;
            int i = m85Var.f1447o;
            if ((i & Integer.MIN_VALUE) != 0) {
                m85Var.f1447o = i - Integer.MIN_VALUE;
            } else {
                m85Var = new m85(this, jc1Var);
            }
        } else {
            m85Var = new m85(this, jc1Var);
        }
        Object objU = m85Var.m;
        int i2 = m85Var.f1447o;
        hc1 hc1Var = null;
        if (i2 == 0) {
            ct1.a0(objU);
            h23 h23Var = new h23(2, hc1Var, (byte) 4);
            m85Var.f1447o = 1;
            objU = g77.u(j, h23Var, m85Var);
            ne1 ne1Var = ne1.m;
            if (objU == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(objU);
        }
        Boolean bool = (Boolean) objU;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
