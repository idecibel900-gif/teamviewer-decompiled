package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\f\u001a\u00020\u0007\u0012\b\b\u0001\u0010\r\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0007\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0011HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J¡\u0001\u00105\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\u00072\b\b\u0003\u0010\f\u001a\u00020\u00072\b\b\u0003\u0010\r\u001a\u00020\u00072\b\b\u0003\u0010\u000e\u001a\u00020\u00072\b\b\u0003\u0010\u000f\u001a\u00020\u00072\b\b\u0003\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00072\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001a¨\u0006="}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/AccountProfile;", "", "displayName", "Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyString;", "emailAddress", "pictureUrl", "isOnlyVisibleForPartners", "Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyBool;", "isSubscribedToBlizzNewsletter", "enableOfflineGroup", "enableMessageNotifications", "enablePartnerLoginNotifications", "enableServiceCaseNotifications", "enableSessionLogging", "enableSessionComments", "hideMonitoringInformation", "passwordAttributes", "Lcom/teamviewer/apidefinitions/account/models/PreferenceAttributes;", "enableInProductMarketingMessages", "enablePushNotificationForTrustedDevices", "<init>", "(Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyString;Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyString;Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyString;Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/account/models/PreferenceAttributes;Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyBool;Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyBool;)V", "getDisplayName", "()Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyString;", "getEmailAddress", "getPictureUrl", "()Lcom/teamviewer/apidefinitions/account/models/PreferencePropertyBool;", "getEnableOfflineGroup", "getEnableMessageNotifications", "getEnablePartnerLoginNotifications", "getEnableServiceCaseNotifications", "getEnableSessionLogging", "getEnableSessionComments", "getHideMonitoringInformation", "getPasswordAttributes", "()Lcom/teamviewer/apidefinitions/account/models/PreferenceAttributes;", "getEnableInProductMarketingMessages", "getEnablePushNotificationForTrustedDevices", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AccountProfile {
    private final PreferencePropertyString displayName;
    private final PreferencePropertyString emailAddress;
    private final PreferencePropertyBool enableInProductMarketingMessages;
    private final PreferencePropertyBool enableMessageNotifications;
    private final PreferencePropertyBool enableOfflineGroup;
    private final PreferencePropertyBool enablePartnerLoginNotifications;
    private final PreferencePropertyBool enablePushNotificationForTrustedDevices;
    private final PreferencePropertyBool enableServiceCaseNotifications;
    private final PreferencePropertyBool enableSessionComments;
    private final PreferencePropertyBool enableSessionLogging;
    private final PreferencePropertyBool hideMonitoringInformation;
    private final PreferencePropertyBool isOnlyVisibleForPartners;
    private final PreferencePropertyBool isSubscribedToBlizzNewsletter;
    private final PreferenceAttributes passwordAttributes;
    private final PreferencePropertyString pictureUrl;

    public AccountProfile(@sp3(name = "displayName") PreferencePropertyString preferencePropertyString, @sp3(name = "emailAddress") PreferencePropertyString preferencePropertyString2, @sp3(name = "pictureUrl") PreferencePropertyString preferencePropertyString3, @sp3(name = "isOnlyVisibleForPartners") PreferencePropertyBool preferencePropertyBool, @sp3(name = "isSubscribedToBlizzNewsletter") PreferencePropertyBool preferencePropertyBool2, @sp3(name = "enableOfflineGroup") PreferencePropertyBool preferencePropertyBool3, @sp3(name = "enableMessageNotifications") PreferencePropertyBool preferencePropertyBool4, @sp3(name = "enablePartnerLoginNotifications") PreferencePropertyBool preferencePropertyBool5, @sp3(name = "enableServiceCaseNotifications") PreferencePropertyBool preferencePropertyBool6, @sp3(name = "enableSessionLogging") PreferencePropertyBool preferencePropertyBool7, @sp3(name = "enableSessionComments") PreferencePropertyBool preferencePropertyBool8, @sp3(name = "hideMonitoringInformation") PreferencePropertyBool preferencePropertyBool9, @sp3(name = "passwordAttributes") PreferenceAttributes preferenceAttributes, @sp3(name = "enableInProductMarketingMessages") PreferencePropertyBool preferencePropertyBool10, @sp3(name = "enablePushNotificationForTrustedDevices") PreferencePropertyBool preferencePropertyBool11) {
        preferencePropertyString.getClass();
        preferencePropertyString2.getClass();
        preferencePropertyString3.getClass();
        preferencePropertyBool.getClass();
        preferencePropertyBool2.getClass();
        preferencePropertyBool3.getClass();
        preferencePropertyBool4.getClass();
        preferencePropertyBool5.getClass();
        preferencePropertyBool6.getClass();
        preferencePropertyBool7.getClass();
        preferencePropertyBool8.getClass();
        preferencePropertyBool9.getClass();
        preferenceAttributes.getClass();
        preferencePropertyBool10.getClass();
        this.displayName = preferencePropertyString;
        this.emailAddress = preferencePropertyString2;
        this.pictureUrl = preferencePropertyString3;
        this.isOnlyVisibleForPartners = preferencePropertyBool;
        this.isSubscribedToBlizzNewsletter = preferencePropertyBool2;
        this.enableOfflineGroup = preferencePropertyBool3;
        this.enableMessageNotifications = preferencePropertyBool4;
        this.enablePartnerLoginNotifications = preferencePropertyBool5;
        this.enableServiceCaseNotifications = preferencePropertyBool6;
        this.enableSessionLogging = preferencePropertyBool7;
        this.enableSessionComments = preferencePropertyBool8;
        this.hideMonitoringInformation = preferencePropertyBool9;
        this.passwordAttributes = preferenceAttributes;
        this.enableInProductMarketingMessages = preferencePropertyBool10;
        this.enablePushNotificationForTrustedDevices = preferencePropertyBool11;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PreferencePropertyString getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final PreferencePropertyBool getEnableSessionLogging() {
        return this.enableSessionLogging;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final PreferencePropertyBool getEnableSessionComments() {
        return this.enableSessionComments;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final PreferencePropertyBool getHideMonitoringInformation() {
        return this.hideMonitoringInformation;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final PreferenceAttributes getPasswordAttributes() {
        return this.passwordAttributes;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final PreferencePropertyBool getEnableInProductMarketingMessages() {
        return this.enableInProductMarketingMessages;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final PreferencePropertyBool getEnablePushNotificationForTrustedDevices() {
        return this.enablePushNotificationForTrustedDevices;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PreferencePropertyString getEmailAddress() {
        return this.emailAddress;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PreferencePropertyString getPictureUrl() {
        return this.pictureUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PreferencePropertyBool getIsOnlyVisibleForPartners() {
        return this.isOnlyVisibleForPartners;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PreferencePropertyBool getIsSubscribedToBlizzNewsletter() {
        return this.isSubscribedToBlizzNewsletter;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PreferencePropertyBool getEnableOfflineGroup() {
        return this.enableOfflineGroup;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PreferencePropertyBool getEnableMessageNotifications() {
        return this.enableMessageNotifications;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PreferencePropertyBool getEnablePartnerLoginNotifications() {
        return this.enablePartnerLoginNotifications;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final PreferencePropertyBool getEnableServiceCaseNotifications() {
        return this.enableServiceCaseNotifications;
    }

    public final AccountProfile copy(@sp3(name = "displayName") PreferencePropertyString displayName, @sp3(name = "emailAddress") PreferencePropertyString emailAddress, @sp3(name = "pictureUrl") PreferencePropertyString pictureUrl, @sp3(name = "isOnlyVisibleForPartners") PreferencePropertyBool isOnlyVisibleForPartners, @sp3(name = "isSubscribedToBlizzNewsletter") PreferencePropertyBool isSubscribedToBlizzNewsletter, @sp3(name = "enableOfflineGroup") PreferencePropertyBool enableOfflineGroup, @sp3(name = "enableMessageNotifications") PreferencePropertyBool enableMessageNotifications, @sp3(name = "enablePartnerLoginNotifications") PreferencePropertyBool enablePartnerLoginNotifications, @sp3(name = "enableServiceCaseNotifications") PreferencePropertyBool enableServiceCaseNotifications, @sp3(name = "enableSessionLogging") PreferencePropertyBool enableSessionLogging, @sp3(name = "enableSessionComments") PreferencePropertyBool enableSessionComments, @sp3(name = "hideMonitoringInformation") PreferencePropertyBool hideMonitoringInformation, @sp3(name = "passwordAttributes") PreferenceAttributes passwordAttributes, @sp3(name = "enableInProductMarketingMessages") PreferencePropertyBool enableInProductMarketingMessages, @sp3(name = "enablePushNotificationForTrustedDevices") PreferencePropertyBool enablePushNotificationForTrustedDevices) {
        displayName.getClass();
        emailAddress.getClass();
        pictureUrl.getClass();
        isOnlyVisibleForPartners.getClass();
        isSubscribedToBlizzNewsletter.getClass();
        enableOfflineGroup.getClass();
        enableMessageNotifications.getClass();
        enablePartnerLoginNotifications.getClass();
        enableServiceCaseNotifications.getClass();
        enableSessionLogging.getClass();
        enableSessionComments.getClass();
        hideMonitoringInformation.getClass();
        passwordAttributes.getClass();
        enableInProductMarketingMessages.getClass();
        return new AccountProfile(displayName, emailAddress, pictureUrl, isOnlyVisibleForPartners, isSubscribedToBlizzNewsletter, enableOfflineGroup, enableMessageNotifications, enablePartnerLoginNotifications, enableServiceCaseNotifications, enableSessionLogging, enableSessionComments, hideMonitoringInformation, passwordAttributes, enableInProductMarketingMessages, enablePushNotificationForTrustedDevices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountProfile)) {
            return false;
        }
        AccountProfile accountProfile = (AccountProfile) other;
        return im3.n(this.displayName, accountProfile.displayName) && im3.n(this.emailAddress, accountProfile.emailAddress) && im3.n(this.pictureUrl, accountProfile.pictureUrl) && im3.n(this.isOnlyVisibleForPartners, accountProfile.isOnlyVisibleForPartners) && im3.n(this.isSubscribedToBlizzNewsletter, accountProfile.isSubscribedToBlizzNewsletter) && im3.n(this.enableOfflineGroup, accountProfile.enableOfflineGroup) && im3.n(this.enableMessageNotifications, accountProfile.enableMessageNotifications) && im3.n(this.enablePartnerLoginNotifications, accountProfile.enablePartnerLoginNotifications) && im3.n(this.enableServiceCaseNotifications, accountProfile.enableServiceCaseNotifications) && im3.n(this.enableSessionLogging, accountProfile.enableSessionLogging) && im3.n(this.enableSessionComments, accountProfile.enableSessionComments) && im3.n(this.hideMonitoringInformation, accountProfile.hideMonitoringInformation) && im3.n(this.passwordAttributes, accountProfile.passwordAttributes) && im3.n(this.enableInProductMarketingMessages, accountProfile.enableInProductMarketingMessages) && im3.n(this.enablePushNotificationForTrustedDevices, accountProfile.enablePushNotificationForTrustedDevices);
    }

    public final PreferencePropertyString getDisplayName() {
        return this.displayName;
    }

    public final PreferencePropertyString getEmailAddress() {
        return this.emailAddress;
    }

    public final PreferencePropertyBool getEnableInProductMarketingMessages() {
        return this.enableInProductMarketingMessages;
    }

    public final PreferencePropertyBool getEnableMessageNotifications() {
        return this.enableMessageNotifications;
    }

    public final PreferencePropertyBool getEnableOfflineGroup() {
        return this.enableOfflineGroup;
    }

    public final PreferencePropertyBool getEnablePartnerLoginNotifications() {
        return this.enablePartnerLoginNotifications;
    }

    public final PreferencePropertyBool getEnablePushNotificationForTrustedDevices() {
        return this.enablePushNotificationForTrustedDevices;
    }

    public final PreferencePropertyBool getEnableServiceCaseNotifications() {
        return this.enableServiceCaseNotifications;
    }

    public final PreferencePropertyBool getEnableSessionComments() {
        return this.enableSessionComments;
    }

    public final PreferencePropertyBool getEnableSessionLogging() {
        return this.enableSessionLogging;
    }

    public final PreferencePropertyBool getHideMonitoringInformation() {
        return this.hideMonitoringInformation;
    }

    public final PreferenceAttributes getPasswordAttributes() {
        return this.passwordAttributes;
    }

    public final PreferencePropertyString getPictureUrl() {
        return this.pictureUrl;
    }

    public int hashCode() {
        int iHashCode = (this.enableInProductMarketingMessages.hashCode() + ((this.passwordAttributes.hashCode() + ((this.hideMonitoringInformation.hashCode() + ((this.enableSessionComments.hashCode() + ((this.enableSessionLogging.hashCode() + ((this.enableServiceCaseNotifications.hashCode() + ((this.enablePartnerLoginNotifications.hashCode() + ((this.enableMessageNotifications.hashCode() + ((this.enableOfflineGroup.hashCode() + ((this.isSubscribedToBlizzNewsletter.hashCode() + ((this.isOnlyVisibleForPartners.hashCode() + ((this.pictureUrl.hashCode() + ((this.emailAddress.hashCode() + (this.displayName.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        PreferencePropertyBool preferencePropertyBool = this.enablePushNotificationForTrustedDevices;
        return iHashCode + (preferencePropertyBool == null ? 0 : preferencePropertyBool.hashCode());
    }

    public final PreferencePropertyBool isOnlyVisibleForPartners() {
        return this.isOnlyVisibleForPartners;
    }

    public final PreferencePropertyBool isSubscribedToBlizzNewsletter() {
        return this.isSubscribedToBlizzNewsletter;
    }

    public String toString() {
        return "AccountProfile(displayName=" + this.displayName + ", emailAddress=" + this.emailAddress + ", pictureUrl=" + this.pictureUrl + ", isOnlyVisibleForPartners=" + this.isOnlyVisibleForPartners + ", isSubscribedToBlizzNewsletter=" + this.isSubscribedToBlizzNewsletter + ", enableOfflineGroup=" + this.enableOfflineGroup + ", enableMessageNotifications=" + this.enableMessageNotifications + ", enablePartnerLoginNotifications=" + this.enablePartnerLoginNotifications + ", enableServiceCaseNotifications=" + this.enableServiceCaseNotifications + ", enableSessionLogging=" + this.enableSessionLogging + ", enableSessionComments=" + this.enableSessionComments + ", hideMonitoringInformation=" + this.hideMonitoringInformation + ", passwordAttributes=" + this.passwordAttributes + ", enableInProductMarketingMessages=" + this.enableInProductMarketingMessages + ", enablePushNotificationForTrustedDevices=" + this.enablePushNotificationForTrustedDevices + ")";
    }

    public /* synthetic */ AccountProfile(PreferencePropertyString preferencePropertyString, PreferencePropertyString preferencePropertyString2, PreferencePropertyString preferencePropertyString3, PreferencePropertyBool preferencePropertyBool, PreferencePropertyBool preferencePropertyBool2, PreferencePropertyBool preferencePropertyBool3, PreferencePropertyBool preferencePropertyBool4, PreferencePropertyBool preferencePropertyBool5, PreferencePropertyBool preferencePropertyBool6, PreferencePropertyBool preferencePropertyBool7, PreferencePropertyBool preferencePropertyBool8, PreferencePropertyBool preferencePropertyBool9, PreferenceAttributes preferenceAttributes, PreferencePropertyBool preferencePropertyBool10, PreferencePropertyBool preferencePropertyBool11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(preferencePropertyString, preferencePropertyString2, preferencePropertyString3, preferencePropertyBool, preferencePropertyBool2, preferencePropertyBool3, preferencePropertyBool4, preferencePropertyBool5, preferencePropertyBool6, preferencePropertyBool7, preferencePropertyBool8, preferencePropertyBool9, preferenceAttributes, preferencePropertyBool10, (i & 16384) != 0 ? null : preferencePropertyBool11);
    }
}
