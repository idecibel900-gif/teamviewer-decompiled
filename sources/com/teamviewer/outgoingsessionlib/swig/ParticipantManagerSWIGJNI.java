package com.teamviewer.outgoingsessionlib.swig;

import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;

/* JADX INFO: loaded from: classes.dex */
public class ParticipantManagerSWIGJNI {
    public static final native void IBaseParticipantManager_ActivateWhiteboard(long j, IBaseParticipantManager iBaseParticipantManager, boolean z);

    public static final native boolean IBaseParticipantManager_AllowToActivateWhiteboard(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, boolean z);

    public static final native boolean IBaseParticipantManager_AllowToChat(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, boolean z);

    public static final native boolean IBaseParticipantManager_AllowToDownloadFiles(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, boolean z);

    public static final native boolean IBaseParticipantManager_AllowToDraw(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, boolean z);

    public static final native boolean IBaseParticipantManager_AllowToListen(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, boolean z);

    public static final native boolean IBaseParticipantManager_AllowToPoint(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, boolean z);

    public static final native boolean IBaseParticipantManager_AllowToRemoteCtrl(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, boolean z);

    public static final native boolean IBaseParticipantManager_AllowToSeeInvisible(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, boolean z);

    public static final native boolean IBaseParticipantManager_AllowToSeeVideo(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, boolean z);

    public static final native boolean IBaseParticipantManager_AllowToShowVideo(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, boolean z);

    public static final native boolean IBaseParticipantManager_AllowToSpeak(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, boolean z);

    public static final native boolean IBaseParticipantManager_AllowToUploadFiles(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, boolean z);

