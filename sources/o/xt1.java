package o;

import com.teamviewer.apidefinitions.manageddevices.models.DeviceFlags;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceListEntryType;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceModuleType;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceOnlineStatus;
import com.teamviewer.apidefinitions.manageddevices.models.DeviceType;
import com.teamviewer.apidefinitions.manageddevices.models.ManagedDeviceChangedEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xt1 implements Function1 {
    public final /* synthetic */ byte m = 1;
    public final /* synthetic */ ManagedDeviceChangedEvent n;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ms1 ms1VarU;
        byte b = this.m;
        ManagedDeviceChangedEvent managedDeviceChangedEvent = this.n;
        switch (b) {
            case 0:
                ns1 ns1Var = (ns1) obj;
                ns1Var.getClass();
                ms1 ms1VarU2 = managedDeviceChangedEvent.getFlags() != null ? et1.U(managedDeviceChangedEvent.getFlags()) : ns1Var.f;
                String displayName = managedDeviceChangedEvent.getDisplayName();
                Boolean hasPassword = managedDeviceChangedEvent.getHasPassword();
                if (hasPassword == null) {
                    hasPassword = ns1Var.i;
                }
                Boolean bool = hasPassword;
                DeviceModuleType moduleType = managedDeviceChangedEvent.getModuleType();
                if (moduleType == null) {
                    moduleType = ns1Var.j;
                }
                DeviceModuleType deviceModuleType = moduleType;
                String tvVersion = managedDeviceChangedEvent.getTvVersion();
                if (tvVersion == null) {
                    tvVersion = ns1Var.k;
                }
                String str = tvVersion;
                ls1 ls1Var = ns1Var.c;
                ls1 ls1Var2 = ls1.f1400o;
                ls1 ls1Var3 = ls1.n;
                ls1 ls1Var4 = (ls1Var != ls1Var3 || ms1VarU2 == null) ? (ls1Var == ls1Var2 && ms1VarU2 == null) ? ls1Var3 : ls1Var : ls1Var2;
                DeviceType deviceType = managedDeviceChangedEvent.getDeviceType();
                return ns1.a(ns1Var, 0L, displayName, ls1Var4, null, ms1VarU2, false, null, bool, deviceModuleType, str, null, null, null, null, null, null, null, null, deviceType != null ? et1.Q(deviceType) : ns1Var.u, null, 3143897);
            default:
                List<ns1> list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(mv0.Z(list, 10));
                for (ns1 ns1VarA : list) {
                    if (ns1VarA.a == managedDeviceChangedEvent.getTeamViewerId()) {
                        String displayName2 = managedDeviceChangedEvent.getDisplayName();
                        UUID managementId = managedDeviceChangedEvent.getManagementId();
                        DeviceOnlineStatus onlineStatus = managedDeviceChangedEvent.getOnlineStatus();
                        ls1 ls1VarS = onlineStatus != null ? et1.S(onlineStatus) : ns1VarA.c;
                        List<DeviceFlags> flags = managedDeviceChangedEvent.getFlags();
                        if (flags == null || (ms1VarU = et1.U(flags)) == null) {
                            ms1VarU = ns1VarA.f;
                        }
                        ms1 ms1Var = ms1VarU;
                        String description = managedDeviceChangedEvent.getDescription();
                        if (description == null) {
                            description = ns1VarA.h;
                        }
                        String str2 = description;
                        Boolean hasPassword2 = managedDeviceChangedEvent.getHasPassword();
                        if (hasPassword2 == null) {
                            hasPassword2 = ns1VarA.i;
                        }
                        Boolean bool2 = hasPassword2;
                        DeviceModuleType moduleType2 = managedDeviceChangedEvent.getModuleType();
                        if (moduleType2 == null) {
                            moduleType2 = ns1VarA.j;
                        }
                        DeviceModuleType deviceModuleType2 = moduleType2;
                        String tvVersion2 = managedDeviceChangedEvent.getTvVersion();
                        if (tvVersion2 == null) {
                            tvVersion2 = ns1VarA.k;
                        }
                        String str3 = tvVersion2;
                        DeviceListEntryType deviceListEntryType = managedDeviceChangedEvent.getDeviceListEntryType();
                        ks1 ks1Var = deviceListEntryType != null ? deviceListEntryType == DeviceListEntryType.Bookmarked ? ks1.m : ks1.n : ns1VarA.t;
                        DeviceType deviceType2 = managedDeviceChangedEvent.getDeviceType();
                        ns1VarA = ns1.a(ns1VarA, 0L, displayName2, ls1VarS, null, ms1Var, false, str2, bool2, deviceModuleType2, str3, null, null, null, null, null, null, null, ks1Var, deviceType2 != null ? et1.Q(deviceType2) : ns1VarA.u, managementId, 522329);
                    }
                    arrayList.add(ns1VarA);
                }
                return arrayList;
        }
    }
}
