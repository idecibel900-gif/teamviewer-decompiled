package o;

import android.content.SharedPreferences;
import com.teamviewer.remotecontrollib.manager.LockManager;
import com.teamviewer.remotecontrollib.swig.NSDDiscoveryWrapper;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListComputerID;
import com.teamviewer.remotecontrollib.swig.partnerlist.PListContactID;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ContactDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberId;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IManagedDeviceV2FactoryContainer;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.PartnerlistViewModelLocatorSWIGJNI;
import com.teamviewer.remotecontrolviewlib.preferences.TVChangeResolutionPreference;
import com.teamviewer.remotecontrolviewlib.preferences.TVRemoteCursorPreference;
import com.teamviewer.remotecontrolviewlib.preferences.TVRemoveWallpaperPreference;
import com.teamviewer.remotecontrolviewlib.preferences.TVSessionQualityPreference;
import com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.ConditionalAccessAuthenticationNotificationViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.DeviceAuthViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IDeviceAuthenticationConnectionViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDeviceRequestViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceViewModelFactorySWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.settings.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class c36 implements p26 {
    public final RemoteControlApplication a;
    public final SharedPreferences b;
    public final Settings c;
    public final EventHub d;
    public final yi5 e;
    public final xt6 f;
    public final ia3 g;
    public final ja3 h;
    public final s7 i;
    public final ep3 j;
    public final io.sentry.android.core.n1 k;
    public final LockManager l;
    public final z60 m;
    public final NSDDiscoveryWrapper n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nf f484o;
    public final j93 p;
    public final IManagedDeviceV2FactoryContainer q;
    public final kh7 r;
    public final kh7 s;

    public c36(RemoteControlApplication remoteControlApplication, SharedPreferences sharedPreferences, Settings settings, EventHub eventHub, yi5 yi5Var, xt6 xt6Var, l41 l41Var, l41 l41Var2, s7 s7Var, ep3 ep3Var, io.sentry.android.core.n1 n1Var, LockManager lockManager, z60 z60Var, qi7 qi7Var, NSDDiscoveryWrapper nSDDiscoveryWrapper, nf nfVar) {
        sharedPreferences.getClass();
        settings.getClass();
        eventHub.getClass();
        yi5Var.getClass();
        l41Var.getClass();
        l41Var2.getClass();
        s7Var.getClass();
        ep3Var.getClass();
        n1Var.getClass();
        lockManager.getClass();
        z60Var.getClass();
        qi7Var.getClass();
        nSDDiscoveryWrapper.getClass();
        nfVar.getClass();
        this.a = remoteControlApplication;
        this.b = sharedPreferences;
        this.c = settings;
        this.d = eventHub;
        this.e = yi5Var;
        this.f = xt6Var;
        this.g = l41Var;
        this.h = l41Var2;
        this.i = s7Var;
        this.j = ep3Var;
        this.k = n1Var;
        this.l = lockManager;
        this.m = z60Var;
        this.n = nSDDiscoveryWrapper;
        this.f484o = nfVar;
        this.p = new j93(remoteControlApplication);
        this.r = new kh7(new q26(this, (byte) 0));
        this.s = new kh7(new q26(this, (byte) 4));
        this.q = i();
    }

    public final kc0 a(ut2 ut2Var, long j) {
        ComputerDetailsViewModel computerDetailsViewModelH = ds1.h(new PListComputerID(j));
        if (computerDetailsViewModelH == null) {
            return null;
        }
        dl5 dl5Var = new dl5(new a26((Object) this, (Object) computerDetailsViewModelH, (byte) 5), (byte) 2);
        ve8 ve8VarO = ut2Var.getG0();
        bf1 bf1VarK = h57.k(ut2Var);
        pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
        String strValueOf = String.valueOf(j);
        strValueOf.getClass();
        return (kc0) pn5VarT.j(strValueOf, w86.a.b(kc0.class));
    }

    public final ke0 b(we8 we8Var, long j) {
        ContactDetailsViewModel contactDetailsViewModel;
        PListContactID pListContactID = new PListContactID(j);
        long jPartnerlistViewModelLocator_GetContactDetailsViewModel = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_GetContactDetailsViewModel(pListContactID.a, pListContactID);
        if (jPartnerlistViewModelLocator_GetContactDetailsViewModel == 0) {
            contactDetailsViewModel = null;
        } else {
            contactDetailsViewModel = new ContactDetailsViewModel();
            contactDetailsViewModel.b = true;
            contactDetailsViewModel.a = jPartnerlistViewModelLocator_GetContactDetailsViewModel;
        }
        if (contactDetailsViewModel == null) {
            return null;
        }
        dl5 dl5Var = new dl5(new a26((Object) contactDetailsViewModel, (Object) new nc0(this.h, this.f, this.a), (byte) 4), (byte) 2);
        ve8 ve8VarO = we8Var.getG0();
        bf1 bf1VarK = h57.k(we8Var);
        ve8VarO.getClass();
        bf1VarK.getClass();
        pn5 pn5Var = new pn5(ve8VarO, dl5Var, bf1VarK);
        String strValueOf = String.valueOf(j);
        strValueOf.getClass();
        return (ke0) pn5Var.j(strValueOf, w86.a.b(ke0.class));
    }

    public final bd3 c(TVChangeResolutionPreference tVChangeResolutionPreference) {
        du6 du6VarT;
        mo7 mo7Var = ((zt6) this.f).f;
        byte b = 2;
        if (mo7Var == null || (du6VarT = mo7Var.t()) == null || !du6VarT.p) {
            dl5 dl5Var = new dl5(new q26(this, (byte) 3), (byte) 2);
            ve8 ve8VarO = tVChangeResolutionPreference.getG0();
            bf1 bf1VarK = h57.k(tVChangeResolutionPreference);
            ve8VarO.getClass();
            bf1VarK.getClass();
            pn5 pn5Var = new pn5(ve8VarO, dl5Var, bf1VarK);
            wt3 wt3VarB = w86.a.b(ni7.class);
            String strC = wt3VarB.c();
            if (strC != null) {
                return (bd3) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
            }
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        dl5 dl5Var2 = new dl5(new r26(mo7Var, this, b), (byte) 2);
        ve8 ve8VarO2 = tVChangeResolutionPreference.getG0();
        bf1 bf1VarK2 = h57.k(tVChangeResolutionPreference);
        ve8VarO2.getClass();
        bf1VarK2.getClass();
        pn5 pn5Var2 = new pn5(ve8VarO2, dl5Var2, bf1VarK2);
        wt3 wt3VarB2 = w86.a.b(zz4.class);
        String strC2 = wt3VarB2.c();
        if (strC2 != null) {
            return (bd3) pn5Var2.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC2), wt3VarB2);
        }
        hk0.g("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public final v11 d(o11 o11Var) {
        ConditionalAccessAuthenticationNotificationViewModelNative conditionalAccessAuthenticationNotificationViewModelNative = null;
        if (o11Var == null) {
            long jConditionalAccessAuthenticationViewModelFactory_GetConditionalAccessAuthenticationNotificationViewModel = ConditionalAccessAuthViewModelFactorySWIGJNI.ConditionalAccessAuthenticationViewModelFactory_GetConditionalAccessAuthenticationNotificationViewModel();
            if (jConditionalAccessAuthenticationViewModelFactory_GetConditionalAccessAuthenticationNotificationViewModel != 0) {
                conditionalAccessAuthenticationNotificationViewModelNative = new ConditionalAccessAuthenticationNotificationViewModelNative();
                conditionalAccessAuthenticationNotificationViewModelNative.b = true;
                conditionalAccessAuthenticationNotificationViewModelNative.a = jConditionalAccessAuthenticationViewModelFactory_GetConditionalAccessAuthenticationNotificationViewModel;
            }
            conditionalAccessAuthenticationNotificationViewModelNative.getClass();
            return new v11(conditionalAccessAuthenticationNotificationViewModelNative);
        }
        dl5 dl5Var = new dl5(new x85((byte) 28), (byte) 2);
        ve8 ve8VarO = o11Var.getG0();
        bf1 bf1VarK = h57.k(o11Var);
        pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(v11.class);
        String strC = wt3VarB.c();
        if (strC != null) {
            return (v11) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        }
        hk0.g("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public final f41 e() {
        return (f41) this.s.getValue();
    }

    public final ur1 f() {
        IDeviceAuthenticationConnectionViewModel iDeviceAuthenticationConnectionViewModel;
        long jDeviceAuthenticationViewModelFactory_GetDeviceAuthenticationConnectionViewModel = DeviceAuthViewModelFactorySWIGJNI.DeviceAuthenticationViewModelFactory_GetDeviceAuthenticationConnectionViewModel();
        if (jDeviceAuthenticationViewModelFactory_GetDeviceAuthenticationConnectionViewModel == 0) {
            iDeviceAuthenticationConnectionViewModel = null;
        } else {
            IDeviceAuthenticationConnectionViewModel iDeviceAuthenticationConnectionViewModel2 = new IDeviceAuthenticationConnectionViewModel();
            iDeviceAuthenticationConnectionViewModel2.b = true;
            iDeviceAuthenticationConnectionViewModel2.a = jDeviceAuthenticationViewModelFactory_GetDeviceAuthenticationConnectionViewModel;
            iDeviceAuthenticationConnectionViewModel = iDeviceAuthenticationConnectionViewModel2;
        }
        iDeviceAuthenticationConnectionViewModel.getClass();
        return new ur1(this.b, iDeviceAuthenticationConnectionViewModel);
    }

    public final va3 g(ut2 ut2Var, t33 t33Var, long j) {
        s33 s33Var;
        g1 g1VarH;
        t33Var.getClass();
        int iOrdinal = t33Var.ordinal();
        if (iOrdinal == 0) {
            s33Var = s33.Contact;
        } else if (iOrdinal == 1) {
            s33Var = s33.Computer;
        } else {
            if (iOrdinal != 2) {
                gk0.s();
                return null;
            }
            s33Var = s33.ServiceCase;
        }
        GroupMemberId groupMemberId = new GroupMemberId(s33Var, j);
        au2 au2Var = vt1.c;
        if (au2Var != null && (g1VarH = au2Var.h(ut2Var, groupMemberId)) != null) {
            dl5 dl5Var = new dl5(new bk(t33Var, this, ut2Var, groupMemberId, g1VarH, (byte) 5), (byte) 2);
            ve8 ve8VarO = ut2Var.getG0();
            bf1 bf1VarK = h57.k(ut2Var);
            pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
            wt3 wt3VarB = w86.a.b(iv1.class);
            String strC = wt3VarB.c();
            if (strC != null) {
                return (va3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
            }
            hk0.g("Local and anonymous classes can not be ViewModels");
        }
        return null;
    }

    public final k72 h(we8 we8Var) {
        dl5 dl5Var = new dl5(new q26(this, (byte) 1), (byte) 2);
        ve8 ve8VarO = we8Var.getG0();
        bf1 bf1VarK = h57.k(we8Var);
        ve8VarO.getClass();
        bf1VarK.getClass();
        pn5 pn5Var = new pn5(ve8VarO, dl5Var, bf1VarK);
        wt3 wt3VarB = w86.a.b(k72.class);
        String strC = wt3VarB.c();
        if (strC != null) {
            return (k72) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        }
        hk0.g("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public final IManagedDeviceV2FactoryContainer i() {
        IManagedDeviceV2FactoryContainer iManagedDeviceV2FactoryContainer = this.q;
        if (iManagedDeviceV2FactoryContainer != null) {
            return iManagedDeviceV2FactoryContainer;
        }
        RemoteControlApplication remoteControlApplication = this.a;
        long jPartnerlistViewModelLocator_CreateManagedDeviceV2FactoryContainer = PartnerlistViewModelLocatorSWIGJNI.PartnerlistViewModelLocator_CreateManagedDeviceV2FactoryContainer(remoteControlApplication.getString(R.string.tv_managed_groups), remoteControlApplication.getString(R.string.tv_managed_device_title));
        if (jPartnerlistViewModelLocator_CreateManagedDeviceV2FactoryContainer == 0) {
            return null;
        }
        IManagedDeviceV2FactoryContainer iManagedDeviceV2FactoryContainer2 = new IManagedDeviceV2FactoryContainer();
        iManagedDeviceV2FactoryContainer2.b = true;
        iManagedDeviceV2FactoryContainer2.a = jPartnerlistViewModelLocator_CreateManagedDeviceV2FactoryContainer;
        return iManagedDeviceV2FactoryContainer2;
    }

    public final ed3 j(TVRemoteCursorPreference tVRemoteCursorPreference) {
        du6 du6VarT;
        mo7 mo7Var = ((zt6) this.f).f;
        if (mo7Var instanceof ec3) {
            dl5 dl5Var = new dl5(new r26(mo7Var, this, (byte) 5), (byte) 2);
            ve8 ve8VarO = tVRemoteCursorPreference.getG0();
            bf1 bf1VarK = h57.k(tVRemoteCursorPreference);
            ve8VarO.getClass();
            bf1VarK.getClass();
            pn5 pn5Var = new pn5(ve8VarO, dl5Var, bf1VarK);
            wt3 wt3VarB = w86.a.b(il7.class);
            String strC = wt3VarB.c();
            if (strC != null) {
                return (ed3) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
            }
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        if (mo7Var != null && (du6VarT = mo7Var.t()) != null && du6VarT.p) {
            dl5 dl5Var2 = new dl5(new r26(mo7Var, this, (byte) 8), (byte) 2);
            ve8 ve8VarO2 = tVRemoteCursorPreference.getG0();
            bf1 bf1VarK2 = h57.k(tVRemoteCursorPreference);
            ve8VarO2.getClass();
            bf1VarK2.getClass();
            pn5 pn5Var2 = new pn5(ve8VarO2, dl5Var2, bf1VarK2);
            wt3 wt3VarB2 = w86.a.b(a05.class);
            String strC2 = wt3VarB2.c();
            if (strC2 != null) {
                return (ed3) pn5Var2.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC2), wt3VarB2);
            }
            hk0.g("Local and anonymous classes can not be ViewModels");
        }
        return null;
    }

    public final fd3 k(TVRemoveWallpaperPreference tVRemoveWallpaperPreference) {
        du6 du6VarT;
        mo7 mo7Var = ((zt6) this.f).f;
        if (mo7Var == null || (du6VarT = mo7Var.t()) == null || !du6VarT.p) {
            dl5 dl5Var = new dl5(new q26(this, (byte) 13), (byte) 2);
            ve8 ve8VarO = tVRemoveWallpaperPreference.getG0();
            bf1 bf1VarK = h57.k(tVRemoveWallpaperPreference);
            ve8VarO.getClass();
            bf1VarK.getClass();
            pn5 pn5Var = new pn5(ve8VarO, dl5Var, bf1VarK);
            wt3 wt3VarB = w86.a.b(jl7.class);
            String strC = wt3VarB.c();
            if (strC != null) {
                return (fd3) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
            }
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        dl5 dl5Var2 = new dl5(new r26(mo7Var, this, (byte) 3), (byte) 2);
        ve8 ve8VarO2 = tVRemoveWallpaperPreference.getG0();
        bf1 bf1VarK2 = h57.k(tVRemoveWallpaperPreference);
        ve8VarO2.getClass();
        bf1VarK2.getClass();
        pn5 pn5Var2 = new pn5(ve8VarO2, dl5Var2, bf1VarK2);
        wt3 wt3VarB2 = w86.a.b(b05.class);
        String strC2 = wt3VarB2.c();
        if (strC2 != null) {
            return (fd3) pn5Var2.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC2), wt3VarB2);
        }
        hk0.g("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public final hd3 l(TVSessionQualityPreference tVSessionQualityPreference) {
        du6 du6VarT;
        mo7 mo7Var = ((zt6) this.f).f;
        if (mo7Var instanceof ec3) {
            dl5 dl5Var = new dl5(new r26(mo7Var, this, (byte) 0), (byte) 2);
            ve8 ve8VarO = tVSessionQualityPreference.getG0();
            bf1 bf1VarK = h57.k(tVSessionQualityPreference);
            ve8VarO.getClass();
            bf1VarK.getClass();
            pn5 pn5Var = new pn5(ve8VarO, dl5Var, bf1VarK);
            wt3 wt3VarB = w86.a.b(ml7.class);
            String strC = wt3VarB.c();
            if (strC != null) {
                return (hd3) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
            }
            hk0.g("Local and anonymous classes can not be ViewModels");
            return null;
        }
        if (mo7Var != null && (du6VarT = mo7Var.t()) != null) {
            byte b = 1;
            if (du6VarT.p) {
                dl5 dl5Var2 = new dl5(new r26(mo7Var, this, b), (byte) 2);
                ve8 ve8VarO2 = tVSessionQualityPreference.getG0();
                bf1 bf1VarK2 = h57.k(tVSessionQualityPreference);
                ve8VarO2.getClass();
                bf1VarK2.getClass();
                pn5 pn5Var2 = new pn5(ve8VarO2, dl5Var2, bf1VarK2);
                wt3 wt3VarB2 = w86.a.b(nz4.class);
                String strC2 = wt3VarB2.c();
                if (strC2 != null) {
                    return (hd3) pn5Var2.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC2), wt3VarB2);
                }
                hk0.g("Local and anonymous classes can not be ViewModels");
                return null;
            }
        }
        hk0.l("no proper session");
        return null;
    }

    public final t38 m() {
        ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative;
        long jTrustedDeviceViewModelFactory_GetTrustedDeviceRequestViewModel = TrustedDeviceViewModelFactorySWIGJNI.TrustedDeviceViewModelFactory_GetTrustedDeviceRequestViewModel();
        if (jTrustedDeviceViewModelFactory_GetTrustedDeviceRequestViewModel == 0) {
            iTrustedDeviceRequestViewModelNative = null;
        } else {
            ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative2 = new ITrustedDeviceRequestViewModelNative();
            iTrustedDeviceRequestViewModelNative2.b = true;
            iTrustedDeviceRequestViewModelNative2.a = jTrustedDeviceViewModelFactory_GetTrustedDeviceRequestViewModel;
            iTrustedDeviceRequestViewModelNative = iTrustedDeviceRequestViewModelNative2;
        }
        iTrustedDeviceRequestViewModelNative.getClass();
        return new t38(iTrustedDeviceRequestViewModelNative);
    }

    public final ep3 n(wc3 wc3Var) {
        return new ep3(new fp1(wc3Var, this.i, this.d), this.p);
    }
}
