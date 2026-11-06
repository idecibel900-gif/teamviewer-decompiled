package o;

import com.teamviewer.remotecontrollib.swig.AlarmsSumsViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.IAlarmsSumsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerEditViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactEditViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x26 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ long n;

    public /* synthetic */ x26(long j, byte b) {
        this.m = b;
        this.n = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        ContactEditViewModel contactEditViewModel;
        byte b = this.m;
        GroupMemberListViewModel groupMemberListViewModel = null;
        IAlarmsSumsViewModel iAlarmsSumsViewModel = null;
        ContactDetailsViewModel contactDetailsViewModel = null;
        long j = this.n;
        switch (b) {
            case 0:
                PListGroupID pListGroupID = new PListGroupID(j);
                long jPartnerlistViewModelLocator_GetGroupMemberListViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetGroupMemberListViewModel(PListGroupID.a(pListGroupID), pListGroupID);
                if (jPartnerlistViewModelLocator_GetGroupMemberListViewModel != 0) {
                    groupMemberListViewModel = new GroupMemberListViewModel();
                    groupMemberListViewModel.b = true;
                    groupMemberListViewModel.a = jPartnerlistViewModelLocator_GetGroupMemberListViewModel;
                }
                return new ec0(groupMemberListViewModel);
            case 1:
                ComputerEditViewModel computerEditViewModelI = ds1.i(new PListComputerID(j));
                computerEditViewModelI.getClass();
                ComputerDetailsViewModel computerDetailsViewModelH = ds1.h(new PListComputerID(j));
                computerDetailsViewModelH.getClass();
                return new h11(computerEditViewModelI, computerDetailsViewModelH);
            case 2:
                PListContactID pListContactID = new PListContactID(j);
                long jPartnerlistViewModelLocator_GetContactEditViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetContactEditViewModel(pListContactID.a, pListContactID);
                if (jPartnerlistViewModelLocator_GetContactEditViewModel == 0) {
                    contactEditViewModel = null;
                } else {
                    contactEditViewModel = new ContactEditViewModel();
                    contactEditViewModel.b = true;
                    contactEditViewModel.a = jPartnerlistViewModelLocator_GetContactEditViewModel;
                }
                contactEditViewModel.getClass();
                PListContactID pListContactID2 = new PListContactID(j);
                long jPartnerlistViewModelLocator_GetContactDetailsViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetContactDetailsViewModel(pListContactID2.a, pListContactID2);
                if (jPartnerlistViewModelLocator_GetContactDetailsViewModel != 0) {
                    contactDetailsViewModel = new ContactDetailsViewModel();
                    contactDetailsViewModel.b = true;
                    contactDetailsViewModel.a = jPartnerlistViewModelLocator_GetContactDetailsViewModel;
                }
                contactDetailsViewModel.getClass();
                return new j71(contactEditViewModel, contactDetailsViewModel);
            default:
                long jAlarmsSumsViewModelFactory_GetAlarmsSumsViewModel = AlarmsSumsViewModelFactorySWIGJNI.AlarmsSumsViewModelFactory_GetAlarmsSumsViewModel();
                if (jAlarmsSumsViewModelFactory_GetAlarmsSumsViewModel != 0) {
                    iAlarmsSumsViewModel = new IAlarmsSumsViewModel();
                    iAlarmsSumsViewModel.b = true;
                    iAlarmsSumsViewModel.a = jAlarmsSumsViewModelFactory_GetAlarmsSumsViewModel;
                }
                iAlarmsSumsViewModel.getClass();
                ComputerDetailsViewModel computerDetailsViewModelH2 = ds1.h(new PListComputerID(j));
                computerDetailsViewModelH2.getClass();
                return new or1(iAlarmsSumsViewModel, computerDetailsViewModelH2);
        }
    }
}
