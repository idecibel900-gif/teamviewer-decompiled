package com.teamviewer.apidefinitions.chat.models;

import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/ChatSendMessage;", "", "body", "", "clientMessageId", "", "<init>", "(Ljava/lang/String;I)V", "getBody", "()Ljava/lang/String;", "getClientMessageId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChatSendMessage {
    private final String body;
    private final int clientMessageId;

    public ChatSendMessage(@sp3(name = "body") String str, @sp3(name = "clientMessageId") int i) {
        str.getClass();
        this.body = str;
        this.clientMessageId = i;
    }

    public static /* synthetic */ ChatSendMessage copy$default(ChatSendMessage chatSendMessage, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatSendMessage.body;
        }
        if ((i2 & 2) != 0) {
            i = chatSendMessage.clientMessageId;
        }
        return chatSendMessage.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getClientMessageId() {
        return this.clientMessageId;
    }

    public final ChatSendMessage copy(@sp3(name = "body") String body, @sp3(name = "clientMessageId") int clientMessageId) {
        body.getClass();
        return new ChatSendMessage(body, clientMessageId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatSendMessage)) {
            return false;
        }
        ChatSendMessage chatSendMessage = (ChatSendMessage) other;
        return im3.n(this.body, chatSendMessage.body) && this.clientMessageId == chatSendMessage.clientMessageId;
    }

    public final String getBody() {
        return this.body;
    }

    public final int getClientMessageId() {
        return this.clientMessageId;
    }

    public int hashCode() {
        return Integer.hashCode(this.clientMessageId) + (this.body.hashCode() * 31);
    }

    public String toString() {
        return "ChatSendMessage(body=" + this.body + ", clientMessageId=" + this.clientMessageId + ")";
    }
}
