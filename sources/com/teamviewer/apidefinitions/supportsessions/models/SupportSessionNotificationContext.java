package com.teamviewer.apidefinitions.supportsessions.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionNotificationContext;", "", "description", "", "sessionCode", "supporteeDeviceId", "supporteeEmail", "supporteeName", "supportSessionType", "Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionType;)V", "getDescription", "()Ljava/lang/String;", "getSessionCode", "getSupporteeDeviceId", "getSupporteeEmail", "getSupporteeName", "getSupportSessionType", "()Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SupportSessionNotificationContext {
    private final String description;
    private final String sessionCode;
    private final SupportSessionType supportSessionType;
    private final String supporteeDeviceId;
    private final String supporteeEmail;
    private final String supporteeName;

    public SupportSessionNotificationContext(@sp3(name = "description") String str, @sp3(name = "sessionCode") String str2, @sp3(name = "supporteeDeviceId") String str3, @sp3(name = "supporteeEmail") String str4, @sp3(name = "supporteeName") String str5, @sp3(name = "supportSessionType") SupportSessionType supportSessionType) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.description = str;
        this.sessionCode = str2;
        this.supporteeDeviceId = str3;
        this.supporteeEmail = str4;
        this.supporteeName = str5;
        this.supportSessionType = supportSessionType;
    }

    public static /* synthetic */ SupportSessionNotificationContext copy$default(SupportSessionNotificationContext supportSessionNotificationContext, String str, String str2, String str3, String str4, String str5, SupportSessionType supportSessionType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportSessionNotificationContext.description;
        }
        if ((i & 2) != 0) {
            str2 = supportSessionNotificationContext.sessionCode;
        }
        if ((i & 4) != 0) {
            str3 = supportSessionNotificationContext.supporteeDeviceId;
        }
        if ((i & 8) != 0) {
            str4 = supportSessionNotificationContext.supporteeEmail;
        }
        if ((i & 16) != 0) {
            str5 = supportSessionNotificationContext.supporteeName;
        }
        if ((i & 32) != 0) {
            supportSessionType = supportSessionNotificationContext.supportSessionType;
        }
        String str6 = str5;
        SupportSessionType supportSessionType2 = supportSessionType;
        return supportSessionNotificationContext.copy(str, str2, str3, str4, str6, supportSessionType2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionCode() {
        return this.sessionCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSupporteeDeviceId() {
        return this.supporteeDeviceId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSupporteeEmail() {
        return this.supporteeEmail;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSupporteeName() {
        return this.supporteeName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SupportSessionType getSupportSessionType() {
        return this.supportSessionType;
    }

    public final SupportSessionNotificationContext copy(@sp3(name = "description") String description, @sp3(name = "sessionCode") String sessionCode, @sp3(name = "supporteeDeviceId") String supporteeDeviceId, @sp3(name = "supporteeEmail") String supporteeEmail, @sp3(name = "supporteeName") String supporteeName, @sp3(name = "supportSessionType") SupportSessionType supportSessionType) {
        description.getClass();
        sessionCode.getClass();
        supporteeDeviceId.getClass();
        supporteeEmail.getClass();
        supporteeName.getClass();
        return new SupportSessionNotificationContext(description, sessionCode, supporteeDeviceId, supporteeEmail, supporteeName, supportSessionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportSessionNotificationContext)) {
            return false;
        }
        SupportSessionNotificationContext supportSessionNotificationContext = (SupportSessionNotificationContext) other;
        return im3.n(this.description, supportSessionNotificationContext.description) && im3.n(this.sessionCode, supportSessionNotificationContext.sessionCode) && im3.n(this.supporteeDeviceId, supportSessionNotificationContext.supporteeDeviceId) && im3.n(this.supporteeEmail, supportSessionNotificationContext.supporteeEmail) && im3.n(this.supporteeName, supportSessionNotificationContext.supporteeName) && this.supportSessionType == supportSessionNotificationContext.supportSessionType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSessionCode() {
        return this.sessionCode;
    }

    public final SupportSessionType getSupportSessionType() {
        return this.supportSessionType;
    }

    public final String getSupporteeDeviceId() {
        return this.supporteeDeviceId;
    }

    public final String getSupporteeEmail() {
        return this.supporteeEmail;
    }

    public final String getSupporteeName() {
        return this.supporteeName;
    }

    public int hashCode() {
        int iE = to7.e(to7.e(to7.e(to7.e(this.description.hashCode() * 31, 31, this.sessionCode), 31, this.supporteeDeviceId), 31, this.supporteeEmail), 31, this.supporteeName);
        SupportSessionType supportSessionType = this.supportSessionType;
        return iE + (supportSessionType == null ? 0 : supportSessionType.hashCode());
    }

    public String toString() {
        String str = this.description;
        String str2 = this.sessionCode;
        String str3 = this.supporteeDeviceId;
        String str4 = this.supporteeEmail;
        String str5 = this.supporteeName;
        SupportSessionType supportSessionType = this.supportSessionType;
        StringBuilder sbO = e41.o("SupportSessionNotificationContext(description=", str, ", sessionCode=", str2, ", supporteeDeviceId=");
        e41.t(sbO, str3, ", supporteeEmail=", str4, ", supporteeName=");
        sbO.append(str5);
        sbO.append(", supportSessionType=");
        sbO.append(supportSessionType);
        sbO.append(")");
        return sbO.toString();
    }

    public /* synthetic */ SupportSessionNotificationContext(String str, String str2, String str3, String str4, String str5, SupportSessionType supportSessionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : supportSessionType);
    }
}
