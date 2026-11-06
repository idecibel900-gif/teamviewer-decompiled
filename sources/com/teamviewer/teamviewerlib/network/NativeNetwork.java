package com.teamviewer.teamviewerlib.network;

import com.teamviewer.commonviewmodel.swig.IVideoCodecDetectorNative;
import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvnetwork.INetworkControl;
import kotlin.Metadata;
import o.l25;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/teamviewer/teamviewerlib/network/NativeNetwork;", "", "", "videoCodecDetector", "Lo/f88;", "jniInit", "(J)V", "", "sessionId", "jniEndSession", "(I)V", "bcmdptr", "jniSendToIPCNetwork", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NativeNetwork {
    public static final NativeNetwork a;
    public static INetworkControl b;

    static {
        NativeNetwork nativeNetwork = new NativeNetwork();
        a = nativeNetwork;
        if (NativeLibTvExt.c()) {
            Settings.i.n();
            InterProcessGUIConnector.a.b();
            nativeNetwork.jniInit(IVideoCodecDetectorNative.getCPtr(l25.d));
        }
    }

    private final native void jniEndSession(int sessionId);

    private final native void jniInit(long videoCodecDetector);

    private final native void jniSendToIPCNetwork(long bcmdptr);

    public final void a(int i) {
        if (NativeLibTvExt.c()) {
            jniEndSession(i);
        }
    }

    public final void b(BCommandNativeImpl bCommandNativeImpl) {
        if (NativeLibTvExt.c()) {
            jniSendToIPCNetwork(bCommandNativeImpl.a);
        }
        bCommandNativeImpl.k();
    }
}
