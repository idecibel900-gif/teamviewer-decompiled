package o;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.view.KeyEvent;
import androidx.lifecycle.Observer;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionRecipientStatus;
import com.teamviewer.commonresourcelib.swig.IRatingViewModel;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class i9 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1044o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i9(Object obj, Object obj2, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.n = obj;
        this.f1044o = obj2;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        Object obj2 = this.f1044o;
        switch (b) {
            case 0:
                return new i9((l33) this.n, (n9) obj2, hc1Var, (byte) 0);
            case 1:
                return new i9((l33) this.n, (ja) obj2, hc1Var, (byte) 1);
            case 2:
                return new i9((y21) this.n, (px4) obj2, hc1Var, (byte) 2);
            case 3:
                return new i9((y31) this.n, (z31) obj2, hc1Var, (byte) 3);
            case 4:
                return new i9((px4) this.n, (i81) obj2, hc1Var, (byte) 4);
            case 5:
                return new i9((int[]) this.n, (Context) obj2, hc1Var, (byte) 5);
            case 6:
                i9 i9Var = new i9((sf1) obj2, hc1Var, (byte) 6);
                i9Var.n = obj;
                return i9Var;
            case 7:
                i9 i9Var2 = new i9((g97) obj2, hc1Var, (byte) 7);
                i9Var2.n = obj;
                return i9Var2;
            case 8:
                return new i9((px4) this.n, (wt1) obj2, hc1Var, (byte) 8);
            case ep1.b /* 9 */:
                return new i9((List) this.n, (px4) obj2, hc1Var, (byte) 9);
            case ep1.c /* 10 */:
                return new i9((mi2) this.n, (px4) obj2, hc1Var, (byte) 10);
            case 11:
                return new i9((NativeLiveDataBool) this.n, (p) obj2, hc1Var, (byte) 11);
            case ep1.d /* 12 */:
                return new i9((NativeLiveDataBool) this.n, (Observer) obj2, hc1Var, (byte) 12);
            case 13:
                i9 i9Var3 = new i9((f33) obj2, hc1Var, (byte) 13);
                i9Var3.n = obj;
                return i9Var3;
            case 14:
                return new i9((e43) this.n, (List) obj2, hc1Var, (byte) 14);
            case 15:
                return new i9((jf3) this.n, (kt5) obj2, hc1Var, (byte) 15);
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                i9 i9Var4 = new i9((y) obj2, hc1Var, (byte) 16);
                i9Var4.n = obj;
                return i9Var4;
            case 17:
                i9 i9Var5 = new i9((n84) obj2, hc1Var, (byte) 17);
                i9Var5.n = obj;
                return i9Var5;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return new i9((px4) this.n, (i97) obj2, hc1Var, (byte) 18);
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new i9((l85) this.n, (vh3) obj2, hc1Var, (byte) 19);
            case 20:
                return new i9((vj5) this.n, (Context) obj2, hc1Var, (byte) 20);
            case 21:
                i9 i9Var6 = new i9((hw2) obj2, hc1Var, (byte) 21);
                i9Var6.n = obj;
                return i9Var6;
            case 22:
                return new i9((gl4) this.n, (bn6) obj2, hc1Var, (byte) 22);
            case 23:
                return new i9((bn6) this.n, (vh3) obj2, hc1Var, (byte) 23);
            case 24:
                i9 i9Var7 = new i9((Set) obj2, hc1Var, (byte) 24);
                i9Var7.n = obj;
                return i9Var7;
            case 25:
                return new i9((jf3) this.n, (ce7) obj2, hc1Var, (byte) 25);
            case 26:
                return new i9((av7) this.n, (cv7) obj2, hc1Var, (byte) 26);
            case 27:
                return new i9((SupportSession) this.n, (xg8) obj2, hc1Var, (byte) 27);
            case 28:
                return new i9((th8) this.n, (vh3) obj2, hc1Var, (byte) 28);
            default:
                return new i9((vh8) this.n, (vh3) obj2, hc1Var, (byte) 29);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.m;
        f88 f88Var = f88.a;
        switch (b) {
            case 0:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 1:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 2:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 3:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 4:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 5:
                return ((i9) create((Context) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 6:
                return ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 7:
                return ((i9) create((g97) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 8:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case ep1.b /* 9 */:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case ep1.c /* 10 */:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 11:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case ep1.d /* 12 */:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 13:
                ((i9) create((String) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 14:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 15:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 17:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 20:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 21:
                return ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 22:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 23:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 24:
                return ((i9) create((gr5) obj, (hc1) obj2)).invokeSuspend(f88Var);
            case 25:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 26:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 27:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            case 28:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
            default:
                ((i9) create((me1) obj, (hc1) obj2)).invokeSuspend(f88Var);
                return f88Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v25 */
    @Override // o.i30
    public final Object invokeSuspend(Object obj) throws Throwable {
        yy5 yy5Var;
        b84 b84Var;
        ?? arrayList;
        ?? arrayList2;
        Unsafe unsafe;
        long j;
        int intVolatile;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        yl6 yl6Var;
        g60 g60Var;
        byte b = this.m;
        byte b2 = 6;
        byte b3 = 26;
        byte b4 = 10;
        boolean z = false;
        byte b5 = 1;
        hc1 hc1Var = null;
        f88 f88Var = f88.a;
        Object obj2 = this.f1044o;
        switch (b) {
            case 0:
                ct1.a0(obj);
                l33 l33Var = (l33) this.n;
                if (l33Var != null) {
                    l33 l33Var2 = l33Var.c ? l33Var : null;
                    if (l33Var2 != null) {
                        ((n9) obj2).d.invoke(l33Var2);
                    }
                }
                return f88Var;
            case 1:
                ct1.a0(obj);
                l33 l33Var3 = (l33) this.n;
                if (l33Var3 != null) {
                    l33 l33Var4 = l33Var3.c ? l33Var3 : null;
                    if (l33Var4 != null) {
                        ((ja) obj2).d.invoke(l33Var4);
                    }
                }
                return f88Var;
            case 2:
                ct1.a0(obj);
                y21 y21Var = (y21) this.n;
                px4 px4Var = (px4) obj2;
                boolean z2 = ((p31) px4Var.getValue()).a || ((p31) px4Var.getValue()).b;
                KeyEvent.Callback callbackC = y21Var.C();
                ac3 ac3Var = callbackC instanceof ac3 ? (ac3) callbackC : null;
                if (ac3Var != null) {
                    MainActivity mainActivity = (MainActivity) ac3Var;
                    if (z2) {
                        mainActivity.c0(8);
                    } else {
                        mainActivity.c0(0);
                    }
                }
                z = ((p31) px4Var.getValue()).a || ((p31) px4Var.getValue()).b;
                KeyEvent.Callback callbackC2 = y21Var.C();
                jd3 jd3Var = callbackC2 instanceof jd3 ? (jd3) callbackC2 : null;
                if (jd3Var != null) {
                    MainActivity mainActivity2 = (MainActivity) jd3Var;
                    if (z) {
                        mainActivity2.Y();
                    } else {
                        mainActivity2.f0();
                    }
                }
                return f88Var;
            case 3:
                ct1.a0(obj);
                y31 y31Var = (y31) this.n;
                z31 z31Var = (z31) obj2;
                f41.b(y31Var.t, z31Var.d, z31Var.m, z31Var.j == b41.m, new n21(y31Var, (byte) 9), null, 48);
                return f88Var;
            case 4:
                ct1.a0(obj);
                ((Function1) ((px4) this.n).getValue()).invoke(Boolean.valueOf(((i81) obj2).b));
                return f88Var;
            case 5:
                ct1.a0(obj);
                int[] iArr = (int[]) this.n;
                Context context = (Context) obj2;
                ArrayList arrayList3 = new ArrayList(iArr.length);
                int length = iArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = iArr[i];
                    hr2 hr2Var = new hr2(b2);
                    db8.M0(hr2Var, context, i2);
                    ea2 ea2Var = ea2.m;
                    String str = hr2Var.n;
                    if (str != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            JSONObject jSONObject2 = jSONObject.getJSONObject("licenses");
                            if (jSONObject2 == null) {
                                arrayList = ea2Var;
                            } else {
                                arrayList = new ArrayList();
                                Iterator<String> itKeys = jSONObject2.keys();
                                itKeys.getClass();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                                    jSONObject3.getClass();
                                    next.getClass();
                                    String string = jSONObject3.getString("name");
                                    string.getClass();
                                    arrayList.add(new e84(string, qf0.Q(jSONObject3, "url"), qf0.Q(jSONObject3, "year"), qf0.Q(jSONObject3, "spdxId"), qf0.Q(jSONObject3, "content"), next));
                                }
                            }
                            int iQ = xm4.Q(mv0.Z(arrayList, 10));
                            if (iQ < 16) {
                                iQ = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(iQ);
                            for (Object obj3 : arrayList) {
                                linkedHashMap.put(((e84) obj3).f, obj3);
                            }
                            JSONArray jSONArray = jSONObject.getJSONArray("libraries");
                            q0 q0Var = new q0(linkedHashMap, (byte) 12);
                            if (jSONArray == null) {
                                arrayList2 = ea2Var;
                            } else {
                                arrayList2 = new ArrayList();
                                int length2 = jSONArray.length();
                                for (int i3 = 0; i3 < length2; i3++) {
                                    JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
                                    jSONObject4.getClass();
                                    arrayList2.add(q0Var.invoke(jSONObject4));
                                }
                            }
                            yy5Var = new yy5(arrayList2, arrayList);
                        } catch (Throwable th) {
                            io.sentry.android.core.v0.c("AboutLibraries", "Failed to parse the meta data *.json file: " + th);
                            yy5Var = new yy5(ea2Var, ea2Var);
                        }
                        b84Var = new b84(lv0.J0(yy5Var.a, new gj2((byte) 22)), lv0.T0(yy5Var.b));
                    } else {
                        hk0.l("Please provide the required library data via the available APIs.\nDepending on the platform this can be done for example via `Libs.Builder().withJson()`.\nFor Android there exists an `Libs.Builder().withContext(context).build()`, automatically loading the `aboutlibraries.json` file from the `raw` resources folder.\nWhen using compose or other parent modules, please check their corresponding APIs.");
                        b84Var = null;
                    }
                    arrayList3.add(b84Var);
                    i++;
                    b2 = 6;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    qv0.c0(arrayList4, ((b84) it.next()).a);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    qv0.c0(linkedHashSet, ((b84) it2.next()).b);
                }
                return new b84(arrayList4, linkedHashSet);
            case 6:
                ct1.a0(obj);
                me1 me1Var = (me1) this.n;
                sf1 sf1Var = (sf1) obj2;
                bp3 bp3Var = (bp3) sf1Var.b.getAndSet(null);
                AtomicReference atomicReference = sf1Var.b;
                n87 n87VarR = im3.R(me1Var, null, null, new ff(bp3Var, sf1Var, hc1Var, (byte) 5), 3);
                while (!atomicReference.compareAndSet(null, n87VarR)) {
                    if (atomicReference.get() != null) {
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            case 7:
                ct1.a0(obj);
                g97 g97Var = (g97) this.n;
                if ((g97Var instanceof qg1) && g97Var.a <= ((g97) obj2).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                ct1.a0(obj);
                ((Function1) ((px4) this.n).getValue()).invoke(Boolean.valueOf(((wt1) obj2).a));
                return f88Var;
            case ep1.b /* 9 */:
                ct1.a0(obj);
                List list = ex1.a;
                ((Function1) ((px4) obj2).getValue()).invoke((List) this.n);
                return f88Var;
            case ep1.c /* 10 */:
                mi2 mi2Var = (mi2) this.n;
                ct1.a0(obj);
                px4 px4Var2 = (px4) obj2;
                if (!((Boolean) px4Var2.getValue()).booleanValue()) {
                    mi2Var.V0();
                    px4Var2.setValue(Boolean.TRUE);
                }
                mi2Var.f1471o.ReportScreenEvent(IRatingViewModel.RatingScreenEventType.RatingFeedbackDialog);
                return f88Var;
            case 11:
                ct1.a0(obj);
                ((NativeLiveDataBool) this.n).observeForever((p) obj2);
                return f88Var;
            case ep1.d /* 12 */:
                ct1.a0(obj);
                ((NativeLiveDataBool) this.n).removeObserver((Observer) obj2);
                return f88Var;
            case 13:
                String str2 = (String) this.n;
                ct1.a0(obj);
                f33 f33Var = (f33) obj2;
                String string2 = ub7.x0(str2).toString();
                f33Var.y = string2;
                j23 j23Var = f33Var.G;
                m13 m13Var = ((v23) f33Var.C.getValue()).g;
                j23Var.getClass();
                string2.getClass();
                m13Var.getClass();
                y13 y13Var = new y13(r13.a(j23Var.t, m13Var), string2);
                j23Var.u = y13Var;
                j23Var.n(y13Var);
                if (string2.length() > 0) {
                    j23.j(j23Var.x);
                }
                return f88Var;
            case 14:
                ct1.a0(obj);
                e43 e43Var = (e43) this.n;
                List list2 = (List) obj2;
                list2.getClass();
                l97 l97Var = e43Var.r;
                l97Var.getClass();
                l97Var.l(null, list2);
                return f88Var;
            case 15:
                ct1.a0(obj);
                ((jf3) this.n).z.setValue(new zd7((kt5) obj2));
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                me1 me1Var2 = (me1) this.n;
                ct1.a0(obj);
                de1 coroutineContext = me1Var2.getCoroutineContext();
                y yVar = (y) obj2;
                try {
                    iu7 iu7Var = new iu7();
                    iu7Var.r = ds1.Q(ds1.J(coroutineContext), true, iu7Var);
                    try {
                        do {
                            unsafe = defpackage.a.a;
                            j = iu7.s;
                            intVolatile = unsafe.getIntVolatile(iu7Var, j);
                            if (intVolatile != 0) {
                                if (intVolatile != 2 && intVolatile != 3) {
                                    iu7.p(intVolatile);
                                    throw null;
                                }
                            }
                            return yVar.a();
                        } while (!unsafe.compareAndSwapInt(iu7Var, j, intVolatile, 0));
                        return yVar.a();
                    } finally {
                        iu7Var.o();
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 17:
                ct1.a0(obj);
                me1 me1Var3 = (me1) this.n;
                n84 n84Var = (n84) obj2;
                x84 x84Var = n84Var.m;
                if (x84Var.i.compareTo(m84.n) >= 0) {
                    x84Var.a(n84Var);
                } else {
                    ds1.A(me1Var3.getCoroutineContext(), null);
                }
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ct1.a0(obj);
                ((Function1) ((px4) this.n).getValue()).invoke((String) ((i97) obj2).getValue());
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                ct1.a0(obj);
                ((l85) this.n).f1342o.l(null, (vh3) obj2);
                return f88Var;
            case 20:
                ct1.a0(obj);
                vj5 vj5Var = (vj5) this.n;
                Context context2 = (Context) obj2;
                vj5Var.getClass();
                context2.getClass();
                boolean zV0 = vj5.V0(context2);
                l97 l97Var2 = vj5Var.n;
                do {
                    value = l97Var2.getValue();
                } while (!l97Var2.j(value, mx0.a((mx0) value, zV0, false, false, false, false, false, 62)));
                boolean zAreNotificationsEnabled = new r55(context2).a.areNotificationsEnabled();
                do {
                    value2 = l97Var2.getValue();
                } while (!l97Var2.j(value2, mx0.a((mx0) value2, false, zAreNotificationsEnabled, false, false, false, false, 61)));
                boolean z3 = hm3.h(context2, "android.permission.ACCESS_FINE_LOCATION") == 0;
                do {
                    value3 = l97Var2.getValue();
                } while (!l97Var2.j(value3, mx0.a((mx0) value3, false, false, z3, false, false, false, 59)));
                boolean zIsExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : hm3.h(context2, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
                do {
                    value4 = l97Var2.getValue();
                } while (!l97Var2.j(value4, mx0.a((mx0) value4, false, false, false, zIsExternalStorageManager, false, false, 55)));
                boolean z4 = hm3.h(context2, "android.permission.CAMERA") == 0;
                do {
                    value5 = l97Var2.getValue();
                } while (!l97Var2.j(value5, mx0.a((mx0) value5, false, false, false, false, false, z4, 31)));
                boolean z5 = hm3.h(context2, "android.permission.RECORD_AUDIO") == 0;
                do {
                    value6 = l97Var2.getValue();
                } while (!l97Var2.j(value6, mx0.a((mx0) value6, false, false, false, false, z5, false, 47)));
                return f88Var;
            case 21:
                ct1.a0(obj);
                be1 be1VarL0 = ((me1) this.n).getCoroutineContext().l0(d82.y);
                be1VarL0.getClass();
                fe1 fe1Var = (fe1) be1VarL0;
                qx0 qx0VarE = pm8.e();
                im3.Q(iz2.m, fe1Var, pe1.p, new ko2(qx0VarE, (hw2) obj2, hc1Var, (byte) 15));
                while (!qx0VarE.L()) {
                    try {
                        return vn4.u0(fe1Var, new y0(qx0VarE, hc1Var, b3));
                    } catch (InterruptedException unused) {
                    }
                }
                Object objE = qx0VarE.E();
                if (objE instanceof ng3) {
                    hk0.l("This job has not completed yet");
                    return hc1Var;
                }
                if (objE instanceof xx0) {
                    throw ((xx0) objE).a;
                }
                return ka0.I(objE);
            case 22:
                ct1.a0(obj);
                gl4 gl4Var = (gl4) this.n;
                if (gl4Var != null) {
                    bn6 bn6Var = (bn6) obj2;
                    if (!bn6Var.B && gl4Var.c()) {
                        z = true;
                    }
                    bn6Var.B = gl4Var.c();
                    if (z && !ub7.b0((CharSequence) bn6Var.t.m.getValue())) {
                        im3.R(e8.n(bn6Var), null, null, new rm6(bn6Var, hc1Var, b2), 3);
                    }
                }
                return f88Var;
            case 23:
                ct1.a0(obj);
                vh3 vh3Var = (vh3) obj2;
                l97 l97Var3 = ((bn6) this.n).u;
                do {
                    value7 = l97Var3.getValue();
                    yl6Var = (yl6) value7;
                    yl6Var.getClass();
                } while (!l97Var3.j(value7, yl6.a(yl6Var, null, null, null, false, null, null, null, null, null, null, null, false, null, false, false, false, vh3Var, null, false, 2031615)));
                return f88Var;
            case 24:
                ct1.a0(obj);
                Set setKeySet = ((gr5) this.n).a().keySet();
                ArrayList arrayList5 = new ArrayList(mv0.Z(setKeySet, 10));
                Iterator it3 = setKeySet.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((er5) it3.next()).a);
                }
                Set set = (Set) obj2;
                if (set == jy6.a) {
                    z = true;
                } else {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it4 = set2.iterator();
                        while (it4.hasNext()) {
                            if (!arrayList5.contains((String) it4.next())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 25:
                ct1.a0(obj);
                jf3 jf3Var = (jf3) this.n;
                yt2 yt2Var = jf3Var.f1160o;
                t0 t0Var = new t0(jf3Var, b3);
                cg3 cg3Var = (cg3) yt2Var.n;
                ar arVar = new ar(t0Var, b4);
                List list3 = (List) cg3Var.e;
                if (list3 != null && (g60Var = (g60) cg3Var.d) != null) {
                    t0Var.invoke(g60Var, list3);
                    cg3Var.d = null;
                    cg3Var.e = null;
                }
                cg3Var.c = arVar;
                jf3Var.f1160o.G(e8.n(jf3Var), new hf3(jf3Var, b5), new gf3(jf3Var, b5));
                int iOrdinal = ((ce7) obj2).ordinal();
                if (iOrdinal == 0) {
                    IStatisticsHandler iStatisticsHandler = ga7.a;
                    ga7.a(fg3.s);
                } else {
                    if (iOrdinal != 1) {
                        gk0.s();
                        return null;
                    }
                    IStatisticsHandler iStatisticsHandler2 = ga7.a;
                    ga7.a(fg3.r);
                }
                return f88Var;
            case 26:
                ct1.a0(obj);
                sq2 sq2Var = (sq2) ((av7) this.n).p.get(((cv7) obj2).d);
                if (sq2Var != null) {
                    sq2.a(sq2Var);
                }
                return f88Var;
            case 27:
                ct1.a0(obj);
                SupportSession supportSession = (SupportSession) this.n;
                if (supportSession.getRecipientStatus() == SupportSessionRecipientStatus.Ready) {
                    ((xg8) obj2).a.a();
                    zu1.Q(String.valueOf(supportSession.getSessioncode()), String.valueOf(supportSession.getPassword()), supportSession.getName(), null);
                }
                return f88Var;
            case 28:
                ct1.a0(obj);
                vh8 vh8Var = ((th8) this.n).q0;
                if (vh8Var == null) {
                    im3.e0("viewModel");
                    throw null;
                }
                l97 l97Var4 = vh8Var.n;
                l97Var4.getClass();
                l97Var4.l(null, (vh3) obj2);
                return f88Var;
            default:
                ct1.a0(obj);
                l97 l97Var5 = ((vh8) this.n).n;
                l97Var5.getClass();
                l97Var5.l(null, (vh3) obj2);
                return f88Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i9(Object obj, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1044o = obj;
    }
}
