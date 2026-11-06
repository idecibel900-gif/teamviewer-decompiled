package o;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zb implements gc3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // o.gc3
    public final void a(long j, final long j2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                yc4 yc4Var = (yc4) obj;
                String strG = e41.g("r", j2);
                if (j != 0 && j == j2) {
                    yc4Var.q(strG);
                    break;
                } else {
                    ll2 ll2VarN = yc4Var.n(strG);
                    if (((pc6) ll2VarN.f1375o) == pc6.BAD_REQUEST) {
                        String str = (String) ll2VarN.p;
                        if ((str != null && ub7.Q(str, "Device already exists", false)) || ((y38) ll2VarN.q) == y38.InternalError) {
                            yc4Var.q(strG);
                            break;
                        }
                    }
                }
                break;
            case 1:
                final k72 k72Var = (k72) obj;
                bu7.MAIN.a(new Runnable() { // from class: o.j72
                    @Override // java.lang.Runnable
                    public final void run() {
                        DyngateID dyngateIDFromLong = DyngateID.FromLong(j2);
                        dyngateIDFromLong.getClass();
                        k72Var.f1234o.setValue(dyngateIDFromLong.toFormattedId());
                    }
                });
                break;
            default:
                nk4 nk4Var = (nk4) obj;
                gu0 gu0VarN = e8.n(nk4Var);
                tk1 tk1Var = g22.a;
                im3.R(gu0VarN, ok4.a, null, new mk4(nk4Var, j2, null), 2);
                break;
        }
    }
}
