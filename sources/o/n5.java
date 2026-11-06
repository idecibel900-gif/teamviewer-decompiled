package o;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Uri;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.DeleteAccountViewModel;
import com.teamviewer.remotecontrollib.swig.DeleteAccountViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.QRCodeAssignmentActivity;
import com.teamviewer.teamviewerlib.swig.statistics.IStatisticsHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n5 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1540o;
    public final /* synthetic */ Object p;

    public /* synthetic */ n5(au0 au0Var, Context context, px4 px4Var) {
        this.m = (byte) 3;
        this.f1540o = au0Var;
        this.n = context;
        this.p = px4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        ClipData.Item itemAt;
        CharSequence charSequenceCoerceToText;
        int i;
        v56 v56Var;
        v56 v56VarV;
        v56 v56VarV2;
        byte b = this.m;
        String str = "";
        byte b2 = 0;
        byte b3 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        f88 f88Var = f88.a;
        Object obj = this.n;
        Object obj2 = this.p;
        Object obj3 = this.f1540o;
        switch (b) {
            case 0:
                j6 j6Var = (j6) obj3;
                iv6 iv6Var = (iv6) obj2;
                Context context = (Context) obj;
                if (l25.b()) {
                    DeleteAccountViewModel deleteAccountViewModel = j6Var.q;
                    if (DeleteAccountViewModelSWIGJNI.DeleteAccountViewModel_IsCompanyAccount(deleteAccountViewModel.c, deleteAccountViewModel)) {
                        j6Var.X0(b12.p);
                    } else {
                        j6Var.X0(b12.q);
                    }
                } else {
                    xk0.b(iv6Var, context, x5.C);
                }
                return f88Var;
            case 1:
                qk4 qk4Var = (qk4) obj3;
                Intent intent = new Intent((Context) obj, (Class<?>) QRCodeAssignmentActivity.class);
                List list = ((ib) ((i97) obj2).getValue()).e;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    UUID uuidB = bt1.B((l33) it.next());
                    String string = uuidB != null ? uuidB.toString() : null;
                    if (string != null) {
                        arrayList.add(string);
                    }
                }
                intent.putStringArrayListExtra("groupIds", new ArrayList<>(arrayList));
                qk4Var.a(intent, null);
                return f88Var;
            case 2:
                bv bvVar = (bv) obj3;
                Function1 function1 = (Function1) obj2;
                ak3 ak3Var = (ak3) obj;
                bvVar.getClass();
                function1.getClass();
                Context context2 = bvVar.a;
                String str2 = bvVar.c;
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(str2));
                intent2.addFlags(268435456);
                try {
                    PackageManager packageManager = context2.getPackageManager();
                    String str3 = bvVar.b.m;
                    if (str3 != null) {
                        str = str3;
                    }
                    if (packageManager.getLaunchIntentForPackage(str) != null) {
                        context2.startActivity(intent2);
                    } else {
                        function1.invoke(zj3.m);
                    }
                    break;
                } catch (ActivityNotFoundException unused) {
                }
                kh7 kh7Var = ev.a;
                ak3Var.getClass();
                ev.a(new dv(cv.f559o, ak3Var, null, false, 12));
                return f88Var;
            case 3:
                Context context3 = (Context) obj;
                px4 px4Var = (px4) obj2;
                ClipData primaryClip = di1.s((au0) obj3).getPrimaryClip();
                if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null && (charSequenceCoerceToText = itemAt.coerceToText(context3)) != null) {
                    px4Var.setValue(charSequenceCoerceToText.toString());
                }
                return f88Var;
            case 4:
                ((e10) obj3).a();
                yx yxVar = (yx) ((yc4) obj2).f2598o;
                int i2 = ((i76) obj).m;
                do {
                    i = yxVar.get();
                } while (!yxVar.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
                return f88Var;
            case 5:
                k08 k08Var = (k08) obj3;
                me1 me1Var = (me1) obj2;
                px4 px4Var2 = (px4) obj;
                if (k08Var.b()) {
                    im3.R(me1Var, null, null, new ac(k08Var, objArr == true ? 1 : 0, b3), 3);
                    px4Var2.setValue(Boolean.FALSE);
                }
                return f88Var;
            case 6:
                me1 me1Var2 = (me1) obj2;
                xy6 xy6Var = (xy6) obj;
                if (((Boolean) ((xy6) obj3).d.invoke(yy6.n)).booleanValue()) {
                    im3.R(me1Var2, null, null, new gy(xy6Var, objArr2 == true ? 1 : 0, (byte) 7), 3);
                }
                return Boolean.TRUE;
            case 7:
                xy6 xy6Var2 = (xy6) obj3;
                xy6Var2.h = (rl2) obj2;
                xy6Var2.i = (rl2) obj;
                return f88Var;
            case 8:
                kb0 kb0Var = (kb0) obj3;
                v56 v56VarU0 = kb0.U0(kb0Var, (e45) obj2, (x8) obj);
                if (v56VarU0 == null) {
                    return null;
                }
                cb1 cb1Var = kb0Var.A;
                if (dl3.b(cb1Var.H, -1L)) {
                    ni3.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return v56VarU0.i(cb1Var.Y0(v56VarU0, cb1Var.V0(), 0L) ^ (-9223372034707292160L));
            case ep1.b /* 9 */:
                y31 y31Var = (y31) obj3;
                xc0 xc0Var = ((y21) obj2).t0;
                Context context4 = ((ComposeView) obj).getContext();
                context4.getClass();
                xc0Var.getClass();
                y21 y21Var = (y21) xc0Var.n;
                Intent intentB = sj4.b(context4);
                try {
                    if ((y21Var.C() != null ? (byte) 1 : (byte) 0) != 0) {
                        y21Var.y0(intentB);
                    } else {
                        ye4.c("ConnectFragment", "could not send crashlog: Activity is NULL");
                    }
                    break;
                } catch (ActivityNotFoundException unused2) {
                    im3.R(us1.B(y21Var), null, null, new y0(y21Var, objArr3 == true ? 1 : 0, (byte) 9), 3);
                }
                y31Var.X0();
                return f88Var;
            case ep1.c /* 10 */:
                iq8 iq8Var = ((jm0) obj3).b;
                iq8Var.getClass();
                return iq8Var.i(((dc) obj).h.d, ((s43) obj2).a());
            case 11:
                cb1 cb1Var2 = (cb1) obj3;
                o98 o98Var = (o98) obj2;
                nb0 nb0Var = (nb0) obj;
                eb0 eb0Var = cb1Var2.F;
                while (true) {
                    xx4 xx4Var = eb0Var.a;
                    int i3 = xx4Var.f2559o;
                    if (i3 != 0) {
                        if (i3 == 0) {
                            an4.j("MutableVector is empty.");
                            return null;
                        }
                        v56 v56Var2 = (v56) ((za1) xx4Var.m[i3 - 1]).a.a();
                        if (v56Var2 == null ? true : cb1.W0(cb1Var2, v56Var2, 0L, 0L, 3)) {
                            xx4 xx4Var2 = eb0Var.a;
                            ((za1) xx4Var2.k(xx4Var2.f2559o - 1)).b.resumeWith(f88Var);
                        }
                    }
                }
                if (cb1Var2.G && (v56Var = (v56) cb1Var2.E.a()) != null && cb1.W0(cb1Var2, v56Var, 0L, 0L, 3)) {
                    cb1Var2.G = false;
                }
                o98Var.e = cb1Var2.U0(nb0Var, 0L);
                return f88Var;
            case ep1.d /* 12 */:
                xv1 xv1Var = (xv1) obj3;
                Function1 function2 = (Function1) obj2;
                Function0 function0 = (Function0) obj;
                if (xv1Var.a || xv1Var.c) {
                    function2.invoke(zz1.a);
                } else {
                    function0.a();
                }
                return f88Var;
            case 13:
                fx1 fx1Var = (fx1) obj3;
                tx1 tx1Var = (tx1) obj2;
                fx1Var.f1(tx1Var);
                sx1 sx1Var = (sx1) tx1Var;
                ((Function1) obj).invoke(sx1Var.a);
                fx1Var.X0(sx1Var.a.a);
                return f88Var;
            case 14:
                im3.R((me1) obj3, null, null, new oa1(obj2, obj, (hc1) (objArr4 == true ? 1 : 0), (byte) 11), 3);
                return f88Var;
            case 15:
                ((Function1) obj3).invoke(new ql1((fx1) obj2, (px4) obj, b3));
                return f88Var;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ((Function1) obj3).invoke(new rw1((me1) obj2, (ul1) obj, b2));
                return f88Var;
            case 17:
                ux2 ux2Var = (ux2) obj3;
                tm0 tm0Var = (tm0) obj2;
                g17 g17Var = (g17) obj;
                f01 f01Var = ux2Var.M;
                tm0 tm0Var2 = f01Var.b;
                try {
                    f01Var.b = tm0Var;
                    g17 g17Var2 = ux2Var.G;
                    int[] iArr = ux2Var.f2257o;
                    kw4 kw4Var = ux2Var.v;
                    ux2Var.f2257o = null;
                    ux2Var.v = null;
                    try {
                        ux2Var.G = g17Var;
                        boolean z = f01Var.e;
                        try {
                            f01Var.e = false;
                            ux2Var.B(null, null);
                            f01Var.e = z;
                            ux2Var.G = g17Var2;
                            ux2Var.f2257o = iArr;
                            ux2Var.v = kw4Var;
                            f01Var.b = tm0Var2;
                            return f88Var;
                        } catch (Throwable th) {
                            f01Var.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        ux2Var.G = g17Var2;
                        ux2Var.f2257o = iArr;
                        ux2Var.v = kw4Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    f01Var.b = tm0Var2;
                    throw th3;
                }
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj2;
                io.sentry.android.core.internal.util.b bVar = (io.sentry.android.core.internal.util.b) obj;
                if (((g76) obj3).m) {
                    we4.f().c(cm8.a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(bVar);
                }
                return f88Var;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                px4 px4Var3 = (px4) obj2;
                Function0 function3 = (Function0) px4Var3.getValue();
                ((px4) obj).setValue(Boolean.FALSE);
                px4Var3.setValue(null);
                ((Function0) ((px4) obj3).getValue()).a();
                if (function3 != null) {
                    function3.a();
                }
                return f88Var;
            case 20:
                w44 w44Var = (w44) obj2;
                h44 h44Var = (h44) ((eo1) obj3).getValue();
                return new i44(w44Var, h44Var, (w14) obj, new ae((yk3) ((s34) w44Var.e.q).getValue(), h44Var));
            case 21:
                hw2 hw2Var = (hw2) obj3;
                Object obj4 = (e63) obj;
                rg4 rg4Var = (rg4) ((k76) obj2).m;
                jx4 jx4Var = rg4Var.y;
                if (jx4Var == null) {
                    long[] jArr = ti6.a;
                    jx4Var = new jx4();
                    rg4Var.y = jx4Var;
                }
                Object objG = jx4Var.g(obj4);
                if (objG == null) {
                    objG = new qg4(rg4Var);
                    jx4Var.m(obj4, objG);
                }
                qg4 qg4Var = (qg4) objG;
                qg4Var.m = false;
                hw2Var.invoke(qg4Var, obj4);
                return f88Var;
            case 22:
                e45 e45Var = (e45) obj2;
                g76 g76Var = (g76) obj;
                jd6 jd6Var = e45.l0;
                ((Function1) obj3).invoke(jd6Var);
                boolean zN = im3.n(e45Var.X, jd6Var.A);
                Object[] objArr5 = e45Var.a0 != jd6Var.B ? 1 : 0;
                vs1 vs1VarA = jd6Var.A.a(jd6Var.C, jd6Var.F, jd6Var.E);
                jd6Var.I = vs1VarA;
                boolean zN2 = im3.n(e45Var.Z, vs1VarA != null ? vs1VarA.v() : null);
                g76Var.m = !zN2;
                if (!zN || objArr5 != 0 || !zN2) {
                    e45Var.X = jd6Var.A;
                    e45Var.a0 = jd6Var.B;
                    vs1 vs1Var = jd6Var.I;
                    v56 v56Var3 = v56.e;
                    if (vs1Var == null || (v56VarV = vs1Var.v()) == null) {
                        v56VarV = v56Var3;
                    }
                    e45Var.Z = v56VarV;
                    vs1 vs1Var2 = jd6Var.I;
                    if (vs1Var2 != null && (v56VarV2 = vs1Var2.v()) != null) {
                        zk3 zk3VarT = vs1.T(v56VarV2);
                        v56Var3 = new v56(zk3VarT.a, zk3VarT.b, zk3VarT.c, zk3VarT.d);
                    }
                    e45Var.Y = v56Var3;
                    if (e45Var.b0 && (objArr5 != 0 || (e45Var.a0 && !zN))) {
                        e45Var.G.U();
                    }
                }
                e45Var.b0 = true;
                return f88Var;
            case 23:
                px2 px2Var = (px2) obj3;
                k17 k17Var = (k17) obj2;
                sa5 sa5Var = (sa5) obj;
                if (px2Var != null) {
                    k17Var.a(k17Var.c(px2Var) - k17Var.t);
                }
                List listH = ga0.h(k17Var, null, k17Var.t, null);
                xz0 xz0Var = (xz0) lv0.w0(listH);
                Integer num = xz0Var != null ? xz0Var.b : null;
                List listW = sa5Var.w(num);
                if (num != null && !listW.isEmpty()) {
                    listW = lv0.A0(qf0.K(new xz0(((xz0) lv0.m0(listW)).a, null, num)), lv0.j0(1, listW));
                }
                return new vz0(lv0.A0(listH, listW), sa5Var.I());
            case 24:
                ((tx5) obj3).V0();
                ((px4) obj2).setValue("");
                ((yf5) obj).A(3);
                return f88Var;
            case 25:
                ((px4) obj2).setValue(Boolean.FALSE);
                ((qk4) obj3).a(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", ((Context) obj).getPackageName(), null)), null);
                return f88Var;
            case 26:
                mo7 mo7Var = (mo7) obj3;
                Resources resources = (Resources) obj;
                j93 j93Var = new j93(((eu6) ((wc3) mo7Var)).g(), mo7Var);
                ec3 ec3Var = (ec3) ((g95) obj2).m;
                int i4 = ((a2) ec3Var).p.c;
                return new b26(j93Var, 4096 <= i4 && i4 < 8192, ((a2) ec3Var).p.c == 32768, resources);
            case 27:
                bt1.m((ql6) obj, new a26(obj3, obj2, (byte) 10));
                return f88Var;
            case 28:
                bn6 bn6Var = (bn6) obj3;
                bn6Var.E = null;
                bn6Var.i1((String) obj2);
                ((pl6) ((ql6) obj)).a.a();
                return f88Var;
            default:
                IStatisticsHandler iStatisticsHandler = ga7.a;
                ga7.a(ew6.OnAccountClicked);
                io1.w((Function1) obj2, (px4) obj, (String) ((g2) obj3).m);
                return f88Var;
        }
    }

    public /* synthetic */ n5(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.f1540o = obj;
        this.p = obj2;
        this.n = obj3;
    }

    public /* synthetic */ n5(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.m = b;
        this.f1540o = obj;
        this.p = obj2;
        this.n = obj3;
    }

    public /* synthetic */ n5(Context context, qk4 qk4Var, px4 px4Var, byte b) {
        this.m = b;
        this.n = context;
        this.f1540o = qk4Var;
        this.p = px4Var;
    }
}
