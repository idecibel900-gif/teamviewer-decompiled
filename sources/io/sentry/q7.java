package io.sentry;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Handler;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.teamviewer.activereviews.InAppReviewLauncher;
import com.teamviewer.commonviewmodel.swig.ErrorCodeResultCallback;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.inappreviews.swig.IInAppReviewStatisticsViewModel;
import com.teamviewer.inappreviews.swig.IInAppReviewStatisticsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.ComputerDetailsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IMonitoringOverviewViewModel;
import com.teamviewer.remotecontrollib.swig.partnerlistviewmodels.IMonitoringOverviewViewModelSWIGJNI;
import io.sentry.android.core.ActivityLifecycleIntegration;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import o.ar;
import o.at4;
import o.b10;
import o.bo7;
import o.ch7;
import o.d11;
import o.d31;
import o.do7;
import o.eb;
import o.f88;
import o.fp1;
import o.fq8;
import o.gj0;
import o.h31;
import o.h57;
import o.hr1;
import o.ht4;
import o.hy8;
import o.hz6;
import o.ic1;
import o.ij0;
import o.it4;
import o.iu;
import o.jh7;
import o.jr1;
import o.ke4;
import o.kr1;
import o.l00;
import o.l12;
import o.lh7;
import o.my0;
import o.mz4;
import o.ob6;
import o.od6;
import o.q00;
import o.ra3;
import o.rg6;
import o.rr5;
import o.sg6;
import o.ss5;
import o.t75;
import o.tb3;
import o.tg6;
import o.ti4;
import o.u00;
import o.vr8;
import o.y01;
import o.ye4;
import o.yi4;
import o.yq4;
import o.zi4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q7 implements o4, r4, io.sentry.android.core.j2, io.sentry.instrumentation.file.a, m4, ic1, ch7, t75, ij0, zi4, hz6, rg6, jh7 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f253o;

    public /* synthetic */ q7(l1 l1Var, g7 g7Var) {
        this.m = (byte) 11;
        this.n = l1Var;
        this.f253o = g7Var;
    }

    @Override // o.ch7
    public void a() {
        byte b = this.m;
        Object obj = this.n;
        Object obj2 = this.f253o;
        byte b2 = 0;
        switch (b) {
            case 17:
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) obj;
                ra3 ra3Var = ((hr1) obj2).s0;
                if (ra3Var != null) {
                    y01 y01Var = new y01((byte) 29);
                    h31 h31Var = new h31((byte) 20);
                    ComputerDetailsViewModel computerDetailsViewModel = ((kr1) ra3Var).n;
                    jr1 jr1Var = new jr1(b2, y01Var, h31Var);
                    ComputerDetailsViewModelSWIGJNI.ComputerDetailsViewModel_CheckDeviceAlerts(computerDetailsViewModel.a, computerDetailsViewModel, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) jr1Var), jr1Var);
                }
                swipeRefreshLayout.setRefreshing(false);
                break;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) obj;
                tb3 tb3Var = ((ht4) obj2).s0;
                if (tb3Var != null) {
                    ti4 ti4Var = new ti4((byte) 7);
                    byte b3 = 1;
                    at4 at4Var = new at4(b3);
                    IMonitoringOverviewViewModel iMonitoringOverviewViewModel = ((it4) tb3Var).n;
                    jr1 jr1Var2 = new jr1(b3, ti4Var, at4Var);
                    IMonitoringOverviewViewModelSWIGJNI.IMonitoringOverviewViewModel_CheckNow(iMonitoringOverviewViewModel.a, iMonitoringOverviewViewModel, ErrorCodeResultCallback.getCPtr((ErrorCodeResultCallback) jr1Var2), jr1Var2);
                }
                swipeRefreshLayout2.setRefreshing(false);
                break;
        }
    }

    @Override // o.rg6
    public Object apply(Object obj) {
        tg6 tg6Var = (tg6) this.f253o;
        u00 u00Var = (u00) this.n;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        l00 l00Var = tg6Var.p;
        ArrayList arrayListU = tg6Var.u(sQLiteDatabase, u00Var, l00Var.b);
        for (ss5 ss5Var : ss5.values()) {
            if (ss5Var != u00Var.c) {
                int size = l00Var.b - arrayListU.size();
                if (size <= 0) {
                    break;
                }
                iu iuVarA = u00.a();
                iuVarA.O(u00Var.a);
                if (ss5Var == null) {
                    yq4.l("Null priority");
                    return null;
                }
                iuVarA.n = ss5Var;
                iuVarA.p = u00Var.b;
                arrayListU.addAll(tg6Var.u(sQLiteDatabase, iuVarA.f(), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListU.size(); i++) {
            sb.append(((q00) arrayListU.get(i)).a);
            if (i < arrayListU.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new sg6(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListU.listIterator();
        while (listIterator.hasNext()) {
            q00 q00Var = (q00) listIterator.next();
            long j2 = q00Var.a;
            if (map.containsKey(Long.valueOf(j2))) {
                d11 d11VarC = q00Var.c.c();
                for (sg6 sg6Var : (Set) map.get(Long.valueOf(j2))) {
                    d11VarC.d(sg6Var.a, sg6Var.b);
                }
                listIterator.set(new q00(j2, q00Var.b, d11VarC.k()));
            }
        }
        return arrayListU;
    }

    @Override // io.sentry.m4
    public void b(h4 h4Var) {
        l1 l1Var = (l1) this.n;
        g7 g7Var = (g7) this.f253o;
        d dVar = (d) h4Var.e;
        if (dVar.f) {
            h4 h4VarV = l1Var.v();
            io.sentry.protocol.w wVarJ = l1Var.j();
            dVar.d("sentry-trace_id", ((io.sentry.protocol.w) h4VarV.b).a());
            dVar.d("sentry-public_key", g7Var.retrieveParsedDsn().b);
            dVar.d("sentry-release", g7Var.getRelease());
            dVar.d("sentry-environment", g7Var.getEnvironment());
            if (!io.sentry.protocol.w.n.equals(wVarJ)) {
                dVar.d("sentry-replay_id", wVarJ.a());
            }
            dVar.d("sentry-org_id", g7Var.getEffectiveOrgId());
            dVar.d("sentry-transaction", null);
            if (dVar.f) {
                dVar.c = null;
            }
            dVar.d("sentry-sampled", null);
            dVar.f = false;
        }
    }

    @Override // io.sentry.android.core.j2
    public void c() {
        Activity activity;
        io.sentry.android.core.r2 r2Var = (io.sentry.android.core.r2) this.f253o;
        WeakReference weakReference = (WeakReference) this.n;
        if (d5.c().l().getFeedbackOptions().i.u() || (activity = (Activity) weakReference.get()) == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        activity.runOnUiThread(new u4((Object) r2Var, (Object) activity, (byte) 7));
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() throws IOException {
        byte b = this.m;
        Object obj = this.n;
        Object obj2 = this.f253o;
        switch (b) {
            case 7:
                return Integer.valueOf(((io.sentry.instrumentation.file.f) obj2).m.read((byte[]) obj));
            case 8:
                int i = ((io.sentry.instrumentation.file.f) obj2).m.read();
                ((AtomicInteger) obj).set(i);
                return Integer.valueOf(i != -1 ? 1 : 0);
            default:
                byte[] bArr = (byte[]) obj;
                ((io.sentry.instrumentation.file.h) obj2).m.write(bArr);
                return Integer.valueOf(bArr.length);
        }
    }

    @Override // o.hz6
    public boolean d() {
        rr5 rr5Var = (rr5) this.f253o;
        b10 b10Var = (b10) this.n;
        boolean z = rr5Var.C;
        if (z) {
            return z;
        }
        rr5Var.g();
        long jA = b10.a(rr5Var.A, b10Var.a);
        b10Var.a = jA;
        boolean z2 = !rr5Var.f(rr5Var.z, jA + b10Var.b);
        rr5Var.C = z2;
        return z2;
    }

    @Override // io.sentry.o4
    public void e(x1 x1Var) {
        byte b = this.m;
        Object obj = this.n;
        Object obj2 = this.f253o;
        switch (b) {
            case 0:
                l1 l1Var = (l1) obj;
                if (x1Var == ((s7) obj2)) {
                    l1Var.q();
                }
                break;
            case 1:
                l1 l1Var2 = (l1) obj;
                if (x1Var == ((x1) obj2)) {
                    l1Var2.q();
                }
                break;
            default:
                l1 l1Var3 = (l1) obj;
                if (x1Var == ((io.sentry.android.core.internal.gestures.g) obj2).e) {
                    l1Var3.q();
                }
                break;
        }
    }

    @Override // o.jh7
    public Object f() {
        byte b = this.m;
        Object obj = this.n;
        fp1 fp1Var = (fp1) this.f253o;
        switch (b) {
            case 27:
                Iterable iterable = (Iterable) obj;
                tg6 tg6Var = (tg6) fp1Var.c;
                tg6Var.getClass();
                if (iterable.iterator().hasNext()) {
                    tg6Var.e().compileStatement("DELETE FROM events WHERE _id in ".concat(tg6.G(iterable))).execute();
                }
                break;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((tg6) fp1Var.i).z(((Integer) entry.getValue()).intValue(), ke4.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // o.zi4
    public void g() {
        byte b = this.m;
        Object obj = this.n;
        Object obj2 = this.f253o;
        switch (b) {
            case 21:
                ar arVar = (ar) obj;
                SharedPreferences sharedPreferences = ((yi4) obj2).f2610o;
                int i = sharedPreferences.getInt("MAX_ZOOM_TRIALS_COUNT", 0);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.getClass();
                editorEdit.putInt("MAX_ZOOM_TRIALS_COUNT", i + 1);
                editorEdit.commit();
                if (i < 1) {
                    arVar.g();
                    break;
                }
                break;
            default:
                ar arVar2 = (ar) obj;
                SharedPreferences sharedPreferences2 = ((mz4) obj2).w;
                int i2 = sharedPreferences2.getInt("MAX_ZOOM_TRIALS_COUNT", 0);
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.getClass();
                editorEdit2.putInt("MAX_ZOOM_TRIALS_COUNT", i2 + 1);
                editorEdit2.commit();
                if (i2 < 1) {
                    arVar2.g();
                    break;
                }
                break;
        }
    }

    @Override // o.ij0
    public Object h(gj0 gj0Var) {
        byte b = this.m;
        l12 l12Var = l12.m;
        Object obj = this.n;
        final byte b2 = 0;
        Executor executor = (Executor) this.f253o;
        switch (b) {
            case 20:
                eb ebVar = (eb) obj;
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                Runnable runnable = new Runnable() { // from class: o.jc4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        switch (b3) {
                            case 0:
                                atomicBoolean2.set(true);
                                break;
                            default:
                                atomicBoolean2.set(true);
                                break;
                        }
                    }
                };
                ob6 ob6Var = gj0Var.c;
                if (ob6Var != null) {
                    ob6Var.addListener(runnable, l12Var);
                }
                executor.execute(new io.sentry.android.core.internal.util.j((Object) atomicBoolean, (Object) gj0Var, (Object) ebVar, (byte) 11));
                return "setForegroundAsync";
            default:
                Function0 function0 = (Function0) obj;
                final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                final byte b3 = 1;
                Runnable runnable2 = new Runnable() { // from class: o.jc4
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        AtomicBoolean atomicBoolean3 = atomicBoolean2;
                        switch (b4) {
                            case 0:
                                atomicBoolean3.set(true);
                                break;
                            default:
                                atomicBoolean3.set(true);
                                break;
                        }
                    }
                };
                ob6 ob6Var2 = gj0Var.c;
                if (ob6Var2 != null) {
                    ob6Var2.addListener(runnable2, l12Var);
                }
                executor.execute(new io.sentry.android.core.internal.util.j((Object) atomicBoolean2, (Object) gj0Var, (Object) function0, (byte) 18));
                return f88.a;
        }
    }

    @Override // io.sentry.r4
    public void i(l1 l1Var) {
        byte b = this.m;
        Object obj = this.n;
        Object obj2 = this.f253o;
        switch (b) {
            case 2:
                l1Var.H(new io.sentry.android.core.e((ActivityLifecycleIntegration) obj2, l1Var, (x1) obj));
                break;
            case 5:
                l1Var.H(new i5((io.sentry.android.core.internal.gestures.g) obj2, l1Var, (x1) obj, (byte) 2));
                break;
            default:
                ((m7) obj2).n = l1Var.F(new q7(l1Var, (g7) obj));
                break;
        }
    }

    @Override // o.ic1
    public Object j(bo7 bo7Var) {
        byte b = this.m;
        Object obj = this.n;
        Object obj2 = this.f253o;
        switch (b) {
            case 13:
                return ((ConfigFetchHandler) obj2).lambda$fetchNowWithTypeAndAttemptNumber$1((HashMap) obj, bo7Var);
            case 14:
                return ((ConfigFetchHandler) obj2).lambda$fetchIfCacheExpiredAndNotThrottled$3((Date) obj, bo7Var);
            default:
                return ((ConfigRealtimeHttpClient) obj2).lambda$beginRealtimeHttpStream$1((bo7) obj, bo7Var);
        }
    }

    public InputStream k() {
        d31 d31Var = (d31) this.f253o;
        Uri uri = (Uri) this.n;
        try {
            return d31Var.a.getContentResolver().openInputStream(uri);
        } catch (FileNotFoundException unused) {
            ye4.c("ConnectInterfaceUIModel", "could not open control file: " + uri);
            return null;
        } catch (SecurityException unused2) {
            ye4.c("ConnectInterfaceUIModel", "could not open control file: " + uri);
            return null;
        }
    }

    @Override // o.t75
    public void m(bo7 bo7Var) {
        hy8 hy8VarJ;
        byte b = this.m;
        Object obj = this.n;
        Object obj2 = this.f253o;
        switch (b) {
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                ((EnhancedIntentService) obj2).lambda$onStartCommand$1((Intent) obj, bo7Var);
                break;
            default:
                InAppReviewLauncher inAppReviewLauncher = (InAppReviewLauncher) obj2;
                lh7 lh7Var = (lh7) obj;
                if (!bo7Var.k()) {
                    ye4.a("InAppReviewLauncher", "in-app review flow request failed");
                } else {
                    od6 od6Var = (od6) bo7Var.i();
                    my0 my0Var = inAppReviewLauncher.a.b;
                    if (od6Var == null || my0Var == null) {
                        ye4.a("InAppReviewLauncher", "in-app reviewInfo object or activity is null");
                    } else {
                        IInAppReviewStatisticsViewModel iInAppReviewStatisticsViewModel = inAppReviewLauncher.d;
                        IInAppReviewStatisticsViewModelSWIGJNI.IInAppReviewStatisticsViewModel_ReportActionEvent(iInAppReviewStatisticsViewModel.a, iInAppReviewStatisticsViewModel, "active-rating-dialog");
                        fq8 fq8Var = (fq8) od6Var;
                        if (fq8Var.n) {
                            hy8VarJ = h57.j(null);
                        } else {
                            Intent intent = new Intent(my0Var, (Class<?>) PlayCoreDialogWrapperActivity.class);
                            intent.putExtra("confirmation_intent", fq8Var.m);
                            intent.putExtra("window_flags", my0Var.getWindow().getDecorView().getWindowSystemUiVisibility());
                            do7 do7Var = new do7();
                            intent.putExtra("result_receiver", new vr8((Handler) lh7Var.f1364o, do7Var));
                            my0Var.startActivity(intent);
                            hy8VarJ = do7Var.a;
                        }
                        hy8VarJ.c(new ar(inAppReviewLauncher, (byte) 12));
                    }
                }
                break;
        }
    }

    public /* synthetic */ q7(Object obj, Object obj2, byte b) {
        this.m = b;
        this.f253o = obj;
        this.n = obj2;
    }
}
