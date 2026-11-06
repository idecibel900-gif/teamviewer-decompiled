package com.teamviewer.apidefinitions.chat.models;

import kotlin.Metadata;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/NewMessageContext;", "", "authorDisplayName", "", "chatRoomId", "messageText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthorDisplayName", "()Ljava/lang/String;", "getChatRoomId", "getMessageText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NewMessageContext {
    private final String authorDisplayName;
    private final String chatRoomId;
    private final String messageText;

    public NewMessageContext(@sp3(name = "authorDisplayName") String str, @sp3(name = "chatRoomId") String str2, @sp3(name = "messageText") String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.authorDisplayName = str;
        this.chatRoomId = str2;
        this.messageText = str3;
    }

    public static /* synthetic */ NewMessageContext copy$default(NewMessageContext newMessageContext, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newMessageContext.authorDisplayName;
        }
        if ((i & 2) != 0) {
            str2 = newMessageContext.chatRoomId;
        }
        if ((i & 4) != 0) {
            str3 = newMessageContext.messageText;
        }
        return newMessageContext.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthorDisplayName() {
        return this.authorDisplayName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessageText() {
        return this.messageText;
    }

    public final NewMessageContext copy(@sp3(name = "authorDisplayName") String authorDisplayName, @sp3(name = "chatRoomId") String chatRoomId, @sp3(name = "messageText") String messageText) {
        authorDisplayName.getClass();
        chatRoomId.getClass();
        messageText.getClass();
        return new NewMessageContext(authorDisplayName, chatRoomId, messageText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewMessageContext)) {
            return false;
        }
        NewMessageContext newMessageContext = (NewMessageContext) other;
        return im3.n(this.authorDisplayName, newMessageContext.authorDisplayName) && im3.n(this.chatRoomId, newMessageContext.chatRoomId) && im3.n(this.messageText, newMessageContext.messageText);
    }

    public final String getAuthorDisplayName() {
        return this.authorDisplayName;
    }

    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public final String getMessageText() {
        return this.messageText;
    }

    public int hashCode() {
        return this.messageText.hashCode() + to7.e(this.authorDisplayName.hashCode() * 31, 31, this.chatRoomId);
    }

    public String toString() {
        String str = this.authorDisplayName;
        String str2 = this.chatRoomId;
        return e41.l(e41.o("NewMessageContext(authorDisplayName=", str, ", chatRoomId=", str2, ", messageText="), this.messageText, ")");
    }
}
