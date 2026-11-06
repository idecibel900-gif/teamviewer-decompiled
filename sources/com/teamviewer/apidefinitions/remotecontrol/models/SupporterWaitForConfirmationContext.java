package com.teamviewer.apidefinitions.remotecontrol.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/teamviewer/apidefinitions/remotecontrol/models/SupporterWaitForConfirmationContext;", "", "supporteeName", "", "supporteePictureUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSupporteeName", "()Ljava/lang/String;", "getSupporteePictureUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SupporterWaitForConfirmationContext {
    private final String supporteeName;
    private final String supporteePictureUrl;

    public SupporterWaitForConfirmationContext(@sp3(name = "supporteeName") String str, @sp3(name = "supporteePictureUrl") String str2) {
        str.getClass();
        this.supporteeName = str;
        this.supporteePictureUrl = str2;
    }

    public static /* synthetic */ SupporterWaitForConfirmationContext copy$default(SupporterWaitForConfirmationContext supporterWaitForConfirmationContext, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supporterWaitForConfirmationContext.supporteeName;
        }
        if ((i & 2) != 0) {
            str2 = supporterWaitForConfirmationContext.supporteePictureUrl;
        }
        return supporterWaitForConfirmationContext.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSupporteeName() {
        return this.supporteeName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSupporteePictureUrl() {
        return this.supporteePictureUrl;
    }

    public final SupporterWaitForConfirmationContext copy(@sp3(name = "supporteeName") String supporteeName, @sp3(name = "supporteePictureUrl") String supporteePictureUrl) {
        supporteeName.getClass();
        return new SupporterWaitForConfirmationContext(supporteeName, supporteePictureUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupporterWaitForConfirmationContext)) {
            return false;
        }
        SupporterWaitForConfirmationContext supporterWaitForConfirmationContext = (SupporterWaitForConfirmationContext) other;
        return im3.n(this.supporteeName, supporterWaitForConfirmationContext.supporteeName) && im3.n(this.supporteePictureUrl, supporterWaitForConfirmationContext.supporteePictureUrl);
    }

    public final String getSupporteeName() {
        return this.supporteeName;
    }

    public final String getSupporteePictureUrl() {
        return this.supporteePictureUrl;
    }

    public int hashCode() {
        int iHashCode = this.supporteeName.hashCode() * 31;
        String str = this.supporteePictureUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return fx3.h("SupporterWaitForConfirmationContext(supporteeName=", this.supporteeName, ", supporteePictureUrl=", this.supporteePictureUrl, ")");
    }

    public /* synthetic */ SupporterWaitForConfirmationContext(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
