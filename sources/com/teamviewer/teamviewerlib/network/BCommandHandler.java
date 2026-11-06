package com.teamviewer.teamviewerlib.network;

import com.teamviewer.teamviewerlib.NativeLibTvExt;
import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;
import io.sentry.b5;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import o.g71;
import o.h10;
import o.ha7;
import o.ss6;
import o.ye4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/teamviewer/teamviewerlib/network/BCommandHandler;", "", "", "address", "Lo/f88;", "handleBCommand", "(J)V", "o/h10", "TeamViewerLib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BCommandHandler {
    public h10 a;
    public g71 b;
    public ss6 c;
    public final LinkedBlockingQueue d = new LinkedBlockingQueue();
    public final long e;
    public boolean f;

    public BCommandHandler(int i) {
        if (NativeLibTvExt.c()) {
            this.e = jniCreate(this, i);
            this.f = true;
        } else {
            this.e = 0L;
            ye4.c("BCommandHandler", "No native library.");
        }
    }

    private static final native boolean jniClose(long j);

    private static final native long jniCreate(BCommandHandler bCommandHandler, int i);

    private static final native boolean jniSend(long j, long j2);

    public final void a() {
        synchronized (this) {
            this.f = false;
            g71 g71Var = this.b;
            if (g71Var != null) {
                g71Var.a(ha7.m);
            }
            jniClose(this.e);
        }
        Executors.newSingleThreadExecutor().execute(new b5((Object) this, (byte) 29));
    }

    public final synchronized void b(BCommandNativeImpl bCommandNativeImpl) {
        bCommandNativeImpl.getClass();
        if (this.f) {
            jniSend(this.e, bCommandNativeImpl.a);
            bCommandNativeImpl.k();
        }
    }

    public final void handleBCommand(long address) {
        this.d.offer(new BCommandNativeImpl(address));
    }
}
