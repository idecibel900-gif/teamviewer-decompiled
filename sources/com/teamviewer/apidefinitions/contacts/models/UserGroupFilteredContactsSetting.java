package com.teamviewer.apidefinitions.contacts.models;

import kotlin.Metadata;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/teamviewer/apidefinitions/contacts/models/UserGroupFilteredContactsSetting;", "", "enabled", "", "<init>", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserGroupFilteredContactsSetting {
    private final boolean enabled;

    public UserGroupFilteredContactsSetting(@sp3(name = "enabled") boolean z) {
        this.enabled = z;
    }

    public static /* synthetic */ UserGroupFilteredContactsSetting copy$default(UserGroupFilteredContactsSetting userGroupFilteredContactsSetting, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userGroupFilteredContactsSetting.enabled;
        }
        return userGroupFilteredContactsSetting.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final UserGroupFilteredContactsSetting copy(@sp3(name = "enabled") boolean enabled) {
        return new UserGroupFilteredContactsSetting(enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserGroupFilteredContactsSetting) && this.enabled == ((UserGroupFilteredContactsSetting) other).enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "UserGroupFilteredContactsSetting(enabled=" + this.enabled + ")";
    }
}
