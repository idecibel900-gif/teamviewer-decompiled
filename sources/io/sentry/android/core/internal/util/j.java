package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.webkit.MimeTypeMap;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.messaging.EnhancedIntentService;
import com.teamviewer.chatviewmodel.swig.IConversationHistoryListUIModel;
import com.teamviewer.firebaseconfiglib.swig.firebaseconfigadapter.FirebaseConfigurationAdapter;
import com.teamviewer.remotecontrolviewlib.activity.MainActivity;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.settings.Settings;
import io.sentry.android.core.q0;
import io.sentry.i5;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import o.an8;
import o.au8;
import o.ax0;
import o.b97;
import o.bc7;
import o.bd4;
import o.be3;
import o.bu7;
import o.c92;
import o.cj0;
import o.cl;
import o.d11;
import o.db8;
import o.di1;
import o.dl;
import o.do7;
import o.dp3;
import o.ds1;
import o.dt5;
import o.eb;
import o.ed;
import o.eh6;
import o.ek2;
import o.el;
import o.ep1;
import o.fe1;
import o.fo2;
import o.fy;
import o.g28;
import o.g76;
import o.gj0;
import o.gj2;
import o.gk0;
import o.gl1;
import o.gn8;
import o.go0;
import o.gy8;
import o.hm0;
import o.hm3;
import o.hn8;
import o.i32;
import o.ik2;
import o.in8;
import o.jj2;
import o.jn8;
import o.k00;
import o.kc4;
import o.kc6;
import o.kh;
import o.kj0;
import o.km8;
import o.kn8;
import o.lc4;
import o.ld2;
import o.lh7;
import o.lk2;
import o.lm8;
import o.ln8;
import o.lq1;
import o.mc4;
import o.mk7;
import o.n37;
import o.nk4;
import o.nk7;
import o.nm8;
import o.nn8;
import o.o67;
import o.o82;
import o.on8;
import o.pg1;
import o.po0;
import o.q77;
import o.qj1;
import o.r82;
import o.rn1;
import o.se2;
import o.sm8;
import o.t60;
import o.t83;
import o.td2;
import o.to7;
import o.u00;
import o.u47;
import o.u83;
import o.ua5;
import o.uk1;
import o.us1;
import o.v83;
import o.ve6;
import o.vy5;
import o.w18;
import o.we4;
import o.wk0;
import o.wk2;
import o.x37;
import o.xk0;
import o.xk1;
import o.xm8;
import o.xr2;
import o.xt2;
import o.yc4;
import o.ye4;
import o.yq4;
import o.yr2;
import o.yy5;
import o.zm8;
import o.zu1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f113o;
    public final /* synthetic */ Object p;

    public /* synthetic */ j(Window window, Window.Callback callback, Runnable runnable, q0 q0Var) {
        this.m = (byte) 0;
        this.n = window;
        this.f113o = callback;
        this.p = runnable;
    }

    private final void a() {
        byte b;
        boolean z;
        lh7 lh7Var = (lh7) this.n;
        b97 b97Var = (b97) this.f113o;
        final dt5 dt5Var = (dt5) lh7Var.n;
        dt5Var.getClass();
        km8 km8Var = b97Var.a;
        final String str = km8Var.a;
        final ArrayList arrayList = new ArrayList();
        xm8 xm8Var = (xm8) dt5Var.e.n(new Callable() { // from class: o.ct5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = dt5Var.e;
                cn8 cn8VarX = workDatabase.x();
                cn8VarX.getClass();
                String str2 = str;
                str2.getClass();
                arrayList.addAll((List) au8.M(cn8VarX.a, true, false, new zm8(str2, (byte) 8)));
                return workDatabase.w().b(str2);
            }
        });
        byte b2 = 6;
        if (xm8Var == null) {
            we4.f().j(dt5.l, "Didn't find WorkSpec for id " + km8Var);
            ((eh6) dt5Var.d.q).execute(new be3(dt5Var, km8Var, b2));
            return;
        }
        synchronized (dt5Var.k) {
            try {
                synchronized (dt5Var.k) {
                    b = 1;
                    z = dt5Var.c(str) != null;
                }
                if (z) {
                    Set set = (Set) dt5Var.h.get(str);
                    if (((b97) set.iterator().next()).a.b == km8Var.b) {
                        set.add(b97Var);
                        we4.f().c(dt5.l, "Work " + km8Var + " is already enqueued for processing");
                    } else {
                        ((eh6) dt5Var.d.q).execute(new be3(dt5Var, km8Var, b2));
                    }
                    return;
                }
                if (xm8Var.t != km8Var.b) {
                    ((eh6) dt5Var.d.q).execute(new be3(dt5Var, km8Var, b2));
                    return;
                }
                Context context = dt5Var.b;
                d11 d11Var = dt5Var.c;
                yc4 yc4Var = dt5Var.d;
                WorkDatabase workDatabase = dt5Var.e;
                context.getClass();
                dt5Var.getClass();
                io.sentry.android.core.d dVar = new io.sentry.android.core.d();
                dVar.m = d11Var;
                dVar.n = yc4Var;
                dVar.f100o = dt5Var;
                dVar.p = workDatabase;
                dVar.q = xm8Var;
                dVar.r = arrayList;
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                dVar.s = applicationContext;
                new yy5();
                nn8 nn8Var = new nn8(dVar);
                fe1 fe1Var = (fe1) nn8Var.d.n;
                dp3 dp3VarR = ds1.r();
                fe1Var.getClass();
                kj0 kj0VarB = zu1.B(xk0.G(fe1Var, dp3VarR), new ln8(nn8Var, null, b));
                kj0VarB.addListener(new j((Object) dt5Var, (Object) kj0VarB, (Object) nn8Var, (byte) 15), (eh6) dt5Var.d.q);
                dt5Var.g.put(str, nn8Var);
                HashSet hashSet = new HashSet();
                hashSet.add(b97Var);
                dt5Var.h.put(str, hashSet);
                we4.f().c(dt5.l, dt5.class.getSimpleName() + ": processing " + km8Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x02e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r5v14 */
    @Override // java.lang.Runnable
    public final void run() {
        byte[] byteArray;
        String mimeTypeFromExtension;
        Bitmap bitmapCreateBitmap;
        ListView listView;
        Parcelable parcelable;
        i32 i32VarH;
        String strH0;
        String strC;
        String strA;
        km8 km8VarJ;
        ArrayList arrayList;
        byte b = 6;
        Bitmap bitmapExtractThumbnail = null;
        ax0 ax0Var = null;
        bitmapExtractThumbnail = null;
        bitmapExtractThumbnail = null;
        boolean zBooleanValue = true;
        int i = 0;
        boolean zD = false;
        switch (this.m) {
            case 0:
                Window window = (Window) this.n;
                Window.Callback callback = (Window.Callback) this.f113o;
                Runnable runnable = (Runnable) this.p;
                View viewPeekDecorView = window.peekDecorView();
                if (viewPeekDecorView != null) {
                    window.setCallback(callback);
                    viewPeekDecorView.getViewTreeObserver().addOnDrawListener(new l(viewPeekDecorView, runnable));
                    return;
                }
                return;
            case 1:
                el elVar = (el) this.n;
                cl clVar = (cl) this.f113o;
                dl dlVar = (dl) this.p;
                ActionMode actionModeStartActionMode = elVar.a.startActionMode(new fo2(clVar), 1);
                elVar.h = actionModeStartActionMode;
                if (actionModeStartActionMode == null) {
                    dlVar.close();
                    return;
                }
                return;
            case 2:
                WorkDatabase workDatabase = (WorkDatabase) this.n;
                String str = (String) this.f113o;
                nm8 nm8Var = (nm8) this.p;
                an8 an8VarW = workDatabase.w();
                an8VarW.getClass();
                str.getClass();
                Iterator it = ((List) au8.M(an8VarW.a, true, false, new zm8(str, b))).iterator();
                while (it.hasNext()) {
                    hm3.g(nm8Var, (String) it.next());
                }
                return;
            case 3:
                po0 po0Var = (po0) this.n;
                gy8 gy8Var = (gy8) this.f113o;
                String str2 = (String) this.p;
                gy8Var.getClass();
                Uri uri = (Uri) gy8Var.d;
                Context context = (Context) gy8Var.c;
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                            FileInputStream fileInputStreamD = io.sentry.config.a.d(new FileInputStream(fileDescriptor), fileDescriptor);
                            try {
                                int i2 = gy8Var.b;
                                if (i2 <= 0) {
                                    i2 = 8192;
                                }
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int i3 = fileInputStreamD.read(bArr);
                                    if (i3 != -1) {
                                        byteArrayOutputStream.write(bArr, 0, i3);
                                    } else {
                                        byteArray = byteArrayOutputStream.toByteArray();
                                        byteArray.getClass();
                                        fileInputStreamD.close();
                                        parcelFileDescriptorOpenFileDescriptor.close();
                                    }
                                    try {
                                        throw th;
                                    } catch (Throwable th) {
                                        kh.n(parcelFileDescriptorOpenFileDescriptor, th);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    kh.n(fileInputStreamD, th2);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    kh.n(parcelFileDescriptorOpenFileDescriptor, null);
                    byteArray = new byte[0];
                } catch (IOException e) {
                    ye4.d("FilePickHandler", e);
                    byteArray = new byte[0];
                } catch (OutOfMemoryError e2) {
                    ye4.d("FilePickHandler", e2);
                    byteArray = new byte[0];
                }
                if (byteArray.length == 0) {
                    ye4.c("ChatConversationDefaultLogic", "onFilePicked(): Couldn't read file");
                    bu7.MAIN.a(new go0(po0Var, i));
                    return;
                }
                if ("content".equals(uri.getScheme())) {
                    mimeTypeFromExtension = context.getContentResolver().getType(uri);
                } else {
                    String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    fileExtensionFromUrl.getClass();
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
                    lowerCase.getClass();
                    mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
                }
                if (mimeTypeFromExtension != null && bc7.N(false, mimeTypeFromExtension, "image/")) {
                    bitmapExtractThumbnail = ThumbnailUtils.extractThumbnail(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length), 256, 256);
                } else if (mimeTypeFromExtension != null && bc7.N(false, mimeTypeFromExtension, "video/")) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(context, uri);
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                    if (frameAtTime != null) {
                        int width = frameAtTime.getWidth();
                        int height = frameAtTime.getHeight();
                        if (width < height) {
                            Matrix matrix = new Matrix();
                            float f = 256.0f / width;
                            matrix.setScale(f, f);
                            bitmapCreateBitmap = Bitmap.createBitmap(frameAtTime, 0, (height - width) / 2, width, width, matrix, true);
                            bitmapCreateBitmap.getClass();
                        } else {
                            Matrix matrix2 = new Matrix();
                            float f2 = 256.0f / height;
                            matrix2.setScale(f2, f2);
                            bitmapCreateBitmap = Bitmap.createBitmap(frameAtTime, (width - height) / 2, 0, height, height, matrix2, true);
                            bitmapCreateBitmap.getClass();
                        }
                        bitmapExtractThumbnail = bitmapCreateBitmap;
                        frameAtTime.recycle();
                    }
                }
                if (bitmapExtractThumbnail == null) {
                    IConversationHistoryListUIModel iConversationHistoryListUIModel = po0Var.n;
                    if (iConversationHistoryListUIModel != null) {
                        iConversationHistoryListUIModel.SendFileData(str2, byteArray, new byte[0]);
                        return;
                    }
                    return;
                }
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                bitmapExtractThumbnail.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                IConversationHistoryListUIModel iConversationHistoryListUIModel2 = po0Var.n;
                if (iConversationHistoryListUIModel2 != null) {
                    iConversationHistoryListUIModel2.SendFileData(str2, byteArray, byteArray2);
                    return;
                }
                return;
            case 4:
                wk0 wk0Var = (wk0) this.n;
                cj0 cj0Var = (cj0) this.f113o;
                kc6 kc6Var = (kc6) this.p;
                qj1 qj1Var = (qj1) wk0Var.f2420o;
                if (qj1Var.n.G()) {
                    cj0Var.d(qj1Var, new IOException("Canceled"));
                    return;
                } else {
                    cj0Var.e(qj1Var, kc6Var);
                    return;
                }
            case 5:
                ((cj0) this.f113o).d((qj1) ((wk0) this.n).f2420o, (Throwable) this.p);
                return;
            case 6:
                uk1 uk1Var = (uk1) this.n;
                u00 u00Var = (u00) this.f113o;
                String str3 = u00Var.a;
                k00 k00Var = (k00) this.p;
                uk1Var.getClass();
                Logger logger = uk1.f;
                try {
                    g28 g28VarA = uk1Var.c.a(str3);
                    if (g28VarA == null) {
                        String str4 = "Transport backend '" + str3 + "' is not registered";
                        logger.warning(str4);
                        new IllegalArgumentException(str4);
                    } else {
                        uk1Var.e.F(new i5(uk1Var, u00Var, ((hm0) g28VarA).a(k00Var), (byte) 5));
                    }
                    return;
                } catch (Exception e3) {
                    logger.warning("Error scheduling event " + e3.getMessage());
                    return;
                }
            case 7:
                ViewGroup viewGroup = (ViewGroup) this.n;
                View view = (View) this.f113o;
                gl1 gl1Var = (gl1) this.p;
                viewGroup.endViewTransition(view);
                ((q77) gl1Var.c.m).c(gl1Var);
                return;
            case 8:
                t60 t60Var = (t60) this.n;
                zu1 zu1Var = (zu1) this.f113o;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.p;
                try {
                    yr2 yr2VarP = di1.p(t60Var.a);
                    if (yr2VarP == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    xr2 xr2Var = (xr2) yr2VarP.a;
                    synchronized (xr2Var.c) {
                        xr2Var.e = threadPoolExecutor;
                        break;
                    }
                    yr2VarP.a.a(new c92(zu1Var, threadPoolExecutor));
                    return;
                } catch (Throwable th5) {
                    zu1Var.F(th5);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case ep1.b /* 9 */:
                ((EnhancedIntentService) this.n).lambda$processIntent$0((Intent) this.f113o, (do7) this.p);
                return;
            case ep1.c /* 10 */:
                wk2 wk2Var = (wk2) this.n;
                jj2 jj2Var = (jj2) this.f113o;
                ArrayList arrayList2 = (ArrayList) this.p;
                ik2 ik2Var = (ik2) wk2Var.u.get();
                if (ik2Var != null) {
                    bu7.MAIN.a(new ed(b));
                    if (jj2Var == jj2.m) {
                        xt2 xt2VarC = ik2Var.C();
                        ListView listView2 = ik2Var.v0;
                        ek2 ek2Var = ik2Var.M0;
                        wk2 wk2Var2 = ik2Var.F0;
                        ik2Var.A0 = new lk2(xt2VarC, listView2, arrayList2, ek2Var, wk2Var2 != null ? wk2Var2.a1() : false, ik2Var.U0);
                        ListView listView3 = ik2Var.v0;
                        if (listView3 != null) {
                            wk2 wk2Var3 = ik2Var.F0;
                            if (wk2Var3 != null && wk2Var3.r) {
                                ik2Var.E0 = listView3.onSaveInstanceState();
                            }
                            ListView listView4 = ik2Var.v0;
                            if (listView4 != null) {
                                listView4.setAdapter((ListAdapter) ik2Var.A0);
                                ik2Var.L0();
                                ListView listView5 = ik2Var.v0;
                                if (listView5 != null) {
                                    listView5.clearAnimation();
                                }
                                ListView listView6 = ik2Var.v0;
                                if (listView6 != null) {
                                    listView6.startAnimation(AnimationUtils.loadAnimation(ik2Var.E(), R.anim.fade_in));
                                }
                                ListView listView7 = ik2Var.v0;
                                if (listView7 != null) {
                                    listView7.setVisibility(0);
                                }
                                wk2 wk2Var4 = ik2Var.F0;
                                if (wk2Var4 == null || !wk2Var4.r || (parcelable = ik2Var.E0) == null) {
                                    Parcelable parcelable2 = ik2Var.E0;
                                    if (parcelable2 != null && (listView = ik2Var.v0) != null) {
                                        listView.onRestoreInstanceState(parcelable2);
                                    }
                                } else {
                                    ListView listView8 = ik2Var.v0;
                                    if (listView8 != null) {
                                        listView8.onRestoreInstanceState(parcelable);
                                    }
                                    wk2 wk2Var5 = ik2Var.F0;
                                    if (wk2Var5 != null) {
                                        wk2Var5.r = false;
                                    }
                                }
                                ik2Var.E0 = null;
                            } else {
                                ye4.c("FileTransferFragment", "FileListingResponse/UIThread: FileTransferListView is NULL");
                            }
                        }
                    } else {
                        ListView listView9 = ik2Var.v0;
                        if (listView9 != null) {
                            listView9.clearAnimation();
                            ListView listView10 = ik2Var.v0;
                            if (listView10 != null) {
                                listView10.startAnimation(AnimationUtils.loadAnimation(ik2Var.E(), R.anim.fade_in));
                            }
                            ListView listView11 = ik2Var.v0;
                            if (listView11 != null) {
                                listView11.setVisibility(0);
                            }
                            wk2 wk2Var6 = ik2Var.F0;
                            if (wk2Var6 != null) {
                                String str5 = wk2Var6.t;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                String strH = wk2Var6.f2421o.h(str5);
                                wk2Var6.t = strH != null ? strH : "";
                            }
                            ik2Var.O0();
                        } else {
                            ye4.c("FileTransferFragment", "FileListingResponse/UIThread: m_FileTransferListView is NULL");
                        }
                        ye4.c("FileTransferVM", "FileListingResponse: Response is Error");
                    }
                } else {
                    ye4.c("FileTransferVM", "FileListingResponse: FileTransferView is NULL");
                }
                wk2Var.s = false;
                return;
            case 11:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.n;
                gj0 gj0Var = (gj0) this.f113o;
                eb ebVar = (eb) this.p;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    ebVar.a();
                    gj0Var.a(null);
                    return;
                } catch (Throwable th6) {
                    gj0Var.b(th6);
                    return;
                }
            case ep1.d /* 12 */:
                jj2 jj2Var2 = jj2.n;
                bd4 bd4Var = (bd4) this.n;
                String str6 = (String) this.f113o;
                xk1 xk1Var = (xk1) this.p;
                ArrayList arrayList3 = new ArrayList();
                if (!bd4Var.i()) {
                    ye4.c("LocalFileHandler", "listDirectory(): External storage not writable");
                    xk1Var.U(jj2Var2, arrayList3);
                    return;
                }
                File file = new File(str6);
                if (!file.isDirectory()) {
                    ye4.c("LocalFileHandler", "listDirectory(): File is not a directory");
                    xk1Var.U(jj2Var2, arrayList3);
                    return;
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    ye4.c("LocalFileHandler", "listDirectory(): Files is null");
                    xk1Var.U(jj2Var2, arrayList3);
                    return;
                }
                for (File file2 : fileArrListFiles) {
                    file2.getClass();
                    nk7 nk7Var = new nk7(file2);
                    if (!bd4Var.g || !bc7.N(false, nk7Var.m, ".")) {
                        nk7Var.p = mk7.m;
                        arrayList3.add(nk7Var);
                    }
                }
                Collections.sort(arrayList3, gj2.n);
                xk1Var.U(jj2.m, arrayList3);
                return;
            case 13:
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.n;
                MainActivity mainActivity = (MainActivity) this.f113o;
                View view2 = (View) this.p;
                View view3 = mainActivity.V;
                marginLayoutParams.bottomMargin = view3 != null ? view3.getHeight() : 0;
                view2.setLayoutParams(marginLayoutParams);
                return;
            case 14:
                String str7 = (String) this.n;
                String str8 = (String) this.f113o;
                nk4 nk4Var = (nk4) this.p;
                Resources resources = nk4Var.n.getResources();
                resources.getClass();
                String str9 = "";
                String str10 = "CL";
                if (n37.b) {
                    str10 = "QS";
                } else if (n37.c) {
                    str10 = "HM";
                } else if (!n37.a) {
                    if (n37.d) {
                        str10 = "AR";
                    } else if (n37.e) {
                        str10 = "PL";
                    }
                }
                String strConcat = "15.83.298".concat(str10);
                Settings.i.n();
                String strM = ua5.m("And", Build.VERSION.RELEASE);
                if (strM.length() > 10) {
                    strM = strM.substring(0, 10);
                }
                try {
                    v83 v83VarA = v83.a(o67.h(resources, R.string.tv_url_tvconsoleCommentSession, str7, "en", strConcat, strM));
                    t83 t83Var = v83VarA.a;
                    t83Var.getClass();
                    to7.n(1, "method");
                    t83Var.b = 1;
                    u83 u83VarF = u83.f(t83Var, null);
                    v83VarA.b = u83VarF;
                    db8.o0(u83VarF);
                    i32VarH = v83VarA.b.h();
                } catch (IOException unused) {
                    ye4.c("CommentSessionSenderFactory", "could not fetch comment session page");
                    i32VarH = null;
                }
                if (i32VarH != null) {
                    db8.l0("[type=hidden]");
                    r82 r82VarP = xk0.p(vy5.b0("[type=hidden]"), i32VarH);
                    r82VarP.getClass();
                    o82 o82Var = (o82) lq1.D("[name=ViewType]", r82VarP).a();
                    if (o82Var != null) {
                        r82VarP.remove(o82Var);
                    }
                    o82 o82Var2 = (o82) lq1.D("[name=ParticipantSessionId]", r82VarP).a();
                    if (o82Var2 != null) {
                        r82VarP.remove(o82Var2);
                    }
                    o82 o82Var3 = (o82) r82VarP.a();
                    String strC2 = o82Var3 != null ? o82Var3.c("name") : null;
                    if (strC2 == null) {
                        strC2 = "";
                    }
                    if (o82Var3 == null) {
                        strH0 = "";
                    } else {
                        strH0 = o82Var3.X("textarea") ? o82Var3.h0() : o82Var3.c("value");
                        if (strH0 == null) {
                            strH0 = "";
                        }
                    }
                    db8.l0("[data-date]");
                    td2 td2VarB0 = vy5.b0("[data-date]");
                    o82 o82Var4 = (o82) xk0.I(td2VarB0, i32VarH).findFirst().orElse(null);
                    td2VarB0.e();
                    if (o82Var4 == null || (strC = o82Var4.c("data-date")) == null) {
                        strC = "";
                    }
                    db8.l0("form");
                    o82 o82Var5 = (o82) xk0.p(new ld2(us1.I("form"), i, (byte) 9), i32VarH).a();
                    if (o82Var5 != null && (strA = o82Var5.a("action")) != null) {
                        str9 = strA;
                    }
                    ax0 ax0Var2 = new ax0();
                    ax0Var2.m = str8;
                    ax0Var2.n = strC;
                    ax0Var2.q = str9;
                    ax0Var2.f370o = strC2;
                    ax0Var2.p = strH0;
                    ax0Var2.r = str7;
                    ax0Var = ax0Var2;
                }
                if (ax0Var == null) {
                    ye4.c("MainActivityViewModel", "empty commentsessionsender response. is the mco up?");
                    return;
                } else {
                    bu7.MAIN.a(new be3(nk4Var, ax0Var, (byte) 3));
                    return;
                }
            case 15:
                dt5 dt5Var = (dt5) this.n;
                kj0 kj0Var = (kj0) this.f113o;
                nn8 nn8Var = (nn8) this.p;
                dt5Var.getClass();
                try {
                    zBooleanValue = ((Boolean) kj0Var.n.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused2) {
                }
                synchronized (dt5Var.k) {
                    try {
                        km8VarJ = u47.j(nn8Var.a);
                        String str11 = km8VarJ.a;
                        if (dt5Var.c(str11) == nn8Var) {
                            dt5Var.b(str11);
                        }
                        we4.f().c(dt5.l, dt5.class.getSimpleName() + " " + str11 + " executed; reschedule = " + zBooleanValue);
                        arrayList = new ArrayList(dt5Var.j);
                    } catch (Throwable th7) {
                        throw th7;
                    }
                    break;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((se2) it2.next()).e(km8VarJ, zBooleanValue);
                }
                return;
            case FirebaseConfigurationAdapter.HostFirebaseOptionFeatureID /* 16 */:
                ve6 ve6Var = (ve6) this.n;
                Network network = (Network) this.f113o;
                NetworkCapabilities networkCapabilities = (NetworkCapabilities) this.p;
                if (ve6Var.b && network.equals((Network) ve6Var.f)) {
                    x37.p("Default", networkCapabilities);
                    return;
                }
                return;
            case 17:
                a();
                return;
            case FirebaseConfigurationAdapter.RCFirebaseOptionFeatureID /* 18 */:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.n;
                gj0 gj0Var2 = (gj0) this.f113o;
                Function0 function0 = (Function0) this.p;
                if (atomicBoolean2.get()) {
                    return;
                }
                try {
                    gj0Var2.a(function0.a());
                    return;
                } catch (Throwable th8) {
                    gj0Var2.b(th8);
                    return;
                }
            default:
                kn8 kn8Var = (kn8) this.n;
                g76 g76Var = (g76) this.f113o;
                nn8 nn8Var2 = (nn8) this.p;
                if (!(kn8Var instanceof hn8)) {
                    if (kn8Var instanceof gn8) {
                        nn8Var2.a(new kc4());
                        g76Var.m = false;
                        return;
                    } else {
                        if (kn8Var instanceof in8) {
                            g76Var.m = nn8Var2.d(((in8) kn8Var).a);
                            return;
                        }
                        if (!(kn8Var instanceof jn8)) {
                            gk0.s();
                            return;
                        }
                        if (((jn8) kn8Var).a) {
                            zD = nn8Var2.d(-256);
                        } else {
                            nn8Var2.a(new kc4());
                        }
                        g76Var.m = zD;
                        return;
                    }
                }
                mc4 mc4Var = ((hn8) kn8Var).a;
                an8 an8Var = nn8Var2.h;
                String str12 = nn8Var2.c;
                lm8 lm8VarA = an8Var.a(str12);
                sm8 sm8VarV = nn8Var2.g.v();
                sm8VarV.getClass();
                au8.M(sm8VarV.a, false, true, new fy(str12, (byte) 26));
                if (lm8VarA != null) {
                    if (lm8VarA == lm8.n) {
                        xm8 xm8Var = nn8Var2.a;
                        String str13 = nn8Var2.k;
                        if (mc4Var instanceof lc4) {
                            we4.f().g(on8.a, "Worker result SUCCESS for ".concat(str13));
                            if (xm8Var.b()) {
                                nn8Var2.c();
                            } else {
                                an8Var.f(lm8.f1384o, str12);
                                pg1 pg1Var = ((lc4) mc4Var).a;
                                pg1Var.getClass();
                                byte b2 = 7;
                                au8.M(an8Var.a, false, true, new w18(pg1Var, str12, b2));
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                rn1 rn1Var = nn8Var2.i;
                                for (String str14 : rn1Var.a(str12)) {
                                    if (an8Var.a(str14) == lm8.q && ((Boolean) au8.M(rn1Var.a, true, false, new fy(str14, b2))).booleanValue()) {
                                        we4.f().g(on8.a, "Setting status to enqueued for ".concat(str14));
                                        an8Var.f(lm8.m, str14);
                                        an8Var.e(str14, jCurrentTimeMillis);
                                        nn8Var2.m.add(str14);
                                    }
                                }
                            }
                        } else {
                            we4.f().g(on8.a, "Worker result FAILURE for ".concat(str13));
                            if (xm8Var.b()) {
                                nn8Var2.c();
                            } else {
                                nn8Var2.f(mc4Var);
                            }
                        }
                    } else if (!lm8VarA.a()) {
                        nn8Var2.b(-512);
                    }
                    zBooleanValue = false;
                } else {
                    zBooleanValue = false;
                }
                g76Var.m = zBooleanValue;
                return;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.n = obj;
        this.f113o = obj2;
        this.p = obj3;
    }

    public /* synthetic */ j(uk1 uk1Var, u00 u00Var, yq4 yq4Var, k00 k00Var) {
        this.m = (byte) 6;
        this.n = uk1Var;
        this.f113o = u00Var;
        this.p = k00Var;
    }
}
