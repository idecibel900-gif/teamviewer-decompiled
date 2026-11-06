package o;

import com.teamviewer.apidefinitions.account.models.Account;
import com.teamviewer.apidefinitions.custommodules.models.CustomButton;
import com.teamviewer.apidefinitions.custommodules.models.CustomModule;
import com.teamviewer.apidefinitions.custommodules.models.CustomModuleHost;
import com.teamviewer.apidefinitions.custommodules.models.CustomModuleStatus;
import com.teamviewer.apidefinitions.custommodules.models.CustomModuleType;
import com.teamviewer.apidefinitions.custommodules.models.DownloadUrlType;
import com.teamviewer.apidefinitions.custommodules.models.EditorVersion;
import com.teamviewer.apidefinitions.legacydevices.models.Device;
import com.teamviewer.apidefinitions.legacydevices.models.DeviceListResponse;
import com.teamviewer.apidefinitions.rolloutconfigurations.models.AccountManagerWithPermissions;
import com.teamviewer.apidefinitions.rolloutconfigurations.models.PermissionSet;
import com.teamviewer.apidefinitions.rolloutconfigurations.models.RolloutConfiguration;
import com.teamviewer.apidefinitions.rolloutconfigurations.models.RolloutConfigurationCreationType;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class vb extends oe8 {
    public static final List D = qf0.L(PermissionSet.EasyAccess, PermissionSet.DeviceAdministration, PermissionSet.PolicyAdministration, PermissionSet.ManagerAdministration, PermissionSet.DeviceDescription, PermissionSet.CustomFieldsAdministration);
    public static final CustomButton E = new CustomButton("#3488FF", "#2665BE", "#D4DCFC", "#232326");
    public Account A;
    public RolloutConfiguration B;
    public final nx3 C;
    public final nx3 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final jk0 f2294o;
    public final ol5 p;
    public final aw q;
    public final fe1 r;
    public final l97 s;
    public final t36 t;
    public final l97 u;
    public final t36 v;
    public final yx6 w;
    public final r36 x;
    public n87 y;
    public n87 z;

    public vb(int i) {
        nx3 nx3Var = new nx3((byte) 9);
        jk0 jk0Var = new jk0((byte) 27);
        q85 q85Var = q85.a;
        xl4 xl4Var = new xl4();
        ol5 ol5Var = new ol5((byte) 5);
        aw awVar = new aw((byte) 9);
        tk1 tk1Var = g22.a;
        gk1 gk1Var = gk1.f901o;
        gk1Var.getClass();
        this.n = nx3Var;
        this.f2294o = jk0Var;
        this.p = ol5Var;
        this.q = awVar;
        this.r = gk1Var;
        l97 l97VarK = im3.k(new ob(null, 4095));
        this.s = l97VarK;
        this.t = yo1.u(l97VarK);
        l97 l97VarK2 = im3.k(new ib());
        this.u = l97VarK2;
        this.v = yo1.u(l97VarK2);
        yx6 yx6VarL = au8.l(0, 7, null);
        this.w = yx6VarL;
        this.x = new r36(yx6VarL);
        this.C = new nx3((Object) xl4Var, (byte) 15);
    }

    public static List a1(ib ibVar) {
        List list = ibVar.e;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UUID uuidB = bt1.B((l33) it.next());
            if (uuidB != null) {
                arrayList.add(uuidB);
            }
        }
        return lv0.P0(lv0.S0(arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object V0(RolloutConfiguration rolloutConfiguration, jc1 jc1Var) {
        pb pbVar;
        Object objN;
        l97 l97Var;
        Object value;
        if (jc1Var instanceof pb) {
            pbVar = (pb) jc1Var;
            int i = pbVar.f1721o;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbVar.f1721o = i - Integer.MIN_VALUE;
            } else {
                pbVar = new pb(this, jc1Var);
            }
        } else {
            pbVar = new pb(this, jc1Var);
        }
        Object obj = pbVar.m;
        int i2 = pbVar.f1721o;
        f88 f88Var = f88.a;
        if (i2 == 0) {
            ct1.a0(obj);
            String deploymentString = rolloutConfiguration.getDeploymentString();
            if (deploymentString == null || ub7.b0(deploymentString)) {
                ye4.c("AddRemoteDeviceViewModel", "Failed to create custom module: missing deployment string");
                b1();
                return f88Var;
            }
            CustomModuleType customModuleType = CustomModuleType.CustomModuleHost;
            EditorVersion editorVersion = EditorVersion.TVOne;
            CustomModuleStatus customModuleStatus = CustomModuleStatus.Ok;
            DownloadUrlType downloadUrlType = DownloadUrlType.Normal;
            Boolean bool = Boolean.FALSE;
            CustomModuleHost customModuleHost = new CustomModuleHost(customModuleType, editorVersion, customModuleStatus, null, "Automatically created Host Module", null, null, null, null, null, null, null, null, null, null, null, null, downloadUrlType, null, null, null, bool, null, E, deploymentString, bool, null, null, null, null, null, null, null, bool, -60948504, 1, null);
            pbVar.f1721o = 1;
            objN = this.q.n(customModuleHost, pbVar);
            ne1 ne1Var = ne1.m;
            if (objN == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
            objN = ((tc6) obj).m;
        }
        Throwable thA = tc6.a(objN);
        if (thA != null) {
            ye4.c("AddRemoteDeviceViewModel", "Failed to create custom module: " + thA.getMessage());
            b1();
            return f88Var;
        }
        CustomModule customModule = (CustomModule) objN;
        String downloadModuleViaAliasUrl = customModule.getDownloadModuleViaAliasUrl();
        if (downloadModuleViaAliasUrl == null && (downloadModuleViaAliasUrl = customModule.getDownloadModuleViaConfigIdUrl()) == null) {
            downloadModuleViaAliasUrl = customModule.getDownloadConfigurationUrl();
        }
        String str = downloadModuleViaAliasUrl;
        if (str == null || ub7.b0(str)) {
            ye4.c("AddRemoteDeviceViewModel", "Failed to create custom module: assignment link is empty");
            b1();
            return f88Var;
        }
        ua5.v("Custom module created with id: ", customModule.getModuleId(), "AddRemoteDeviceViewModel");
        do {
            l97Var = this.u;
            value = l97Var.getValue();
        } while (!l97Var.j(value, ib.a((ib) value, false, false, null, str, null, null, false, 245)));
        return f88Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object W0(Account account, jc1 jc1Var) {
        qb qbVar;
        Object objE;
        if (jc1Var instanceof qb) {
            qbVar = (qb) jc1Var;
            int i = qbVar.f1817o;
            if ((i & Integer.MIN_VALUE) != 0) {
                qbVar.f1817o = i - Integer.MIN_VALUE;
            } else {
                qbVar = new qb(this, jc1Var);
            }
        } else {
            qbVar = new qb(this, jc1Var);
        }
        Object obj = qbVar.m;
        int i2 = qbVar.f1817o;
        if (i2 == 0) {
            ct1.a0(obj);
            List listK = qf0.K(Integer.valueOf(account.getAccountId()));
            List listK2 = qf0.K(new AccountManagerWithPermissions(account.getAccountId(), D));
            RolloutConfigurationCreationType rolloutConfigurationCreationType = RolloutConfigurationCreationType.SingleDeviceAssignment;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            RolloutConfiguration rolloutConfiguration = new RolloutConfiguration(listK, a1((ib) this.u.getValue()), ua5.m("defaultRolloutConfiguration_", simpleDateFormat.format(new Date())), null, null, null, null, null, null, null, null, listK2, null, null, null, rolloutConfigurationCreationType, 30712, null);
            qbVar.f1817o = 1;
            objE = this.p.e(rolloutConfiguration, qbVar);
            ne1 ne1Var = ne1.m;
            if (objE == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
            objE = ((tc6) obj).m;
        }
        Throwable thA = tc6.a(objE);
        if (thA != null) {
            ye4.c("AddRemoteDeviceViewModel", "Failed to create rollout configuration: " + thA.getMessage());
            b1();
        }
        if (objE instanceof sc6) {
            return null;
        }
        return objE;
    }

    public final void X0(d37 d37Var) {
        im3.R(e8.n(this), null, null, new h0((Object) this, (Object) d37Var, (hc1) null, (byte) 7), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y0(jc1 jc1Var) {
        rb rbVar;
        Object objH;
        if (jc1Var instanceof rb) {
            rbVar = (rb) jc1Var;
            int i = rbVar.f1909o;
            if ((i & Integer.MIN_VALUE) != 0) {
                rbVar.f1909o = i - Integer.MIN_VALUE;
            } else {
                rbVar = new rb(this, jc1Var);
            }
        } else {
            rbVar = new rb(this, jc1Var);
        }
        Object obj = rbVar.m;
        int i2 = rbVar.f1909o;
        if (i2 == 0) {
            ct1.a0(obj);
            rbVar.f1909o = 1;
            objH = this.f2294o.h(rbVar);
            ne1 ne1Var = ne1.m;
            if (objH == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ct1.a0(obj);
            objH = ((tc6) obj).m;
        }
        Throwable thA = tc6.a(objH);
        if (thA != null) {
            ye4.c("AddRemoteDeviceViewModel", "Could not retrieve account info: " + thA.getMessage());
            b1();
        }
        if (objH instanceof sc6) {
            return null;
        }
        return objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable Z0(List list, jc1 jc1Var) {
        sb sbVar;
        if (jc1Var instanceof sb) {
            sbVar = (sb) jc1Var;
            int i = sbVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbVar.p = i - Integer.MIN_VALUE;
            } else {
                sbVar = new sb(this, jc1Var);
            }
        } else {
            sbVar = new sb(this, jc1Var);
        }
        Object objU = sbVar.n;
        int i2 = sbVar.p;
        if (i2 == 0) {
            ct1.a0(objU);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UUID uuidB = bt1.B((l33) it.next());
                if (uuidB != null) {
                    arrayList.add(uuidB);
                }
            }
            sbVar.m = list;
            sbVar.p = 1;
            objU = this.C.u(arrayList, sbVar);
            ne1 ne1Var = ne1.m;
            if (objU == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = sbVar.m;
            ct1.a0(objU);
        }
        Set set = (Set) objU;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (lv0.h0(set, bt1.B((l33) obj))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final void b1() {
        d1(false);
        X0(a27.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c1(String str, jc1 jc1Var) {
        ub ubVar;
        Object objT;
        if (jc1Var instanceof ub) {
            ubVar = (ub) jc1Var;
            int i = ubVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ubVar.p = i - Integer.MIN_VALUE;
            } else {
                ubVar = new ub(this, jc1Var);
            }
        } else {
            ubVar = new ub(this, jc1Var);
        }
        Object obj = ubVar.n;
        int i2 = ubVar.p;
        boolean z = true;
        if (i2 == 0) {
            ct1.a0(obj);
            ubVar.m = str;
            ubVar.p = 1;
            objT = this.n.t(str, null, ubVar);
            ne1 ne1Var = ne1.m;
            if (objT == ne1Var) {
                return ne1Var;
            }
        } else {
            if (i2 != 1) {
                hk0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = ubVar.m;
            ct1.a0(obj);
            objT = ((tc6) obj).m;
        }
        Throwable thA = tc6.a(objT);
        if (thA != null) {
            ua5.v("Failed to check if TeamViewer ID already exists: ", thA.getMessage(), "AddRemoteDeviceViewModel");
            return Boolean.FALSE;
        }
        List<Device> items = ((DeviceListResponse) objT).getItems();
        if (items == null || !items.isEmpty()) {
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                if (im3.n(String.valueOf(((Device) it.next()).getTeamViewerId()), str)) {
                }
            }
            z = false;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void d1(boolean z) {
        while (true) {
            l97 l97Var = this.u;
            Object value = l97Var.getValue();
            boolean z2 = z;
            if (l97Var.j(value, ib.a((ib) value, false, z2, null, null, null, null, false, 253))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public final void e1(boolean z) {
        l97 l97Var;
        Object value;
        do {
            l97Var = this.s;
            value = l97Var.getValue();
        } while (!l97Var.j(value, ob.a((ob) value, null, null, null, null, null, false, false, false, false, false, z, 3071)));
    }

    public final void f1(List list) {
        n87 n87Var = this.z;
        hc1 hc1Var = null;
        if (n87Var != null) {
            n87Var.j(null);
        }
        this.z = im3.R(e8.n(this), this.r, null, new h0((Object) this, (Object) list, hc1Var, (byte) 8), 2);
    }

    public final void g1(l33 l33Var) {
        l97 l97Var;
        Object value;
        ob obVar;
        boolean z;
        do {
            l97Var = this.s;
            value = l97Var.getValue();
            obVar = (ob) value;
            k33 k33Var = l33Var.a;
            if (k33Var != null) {
                if (k33Var instanceof i33) {
                    z = l33Var.d;
                } else if ((k33Var instanceof h33) || (k33Var instanceof j33)) {
                    z = true;
                }
            }
            gk0.s();
            return;
        } while (!l97Var.j(value, ob.a(obVar, null, null, l33Var, null, null, false, false, false, z, false, false, 3835)));
    }

    public vb() {
        this(0);
    }
}
