package o;

import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModel;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class ev1 implements za3, ab3, ze0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ fv1 n;

    public /* synthetic */ ev1(fv1 fv1Var, byte b) {
        this.m = b;
        this.n = fv1Var;
    }

    @Override // o.za3
    public void a(ChatConversationID chatConversationID) {
        if (it1.c == null) {
            im3.e0("viewFactory");
            throw null;
        }
        chatConversationID.getClass();
        this.n.z0.x(ep3.h(chatConversationID));
    }

    @Override // o.ab3
    public void b() {
        byte b = this.m;
        fv1 fv1Var = this.n;
        byte b2 = 1;
        byte b3 = 0;
        switch (b) {
            case 1:
                l07 l07Var = fv1Var.x0;
                if (l07Var == null) {
                    im3.e0("startConnectionFeedbackUiFactory");
                    throw null;
                }
                va3 va3Var = fv1Var.s0;
                if (va3Var != null) {
                    long j = ((iv1) va3Var).H;
                    y87 y87Var = new y87(l07Var, b2);
                    MachineListViewModel machineListViewModelO = ds1.o(new PListContactID(j), true, false);
                    machineListViewModelO.getClass();
                    gk7.O0(l07.A(machineListViewModelO, y87Var), fv1Var.C());
                    return;
                }
                return;
            case 2:
                l07 l07Var2 = fv1Var.x0;
                if (l07Var2 == null) {
                    im3.e0("startConnectionFeedbackUiFactory");
                    throw null;
                }
                va3 va3Var2 = fv1Var.s0;
                if (va3Var2 != null) {
                    long j2 = ((iv1) va3Var2).H;
                    y87 y87Var2 = new y87(l07Var2, (byte) 2);
                    MachineListViewModel machineListViewModelO2 = ds1.o(new PListContactID(j2), true, false);
                    machineListViewModelO2.getClass();
                    gk7.O0(l07.A(machineListViewModelO2, y87Var2), fv1Var.C());
                    return;
                }
                return;
            default:
                l07 l07Var3 = fv1Var.x0;
                if (l07Var3 == null) {
                    im3.e0("startConnectionFeedbackUiFactory");
                    throw null;
                }
                va3 va3Var3 = fv1Var.s0;
                if (va3Var3 != null) {
                    MachineListViewModel machineListViewModelO3 = ds1.o(new PListContactID(((iv1) va3Var3).H), false, true);
                    machineListViewModelO3.getClass();
                    gk7.O0(l07.A(machineListViewModelO3, new y87(l07Var3, b3)), fv1Var.C());
                    return;
                }
                return;
        }
    }

    @Override // o.za3
    public void c() {
        x02 x02VarA = ik7.a();
        gk7 gk7Var = new gk7();
        fx3.o(1, "dialogId", x02VarA, gk7Var);
        gk7Var.Z0 = x02VarA;
        gk7Var.H0 = R.string.tv_IDS_CHAT_NO_PREVIOUS_CONNECTIONS;
        gk7Var.O0 = R.string.tv_ok;
        xk1 xk1Var = ct1.a;
        if (xk1Var != null) {
            xk1Var.L(gk7Var);
        }
        this.n.z0.g(gk7Var);
    }

    @Override // o.ze0
    public void g(gk7 gk7Var) {
        gk7.O0(gk7Var, this.n.C());
    }

    @Override // o.ab3
    public void l() {
        byte b = this.m;
        fv1 fv1Var = this.n;
        switch (b) {
            case 1:
                int i = fv1.O0;
                fv1Var.K0();
                break;
            case 2:
                int i2 = fv1.O0;
                fv1Var.K0();
                break;
            default:
                int i3 = fv1.O0;
                fv1Var.K0();
                break;
        }
    }

    @Override // o.ze0
    public void x(oq0 oq0Var) {
        bb5 bb5Var = this.n.r0;
        if (bb5Var != null) {
            bb5Var.I0(oq0Var, true);
        }
    }
}
