package com.teamviewer.apidefinitions.supportsessions.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.fx3;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/teamviewer/apidefinitions/supportsessions/models/SupportSessionSendSMSParams;", "", "recipientNumber", "", "preferredLanguage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRecipientNumber", "()Ljava/lang/String;", "getPreferredLanguage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SupportSessionSendSMSParams {
    private final String preferredLanguage;
    private final String recipientNumber;

    public SupportSessionSendSMSParams(@sp3(name = "recipientNumber") String str, @sp3(name = "preferredLanguage") String str2) {
        str.getClass();
        this.recipientNumber = str;
        this.preferredLanguage = str2;
    }

    public static /* synthetic */ SupportSessionSendSMSParams copy$default(SupportSessionSendSMSParams supportSessionSendSMSParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportSessionSendSMSParams.recipientNumber;
        }
        if ((i & 2) != 0) {
            str2 = supportSessionSendSMSParams.preferredLanguage;
        }
        return supportSessionSendSMSParams.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRecipientNumber() {
        return this.recipientNumber;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPreferredLanguage() {
        return this.preferredLanguage;
    }

    public final SupportSessionSendSMSParams copy(@sp3(name = "recipientNumber") String recipientNumber, @sp3(name = "preferredLanguage") String preferredLanguage) {
        recipientNumber.getClass();
        return new SupportSessionSendSMSParams(recipientNumber, preferredLanguage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportSessionSendSMSParams)) {
            return false;
        }
        SupportSessionSendSMSParams supportSessionSendSMSParams = (SupportSessionSendSMSParams) other;
        return im3.n(this.recipientNumber, supportSessionSendSMSParams.recipientNumber) && im3.n(this.preferredLanguage, supportSessionSendSMSParams.preferredLanguage);
    }

    public final String getPreferredLanguage() {
        return this.preferredLanguage;
    }

    public final String getRecipientNumber() {
        return this.recipientNumber;
    }

    public int hashCode() {
        int iHashCode = this.recipientNumber.hashCode() * 31;
        String str = this.preferredLanguage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return fx3.h("SupportSessionSendSMSParams(recipientNumber=", this.recipientNumber, ", preferredLanguage=", this.preferredLanguage, ")");
    }

    public /* synthetic */ SupportSessionSendSMSParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "en" : str2);
    }
}
