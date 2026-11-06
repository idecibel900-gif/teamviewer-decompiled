package com.teamviewer.outgoingsessionlib.swig;

import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;

/* JADX INFO: loaded from: classes.dex */
public class ParticipantSWIGJNI {
    public static final native long Participant_Assignment(long j, Participant participant, long j2, Participant participant2);

    public static final native String Participant_GetAccountPictureURL(long j, Participant participant);

    public static final native long Participant_GetCompatibilityFlags(long j, Participant participant);

    public static final native long Participant_GetID(long j, Participant participant);

    public static final native long Participant_GetJoinTimestamp(long j, Participant participant);

    public static final native String Participant_GetName(long j, Participant participant);

    public static final native long Participant_GetSupportedStreamFeatures(long j, Participant participant, int i);

    public static final native int Participant_GetType(long j, Participant participant);

    public static final native boolean Participant_IsFullyCompatible(long j, Participant participant, long j2);

    public static final native boolean Participant_IsOfType(long j, Participant participant, int i);

    public static final native boolean Participant_IsOrganizer(long j, Participant participant);

    public static final native boolean Participant_IsPresenter(long j, Participant participant);

    public static final native boolean Participant_IsRouter(long j, Participant participant);

    public static final native boolean Participant_IsValid(long j, Participant participant);

    public static final native boolean Participant_IsVisible(long j, Participant participant);

    public static final native void Participant_SetAccountPictureURL(long j, Participant participant, String str);

    public static final native void Participant_SetName(long j, Participant participant, String str);

    public static final native void Participant_SetOrganizer(long j, Participant participant, boolean z);

    public static final native void Participant_SetParticipantType(long j, Participant participant, int i);

    public static final native void Participant_SetPresenter(long j, Participant participant, boolean z);

    public static final native void Participant_SetVisible(long j, Participant participant, boolean z);

    public static final native void delete_Participant(long j);

    public static final native long new_Participant__SWIG_0(long j, ParticipantIdentifier participantIdentifier, int i, String str, long j2, boolean z, long j3, long j4, long j5, long j6, String str2);

    public static final native long new_Participant__SWIG_1(long j, ParticipantIdentifier participantIdentifier, int i, String str, long j2, boolean z, long j3, long j4, long j5, long j6);

    public static final native long new_Participant__SWIG_2(long j, ParticipantIdentifier participantIdentifier);

    public static final native long new_Participant__SWIG_3(long j);

    public static final native long new_Participant__SWIG_4(long j, Participant participant);
}
