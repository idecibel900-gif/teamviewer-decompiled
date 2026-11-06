package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvdyngateid.DyngateID;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ConnectionMode;
import com.teamviewer.teamviewerlib.swig.tvsessionprotocol.ParticipantIdentifier;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import com.teamviewer.teamviewerlib.swig.tvstream.KnownStreams;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public final class et6 extends a2 implements g71 {
    public ct6 A;
    public ct6 B;
    public z08 C;
    public ah2 D;
    public int E;
    public String F;
    public HashMap G;
    public nk7 H;
    public String I;
    public int J;
    public long K;
    public FileInputStream L;
    public boolean M;
    public byte N;
    public int O;
    public int P;
    public String Q;
    public gk7 R;
    public final io.sentry.android.core.d S;
    public final Resources T;
    public final zs6 U;
    public final zs6 V;
    public final zs6 W;
    public final EventHub v;
    public final d31 w;
    public final ReentrantLock x;
    public final Condition y;
    public io.sentry.i5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v6, types: [o.zs6] */
    /* JADX WARN: Type inference failed for: r9v7, types: [o.zs6] */
    /* JADX WARN: Type inference failed for: r9v8, types: [o.zs6] */
    public et6(ps6 ps6Var, xt6 xt6Var, EventHub eventHub, SharedPreferences sharedPreferences, Settings settings, j93 j93Var, d31 d31Var, RemoteControlApplication remoteControlApplication) {
        super(ps6Var, ConnectionMode.Filetransfer, xt6Var, sharedPreferences, settings, j93Var, eventHub);
        ps6Var.getClass();
        eventHub.getClass();
        sharedPreferences.getClass();
        settings.getClass();
        this.v = eventHub;
        this.w = d31Var;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.x = reentrantLock;
        this.y = reentrantLock.newCondition();
        this.G = new LinkedHashMap();
        this.Q = "";
        io.sentry.android.core.d dVar = io.sentry.android.core.d.t;
        if (dVar == null) {
            dVar = new io.sentry.android.core.d();
            dVar.m = "";
            dVar.n = "";
            dVar.f100o = "";
            dVar.p = "";
            dVar.q = "";
            dVar.r = "";
            ea6 ea6Var = ea6.m;
            dVar.i(ea6Var);
            dVar.s = ea6Var;
            io.sentry.android.core.d.t = dVar;
        }
        this.S = dVar;
        Resources resources = remoteControlApplication.getResources();
        resources.getClass();
        this.T = resources;
        final byte b = 0;
        this.U = new hk7(this) { // from class: o.zs6
            public final /* synthetic */ et6 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b2 = b;
                et6 et6Var = this.b;
                switch (b2) {
                    case 0:
                        et6Var.N = (byte) 1;
                        ReentrantLock reentrantLock2 = et6Var.x;
                        reentrantLock2.lock();
                        try {
                            et6Var.y.signal();
                            reentrantLock2.unlock();
                            gk7Var.A0();
                            return;
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    case 1:
                        et6Var.N = (byte) 2;
                        ReentrantLock reentrantLock3 = et6Var.x;
                        reentrantLock3.lock();
                        try {
                            et6Var.y.signal();
                            reentrantLock3.unlock();
                            gk7Var.A0();
                            return;
                        } catch (Throwable th2) {
                            reentrantLock3.unlock();
                            throw th2;
                        }
                    default:
                        et6Var.N = (byte) 0;
                        ReentrantLock reentrantLock4 = et6Var.x;
                        reentrantLock4.lock();
                        try {
                            et6Var.y.signal();
                            reentrantLock4.unlock();
                            gk7Var.A0();
                            return;
                        } catch (Throwable th3) {
                            reentrantLock4.unlock();
                            throw th3;
                        }
                }
            }
        };
        final byte b2 = 1;
        this.V = new hk7(this) { // from class: o.zs6
            public final /* synthetic */ et6 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b3 = b2;
                et6 et6Var = this.b;
                switch (b3) {
                    case 0:
                        et6Var.N = (byte) 1;
                        ReentrantLock reentrantLock2 = et6Var.x;
                        reentrantLock2.lock();
                        try {
                            et6Var.y.signal();
                            reentrantLock2.unlock();
                            gk7Var.A0();
                            return;
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    case 1:
                        et6Var.N = (byte) 2;
                        ReentrantLock reentrantLock3 = et6Var.x;
                        reentrantLock3.lock();
                        try {
                            et6Var.y.signal();
                            reentrantLock3.unlock();
                            gk7Var.A0();
                            return;
                        } catch (Throwable th2) {
                            reentrantLock3.unlock();
                            throw th2;
                        }
                    default:
                        et6Var.N = (byte) 0;
                        ReentrantLock reentrantLock4 = et6Var.x;
                        reentrantLock4.lock();
                        try {
                            et6Var.y.signal();
                            reentrantLock4.unlock();
                            gk7Var.A0();
                            return;
                        } catch (Throwable th3) {
                            reentrantLock4.unlock();
                            throw th3;
                        }
                }
            }
        };
        final byte b3 = 2;
        this.W = new hk7(this) { // from class: o.zs6
            public final /* synthetic */ et6 b;

            {
                this.b = this;
            }

            @Override // o.hk7
            public final void a(gk7 gk7Var) {
                byte b4 = b3;
                et6 et6Var = this.b;
                switch (b4) {
                    case 0:
                        et6Var.N = (byte) 1;
                        ReentrantLock reentrantLock2 = et6Var.x;
                        reentrantLock2.lock();
                        try {
                            et6Var.y.signal();
                            reentrantLock2.unlock();
                            gk7Var.A0();
                            return;
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    case 1:
                        et6Var.N = (byte) 2;
                        ReentrantLock reentrantLock3 = et6Var.x;
                        reentrantLock3.lock();
                        try {
                            et6Var.y.signal();
                            reentrantLock3.unlock();
                            gk7Var.A0();
                            return;
                        } catch (Throwable th2) {
                            reentrantLock3.unlock();
                            throw th2;
                        }
                    default:
                        et6Var.N = (byte) 0;
                        ReentrantLock reentrantLock4 = et6Var.x;
                        reentrantLock4.lock();
                        try {
                            et6Var.y.signal();
                            reentrantLock4.unlock();
                            gk7Var.A0();
                            return;
                        } catch (Throwable th3) {
                            reentrantLock4.unlock();
                            throw th3;
                        }
                }
            }
        };
    }

    public final void A() {
        ug2 ug2Var = ug2.Abort;
        ug2Var.getClass();
        ak7 ak7Var = new ak7(g10.TVCommand, ug2Var.m);
        ak7Var.d(vg2.SessionId, 1001);
        ak7Var.z(KnownStreams.DefaultStream_File);
        ak7Var.b(vg2.SkipAllFiles, (byte) 1);
        f(ak7Var, false);
        this.G.clear();
        u();
    }

    public final void B() {
        ug2 ug2Var = ug2.Abort;
        ug2Var.getClass();
        ak7 ak7Var = new ak7(g10.TVCommand, ug2Var.m);
        ak7Var.d(vg2.SessionId, 1001);
        ak7Var.z(KnownStreams.DefaultStream_File);
        ak7Var.b(vg2.SkipAllFiles, (byte) 0);
        f(ak7Var, false);
        z08 z08Var = this.C;
        if (z08Var != null) {
            z08Var.d = z08Var.f + z08Var.h;
        }
        List list = (List) this.G.get(this.I);
        if (list != null) {
            list.remove(0);
        }
        x();
    }

    @Override // o.g71
    public final void a(ha7 ha7Var) {
        ye4.a("SessionFiletransfer", "Connection was closed.");
        EventHub.e(this.v, EventType.EVENT_FILETRANSFER_SESSION_CLOSED_BY_PARTNER);
        this.m.a();
    }

    @Override // o.mo7
    public final void b() {
        Settings settingsN = Settings.i.n();
        bk7 bk7Var = bk7.TVCmdInfo;
        KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
        ak7 ak7VarN = fx3.n(knownStreams, bk7Var, knownStreams);
        ak7VarN.c(Settings.e());
        ak7VarN.f(gj7.DeviceDisplayName, this.w.d());
        ak7VarN.f(gj7.AccountDisplayName, d31.c());
        ak7VarN.f(gj7.Version, settingsN.a);
        ak7VarN.d(gj7.OperatingSystem, settingsN.b);
        ak7VarN.b(gj7.SendStatistics, this.u.s ? (byte) 1 : (byte) 0);
        ParticipantIdentifier participantIdentifierB = this.r.b();
        byte[] bArrSerialize = ParticipantIdentifier.Serialize(participantIdentifierB);
        bArrSerialize.getClass();
        ak7VarN.a(gj7.ParticipantIdentifier, bArrSerialize);
        ye4.a("SessionFiletransfer", "*** own ParticipantIdentifier: " + participantIdentifierB);
        f(ak7VarN, false);
    }

    @Override // o.mo7
    public final boolean d() {
        return true;
    }

    @Override // o.a2, o.g71
    public final void destroy() {
        super.destroy();
        this.m.c(this, ys6.n);
    }

    @Override // o.g71
    public final synchronized void e(ak7 ak7Var) {
        try {
            bk7 bk7VarC = ak7Var.C();
            if (bk7VarC == bk7.TVCmdInfo) {
                g(ak7Var);
            } else {
                bk7 bk7Var = bk7.TVCmdEcho;
                if (bk7VarC == bk7Var) {
                    dj7 dj7Var = dj7.PacketNr;
                    ci7 ci7VarQ = ak7Var.q(dj7Var);
                    if (ci7VarQ.a()) {
                        KnownStreams knownStreams = KnownStreams.DefaultStream_Misc;
                        knownStreams.getClass();
                        ak7 ak7Var2 = new ak7(bk7Var);
                        ak7Var2.z(knownStreams);
                        ak7Var2.d(dj7Var, ci7VarQ.b);
                        f(ak7Var2, false);
                    }
                } else if (bk7VarC == bk7.TVCmdPermission) {
                    ye4.a("SessionFiletransfer", "received TVCmd_Permission");
                } else if (bk7VarC == bk7.TVCmdSendAccessControl) {
                    l(ak7Var);
                } else if (bk7VarC == bk7.TVCmdWindowsSessionInfo) {
                    m();
                } else if (!j(ak7Var) && !k(ak7Var)) {
                    ir irVar = ug2.n;
                    byte bV = ak7Var.v();
                    irVar.getClass();
                    int iOrdinal = ((ug2) ug2.f2212o.C(bV)).ordinal();
                    if (iOrdinal == 2) {
                        s(ak7Var);
                    } else if (iOrdinal != 3) {
                        switch (iOrdinal) {
                            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                                o(ak7Var);
                                break;
                            case 17:
                                Context context = d82.M;
                                if (context == null) {
                                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                                } else {
                                    String string = context.getString(R.string.tv_filetransfer_session_abort);
                                    string.getClass();
                                    bu7.MAIN.a(new jy0((byte) 2, 1, string, context));
                                }
                                break;
                            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                                s(ak7Var);
                                break;
                            default:
                                ye4.a.b("SessionFiletransfer", "unexpected TVCommand" + bk7VarC);
                                break;
                        }
                    } else {
                        q(ak7Var);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void g(ak7 ak7Var) {
        List listK;
        String str;
        String str2 = (String) ak7Var.s(gj7.Version).n;
        if (str2 != null && str2.length() != 0) {
            Pattern patternCompile = Pattern.compile("\\.");
            patternCompile.getClass();
            int i = 0;
            ub7.k0(0);
            Matcher matcher = patternCompile.matcher(str2);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(str2.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(str2.subSequence(iEnd, str2.length()).toString());
                listK = arrayList;
            } else {
                listK = qf0.K(str2.toString());
            }
            String[] strArr = (String[]) listK.toArray(new String[0]);
            if (strArr.length == 0) {
                ye4.c("SessionFiletransfer", "processCommand(): error getting MajorVersion out of String");
                str = "0";
            } else {
                str = strArr[0];
            }
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                ye4.c("SessionFiletransfer", "processCommand(): major version could not be parsed");
            }
            if (i < 7) {
                this.m.b();
                ye4.a("SessionFiletransfer", "processCommand(): version not supported");
                String strH = o67.h(this.T, R.string.tv_connectFailedVersion, 7);
                Context context = d82.M;
                if (context != null) {
                    d82.u(context, strH);
                    return;
                } else {
                    ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    return;
                }
            }
        }
        DyngateID dyngateIDP = ak7Var.p();
        if (dyngateIDP.IsValid()) {
            String strG = uf0.G.g(dyngateIDP);
            if (strG.length() == 0) {
                strG = (String) ak7Var.s(gj7.DeviceDisplayName).n;
                String string = (String) ak7Var.s(gj7.AccountDisplayName).n;
                if (string != null && string.length() > 0) {
                    strG = string;
                } else if (strG == null || strG.length() <= 0) {
                    string = dyngateIDP.toString();
                    string.getClass();
                    strG = string;
                }
            }
            this.Q = strG;
        }
        b();
    }

    public final void i() {
        ug2 ug2Var = ug2.EndSession;
        ug2Var.getClass();
        ak7 ak7Var = new ak7(g10.TVCommand, ug2Var.m);
        ak7Var.d(vg2.SessionId, 1001);
        ak7Var.z(KnownStreams.DefaultStream_File);
        ak7Var.d(vg2.Message, 2);
        f(ak7Var, false);
        this.m.c(this, ys6.n);
    }

    public final boolean j(ak7 ak7Var) {
        z08 z08Var;
        boolean z;
        boolean z2;
        bt6 bt6VarB;
        i10 i10Var = vg2.CRC;
        if (this.D == ah2.Download) {
            ir irVar = ug2.n;
            byte bV = ak7Var.v();
            irVar.getClass();
            int iOrdinal = ((ug2) ug2.f2212o.C(bV)).ordinal();
            if (iOrdinal != 16 && iOrdinal != 17) {
                i10 i10Var2 = vg2.FileNumber;
                vg2 vg2Var = vg2.SkipAllFiles;
                i10 i10Var3 = vg2.ErrorType;
                i10 i10Var4 = vg2.SessionId;
                at6 at6Var = at6.m;
                switch (iOrdinal) {
                    case 6:
                        ye4.a("SessionFiletransfer", "processDownloadFileTransferCommands(): ReplyBeginFileTransfer");
                        z08 z08Var2 = new z08();
                        this.C = z08Var2;
                        ct6 ct6Var = this.A;
                        if (ct6Var == null) {
                            return true;
                        }
                        ct6Var.b(at6Var, ug2.ReplyBeginFileTransfer, z08Var2);
                        return true;
                    case 7:
                        ye4.a("SessionFiletransfer", "processDownloadFileTransferCommands(): RequestNewFile");
                        this.O = 0;
                        this.P = 0;
                        String strL = (String) ak7Var.s(vg2.FilePath).n;
                        if (strL == null) {
                            strL = "";
                        }
                        long j = ak7Var.r(vg2.Size).a;
                        int i = ak7Var.q(i10Var2).b;
                        io.sentry.android.core.d dVar = this.S;
                        dVar.getClass();
                        if (((ea6) dVar.s) == ea6.n) {
                            strL = bc7.L(strL, "\\", "/");
                        }
                        z08 z08Var3 = this.C;
                        if (z08Var3 != null) {
                            z08Var3.e = i;
                            z08Var3.h = z08Var3.d;
                            z08Var3.a = strL;
                            z08Var3.f = j;
                            z08Var3.g = 0L;
                        }
                        this.J = 0;
                        ct6 ct6Var2 = this.A;
                        bt6 bt6VarB2 = ct6Var2 != null ? ct6Var2.b(at6Var, ug2.NewFile, z08Var3) : null;
                        int i2 = bt6VarB2 == null ? -1 : dt6.a[bt6VarB2.ordinal()];
                        if (i2 == 1) {
                            z08 z08Var4 = this.C;
                            if (z08Var4 != null) {
                                z08Var4.d = z08Var4.f + z08Var4.h;
                            }
                            ug2 ug2Var = ug2.Abort;
                            ug2Var.getClass();
                            ak7 ak7Var2 = new ak7(g10.TVCommand, ug2Var.m);
                            ak7Var2.d(i10Var4, 1001);
                            ak7Var2.z(KnownStreams.DefaultStream_File);
                            ak7Var2.b(vg2Var, (byte) 0);
                            f(ak7Var2, false);
                            return true;
                        }
                        if (i2 != 3 || (z08Var = this.C) == null) {
                            return true;
                        }
                        ug2 ug2Var2 = ug2.NewFile;
                        ug2Var2.getClass();
                        ak7 ak7Var3 = new ak7(g10.TVCommand, ug2Var2.m);
                        ak7Var3.d(i10Var4, 1001);
                        ak7Var3.z(KnownStreams.DefaultStream_File);
                        ak7Var3.e(vg2.Offset, z08Var.g);
                        long j2 = z08Var.g;
                        i10 i10Var5 = vg2.ResumeType;
                        if (j2 > 0) {
                            ak7Var3.d(i10Var5, 3);
                            z08Var.d += z08Var.g;
                            try {
                                String str = z08Var.a;
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(io.sentry.config.a.e(new FileInputStream(str), str));
                                CRC32 crc32 = new CRC32();
                                byte[] bArr = new byte[16384];
                                while (true) {
                                    int i3 = bufferedInputStream.read(bArr);
                                    if (i3 == -1) {
                                        bufferedInputStream.close();
                                        ak7Var3.d(i10Var, (int) crc32.getValue());
                                        z = true;
                                        z2 = false;
                                    } else {
                                        crc32.update(bArr, 0, i3);
                                    }
                                }
                            } catch (IOException e) {
                                e41.s("Failed to calculate checksum: ", e.getMessage(), "SessionFiletransfer");
                                z2 = false;
                                ak7Var3.d(i10Var, 0);
                                z = true;
                            }
                            break;
                        } else {
                            z = true;
                            z2 = false;
                            ak7Var3.d(i10Var5, 1);
                        }
                        f(ak7Var3, z2);
                        return z;
                    case 8:
                        this.P++;
                        if (vn4.r0(Math.pow(2.0d, this.O)) == this.P) {
                            this.O++;
                            ye4.a("SessionFiletransfer", "processDownloadFileTransferCommands(): PublishFileChunk");
                        }
                        int i4 = ak7Var.q(i10Var2).b;
                        byte[] bArr2 = (byte[]) ak7Var.m(vg2.Data).n;
                        if (bArr2 == null) {
                            bArr2 = new byte[0];
                        }
                        z08 z08Var5 = this.C;
                        if (z08Var5 != null) {
                            z08Var5.e = i4;
                            if (ak7Var.n(vg2.RevertItem).b) {
                                z08Var5.g = 0L;
                                z08Var5.d = z08Var5.h;
                            } else {
                                z08Var5.g = (this.J + 1) * 81920;
                                z08Var5.d += (long) bArr2.length;
                            }
                            z08Var5.i = bArr2;
                        } else {
                            vg2Var = vg2Var;
                        }
                        this.J++;
                        ct6 ct6Var3 = this.A;
                        bt6 bt6VarB3 = ct6Var3 != null ? ct6Var3.b(at6Var, ug2.FileChunk, this.C) : null;
                        int i5 = bt6VarB3 == null ? -1 : dt6.a[bt6VarB3.ordinal()];
                        if (i5 == 1) {
                            ug2 ug2Var3 = ug2.Error;
                            ug2Var3.getClass();
                            g10 g10Var = g10.TVCommand;
                            ak7 ak7Var4 = new ak7(g10Var, ug2Var3.m);
                            ak7Var4.d(i10Var4, 1001);
                            KnownStreams knownStreams = KnownStreams.DefaultStream_File;
                            ak7Var4.z(knownStreams);
                            ak7Var4.d(i10Var3, 11);
                            f(ak7Var4, false);
                            ye4.c("SessionFiletransfer", "processDownloadFileTransferCommands(): writing file failed!");
                            ug2 ug2Var4 = ug2.Abort;
                            ug2Var4.getClass();
                            ak7 ak7Var5 = new ak7(g10Var, ug2Var4.m);
                            ak7Var5.d(i10Var4, 1001);
                            ak7Var5.z(knownStreams);
                            ak7Var5.b(vg2Var, (byte) 1);
                            f(ak7Var5, false);
                            return true;
                        }
                        if (i5 == 3) {
                            ug2 ug2Var5 = ug2.FileChunk;
                            ug2Var5.getClass();
                            ak7 ak7Var6 = new ak7(g10.TVCommand, ug2Var5.m);
                            ak7Var6.d(i10Var4, 1001);
                            ak7Var6.z(KnownStreams.DefaultStream_File);
                            ak7Var6.d(i10Var2, i4);
                            f(ak7Var6, false);
                            return true;
                        }
                        break;
                    case ep1.b /* 9 */:
                        ye4.a("SessionFiletransfer", "processDownloadFileTransferCommands(): ReplyFileRecursionStatus");
                        int i6 = ak7Var.q(vg2.NumberOfFiles).b;
                        long j3 = ak7Var.r(vg2.NumberOfBytes).a;
                        z08 z08Var6 = this.C;
                        if (z08Var6 != null) {
                            z08Var6.b = i6;
                            z08Var6.c = j3;
                            z08Var6.d = 0L;
                        }
                        ct6 ct6Var4 = this.A;
                        bt6VarB = ct6Var4 != null ? ct6Var4.b(at6Var, ug2.ReplyFileRecursionStatus, z08Var6) : null;
                        if ((bt6VarB == null ? -1 : dt6.a[bt6VarB.ordinal()]) == 1) {
                            ug2 ug2Var6 = ug2.Error;
                            ug2Var6.getClass();
                            ak7 ak7Var7 = new ak7(g10.TVCommand, ug2Var6.m);
                            ak7Var7.d(i10Var4, 1001);
                            ak7Var7.z(KnownStreams.DefaultStream_File);
                            ak7Var7.d(i10Var3, 11);
                            f(ak7Var7, false);
                            return true;
                        }
                        break;
                    case ep1.c /* 10 */:
                        ye4.a("SessionFiletransfer", "processDownloadFileTransferCommands(): PublishNewDirectory");
                        String str2 = (String) ak7Var.s(vg2.Directory).n;
                        z08 z08Var7 = this.C;
                        if (z08Var7 != null) {
                            z08Var7.a = str2;
                        }
                        ct6 ct6Var5 = this.A;
                        bt6VarB = ct6Var5 != null ? ct6Var5.b(at6Var, ug2.PublishNewDirectory, z08Var7) : null;
                        if ((bt6VarB == null ? -1 : dt6.a[bt6VarB.ordinal()]) == 1) {
                            ug2 ug2Var7 = ug2.Error;
                            ug2Var7.getClass();
                            g10 g10Var2 = g10.TVCommand;
                            ak7 ak7Var8 = new ak7(g10Var2, ug2Var7.m);
                            ak7Var8.d(i10Var4, 1001);
                            KnownStreams knownStreams2 = KnownStreams.DefaultStream_File;
                            ak7Var8.z(knownStreams2);
                            ak7Var8.d(i10Var3, 12);
                            f(ak7Var8, false);
                            ug2 ug2Var8 = ug2.Abort;
                            ug2Var8.getClass();
                            ak7 ak7Var9 = new ak7(g10Var2, ug2Var8.m);
                            ak7Var9.d(i10Var4, 1001);
                            ak7Var9.z(knownStreams2);
                            ak7Var9.b(vg2Var, (byte) 1);
                            f(ak7Var9, false);
                            return true;
                        }
                        break;
                    case 11:
                        ye4.a("SessionFiletransfer", "processDownloadFileTransferCommands(): ReplyEndFileTransfer");
                        ct6 ct6Var6 = this.A;
                        if (ct6Var6 != null) {
                            ct6Var6.b(at6Var, ug2.ReplyEndFileTransfer, this.C);
                        }
                        this.C = null;
                        this.D = null;
                        this.A = null;
                        EventHub.e(this.v, EventType.EVENT_FILETRANSFER_DOWNLOAD_COMPLETED);
                        return true;
                    default:
                        ye4.c("SessionFiletransfer", "processDownloadFileTransferCommands(): Default ID: " + ((int) ak7Var.v()));
                        return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean k(ak7 ak7Var) {
        boolean z = false;
        if (this.D == ah2.Upload) {
            ir irVar = ug2.n;
            byte bV = ak7Var.v();
            irVar.getClass();
            int iOrdinal = ((ug2) ug2.f2212o.C(bV)).ordinal();
            vg2 vg2Var = vg2.SessionId;
            if (iOrdinal == 4) {
                this.E = 0;
                ye4.a("SessionFiletransfer", "processUploadFileTransferCommands(): requestFiles");
                ug2 ug2Var = ug2.ReplyBeginFileTransfer;
                ug2Var.getClass();
                ak7 ak7Var2 = new ak7(g10.TVCommand, ug2Var.m);
                ak7Var2.d(vg2Var, 1001);
                ak7Var2.z(KnownStreams.DefaultStream_File);
                f(ak7Var2, false);
                x();
                return true;
            }
            if (iOrdinal == 11) {
                ye4.a("SessionFiletransfer", "processUploadFileTransferCommands(): replyEndFiletransfer");
                u();
                return true;
            }
            if (iOrdinal == 7) {
                ye4.a("SessionFiletransfer", "processUploadFileTransferCommands(): replyNewFile");
                this.K = 0L;
                long j = ak7Var.r(vg2.Offset).a;
                if (j > 0) {
                    FileInputStream fileInputStreamE = this.L;
                    nk7 nk7Var = this.H;
                    if (fileInputStreamE == null) {
                        if (nk7Var != null) {
                            String str = nk7Var.f1575o;
                            if (new File(str).length() >= j) {
                                try {
                                    fileInputStreamE = io.sentry.config.a.e(new FileInputStream(str), str);
                                    this.L = fileInputStreamE;
                                } catch (FileNotFoundException unused) {
                                    ye4.c("SessionFiletransfer", "uploadResumeFileInit(): File not found");
                                }
                            }
                        } else {
                            ye4.c("SessionFiletransfer", "uploadResumeFileInit(): Active file is null");
                        }
                        B();
                        return true;
                    }
                    try {
                        fileInputStreamE.skip(j);
                        this.K = j;
                    } catch (IOException unused2) {
                        ye4.c("SessionFiletransfer", "uploadResumeFileInit(): Skipping failed.");
                    }
                }
                this.O = 0;
                this.P = 0;
                v();
                return true;
            }
            if (iOrdinal == 8) {
                this.P++;
                if (vn4.r0(Math.pow(2.0d, this.O)) == this.P) {
                    this.O++;
                    ye4.a("SessionFiletransfer", "processUploadFileTransferCommands(): receivedFilePackage");
                }
                v();
                return true;
            }
            if (iOrdinal == 16) {
                int i = ak7Var.q(vg2.ErrorType).b;
                ye4.c("SessionFiletransfer", "processUploadFileTransferCommands(): Error occured (Code: " + i + ")");
                if (i == 2) {
                    Context context = d82.M;
                    if (context != null) {
                        d82.t(context, R.string.tv_filetransfer_error_opdenied);
                    } else {
                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    }
                    A();
                } else if (i == 12) {
                    Context context2 = d82.M;
                    if (context2 != null) {
                        d82.t(context2, R.string.tv_filetransfer_error_create_dir_failed);
                    } else {
                        ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                    }
                    A();
                } else {
                    if (i != 4) {
                        if (i == 11) {
                            Context context3 = d82.M;
                            if (context3 != null) {
                                d82.t(context3, R.string.tv_filetransfer_error_filesystem);
                            } else {
                                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
                            }
                            B();
                        }
                        return z;
                    }
                    long j2 = ak7Var.r(vg2.Size).a;
                    nk7 nk7Var2 = this.H;
                    boolean z2 = nk7Var2 != null && j2 < new File(nk7Var2.f1575o).length();
                    ct6 ct6Var = this.B;
                    if (ct6Var != null) {
                        ct6Var.b(at6.m, ug2.Error, this.C);
                    }
                    if (bt1.a == null) {
                        im3.e0("dialogFactory");
                        throw null;
                    }
                    gk7 gk7VarF = ir.f();
                    gk7VarF.a1 = false;
                    z08 z08Var = this.C;
                    String str2 = z08Var != null ? z08Var.a : null;
                    if (bd4.k == null) {
                        bd4.k = new bd4();
                    }
                    gk7VarF.M0((str2 == null || str2.length() == 0) ? "" : str2.substring(ub7.d0(str2, '/', 0, 6) + 1, str2.length()));
                    gk7VarF.H0 = R.string.tv_filetransfer_dialog_file_exists_header;
                    gk7VarF.K0 = R.string.tv_filetransfer_dialog_file_exists_overwrite;
                    xk1 xk1Var = ct1.a;
                    if (xk1Var != null) {
                        xk1.M(this.U, new r02(gk7VarF, p02.Positive));
                    }
                    gk7VarF.O0 = R.string.tv_filetransfer_dialog_file_exists_skip;
                    if (xk1Var != null) {
                        xk1.M(this.W, new r02(gk7VarF, p02.Negative));
                    }
                    if (z2) {
                        gk7VarF.S0 = R.string.tv_filetransfer_dialog_file_exists_resume;
                        if (xk1Var != null) {
                            xk1.M(this.V, new r02(gk7VarF, p02.Neutral));
                        }
                    }
                    this.R = gk7VarF;
                    bu7.MAIN.a(new pc0((Object) this, (byte) 28));
                    ReentrantLock reentrantLock = this.x;
                    reentrantLock.lock();
                    try {
                        try {
                            this.y.await();
                        } catch (InterruptedException unused3) {
                            ye4.c("SessionFiletransfer", "showAskDialogModal(): Interrupt Exception on waiting.");
                            this.N = (byte) 4;
                            gk7 gk7Var = this.R;
                            if (gk7Var != null) {
                                gk7Var.A0();
                            }
                        }
                        reentrantLock.unlock();
                        byte b = this.N;
                        if (b != 0) {
                            vg2 vg2Var2 = vg2.ResumeType;
                            vg2 vg2Var3 = vg2.FileNumber;
                            if (b == 1) {
                                ug2 ug2Var2 = ug2.Error;
                                ug2Var2.getClass();
                                ak7 ak7Var3 = new ak7(g10.TVCommand, ug2Var2.m);
                                ak7Var3.d(vg2Var, 1001);
                                ak7Var3.z(KnownStreams.DefaultStream_File);
                                ak7Var3.d(vg2Var3, this.E);
                                ak7Var3.d(vg2Var2, 1);
                                f(ak7Var3, false);
                                this.E--;
                                x();
                            } else if (b == 2) {
                                ug2 ug2Var3 = ug2.Error;
                                ug2Var3.getClass();
                                ak7 ak7Var4 = new ak7(g10.TVCommand, ug2Var3.m);
                                ak7Var4.d(vg2Var, 1001);
                                ak7Var4.z(KnownStreams.DefaultStream_File);
                                ak7Var4.d(vg2Var3, this.E);
                                ak7Var4.d(vg2Var2, 3);
                                f(ak7Var4, false);
                                this.E--;
                                x();
                            }
                        } else {
                            B();
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                z = true;
                return z;
            }
            if (iOrdinal == 17) {
                ye4.a("SessionFiletransfer", "processUploadFileTransferCommands(): Abort received while uploading. Ignored. ");
                return true;
            }
        }
        return false;
    }

    public final void l(ak7 ak7Var) {
        df6 df6Var = this.q;
        df6Var.i(ak7Var);
        iu iuVar = (iu) df6Var.n;
        vi8 vi8Var = vi8.FileTransferAccess;
        if (iuVar.v(vi8Var) == i3.AfterConfirmation) {
            Context context = d82.M;
            if (context != null) {
                d82.t(context, R.string.tv_filetransfer_access_confirm);
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            }
        }
        f(df6Var.s(this.r.a()), false);
        if (iuVar.v(vi8Var) == i3.Denied) {
            Context context2 = d82.M;
            if (context2 != null) {
                d82.t(context2, R.string.tv_filetransfer_access_denied);
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            }
        }
    }

    public final void m() {
        ps6 ps6Var = this.m;
        ps6Var.getClass();
        ps6Var.g(i41.A);
        ps6Var.getClass();
        Iterator it = ps6Var.a.b().iterator();
        while (it.hasNext()) {
            ((u2) it.next()).e(this);
        }
        nm nmVar = ps6Var.n;
        nmVar.getClass();
        ArrayList arrayList = nmVar.a;
        for (WeakReference weakReference : lv0.P0(arrayList)) {
            Object obj = weakReference.get();
            if (obj != null) {
                ((o41) obj).b(this);
            } else {
                arrayList.remove(weakReference);
            }
        }
        if (this.M) {
            return;
        }
        this.M = true;
        ug2 ug2Var = ug2.RequestSession;
        ug2Var.getClass();
        ak7 ak7Var = new ak7(g10.TVCommand, ug2Var.m);
        ak7Var.d(vg2.SessionId, 1001);
        ak7Var.z(KnownStreams.DefaultStream_File);
        ak7Var.f(vg2.Directory, "");
        f(ak7Var, false);
    }

    public final void o(ak7 ak7Var) {
        int i = ak7Var.q(vg2.ErrorType).b;
        at6 at6Var = at6.n;
        if (i == 2) {
            ye4.c("SessionFiletransfer", "stateReplyError(): OperationDenied");
            ah2 ah2Var = this.D;
            if (ah2Var == null) {
                ug2 ug2Var = ug2.EndSession;
                ug2Var.getClass();
                ak7 ak7Var2 = new ak7(g10.TVCommand, ug2Var.m);
                ak7Var2.d(vg2.SessionId, 1001);
                ak7Var2.z(KnownStreams.DefaultStream_File);
                f(ak7Var2, false);
                this.m.a();
                this.M = false;
            } else if (ah2Var == ah2.Download || ah2Var == ah2.Upload) {
                ct6 ct6Var = this.A;
                if (ct6Var != null) {
                    ct6Var.b(at6Var, null, null);
                    this.C = null;
                    this.D = null;
                    this.A = null;
                }
                ct6 ct6Var2 = this.B;
                if (ct6Var2 != null) {
                    ct6Var2.b(at6Var, null, null);
                }
                u();
            }
        } else if (i == 3) {
            Context context = d82.M;
            if (context != null) {
                d82.t(context, R.string.tv_filetransfer_session_err_getdir);
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            }
            ye4.c("SessionFiletransfer", "stateReplyError(): getDir");
        } else if (i == 1) {
            Context context2 = d82.M;
            if (context2 != null) {
                d82.t(context2, R.string.tv_filetransfer_session_err_invalsession);
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            }
            ye4.c("SessionFiletransfer", "stateReplyError(): InvalidSessionId");
        } else if (i == 7) {
            Context context3 = d82.M;
            if (context3 != null) {
                d82.t(context3, R.string.tv_filetransfer_session_err_getdiraccess);
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            }
            ye4.c("SessionFiletransfer", "stateReplyError(): ReadDirectoryNoAccess");
        } else if (i == 11) {
            Context context4 = d82.M;
            if (context4 != null) {
                d82.t(context4, R.string.tv_filetransfer_session_err_fserror);
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            }
            ye4.c("SessionFiletransfer", "stateReplyError(): FileSystemError");
        } else if (i == 8) {
            Context context5 = d82.M;
            if (context5 != null) {
                d82.t(context5, R.string.tv_filetransfer_session_err_servererror);
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            }
            ye4.c("SessionFiletransfer", "stateReplyError(): ServerError");
        } else {
            Context context6 = d82.M;
            if (context6 != null) {
                d82.t(context6, R.string.tv_filetransfer_session_err_other);
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            }
        }
        io.sentry.i5 i5Var = this.z;
        if (i5Var != null) {
            i5Var.b(at6Var, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    public final void q(ak7 ak7Var) {
        String strConcat;
        if (ak7Var.q(vg2.SessionId).b != 1001) {
            ye4.c("SessionFiletransfer", "stateReplyGetDir(): SessionIDs don't match");
            io.sentry.i5 i5Var = this.z;
            if (i5Var != null) {
                i5Var.b(at6.n, null);
                return;
            }
            return;
        }
        int i = ak7Var.q(vg2.NumberOfFiles).b;
        String str = (String) ak7Var.s(vg2.Directory).n;
        byte[] bArr = (byte[]) ak7Var.m(vg2.ListOfFiles).n;
        at6 at6Var = at6.m;
        if (str == null || bArr == null || i <= 0) {
            io.sentry.i5 i5Var2 = this.z;
            if (i5Var2 != null) {
                i5Var2.b(at6Var, null);
                return;
            }
            return;
        }
        nk7[] nk7VarArr = new nk7[i];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = byteBufferWrap.getInt();
            byteBufferWrap.getInt();
            byteBufferWrap.getInt();
            byteBufferWrap.getInt();
            byteBufferWrap.getInt();
            byteBufferWrap.getInt();
            byteBufferWrap.getInt();
            byteBufferWrap.getInt();
            byteBufferWrap.getInt();
            byteBufferWrap.getInt();
            byteBufferWrap.getInt();
            char[] cArr = new char[260];
            int i4 = 0;
            boolean z2 = false;
            for (int i5 = 0; i5 < 260; i5++) {
                char c = byteBufferWrap.getChar();
                if (c == 0) {
                    z2 = true;
                }
                if (!z2) {
                    i4++;
                    cArr[i5] = c;
                }
            }
            char[] cArr2 = new char[i4];
            for (int i6 = 0; i6 < i4; i6++) {
                cArr2[i6] = cArr[i6];
            }
            char[] cArr3 = new char[14];
            boolean z3 = false;
            for (int i7 = 0; i7 < 14; i7++) {
                char c2 = byteBufferWrap.getChar();
                if (c2 == 0) {
                    z3 = true;
                }
                if (!z3) {
                    cArr3[i7] = c2;
                }
            }
            lk7 lk7Var = (i3 & 16) == 16 ? lk7.m : lk7.n;
            if ((i3 & 33554432) == 33554432) {
                lk7Var = lk7.f1374o;
            }
            lk7 lk7Var2 = lk7Var;
            if (str.length() > 0) {
                io.sentry.android.core.d dVar = this.S;
                if (bc7.G(false, str, (String) dVar.m)) {
                    strConcat = str;
                } else {
                    strConcat = str.concat((String) dVar.m);
                }
            } else {
                strConcat = str;
            }
            nk7VarArr[i2] = new nk7(new String(cArr2), strConcat.concat(new String(cArr2)), lk7Var2, mk7.n, i3);
        }
        for (int i8 = 0; i8 < i; i8++) {
            if (nk7VarArr[i8] == null) {
                yq4.g(46, nk7VarArr, "null element found in ");
                return;
            }
        }
        if (str.length() == 0) {
            int i9 = 0;
            while (true) {
                if (i9 >= i) {
                    z = true;
                    break;
                } else if (!bc7.N(false, nk7VarArr[i9].f1575o, "/")) {
                    break;
                } else {
                    i9++;
                }
            }
            io.sentry.android.core.d dVar2 = io.sentry.android.core.d.t;
            ea6 ea6Var = ea6.m;
            if (dVar2 == null) {
                dVar2 = new io.sentry.android.core.d();
                dVar2.m = "";
                dVar2.n = "";
                dVar2.f100o = "";
                dVar2.p = "";
                dVar2.q = "";
                dVar2.r = "";
                dVar2.i(ea6Var);
                dVar2.s = ea6Var;
                io.sentry.android.core.d.t = dVar2;
            }
            if (z) {
                ea6Var = ea6.n;
            }
            dVar2.s = ea6Var;
            dVar2.i(ea6Var);
        }
        io.sentry.i5 i5Var3 = this.z;
        if (i5Var3 != null) {
            i5Var3.b(at6Var, nk7VarArr);
        }
        this.z = null;
    }

    public final void s(ak7 ak7Var) {
        if (ak7Var.v() != ug2.ReplySession.m) {
            if (ak7Var.v() == ug2.EndSession.m) {
                EventHub.e(this.v, EventType.EVENT_FILETRANSFER_SESSION_CLOSED_BY_PARTNER);
                ye4.a("SessionFiletransfer", "stateReplySession(): Session ended");
                this.z = null;
                this.M = false;
                return;
            }
            return;
        }
        df6 df6Var = this.q;
        df6Var.getClass();
        if (i3.Denied != ((iu) df6Var.n).v(vi8.FileTransferAccess)) {
            ps6 ps6Var = this.m;
            ps6Var.getClass();
            ps6Var.g(i41.z);
            ye4.a("SessionFiletransfer", "stateReplySession(): start session");
            return;
        }
        ye4.c("SessionFiletransfer", "Force end session due to access controls.");
        ug2 ug2Var = ug2.EndSession;
        ug2Var.getClass();
        ak7 ak7Var2 = new ak7(g10.TVCommand, ug2Var.m);
        ak7Var2.d(vg2.SessionId, 1001);
        ak7Var2.z(KnownStreams.DefaultStream_File);
        f(ak7Var2, false);
        this.z = null;
        this.M = false;
    }

    public final void u() {
        ug2 ug2Var = ug2.ReplyEndFileTransfer;
        ug2Var.getClass();
        ak7 ak7Var = new ak7(g10.TVCommand, ug2Var.m);
        ak7Var.d(vg2.SessionId, 1001);
        ak7Var.z(KnownStreams.DefaultStream_File);
        f(ak7Var, false);
        this.D = null;
        ct6 ct6Var = this.B;
        if (ct6Var != null) {
            ct6Var.b(at6.m, ug2Var, this.C);
        }
        FileInputStream fileInputStream = this.L;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
                ye4.c("SessionFiletransfer", "uploadEnd(): Filestream IOException");
            }
        }
        this.L = null;
        this.H = null;
        this.B = null;
        this.C = null;
    }

    public final void v() {
        FileInputStream fileInputStreamE = this.L;
        nk7 nk7Var = this.H;
        if (fileInputStreamE == null) {
            if (nk7Var == null) {
                ye4.c("SessionFiletransfer", "uploadFileChunk(): Active file is null");
                B();
                return;
            }
            try {
                String str = nk7Var.f1575o;
                fileInputStreamE = io.sentry.config.a.e(new FileInputStream(str), str);
                this.L = fileInputStreamE;
            } catch (FileNotFoundException unused) {
                ye4.c("SessionFiletransfer", "uploadFileChunk(): File not found");
                B();
                return;
            }
        }
        try {
            byte[] bArr = new byte[81920];
            int i = fileInputStreamE.read(bArr, 0, 81920);
            if (i == -1 && this.J != 0) {
                ye4.a("SessionFiletransfer", "uploadFileChunk(): nothing more to read");
                List list = (List) this.G.get(this.I);
                if (list != null) {
                    list.remove(0);
                }
                x();
                return;
            }
            if (i != 81920) {
                if (i < 0) {
                    i = 0;
                }
                byte[] bArr2 = new byte[i];
                for (int i2 = 0; i2 < i; i2++) {
                    bArr2[i2] = bArr[i2];
                }
                bArr = bArr2;
            }
            ug2 ug2Var = ug2.FileChunk;
            ug2Var.getClass();
            ak7 ak7Var = new ak7(g10.TVCommand, ug2Var.m);
            ak7Var.d(vg2.SessionId, 1001);
            ak7Var.z(KnownStreams.DefaultStream_File);
            ak7Var.d(vg2.FileNumber, this.E);
            ak7Var.a(vg2.Data, bArr);
            f(ak7Var, false);
            z08 z08Var = this.C;
            if (z08Var != null) {
                long j = this.K;
                int i3 = this.J;
                z08Var.g = j + ((long) (81920 * i3)) + ((long) bArr.length);
                z08Var.d += (long) bArr.length;
                this.J = i3 + 1;
                ct6 ct6Var = this.B;
                if (ct6Var != null) {
                    ct6Var.b(at6.m, ug2Var, z08Var);
                }
            }
        } catch (IOException unused2) {
            ye4.c("SessionFiletransfer", "uploadFileChunk(): IOException - file will be skipped");
            List list2 = (List) this.G.get(this.I);
            if (list2 != null) {
                list2.remove(0);
            }
            x();
        }
    }

    public final void x() {
        boolean z;
        List listK;
        List listK2;
        FileInputStream fileInputStream = this.L;
        Object obj = null;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
                ye4.c("SessionFiletransfer", "uploadNextFile(): Filestream IOException");
            }
            this.L = null;
        } else {
            ye4.a("SessionFiletransfer", "uploadNextFile(): no Filestream to close");
        }
        String strValueOf = "";
        while (true) {
            String[] strArr = (String[]) this.G.keySet().toArray(new String[0]);
            if (strArr.length == 0) {
                z = false;
                break;
            }
            strValueOf = String.valueOf(strArr[0]);
            List list = (List) this.G.get(strValueOf);
            if (list != null && !list.isEmpty()) {
                obj = list.get(0);
                z = true;
                break;
            }
        }
        if (!z || obj == null) {
            ye4.a("SessionFiletransfer", "uploadNextFile(): no more files to upload");
            u();
            return;
        }
        nk7 nk7Var = (nk7) obj;
        String str = nk7Var.f1575o;
        this.H = nk7Var;
        this.I = strValueOf;
        int iOrdinal = nk7Var.n.ordinal();
        at6 at6Var = at6.m;
        vg2 vg2Var = vg2.SessionId;
        if (iOrdinal == 0) {
            ug2 ug2Var = ug2.PublishNewDirectory;
            ug2Var.getClass();
            ak7 ak7Var = new ak7(g10.TVCommand, ug2Var.m);
            ak7Var.d(vg2Var, 1001);
            ak7Var.z(KnownStreams.DefaultStream_File);
            String strQuote = Pattern.quote(strValueOf);
            strQuote.getClass();
            Pattern patternCompile = Pattern.compile(strQuote);
            patternCompile.getClass();
            str.getClass();
            ub7.k0(0);
            Matcher matcher = patternCompile.matcher(str);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(str.subSequence(iEnd, str.length()).toString());
                listK = arrayList;
            } else {
                listK = qf0.K(str.toString());
            }
            String str2 = (String) listK.get(1);
            ak7Var.f(vg2.ServerPath, this.F + str2);
            f(ak7Var, false);
            z08 z08Var = this.C;
            if (z08Var != null) {
                z08Var.a = str;
                ct6 ct6Var = this.B;
                if (ct6Var != null) {
                    ct6Var.b(at6Var, ug2Var, z08Var);
                }
            }
            List list2 = (List) this.G.get(strValueOf);
            if (list2 != null) {
                list2.remove(0);
            }
            x();
            return;
        }
        if (iOrdinal != 1) {
            ye4.c("SessionFiletransfer", "uploadNextFile(): selected file is no file or directory");
            B();
            return;
        }
        ug2 ug2Var2 = ug2.NewFile;
        ug2Var2.getClass();
        ak7 ak7Var2 = new ak7(g10.TVCommand, ug2Var2.m);
        ak7Var2.d(vg2Var, 1001);
        ak7Var2.z(KnownStreams.DefaultStream_File);
        int i = this.E + 1;
        this.E = i;
        ak7Var2.d(vg2.FileNumber, i);
        String strQuote2 = Pattern.quote(strValueOf);
        strQuote2.getClass();
        Pattern patternCompile2 = Pattern.compile(strQuote2);
        patternCompile2.getClass();
        str.getClass();
        ub7.k0(0);
        Matcher matcher2 = patternCompile2.matcher(str);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd2 = 0;
            do {
                arrayList2.add(str.subSequence(iEnd2, matcher2.start()).toString());
                iEnd2 = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str.subSequence(iEnd2, str.length()).toString());
            listK2 = arrayList2;
        } else {
            listK2 = qf0.K(str.toString());
        }
        String strZ = ua5.z(this.F, ((String[]) listK2.toArray(new String[0]))[1]);
        ye4.a("SessionFiletransfer", fx3.h("uploading file '", nk7Var.m, "' to '", strZ, "'"));
        ak7Var2.f(vg2.FilePath, strZ);
        long j = (nk7Var.t + 11644473600000L) * 10000;
        byte[] bArr = new byte[8];
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2] = (byte) (255 & j);
            j >>= 8;
        }
        ak7Var2.a(vg2.WriteTime, bArr);
        File file = new File(str);
        ak7Var2.e(vg2.Size, file.length());
        f(ak7Var2, false);
        z08 z08Var2 = this.C;
        if (z08Var2 != null) {
            z08Var2.e = this.E;
            z08Var2.h = z08Var2.d;
            z08Var2.a = str;
            z08Var2.f = file.length();
        }
        this.J = 0;
        ct6 ct6Var2 = this.B;
        if (ct6Var2 != null) {
            ct6Var2.b(at6Var, ug2Var2, this.C);
        }
    }
}
