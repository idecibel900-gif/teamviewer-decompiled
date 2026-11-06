package com.teamviewer.apidefinitions.chat.models;

import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/teamviewer/apidefinitions/chat/models/UserTypingRequest;", "", "userId", "", "isTyping", "", "<init>", "(Ljava/lang/String;Z)V", "getUserId", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserTypingRequest {
    private final boolean isTyping;
    private final String userId;

    public UserTypingRequest(@sp3(name = "userId") String str, @sp3(name = "isTyping") boolean z) {
        str.getClass();
        this.userId = str;
        this.isTyping = z;
    }

    public static /* synthetic */ UserTypingRequest copy$default(UserTypingRequest userTypingRequest, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userTypingRequest.userId;
        }
        if ((i & 2) != 0) {
            z = userTypingRequest.isTyping;
        }
        return userTypingRequest.copy(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsTyping() {
        return this.isTyping;
    }

    public final UserTypingRequest copy(@sp3(name = "userId") String userId, @sp3(name = "isTyping") boolean isTyping) {
        userId.getClass();
        return new UserTypingRequest(userId, isTyping);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserTypingRequest)) {
            return false;
        }
        UserTypingRequest userTypingRequest = (UserTypingRequest) other;
        return im3.n(this.userId, userTypingRequest.userId) && this.isTyping == userTypingRequest.isTyping;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isTyping) + (this.userId.hashCode() * 31);
    }

    public final boolean isTyping() {
        return this.isTyping;
    }

    public String toString() {
        return "UserTypingRequest(userId=" + this.userId + ", isTyping=" + this.isTyping + ")";
    }
}
