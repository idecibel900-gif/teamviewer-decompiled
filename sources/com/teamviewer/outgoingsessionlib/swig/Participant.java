package com.teamviewer.outgoingsessionlib.swig;

import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import o.hk0;

/* JADX INFO: loaded from: classes.dex */
public class Participant {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public Participant(ParticipantIdentifier participantIdentifier, int i, String str, SWIGTYPE_p_boost__optionalT_uint32_t_t sWIGTYPE_p_boost__optionalT_uint32_t_t, boolean z, SWIGTYPE_p_boost__logic__tribool sWIGTYPE_p_boost__logic__tribool, SWIGTYPE_p_std__vectorT_long_long_t sWIGTYPE_p_std__vectorT_long_long_t, long j, long j2, String str2) {
        this(ParticipantSWIGJNI.new_Participant__SWIG_0(ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, i, str, SWIGTYPE_p_boost__optionalT_uint32_t_t.getCPtr(sWIGTYPE_p_boost__optionalT_uint32_t_t), z, SWIGTYPE_p_boost__logic__tribool.getCPtr(sWIGTYPE_p_boost__logic__tribool), SWIGTYPE_p_std__vectorT_long_long_t.getCPtr(sWIGTYPE_p_std__vectorT_long_long_t), j, j2, str2), true);
    }

    public static long getCPtr(Participant participant) {
        if (participant == null) {
            return 0L;
        }
        return participant.swigCPtr;
    }

    public static long swigRelease(Participant participant) {
        if (participant != null) {
            if (participant.swigCMemOwn) {
                long j = participant.swigCPtr;
                participant.swigCMemOwn = false;
                participant.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public Participant Assignment(Participant participant) {
        return new Participant(ParticipantSWIGJNI.Participant_Assignment(this.swigCPtr, this, getCPtr(participant), participant), false);
    }

    public String GetAccountPictureURL() {
        return ParticipantSWIGJNI.Participant_GetAccountPictureURL(this.swigCPtr, this);
    }

    public long GetCompatibilityFlags() {
        return ParticipantSWIGJNI.Participant_GetCompatibilityFlags(this.swigCPtr, this);
    }

    public ParticipantIdentifier GetID() {
        return new ParticipantIdentifier(ParticipantSWIGJNI.Participant_GetID(this.swigCPtr, this), true);
    }

    public long GetJoinTimestamp() {
        return ParticipantSWIGJNI.Participant_GetJoinTimestamp(this.swigCPtr, this);
    }

    public String GetName() {
        return ParticipantSWIGJNI.Participant_GetName(this.swigCPtr, this);
    }

    public long GetSupportedStreamFeatures(StreamType streamType) {
        return ParticipantSWIGJNI.Participant_GetSupportedStreamFeatures(this.swigCPtr, this, streamType.swigValue());
    }

    public int GetType() {
        return ParticipantSWIGJNI.Participant_GetType(this.swigCPtr, this);
    }

    public boolean IsFullyCompatible(long j) {
        return ParticipantSWIGJNI.Participant_IsFullyCompatible(this.swigCPtr, this, j);
    }

    public boolean IsOfType(int i) {
        return ParticipantSWIGJNI.Participant_IsOfType(this.swigCPtr, this, i);
    }

    public boolean IsOrganizer() {
        return ParticipantSWIGJNI.Participant_IsOrganizer(this.swigCPtr, this);
    }

    public boolean IsPresenter() {
        return ParticipantSWIGJNI.Participant_IsPresenter(this.swigCPtr, this);
    }

    public boolean IsRouter() {
        return ParticipantSWIGJNI.Participant_IsRouter(this.swigCPtr, this);
    }

    public boolean IsValid() {
        return ParticipantSWIGJNI.Participant_IsValid(this.swigCPtr, this);
    }

    public boolean IsVisible() {
        return ParticipantSWIGJNI.Participant_IsVisible(this.swigCPtr, this);
    }

    public void SetAccountPictureURL(String str) {
        ParticipantSWIGJNI.Participant_SetAccountPictureURL(this.swigCPtr, this, str);
    }

    public void SetName(String str) {
        ParticipantSWIGJNI.Participant_SetName(this.swigCPtr, this, str);
    }

    public void SetOrganizer(boolean z) {
        ParticipantSWIGJNI.Participant_SetOrganizer(this.swigCPtr, this, z);
    }

    public void SetParticipantType(int i) {
        ParticipantSWIGJNI.Participant_SetParticipantType(this.swigCPtr, this, i);
    }

    public void SetPresenter(boolean z) {
        ParticipantSWIGJNI.Participant_SetPresenter(this.swigCPtr, this, z);
    }

    public void SetVisible(boolean z) {
        ParticipantSWIGJNI.Participant_SetVisible(this.swigCPtr, this, z);
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ParticipantSWIGJNI.delete_Participant(j);
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

    public Participant(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public Participant(ParticipantIdentifier participantIdentifier, int i, String str, SWIGTYPE_p_boost__optionalT_uint32_t_t sWIGTYPE_p_boost__optionalT_uint32_t_t, boolean z, SWIGTYPE_p_boost__logic__tribool sWIGTYPE_p_boost__logic__tribool, SWIGTYPE_p_std__vectorT_long_long_t sWIGTYPE_p_std__vectorT_long_long_t, long j, long j2) {
        this(ParticipantSWIGJNI.new_Participant__SWIG_1(ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier, i, str, SWIGTYPE_p_boost__optionalT_uint32_t_t.getCPtr(sWIGTYPE_p_boost__optionalT_uint32_t_t), z, SWIGTYPE_p_boost__logic__tribool.getCPtr(sWIGTYPE_p_boost__logic__tribool), SWIGTYPE_p_std__vectorT_long_long_t.getCPtr(sWIGTYPE_p_std__vectorT_long_long_t), j, j2), true);
    }

    public Participant(ParticipantIdentifier participantIdentifier) {
        this(ParticipantSWIGJNI.new_Participant__SWIG_2(ParticipantIdentifier.getCPtr(participantIdentifier), participantIdentifier), true);
    }

    public Participant(SWIGTYPE_p_tvbcommand__BCommand sWIGTYPE_p_tvbcommand__BCommand) {
        this(ParticipantSWIGJNI.new_Participant__SWIG_3(SWIGTYPE_p_tvbcommand__BCommand.getCPtr(sWIGTYPE_p_tvbcommand__BCommand)), true);
    }

    public Participant(Participant participant) {
        this(ParticipantSWIGJNI.new_Participant__SWIG_4(getCPtr(participant), participant), true);
    }
}
