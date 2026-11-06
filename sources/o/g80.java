package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class g80 extends oe8 {
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bg5 f870o = h57.p(null);
    public final bg5 p;
    public final bg5 q;
    public final kf0 r;
    public b80 s;
    public boolean t;
    public boolean u;

    public g80(r36 r36Var, boolean z) {
        this.n = z;
        Boolean bool = Boolean.FALSE;
        this.p = h57.p(bool);
        this.q = h57.p(bool);
        this.r = ka0.d(0, 7, null);
        this.u = true;
        im3.R(e8.n(this), null, null, new h0((Object) r36Var, (Object) this, (hc1) null, (byte) 14), 3);
    }

    @Override // o.oe8
    public final void U0() {
        this.r.d(null);
    }

    public final void V0() {
        ye4.a("BTHeadsetMonitorVM", "Bluetooth permission accepted. Starting Bluetooth.");
        this.p.setValue(Boolean.FALSE);
        this.u = false;
        im3.R(e8.n(this), null, null, new e80(this, null, (byte) 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W0(y yVar, d80 d80Var, jc1 jc1Var) {
        f80 f80Var;
        Function0 function0;
        Function0 function1;
        if (jc1Var instanceof f80) {
            f80Var = (f80) jc1Var;
            int i = f80Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                f80Var.q = i - Integer.MIN_VALUE;
            } else {
                f80Var = new f80(this, jc1Var);
            }
        } else {
            f80Var = new f80(this, jc1Var);
        }
        Object obj = f80Var.f774o;
        int i2 = f80Var.q;
        hc1 hc1Var = null;
        byte b = 1;
        if (i2 == 0) {
            ct1.a0(obj);
            if (this.n && !((Boolean) yVar.a()).booleanValue()) {
            }
            function1 = yVar;
            function0 = d80Var;
            return f88.a;
        }
        if (i2 != 1) {
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Function0 function2 = f80Var.n;
        Function0 function3 = f80Var.m;
        ct1.a0(obj);
        function0 = function2;
        function1 = function3;
        function1 = yVar;
        function0 = d80Var;
        while (this.u) {
            if (this.t) {
                this.t = false;
                if (((Boolean) function1.a()).booleanValue()) {
                    ye4.a("BTHeadsetMonitorVM", "Bluetooth permission accepted from Settings. Starting Bluetooth.");
                    this.u = false;
                    im3.R(e8.n(this), null, null, new e80(this, hc1Var, b), 3);
                }
            } else {
                b80 b80Var = (b80) function0.a();
                if (!((Boolean) this.p.getValue()).booleanValue()) {
                    bg5 bg5Var = this.f870o;
                    if (((String) bg5Var.getValue()) == null) {
                        if (b80Var == null) {
                            this.s = null;
                        } else {
                            b80 b80Var2 = this.s;
                            if (!im3.n(b80Var2 != null ? b80Var2.b : null, b80Var.b)) {
                                ye4.a("BTHeadsetMonitorVM", "New Bluetooth headset detected. Asking to switch to it.");
                                this.s = b80Var;
                                bg5Var.setValue(b80Var.a);
                            }
                        }
                    }
                }
            }
            long j = h80.a;
            f80Var.m = function1;
            f80Var.n = function0;
            f80Var.q = 1;
            Object objB = im3.B(j, f80Var);
            ne1 ne1Var = ne1.m;
            if (objB == ne1Var) {
                return ne1Var;
            }
        }
        function1 = yVar;
        function0 = d80Var;
        return f88.a;
    }
}