    public static final native boolean IBaseParticipantManager_AllowedToActivateWhiteboard(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToAssignOrganizer(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToAssignPresenter(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToChat(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToDisplayMeetingId(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToDisplayPassword(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToDownloadFiles(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToDraw(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToListen(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToPoint(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToRemoteCtrl(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToSeeInvisible(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToSeeVideo(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToSendChat(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToShowVideo(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToSpeak(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AllowedToUploadFiles(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_AmIOrganizer(long j, IBaseParticipantManager iBaseParticipantManager);

    public static final native boolean IBaseParticipantManager_AmIPresenter(long j, IBaseParticipantManager iBaseParticipantManager);

    public static final native boolean IBaseParticipantManager_CanChat(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_CanDrawWhiteboard(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_CanPoint(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_CanRemoteControl(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_CanShowVideo(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_CanSpeak(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_CanSynchronizePresenterRoleRequests(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_CanSynchronizeVideoStartRequests(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_CanUploadFiles(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native long IBaseParticipantManager_GetAllVisible(long j, IBaseParticipantManager iBaseParticipantManager);

    public static final native long IBaseParticipantManager_GetMyParticipantIdentifier(long j, IBaseParticipantManager iBaseParticipantManager);

    public static final native long IBaseParticipantManager_GetNumberOfStreamTypeSubscribers(long j, IBaseParticipantManager iBaseParticipantManager, int i);

    public static final native long IBaseParticipantManager_GetParticipantCount(long j, IBaseParticipantManager iBaseParticipantManager);

    public static final native long IBaseParticipantManager_GetParticipantIDs(long j, IBaseParticipantManager iBaseParticipantManager);

    public static final native int IBaseParticipantManager_GetParticipantType(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native long IBaseParticipantManager_GetPresenter(long j, IBaseParticipantManager iBaseParticipantManager);

    public static final native int IBaseParticipantManager_GetRegStream(long j, IBaseParticipantManager iBaseParticipantManager, long j2, long j3, DataStream dataStream);

    public static final native long IBaseParticipantManager_GetStreamSource(long j, IBaseParticipantManager iBaseParticipantManager, long j2);

    public static final native long IBaseParticipantManager_GetSupportedStreamFeatures(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, int i);

    public static final native int IBaseParticipantManager_GetSyncState(long j, IBaseParticipantManager iBaseParticipantManager);

    public static final native boolean IBaseParticipantManager_HasParticipant(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_IsAudioInteractionAllowed(long j, IBaseParticipantManager iBaseParticipantManager);

    public static final native boolean IBaseParticipantManager_IsFullyCompatible(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_IsOrganizer(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native int IBaseParticipantManager_IsParticipantVisible(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_IsPresenter(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_IsPresenterHandingOverPossible(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_IsRecordMeetingAllowed(long j, IBaseParticipantManager iBaseParticipantManager);

    public static final native void IBaseParticipantManager_ParticipantAddedInMeetingControl(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_SetAccountPictureURL(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, String str);

    public static final native boolean IBaseParticipantManager_SetMyAccountData(long j, IBaseParticipantManager iBaseParticipantManager, long j2, String str, String str2);

    public static final native void IBaseParticipantManager_SetMyParticipantIdentifier(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native int IBaseParticipantManager_SetOrganizer(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, boolean z);

    public static final native boolean IBaseParticipantManager_SetParticipantName(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, String str);

    public static final native int IBaseParticipantManager_SetPresenter(long j, IBaseParticipantManager iBaseParticipantManager, long j2, ParticipantIdentifier participantIdentifier, boolean z);

    public static final native boolean IBaseParticipantManager_SubscribeStreamForParticipant(long j, IBaseParticipantManager iBaseParticipantManager, long j2, DataStream dataStream, long j3, ParticipantIdentifier participantIdentifier);

    public static final native boolean IBaseParticipantManager_SubscribeStreamIfSupported(long j, IBaseParticipantManager iBaseParticipantManager, long j2, DataStream dataStream);

    public static final native void IBaseParticipantManager_UnsubscribeStream(long j, IBaseParticipantManager iBaseParticipantManager, long j2);

    public static final native boolean ICommonParticipantManager_AllowedToDownloadFilesSC(long j, ICommonParticipantManager iCommonParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean ICommonParticipantManager_AllowedToShareFilesWithPresentersSC(long j, ICommonParticipantManager iCommonParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean ICommonParticipantManager_AllowedToShareFilesWithVisibleSC(long j, ICommonParticipantManager iCommonParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native boolean ICommonParticipantManager_AllowedToUseFileshareWidget(long j, ICommonParticipantManager iCommonParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native long ICommonParticipantManager_GetAllParticipants(long j, ICommonParticipantManager iCommonParticipantManager);

    public static final native long ICommonParticipantManager_GetLastRemovedParticipantID(long j, ICommonParticipantManager iCommonParticipantManager);

    public static final native String ICommonParticipantManager_GetNameOfParticipant__SWIG_0(long j, ICommonParticipantManager iCommonParticipantManager, long j2, ParticipantIdentifier participantIdentifier, long j3);

    public static final native String ICommonParticipantManager_GetNameOfParticipant__SWIG_1(long j, ICommonParticipantManager iCommonParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native String ICommonParticipantManager_GetNameOfUniquePartnerOrMeetingID__SWIG_0(long j, ICommonParticipantManager iCommonParticipantManager, long j2);

    public static final native String ICommonParticipantManager_GetNameOfUniquePartnerOrMeetingID__SWIG_1(long j, ICommonParticipantManager iCommonParticipantManager);

    public static final native long ICommonParticipantManager_GetOutgoingStreamID__SWIG_0(long j, ICommonParticipantManager iCommonParticipantManager, int i);

    public static final native long ICommonParticipantManager_GetOutgoingStreamID__SWIG_1(long j, ICommonParticipantManager iCommonParticipantManager, long j2);

    public static final native long ICommonParticipantManager_GetPIDOfUniquePartner(long j, ICommonParticipantManager iCommonParticipantManager);

    public static final native long ICommonParticipantManager_GetParticipant(long j, ICommonParticipantManager iCommonParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native void ICommonParticipantManager_PendingParticipant_Accept(long j, ICommonParticipantManager iCommonParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native void ICommonParticipantManager_PendingParticipant_Deny(long j, ICommonParticipantManager iCommonParticipantManager, long j2, ParticipantIdentifier participantIdentifier);

    public static final native void ICommonParticipantManager_PendingParticipant_Whitelist_Add(long j, ICommonParticipantManager iCommonParticipantManager, long j2, boolean z);

    public static final native void ICommonParticipantManager_PendingParticipant_Whitelist_Remove(long j, ICommonParticipantManager iCommonParticipantManager, long j2, boolean z);

    public static final native boolean ICommonParticipantManager_RegisterNewStreamWithoutCallback(long j, ICommonParticipantManager iCommonParticipantManager, int i, int i2, boolean z, int i3, boolean z2, boolean z3, long j2, long j3, ParticipantIdentifier participantIdentifier);

    public static final native boolean ICommonParticipantManager_RequestRecordingPermissionFromSipParticipant(long j, ICommonParticipantManager iCommonParticipantManager, long j2, ParticipantIdentifier participantIdentifier, long j3, ParticipantIdentifier participantIdentifier2, boolean z);

    public static final native long ICommonParticipantManager_SWIGSmartPtrUpcast(long j);

    public static final native void ICommonParticipantManager_StartFullSynchronisation(long j, ICommonParticipantManager iCommonParticipantManager, int i);

    public static final native void TParticipantIdentifierVector_clear(long j, TParticipantIdentifierVector tParticipantIdentifierVector);

    public static final native void TParticipantIdentifierVector_doAdd__SWIG_0(long j, TParticipantIdentifierVector tParticipantIdentifierVector, long j2, ParticipantIdentifier participantIdentifier);

    public static final native void TParticipantIdentifierVector_doAdd__SWIG_1(long j, TParticipantIdentifierVector tParticipantIdentifierVector, int i, long j2, ParticipantIdentifier participantIdentifier);

    public static final native int TParticipantIdentifierVector_doCapacity(long j, TParticipantIdentifierVector tParticipantIdentifierVector);

    public static final native long TParticipantIdentifierVector_doGet(long j, TParticipantIdentifierVector tParticipantIdentifierVector, int i);

    public static final native long TParticipantIdentifierVector_doRemove(long j, TParticipantIdentifierVector tParticipantIdentifierVector, int i);

    public static final native void TParticipantIdentifierVector_doRemoveRange(long j, TParticipantIdentifierVector tParticipantIdentifierVector, int i, int i2);

    public static final native void TParticipantIdentifierVector_doReserve(long j, TParticipantIdentifierVector tParticipantIdentifierVector, int i);

    public static final native long TParticipantIdentifierVector_doSet(long j, TParticipantIdentifierVector tParticipantIdentifierVector, int i, long j2, ParticipantIdentifier participantIdentifier);

    public static final native int TParticipantIdentifierVector_doSize(long j, TParticipantIdentifierVector tParticipantIdentifierVector);

    public static final native boolean TParticipantIdentifierVector_isEmpty(long j, TParticipantIdentifierVector tParticipantIdentifierVector);

    public static final native void VectorLong_clear(long j, VectorLong vectorLong);

    public static final native void VectorLong_doAdd__SWIG_0(long j, VectorLong vectorLong, long j2);

    public static final native void VectorLong_doAdd__SWIG_1(long j, VectorLong vectorLong, int i, long j2);

    public static final native int VectorLong_doCapacity(long j, VectorLong vectorLong);

    public static final native long VectorLong_doGet(long j, VectorLong vectorLong, int i);

    public static final native long VectorLong_doRemove(long j, VectorLong vectorLong, int i);

    public static final native void VectorLong_doRemoveRange(long j, VectorLong vectorLong, int i, int i2);

    public static final native void VectorLong_doReserve(long j, VectorLong vectorLong, int i);

    public static final native long VectorLong_doSet(long j, VectorLong vectorLong, int i, long j2);

    public static final native int VectorLong_doSize(long j, VectorLong vectorLong);

    public static final native boolean VectorLong_isEmpty(long j, VectorLong vectorLong);

    public static final native void delete_IBaseParticipantManager(long j);

    public static final native void delete_ICommonParticipantManager(long j);

    public static final native void delete_TParticipantIdentifierVector(long j);

    public static final native void delete_VectorLong(long j);

    public static final native long new_TParticipantIdentifierVector__SWIG_0();

    public static final native long new_TParticipantIdentifierVector__SWIG_1(long j, TParticipantIdentifierVector tParticipantIdentifierVector);

    public static final native long new_TParticipantIdentifierVector__SWIG_2(int i, long j, ParticipantIdentifier participantIdentifier);

    public static final native long new_VectorLong__SWIG_0();

    public static final native long new_VectorLong__SWIG_1(long j, VectorLong vectorLong);

    public static final native long new_VectorLong__SWIG_2(int i, long j);
}
