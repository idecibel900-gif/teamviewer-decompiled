package o;

import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;

/* JADX INFO: loaded from: classes.dex */
public final class mt6 implements zw3 {
    public final eu6 m;

    public /* synthetic */ mt6(eu6 eu6Var) {
        this.m = eu6Var;
    }

    @Override // o.zw3
    public void g() {
        this.m.f283o.g();
    }

    @Override // o.zw3
    public void j(int i, int i2, boolean z, boolean z2) {
        bk7 bk7Var = bk7.TVCmdKey;
        KnownStreams knownStreams = KnownStreams.PrivateStream;
        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
        eu6 eu6Var = this.m;
        ak7VarN.B(eu6Var.r.a());
        ak7VarN.d(ij7.Virtual, i);
        ak7VarN.b(ij7.Released, z ? (byte) 1 : (byte) 0);
        ak7VarN.b(ij7.Extended, z2 ? (byte) 1 : (byte) 0);
        if (i2 != 0) {
            ak7VarN.d(ij7.VirtualUnicodeHint, i2);
        }
        eu6Var.f(ak7VarN, true);
    }

    @Override // o.zw3
    public boolean t() {
        return im3.n(this.m.p.e.getValue(), Boolean.TRUE);
    }

    @Override // o.zw3
    public void x(int i) {
        bk7 bk7Var = bk7.TVCmdKey;
        KnownStreams knownStreams = KnownStreams.PrivateStream;
        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
        eu6 eu6Var = this.m;
        ak7VarN.B(eu6Var.r.a());
        ak7VarN.d(ij7.Unicode, i);
        eu6Var.f(ak7VarN, true);
    }
}
