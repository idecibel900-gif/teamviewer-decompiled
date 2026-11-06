package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.teamviewer.activereviews.InAppReviewLauncher;
import com.teamviewer.apidefinitions.remotecontrol.infrastructure.ApiClient;
import com.teamviewer.libs.materialtoolbar.ToolbarViewMovable;
import com.teamviewer.remotecontrollib.swig.IQuickActionsViewModel;
import com.teamviewer.remotecontrollib.swig.IQuickActionsViewModelSWIGJNI;
import com.teamviewer.remotecontrollib.swig.NSDDiscoveryWrapper;
import com.teamviewer.remotecontrollib.swig.NSDDiscoveryWrapperSWIGJNI;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.fragment.session.ExpandableTopTextBox;
import com.teamviewer.remotecontrolviewlib.fragment.session.PilotMarkerTextInputFieldView;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ar implements a93, fw, l15, le7, p45, d85, xu2, t75, cr0, zi4, f75, j05, io.sentry.c5, d42, jh7, cf7 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ar(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // o.a93
    public void a(String str) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                ApiClient.defaultClientBuilder_delegate$lambda$8$lambda$6((ApiClient) obj, str);
                break;
            default:
                ye4.a(((Class) ((d11) obj).m).getSimpleName(), str);
                break;
        }
    }

    @Override // o.xu2
    public void b(String str, Bundle bundle) {
        sd7 sd7Var = (sd7) this.n;
        bundle.getClass();
        sd7Var.invoke(str, bundle);
    }

    @Override // o.fw
    public int c(int i, j04 j04Var) {
        return ((w50) this.n).a(0, i, j04Var);
    }

    @Override // o.cf7
    public df7 d(zz6 zz6Var) {
        Context context = (Context) this.n;
        String str = (String) zz6Var.d;
        nd ndVar = (nd) zz6Var.e;
        ndVar.getClass();
        if (str != null && str.length() != 0) {
            return io.sentry.android.sqlite.g.e(new ov2(context, str, ndVar, true, true));
        }
        hk0.g("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    @Override // o.jh7
    public Object f() {
        tg6 tg6Var = (tg6) ((fp1) this.n).i;
        SQLiteDatabase sQLiteDatabaseE = tg6Var.e();
        sQLiteDatabaseE.beginTransaction();
        try {
            sQLiteDatabaseE.compileStatement("DELETE FROM log_event_dropped").execute();
            sQLiteDatabaseE.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + tg6Var.n.a()).execute();
            sQLiteDatabaseE.setTransactionSuccessful();
            return null;
        } finally {
            sQLiteDatabaseE.endTransaction();
        }
    }

    @Override // o.zi4
    public void g() {
        M2MClientActivity m2MClientActivity = (M2MClientActivity) this.n;
        int i = M2MClientActivity.h0;
        m2MClientActivity.O(true);
    }

    @Override // o.d42
    public void h() {
        wk7 wk7VarI = ((eu6) ((wc3) this.n)).i();
        if (wk7VarI != null) {
            wk7VarI.c(1);
        }
    }

    @Override // o.le7
    public bo7 i(Object obj) {
        return ConfigFetchHandler.lambda$fetchFromBackendAndCacheResponse$4((ConfigFetchHandler.FetchResponse) this.n, (ConfigContainer) obj);
    }

    @Override // o.p45
    public void j(x35 x35Var, int i) {
        StringBuilder sb = (StringBuilder) this.n;
        if (x35Var instanceof xg1) {
            sb.append(((xg1) x35Var).Q());
        } else if (x35Var instanceof zw0) {
            sb.append(((zw0) x35Var).Q());
        } else if (x35Var instanceof di0) {
            sb.append(((di0) x35Var).Q());
        }
    }

    @Override // io.sentry.c5
    public void k(SentryAndroidOptions sentryAndroidOptions) {
        we1 we1Var = (we1) this.n;
        int i = RemoteControlApplication.G;
        sentryAndroidOptions.setDsn(we1Var.a);
        sentryAndroidOptions.setAttachViewHierarchy(we1Var.b);
        sentryAndroidOptions.setAttachScreenshot(we1Var.c);
    }

    public jw l(iu iuVar) throws IOException {
        hm0 hm0Var = (hm0) this.n;
        URL url = (URL) iuVar.f1103o;
        if (Log.isLoggable("TRuntime.CctTransportBackend", 4)) {
            Log.i("TRuntime.CctTransportBackend", String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(130000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) iuVar.n;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    hm0Var.a.encode((f00) iuVar.p, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable("TRuntime.CctTransportBackend", 4)) {
                        Log.i("TRuntime.CctTransportBackend", String.format("Status Code: %d", numValueOf));
                    }
                    ep1.o("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    ep1.o("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new jw(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new jw(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            jw jwVar = new jw(responseCode, null, o00.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return jwVar;
                        } catch (Throwable th) {
                            if (gZIPInputStream != null) {
                                try {
                                    gZIPInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                }
                throw th7;
            }
        } catch (EncodingException e) {
            e = e;
            ep1.p("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new jw(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            ep1.p("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new jw(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            ep1.p("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new jw(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            ep1.p("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new jw(400, null, 0L);
        }
    }

    @Override // o.t75
    public void m(bo7 bo7Var) {
        InAppReviewLauncher inAppReviewLauncher = (InAppReviewLauncher) this.n;
        ye4.a("InAppReviewLauncher", "in-app review completed");
        SharedPreferences.Editor editorEdit = inAppReviewLauncher.c.edit();
        editorEdit.getClass();
        editorEdit.putString("LAST_VERSION_PROMPTED_FOR_REVIEW", inAppReviewLauncher.a());
        editorEdit.apply();
    }

    public void n() {
        hw2 hw2Var = (hw2) this.n;
        synchronized (v47.c) {
            v47.h = lv0.x0(hw2Var, v47.h);
        }
    }

    public void o(g60 g60Var, List list) {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case ep1.c /* 10 */:
                g60Var.getClass();
                ((t0) obj).invoke(g60Var, list);
                break;
            default:
                cg3 cg3Var = (cg3) obj;
                g60Var.getClass();
                ar arVar = (ar) cg3Var.c;
                if (arVar == null) {
                    cg3Var.d = g60Var;
                    cg3Var.e = list;
                } else {
                    ((t0) arVar.n).invoke(g60Var, list);
                }
                break;
        }
    }

    @Override // o.d85
    public void onSuccess(Object obj) {
        ((FirebaseMessaging) this.n).lambda$handleProxiedNotificationData$6((ku0) obj);
    }

    public void p(String str, boolean z) {
        q15 q15Var = (q15) this.n;
        NSDDiscoveryWrapper nSDDiscoveryWrapper = q15Var.p;
        NSDDiscoveryWrapperSWIGJNI.NSDDiscoveryWrapper_OnNodeResolved(nSDDiscoveryWrapper.a, nSDDiscoveryWrapper, z && !q15Var.r.containsKey(str), str, "_teamviewer._tcp", ".local.", str, "");
    }

    public void q() {
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 17:
                IQuickActionsViewModel iQuickActionsViewModel = ((xz4) obj).n;
                IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel.a, iQuickActionsViewModel, 0);
                break;
            default:
                IQuickActionsViewModel iQuickActionsViewModel2 = ((j26) obj).f1124o;
                IQuickActionsViewModelSWIGJNI.IQuickActionsViewModel_ReportEvent(iQuickActionsViewModel2.a, iQuickActionsViewModel2, 0);
                break;
        }
    }

    @Override // o.f75
    public sk8 t(View view, sk8 sk8Var) {
        xk1 xk1Var;
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 20:
                yk5 yk5Var = (yk5) obj;
                view.getClass();
                h22 h22VarH = sk8Var.a.h();
                if (h22VarH != null && (xk1Var = yk5Var.q0) != null) {
                    ToolbarViewMovable toolbarViewMovable = (ToolbarViewMovable) xk1Var.n;
                    ViewGroup.LayoutParams layoutParams = toolbarViewMovable.getLayoutParams();
                    b61 b61Var = null;
                    b61 b61Var2 = layoutParams instanceof b61 ? (b61) layoutParams : null;
                    if (b61Var2 != null) {
                        ((ViewGroup.MarginLayoutParams) b61Var2).leftMargin = h22VarH.a();
                        ((ViewGroup.MarginLayoutParams) b61Var2).rightMargin = h22VarH.b();
                        b61Var = b61Var2;
                    }
                    toolbarViewMovable.setLayoutParams(b61Var);
                }
                break;
            default:
                zf8 zf8Var = (zf8) obj;
                view.getClass();
                h22 h22VarH2 = sk8Var.a.h();
                if (h22VarH2 != null) {
                    d11 d11Var = zf8Var.y0;
                    if (d11Var != null) {
                        ExpandableTopTextBox expandableTopTextBox = (ExpandableTopTextBox) d11Var.p;
                        int iA = h22VarH2.a();
                        int i = Build.VERSION.SDK_INT;
                        Rect rect = new Rect(iA, i >= 28 ? dq.p(h22VarH2.a) : 0, h22VarH2.b(), i >= 28 ? dq.m(h22VarH2.a) : 0);
                        ViewGroup.LayoutParams layoutParams2 = ((ConstraintLayout) expandableTopTextBox.m.q).getLayoutParams();
                        layoutParams2.getClass();
                        ((FrameLayout.LayoutParams) layoutParams2).setMargins(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    d11 d11Var2 = zf8Var.y0;
                    if (d11Var2 != null) {
                        PilotMarkerTextInputFieldView pilotMarkerTextInputFieldView = (PilotMarkerTextInputFieldView) d11Var2.q;
                        ViewGroup.LayoutParams layoutParams3 = pilotMarkerTextInputFieldView.getLayoutParams();
                        layoutParams3.getClass();
                        b61 b61Var3 = (b61) layoutParams3;
                        ((ViewGroup.MarginLayoutParams) b61Var3).leftMargin = h22VarH2.a();
                        ((ViewGroup.MarginLayoutParams) b61Var3).rightMargin = h22VarH2.b();
                        pilotMarkerTextInputFieldView.setLayoutParams(b61Var3);
                    }
                }
                break;
        }
        return sk8Var;
    }
}
