package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/AccountState;", "", "state", "Lcom/teamviewer/apidefinitions/account/models/AccountStatus;", "<init>", "(Lcom/teamviewer/apidefinitions/account/models/AccountStatus;)V", "getState", "()Lcom/teamviewer/apidefinitions/account/models/AccountStatus;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AccountState {
    private final AccountStatus state;

    public AccountState(@sp3(name = "state") AccountStatus accountStatus) {
        accountStatus.getClass();
        this.state = accountStatus;
    }

    public static /* synthetic */ AccountState copy$default(AccountState accountState, AccountStatus accountStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            accountStatus = accountState.state;
        }
        return accountState.copy(accountStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AccountStatus getState() {
        return this.state;
    }

    public final AccountState copy(@sp3(name = "state") AccountStatus state) {
        state.getClass();
        return new AccountState(state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccountState) && this.state == ((AccountState) other).state;
    }

    public final AccountStatus getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public String toString() {
        return "AccountState(state=" + this.state + ")";
    }
}
