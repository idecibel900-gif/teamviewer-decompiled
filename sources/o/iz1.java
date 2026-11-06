package o;

import com.teamviewer.apidefinitions.manageddevices.models.PermissionSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class iz1 {
    public static final long a;
    public static final long b;
    public static final List c;

    static {
        aw awVar = c72.n;
        g72 g72Var = g72.SECONDS;
        a = lq1.K(10, g72Var);
        b = lq1.K(4, g72Var);
        c = qf0.L(PermissionSet.ManagerAdministration, PermissionSet.GroupAdministration, PermissionSet.PolicyAdministration, PermissionSet.ManageServiceActivations, PermissionSet.InheritDeviceAdministration, PermissionSet.InheritManagerAdministration, PermissionSet.InheritPolicyAdministration, PermissionSet.InheritDeviceDescription, PermissionSet.InheritManageServiceActivations, PermissionSet.CustomFieldsAdministration);
    }
}
