package o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class l83 implements Closeable {
    public static final Logger p;
    public final w36 m;
    public final k83 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q63 f1341o;

    static {
        Logger logger = Logger.getLogger(a83.class.getName());
        logger.getClass();
        p = logger;
    }

    public l83(w36 w36Var) {
        this.m = w36Var;
        k83 k83Var = new k83(w36Var);
        this.n = k83Var;
        this.f1341o = new q63(k83Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.m.close();
    }

    /* JADX WARN: Code duplicated, block: B:185:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:193:0x02df  */
    /* JADX WARN: Code duplicated, block: B:196:0x02e6 A[Catch: all -> 0x02ec, TRY_LEAVE, TryCatch #5 {, blocks: (B:194:0x02e0, B:196:0x02e6), top: B:235:0x02e0 }] */
    /* JADX WARN: Code duplicated, block: B:205:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:232:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x02e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0100  */
    /* JADX WARN: Code duplicated, block: B:68:0x0104  */
    /* JADX WARN: Code duplicated, block: B:75:0x012a  */
    /* JADX WARN: Code duplicated, block: B:95:0x015a  */
    public final boolean e(boolean z, e3 e3Var) throws Exception {
        i83 i83Var;
        p83 p83VarQ;
        ai0 ai0VarU;
        i83 i83Var2;
        try {
            this.m.k0(9L);
            int iL = po8.l(this.m);
            if (iL > 16384) {
                gk0.l(fx3.e(iL, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int iQ = this.m.q() & 255;
            byte bQ = this.m.q();
            int i = bQ & 255;
            int iZ = this.m.z();
            int i2 = Integer.MAX_VALUE & iZ;
            if (iQ != 8) {
                Logger logger = p;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(a83.b(true, i2, iL, iQ, i));
                }
            }
            if (z && iQ != 4) {
                io.sentry.h2.m(a83.a(iQ), "Expected a SETTINGS frame but was ");
                return false;
            }
            tc2 tc2Var = null;
            switch (iQ) {
                case 0:
                    j(e3Var, iL, i, i2);
                    return true;
                case 1:
                    u(e3Var, iL, i, i2);
                    return true;
                case 2:
                    if (iL != 5) {
                        gk0.l(fx3.f(iL, "TYPE_PRIORITY length: ", " != 5"));
                        return false;
                    }
                    if (i2 == 0) {
                        gk0.l("TYPE_PRIORITY streamId == 0");
                        return false;
                    }
                    w36 w36Var = this.m;
                    w36Var.z();
                    w36Var.q();
                    return true;
                case 3:
                    if (iL != 4) {
                        gk0.l(fx3.f(iL, "TYPE_RST_STREAM length: ", " != 4"));
                        return false;
                    }
                    if (i2 == 0) {
                        gk0.l("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int iZ2 = this.m.z();
                    tc2.n.getClass();
                    for (tc2 tc2Var2 : tc2.values()) {
                        if (tc2Var2.m == iZ2) {
                            tc2Var = tc2Var2;
                            if (tc2Var != null) {
                                gk0.l(fx3.e(iZ2, "TYPE_RST_STREAM unexpected error code: "));
                                return false;
                            }
                            i83Var = (i83) e3Var.n;
                            if (i2 == 0 && (iZ & 1) == 0) {
                                go7.b(i83Var.u, i83Var.f1043o + '[' + i2 + "] onReset", new e83(i83Var, i2, tc2Var));
                                return true;
                            }
                            p83VarQ = i83Var.q(i2);
                            if (p83VarQ != null) {
                                synchronized (p83VarQ) {
                                    if (p83VarQ.g() == null) {
                                        p83VarQ.x = tc2Var;
                                        p83VarQ.notifyAll();
                                    }
                                    break;
                                }
                                return true;
                            }
                            return true;
                        }
                    }
                    if (tc2Var != null) {
                        gk0.l(fx3.e(iZ2, "TYPE_RST_STREAM unexpected error code: "));
                        return false;
                    }
                    i83Var = (i83) e3Var.n;
                    if (i2 == 0) {
                    }
                    p83VarQ = i83Var.q(i2);
                    if (p83VarQ != null) {
                        synchronized (p83VarQ) {
                            if (p83VarQ.g() == null) {
                                p83VarQ.x = tc2Var;
                                p83VarQ.notifyAll();
                                break;
                            }
                            return true;
                        }
                    }
                    return true;
                case 4:
                    w36 w36Var2 = this.m;
                    if (i2 != 0) {
                        gk0.l("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((bQ & 1) != 0) {
                        if (iL != 0) {
                            gk0.l("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iL % 6 != 0) {
                        gk0.l(fx3.e(iL, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    hv6 hv6Var = new hv6();
                    wk3 wk3VarZ = ct1.Z(ct1.b0(0, iL), 6);
                    int i3 = wk3VarZ.m;
                    int i4 = wk3VarZ.n;
                    int i5 = wk3VarZ.f2422o;
                    if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                        while (true) {
                            short sJ = w36Var2.J();
                            byte[] bArr = po8.a;
                            int i6 = sJ & 65535;
                            int iZ3 = w36Var2.z();
                            if (i6 != 2) {
                                if (i6 != 4) {
                                    if (i6 == 5 && (iZ3 < 16384 || iZ3 > 16777215)) {
                                        gk0.l(fx3.e(iZ3, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                        return false;
                                    }
                                } else if (iZ3 < 0) {
                                    gk0.l("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return false;
                                }
                            } else if (iZ3 != 0 && iZ3 != 1) {
                                gk0.l("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                return false;
                            }
                            hv6Var.b(i6, iZ3);
                            if (i3 != i4) {
                                i3 += i5;
                            }
                        }
                    }
                    i83 i83Var3 = (i83) e3Var.n;
                    go7.b(i83Var3.t, e41.l(new StringBuilder(), i83Var3.f1043o, " applyAndAckSettings"), new ql1(e3Var, hv6Var, (byte) 14));
                    return true;
                case 5:
                    z(e3Var, iL, i, i2);
                    return true;
                case 6:
                    if (iL != 8) {
                        gk0.l(fx3.e(iL, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i2 != 0) {
                        gk0.l("TYPE_PING streamId != 0");
                        return false;
                    }
                    final int iZ4 = this.m.z();
                    final int iZ5 = this.m.z();
                    i = (bQ & 1) != 0 ? 1 : 0;
                    i83 i83Var4 = (i83) e3Var.n;
                    if (i == 0) {
                        go7 go7Var = i83Var4.t;
                        String strL = e41.l(new StringBuilder(), ((i83) e3Var.n).f1043o, " ping");
                        final i83 i83Var5 = (i83) e3Var.n;
                        go7.b(go7Var, strL, new Function0() { // from class: o.h83
                            @Override // kotlin.jvm.functions.Function0
                            public final Object a() {
                                i83 i83Var6 = i83Var5;
                                try {
                                    i83Var6.I.F(iZ4, iZ5, true);
                                } catch (IOException e) {
                                    tc2 tc2Var3 = tc2.PROTOCOL_ERROR;
                                    i83Var6.e(tc2Var3, tc2Var3, e);
                                }
                                return f88.a;
                            }
                        });
                        return true;
                    }
                    synchronized (i83Var4) {
                        try {
                            if (iZ4 == 1) {
                                i83Var4.x++;
                            } else if (iZ4 == 2) {
                                i83Var4.z++;
                            } else if (iZ4 == 3) {
                                i83Var4.notifyAll();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                case 7:
                    if (iL < 8) {
                        gk0.l(fx3.e(iL, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i2 != 0) {
                        gk0.l("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int iZ6 = this.m.z();
                    int iZ7 = this.m.z();
                    int i7 = iL - 8;
                    tc2.n.getClass();
                    for (tc2 tc2Var3 : tc2.values()) {
                        if (tc2Var3.m == iZ7) {
                            tc2Var = tc2Var3;
                            if (tc2Var != null) {
                                gk0.l(fx3.e(iZ7, "TYPE_GOAWAY unexpected error code: "));
                                return false;
                            }
                            ai0VarU = ai0.p;
                            if (i7 > 0) {
                                ai0VarU = this.m.u(i7);
                            }
                            ai0VarU.getClass();
                            ai0VarU.d();
                            i83Var2 = (i83) e3Var.n;
                            synchronized (i83Var2) {
                                Object[] array = i83Var2.n.values().toArray(new p83[0]);
                                i83Var2.r = true;
                            }
                            for (p83 p83Var : (p83[]) array) {
                                if (p83Var.m <= iZ6 && p83Var.h()) {
                                    tc2 tc2Var4 = tc2.REFUSED_STREAM;
                                    synchronized (p83Var) {
                                        if (p83Var.g() == null) {
                                            p83Var.x = tc2Var4;
                                            p83Var.notifyAll();
                                        }
                                        break;
                                    }
                                    ((i83) e3Var.n).q(p83Var.m);
                                }
                            }
                            return true;
                        }
                    }
                    if (tc2Var != null) {
                        gk0.l(fx3.e(iZ7, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    ai0VarU = ai0.p;
                    if (i7 > 0) {
                        ai0VarU = this.m.u(i7);
                    }
                    ai0VarU.getClass();
                    ai0VarU.d();
                    i83Var2 = (i83) e3Var.n;
                    synchronized (i83Var2) {
                        Object[] array2 = i83Var2.n.values().toArray(new p83[0]);
                        i83Var2.r = true;
                        while (i < r13) {
                            if (p83Var.m <= iZ6) {
                            }
                        }
                        return true;
                    }
                case 8:
                    try {
                        if (iL != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iL);
                        }
                        long jZ = ((long) this.m.z()) & 2147483647L;
                        if (jZ == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        Logger logger2 = p;
                        if (logger2.isLoggable(Level.FINE)) {
                            logger2.fine(a83.c(true, i2, iL, jZ));
                        }
                        i83 i83Var6 = (i83) e3Var.n;
                        if (i2 == 0) {
                            synchronized (i83Var6) {
                                i83Var6.G += jZ;
                                i83Var6.notifyAll();
                            }
                            return true;
                        }
                        p83 p83VarJ = i83Var6.j(i2);
                        if (p83VarJ != null) {
                            synchronized (p83VarJ) {
                                p83VarJ.q += jZ;
                                if (jZ > 0) {
                                    p83VarJ.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e) {
                        p.fine(a83.b(true, i2, iL, 8, i));
                        throw e;
                    }
                default:
                    this.m.skip(iL);
                    return true;
            }
        } catch (EOFException unused) {
        }
    }

    public final void j(e3 e3Var, int i, int i2, final int i3) throws IOException {
        int i4;
        boolean z;
        boolean z2;
        if (i3 == 0) {
            gk0.l("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z3 = true;
        if ((i2 & 1) == 0) {
            z3 = false;
        }
        if ((i2 & 32) != 0) {
            gk0.l("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte bQ = this.m.q();
            byte[] bArr = po8.a;
            i4 = bQ & 255;
        } else {
            i4 = 0;
        }
        final int iG = et1.G(i, i2, i4);
        w36 w36Var = this.m;
        final i83 i83Var = (i83) e3Var.n;
        if (i3 != 0 && (i3 & 1) == 0) {
            final bf0 bf0Var = new bf0();
            long j = iG;
            w36Var.k0(j);
            w36Var.i0(bf0Var, j);
            go7.b(i83Var.u, i83Var.f1043o + '[' + i3 + "] onData", new Function0(i3, bf0Var, iG, z3) { // from class: o.c83
                public final /* synthetic */ int n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ bf0 f501o;
                public final /* synthetic */ int p;

                @Override // kotlin.jvm.functions.Function0
                public final Object a() {
                    i83 i83Var2 = this.m;
                    int i5 = this.n;
                    bf0 bf0Var2 = this.f501o;
                    int i6 = this.p;
                    try {
                        i83Var2.w.getClass();
                        bf0Var2.skip(i6);
                        i83Var2.I.G(i5, tc2.CANCEL);
                        synchronized (i83Var2) {
                            i83Var2.K.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return f88.a;
                }
            });
        } else {
            p83 p83VarJ = i83Var.j(i3);
            if (p83VarJ == null) {
                ((i83) e3Var.n).G(i3, tc2.PROTOCOL_ERROR);
                long j2 = iG;
                ((i83) e3Var.n).z(j2);
                w36Var.skip(j2);
            } else {
                TimeZone timeZone = ro8.a;
                n83 n83Var = p83VarJ.t;
                long j3 = iG;
                n83Var.getClass();
                long j4 = j3;
                while (true) {
                    p83 p83Var = n83Var.r;
                    if (j4 <= 0) {
                        TimeZone timeZone2 = ro8.a;
                        p83Var.n.z(j3);
                        n83Var.r.n.B.getClass();
                        break;
                    }
                    synchronized (p83Var) {
                        z = n83Var.n;
                        z2 = n83Var.p.n + j4 > n83Var.m;
                    }
                    if (z2) {
                        w36Var.skip(j4);
                        n83Var.r.f(tc2.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z) {
                        w36Var.skip(j4);
                        break;
                    }
                    long jI0 = w36Var.i0(n83Var.f1552o, j4);
                    if (jI0 == -1) {
                        throw new EOFException();
                    }
                    j4 -= jI0;
                    p83 p83Var2 = n83Var.r;
                    synchronized (p83Var2) {
                        try {
                            if (n83Var.q) {
                                n83Var.f1552o.e();
                            } else {
                                bf0 bf0Var2 = n83Var.p;
                                boolean z4 = bf0Var2.n == 0;
                                bf0Var2.T0(n83Var.f1552o);
                                if (z4) {
                                    p83Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z3) {
                    p83VarJ.j(k53.n, true);
                }
            }
        }
        this.m.skip(i4);
    }

    public final List q(int i, int i2, int i3, int i4) throws IOException {
        k83 k83Var = this.n;
        k83Var.p = i;
        k83Var.q = i2;
        k83Var.n = i3;
        k83Var.f1236o = i4;
        q63 q63Var = this.f1341o;
        w36 w36Var = q63Var.d;
        while (!w36Var.e()) {
            byte bQ = w36Var.q();
            byte[] bArr = po8.a;
            int i5 = bQ & 255;
            if (i5 == 128) {
                gk0.l("index == 0");
                return null;
            }
            if ((bQ & 128) == 128) {
                int iF = q63Var.f(i5, 127);
                int i6 = iF - 1;
                if (i6 >= 0) {
                    d53[] d53VarArr = s63.a;
                    if (i6 <= d53VarArr.length - 1) {
                        q63Var.a(d53VarArr[i6]);
                    }
                }
                int length = q63Var.f + 1 + (i6 - s63.a.length);
                if (length >= 0) {
                    d53[] d53VarArr2 = q63Var.e;
                    if (length < d53VarArr2.length) {
                        d53 d53Var = d53VarArr2[length];
                        d53Var.getClass();
                        q63Var.a(d53Var);
                    }
                }
                gk0.l(fx3.e(iF, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                d53[] d53VarArr3 = s63.a;
                ai0 ai0VarE = q63Var.e();
                s63.a(ai0VarE);
                q63Var.d(new d53(ai0VarE, q63Var.e()));
            } else if ((bQ & 64) == 64) {
                q63Var.d(new d53(q63Var.c(q63Var.f(i5, 63) - 1), q63Var.e()));
            } else if ((bQ & 32) == 32) {
                int iF2 = q63Var.f(i5, 31);
                q63Var.a = iF2;
                if (iF2 < 0 || iF2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + q63Var.a);
                }
                int i7 = q63Var.h;
                if (iF2 < i7) {
                    if (iF2 == 0) {
                        d53[] d53VarArr4 = q63Var.e;
                        cx.N0(0, d53VarArr4.length, null, d53VarArr4);
                        q63Var.f = q63Var.e.length - 1;
                        q63Var.g = 0;
                        q63Var.h = 0;
                    } else {
                        q63Var.b(i7 - iF2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                d53[] d53VarArr5 = s63.a;
                ai0 ai0VarE2 = q63Var.e();
                s63.a(ai0VarE2);
                q63Var.a(new d53(ai0VarE2, q63Var.e()));
            } else {
                q63Var.a(new d53(q63Var.c(q63Var.f(i5, 15) - 1), q63Var.e()));
            }
        }
        ArrayList arrayList = q63Var.b;
        List listP0 = lv0.P0(arrayList);
        arrayList.clear();
        q63Var.c = 0L;
        return listP0;
    }

    public final void u(e3 e3Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            gk0.l("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte bQ = this.m.q();
            byte[] bArr = po8.a;
            i4 = bQ & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            w36 w36Var = this.m;
            w36Var.z();
            w36Var.q();
            byte[] bArr2 = po8.a;
            i -= 5;
        }
        List listQ = q(et1.G(i, i2, i4), i4, i2, i3);
        i83 i83Var = (i83) e3Var.n;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            go7.b(i83Var.u, i83Var.f1043o + '[' + i3 + "] onHeaders", new d83(i83Var, i3, listQ, z2));
            return;
        }
        synchronized (i83Var) {
            p83 p83VarJ = i83Var.j(i3);
            if (p83VarJ != null) {
                p83VarJ.j(ro8.h(listQ), z2);
                return;
            }
            if (i83Var.r) {
                return;
            }
            if (i3 <= i83Var.p) {
                return;
            }
            if (i3 % 2 == i83Var.q % 2) {
                return;
            }
            p83 p83Var = new p83(i3, i83Var, false, z2, ro8.h(listQ));
            i83Var.p = i3;
            i83Var.n.put(Integer.valueOf(i3), p83Var);
            go7.b(i83Var.s.d(), i83Var.f1043o + '[' + i3 + "] onStream", new ql1(i83Var, p83Var, (byte) 13));
        }
    }

    public final void z(e3 e3Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            gk0.l("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        if ((i2 & 8) != 0) {
            byte bQ = this.m.q();
            byte[] bArr = po8.a;
            i4 = bQ & 255;
        } else {
            i4 = 0;
        }
        int iZ = this.m.z() & Integer.MAX_VALUE;
        List listQ = q(et1.G(i - 4, i2, i4), i4, i2, i3);
        i83 i83Var = (i83) e3Var.n;
        synchronized (i83Var) {
            if (i83Var.K.contains(Integer.valueOf(iZ))) {
                i83Var.G(iZ, tc2.PROTOCOL_ERROR);
                return;
            }
            i83Var.K.add(Integer.valueOf(iZ));
            go7.b(i83Var.u, i83Var.f1043o + '[' + iZ + "] onRequest", new d83(i83Var, iZ, listQ));
        }
    }
}
