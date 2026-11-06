package com.teamviewer.teamviewerlib.network;

import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;
import kotlin.Metadata;
import o.au6;
import o.bt1;
import o.el5;
import o.ft6;
import o.g10;
import o.g95;
import o.im3;
import o.ks6;
import o.l10;
import o.mo4;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\t\u0010\u0006J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0086 ¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0013H\u0086 ¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0018\u0010\bJ\u0010\u0010\u0019\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/teamviewer/teamviewerlib/network/InterProcessGUIConnector;", "", "", "address", "Lo/f88;", "handleSessionCommand", "(J)V", "jniInit", "()V", "jniSetParticipantManager", "", "key", "", "value", "jniSetGeneralInfoString", "(ILjava/lang/String;)V", "jniSetGeneralInfoUInt64", "(IJ)V", "sessionId", "", "jniSetSessionInfoBoolean", "(IIZ)V", "jniSetSessionInfoLong", "(IIJ)V", "jniStartIgnoringCommands", "jniStopIgnoringCommands", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class InterProcessGUIConnector {
    public static final InterProcessGUIConnector a = new InterProcessGUIConnector();
    public static g95 b;

    public static void a(mo4 mo4Var) {
        au6 au6Var = bt1.b;
        if (au6Var == null) {
            im3.e0("instance");
            throw null;
        }
        int i = mo4Var.q(l10.TeamViewerSessionID).b;
        int i2 = mo4Var.q(ft6.ActionID).b;
        if (!au6Var.a.get() && !au6Var.b.get()) {
            ye4.a("InterProcessGUIConnector", "Cannot create new incoming session. Outgoing SessionManager.");
        } else {
            NativeNetwork.a.a(i);
            ye4.a("InterProcessGUIConnector", "Cannot create new incoming session. A session is still running.");
        }
    }

    public static final void handleSessionCommand(long address) {
        BCommandNativeImpl bCommandNativeImpl = new BCommandNativeImpl(address);
        if (bCommandNativeImpl.l() != g10.SessionCommand) {
            ye4.c("InterProcessGUIConnector", "Invalid command type for handling SessionCommand.");
            bCommandNativeImpl.k();
            return;
        }
        mo4 mo4Var = new mo4(address, (byte) 2);
        try {
            g95 g95Var = b;
            if (g95Var != null) {
                g95Var.O(mo4Var);
            } else {
                el5 el5Var = ks6.n;
                byte bV = mo4Var.v();
                el5Var.getClass();
                if (((ks6) ks6.f1299o.C(bV)) == ks6.IncomingConnection) {
                    a(mo4Var);
                } else {
                    ye4.a.g("InterProcessGUIConnector", "Received SessionCommand (" + mo4Var + ") without registered callback.");
                }
            }
        } finally {
            if (!mo4Var.b) {
                mo4Var.k();
            }
        }
    }

    private final native void jniInit();

    private final native void jniSetParticipantManager(long address);

    public final void b() {
        if (NativeLibTvExt.c()) {
            jniInit();
        }
    }

    public final void c(long j) {
        if (NativeLibTvExt.c()) {
            jniSetParticipantManager(j);
        }
    }

    public final native void jniSetGeneralInfoString(int key, String value);

    public final native void jniSetGeneralInfoUInt64(int key, long value);

    public final native void jniSetSessionInfoBoolean(int sessionId, int key, boolean value);

    public final native void jniSetSessionInfoLong(int sessionId, int key, long value);

    public final native void jniStartIgnoringCommands();

    public final native void jniStopIgnoringCommands();
}
