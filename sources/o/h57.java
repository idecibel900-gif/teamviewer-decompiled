package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Looper;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionState;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h57 {
    public static SharedPreferences a;

    public static final u68 A(int i, String str) {
        int i2;
        qf0.s(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i2 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i3, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, i);
                if (Integer.compareUnsigned(i3, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i4 = i3 * i;
            int i5 = iDigit + i4;
            if (Integer.compareUnsigned(i5, i4) < 0) {
                return null;
            }
            i2++;
            i3 = i5;
        }
        return new u68(i3);
    }

    public static final z68 B(String str) {
        str.getClass();
        qf0.s(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, 10L);
                if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j2 = j * 10;
            long j3 = (((long) iDigit) & 4294967295L) + j2;
            if (Long.compareUnsigned(j3, j2) < 0) {
                return null;
            }
            i++;
            j = j3;
        }
        return new z68(j);
    }

    public static hy8 C(bo7... bo7VarArr) {
        hy8 hy8Var;
        if (bo7VarArr.length == 0) {
            return j(Collections.EMPTY_LIST);
        }
        List<bo7> listAsList = Arrays.asList(bo7VarArr);
        eh6 eh6Var = eo7.a;
        if (listAsList == null || listAsList.isEmpty()) {
            return j(Collections.EMPTY_LIST);
        }
        if (listAsList.isEmpty()) {
            hy8Var = j(null);
        } else {
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                if (((bo7) it.next()) == null) {
                    yq4.l("null tasks are not accepted");
                    return null;
                }
            }
            hy8Var = new hy8();
            lq8 lq8Var = new lq8(listAsList.size(), hy8Var);
            for (bo7 bo7Var : listAsList) {
                m12 m12Var = eo7.b;
                bo7Var.e(m12Var, lq8Var);
                bo7Var.d(m12Var, lq8Var);
                bo7Var.a(m12Var, lq8Var);
            }
        }
        return hy8Var.g(eh6Var, new d22(listAsList));
    }

    public static final ll2 D(q93 q93Var, String str) {
        q93Var.getClass();
        ll2 ll2Var = new ll2();
        ll2Var.n = q93Var.getType();
        ll2Var.m = q93Var.c();
        ll2Var.f1375o = str;
        ll2Var.p = q93Var.e();
        ll2Var.q = q93Var.getValue();
        return ll2Var;
    }

    public static final SupportSession E(SupportSession supportSession) {
        supportSession.getClass();
        String name = supportSession.getName();
        String string = name != null ? ub7.x0(name).toString() : null;
        return im3.n(string, supportSession.getName()) ? supportSession : SupportSession.copy$default(supportSession, 0, null, null, null, null, 0, 0, null, string, null, null, null, null, null, null, null, null, null, null, null, 1048319, null);
    }

    public static Object F(bo7 bo7Var) throws ExecutionException {
        if (bo7Var.k()) {
            return bo7Var.i();
        }
        if (((hy8) bo7Var).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(bo7Var.h());
    }

    public static /* synthetic */ boolean G(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, rx8 rx8Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(rx8Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(rx8Var) != obj && atomicReferenceFieldUpdater.get(rx8Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static final long a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            li3.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = gt7.c;
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(boolean z, iv6 iv6Var, a06 a06Var, Function0 function0, fs4 fs4Var, vh8 vh8Var, ux2 ux2Var, int i) {
        int i2;
        fs4 fs4Var2;
        vh8 vh8Var2;
        ux2 ux2Var2;
        boolean z2;
        int i3;
        vh8 vh8Var3;
        fs4 fs4Var3;
        byte b;
        Object obj;
        Object yh8Var;
        vh8 vh8Var4;
        aw awVar;
        byte b2;
        byte b3;
        Object obj2;
        ux2 ux2Var3 = ux2Var;
        a06Var.getClass();
        function0.getClass();
        ux2Var3.Y(-1988976565);
        if ((i & 6) == 0) {
            i2 = (ux2Var3.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ux2Var3.f(iv6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ux2Var3.f(a06Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ux2Var3.h(function0) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 = 90112 | i2;
        }
        byte b4 = 1;
        if (ux2Var3.N(i4 & 1, (74899 & i4) != 74898)) {
            ux2Var3.S();
            if ((i & 1) == 0 || ux2Var3.x()) {
                dl5 dl5Var = new dl5(new j68((byte) 8), b4);
                we8 we8VarA = id4.a(ux2Var3);
                if (we8VarA == null) {
                    hk0.l("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                z2 = true;
                i3 = i4 & (-458753);
                vh8Var3 = (vh8) g57.t(w86.a.b(vh8.class), we8VarA, null, dl5Var, k(we8VarA), ux2Var3);
                fs4Var3 = cs4.b;
            } else {
                ux2Var3.Q();
                int i5 = i4 & (-458753);
                fs4Var3 = fs4Var;
                vh8Var3 = vh8Var;
                i3 = i5;
                z2 = true;
            }
            ux2Var3.q();
            Context context = (Context) ux2Var3.j(lh.b);
            Resources resources = (Resources) ux2Var3.j(lh.c);
            px4 px4VarG = g57.g(a06Var.f, ux2Var3);
            px4 px4VarG2 = g57.g(vh8Var3.f2314o, ux2Var3);
            Object objK = ux2Var3.K();
            aw awVar2 = e01.a;
            Object obj3 = objK;
            if (objK == awVar2) {
                me1 me1VarW = ck3.w(ux2Var3);
                ux2Var3.g0(me1VarW);
                obj3 = me1VarW;
            }
            me1 me1Var = (me1) obj3;
            int i6 = i3 & 112;
            boolean z3 = (i6 == 32 ? z2 : false) | ((i3 & 7168) == 2048 ? z2 : false);
            Object objK2 = ux2Var3.K();
            Object obj4 = objK2;
            if (z3 || objK2 == awVar2) {
                a26 a26Var = new a26((Object) iv6Var, (Object) function0, (byte) 28);
                ux2Var3.g0(a26Var);
                obj4 = a26Var;
            }
            Function0 function1 = (Function0) obj4;
            boolean zH = ux2Var3.h(me1Var) | ux2Var3.h(vh8Var3);
            Object objK3 = ux2Var3.K();
            byte b5 = 3;
            Object obj5 = objK3;
            if (zH || objK3 == awVar2) {
                w18 w18Var = new w18(me1Var, vh8Var3, b5);
                ux2Var3.g0(w18Var);
                obj5 = w18Var;
            }
            Function1 function2 = (Function1) obj5;
            boolean zH2 = ux2Var3.h(vh8Var3);
            Object objK4 = ux2Var3.K();
            if (zH2 || objK4 == awVar2) {
                b = 1;
                uh8 uh8Var = new uh8(vh8Var3, b);
                ux2Var3.g0(uh8Var);
                obj = uh8Var;
            } else {
                b = 1;
                obj = objK4;
            }
            Function1 function3 = (Function1) obj;
            byte b6 = b;
            int i7 = i3;
            wh8 wh8VarC = r47.C(context, function1, function2, function3, ux2Var, 24576);
            boolean z4 = (((i6 == 32 ? b6 : (byte) 0) | (ux2Var.h(vh8Var3) ? 1 : 0)) == true ? 1 : 0) | (ux2Var.h(resources) ? 1 : 0);
            Object objK5 = ux2Var.K();
            if (z4 != 0 || objK5 == awVar2) {
                vh8Var4 = vh8Var3;
                awVar = awVar2;
                b2 = 3;
                b3 = 4;
                yh8Var = new yh8(vh8Var4, iv6Var, resources, null, (byte) 0);
                ux2Var.g0(yh8Var);
            } else {
                vh8Var4 = vh8Var3;
                awVar = awVar2;
                yh8Var = objK5;
                b2 = 3;
                b3 = 4;
            }
            ck3.i(f88.a, (hw2) yh8Var, ux2Var);
            boolean zBooleanValue = ((Boolean) px4VarG.getValue()).booleanValue();
            String strZ = m77.z(R.string.sign_in_settings, ux2Var);
            if (z && !a06Var.a()) {
                b6 = 0;
            }
            boolean zA = a06Var.a();
            boolean zH3 = ux2Var.h(wh8VarC);
            Object objK6 = ux2Var.K();
            Object obj6 = objK6;
            if (zH3 || objK6 == awVar) {
                i85 i85Var = new i85(wh8VarC, b3);
                ux2Var.g0(i85Var);
                obj6 = i85Var;
            }
            Function0 function4 = (Function0) obj6;
            boolean zH4 = ux2Var.h(wh8VarC);
            Object objK7 = ux2Var.K();
            Object obj7 = objK7;
            if (zH4 || objK7 == awVar) {
                i85 i85Var2 = new i85(wh8VarC, (byte) 5);
                ux2Var.g0(i85Var2);
                obj7 = i85Var2;
            }
            aw awVar3 = awVar;
            fs4 fs4Var4 = fs4Var3;
            byte b7 = b2;
            f57.e(zBooleanValue, function4, (Function0) obj7, strZ, fs4Var4, b6, zA, ux2Var, i7 & 57344, 0);
            fs4Var2 = fs4Var4;
            ux2 ux2Var4 = ux2Var;
            vh3 vh3Var = (vh3) px4VarG2.getValue();
            if (vh3Var == null) {
                ux2Var4.W(-229662565);
                ux2Var4.p(false);
            } else {
                ux2Var4.W(-229662564);
                boolean zH5 = ux2Var4.h(vh3Var);
                Object objK8 = ux2Var4.K();
                if (zH5 || objK8 == awVar3) {
                    obj2 = objK8;
                    j85 j85Var = new j85(vh3Var, b7);
                    ux2Var4.g0(j85Var);
                    obj2 = j85Var;
                }
                Function0 function5 = (Function0) obj2;
                boolean zH6 = ux2Var4.h(vh8Var4);
                Object objK9 = ux2Var4.K();
                if (zH6 || objK9 == awVar3) {
                    objK9 = new mr6(0, vh8Var4, vh8.class, "dismissDialog", "dismissDialog()V", 0, (byte) 20);
                    ux2Var4.g0(objK9);
                }
                io1.j(vh3Var, function5, (Function0) ((pu3) objK9), null, null, ux2Var4, 0, 24);
                ux2Var4.p(false);
            }
            vh8Var2 = vh8Var4;
            ux2Var2 = ux2Var4;
        } else {
            ux2Var3.Q();
            fs4Var2 = fs4Var;
            vh8Var2 = vh8Var;
            ux2Var2 = ux2Var3;
        }
        j56 j56VarR = ux2Var2.r();
        if (j56VarR != null) {
            j56VarR.d = new fb(z, iv6Var, a06Var, function0, fs4Var2, vh8Var2, i);
        }
    }

    public static final p82 c(p82 p82Var, String str) {
        String strLookupPrefix = ((Node) p82Var.n).lookupPrefix("http://schemas.android.com/apk/res/android");
        strLookupPrefix.getClass();
        Object obj = null;
        el2 el2Var = new el2(new fl2(new fx(new eo8(p82Var, null), (byte) 3), true, o48.w));
        while (el2Var.hasNext()) {
            Object next = el2Var.next();
            p82 p82Var2 = (p82) next;
            String namespaceURI = ((Node) p82Var2.n).getNamespaceURI();
            namespaceURI.getClass();
            if (namespaceURI.equals("http://schemas.android.com/aapt")) {
                String localName = ((Node) p82Var2.n).getLocalName();
                localName.getClass();
                if (localName.equals("attr")) {
                    String attribute = p82Var2.p.getAttribute("name");
                    attribute.getClass();
                    if (attribute.equals(strLookupPrefix + ":" + str)) {
                        obj = next;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return (p82) obj;
    }

    public static final String d(p82 p82Var, String str) {
        p82Var.getClass();
        String attributeNS = p82Var.p.getAttributeNS("http://schemas.android.com/apk/res/android", str);
        attributeNS.getClass();
        if (ub7.b0(attributeNS)) {
            return null;
        }
        return attributeNS;
    }

    public static Object e(bo7 bo7Var) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            hk0.l("Must not be called on the main application thread");
            return null;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            hk0.l("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        nv1.t(bo7Var, "Task must not be null");
        if (bo7Var.j()) {
            return F(bo7Var);
        }
        hq8 hq8Var = new hq8();
        Executor executor = eo7.b;
        bo7Var.e(executor, hq8Var);
        bo7Var.d(executor, hq8Var);
        bo7Var.a(executor, hq8Var);
        hq8Var.m.await();
        return F(bo7Var);
    }

    public static Object f(bo7 bo7Var, long j) throws TimeoutException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            hk0.l("Must not be called on the main application thread");
            return null;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            hk0.l("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        nv1.t(bo7Var, "Task must not be null");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nv1.t(timeUnit, "TimeUnit must not be null");
        if (bo7Var.j()) {
            return F(bo7Var);
        }
        hq8 hq8Var = new hq8();
        Executor executor = eo7.b;
        bo7Var.e(executor, hq8Var);
        bo7Var.d(executor, hq8Var);
        bo7Var.a(executor, hq8Var);
        if (hq8Var.m.await(j, timeUnit)) {
            return F(bo7Var);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static hy8 g(Executor executor, Callable callable) {
        nv1.t(executor, "Executor must not be null");
        hy8 hy8Var = new hy8();
        executor.execute(new st8((Object) hy8Var, (Object) callable, (byte) 7));
        return hy8Var;
    }

    public static final long h(int i, long j) {
        int i2 = gt7.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : a(i4, i);
    }

    public static hy8 i(Exception exc) {
        hy8 hy8Var = new hy8();
        hy8Var.n(exc);
        return hy8Var;
    }

    public static hy8 j(Object obj) {
        hy8 hy8Var = new hy8();
        hy8Var.m(obj);
        return hy8Var;
    }

    public static final bf1 k(we8 we8Var) {
        return we8Var instanceof a53 ? ((a53) we8Var).l() : af1.b;
    }

    public static final se8 l(we8 we8Var) {
        return we8Var instanceof a53 ? ((a53) we8Var).k() : cm1.b;
    }

    public static final int m(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final Object[] n(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        cx.J0(0, i, 6, objArr, objArr2);
        cx.G0(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final boolean o(SupportSession supportSession, Clock clock) {
        supportSession.getClass();
        clock.getClass();
        return supportSession.getState() == SupportSessionState.Closed || supportSession.getState() == SupportSessionState.Expired || !supportSession.getValidUntil().toInstant().isAfter(clock.instant());
    }

    public static bg5 p(Object obj) {
        return new bg5(obj, yl7.X);
    }

    public static final vd5[] q(p82 p82Var) {
        List listL0 = bq6.l0(new fl2(new fl2(new fx(new eo8(p82Var, null), (byte) 3), true, o48.x), true, new yb8((byte) 18)));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listL0) {
            int i2 = i + 1;
            if (i < 0) {
                qf0.U();
                throw null;
            }
            p82 p82Var2 = (p82) obj;
            float f = i;
            int size = listL0.size() - 1;
            if (size < 1) {
                size = 1;
            }
            float f2 = f / size;
            String strD = d(p82Var2, "offset");
            if (strD != null) {
                f2 = Float.parseFloat(strD);
            }
            String strD2 = d(p82Var2, "color");
            vd5 vd5Var = strD2 != null ? new vd5(Float.valueOf(f2), new rv0(j51.i(v67.m(strD2)))) : null;
            if (vd5Var != null) {
                arrayList.add(vd5Var);
            }
            i = i2;
        }
        if (arrayList.isEmpty()) {
            String strD3 = d(p82Var, "startColor");
            Integer numValueOf = strD3 != null ? Integer.valueOf(v67.m(strD3)) : null;
            String strD4 = d(p82Var, "centerColor");
            Integer numValueOf2 = strD4 != null ? Integer.valueOf(v67.m(strD4)) : null;
            String strD5 = d(p82Var, "endColor");
            Integer numValueOf3 = strD5 != null ? Integer.valueOf(v67.m(strD5)) : null;
            if (numValueOf != null) {
                arrayList.add(new vd5(Float.valueOf(0.0f), new rv0(j51.i(numValueOf.intValue()))));
            }
            if (numValueOf2 != null) {
                arrayList.add(new vd5(Float.valueOf(0.5f), new rv0(j51.i(numValueOf2.intValue()))));
            }
            if (numValueOf3 != null) {
                arrayList.add(new vd5(Float.valueOf(1.0f), new rv0(j51.i(numValueOf3.intValue()))));
            }
        }
        return (vd5[]) arrayList.toArray(new vd5[0]);
    }

    public static final iw6 r(p82 p82Var) {
        Object next;
        String strD;
        String nodeName;
        el2 el2Var = new el2(new fl2(new fx(new eo8(p82Var, null), (byte) 3), true, o48.y));
        do {
            if (!el2Var.hasNext()) {
                next = null;
                break;
            }
            next = el2Var.next();
            nodeName = ((Node) ((p82) next).n).getNodeName();
            nodeName.getClass();
        } while (!nodeName.equals("gradient"));
        p82 p82Var2 = (p82) next;
        if (p82Var2 != null && (strD = d(p82Var2, "type")) != null) {
            int iHashCode = strD.hashCode();
            int i = 0;
            if (iHashCode != -1102672091) {
                if (iHashCode != -938579425) {
                    if (iHashCode == 109850348 && strD.equals("sweep")) {
                        vd5[] vd5VarArrQ = q(p82Var2);
                        vd5[] vd5VarArr = (vd5[]) Arrays.copyOf(vd5VarArrQ, vd5VarArrQ.length);
                        String strD2 = d(p82Var2, "centerX");
                        float f = strD2 != null ? Float.parseFloat(strD2) : 0.0f;
                        String strD3 = d(p82Var2, "centerY");
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(strD3 != null ? Float.parseFloat(strD3) : 0.0f)) & 4294967295L);
                        ArrayList arrayList = new ArrayList(vd5VarArr.length);
                        for (vd5 vd5Var : vd5VarArr) {
                            rv0 rv0Var = (rv0) vd5Var.n;
                            long j = rv0Var.a;
                            arrayList.add(rv0Var);
                        }
                        int length = vd5VarArr.length;
                        ArrayList arrayList2 = new ArrayList(length);
                        while (i < length) {
                            arrayList2.add(Float.valueOf(((Number) vd5VarArr[i].m).floatValue()));
                            i++;
                        }
                        return new wg7(jFloatToRawIntBits, arrayList, arrayList2);
                    }
                } else if (strD.equals("radial")) {
                    vd5[] vd5VarArrQ2 = q(p82Var2);
                    vd5[] vd5VarArr2 = (vd5[]) Arrays.copyOf(vd5VarArrQ2, vd5VarArrQ2.length);
                    String strD4 = d(p82Var2, "centerX");
                    float f2 = strD4 != null ? Float.parseFloat(strD4) : 0.0f;
                    String strD5 = d(p82Var2, "centerY");
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(strD5 != null ? Float.parseFloat(strD5) : 0.0f)) & 4294967295L);
                    String strD6 = d(p82Var2, "gradientRadius");
                    float f3 = strD6 != null ? Float.parseFloat(strD6) : 0.0f;
                    String strD7 = d(p82Var2, "tileMode");
                    int iO = strD7 != null ? v67.o(strD7) : 0;
                    ArrayList arrayList3 = new ArrayList(vd5VarArr2.length);
                    for (vd5 vd5Var2 : vd5VarArr2) {
                        rv0 rv0Var2 = (rv0) vd5Var2.n;
                        long j2 = rv0Var2.a;
                        arrayList3.add(rv0Var2);
                    }
                    int length2 = vd5VarArr2.length;
                    ArrayList arrayList4 = new ArrayList(length2);
                    while (i < length2) {
                        arrayList4.add(Float.valueOf(((Number) vd5VarArr2[i].m).floatValue()));
                        i++;
                    }
                    return new j06(arrayList3, arrayList4, jFloatToRawIntBits2, f3, iO);
                }
            } else if (strD.equals("linear")) {
                vd5[] vd5VarArrQ3 = q(p82Var2);
                vd5[] vd5VarArr3 = (vd5[]) Arrays.copyOf(vd5VarArrQ3, vd5VarArrQ3.length);
                String strD8 = d(p82Var2, "startX");
                float f4 = strD8 != null ? Float.parseFloat(strD8) : 0.0f;
                String strD9 = d(p82Var2, "startY");
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(strD9 != null ? Float.parseFloat(strD9) : 0.0f)) & 4294967295L);
                String strD10 = d(p82Var2, "endX");
                float f5 = strD10 != null ? Float.parseFloat(strD10) : 0.0f;
                String strD11 = d(p82Var2, "endY");
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(f5)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(strD11 != null ? Float.parseFloat(strD11) : 0.0f)));
                String strD12 = d(p82Var2, "tileMode");
                int iO2 = strD12 != null ? v67.o(strD12) : 0;
                ArrayList arrayList5 = new ArrayList(vd5VarArr3.length);
                for (vd5 vd5Var3 : vd5VarArr3) {
                    rv0 rv0Var3 = (rv0) vd5Var3.n;
                    long j3 = rv0Var3.a;
                    arrayList5.add(rv0Var3);
                }
                int length3 = vd5VarArr3.length;
                ArrayList arrayList6 = new ArrayList(length3);
                while (i < length3) {
                    arrayList6.add(Float.valueOf(((Number) vd5VarArr3[i].m).floatValue()));
                    i++;
                }
                return new t94(arrayList5, arrayList6, jFloatToRawIntBits3, jFloatToRawIntBits4, iO2);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x024d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0252  */
    /* JADX WARN: Code duplicated, block: B:143:0x025c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0261  */
    /* JADX WARN: Code duplicated, block: B:147:0x026a  */
    /* JADX WARN: Code duplicated, block: B:148:0x026f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0279  */
    /* JADX WARN: Code duplicated, block: B:152:0x0295  */
    public static final void s(p82 p82Var, ve3 ve3Var, nm nmVar) {
        Object obj;
        boolean z;
        boolean z2;
        sb0 sb0VarR;
        sb0 sb0Var;
        sb0 sb0VarR2;
        int i;
        List list;
        String strD;
        float f;
        String strD2;
        float f2;
        String strD3;
        float f3;
        String strD4;
        float f4;
        int i2;
        rf0 rf0Var;
        nm nmVar2 = nmVar;
        ArrayList arrayList = nmVar2.a;
        Object obj2 = null;
        boolean z3 = true;
        el2 el2Var = new el2(new fl2(new fx(new eo8(p82Var, null), (byte) 3), true, o48.z));
        while (el2Var.hasNext()) {
            p82 p82Var2 = (p82) el2Var.next();
            String nodeName = ((Node) p82Var2.n).getNodeName();
            nodeName.getClass();
            int iHashCode = nodeName.hashCode();
            rf0 rf0Var2 = rf0.n;
            if (iHashCode == -1649314686) {
                arrayList = arrayList;
                obj = obj2;
                z = z3;
                el2Var = el2Var;
                if (nodeName.equals("clip-path")) {
                    String strD5 = d(p82Var2, "name");
                    ve3.b(ve3Var, strD5 != null ? strD5 : "", bc8.a(d(p82Var2, "pathData")));
                    arrayList.add(rf0Var2);
                }
            } else if (iHashCode != 3433509) {
                if (iHashCode == 98629247 && nodeName.equals("group")) {
                    String strD6 = d(p82Var2, "name");
                    String str = strD6 == null ? "" : strD6;
                    String strD7 = d(p82Var2, "rotation");
                    float f5 = strD7 != null ? Float.parseFloat(strD7) : 0.0f;
                    String strD8 = d(p82Var2, "pivotX");
                    float f6 = strD8 != null ? Float.parseFloat(strD8) : 0.0f;
                    String strD9 = d(p82Var2, "pivotY");
                    float f7 = strD9 != null ? Float.parseFloat(strD9) : 0.0f;
                    String strD10 = d(p82Var2, "scaleX");
                    float f8 = strD10 != null ? Float.parseFloat(strD10) : 1.0f;
                    String strD11 = d(p82Var2, "scaleY");
                    float f9 = strD11 != null ? Float.parseFloat(strD11) : 1.0f;
                    String strD12 = d(p82Var2, "translateX");
                    float f10 = strD12 != null ? Float.parseFloat(strD12) : 0.0f;
                    String strD13 = d(p82Var2, "translateY");
                    float f11 = strD13 != null ? Float.parseFloat(strD13) : 0.0f;
                    int i3 = bc8.a;
                    ve3Var.a(str, f5, f6, f7, f8, f9, f10, f11, ea2.m);
                    arrayList.add(rf0.m);
                    s(p82Var2, ve3Var, nmVar2);
                    do {
                        rf0Var = (rf0) qv0.f0(arrayList);
                        ve3Var.f();
                    } while (rf0Var == rf0Var2);
                    arrayList = arrayList;
                    z = z3;
                    el2Var = el2Var;
                    obj = null;
                } else {
                    arrayList = arrayList;
                    obj = obj2;
                    z = z3;
                    el2Var = el2Var;
                }
            } else if (nodeName.equals("path")) {
                List listA = bc8.a(d(p82Var2, "pathData"));
                String strD14 = d(p82Var2, "fillType");
                if (strD14 == null || strD14.equals("nonZero")) {
                    z2 = false;
                } else {
                    if (!strD14.equals("evenOdd")) {
                        yq4.r("unknown fillType: ".concat(strD14));
                        return;
                    }
                    z2 = z3;
                }
                String strD15 = d(p82Var2, "name");
                String str2 = strD15 == null ? "" : strD15;
                String strD16 = d(p82Var2, "fillColor");
                if (strD16 != null) {
                    sb0VarR = new t57(j51.i(v67.m(strD16)));
                } else {
                    p82 p82VarC = c(p82Var2, "fillColor");
                    sb0VarR = p82VarC != null ? r(p82VarC) : null;
                }
                String strD17 = d(p82Var2, "fillAlpha");
                float f12 = strD17 != null ? Float.parseFloat(strD17) : 1.0f;
                String strD18 = d(p82Var2, "strokeColor");
                if (strD18 != null) {
                    sb0Var = sb0VarR;
                    sb0VarR2 = new t57(j51.i(v67.m(strD18)));
                } else {
                    sb0Var = sb0VarR;
                    p82 p82VarC2 = c(p82Var2, "strokeColor");
                    sb0VarR2 = p82VarC2 != null ? r(p82VarC2) : null;
                }
                String strD19 = d(p82Var2, "strokeAlpha");
                float f13 = strD19 != null ? Float.parseFloat(strD19) : 1.0f;
                String strD20 = d(p82Var2, "strokeWidth");
                float f14 = strD20 != null ? Float.parseFloat(strD20) : 1.0f;
                String strD21 = d(p82Var2, "strokeLineCap");
                char c = 2;
                if (strD21 != null) {
                    int iHashCode2 = strD21.hashCode();
                    if (iHashCode2 != -894674659) {
                        if (iHashCode2 != 3035667) {
                            if (iHashCode2 != 108704142 || !strD21.equals("round")) {
                                yq4.r("unknown strokeCap: ".concat(strD21));
                                return;
                            } else {
                                i2 = 1;
                                i = i2;
                            }
                        } else if (!strD21.equals("butt")) {
                            yq4.r("unknown strokeCap: ".concat(strD21));
                            return;
                        } else {
                            i2 = 0;
                            i = i2;
                        }
                    } else if (!strD21.equals("square")) {
                        yq4.r("unknown strokeCap: ".concat(strD21));
                        return;
                    } else {
                        i2 = 2;
                        i = i2;
                    }
                } else {
                    i = 0;
                }
                String strD22 = d(p82Var2, "strokeLineJoin");
                if (strD22 != null) {
                    int iHashCode3 = strD22.hashCode();
                    list = listA;
                    if (iHashCode3 != 93630586) {
                        if (iHashCode3 != 103906565) {
                            if (iHashCode3 == 108704142 && strD22.equals("round")) {
                                c = 1;
                                strD = d(p82Var2, "strokeMiterLimit");
                                if (strD != null) {
                                    f = Float.parseFloat(strD);
                                } else {
                                    f = 1.0f;
                                }
                                strD2 = d(p82Var2, "trimPathStart");
                                if (strD2 != null) {
                                    f2 = Float.parseFloat(strD2);
                                } else {
                                    f2 = 0.0f;
                                }
                                strD3 = d(p82Var2, "trimPathEnd");
                                if (strD3 != null) {
                                    f3 = Float.parseFloat(strD3);
                                } else {
                                    f3 = 1.0f;
                                }
                                strD4 = d(p82Var2, "trimPathOffset");
                                if (strD4 != null) {
                                    f4 = Float.parseFloat(strD4);
                                    obj = null;
                                    z = true;
                                } else {
                                    f4 = 0.0f;
                                    obj = null;
                                    z = true;
                                }
                                r1.c(f12, f13, f14, f, f2, f3, f4, z2, i, c, str2, list, sb0Var, sb0VarR2);
                            }
                        } else if (!strD22.equals("miter")) {
                        }
                        yq4.r("unknown strokeJoin: ".concat(strD22));
                        return;
                    }
                    if (!strD22.equals("bevel")) {
                        yq4.r("unknown strokeJoin: ".concat(strD22));
                        return;
                    }
                    strD = d(p82Var2, "strokeMiterLimit");
                    if (strD != null) {
                        f = Float.parseFloat(strD);
                    } else {
                        f = 1.0f;
                    }
                    strD2 = d(p82Var2, "trimPathStart");
                    if (strD2 != null) {
                        f2 = Float.parseFloat(strD2);
                    } else {
                        f2 = 0.0f;
                    }
                    strD3 = d(p82Var2, "trimPathEnd");
                    if (strD3 != null) {
                        f3 = Float.parseFloat(strD3);
                    } else {
                        f3 = 1.0f;
                    }
                    strD4 = d(p82Var2, "trimPathOffset");
                    if (strD4 != null) {
                        f4 = Float.parseFloat(strD4);
                        obj = null;
                        z = true;
                    } else {
                        f4 = 0.0f;
                        obj = null;
                        z = true;
                    }
                    r1.c(f12, f13, f14, f, f2, f3, f4, z2, i, c, str2, list, sb0Var, sb0VarR2);
                } else {
                    list = listA;
                }
                c = 0;
                strD = d(p82Var2, "strokeMiterLimit");
                if (strD != null) {
                    f = Float.parseFloat(strD);
                } else {
                    f = 1.0f;
                }
                strD2 = d(p82Var2, "trimPathStart");
                if (strD2 != null) {
                    f2 = Float.parseFloat(strD2);
                } else {
                    f2 = 0.0f;
                }
                strD3 = d(p82Var2, "trimPathEnd");
                if (strD3 != null) {
                    f3 = Float.parseFloat(strD3);
                } else {
                    f3 = 1.0f;
                }
                strD4 = d(p82Var2, "trimPathOffset");
                if (strD4 != null) {
                    f4 = Float.parseFloat(strD4);
                    obj = null;
                    z = true;
                } else {
                    f4 = 0.0f;
                    obj = null;
                    z = true;
                }
                r1.c(f12, f13, f14, f, f2, f3, f4, z2, i, c, str2, list, sb0Var, sb0VarR2);
            } else {
                arrayList = arrayList;
                z = z3;
                el2Var = el2Var;
                obj = null;
            }
            arrayList = arrayList;
            el2Var = el2Var;
            obj2 = obj;
            z3 = z;
            nmVar2 = nmVar;
        }
    }

    public static final px4 t(Object obj, ux2 ux2Var) {
        Object objK = ux2Var.K();
        if (objK == e01.a) {
            objK = p(obj);
            ux2Var.g0(objK);
        }
        px4 px4Var = (px4) objK;
        px4Var.setValue(obj);
        return px4Var;
    }

    public static final Object[] u(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        cx.J0(0, i, 6, objArr, objArr2);
        cx.G0(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] v(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        cx.J0(0, i, 6, objArr, objArr2);
        cx.G0(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void w(zh3 zh3Var) {
        zh3Var.getClass();
        int iOrdinal = zh3Var.ordinal();
        if (iOrdinal == 0) {
            IStatisticsHandler iStatisticsHandler = ga7.a;
            ga7.a(ai3.NoBrowserDialog);
        } else if (iOrdinal != 1) {
            gk0.s();
        } else {
            IStatisticsHandler iStatisticsHandler2 = ga7.a;
            ga7.a(ai3.DeviceLimitReachedDialog);
        }
    }

    public static final void x(a47 a47Var, String str) {
        a47Var.getClass();
        int iOrdinal = a47Var.ordinal();
        if (iOrdinal == 0) {
            IStatisticsHandler iStatisticsHandler = ga7.a;
            ga7.a(D(b47.SessionRemovedSnackbarMessage, str));
            return;
        }
        if (iOrdinal == 1) {
            IStatisticsHandler iStatisticsHandler2 = ga7.a;
            ga7.a(D(b47.LoginGenericError, str));
            return;
        }
        if (iOrdinal == 2) {
            IStatisticsHandler iStatisticsHandler3 = ga7.a;
            ga7.a(D(b47.LoginErrorExpired, str));
        } else if (iOrdinal == 3) {
            IStatisticsHandler iStatisticsHandler4 = ga7.a;
            ga7.a(D(b47.LoginErrorIncorrectEmail, str));
        } else if (iOrdinal != 4) {
            gk0.s();
        } else {
            IStatisticsHandler iStatisticsHandler5 = ga7.a;
            ga7.a(D(b47.LoginErrorTimeOut, str));
        }
    }

    public static final cp1 y(p7 p7Var) {
        p7Var.getClass();
        cp1 cp1Var = (cp1) ao3.d.get(p7Var);
        return cp1Var == null ? dp1.f(p7Var) : cp1Var;
    }

    public static final int z(String str) {
        u68 u68VarA = A(16, str);
        if (u68VarA != null) {
            return u68VarA.m;
        }
        bc7.I(str);
        throw null;
    }
}
