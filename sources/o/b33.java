package o;

import com.teamviewer.apidefinitions.legacydevices.models.Device;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceAddedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceChangedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceDelta;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceRemovedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceStatusChangeEvent;
import com.teamviewer.apidefinitions.legacydevices.models.GroupRemovedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.MultipleDevicesAddedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.TeamViewerEvent;
import com.teamviewer.apidefinitions.manageddevices.models.CompanyDeviceAddedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.CompanyDeviceRemovedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceAddedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceChangedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceOnlineStateChangedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceRemovedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedGroupRemovedEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class b33 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ f33 n;

    public /* synthetic */ b33(f33 f33Var, byte b) {
        this.m = b;
        this.n = f33Var;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0260  */
    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        Object value;
        Object next;
        Object value2;
        byte b = this.m;
        ls1 ls1Var = ls1.m;
        f33 f33Var = this.n;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                int i = f33.I;
                f33Var.b1();
                break;
            case 1:
                TeamViewerEvent teamViewerEvent = (TeamViewerEvent) obj;
                l97 l97Var = f33Var.v;
                j23 j23Var = f33Var.G;
                if (teamViewerEvent != null) {
                    if (teamViewerEvent instanceof DeviceStatusChangeEvent) {
                        DeviceStatusChangeEvent deviceStatusChangeEvent = (DeviceStatusChangeEvent) teamViewerEvent;
                        int deviceId = deviceStatusChangeEvent.getDeviceId();
                        Iterator it = lv0.A0((Collection) j23Var.g.getValue(), (Iterable) j23Var.i.getValue()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                Integer num = ((ns1) next).d;
                                if (num != null && num.intValue() == deviceId) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        ns1 ns1Var = (ns1) next;
                        ls1 ls1VarL = et1.L(deviceStatusChangeEvent.getOnlineStatus(), (ns1Var != null ? ns1Var.f : null) != null);
                        jq2 jq2Var = new jq2((byte) 1, deviceStatusChangeEvent.getDeviceId(), ls1VarL);
                        j23Var.o(jq2Var);
                        j23Var.q(jq2Var);
                        f33Var.b1();
                        if (ls1VarL == ls1Var && ns1Var != null) {
                            long j = ns1Var.a;
                            Long l = (Long) f33Var.x.getValue();
                            if (l != null && l.longValue() == j) {
                                f33Var.X0(j);
                                f33Var.c1(j);
                            }
                        }
                    } else if (teamViewerEvent instanceof DeviceAddedEvent) {
                        Device device = ((DeviceAddedEvent) teamViewerEvent).getDevice();
                        int i2 = f33.I;
                        int groupId = device.getGroupId();
                        Object value3 = l97Var.getValue();
                        i33 i33Var = value3 instanceof i33 ? (i33) value3 : null;
                        if (i33Var != null && i33Var.m == groupId) {
                            j23Var.getClass();
                            j23Var.o(new a81(device, (byte) 23));
                        }
                    } else if (teamViewerEvent instanceof MultipleDevicesAddedEvent) {
                        for (Device device2 : ((MultipleDevicesAddedEvent) teamViewerEvent).getDevices()) {
                            int i3 = f33.I;
                            int groupId2 = device2.getGroupId();
                            Object value4 = l97Var.getValue();
                            i33 i33Var2 = value4 instanceof i33 ? (i33) value4 : null;
                            if (i33Var2 != null && i33Var2.m == groupId2) {
                                j23Var.getClass();
                                j23Var.o(new a81(device2, (byte) 23));
                            }
                        }
                    } else if (teamViewerEvent instanceof DeviceChangedEvent) {
                        DeviceDelta device3 = ((DeviceChangedEvent) teamViewerEvent).getDevice();
                        int i4 = f33.I;
                        Integer groupId3 = device3.getGroupId();
                        if (groupId3 != null) {
                            int iIntValue = groupId3.intValue();
                            Object value5 = l97Var.getValue();
                            i33 i33Var3 = value5 instanceof i33 ? (i33) value5 : null;
                            if (i33Var3 == null || i33Var3.m != iIntValue) {
                                int deviceId2 = device3.getDeviceId();
                                j23Var.getClass();
                                mg mgVar = new mg(deviceId2, (byte) 5);
                                j23Var.o(mgVar);
                                j23Var.q(mgVar);
                            } else {
                                a81 a81Var = new a81(device3, f33Var, (byte) 24);
                                j23Var.o(a81Var);
                                j23Var.q(a81Var);
                            }
                        } else {
                            a81 a81Var2 = new a81(device3, f33Var, (byte) 24);
                            j23Var.o(a81Var2);
                            j23Var.q(a81Var2);
                        }
                    } else if (teamViewerEvent instanceof DeviceRemovedEvent) {
                        int deviceId3 = ((DeviceRemovedEvent) teamViewerEvent).getDeviceId();
                        int i5 = f33.I;
                        j23Var.getClass();
                        mg mgVar2 = new mg(deviceId3, (byte) 5);
                        j23Var.o(mgVar2);
                        j23Var.q(mgVar2);
                    } else if (teamViewerEvent instanceof GroupRemovedEvent) {
                        k33 k33Var = (k33) l97Var.getValue();
                        if ((k33Var instanceof i33) && ((i33) k33Var).m == ((GroupRemovedEvent) teamViewerEvent).getGroupId()) {
                            l97 l97Var2 = f33Var.C;
                            do {
                                value = l97Var2.getValue();
                            } while (!l97Var2.j(value, v23.a((v23) value, null, false, false, false, null, false, null, false, false, false, false, true, 0, 0, 14335)));
                        }
                    }
                }
                break;
            case 2:
                com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent teamViewerEvent2 = (com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent) obj;
                f33 f33Var2 = this.n;
                j23 j23Var2 = f33Var2.G;
                if (teamViewerEvent2 != null) {
                    if (teamViewerEvent2 instanceof ManagedDeviceOnlineStateChangedEvent) {
                        ManagedDeviceOnlineStateChangedEvent managedDeviceOnlineStateChangedEvent = (ManagedDeviceOnlineStateChangedEvent) teamViewerEvent2;
                        ls1 ls1VarS = et1.S(managedDeviceOnlineStateChangedEvent.getOnlineStatus());
                        long teamViewerId = managedDeviceOnlineStateChangedEvent.getTeamViewerId();
                        int i6 = f33.I;
                        x23 x23Var = new x23((byte) 0, teamViewerId, ls1VarS);
                        j23Var2.p(x23Var);
                        j23Var2.q(x23Var);
                        f33Var2.b1();
                        if (ls1VarS == ls1Var) {
                            Long l2 = (Long) f33Var2.x.getValue();
                            long teamViewerId2 = managedDeviceOnlineStateChangedEvent.getTeamViewerId();
                            if (l2 != null && l2.longValue() == teamViewerId2) {
                                f33Var2.X0(managedDeviceOnlineStateChangedEvent.getTeamViewerId());
                                f33Var2.c1(managedDeviceOnlineStateChangedEvent.getTeamViewerId());
                            }
                        }
                        if (ls1VarS == ls1.n) {
                            im3.R(e8.n(f33Var2), f33Var2.s, null, new e33(f33Var2, managedDeviceOnlineStateChangedEvent.getTeamViewerId(), null, (byte) 0), 2);
                        }
                    } else if (teamViewerEvent2 instanceof ManagedDeviceAddedEvent) {
                        long teamViewerId3 = ((ManagedDeviceAddedEvent) teamViewerEvent2).getTeamViewerId();
                        int i7 = f33.I;
                        f33Var2.d1(teamViewerId3);
                    } else if (teamViewerEvent2 instanceof CompanyDeviceAddedEvent) {
                        long teamViewerId4 = ((CompanyDeviceAddedEvent) teamViewerEvent2).getTeamViewerId();
                        int i8 = f33.I;
                        f33Var2.d1(teamViewerId4);
                    } else if (teamViewerEvent2 instanceof ManagedDeviceChangedEvent) {
                        int i9 = f33.I;
                        xt1 xt1Var = new xt1((ManagedDeviceChangedEvent) teamViewerEvent2);
                        j23Var2.p(xt1Var);
                        j23Var2.q(xt1Var);
                    } else if (teamViewerEvent2 instanceof ManagedDeviceRemovedEvent) {
                        UUID managementId = ((ManagedDeviceRemovedEvent) teamViewerEvent2).getManagementId();
                        int i10 = f33.I;
                        f33Var2.e1(managementId);
                    } else if (teamViewerEvent2 instanceof CompanyDeviceRemovedEvent) {
                        UUID managementId2 = ((CompanyDeviceRemovedEvent) teamViewerEvent2).getManagementId();
                        int i11 = f33.I;
                        f33Var2.e1(managementId2);
                    } else if (teamViewerEvent2 instanceof ManagedGroupRemovedEvent) {
                        k33 k33Var2 = (k33) f33Var2.v.getValue();
                        if ((k33Var2 instanceof j33) && im3.n(((j33) k33Var2).m, ((ManagedGroupRemovedEvent) teamViewerEvent2).getGroupId())) {
                            l97 l97Var3 = f33Var2.C;
                            do {
                                value2 = l97Var3.getValue();
                            } while (!l97Var3.j(value2, v23.a((v23) value2, null, false, false, false, null, false, null, false, false, false, false, true, 0, 0, 14335)));
                        }
                    }
                }
                break;
            default:
                int i12 = f33.I;
                f33Var.b1();
                break;
        }
        return f88Var;
    }
}
