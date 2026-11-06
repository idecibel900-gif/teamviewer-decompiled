package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xb6 extends sj2 {
    public static final wg5 r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ClassLoader f2505o;
    public final sj2 p;
    public final kh7 q;

    static {
        String str = wg5.n;
        r = vv.s("/");
    }

    public xb6(ClassLoader classLoader) {
        lt3 lt3Var = sj2.m;
        lt3Var.getClass();
        this.f2505o = classLoader;
        this.p = lt3Var;
        this.q = new kh7(new y26(this, (byte) 2));
    }

    @Override // o.sj2
    public final List G(wg5 wg5Var) throws FileNotFoundException {
        wg5 wg5Var2 = r;
        wg5Var2.getClass();
        String strS = c.a(wg5Var2, wg5Var, true).d(wg5Var2).m.s();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (vd5 vd5Var : (List) this.q.getValue()) {
            sj2 sj2Var = (sj2) vd5Var.m;
            wg5 wg5Var3 = (wg5) vd5Var.n;
            try {
                List listG = sj2Var.G(wg5Var3.e(strS));
                ArrayList<wg5> arrayList = new ArrayList();
                for (Object obj : listG) {
                    if (us1.E((wg5) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(mv0.Z(arrayList, 10));
                for (wg5 wg5Var4 : arrayList) {
                    wg5Var4.getClass();
                    String strReplace = ub7.i0(wg5Var4.m.s(), wg5Var3.m.s()).replace('\\', '/');
                    strReplace.getClass();
                    arrayList2.add(wg5Var2.e(strReplace));
                }
                qv0.c0(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return lv0.P0(linkedHashSet);
        }
        hk0.k(wg5Var, "file not found: ");
        return null;
    }

    @Override // o.sj2
    public final sn1 Y(wg5 wg5Var) {
        wg5Var.getClass();
        if (!us1.E(wg5Var)) {
            return null;
        }
        wg5 wg5Var2 = r;
        wg5Var2.getClass();
        String strS = c.a(wg5Var2, wg5Var, true).d(wg5Var2).m.s();
        for (vd5 vd5Var : (List) this.q.getValue()) {
            sn1 sn1VarY = ((sj2) vd5Var.m).Y(((wg5) vd5Var.n).e(strS));
            if (sn1VarY != null) {
                return sn1VarY;
            }
        }
        return null;
    }

    @Override // o.sj2
    public final gs3 b0(wg5 wg5Var) throws FileNotFoundException {
        if (!us1.E(wg5Var)) {
            hk0.k(wg5Var, "file not found: ");
            return null;
        }
        wg5 wg5Var2 = r;
        wg5Var2.getClass();
        String strS = c.a(wg5Var2, wg5Var, true).d(wg5Var2).m.s();
        Iterator it = ((List) this.q.getValue()).iterator();
        while (it.hasNext()) {
            vd5 vd5Var = (vd5) it.next();
            try {
                return ((sj2) vd5Var.m).b0(((wg5) vd5Var.n).e(strS));
            } catch (FileNotFoundException unused) {
            }
        }
        hk0.k(wg5Var, "file not found: ");
        return null;
    }

    @Override // o.sj2
    public final v07 c0(wg5 wg5Var, boolean z) throws IOException {
        wg5Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // o.sj2
    public final v07 e(wg5 wg5Var) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // o.sj2
    public final void j(wg5 wg5Var, wg5 wg5Var2) throws IOException {
        wg5Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // o.sj2
    public final q67 k0(wg5 wg5Var) throws IOException {
        wg5Var.getClass();
        if (!us1.E(wg5Var)) {
            hk0.k(wg5Var, "file not found: ");
            return null;
        }
        wg5 wg5Var2 = r;
        wg5Var2.getClass();
        URL resource = this.f2505o.getResource(c.a(wg5Var2, wg5Var, false).d(wg5Var2).m.s());
        if (resource == null) {
            hk0.k(wg5Var, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return et1.N(inputStream);
    }

    @Override // o.sj2
    public final void u(wg5 wg5Var) throws IOException {
        wg5Var.getClass();
        throw new IOException(this + " is read-only");
    }
}
