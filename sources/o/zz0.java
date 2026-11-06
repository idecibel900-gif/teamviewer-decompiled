package o;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.GroupMemberListElementViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.CopyrightActivity;
import com.teamviewer.remotecontrolviewlib.activity.SettingsActivity;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import com.teamviewer.teamviewerlib.swig.tvbackendcontainer.BackendContainerAndroid;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zz0 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ zz0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:135:0x030d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0310  */
    /* JADX WARN: Code duplicated, block: B:138:0x0314  */
    /* JADX WARN: Code duplicated, block: B:139:0x0317  */
    /* JADX WARN: Code duplicated, block: B:141:0x034a  */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        int i;
        gl8 gl8Var;
        Object value;
        bb5 bb5Var;
        nv2 nv2Var;
        int largeMemoryClass;
        byte b = this.m;
        Context context = null;
        f88 f88Var = f88.a;
        Object obj = this.n;
        switch (b) {
            case 0:
                boolean zB = dl3.b(0L, 0L);
                View view = ((c01) obj).a;
                if (!zB) {
                    return new ao1(0L, e8.e(view.getContext()).r(xs1.a0(0L)));
                }
                Context context2 = view.getContext();
                Context baseContext = context2;
                while (baseContext instanceof ContextWrapper) {
                    if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                        context = baseContext;
                    } else {
                        ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                        if (contextWrapper.getBaseContext() != null) {
                            baseContext = contextWrapper.getBaseContext();
                        }
                    }
                    if (context != null) {
                        Configuration configuration = context2.getResources().getConfiguration();
                        nn1 nn1VarE = e8.e(context2);
                        long jA = nv1.a(configuration.screenWidthDp, configuration.screenHeightDp);
                        long jW0 = nn1VarE.w0(jA);
                        return new ao1((((long) ((int) Float.intBitsToFloat((int) (jW0 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jW0 >> 32)))) << 32), jA);
                    }
                    el8.a.getClass();
                    fl8 fl8Var = dl8.b;
                    fl8Var.getClass();
                    i = Build.VERSION.SDK_INT;
                    if (i >= 34) {
                        gl8Var = kn1.n;
                    } else if (i >= 30) {
                        gl8Var = qa0.n;
                    } else {
                        gl8Var = z06.L;
                    }
                    ma0 ma0Var = gl8Var.c(context, fl8Var.b).a;
                    long jHeight = (((long) ma0Var.c().height()) & 4294967295L) | (((long) ma0Var.c().width()) << 32);
                    return new ao1(jHeight, e8.e(context).r(xs1.a0(jHeight)));
                }
                if (context != null) {
                    Configuration configuration2 = context2.getResources().getConfiguration();
                    nn1 nn1VarE2 = e8.e(context2);
                    long jA2 = nv1.a(configuration2.screenWidthDp, configuration2.screenHeightDp);
                    long jW1 = nn1VarE2.w0(jA2);
                    return new ao1((((long) ((int) Float.intBitsToFloat((int) (jW1 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jW1 >> 32)))) << 32), jA2);
                }
                el8.a.getClass();
                fl8 fl8Var2 = dl8.b;
                fl8Var2.getClass();
                i = Build.VERSION.SDK_INT;
                if (i >= 34) {
                    gl8Var = kn1.n;
                } else if (i >= 30) {
                    gl8Var = qa0.n;
                } else {
                    gl8Var = z06.L;
                }
                ma0 ma0Var2 = gl8Var.c(context, fl8Var2.b).a;
                long jHeight2 = (((long) ma0Var2.c().height()) & 4294967295L) | (((long) ma0Var2.c().width()) << 32);
                return new ao1(jHeight2, e8.e(context).r(xs1.a0(jHeight2)));
            case 1:
                ((h11) obj).u.d();
                return f88Var;
            case 2:
                return ((cj3) obj).k(":memory:");
            case 3:
                ((i71) obj).notifyDataSetChanged();
                return f88Var;
            case 4:
                ((j71) obj).r.d();
                return f88Var;
            case 5:
                int[] iArr = CopyrightActivity.H;
                ((CopyrightActivity) obj).finish();
                return f88Var;
            case 6:
                return ((j64) obj).d();
            case 7:
                return new hr7((gb5) obj, 0.0f);
            case 8:
                return Float.valueOf(((xu7) obj).m.c());
            case ep1.b /* 9 */:
                ((rp7) obj).close();
                return f88Var;
            case ep1.c /* 10 */:
                ul1 ul1Var = (ul1) obj;
                return ul1Var.b(qf0.D(ul1Var.a));
            case 11:
                l97 l97Var = ((ru1) obj).z;
                do {
                    value = l97Var.getValue();
                } while (!l97Var.j(value, wt1.a((wt1) value, false, null, null, false, false, false, false, false, true, false, false, null, null, null, null, false, null, false, null, null, false, false, false, 16776703)));
                return f88Var;
            case ep1.d /* 12 */:
                fv1 fv1Var = (fv1) obj;
                int i2 = fv1.O0;
                if (fv1Var.F0().O() && (fv1Var.F0().B0() instanceof fv1) && (bb5Var = fv1Var.r0) != null) {
                    bb5Var.G0();
                }
                return f88Var;
            case 13:
                fw1 fw1Var = (fw1) obj;
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(i15.t);
                Context contextR0 = fw1Var.r0();
                if (it1.c != null) {
                    fw1Var.y0(new Intent(contextR0, (Class<?>) SettingsActivity.class));
                    return f88Var;
                }
                im3.e0("viewFactory");
                throw null;
            case 14:
                he5 he5Var = (he5) obj;
                he5Var.getClass();
                he5Var.b().a.A(-1);
                he5Var.b().c.A(-1);
                he5Var.b().b.A(0.4f);
                he5Var.b().d.setValue(null);
                return f88Var;
            case 15:
                nx1 nx1Var = (nx1) obj;
                Context contextR1 = nx1Var.r0();
                if (it1.c != null) {
                    nx1Var.y0(new Intent(contextR1, (Class<?>) SettingsActivity.class));
                    return f88Var;
                }
                im3.e0("viewFactory");
                throw null;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                return new d62((DrawablePainter) obj);
            case 17:
                ((br2) obj).W0();
                return f88Var;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ov2 ov2Var = (ov2) obj;
                Context context3 = ov2Var.m;
                String str = ov2Var.n;
                if (str == null || !ov2Var.p) {
                    nv2Var = new nv2(context3, ov2Var.n, new xk1((byte) 23), ov2Var.f1681o, ov2Var.q);
                } else {
                    File noBackupFilesDir = context3.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    nv2Var = new nv2(context3, new File(noBackupFilesDir, str).getAbsolutePath(), new xk1((byte) 23), ov2Var.f1681o, ov2Var.q);
                }
                nv2Var.setWriteAheadLoggingEnabled(ov2Var.s);
                return nv2Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return h57.p((k33) obj);
            case 20:
                r33 r33Var = (r33) obj;
                r33Var.V0();
                nw4 nw4Var = r33Var.p;
                GroupMemberListElementViewModel groupMemberListElementViewModel = r33Var.n;
                nw4Var.setValue(GroupMemberListElementViewModelSWIGJNI.GroupMemberListElementViewModel_GetAccountPictureUrl(groupMemberListElementViewModel.a, groupMemberListElementViewModel));
                return f88Var;
            case 21:
                l97 l97Var2 = ((e43) obj).f678o;
                Object value2 = l97Var2.getValue();
                l67 l67Var = l67.m;
                if (value2 == l67Var) {
                    l67Var = l67.n;
                }
                l97Var2.l(null, l67Var);
                return f88Var;
            case 22:
                return (List) obj;
            case 23:
                i83 i83Var = (i83) obj;
                i83Var.getClass();
                try {
                    i83Var.I.F(2, 0, false);
                    break;
                } catch (IOException e) {
                    tc2 tc2Var = tc2.PROTOCOL_ERROR;
                    i83Var.e(tc2Var, tc2Var, e);
                }
                return f88Var;
            case 24:
                Context context4 = (Context) ((iu) obj).n;
                double d = 0.2d;
                try {
                    Object systemService = context4.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    hk0.g("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                nd ndVar = new nd((byte) 14);
                try {
                    Object systemService2 = context4.getSystemService((Class<Object>) ActivityManager.class);
                    systemService2.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (context4.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = 256;
                }
                return new m46(new io.sentry.util.network.b((long) (d * ((long) largeMemoryClass) * io.sentry.g7.MAX_EVENT_SIZE_BYTES), ndVar), ndVar);
            case 25:
                zf3 zf3Var = (zf3) obj;
                c36 c36Var = zu1.c;
                if (c36Var == null) {
                    hk0.g("Required value was null.");
                    return null;
                }
                dl5 dl5Var = new dl5(new t26(c36Var, BackendContainerAndroid.GetInstance(), (byte) 1), (byte) 2);
                ve8 ve8VarO = zf3Var.getG0();
                bf1 bf1VarK = h57.k(zf3Var);
                pn5 pn5VarT = ua5.t(bf1VarK, ve8VarO, dl5Var, bf1VarK);
                wt3 wt3VarB = w86.a.b(tf3.class);
                String strC = wt3VarB.c();
                if (strC != null) {
                    return (tf3) pn5VarT.j("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strC), wt3VarB);
                }
                hk0.g("Local and anonymous classes can not be ViewModels");
                return null;
            case 26:
                return Float.valueOf(i67.p(((me1) obj).getCoroutineContext()));
            case 27:
                Object systemService3 = ((View) ((iu) obj).f1103o).getContext().getSystemService("input_method");
                systemService3.getClass();
                return (InputMethodManager) systemService3;
            case 28:
                Object systemService4 = ((View) ((cj3) obj).n).getContext().getSystemService("input_method");
                systemService4.getClass();
                return (InputMethodManager) systemService4;
            default:
                return ((a2) ((wc3) ((fp1) obj).a)).f283o.s;
        }
    }
}
