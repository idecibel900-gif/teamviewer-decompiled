package o;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public final class mk4 extends og7 implements hw2 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1477o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk4(nk4 nk4Var, long j, hc1 hc1Var) {
        super(2, hc1Var);
        this.f1477o = nk4Var;
        this.n = j;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        long j = this.n;
        switch (b) {
            case 0:
                return new mk4((nk4) this.f1477o, j, hc1Var);
            default:
                mk4 mk4Var = new mk4(j, hc1Var);
                mk4Var.f1477o = obj;
                return mk4Var;
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((mk4) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                break;
            default:
                ((mk4) create((wk6) obj, (hc1) obj2)).invokeSuspend(f88Var);
                break;
        }
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        long j = this.n;
        switch (b) {
            case 0:
                ct1.a0(obj);
                nk4 nk4Var = (nk4) this.f1477o;
                DyngateID dyngateIDFromLong = DyngateID.FromLong(j);
                dyngateIDFromLong.getClass();
                String formattedId = dyngateIDFromLong.toFormattedId();
                formattedId.getClass();
                String strL = bc7.L(formattedId, " ", "");
                l97 l97Var = nk4Var.T;
                l97Var.getClass();
                l97Var.l(null, strL);
                break;
            default:
                ct1.a0(obj);
                yk6 yk6Var = ((wk6) this.f1477o).a;
                yk6Var.d(yk6Var.k, j, 1);
                break;
        }
        return f88Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk4(long j, hc1 hc1Var) {
        super(2, hc1Var);
        this.n = j;
    }
}
