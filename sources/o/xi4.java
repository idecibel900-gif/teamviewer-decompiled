package o;

import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xi4 implements md3, qw2 {
    @Override // o.md3
    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        au6 au6Var = bt1.b;
        if (au6Var == null) {
            im3.e0("instance");
            throw null;
        }
        mo7 mo7Var = au6Var.f;
        if (!(mo7Var instanceof wc3)) {
            ye4.c("TVTouch", "sendTouch: not a valid session");
            return;
        }
        ec3 ec3Var = (wc3) mo7Var;
        a2 a2Var = (a2) ec3Var;
        ha6 ha6Var = a2Var.f283o;
        if (!ha6Var.d()) {
            wk7 wk7VarI = ((eu6) ec3Var).i();
            if (wk7VarI == null) {
                ye4.c("TVTouch", "sendTouch: could not send mark via mouse");
                return;
            }
            synchronized (wk7VarI) {
                wk7VarI.d(i2, i3);
                wk7VarI.c(1);
            }
            return;
        }
        pq6 pq6Var = ha6Var.c;
        bk7 bk7Var = bk7.TVCmdTouch;
        KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
        ak7VarN.d(uj7.ID, i);
        ak7VarN.d(uj7.X, (int) (i2 / pq6Var.a));
        ak7VarN.d(uj7.Y, (int) (i3 / pq6Var.a));
        ak7VarN.d(uj7.Phase, i4);
        ak7VarN.d(uj7.Flags, i5);
        ak7VarN.d(uj7.Delay, i6);
        a2Var.f(ak7VarN, false);
    }

    @Override // o.qw2
    public final pw2 b() {
        return new cx2(6, yl7.n, yl7.class, "sendTouch", "sendTouch(IIIIII)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof md3) && (obj instanceof qw2)) {
            return im3.n(b(), ((qw2) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
