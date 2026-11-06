package com.teamviewer.teamviewerlib;

import com.teamviewer.teamviewerlib.swig.tvdiscovery.NSDDiscovery;
import com.teamviewer.teamviewerlib.swig.tvnetwork.INetworkControl;
import kotlin.Metadata;
import o.n37;
import o.ye4;
import o.zy4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!J®\u0001\u0010\u0016\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0082 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0018H\u0082 ¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0082 ¢\u0006\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/teamviewer/teamviewerlib/NativeLibTvExt;", "", "", "filesPath", "cachePath", "publicFilesPath", "mac", "imei", "languageCode", "countryCode", "androidId", "deviceSerial", "", "hasRecordAudioPermission", "hasStoragePermission", "hasBluetoothSystemFeature", "proxyHost", "", "proxyPort", "screenWidth", "screenHeight", "serverEnvironment", "jniInit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;IIILjava/lang/String;)Z", "", "jniGetNetworkControl", "()J", "jniGetNSDDiscovery", "jniIsByocSupported", "()Z", "Lo/f88;", "jniSetUpBYOC", "()V", "o/zy4", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NativeLibTvExt {
    public static final NativeLibTvExt a = new NativeLibTvExt();
    public static boolean b;
    public static boolean c;

    public static boolean c() {
        if (c) {
            return n37.d || n37.e || b;
        }
        return false;
    }

    private final native long jniGetNSDDiscovery();

    private final native long jniGetNetworkControl();

    private final native boolean jniInit(String filesPath, String cachePath, String publicFilesPath, String mac, String imei, String languageCode, String countryCode, String androidId, String deviceSerial, boolean hasRecordAudioPermission, boolean hasStoragePermission, boolean hasBluetoothSystemFeature, String proxyHost, int proxyPort, int screenWidth, int screenHeight, String serverEnvironment);

    private final native boolean jniIsByocSupported();

    private final native void jniSetUpBYOC();

    public final NSDDiscovery a() {
        return new NSDDiscovery(jniGetNSDDiscovery(), true);
    }

    public final INetworkControl b() {
        return new INetworkControl(jniGetNetworkControl(), true);
    }

    public final void d(zy4 zy4Var, String str) {
        try {
            boolean zJniInit = jniInit(zy4Var.a, zy4Var.b, zy4Var.c, "000000000000", "0000000", zy4Var.d, zy4Var.e, zy4Var.f, zy4Var.g, zy4Var.h, zy4Var.i, zy4Var.j, zy4Var.k, zy4Var.l, zy4Var.m, zy4Var.n, str);
            b = zJniInit;
            if (zJniInit) {
                ye4.a("NativeLibExt", "Initializing tvext succeeded.");
            } else {
                ye4.c("NativeLibExt", "Initializing tvext failed.");
            }
        } catch (Throwable th) {
            b = false;
            ye4.c("NativeLibExt", "Initializing tvext failed.");
            throw th;
        }
    }

    public final void e() {
        if (f()) {
            jniSetUpBYOC();
        }
    }

    public final boolean f() {
        return c && jniIsByocSupported();
    }
}
