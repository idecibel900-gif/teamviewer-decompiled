package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListGroupID;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class ContactEditViewModelSWIGJNI {
    public static final native void ContactEditViewModel_CreateContact(long j, ContactEditViewModel contactEditViewModel, String str, long j2, PListGroupID pListGroupID, String str2, long j3, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native void ContactEditViewModel_CreateContactByAccountId(long j, ContactEditViewModel contactEditViewModel, long j2, String str, long j3, PListGroupID pListGroupID);

    public static final native String ContactEditViewModel_GetAccountPictureUrl(long j, ContactEditViewModel contactEditViewModel);

    public static final native String ContactEditViewModel_GetDisplayName(long j, ContactEditViewModel contactEditViewModel);

    public static final native long ContactEditViewModel_GetGroupID(long j, ContactEditViewModel contactEditViewModel);

    public static final native String ContactEditViewModel_GetName(long j, ContactEditViewModel contactEditViewModel);

    public static final native String ContactEditViewModel_GetNote(long j, ContactEditViewModel contactEditViewModel);

    public static final native boolean ContactEditViewModel_IsEditableByMe(long j, ContactEditViewModel contactEditViewModel);

    public static final native void ContactEditViewModel_RegisterForDelete(long j, ContactEditViewModel contactEditViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ContactEditViewModel_ReportEvent(long j, ContactEditViewModel contactEditViewModel, int i);

    public static final native void ContactEditViewModel_UpdateContact(long j, ContactEditViewModel contactEditViewModel, long j2, PListGroupID pListGroupID, String str, long j3, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native void delete_ContactEditViewModel(long j);
}
