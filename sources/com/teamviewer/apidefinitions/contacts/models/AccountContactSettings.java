package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/AccountContactSettings;", "", "contactsLimit", "", "<init>", "(Ljava/lang/Integer;)V", "getContactsLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/teamviewer/apidefinitions/contacts/models/AccountContactSettings;", "equals", "", "other", "hashCode", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AccountContactSettings {
    private final Integer contactsLimit;

    public /* synthetic */ AccountContactSettings(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }

    public static /* synthetic */ AccountContactSettings copy$default(AccountContactSettings accountContactSettings, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = accountContactSettings.contactsLimit;
        }
        return accountContactSettings.copy(num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getContactsLimit() {
        return this.contactsLimit;
    }

    public final AccountContactSettings copy(@sp3(name = "contactsLimit") Integer contactsLimit) {
        return new AccountContactSettings(contactsLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccountContactSettings) && im3.n(this.contactsLimit, ((AccountContactSettings) other).contactsLimit);
    }

    public final Integer getContactsLimit() {
        return this.contactsLimit;
    }

    public int hashCode() {
        Integer num = this.contactsLimit;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "AccountContactSettings(contactsLimit=" + this.contactsLimit + ")";
    }

    public AccountContactSettings(@sp3(name = "contactsLimit") Integer num) {
        this.contactsLimit = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountContactSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
