package o;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class sc extends ds1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ byte f2004o;

    public /* synthetic */ sc(sx3 sx3Var, byte b) {
        this.f2004o = b;
    }

    @Override // o.ds1
    public final Object E(s1 s1Var) {
        switch (this.f2004o) {
            case 0:
                qc qcVar = (qc) s1Var;
                nc ncVarP = oc.p();
                byte[] bArrA = p06.a(qcVar.m());
                vh0 vh0VarC = yh0.c(bArrA, 0, bArrA.length);
                ncVarP.c();
                ((oc) ncVarP.n).r(vh0VarC);
                uc ucVarN = qcVar.n();
                ncVarP.c();
                ((oc) ncVarP.n).s(ucVarN);
                ncVarP.c();
                ((oc) ncVarP.n).t();
                return (oc) ncVarP.a();
            default:
                ad adVar = (ad) s1Var;
                xc xcVarP = yc.p();
                byte[] bArrA2 = p06.a(adVar.m());
                vh0 vh0VarC2 = yh0.c(bArrA2, 0, bArrA2.length);
                xcVarP.c();
                ((yc) xcVarP.n).r(vh0VarC2);
                cd cdVarN = adVar.n();
                xcVarP.c();
                ((yc) xcVarP.n).s(cdVarN);
                xcVarP.c();
                ((yc) xcVarP.n).t();
                return (yc) xcVarP.a();
        }
    }

    @Override // o.ds1
    public final s1 b0(yh0 yh0Var) {
        switch (this.f2004o) {
            case 0:
                return qc.o(yh0Var, cg2.a());
            default:
                return ad.p(yh0Var, cg2.a());
        }
    }

    @Override // o.ds1
    public final void r0(s1 s1Var) throws GeneralSecurityException {
        switch (this.f2004o) {
            case 0:
                qc qcVar = (qc) s1Var;
                if (qcVar.m() < 16) {
                    hk0.u("key_size must be at least 16 bytes");
                } else {
                    tc.f(qcVar.n());
                }
                break;
            default:
                ad adVar = (ad) s1Var;
                if (adVar.m() < 16) {
                    hk0.u("key_size must be at least 16 bytes");
                } else {
                    tc.g(adVar.n());
                }
                break;
        }
    }
}
