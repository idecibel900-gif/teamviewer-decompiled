package o;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class gu1 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ru1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ns1 f922o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gu1(ru1 ru1Var, ns1 ns1Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = ru1Var;
        this.f922o = ns1Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        ns1 ns1Var = this.f922o;
        ru1 ru1Var = this.n;
        switch (b) {
            case 0:
                return new gu1(ru1Var, ns1Var, hc1Var, (byte) 0);
            case 1:
                return new gu1(ru1Var, ns1Var, hc1Var, (byte) 1);
            default:
                return new gu1(ru1Var, ns1Var, hc1Var, (byte) 2);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((gu1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            case 1:
                ((gu1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
            default:
                ((gu1) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        hs1 hs1Var = hs1.m;
        hs1 hs1Var2 = hs1.n;
        f88 f88Var = f88.a;
        ns1 ns1Var = this.f922o;
        ru1 ru1Var = this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                f41.b(ru1Var.n, String.valueOf(ns1Var.a), ns1Var.l ? hs1Var2 : hs1Var, false, null, null, 56);
                break;
            case 1:
                ct1.a0(obj);
                f41 f41Var = ru1Var.n;
                String strValueOf = String.valueOf(ns1Var.a);
                f41Var.getClass();
                strValueOf.getClass();
                Long lP = bc7.P(strValueOf);
                if (lP != null) {
                    long jLongValue = lP.longValue();
                    nc0 nc0Var = f41Var.b;
                    DyngateID dyngateIDFromLong = DyngateID.FromLong(jLongValue);
                    dyngateIDFromLong.getClass();
                    nc0Var.getClass();
                    nc0.d(dyngateIDFromLong);
                }
                break;
            default:
                ct1.a0(obj);
                f41.e(ru1Var.n, String.valueOf(ns1Var.a), ns1Var.l ? hs1Var2 : hs1Var, false, null, null, 56);
                break;
        }
        return f88Var;
    }
}
