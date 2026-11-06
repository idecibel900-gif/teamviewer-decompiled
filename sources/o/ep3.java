package o;

import android.app.Activity;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import androidx.lifecycle.LiveData;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.teamviewer.activereviews.InAppReviewLauncher;
import com.teamviewer.avatarlib.view.RoundAvatarImageView;
import com.teamviewer.chatviewmodel.swig.ChatConversationID;
import com.teamviewer.chatviewmodel.swig.ChatConversationIDSerializer;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.swig.LicenseViewModel;
import com.teamviewer.remotecontrolviewlib.activity.WebViewActivity;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.settings.Settings;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.Adler32;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public class ep3 implements p45, je3, mh6, ex5, vc1 {
    public static ep3 q;
    public final /* synthetic */ byte m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f733o;
    public Object p;

    public ep3(Class cls, byte b) {
        this.m = b;
        switch (b) {
            case ep1.d /* 12 */:
                this.n = new ConcurrentHashMap();
                this.p = cls;
                break;
            default:
                UUID uuidRandomUUID = UUID.randomUUID();
                uuidRandomUUID.getClass();
                this.n = uuidRandomUUID;
                String string = ((UUID) this.n).toString();
                string.getClass();
                this.f733o = new xm8(string, (lm8) null, cls.getName(), (String) null, (pg1) null, (pg1) null, 0L, 0L, 0L, (q61) null, 0, (g20) null, 0L, 0L, 0L, 0L, false, (jb5) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
                String[] strArr = {cls.getName()};
                LinkedHashSet linkedHashSet = new LinkedHashSet(xm4.Q(1));
                cx.d1(strArr, linkedHashSet);
                this.p = linkedHashSet;
                break;
        }
    }

    public static ep3 A(x35 x35Var, lq1 lq1Var) {
        i32 i32VarE = x35Var.E();
        h32 h32Var = i32VarE != null ? i32VarE.v : new i32("http://www.w3.org/1999/xhtml", "").v;
        h32Var.getClass();
        byte b = 13;
        if (!h32Var.f945o) {
            return new ep3(x35Var, lq1Var, h32Var, b);
        }
        rs5 rs5Var = new rs5(x35Var, lq1Var, h32Var, b);
        rs5Var.r = false;
        while (x35Var != null) {
            if ((x35Var instanceof o82) && ((o82) x35Var).p.c(64)) {
                rs5Var.r = true;
                return rs5Var;
            }
            x35Var = x35Var.m;
        }
        return rs5Var;
    }

    public static uo0 h(ChatConversationID chatConversationID) {
        chatConversationID.getClass();
        uo0 uo0Var = new uo0();
        Bundle bundle = new Bundle(1);
        bundle.putString("CHAT_CONVERSATION_ID", ChatConversationIDSerializer.Serialize(chatConversationID));
        uo0Var.u0(bundle);
        return uo0Var;
    }

    public static hr1 k(long j, dd ddVar) {
        int i;
        ddVar.getClass();
        hr1 hr1Var = new hr1();
        Bundle bundle = new Bundle();
        bundle.putLong("BuddyId", j);
        int iOrdinal = ddVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                i = 2;
                if (iOrdinal != 2) {
                    gk0.s();
                    return null;
                }
            }
        } else {
            i = 0;
        }
        bundle.putInt("SelectedTab", i);
        hr1Var.u0(bundle);
        return hr1Var;
    }

    public static p33 o(long j, t33 t33Var) {
        t33Var.getClass();
        p33 p33Var = new p33();
        Bundle bundle = new Bundle();
        bundle.putSerializable("memberType", t33Var);
        bundle.putLong("memberId", j);
        p33Var.u0(bundle);
        return p33Var;
    }

    public static Intent q(Context context, String str) {
        context.getClass();
        int i = WebViewActivity.O;
        Intent intentPutExtra = new Intent(context, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("title", "").putExtra("finish_url", "").putExtra("sso", false);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    public static ep3 x(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new ep3(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public void B() {
        ((TypedArray) this.f733o).recycle();
    }

    public void C(hq4 hq4Var) {
        ((CopyOnWriteArrayList) this.f733o).remove(hq4Var);
        mp4 mp4Var = (mp4) ((HashMap) this.p).remove(hq4Var);
        if (mp4Var != null) {
            mp4Var.a.f(mp4Var.b);
            mp4Var.b = null;
        }
        ((Runnable) this.n).run();
    }

    public void D(u00 u00Var, int i, boolean z) {
        s00 s00Var = (s00) this.p;
        Context context = (Context) this.n;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = u00Var.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        ss5 ss5Var = u00Var.c;
        adler32.update(byteBufferAllocate.putInt(us5.a(ss5Var)).array());
        byte[] bArr = u00Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    ep1.o("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", u00Var);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((tg6) this.f733o).e().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(us5.a(ss5Var))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(s00Var.a(ss5Var, jLongValue, i));
            Set set = ((t00) s00Var.b.get(ss5Var)).c;
            if (set.contains(yi6.m)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(yi6.f2611o)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(yi6.n)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", us5.a(ss5Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {u00Var, Integer.valueOf(value), Long.valueOf(s00Var.a(ss5Var, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.JobInfoScheduler", 3)) {
                Log.d("TRuntime.JobInfoScheduler", String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public void E(Object obj) {
        long jF = o67.f();
        if (jF == ku7.a) {
            this.p = obj;
            return;
        }
        synchronized (this.f733o) {
            fu7 fu7Var = (fu7) ((AtomicReference) this.n).get();
            int iA = fu7Var.a(jF);
            if (iA < 0) {
                ((AtomicReference) this.n).set(fu7Var.b(jF, obj));
            } else {
                fu7Var.c[iA] = obj;
            }
        }
    }

    public void F() {
        synchronized (this.p) {
            try {
                io.sentry.u uVar = (io.sentry.u) this.f733o;
                if (uVar != null) {
                    uVar.cancel();
                }
                this.f733o = null;
                p53.a.purge();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void G() {
        jx4 jx4Var = (jx4) this.n;
        String str = (String) this.f733o;
        List list = (List) jx4Var.k(str);
        if (list != null) {
            list.remove((Function0) this.p);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        jx4Var.m(str, list);
    }

    @Override // o.je3
    public void a() {
        RoundAvatarImageView roundAvatarImageView = (RoundAvatarImageView) this.n;
        roundAvatarImageView.s.remove((yi5) this.f733o);
    }

    public void b(o82 o82Var, int i) {
        o82Var.D((lq1) this.f733o, (h32) this.p);
    }

    public void c(q54 q54Var, int i) {
        q54Var.D((lq1) this.f733o, (h32) this.p);
    }

    public void d(o82 o82Var, int i) {
        o82Var.f0((lq1) this.f733o, (h32) this.p);
    }

    @Override // o.p45
    public void e(x35 x35Var, int i) {
        if (x35Var instanceof o82) {
            d((o82) x35Var, i);
        }
    }

    public void f(et7 et7Var, int i, int i2) {
        dc2.c((lq1) this.f733o, et7Var.Q(), (h32) this.p, i | 1);
    }

    public e95 g() {
        UUID uuid = (UUID) this.n;
        xm8 xm8Var = (xm8) this.f733o;
        e95 e95Var = new e95(uuid, xm8Var, (LinkedHashSet) this.p);
        q61 q61Var = xm8Var.j;
        boolean z = !q61Var.i.isEmpty() || q61Var.e || q61Var.c || q61Var.d;
        xm8 xm8Var2 = (xm8) this.f733o;
        if (xm8Var2.q) {
            if (z) {
                hk0.g("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (xm8Var2.g > 0) {
                hk0.g("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = xm8Var2.x;
        if (str == null) {
            List listN0 = ub7.n0(xm8Var2.c, new String[]{"."}, 6);
            String strV0 = listN0.size() == 1 ? (String) listN0.get(0) : (String) lv0.v0(listN0);
            if (strV0.length() > 127) {
                strV0 = ub7.v0(127, strV0);
            }
            xm8Var2.x = strV0;
        } else if (str.length() > 127) {
            ((xm8) this.f733o).x = ub7.v0(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.n = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        xm8 xm8Var3 = (xm8) this.f733o;
        this.f733o = new xm8(string, xm8Var3.b, xm8Var3.c, xm8Var3.d, new pg1(xm8Var3.e), new pg1(xm8Var3.f), xm8Var3.g, xm8Var3.h, xm8Var3.i, new q61(xm8Var3.j), xm8Var3.k, xm8Var3.l, xm8Var3.m, xm8Var3.n, xm8Var3.f2535o, xm8Var3.p, xm8Var3.q, xm8Var3.r, xm8Var3.s, xm8Var3.u, xm8Var3.v, xm8Var3.w, xm8Var3.x, xm8Var3.y, 524288);
        return e95Var;
    }

    @Override // o.ex5
    public Object get() {
        switch (this.m) {
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                return new ep3((Context) ((ex5) this.n).get(), (tg6) ((ex5) this.f733o).get(), (s00) ((wj5) this.p).get(), (byte) 0);
            case 24:
                long jF = o67.f();
                if (jF == ku7.a) {
                    return this.p;
                }
                fu7 fu7Var = (fu7) ((AtomicReference) this.n).get();
                int iA = fu7Var.a(jF);
                if (iA >= 0) {
                    return fu7Var.c[iA];
                }
                return null;
            default:
                return new j28(new rk5((byte) 17), new wj5((byte) 16), (uk1) ((yc4) this.n).get(), (fp1) ((io.sentry.android.core.d) this.f733o).get(), (pn5) ((pn5) this.p).get());
        }
    }

    public ColorStateList i(int i) {
        int resourceId;
        ColorStateList colorStateListM;
        TypedArray typedArray = (TypedArray) this.f733o;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM = hm3.m((Context) this.n, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM;
    }

    @Override // o.p45
    public void j(x35 x35Var, int i) {
        if (x35Var.getClass() == et7.class) {
            f((et7) x35Var, 0, i);
        } else if (x35Var instanceof o82) {
            b((o82) x35Var, i);
        } else {
            c((q54) x35Var, i);
        }
    }

    public Drawable l(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f733o;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : uf0.p((Context) this.n, resourceId);
    }

    public Drawable m(int i) {
        int resourceId;
        Drawable drawableE;
        if (!((TypedArray) this.f733o).hasValue(i) || (resourceId = ((TypedArray) this.f733o).getResourceId(i, 0)) == 0) {
            return null;
        }
        us usVarA = us.a();
        Context context = (Context) this.n;
        synchronized (usVarA) {
            drawableE = usVarA.a.e(context, resourceId, true);
        }
        return drawableE;
    }

    public Typeface n(int i, int i2, pt ptVar) {
        int resourceId = ((TypedArray) this.f733o).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = (TypedValue) this.p;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.p = typedValue;
        }
        TypedValue typedValue2 = typedValue;
        Context context = (Context) this.n;
        ThreadLocal threadLocal = ic6.a;
        if (context.isRestricted()) {
            return null;
        }
        return ic6.b(context, resourceId, typedValue2, i2, ptVar, true, false);
    }

    @Override // o.je3
    public void onSuccess() {
        ((RoundAvatarImageView) this.p).e((yi5) this.f733o);
    }

    public l07 p() {
        return new l07((ja3) this.n, (xt6) this.f733o, (RemoteControlApplication) this.p);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v12 java.lang.Object, still in use, count: 2, list:
          (r2v12 java.lang.Object) from 0x009b: PHI (r2 I:??) = (r2v9 java.lang.Object), (r2v12 java.lang.Object) binds: [B:32:0x009a, B:258:0x009b] A[DONT_GENERATE, DONT_INLINE]
          (r2v12 java.lang.Object) from 0x0093: CHECK_CAST (o.vv4) (r2v12 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public void r(o.ak7 r12) {
        /*
            Method dump skipped, instruction units count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep3.r(o.ak7):void");
    }

    public void s(int i) {
        String strValueOf;
        lq1 lq1VarJ = ((lq1) this.f733o).j('\n');
        String[] strArr = lb7.a;
        db8.e0("width must be >= 0", i >= 0);
        int iMin = Math.min(i, 30);
        String[] strArr2 = lb7.a;
        if (iMin < 21) {
            strValueOf = strArr2[iMin];
        } else {
            char[] cArr = new char[iMin];
            for (int i2 = 0; i2 < iMin; i2++) {
                cArr[i2] = ' ';
            }
            strValueOf = String.valueOf(cArr);
        }
        lq1VarJ.k(strValueOf);
    }

    public nw4 t() {
        nw4 nw4Var = ((fa6) ((fp1) this.n).i).d;
        yd2 yd2Var = (yd2) this.p;
        t12[] t12VarArr = {t12.NotBlocked};
        byte b = 0;
        nm nmVar = new nm(2);
        nmVar.g(yd2Var);
        nmVar.i(new LiveData[0]);
        ArrayList arrayList = nmVar.a;
        LiveData[] liveDataArr = (LiveData[]) arrayList.toArray(new LiveData[arrayList.size()]);
        lo4 lo4Var = new lo4();
        g16 g16Var = new g16(lo4Var, liveDataArr, t12VarArr, (byte) 1);
        g16Var.a();
        for (LiveData liveData : liveDataArr) {
            lo4Var.b(liveData, new b7(new h16(g16Var, b), (byte) 24));
        }
        return qf0.o(nw4Var, lo4Var);
    }

    public boolean u() {
        fp1 fp1Var = (fp1) this.n;
        if (((s7) fp1Var.b).a()) {
            return true;
        }
        return ((fa6) fp1Var.i).f781o && ((ha6) fp1Var.h).s == n72.Touch;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lo4 v() {
        yd2 yd2Var = (yd2) this.p;
        t12[] t12VarArr = {t12.BlackScreen};
        nm nmVar = new nm(2);
        nmVar.g(yd2Var);
        nmVar.i(new LiveData[0]);
        ArrayList arrayList = nmVar.a;
        LiveData[] liveDataArr = (LiveData[]) arrayList.toArray(new LiveData[arrayList.size()]);
        lo4 lo4Var = new lo4();
        g16 g16Var = new g16(lo4Var, liveDataArr, t12VarArr, 0 == true ? 1 : 0);
        g16Var.a();
        for (LiveData liveData : liveDataArr) {
            lo4Var.b(liveData, new b7(new t(g16Var, (byte) 29), (byte) 24));
        }
        return lo4Var;
    }

    @Override // o.vc1
    public Object w(Object obj) {
        g95 g95Var = (g95) this.p;
        jo4 jo4Var = (jo4) this.n;
        String strB = ((rp3) g95Var.m).b((nw3) this.f733o, obj);
        int i = db6.a;
        vd5 vd5VarS = ct1.s(jo4Var);
        Charset charset = (Charset) vd5VarS.m;
        jo4 jo4Var2 = (jo4) vd5VarS.n;
        byte[] bytes = strB.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        po8.a(bytes.length, 0L, length);
        return new cb6(jo4Var2, length, bytes);
    }

    public void y(Activity activity, bl8 bl8Var) {
        WeakHashMap weakHashMap = (WeakHashMap) this.p;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.f733o;
        reentrantLock.lock();
        try {
            if (bl8Var.equals((bl8) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((vz6) ((g95) this.n).m).b.iterator();
            it.getClass();
            while (it.hasNext()) {
                uz6 uz6Var = (uz6) it.next();
                if (uz6Var.a.equals(activity)) {
                    uz6Var.c = bl8Var;
                    uz6Var.b.accept(bl8Var);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void z(l84 l84Var) {
        uq6 uq6Var = (uq6) this.p;
        if (uq6Var != null) {
            uq6Var.run();
        }
        uq6 uq6Var2 = new uq6((x84) this.n, l84Var);
        this.p = uq6Var2;
        ((Handler) this.f733o).postAtFrontOfQueue(uq6Var2);
    }

    public ep3(nx3 nx3Var, tk2 tk2Var, pn5 pn5Var, InAppReviewLauncher inAppReviewLauncher, yt2 yt2Var, z60 z60Var, LicenseViewModel licenseViewModel, f84 f84Var) {
        this.m = (byte) 14;
        z60Var.getClass();
        this.n = tk2Var;
        this.f733o = licenseViewModel;
        this.p = f84Var;
    }

    public ep3(io.sentry.u uVar) {
        this.m = (byte) 25;
        this.n = uVar;
        this.p = new Object();
    }

    public ep3(EventHub eventHub, byte b) {
        this.m = b;
        eventHub.getClass();
        switch (b) {
            case 26:
                this.n = eventHub;
                this.p = new mu(this, (byte) 14);
                break;
            default:
                this.n = eventHub;
                this.p = new mu(this, (byte) 12);
                break;
        }
    }

    public ep3(List list) {
        this.m = (byte) 3;
        this.p = list;
        this.n = new ArrayList(list.size());
        this.f733o = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.n).add(new bx6(((zm4) list.get(i)).b.b));
            ((ArrayList) this.f733o).add(((zm4) list.get(i)).c.d());
        }
    }

    public ep3(Context context, ec3 ec3Var, EventHub eventHub, SharedPreferences sharedPreferences, Settings settings) {
        this.m = (byte) 5;
        context.getClass();
        ec3Var.getClass();
        eventHub.getClass();
        sharedPreferences.getClass();
        settings.getClass();
        this.n = new LinkedBlockingQueue();
        xv4 xv4Var = new xv4(this);
        this.p = xv4Var;
        ye4.a("MultimediaManager", "create");
        xv4Var.start();
        wy wyVar = new wy(context, ec3Var, eventHub, sharedPreferences, settings);
        this.f733o = wyVar;
        wyVar.c();
    }

    public ep3(tp1 tp1Var, f71 f71Var) {
        this.m = (byte) 9;
        this.n = tp1Var;
        this.f733o = f71Var;
        this.p = new ConcurrentHashMap();
    }

    public ep3(k56 k56Var) {
        this.m = (byte) 7;
        this.n = new yx(0);
        this.f733o = new yc4((byte) 4);
        this.p = new ql1(this, k56Var, (byte) 21);
    }

    public ep3(SystemForegroundService systemForegroundService) {
        this.m = (byte) 21;
        this.n = new x84(systemForegroundService, true);
        this.f733o = new Handler(Looper.getMainLooper());
    }

    public ep3(fp1 fp1Var, j93 j93Var) {
        this.m = (byte) 15;
        j93Var.getClass();
        this.n = fp1Var;
        this.f733o = j93Var;
        this.p = new yd2((EventHub) fp1Var.c, EventType.EVENT_INPUT_DISABLED, im3.n, new vm3((Object) this, (byte) 27));
    }

    public /* synthetic */ ep3(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.n = obj;
        this.f733o = obj2;
        this.p = obj3;
    }

    public ep3(zs0 zs0Var, List list, ep3 ep3Var) {
        this.m = (byte) 10;
        zs0Var.getClass();
        list.getClass();
        this.n = zs0Var;
        this.f733o = list;
        this.p = ep3Var;
    }

    public ep3(Context context, TypedArray typedArray) {
        this.m = (byte) 27;
        this.n = context;
        this.f733o = typedArray;
    }

    public ep3(Runnable runnable) {
        this.m = (byte) 4;
        this.f733o = new CopyOnWriteArrayList();
        this.p = new HashMap();
        this.n = runnable;
    }

    public ep3(Context context, LocationManager locationManager) {
        this.m = (byte) 29;
        this.p = new ik();
        this.n = context;
        this.f733o = locationManager;
    }

    public ep3(l41 l41Var, xt6 xt6Var, RemoteControlApplication remoteControlApplication) {
        this.m = (byte) 16;
        l41Var.getClass();
        this.n = l41Var;
        this.f733o = xt6Var;
        this.p = remoteControlApplication;
    }

    public ep3(byte b) {
        this.m = b;
        switch (b) {
            case 11:
                long[] jArr = ti6.a;
                this.n = new jx4();
                break;
            case 24:
                this.n = new AtomicReference(di1.v);
                this.f733o = new Object();
                break;
            default:
                String string = UUID.randomUUID().toString();
                string.getClass();
                ai0 ai0Var = ai0.p;
                this.n = ju.s(string);
                this.f733o = bw4.f;
                this.p = new ArrayList();
                break;
        }
    }

    public ep3(g95 g95Var) {
        this.m = (byte) 23;
        this.n = g95Var;
        this.f733o = new ReentrantLock();
        this.p = new WeakHashMap();
    }
}
