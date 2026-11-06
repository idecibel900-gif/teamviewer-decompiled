package o;

import com.teamviewer.apidefinitions.legacydevices.models.GroupAddedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.GroupChangedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.GroupRemovedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.TeamViewerEvent;
import com.teamviewer.apidefinitions.manageddevices.models.DirectlyManagedDevicesCacheLoadedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.GroupManagedDevicesCacheLoadedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupAddedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupChangedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupRemovedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupsCacheLoadedEvent;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zy1 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ hz1 n;

    public /* synthetic */ zy1(hz1 hz1Var, byte b) {
        this.m = b;
        this.n = hz1Var;
    }

    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        Object value;
        List list;
        Object value2;
        List list2;
        Object value3;
        List list3;
        Object value4;
        List list4;
        Object value5;
        List list5;
        Object value6;
        List list6;
        byte b = this.m;
        f88 f88Var = f88.a;
        hz1 hz1Var = this.n;
        switch (b) {
            case 0:
                TeamViewerEvent teamViewerEvent = (TeamViewerEvent) obj;
                ll2 ll2Var = hz1Var.D;
                if (teamViewerEvent != null) {
                    if (teamViewerEvent instanceof GroupAddedEvent) {
                        GroupAddedEvent groupAddedEvent = (GroupAddedEvent) teamViewerEvent;
                        i33 i33Var = new i33(groupAddedEvent.getGroup().getGroupId());
                        iw7 iw7Var = (iw7) ll2Var.q;
                        iw7Var.getClass();
                        l97 l97Var = iw7Var.f;
                        do {
                            value3 = l97Var.getValue();
                            list3 = (List) value3;
                            list3.getClass();
                        } while (!l97Var.j(value3, hz1.a1(list3, new l33(i33Var, groupAddedEvent.getGroup().getName(), 12))));
                    } else if (teamViewerEvent instanceof GroupRemovedEvent) {
                        i33 i33Var2 = new i33(((GroupRemovedEvent) teamViewerEvent).getGroupId());
                        iw7 iw7Var2 = (iw7) ll2Var.q;
                        iw7Var2.getClass();
                        l97 l97Var2 = iw7Var2.f;
                        do {
                            value2 = l97Var2.getValue();
                            list2 = (List) value2;
                            list2.getClass();
                        } while (!l97Var2.j(value2, hz1.V0(list2, i33Var2)));
                    } else if (teamViewerEvent instanceof GroupChangedEvent) {
                        GroupChangedEvent groupChangedEvent = (GroupChangedEvent) teamViewerEvent;
                        i33 i33Var3 = new i33(groupChangedEvent.getGroupId());
                        String name = groupChangedEvent.getName();
                        if (name == null) {
                            name = "";
                        }
                        iw7 iw7Var3 = (iw7) ll2Var.q;
                        iw7Var3.getClass();
                        l97 l97Var3 = iw7Var3.f;
                        do {
                            value = l97Var3.getValue();
                            list = (List) value;
                            list.getClass();
                        } while (!l97Var3.j(value, hz1.Y0(list, i33Var3, name)));
                        hz1Var.Z0(i33Var3, name);
                    }
                }
                break;
            default:
                com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent teamViewerEvent2 = (com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent) obj;
                l97 l97Var4 = hz1Var.E;
                ll2 ll2Var2 = hz1Var.D;
                LinkedHashSet linkedHashSet = hz1Var.I;
                if (teamViewerEvent2 != null) {
                    if (teamViewerEvent2 instanceof DirectlyManagedDevicesCacheLoadedEvent) {
                        linkedHashSet.add(xy1.m);
                        l97Var4.l(null, gl4.b((gl4) l97Var4.getValue(), ((DirectlyManagedDevicesCacheLoadedEvent) teamViewerEvent2).isLoaded(), false, false, false, 14));
                    } else if (teamViewerEvent2 instanceof GroupManagedDevicesCacheLoadedEvent) {
                        linkedHashSet.add(xy1.n);
                        l97Var4.l(null, gl4.b((gl4) l97Var4.getValue(), false, ((GroupManagedDevicesCacheLoadedEvent) teamViewerEvent2).isLoaded(), false, false, 13));
                    } else if (teamViewerEvent2 instanceof ManagedGroupsCacheLoadedEvent) {
                        linkedHashSet.add(xy1.f2561o);
                        hz1Var.X0(((ManagedGroupsCacheLoadedEvent) teamViewerEvent2).isLoaded());
                    } else if (teamViewerEvent2 instanceof ManagedGroupAddedEvent) {
                        ManagedGroupAddedEvent managedGroupAddedEvent = (ManagedGroupAddedEvent) teamViewerEvent2;
                        j33 j33Var = new j33(managedGroupAddedEvent.getGroupId());
                        iw7 iw7Var4 = (iw7) ll2Var2.p;
                        iw7Var4.getClass();
                        l97 l97Var5 = iw7Var4.f;
                        do {
                            value6 = l97Var5.getValue();
                            list6 = (List) value6;
                            list6.getClass();
                        } while (!l97Var5.j(value6, hz1.a1(list6, new l33(j33Var, managedGroupAddedEvent.getDisplayName(), 12))));
                    } else if (teamViewerEvent2 instanceof ManagedGroupRemovedEvent) {
                        j33 j33Var2 = new j33(((ManagedGroupRemovedEvent) teamViewerEvent2).getGroupId());
                        iw7 iw7Var5 = (iw7) ll2Var2.p;
                        iw7Var5.getClass();
                        l97 l97Var6 = iw7Var5.f;
                        do {
                            value5 = l97Var6.getValue();
                            list5 = (List) value5;
                            list5.getClass();
                        } while (!l97Var6.j(value5, hz1.V0(list5, j33Var2)));
                    } else if (teamViewerEvent2 instanceof ManagedGroupChangedEvent) {
                        ManagedGroupChangedEvent managedGroupChangedEvent = (ManagedGroupChangedEvent) teamViewerEvent2;
                        j33 j33Var3 = new j33(managedGroupChangedEvent.getGroupId());
                        iw7 iw7Var6 = (iw7) ll2Var2.p;
                        iw7Var6.getClass();
                        l97 l97Var7 = iw7Var6.f;
                        do {
                            value4 = l97Var7.getValue();
                            list4 = (List) value4;
                            list4.getClass();
                        } while (!l97Var7.j(value4, hz1.Y0(list4, j33Var3, managedGroupChangedEvent.getDisplayName())));
                        hz1Var.Z0(j33Var3, managedGroupChangedEvent.getDisplayName());
                    }
                }
                break;
        }
        return f88Var;
    }
}
