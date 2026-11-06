package com.teamviewer.teamviewerlib.swig.tvsessionprotocol;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;

/* JADX INFO: loaded from: classes.dex */
public class ParticipantIdentifierSWIGJNI {
    public static final native long InvalidParticipantIdentifier_get();

    public static final native long ParticipantIdentifier_Assignment(long j, ParticipantIdentifier participantIdentifier, long j2, ParticipantIdentifier participantIdentifier2);

    public static final native long ParticipantIdentifier_Deserialize(byte[] bArr);

    public static final native long ParticipantIdentifier_DyngateID(long j, ParticipantIdentifier participantIdentifier);

    public static final native boolean ParticipantIdentifier_Equal(long j, ParticipantIdentifier participantIdentifier, long j2, ParticipantIdentifier participantIdentifier2);

    public static final native boolean ParticipantIdentifier_GreaterThan(long j, ParticipantIdentifier participantIdentifier, long j2, ParticipantIdentifier participantIdentifier2);

    public static final native boolean ParticipantIdentifier_IsValid(long j, ParticipantIdentifier participantIdentifier);

    public static final native boolean ParticipantIdentifier_LessThan(long j, ParticipantIdentifier participantIdentifier, long j2, ParticipantIdentifier participantIdentifier2);

    public static final native boolean ParticipantIdentifier_NotEqual(long j, ParticipantIdentifier participantIdentifier, long j2, ParticipantIdentifier participantIdentifier2);

    public static final native byte[] ParticipantIdentifier_Serialize(long j, ParticipantIdentifier participantIdentifier);

    public static final native int ParticipantIdentifier_SessionID(long j, ParticipantIdentifier participantIdentifier);

    public static final native String ParticipantIdentifier_ToString(long j, ParticipantIdentifier participantIdentifier);

    public static final native String ParticipantIdentifier_ToWString(long j, ParticipantIdentifier participantIdentifier);

    public static final native long ParticipantIdentifier_fromDyngateIdAndSessionId(long j, long j2);

    public static final native long ParticipantIdentifier_fromInt64(long j);

    public static final native long ParticipantIdentifier_getInvalid();

    public static final native String ParticipantIdentifier_nativeToString(long j, ParticipantIdentifier participantIdentifier);

    public static final native long ParticipantIdentifier_toInt64(long j, ParticipantIdentifier participantIdentifier);

    public static final native void delete_ParticipantIdentifier(long j);

    public static final native long new_ParticipantIdentifier__SWIG_0();

    public static final native long new_ParticipantIdentifier__SWIG_1(long j, DyngateID dyngateID, int i);

    public static final native long new_ParticipantIdentifier__SWIG_2(long j, ParticipantIdentifier participantIdentifier);
}
