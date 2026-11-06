package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JF\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectFailedContext;", "", "failureReason", "Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectFailedReason;", "supporteeName", "", "supporteePictureUrl", "tryAgainAfterSeconds", "", "sessionType", "Lcom/teamviewer/apidefinitions/remotecontrol/models/SessionType;", "<init>", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectFailedReason;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/teamviewer/apidefinitions/remotecontrol/models/SessionType;)V", "getFailureReason", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectFailedReason;", "getSupporteeName", "()Ljava/lang/String;", "getSupporteePictureUrl", "getTryAgainAfterSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSessionType", "()Lcom/teamviewer/apidefinitions/remotecontrol/models/SessionType;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectFailedReason;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/teamviewer/apidefinitions/remotecontrol/models/SessionType;)Lcom/teamviewer/apidefinitions/remotecontrol/models/ConnectFailedContext;", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConnectFailedContext {
    private final ConnectFailedReason failureReason;
    private final SessionType sessionType;
    private final String supporteeName;
    private final String supporteePictureUrl;
    private final Integer tryAgainAfterSeconds;

    public ConnectFailedContext(@sp3(name = "failureReason") ConnectFailedReason connectFailedReason, @sp3(name = "supporteeName") String str, @sp3(name = "supporteePictureUrl") String str2, @sp3(name = "tryAgainAfterSeconds") Integer num, @sp3(name = "sessionType") SessionType sessionType) {
        connectFailedReason.getClass();
        str.getClass();
        this.failureReason = connectFailedReason;
        this.supporteeName = str;
        this.supporteePictureUrl = str2;
        this.tryAgainAfterSeconds = num;
        this.sessionType = sessionType;
    }

    public static /* synthetic */ ConnectFailedContext copy$default(ConnectFailedContext connectFailedContext, ConnectFailedReason connectFailedReason, String str, String str2, Integer num, SessionType sessionType, int i, Object obj) {
        if ((i & 1) != 0) {
            connectFailedReason = connectFailedContext.failureReason;
        }
        if ((i & 2) != 0) {
            str = connectFailedContext.supporteeName;
        }
        if ((i & 4) != 0) {
            str2 = connectFailedContext.supporteePictureUrl;
        }
        if ((i & 8) != 0) {
            num = connectFailedContext.tryAgainAfterSeconds;
        }
        if ((i & 16) != 0) {
            sessionType = connectFailedContext.sessionType;
        }
        SessionType sessionType2 = sessionType;
        String str3 = str2;
        return connectFailedContext.copy(connectFailedReason, str, str3, num, sessionType2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConnectFailedReason getFailureReason() {
        return this.failureReason;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSupporteeName() {
        return this.supporteeName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSupporteePictureUrl() {
        return this.supporteePictureUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTryAgainAfterSeconds() {
        return this.tryAgainAfterSeconds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SessionType getSessionType() {
        return this.sessionType;
    }

    public final ConnectFailedContext copy(@sp3(name = "failureReason") ConnectFailedReason failureReason, @sp3(name = "supporteeName") String supporteeName, @sp3(name = "supporteePictureUrl") String supporteePictureUrl, @sp3(name = "tryAgainAfterSeconds") Integer tryAgainAfterSeconds, @sp3(name = "sessionType") SessionType sessionType) {
        failureReason.getClass();
        supporteeName.getClass();
        return new ConnectFailedContext(failureReason, supporteeName, supporteePictureUrl, tryAgainAfterSeconds, sessionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectFailedContext)) {
            return false;
        }
        ConnectFailedContext connectFailedContext = (ConnectFailedContext) other;
        return this.failureReason == connectFailedContext.failureReason && im3.n(this.supporteeName, connectFailedContext.supporteeName) && im3.n(this.supporteePictureUrl, connectFailedContext.supporteePictureUrl) && im3.n(this.tryAgainAfterSeconds, connectFailedContext.tryAgainAfterSeconds) && this.sessionType == connectFailedContext.sessionType;
    }

    public final ConnectFailedReason getFailureReason() {
        return this.failureReason;
    }

    public final SessionType getSessionType() {
        return this.sessionType;
    }

    public final String getSupporteeName() {
        return this.supporteeName;
    }

    public final String getSupporteePictureUrl() {
        return this.supporteePictureUrl;
    }

    public final Integer getTryAgainAfterSeconds() {
        return this.tryAgainAfterSeconds;
    }

    public int hashCode() {
        int iE = to7.e(this.failureReason.hashCode() * 31, 31, this.supporteeName);
        String str = this.supporteePictureUrl;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.tryAgainAfterSeconds;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        SessionType sessionType = this.sessionType;
        return iHashCode2 + (sessionType != null ? sessionType.hashCode() : 0);
    }

    public String toString() {
        return "ConnectFailedContext(failureReason=" + this.failureReason + ", supporteeName=" + this.supporteeName + ", supporteePictureUrl=" + this.supporteePictureUrl + ", tryAgainAfterSeconds=" + this.tryAgainAfterSeconds + ", sessionType=" + this.sessionType + ")";
    }

    public /* synthetic */ ConnectFailedContext(ConnectFailedReason connectFailedReason, String str, String str2, Integer num, SessionType sessionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectFailedReason, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : sessionType);
    }
}
