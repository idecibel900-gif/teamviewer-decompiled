package o;

import android.content.pm.ShortcutManager;
import android.view.textclassifier.TextClassifier;
import com.teamviewer.apidefinitions.rolloutconfigurations.models.AccountManagerWithPermissions;
import com.teamviewer.apidefinitions.rolloutconfigurations.models.PermissionSet;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PLManagerDevicesV2ViewModelSWIGJNI;
import com.teamviewer.swigcallbacklib.VoidSignalCallback;
import com.teamviewer.teamviewerlib.logging.PublishLogFilesZipWorker;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ac extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = obj;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new ac((yc4) obj2, hc1Var, (byte) 0);
            case 1:
                return new ac((k08) obj2, hc1Var, (byte) 1);
            case 2:
                return new ac((zd0) obj2, hc1Var, (byte) 2);
            case 3:
                return new ac((y31) obj2, hc1Var, (byte) 3);
            case 4:
                return new ac((ru1) obj2, hc1Var, (byte) 4);
            case 5:
                return new ac((hz1) obj2, hc1Var, (byte) 5);
            case 6:
                return new ac((y12) obj2, hc1Var, (byte) 6);
            case 7:
                return new ac((mi2) obj2, hc1Var, (byte) 7);
            case 8:
                return new ac((qb3) obj2, hc1Var, (byte) 8);
            case ep1.b /* 9 */:
                return new ac((om5) obj2, hc1Var, (byte) 9);
            case ep1.c /* 10 */:
                return new ac((kp5) obj2, hc1Var, (byte) 10);
            case 11:
                return new ac((PublishLogFilesZipWorker) obj2, hc1Var, (byte) 11);
            case ep1.d /* 12 */:
                return new ac((tx5) obj2, hc1Var, (byte) 12);
            case 13:
                return new ac((xr6) obj2, hc1Var, (byte) 13);
            case 14:
                return new ac((jf3) obj2, hc1Var, (byte) 14);
            default:
                return new ac((if8) obj2, hc1Var, (byte) 15);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 1:
                ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 2:
                ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 3:
                ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 4:
                ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 5:
                ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 6:
                return ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case 7:
                ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 8:
                ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case ep1.b /* 9 */:
                return ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case ep1.c /* 10 */:
                ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 11:
                return ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
            case ep1.d /* 12 */:
                ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 13:
                ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            case 14:
                ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
            default:
                ((ac) create(me1Var, hc1Var)).invokeSuspend(f88Var);
                return f88Var;
        }
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        String str;
        Object value;
        wt1 wt1Var;
        ShortcutManager shortcutManager;
        fg3 fg3Var;
        hc1 hc1Var = null;
        switch (this.m) {
            case 0:
                ct1.a0(obj);
                yc4 yc4Var = (yc4) this.n;
                DyngateID dyngateIDE = Settings.e();
                ye4.a("AddToGroup", "client already has an ID!");
                String str2 = "r" + dyngateIDE;
                ll2 ll2VarN = yc4Var.n(str2);
                if (ll2VarN.m && (((str = (String) ll2VarN.p) != null && ub7.Q(str, "Device already exists", false)) || ((y38) ll2VarN.q) == y38.InternalError)) {
                    yc4Var.q(str2);
                }
                return f88.a;
            case 1:
                ct1.a0(obj);
                ((k08) this.n).a();
                return f88.a;
            case 2:
                ct1.a0(obj);
                zd0 zd0Var = (zd0) this.n;
                PLManagerDevicesV2ViewModel pLManagerDevicesV2ViewModel = zd0Var.n;
                if (pLManagerDevicesV2ViewModel != null) {
                    VoidSignalCallback voidSignalCallback = zd0Var.s;
                    PLManagerDevicesV2ViewModelSWIGJNI.PLManagerDevicesV2ViewModel_NotifyManagedDevicesListReady(pLManagerDevicesV2ViewModel.a, pLManagerDevicesV2ViewModel, VoidSignalCallback.getCPtr(voidSignalCallback), voidSignalCallback);
                }
                return f88.a;
            case 3:
                ct1.a0(obj);
                y31 y31Var = (y31) this.n;
                im3.R(e8.n(y31Var), null, null, new v31(y31Var, hc1Var, (byte) 10), 3);
                return f88.a;
            case 4:
                ct1.a0(obj);
                ru1 ru1Var = (ru1) this.n;
                l97 l97Var = ru1Var.z;
                do {
                    value = l97Var.getValue();
                    wt1Var = (wt1) value;
                    shortcutManager = (ShortcutManager) ru1Var.f1953o.a.getSystemService(ShortcutManager.class);
                } while (!l97Var.j(value, wt1.a(wt1Var, false, null, null, false, false, shortcutManager != null && shortcutManager.isRequestPinShortcutSupported(), false, false, false, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16777151)));
                return f88.a;
            case 5:
                ct1.a0(obj);
                ll2 ll2Var = ((hz1) this.n).D;
                if (((List) ((iw7) ll2Var.p).g.m.getValue()).isEmpty()) {
                    ll2Var.n();
                }
                return f88.a;
            case 6:
                ct1.a0(obj);
                y12 y12Var = (y12) this.n;
                synchronized (y12Var.t) {
                    if (!y12Var.y || y12Var.z) {
                        return f88.a;
                    }
                    try {
                        y12Var.c0();
                        break;
                    } catch (IOException unused) {
                        y12Var.A = true;
                    }
                    try {
                        if (y12Var.v >= 2000) {
                            y12Var.l0();
                        }
                        break;
                    } catch (IOException unused2) {
                        y12Var.B = true;
                        y12Var.w = new u36(new s70());
                    }
                    return f88.a;
                }
            case 7:
                ct1.a0(obj);
                ((mi2) this.n).n.SetIsARSupported(false);
                return f88.a;
            case 8:
                ct1.a0(obj);
                ((xd0) ((qb3) this.n)).W0();
                return f88.a;
            case ep1.b /* 9 */:
                ct1.a0(obj);
                om5 om5Var = (om5) this.n;
                TextClassifier textClassifierD = dq.d(om5Var.b, om5Var.c);
                om5Var.f = textClassifierD;
                return textClassifierD;
            case ep1.c /* 10 */:
                ct1.a0(obj);
                kp5 kp5Var = (kp5) this.n;
                if (kp5Var.equals(hp5.q)) {
                    fg3Var = fg3.w;
                } else if (kp5Var.equals(ip5.q)) {
                    fg3Var = fg3.u;
                } else {
                    if (!kp5Var.equals(jp5.q)) {
                        gk0.s();
                        return null;
                    }
                    fg3Var = fg3.v;
                }
                ga7.a(fg3Var);
                return f88.a;
            case 11:
                ct1.a0(obj);
                yl7.m(((PublishLogFilesZipWorker) this.n).a, "files.zip");
                return new lc4();
            case ep1.d /* 12 */:
                ct1.a0(obj);
                tx5 tx5Var = (tx5) this.n;
                List list = tx5Var.D;
                int iGetAccountID = (int) BackendContainerAndroid.GetInstance().GetAccount().GetAccountID();
                List listK = qf0.K(Integer.valueOf(iGetAccountID));
                List listK2 = qf0.K(new AccountManagerWithPermissions(iGetAccountID, qf0.K(PermissionSet.EasyAccess)));
                gu0 gu0VarN = e8.n(tx5Var);
                tk1 tk1Var = g22.a;
                im3.R(gu0VarN, gk1.f901o, null, new tb(tx5Var, listK, list, listK2, null, (byte) 6), 2);
                tx5Var.p.setValue(Boolean.TRUE);
                return f88.a;
            case 13:
                ct1.a0(obj);
                xr6 xr6Var = (xr6) this.n;
                xr6Var.Z0();
                n87 n87Var = xr6Var.y;
                if (n87Var == null || !n87Var.e()) {
                    xr6Var.Y0(false);
                }
                return f88.a;
            case 14:
                ct1.a0(obj);
                ((cg3) ((jf3) this.n).f1160o.n).c = null;
                return f88.a;
            default:
                ct1.a0(obj);
                if8 if8Var = (if8) this.n;
                hf8 hf8Var = if8Var.p;
                if (hf8Var != null) {
                    x84 x84Var = hf8Var.p;
                    hf8Var.q.j(null);
                    yy2 yy2Var = hf8Var.f969o;
                    if (yy2Var != null && x84Var != null) {
                        x84Var.f(yy2Var);
                    }
                    if (x84Var != null) {
                        x84Var.f(hf8Var);
                    }
                }
                if8Var.p = null;
                return f88.a;
        }
    }
}
