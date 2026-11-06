package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class u45 {
    public final yk6 a;
    public final hw2 b;
    public in1 c;
    public boolean d;
    public final wk0 e = new wk0((byte) 20);

    public u45(yk6 yk6Var, hw2 hw2Var, in1 in1Var) {
        this.a = yk6Var;
        this.b = hw2Var;
        this.c = in1Var;
    }

    public static void a(bn5 bn5Var) {
        List list = bn5Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((in5) list.get(i)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(hw2 hw2Var, jc1 jc1Var) {
        t45 t45Var;
        if (jc1Var instanceof t45) {
            t45Var = (t45) jc1Var;
            int i = t45Var.f2082o;
            if ((i & Integer.MIN_VALUE) != 0) {
                t45Var.f2082o = i - Integer.MIN_VALUE;
            } else {
                t45Var = new t45(this, jc1Var);
            }
        } else {
            t45Var = new t45(this, jc1Var);
        }
        Object obj = t45Var.m;
        int i2 = t45Var.f2082o;
        hc1 hc1Var = null;
        if (i2 == 0) {
            ct1.a0(obj);
            this.d = true;
            vt4 vt4Var = new vt4(this, hw2Var, hc1Var, (byte) 4);
            t45Var.f2082o = 1;
            re7 re7Var = new re7(t45Var, t45Var.getContext());
            Object objP = h67.p(re7Var, true, re7Var, vt4Var);
            ne1 ne1Var = ne1.m;
            if (objP == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
        }
        this.d = false;
        return f88.a;
    }
}
