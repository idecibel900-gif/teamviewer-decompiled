package o;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo/zb0;", "Lo/fv2;", "Lo/oq0;", "Lo/w05;", "<init>", "()V", "RemoteControlViewLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class zb0 extends fv2 implements oq0 {
    public bb5 r0;

    @Override // o.fv2
    public hk7 C0(String str) {
        str.getClass();
        return null;
    }

    public final bb5 F0() {
        bb5 bb5Var = this.r0;
        if (bb5Var != null) {
            return bb5Var;
        }
        hk0.g("Required value was null.");
        return null;
    }

    public abstract boolean G0();

    @Override // o.ut2
    public final void S() {
        id3 id3Var;
        this.S = true;
        bb5 bb5Var = this.r0;
        if (bb5Var != null) {
            bb5Var.H0(G0());
        }
        if (!(C() instanceof id3) || (id3Var = (id3) C()) == null) {
            return;
        }
        id3Var.f(null, false, null, (15 & 8) == 0);
    }

    @Override // o.bu2
    public final w05 a() {
        return w05.Partnerlist;
    }

    @Override // o.oq0
    public final void e(bb5 bb5Var) {
        this.r0 = bb5Var;
    }
}
