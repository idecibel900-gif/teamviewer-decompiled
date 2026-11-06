package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;
import o.to7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/OrganizationContact;", "", "accountId", "", "name", "", "pictureUrl", "email", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()I", "getName", "()Ljava/lang/String;", "getPictureUrl", "getEmail", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrganizationContact {
    private final int accountId;
    private final String email;
    private final String name;
    private final String pictureUrl;

    public OrganizationContact(@sp3(name = "accountId") int i, @sp3(name = "name") String str, @sp3(name = "pictureUrl") String str2, @sp3(name = "email") String str3) {
        str.getClass();
        this.accountId = i;
        this.name = str;
        this.pictureUrl = str2;
        this.email = str3;
    }

    public static /* synthetic */ OrganizationContact copy$default(OrganizationContact organizationContact, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = organizationContact.accountId;
        }
        if ((i2 & 2) != 0) {
            str = organizationContact.name;
        }
        if ((i2 & 4) != 0) {
            str2 = organizationContact.pictureUrl;
        }
        if ((i2 & 8) != 0) {
            str3 = organizationContact.email;
        }
        return organizationContact.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final OrganizationContact copy(@sp3(name = "accountId") int accountId, @sp3(name = "name") String name, @sp3(name = "pictureUrl") String pictureUrl, @sp3(name = "email") String email) {
        name.getClass();
        return new OrganizationContact(accountId, name, pictureUrl, email);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrganizationContact)) {
            return false;
        }
        OrganizationContact organizationContact = (OrganizationContact) other;
        return this.accountId == organizationContact.accountId && im3.n(this.name, organizationContact.name) && im3.n(this.pictureUrl, organizationContact.pictureUrl) && im3.n(this.email, organizationContact.email);
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPictureUrl() {
        return this.pictureUrl;
    }

    public int hashCode() {
        int iE = to7.e(Integer.hashCode(this.accountId) * 31, 31, this.name);
        String str = this.pictureUrl;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = this.accountId;
        String str = this.name;
        String str2 = this.pictureUrl;
        String str3 = this.email;
        StringBuilder sb = new StringBuilder("OrganizationContact(accountId=");
        sb.append(i);
        sb.append(", name=");
        sb.append(str);
        sb.append(", pictureUrl=");
        return e41.m(sb, str2, ", email=", str3, ")");
    }

    public /* synthetic */ OrganizationContact(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }
}
