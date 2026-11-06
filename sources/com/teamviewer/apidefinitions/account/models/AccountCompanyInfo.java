package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J:\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/AccountCompanyInfo;", "", "accountJoinCompanyState", "Lcom/teamviewer/apidefinitions/account/models/AccountJoinCompanyState;", "isInCompany", "", "companyId", "", "companyName", "", "<init>", "(Lcom/teamviewer/apidefinitions/account/models/AccountJoinCompanyState;ZLjava/lang/Integer;Ljava/lang/String;)V", "getAccountJoinCompanyState", "()Lcom/teamviewer/apidefinitions/account/models/AccountJoinCompanyState;", "()Z", "getCompanyId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCompanyName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Lcom/teamviewer/apidefinitions/account/models/AccountJoinCompanyState;ZLjava/lang/Integer;Ljava/lang/String;)Lcom/teamviewer/apidefinitions/account/models/AccountCompanyInfo;", "equals", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AccountCompanyInfo {
    private final AccountJoinCompanyState accountJoinCompanyState;
    private final Integer companyId;
    private final String companyName;
    private final boolean isInCompany;

    public AccountCompanyInfo(@sp3(name = "accountJoinCompanyState") AccountJoinCompanyState accountJoinCompanyState, @sp3(name = "isInCompany") boolean z, @sp3(name = "companyId") Integer num, @sp3(name = "companyName") String str) {
        accountJoinCompanyState.getClass();
        this.accountJoinCompanyState = accountJoinCompanyState;
        this.isInCompany = z;
        this.companyId = num;
        this.companyName = str;
    }

    public static /* synthetic */ AccountCompanyInfo copy$default(AccountCompanyInfo accountCompanyInfo, AccountJoinCompanyState accountJoinCompanyState, boolean z, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            accountJoinCompanyState = accountCompanyInfo.accountJoinCompanyState;
        }
        if ((i & 2) != 0) {
            z = accountCompanyInfo.isInCompany;
        }
        if ((i & 4) != 0) {
            num = accountCompanyInfo.companyId;
        }
        if ((i & 8) != 0) {
            str = accountCompanyInfo.companyName;
        }
        return accountCompanyInfo.copy(accountJoinCompanyState, z, num, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AccountJoinCompanyState getAccountJoinCompanyState() {
        return this.accountJoinCompanyState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsInCompany() {
        return this.isInCompany;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getCompanyId() {
        return this.companyId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    public final AccountCompanyInfo copy(@sp3(name = "accountJoinCompanyState") AccountJoinCompanyState accountJoinCompanyState, @sp3(name = "isInCompany") boolean isInCompany, @sp3(name = "companyId") Integer companyId, @sp3(name = "companyName") String companyName) {
        accountJoinCompanyState.getClass();
        return new AccountCompanyInfo(accountJoinCompanyState, isInCompany, companyId, companyName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountCompanyInfo)) {
            return false;
        }
        AccountCompanyInfo accountCompanyInfo = (AccountCompanyInfo) other;
        return this.accountJoinCompanyState == accountCompanyInfo.accountJoinCompanyState && this.isInCompany == accountCompanyInfo.isInCompany && im3.n(this.companyId, accountCompanyInfo.companyId) && im3.n(this.companyName, accountCompanyInfo.companyName);
    }

    public final AccountJoinCompanyState getAccountJoinCompanyState() {
        return this.accountJoinCompanyState;
    }

    public final Integer getCompanyId() {
        return this.companyId;
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    public int hashCode() {
        int iF = to7.f(this.accountJoinCompanyState.hashCode() * 31, 31, this.isInCompany);
        Integer num = this.companyId;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.companyName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean isInCompany() {
        return this.isInCompany;
    }

    public String toString() {
        return "AccountCompanyInfo(accountJoinCompanyState=" + this.accountJoinCompanyState + ", isInCompany=" + this.isInCompany + ", companyId=" + this.companyId + ", companyName=" + this.companyName + ")";
    }

    public /* synthetic */ AccountCompanyInfo(AccountJoinCompanyState accountJoinCompanyState, boolean z, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(accountJoinCompanyState, z, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }
}
