package o;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eg0 extends bd5 implements ad5 {
    public final zf0 s;
    public final yt2 t;
    public final pn5 u;
    public ov5 v;
    public bq1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg0(ht2 ht2Var, xd4 xd4Var, ps4 ps4Var, ov5 ov5Var, zf0 zf0Var) {
        super(ps4Var, ht2Var);
        ht2Var.getClass();
        ps4Var.getClass();
        this.s = zf0Var;
        vv5 vv5Var = ov5Var.p;
        vv5Var.getClass();
        uv5 uv5Var = ov5Var.q;
        uv5Var.getClass();
        yt2 yt2Var = new yt2(vv5Var, uv5Var);
        this.t = yt2Var;
        o48 o48Var = new o48(this, (byte) 15);
        pn5 pn5Var = new pn5();
        pn5Var.m = yt2Var;
        pn5Var.n = zf0Var;
        pn5Var.f1752o = o48Var;
        List list = ov5Var.s;
        list.getClass();
        int iQ = xm4.Q(mv0.Z(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iQ < 16 ? 16 : iQ);
        for (Object obj : list) {
            linkedHashMap.put(et1.y((yt2) pn5Var.m, ((tu5) obj).q), obj);
        }
        pn5Var.p = linkedHashMap;
        this.u = pn5Var;
        this.v = ov5Var;
    }

    public final void E0(io.sentry.android.replay.screenshot.k kVar) {
        kVar.getClass();
        ov5 ov5Var = this.v;
        if (ov5Var == null) {
            hk0.l("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.v = null;
        mv5 mv5Var = ov5Var.r;
        mv5Var.getClass();
        this.w = new bq1(this, mv5Var, this.t, this.s, null, kVar, "scope of " + this, new a3(this, (byte) 10));
    }

    @Override // o.ad5
    public final zo4 I() {
        bq1 bq1Var = this.w;
        if (bq1Var != null) {
            return bq1Var;
        }
        im3.e0("_memberScope");
        throw null;
    }

    @Override // o.bd5, o.gi1
    public final String toString() {
        StringBuilder sb = new StringBuilder("builtins package fragment for ");
        sb.append(this.q);
        sb.append(" from ");
        int i = bp1.a;
        ps4 ps4VarD = zo1.d(this);
        ps4VarD.getClass();
        sb.append(ps4VarD);
        return sb.toString();
    }
}
