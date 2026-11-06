package o;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class q63 {
    public long c;
    public final w36 d;
    public int g;
    public int h;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public d53[] e = new d53[8];
    public int f = 7;

    public q63(k83 k83Var) {
        this.d = new w36(k83Var);
    }

    public final void a(d53 d53Var) {
        this.b.add(d53Var);
        long jD = this.c + ((long) (d53Var.b.d() + d53Var.a.d()));
        this.c = jD;
        if (jD <= 262144) {
            return;
        }
        gk0.l("header byte count limit of 262144 exceeded");
    }

    public final int b(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                d53 d53Var = this.e[length];
                d53Var.getClass();
                int i4 = d53Var.c;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
            }
            d53[] d53VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(d53VarArr, i5, d53VarArr, i5 + i3, this.g);
            this.f += i3;
        }
        return i3;
    }

    public final ai0 c(int i) throws IOException {
        if (i >= 0) {
            d53[] d53VarArr = s63.a;
            if (i <= d53VarArr.length - 1) {
                return d53VarArr[i].a;
            }
        }
        int length = this.f + 1 + (i - s63.a.length);
        if (length >= 0) {
            d53[] d53VarArr2 = this.e;
            if (length < d53VarArr2.length) {
                d53 d53Var = d53VarArr2[length];
                d53Var.getClass();
                return d53Var.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void d(d53 d53Var) {
        a(d53Var);
        int i = d53Var.c;
        int i2 = this.a;
        if (i > i2) {
            d53[] d53VarArr = this.e;
            cx.N0(0, d53VarArr.length, null, d53VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        b((this.h + i) - i2);
        int i3 = this.g + 1;
        d53[] d53VarArr2 = this.e;
        if (i3 > d53VarArr2.length) {
            d53[] d53VarArr3 = new d53[d53VarArr2.length * 2];
            System.arraycopy(d53VarArr2, 0, d53VarArr3, d53VarArr2.length, d53VarArr2.length);
            this.f = this.e.length - 1;
            this.e = d53VarArr3;
            d53VarArr2 = d53VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        d53VarArr2[i4] = d53Var;
        this.g++;
        this.h += i;
    }

    public final ai0 e() {
        w36 w36Var = this.d;
        byte bQ = w36Var.q();
        byte[] bArr = po8.a;
        int i = bQ & 255;
        int i2 = 0;
        boolean z = (bQ & 128) == 128;
        long jF = f(i, 127);
        if (this.c + jF > 262144) {
            gk0.l("header byte count limit of 262144 exceeded");
            return null;
        }
        if (!z) {
            return w36Var.u(jF);
        }
        bf0 bf0Var = new bf0();
        io.sentry.android.replay.screenshot.h hVar = i93.c;
        io.sentry.android.replay.screenshot.h hVar2 = hVar;
        int i3 = 0;
        for (long j = 0; j < jF; j++) {
            byte bQ2 = w36Var.q();
            byte[] bArr2 = po8.a;
            i2 = (i2 << 8) | (bQ2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                io.sentry.android.replay.screenshot.h[] hVarArr = (io.sentry.android.replay.screenshot.h[]) hVar2.f166o;
                hVarArr.getClass();
                hVar2 = hVarArr[(i2 >>> (i3 - 8)) & 255];
                hVar2.getClass();
                if (((io.sentry.android.replay.screenshot.h[]) hVar2.f166o) == null) {
                    bf0Var.U0(hVar2.m);
                    i3 -= hVar2.n;
                    hVar2 = hVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            io.sentry.android.replay.screenshot.h[] hVarArr2 = (io.sentry.android.replay.screenshot.h[]) hVar2.f166o;
            hVarArr2.getClass();
            io.sentry.android.replay.screenshot.h hVar3 = hVarArr2[(i2 << (8 - i3)) & 255];
            hVar3.getClass();
            int i4 = hVar3.n;
            if (((io.sentry.android.replay.screenshot.h[]) hVar3.f166o) != null || i4 > i3) {
                break;
            }
            bf0Var.U0(hVar3.m);
            i3 -= i4;
            hVar2 = hVar;
        }
        return bf0Var.o0(bf0Var.n);
    }

    public final int f(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            byte bQ = this.d.q();
            byte[] bArr = po8.a;
            i4++;
            long j2 = ((long) (bQ & 127)) << i5;
            if (j2 > 2147483647L - j) {
                gk0.l("HPACK integer overflow");
                return 0;
            }
            j += j2;
            if ((bQ & 128) == 0) {
                return (int) j;
            }
            i5 += 7;
        }
        gk0.l("HPACK integer overflow");
        return 0;
    }
}
