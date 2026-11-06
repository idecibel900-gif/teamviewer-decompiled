package com.teamviewer.outgoingsessionlib.swig;

import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;

/* JADX INFO: loaded from: classes.dex */
public class IBaseParticipantManager {
    public static final long MAX_MEETING_NAME_LEN = 50;
    private transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public static final class ESyncState {
        public static final int NotSynced = 0;
        public static final int Synced = 2;
        public static final int Syncing = 1;
    }

    public static final class RCAccessControlState {
        public static final int RCAccessControlState_AnswerReceived = 2;
        public static final int RCAccessControlState_LocalSet = 1;
        public static final int RCAccessControlState_Undefined = 0;
        public static final int RCAccessControlState_UserAnswerToMsgBox = 3;
    }

    public static final class eReturnType {
        public static final int RT_FALSE = 1;
        public static final int RT_NONE = 0;
        public static final int RT_SYNCHRONIZING = 3;
        public static final int RT_TRUE = 2;
    }

    public IBaseParticipantManager(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IBaseParticipantManager iBaseParticipantManager) {
        if (iBaseParticipantManager == null) {
            return 0L;
        }
        return iBaseParticipantManager.swigCPtr;
    }

    public void ActivateWhiteboard(boolean z) {
        ParticipantManagerSWIGJNI.IBaseParticipantManager_ActivateWhiteboard(this.swigCPtr, this, z);
    }

