package o;

import android.content.res.Resources;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IDeviceSystemDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gl implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f903o;

    public /* synthetic */ gl(long j, yq1 yq1Var) {
        this.m = (byte) 2;
        this.n = j;
        this.f903o = yq1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        s33 s33Var;
        g1 g1VarH;
        byte b = this.m;
        ar1 ar1Var = null;
        IDeviceSystemDetailsViewModel iDeviceSystemDetailsViewModel = null;
        ar1Var = null;
        Object obj = this.f903o;
        long j = this.n;
        switch (b) {
            case 0:
                return ((iw6) ((sb0) obj)).c(j);
            case 1:
                t33 t33Var = (t33) obj;
                t33Var.getClass();
                int iOrdinal = t33Var.ordinal();
                if (iOrdinal == 0) {
                    s33Var = s33.Contact;
                } else if (iOrdinal == 1) {
                    s33Var = s33.Computer;
                } else {
                    if (iOrdinal != 2) {
                        gk0.s();
                        return null;
                    }
                    s33Var = s33.ServiceCase;
                }
                GroupMemberListElementViewModel groupMemberListElementViewModelM = ds1.m(new GroupMemberId(s33Var, j));
                groupMemberListElementViewModelM.getClass();
                return new r33(groupMemberListElementViewModelM);
            case 2:
                yq1 yq1Var = (yq1) obj;
                GroupMemberId groupMemberId = new GroupMemberId(s33.Computer, j);
                au2 au2Var = vt1.c;
                if (au2Var != null && (g1VarH = au2Var.h(yq1Var, groupMemberId)) != null) {
                    ComputerDetailsViewModel computerDetailsViewModelH = ds1.h(new PListComputerID(j));
                    computerDetailsViewModelH.getClass();
                    ar1Var = new ar1(g1VarH, computerDetailsViewModelH);
                }
                ar1Var.getClass();
                return ar1Var;
            default:
                c36 c36Var = (c36) obj;
                ComputerDetailsViewModel computerDetailsViewModelH2 = ds1.h(new PListComputerID(j));
                computerDetailsViewModelH2.getClass();
                PListComputerID pListComputerID = new PListComputerID(j);
                long jPartnerlistViewModelLocator_GetDeviceSystemDetailsViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetDeviceSystemDetailsViewModel(pListComputerID.a, pListComputerID);
                if (jPartnerlistViewModelLocator_GetDeviceSystemDetailsViewModel != 0) {
                    iDeviceSystemDetailsViewModel = new IDeviceSystemDetailsViewModel();
                    iDeviceSystemDetailsViewModel.b = true;
                    iDeviceSystemDetailsViewModel.a = jPartnerlistViewModelLocator_GetDeviceSystemDetailsViewModel;
                }
                iDeviceSystemDetailsViewModel.getClass();
                Resources resources = c36Var.a.getResources();
                resources.getClass();
                return new vu1(computerDetailsViewModelH2, iDeviceSystemDetailsViewModel, resources);
        }
    }

    public /* synthetic */ gl(byte b, long j, Object obj) {
        this.m = b;
        this.f903o = obj;
        this.n = j;
    }

    public /* synthetic */ gl(long j, c36 c36Var) {
        this.m = (byte) 3;
        this.n = j;
        this.f903o = c36Var;
    }
}
