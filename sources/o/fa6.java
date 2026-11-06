package o;

import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fa6 {
    public ha6 a;
    public DyngateID b;
    public int c;
    public final nw4 d;
    public final nw4 e;
    public final nw4 f;
    public String g;
    public final nw4 h;
    public final nw4 i;
    public boolean j;
    public boolean k;
    public o53 l;
    public fj7 m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f781o;
    public boolean p;
    public boolean q;
    public final ja6 r;

    public fa6(ha6 ha6Var) {
        this.a = ha6Var;
        DyngateID dyngateIDInvalidDyngateID = DyngateID.InvalidDyngateID();
        dyngateIDInvalidDyngateID.getClass();
        this.b = dyngateIDInvalidDyngateID;
        Boolean bool = Boolean.FALSE;
        this.d = new nw4(bool);
        this.e = new nw4(bool);
        this.f = new nw4(bool);
        this.h = new nw4(bool);
        this.i = new nw4(bool);
        o53 o53Var = o53.m;
        this.l = o53Var;
        this.m = fj7.UNKNOWN;
        this.f781o = true;
        ja6 ja6Var = new ja6();
        ja6Var.a = o53Var;
        ja6Var.b = o53Var;
        this.r = ja6Var;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0230  */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean] */
    public final void a(ak7 ak7Var) {
        int i;
        int i2;
        o53 o53Var;
        Object next;
        ye4.a("RemoteInfo", "received info");
        ha6 ha6Var = this.a;
        if (ha6Var == null) {
            ye4.c("RemoteInfo", "received info command for unknown session");
            return;
        }
        this.b = ak7Var.p();
        ci7 ci7VarQ = ak7Var.q(gj7.OperatingSystem);
        if (ci7VarQ.a <= 0) {
            ci7VarQ = null;
        }
        if (ci7VarQ != null) {
            this.c = ci7VarQ.b;
        }
        ak7Var.n(gj7.CanDragDropFiletransfer);
        ak7Var.n(gj7.CanUpdate);
        ig5 ig5VarN = ak7Var.n(gj7.CanDisableInput);
        if (ig5VarN.a <= 0) {
            ig5VarN = null;
        }
        if (ig5VarN != null) {
            this.d.postValue(Boolean.valueOf(ig5VarN.b));
        }
        ig5 ig5VarN2 = ak7Var.n(gj7.CanCtrlAltDel);
        if (ig5VarN2.a <= 0) {
            ig5VarN2 = null;
        }
        if (ig5VarN2 != null) {
            this.e.postValue(Boolean.valueOf(ig5VarN2.b));
        }
        ak7Var.n(gj7.CanRemoteSysinfo);
        ak7Var.n(gj7.CanDisableInput2);
        ci7 ci7VarQ2 = ak7Var.q(gj7.InputDisabled);
        if (ci7VarQ2.a <= 0) {
            ci7VarQ2 = null;
        }
        if (ci7VarQ2 != null) {
            int i3 = ci7VarQ2.b;
            ha6 ha6Var2 = this.a;
            if (ha6Var2 == null) {
                ye4.c("RemoteInfo", "InputResponse: remoteSettings is null");
            } else {
                t12.n.getClass();
                Iterator it = t12.s.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((t12) next).m != i3);
                t12 t12Var = (t12) next;
                if (t12Var == null) {
                    t12Var = t12.NotBlocked;
                }
                ha6Var2.h(t12Var);
            }
        }
        zh7 zh7VarS = ak7Var.s(gj7.Version);
        if (zh7VarS.m <= 0) {
            zh7VarS = null;
        }
        if (zh7VarS != null) {
            this.g = (String) zh7VarS.n;
        }
        ak7Var.n(gj7.HasVPN);
        ig5 ig5VarN3 = ak7Var.n(gj7.RemoteReboot);
        if (ig5VarN3.a <= 0) {
            ig5VarN3 = null;
        }
        if (ig5VarN3 != null) {
            this.h.postValue(Boolean.valueOf(ig5VarN3.b));
        }
        ig5 ig5VarN4 = ak7Var.n(gj7.CanLockWorkstation);
        if (ig5VarN4.a <= 0) {
            ig5VarN4 = null;
        }
        if (ig5VarN4 != null) {
            this.f.postValue(Boolean.valueOf(ig5VarN4.b));
        }
        ig5 ig5VarN5 = ak7Var.n(gj7.RemoteRebootSafemode);
        if (ig5VarN5.a <= 0) {
            ig5VarN5 = null;
        }
        if (ig5VarN5 != null) {
            this.i.postValue(Boolean.valueOf(ig5VarN5.b));
        }
        ak7Var.n(gj7.RemoteLogoff);
        ak7Var.n(gj7.CanTelephoneConference);
        ak7Var.n(gj7.CanAudio);
        ak7Var.n(gj7.CanVideo);
        ig5 ig5VarN6 = ak7Var.n(gj7.CanRemoveWallpaper);
        if (ig5VarN6.a <= 0) {
            ig5VarN6 = null;
        }
        this.j = ig5VarN6 != null ? ig5VarN6.b : this.j;
        ig5 ig5VarN7 = ak7Var.n(gj7.CanSingleWindow);
        if (ig5VarN7.a <= 0) {
            ig5VarN7 = null;
        }
        this.k = ig5VarN7 != null ? ig5VarN7.b : this.k;
        ci7 ci7VarQ3 = ak7Var.q(gj7.CanChangeScreenResolution);
        if (ci7VarQ3.a <= 0) {
            ci7VarQ3 = null;
        }
        o53 o53Var2 = o53.f1630o;
        o53 o53Var3 = o53.n;
        if (ci7VarQ3 != null) {
            this.l = ci7VarQ3.b == 0 ? o53Var3 : o53Var2;
        }
        zh7 zh7VarS2 = ak7Var.s(gj7.DevModes);
        if (zh7VarS2.m <= 0) {
            zh7VarS2 = null;
        }
        if (zh7VarS2 != null) {
        }
        ye4.a("RemoteInfo", "Client connection to " + this.b + ", server version is " + this.g + ", OS=" + this.c);
        ci7 ci7VarQ4 = ak7Var.q(gj7.UserLoggedIn);
        if (ci7VarQ4.a <= 0) {
            ci7VarQ4 = null;
        }
        rk5 rk5Var = fj7.n;
        ja6 ja6Var = this.r;
        if (ci7VarQ4 != null) {
            int i4 = ci7VarQ4.b;
            rk5Var.getClass();
            int iOrdinal = rk5.l(i4).ordinal();
            if (iOrdinal != 1) {
                o53Var = iOrdinal != 2 ? ja6Var.b : o53Var2;
            } else {
                o53Var = o53Var3;
            }
            ja6Var.b = o53Var;
        }
        ci7 ci7VarQ5 = ak7Var.q(gj7.ScreenLocked);
        if (ci7VarQ5.a <= 0) {
            ci7VarQ5 = null;
        }
        if (ci7VarQ5 != null) {
            int i5 = ci7VarQ5.b;
            rk5Var.getClass();
            fj7 fj7VarL = rk5.l(i5);
            int iOrdinal2 = fj7VarL.ordinal();
            if (iOrdinal2 == 1) {
                o53Var2 = o53Var3;
            } else if (iOrdinal2 != 2) {
                o53Var2 = ja6Var.a;
            }
            ja6Var.a = o53Var2;
            this.m = fj7VarL;
        }
        byte b = ak7Var.q(gj7.DisableCAD).a;
        ak7Var.n(gj7.DisableSessionRecord);
        ig5 ig5VarN8 = ak7Var.n(gj7.AutoLock);
        if (ig5VarN8.a <= 0) {
            ig5VarN8 = null;
        }
        if (ig5VarN8 != null) {
            this.n = true;
            ha6Var.u.postValue(Boolean.valueOf(ig5VarN8.b));
        }
        byte b2 = ak7Var.q(gj7.UsedUIControlEvents).a;
        String str = this.g;
        if (str == null) {
            i = 0;
        } else {
            int iY = ub7.Y(str, '.', 0, 6);
            if (str.length() <= 0 || iY == -1) {
                i = 0;
            } else {
                try {
                    i = Integer.parseInt(str.substring(0, iY));
                } catch (NumberFormatException unused) {
                    ye4.c("RemoteInfo", "Failed to parse major version from string '" + str + "'");
                    i = 0;
                }
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (i >= 8) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            this.f781o = false;
        }
        ig5 ig5VarN9 = ak7Var.n(gj7.HasNoMouse);
        if (ig5VarN9.a <= 0) {
            ig5VarN9 = null;
        }
        if (ig5VarN9 != null) {
            this.p = ig5VarN9.b;
        }
        if (ak7Var.q(gj7.DPIScale).a()) {
            this.q = true;
        }
        ye4.a.b("RemoteInfo", "partner supports server sided scaling: " + this.q);
        ci7 ci7VarQ6 = ak7Var.q(gj7.QualityMode);
        if (!ci7VarQ6.a()) {
            ci7VarQ6 = null;
        }
        if (ci7VarQ6 != null && (i2 = ci7VarQ6.b) != 0 && i2 != 1 && i2 != 2) {
            ye4.c("QualitySettings", "Index cannot be mapped to a mode.");
        }
        ae aeVar = ae.g;
        if (aeVar == null) {
            aeVar = new ae((byte) 7);
            ae.g = aeVar;
        }
        ci7 ci7VarQ7 = ak7Var.q(gj7.LicenseTypeFullRC);
        ci7 ci7Var = ci7VarQ7.a > 0 ? ci7VarQ7 : null;
        aeVar.b = ci7Var != null ? ci7Var.b : 0;
    }
}
