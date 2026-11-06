package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/OrganizationContactSettings;", "", "isCompanyAddressBookEnabled", "", "<init>", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/teamviewer/apidefinitions/contacts/models/OrganizationContactSettings;", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrganizationContactSettings {
    private final Boolean isCompanyAddressBookEnabled;

    public /* synthetic */ OrganizationContactSettings(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }

    public static /* synthetic */ OrganizationContactSettings copy$default(OrganizationContactSettings organizationContactSettings, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = organizationContactSettings.isCompanyAddressBookEnabled;
        }
        return organizationContactSettings.copy(bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsCompanyAddressBookEnabled() {
        return this.isCompanyAddressBookEnabled;
    }

    public final OrganizationContactSettings copy(@sp3(name = "isCompanyAddressBookEnabled") Boolean isCompanyAddressBookEnabled) {
        return new OrganizationContactSettings(isCompanyAddressBookEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrganizationContactSettings) && im3.n(this.isCompanyAddressBookEnabled, ((OrganizationContactSettings) other).isCompanyAddressBookEnabled);
    }

    public int hashCode() {
        Boolean bool = this.isCompanyAddressBookEnabled;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isCompanyAddressBookEnabled() {
        return this.isCompanyAddressBookEnabled;
    }

    public String toString() {
        return "OrganizationContactSettings(isCompanyAddressBookEnabled=" + this.isCompanyAddressBookEnabled + ")";
    }

    public OrganizationContactSettings(@sp3(name = "isCompanyAddressBookEnabled") Boolean bool) {
        this.isCompanyAddressBookEnabled = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrganizationContactSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
