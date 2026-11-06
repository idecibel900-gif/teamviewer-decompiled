package com.teamviewer.apidefinitions.manageddevices.models;

import java.util.Map;
import kotlin.Metadata;
import o.im3;
import o.sp3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/teamviewer/apidefinitions/manageddevices/models/GroupsDeviceListMap;", "", "map", "", "", "Lcom/teamviewer/apidefinitions/manageddevices/models/GroupsDeviceListMapValue;", "<init>", "(Ljava/util/Map;)V", "getMap", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GroupsDeviceListMap {
    private final Map<String, GroupsDeviceListMapValue> map;

    public GroupsDeviceListMap(@sp3(name = "map") Map<String, GroupsDeviceListMapValue> map) {
        map.getClass();
        this.map = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupsDeviceListMap copy$default(GroupsDeviceListMap groupsDeviceListMap, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = groupsDeviceListMap.map;
        }
        return groupsDeviceListMap.copy(map);
    }

    public final Map<String, GroupsDeviceListMapValue> component1() {
        return this.map;
    }

    public final GroupsDeviceListMap copy(@sp3(name = "map") Map<String, GroupsDeviceListMapValue> map) {
        map.getClass();
        return new GroupsDeviceListMap(map);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GroupsDeviceListMap) && im3.n(this.map, ((GroupsDeviceListMap) other).map);
    }

    public final Map<String, GroupsDeviceListMapValue> getMap() {
        return this.map;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        return "GroupsDeviceListMap(map=" + this.map + ")";
    }
}
