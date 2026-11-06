package o;

import android.content.Context;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModel;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class xq1 implements za3, ab3, ze0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ yq1 n;

    public /* synthetic */ xq1(yq1 yq1Var, byte b) {
        this.m = b;
        this.n = yq1Var;
    }

    @Override // o.za3
    public void a(ChatConversationID chatConversationID) {
        if (chatConversationID != null) {
            if (it1.c == null) {
                im3.e0("viewFactory");
                throw null;
            }
            this.n.F0.x(ep3.h(chatConversationID));
        }
    }

    @Override // o.ab3
    public void b() {
        byte b = this.m;
        yq1 yq1Var = this.n;
        switch (b) {
            case 1:
                qa3 qa3Var = yq1Var.s0;
                if (qa3Var != null) {
                    l07 l07Var = yq1Var.v0;
                    if (l07Var == null) {
                        im3.e0("startConnectionFeedbackUiFactory");
                        throw null;
                    }
                    long j = ((ar1) qa3Var).u;
                    y87 y87Var = new y87(l07Var, (byte) 1);
                    MachineListViewModel machineListViewModelO = ds1.o(new PListContactID(j), true, false);
                    machineListViewModelO.getClass();
                    gk7.O0(l07.A(machineListViewModelO, y87Var), yq1Var.C());
                    return;
                }
                return;
            default:
                qa3 qa3Var2 = yq1Var.s0;
                if (qa3Var2 != null) {
                    l07 l07Var2 = yq1Var.v0;
                    if (l07Var2 == null) {
                        im3.e0("startConnectionFeedbackUiFactory");
                        throw null;
                    }
                    long j2 = ((ar1) qa3Var2).u;
                    y87 y87Var2 = new y87(l07Var2, (byte) 2);
                    MachineListViewModel machineListViewModelO2 = ds1.o(new PListContactID(j2), true, false);
                    machineListViewModelO2.getClass();
                    gk7.O0(l07.A(machineListViewModelO2, y87Var2), yq1Var.C());
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
        this.n.F0.g(gk7Var);
    }

    @Override // o.ze0
    public void g(gk7 gk7Var) {
        gk7.O0(gk7Var, this.n.C());
    }

    @Override // o.ab3
    public void l() {
        byte b = this.m;
        yq1 yq1Var = this.n;
        switch (b) {
            case 1:
                int i = yq1.G0;
                if (yq1Var.v0 == null) {
                    im3.e0("startConnectionFeedbackUiFactory");
                    throw null;
                }
                Context context = d82.M;
                if (context == null) {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    return;
                }
                String string = context.getString(R.string.tv_IDS_STATUS_AUTHENTICATION_NOINCOMING);
                string.getClass();
                fx3.r(string, 1, context, bu7.MAIN);
                return;
            default:
                int i2 = yq1.G0;
                if (yq1Var.v0 == null) {
                    im3.e0("startConnectionFeedbackUiFactory");
                    throw null;
                }
                Context context2 = d82.M;
                if (context2 == null) {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    return;
                }
                String string2 = context2.getString(R.string.tv_IDS_STATUS_AUTHENTICATION_NOINCOMING);
                string2.getClass();
                fx3.r(string2, 1, context2, bu7.MAIN);
                return;
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