    public boolean AllowToActivateWhiteboard(ParticipantIdentifier participantIdentifier, boolean z) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowToActivateWhiteboard(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, z);
    }

    public boolean AllowToChat(ParticipantIdentifier participantIdentifier, boolean z) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowToChat(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, z);
    }

    public boolean AllowToDownloadFiles(ParticipantIdentifier participantIdentifier, boolean z) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowToDownloadFiles(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, z);
    }

    public boolean AllowToDraw(ParticipantIdentifier participantIdentifier, boolean z) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowToDraw(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, z);
    }

    public boolean AllowToListen(ParticipantIdentifier participantIdentifier, boolean z) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowToListen(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, z);
    }

    public boolean AllowToPoint(ParticipantIdentifier participantIdentifier, boolean z) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowToPoint(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, z);
    }

    public boolean AllowToRemoteCtrl(ParticipantIdentifier participantIdentifier, boolean z) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowToRemoteCtrl(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, z);
    }

    public boolean AllowToSeeInvisible(ParticipantIdentifier participantIdentifier, boolean z) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowToSeeInvisible(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, z);
    }

    public boolean AllowToSeeVideo(ParticipantIdentifier participantIdentifier, boolean z) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowToSeeVideo(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, z);
    }

    public boolean AllowToShowVideo(ParticipantIdentifier participantIdentifier, boolean z) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowToShowVideo(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, z);
    }

    public boolean AllowToSpeak(ParticipantIdentifier participantIdentifier, boolean z) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowToSpeak(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, z);
    }

    public boolean AllowToUploadFiles(ParticipantIdentifier participantIdentifier, boolean z) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowToUploadFiles(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, z);
    }

    public boolean AllowedToActivateWhiteboard(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToActivateWhiteboard(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToAssignOrganizer(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToAssignOrganizer(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToAssignPresenter(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToAssignPresenter(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToChat(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToChat(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToDisplayMeetingId(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToDisplayMeetingId(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToDisplayPassword(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToDisplayPassword(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToDownloadFiles(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToDownloadFiles(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToDraw(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToDraw(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToListen(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToListen(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToPoint(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToPoint(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToRemoteCtrl(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToRemoteCtrl(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToSeeInvisible(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToSeeInvisible(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToSeeVideo(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToSeeVideo(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToSendChat(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToSendChat(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToShowVideo(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToShowVideo(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToSpeak(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToSpeak(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToUploadFiles(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AllowedToUploadFiles(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AmIOrganizer() {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AmIOrganizer(this.swigCPtr, this);
    }

    public boolean AmIPresenter() {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_AmIPresenter(this.swigCPtr, this);
    }

    public boolean CanChat(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_CanChat(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean CanDrawWhiteboard(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_CanDrawWhiteboard(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean CanPoint(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_CanPoint(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean CanRemoteControl(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_CanRemoteControl(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean CanShowVideo(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_CanShowVideo(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean CanSpeak(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_CanSpeak(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean CanSynchronizePresenterRoleRequests(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_CanSynchronizePresenterRoleRequests(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean CanSynchronizeVideoStartRequests(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_CanSynchronizeVideoStartRequests(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean CanUploadFiles(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_CanUploadFiles(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public TParticipantIdentifierVector GetAllVisible() {
        return new TParticipantIdentifierVector(ParticipantManagerSWIGJNI.IBaseParticipantManager_GetAllVisible(this.swigCPtr, this), true);
    }

    public ParticipantIdentifier GetMyParticipantIdentifier() {
        return new ParticipantIdentifier(ParticipantManagerSWIGJNI.IBaseParticipantManager_GetMyParticipantIdentifier(this.swigCPtr, this), true);
    }

    public long GetNumberOfStreamTypeSubscribers(int i) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_GetNumberOfStreamTypeSubscribers(this.swigCPtr, this, i);
    }

    public long GetParticipantCount() {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_GetParticipantCount(this.swigCPtr, this);
    }

    public TParticipantIdentifierVector GetParticipantIDs() {
        return new TParticipantIdentifierVector(ParticipantManagerSWIGJNI.IBaseParticipantManager_GetParticipantIDs(this.swigCPtr, this), true);
    }

    public int GetParticipantType(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_GetParticipantType(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public ParticipantIdentifier GetPresenter() {
        return new ParticipantIdentifier(ParticipantManagerSWIGJNI.IBaseParticipantManager_GetPresenter(this.swigCPtr, this), true);
    }

    public int GetRegStream(long j, DataStream dataStream) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_GetRegStream(this.swigCPtr, this, j, DataStream.getCPtr(dataStream), dataStream);
    }

    public ParticipantIdentifier GetStreamSource(long j) {
        return new ParticipantIdentifier(ParticipantManagerSWIGJNI.IBaseParticipantManager_GetStreamSource(this.swigCPtr, this, j), true);
    }

    public long GetSupportedStreamFeatures(ParticipantIdentifier participantIdentifier, int i) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_GetSupportedStreamFeatures(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, i);
    }

    public int GetSyncState() {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_GetSyncState(this.swigCPtr, this);
    }

    public boolean HasParticipant(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_HasParticipant(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean IsAudioInteractionAllowed() {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_IsAudioInteractionAllowed(this.swigCPtr, this);
    }

    public boolean IsFullyCompatible(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_IsFullyCompatible(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean IsOrganizer(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_IsOrganizer(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public int IsParticipantVisible(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_IsParticipantVisible(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean IsPresenter(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_IsPresenter(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean IsPresenterHandingOverPossible(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_IsPresenterHandingOverPossible(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean IsRecordMeetingAllowed() {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_IsRecordMeetingAllowed(this.swigCPtr, this);
    }

    public void ParticipantAddedInMeetingControl(ParticipantIdentifier participantIdentifier) {
        ParticipantManagerSWIGJNI.IBaseParticipantManager_ParticipantAddedInMeetingControl(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean SetAccountPictureURL(ParticipantIdentifier participantIdentifier, String str) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_SetAccountPictureURL(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, str);
    }

    public boolean SetMyAccountData(long j, String str, String str2) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_SetMyAccountData(this.swigCPtr, this, j, str, str2);
    }

    public void SetMyParticipantIdentifier(ParticipantIdentifier participantIdentifier) {
        ParticipantManagerSWIGJNI.IBaseParticipantManager_SetMyParticipantIdentifier(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public int SetOrganizer(ParticipantIdentifier participantIdentifier, boolean z) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_SetOrganizer(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, z);
    }

    public boolean SetParticipantName(ParticipantIdentifier participantIdentifier, String str) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_SetParticipantName(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, str);
    }

    public int SetPresenter(ParticipantIdentifier participantIdentifier, boolean z) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_SetPresenter(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, z);
    }

    public boolean SubscribeStreamForParticipant(DataStream dataStream, ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_SubscribeStreamForParticipant(this.swigCPtr, this, DataStream.getCPtr(dataStream), dataStream, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean SubscribeStreamIfSupported(DataStream dataStream) {
        return ParticipantManagerSWIGJNI.IBaseParticipantManager_SubscribeStreamIfSupported(this.swigCPtr, this, DataStream.getCPtr(dataStream), dataStream);
    }

    public void UnsubscribeStream(long j) {
        ParticipantManagerSWIGJNI.IBaseParticipantManager_UnsubscribeStream(this.swigCPtr, this, j);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ParticipantManagerSWIGJNI.delete_IBaseParticipantManager(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwn = z;
    }
}
