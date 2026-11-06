package com.teamviewer.remotecontrollib.swig.partnerlistviewmodels;

import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class ContactDetailsViewModelSWIGJNI {
    public static final native String ContactDetailsViewModel_GetAccountPictureUrl(long j, ContactDetailsViewModel contactDetailsViewModel);

    public static final native String ContactDetailsViewModel_GetDisplayName(long j, ContactDetailsViewModel contactDetailsViewModel);

    public static final native long ContactDetailsViewModel_GetGroupID(long j, ContactDetailsViewModel contactDetailsViewModel);

    public static final native String ContactDetailsViewModel_GetNote(long j, ContactDetailsViewModel contactDetailsViewModel);

    public static final native int ContactDetailsViewModel_GetOnlineState(long j, ContactDetailsViewModel contactDetailsViewModel);

    public static final native boolean ContactDetailsViewModel_IsEditableByMe(long j, ContactDetailsViewModel contactDetailsViewModel);

    public static final native void ContactDetailsViewModel_RegisterForChanges(long j, ContactDetailsViewModel contactDetailsViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ContactDetailsViewModel_RegisterForContactDelete(long j, ContactDetailsViewModel contactDetailsViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ContactDetailsViewModel_RegisterForGroupDelete(long j, ContactDetailsViewModel contactDetailsViewModel, long j2, VoidSignalCallback voidSignalCallback);

    public static final native void ContactDetailsViewModel_RemoveContact(long j, ContactDetailsViewModel contactDetailsViewModel, long j2, PListContactID pListContactID, long j3, ErrorCodeResultCallback errorCodeResultCallback);

    public static final native boolean ContactDetailsViewModel_ShowConnect(long j, ContactDetailsViewModel contactDetailsViewModel);

    public static final native void delete_ContactDetailsViewModel(long j);
}
