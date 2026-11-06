package o;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.libs.materialtoolbar.fab.ToolbarItemViewFab;
import com.teamviewer.remotecontrolviewlib.view.session.RcSessionExtraToolbarView;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvshared.EventParam;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class py5 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1789o;

    public /* synthetic */ py5(Context context, yf5 yf5Var) {
        this.m = (byte) 8;
        this.f1789o = context;
        this.n = yf5Var;
    }

    /* JADX WARN: Code duplicated, block: B:190:0x050f  */
    /* JADX WARN: Code duplicated, block: B:51:0x015d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [o.hc1] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v62, types: [kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ny5 ny5Var;
        bt7 bt7VarB;
        bt7 bt7VarB2;
        bt7 bt7VarB3;
        vs7 vs7Var;
        rj rjVarI;
        us7 us7Var;
        byte b = 14;
        byte b2 = 21;
        byte b3 = 1;
        ?? r12 = 0;
        c77VarC = null;
        c77 c77VarC = null;
        switch (this.m) {
            case 0:
                fl7 fl7Var = (fl7) this.n;
                Context context = (Context) this.f1789o;
                String str = (String) obj;
                str.getClass();
                ny5.f1611o.getClass();
                context.getClass();
                for (Object obj2 : ny5.r) {
                    if (im3.n(context.getString(((ny5) obj2).n), str)) {
                        r12 = obj2;
                        ny5Var = (ny5) r12;
                        if (ny5Var == null) {
                            ny5Var = ny5.AUTOMATIC;
                        }
                        SharedPreferences.Editor editorEdit = fl7Var.f809o.edit();
                        editorEdit.getClass();
                        byte b4 = ny5Var.m;
                        editorEdit.putInt("QUALITY_SETTINGS_INT", b4);
                        editorEdit.commit();
                        Settings settings = fl7Var.p;
                        gv6 gv6Var = gv6.USER;
                        ca8 ca8Var = ca8.P_REMOTE_QUALITYMODE;
                        settings.getClass();
                        Settings.j(gv6Var, ca8Var, b4);
                        he2 he2Var = new he2();
                        he2Var.c(EventParam.EP_SETTINGS_KEY, "QUALITY_SETTINGS_INT");
                        fl7Var.n.d(EventType.EVENT_SETTINGS_CHANGED, he2Var);
                        fl7Var.r.A(ny5Var.n);
                        return f88.a;
                    }
                }
                ny5Var = (ny5) r12;
                if (ny5Var == null) {
                    ny5Var = ny5.AUTOMATIC;
                }
                SharedPreferences.Editor editorEdit2 = fl7Var.f809o.edit();
                editorEdit2.getClass();
                byte b5 = ny5Var.m;
                editorEdit2.putInt("QUALITY_SETTINGS_INT", b5);
                editorEdit2.commit();
                Settings settings2 = fl7Var.p;
                gv6 gv6Var2 = gv6.USER;
                ca8 ca8Var2 = ca8.P_REMOTE_QUALITYMODE;
                settings2.getClass();
                Settings.j(gv6Var2, ca8Var2, b5);
                he2 he2Var2 = new he2();
                he2Var2.c(EventParam.EP_SETTINGS_KEY, "QUALITY_SETTINGS_INT");
                fl7Var.n.d(EventType.EVENT_SETTINGS_CHANGED, he2Var2);
                fl7Var.r.A(ny5Var.n);
                return f88.a;
            case 1:
                ImageView imageView = (ImageView) this.n;
                x16 x16Var = (x16) this.f1789o;
                Boolean bool = (Boolean) obj;
                int i = RcSessionExtraToolbarView.n;
                bool.getClass();
                imageView.setSelected(bool.booleanValue());
                imageView.setImageTintList(ColorStateList.valueOf(bool.booleanValue() ? ((Number) x16Var.g.n).intValue() : ((Number) x16Var.g.m).intValue()));
                return f88.a;
            case 2:
                s01 s01Var = (s01) this.n;
                kx4 kx4Var = (kx4) this.f1789o;
                s01Var.z(obj);
                if (kx4Var != null) {
                    kx4Var.a(obj);
                }
                return f88.a;
            case 3:
                p56 p56Var = (p56) this.n;
                Throwable th = (Throwable) this.f1789o;
                Throwable th2 = (Throwable) obj;
                synchronized (p56Var.c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                ct1.q(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    p56Var.e = th;
                    l97 l97Var = p56Var.u;
                    m56 m56Var = m56.m;
                    l97Var.getClass();
                    l97Var.l(null, m56Var);
                }
                return f88.a;
            case 4:
                ((zx4) this.n).a.setValue(new pe2((qj8) this.f1789o, (qj8) obj));
                return f88.a;
            case 5:
                String str2 = (String) this.n;
                Function0 function0 = (Function0) this.f1789o;
                op6 op6Var = (op6) obj;
                fw3[] fw3VarArr = lp6.a;
                np6 np6Var = kp6.u;
                fw3 fw3Var = lp6.a[11];
                Float fValueOf = Float.valueOf(1.0f);
                np6Var.getClass();
                op6Var.d(np6Var, fValueOf);
                if (str2 != null) {
                    lp6.d(op6Var, str2);
                }
                op6Var.d(zo6.b, new m3(null, new yv1(function0, (byte) 24)));
                return f88.a;
            case 6:
                wk6 wk6Var = (wk6) this.n;
                yk6 yk6Var = (yk6) this.f1789o;
                o42 o42Var = (o42) obj;
                float f = o42Var.b ? -1.0f : 1.0f;
                long j = o42Var.a;
                wk6Var.a(1, t65.f(f, yk6Var.d == gb5.n ? t65.a(0.0f, 1, j) : t65.a(0.0f, 2, j)));
                return f88.a;
            case 7:
                Activity activity = (Activity) this.n;
                bn6 bn6Var = (bn6) this.f1789o;
                ((r22) obj).getClass();
                return new l9(activity, bn6Var, (byte) 13);
            case 8:
                Context context2 = (Context) this.f1789o;
                final yf5 yf5Var = (yf5) this.n;
                ((r22) obj).getClass();
                context2.getClass();
                final View decorView = ((Activity) context2).getWindow().getDecorView();
                decorView.getClass();
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.km6
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        Rect rect = new Rect();
                        View view = decorView;
                        view.getWindowVisibleDisplayFrame(rect);
                        int height = view.getHeight();
                        int i2 = height - rect.bottom;
                        if (i2 <= ((double) height) * 0.15d) {
                            i2 = 0;
                        }
                        yf5Var.A(i2);
                    }
                };
                decorView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
                return new l9(decorView, onGlobalLayoutListener, b);
            case ep1.b /* 9 */:
                yl6 yl6Var = (yl6) this.n;
                nl6 nl6Var = (nl6) this.f1789o;
                z31 z31Var = (z31) obj;
                z31Var.getClass();
                if (yl6Var.n) {
                    nl6Var.g.invoke(z31Var);
                } else {
                    nl6Var.f.invoke(z31Var);
                }
                return f88.a;
            case ep1.c /* 10 */:
                nr6 nr6Var = (nr6) this.n;
                w44 w44Var = (w44) this.f1789o;
                ((r22) obj).getClass();
                return new l9(nr6Var, w44Var, (byte) 15);
            case 11:
                xr6 xr6Var = (xr6) this.n;
                ?? r13 = (Function1) this.f1789o;
                SupportSession supportSession = (SupportSession) obj;
                supportSession.getClass();
                xr6Var.w = Integer.valueOf(supportSession.getSessioncode());
                r13.invoke(supportSession);
                return f88.a;
            case ep1.d /* 12 */:
                Function1 function1 = (Function1) this.n;
                Function0 function2 = (Function0) this.f1789o;
                l33 l33Var = (l33) obj;
                l33Var.getClass();
                function1.invoke(l33Var);
                function2.a();
                return f88.a;
            case 13:
                me1 me1Var = (me1) this.n;
                ul1 ul1Var = (ul1) this.f1789o;
                String str3 = (String) obj;
                str3.getClass();
                im3.R(me1Var, null, null, new vt4(ul1Var, str3, r12, b2), 3);
                return f88.a;
            case 14:
                LifecycleOwner lifecycleOwner = (LifecycleOwner) this.n;
                hw6 hw6Var = (hw6) this.f1789o;
                ((r22) obj).getClass();
                yh6 yh6Var = new yh6(hw6Var, b3);
                lifecycleOwner.getR().a(yh6Var);
                return new l9(lifecycleOwner, yh6Var, (byte) 16);
            case 15:
                il5.m((il5) obj, (jl5) this.n, 0, 0, ((d07) this.f1789o).N);
                return f88.a;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ud7 ud7Var = (ud7) this.n;
                px4 px4Var = (px4) this.f1789o;
                if (((Boolean) obj).booleanValue()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("purchase_successful", true);
                    ud7Var.G().e0("purchase_successful", bundle);
                } else {
                    px4Var.setValue(jp5.q);
                }
                return f88.a;
            case 17:
                th7 th7Var = (th7) this.n;
                rh7 rh7Var = (rh7) this.f1789o;
                pg6 pg6Var = (pg6) obj;
                pg6Var.getClass();
                th7Var.b.P(pg6Var, rh7Var);
                return f88.a;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                Function0 function3 = (Function0) this.n;
                px4 px4Var2 = (px4) this.f1789o;
                y07 y07Var = (y07) obj;
                float fFloatValue = ((Number) function3.a()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (y07Var.a >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (y07Var.a & 4294967295L)) * fFloatValue;
                if (Float.intBitsToFloat((int) (((y07) px4Var2.getValue()).a >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((y07) px4Var2.getValue()).a & 4294967295L)) != fIntBitsToFloat2) {
                    px4Var2.setValue(new y07((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
                }
                return f88.a;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new l9((px4) this.n, (mw4) this.f1789o, (byte) 19);
            case 20:
                wo woVar = (wo) this.n;
                yf5 yf5Var2 = ((ha4) this.f1789o).b;
                xo7 xo7Var = (xo7) obj;
                ga4 ga4Var = (ga4) woVar.a;
                bt7 bt7VarB4 = ga4Var.b();
                c77 c77Var = bt7VarB4 != null ? bt7VarB4.a : null;
                c77 c77VarC2 = ((yf5Var2.z() & 1) == 0 || (bt7VarB3 = ga4Var.b()) == null) ? null : bt7VarB3.b;
                if (c77Var != null) {
                    c77VarC2 = c77Var.c(c77VarC2);
                }
                c77 c77VarC3 = ((2 & yf5Var2.z()) == 0 || (bt7VarB2 = ga4Var.b()) == null) ? null : bt7VarB2.c;
                if (c77VarC2 != null) {
                    c77VarC3 = c77VarC2.c(c77VarC3);
                }
                if ((yf5Var2.z() & 4) != 0 && (bt7VarB = ga4Var.b()) != null) {
                    c77VarC = bt7VarB.d;
                }
                if (c77VarC3 != null) {
                    c77VarC = c77VarC3.c(c77VarC);
                }
                xo7Var.b = xo7Var.a.b(new xn5(new g76(), woVar, c77VarC, (byte) 5));
                return f88.a;
            case 21:
                at7 at7Var = (at7) this.n;
                wo woVar2 = (wo) this.f1789o;
                jd6 jd6Var = (jd6) obj;
                xo xoVar = at7Var.b;
                bg5 bg5Var = at7Var.a;
                vs7 vs7Var2 = (vs7) bg5Var.getValue();
                if (im3.n(xoVar, (vs7Var2 == null || (us7Var = vs7Var2.a) == null) ? null : us7Var.a) && (vs7Var = (vs7) bg5Var.getValue()) != null) {
                    xu4 xu4Var = vs7Var.b;
                    wo woVarC = at7.c(woVar2, vs7Var);
                    if (woVarC == null) {
                        rjVarI = null;
                    } else {
                        int i2 = woVarC.c;
                        int i3 = woVarC.b;
                        rjVarI = vs7Var.i(i3, i2);
                        v56 v56VarB = vs7Var.b(i3);
                        int i4 = i2 - 1;
                        rjVarI.h(((((long) Float.floatToRawIntBits(xu4Var.d(i3) == xu4Var.d(i4) ? Math.min(vs7Var.b(i4).a, v56VarB.a) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(v56VarB.b)) & 4294967295L)) ^ (-9223372034707292160L));
                    }
                } else {
                    rjVarI = null;
                }
                zs7 zs7Var = rjVarI != null ? new zs7(rjVarI) : null;
                if (zs7Var != null) {
                    jd6Var.o(zs7Var);
                    jd6Var.e(true);
                }
                return f88.a;
            case 22:
                List list = (List) this.n;
                List list2 = (List) this.f1789o;
                il5 il5Var = (il5) obj;
                if (list != null) {
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        vd5 vd5Var = (vd5) list.get(i5);
                        il5.j(il5Var, (jl5) vd5Var.m, ((vk3) vd5Var.n).a);
                    }
                }
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        vd5 vd5Var2 = (vd5) list2.get(i6);
                        jl5 jl5Var = (jl5) vd5Var2.m;
                        Function0 function4 = (Function0) vd5Var2.n;
                        il5.j(il5Var, jl5Var, function4 != null ? ((vk3) function4.a()).a : 0L);
                    }
                }
                return f88.a;
            case 23:
                nw4 nw4Var = (nw4) this.n;
                ToolbarItemViewFab toolbarItemViewFab = (ToolbarItemViewFab) this.f1789o;
                if (!((Boolean) obj).booleanValue()) {
                    toolbarItemViewFab.getView().setVisibility(8);
                } else if (im3.n(nw4Var.getValue(), Boolean.TRUE)) {
                    toolbarItemViewFab.getView().setVisibility(0);
                }
                return f88.a;
            case 24:
                ((lo4) this.n).setValue(((fj3) this.f1789o).invoke(obj));
                return f88.a;
            case 25:
                im3.R((me1) this.n, null, pe1.p, new be6((u18) this.f1789o, null), 1);
                return new fc((byte) 6);
            case 26:
                g2 g2Var = (g2) this.n;
                ((rn6) g2Var).G0(new br5(new py5((Object) Thread.currentThread(), this.f1789o, (byte) 28)));
                return new m8(g2Var, b);
            case 27:
                u18 u18Var = (u18) this.n;
                q18 q18Var = (q18) this.f1789o;
                u18Var.j.add(q18Var);
                return new l9(u18Var, q18Var, (byte) 23);
            case 28:
                Object obj3 = this.n;
                me1 me1Var2 = (me1) this.f1789o;
                Function0 function5 = (Function0) obj;
                if (obj3 == Thread.currentThread()) {
                    function5.a();
                } else {
                    im3.R(me1Var2, null, null, new yu(function5, r12, b3), 3);
                }
                return f88.a;
            default:
                u18 u18Var2 = (u18) this.n;
                u18 u18Var3 = (u18) this.f1789o;
                u18Var2.k.add(u18Var3);
                return new l9(u18Var2, u18Var3, b2);
        }
    }

    public /* synthetic */ py5(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f1789o = obj2;
    }

    public /* synthetic */ py5(at7 at7Var, wo woVar, ha4 ha4Var) {
        this.m = (byte) 20;
        this.n = woVar;
        this.f1789o = ha4Var;
    }
}
