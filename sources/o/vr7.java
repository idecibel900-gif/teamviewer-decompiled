package o;

/* JADX INFO: loaded from: classes.dex */
public final class vr7 {
    public j04 a;
    public in1 b;
    public mr2 c;
    public ot7 d;
    public Object e;
    public final bg5 f = h57.p(Boolean.TRUE);
    public long g = 0;

    public vr7(j04 j04Var, in1 in1Var, mr2 mr2Var, ot7 ot7Var, Object obj) {
        this.a = j04Var;
        this.b = in1Var;
        this.c = mr2Var;
        this.d = ot7Var;
        this.e = obj;
    }

    public static void a(vr7 vr7Var, j04 j04Var, in1 in1Var, ot7 ot7Var, int i) {
        if ((i & 1) != 0) {
            j04Var = vr7Var.a;
        }
        if ((i & 2) != 0) {
            in1Var = vr7Var.b;
        }
        mr2 mr2Var = vr7Var.c;
        if ((i & 8) != 0) {
            ot7Var = vr7Var.d;
        }
        Object obj = vr7Var.e;
        j04 j04Var2 = vr7Var.a;
        bg5 bg5Var = vr7Var.f;
        if (j04Var == j04Var2 && im3.n(in1Var, vr7Var.b) && im3.n(mr2Var, vr7Var.c) && im3.n(ot7Var, vr7Var.d)) {
            if (im3.n(obj, vr7Var.e)) {
                return;
            }
            vr7Var.e = obj;
            bg5Var.setValue(Boolean.TRUE);
            return;
        }
        vr7Var.a = j04Var;
        vr7Var.b = in1Var;
        vr7Var.c = mr2Var;
        vr7Var.d = ot7Var;
        bg5Var.setValue(Boolean.TRUE);
    }
}
