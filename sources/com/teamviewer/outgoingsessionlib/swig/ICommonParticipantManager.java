package com.teamviewer.outgoingsessionlib.swig;

import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;

/* JADX INFO: loaded from: classes.dex */
public class ICommonParticipantManager extends IBaseParticipantManager {
    private transient boolean swigCMemOwnDerived;
    private transient long swigCPtr;

    public ICommonParticipantManager(long j, boolean z) {
        super(ParticipantManagerSWIGJNI.ICommonParticipantManager_SWIGSmartPtrUpcast(j), true);
        this.swigCMemOwnDerived = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ICommonParticipantManager iCommonParticipantManager) {
        if (iCommonParticipantManager == null) {
            return 0L;
        }
        return iCommonParticipantManager.swigCPtr;
    }

    public boolean AllowedToDownloadFilesSC(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.ICommonParticipantManager_AllowedToDownloadFilesSC(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToShareFilesWithPresentersSC(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.ICommonParticipantManager_AllowedToShareFilesWithPresentersSC(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToShareFilesWithVisibleSC(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.ICommonParticipantManager_AllowedToShareFilesWithVisibleSC(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean AllowedToUseFileshareWidget(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.ICommonParticipantManager_AllowedToUseFileshareWidget(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public TParticipantIdentifierVector GetAllParticipants() {
        return new TParticipantIdentifierVector(ParticipantManagerSWIGJNI.ICommonParticipantManager_GetAllParticipants(this.swigCPtr, this), true);
    }

    public ParticipantIdentifier GetLastRemovedParticipantID() {
        return new ParticipantIdentifier(ParticipantManagerSWIGJNI.ICommonParticipantManager_GetLastRemovedParticipantID(this.swigCPtr, this), true);
    }

    public String GetNameOfParticipant(ParticipantIdentifier participantIdentifier, SWIGTYPE_p_ParticipantDisplayNameFlags sWIGTYPE_p_ParticipantDisplayNameFlags) {
        return ParticipantManagerSWIGJNI.ICommonParticipantManager_GetNameOfParticipant__SWIG_0(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, SWIGTYPE_p_ParticipantDisplayNameFlags.getCPtr(sWIGTYPE_p_ParticipantDisplayNameFlags));
    }

    public String GetNameOfUniquePartnerOrMeetingID(SWIGTYPE_p_ParticipantDisplayNameFlags sWIGTYPE_p_ParticipantDisplayNameFlags) {
        return ParticipantManagerSWIGJNI.ICommonParticipantManager_GetNameOfUniquePartnerOrMeetingID__SWIG_0(this.swigCPtr, this, SWIGTYPE_p_ParticipantDisplayNameFlags.getCPtr(sWIGTYPE_p_ParticipantDisplayNameFlags));
    }

    public long GetOutgoingStreamID(SWIGTYPE_p_tvstream__StreamTypeUuid sWIGTYPE_p_tvstream__StreamTypeUuid) {
        return ParticipantManagerSWIGJNI.ICommonParticipantManager_GetOutgoingStreamID__SWIG_1(this.swigCPtr, this, SWIGTYPE_p_tvstream__StreamTypeUuid.getCPtr(sWIGTYPE_p_tvstream__StreamTypeUuid));
    }

    public ParticipantIdentifier GetPIDOfUniquePartner() {
        return new ParticipantIdentifier(ParticipantManagerSWIGJNI.ICommonParticipantManager_GetPIDOfUniquePartner(this.swigCPtr, this), true);
    }

    public Participant GetParticipant(ParticipantIdentifier participantIdentifier) {
        return new Participant(ParticipantManagerSWIGJNI.ICommonParticipantManager_GetParticipant(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier), true);
    }

    public void PendingParticipant_Accept(ParticipantIdentifier participantIdentifier) {
        ParticipantManagerSWIGJNI.ICommonParticipantManager_PendingParticipant_Accept(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public void PendingParticipant_Deny(ParticipantIdentifier participantIdentifier) {
        ParticipantManagerSWIGJNI.ICommonParticipantManager_PendingParticipant_Deny(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public void PendingParticipant_Whitelist_Add(long j, boolean z) {
        ParticipantManagerSWIGJNI.ICommonParticipantManager_PendingParticipant_Whitelist_Add(this.swigCPtr, this, j, z);
    }

    public void PendingParticipant_Whitelist_Remove(long j, boolean z) {
        ParticipantManagerSWIGJNI.ICommonParticipantManager_PendingParticipant_Whitelist_Remove(this.swigCPtr, this, j, z);
    }

    public boolean RegisterNewStreamWithoutCallback(int i, int i2, boolean z, int i3, boolean z2, boolean z3, long j, ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.ICommonParticipantManager_RegisterNewStreamWithoutCallback(this.swigCPtr, this, i, i2, z, i3, z2, z3, j, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }

    public boolean RequestRecordingPermissionFromSipParticipant(ParticipantIdentifier participantIdentifier, ParticipantIdentifier participantIdentifier2, boolean z) {
        return ParticipantManagerSWIGJNI.ICommonParticipantManager_RequestRecordingPermissionFromSipParticipant(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, ParticipantIdentifier.getCPtr(participantIdentifier2), participantIdentifier2, z);
    }

    public void StartFullSynchronisation(int i) {
        ParticipantManagerSWIGJNI.ICommonParticipantManager_StartFullSynchronisation(this.swigCPtr, this, i);
    }

    @Override // com.teamviewer.outgoingsessionlib.swig.IBaseParticipantManager
    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwnDerived) {
                    this.swigCMemOwnDerived = false;
                    ParticipantManagerSWIGJNI.delete_ICommonParticipantManager(j);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.teamviewer.outgoingsessionlib.swig.IBaseParticipantManager
    public void finalize() {
        delete();
    }

    @Override // com.teamviewer.outgoingsessionlib.swig.IBaseParticipantManager
    public void swigSetCMemOwn(boolean z) {
        this.swigCMemOwnDerived = z;
        super.swigSetCMemOwn(z);
    }

    public String GetNameOfUniquePartnerOrMeetingID() {
        return ParticipantManagerSWIGJNI.ICommonParticipantManager_GetNameOfUniquePartnerOrMeetingID__SWIG_1(this.swigCPtr, this);
    }

    public long GetOutgoingStreamID(int i) {
        return ParticipantManagerSWIGJNI.ICommonParticipantManager_GetOutgoingStreamID__SWIG_0(this.swigCPtr, this, i);
    }

    public String GetNameOfParticipant(ParticipantIdentifier participantIdentifier) {
        return ParticipantManagerSWIGJNI.ICommonParticipantManager_GetNameOfParticipant__SWIG_1(this.swigCPtr, this, ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier);
    }
}
