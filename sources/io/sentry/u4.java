package io.sentry;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.LongSparseArray;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.messaging.FirebaseMessaging;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrollib.gui.ClientViewOpenGL;
import com.teamviewer.remotecontrolviewlib.activity.FileTransferActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.FeedbackShakeIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.anr.AnrProfilingIntegration;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.ndk.NativeScope;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import o.ax0;
import o.bb5;
import o.bu7;
import o.da3;
import o.db8;
import o.do7;
import o.dy0;
import o.ep1;
import o.g30;
import o.gl0;
import o.gs;
import o.gt5;
import o.h30;
import o.hm3;
import o.ik2;
import o.l61;
import o.l70;
import o.my0;
import o.nh;
import o.nm8;
import o.o75;
import o.oq0;
import o.ph;
import o.pk2;
import o.q43;
import o.r67;
import o.r97;
import o.sl0;
import o.su2;
import o.t83;
import o.tl0;
import o.to7;
import o.u83;
import o.uc6;
import o.v83;
import o.vc6;
import o.w10;
import o.w61;
import o.wk7;
import o.x20;
import o.x61;
import o.xt2;
import o.ye4;
import o.z08;
import o.zg2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u4 implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f267o;

    public /* synthetic */ u4(ActivityLifecycleIntegration activityLifecycleIntegration, v1 v1Var, v1 v1Var2) {
        this.m = (byte) 2;
        this.n = v1Var;
        this.f267o = v1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // java.lang.Runnable
    public final void run() {
        io.sentry.android.core.r2 r2Var = null;
        strD = null;
        absolutePath = null;
        String absolutePath = null;
        String strD = null;
        boolean z = false;
        Object[] objArr = 0;
        int i = 0;
        switch (this.m) {
            case 0:
                ((r1) this.f267o).a(((v4) this.n).l().getShutdownTimeoutMillis());
                return;
            case 1:
                ShutdownHookIntegration shutdownHookIntegration = (ShutdownHookIntegration) this.n;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f267o;
                shutdownHookIntegration.m.addShutdownHook(shutdownHookIntegration.n);
                sentryAndroidOptions.getLogger().g(f6.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
                io.sentry.util.b.a("ShutdownHook");
                return;
            case 2:
                ActivityLifecycleIntegration.j((v1) this.n, (v1) this.f267o);
                return;
            case 3:
                AnrIntegration anrIntegration = (AnrIntegration) this.n;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.f267o;
                io.sentry.android.core.a aVar = AnrIntegration.q;
                io.sentry.util.a aVar2 = anrIntegration.f87o;
                aVar2.e();
                try {
                    if (!anrIntegration.n) {
                        anrIntegration.e(sentryAndroidOptions2);
                        break;
                    }
                    aVar2.close();
                    return;
                } catch (Throwable th) {
                    try {
                        aVar2.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 4:
                ((io.sentry.android.core.k0) this.n).j((g1) this.f267o);
                return;
            case 5:
                FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.n;
                SentryAndroidOptions sentryAndroidOptions3 = (SentryAndroidOptions) this.f267o;
                io.sentry.android.core.m2 m2Var = feedbackShakeIntegration.n;
                Application application = feedbackShakeIntegration.m;
                g1 logger = sentryAndroidOptions3.getLogger();
                synchronized (m2Var) {
                    m2Var.f = logger;
                    m2Var.b(application);
                }
                return;
            case 6:
                FeedbackShakeIntegration feedbackShakeIntegration2 = (FeedbackShakeIntegration) this.n;
                Activity activity = (Activity) this.f267o;
                if (!feedbackShakeIntegration2.p || feedbackShakeIntegration2.e(activity) || activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                try {
                    io.sentry.android.core.r2 r2Var2 = new io.sentry.android.core.r2(activity);
                    try {
                        r2Var2.show();
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        r2Var = r2Var2;
                        if (r2Var != null) {
                            feedbackShakeIntegration2.j(r2Var);
                        }
                        feedbackShakeIntegration2.f91o.getLogger().d(f6.ERROR, "Failed to show feedback dialog on shake.", th);
                        return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            case 7:
                io.sentry.android.core.r2 r2Var3 = (io.sentry.android.core.r2) this.n;
                Activity activity2 = (Activity) this.f267o;
                if (activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                r2Var3.show();
                return;
            case 8:
                AnrProfilingIntegration anrProfilingIntegration = (AnrProfilingIntegration) this.n;
                io.sentry.android.core.anr.d dVar = (io.sentry.android.core.anr.d) this.f267o;
                if (dVar == null) {
                    return;
                }
                try {
                    dVar.close();
                    return;
                } catch (IOException unused) {
                    anrProfilingIntegration.u.g(f6.WARNING, "Failed to close AnrProfileManager", new Object[0]);
                    return;
                }
            case ep1.b /* 9 */:
                io.sentry.android.core.internal.util.t tVar = (io.sentry.android.core.internal.util.t) this.n;
                g1 g1Var = (g1) this.f267o;
                try {
                    tVar.w = Choreographer.getInstance();
                } catch (Throwable th5) {
                    g1Var.d(f6.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th5);
                }
                try {
                    tVar.x = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                    tVar.x.setAccessible(true);
                    return;
                } catch (NoSuchFieldException e) {
                    g1Var.d(f6.ERROR, "Unable to get the frame timestamp from the choreographer: ", e);
                    return;
                }
            case ep1.c /* 10 */:
                io.sentry.android.ndk.b bVar = (io.sentry.android.ndk.b) this.n;
                h hVar = (h) this.f267o;
                SentryAndroidOptions sentryAndroidOptions4 = bVar.a;
                f6 f6Var = hVar.u;
                String lowerCase = f6Var != null ? f6Var.name().toLowerCase(Locale.ROOT) : null;
                String strF = io.sentry.vendor.a.f(hVar.c().getTime());
                try {
                    Map mapB = hVar.b();
                    if (!mapB.isEmpty()) {
                        strD = sentryAndroidOptions4.getSerializer().d(mapB);
                    }
                    break;
                } catch (Throwable th6) {
                    sentryAndroidOptions4.getLogger().b(f6.ERROR, th6, "Breadcrumb data is not serializable.", new Object[0]);
                }
                NativeScope.nativeAddBreadcrumb(lowerCase, hVar.p, hVar.s, hVar.q, strF, strD);
                return;
            case 11:
                ReplayIntegration replayIntegration = (ReplayIntegration) this.n;
                CountDownLatch countDownLatch = (CountDownLatch) this.f267o;
                int i2 = ReplayIntegration.B;
                try {
                    replayIntegration.o0();
                    return;
                } finally {
                    replayIntegration.N0(false);
                    countDownLatch.countDown();
                }
            case ep1.d /* 12 */:
                ((io.sentry.android.replay.capture.d) this.n).m((Date) this.f267o);
                return;
            case 13:
                File file = (File) this.n;
                io.sentry.android.replay.capture.h hVar2 = (io.sentry.android.replay.capture.h) this.f267o;
                io.sentry.util.b.h(file);
                hVar2.k(-1);
                return;
            case 14:
                b5 b5Var = (b5) this.n;
                g7 g7Var = (g7) this.f267o;
                try {
                    b5Var.run();
                    return;
                } catch (Throwable th7) {
                    g7Var.getLogger().d(f6.ERROR, "Failed to execute task ReplayIntegration.finalize_previous_replay", th7);
                    return;
                }
            case 15:
                Runnable runnable = (Runnable) this.n;
                io.sentry.android.replay.util.f fVar = (io.sentry.android.replay.util.f) this.f267o;
                try {
                    runnable.run();
                    return;
                } catch (Throwable th8) {
                    fVar.n.getLogger().d(f6.ERROR, "Failed to execute task ".concat(runnable instanceof io.sentry.android.replay.util.g ? ((io.sentry.android.replay.util.g) runnable).m : ""), th8);
                    return;
                }
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                nh.b((ph) this.n, (LongSparseArray) this.f267o);
                return;
            case 17:
                gs gsVar = (gs) this.n;
                try {
                    ((Runnable) this.f267o).run();
                    return;
                } finally {
                    gsVar.a();
                }
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                nm8 nm8Var = (nm8) this.n;
                String string = ((UUID) this.f267o).toString();
                string.getClass();
                hm3.g(nm8Var, string);
                return;
            case FirebaseConfigurationAdapter.PilotFirebaseOptionFeatureID /* 19 */:
                sl0 sl0Var = (sl0) this.n;
                x20 x20Var = (x20) this.f267o;
                uc6 uc6Var = x20Var.a;
                tl0 tl0Var = sl0Var.a;
                CaptureActivity captureActivity = tl0Var.a;
                if (tl0Var.d) {
                    r67 r67Var = x20Var.b;
                    l70 l70Var = r67Var.a;
                    int i3 = r67Var.c;
                    Rect rect = new Rect(0, 0, l70Var.b, l70Var.c);
                    YuvImage yuvImage = new YuvImage(l70Var.a, r67Var.b, l70Var.b, l70Var.c, null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    if (i3 != 0) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(i3);
                        bitmapDecodeByteArray = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
                    }
                    try {
                        File fileCreateTempFile = File.createTempFile("barcodeimage", ".jpg", captureActivity.getCacheDir());
                        FileOutputStream fileOutputStreamG = io.sentry.config.a.g(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
                        bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStreamG);
                        fileOutputStreamG.close();
                        absolutePath = fileCreateTempFile.getAbsolutePath();
                    } catch (IOException e2) {
                        io.sentry.android.core.v0.j("tl0", "Unable to create temporary file and store bitmap! " + e2);
                    }
                    break;
                }
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.addFlags(524288);
                intent.putExtra("SCAN_RESULT", uc6Var.a);
                intent.putExtra("SCAN_RESULT_FORMAT", uc6Var.d.toString());
                byte[] bArr = uc6Var.b;
                if (bArr != null && bArr.length > 0) {
                    intent.putExtra("SCAN_RESULT_BYTES", bArr);
                }
                Map map = uc6Var.e;
                if (map != null) {
                    vc6 vc6Var = vc6.u;
                    if (map.containsKey(vc6Var)) {
                        intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", map.get(vc6Var).toString());
                    }
                    Number number = (Number) map.get(vc6.m);
                    if (number != null) {
                        intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
                    }
                    String str = (String) map.get(vc6.f2300o);
                    if (str != null) {
                        intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str);
                    }
                    Iterable iterable = (Iterable) map.get(vc6.n);
                    if (iterable != null) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i, (byte[]) it.next());
                            i++;
                        }
                    }
                }
                if (absolutePath != null) {
                    intent.putExtra("SCAN_RESULT_IMAGE_PATH", absolutePath);
                }
                captureActivity.setResult(-1, intent);
                tl0Var.a();
                return;
            case 20:
                ClientViewOpenGL clientViewOpenGL = (ClientViewOpenGL) this.n;
                r97 r97Var = (r97) this.f267o;
                int i4 = ClientViewOpenGL.F;
                da3 da3Var = clientViewOpenGL.E;
                PointF pointF = r97Var.a;
                if (da3Var.S(pointF.x, pointF.y)) {
                    return;
                }
                ImageView imageView = clientViewOpenGL.m;
                if (imageView == null) {
                    ye4.c("ClientViewOpenGL", "drawMouse(): mouseview is null");
                    return;
                }
                wk7 wk7VarQ = da3Var.q();
                if (wk7VarQ == null) {
                    ye4.c("ClientViewOpenGL", "drawMouse(): mouse is NULL");
                    return;
                }
                Bitmap bitmap = wk7VarQ.g;
                if (bitmap == null) {
                    ye4.c("ClientViewOpenGL", "drawMouse(): bitmap is null");
                    return;
                }
                RelativeLayout.LayoutParams layoutParams = clientViewOpenGL.n;
                if (layoutParams == null) {
                    ye4.c("ClientViewOpenGL", "drawMouse(): mouselayoutparams is null");
                    return;
                } else {
                    ClientViewOpenGL.c(imageView, bitmap, layoutParams, r97Var.b, wk7VarQ.e, wk7VarQ.i, 0.0f, 0.0f);
                    return;
                }
            case 21:
                ax0 ax0Var = (ax0) this.n;
                String str2 = (String) this.f267o;
                ax0Var.getClass();
                try {
                    v83 v83VarA = v83.a(ax0Var.q);
                    t83 t83Var = v83VarA.a;
                    v83VarA.b("ParticipantSessionId", ax0Var.r);
                    v83VarA.b(ax0Var.f370o, ax0Var.p);
                    v83VarA.b("ViewType", "Android");
                    v83VarA.b("Comment", str2);
                    t83Var.getClass();
                    to7.n(2, "method");
                    t83Var.b = 2;
                    u83 u83VarF = u83.f(t83Var, null);
                    v83VarA.b = u83VarF;
                    db8.o0(u83VarF);
                    v83VarA.b.h();
                    return;
                } catch (IOException unused2) {
                    ye4.c("CommentSessionSender", "error sending comment");
                    return;
                }
            case 22:
                my0 my0Var = (my0) this.n;
                my0Var.m.a(new dy0((o75) this.f267o, my0Var, objArr == true ? 1 : 0));
                return;
            case 23:
                List<g30> list = (List) this.n;
                l61 l61Var = (l61) this.f267o;
                for (g30 g30Var : list) {
                    Object obj = l61Var.e;
                    h30 h30Var = g30Var.a;
                    Object x61Var = h30Var.d(obj) ? new x61(h30Var.c()) : w61.a;
                    gt5 gt5Var = g30Var.b;
                    gt5Var.getClass();
                    gt5Var.b(x61Var);
                }
                return;
            case 24:
                zg2 zg2Var = (zg2) this.n;
                xt2 xt2Var = (xt2) this.f267o;
                if (zg2Var.G0) {
                    return;
                }
                zg2Var.G0 = true;
                su2 su2VarD = xt2Var.D();
                if (su2VarD.F("dialog_progress") != null) {
                    ye4 ye4Var = ye4.a;
                    ye4Var.g("FTProgressDialogFragment", "Progress dialog not yet dismissed");
                    boolean zB = su2VarD.B(true);
                    su2VarD.G();
                    if (!zB) {
                        return;
                    }
                    ye4Var.g("FTProgressDialogFragment", "Executed pending transactions");
                    if (su2VarD.F("dialog_progress") != null) {
                        return;
                    }
                }
                try {
                    zg2Var.C0 = false;
                    zg2Var.D0 = true;
                    w10 w10Var = new w10(su2VarD);
                    w10Var.p = true;
                    w10Var.h(0, zg2Var, "dialog_progress", 1);
                    if (w10Var.g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    w10Var.h = false;
                    w10Var.r.C(w10Var, false);
                    return;
                } catch (IllegalStateException unused3) {
                    ye4.c("FTProgressDialogFragment", "could not show dialog progress - IllegalState!");
                    return;
                }
            case 25:
                ((TextView) this.n).setText(String.valueOf(((pk2) this.f267o).g));
                return;
            case 26:
                ik2 ik2Var = (ik2) this.n;
                z08 z08Var = (z08) this.f267o;
                z08Var.getClass();
                zg2 zg2Var2 = zg2.H0;
                if (zg2Var2 == null) {
                    zg2Var2 = new zg2();
                    zg2.H0 = zg2Var2;
                }
                if (!zg2Var2.G0) {
                    FileTransferActivity fileTransferActivity = (FileTransferActivity) ik2Var.C();
                    zg2 zg2Var3 = zg2.H0;
                    if (zg2Var3 == null) {
                        zg2Var3 = new zg2();
                        zg2.H0 = zg2Var3;
                    }
                    if (fileTransferActivity == null) {
                        ye4.c("FTProgressDialogFragment", "show: activity is null");
                    } else {
                        fileTransferActivity.runOnUiThread(new u4((Object) zg2Var3, (Object) fileTransferActivity, (byte) 24));
                    }
                }
                final zg2 zg2Var4 = zg2.H0;
                if (zg2Var4 == null) {
                    zg2Var4 = new zg2();
                    zg2.H0 = zg2Var4;
                }
                zg2Var4.F0(z08Var.d, z08Var.c);
                final int i5 = z08Var.e;
                final int i6 = z08Var.b;
                if (zg2Var4.U != null) {
                    View view = zg2Var4.F0;
                    final TextView textView = view != null ? (TextView) view.findViewById(R.id.filetransfer_progress_toptext) : null;
                    if (textView != null) {
                        bu7.MAIN.a(new Runnable() { // from class: o.yg2
                            @Override // java.lang.Runnable
                            public final void run() {
                                Resources resourcesH = zg2Var4.H();
                                resourcesH.getClass();
                                textView.setText(o67.h(resourcesH, R.string.tv_were_copied_successfully, Integer.valueOf(i5 - 1), Integer.valueOf(i6)));
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ((FirebaseMessaging) this.n).lambda$register$9((do7) this.f267o);
                return;
            case 28:
                bb5 bb5Var = (bb5) this.n;
                bb5Var.I0((oq0) this.f267o, bb5Var.v0);
                return;
            default:
                ((gl0) this.n).D((q43) this.f267o);
                return;
        }
    }

    public /* synthetic */ u4(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.f267o = obj2;
    }
}
