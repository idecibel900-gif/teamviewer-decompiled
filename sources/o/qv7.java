package o;

/* JADX INFO: loaded from: classes2.dex */
public final class qv7 extends mj6 implements Runnable {
    public final long q;

    public qv7(long j, jc1 jc1Var) {
        super(jc1Var, jc1Var.getContext());
        this.q = j;
    }

    @Override // o.d1, o.op3
    public final String P() {
        return super.P() + "(timeMillis=" + this.q + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        de1 de1Var = this.f577o;
        im3.E(de1Var);
        String str = ((ie1) de1Var.l0(ie1.n)) != null ? "Room Invalidation Tracker Refresh" : null;
        String strJ = to7.j(this.q, "Timed out waiting for ", " ms");
        if (str != null) {
            StringBuilder sbP = ua5.p("Coroutine \"", str, "\" ");
            if (strJ.length() > 0) {
                strJ = Character.toLowerCase(strJ.charAt(0)) + strJ.substring(1);
            }
            sbP.append(strJ);
            strJ = sbP.toString();
        }
        i(new pv7(strJ, this));
    }
}
