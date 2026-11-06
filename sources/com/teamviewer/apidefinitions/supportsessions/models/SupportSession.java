package com.teamviewer.apidefinitions.supportsessions.models;

import java.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.fx3;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b?\b\u0086\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\t\u0010G\u001a\u00020\nHÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00106J\u000b\u0010Q\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010=J\u0010\u0010U\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010=J\u0010\u0010V\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010AJð\u0001\u0010W\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÆ\u0001¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020\u001e2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\u0003HÖ\u0001J\t\u0010\\\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010'R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u0010>\u001a\u0004\b?\u0010=R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010A¨\u0006]"}, d2 = {"Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSession;", "", "sessioncode", "", "createdAt", "Ljava/time/OffsetDateTime;", "validUntil", "joinSessionUrlForRecipient", "", "recipientStatus", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionRecipientStatus;", "assignedAccountId", "groupId", "startedAt", "name", "email", "supportSessionType", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionType;", "closedAt", "duration", "", "creatorAccountId", "description", "state", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionState;", "password", "customerClientId", "", "supporterClientId", "assignedToMe", "", "<init>", "(ILjava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionRecipientStatus;IILjava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionType;Ljava/time/OffsetDateTime;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionState;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getSessioncode", "()I", "getCreatedAt", "()Ljava/time/OffsetDateTime;", "getValidUntil", "getJoinSessionUrlForRecipient", "()Ljava/lang/String;", "getRecipientStatus", "()Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionRecipientStatus;", "getAssignedAccountId", "getGroupId", "getStartedAt", "getName", "getEmail", "getSupportSessionType", "()Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionType;", "getClosedAt", "getDuration", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCreatorAccountId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDescription", "getState", "()Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionState;", "getPassword", "getCustomerClientId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSupporterClientId", "getAssignedToMe", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(ILjava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionRecipientStatus;IILjava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionType;Ljava/time/OffsetDateTime;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionState;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSession;", "equals", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SupportSession {
    private final int assignedAccountId;
    private final Boolean assignedToMe;
    private final OffsetDateTime closedAt;
    private final OffsetDateTime createdAt;
    private final Integer creatorAccountId;
    private final Long customerClientId;
    private final String description;
    private final Double duration;
    private final String email;
    private final int groupId;
    private final String joinSessionUrlForRecipient;
    private final String name;
    private final String password;
    private final SupportSessionRecipientStatus recipientStatus;
    private final int sessioncode;
    private final OffsetDateTime startedAt;
    private final SupportSessionState state;
    private final SupportSessionType supportSessionType;
    private final Long supporterClientId;
    private final OffsetDateTime validUntil;

    public /* synthetic */ SupportSession(int i, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str, SupportSessionRecipientStatus supportSessionRecipientStatus, int i2, int i3, OffsetDateTime offsetDateTime3, String str2, String str3, SupportSessionType supportSessionType, OffsetDateTime offsetDateTime4, Double d, Integer num, String str4, SupportSessionState supportSessionState, String str5, Long l, Long l2, Boolean bool, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, offsetDateTime, offsetDateTime2, str, supportSessionRecipientStatus, i2, i3, (i4 & 128) != 0 ? null : offsetDateTime3, (i4 & 256) != 0 ? null : str2, (i4 & 512) != 0 ? null : str3, (i4 & 1024) != 0 ? null : supportSessionType, (i4 & 2048) != 0 ? null : offsetDateTime4, (i4 & 4096) != 0 ? null : d, (i4 & 8192) != 0 ? null : num, (i4 & 16384) != 0 ? null : str4, (32768 & i4) != 0 ? null : supportSessionState, (65536 & i4) != 0 ? null : str5, (131072 & i4) != 0 ? null : l, (262144 & i4) != 0 ? null : l2, (i4 & 524288) != 0 ? null : bool);
    }

    public static /* synthetic */ SupportSession copy$default(SupportSession supportSession, int i, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str, SupportSessionRecipientStatus supportSessionRecipientStatus, int i2, int i3, OffsetDateTime offsetDateTime3, String str2, String str3, SupportSessionType supportSessionType, OffsetDateTime offsetDateTime4, Double d, Integer num, String str4, SupportSessionState supportSessionState, String str5, Long l, Long l2, Boolean bool, int i4, Object obj) {
        Boolean bool2;
        Long l3;
        int i5 = (i4 & 1) != 0 ? supportSession.sessioncode : i;
        OffsetDateTime offsetDateTime5 = (i4 & 2) != 0 ? supportSession.createdAt : offsetDateTime;
        OffsetDateTime offsetDateTime6 = (i4 & 4) != 0 ? supportSession.validUntil : offsetDateTime2;
        String str6 = (i4 & 8) != 0 ? supportSession.joinSessionUrlForRecipient : str;
        SupportSessionRecipientStatus supportSessionRecipientStatus2 = (i4 & 16) != 0 ? supportSession.recipientStatus : supportSessionRecipientStatus;
        int i6 = (i4 & 32) != 0 ? supportSession.assignedAccountId : i2;
        int i7 = (i4 & 64) != 0 ? supportSession.groupId : i3;
        OffsetDateTime offsetDateTime7 = (i4 & 128) != 0 ? supportSession.startedAt : offsetDateTime3;
        String str7 = (i4 & 256) != 0 ? supportSession.name : str2;
        String str8 = (i4 & 512) != 0 ? supportSession.email : str3;
        SupportSessionType supportSessionType2 = (i4 & 1024) != 0 ? supportSession.supportSessionType : supportSessionType;
        OffsetDateTime offsetDateTime8 = (i4 & 2048) != 0 ? supportSession.closedAt : offsetDateTime4;
        Double d2 = (i4 & 4096) != 0 ? supportSession.duration : d;
        Integer num2 = (i4 & 8192) != 0 ? supportSession.creatorAccountId : num;
        int i8 = i5;
        String str9 = (i4 & 16384) != 0 ? supportSession.description : str4;
        SupportSessionState supportSessionState2 = (i4 & 32768) != 0 ? supportSession.state : supportSessionState;
        String str10 = (i4 & 65536) != 0 ? supportSession.password : str5;
        Long l4 = (i4 & 131072) != 0 ? supportSession.customerClientId : l;
        Long l5 = (i4 & 262144) != 0 ? supportSession.supporterClientId : l2;
        if ((i4 & 524288) != 0) {
            l3 = l5;
            bool2 = supportSession.assignedToMe;
        } else {
            bool2 = bool;
            l3 = l5;
        }
        return supportSession.copy(i8, offsetDateTime5, offsetDateTime6, str6, supportSessionRecipientStatus2, i6, i7, offsetDateTime7, str7, str8, supportSessionType2, offsetDateTime8, d2, num2, str9, supportSessionState2, str10, l4, l3, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSessioncode() {
        return this.sessioncode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SupportSessionType getSupportSessionType() {
        return this.supportSessionType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final OffsetDateTime getClosedAt() {
        return this.closedAt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Double getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getCreatorAccountId() {
        return this.creatorAccountId;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final SupportSessionState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Long getCustomerClientId() {
        return this.customerClientId;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Long getSupporterClientId() {
        return this.supporterClientId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getAssignedToMe() {
        return this.assignedToMe;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OffsetDateTime getValidUntil() {
        return this.validUntil;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getJoinSessionUrlForRecipient() {
        return this.joinSessionUrlForRecipient;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SupportSessionRecipientStatus getRecipientStatus() {
        return this.recipientStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAssignedAccountId() {
        return this.assignedAccountId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final OffsetDateTime getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final SupportSession copy(@sp3(name = "sessioncode") int sessioncode, @sp3(name = "createdAt") OffsetDateTime createdAt, @sp3(name = "validUntil") OffsetDateTime validUntil, @sp3(name = "joinSessionUrlForRecipient") String joinSessionUrlForRecipient, @sp3(name = "recipientStatus") SupportSessionRecipientStatus recipientStatus, @sp3(name = "assignedAccountId") int assignedAccountId, @sp3(name = "groupId") int groupId, @sp3(name = "startedAt") OffsetDateTime startedAt, @sp3(name = "name") String name, @sp3(name = "email") String email, @sp3(name = "supportSessionType") SupportSessionType supportSessionType, @sp3(name = "closedAt") OffsetDateTime closedAt, @sp3(name = "duration") Double duration, @sp3(name = "creatorAccountId") Integer creatorAccountId, @sp3(name = "description") String description, @sp3(name = "state") SupportSessionState state, @sp3(name = "password") String password, @sp3(name = "customerClientId") Long customerClientId, @sp3(name = "supporterClientId") Long supporterClientId, @sp3(name = "assignedToMe") Boolean assignedToMe) {
        createdAt.getClass();
        validUntil.getClass();
        joinSessionUrlForRecipient.getClass();
        recipientStatus.getClass();
        return new SupportSession(sessioncode, createdAt, validUntil, joinSessionUrlForRecipient, recipientStatus, assignedAccountId, groupId, startedAt, name, email, supportSessionType, closedAt, duration, creatorAccountId, description, state, password, customerClientId, supporterClientId, assignedToMe);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportSession)) {
            return false;
        }
        SupportSession supportSession = (SupportSession) other;
        return this.sessioncode == supportSession.sessioncode && im3.n(this.createdAt, supportSession.createdAt) && im3.n(this.validUntil, supportSession.validUntil) && im3.n(this.joinSessionUrlForRecipient, supportSession.joinSessionUrlForRecipient) && this.recipientStatus == supportSession.recipientStatus && this.assignedAccountId == supportSession.assignedAccountId && this.groupId == supportSession.groupId && im3.n(this.startedAt, supportSession.startedAt) && im3.n(this.name, supportSession.name) && im3.n(this.email, supportSession.email) && this.supportSessionType == supportSession.supportSessionType && im3.n(this.closedAt, supportSession.closedAt) && im3.n(this.duration, supportSession.duration) && im3.n(this.creatorAccountId, supportSession.creatorAccountId) && im3.n(this.description, supportSession.description) && this.state == supportSession.state && im3.n(this.password, supportSession.password) && im3.n(this.customerClientId, supportSession.customerClientId) && im3.n(this.supporterClientId, supportSession.supporterClientId) && im3.n(this.assignedToMe, supportSession.assignedToMe);
    }

    public final int getAssignedAccountId() {
        return this.assignedAccountId;
    }

    public final Boolean getAssignedToMe() {
        return this.assignedToMe;
    }

    public final OffsetDateTime getClosedAt() {
        return this.closedAt;
    }

    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    public final Integer getCreatorAccountId() {
        return this.creatorAccountId;
    }

    public final Long getCustomerClientId() {
        return this.customerClientId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Double getDuration() {
        return this.duration;
    }

    public final String getEmail() {
        return this.email;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final String getJoinSessionUrlForRecipient() {
        return this.joinSessionUrlForRecipient;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPassword() {
        return this.password;
    }

    public final SupportSessionRecipientStatus getRecipientStatus() {
        return this.recipientStatus;
    }

    public final int getSessioncode() {
        return this.sessioncode;
    }

    public final OffsetDateTime getStartedAt() {
        return this.startedAt;
    }

    public final SupportSessionState getState() {
        return this.state;
    }

    public final SupportSessionType getSupportSessionType() {
        return this.supportSessionType;
    }

    public final Long getSupporterClientId() {
        return this.supporterClientId;
    }

    public final OffsetDateTime getValidUntil() {
        return this.validUntil;
    }

    public int hashCode() {
        int iA = fx3.a(this.groupId, fx3.a(this.assignedAccountId, (this.recipientStatus.hashCode() + to7.e((this.validUntil.hashCode() + ((this.createdAt.hashCode() + (Integer.hashCode(this.sessioncode) * 31)) * 31)) * 31, 31, this.joinSessionUrlForRecipient)) * 31, 31), 31);
        OffsetDateTime offsetDateTime = this.startedAt;
        int iHashCode = (iA + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SupportSessionType supportSessionType = this.supportSessionType;
        int iHashCode4 = (iHashCode3 + (supportSessionType == null ? 0 : supportSessionType.hashCode())) * 31;
        OffsetDateTime offsetDateTime2 = this.closedAt;
        int iHashCode5 = (iHashCode4 + (offsetDateTime2 == null ? 0 : offsetDateTime2.hashCode())) * 31;
        Double d = this.duration;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.creatorAccountId;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SupportSessionState supportSessionState = this.state;
        int iHashCode9 = (iHashCode8 + (supportSessionState == null ? 0 : supportSessionState.hashCode())) * 31;
        String str4 = this.password;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.customerClientId;
        int iHashCode11 = (iHashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.supporterClientId;
        int iHashCode12 = (iHashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.assignedToMe;
        return iHashCode12 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        int i = this.sessioncode;
        OffsetDateTime offsetDateTime = this.createdAt;
        OffsetDateTime offsetDateTime2 = this.validUntil;
        String str = this.joinSessionUrlForRecipient;
        SupportSessionRecipientStatus supportSessionRecipientStatus = this.recipientStatus;
        int i2 = this.assignedAccountId;
        int i3 = this.groupId;
        OffsetDateTime offsetDateTime3 = this.startedAt;
        String str2 = this.name;
        String str3 = this.email;
        SupportSessionType supportSessionType = this.supportSessionType;
        OffsetDateTime offsetDateTime4 = this.closedAt;
        Double d = this.duration;
        Integer num = this.creatorAccountId;
        String str4 = this.description;
        SupportSessionState supportSessionState = this.state;
        String str5 = this.password;
        Long l = this.customerClientId;
        Long l2 = this.supporterClientId;
        Boolean bool = this.assignedToMe;
        StringBuilder sb = new StringBuilder("SupportSession(sessioncode=");
        sb.append(i);
        sb.append(", createdAt=");
        sb.append(offsetDateTime);
        sb.append(", validUntil=");
        sb.append(offsetDateTime2);
        sb.append(", joinSessionUrlForRecipient=");
        sb.append(str);
        sb.append(", recipientStatus=");
        sb.append(supportSessionRecipientStatus);
        sb.append(", assignedAccountId=");
        sb.append(i2);
        sb.append(", groupId=");
        sb.append(i3);
        sb.append(", startedAt=");
        sb.append(offsetDateTime3);
        sb.append(", name=");
        e41.t(sb, str2, ", email=", str3, ", supportSessionType=");
        sb.append(supportSessionType);
        sb.append(", closedAt=");
        sb.append(offsetDateTime4);
        sb.append(", duration=");
        sb.append(d);
        sb.append(", creatorAccountId=");
        sb.append(num);
        sb.append(", description=");
        sb.append(str4);
        sb.append(", state=");
        sb.append(supportSessionState);
        sb.append(", password=");
        sb.append(str5);
        sb.append(", customerClientId=");
        sb.append(l);
        sb.append(", supporterClientId=");
        sb.append(l2);
        sb.append(", assignedToMe=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public SupportSession(@sp3(name = "sessioncode") int i, @sp3(name = "createdAt") OffsetDateTime offsetDateTime, @sp3(name = "validUntil") OffsetDateTime offsetDateTime2, @sp3(name = "joinSessionUrlForRecipient") String str, @sp3(name = "recipientStatus") SupportSessionRecipientStatus supportSessionRecipientStatus, @sp3(name = "assignedAccountId") int i2, @sp3(name = "groupId") int i3, @sp3(name = "startedAt") OffsetDateTime offsetDateTime3, @sp3(name = "name") String str2, @sp3(name = "email") String str3, @sp3(name = "supportSessionType") SupportSessionType supportSessionType, @sp3(name = "closedAt") OffsetDateTime offsetDateTime4, @sp3(name = "duration") Double d, @sp3(name = "creatorAccountId") Integer num, @sp3(name = "description") String str4, @sp3(name = "state") SupportSessionState supportSessionState, @sp3(name = "password") String str5, @sp3(name = "customerClientId") Long l, @sp3(name = "supporterClientId") Long l2, @sp3(name = "assignedToMe") Boolean bool) {
        offsetDateTime.getClass();
        offsetDateTime2.getClass();
        str.getClass();
        supportSessionRecipientStatus.getClass();
        this.sessioncode = i;
        this.createdAt = offsetDateTime;
        this.validUntil = offsetDateTime2;
        this.joinSessionUrlForRecipient = str;
        this.recipientStatus = supportSessionRecipientStatus;
        this.assignedAccountId = i2;
        this.groupId = i3;
        this.startedAt = offsetDateTime3;
        this.name = str2;
        this.email = str3;
        this.supportSessionType = supportSessionType;
        this.closedAt = offsetDateTime4;
        this.duration = d;
        this.creatorAccountId = num;
        this.description = str4;
        this.state = supportSessionState;
        this.password = str5;
        this.customerClientId = l;
        this.supporterClientId = l2;
        this.assignedToMe = bool;
    }
}
