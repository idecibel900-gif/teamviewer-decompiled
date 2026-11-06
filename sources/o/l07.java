package o;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.teamviewer.apidefinitions.supportsessions.apis.SupportsessionsApi;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionFilter;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionFilterResponse;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSessionUpdateParams;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenKeyboardViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenKeyboardViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.MachineListViewModel;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class l07 implements in2, qg6, p4, ay3, kv, ro, hc8, de8, zw3, ui8 {
    public final /* synthetic */ byte m;
    public Object n;

    public l07(long[] jArr) {
        ow4 ow4Var;
        this.m = (byte) 2;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            ow4Var = new ow4(jArrCopyOf.length);
            int i = ow4Var.b;
            if (i < 0) {
                hk0.r("");
                throw null;
            }
            if (jArrCopyOf.length != 0) {
                int length = jArrCopyOf.length + i;
                long[] jArrCopyOf2 = ow4Var.a;
                if (jArrCopyOf2.length < length) {
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, Math.max(length, (jArrCopyOf2.length * 3) / 2));
                    ow4Var.a = jArrCopyOf2;
                }
                int i2 = ow4Var.b;
                if (i != i2) {
                    cx.H0(jArrCopyOf2, jArrCopyOf2, jArrCopyOf.length + i, i, i2);
                }
                cx.H0(jArrCopyOf, jArrCopyOf2, i, 0, jArrCopyOf.length);
                ow4Var.b += jArrCopyOf.length;
            }
        } else {
            ow4Var = new ow4();
        }
        this.n = ow4Var;
    }

    public static bb4 A(MachineListViewModel machineListViewModel, y87 y87Var) {
        i71 i71Var = new i71(machineListViewModel);
        ho0 ho0Var = new ho0(machineListViewModel, y87Var, (byte) 1);
        if (nv1.d == null) {
            im3.e0("dialogFactory");
            throw null;
        }
        bb4 bb4VarC = yi5.c(i71Var, ho0Var);
        bb4VarC.F0 = R.string.tv_action_SelectMachine;
        return bb4VarC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(int i, jc1 jc1Var) {
        yf7 yf7Var;
        long j;
        if (jc1Var instanceof yf7) {
            yf7Var = (yf7) jc1Var;
            int i2 = yf7Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yf7Var.q = i2 - Integer.MIN_VALUE;
            } else {
                yf7Var = new yf7(this, jc1Var);
            }
        } else {
            yf7Var = new yf7(this, jc1Var);
        }
        Object objA = yf7Var.f2604o;
        int i3 = yf7Var.q;
        ne1 ne1Var = ne1.m;
        if (i3 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            yf7Var.m = i;
            j = 30000;
            yf7Var.n = 30000L;
            yf7Var.q = 1;
            objA = n85Var.a(30000L, yf7Var);
            if (objA != ne1Var) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = yf7Var.n;
        int i4 = yf7Var.m;
        ct1.a0(objA);
        j = j2;
        i = i4;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<f88> qi0VarDeleteSupportSession = ((SupportsessionsApi) ((kh7) y85.m.t().d).getValue()).deleteSupportSession(i);
        yf7Var.m = i;
        yf7Var.n = j;
        yf7Var.q = 2;
        Object objL = nv1.l(qi0VarDeleteSupportSession, yf7Var);
        return objL == ne1Var ? ne1Var : objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C(jc1 jc1Var) {
        zf7 zf7Var;
        long j;
        if (jc1Var instanceof zf7) {
            zf7Var = (zf7) jc1Var;
            int i = zf7Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                zf7Var.p = i - Integer.MIN_VALUE;
            } else {
                zf7Var = new zf7(this, jc1Var);
            }
        } else {
            zf7Var = new zf7(this, jc1Var);
        }
        Object objA = zf7Var.n;
        int i2 = zf7Var.p;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            j = 30000;
            zf7Var.m = 30000L;
            zf7Var.p = 1;
            objA = n85Var.a(30000L, zf7Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = zf7Var.m;
        ct1.a0(objA);
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<List<SupportSession>> supportSessions = ((SupportsessionsApi) ((kh7) y85.m.t().d).getValue()).getSupportSessions(Boolean.TRUE);
        zf7Var.m = j;
        zf7Var.p = 2;
        Object objM = nv1.m(supportSessions, zf7Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D(SupportSessionFilter supportSessionFilter, jc1 jc1Var) {
        ag7 ag7Var;
        long j;
        if (jc1Var instanceof ag7) {
            ag7Var = (ag7) jc1Var;
            int i = ag7Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                ag7Var.q = i - Integer.MIN_VALUE;
            } else {
                ag7Var = new ag7(this, jc1Var);
            }
        } else {
            ag7Var = new ag7(this, jc1Var);
        }
        Object objA = ag7Var.f320o;
        int i2 = ag7Var.q;
        ne1 ne1Var = ne1.m;
        if (i2 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            ag7Var.m = supportSessionFilter;
            j = 30000;
            ag7Var.n = 30000L;
            ag7Var.q = 1;
            objA = n85Var.a(30000L, ag7Var);
            if (objA != ne1Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = ag7Var.n;
        SupportSessionFilter supportSessionFilter2 = ag7Var.m;
        ct1.a0(objA);
        j = j2;
        supportSessionFilter = supportSessionFilter2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<SupportSessionFilterResponse> supportSessionsFiltered = ((SupportsessionsApi) ((kh7) y85.m.t().d).getValue()).getSupportSessionsFiltered(supportSessionFilter);
        ag7Var.m = null;
        ag7Var.n = j;
        ag7Var.q = 2;
        Object objM = nv1.m(supportSessionsFiltered, ag7Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    public void E() {
        View view = (View) this.n;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096 A[LOOP:0: B:22:0x0051->B:34:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[EDGE_INSN: B:53:0x0099->B:35:0x0099 BREAK  A[LOOP:0: B:22:0x0051->B:34:0x0096], SYNTHETIC] */
    public Object F(wm0 wm0Var, Function0 function0) {
        q07 q07Var;
        wp6 wp6Var;
        if (((g2) this.n) == null) {
            up5.b("Called runAndWatch on a manager that has been disposed of");
        }
        g2 g2Var = (g2) this.n;
        if ((g2Var instanceof q07) && (wp6Var = (q07Var = (q07) g2Var).r) != null && !wp6Var.equals(wm0Var)) {
            gv4 gv4Var = new gv4();
            wp6 wp6Var2 = q07Var.r;
            if (wp6Var2 == null) {
                up5.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            kx4 kx4Var = q07Var.p;
            ArrayList arrayList = gv4Var.f926o;
            if (kx4Var != null) {
                Object[] objArr = kx4Var.b;
                long[] jArr = kx4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8;
                            int i3 = 8 - ((~(i - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j & 255) < 128) {
                                    arrayList.add(new dv4(objArr[(i << 3) + i4], wp6Var2));
                                }
                                j >>= i2;
                                i4++;
                                i2 = i2;
                            }
                            if (i3 != i2) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                Object obj = q07Var.n;
                obj.getClass();
                arrayList.add(new dv4(obj, wp6Var2));
            }
            gv4Var.m0();
            q07Var.o0();
            this.n = gv4Var;
        }
        g2 g2Var2 = (g2) this.n;
        g2Var2.getClass();
        n47 n47VarU = v47.h().u(g2Var2.w0(wm0Var));
        g2Var2.j0(wm0Var);
        try {
            n47 n47VarJ = n47VarU.j();
            try {
                Object objA = function0.a();
                n47.q(n47VarJ);
                n47VarU.c();
                g2Var2.m0();
                return objA;
            } catch (Throwable th) {
                n47.q(n47VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            n47VarU.c();
            throw th2;
        }
    }

    public void G() {
        ((WebSettingsBoundaryInterface) this.n).setAlgorithmicDarkeningAllowed(true);
    }

    public void H() {
        View viewFindViewById;
        View view = (View) this.n;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(android.R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new wu6(viewFindViewById, (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object I(int i, jc1 jc1Var) {
        dg7 dg7Var;
        if (jc1Var instanceof dg7) {
            dg7Var = (dg7) jc1Var;
            int i2 = dg7Var.f621o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dg7Var.f621o = i2 - Integer.MIN_VALUE;
            } else {
                dg7Var = new dg7(this, jc1Var);
            }
        } else {
            dg7Var = new dg7(this, jc1Var);
        }
        Object obj = dg7Var.m;
        int i3 = dg7Var.f621o;
        if (i3 != 0) {
            if (i3 == 1) {
                ct1.a0(obj);
                return ((tc6) obj).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ct1.a0(obj);
        SupportSessionUpdateParams supportSessionUpdateParams = new SupportSessionUpdateParams(null, null, null, null, new Integer(0), 15, null);
        dg7Var.f621o = 1;
        Object objJ = J(i, supportSessionUpdateParams, dg7Var);
        Object obj2 = ne1.m;
        return objJ == obj2 ? obj2 : objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object J(int i, SupportSessionUpdateParams supportSessionUpdateParams, jc1 jc1Var) {
        eg7 eg7Var;
        long j;
        if (jc1Var instanceof eg7) {
            eg7Var = (eg7) jc1Var;
            int i2 = eg7Var.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eg7Var.r = i2 - Integer.MIN_VALUE;
            } else {
                eg7Var = new eg7(this, jc1Var);
            }
        } else {
            eg7Var = new eg7(this, jc1Var);
        }
        Object objA = eg7Var.p;
        int i3 = eg7Var.r;
        ne1 ne1Var = ne1.m;
        if (i3 == 0) {
            ct1.a0(objA);
            n85 n85Var = n85.a;
            eg7Var.n = supportSessionUpdateParams;
            eg7Var.m = i;
            j = 30000;
            eg7Var.f713o = 30000L;
            eg7Var.r = 1;
            objA = n85Var.a(30000L, eg7Var);
            if (objA != ne1Var) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ct1.a0(objA);
                return ((tc6) objA).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j2 = eg7Var.f713o;
        int i4 = eg7Var.m;
        SupportSessionUpdateParams supportSessionUpdateParams2 = eg7Var.n;
        ct1.a0(objA);
        j = j2;
        i = i4;
        supportSessionUpdateParams = supportSessionUpdateParams2;
        if (!((Boolean) objA).booleanValue()) {
            return new sc6(new IllegalStateException("OneAPI not available (not logged in)"));
        }
        qi0<SupportSession> qi0VarUpdateSupportSession = ((SupportsessionsApi) ((kh7) y85.m.t().d).getValue()).updateSupportSession(i, supportSessionUpdateParams);
        eg7Var.n = null;
        eg7Var.m = i;
        eg7Var.f713o = j;
        eg7Var.r = 2;
        Object objM = nv1.m(qi0VarUpdateSupportSession, eg7Var);
        return objM == ne1Var ? ne1Var : objM;
    }

    @Override // o.ui8
    public String[] P() {
        return ((WebViewProviderFactoryBoundaryInterface) this.n).getSupportedFeatures();
    }

    @Override // o.hc8, o.ec8
    public boolean a() {
        return false;
    }

    @Override // o.ec8
    public long b(qo qoVar, qo qoVar2, qo qoVar3) {
        return ((pn5) this.n).b(qoVar, qoVar2, qoVar3);
    }

    @Override // o.p4
    public boolean c(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.n;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        WeakHashMap weakHashMap = be8.a;
        boolean z = view.getLayoutDirection() == 1;
        byte b = swipeDismissBehavior.d;
        view.offsetLeftAndRight((!(b == 0 && z) && (b != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        y30 y30Var = swipeDismissBehavior.b;
        if (y30Var != null) {
            y30Var.a(view);
        }
        return true;
    }

    @Override // o.de8
    public Function0 d(u0 u0Var) {
        x84 x84Var = (x84) this.n;
        if (x84Var.i.compareTo(m84.m) <= 0) {
            yq4.o("Cannot configure ", u0Var, " to disposeComposition at Lifecycle ON_DESTROY: ", x84Var, "is already destroyed");
            return null;
        }
        yh6 yh6Var = new yh6(u0Var, (byte) 2);
        x84Var.a(yh6Var);
        return new a26((Object) x84Var, (Object) yh6Var, (byte) 27);
    }

    @Override // o.in2
    public float e() {
        return 0.0f;
    }

    @Override // o.in2
    public float f(float f, long j) {
        long j2 = j / 1000000;
        zm2 zm2VarA = ((an2) this.n).a(f);
        long j3 = zm2VarA.c;
        return (((Math.signum(zm2VarA.a) * ri.a(j3 > 0 ? j2 / j3 : 1.0f).b) * zm2VarA.b) / j3) * 1000.0f;
    }

    @Override // o.zw3
    public void g() {
        IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModel = (IRemoteScreenKeyboardViewModel) this.n;
        IRemoteScreenKeyboardViewModelSWIGJNI.IRemoteScreenKeyboardViewModel_SendCtrlAltDel(iRemoteScreenKeyboardViewModel.a, iRemoteScreenKeyboardViewModel);
    }

    @Override // o.ro
    public en2 get(int i) {
        switch (this.m) {
            case 17:
                return ((ln2[]) this.n)[i];
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                return (ln2) this.n;
            default:
                return (en2) this.n;
        }
    }

    @Override // o.ui8
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) ka0.r(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.n).getStatics());
    }

    @Override // o.ui8
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) ka0.r(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.n).getWebkitToCompatConverter());
    }

    @Override // o.ec8
    public qo h(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        return ((pn5) this.n).h(j, qoVar, qoVar2, qoVar3);
    }

    @Override // o.in2
    public float i(float f, float f2, long j) {
        long j2 = j / 1000000;
        zm2 zm2VarA = ((an2) this.n).a(f2);
        long j3 = zm2VarA.c;
        return (Math.signum(zm2VarA.a) * zm2VarA.b * ri.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    @Override // o.zw3
    public void j(int i, int i2, boolean z, boolean z2) {
        IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModel = (IRemoteScreenKeyboardViewModel) this.n;
        IRemoteScreenKeyboardViewModelSWIGJNI.IRemoteScreenKeyboardViewModel_SendVirtualKey(iRemoteScreenKeyboardViewModel.a, iRemoteScreenKeyboardViewModel, i, z, z2, i2);
    }

    @Override // o.qg6
    public pg6 k(String str) {
        str.getClass();
        return new ze7(((df7) this.n).X());
    }

    @Override // o.ay3
    public void l(int i) {
        dg8 dg8Var;
        dd3 dd3Var = (dd3) this.n;
        if (dd3Var != null) {
            oh3 oh3Var = (oh3) dd3Var;
            dg8[] dg8VarArrValues = dg8.values();
            int length = dg8VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    dg8Var = null;
                    break;
                }
                dg8Var = dg8VarArrValues[i2];
                if (i == dg8Var.m) {
                    break;
                } else {
                    i2++;
                }
            }
            dg8Var.getClass();
            oh3Var.g(dg8Var, false, 0);
            oh3Var.g(dg8Var, true, 0);
            au6 au6Var = bt1.b;
            if (au6Var == null) {
                im3.e0("instance");
                throw null;
            }
            mo7 mo7Var = au6Var.f;
            if (mo7Var != null) {
                mo7Var.w();
            }
        }
    }

    @Override // o.kv
    public Object m(dk6 dk6Var, Float f, Float f2, Function1 function1, g47 g47Var) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objJ = l47.j(dk6Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, pm8.b(0.0f, fFloatValue2, 28), (jo) this.n, function1, g47Var);
        return objJ == ne1.m ? objJ : (go) objJ;
    }

    @Override // o.ay3
    public void o(int i) {
    }

    @Override // o.ay3
    public void p(int[] iArr, int i) {
    }

    @Override // o.ay3
    public void q(CharSequence charSequence) {
        charSequence.getClass();
    }

    @Override // o.in2
    public long r(float f) {
        return ((long) (Math.exp(((an2) this.n).b(f) / (((double) bn2.a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // o.in2
    public float s(float f, float f2) {
        an2 an2Var = (an2) this.n;
        double dB = an2Var.b(f2);
        double d = bn2.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (an2Var.a * an2Var.b))))) + f;
    }

    @Override // o.zw3
    public boolean t() {
        IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModel = (IRemoteScreenKeyboardViewModel) this.n;
        return IRemoteScreenKeyboardViewModelSWIGJNI.IRemoteScreenKeyboardViewModel_CanSendCtrlAltDel(iRemoteScreenKeyboardViewModel.a, iRemoteScreenKeyboardViewModel);
    }

    @Override // o.ec8
    public qo u(long j, qo qoVar, qo qoVar2, qo qoVar3) {
        return ((pn5) this.n).u(j, qoVar, qoVar2, qoVar3);
    }

    @Override // o.ec8
    public qo w(qo qoVar, qo qoVar2, qo qoVar3) {
        return ((pn5) this.n).w(qoVar, qoVar2, qoVar3);
    }

    @Override // o.zw3
    public void x(int i) {
        IRemoteScreenKeyboardViewModel iRemoteScreenKeyboardViewModel = (IRemoteScreenKeyboardViewModel) this.n;
        IRemoteScreenKeyboardViewModelSWIGJNI.IRemoteScreenKeyboardViewModel_SendUnicode(iRemoteScreenKeyboardViewModel.a, iRemoteScreenKeyboardViewModel, i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(int i, int i2, jc1 jc1Var) {
        xf7 xf7Var;
        if (jc1Var instanceof xf7) {
            xf7Var = (xf7) jc1Var;
            int i3 = xf7Var.f2512o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xf7Var.f2512o = i3 - Integer.MIN_VALUE;
            } else {
                xf7Var = new xf7(this, jc1Var);
            }
        } else {
            xf7Var = new xf7(this, jc1Var);
        }
        Object obj = xf7Var.m;
        int i4 = xf7Var.f2512o;
        if (i4 != 0) {
            if (i4 == 1) {
                ct1.a0(obj);
                return ((tc6) obj).m;
            }
            hk0.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ct1.a0(obj);
        SupportSessionUpdateParams supportSessionUpdateParams = new SupportSessionUpdateParams(null, null, null, null, new Integer(i2), 15, null);
        xf7Var.f2512o = 1;
        Object objJ = J(i, supportSessionUpdateParams, xf7Var);
        Object obj2 = ne1.m;
        return objJ == obj2 ? obj2 : objJ;
    }

    public long z(long j) {
        io.sentry.util.network.b bVar = (io.sentry.util.network.b) this.n;
        if (nc8.b(j) <= 0.0f || nc8.c(j) <= 0.0f) {
            ki3.c("maximumVelocity should be a positive value. You specified=".concat(nc8.g(j)));
        }
        return g77.c(((pc8) bVar.c).c(nc8.b(j)), ((pc8) bVar.d).c(nc8.c(j)));
    }

    public /* synthetic */ l07(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    public l07(float f, float f2, qo qoVar) {
        ro l07Var;
        this.m = (byte) 20;
        int[] iArr = fc8.a;
        if (qoVar == null && f == 1.0f && f2 == 1500.0f) {
            l07Var = ml1.m;
        } else if (qoVar != null) {
            l07Var = new l07(qoVar, f, f2);
        } else {
            l07Var = new l07(f, f2);
        }
        this.n = new pn5(l07Var);
    }

    public l07(byte b) {
        this.m = b;
        switch (b) {
            case 21:
                this.n = new io.sentry.util.network.b();
                break;
            default:
                this.n = new fm(q85.e, (byte) 10);
                break;
        }
    }

    public l07(WebView webView, ProgressBar progressBar) {
        this.m = (byte) 27;
        this.n = progressBar;
        webView.setWebViewClient(new oi8(this));
        webView.setWebChromeClient(new ni8(this));
    }

    public l07(ja3 ja3Var, xt6 xt6Var, RemoteControlApplication remoteControlApplication) {
        this.m = (byte) 6;
        this.n = ja3Var;
    }

    public l07(df7 df7Var) {
        this.m = (byte) 7;
        df7Var.getClass();
        this.n = df7Var;
    }

    public l07(in1 in1Var) {
        this.m = (byte) 5;
        this.n = new an2(b87.a, in1Var);
    }

    public l07(View view) {
        this.m = (byte) 4;
        if (Build.VERSION.SDK_INT >= 30) {
            s57 s57Var = new s57(view, (byte) 3);
            s57Var.f1986o = view;
            this.n = s57Var;
            return;
        }
        this.n = new l07((Object) view, (byte) 3);
    }

    public /* synthetic */ l07(byte b, boolean z) {
        this.m = b;
    }

    public l07(LifecycleOwner lifecycleOwner) {
        this.m = (byte) 22;
        this.n = lifecycleOwner.getR();
    }

    public l07(qo8 qo8Var) {
        this.m = (byte) 13;
        this.n = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), qo8Var);
    }

    public l07(qo qoVar, float f, float f2) {
        this.m = (byte) 17;
        int iB = qoVar.b();
        ln2[] ln2VarArr = new ln2[iB];
        for (int i = 0; i < iB; i++) {
            ln2VarArr[i] = new ln2(f, f2, qoVar.a(i));
        }
        this.n = ln2VarArr;
    }

    public l07(float f, float f2) {
        this.m = (byte) 18;
        this.n = new ln2(f, f2);
    }
}
