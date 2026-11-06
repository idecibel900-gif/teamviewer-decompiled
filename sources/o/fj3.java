package o;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.Toast;
import androidx.compose.ui.node.LayoutNode;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow.IViewManagerViewModelSWIGJNI;
import com.teamviewer.pilotsessionlib.swig.viewmodel.sessionwindow.SessionData;
import com.teamviewer.remotecontrollib.manager.LockManager;
import com.teamviewer.remotecontrollib.swig.BiometricsStatisticsViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.IBiometricsStatisticsViewModel;
import com.teamviewer.remotecontrollib.swig.IInAppPurchaseViewModel;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrollib.swig.LoginState;
import com.teamviewer.remotecontrollib.swig.LogoutViewModel;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.remotecontrolviewlib.activity.PilotSessionActivity;
import com.teamviewer.remotecontrolviewlib.activity.QRCodeAssignmentActivity;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import com.teamviewer.remotecontrolviewlib.fragment.session.PilotMarkerTextInputFieldView;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.settings.Settings;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fj3 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ fj3(my4 my4Var, ly4 ly4Var) {
        this.m = (byte) 13;
        this.n = my4Var;
    }

    /* JADX WARN: Code duplicated, block: B:190:0x0489  */
    /* JADX WARN: Code duplicated, block: B:193:0x0490  */
    /* JADX WARN: Code duplicated, block: B:196:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x017b  */
    /* JADX WARN: Code duplicated, block: B:39:0x017e  */
    /* JADX WARN: Code duplicated, block: B:53:0x01be  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d0 A[LOOP:0: B:38:0x017c->B:55:0x01d0, LOOP_END] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        o44 o44Var;
        int length;
        mf1 mf1Var;
        mf1 mf1Var2;
        yk5 yk5Var;
        byte b = this.m;
        byte b2 = 8;
        int i = -1;
        int i2 = 0;
        char c = 1;
        o44 o44Var2 = null;
        IBiometricsStatisticsViewModel iBiometricsStatisticsViewModel = null;
        tb7 tb7Var = null;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                gj3 gj3Var = (gj3) obj2;
                d65 d65Var = (d65) obj;
                t56 t56Var = d65Var.b;
                if (t56Var != null) {
                    t56Var.closeConnection();
                    d65Var.b = null;
                }
                xx4 xx4Var = gj3Var.d;
                Object[] objArr = xx4Var.m;
                int i3 = xx4Var.f2559o;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (im3.n((gh8) objArr[i4], d65Var)) {
                        i = i4;
                        if (i >= 0) {
                            xx4Var.k(i);
                        }
                        if (xx4Var.f2559o == 0) {
                            gj3Var.b.a();
                        }
                        return f88.a;
                    }
                }
                if (i >= 0) {
                    xx4Var.k(i);
                }
                if (xx4Var.f2559o == 0) {
                    gj3Var.b.a();
                }
                return f88.a;
            case 1:
                return new m8((n34) obj2, b2);
            case 2:
                return new m8((t34) obj2, (byte) 10);
            case 3:
                ((Integer) obj).getClass();
                return obj2;
            case 4:
                w44 w44Var = (w44) obj2;
                float f = -((Float) obj).floatValue();
                if ((f >= 0.0f || w44Var.c()) && (f <= 0.0f || w44Var.b())) {
                    if (Math.abs(w44Var.h) > 0.5f) {
                        ni3.c("entered drag with non-zero pending scroll");
                    }
                    w44Var.d = true;
                    float f2 = w44Var.h + f;
                    w44Var.h = f2;
                    if (Math.abs(f2) > 0.5f) {
                        float f3 = w44Var.h;
                        int iRound = Math.round(f3);
                        o44 o44VarH = ((o44) w44Var.f.getValue()).h(iRound, !w44Var.b);
                        if (o44VarH == null || (o44Var = w44Var.c) == null) {
                            o44Var2 = o44VarH;
                        } else {
                            o44 o44VarH2 = o44Var.h(iRound, true);
                            if (o44VarH2 != null) {
                                w44Var.c = o44VarH2;
                                o44Var2 = o44VarH;
                            }
                        }
                        if (o44Var2 != null) {
                            w44Var.g(o44Var2, w44Var.b, true);
                            w44Var.w.setValue(f88.a);
                            w44Var.k(f3 - w44Var.h, o44Var2);
                        } else {
                            LayoutNode layoutNode = w44Var.l;
                            if (layoutNode != null) {
                                layoutNode.m();
                            }
                            w44Var.k(f3 - w44Var.h, w44Var.j());
                        }
                    }
                    if (Math.abs(w44Var.h) > 0.5f) {
                        f -= w44Var.h;
                        w44Var.h = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(-f);
            case 5:
                nh6 nh6Var = (nh6) obj2;
                return Boolean.valueOf(nh6Var != null ? nh6Var.a(obj) : true);
            case 6:
                yt2 yt2Var = (yt2) obj2;
                ((bf1) obj).getClass();
                return new z64((yt2) yt2Var.f2642o, new j93((RemoteControlApplication) yt2Var.n));
            case 7:
                String str = (String) obj;
                str.getClass();
                ye4.c("LockScreenViewModel", "authentication error: ".concat(str));
                ((he4) obj2).r.setValue(Boolean.TRUE);
                return f88.a;
            case 8:
                f37 f37Var = (f37) obj2;
                int i5 = MainActivity.w0;
                if (((Boolean) obj).booleanValue()) {
                    f37Var.i();
                } else {
                    f37Var.a(3);
                }
                return f88.a;
            case ep1.b /* 9 */:
                String str2 = (String) obj;
                int i6 = MainActivity.w0;
                str2.getClass();
                Toast toastMakeText = Toast.makeText((Context) obj2, str2, 1);
                toastMakeText.getClass();
                toastMakeText.show();
                return f88.a;
            case ep1.c /* 10 */:
                String str3 = (String) obj;
                str3.getClass();
                ((rk4) obj2).C.setValue(str3);
                return f88.a;
            case 11:
                return ((en4) obj2).b(((Integer) obj).intValue());
            case ep1.d /* 12 */:
                tr4 tr4Var = (tr4) obj2;
                tr4Var.show();
                return new m8(tr4Var, (byte) 11);
            case 13:
                ((my4) obj2).j(null);
                return f88.a;
            case 14:
                bu7.MAIN.a(new jq(c == true ? 1 : 0, ((Integer) obj).intValue(), (fz4) obj2));
                return f88.a;
            case 15:
                Resources resources = ((tz4) obj2).t;
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 1) {
                    ThreadLocal threadLocal = ic6.a;
                    Drawable drawable = resources.getDrawable(R.drawable.stoolbar_im_touch, null);
                    drawable.getClass();
                    return drawable;
                }
                ThreadLocal threadLocal2 = ic6.a;
                Drawable drawable2 = resources.getDrawable(R.drawable.stoolbar_im_mouse, null);
                drawable2.getClass();
                return drawable2;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ll2 ll2Var = (ll2) obj2;
                LoginState loginState = (LoginState) obj;
                loginState.getClass();
                if (loginState == LoginState.ReadyForLogin) {
                    io.sentry.l6 l6Var = (io.sentry.l6) ll2Var.f1375o;
                    l6Var.getClass();
                    ye4.a("AbstractNetworkControlMethod", "onReadyForLogin");
                    au6 au6Var = bt1.b;
                    if (au6Var == null) {
                        im3.e0("instance");
                        throw null;
                    }
                    o93 o93Var = (o93) l6Var.b;
                    if (im3.n(o93Var != null ? Boolean.valueOf(((u7) o93Var).b == null) : null, Boolean.TRUE) && !au6Var.a.get() && au6Var.f == null) {
                        l6Var.B();
                    }
                }
                return f88.a;
            case 17:
                ((zw4) obj2).a((ds4) obj);
                return Boolean.TRUE;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                Float f4 = (Float) obj;
                f4.getClass();
                return Float.valueOf(((Number) ((Function1) ((l76) obj2).a).invoke(f4)).floatValue());
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                sm1 sm1Var = (sm1) obj;
                lp6.l(sm1Var);
                int i7 = me5.a[((yu7) obj2).ordinal()];
                if (i7 == 1) {
                    tb7Var = new tb7(R.string.m3_adaptive_default_pane_title_primary);
                } else if (i7 == 2) {
                    tb7Var = new tb7(R.string.m3_adaptive_default_pane_title_secondary);
                } else if (i7 == 3) {
                    tb7Var = new tb7(R.string.m3_adaptive_default_pane_title_tertiary);
                }
                if (tb7Var != null) {
                    int i8 = tb7Var.a;
                    xk0.q(sm1Var, lh.a);
                    lp6.h(sm1Var, ((Context) xk0.q(sm1Var, lh.b)).getResources().getString(i8));
                }
                return f88.a;
            case 20:
                PilotMarkerTextInputFieldView pilotMarkerTextInputFieldView = (PilotMarkerTextInputFieldView) obj2;
                int i9 = PilotMarkerTextInputFieldView.H;
                if (((Boolean) obj).booleanValue()) {
                    pilotMarkerTextInputFieldView.setVisibility(0);
                    a65 a65Var = pilotMarkerTextInputFieldView.G;
                    if (a65Var != null) {
                        ((EditText) a65Var.n).requestFocus();
                    }
                } else {
                    pilotMarkerTextInputFieldView.setVisibility(8);
                }
                return f88.a;
            case 21:
                PilotSessionActivity pilotSessionActivity = (PilotSessionActivity) obj2;
                SessionData sessionData = (SessionData) obj;
                int i10 = PilotSessionActivity.U;
                sessionData.getClass();
                if (IViewManagerViewModelSWIGJNI.SessionData_getSessionId(sessionData.a, sessionData) == pilotSessionActivity.Q) {
                    ut2 ut2VarE = pilotSessionActivity.D().E(R.id.pilot_session_fragment_container);
                    int iSessionData_getCurrentView = IViewManagerViewModelSWIGJNI.SessionData_getCurrentView(sessionData.a, sessionData);
                    mf1 mf1Var3 = mf1.None;
                    mf1[] mf1VarArr = (mf1[]) mf1.class.getEnumConstants();
                    if (iSessionData_getCurrentView >= mf1VarArr.length || iSessionData_getCurrentView < 0) {
                        length = mf1VarArr.length;
                        while (true) {
                            if (i2 < length) {
                                hk0.g(ua5.k(iSessionData_getCurrentView, mf1.class, "No enum ", " with value "));
                                return null;
                            }
                            mf1Var = mf1VarArr[i2];
                            if (mf1Var.m == iSessionData_getCurrentView) {
                                mf1Var2 = mf1Var;
                            } else {
                                i2++;
                            }
                        }
                    } else {
                        mf1Var2 = mf1VarArr[iSessionData_getCurrentView];
                        if (mf1Var2.m != iSessionData_getCurrentView) {
                            length = mf1VarArr.length;
                            while (true) {
                                if (i2 < length) {
                                    hk0.g(ua5.k(iSessionData_getCurrentView, mf1.class, "No enum ", " with value "));
                                    return null;
                                }
                                mf1Var = mf1VarArr[i2];
                                if (mf1Var.m == iSessionData_getCurrentView) {
                                    mf1Var2 = mf1Var;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                    int i11 = wk5.a[mf1Var2.ordinal()];
                    if (i11 == 1) {
                        if (!(ut2VarE instanceof yk5)) {
                            int i12 = pilotSessionActivity.Q;
                            Bundle bundle = new Bundle(1);
                            bundle.putInt("PilotSessionContainerFragment_sessionId", i12);
                            yk5Var = new yk5();
                            yk5Var.u0(bundle);
                        }
                        if (yk5Var != null) {
                            w10 w10Var = new w10(pilotSessionActivity.D());
                            w10Var.k(R.id.pilot_session_fragment_container, yk5Var, null);
                            w10Var.f();
                        }
                    } else if (i11 != 2) {
                        ye4.c("PilotSessionActivity", "can not switch to an unknown view type");
                    } else {
                        ye4.a("PilotSessionActivity", "Close Session Activity");
                        pilotSessionActivity.finish();
                    }
                    yk5Var = null;
                    if (yk5Var != null) {
                        w10 w10Var2 = new w10(pilotSessionActivity.D());
                        w10Var2.k(R.id.pilot_session_fragment_container, yk5Var, null);
                        w10Var2.f();
                    }
                }
                return f88.a;
            case 22:
                fq6 fq6Var = (fq6) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return fq6Var.f(iIntValue) + ": " + fq6Var.h(iIntValue).a();
            case 23:
                ((rl) ((qn5) obj2).e()).invoke((MotionEvent) obj);
                return f88.a;
            case 24:
                rs0 rs0Var = (rs0) obj;
                rs0Var.getClass();
                rs0.a(rs0Var, "type", gb7.b);
                rs0.a(rs0Var, "value", et1.s("kotlinx.serialization.Polymorphic<" + ((fo5) obj2).a.f() + '>', jq6.d, new fq6[0]));
                return f88.a;
            case 25:
                vc vcVar = (vc) obj2;
                jd6 jd6Var = (jd6) obj;
                float fFloatValue = ((Number) ((km) vcVar.p).d()).floatValue();
                jd6Var.k(fFloatValue);
                jd6Var.l(fFloatValue);
                jd6Var.z(vcVar.m);
                return f88.a;
            case 26:
                QRCodeAssignmentActivity qRCodeAssignmentActivity = (QRCodeAssignmentActivity) obj2;
                String str4 = (String) obj;
                int i13 = QRCodeAssignmentActivity.N;
                str4.getClass();
                Intent intent = new Intent();
                intent.putExtra("ASSIGNMENT_RESULT_KEY", str4);
                qRCodeAssignmentActivity.setResult(-1, intent);
                qRCodeAssignmentActivity.finish();
                return f88.a;
            case 27:
                i04 i04Var = (i04) obj;
                i04Var.getClass();
                ((j76) obj2).m = i04Var.j();
                return f88.a;
            case 28:
                RCClientActivity rCClientActivity = (RCClientActivity) obj2;
                kc3 kc3Var = (kc3) obj;
                int i14 = RCClientActivity.c0;
                String str5 = kc3Var.a;
                long j = kc3Var.b;
                boolean z = kc3Var.c;
                String str6 = kc3Var.d;
                long j2 = kc3Var.e;
                if (it1.c != null) {
                    im3.b0(rCClientActivity, str5, j, z, str6, j2);
                    return f88.a;
                }
                im3.e0("viewFactory");
                throw null;
            default:
                c36 c36Var = (c36) obj2;
                ((bf1) obj).getClass();
                LogoutViewModel logoutViewModelI = di1.i();
                LicenseViewModel licenseViewModelH = di1.h();
                SharedPreferences sharedPreferences = c36Var.b;
                Settings settings = c36Var.c;
                LockManager lockManager = c36Var.l;
                long jBiometricsStatisticsViewModelFactory_GetBiometricsStatisticsViewModel = BiometricsStatisticsViewModelFactorySWIGJNI.BiometricsStatisticsViewModelFactory_GetBiometricsStatisticsViewModel();
                if (jBiometricsStatisticsViewModelFactory_GetBiometricsStatisticsViewModel != 0) {
                    iBiometricsStatisticsViewModel = new IBiometricsStatisticsViewModel();
                    iBiometricsStatisticsViewModel.b = true;
                    iBiometricsStatisticsViewModel.a = jBiometricsStatisticsViewModelFactory_GetBiometricsStatisticsViewModel;
                }
                IBiometricsStatisticsViewModel iBiometricsStatisticsViewModel2 = iBiometricsStatisticsViewModel;
                iBiometricsStatisticsViewModel2.getClass();
                cg3 cg3Var = cg3.i;
                IInAppPurchaseViewModel iInAppPurchaseViewModelD = et1.d();
                iInAppPurchaseViewModelD.getClass();
                return new hw6(logoutViewModelI, licenseViewModelH, sharedPreferences, settings, lockManager, iBiometricsStatisticsViewModel2, new wf3(cg3Var, iInAppPurchaseViewModelD, EventHub.e.f()), c36Var.f);
        }
    }

    public /* synthetic */ fj3(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }
}
