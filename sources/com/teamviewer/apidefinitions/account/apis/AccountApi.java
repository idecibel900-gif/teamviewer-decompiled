package com.teamviewer.apidefinitions.account.apis;

import com.teamviewer.apidefinitions.account.models.Account;
import com.teamviewer.apidefinitions.account.models.AccountPicture;
import com.teamviewer.apidefinitions.account.models.AccountPictureUploadResult;
import com.teamviewer.apidefinitions.account.models.AccountProfile;
import com.teamviewer.apidefinitions.account.models.AccountProfileUpdateParams;
import com.teamviewer.apidefinitions.account.models.AccountState;
import com.teamviewer.apidefinitions.account.models.AccountStatusUpdateParams;
import com.teamviewer.apidefinitions.account.models.AllowedNumberOfManagedDevices;
import com.teamviewer.apidefinitions.account.models.AuthenticationConfigData;
import com.teamviewer.apidefinitions.account.models.LicenseDetails;
import com.teamviewer.apidefinitions.account.models.Licenses;
import com.teamviewer.apidefinitions.account.models.LoginTokenMetadataPage;
import com.teamviewer.apidefinitions.account.models.PasswordChange;
import com.teamviewer.apidefinitions.account.models.PasswordChangeResult;
import com.teamviewer.apidefinitions.account.models.RemoteSessionMetrics;
import com.teamviewer.apidefinitions.account.models.TrustedBrowsersPage;
import com.teamviewer.apidefinitions.account.models.TrustedDevicesPage;
import com.teamviewer.apidefinitions.account.models.TrustedIPAddressesPage;
import kotlin.Metadata;
import o.f88;
import o.j80;
import o.jg1;
import o.ox2;
import o.qc5;
import o.qi0;
import o.sy5;
import o.xg5;
import o.yc5;
import o.yq4;
import o.zc5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H'¢\u0006\u0004\b\u0010\u0010\nJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H'¢\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H'¢\u0006\u0004\b\u0014\u0010\nJ\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004H'¢\u0006\u0004\b\u0016\u0010\nJ\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004H'¢\u0006\u0004\b\u0018\u0010\nJ\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004H'¢\u0006\u0004\b\u001a\u0010\nJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004H'¢\u0006\u0004\b\u001c\u0010\nJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001dH'¢\u0006\u0004\b \u0010!J!\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001dH'¢\u0006\u0004\b#\u0010!J!\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00042\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001dH'¢\u0006\u0004\b%\u0010!J!\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00042\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001dH'¢\u0006\u0004\b'\u0010!J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0004H'¢\u0006\u0004\b)\u0010\nJ\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b*\u0010\nJ\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b+\u0010\nJ\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b,\u0010\nJ\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b-\u0010\nJ\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010.\u001a\u00020\u001dH'¢\u0006\u0004\b/\u0010!J\u001f\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u00101\u001a\u000200H'¢\u0006\u0004\b2\u00103J\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u00104\u001a\u00020\u001dH'¢\u0006\u0004\b5\u0010!J\u001f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u00107\u001a\u000206H'¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010;\u001a\u00020:H'¢\u0006\u0004\b<\u0010=J\u001f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00042\b\b\u0001\u0010?\u001a\u00020>H'¢\u0006\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lcom/teamviewer/apidefinitions/account/apis/AccountApi;", "", "Lcom/teamviewer/apidefinitions/account/models/PasswordChange;", "passwordChange", "Lo/qi0;", "Lcom/teamviewer/apidefinitions/account/models/PasswordChangeResult;", "changePassword", "(Lcom/teamviewer/apidefinitions/account/models/PasswordChange;)Lo/qi0;", "Lo/f88;", "deleteAccount", "()Lo/qi0;", "", "loginTokenId", "deleteLoginToken", "(I)Lo/qi0;", "Lcom/teamviewer/apidefinitions/account/models/Account;", "getAccount", "Lcom/teamviewer/apidefinitions/account/models/AccountProfile;", "getAccountProfile", "Lcom/teamviewer/apidefinitions/account/models/RemoteSessionMetrics;", "getAccountRemoteSessionMetrics", "Lcom/teamviewer/apidefinitions/account/models/AccountState;", "getAccountState", "Lcom/teamviewer/apidefinitions/account/models/AllowedNumberOfManagedDevices;", "getAllowedNumberOfManagedDevices", "Lcom/teamviewer/apidefinitions/account/models/AuthenticationConfigData;", "getAuthenticationConfig", "Lcom/teamviewer/apidefinitions/account/models/LicenseDetails;", "getLicenseDetails", "", "continuationToken", "Lcom/teamviewer/apidefinitions/account/models/LoginTokenMetadataPage;", "getLoginTokens", "(Ljava/lang/String;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/account/models/TrustedBrowsersPage;", "getTrustedBrowsers", "Lcom/teamviewer/apidefinitions/account/models/TrustedDevicesPage;", "getTrustedDevices", "Lcom/teamviewer/apidefinitions/account/models/TrustedIPAddressesPage;", "getTrustedIPAddresses", "Lcom/teamviewer/apidefinitions/account/models/Licenses;", "licenses", "logout", "removeAccountPicture", "requestAccountDeletionEmail", "revokeAllTrusts", "trustedBrowserId", "revokeBrowserTrust", "", "teamviewerId", "revokeDeviceTrust", "(J)Lo/qi0;", "ipAddress", "revokeIPAddressTrust", "Lcom/teamviewer/apidefinitions/account/models/AccountProfileUpdateParams;", "accountProfileUpdateParams", "updateAccountProfile", "(Lcom/teamviewer/apidefinitions/account/models/AccountProfileUpdateParams;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/account/models/AccountStatusUpdateParams;", "accountStatusUpdateParams", "updateAccountState", "(Lcom/teamviewer/apidefinitions/account/models/AccountStatusUpdateParams;)Lo/qi0;", "Lcom/teamviewer/apidefinitions/account/models/AccountPicture;", "accountPicture", "Lcom/teamviewer/apidefinitions/account/models/AccountPictureUploadResult;", "uploadAccountPicture", "(Lcom/teamviewer/apidefinitions/account/models/AccountPicture;)Lo/qi0;", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AccountApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ qi0 getLoginTokens$default(AccountApi accountApi, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getLoginTokens");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return accountApi.getLoginTokens(str);
        }

        public static /* synthetic */ qi0 getTrustedBrowsers$default(AccountApi accountApi, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getTrustedBrowsers");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return accountApi.getTrustedBrowsers(str);
        }

        public static /* synthetic */ qi0 getTrustedDevices$default(AccountApi accountApi, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getTrustedDevices");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return accountApi.getTrustedDevices(str);
        }

        public static /* synthetic */ qi0 getTrustedIPAddresses$default(AccountApi accountApi, String str, int i, Object obj) {
            if (obj != null) {
                yq4.r("Super calls with default arguments not supported in this target, function: getTrustedIPAddresses");
                return null;
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return accountApi.getTrustedIPAddresses(str);
        }
    }

    @zc5("password")
    qi0<PasswordChangeResult> changePassword(@j80 PasswordChange passwordChange);

    @jg1("account")
    qi0<f88> deleteAccount();

    @jg1("logintokens/{loginTokenId}")
    qi0<f88> deleteLoginToken(@xg5("loginTokenId") int loginTokenId);

    @ox2("account")
    qi0<Account> getAccount();

    @ox2("profile")
    qi0<AccountProfile> getAccountProfile();

    @ox2("remotesessionmetrics")
    qi0<RemoteSessionMetrics> getAccountRemoteSessionMetrics();

    @ox2("state")
    qi0<AccountState> getAccountState();

    @ox2("allowednumberofmanageddevices")
    qi0<AllowedNumberOfManagedDevices> getAllowedNumberOfManagedDevices();

    @ox2("authenticationconfig")
    qi0<AuthenticationConfigData> getAuthenticationConfig();

    @ox2("licensedetails")
    qi0<LicenseDetails> getLicenseDetails();

    @ox2("logintokens")
    qi0<LoginTokenMetadataPage> getLoginTokens(@sy5("continuationToken") String continuationToken);

    @ox2("trustmanagement/browsers")
    qi0<TrustedBrowsersPage> getTrustedBrowsers(@sy5("continuationToken") String continuationToken);

    @ox2("trustmanagement/devices")
    qi0<TrustedDevicesPage> getTrustedDevices(@sy5("continuationToken") String continuationToken);

    @ox2("trustmanagement/ipaddresses")
    qi0<TrustedIPAddressesPage> getTrustedIPAddresses(@sy5("continuationToken") String continuationToken);

    @ox2("licenses")
    qi0<Licenses> licenses();

    @yc5("logout")
    qi0<f88> logout();

    @jg1("picture")
    qi0<f88> removeAccountPicture();

    @yc5("account")
    qi0<f88> requestAccountDeletionEmail();

    @yc5("trustmanagement/revokealltrusts")
    qi0<f88> revokeAllTrusts();

    @jg1("trustmanagement/browsers/{trustedBrowserId}")
    qi0<f88> revokeBrowserTrust(@xg5("trustedBrowserId") String trustedBrowserId);

    @jg1("trustmanagement/devices/{teamviewerId}")
    qi0<f88> revokeDeviceTrust(@xg5("teamviewerId") long teamviewerId);

    @jg1("trustmanagement/ipaddresses/{ipAddress}")
    qi0<f88> revokeIPAddressTrust(@xg5("ipAddress") String ipAddress);

    @qc5("profile")
    qi0<AccountProfile> updateAccountProfile(@j80 AccountProfileUpdateParams accountProfileUpdateParams);

    @zc5("state")
    qi0<AccountState> updateAccountState(@j80 AccountStatusUpdateParams accountStatusUpdateParams);

    @yc5("picture")
    qi0<AccountPictureUploadResult> uploadAccountPicture(@j80 AccountPicture accountPicture);
}
