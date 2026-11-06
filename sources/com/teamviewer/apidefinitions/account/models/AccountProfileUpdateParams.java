package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;
import o.ua5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J¶\u0001\u00101\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0006\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\b\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001f\u0010\u0018R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b \u0010\u0018R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b!\u0010\u0018R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\"\u0010\u0018¨\u00068"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/AccountProfileUpdateParams;", "", "displayName", "", "emailAddress", "pictureUrl", "isOnlyVisibleForPartners", "", "isSubscribedToBlizzNewsletter", "enableOfflineGroup", "enableMessageNotifications", "enablePartnerLoginNotifications", "enableServiceCaseNotifications", "enableSessionLogging", "enableSessionComments", "hideMonitoringInformation", "enableInProductMarketingMessages", "enablePushNotificationForTrustedDevices", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getDisplayName", "()Ljava/lang/String;", "getEmailAddress", "getPictureUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnableOfflineGroup", "getEnableMessageNotifications", "getEnablePartnerLoginNotifications", "getEnableServiceCaseNotifications", "getEnableSessionLogging", "getEnableSessionComments", "getHideMonitoringInformation", "getEnableInProductMarketingMessages", "getEnablePushNotificationForTrustedDevices", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/account/models/AccountProfileUpdateParams;", "equals", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AccountProfileUpdateParams {
    private final String displayName;
    private final String emailAddress;
    private final Boolean enableInProductMarketingMessages;
    private final Boolean enableMessageNotifications;
    private final Boolean enableOfflineGroup;
    private final Boolean enablePartnerLoginNotifications;
    private final Boolean enablePushNotificationForTrustedDevices;
    private final Boolean enableServiceCaseNotifications;
    private final Boolean enableSessionComments;
    private final Boolean enableSessionLogging;
    private final Boolean hideMonitoringInformation;
    private final Boolean isOnlyVisibleForPartners;
    private final Boolean isSubscribedToBlizzNewsletter;
    private final String pictureUrl;

    public /* synthetic */ AccountProfileUpdateParams(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : bool5, (i & 256) != 0 ? null : bool6, (i & 512) != 0 ? null : bool7, (i & 1024) != 0 ? null : bool8, (i & 2048) != 0 ? null : bool9, (i & 4096) != 0 ? null : bool10, (i & 8192) != 0 ? null : bool11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getEnableSessionLogging() {
        return this.enableSessionLogging;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getEnableSessionComments() {
        return this.enableSessionComments;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getHideMonitoringInformation() {
        return this.hideMonitoringInformation;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getEnableInProductMarketingMessages() {
        return this.enableInProductMarketingMessages;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getEnablePushNotificationForTrustedDevices() {
        return this.enablePushNotificationForTrustedDevices;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsOnlyVisibleForPartners() {
        return this.isOnlyVisibleForPartners;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsSubscribedToBlizzNewsletter() {
        return this.isSubscribedToBlizzNewsletter;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getEnableOfflineGroup() {
        return this.enableOfflineGroup;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getEnableMessageNotifications() {
        return this.enableMessageNotifications;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getEnablePartnerLoginNotifications() {
        return this.enablePartnerLoginNotifications;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getEnableServiceCaseNotifications() {
        return this.enableServiceCaseNotifications;
    }

    public final AccountProfileUpdateParams copy(@sp3(name = "displayName") String displayName, @sp3(name = "emailAddress") String emailAddress, @sp3(name = "pictureUrl") String pictureUrl, @sp3(name = "isOnlyVisibleForPartners") Boolean isOnlyVisibleForPartners, @sp3(name = "isSubscribedToBlizzNewsletter") Boolean isSubscribedToBlizzNewsletter, @sp3(name = "enableOfflineGroup") Boolean enableOfflineGroup, @sp3(name = "enableMessageNotifications") Boolean enableMessageNotifications, @sp3(name = "enablePartnerLoginNotifications") Boolean enablePartnerLoginNotifications, @sp3(name = "enableServiceCaseNotifications") Boolean enableServiceCaseNotifications, @sp3(name = "enableSessionLogging") Boolean enableSessionLogging, @sp3(name = "enableSessionComments") Boolean enableSessionComments, @sp3(name = "hideMonitoringInformation") Boolean hideMonitoringInformation, @sp3(name = "enableInProductMarketingMessages") Boolean enableInProductMarketingMessages, @sp3(name = "enablePushNotificationForTrustedDevices") Boolean enablePushNotificationForTrustedDevices) {
        return new AccountProfileUpdateParams(displayName, emailAddress, pictureUrl, isOnlyVisibleForPartners, isSubscribedToBlizzNewsletter, enableOfflineGroup, enableMessageNotifications, enablePartnerLoginNotifications, enableServiceCaseNotifications, enableSessionLogging, enableSessionComments, hideMonitoringInformation, enableInProductMarketingMessages, enablePushNotificationForTrustedDevices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountProfileUpdateParams)) {
            return false;
        }
        AccountProfileUpdateParams accountProfileUpdateParams = (AccountProfileUpdateParams) other;
        return im3.n(this.displayName, accountProfileUpdateParams.displayName) && im3.n(this.emailAddress, accountProfileUpdateParams.emailAddress) && im3.n(this.pictureUrl, accountProfileUpdateParams.pictureUrl) && im3.n(this.isOnlyVisibleForPartners, accountProfileUpdateParams.isOnlyVisibleForPartners) && im3.n(this.isSubscribedToBlizzNewsletter, accountProfileUpdateParams.isSubscribedToBlizzNewsletter) && im3.n(this.enableOfflineGroup, accountProfileUpdateParams.enableOfflineGroup) && im3.n(this.enableMessageNotifications, accountProfileUpdateParams.enableMessageNotifications) && im3.n(this.enablePartnerLoginNotifications, accountProfileUpdateParams.enablePartnerLoginNotifications) && im3.n(this.enableServiceCaseNotifications, accountProfileUpdateParams.enableServiceCaseNotifications) && im3.n(this.enableSessionLogging, accountProfileUpdateParams.enableSessionLogging) && im3.n(this.enableSessionComments, accountProfileUpdateParams.enableSessionComments) && im3.n(this.hideMonitoringInformation, accountProfileUpdateParams.hideMonitoringInformation) && im3.n(this.enableInProductMarketingMessages, accountProfileUpdateParams.enableInProductMarketingMessages) && im3.n(this.enablePushNotificationForTrustedDevices, accountProfileUpdateParams.enablePushNotificationForTrustedDevices);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final Boolean getEnableInProductMarketingMessages() {
        return this.enableInProductMarketingMessages;
    }

    public final Boolean getEnableMessageNotifications() {
        return this.enableMessageNotifications;
    }

    public final Boolean getEnableOfflineGroup() {
        return this.enableOfflineGroup;
    }

    public final Boolean getEnablePartnerLoginNotifications() {
        return this.enablePartnerLoginNotifications;
    }

    public final Boolean getEnablePushNotificationForTrustedDevices() {
        return this.enablePushNotificationForTrustedDevices;
    }

    public final Boolean getEnableServiceCaseNotifications() {
        return this.enableServiceCaseNotifications;
    }

    public final Boolean getEnableSessionComments() {
        return this.enableSessionComments;
    }

    public final Boolean getEnableSessionLogging() {
        return this.enableSessionLogging;
    }

    public final Boolean getHideMonitoringInformation() {
        return this.hideMonitoringInformation;
    }

    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    public int hashCode() {
        String str = this.displayName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.emailAddress;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pictureUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isOnlyVisibleForPartners;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isSubscribedToBlizzNewsletter;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enableOfflineGroup;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.enableMessageNotifications;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.enablePartnerLoginNotifications;
        int iHashCode8 = (iHashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.enableServiceCaseNotifications;
        int iHashCode9 = (iHashCode8 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.enableSessionLogging;
        int iHashCode10 = (iHashCode9 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.enableSessionComments;
        int iHashCode11 = (iHashCode10 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.hideMonitoringInformation;
        int iHashCode12 = (iHashCode11 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.enableInProductMarketingMessages;
        int iHashCode13 = (iHashCode12 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.enablePushNotificationForTrustedDevices;
        return iHashCode13 + (bool11 != null ? bool11.hashCode() : 0);
    }

    public final Boolean isOnlyVisibleForPartners() {
        return this.isOnlyVisibleForPartners;
    }

    public final Boolean isSubscribedToBlizzNewsletter() {
        return this.isSubscribedToBlizzNewsletter;
    }

    public String toString() {
        String str = this.displayName;
        String str2 = this.emailAddress;
        String str3 = this.pictureUrl;
        Boolean bool = this.isOnlyVisibleForPartners;
        Boolean bool2 = this.isSubscribedToBlizzNewsletter;
        Boolean bool3 = this.enableOfflineGroup;
        Boolean bool4 = this.enableMessageNotifications;
        Boolean bool5 = this.enablePartnerLoginNotifications;
        Boolean bool6 = this.enableServiceCaseNotifications;
        Boolean bool7 = this.enableSessionLogging;
        Boolean bool8 = this.enableSessionComments;
        Boolean bool9 = this.hideMonitoringInformation;
        Boolean bool10 = this.enableInProductMarketingMessages;
        Boolean bool11 = this.enablePushNotificationForTrustedDevices;
        StringBuilder sbO = e41.o("AccountProfileUpdateParams(displayName=", str, ", emailAddress=", str2, ", pictureUrl=");
        sbO.append(str3);
        sbO.append(", isOnlyVisibleForPartners=");
        sbO.append(bool);
        sbO.append(", isSubscribedToBlizzNewsletter=");
        ua5.w(sbO, bool2, ", enableOfflineGroup=", bool3, ", enableMessageNotifications=");
        ua5.w(sbO, bool4, ", enablePartnerLoginNotifications=", bool5, ", enableServiceCaseNotifications=");
        ua5.w(sbO, bool6, ", enableSessionLogging=", bool7, ", enableSessionComments=");
        ua5.w(sbO, bool8, ", hideMonitoringInformation=", bool9, ", enableInProductMarketingMessages=");
        sbO.append(bool10);
        sbO.append(", enablePushNotificationForTrustedDevices=");
        sbO.append(bool11);
        sbO.append(")");
        return sbO.toString();
    }

    public AccountProfileUpdateParams(@sp3(name = "displayName") String str, @sp3(name = "emailAddress") String str2, @sp3(name = "pictureUrl") String str3, @sp3(name = "isOnlyVisibleForPartners") Boolean bool, @sp3(name = "isSubscribedToBlizzNewsletter") Boolean bool2, @sp3(name = "enableOfflineGroup") Boolean bool3, @sp3(name = "enableMessageNotifications") Boolean bool4, @sp3(name = "enablePartnerLoginNotifications") Boolean bool5, @sp3(name = "enableServiceCaseNotifications") Boolean bool6, @sp3(name = "enableSessionLogging") Boolean bool7, @sp3(name = "enableSessionComments") Boolean bool8, @sp3(name = "hideMonitoringInformation") Boolean bool9, @sp3(name = "enableInProductMarketingMessages") Boolean bool10, @sp3(name = "enablePushNotificationForTrustedDevices") Boolean bool11) {
        this.displayName = str;
        this.emailAddress = str2;
        this.pictureUrl = str3;
        this.isOnlyVisibleForPartners = bool;
        this.isSubscribedToBlizzNewsletter = bool2;
        this.enableOfflineGroup = bool3;
        this.enableMessageNotifications = bool4;
        this.enablePartnerLoginNotifications = bool5;
        this.enableServiceCaseNotifications = bool6;
        this.enableSessionLogging = bool7;
        this.enableSessionComments = bool8;
        this.hideMonitoringInformation = bool9;
        this.enableInProductMarketingMessages = bool10;
        this.enablePushNotificationForTrustedDevices = bool11;
    }

    public AccountProfileUpdateParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
