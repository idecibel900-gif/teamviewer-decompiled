package io.sentry;

import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import o.ep1;

/* JADX INFO: loaded from: classes.dex */
public final class r2 implements w3 {
    public final io.sentry.vendor.gson.stream.a m;
    public final ArrayDeque n = new ArrayDeque();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f254o = 0;

    public r2(Reader reader) {
        this.m = new io.sentry.vendor.gson.stream.a(reader);
    }

    @Override // io.sentry.w3
    public final Long A() throws IOException {
        if (this.m.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Long.valueOf(nextLong());
        }
        q();
        return null;
    }

    @Override // io.sentry.w3
    public final void A0() throws IOException {
        this.m.A0();
        this.f254o--;
    }

    @Override // io.sentry.w3
    public final ArrayList B0(g1 g1Var, f2 f2Var) throws IOException {
        boolean z;
        io.sentry.vendor.gson.stream.a aVar = this.m;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            q();
            return null;
        }
        D0();
        ArrayList arrayList = new ArrayList();
        while (aVar.hasNext()) {
            q2 q2Var = new q2(this.f254o, aVar.peek());
            this.n.addLast(q2Var);
            try {
                try {
                    arrayList.add(f2Var.a(this, g1Var));
                } catch (Exception e) {
                    g1Var.d(f6.WARNING, "Failed to deserialize object in list.", e);
                    try {
                        u(q2Var);
                        z = true;
                    } catch (Exception e2) {
                        g1Var.d(f6.ERROR, "Stream unrecoverable, aborting list deserialization.", e2);
                        z = false;
                    }
                    if (!z) {
                        e(q2Var);
                        A0();
                        return arrayList;
                    }
                }
                e(q2Var);
            } catch (Throwable th) {
                e(q2Var);
                throw th;
            }
        }
        A0();
        return arrayList;
    }

    @Override // io.sentry.w3
    public final void D0() throws IOException {
        this.m.D0();
        j();
        this.f254o++;
    }

    @Override // io.sentry.w3
    public final TimeZone E(g1 g1Var) throws IOException {
        if (this.m.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            q();
            return null;
        }
        try {
            return TimeZone.getTimeZone(r());
        } catch (Exception e) {
            g1Var.d(f6.ERROR, "Error when deserializing TimeZone", e);
            return null;
        }
    }

    @Override // io.sentry.w3
    public final String H() throws IOException {
        if (this.m.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return r();
        }
        q();
        return null;
    }

    @Override // io.sentry.w3
    public final void I(boolean z) {
        this.m.n = z;
    }

    @Override // io.sentry.w3
    public final HashMap L(g1 g1Var, f2 f2Var) throws IOException {
        boolean z;
        io.sentry.vendor.gson.stream.a aVar = this.m;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            q();
            return null;
        }
        u0();
        HashMap map = new HashMap();
        if (aVar.hasNext()) {
            while (true) {
                String strU = aVar.U();
                q2 q2Var = new q2(this.f254o, aVar.peek());
                this.n.addLast(q2Var);
                try {
                    try {
                        map.put(strU, f2Var.a(this, g1Var));
                    } catch (Exception e) {
                        g1Var.d(f6.WARNING, "Failed to deserialize object in map.", e);
                        try {
                            u(q2Var);
                            z = true;
                        } catch (Exception e2) {
                            g1Var.d(f6.ERROR, "Stream unrecoverable, aborting map deserialization.", e2);
                            z = false;
                        }
                        if (!z) {
                            e(q2Var);
                            break;
                        }
                        Z();
                        return map;
                    }
                    e(q2Var);
                    if (aVar.peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && aVar.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                } catch (Throwable th) {
                    e(q2Var);
                    throw th;
                }
            }
        }
        Z();
        return map;
    }

    @Override // io.sentry.w3
    public final Double S() throws IOException {
        if (this.m.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Double.valueOf(nextDouble());
        }
        q();
        return null;
    }

    @Override // io.sentry.w3
    public final String U() {
        return this.m.U();
    }

    @Override // io.sentry.w3
    public final void Z() throws IOException {
        this.m.Z();
        this.f254o--;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    @Override // io.sentry.w3
    public final Date d0(g1 g1Var) throws IOException {
        if (this.m.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            q();
            return null;
        }
        String strR = r();
        if (strR == null) {
            return null;
        }
        try {
            try {
                return io.sentry.config.a.p(strR);
            } catch (Exception e) {
                g1Var.d(f6.ERROR, "Error when deserializing millis timestamp format.", e);
                return null;
            }
        } catch (Exception unused) {
            return io.sentry.config.a.q(strR);
        }
    }

    public final void e(q2 q2Var) {
        if (q2Var == null) {
            return;
        }
        ArrayDeque arrayDeque = this.n;
        if (arrayDeque.isEmpty() || arrayDeque.peekLast() != q2Var) {
            arrayDeque.remove(q2Var);
        } else {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.w3
    public final Boolean f0() throws IOException {
        io.sentry.vendor.gson.stream.a aVar = this.m;
        if (aVar.peek() == io.sentry.vendor.gson.stream.b.NULL) {
            q();
            return null;
        }
        boolean zF = aVar.F();
        j();
        return Boolean.valueOf(zF);
    }

    @Override // io.sentry.w3
    public final boolean hasNext() {
        return this.m.hasNext();
    }

    public final void j() {
        q2 q2Var = (q2) this.n.peekLast();
        if (q2Var != null) {
            q2Var.c = true;
        }
    }

    @Override // io.sentry.w3
    public final double nextDouble() {
        double dNextDouble = this.m.nextDouble();
        j();
        return dNextDouble;
    }

    @Override // io.sentry.w3
    public final float nextFloat() throws IOException {
        double dNextDouble = this.m.nextDouble();
        j();
        return (float) dNextDouble;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00cc, please report this as an issue */
    @Override // io.sentry.w3
    public final int nextInt() throws IOException {
        String strY;
        int i;
        double d;
        io.sentry.vendor.gson.stream.a aVar = this.m;
        int iJ = aVar.t;
        if (iJ == 0) {
            iJ = aVar.j();
        }
        if (iJ == 15) {
            long j = aVar.u;
            i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + aVar.u + aVar.z());
            }
            aVar.t = 0;
            int[] iArr = aVar.A;
            int i2 = aVar.y - 1;
            iArr[i2] = iArr[i2] + 1;
        } else {
            if (iJ == 16) {
                aVar.w = new String(aVar.f272o, aVar.p, aVar.v);
                aVar.p += aVar.v;
            } else {
                if (iJ != 8 && iJ != 9 && iJ != 10) {
                    StringBuilder sb = new StringBuilder("Expected an int but was ");
                    sb.append(aVar.peek());
                    h2.l(sb, aVar.z());
                    return 0;
                }
                if (iJ == 10) {
                    strY = aVar.b0();
                    aVar.w = strY;
                } else {
                    strY = aVar.Y(iJ == 8 ? '\'' : '\"');
                    aVar.w = strY;
                }
                try {
                    i = Integer.parseInt(strY);
                    aVar.t = 0;
                    int[] iArr2 = aVar.A;
                    int i3 = aVar.y - 1;
                    iArr2[i3] = iArr2[i3] + 1;
                } catch (NumberFormatException unused) {
                    aVar.t = 11;
                    d = Double.parseDouble(aVar.w);
                    i = (int) d;
                    if (i == d) {
                        throw new NumberFormatException("Expected an int but was " + aVar.w + aVar.z());
                    }
                    aVar.w = null;
                    aVar.t = 0;
                    int[] iArr3 = aVar.A;
                    int i4 = aVar.y - 1;
                    iArr3[i4] = iArr3[i4] + 1;
                }
            }
            aVar.t = 11;
            d = Double.parseDouble(aVar.w);
            i = (int) d;
            if (i == d) {
                throw new NumberFormatException("Expected an int but was " + aVar.w + aVar.z());
            }
            aVar.w = null;
            aVar.t = 0;
            int[] iArr4 = aVar.A;
            int i5 = aVar.y - 1;
            iArr4[i5] = iArr4[i5] + 1;
        }
        j();
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00af, please report this as an issue */
    @Override // io.sentry.w3
    public final long nextLong() throws IOException {
        String strY;
        long j;
        double d;
        long j2;
        io.sentry.vendor.gson.stream.a aVar = this.m;
        int iJ = aVar.t;
        if (iJ == 0) {
            iJ = aVar.j();
        }
        if (iJ == 15) {
            aVar.t = 0;
            int[] iArr = aVar.A;
            int i = aVar.y - 1;
            iArr[i] = iArr[i] + 1;
            j = aVar.u;
        } else {
            if (iJ == 16) {
                aVar.w = new String(aVar.f272o, aVar.p, aVar.v);
                aVar.p += aVar.v;
            } else {
                if (iJ != 8 && iJ != 9 && iJ != 10) {
                    StringBuilder sb = new StringBuilder("Expected a long but was ");
                    sb.append(aVar.peek());
                    h2.l(sb, aVar.z());
                    return 0L;
                }
                if (iJ == 10) {
                    strY = aVar.b0();
                    aVar.w = strY;
                } else {
                    strY = aVar.Y(iJ == 8 ? '\'' : '\"');
                    aVar.w = strY;
                }
                try {
                    long j3 = Long.parseLong(strY);
                    aVar.t = 0;
                    int[] iArr2 = aVar.A;
                    int i2 = aVar.y - 1;
                    iArr2[i2] = iArr2[i2] + 1;
                    j = j3;
                } catch (NumberFormatException unused) {
                    aVar.t = 11;
                    d = Double.parseDouble(aVar.w);
                    j2 = (long) d;
                    if (j2 == d) {
                        throw new NumberFormatException("Expected a long but was " + aVar.w + aVar.z());
                    }
                    aVar.w = null;
                    aVar.t = 0;
                    int[] iArr3 = aVar.A;
                    int i3 = aVar.y - 1;
                    iArr3[i3] = iArr3[i3] + 1;
                    j = j2;
                }
            }
            aVar.t = 11;
            d = Double.parseDouble(aVar.w);
            j2 = (long) d;
            if (j2 == d) {
                throw new NumberFormatException("Expected a long but was " + aVar.w + aVar.z());
            }
            aVar.w = null;
            aVar.t = 0;
            int[] iArr4 = aVar.A;
            int i4 = aVar.y - 1;
            iArr4[i4] = iArr4[i4] + 1;
            j = j2;
        }
        j();
        return j;
    }

    @Override // io.sentry.w3
    public final Float p0() throws IOException {
        if (this.m.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Float.valueOf(nextFloat());
        }
        q();
        return null;
    }

    @Override // io.sentry.w3
    public final io.sentry.vendor.gson.stream.b peek() {
        return this.m.peek();
    }

    public final void q() throws IOException {
        this.m.J();
        j();
    }

    @Override // io.sentry.w3
    public final Object q0(g1 g1Var, f2 f2Var) throws IOException {
        if (this.m.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return f2Var.a(this, g1Var);
        }
        q();
        return null;
    }

    @Override // io.sentry.w3
    public final String r() throws IOException {
        String strR = this.m.r();
        j();
        return strR;
    }

    @Override // io.sentry.w3
    public final Object t0() throws IOException {
        p2 p2Var = new p2();
        boolean zB = false;
        while (!zB) {
            int[] iArr = i2.a;
            io.sentry.vendor.gson.stream.a aVar = this.m;
            int i = iArr[aVar.peek().ordinal()];
            ArrayList arrayList = p2Var.a;
            switch (i) {
                case 1:
                    D0();
                    arrayList.add(new l2());
                    break;
                case 2:
                    A0();
                    zB = p2Var.b();
                    break;
                case 3:
                    u0();
                    arrayList.add(new m2());
                    break;
                case 4:
                    Z();
                    zB = p2Var.b();
                    break;
                case 5:
                    arrayList.add(new n2(aVar.U()));
                    break;
                case 6:
                    zB = p2Var.c(new g2(this, (byte) 0));
                    break;
                case 7:
                    zB = p2Var.c(new g2(p2Var, this));
                    break;
                case 8:
                    zB = p2Var.c(new g2(this, (byte) 2));
                    break;
                case ep1.b /* 9 */:
                    q();
                    zB = p2Var.c(new h2((byte) 0));
                    break;
                case ep1.c /* 10 */:
                    zB = true;
                    break;
            }
        }
        k2 k2VarA = p2Var.a();
        if (k2VarA != null) {
            return k2VarA.getValue();
        }
        return null;
    }

    public final void u(q2 q2Var) throws IOException {
        io.sentry.vendor.gson.stream.a aVar;
        while (true) {
            int i = this.f254o;
            int i2 = q2Var.a;
            aVar = this.m;
            if (i <= i2) {
                break;
            }
            io.sentry.vendor.gson.stream.b bVarPeek = aVar.peek();
            if (bVarPeek == io.sentry.vendor.gson.stream.b.END_OBJECT) {
                Z();
            } else if (bVarPeek == io.sentry.vendor.gson.stream.b.END_ARRAY) {
                A0();
            } else {
                v();
            }
        }
        if (q2Var.c || aVar.peek() != q2Var.b) {
            return;
        }
        v();
    }

    @Override // io.sentry.w3
    public final void u0() throws IOException {
        this.m.u0();
        j();
        this.f254o++;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009d. Please report as an issue. */
    @Override // io.sentry.w3
    public final void v() throws IOException {
        io.sentry.vendor.gson.stream.a aVar;
        int i = 0;
        do {
            aVar = this.m;
            int iJ = aVar.t;
            if (iJ == 0) {
                iJ = aVar.j();
            }
            if (iJ == 3) {
                aVar.c0(1);
            } else {
                if (iJ == 1) {
                    aVar.c0(3);
                } else if (iJ == 4 || iJ == 2) {
                    aVar.y--;
                    i--;
                } else if (iJ == 14 || iJ == 10) {
                    while (true) {
                        int i2 = 0;
                        while (true) {
                            int i3 = aVar.p + i2;
                            if (i3 < aVar.q) {
                                char c = aVar.f272o[i3];
                                if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                                    if (c != '#') {
                                        if (c != ',') {
                                            if (c != '/' && c != '=') {
                                                if (c != '{' && c != '}' && c != ':') {
                                                    if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i2++;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    aVar.e();
                                }
                                aVar.p += i2;
                            } else {
                                aVar.p = i3;
                                if (!aVar.q(1)) {
                                }
                            }
                        }
                    }
                } else if (iJ == 8 || iJ == 12) {
                    aVar.l0('\'');
                } else if (iJ == 9 || iJ == 13) {
                    aVar.l0('\"');
                } else if (iJ == 16) {
                    aVar.p += aVar.v;
                }
                aVar.t = 0;
            }
            i++;
            aVar.t = 0;
        } while (i != 0);
        int[] iArr = aVar.A;
        int i4 = aVar.y - 1;
        iArr[i4] = iArr[i4] + 1;
        aVar.z[i4] = "null";
        j();
    }

    @Override // io.sentry.w3
    public final Integer w() throws IOException {
        if (this.m.peek() != io.sentry.vendor.gson.stream.b.NULL) {
            return Integer.valueOf(nextInt());
        }
        q();
        return null;
    }

    @Override // io.sentry.w3
    public final void y(g1 g1Var, AbstractMap abstractMap, String str) throws Throwable {
        q2 q2Var = null;
        try {
            try {
                q2 q2Var2 = new q2(this.f254o, this.m.peek());
                this.n.addLast(q2Var2);
                try {
                    abstractMap.put(str, t0());
                    e(q2Var2);
                } catch (Exception e) {
                    e = e;
                    q2Var = q2Var2;
                    g1Var.b(f6.ERROR, e, "Error deserializing unknown key: %s", str);
                    if (q2Var != null) {
                        try {
                            u(q2Var);
                        } catch (Exception e2) {
                            g1Var.d(f6.ERROR, "Stream unrecoverable after unknown key deserialization failure.", e2);
                        }
                    }
                    e(q2Var);
                } catch (Throwable th) {
                    th = th;
                    q2Var = q2Var2;
                    e(q2Var);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}
