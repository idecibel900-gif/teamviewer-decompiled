package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListDyngateID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;

/* JADX INFO: loaded from: classes.dex */
public abstract class PartnerlistViewModelLocatorSWIGJNI {
    public static final native long PartnerlistViewModelLocator_CreateManagedDeviceV2FactoryContainer(String str, String str2);

    public static final native long PartnerlistViewModelLocator_GetComputerDetailsViewModel__SWIG_0(long j, PListComputerID pListComputerID);

    public static final native long PartnerlistViewModelLocator_GetComputerEditViewModel(long j, PListComputerID pListComputerID);

    public static final native long PartnerlistViewModelLocator_GetContactDetailsViewModel(long j, PListContactID pListContactID);

    public static final native long PartnerlistViewModelLocator_GetContactEditViewModel(long j, PListContactID pListContactID);

    public static final native long PartnerlistViewModelLocator_GetDeviceSystemDetailsViewModel(long j, PListComputerID pListComputerID);

    public static final native long PartnerlistViewModelLocator_GetDyngateViewModel(long j, PListDyngateID pListDyngateID);

    public static final native long PartnerlistViewModelLocator_GetGroupListElementViewModel(long j, PListGroupID pListGroupID);

    public static final native long PartnerlistViewModelLocator_GetGroupListViewModel(boolean z);

    public static final native long PartnerlistViewModelLocator_GetGroupMemberListElementViewModel(long j, GroupMemberId groupMemberId);

    public static final native long PartnerlistViewModelLocator_GetGroupMemberListSearchViewModel(String str, String str2);

    public static final native long PartnerlistViewModelLocator_GetGroupMemberListViewModel(long j, PListGroupID pListGroupID);

    public static final native long PartnerlistViewModelLocator_GetMachineListElementViewModel(long j, MachineId machineId);

    public static final native long PartnerlistViewModelLocator_GetMachineListViewModel(long j, PListContactID pListContactID, boolean z, boolean z2);

    public static final native long PartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_0(long j, PListComputerID pListComputerID);

    public static final native long PartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_1(long j, MachineId machineId);

    public static final native long PartnerlistViewModelLocator_GetManagedDeviceViewModel__SWIG_2(long j, PListDyngateID pListDyngateID);

    public static final native long PartnerlistViewModelLocator_GetPLSynchronizationStateViewModel();

    public static final native long PartnerlistViewModelLocator_GetServiceCaseDetailsViewModel(int i);

    public static final native long PartnerlistViewModelLocator_GetServiceCaseEditViewModel(int i);

    public static final native long PartnerlistViewModelLocator_GetServiceCaseListElementViewModel(int i);

    public static final native long PartnerlistViewModelLocator_GetServiceCaseListViewModel();
}
