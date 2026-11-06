package com.teamviewer.apidefinitions.contacts.models;

import java.time.OffsetDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/OrganizationContactList;", "", "items", "", "Lcom/teamviewer/apidefinitions/contacts/models/OrganizationContact;", "nextPaginationToken", "", "cachedUntil", "Ljava/time/OffsetDateTime;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/time/OffsetDateTime;)V", "getItems", "()Ljava/util/List;", "getNextPaginationToken", "()Ljava/lang/String;", "getCachedUntil", "()Ljava/time/OffsetDateTime;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrganizationContactList {
    private final OffsetDateTime cachedUntil;
    private final List<OrganizationContact> items;
    private final String nextPaginationToken;

    public /* synthetic */ OrganizationContactList(List list, String str, OffsetDateTime offsetDateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : offsetDateTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrganizationContactList copy$default(OrganizationContactList organizationContactList, List list, String str, OffsetDateTime offsetDateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            list = organizationContactList.items;
        }
        if ((i & 2) != 0) {
            str = organizationContactList.nextPaginationToken;
        }
        if ((i & 4) != 0) {
            offsetDateTime = organizationContactList.cachedUntil;
        }
        return organizationContactList.copy(list, str, offsetDateTime);
    }

    public final List<OrganizationContact> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNextPaginationToken() {
        return this.nextPaginationToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OffsetDateTime getCachedUntil() {
        return this.cachedUntil;
    }

    public final OrganizationContactList copy(@sp3(name = "items") List<OrganizationContact> items, @sp3(name = "nextPaginationToken") String nextPaginationToken, @sp3(name = "cachedUntil") OffsetDateTime cachedUntil) {
        items.getClass();
        return new OrganizationContactList(items, nextPaginationToken, cachedUntil);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrganizationContactList)) {
            return false;
        }
        OrganizationContactList organizationContactList = (OrganizationContactList) other;
        return im3.n(this.items, organizationContactList.items) && im3.n(this.nextPaginationToken, organizationContactList.nextPaginationToken) && im3.n(this.cachedUntil, organizationContactList.cachedUntil);
    }

    public final OffsetDateTime getCachedUntil() {
        return this.cachedUntil;
    }

    public final List<OrganizationContact> getItems() {
        return this.items;
    }

    public final String getNextPaginationToken() {
        return this.nextPaginationToken;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        String str = this.nextPaginationToken;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.cachedUntil;
        return iHashCode2 + (offsetDateTime != null ? offsetDateTime.hashCode() : 0);
    }

    public String toString() {
        return "OrganizationContactList(items=" + this.items + ", nextPaginationToken=" + this.nextPaginationToken + ", cachedUntil=" + this.cachedUntil + ")";
    }

    public OrganizationContactList(@sp3(name = "items") List<OrganizationContact> list, @sp3(name = "nextPaginationToken") String str, @sp3(name = "cachedUntil") OffsetDateTime offsetDateTime) {
        list.getClass();
        this.items = list;
        this.nextPaginationToken = str;
        this.cachedUntil = offsetDateTime;
    }
}
