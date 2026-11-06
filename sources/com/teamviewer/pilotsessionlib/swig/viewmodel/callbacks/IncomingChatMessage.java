package com.teamviewer.pilotsessionlib.swig.viewmodel.callbacks;

import com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow.ParticipantChatColor;
import com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow.ParticipantRole;
import o.hk0;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
public class IncomingChatMessage {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IncomingChatMessage() {
        this(IncomingChatMessageSWIGJNI.new_IncomingChatMessage(), true);
    }

    public static long getCPtr(IncomingChatMessage incomingChatMessage) {
        if (incomingChatMessage == null) {
            return 0L;
        }
        return incomingChatMessage.swigCPtr;
    }

    public static long swigRelease(IncomingChatMessage incomingChatMessage) {
        if (incomingChatMessage != null) {
            if (incomingChatMessage.swigCMemOwn) {
                long j = incomingChatMessage.swigCPtr;
                incomingChatMessage.swigCMemOwn = false;
                incomingChatMessage.delete();
                return j;
            }
            hk0.o("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    IncomingChatMessageSWIGJNI.delete_IncomingChatMessage(j);
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

    public boolean getIsOwnMessage() {
        return IncomingChatMessageSWIGJNI.IncomingChatMessage_isOwnMessage_get(this.swigCPtr, this);
    }

    public boolean getIsTranslated() {
        return IncomingChatMessageSWIGJNI.IncomingChatMessage_isTranslated_get(this.swigCPtr, this);
    }

    public long getMessageId() {
        return IncomingChatMessageSWIGJNI.IncomingChatMessage_messageId_get(this.swigCPtr, this);
    }

    public ParticipantChatColor getParticipantColor() {
        int iIncomingChatMessage_participantColor_get = IncomingChatMessageSWIGJNI.IncomingChatMessage_participantColor_get(this.swigCPtr, this);
        ParticipantChatColor[] participantChatColorArr = ParticipantChatColor.n;
        ParticipantChatColor[] participantChatColorArr2 = (ParticipantChatColor[]) ParticipantChatColor.class.getEnumConstants();
        if (iIncomingChatMessage_participantColor_get < participantChatColorArr2.length && iIncomingChatMessage_participantColor_get >= 0) {
            ParticipantChatColor participantChatColor = participantChatColorArr2[iIncomingChatMessage_participantColor_get];
            if (participantChatColor.m == iIncomingChatMessage_participantColor_get) {
                return participantChatColor;
            }
        }
        for (ParticipantChatColor participantChatColor2 : participantChatColorArr2) {
            if (participantChatColor2.m == iIncomingChatMessage_participantColor_get) {
                return participantChatColor2;
            }
        }
        hk0.g(ua5.k(iIncomingChatMessage_participantColor_get, ParticipantChatColor.class, "No enum ", " with value "));
        return null;
    }

    public long getParticipantId() {
        return IncomingChatMessageSWIGJNI.IncomingChatMessage_participantId_get(this.swigCPtr, this);
    }

    public String getParticipantName() {
        return IncomingChatMessageSWIGJNI.IncomingChatMessage_participantName_get(this.swigCPtr, this);
    }

    public ParticipantRole getParticipantRole() {
        int iIncomingChatMessage_participantRole_get = IncomingChatMessageSWIGJNI.IncomingChatMessage_participantRole_get(this.swigCPtr, this);
        ParticipantRole[] participantRoleArr = (ParticipantRole[]) ParticipantRole.class.getEnumConstants();
        if (iIncomingChatMessage_participantRole_get < participantRoleArr.length && iIncomingChatMessage_participantRole_get >= 0) {
            ParticipantRole participantRole = participantRoleArr[iIncomingChatMessage_participantRole_get];
            if (participantRole.m == iIncomingChatMessage_participantRole_get) {
                return participantRole;
            }
        }
        for (ParticipantRole participantRole2 : participantRoleArr) {
            if (participantRole2.m == iIncomingChatMessage_participantRole_get) {
                return participantRole2;
            }
        }
        hk0.g(ua5.k(iIncomingChatMessage_participantRole_get, ParticipantRole.class, "No enum ", " with value "));
        return null;
    }

    public String getPictureUrl() {
        return IncomingChatMessageSWIGJNI.IncomingChatMessage_pictureUrl_get(this.swigCPtr, this);
    }

    public boolean getShowHeader() {
        return IncomingChatMessageSWIGJNI.IncomingChatMessage_showHeader_get(this.swigCPtr, this);
    }

    public String getText() {
        return IncomingChatMessageSWIGJNI.IncomingChatMessage_text_get(this.swigCPtr, this);
    }

    public void setIsOwnMessage(boolean z) {
        IncomingChatMessageSWIGJNI.IncomingChatMessage_isOwnMessage_set(this.swigCPtr, this, z);
    }

    public void setIsTranslated(boolean z) {
        IncomingChatMessageSWIGJNI.IncomingChatMessage_isTranslated_set(this.swigCPtr, this, z);
    }

    public void setMessageId(long j) {
        IncomingChatMessageSWIGJNI.IncomingChatMessage_messageId_set(this.swigCPtr, this, j);
    }

    public void setParticipantColor(ParticipantChatColor participantChatColor) {
        IncomingChatMessageSWIGJNI.IncomingChatMessage_participantColor_set(this.swigCPtr, this, participantChatColor.m);
    }

    public void setParticipantId(long j) {
        IncomingChatMessageSWIGJNI.IncomingChatMessage_participantId_set(this.swigCPtr, this, j);
    }

    public void setParticipantName(String str) {
        IncomingChatMessageSWIGJNI.IncomingChatMessage_participantName_set(this.swigCPtr, this, str);
    }

    public void setParticipantRole(ParticipantRole participantRole) {
        IncomingChatMessageSWIGJNI.IncomingChatMessage_participantRole_set(this.swigCPtr, this, participantRole.m);
    }

    public void setPictureUrl(String str) {
        IncomingChatMessageSWIGJNI.IncomingChatMessage_pictureUrl_set(this.swigCPtr, this, str);
    }

    public void setShowHeader(boolean z) {
        IncomingChatMessageSWIGJNI.IncomingChatMessage_showHeader_set(this.swigCPtr, this, z);
    }

    public void setText(String str) {
        IncomingChatMessageSWIGJNI.IncomingChatMessage_text_set(this.swigCPtr, this, str);
    }

    public IncomingChatMessage(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
