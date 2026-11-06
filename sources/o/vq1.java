package o;

import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vq1 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ yq1 n;

    public /* synthetic */ vq1(yq1 yq1Var, byte b) {
        this.m = b;
        this.n = yq1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        f88 f88Var = f88.a;
        yq1 yq1Var = this.n;
        switch (b) {
            case 0:
                int i = yq1.G0;
                if (yq1Var.F0().O() && (yq1Var.F0().B0() instanceof yq1)) {
                    yq1Var.F0().G0();
                }
                break;
            default:
                int i2 = yq1.G0;
                GroupMemberId groupMemberId = new GroupMemberId(s33.Computer, yq1Var.t0);
                au2 au2Var = vt1.c;
                g1 g1VarH = au2Var != null ? au2Var.h(yq1Var, groupMemberId) : null;
                if (yq1Var.F0().O() && g1VarH != null && (yq1Var.F0().B0() instanceof yq1)) {
                    yq1Var.F0().G0();
                    qa3 qa3Var = yq1Var.s0;
                    if (qa3Var != null) {
                        ar1 ar1Var = (ar1) qa3Var;
                        ar1Var.D.Disconnect();
                        ar1Var.E.Disconnect();
                    }
                }
                break;
        }
        return f88Var;
    }
}
