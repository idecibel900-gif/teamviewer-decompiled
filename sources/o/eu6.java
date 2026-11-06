package o;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvclientstatistics.ISessionStatisticsSender;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class eu6 extends a2 implements g71, xp6, wc3 {
    public volatile boolean A;
    public boolean B;
    public boolean C;
    public final qi7 D;
    public qt0 E;
    public final mt6 F;
    public final mu G;
    public final EventHub v;
    public final Settings w;
    public final RemoteControlApplication x;
    public final d31 y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu6(ps6 ps6Var, xt6 xt6Var, qi7 qi7Var, EventHub eventHub, Settings settings, RemoteControlApplication remoteControlApplication, SharedPreferences sharedPreferences, io.sentry.android.core.n1 n1Var, j93 j93Var, d31 d31Var) {
        super(ps6Var, ConnectionMode.RemoteControl, xt6Var, sharedPreferences, settings, j93Var, eventHub);
        ps6Var.getClass();
        qi7Var.getClass();
        eventHub.getClass();
        settings.getClass();
        sharedPreferences.getClass();
        n1Var.getClass();
        this.v = eventHub;
        this.w = settings;
        this.x = remoteControlApplication;
        this.y = d31Var;
        this.D = qi7Var;
        this.F = new mt6(this);
        this.G = new mu(this, (byte) 11);
        qt0 qt0Var = new qt0(this, eventHub, remoteControlApplication, sharedPreferences, settings, qi7Var, n1Var);
        qt0Var.c = this;
        qt0Var.b(kg6.n);
        qt0Var.b(kg6.f1263o);
        this.E = qt0Var;
    }

    @Override // o.g71
    public final void a(ha7 ha7Var) {
        if (ha7Var != ha7.f963o) {
            this.m.a();
            RemoteControlApplication remoteControlApplication = this.x;
            remoteControlApplication.getClass();
            new r55(remoteControlApplication).a(1, null);
        }
    }

    @Override // o.mo7
    public final void b() {
        du6 du6Var = this.u;
        du6Var.getClass();
        bk7 bk7Var = bk7.TVCmdInfo;
        pg5 pg5Var = this.r;
        ParticipantIdentifier participantIdentifierA = pg5Var.a();
        ak7 ak7Var = new ak7(bk7Var);
        ak7Var.z(KnownStreams.PrivateStream);
        ak7Var.B(participantIdentifierA);
        Settings settings = this.w;
        settings.getClass();
        ak7Var.c(Settings.e());
        d31 d31Var = this.y;
        String strD = d31Var.d();
        gj7 gj7Var = gj7.DeviceDisplayName;
        ak7Var.f(gj7Var, strD);
        String strC = d31.c();
        gj7 gj7Var2 = gj7.AccountDisplayName;
        ak7Var.f(gj7Var2, strC);
        ak7Var.f(gj7Var, d31Var.d());
        ak7Var.f(gj7Var2, d31.c());
        ak7Var.f(gj7.Version, settings.a);
        ak7Var.d(gj7.OperatingSystem, settings.b);
        ak7Var.b(gj7.SendStatistics, du6Var.s ? (byte) 1 : (byte) 0);
        ak7Var.b(gj7.HasAccessControl, (byte) 1);
        ak7Var.b(gj7.HasAccessControl2, (byte) 1);
        ak7Var.b(gj7.HasVPN, (byte) 0);
        ak7Var.b(gj7.CanTelephoneConference, (byte) 0);
        ak7Var.b(gj7.CanAudio, (byte) 0);
        ak7Var.b(gj7.CanVideo, (byte) 0);
        ak7Var.b(gj7.CanFileShare, (byte) 0);
        ak7Var.b(gj7.CanUpdate, (byte) 0);
        ak7Var.b(gj7.CanDragDropFiletransfer, (byte) 0);
        ak7Var.b(gj7.CanRemoteSysinfo, (byte) 0);
        ak7Var.b(gj7.CanAccessMultiMonitors, (byte) 0);
        ak7Var.b(gj7.CanClientChatInRC, (byte) 0);
        ha6 ha6Var = this.f283o;
        ry5 ry5Var = ha6Var.j;
        ak7Var.d(gj7.QualityMode, ry5Var.a.m);
        ak7Var.d(gj7.BPP, ry5Var.b);
        ak7Var.d(gj7.Quality, ry5Var.c);
        ak7Var.b(gj7.UseHooks, (byte) 1);
        ak7Var.b(gj7.RemoveWallpaper, ry5Var.d ? (byte) 1 : (byte) 0);
        ak7Var.b(gj7.ServerCursor, ha6Var.p ? (byte) 1 : (byte) 0);
        int i = du6Var.r;
        if (i != 0) {
            ak7Var.d(gj7.LicenseTypeFullRC, i);
        }
        ParticipantIdentifier participantIdentifierB = pg5Var.b();
        byte[] bArrSerialize = ParticipantIdentifier.Serialize(participantIdentifierB);
        bArrSerialize.getClass();
        ak7Var.a(gj7.ParticipantIdentifier, bArrSerialize);
        ye4.a("SessionRemoteControl", "*** own ParticipantIdentifier: " + participantIdentifierB + " ***");
        qt0 qt0Var = this.E;
        if (qt0Var != null) {
            pq6 pq6Var = qt0Var.g.f283o.c;
            ak7Var.d(gj7.DPIScale, 100);
        }
        f(ak7Var, false);
    }

    @Override // o.mo7
    public final boolean d() {
        return false;
    }

    @Override // o.a2, o.g71
    public final synchronized void destroy() {
        try {
            this.A = true;
            ye4.a("SessionRemoteControl", "destroy called");
            super.destroy();
            qi7 qi7Var = this.D;
            qi7Var.b.removePrimaryClipChangedListener(qi7Var.f);
            qi7Var.c = null;
            this.m.c(this, ys6.m);
            qt0 qt0Var = this.E;
            if (qt0Var != null) {
                qt0Var.b(kg6.q);
            }
            qt0 qt0Var2 = this.E;
            if (qt0Var2 != null) {
                qt0Var2.r = null;
            }
            if (qt0Var2 != null) {
                qt0Var2.s = null;
            }
            this.E = null;
            this.v.f(this.G);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.g71
    public final synchronized void e(ak7 ak7Var) {
        try {
            if (!this.C) {
                this.C = true;
                this.m.d(this);
            }
            if (this.A) {
                ye4.c("SessionRemoteControl", "processCommand: destroy was called");
                return;
            }
            int iOrdinal = ak7Var.C().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 5) {
                    if (iOrdinal != 7) {
                        if (iOrdinal != 51) {
                            if (iOrdinal != 55) {
                                if (iOrdinal != 68 && iOrdinal != 61 && iOrdinal != 62) {
                                    switch (iOrdinal) {
                                        case 21:
                                            dj7 dj7Var = dj7.PacketNr;
                                            ci7 ci7VarQ = ak7Var.q(dj7Var);
                                            if (ci7VarQ.a > 0) {
                                                bk7 bk7Var = bk7.TVCmdEcho;
                                                KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                                                knownStreams.getClass();
                                                ak7 ak7Var2 = new ak7(bk7Var);
                                                ak7Var2.z(knownStreams);
                                                ak7Var2.d(dj7Var, ci7VarQ.b);
                                                f(ak7Var2, false);
                                            }
                                            break;
                                        case 22:
                                            k(ak7Var);
                                            break;
                                        case 23:
                                            j(ak7Var);
                                            break;
                                        default:
                                            qt0 qt0Var = this.E;
                                            if (qt0Var == null || !qt0Var.a(ak7Var)) {
                                                ye4.a.g("SessionRemoteControl", "unexpected TVCommand " + ak7Var);
                                            }
                                            break;
                                    }
                                }
                            } else {
                                this.p.r.a(ak7Var);
                            }
                        } else {
                            ye4.a("SessionRemoteControl", "received TVCmd_Permission");
                        }
                    } else {
                        this.p.a(ak7Var);
                        b();
                    }
                } else {
                    ci7 ci7VarQ2 = ak7Var.q(si7.IncomingDenied);
                    if (ci7VarQ2.a > 0) {
                        int i = ci7VarQ2.b;
                        aw awVar = cf4.n;
                        if (i == 4) {
                            this.m.f(ze4.AuthDenied);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final oh3 g() {
        qt0 qt0Var = this.E;
        if (qt0Var == null) {
            return null;
        }
        oh3 oh3Var = qt0Var.p;
        if (qt0Var.f.contains(cx5.MS_CAN_CONTROL)) {
            return oh3Var;
        }
        return null;
    }

    public final wk7 i() {
        qt0 qt0Var = this.E;
        if (qt0Var != null) {
            return qt0Var.f1863o;
        }
        return null;
    }

    public final void j(ak7 ak7Var) {
        df6 df6Var = this.q;
        df6Var.i(ak7Var);
        iu iuVar = (iu) df6Var.n;
        l();
        boolean z = this.z;
        vi8 vi8Var = vi8.AllowPartnerViewDesktop;
        if (!z && iuVar.v(vi8Var) == i3.AfterConfirmation) {
            Context context = d82.M;
            if (context != null) {
                d82.t(context, R.string.tv_filetransfer_access_confirm);
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            }
            bk7 bk7Var = bk7.TVCmdAskConfirmation;
            ParticipantIdentifier participantIdentifierA = this.r.a();
            ak7 ak7Var2 = new ak7(bk7Var);
            ak7Var2.z(KnownStreams.PrivateStream);
            ak7Var2.B(participantIdentifierA);
            ak7Var2.d(ri7.WhatAccess, 6);
            if (f(ak7Var2, false)) {
                this.z = true;
            }
        }
        if (iuVar.v(vi8.RemoteControlAccess) == i3.Denied && iuVar.v(vi8Var) == i3.Allowed) {
            Context context2 = d82.M;
            if (context2 != null) {
                d82.t(context2, R.string.tv_remoteControlPermanentlyDenied);
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public final void k(ak7 ak7Var) {
        hc1 hc1Var;
        Object next;
        int i = ak7Var.q(ri7.WhatAccess).b;
        vi8.n.getClass();
        Iterator it = vi8.z.iterator();
        do {
            hc1Var = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((vi8) next).m != i);
        vi8 vi8Var = (vi8) next;
        if (vi8Var == null) {
            vi8Var = vi8.Undefined;
        }
        ig5 ig5VarN = ak7Var.n(ri7.Answer);
        if (ig5VarN.a > 0) {
            boolean z = ig5VarN.b;
            ye4.a("SessionRemoteControl", "received TVCmdAskConfirmation " + vi8Var + " allowed=" + z);
            int iOrdinal = vi8Var.ordinal();
            vi8 vi8Var2 = vi8.RemoteControlAccess;
            int i2 = R.string.tv_remoteControlWasDenied;
            ye4 ye4Var = ye4.a;
            df6 df6Var = this.q;
            if (iOrdinal != 2) {
                vi8 vi8Var3 = vi8.ControlRemoteTV;
                byte b = 1;
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal == 7) {
                            if (z) {
                                ((iu) df6Var.n).N(vi8.AllowPartnerViewDesktop);
                                l();
                                if (((iu) df6Var.n).v(vi8Var2) == i3.Denied) {
                                    Context context = d82.M;
                                    if (context != null) {
                                        d82.t(context, R.string.tv_remoteControlPermanentlyDenied);
                                    } else {
                                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                    }
                                }
                            } else {
                                hm3.B(new ji7(R.string.tv_teamviewer, i2, hc1Var, b));
                                this.m.f(ze4.AuthDenied);
                                ye4Var.g("SessionRemoteControl", "view desktop denied by partner!");
                                a(ha7.n);
                            }
                        }
                    } else if (z) {
                        ((iu) df6Var.n).N(vi8Var3);
                        Context context2 = d82.M;
                        if (context2 != null) {
                            d82.t(context2, R.string.tv_remoteControlTVAllowed);
                        } else {
                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                        }
                        l();
                    } else {
                        Context context3 = d82.M;
                        if (context3 != null) {
                            d82.t(context3, R.string.tv_remoteControlTVDenied);
                        } else {
                            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                        }
                        ye4Var.g("SessionRemoteControl", "TeamViewer control denied by partner!");
                    }
                } else if (z) {
                    ((iu) df6Var.n).N(vi8Var3);
                    l();
                    this.f283o.e(t12.InputBlocked);
                    Context context4 = d82.M;
                    if (context4 != null) {
                        d82.t(context4, R.string.tv_remoteControlDisableRemoteInputAllowed);
                    } else {
                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    }
                    this.B = true;
                } else {
                    Context context5 = d82.M;
                    if (context5 != null) {
                        d82.t(context5, R.string.tv_remoteControlDisableRemoteInputDenied);
                    } else {
                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    }
                    ye4.a("SessionRemoteControl", "Disable remote input denied by partner");
                }
            } else if (z) {
                ((iu) df6Var.n).N(vi8Var2);
                l();
                Context context6 = d82.M;
                if (context6 != null) {
                    d82.t(context6, R.string.tv_remoteControlWasAllowed);
                } else {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                }
            } else {
                Context context7 = d82.M;
                if (context7 != null) {
                    d82.t(context7, R.string.tv_remoteControlWasDenied);
                } else {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                }
                ye4Var.g("SessionRemoteControl", "remote control access denied by partner!");
            }
            this.z = false;
        }
    }

    public final void l() {
        f(this.q.s(this.r.a()), false);
    }

    public final boolean m(t12 t12Var) {
        if (!this.z && !this.B) {
            df6 df6Var = this.q;
            df6Var.getClass();
            if (((iu) df6Var.n).v(vi8.DisableRemoteInput) == i3.AfterConfirmation) {
                bk7 bk7Var = bk7.TVCmdAskConfirmation;
                ParticipantIdentifier participantIdentifierA = this.r.a();
                ak7 ak7Var = new ak7(bk7Var);
                ak7Var.z(KnownStreams.PrivateStream);
                ak7Var.B(participantIdentifierA);
                ak7Var.d(ri7.WhatAccess, 2);
                if (f(ak7Var, false)) {
                    this.z = true;
                }
                ye4.a("SessionRemoteControl", "Cancelling BlockRemoteInput action. User has to be asked first!");
                return false;
            }
        }
        ha6 ha6Var = this.f283o;
        if (!ha6Var.e(t12Var)) {
            ye4.a("SessionRemoteControl", "Command could not be sent");
            return false;
        }
        t12 t12VarC = ha6Var.c();
        boolean z = t12Var == t12.InputBlocked && t12VarC == t12.NotBlocked;
        t12 t12Var2 = t12.BlackScreen;
        boolean z2 = t12Var == t12Var2 || t12VarC == t12Var2;
        ps6 ps6Var = this.m;
        ps6Var.g.a(ISessionStatisticsSender.SessionStatisticsInfoType.DisableInputUsed, z);
        ps6Var.g.a(ISessionStatisticsSender.SessionStatisticsInfoType.BlackScreenUsed, z2);
        return true;
    }

    @Override // o.a2, o.mo7
    public final void start() {
        super.start();
        qt0 qt0Var = this.E;
        if (qt0Var != null) {
            qt0Var.b(kg6.p);
        }
        qi7 qi7Var = this.D;
        qi7Var.a();
        pi7 pi7Var = qi7Var.f;
        ClipboardManager clipboardManager = qi7Var.b;
        mt6 mt6Var = this.F;
        if (mt6Var != null) {
            qi7Var.c = mt6Var;
            clipboardManager.addPrimaryClipChangedListener(pi7Var);
        } else {
            clipboardManager.removePrimaryClipChangedListener(pi7Var);
            qi7Var.c = null;
        }
        this.v.c(EventType.EVENT_STREAM_IN_SUBSCRIBED, this.G);
    }
}
