package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.material.navigation.NavigationView;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.manager.LockManager;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.swig.tvaccount.IAccountAndroid;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yt2 implements yr0, od7, i20, ex5, ty4 {
    public final /* synthetic */ byte m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f2642o;

    public yt2(LifecycleOwner lifecycleOwner, ve8 ve8Var) {
        this.m = (byte) 19;
        this.n = lifecycleOwner;
        ve8Var.getClass();
        af1 af1Var = af1.b;
        af1Var.getClass();
        pn5 pn5Var = new pn5(ve8Var, sc4.f2007o, af1Var);
        wt3 wt3VarB = w86.a.b(sc4.class);
        String strC = wt3VarB.c();
        if (strC != null) {
            this.f2642o = (sc4) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
        } else {
            hk0.g("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public static yt2 C(LifecycleOwner lifecycleOwner) {
        return new yt2(lifecycleOwner, ((we8) lifecycleOwner).o());
    }

    public static int H(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public static yt2 f(View view) {
        TextView textView = (TextView) r47.s(view, R.id.pl_computer_name);
        if (textView != null) {
            return new yt2(view, (Object) textView, (byte) 18);
        }
        yq4.l("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.pl_computer_name)));
        return null;
    }

    public int A(int i) {
        switch (this.m) {
            case 5:
                int[] iArr = (int[]) this.f2642o;
                return iArr[(iArr.length - 1) - i];
            default:
                int[] iArr2 = (int[]) this.f2642o;
                return iArr2[(iArr2.length - 1) - i];
        }
    }

    public int B() {
        int length;
        switch (this.m) {
            case 5:
                length = ((int[]) this.f2642o).length;
                break;
            default:
                length = ((int[]) this.f2642o).length;
                break;
        }
        return length - 1;
    }

    public do4 D() {
        return (do4) ((bg5) this.f2642o).getValue();
    }

    public void E(gu0 gu0Var, Function0 function0, Function1 function1) {
        c60 c60Var = (c60) ((cg3) this.n).g;
        if (c60Var != null) {
            ag3 ag3Var = new ag3(gu0Var, function0, function1);
            if (c60.g(new rq8(c60Var, ag3Var, "subs"), 30000L, new it8((Object) c60Var, (Object) ag3Var, (byte) 24), Looper.myLooper() == null ? c60Var.e : new Handler(Looper.myLooper()), c60Var.f()) == null) {
                g60 g60VarJ = c60Var.j();
                c60Var.r(25, 9, g60VarJ);
                nr8 nr8Var = yr8.n;
                ag3Var.a(g60VarJ, ds8.q);
            }
        }
    }

    public String F() {
        IAccountAndroid iAccountAndroid = (IAccountAndroid) this.f2642o;
        long jGetAccountID = iAccountAndroid.GetAccountID();
        String strGetEmail = iAccountAndroid.GetEmail();
        long jGetCompanyID = iAccountAndroid.GetCompanyID();
        if (jGetAccountID == 0) {
            return null;
        }
        strGetEmail.getClass();
        if (strGetEmail.length() <= 0) {
            return null;
        }
        try {
            byte[] bytes = (jGetAccountID + "_" + ub7.v0(32, xz2.z0(strGetEmail + jGetAccountID + jGetCompanyID))).getBytes(vn0.a);
            bytes.getClass();
            String strEncodeToString = Base64.encodeToString(bytes, 0);
            strEncodeToString.getClass();
            return strEncodeToString;
        } catch (Exception e) {
            e41.s("Could not encrypt account ID. Error: ", e.getMessage(), "AccountIdEncryption");
            return "";
        }
    }

    public void G(gu0 gu0Var, Function0 function0, Function1 function1) {
        List listK = qf0.K(new xy5());
        wy5 wy5Var = new wy5();
        if (listK.isEmpty()) {
            hk0.g("Product list cannot be empty.");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            ((xy5) it.next()).getClass();
            hashSet.add("subs");
        }
        if (hashSet.size() > 1) {
            hk0.g("All products should be of the same product type.");
            return;
        }
        yr8 yr8VarK = yr8.k(listK);
        wy5Var.a = yr8VarK;
        if (yr8VarK == null) {
            hk0.g("Product list must be set to a non empty list.");
            return;
        }
        wy5 wy5Var2 = new wy5();
        wy5Var2.a = wy5Var.a;
        c60 c60Var = (c60) ((cg3) this.n).g;
        if (c60Var != null) {
            c60Var.c(wy5Var2, new ag3(gu0Var, function1, function0));
        }
    }

    public void I() {
        ((SparseIntArray) this.n).clear();
    }

    public boolean J() {
        switch (this.m) {
            case 5:
                return ((int[]) this.f2642o)[0] == 0;
            default:
                return ((int[]) this.f2642o)[0] == 0;
        }
    }

    public yt2 K(int i) {
        int[] iArr = (int[]) this.f2642o;
        xy2 xy2Var = (xy2) this.n;
        if (i == 0) {
            return xy2Var.c;
        }
        if (i == 1) {
            return this;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = xy2Var.b(iArr[i2], i);
        }
        return new yt2(xy2Var, iArr2);
    }

    public yt2 L(yt2 yt2Var) {
        us4 us4Var = (us4) this.n;
        if (!us4Var.equals((us4) yt2Var.n)) {
            hk0.g("ModulusPolys do not have same ModulusGF field");
            return null;
        }
        if (J() || yt2Var.J()) {
            return us4Var.c;
        }
        int[] iArr = (int[]) this.f2642o;
        int length = iArr.length;
        int[] iArr2 = (int[]) yt2Var.f2642o;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = us4Var.a(iArr3[i4], us4Var.c(i2, iArr2[i3]));
            }
        }
        return new yt2(us4Var, iArr3);
    }

    public yt2 M(int i) {
        int[] iArr = (int[]) this.f2642o;
        us4 us4Var = (us4) this.n;
        if (i == 0) {
            return us4Var.c;
        }
        if (i == 1) {
            return this;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = us4Var.c(iArr[i2], i);
        }
        return new yt2(us4Var, iArr2);
    }

    public yt2 N(yt2 yt2Var) {
        if (!((us4) this.n).equals((us4) yt2Var.n)) {
            hk0.g("ModulusPolys do not have same ModulusGF field");
            return null;
        }
        if (yt2Var.J()) {
            return this;
        }
        int[] iArr = (int[]) yt2Var.f2642o;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i = 0;
        while (true) {
            us4 us4Var = (us4) yt2Var.n;
            if (i >= length) {
                return d(new yt2(us4Var, iArr2));
            }
            int i2 = iArr[i];
            us4Var.getClass();
            iArr2[i] = (929 - i2) % 929;
            i++;
        }
    }

    public g38 O(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            tv5 tv5Var = (tv5) ((uv5) this.f2642o).n.get(i);
            String str = (String) ((vv5) this.n).n.get(tv5Var.p);
            sv5 sv5Var = tv5Var.q;
            sv5Var.getClass();
            int iOrdinal = sv5Var.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else {
                if (iOrdinal != 2) {
                    gk0.s();
                    return null;
                }
                linkedList2.addFirst(str);
                z = true;
            }
            i = tv5Var.f2148o;
        }
        return new g38(linkedList, linkedList2, Boolean.valueOf(z));
    }

    public void P(int i, cv0 cv0Var) throws IOException {
        Iterator it = (Iterator) this.n;
        while (true) {
            Map.Entry entry = (Map.Entry) this.f2642o;
            if (entry == null || ((ly2) entry.getKey()).m >= i) {
                return;
            }
            ly2 ly2Var = (ly2) ((Map.Entry) this.f2642o).getKey();
            Object value = ((Map.Entry) this.f2642o).getValue();
            cj2 cj2Var = cj2.c;
            yl8 yl8Var = ly2Var.n;
            short s = ly2Var.m;
            if (ly2Var.f1418o) {
                for (Object obj : (List) value) {
                    if (yl8Var == yl8.q) {
                        cv0Var.I(s, 3);
                        ((t1) obj).f(cv0Var);
                        cv0Var.I(s, 4);
                    } else {
                        cv0Var.I(s, yl8Var.n);
                        cj2.k(cv0Var, yl8Var, obj);
                    }
                }
            } else if (yl8Var == yl8.q) {
                cv0Var.I(s, 3);
                ((t1) value).f(cv0Var);
                cv0Var.I(s, 4);
            } else {
                cv0Var.I(s, yl8Var.n);
                cj2.k(cv0Var, yl8Var, value);
            }
            if (it.hasNext()) {
                this.f2642o = (Map.Entry) it.next();
            } else {
                this.f2642o = null;
            }
        }
    }

    @Override // o.ty4
    public String a(int i) {
        g38 g38VarO = O(i);
        List list = (List) g38VarO.m;
        String strT0 = lv0.t0((List) g38VarO.n, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strT0;
        }
        return lv0.t0(list, "/", null, null, null, 62) + '/' + strT0;
    }

    @Override // o.ty4
    public boolean b(int i) {
        return ((Boolean) O(i).f855o).booleanValue();
    }

    @Override // o.yr0
    public xr0 c(js0 js0Var) {
        js0Var.getClass();
        f71 f71Var = (f71) this.n;
        tp1 tp1Var = (tp1) this.f2642o;
        ((jk0) tp1Var.c().c).getClass();
        r86 r86VarS = vs1.s(f71Var, js0Var, ps3.g);
        if (r86VarS == null) {
            return null;
        }
        p76.a(r86VarS.a).equals(js0Var);
        return tp1Var.g(r86VarS);
    }

    public yt2 d(yt2 yt2Var) {
        us4 us4Var = (us4) this.n;
        if (!us4Var.equals((us4) yt2Var.n)) {
            hk0.g("ModulusPolys do not have same ModulusGF field");
            return null;
        }
        if (J()) {
            return yt2Var;
        }
        if (yt2Var.J()) {
            return this;
        }
        int[] iArr = (int[]) this.f2642o;
        int[] iArr2 = (int[]) yt2Var.f2642o;
        if (iArr.length <= iArr2.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = us4Var.a(iArr2[i - length], iArr[i]);
        }
        return new yt2(us4Var, iArr3);
    }

    public yt2 e(yt2 yt2Var) {
        xy2 xy2Var = (xy2) this.n;
        if (!xy2Var.equals((xy2) yt2Var.n)) {
            hk0.g("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (J()) {
            return yt2Var;
        }
        if (yt2Var.J()) {
            return this;
        }
        int[] iArr = (int[]) this.f2642o;
        int[] iArr2 = (int[]) yt2Var.f2642o;
        if (iArr.length <= iArr2.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new yt2(xy2Var, iArr3);
    }

    @Override // o.od7
    public boolean g(Object obj, Object obj2) {
        o34 o34Var = (o34) this.n;
        return im3.n(o34Var.b(obj), o34Var.b(obj2));
    }

    @Override // o.ex5
    public Object get() {
        return new zq4((Context) ((f4) this.n).m, (iu) ((xc0) this.f2642o).get());
    }

    @Override // o.ty4
    public String getString(int i) {
        String str = (String) ((vv5) this.n).n.get(i);
        str.getClass();
        return str;
    }

    public void h(ut2 ut2Var, boolean z) {
        ut2 ut2Var2 = ((su2) this.n).z;
        if (ut2Var2 != null) {
            ut2Var2.G().p.h(ut2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2642o).iterator();
        it.getClass();
        while (it.hasNext()) {
            gu2 gu2Var = (gu2) it.next();
            if (!z || gu2Var.b) {
                gu2Var.a.getClass();
            }
        }
    }

    public void i(ut2 ut2Var, boolean z) {
        su2 su2Var = (su2) this.n;
        Context context = su2Var.x.t;
        ut2 ut2Var2 = su2Var.z;
        if (ut2Var2 != null) {
            ut2Var2.G().p.i(ut2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2642o).iterator();
        it.getClass();
        while (it.hasNext()) {
            gu2 gu2Var = (gu2) it.next();
            if (!z || gu2Var.b) {
                gu2Var.a.a(su2Var, ut2Var, context);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.i20
    public void j(Enum r3, bb5 bb5Var) {
        pb3 pb3Var;
        w05 w05Var = (w05) r3;
        MainActivity mainActivity = (MainActivity) this.n;
        if (w05.Connect == w05Var && (bb5Var instanceof ha3) && (pb3Var = mainActivity.Y) != null) {
            nk4 nk4Var = (nk4) pb3Var;
            if (nk4Var.J) {
                return;
            }
            nk4Var.I = false;
            ((ha3) bb5Var).m(this.f2642o);
            pb3 pb3Var2 = mainActivity.Y;
            if (pb3Var2 != null) {
                nk4 nk4Var2 = (nk4) pb3Var2;
                nk4Var2.H = 0L;
                nk4Var2.I = false;
                nk4Var2.M = "";
                nk4Var2.N = 0L;
            }
            mainActivity.Z = false;
        }
    }

    @Override // o.od7
    public void k(nd7 nd7Var) {
        vw4 vw4Var = (vw4) this.f2642o;
        vw4Var.a();
        bx4 bx4Var = (bx4) nd7Var.n;
        Object[] objArr = bx4Var.b;
        long[] jArr = bx4Var.c;
        int i = bx4Var.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objB = ((o34) this.n).b(obj);
            int iD = vw4Var.d(objB);
            int i3 = iD >= 0 ? vw4Var.c[iD] : 0;
            if (i3 == 7) {
                nd7Var.remove(obj);
            } else {
                vw4Var.g(i3 + 1, objB);
            }
            i = i2;
        }
    }

    public void l(ut2 ut2Var, Bundle bundle, boolean z) {
        su2 su2Var = (su2) this.n;
        ut2 ut2Var2 = su2Var.z;
        if (ut2Var2 != null) {
            ut2Var2.G().p.l(ut2Var, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2642o).iterator();
        it.getClass();
        while (it.hasNext()) {
            gu2 gu2Var = (gu2) it.next();
            if (!z || gu2Var.b) {
                gu2Var.a.b(su2Var, ut2Var);
            }
        }
    }

    public void m(ut2 ut2Var, boolean z) {
        su2 su2Var = (su2) this.n;
        ut2 ut2Var2 = su2Var.z;
        if (ut2Var2 != null) {
            ut2Var2.G().p.m(ut2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2642o).iterator();
        it.getClass();
        while (it.hasNext()) {
            gu2 gu2Var = (gu2) it.next();
            if (!z || gu2Var.b) {
                gu2Var.a.c(su2Var, ut2Var);
            }
        }
    }

    public void n(ut2 ut2Var, boolean z) {
        su2 su2Var = (su2) this.n;
        ut2 ut2Var2 = su2Var.z;
        if (ut2Var2 != null) {
            ut2Var2.G().p.n(ut2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2642o).iterator();
        it.getClass();
        while (it.hasNext()) {
            gu2 gu2Var = (gu2) it.next();
            if (!z || gu2Var.b) {
                gu2Var.a.d(su2Var, ut2Var);
            }
        }
    }

    public void o(ut2 ut2Var, boolean z) {
        su2 su2Var = (su2) this.n;
        ut2 ut2Var2 = su2Var.z;
        if (ut2Var2 != null) {
            ut2Var2.G().p.o(ut2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2642o).iterator();
        it.getClass();
        while (it.hasNext()) {
            gu2 gu2Var = (gu2) it.next();
            if (!z || gu2Var.b) {
                gu2Var.a.e(su2Var, ut2Var);
            }
        }
    }

    public void p(ut2 ut2Var, boolean z) {
        su2 su2Var = (su2) this.n;
        Context context = su2Var.x.t;
        ut2 ut2Var2 = su2Var.z;
        if (ut2Var2 != null) {
            ut2Var2.G().p.p(ut2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2642o).iterator();
        it.getClass();
        while (it.hasNext()) {
            gu2 gu2Var = (gu2) it.next();
            if (!z || gu2Var.b) {
                gu2Var.a.getClass();
            }
        }
    }

    public void q(ut2 ut2Var, boolean z) {
        ut2 ut2Var2 = ((su2) this.n).z;
        if (ut2Var2 != null) {
            ut2Var2.G().p.q(ut2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2642o).iterator();
        it.getClass();
        while (it.hasNext()) {
            gu2 gu2Var = (gu2) it.next();
            if (!z || gu2Var.b) {
                gu2Var.a.getClass();
            }
        }
    }

    public void r(ut2 ut2Var, boolean z) {
        su2 su2Var = (su2) this.n;
        ut2 ut2Var2 = su2Var.z;
        if (ut2Var2 != null) {
            ut2Var2.G().p.r(ut2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2642o).iterator();
        it.getClass();
        while (it.hasNext()) {
            gu2 gu2Var = (gu2) it.next();
            if (!z || gu2Var.b) {
                gu2Var.a.f(su2Var, ut2Var);
            }
        }
    }

    public void s(ut2 ut2Var, Bundle bundle, boolean z) {
        su2 su2Var = (su2) this.n;
        ut2 ut2Var2 = su2Var.z;
        if (ut2Var2 != null) {
            ut2Var2.G().p.s(ut2Var, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2642o).iterator();
        it.getClass();
        while (it.hasNext()) {
            gu2 gu2Var = (gu2) it.next();
            if (!z || gu2Var.b) {
                gu2Var.a.g(su2Var, ut2Var, bundle);
            }
        }
    }

    public void t(ut2 ut2Var, boolean z) {
        su2 su2Var = (su2) this.n;
        ut2 ut2Var2 = su2Var.z;
        if (ut2Var2 != null) {
            ut2Var2.G().p.t(ut2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2642o).iterator();
        it.getClass();
        while (it.hasNext()) {
            gu2 gu2Var = (gu2) it.next();
            if (!z || gu2Var.b) {
                gu2Var.a.h(su2Var, ut2Var);
            }
        }
    }

    public String toString() {
        int iLastIndexOf;
        switch (this.m) {
            case 5:
                if (J()) {
                    return "0";
                }
                StringBuilder sb = new StringBuilder(B() * 8);
                for (int iB = B(); iB >= 0; iB--) {
                    int iA = A(iB);
                    if (iA != 0) {
                        if (iA < 0) {
                            if (iB == B()) {
                                sb.append("-");
                            } else {
                                sb.append(" - ");
                            }
                            iA = -iA;
                        } else if (sb.length() > 0) {
                            sb.append(" + ");
                        }
                        if (iB == 0 || iA != 1) {
                            xy2 xy2Var = (xy2) this.n;
                            if (iA == 0) {
                                xy2Var.getClass();
                                yq4.f();
                                return null;
                            }
                            int i = xy2Var.b[iA];
                            if (i == 0) {
                                sb.append('1');
                            } else if (i == 1) {
                                sb.append('a');
                            } else {
                                sb.append("a^");
                                sb.append(i);
                            }
                        }
                        if (iB != 0) {
                            if (iB == 1) {
                                sb.append('x');
                            } else {
                                sb.append("x^");
                                sb.append(iB);
                            }
                        }
                    }
                }
                return sb.toString();
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                LifecycleOwner lifecycleOwner = (LifecycleOwner) this.n;
                String simpleName = lifecycleOwner.getClass().getSimpleName();
                if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = lifecycleOwner.getClass().getName()).lastIndexOf(46)) > 0) {
                    simpleName = simpleName.substring(iLastIndexOf + 1);
                }
                sb2.append(simpleName);
                sb2.append('{');
                sb2.append(Integer.toHexString(System.identityHashCode(lifecycleOwner)));
                sb2.append("}}");
                return sb2.toString();
            case 25:
                StringBuilder sb3 = new StringBuilder(B() * 8);
                for (int iB2 = B(); iB2 >= 0; iB2--) {
                    int iA2 = A(iB2);
                    if (iA2 != 0) {
                        if (iA2 < 0) {
                            sb3.append(" - ");
                            iA2 = -iA2;
                        } else if (sb3.length() > 0) {
                            sb3.append(" + ");
                        }
                        if (iB2 == 0 || iA2 != 1) {
                            sb3.append(iA2);
                        }
                        if (iB2 != 0) {
                            if (iB2 == 1) {
                                sb3.append('x');
                            } else {
                                sb3.append("x^");
                                sb3.append(iB2);
                            }
                        }
                    }
                }
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public void u(ut2 ut2Var, boolean z) {
        su2 su2Var = (su2) this.n;
        ut2 ut2Var2 = su2Var.z;
        if (ut2Var2 != null) {
            ut2Var2.G().p.u(ut2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2642o).iterator();
        it.getClass();
        while (it.hasNext()) {
            gu2 gu2Var = (gu2) it.next();
            if (!z || gu2Var.b) {
                gu2Var.a.i(su2Var, ut2Var);
            }
        }
    }

    public void v(ut2 ut2Var, View view, Bundle bundle, boolean z) {
        view.getClass();
        su2 su2Var = (su2) this.n;
        ut2 ut2Var2 = su2Var.z;
        if (ut2Var2 != null) {
            ut2Var2.G().p.v(ut2Var, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2642o).iterator();
        it.getClass();
        while (it.hasNext()) {
            gu2 gu2Var = (gu2) it.next();
            if (!z || gu2Var.b) {
                gu2Var.a.j(su2Var, ut2Var, view);
            }
        }
    }

    public void w(ut2 ut2Var, boolean z) {
        su2 su2Var = (su2) this.n;
        ut2 ut2Var2 = su2Var.z;
        if (ut2Var2 != null) {
            ut2Var2.G().p.w(ut2Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2642o).iterator();
        it.getClass();
        while (it.hasNext()) {
            gu2 gu2Var = (gu2) it.next();
            if (!z || gu2Var.b) {
                gu2Var.a.k(su2Var, ut2Var);
            }
        }
    }

    public void x(String str, PrintWriter printWriter) {
        n77 n77Var = ((sc4) this.f2642o).n;
        if (n77Var.f1550o > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (n77Var.f1550o <= 0) {
                return;
            }
            if (n77Var.d(0) != null) {
                io.sentry.h2.f();
                return;
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(n77Var.b(0));
            printWriter.print(": ");
            throw null;
        }
    }

    public int y(int i) {
        int i2 = 0;
        int i3 = 1;
        switch (this.m) {
            case 5:
                int[] iArr = (int[]) this.f2642o;
                if (i == 0) {
                    return A(0);
                }
                if (i != 1) {
                    int iB = iArr[0];
                    int length = iArr.length;
                    while (i3 < length) {
                        iB = ((xy2) this.n).b(i, iB) ^ iArr[i3];
                        i3++;
                    }
                    return iB;
                }
                int length2 = iArr.length;
                int i4 = 0;
                while (i2 < length2) {
                    int i5 = iArr[i2];
                    xy2 xy2Var = xy2.h;
                    i4 ^= i5;
                    i2++;
                }
                return i4;
            default:
                us4 us4Var = (us4) this.n;
                int[] iArr2 = (int[]) this.f2642o;
                if (i == 0) {
                    return A(0);
                }
                if (i == 1) {
                    int length3 = iArr2.length;
                    int iA = 0;
                    while (i2 < length3) {
                        iA = us4Var.a(iA, iArr2[i2]);
                        i2++;
                    }
                    return iA;
                }
                int iA2 = iArr2[0];
                int length4 = iArr2.length;
                while (i3 < length4) {
                    iA2 = us4Var.a(us4Var.c(i, iA2), iArr2[i3]);
                    i3++;
                }
                return iA2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory z(String str) {
        Bundle bundle;
        Object obj;
        Map map = (Map) this.f2642o;
        if (map == null) {
            Context context = (Context) this.n;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    io.sentry.android.core.v0.j("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        io.sentry.android.core.v0.j("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        io.sentry.android.core.v0.j("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f2642o = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                io.sentry.android.core.v0.j("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                io.sentry.android.core.v0.j("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f2642o = map;
        }
        String str4 = (String) map.get(str);
        if (str4 != null) {
            try {
                return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e) {
                io.sentry.android.core.v0.l("BackendRegistry", "Class " + str4 + " is not found.", e);
            } catch (IllegalAccessException e2) {
                io.sentry.android.core.v0.l("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            } catch (InstantiationException e3) {
                io.sentry.android.core.v0.l("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            } catch (NoSuchMethodException e4) {
                io.sentry.android.core.v0.l("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            } catch (InvocationTargetException e5) {
                io.sentry.android.core.v0.l("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            }
        }
        return null;
    }

    public /* synthetic */ yt2(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f2642o = obj2;
    }

    public yt2(SharedPreferences sharedPreferences, ll2 ll2Var) {
        this.m = (byte) 16;
        sharedPreferences.getClass();
        ll2Var.getClass();
        this.n = sharedPreferences;
        this.f2642o = ll2Var;
    }

    public yt2(LockManager lockManager, RemoteControlApplication remoteControlApplication) {
        this.m = (byte) 21;
        lockManager.getClass();
        this.n = lockManager;
        this.f2642o = remoteControlApplication;
        remoteControlApplication.registerActivityLifecycleCallbacks(new v7(this, (byte) 1));
    }

    public yt2(vv5 vv5Var, uv5 uv5Var) {
        this.m = (byte) 28;
        vv5Var.getClass();
        uv5Var.getClass();
        this.n = vv5Var;
        this.f2642o = uv5Var;
    }

    public yt2(nx3 nx3Var) {
        this.m = (byte) 26;
        this.n = nx3Var;
    }

    public yt2(cg3 cg3Var, IAccountAndroid iAccountAndroid, xz2 xz2Var) {
        this.m = (byte) 9;
        this.n = cg3Var;
        this.f2642o = iAccountAndroid;
    }

    public yt2(su2 su2Var) {
        this.m = (byte) 2;
        this.n = su2Var;
        this.f2642o = new CopyOnWriteArrayList();
    }

    public yt2(us4 us4Var, int[] iArr) {
        this.m = (byte) 25;
        if (iArr.length != 0) {
            this.n = us4Var;
            int length = iArr.length;
            int i = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.f2642o = new int[]{0};
                    return;
                }
                int i2 = length - i;
                int[] iArr2 = new int[i2];
                this.f2642o = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, i2);
                return;
            }
            this.f2642o = iArr;
            return;
        }
        yq4.f();
        throw null;
    }

    public yt2(LayoutNode layoutNode, do4 do4Var) {
        this.m = (byte) 10;
        this.n = layoutNode;
        this.f2642o = h57.p(do4Var);
    }

    public yt2(LinearLayout linearLayout, NavigationView navigationView, TextView textView, TextView textView2) {
        this.m = (byte) 1;
        this.n = textView;
        this.f2642o = textView2;
    }

    public /* synthetic */ yt2(Object obj, byte b) {
        this.m = b;
        this.n = obj;
        this.f2642o = null;
    }

    public yt2(xy2 xy2Var, int[] iArr) {
        this.m = (byte) 5;
        if (iArr.length != 0) {
            this.n = xy2Var;
            int length = iArr.length;
            int i = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.f2642o = new int[]{0};
                    return;
                }
                int i2 = length - i;
                int[] iArr2 = new int[i2];
                this.f2642o = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, i2);
                return;
            }
            this.f2642o = iArr;
            return;
        }
        yq4.f();
        throw null;
    }

    public yt2(o34 o34Var) {
        this.m = (byte) 14;
        this.n = o34Var;
        vw4 vw4Var = h65.a;
        this.f2642o = new vw4();
    }

    public yt2(Animator animator) {
        this.m = (byte) 0;
        this.n = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2642o = animatorSet;
        animatorSet.play(animator);
    }

    public yt2(ArrayList arrayList, ArrayList arrayList2) {
        this.m = (byte) 6;
        int size = arrayList.size();
        this.n = new int[size];
        this.f2642o = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.n)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f2642o)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public yt2(int i, int i2) {
        this.m = (byte) 6;
        this.n = new int[]{i, i2};
        this.f2642o = new float[]{0.0f, 1.0f};
    }

    public yt2(int i, int i2, int i3) {
        this.m = (byte) 6;
        this.n = new int[]{i, i2, i3};
        this.f2642o = new float[]{0.0f, 0.5f, 1.0f};
    }

    public yt2(gp3 gp3Var, JobWorkItem jobWorkItem) {
        this.m = (byte) 12;
        this.f2642o = gp3Var;
        this.n = jobWorkItem;
    }

    public yt2(ky2 ky2Var) {
        this.m = (byte) 4;
        cj2 cj2Var = ky2Var.m;
        cj2Var.getClass();
        Iterator it = ((pw) cj2Var.a.entrySet()).iterator();
        this.n = it;
        if (it.hasNext()) {
            this.f2642o = (Map.Entry) it.next();
        }
    }

    public yt2(byte b) {
        this.m = b;
        switch (b) {
            case 15:
                break;
            case 29:
                this.n = new jx4();
                this.f2642o = new jx4();
                break;
            default:
                this.n = new SparseIntArray();
                this.f2642o = new SparseIntArray();
                break;
        }
    }
}
