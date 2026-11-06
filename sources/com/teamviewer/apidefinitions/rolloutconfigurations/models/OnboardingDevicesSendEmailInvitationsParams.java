package com.teamviewer.apidefinitions.rolloutconfigurations.models;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/teamviewer/apidefinitions/rolloutconfigurations/models/OnboardingDevicesSendEmailInvitationsParams;", "", "recipientEmails", "", "", "preferredLanguage", "<init>", "(Ljava/util/Set;Ljava/lang/String;)V", "getRecipientEmails", "()Ljava/util/Set;", "getPreferredLanguage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OnboardingDevicesSendEmailInvitationsParams {
    private final String preferredLanguage;
    private final Set<String> recipientEmails;

    public OnboardingDevicesSendEmailInvitationsParams(@sp3(name = "recipientEmails") Set<String> set, @sp3(name = "preferredLanguage") String str) {
        set.getClass();
        this.recipientEmails = set;
        this.preferredLanguage = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnboardingDevicesSendEmailInvitationsParams copy$default(OnboardingDevicesSendEmailInvitationsParams onboardingDevicesSendEmailInvitationsParams, Set set, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            set = onboardingDevicesSendEmailInvitationsParams.recipientEmails;
        }
        if ((i & 2) != 0) {
            str = onboardingDevicesSendEmailInvitationsParams.preferredLanguage;
        }
        return onboardingDevicesSendEmailInvitationsParams.copy(set, str);
    }

    public final Set<String> component1() {
        return this.recipientEmails;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPreferredLanguage() {
        return this.preferredLanguage;
    }

    public final OnboardingDevicesSendEmailInvitationsParams copy(@sp3(name = "recipientEmails") Set<String> recipientEmails, @sp3(name = "preferredLanguage") String preferredLanguage) {
        recipientEmails.getClass();
        return new OnboardingDevicesSendEmailInvitationsParams(recipientEmails, preferredLanguage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingDevicesSendEmailInvitationsParams)) {
            return false;
        }
        OnboardingDevicesSendEmailInvitationsParams onboardingDevicesSendEmailInvitationsParams = (OnboardingDevicesSendEmailInvitationsParams) other;
        return im3.n(this.recipientEmails, onboardingDevicesSendEmailInvitationsParams.recipientEmails) && im3.n(this.preferredLanguage, onboardingDevicesSendEmailInvitationsParams.preferredLanguage);
    }

    public final String getPreferredLanguage() {
        return this.preferredLanguage;
    }

    public final Set<String> getRecipientEmails() {
        return this.recipientEmails;
    }

    public int hashCode() {
        int iHashCode = this.recipientEmails.hashCode() * 31;
        String str = this.preferredLanguage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OnboardingDevicesSendEmailInvitationsParams(recipientEmails=" + this.recipientEmails + ", preferredLanguage=" + this.preferredLanguage + ")";
    }

    public /* synthetic */ OnboardingDevicesSendEmailInvitationsParams(Set set, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? "en" : str);
    }
}
