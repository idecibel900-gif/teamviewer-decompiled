package com.teamviewer.apidefinitions.account.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/teamviewer/apidefinitions/account/models/AccountChangeEvent;", "Lcom/teamviewer/apidefinitions/account/models/TeamViewerEvent;", "eventType", "", "account", "Lcom/teamviewer/apidefinitions/account/models/Account;", "<init>", "(Ljava/lang/String;Lcom/teamviewer/apidefinitions/account/models/Account;)V", "getEventType", "()Ljava/lang/String;", "getAccount", "()Lcom/teamviewer/apidefinitions/account/models/Account;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AccountChangeEvent implements TeamViewerEvent {
    private final Account account;
    private final String eventType;

    public AccountChangeEvent(@sp3(name = "eventType") String str, @sp3(name = "account") Account account) {
        str.getClass();
        this.eventType = str;
        this.account = account;
    }

    public static /* synthetic */ AccountChangeEvent copy$default(AccountChangeEvent accountChangeEvent, String str, Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountChangeEvent.eventType;
        }
        if ((i & 2) != 0) {
            account = accountChangeEvent.account;
        }
        return accountChangeEvent.copy(str, account);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    public final AccountChangeEvent copy(@sp3(name = "eventType") String eventType, @sp3(name = "account") Account account) {
        eventType.getClass();
        return new AccountChangeEvent(eventType, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountChangeEvent)) {
            return false;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) other;
        return im3.n(this.eventType, accountChangeEvent.eventType) && im3.n(this.account, accountChangeEvent.account);
    }

    public final Account getAccount() {
        return this.account;
    }

    @Override // com.teamviewer.apidefinitions.account.models.TeamViewerEvent
    public String getEventType() {
        return this.eventType;
    }

    public int hashCode() {
        int iHashCode = this.eventType.hashCode() * 31;
        Account account = this.account;
        return iHashCode + (account == null ? 0 : account.hashCode());
    }

    public String toString() {
        return "AccountChangeEvent(eventType=" + this.eventType + ", account=" + this.account + ")";
    }

    public /* synthetic */ AccountChangeEvent(String str, Account account, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : account);
    }
}
