package o;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class su2 {
    public ut2 A;
    public k8 D;
    public k8 E;
    public k8 F;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public uu2 P;
    public boolean b;
    public ArrayList e;
    public o75 g;
    public final hu2 r;
    public final hu2 s;
    public final hu2 t;
    public final hu2 u;
    public wt2 x;
    public lv1 y;
    public ut2 z;
    public final ArrayList a = new ArrayList();
    public final j93 c = new j93((byte) 20);
    public ArrayList d = new ArrayList();
    public final fu2 f = new fu2(this);
    public w10 h = null;
    public boolean i = false;
    public final r10 j = new r10(this, 4);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());
    public final Map n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f2054o = new ArrayList();
    public final yt2 p = new yt2(this);
    public final CopyOnWriteArrayList q = new CopyOnWriteArrayList();
    public final ju2 v = new ju2(this);
    public int w = -1;
    public final ku2 B = new ku2(this);
    public final cr C = new cr(19);
    public ArrayDeque G = new ArrayDeque();
    public final mt8 Q = new mt8((Object) this, (byte) 12);

    /* JADX WARN: Type inference failed for: r0v17, types: [o.hu2] */
    /* JADX WARN: Type inference failed for: r0v18, types: [o.hu2] */
    /* JADX WARN: Type inference failed for: r0v19, types: [o.hu2] */
    /* JADX WARN: Type inference failed for: r0v20, types: [o.hu2] */
    public su2() {
        final byte b = 0;
        this.r = new c71(this) { // from class: o.hu2
            public final /* synthetic */ su2 b;

            {
                this.b = this;
            }

            @Override // o.c71
            public final void accept(Object obj) {
                byte b2 = b;
                su2 su2Var = this.b;
                switch (b2) {
                    case 0:
                        if (su2Var.O()) {
                            su2Var.j(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (su2Var.O() && num.intValue() == 80) {
                            su2Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        sv4 sv4Var = (sv4) obj;
                        if (su2Var.O()) {
                            boolean z = sv4Var.a;
                            su2Var.o(false);
                        }
                        break;
                    default:
                        pk5 pk5Var = (pk5) obj;
                        if (su2Var.O()) {
                            boolean z2 = pk5Var.a;
                            su2Var.t(false);
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.s = new c71(this) { // from class: o.hu2
            public final /* synthetic */ su2 b;

            {
                this.b = this;
            }

            @Override // o.c71
            public final void accept(Object obj) {
                byte b3 = b2;
                su2 su2Var = this.b;
                switch (b3) {
                    case 0:
                        if (su2Var.O()) {
                            su2Var.j(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (su2Var.O() && num.intValue() == 80) {
                            su2Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        sv4 sv4Var = (sv4) obj;
                        if (su2Var.O()) {
                            boolean z = sv4Var.a;
                            su2Var.o(false);
                        }
                        break;
                    default:
                        pk5 pk5Var = (pk5) obj;
                        if (su2Var.O()) {
                            boolean z2 = pk5Var.a;
                            su2Var.t(false);
                        }
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.t = new c71(this) { // from class: o.hu2
            public final /* synthetic */ su2 b;

            {
                this.b = this;
            }

            @Override // o.c71
            public final void accept(Object obj) {
                byte b4 = b3;
                su2 su2Var = this.b;
                switch (b4) {
                    case 0:
                        if (su2Var.O()) {
                            su2Var.j(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (su2Var.O() && num.intValue() == 80) {
                            su2Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        sv4 sv4Var = (sv4) obj;
                        if (su2Var.O()) {
                            boolean z = sv4Var.a;
                            su2Var.o(false);
                        }
                        break;
                    default:
                        pk5 pk5Var = (pk5) obj;
                        if (su2Var.O()) {
                            boolean z2 = pk5Var.a;
                            su2Var.t(false);
                        }
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.u = new c71(this) { // from class: o.hu2
            public final /* synthetic */ su2 b;

            {
                this.b = this;
            }

            @Override // o.c71
            public final void accept(Object obj) {
                byte b5 = b4;
                su2 su2Var = this.b;
                switch (b5) {
                    case 0:
                        if (su2Var.O()) {
                            su2Var.j(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (su2Var.O() && num.intValue() == 80) {
                            su2Var.n(false);
                            break;
                        }
                        break;
                    case 2:
                        sv4 sv4Var = (sv4) obj;
                        if (su2Var.O()) {
                            boolean z = sv4Var.a;
                            su2Var.o(false);
                        }
                        break;
                    default:
                        pk5 pk5Var = (pk5) obj;
                        if (su2Var.O()) {
                            boolean z2 = pk5Var.a;
                            su2Var.t(false);
                        }
                        break;
                }
            }
        };
    }

    public static HashSet H(w10 w10Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < w10Var.a.size(); i++) {
            ut2 ut2Var = ((ev2) w10Var.a.get(i)).b;
            if (ut2Var != null && w10Var.g) {
                hashSet.add(ut2Var);
            }
        }
        return hashSet;
    }

    public static boolean M(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean N(ut2 ut2Var) {
        if (ut2Var.Q && ut2Var.R) {
            return true;
        }
        boolean zN = false;
        for (ut2 ut2Var2 : ut2Var.H.c.O()) {
            if (ut2Var2 != null) {
                zN = N(ut2Var2);
            }
            if (zN) {
                return true;
            }
        }
        return false;
    }

    public static boolean P(ut2 ut2Var) {
        if (ut2Var == null) {
            return true;
        }
        if (ut2Var.R) {
            return ut2Var.F == null || P(ut2Var.I);
        }
        return false;
    }

    public static boolean Q(ut2 ut2Var) {
        if (ut2Var == null) {
            return true;
        }
        su2 su2Var = ut2Var.F;
        return ut2Var == su2Var.A && Q(su2Var.z);
    }

    public static void j0(ut2 ut2Var) {
        if (M(2)) {
            Log.v("FragmentManager", "show: " + ut2Var);
        }
        if (ut2Var.M) {
            ut2Var.M = false;
            ut2Var.Y = !ut2Var.Y;
        }
    }

    public final void A(boolean z) {
        if (this.b) {
            hk0.l("FragmentManager is already executing transactions");
            return;
        }
        if (this.x == null) {
            if (this.K) {
                hk0.l("FragmentManager has been destroyed");
                return;
            } else {
                hk0.l("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.x.u.getLooper()) {
            hk0.l("Must be called from main thread of fragment host");
            return;
        }
        if (!z && R()) {
            hk0.l("Can not perform this action after onSaveInstanceState");
        } else if (this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    public final boolean B(boolean z) {
        boolean zA;
        ArrayList arrayList;
        w10 w10Var;
        A(z);
        if (!this.i && (w10Var = this.h) != null) {
            w10Var.s = false;
            w10Var.e();
            if (M(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.a);
            }
            this.h.g(false, false);
            this.a.add(0, this.h);
            Iterator it = this.h.a.iterator();
            while (it.hasNext()) {
                ut2 ut2Var = ((ev2) it.next()).b;
                if (ut2Var != null) {
                    ut2Var.y = false;
                }
            }
            this.h = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.M;
            ArrayList arrayList3 = this.N;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i >= size) {
                                break;
                            }
                            zA |= ((pu2) arrayList.get(i)).a(arrayList2, arrayList3);
                            i++;
                            throw th;
                        }
                        arrayList.clear();
                        this.x.u.removeCallbacks(this.Q);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.x.u.removeCallbacks(this.Q);
                        throw th;
                    }
                }
            }
            if (!zA) {
                m0();
                w();
                ((HashMap) this.c.f1141o).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.b = true;
            try {
                Z(this.M, this.N);
                e();
            } catch (Throwable th2) {
                e();
                throw th2;
            }
        }
    }

    public final void C(w10 w10Var, boolean z) {
        if (z && (this.x == null || this.K)) {
            return;
        }
        A(z);
        w10 w10Var2 = this.h;
        if (w10Var2 != null) {
            w10Var2.s = false;
            w10Var2.e();
            if (M(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execSingleAction for action " + w10Var);
            }
            this.h.g(false, false);
            this.h.a(this.M, this.N);
            Iterator it = this.h.a.iterator();
            while (it.hasNext()) {
                ut2 ut2Var = ((ev2) it.next()).b;
                if (ut2Var != null) {
                    ut2Var.y = false;
                }
            }
            this.h = null;
        }
        w10Var.a(this.M, this.N);
        this.b = true;
        try {
            Z(this.M, this.N);
            e();
            m0();
            w();
            ((HashMap) this.c.f1141o).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            e();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x022f A[PHI: r15
      0x022f: PHI (r15v21 int) = (r15v20 int), (r15v23 int) binds: [B:105:0x021c, B:109:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    public final void D(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Object objPrevious;
        ArrayList arrayList3;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5 = i;
        j93 j93Var = this.c;
        ArrayList arrayList4 = this.f2054o;
        boolean z4 = ((w10) arrayList.get(i5)).p;
        ArrayList arrayList5 = this.O;
        if (arrayList5 == null) {
            this.O = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.O.addAll(j93Var.Q());
        ut2 ut2Var = this.A;
        int i6 = i5;
        boolean z5 = false;
        while (i6 < i2) {
            w10 w10Var = (w10) arrayList.get(i6);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
            ArrayList arrayList6 = this.O;
            if (zBooleanValue) {
                arrayList3 = arrayList4;
                z = z4;
                i3 = i6;
                z2 = z5;
                int i7 = 1;
                ArrayList arrayList7 = w10Var.a;
                int size = arrayList7.size() - 1;
                while (size >= 0) {
                    ev2 ev2Var = (ev2) arrayList7.get(size);
                    int i8 = ev2Var.a;
                    if (i8 != i7) {
                        if (i8 != 3) {
                            switch (i8) {
                                case 6:
                                    arrayList6.add(ev2Var.b);
                                    break;
                                case 8:
                                    ut2Var = null;
                                    break;
                                case ep1.b /* 9 */:
                                    ut2Var = ev2Var.b;
                                    break;
                                case ep1.c /* 10 */:
                                    ev2Var.i = ev2Var.h;
                                    break;
                            }
                        } else {
                            arrayList6.add(ev2Var.b);
                        }
                        size--;
                        i7 = 1;
                    }
                    arrayList6.remove(ev2Var.b);
                    size--;
                    i7 = 1;
                }
            } else {
                ArrayList arrayList8 = w10Var.a;
                int i9 = 0;
                while (i9 < arrayList8.size()) {
                    ev2 ev2Var2 = (ev2) arrayList8.get(i9);
                    boolean z6 = z4;
                    int i10 = ev2Var2.a;
                    int i11 = i6;
                    int i12 = 1;
                    if (i10 != 1) {
                        z3 = z5;
                        if (i10 != 2) {
                            if (i10 == 3 || i10 == 6) {
                                arrayList6.remove(ev2Var2.b);
                                ut2 ut2Var2 = ev2Var2.b;
                                if (ut2Var2 == ut2Var) {
                                    arrayList8.add(i9, new ev2(9, ut2Var2));
                                    i9++;
                                    ut2Var = null;
                                }
                            } else if (i10 == 7) {
                                i12 = 1;
                            } else if (i10 == 8) {
                                arrayList8.add(i9, new ev2(9, ut2Var, 0));
                                ev2Var2.c = true;
                                i9++;
                                ut2Var = ev2Var2.b;
                            }
                            i12 = 1;
                        } else {
                            ut2 ut2Var3 = ev2Var2.b;
                            int i13 = ut2Var3.K;
                            int size2 = arrayList6.size() - 1;
                            boolean z7 = false;
                            while (size2 >= 0) {
                                int i14 = size2;
                                ut2 ut2Var4 = (ut2) arrayList6.get(size2);
                                ArrayList arrayList9 = arrayList4;
                                if (ut2Var4.K != i13) {
                                    i13 = i13;
                                } else if (ut2Var4 == ut2Var3) {
                                    i13 = i13;
                                    z7 = true;
                                } else {
                                    if (ut2Var4 == ut2Var) {
                                        arrayList8.add(i9, new ev2(9, ut2Var4, 0));
                                        i9++;
                                        i4 = 0;
                                        ut2Var = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    ev2 ev2Var3 = new ev2(3, ut2Var4, i4);
                                    ev2Var3.d = ev2Var2.d;
                                    ev2Var3.f = ev2Var2.f;
                                    ev2Var3.e = ev2Var2.e;
                                    ev2Var3.g = ev2Var2.g;
                                    arrayList8.add(i9, ev2Var3);
                                    arrayList6.remove(ut2Var4);
                                    i9++;
                                    ut2Var = ut2Var;
                                }
                                size2 = i14 - 1;
                                i13 = i13;
                                arrayList4 = arrayList9;
                            }
                            arrayList4 = arrayList4;
                            i12 = 1;
                            if (z7) {
                                arrayList8.remove(i9);
                                i9--;
                            } else {
                                ev2Var2.a = 1;
                                ev2Var2.c = true;
                                arrayList6.add(ut2Var3);
                            }
                        }
                        i9 += i12;
                        z4 = z6;
                        i6 = i11;
                        z5 = z3;
                        arrayList4 = arrayList4;
                    } else {
                        z3 = z5;
                    }
                    arrayList4 = arrayList4;
                    arrayList6.add(ev2Var2.b);
                    i9 += i12;
                    z4 = z6;
                    i6 = i11;
                    z5 = z3;
                    arrayList4 = arrayList4;
                }
                arrayList3 = arrayList4;
                z = z4;
                i3 = i6;
                z2 = z5;
            }
            z5 = z2 || w10Var.g;
            i6 = i3 + 1;
            z4 = z;
            arrayList4 = arrayList3;
        }
        ArrayList arrayList10 = arrayList4;
        boolean z8 = z4;
        boolean z9 = z5;
        this.O.clear();
        if (!z8 && this.w >= 1) {
            for (int i15 = i5; i15 < i2; i15++) {
                Iterator it = ((w10) arrayList.get(i15)).a.iterator();
                while (it.hasNext()) {
                    ut2 ut2Var5 = ((ev2) it.next()).b;
                    if (ut2Var5 != null && ut2Var5.F != null) {
                        j93Var.X(h(ut2Var5));
                    }
                }
            }
        }
        String str = "Unknown cmd: ";
        int i16 = i5;
        while (i16 < i2) {
            w10 w10Var2 = (w10) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                w10Var2.d(-1);
                su2 su2Var = w10Var2.r;
                ArrayList arrayList11 = w10Var2.a;
                boolean z10 = true;
                for (int size3 = arrayList11.size() - 1; size3 >= 0; size3--) {
                    ev2 ev2Var4 = (ev2) arrayList11.get(size3);
                    ut2 ut2Var6 = ev2Var4.b;
                    if (ut2Var6 != null) {
                        if (ut2Var6.X != null) {
                            ut2Var6.B().a = z10;
                        }
                        int i17 = w10Var2.f;
                        int i18 = 8194;
                        int i19 = 4097;
                        if (i17 != 4097) {
                            if (i17 != 8194) {
                                i18 = 4100;
                                if (i17 != 8197) {
                                    i19 = 4099;
                                    if (i17 != 4099) {
                                        i18 = i17 != 4100 ? 0 : 8197;
                                    } else {
                                        i18 = i19;
                                    }
                                }
                            } else {
                                i18 = i19;
                            }
                        }
                        if (ut2Var6.X != null || i18 != 0) {
                            ut2Var6.B();
                            ut2Var6.X.f = i18;
                        }
                        ut2Var6.B();
                        ut2Var6.X.getClass();
                    }
                    switch (ev2Var4.a) {
                        case 1:
                            ut2Var6.t0(ev2Var4.d, ev2Var4.e, ev2Var4.f, ev2Var4.g);
                            z10 = true;
                            su2Var.d0(ut2Var6, true);
                            su2Var.Y(ut2Var6);
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str + ev2Var4.a);
                        case 3:
                            ut2Var6.t0(ev2Var4.d, ev2Var4.e, ev2Var4.f, ev2Var4.g);
                            su2Var.a(ut2Var6);
                            z10 = true;
                            break;
                        case 4:
                            ut2Var6.t0(ev2Var4.d, ev2Var4.e, ev2Var4.f, ev2Var4.g);
                            su2Var.getClass();
                            j0(ut2Var6);
                            z10 = true;
                            break;
                        case 5:
                            ut2Var6.t0(ev2Var4.d, ev2Var4.e, ev2Var4.f, ev2Var4.g);
                            su2Var.d0(ut2Var6, true);
                            su2Var.L(ut2Var6);
                            z10 = true;
                            break;
                        case 6:
                            ut2Var6.t0(ev2Var4.d, ev2Var4.e, ev2Var4.f, ev2Var4.g);
                            su2Var.c(ut2Var6);
                            z10 = true;
                            break;
                        case 7:
                            ut2Var6.t0(ev2Var4.d, ev2Var4.e, ev2Var4.f, ev2Var4.g);
                            su2Var.d0(ut2Var6, true);
                            su2Var.i(ut2Var6);
                            z10 = true;
                            break;
                        case 8:
                            su2Var.h0(null);
                            z10 = true;
                            break;
                        case ep1.b /* 9 */:
                            su2Var.h0(ut2Var6);
                            z10 = true;
                            break;
                        case ep1.c /* 10 */:
                            ev2Var4.i = ut2Var6.c0;
                            su2Var.g0(ut2Var6, ev2Var4.h);
                            z10 = true;
                            break;
                    }
                }
            } else {
                w10Var2.d(1);
                su2 su2Var2 = w10Var2.r;
                ArrayList arrayList12 = w10Var2.a;
                int size4 = arrayList12.size();
                int i20 = 0;
                while (i20 < size4) {
                    ev2 ev2Var5 = (ev2) arrayList12.get(i20);
                    ut2 ut2Var7 = ev2Var5.b;
                    if (ut2Var7 != null) {
                        if (ut2Var7.X != null) {
                            ut2Var7.B().a = false;
                        }
                        int i21 = w10Var2.f;
                        if (ut2Var7.X != null || i21 != 0) {
                            ut2Var7.B();
                            ut2Var7.X.f = i21;
                        }
                        ut2Var7.B();
                        ut2Var7.X.getClass();
                    }
                    switch (ev2Var5.a) {
                        case 1:
                            ut2Var7.t0(ev2Var5.d, ev2Var5.e, ev2Var5.f, ev2Var5.g);
                            su2Var2.d0(ut2Var7, false);
                            su2Var2.a(ut2Var7);
                            i20++;
                            str = str;
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str + ev2Var5.a);
                        case 3:
                            ut2Var7.t0(ev2Var5.d, ev2Var5.e, ev2Var5.f, ev2Var5.g);
                            su2Var2.Y(ut2Var7);
                            i20++;
                            str = str;
                            break;
                        case 4:
                            ut2Var7.t0(ev2Var5.d, ev2Var5.e, ev2Var5.f, ev2Var5.g);
                            su2Var2.L(ut2Var7);
                            i20++;
                            str = str;
                            break;
                        case 5:
                            ut2Var7.t0(ev2Var5.d, ev2Var5.e, ev2Var5.f, ev2Var5.g);
                            su2Var2.d0(ut2Var7, false);
                            j0(ut2Var7);
                            i20++;
                            str = str;
                            break;
                        case 6:
                            ut2Var7.t0(ev2Var5.d, ev2Var5.e, ev2Var5.f, ev2Var5.g);
                            su2Var2.i(ut2Var7);
                            i20++;
                            str = str;
                            break;
                        case 7:
                            ut2Var7.t0(ev2Var5.d, ev2Var5.e, ev2Var5.f, ev2Var5.g);
                            su2Var2.d0(ut2Var7, false);
                            su2Var2.c(ut2Var7);
                            i20++;
                            str = str;
                            break;
                        case 8:
                            su2Var2.h0(ut2Var7);
                            i20++;
                            str = str;
                            break;
                        case ep1.b /* 9 */:
                            su2Var2.h0(null);
                            i20++;
                            str = str;
                            break;
                        case ep1.c /* 10 */:
                            ev2Var5.h = ut2Var7.c0;
                            su2Var2.g0(ut2Var7, ev2Var5.i);
                            i20++;
                            str = str;
                            break;
                    }
                }
            }
            i16++;
            str = str;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z9 && !arrayList10.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(H((w10) it2.next()));
            }
            if (this.h == null) {
                Iterator it3 = arrayList10.iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        io.sentry.h2.f();
                        return;
                    }
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = arrayList10.iterator();
                while (it5.hasNext()) {
                    if (it5.next() != null) {
                        io.sentry.h2.f();
                        return;
                    }
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i22 = i5; i22 < i2; i22++) {
            w10 w10Var3 = (w10) arrayList.get(i22);
            if (zBooleanValue2) {
                for (int size5 = w10Var3.a.size() - 1; size5 >= 0; size5--) {
                    ut2 ut2Var8 = ((ev2) w10Var3.a.get(size5)).b;
                    if (ut2Var8 != null) {
                        h(ut2Var8).k();
                    }
                }
            } else {
                Iterator it7 = w10Var3.a.iterator();
                while (it7.hasNext()) {
                    ut2 ut2Var9 = ((ev2) it7.next()).b;
                    if (ut2Var9 != null) {
                        h(ut2Var9).k();
                    }
                }
            }
        }
        S(this.w, true);
        for (ll1 ll1Var : g(arrayList, i5, i2)) {
            ll1Var.e = zBooleanValue2;
            synchronized (ll1Var.b) {
                try {
                    ll1Var.l();
                    ArrayList arrayList13 = ll1Var.b;
                    ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                            q77 q77Var = (q77) objPrevious;
                            yi5 yi5Var = s77.m;
                            View view = q77Var.c.U;
                            view.getClass();
                            yi5Var.getClass();
                            s77 s77VarA = yi5.a(view);
                            s77 s77Var = q77Var.a;
                            s77 s77Var2 = s77.f1990o;
                            if (s77Var != s77Var2 || s77VarA == s77Var2) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    ll1Var.f = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ll1Var.e();
        }
        while (i5 < i2) {
            w10 w10Var4 = (w10) arrayList.get(i5);
            if (((Boolean) arrayList2.get(i5)).booleanValue() && w10Var4.t >= 0) {
                w10Var4.t = -1;
            }
            if (w10Var4.q != null) {
                for (int i23 = 0; i23 < w10Var4.q.size(); i23++) {
                    ((Runnable) w10Var4.q.get(i23)).run();
                }
                w10Var4.q = null;
            }
            i5++;
        }
        if (!z9 || arrayList10.size() <= 0) {
            return;
        }
        arrayList10.get(0).getClass();
        io.sentry.h2.f();
    }

    public final ut2 E(int i) {
        j93 j93Var = this.c;
        ArrayList arrayList = (ArrayList) j93Var.n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ut2 ut2Var = (ut2) arrayList.get(size);
            if (ut2Var != null && ut2Var.J == i) {
                return ut2Var;
            }
        }
        for (av2 av2Var : ((HashMap) j93Var.f1141o).values()) {
            if (av2Var != null) {
                ut2 ut2Var2 = av2Var.c;
                if (ut2Var2.J == i) {
                    return ut2Var2;
                }
            }
        }
        return null;
    }

    public final ut2 F(String str) {
        j93 j93Var = this.c;
        ArrayList arrayList = (ArrayList) j93Var.n;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ut2 ut2Var = (ut2) arrayList.get(size);
                if (ut2Var != null && str.equals(ut2Var.L)) {
                    return ut2Var;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (av2 av2Var : ((HashMap) j93Var.f1141o).values()) {
            if (av2Var != null) {
                ut2 ut2Var2 = av2Var.c;
                if (str.equals(ut2Var2.L)) {
                    return ut2Var2;
                }
            }
        }
        return null;
    }

    public final void G() {
        for (ll1 ll1Var : f()) {
            if (ll1Var.f) {
                if (M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                ll1Var.f = false;
                ll1Var.e();
            }
        }
    }

    public final ViewGroup I(ut2 ut2Var) {
        ViewGroup viewGroup = ut2Var.T;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (ut2Var.K <= 0 || !this.y.S()) {
            return null;
        }
        View viewR = this.y.R(ut2Var.K);
        if (viewR instanceof ViewGroup) {
            return (ViewGroup) viewR;
        }
        return null;
    }

    public final ku2 J() {
        ut2 ut2Var = this.z;
        return ut2Var != null ? ut2Var.F.J() : this.B;
    }

    public final cr K() {
        ut2 ut2Var = this.z;
        return ut2Var != null ? ut2Var.F.K() : this.C;
    }

    public final void L(ut2 ut2Var) {
        if (M(2)) {
            Log.v("FragmentManager", "hide: " + ut2Var);
        }
        if (ut2Var.M) {
            return;
        }
        ut2Var.M = true;
        ut2Var.Y = true ^ ut2Var.Y;
        i0(ut2Var);
    }

    public final boolean O() {
        ut2 ut2Var = this.z;
        if (ut2Var == null) {
            return true;
        }
        return ut2Var.O() && this.z.G().O();
    }

    public final boolean R() {
        return this.I || this.J;
    }

    public final void S(int i, boolean z) {
        wt2 wt2Var;
        if (this.x == null && i != -1) {
            hk0.l("No activity");
            return;
        }
        if (z || i != this.w) {
            this.w = i;
            j93 j93Var = this.c;
            HashMap map = (HashMap) j93Var.f1141o;
            Iterator it = ((ArrayList) j93Var.n).iterator();
            while (it.hasNext()) {
                av2 av2Var = (av2) map.get(((ut2) it.next()).q);
                if (av2Var != null) {
                    av2Var.k();
                }
            }
            for (av2 av2Var2 : map.values()) {
                if (av2Var2 != null) {
                    av2Var2.k();
                    ut2 ut2Var = av2Var2.c;
                    if (ut2Var.x && !ut2Var.Q()) {
                        j93Var.Y(av2Var2);
                    }
                }
            }
            k0();
            if (this.H && (wt2Var = this.x) != null && this.w == 7) {
                wt2Var.w.invalidateOptionsMenu();
                this.H = false;
            }
        }
    }

    public final void T() {
        if (this.x == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.s = false;
        for (ut2 ut2Var : this.c.Q()) {
            if (ut2Var != null) {
                ut2Var.H.T();
            }
        }
    }

    public final void U(int i, boolean z) {
        if (i >= 0) {
            z(new qu2(this, i, 1), z);
        } else {
            hk0.g(fx3.e(i, "Bad id: "));
        }
    }

    public final boolean V() {
        return W(-1, 0);
    }

    public final boolean W(int i, int i2) {
        B(false);
        A(true);
        ut2 ut2Var = this.A;
        if (ut2Var != null && i < 0 && ut2Var.D().V()) {
            return true;
        }
        boolean zX = X(this.M, this.N, i, i2);
        if (zX) {
            this.b = true;
            try {
                Z(this.M, this.N);
                e();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
        m0();
        w();
        ((HashMap) this.c.f1141o).values().removeAll(Collections.singleton(null));
        return zX;
    }

    public final boolean X(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.d.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.d.size() - 1;
            } else {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    w10 w10Var = (w10) this.d.get(size2);
                    if (i >= 0 && i == w10Var.t) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        w10 w10Var2 = (w10) this.d.get(size - 1);
                        if (i < 0 || i != w10Var2.t) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((w10) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void Y(ut2 ut2Var) {
        if (M(2)) {
            Log.v("FragmentManager", "remove: " + ut2Var + " nesting=" + ut2Var.E);
        }
        boolean zQ = ut2Var.Q();
        if (ut2Var.N && zQ) {
            return;
        }
        j93 j93Var = this.c;
        synchronized (((ArrayList) j93Var.n)) {
            ((ArrayList) j93Var.n).remove(ut2Var);
        }
        ut2Var.w = false;
        if (N(ut2Var)) {
            this.H = true;
        }
        ut2Var.x = true;
        i0(ut2Var);
    }

    public final void Z(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            hk0.l("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((w10) arrayList.get(i)).p) {
                if (i2 != i) {
                    D(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((w10) arrayList.get(i2)).p) {
                        i2++;
                    }
                }
                D(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            D(arrayList, arrayList2, i2, size);
        }
    }

    public final av2 a(ut2 ut2Var) {
        String str = ut2Var.b0;
        if (str != null) {
            cv2.c(ut2Var, str);
        }
        if (M(2)) {
            Log.v("FragmentManager", "add: " + ut2Var);
        }
        av2 av2VarH = h(ut2Var);
        ut2Var.F = this;
        j93 j93Var = this.c;
        j93Var.X(av2VarH);
        if (!ut2Var.N) {
            j93Var.y(ut2Var);
            ut2Var.x = false;
            if (ut2Var.U == null) {
                ut2Var.Y = false;
            }
            if (N(ut2Var)) {
                this.H = true;
            }
        }
        return av2VarH;
    }

    public final void a0(Bundle bundle) {
        yt2 yt2Var;
        int i;
        boolean z;
        int i2;
        av2 av2Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.x.t.getClassLoader());
                this.m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.x.t.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        j93 j93Var = this.c;
        HashMap map2 = (HashMap) j93Var.p;
        HashMap map3 = (HashMap) j93Var.f1141o;
        map2.clear();
        map2.putAll(map);
        tu2 tu2Var = (tu2) bundle.getParcelable("state");
        if (tu2Var == null) {
            return;
        }
        map3.clear();
        Iterator it = tu2Var.m.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            yt2Var = this.p;
            i = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleD0 = j93Var.d0((String) it.next(), null);
            if (bundleD0 != null) {
                ut2 ut2Var = (ut2) this.P.n.get(((zu2) bundleD0.getParcelable("state")).n);
                if (ut2Var != null) {
                    if (M(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + ut2Var);
                    }
                    av2Var = new av2(yt2Var, j93Var, ut2Var, bundleD0);
                } else {
                    av2Var = new av2(this.p, this.c, this.x.t.getClassLoader(), J(), bundleD0);
                }
                ut2 ut2Var2 = av2Var.c;
                ut2Var2.n = bundleD0;
                ut2Var2.F = this;
                if (M(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + ut2Var2.q + "): " + ut2Var2);
                }
                av2Var.m(this.x.t.getClassLoader());
                j93Var.X(av2Var);
                av2Var.e = this.w;
            }
        }
        uu2 uu2Var = this.P;
        uu2Var.getClass();
        Iterator it2 = new ArrayList(uu2Var.n.values()).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            ut2 ut2Var3 = (ut2) it2.next();
            if (map3.get(ut2Var3.q) == null) {
                if (M(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + ut2Var3 + " that was not found in the set of active Fragments " + tu2Var.m);
                }
                this.P.Z0(ut2Var3);
                ut2Var3.F = this;
                av2 av2Var2 = new av2(yt2Var, j93Var, ut2Var3);
                av2Var2.e = 1;
                av2Var2.k();
                ut2Var3.x = true;
                av2Var2.k();
            }
        }
        ArrayList<String> arrayList = tu2Var.n;
        ((ArrayList) j93Var.n).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                ut2 ut2VarK = j93Var.K(str3);
                if (ut2VarK == null) {
                    hk0.l(fx3.g("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (M(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + ut2VarK);
                }
                j93Var.y(ut2VarK);
            }
        }
        if (tu2Var.f2144o != null) {
            this.d = new ArrayList(tu2Var.f2144o.length);
            int i3 = 0;
            while (true) {
                x10[] x10VarArr = tu2Var.f2144o;
                if (i3 >= x10VarArr.length) {
                    break;
                }
                x10 x10Var = x10VarArr[i3];
                ArrayList arrayList2 = x10Var.n;
                w10 w10Var = new w10(this);
                int[] iArr = x10Var.m;
                int i4 = 0;
                int i5 = 0;
                while (i4 < iArr.length) {
                    ev2 ev2Var = new ev2();
                    int i6 = i4 + 1;
                    int i7 = i;
                    ev2Var.a = iArr[i4];
                    if (M(i7)) {
                        Log.v("FragmentManager", "Instantiate " + w10Var + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    ev2Var.h = m84.values()[x10Var.f2467o[i5]];
                    ev2Var.i = m84.values()[x10Var.p[i5]];
                    int i8 = i4 + 2;
                    ev2Var.c = iArr[i6] != 0 ? z : false;
                    int i9 = iArr[i8];
                    ev2Var.d = i9;
                    int i10 = iArr[i4 + 3];
                    ev2Var.e = i10;
                    int i11 = i4 + 5;
                    int i12 = iArr[i4 + 4];
                    ev2Var.f = i12;
                    i4 += 6;
                    int[] iArr2 = iArr;
                    int i13 = iArr2[i11];
                    ev2Var.g = i13;
                    w10Var.b = i9;
                    w10Var.c = i10;
                    w10Var.d = i12;
                    w10Var.e = i13;
                    w10Var.b(ev2Var);
                    i5++;
                    i = i7;
                    iArr = iArr2;
                    z = true;
                }
                int i14 = i;
                w10Var.f = x10Var.q;
                w10Var.i = x10Var.r;
                w10Var.g = true;
                w10Var.j = x10Var.t;
                w10Var.k = x10Var.u;
                w10Var.l = x10Var.v;
                w10Var.m = x10Var.w;
                w10Var.n = x10Var.x;
                w10Var.f2362o = x10Var.y;
                w10Var.p = x10Var.z;
                w10Var.t = x10Var.s;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    String str4 = (String) arrayList2.get(i15);
                    if (str4 != null) {
                        ((ev2) w10Var.a.get(i15)).b = j93Var.K(str4);
                    }
                }
                w10Var.d(1);
                if (M(i14)) {
                    StringBuilder sbK = fx3.k(i3, "restoreAllState: back stack #", " (index ");
                    sbK.append(w10Var.t);
                    sbK.append("): ");
                    sbK.append(w10Var);
                    Log.v("FragmentManager", sbK.toString());
                    PrintWriter printWriter = new PrintWriter(new re4());
                    w10Var.i("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(w10Var);
                i3++;
                i = i14;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = new ArrayList();
        }
        this.k.set(tu2Var.p);
        String str5 = tu2Var.q;
        if (str5 != null) {
            ut2 ut2VarK2 = j93Var.K(str5);
            this.A = ut2VarK2;
            s(ut2VarK2);
        }
        ArrayList arrayList3 = tu2Var.r;
        if (arrayList3 != null) {
            for (int i16 = i2; i16 < arrayList3.size(); i16++) {
                this.l.put((String) arrayList3.get(i16), (y10) tu2Var.s.get(i16));
            }
        }
        this.G = new ArrayDeque(tu2Var.t);
    }

    public final void b(wt2 wt2Var, lv1 lv1Var, ut2 ut2Var) {
        uu2 uu2Var;
        if (this.x != null) {
            hk0.l("Already attached");
            return;
        }
        this.x = wt2Var;
        this.y = lv1Var;
        this.z = ut2Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.q;
        if (ut2Var != null) {
            copyOnWriteArrayList.add(new mu2(ut2Var));
        } else if (wt2Var != null) {
            copyOnWriteArrayList.add(wt2Var);
        }
        if (this.z != null) {
            m0();
        }
        if (wt2Var != null) {
            o75 o75VarC = wt2Var.w.c();
            this.g = o75VarC;
            o75VarC.a(ut2Var != null ? ut2Var : wt2Var, this.j);
        }
        byte b = 0;
        if (ut2Var != null) {
            uu2 uu2Var2 = ut2Var.F.P;
            HashMap map = uu2Var2.f2249o;
            uu2Var = (uu2) map.get(ut2Var.q);
            if (uu2Var == null) {
                uu2Var = new uu2(uu2Var2.q);
                map.put(ut2Var.q, uu2Var);
            }
            this.P = uu2Var;
        } else if (wt2Var != null) {
            ve8 ve8VarO = wt2Var.w.o();
            af1 af1Var = af1.b;
            af1Var.getClass();
            pn5 pn5Var = new pn5(ve8VarO, uu2.t, af1Var);
            wt3 wt3VarB = w86.a.b(uu2.class);
            String strC = wt3VarB.c();
            if (strC == null) {
                hk0.g("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                uu2Var = (uu2) pn5Var.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
                this.P = uu2Var;
            }
        } else {
            uu2Var = new uu2(false);
            this.P = uu2Var;
        }
        uu2Var.s = R();
        this.c.q = this.P;
        wt2 wt2Var2 = this.x;
        byte b2 = 3;
        if (wt2Var2 != null && ut2Var == null) {
            a65 a65VarR = wt2Var2.r();
            a65VarR.Q0("android:support:fragments", new fy0(this, b2));
            Bundle bundleX0 = a65VarR.x0("android:support:fragments");
            if (bundleX0 != null) {
                a0(bundleX0);
            }
        }
        wt2 wt2Var3 = this.x;
        if (wt2Var3 != null) {
            ky0 ky0Var = wt2Var3.w.u;
            String strConcat = "FragmentManager:".concat(ut2Var != null ? e41.l(new StringBuilder(), ut2Var.q, ":") : "");
            byte b3 = 1;
            this.D = ky0Var.d(strConcat.concat("StartActivityForResult"), new e8(b2), new iu2(this, b3));
            this.E = ky0Var.d(strConcat.concat("StartIntentSenderForResult"), new e8((byte) 6), new iu2(this, (byte) 2));
            this.F = ky0Var.d(strConcat.concat("RequestPermissions"), new e8(b3), new iu2(this, b));
        }
        wt2 wt2Var4 = this.x;
        if (wt2Var4 != null) {
            wt2Var4.j(this.r);
        }
        wt2 wt2Var5 = this.x;
        if (wt2Var5 != null) {
            xt2 xt2Var = wt2Var5.w;
            hu2 hu2Var = this.s;
            hu2Var.getClass();
            xt2Var.w.add(hu2Var);
        }
        wt2 wt2Var6 = this.x;
        if (wt2Var6 != null) {
            xt2 xt2Var2 = wt2Var6.w;
            hu2 hu2Var2 = this.t;
            hu2Var2.getClass();
            xt2Var2.y.add(hu2Var2);
        }
        wt2 wt2Var7 = this.x;
        if (wt2Var7 != null) {
            xt2 xt2Var3 = wt2Var7.w;
            hu2 hu2Var3 = this.u;
            hu2Var3.getClass();
            xt2Var3.z.add(hu2Var3);
        }
        wt2 wt2Var8 = this.x;
        if (wt2Var8 == null || ut2Var != null) {
            return;
        }
        xt2 xt2Var4 = wt2Var8.w;
        ju2 ju2Var = this.v;
        ju2Var.getClass();
        ep3 ep3Var = xt2Var4.f1523o;
        ((CopyOnWriteArrayList) ep3Var.f733o).add(ju2Var);
        ((Runnable) ep3Var.n).run();
    }

    public final Bundle b0() {
        int i;
        ArrayList arrayList;
        x10[] x10VarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        G();
        y();
        B(true);
        this.I = true;
        this.P.s = true;
        j93 j93Var = this.c;
        j93Var.getClass();
        HashMap map = (HashMap) j93Var.f1141o;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            av2 av2Var = (av2) it.next();
            if (av2Var != null) {
                ut2 ut2Var = av2Var.c;
                String str = ut2Var.q;
                Bundle bundle3 = new Bundle();
                ut2 ut2Var2 = av2Var.c;
                if (ut2Var2.m == -1 && (bundle = ut2Var2.n) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new zu2(ut2Var2));
                if (ut2Var2.m > 0) {
                    Bundle bundle4 = new Bundle();
                    ut2Var2.j0.a(new kt2(ut2Var2, bundle4, (byte) 0), "Fragment#onSaveInstanceState");
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    av2Var.a.s(ut2Var2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    ut2Var2.i0.O0(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleB0 = ut2Var2.H.b0();
                    if (!bundleB0.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleB0);
                    }
                    if (ut2Var2.U != null) {
                        av2Var.o();
                    }
                    SparseArray<? extends Parcelable> sparseArray = ut2Var2.f2247o;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = ut2Var2.p;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = ut2Var2.r;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                j93Var.d0(str, bundle3);
                arrayList2.add(ut2Var.q);
                if (M(2)) {
                    Log.v("FragmentManager", "Saved state of " + ut2Var + ": " + ut2Var.n);
                }
            }
        }
        HashMap map2 = (HashMap) this.c.p;
        if (!map2.isEmpty()) {
            j93 j93Var2 = this.c;
            synchronized (((ArrayList) j93Var2.n)) {
                try {
                    if (((ArrayList) j93Var2.n).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) j93Var2.n).size());
                        for (ut2 ut2Var3 : (ArrayList) j93Var2.n) {
                            arrayList.add(ut2Var3.q);
                            if (M(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + ut2Var3.q + "): " + ut2Var3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = this.d.size();
            if (size > 0) {
                x10VarArr = new x10[size];
                for (i = 0; i < size; i++) {
                    x10VarArr[i] = new x10((w10) this.d.get(i));
                    if (M(2)) {
                        StringBuilder sbK = fx3.k(i, "saveAllState: adding back stack #", ": ");
                        sbK.append(this.d.get(i));
                        Log.v("FragmentManager", sbK.toString());
                    }
                }
            } else {
                x10VarArr = null;
            }
            tu2 tu2Var = new tu2();
            tu2Var.q = null;
            ArrayList arrayList3 = new ArrayList();
            tu2Var.r = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            tu2Var.s = arrayList4;
            tu2Var.m = arrayList2;
            tu2Var.n = arrayList;
            tu2Var.f2144o = x10VarArr;
            tu2Var.p = this.k.get();
            ut2 ut2Var4 = this.A;
            if (ut2Var4 != null) {
                tu2Var.q = ut2Var4.q;
            }
            arrayList3.addAll(this.l.keySet());
            arrayList4.addAll(this.l.values());
            tu2Var.t = new ArrayList(this.G);
            bundle2.putParcelable("state", tu2Var);
            for (String str2 : this.m.keySet()) {
                bundle2.putBundle(ua5.m("result_", str2), (Bundle) this.m.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(ua5.m("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (M(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void c(ut2 ut2Var) {
        if (M(2)) {
            Log.v("FragmentManager", "attach: " + ut2Var);
        }
        if (ut2Var.N) {
            ut2Var.N = false;
            if (ut2Var.w) {
                return;
            }
            this.c.y(ut2Var);
            if (M(2)) {
                Log.v("FragmentManager", "add from attach: " + ut2Var);
            }
            if (N(ut2Var)) {
                this.H = true;
            }
        }
    }

    public final void c0() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.x.u.removeCallbacks(this.Q);
                    this.x.u.post(this.Q);
                    m0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (M(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.h);
        }
        w10 w10Var = this.h;
        if (w10Var != null) {
            w10Var.s = false;
            w10Var.e();
            w10 w10Var2 = this.h;
            pc0 pc0Var = new pc0((Object) this, (byte) 15);
            ArrayList arrayList = w10Var2.q;
            if (arrayList == null) {
                arrayList = new ArrayList();
                w10Var2.q = arrayList;
            }
            arrayList.add(pc0Var);
            this.h.f();
            this.i = true;
            B(true);
            G();
            this.i = false;
            this.h = null;
        }
    }

    public final void d0(ut2 ut2Var, boolean z) {
        ViewGroup viewGroupI = I(ut2Var);
        if (viewGroupI == null || !(viewGroupI instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupI).setDrawDisappearingViewsLast(!z);
    }

    public final void e() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    public final void e0(String str, Bundle bundle) {
        ou2 ou2Var = (ou2) this.n.get(str);
        if (ou2Var == null || ou2Var.m.i.compareTo(m84.p) < 0) {
            this.m.put(str, bundle);
        } else {
            ou2Var.b(str, bundle);
        }
        if (M(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public final HashSet f() {
        ll1 ll1Var;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.N().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((av2) it.next()).c.T;
            if (viewGroup != null) {
                K().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof ll1) {
                    ll1Var = (ll1) tag;
                } else {
                    ll1Var = new ll1(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, ll1Var);
                }
                hashSet.add(ll1Var);
            }
        }
        return hashSet;
    }

    public final void f0(String str, LifecycleOwner lifecycleOwner, xu2 xu2Var) {
        x84 x84VarZ = lifecycleOwner.getR();
        if (x84VarZ.i == m84.m) {
            return;
        }
        lu2 lu2Var = new lu2(this, str, xu2Var, x84VarZ);
        ou2 ou2Var = (ou2) this.n.put(str, new ou2(x84VarZ, xu2Var, lu2Var));
        if (ou2Var != null) {
            ou2Var.m.f(ou2Var.f1677o);
        }
        if (M(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + x84VarZ + " and listener " + xu2Var);
        }
        x84VarZ.a(lu2Var);
    }

    public final HashSet g(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((w10) arrayList.get(i)).a.iterator();
            while (it.hasNext()) {
                ut2 ut2Var = ((ev2) it.next()).b;
                if (ut2Var != null && (viewGroup = ut2Var.T) != null) {
                    hashSet.add(ll1.i(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void g0(ut2 ut2Var, m84 m84Var) {
        if (ut2Var == this.c.K(ut2Var.q) && (ut2Var.G == null || ut2Var.F == this)) {
            ut2Var.c0 = m84Var;
        } else {
            yq4.s("Fragment ", ut2Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final av2 h(ut2 ut2Var) {
        String str = ut2Var.q;
        j93 j93Var = this.c;
        av2 av2Var = (av2) ((HashMap) j93Var.f1141o).get(str);
        if (av2Var != null) {
            return av2Var;
        }
        av2 av2Var2 = new av2(this.p, j93Var, ut2Var);
        av2Var2.m(this.x.t.getClassLoader());
        av2Var2.e = this.w;
        return av2Var2;
    }

    public final void h0(ut2 ut2Var) {
        if (ut2Var != null) {
            if (ut2Var != this.c.K(ut2Var.q) || (ut2Var.G != null && ut2Var.F != this)) {
                yq4.s("Fragment ", ut2Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        ut2 ut2Var2 = this.A;
        this.A = ut2Var;
        s(ut2Var2);
        s(this.A);
    }

    public final void i(ut2 ut2Var) {
        if (M(2)) {
            Log.v("FragmentManager", "detach: " + ut2Var);
        }
        if (ut2Var.N) {
            return;
        }
        ut2Var.N = true;
        if (ut2Var.w) {
            if (M(2)) {
                Log.v("FragmentManager", "remove from detach: " + ut2Var);
            }
            j93 j93Var = this.c;
            synchronized (((ArrayList) j93Var.n)) {
                ((ArrayList) j93Var.n).remove(ut2Var);
            }
            ut2Var.w = false;
            if (N(ut2Var)) {
                this.H = true;
            }
            i0(ut2Var);
        }
    }

    public final void i0(ut2 ut2Var) {
        ViewGroup viewGroupI = I(ut2Var);
        if (viewGroupI != null) {
            rt2 rt2Var = ut2Var.X;
            if ((rt2Var == null ? 0 : rt2Var.e) + (rt2Var == null ? 0 : rt2Var.d) + (rt2Var == null ? 0 : rt2Var.c) + (rt2Var == null ? 0 : rt2Var.b) > 0) {
                if (viewGroupI.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupI.setTag(R.id.visible_removing_fragment_view_tag, ut2Var);
                }
                ut2 ut2Var2 = (ut2) viewGroupI.getTag(R.id.visible_removing_fragment_view_tag);
                rt2 rt2Var2 = ut2Var.X;
                boolean z = rt2Var2 != null ? rt2Var2.a : false;
                if (ut2Var2.X == null) {
                    return;
                }
                ut2Var2.B().a = z;
            }
        }
    }

    public final void j(boolean z) {
        if (z && this.x != null) {
            l0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (ut2 ut2Var : this.c.Q()) {
            if (ut2Var != null) {
                ut2Var.S = true;
                if (z) {
                    ut2Var.H.j(true);
                }
            }
        }
    }

    public final boolean k(MenuItem menuItem) {
        if (this.w >= 1) {
            for (ut2 ut2Var : this.c.Q()) {
                if (ut2Var != null) {
                    if (ut2Var.M ? false : ut2Var.W(menuItem) ? true : ut2Var.H.k(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void k0() {
        for (av2 av2Var : this.c.N()) {
            ut2 ut2Var = av2Var.c;
            if (ut2Var.V) {
                if (this.b) {
                    this.L = true;
                } else {
                    ut2Var.V = false;
                    av2Var.k();
                }
            }
        }
    }

    public final boolean l(Menu menu, MenuInflater menuInflater) {
        boolean zL;
        boolean z;
        if (this.w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (ut2 ut2Var : this.c.Q()) {
            if (ut2Var != null && P(ut2Var)) {
                if (ut2Var.M) {
                    zL = false;
                } else {
                    if (ut2Var.Q && ut2Var.R) {
                        ut2Var.Y(menu, menuInflater);
                        z = true;
                    } else {
                        z = false;
                    }
                    zL = z | ut2Var.H.l(menu, menuInflater);
                }
                if (zL) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(ut2Var);
                    z2 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                ut2 ut2Var2 = (ut2) this.e.get(i);
                if (arrayList == null || !arrayList.contains(ut2Var2)) {
                    ut2Var2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    public final void l0(IllegalStateException illegalStateException) {
        io.sentry.android.core.v0.c("FragmentManager", illegalStateException.getMessage());
        io.sentry.android.core.v0.c("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new re4());
        wt2 wt2Var = this.x;
        if (wt2Var == null) {
            try {
                x("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                io.sentry.android.core.v0.d("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            wt2Var.w.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            io.sentry.android.core.v0.d("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void m() {
        boolean zIsChangingConfigurations = true;
        this.K = true;
        B(true);
        y();
        wt2 wt2Var = this.x;
        j93 j93Var = this.c;
        if (wt2Var != null) {
            zIsChangingConfigurations = ((uu2) j93Var.q).r;
        } else {
            Context context = wt2Var.t;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((y10) it.next()).m.iterator();
                while (it2.hasNext()) {
                    ((uu2) j93Var.q).W0((String) it2.next(), false);
                }
            }
        }
        v(-1);
        wt2 wt2Var2 = this.x;
        if (wt2Var2 != null) {
            xt2 xt2Var = wt2Var2.w;
            hu2 hu2Var = this.s;
            hu2Var.getClass();
            xt2Var.w.remove(hu2Var);
        }
        wt2 wt2Var3 = this.x;
        if (wt2Var3 != null) {
            wt2Var3.m(this.r);
        }
        wt2 wt2Var4 = this.x;
        if (wt2Var4 != null) {
            xt2 xt2Var2 = wt2Var4.w;
            hu2 hu2Var2 = this.t;
            hu2Var2.getClass();
            xt2Var2.y.remove(hu2Var2);
        }
        wt2 wt2Var5 = this.x;
        if (wt2Var5 != null) {
            xt2 xt2Var3 = wt2Var5.w;
            hu2 hu2Var3 = this.u;
            hu2Var3.getClass();
            xt2Var3.z.remove(hu2Var3);
        }
        wt2 wt2Var6 = this.x;
        if (wt2Var6 != null && this.z == null) {
            xt2 xt2Var4 = wt2Var6.w;
            ju2 ju2Var = this.v;
            ju2Var.getClass();
            xt2Var4.f1523o.C(ju2Var);
        }
        this.x = null;
        this.y = null;
        this.z = null;
        if (this.g != null) {
            this.j.e();
            this.g = null;
        }
        k8 k8Var = this.D;
        if (k8Var != null) {
            k8Var.b();
            this.E.b();
            this.F.b();
        }
    }

    public final void m0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.j.f(true);
                    if (M(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.d.size() + (this.h != null ? 1 : 0) > 0 && Q(this.z);
                if (M(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.j.f(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(boolean z) {
        if (z && this.x != null) {
            l0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (ut2 ut2Var : this.c.Q()) {
            if (ut2Var != null) {
                ut2Var.S = true;
                if (z) {
                    ut2Var.H.n(true);
                }
            }
        }
    }

    public final void o(boolean z) {
        if (z && this.x != null) {
            l0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (ut2 ut2Var : this.c.Q()) {
            if (ut2Var != null && z) {
                ut2Var.H.o(true);
            }
        }
    }

    public final void p() {
        for (ut2 ut2Var : this.c.O()) {
            if (ut2Var != null) {
                ut2Var.P();
                ut2Var.H.p();
            }
        }
    }

    public final boolean q(MenuItem menuItem) {
        if (this.w >= 1) {
            for (ut2 ut2Var : this.c.Q()) {
                if (ut2Var != null) {
                    if (ut2Var.M ? false : (ut2Var.Q && ut2Var.R && ut2Var.e0(menuItem)) ? true : ut2Var.H.q(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void r() {
        if (this.w < 1) {
            return;
        }
        for (ut2 ut2Var : this.c.Q()) {
            if (ut2Var != null && !ut2Var.M) {
                ut2Var.H.r();
            }
        }
    }

    public final void s(ut2 ut2Var) {
        if (ut2Var != null) {
            if (ut2Var != this.c.K(ut2Var.q)) {
                return;
            }
            ut2Var.F.getClass();
            boolean zQ = Q(ut2Var);
            Boolean bool = ut2Var.v;
            if (bool == null || bool.booleanValue() != zQ) {
                ut2Var.v = Boolean.valueOf(zQ);
                su2 su2Var = ut2Var.H;
                su2Var.m0();
                su2Var.s(su2Var.A);
            }
        }
    }

    public final void t(boolean z) {
        if (z && this.x != null) {
            l0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (ut2 ut2Var : this.c.Q()) {
            if (ut2Var != null && z) {
                ut2Var.H.t(true);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ut2 ut2Var = this.z;
        if (ut2Var != null) {
            sb.append(ut2Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.z)));
            sb.append("}");
        } else {
            wt2 wt2Var = this.x;
            if (wt2Var != null) {
                sb.append(wt2Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final boolean u() {
        if (this.w < 1) {
            return false;
        }
        boolean z = false;
        for (ut2 ut2Var : this.c.Q()) {
            if (ut2Var != null && P(ut2Var)) {
                if (ut2Var.M ? false : ut2Var.H.u() | (ut2Var.Q && ut2Var.R)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void v(int i) {
        try {
            this.b = true;
            for (av2 av2Var : ((HashMap) this.c.f1141o).values()) {
                if (av2Var != null) {
                    av2Var.e = i;
                }
            }
            S(i, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((ll1) it.next()).h();
            }
            this.b = false;
            B(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void w() {
        if (this.L) {
            this.L = false;
            k0();
        }
    }

    public final void x(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strZ = ua5.z(str, "    ");
        j93 j93Var = this.c;
        ArrayList arrayList = (ArrayList) j93Var.n;
        String strZ2 = ua5.z(str, "    ");
        HashMap map = (HashMap) j93Var.f1141o;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (av2 av2Var : map.values()) {
                printWriter.print(str);
                if (av2Var != null) {
                    ut2 ut2Var = av2Var.c;
                    printWriter.println(ut2Var);
                    printWriter.print(strZ2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(ut2Var.J));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(ut2Var.K));
                    printWriter.print(" mTag=");
                    printWriter.println(ut2Var.L);
                    printWriter.print(strZ2);
                    printWriter.print("mState=");
                    printWriter.print(ut2Var.m);
                    printWriter.print(" mWho=");
                    printWriter.print(ut2Var.q);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(ut2Var.E);
                    printWriter.print(strZ2);
                    printWriter.print("mAdded=");
                    printWriter.print(ut2Var.w);
                    printWriter.print(" mRemoving=");
                    printWriter.print(ut2Var.x);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(ut2Var.z);
                    printWriter.print(" mInLayout=");
                    printWriter.println(ut2Var.A);
                    printWriter.print(strZ2);
                    printWriter.print("mHidden=");
                    printWriter.print(ut2Var.M);
                    printWriter.print(" mDetached=");
                    printWriter.print(ut2Var.N);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(ut2Var.R);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(ut2Var.Q);
                    printWriter.print(strZ2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(ut2Var.O);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(ut2Var.W);
                    if (ut2Var.F != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(ut2Var.F);
                    }
                    if (ut2Var.G != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mHost=");
                        printWriter.println(ut2Var.G);
                    }
                    if (ut2Var.I != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(ut2Var.I);
                    }
                    if (ut2Var.r != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mArguments=");
                        printWriter.println(ut2Var.r);
                    }
                    if (ut2Var.n != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(ut2Var.n);
                    }
                    if (ut2Var.f2247o != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(ut2Var.f2247o);
                    }
                    if (ut2Var.p != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(ut2Var.p);
                    }
                    Object objK = ut2Var.K(false);
                    if (objK != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mTarget=");
                        printWriter.print(objK);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(ut2Var.u);
                    }
                    printWriter.print(strZ2);
                    printWriter.print("mPopDirection=");
                    rt2 rt2Var = ut2Var.X;
                    printWriter.println(rt2Var == null ? false : rt2Var.a);
                    rt2 rt2Var2 = ut2Var.X;
                    if ((rt2Var2 == null ? 0 : rt2Var2.b) != 0) {
                        printWriter.print(strZ2);
                        printWriter.print("getEnterAnim=");
                        rt2 rt2Var3 = ut2Var.X;
                        printWriter.println(rt2Var3 == null ? 0 : rt2Var3.b);
                    }
                    rt2 rt2Var4 = ut2Var.X;
                    if ((rt2Var4 == null ? 0 : rt2Var4.c) != 0) {
                        printWriter.print(strZ2);
                        printWriter.print("getExitAnim=");
                        rt2 rt2Var5 = ut2Var.X;
                        printWriter.println(rt2Var5 == null ? 0 : rt2Var5.c);
                    }
                    rt2 rt2Var6 = ut2Var.X;
                    if ((rt2Var6 == null ? 0 : rt2Var6.d) != 0) {
                        printWriter.print(strZ2);
                        printWriter.print("getPopEnterAnim=");
                        rt2 rt2Var7 = ut2Var.X;
                        printWriter.println(rt2Var7 == null ? 0 : rt2Var7.d);
                    }
                    rt2 rt2Var8 = ut2Var.X;
                    if ((rt2Var8 == null ? 0 : rt2Var8.e) != 0) {
                        printWriter.print(strZ2);
                        printWriter.print("getPopExitAnim=");
                        rt2 rt2Var9 = ut2Var.X;
                        printWriter.println(rt2Var9 == null ? 0 : rt2Var9.e);
                    }
                    if (ut2Var.T != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mContainer=");
                        printWriter.println(ut2Var.T);
                    }
                    if (ut2Var.U != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mView=");
                        printWriter.println(ut2Var.U);
                    }
                    if (ut2Var.E() != null) {
                        yt2.C(ut2Var).x(strZ2, printWriter);
                    }
                    printWriter.print(strZ2);
                    printWriter.println("Child " + ut2Var.H + ":");
                    ut2Var.H.x(strZ2.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                ut2 ut2Var2 = (ut2) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(ut2Var2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                ut2 ut2Var3 = (ut2) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(ut2Var3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                w10 w10Var = (w10) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(w10Var.toString());
                w10Var.i(strZ, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (pu2) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.y);
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    public final void y() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((ll1) it.next()).h();
        }
    }

    public final void z(pu2 pu2Var, boolean z) {
        if (!z) {
            if (this.x == null) {
                if (this.K) {
                    hk0.l("FragmentManager has been destroyed");
                    return;
                } else {
                    hk0.l("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (R()) {
                hk0.l("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.x == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(pu2Var);
                    c0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
