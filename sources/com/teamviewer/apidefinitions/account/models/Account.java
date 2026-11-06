package com.teamviewer.apidefinitions.account.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jt\u00101\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010%\u001a\u0004\b\u0010\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/Account;", "", "accountId", "", "profile", "Lcom/teamviewer/apidefinitions/account/models/AccountProfile;", "state", "Lcom/teamviewer/apidefinitions/account/models/AccountStatus;", "accountCompanyInfo", "Lcom/teamviewer/apidefinitions/account/models/AccountCompanyInfo;", "effectiveLicenseFeatures", "", "loginType", "Lcom/teamviewer/apidefinitions/account/models/AccountLoginType;", "rights", "Lcom/teamviewer/apidefinitions/account/models/AccountRights;", "isTenantManager", "", "accountType", "Lcom/teamviewer/apidefinitions/account/models/AccountType;", "<init>", "(ILcom/teamviewer/apidefinitions/account/models/AccountProfile;Lcom/teamviewer/apidefinitions/account/models/AccountStatus;Lcom/teamviewer/apidefinitions/account/models/AccountCompanyInfo;Ljava/util/List;Lcom/teamviewer/apidefinitions/account/models/AccountLoginType;Lcom/teamviewer/apidefinitions/account/models/AccountRights;Ljava/lang/Boolean;Lcom/teamviewer/apidefinitions/account/models/AccountType;)V", "getAccountId", "()I", "getProfile", "()Lcom/teamviewer/apidefinitions/account/models/AccountProfile;", "getState", "()Lcom/teamviewer/apidefinitions/account/models/AccountStatus;", "getAccountCompanyInfo", "()Lcom/teamviewer/apidefinitions/account/models/AccountCompanyInfo;", "getEffectiveLicenseFeatures", "()Ljava/util/List;", "getLoginType", "()Lcom/teamviewer/apidefinitions/account/models/AccountLoginType;", "getRights", "()Lcom/teamviewer/apidefinitions/account/models/AccountRights;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAccountType", "()Lcom/teamviewer/apidefinitions/account/models/AccountType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILcom/teamviewer/apidefinitions/account/models/AccountProfile;Lcom/teamviewer/apidefinitions/account/models/AccountStatus;Lcom/teamviewer/apidefinitions/account/models/AccountCompanyInfo;Ljava/util/List;Lcom/teamviewer/apidefinitions/account/models/AccountLoginType;Lcom/teamviewer/apidefinitions/account/models/AccountRights;Ljava/lang/Boolean;Lcom/teamviewer/apidefinitions/account/models/AccountType;)Lcom/teamviewer/apidefinitions/account/models/Account;", "equals", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Account {
    private final AccountCompanyInfo accountCompanyInfo;
    private final int accountId;
    private final AccountType accountType;
    private final List<Integer> effectiveLicenseFeatures;
    private final Boolean isTenantManager;
    private final AccountLoginType loginType;
    private final AccountProfile profile;
    private final AccountRights rights;
    private final AccountStatus state;

    public Account(@sp3(name = "accountId") int i, @sp3(name = "profile") AccountProfile accountProfile, @sp3(name = "state") AccountStatus accountStatus, @sp3(name = "accountCompanyInfo") AccountCompanyInfo accountCompanyInfo, @sp3(name = "effectiveLicenseFeatures") List<Integer> list, @sp3(name = "loginType") AccountLoginType accountLoginType, @sp3(name = "rights") AccountRights accountRights, @sp3(name = "isTenantManager") Boolean bool, @sp3(name = "accountType") AccountType accountType) {
        accountProfile.getClass();
        accountStatus.getClass();
        accountCompanyInfo.getClass();
        list.getClass();
        accountLoginType.getClass();
        this.accountId = i;
        this.profile = accountProfile;
        this.state = accountStatus;
        this.accountCompanyInfo = accountCompanyInfo;
        this.effectiveLicenseFeatures = list;
        this.loginType = accountLoginType;
        this.rights = accountRights;
        this.isTenantManager = bool;
        this.accountType = accountType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Account copy$default(Account account, int i, AccountProfile accountProfile, AccountStatus accountStatus, AccountCompanyInfo accountCompanyInfo, List list, AccountLoginType accountLoginType, AccountRights accountRights, Boolean bool, AccountType accountType, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = account.accountId;
        }
        if ((i2 & 2) != 0) {
            accountProfile = account.profile;
        }
        if ((i2 & 4) != 0) {
            accountStatus = account.state;
        }
        if ((i2 & 8) != 0) {
            accountCompanyInfo = account.accountCompanyInfo;
        }
        if ((i2 & 16) != 0) {
            list = account.effectiveLicenseFeatures;
        }
        if ((i2 & 32) != 0) {
            accountLoginType = account.loginType;
        }
        if ((i2 & 64) != 0) {
            accountRights = account.rights;
        }
        if ((i2 & 128) != 0) {
            bool = account.isTenantManager;
        }
        if ((i2 & 256) != 0) {
            accountType = account.accountType;
        }
        Boolean bool2 = bool;
        AccountType accountType2 = accountType;
        AccountLoginType accountLoginType2 = accountLoginType;
        AccountRights accountRights2 = accountRights;
        List list2 = list;
        AccountStatus accountStatus2 = accountStatus;
        return account.copy(i, accountProfile, accountStatus2, accountCompanyInfo, list2, accountLoginType2, accountRights2, bool2, accountType2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AccountProfile getProfile() {
        return this.profile;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AccountStatus getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AccountCompanyInfo getAccountCompanyInfo() {
        return this.accountCompanyInfo;
    }

    public final List<Integer> component5() {
        return this.effectiveLicenseFeatures;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AccountLoginType getLoginType() {
        return this.loginType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AccountRights getRights() {
        return this.rights;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsTenantManager() {
        return this.isTenantManager;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AccountType getAccountType() {
        return this.accountType;
    }

    public final Account copy(@sp3(name = "accountId") int accountId, @sp3(name = "profile") AccountProfile profile, @sp3(name = "state") AccountStatus state, @sp3(name = "accountCompanyInfo") AccountCompanyInfo accountCompanyInfo, @sp3(name = "effectiveLicenseFeatures") List<Integer> effectiveLicenseFeatures, @sp3(name = "loginType") AccountLoginType loginType, @sp3(name = "rights") AccountRights rights, @sp3(name = "isTenantManager") Boolean isTenantManager, @sp3(name = "accountType") AccountType accountType) {
        profile.getClass();
        state.getClass();
        accountCompanyInfo.getClass();
        effectiveLicenseFeatures.getClass();
        loginType.getClass();
        return new Account(accountId, profile, state, accountCompanyInfo, effectiveLicenseFeatures, loginType, rights, isTenantManager, accountType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Account)) {
            return false;
        }
        Account account = (Account) other;
        return this.accountId == account.accountId && im3.n(this.profile, account.profile) && this.state == account.state && im3.n(this.accountCompanyInfo, account.accountCompanyInfo) && im3.n(this.effectiveLicenseFeatures, account.effectiveLicenseFeatures) && this.loginType == account.loginType && im3.n(this.rights, account.rights) && im3.n(this.isTenantManager, account.isTenantManager) && this.accountType == account.accountType;
    }

    public final AccountCompanyInfo getAccountCompanyInfo() {
        return this.accountCompanyInfo;
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final AccountType getAccountType() {
        return this.accountType;
    }

    public final List<Integer> getEffectiveLicenseFeatures() {
        return this.effectiveLicenseFeatures;
    }

    public final AccountLoginType getLoginType() {
        return this.loginType;
    }

    public final AccountProfile getProfile() {
        return this.profile;
    }

    public final AccountRights getRights() {
        return this.rights;
    }

    public final AccountStatus getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = (this.loginType.hashCode() + to7.g(this.effectiveLicenseFeatures, (this.accountCompanyInfo.hashCode() + ((this.state.hashCode() + ((this.profile.hashCode() + (Integer.hashCode(this.accountId) * 31)) * 31)) * 31)) * 31, 31)) * 31;
        AccountRights accountRights = this.rights;
        int iHashCode2 = (iHashCode + (accountRights == null ? 0 : accountRights.hashCode())) * 31;
        Boolean bool = this.isTenantManager;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        AccountType accountType = this.accountType;
        return iHashCode3 + (accountType != null ? accountType.hashCode() : 0);
    }

    public final Boolean isTenantManager() {
        return this.isTenantManager;
    }

    public String toString() {
        return "Account(accountId=" + this.accountId + ", profile=" + this.profile + ", state=" + this.state + ", accountCompanyInfo=" + this.accountCompanyInfo + ", effectiveLicenseFeatures=" + this.effectiveLicenseFeatures + ", loginType=" + this.loginType + ", rights=" + this.rights + ", isTenantManager=" + this.isTenantManager + ", accountType=" + this.accountType + ")";
    }

    public /* synthetic */ Account(int i, AccountProfile accountProfile, AccountStatus accountStatus, AccountCompanyInfo accountCompanyInfo, List list, AccountLoginType accountLoginType, AccountRights accountRights, Boolean bool, AccountType accountType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, accountProfile, accountStatus, accountCompanyInfo, list, accountLoginType, (i2 & 64) != 0 ? null : accountRights, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : accountType);
    }
}
