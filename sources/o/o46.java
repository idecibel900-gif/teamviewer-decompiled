package o;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class o46 {
    public final io7 a;
    public final q82 b;
    public final int c;
    public final short d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final dc i;
    public final g95 j;
    public final a46 k;
    public final boolean l;
    public nd m;
    public l46 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public xf6 f1628o;
    public final kw p;

    /* JADX WARN: Multi-variable type inference failed */
    public o46(io7 io7Var, q82 q82Var, int i, int i2, int i3, int i4, boolean z, boolean z2, dc dcVar, g95 g95Var, a46 a46Var, ab6 ab6Var) {
        io7Var.getClass();
        g95Var.getClass();
        this.a = io7Var;
        this.b = q82Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = dcVar;
        this.j = g95Var;
        this.k = a46Var;
        this.l = !im3.n(ab6Var.b, "GET");
        this.p = new kw();
    }

    public final boolean a(b46 b46Var) {
        l46 l46Var;
        xf6 xf6Var;
        if (this.p.isEmpty() && this.f1628o == null) {
            if (b46Var != null) {
                synchronized (b46Var) {
                    xf6Var = null;
                    if (b46Var.l == 0 && b46Var.j && ro8.a(b46Var.c.a.h, this.i.h)) {
                        xf6Var = b46Var.c;
                    }
                }
                if (xf6Var != null) {
                    this.f1628o = xf6Var;
                    return true;
                }
            }
            nd ndVar = this.m;
            if ((ndVar == null || ndVar.n >= ((ArrayList) ndVar.f1562o).size()) && (l46Var = this.n) != null) {
                return l46Var.a();
            }
        }
        return true;
    }

    public final zf6 b() {
        Socket socketI;
        kd6 kd6Var;
        f31 f31VarC;
        String hostAddress;
        int port;
        ArrayList arrayList;
        List<xf6> listR;
        boolean zContains;
        b46 b46Var = this.k.u;
        if (b46Var == null) {
            kd6Var = null;
        } else {
            boolean zG = b46Var.g(this.l);
            synchronized (b46Var) {
                boolean z = b46Var.j;
                try {
                    if (!zG) {
                        b46Var.j = true;
                        socketI = this.k.i();
                    } else if (!z) {
                        h93 h93Var = b46Var.c.a.h;
                        h93 h93Var2 = this.i.h;
                        socketI = !(h93Var.e == h93Var2.e && im3.n(h93Var.d, h93Var2.d)) ? this.k.i() : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.k.u == null) {
                if (socketI != null) {
                    ro8.c(socketI);
                }
                this.k.p.k(this.k, b46Var);
                kd6Var = null;
            } else {
                if (socketI != null) {
                    hk0.l("Check failed.");
                    return null;
                }
                kd6Var = new kd6(b46Var);
            }
        }
        if (kd6Var != null) {
            return kd6Var;
        }
        kd6 kd6VarD = d(null, null);
        if (kd6VarD != null) {
            return kd6VarD;
        }
        if (!this.p.isEmpty()) {
            return (zf6) this.p.removeFirst();
        }
        xf6 xf6Var = this.f1628o;
        if (xf6Var != null) {
            this.f1628o = null;
            f31VarC = c(xf6Var, null);
        } else {
            nd ndVar = this.m;
            if (ndVar == null || ndVar.n >= ((ArrayList) ndVar.f1562o).size()) {
                l46 l46Var = this.n;
                if (l46Var == null) {
                    l46Var = new l46(this.i, this.j, this.k, this.h);
                    this.n = l46Var;
                }
                if (!l46Var.a()) {
                    gk0.l("exhausted all routes");
                    return null;
                }
                if (!l46Var.a()) {
                    yq4.p();
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                while (l46Var.c < l46Var.b.size()) {
                    if (l46Var.c >= l46Var.b.size()) {
                        throw new SocketException("No route to " + ((dc) l46Var.d).h.d + "; exhausted proxy configurations: " + l46Var.b);
                    }
                    List list = l46Var.b;
                    int i = l46Var.c;
                    l46Var.c = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        h93 h93Var3 = ((dc) l46Var.d).h;
                        hostAddress = h93Var3.d;
                        port = h93Var3.e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            yq4.q(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                            return null;
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            hostAddress.getClass();
                        } else {
                            hostAddress = address.getHostAddress();
                            hostAddress.getClass();
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        dc dcVar = (dc) l46Var.d;
                        InetSocketAddress inetSocketAddressCreateUnresolved = InetSocketAddress.createUnresolved(hostAddress, port);
                        inetSocketAddressCreateUnresolved.getClass();
                        listR = qf0.K(new xf6(dcVar, proxy, inetSocketAddressCreateUnresolved, null));
                    } else {
                        e96 e96Var = no8.a;
                        hostAddress.getClass();
                        if (no8.a.c(hostAddress)) {
                            listR = qf0.K(new xf6((dc) l46Var.d, proxy, new InetSocketAddress(InetAddress.getByName(hostAddress), port), null));
                        } else {
                            ((a46) l46Var.f).p.m((a46) l46Var.f, hostAddress);
                            ((dc) l46Var.d).a.b(new f32(hostAddress, (im3.n(((dc) l46Var.d).h.a, "https") || port != 80) ? port : -1));
                            List listA = ((dc) l46Var.d).a.a(hostAddress);
                            ArrayList arrayList3 = new ArrayList(mv0.Z(listA, 10));
                            Iterator it = listA.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(new xf6((dc) l46Var.d, proxy, new InetSocketAddress((InetAddress) it.next(), port), null));
                            }
                            if (arrayList3.isEmpty()) {
                                throw new UnknownHostException(((dc) l46Var.d).a + " returned no addresses for " + hostAddress);
                            }
                            ae2 ae2Var = ((a46) l46Var.f).p;
                            a46 a46Var = (a46) l46Var.f;
                            ArrayList arrayList4 = new ArrayList(mv0.Z(arrayList3, 10));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(((xf6) it2.next()).c.getAddress());
                            }
                            ae2Var.l(a46Var, hostAddress, arrayList4);
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj : arrayList3) {
                                if (((xf6) obj).d != null) {
                                    arrayList5.add(obj);
                                }
                            }
                            boolean zIsEmpty = arrayList5.isEmpty();
                            arrayList = arrayList5;
                            if (zIsEmpty) {
                                arrayList = arrayList3;
                            }
                            listR = arrayList;
                            if (l46Var.a && arrayList.size() >= 2) {
                                listR = arrayList;
                                ArrayList arrayList6 = new ArrayList();
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj2 : arrayList) {
                                    if (((xf6) obj2).c.getAddress() instanceof Inet6Address) {
                                        arrayList6.add(obj2);
                                    } else {
                                        arrayList7.add(obj2);
                                    }
                                }
                                listR = arrayList;
                                if (!arrayList6.isEmpty() && !arrayList7.isEmpty()) {
                                    listR = arrayList;
                                    byte[] bArr = po8.a;
                                    Iterator it3 = arrayList6.iterator();
                                    Iterator it4 = arrayList7.iterator();
                                    sa4 sa4VarT = qf0.t();
                                    while (true) {
                                        if (!it3.hasNext() && !it4.hasNext()) {
                                            break;
                                        }
                                        if (it3.hasNext()) {
                                            sa4VarT.add(it3.next());
                                        }
                                        if (it4.hasNext()) {
                                            sa4VarT.add(it4.next());
                                        }
                                    }
                                    listR = qf0.r(sa4VarT);
                                }
                            }
                        }
                    }
                    listR = arrayList;
                    listR = arrayList;
                    for (xf6 xf6Var2 : listR) {
                        g95 g95Var = (g95) l46Var.e;
                        synchronized (g95Var) {
                            xf6Var2.getClass();
                            zContains = ((LinkedHashSet) g95Var.m).contains(xf6Var2);
                        }
                        if (zContains) {
                            ((ArrayList) l46Var.g).add(xf6Var2);
                        } else {
                            arrayList2.add(xf6Var2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                }
                if (arrayList2.isEmpty()) {
                    qv0.c0(arrayList2, (ArrayList) l46Var.g);
                    ((ArrayList) l46Var.g).clear();
                }
                nd ndVar2 = new nd((Object) arrayList2, (byte) 16);
                this.m = ndVar2;
                if (this.k.C) {
                    gk0.l("Canceled");
                    return null;
                }
                if (ndVar2.n >= arrayList2.size()) {
                    yq4.p();
                    return null;
                }
                int i2 = ndVar2.n;
                ndVar2.n = i2 + 1;
                f31VarC = c((xf6) arrayList2.get(i2), arrayList2);
            } else {
                int i3 = ndVar.n;
                ArrayList arrayList8 = (ArrayList) ndVar.f1562o;
                if (i3 >= arrayList8.size()) {
                    yq4.p();
                    return null;
                }
                int i4 = ndVar.n;
                ndVar.n = i4 + 1;
                f31VarC = c((xf6) arrayList8.get(i4), null);
            }
        }
        kd6 kd6VarD2 = d(f31VarC, f31VarC.k);
        return kd6VarD2 != null ? kd6VarD2 : f31VarC;
    }

    public final f31 c(xf6 xf6Var, ArrayList arrayList) throws UnknownServiceException {
        yw5 yw5Var = yw5.H2_PRIOR_KNOWLEDGE;
        xf6Var.getClass();
        dc dcVar = xf6Var.a;
        if (dcVar.c == null) {
            if (!dcVar.j.contains(z41.h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = xf6Var.a.h.d;
            ql5 ql5Var = ql5.a;
            if (!ql5.a.i(str)) {
                throw new UnknownServiceException(fx3.g("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (dcVar.i.contains(yw5Var)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        ab6 ab6Var = null;
        if (xf6Var.b.type() == Proxy.Type.HTTP) {
            dc dcVar2 = xf6Var.a;
            if (dcVar2.c != null || dcVar2.i.contains(yw5Var)) {
                yc4 yc4Var = new yc4((byte) 17);
                yc4Var.m = xf6Var.a.h;
                yc4Var.P("CONNECT", null);
                dc dcVar3 = xf6Var.a;
                yc4Var.L("Host", ro8.i(dcVar3.h, true));
                yc4Var.L("Proxy-Connection", "Keep-Alive");
                yc4Var.L("User-Agent", "okhttp/5.5.0");
                ab6Var = new ab6(yc4Var);
                mc6 mc6Var = nc6.m;
                nm nmVar = new nm((byte) 5);
                i67.t("Proxy-Authenticate");
                i67.u("OkHttp-Preemptive", "Proxy-Authenticate");
                nmVar.u("Proxy-Authenticate");
                i67.h(nmVar, "Proxy-Authenticate", "OkHttp-Preemptive");
                i67.i(nmVar);
                mc6Var.getClass();
                dcVar3.f.getClass();
            }
        }
        return new f31(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, xf6Var, arrayList, ab6Var, -1, false, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:14:0x0033, B:22:0x0040, B:25:0x0047), top: B:53:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #1 {all -> 0x003e, blocks: (B:14:0x0033, B:22:0x0040, B:25:0x0047), top: B:53:0x0033 }] */
    public final kd6 d(f31 f31Var, List list) {
        b46 b46Var;
        boolean z;
        Socket socketI;
        q82 q82Var = this.b;
        boolean z2 = this.l;
        dc dcVar = this.i;
        a46 a46Var = this.k;
        boolean z3 = f31Var != null && f31Var.c();
        Iterator it = ((ConcurrentLinkedQueue) q82Var.d).iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                b46Var = null;
                break;
            }
            b46Var = (b46) it.next();
            b46Var.getClass();
            synchronized (b46Var) {
                if (z3) {
                    try {
                        if (!(b46Var.i != null)) {
                            z = false;
                        } else if (b46Var.d(dcVar, list)) {
                            a46Var.a(b46Var);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (b46Var.d(dcVar, list)) {
                    z = false;
                } else {
                    a46Var.a(b46Var);
                    z = true;
                }
            }
            if (z) {
                if (b46Var.g(z2)) {
                    break;
                }
                synchronized (b46Var) {
                    b46Var.j = true;
                    socketI = a46Var.i();
                }
                if (socketI != null) {
                    ro8.c(socketI);
                }
            }
        }
        if (b46Var == null) {
            return null;
        }
        if (f31Var != null) {
            this.f1628o = f31Var.j;
            Socket socket = f31Var.r;
            if (socket != null) {
                ro8.c(socket);
            }
        }
        this.k.p.j(this.k, b46Var);
        return new kd6(b46Var);
    }
}
