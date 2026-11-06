package com.teamviewer.apidefinitions.legacydevices.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.e41;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareContactRight;", "", "contactId", "", "right", "Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareRight;", "name", "", "<init>", "(ILcom/teamviewer/apidefinitions/legacydevices/models/GroupShareRight;Ljava/lang/String;)V", "getContactId", "()I", "getRight", "()Lcom/teamviewer/apidefinitions/legacydevices/models/GroupShareRight;", "getName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupShareContactRight {
    private final int contactId;
    private final String name;
    private final GroupShareRight right;

    public GroupShareContactRight(@sp3(name = "contactId") int i, @sp3(name = "right") GroupShareRight groupShareRight, @sp3(name = "name") String str) {
        groupShareRight.getClass();
        this.contactId = i;
        this.right = groupShareRight;
        this.name = str;
    }

    public static /* synthetic */ GroupShareContactRight copy$default(GroupShareContactRight groupShareContactRight, int i, GroupShareRight groupShareRight, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = groupShareContactRight.contactId;
        }
        if ((i2 & 2) != 0) {
            groupShareRight = groupShareContactRight.right;
        }
        if ((i2 & 4) != 0) {
            str = groupShareContactRight.name;
        }
        return groupShareContactRight.copy(i, groupShareRight, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getContactId() {
        return this.contactId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GroupShareRight getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final GroupShareContactRight copy(@sp3(name = "contactId") int contactId, @sp3(name = "right") GroupShareRight right, @sp3(name = "name") String name) {
        right.getClass();
        return new GroupShareContactRight(contactId, right, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupShareContactRight)) {
            return false;
        }
        GroupShareContactRight groupShareContactRight = (GroupShareContactRight) other;
        return this.contactId == groupShareContactRight.contactId && this.right == groupShareContactRight.right && im3.n(this.name, groupShareContactRight.name);
    }

    public final int getContactId() {
        return this.contactId;
    }

    public final String getName() {
        return this.name;
    }

    public final GroupShareRight getRight() {
        return this.right;
    }

    public int hashCode() {
        int iHashCode = (this.right.hashCode() + (Integer.hashCode(this.contactId) * 31)) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.contactId;
        GroupShareRight groupShareRight = this.right;
        String str = this.name;
        StringBuilder sb = new StringBuilder("GroupShareContactRight(contactId=");
        sb.append(i);
        sb.append(", right=");
        sb.append(groupShareRight);
        sb.append(", name=");
        return e41.l(sb, str, ")");
    }

    public /* synthetic */ GroupShareContactRight(int i, GroupShareRight groupShareRight, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, groupShareRight, (i2 & 4) != 0 ? null : str);
    }
}
