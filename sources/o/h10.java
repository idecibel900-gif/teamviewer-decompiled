package o;

import com.teamviewer.teamviewerlib.bcommands.BCommandNativeImpl;
import com.teamviewer.teamviewerlib.network.BCommandHandler;

/* JADX INFO: loaded from: classes.dex */
public final class h10 extends Thread {
    public final /* synthetic */ byte m;
    public volatile boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f939o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h10(BCommandHandler bCommandHandler) {
        super("BCommandHandler");
        this.m = (byte) 0;
        this.f939o = bCommandHandler;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.m) {
            case 0:
                break;
            default:
                setName("MouseUpdateThread");
                ye4.a("MouseUpdateThread", "start mouse thread");
                this.n = true;
                while (this.n) {
                    try {
                        wk7 wk7Var = (wk7) this.f939o;
                        if (wk7Var.k) {
                            wk7Var.b(wk7Var.j);
                            ((wk7) this.f939o).k = false;
                        }
                        Thread.sleep(8L);
                    } catch (InterruptedException e) {
                        ye4.a("MouseUpdateThread", " InterruptedException: " + e.getMessage());
                        ye4.d("TVMouse", e);
                    }
                }
                ye4.a("MouseUpdateThread", "Thread stop");
                return;
        }
        while (this.n) {
            BCommandHandler bCommandHandler = (BCommandHandler) this.f939o;
            BCommandNativeImpl bCommandNativeImpl = (BCommandNativeImpl) bCommandHandler.d.poll();
            if (bCommandNativeImpl != null) {
                g71 g71Var = bCommandHandler.b;
                if (g10.TVCommand != bCommandNativeImpl.l() || g71Var == null) {
                    ss6 ss6Var = bCommandHandler.c;
                    if (g10.RemoteSupport != bCommandNativeImpl.l() || ss6Var == null) {
                        ye4.c("BCommandHandler", "encountered unexpected command: " + bCommandNativeImpl);
                        bCommandNativeImpl.k();
                    } else {
                        mo4 mo4Var = new mo4(bCommandNativeImpl.a, b);
                        if (!mo4Var.b) {
                            mo4Var.k();
                        }
                    }
                } else {
                    ak7 ak7Var = new ak7(bCommandNativeImpl.a);
                    g71Var.e(ak7Var);
                    if (!ak7Var.b) {
                        ak7Var.k();
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        switch (this.m) {
            case 0:
                synchronized (this) {
                    this.n = true;
                    super.start();
                }
                return;
            default:
                super.start();
                return;
        }
    }

    public h10(wk7 wk7Var) {
        this.m = (byte) 1;
        this.f939o = wk7Var;
        this.n = true;
    }
}
