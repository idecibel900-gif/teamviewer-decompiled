package o;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class wh2 implements v07 {
    public final /* synthetic */ byte m = 0;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2413o;
    public final Object p;

    public wh2(z73 z73Var) {
        this.p = z73Var;
        this.f2413o = new gt2(((u36) z73Var.c.n).m.i());
    }

    @Override // o.v07
    public final void W(bf0 bf0Var, long j) throws EOFException {
        byte b = this.m;
        Object obj = this.p;
        switch (b) {
            case 0:
                if (this.n) {
                    bf0Var.skip(j);
                } else {
                    try {
                        ((v07) this.f2413o).W(bf0Var, j);
                    } catch (IOException e) {
                        this.n = true;
                        ((a81) obj).invoke(e);
                        return;
                    }
                }
                break;
            default:
                if (!this.n) {
                    po8.a(bf0Var.n, 0L, j);
                    ((u36) ((z73) obj).c.n).W(bf0Var, j);
                } else {
                    hk0.l("closed");
                }
                break;
        }
    }

    @Override // o.v07, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        byte b = this.m;
        Object obj = this.f2413o;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                try {
                    ((v07) obj).close();
                } catch (IOException e) {
                    this.n = true;
                    ((a81) obj2).invoke(e);
                    return;
                }
                break;
            default:
                z73 z73Var = (z73) obj2;
                if (!this.n) {
                    this.n = true;
                    ((u36) z73Var.c.n).flush();
                    gt2 gt2Var = (gt2) obj;
                    ov7 ov7Var = gt2Var.e;
                    gt2Var.e = ov7.d;
                    ov7Var.a();
                    ov7Var.b();
                    z73Var.d = (byte) 3;
                    break;
                }
                break;
        }
    }

    @Override // o.v07, java.io.Flushable
    public final void flush() {
        byte b = this.m;
        Object obj = this.p;
        switch (b) {
            case 0:
                try {
                    ((v07) this.f2413o).flush();
                } catch (IOException e) {
                    this.n = true;
                    ((a81) obj).invoke(e);
                    return;
                }
                break;
            default:
                if (!this.n) {
                    ((u36) ((z73) obj).c.n).flush();
                    break;
                }
                break;
        }
    }

    @Override // o.v07
    public final ov7 i() {
        byte b = this.m;
        Object obj = this.f2413o;
        switch (b) {
            case 0:
                return ((v07) obj).i();
            default:
                return (gt2) obj;
        }
    }

    public wh2(v07 v07Var, a81 a81Var) {
        this.f2413o = v07Var;
        this.p = a81Var;
    }
}
