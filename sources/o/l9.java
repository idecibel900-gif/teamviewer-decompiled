package o;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class l9 implements q22 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o.q22
    public final void a() {
        Object value;
        Object value2;
        byte b = this.a;
        l33 l33Var = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Activity activity = (Activity) obj2;
                if (activity == null || !activity.isChangingConfigurations()) {
                    ((p9) obj).V0();
                }
                break;
            case 1:
                Activity activity2 = (Activity) obj2;
                if (activity2 == null || !activity2.isChangingConfigurations()) {
                    vb vbVar = (vb) obj;
                    l97 l97Var = vbVar.s;
                    do {
                        value = l97Var.getValue();
                    } while (!l97Var.j(value, new ob(l33Var, 4095)));
                    l97 l97Var2 = vbVar.u;
                    do {
                        value2 = l97Var2.getValue();
                    } while (!l97Var2.j(value2, new ib()));
                    n87 n87Var = vbVar.y;
                    if (n87Var != null) {
                        n87Var.j(null);
                    }
                    vbVar.y = null;
                    n87 n87Var2 = vbVar.z;
                    if (n87Var2 != null) {
                        n87Var2.j(null);
                    }
                    vbVar.z = null;
                }
                break;
            case 2:
                ((s10) obj2).b((jz0) obj);
                break;
            case 3:
                w44 w44Var = (w44) obj;
                ((ja1) obj2).e.invoke(Integer.valueOf(w44Var.h()), Integer.valueOf(w44Var.i()));
                break;
            case 4:
                px4 px4Var = (px4) obj;
                if (((Boolean) px4Var.getValue()).booleanValue()) {
                    et1.M((Activity) obj2, false);
                    px4Var.setValue(Boolean.FALSE);
                }
                break;
            case 5:
                w44 w44Var2 = (w44) obj;
                ((u23) obj2).i.invoke(Integer.valueOf(w44Var2.h()), Integer.valueOf(w44Var2.i()));
                break;
            case 6:
                e43 e43Var = (e43) obj2;
                w44 w44Var3 = (w44) obj;
                int iH = w44Var3.h();
                int i = w44Var3.i();
                l97 l97Var3 = e43Var.p;
                Integer numValueOf = Integer.valueOf(iH);
                l97Var3.getClass();
                l97Var3.l(null, numValueOf);
                l97 l97Var4 = e43Var.q;
                Integer numValueOf2 = Integer.valueOf(i);
                l97Var4.getClass();
                l97Var4.l(null, numValueOf2);
                break;
            case 7:
                ((th3) obj2).a.j((rh3) obj);
                break;
            case 8:
                ((c54) obj2).f491o.j(obj);
                break;
            case ep1.b /* 9 */:
                ((nw4) obj2).removeObserver((p) obj);
                break;
            case ep1.c /* 10 */:
                ((s10) obj2).b((qz0) obj);
                break;
            case 11:
                ((LifecycleOwner) obj2).getR().f((yx5) obj);
                break;
            case ep1.d /* 12 */:
                ((LifecycleOwner) obj2).getR().f((yx5) obj);
                break;
            case 13:
                Activity activity3 = (Activity) obj2;
                if (activity3 == null || !activity3.isChangingConfigurations()) {
                    IStatisticsHandler iStatisticsHandler = ga7.a;
                    ga7.a(jz2.r);
                    bn6 bn6Var = (bn6) obj;
                    bn6Var.E = null;
                    bn6Var.j1(new fk6((byte) 3));
                    bn6Var.E = null;
                    bn6Var.i1("");
                }
                break;
            case 14:
                ((View) obj2).getViewTreeObserver().removeOnGlobalLayoutListener((km6) obj);
                break;
            case 15:
                w44 w44Var4 = (w44) obj;
                ((nr6) obj2).m.invoke(Integer.valueOf(w44Var4.h()), Integer.valueOf(w44Var4.i()));
                break;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((LifecycleOwner) obj2).getR().f((yh6) obj);
                break;
            case 17:
                ((LifecycleOwner) obj2).getR().f((dy0) obj);
                break;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((LifecycleOwner) obj2).getR().f((h8) obj);
                break;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                px4 px4Var2 = (px4) obj2;
                yr5 yr5Var = (yr5) px4Var2.getValue();
                if (yr5Var != null) {
                    xr5 xr5Var = new xr5(yr5Var);
                    mw4 mw4Var = (mw4) obj;
                    if (mw4Var != null) {
                        mw4Var.b(xr5Var);
                    }
                    px4Var2.setValue(null);
                }
                break;
            case 20:
                ((at7) obj2).c.remove((Function1) obj);
                break;
            case 21:
                ((u18) obj2).k.remove((u18) obj);
                break;
            case 22:
                u18 u18Var = (u18) obj2;
                m18 m18Var = (m18) ((n18) obj).b.getValue();
                if (m18Var != null) {
                    u18Var.j.remove(m18Var.m);
                }
                break;
            case 23:
                ((u18) obj2).j.remove((q18) obj);
                break;
            case 24:
                ((LifecycleOwner) obj2).getR().f((lh8) obj);
                break;
            case 25:
                ((LifecycleOwner) obj2).getR().f((lh8) obj);
                break;
            case 26:
                ((LifecycleOwner) obj2).getR().f((lh8) obj);
                break;
            default:
                wk8 wk8Var = (wk8) obj2;
                View view = (View) obj;
                int i2 = wk8Var.u - 1;
                wk8Var.u = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = be8.a;
                    sd8.c(view, null);
                    xj8.a(view, null);
                    view.removeOnAttachStateChangeListener(wk8Var.v);
                }
                break;
        }
    }
}
