package o;

import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.ui.node.LayoutNode;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class xk1 implements e07, ji1, yr0, be, p45, ww2, d60, lg1 {
    public final /* synthetic */ byte m;
    public Object n;

    /* JADX WARN: Multi-variable type inference failed */
    public xk1(io.sentry.q7 q7Var) throws Throwable {
        this.m = (byte) 25;
        this.n = new HashMap();
        InputStream inputStreamK = q7Var.k();
        if (inputStreamK == null) {
            return;
        }
        Closeable closeable = null;
        gm0 gm0Var = null;
        closeable = null;
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamK));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        line.getClass();
                        String string = ub7.x0(line).toString();
                        if (string.length() != 0) {
                            if (bc7.N(false, string, "[") && bc7.G(false, string, "]") && string.length() > 2) {
                                String strSubstring = string.substring(1, string.length() - 1);
                                gm0Var = new gm0(strSubstring);
                                ((HashMap) this.n).put(strSubstring, gm0Var);
                            } else if (!bc7.N(false, ub7.x0(string).toString(), ";")) {
                                int iZ = ub7.Z(string, "=", 0, false, 6);
                                if (iZ != -1) {
                                    String[] strArr = {string.substring(0, iZ), string.substring(iZ + 1, string.length())};
                                    if (gm0Var != null) {
                                        gm0Var.a(ub7.x0(strArr[0]).toString(), ub7.x0(strArr[1]).toString());
                                    }
                                } else {
                                    ye4.a("IniFile", "error parsing line");
                                }
                            }
                        }
                    } catch (IOException unused) {
                        closeable = bufferedReader;
                        ye4.c("IniFile", "could not parse ini file: io exception");
                        Closeable closeable2 = new Closeable[]{closeable}[0];
                        if (closeable2 != null) {
                            try {
                                closeable2.close();
                                return;
                            } catch (IOException e) {
                                e41.s("close ", e.getMessage(), "FileHelper");
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        closeable = bufferedReader;
                        Closeable closeable3 = new Closeable[]{closeable}[0];
                        if (closeable3 != null) {
                            try {
                                closeable3.close();
                            } catch (IOException e2) {
                                e41.s("close ", e2.getMessage(), "FileHelper");
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused2) {
        }
    }

    public static void M(hk7 hk7Var, r02 r02Var) {
        hk7Var.getClass();
        ik7.b(hk7Var, r02Var);
    }

    @Override // o.ww2
    public ww2 A() {
        return this;
    }

    @Override // o.ww2
    public ww2 B(v14 v14Var) {
        return this;
    }

    @Override // o.ww2
    public ww2 C() {
        return this;
    }

    @Override // o.ww2
    public ww2 D(fi1 fi1Var) {
        return this;
    }

    @Override // o.ji1
    public Object E(eq1 eq1Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        qo1 qo1Var = (qo1) this.n;
        qo1Var.getClass();
        qo1Var.x(sb, eq1Var, null);
        cp1 cp1Var = eq1Var.r;
        cp1Var.getClass();
        qo1Var.g0(cp1Var, sb);
        qo1Var.J(eq1Var, sb);
        sb.append(qo1Var.H("typealias"));
        sb.append(" ");
        qo1Var.O(eq1Var, sb, true);
        qo1Var.c0(sb, eq1Var.k0(), false);
        qo1Var.z(eq1Var, sb);
        sb.append(" = ");
        sb.append(qo1Var.X(eq1Var.F0()));
        return f88.a;
    }

    @Override // o.ji1
    public Object F(bd5 bd5Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        qo1 qo1Var = (qo1) this.n;
        qo1Var.getClass();
        qo1Var.S(bd5Var.q, "package-fragment", sb);
        if (qo1Var.a.o()) {
            sb.append(" in ");
            qo1Var.O(bd5Var.i(), sb, false);
        }
        return f88.a;
    }

    @Override // o.d60
    public void G(g60 g60Var) {
        g60Var.getClass();
        ye4.a.g("InAppPurchaseInitialisationManager", "billingClientSetupFinished: resultCode = " + g60Var.a + ", resultMessage = " + g60Var.c);
        cg3 cg3Var = (cg3) this.n;
        im3.R((fc1) cg3Var.b, null, null, new oa1((Object) g60Var, (Object) cg3Var, (hc1) null, (byte) 27), 3);
    }

    @Override // o.d60
    public void H() {
        ye4.a.g("InAppPurchaseInitialisationManager", "Billing Service disconnected");
        cg3 cg3Var = (cg3) this.n;
        im3.R((fc1) cg3Var.b, null, null, new y0(cg3Var, null, (byte) 17), 3);
    }

    @Override // o.ww2
    public ww2 I(oz3 oz3Var) {
        oz3Var.getClass();
        return this;
    }

    @Override // o.ww2
    public ww2 J() {
        return this;
    }

    public void K(LayoutNode layoutNode) {
        if (!layoutNode.W()) {
            ki3.c("DepthSortedSet.add called on an unattached node");
        }
        ((m67) this.n).add(layoutNode);
    }

    public void L(gk7 gk7Var) {
        ik7.b((c6) this.n, new r02(gk7Var, p02.Negative));
    }

    public void N(byte b) {
        ((Parcel) this.n).writeByte(b);
    }

    public void O(float f) {
        ((Parcel) this.n).writeFloat(f);
    }

    public void P(long j) {
        long jB = qt7.b(j);
        byte b = 0;
        if (!rt7.a(jB, 0L)) {
            if (rt7.a(jB, 4294967296L)) {
                b = 1;
            } else if (rt7.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        N(b);
        if (rt7.a(qt7.b(j), 0L)) {
            return;
        }
        O(qt7.c(j));
    }

    public String Q(String str, String str2) {
        gm0 gm0Var = (gm0) ((HashMap) this.n).get(str);
        if (gm0Var != null) {
            return (String) gm0Var.a.get(str2);
        }
        ye4.a("IniFile", "category is null");
        return null;
    }

    public void R() {
        ((wt2) this.n).v.T();
    }

    public boolean S(LayoutNode layoutNode) {
        if (!layoutNode.W()) {
            ki3.c("DepthSortedSet.remove called on an unattached node");
        }
        return ((m67) this.n).remove(layoutNode);
    }

    public ns4 T(a86 a86Var) {
        i24 i24Var;
        ht2 ht2VarC = a86Var.c();
        Class<?> declaringClass = a86Var.a.getDeclaringClass();
        a86 a86Var2 = declaringClass != null ? new a86(declaringClass) : null;
        if (a86Var2 != null) {
            ns4 ns4VarT = T(a86Var2);
            zo4 zo4VarR0 = ns4VarT != null ? ns4VarT.r0() : null;
            ys0 ys0VarG = zo4VarR0 != null ? zo4VarR0.g(a86Var.e(), t35.t) : null;
            if (ys0VarG instanceof ns4) {
                return (ns4) ys0VarG;
            }
        } else if (ht2VarC != null && (i24Var = (i24) lv0.o0(qf0.K(((j24) this.n).c(ht2VarC.e())))) != null) {
            o24 o24Var = i24Var.v.d;
            o24Var.getClass();
            return o24Var.v(a86Var.e(), a86Var);
        }
        return null;
    }

    public void U(jj2 jj2Var, ArrayList arrayList) {
        bu7.MAIN.a(new io.sentry.android.core.internal.util.j(this.n, (Object) jj2Var, (Object) arrayList, (byte) 10));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e0  */
    public void V(xw2 xw2Var, StringBuilder sb) {
        String strX;
        boolean z;
        qo1 qo1Var = (qo1) this.n;
        uo1 uo1Var = qo1Var.a;
        uo1 uo1Var2 = qo1Var.a;
        if (!qo1Var.q()) {
            to1 to1Var = uo1Var2.g;
            fw3[] fw3VarArr = uo1.Y;
            fw3 fw3Var = fw3VarArr[5];
            to1Var.getClass();
            fw3Var.getClass();
            if (!((Boolean) to1Var.m).booleanValue()) {
                List listX = xw2Var.X();
                listX.getClass();
                qo1Var.B(sb, listX);
                qo1Var.x(sb, xw2Var, null);
                cp1 cp1VarE = xw2Var.e();
                cp1VarE.getClass();
                qo1Var.g0(cp1VarE, sb);
                qo1Var.L(xw2Var, sb);
                to1 to1Var2 = uo1Var2.T;
                fw3 fw3Var2 = fw3VarArr[44];
                to1Var2.getClass();
                fw3Var2.getClass();
                if (((Boolean) to1Var2.m).booleanValue()) {
                    qo1Var.J(xw2Var, sb);
                }
                qo1Var.R(xw2Var, sb);
                to1 to1Var3 = uo1Var2.T;
                fw3 fw3Var3 = fw3VarArr[44];
                to1Var3.getClass();
                fw3Var3.getClass();
                if (((Boolean) to1Var3.m).booleanValue()) {
                    boolean z2 = false;
                    if (xw2Var.E()) {
                        Collection collectionJ = xw2Var.j();
                        collectionJ.getClass();
                        Collection collection = collectionJ;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((xw2) it.next()).E()) {
                                        to1 to1Var4 = uo1Var2.O;
                                        fw3 fw3Var4 = uo1.Y[39];
                                        to1Var4.getClass();
                                        fw3Var4.getClass();
                                        if (!((Boolean) to1Var4.m).booleanValue()) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (xw2Var.l0()) {
                        Collection collectionJ2 = xw2Var.j();
                        collectionJ2.getClass();
                        Collection collection2 = collectionJ2;
                        if (!collection2.isEmpty()) {
                            Iterator it2 = collection2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((xw2) it2.next()).l0()) {
                                        to1 to1Var5 = uo1Var2.O;
                                        fw3 fw3Var5 = uo1.Y[39];
                                        to1Var5.getClass();
                                        fw3Var5.getClass();
                                        if (!((Boolean) to1Var5.m).booleanValue()) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z2 = true;
                                break;
                            }
                        }
                        z2 = true;
                        break;
                    }
                    qo1Var.M("tailrec", sb, xw2Var.D());
                    qo1Var.M("suspend", sb, xw2Var.l());
                    qo1Var.M("inline", sb, xw2Var.m());
                    qo1Var.M("infix", sb, z2);
                    qo1Var.M("operator", sb, z);
                } else {
                    qo1Var.M("suspend", sb, xw2Var.l());
                }
                qo1Var.I(xw2Var, sb);
                if (qo1Var.t()) {
                    if (xw2Var.c0()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (xw2Var.f0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(qo1Var.H("fun"));
            sb.append(" ");
            List typeParameters = xw2Var.getTypeParameters();
            typeParameters.getClass();
            qo1Var.c0(sb, typeParameters, true);
            v14 v14VarS = xw2Var.S();
            if (v14VarS != null) {
                qo1Var.x(sb, v14VarS, pp.RECEIVER);
                oz3 type = v14VarS.getType();
                type.getClass();
                sb.append(qo1Var.F(type));
                sb.append(".");
            }
        }
        qo1Var.O(xw2Var, sb, true);
        List listJ = xw2Var.J();
        listJ.getClass();
        qo1Var.f0(sb, listJ, xw2Var.x());
        qo1Var.V(sb, xw2Var);
        oz3 returnType = xw2Var.getReturnType();
        to1 to1Var6 = uo1Var.l;
        fw3[] fw3VarArr2 = uo1.Y;
        fw3 fw3Var6 = fw3VarArr2[10];
        to1Var6.getClass();
        fw3Var6.getClass();
        if (!((Boolean) to1Var6.m).booleanValue()) {
            to1 to1Var7 = uo1Var.k;
            fw3 fw3Var7 = fw3VarArr2[9];
            to1Var7.getClass();
            fw3Var7.getClass();
            if (((Boolean) to1Var7.m).booleanValue() || returnType == null) {
                sb.append(": ");
                if (returnType == null) {
                    strX = "[NULL]";
                } else {
                    strX = qo1Var.X(returnType);
                }
                sb.append(strX);
            } else {
                sy4 sy4Var = wy3.e;
                if (!wy3.D(returnType, s87.d)) {
                    sb.append(": ");
                    if (returnType == null) {
                        strX = "[NULL]";
                    } else {
                        strX = qo1Var.X(returnType);
                    }
                    sb.append(strX);
                }
            }
        }
        List typeParameters2 = xw2Var.getTypeParameters();
        typeParameters2.getClass();
        qo1Var.h0(sb, typeParameters2);
    }

    public void W(zt5 zt5Var, StringBuilder sb, String str) {
        qo1 qo1Var = (qo1) this.n;
        to1 to1Var = qo1Var.a.H;
        fw3 fw3Var = uo1.Y[32];
        to1Var.getClass();
        fw3Var.getClass();
        int iOrdinal = ((au5) to1Var.m).ordinal();
        if (iOrdinal == 0) {
            qo1Var.J(zt5Var, sb);
            sb.append(str.concat(" for "));
            qo1Var.U(zt5Var.t, sb);
        } else if (iOrdinal == 1) {
            V(zt5Var, sb);
        } else {
            if (iOrdinal == 2) {
                return;
            }
            gk0.s();
        }
    }

    @Override // o.ji1
    public Object a(g3 g3Var, Object obj) {
        ((qo1) this.n).a0(g3Var, (StringBuilder) obj, true);
        return f88.a;
    }

    @Override // o.ww2
    public ww2 b(List list) {
        return this;
    }

    @Override // o.ww2
    public xw2 build() {
        return (xc2) this.n;
    }

    @Override // o.yr0
    public xr0 c(js0 js0Var) {
        xr0 xr0VarC;
        js0Var.getClass();
        dd5 dd5Var = (dd5) this.n;
        ht2 ht2Var = js0Var.a;
        ht2Var.getClass();
        ArrayList<ad5> arrayList = new ArrayList();
        dd5Var.b(ht2Var, arrayList);
        for (ad5 ad5Var : arrayList) {
            if ((ad5Var instanceof eg0) && (xr0VarC = ((eg0) ad5Var).u.c(js0Var)) != null) {
                return xr0VarC;
            }
        }
        return null;
    }

    @Override // o.lg1
    public Iterable d(Object obj) {
        bs3 bs3Var = (bs3) this.n;
        Collection collectionB = ((ns4) obj).q().b();
        collectionB.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            ys0 ys0VarA = ((oz3) it.next()).o0().a();
            ns4 ns4VarD = null;
            ys0 ys0VarA2 = ys0VarA != null ? ys0VarA.a() : null;
            ns4 ns4Var = ys0VarA2 instanceof ns4 ? (ns4) ys0VarA2 : null;
            if (ns4Var != null && (ns4VarD = bs3Var.d(ns4Var)) == null) {
                ns4VarD = ns4Var;
            }
            if (ns4VarD != null) {
                arrayList.add(ns4VarD);
            }
        }
        return arrayList;
    }

    @Override // o.p45
    public void e(x35 x35Var, int i) {
        StringBuilder sb = (StringBuilder) this.n;
        if (x35Var instanceof o82) {
            o82 o82Var = (o82) x35Var;
            hn7 hn7Var = o82Var.p;
            x35 x35VarW = x35Var.w();
            if (!hn7Var.c(1024) && (hn7Var.p & 4) == 0) {
                for (int i2 = 0; i2 < o82Var.q.size(); i2++) {
                    x35 x35VarI = o82Var.i(i2);
                    if (!(x35VarI instanceof o82) || !((o82) x35VarI).e0()) {
                    }
                }
                return;
            }
            if (((x35VarW instanceof et7) || ((x35VarW instanceof o82) && (((o82) x35VarW).p.p & 4) == 0)) && !et7.T(sb)) {
                sb.append(' ');
            }
        }
    }

    @Override // o.ww2
    public ww2 f(int i) {
        if (i != 0) {
            return this;
        }
        throw null;
    }

    @Override // o.ww2
    public ww2 g(cp1 cp1Var) {
        cp1Var.getClass();
        return this;
    }

    @Override // o.ji1
    public Object h(v14 v14Var, Object obj) {
        ((StringBuilder) obj).append(v14Var.getName());
        return f88.a;
    }

    @Override // o.ji1
    public Object i(du5 du5Var, Object obj) {
        ((qo1) this.n).U(du5Var, (StringBuilder) obj);
        return f88.a;
    }

    @Override // o.p45
    public void j(x35 x35Var, int i) {
        char c;
        StringBuilder sb = (StringBuilder) this.n;
        if (x35Var instanceof et7) {
            o82.S(sb, (et7) x35Var);
            return;
        }
        if (x35Var instanceof o82) {
            o82 o82Var = (o82) x35Var;
            if (sb.length() > 0) {
                if (!o82Var.e0() && !o82Var.t("br")) {
                    if (!o82Var.p.c(1024) || o82Var.q.size() <= 0) {
                        return;
                    }
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    x35 x35VarI = o82Var;
                    int i2 = 0;
                    while (x35VarI != null) {
                        char c2 = 1;
                        if (!(x35VarI instanceof et7) || lb7.f(((et7) x35VarI).Q())) {
                            c = 1;
                        } else {
                            atomicBoolean.set(true);
                            c = 5;
                        }
                        if (c == 5) {
                            break;
                        }
                        if (c != 1 || x35VarI.k() <= 0) {
                            while (x35VarI.w() == null && i2 > 0) {
                                if (c == 1 || c == 2) {
                                    c = 1;
                                }
                                o82 o82Var2 = x35VarI.m;
                                i2--;
                                if (c == 4) {
                                    x35VarI.K();
                                }
                                c = 1;
                                x35VarI = o82Var2;
                            }
                            if (c != 1 && c != 2) {
                                c2 = c;
                            }
                            if (x35VarI == o82Var) {
                                break;
                            }
                            x35 x35VarW = x35VarI.w();
                            if (c2 == 4) {
                                x35VarI.K();
                            }
                            x35VarI = x35VarW;
                        } else {
                            x35VarI = x35VarI.i(0);
                            i2++;
                        }
                    }
                    if (!atomicBoolean.get()) {
                        return;
                    }
                }
                if (et7.T(sb)) {
                    return;
                }
                sb.append(' ');
            }
        }
    }

    @Override // o.ji1
    public Object k(eu5 eu5Var, Object obj) {
        W(eu5Var, (StringBuilder) obj, "getter");
        return f88.a;
    }

    @Override // o.ww2
    public ww2 l() {
        return this;
    }

    @Override // o.e07
    public void lock() {
        ((ReentrantLock) this.n).lock();
    }

    @Override // o.ji1
    public Object m(b54 b54Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        qo1 qo1Var = (qo1) this.n;
        qo1Var.getClass();
        qo1Var.S(b54Var.p, "package", sb);
        if (qo1Var.a.o()) {
            sb.append(" in context of ");
            qo1Var.O(b54Var.f397o, sb, false);
        }
        return f88.a;
    }

    @Override // o.be
    public void n(int i) {
        dr1 dr1Var = (dr1) this.n;
        zd zdVar = dr1Var.t0;
        if (zdVar != null) {
            oq0 oq0VarE0 = zdVar.E0(i);
            bb5 bb5Var = dr1Var.p0;
            if (bb5Var != null) {
                bb5Var.I0(oq0VarE0, true);
            }
        }
    }

    @Override // o.ww2
    public ww2 o() {
        return this;
    }

    @Override // o.ji1
    public Object p(qb8 qb8Var, Object obj) {
        ((qo1) this.n).e0(qb8Var, true, (StringBuilder) obj, true);
        return f88.a;
    }

    @Override // o.ww2
    public ww2 q() {
        return this;
    }

    @Override // o.ji1
    public /* bridge */ /* synthetic */ Object r(xw2 xw2Var, Object obj) {
        V(xw2Var, (StringBuilder) obj);
        return f88.a;
    }

    @Override // o.ww2
    public ww2 s() {
        return this;
    }

    @Override // o.ww2
    public ww2 t(as4 as4Var) {
        return this;
    }

    public String toString() {
        switch (this.m) {
            case 1:
                return ((m67) this.n).toString();
            default:
                return super.toString();
        }
    }

    @Override // o.ji1
    public Object u(ns4 ns4Var, Object obj) throws IOException {
        wr0 wr0VarU0;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        qo1 qo1Var = (qo1) this.n;
        uo1 uo1Var = qo1Var.a;
        byte b = 1;
        boolean z = ns4Var.i0() == ms0.p;
        if (!qo1Var.q()) {
            List listE0 = ns4Var.e0();
            listE0.getClass();
            qo1Var.B(sb, listE0);
            qo1Var.x(sb, ns4Var, null);
            if (!z) {
                cp1 cp1VarE = ns4Var.e();
                cp1VarE.getClass();
                qo1Var.g0(cp1VarE, sb);
            }
            if ((ns4Var.i0() != ms0.n || ns4Var.r() != as4.q) && (!ns4Var.i0().a() || ns4Var.r() != as4.n)) {
                as4 as4VarR = ns4Var.r();
                as4VarR.getClass();
                qo1Var.K(as4VarR, sb, qo1.u(ns4Var));
            }
            qo1Var.J(ns4Var, sb);
            qo1Var.M("inner", sb, qo1Var.p().contains(ro1.INNER) && ns4Var.g());
            qo1Var.M("data", sb, qo1Var.p().contains(ro1.DATA) && ns4Var.x0());
            qo1Var.M("inline", sb, qo1Var.p().contains(ro1.INLINE) && ns4Var.m());
            qo1Var.M("value", sb, qo1Var.p().contains(ro1.VALUE) && ns4Var.z0());
            qo1Var.M("fun", sb, qo1Var.p().contains(ro1.FUN) && ns4Var.y0());
            if (ns4Var.w0()) {
                str = "companion object";
            } else {
                int iOrdinal = ns4Var.i0().ordinal();
                if (iOrdinal == 0) {
                    str = "class";
                } else if (iOrdinal == 1) {
                    str = "interface";
                } else if (iOrdinal == 2) {
                    str = "enum class";
                } else if (iOrdinal == 3) {
                    str = "enum entry";
                } else if (iOrdinal == 4) {
                    str = "annotation class";
                } else {
                    if (iOrdinal != 5) {
                        gk0.s();
                        return null;
                    }
                    str = "object";
                }
            }
            sb.append(qo1Var.H(str));
        }
        if (zo1.l(ns4Var)) {
            to1 to1Var = uo1Var.G;
            fw3 fw3Var = uo1.Y[31];
            to1Var.getClass();
            fw3Var.getClass();
            if (((Boolean) to1Var.m).booleanValue()) {
                if (qo1Var.q()) {
                    sb.append("companion object");
                }
                qo1.W(sb);
                fi1 fi1VarI = ns4Var.i();
                if (fi1VarI != null) {
                    sb.append("of ");
                    sy4 name = fi1VarI.getName();
                    name.getClass();
                    sb.append(qo1Var.N(name, false));
                }
            }
            if (qo1Var.t() || !im3.n(ns4Var.getName(), a87.b)) {
                if (!qo1Var.q()) {
                    qo1.W(sb);
                }
                sy4 name2 = ns4Var.getName();
                name2.getClass();
                sb.append(qo1Var.N(name2, true));
            }
        } else {
            if (!qo1Var.q()) {
                qo1.W(sb);
            }
            qo1Var.O(ns4Var, sb, true);
        }
        if (!z) {
            List listK0 = ns4Var.k0();
            listK0.getClass();
            qo1Var.c0(sb, listK0, false);
            qo1Var.z(ns4Var, sb);
            if (!ns4Var.i0().a()) {
                to1 to1Var2 = uo1Var.i;
                fw3 fw3Var2 = uo1.Y[7];
                to1Var2.getClass();
                fw3Var2.getClass();
                if (((Boolean) to1Var2.m).booleanValue() && (wr0VarU0 = ns4Var.u0()) != null) {
                    sb.append(" ");
                    qo1Var.x(sb, wr0VarU0, null);
                    cp1 cp1VarE2 = wr0VarU0.e();
                    cp1VarE2.getClass();
                    qo1Var.g0(cp1VarE2, sb);
                    sb.append(qo1Var.H("constructor"));
                    List listJ = wr0VarU0.J();
                    listJ.getClass();
                    qo1Var.f0(sb, listJ, wr0VarU0.x());
                }
            }
            to1 to1Var3 = uo1Var.x;
            fw3 fw3Var3 = uo1.Y[22];
            to1Var3.getClass();
            fw3Var3.getClass();
            if (!((Boolean) to1Var3.m).booleanValue() && !wy3.E(ns4Var.W())) {
                Collection collectionB = ns4Var.q().b();
                collectionB.getClass();
                if (!collectionB.isEmpty() && (collectionB.size() != 1 || !wy3.x((oz3) collectionB.iterator().next()))) {
                    qo1.W(sb);
                    sb.append(": ");
                    lv0.s0(collectionB, sb, ", ", null, null, new po1(qo1Var, b), 60);
                }
            }
            qo1Var.h0(sb, listK0);
        }
        return f88.a;
    }

    @Override // o.e07
    public void unlock() {
        ((ReentrantLock) this.n).unlock();
    }

    @Override // o.ji1
    public Object v(Object obj, qs4 qs4Var) {
        ((qo1) this.n).O(qs4Var, (StringBuilder) obj, true);
        return f88.a;
    }

    @Override // o.ji1
    public Object w(ju5 ju5Var, Object obj) {
        W(ju5Var, (StringBuilder) obj, "setter");
        return f88.a;
    }

    @Override // o.ww2
    public ww2 x(up upVar) {
        upVar.getClass();
        return this;
    }

    @Override // o.ww2
    public ww2 y(sy4 sy4Var) {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0046  */
    @Override // o.ji1
    public Object z(wr0 wr0Var, Object obj) {
        boolean z;
        wr0 wr0VarU0;
        boolean z2 = wr0Var.P;
        StringBuilder sb = (StringBuilder) obj;
        qo1 qo1Var = (qo1) this.n;
        qo1Var.getClass();
        qo1Var.x(sb, wr0Var, null);
        uo1 uo1Var = qo1Var.a;
        to1 to1Var = uo1Var.f2232o;
        fw3[] fw3VarArr = uo1.Y;
        fw3 fw3Var = fw3VarArr[13];
        to1Var.getClass();
        fw3Var.getClass();
        if (((Boolean) to1Var.m).booleanValue() || wr0Var.u().r() != as4.f355o) {
            cp1 cp1VarE = wr0Var.e();
            cp1VarE.getClass();
            if (qo1Var.g0(cp1VarE, sb)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        qo1Var.I(wr0Var, sb);
        to1 to1Var2 = uo1Var.P;
        fw3 fw3Var2 = fw3VarArr[40];
        to1Var2.getClass();
        fw3Var2.getClass();
        boolean z3 = ((Boolean) to1Var2.m).booleanValue() || !z2 || z;
        if (z3) {
            sb.append(qo1Var.H("constructor"));
        }
        ns4 ns4VarN0 = wr0Var.i();
        ns4VarN0.getClass();
        to1 to1Var3 = uo1Var.A;
        fw3 fw3Var3 = fw3VarArr[25];
        to1Var3.getClass();
        fw3Var3.getClass();
        if (((Boolean) to1Var3.m).booleanValue()) {
            if (z3) {
                sb.append(" ");
            }
            qo1Var.O(ns4VarN0, sb, true);
            qo1Var.c0(sb, wr0Var.getTypeParameters(), false);
        }
        List listJ = wr0Var.J();
        listJ.getClass();
        qo1Var.f0(sb, listJ, wr0Var.x());
        to1 to1Var4 = uo1Var.q;
        fw3 fw3Var4 = fw3VarArr[15];
        to1Var4.getClass();
        fw3Var4.getClass();
        if (((Boolean) to1Var4.m).booleanValue() && !z2 && (wr0VarU0 = ns4VarN0.u0()) != null) {
            List listJ2 = wr0VarU0.J();
            listJ2.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listJ2) {
                qb8 qb8Var = (qb8) obj2;
                if (!qb8Var.E0() && qb8Var.v == null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(qo1Var.H("this"));
                sb.append(lv0.t0(arrayList, ", ", "(", ")", ek.C, 24));
            }
        }
        to1 to1Var5 = uo1Var.A;
        fw3 fw3Var5 = uo1.Y[25];
        to1Var5.getClass();
        fw3Var5.getClass();
        if (((Boolean) to1Var5.m).booleanValue()) {
            qo1Var.h0(sb, wr0Var.getTypeParameters());
        }
        return f88.a;
    }

    public /* synthetic */ xk1(ViewGroup viewGroup, View view, byte b) {
        this.m = b;
        this.n = view;
    }

    public /* synthetic */ xk1(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    public /* synthetic */ xk1(byte b, boolean z) {
        this.m = b;
    }

    public xk1(byte b) {
        this.m = b;
        switch (b) {
            case 8:
                this.n = new c6((byte) 7);
                break;
            case 15:
                this.n = us4.e;
                break;
            case 23:
                this.n = null;
                break;
            default:
                this.n = new m67(pm8.j);
                break;
        }
    }

    public xk1(TextView textView) {
        this.m = (byte) 13;
        this.n = new q92(textView);
    }

    public xk1(EditText editText) {
        this.m = (byte) 12;
        this.n = new wk0(editText);
    }
}
