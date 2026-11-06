package o;

import com.teamviewer.apidefinitions.legacydevices.models.DeviceChangedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceRemovedEvent;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceStatusChangeEvent;
import com.teamviewer.apidefinitions.legacydevices.models.TeamViewerEvent;
import com.teamviewer.apidefinitions.manageddevices.models.CompanyDeviceRemovedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceOnlineStatus;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceChangedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceOnlineStateChangedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceRemovedEvent;
import com.teamviewer.apidefinitions.manageddevices.models.ManagerRelationChangedEvent;
import com.teamviewer.apidefinitions.policies.models.PolicyAssignmentEvent;
import com.teamviewer.apidefinitions.policies.models.PolicyData;
import com.teamviewer.apidefinitions.policies.models.PolicyUnassignmentEvent;
import com.teamviewer.apidefinitions.policies.models.TeamViewerPolicyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class lu1 implements ho2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ru1 n;

    public /* synthetic */ lu1(ru1 ru1Var, byte b) {
        this.m = b;
        this.n = ru1Var;
    }

    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0184  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.ho2
    public final Object c(Object obj, hc1 hc1Var) {
        ns1 ns1Var;
        Object objB1;
        List<UUID> groupIds;
        UUID uuid;
        Object objD1;
        ArrayList arrayListB0;
        byte b = this.m;
        ls1 ls1Var = ls1.m;
        ru1 ru1Var = this.n;
        Object obj2 = ne1.m;
        Object obj3 = f88.a;
        switch (b) {
            case 0:
                TeamViewerEvent teamViewerEvent = (TeamViewerEvent) obj;
                if (teamViewerEvent != null) {
                    if (teamViewerEvent instanceof DeviceStatusChangeEvent) {
                        DeviceStatusChangeEvent deviceStatusChangeEvent = (DeviceStatusChangeEvent) teamViewerEvent;
                        du1 zt1Var = new zt1(deviceStatusChangeEvent.getDeviceId());
                        LinkedHashMap linkedHashMap = ru1Var.K;
                        ns1 ns1Var2 = (ns1) linkedHashMap.get(zt1Var);
                        if (ns1Var2 != null) {
                            ls1 ls1VarQ1 = ru1.q1(deviceStatusChangeEvent.getOnlineStatus(), ns1Var2.f != null);
                            ru1Var.s1(zt1Var, ru1Var.L, new a81(ls1VarQ1, (byte) 5));
                            if (ls1VarQ1 == ls1Var) {
                                Object value = ru1Var.J.getValue();
                                ns1 ns1Var3 = (ns1) linkedHashMap.get(zt1Var);
                                if (im3.n(value, ns1Var3 != null ? Long.valueOf(ns1Var3.a) : null) && (ns1Var = (ns1) linkedHashMap.get(zt1Var)) != null) {
                                    ru1Var.W0(ns1Var.a);
                                }
                            }
                        }
                    } else if (teamViewerEvent instanceof DeviceChangedEvent) {
                        DeviceChangedEvent deviceChangedEvent = (DeviceChangedEvent) teamViewerEvent;
                        ru1Var.s1(new zt1(deviceChangedEvent.getDevice().getDeviceId()), ru1Var.L, new a81(ru1Var, (Object) deviceChangedEvent, (byte) 3));
                    } else if (teamViewerEvent instanceof DeviceRemovedEvent) {
                        du1 zt1Var2 = new zt1(((DeviceRemovedEvent) teamViewerEvent).getDeviceId());
                        if (!ru1Var.Q.contains(zt1Var2)) {
                            ru1Var.o1(zt1Var2);
                        }
                    }
                }
                return obj3;
            case 1:
                com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent teamViewerEvent2 = (com.teamviewer.apidefinitions.manageddevices.models.TeamViewerEvent) obj;
                if (teamViewerEvent2 == null) {
                    return obj3;
                }
                boolean z = teamViewerEvent2 instanceof ManagedDeviceOnlineStateChangedEvent;
                ru1 ru1Var2 = this.n;
                if (z) {
                    ManagedDeviceOnlineStateChangedEvent managedDeviceOnlineStateChangedEvent = (ManagedDeviceOnlineStateChangedEvent) teamViewerEvent2;
                    Iterator it = ru1Var2.a1(managedDeviceOnlineStateChangedEvent.getTeamViewerId(), managedDeviceOnlineStateChangedEvent.getManagementId()).iterator();
                    while (it.hasNext()) {
                        ru1Var2.s1((du1) it.next(), ru1Var2.L, new a81(ru1Var2, (Object) managedDeviceOnlineStateChangedEvent, (byte) 4));
                    }
                    DeviceOnlineStatus onlineStatus = managedDeviceOnlineStateChangedEvent.getOnlineStatus();
                    ns1 ns1VarY0 = ru1Var2.Y0();
                    if (ru1.r1(onlineStatus, ns1VarY0 != null ? ns1VarY0.f : null) != ls1Var) {
                        return obj3;
                    }
                    Long l = (Long) ru1Var2.J.getValue();
                    long teamViewerId = managedDeviceOnlineStateChangedEvent.getTeamViewerId();
                    if (l == null || l.longValue() != teamViewerId) {
                        return obj3;
                    }
                    ru1Var2.W0(managedDeviceOnlineStateChangedEvent.getTeamViewerId());
                    return obj3;
                }
                if (teamViewerEvent2 instanceof ManagedDeviceChangedEvent) {
                    ManagedDeviceChangedEvent managedDeviceChangedEvent = (ManagedDeviceChangedEvent) teamViewerEvent2;
                    Iterator it2 = ru1Var2.a1(managedDeviceChangedEvent.getTeamViewerId(), managedDeviceChangedEvent.getManagementId()).iterator();
                    while (it2.hasNext()) {
                        ru1Var2.s1((du1) it2.next(), ru1Var2.L, new xt1(managedDeviceChangedEvent, ru1Var2));
                    }
                    objB1 = ru1Var2.k1(managedDeviceChangedEvent.getManagementId(), true, false, false, hc1Var);
                    if (objB1 != obj2) {
                        objB1 = obj3;
                    }
                    if (objB1 != obj2) {
                        return obj3;
                    }
                } else if (teamViewerEvent2 instanceof ManagerRelationChangedEvent) {
                    ns1 ns1VarY1 = ru1Var2.Y0();
                    if (ns1VarY1 == null) {
                        objB1 = obj3;
                    } else {
                        ns1 ns1Var4 = ns1VarY1.l ? ns1VarY1 : null;
                        if (ns1Var4 == null || (uuid = ns1Var4.v) == null || (objB1 = ru1Var2.k1(uuid, false, false, false, hc1Var)) != obj2) {
                            objB1 = obj3;
                        }
                    }
                    if (objB1 != obj2) {
                        return obj3;
                    }
                } else if (teamViewerEvent2 instanceof ManagedDeviceRemovedEvent) {
                    ManagedDeviceRemovedEvent managedDeviceRemovedEvent = (ManagedDeviceRemovedEvent) teamViewerEvent2;
                    if (managedDeviceRemovedEvent.getDirect() != null || (((groupIds = managedDeviceRemovedEvent.getGroupIds()) != null && (!groupIds.isEmpty())) || managedDeviceRemovedEvent.getTargetManagerId() != null)) {
                        UUID managementId = managedDeviceRemovedEvent.getManagementId();
                        List<UUID> groupIds2 = managedDeviceRemovedEvent.getGroupIds();
                        if (groupIds2 == null) {
                            groupIds2 = ea2.m;
                        }
                        objB1 = ru1Var2.b1(managementId, lv0.T0(groupIds2), hc1Var);
                        if (objB1 != obj2) {
                        }
                        if (objB1 != obj2) {
                            return obj3;
                        }
                    } else {
                        UUID managementId2 = managedDeviceRemovedEvent.getManagementId();
                        du1 du1VarZ0 = ru1Var2.Z0(managementId2, null);
                        if (du1VarZ0 == null) {
                            du1VarZ0 = new bu1(managementId2);
                        }
                        if (!ru1Var2.Q.contains(du1VarZ0)) {
                            ru1Var2.o1(du1VarZ0);
                        }
                    }
                    objB1 = obj3;
                    if (objB1 != obj2) {
                        return obj3;
                    }
                } else {
                    if (!(teamViewerEvent2 instanceof CompanyDeviceRemovedEvent)) {
                        return obj3;
                    }
                    objB1 = ru1Var2.b1(((CompanyDeviceRemovedEvent) teamViewerEvent2).getManagementId(), la2.m, hc1Var);
                    if (objB1 != obj2) {
                        objB1 = obj3;
                    }
                    if (objB1 != obj2) {
                        return obj3;
                    }
                }
                return objB1;
            default:
                com.teamviewer.apidefinitions.policies.models.TeamViewerEvent teamViewerEvent3 = (com.teamviewer.apidefinitions.policies.models.TeamViewerEvent) obj;
                if (teamViewerEvent3 != null) {
                    if (teamViewerEvent3 instanceof TeamViewerPolicyEvent) {
                        TeamViewerPolicyEvent teamViewerPolicyEvent = (TeamViewerPolicyEvent) teamViewerEvent3;
                        int i = fu1.a[teamViewerPolicyEvent.getOperation().ordinal()];
                        if (i == 1 || i == 2) {
                            List list = ru1Var.L;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj4 : list) {
                                if (!im3.n(((PolicyData) obj4).getPolicyId(), teamViewerPolicyEvent.getPolicyData().getPolicyId())) {
                                    arrayList.add(obj4);
                                }
                            }
                            arrayListB0 = lv0.B0(arrayList, teamViewerPolicyEvent.getPolicyData());
                        } else {
                            if (i != 3) {
                                gk0.s();
                                return null;
                            }
                            List list2 = ru1Var.L;
                            arrayListB0 = new ArrayList();
                            for (Object obj5 : list2) {
                                if (!im3.n(((PolicyData) obj5).getPolicyId(), teamViewerPolicyEvent.getPolicyData().getPolicyId())) {
                                    arrayListB0.add(obj5);
                                }
                            }
                        }
                        ru1Var.t1(arrayListB0);
                    } else if (teamViewerEvent3 instanceof PolicyAssignmentEvent) {
                        Object objC1 = ru1Var.c1((PolicyAssignmentEvent) teamViewerEvent3, hc1Var);
                        if (objC1 == obj2) {
                            return objC1;
                        }
                    } else if ((teamViewerEvent3 instanceof PolicyUnassignmentEvent) && (objD1 = ru1Var.d1((PolicyUnassignmentEvent) teamViewerEvent3, hc1Var)) == obj2) {
                        return objD1;
                    }
                }
                return obj3;
        }
    }
}
