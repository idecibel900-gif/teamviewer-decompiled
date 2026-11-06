package o;

import android.content.DialogInterface;
import com.teamviewer.chatviewmodel.swig.IConversationMemberListUIModel;
import com.teamviewer.chatviewmodel.swig.IConversationOptionsUIModelAndroid;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModel;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ho0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f994o;

    public /* synthetic */ ho0(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f994o = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.m;
        Object obj = this.f994o;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                po0 po0Var = (po0) obj2;
                IConversationMemberListUIModel iConversationMemberListUIModel = (IConversationMemberListUIModel) obj;
                int i2 = po0Var.D;
                if (i2 >= 0 && i2 < iConversationMemberListUIModel.GetMemberCount()) {
                    ye4.a("ChatConversationDefaultLogic", "Removing participant");
                    IConversationOptionsUIModelAndroid iConversationOptionsUIModelAndroid = po0Var.p;
                    if (iConversationOptionsUIModelAndroid != null) {
                        iConversationOptionsUIModelAndroid.RemoveParticipant(iConversationMemberListUIModel.GetConversationMemberAtPosition(po0Var.D).GetEndpoint().getId());
                    }
                    break;
                }
                break;
            default:
                y87 y87Var = (y87) obj;
                MachineId machineIdA = ((MachineListViewModel) obj2).a(i);
                machineIdA.getClass();
                switch (y87Var.a) {
                    case 0:
                        Object obj3 = y87Var.b.n;
                        nc0.b(machineIdA);
                        break;
                    case 1:
                        ga0.s(machineIdA, false, (ja3) y87Var.b.n);
                        break;
                    default:
                        ga0.s(machineIdA, true, (ja3) y87Var.b.n);
                        break;
                }
                break;
        }
    }
}
