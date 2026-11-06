package io.sentry.config;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.os.Process;
import android.text.Layout;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.gestures.i;
import io.sentry.android.replay.l0;
import io.sentry.android.replay.v;
import io.sentry.android.replay.viewhierarchy.g;
import io.sentry.d5;
import io.sentry.exception.SentryHttpClientException;
import io.sentry.f6;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.h2;
import io.sentry.h5;
import io.sentry.instrumentation.file.f;
import io.sentry.instrumentation.file.h;
import io.sentry.l6;
import io.sentry.m7;
import io.sentry.n1;
import io.sentry.o;
import io.sentry.p0;
import io.sentry.protocol.d0;
import io.sentry.protocol.i0;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.protocol.u;
import io.sentry.protocol.w;
import io.sentry.util.l;
import io.sentry.util.p;
import io.sentry.v1;
import io.sentry.v2;
import io.sentry.v5;
import io.sentry.w2;
import io.sentry.w3;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.net.URLDecoder;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import o.ab6;
import o.db6;
import o.e45;
import o.fx3;
import o.gk0;
import o.hk0;
import o.i67;
import o.im3;
import o.k53;
import o.lc6;
import o.nc6;
import o.to7;
import o.u14;
import o.ua5;
import o.ub7;
import o.v56;
import o.vd5;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Boolean a;
    public static io.sentry.internal.debugmeta.c b;

    public static Field A(g1 g1Var, String str) {
        try {
            Field declaredField = Class.forName(str).getDeclaredField("tag");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception unused) {
            g1Var.g(f6.WARNING, fx3.g("Could not load ", str, ".tag field"), new Object[0]);
            return null;
        }
    }

    public static io.sentry.util.network.b B(String str, String str2, boolean z, g1 g1Var) {
        if (str.isEmpty()) {
            return null;
        }
        if (str2 != null) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("application/x-www-form-urlencoded")) {
                try {
                    HashMap map = new HashMap();
                    for (String str3 : str.split("&", -1)) {
                        int iIndexOf = str3.indexOf("=");
                        if (iIndexOf > 0) {
                            String strDecode = URLDecoder.decode(str3.substring(0, iIndexOf), "UTF-8");
                            String strDecode2 = iIndexOf < str3.length() + (-1) ? URLDecoder.decode(str3.substring(iIndexOf + 1), "UTF-8") : "";
                            if (map.containsKey(strDecode)) {
                                Object obj = map.get(strDecode);
                                if (obj instanceof List) {
                                    ((List) obj).add(strDecode2);
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((String) obj);
                                    arrayList.add(strDecode2);
                                    map.put(strDecode, arrayList);
                                }
                            } else {
                                map.put(strDecode, strDecode2);
                            }
                        }
                    }
                    return new io.sentry.util.network.b(map, z ? Collections.singletonList(io.sentry.util.network.a.TEXT_TRUNCATED) : null);
                } catch (UnsupportedEncodingException e) {
                    g1Var.g(f6.WARNING, "Failed to parse form data: " + e.getMessage(), new Object[0]);
                    return new io.sentry.util.network.b((Object) null, Collections.singletonList(io.sentry.util.network.a.BODY_PARSE_ERROR));
                }
            }
            if (lowerCase.contains("application/json")) {
                try {
                    io.sentry.vendor.gson.stream.a aVar = new io.sentry.vendor.gson.stream.a(new StringReader(str));
                    try {
                        m7 m7Var = new m7((byte) 11);
                        io.sentry.util.network.d dVar = (io.sentry.util.network.d) m7Var.n;
                        Serializable serializableG = m7Var.g(aVar, 0);
                        if (serializableG == null && !z && !dVar.b && !dVar.a) {
                            io.sentry.util.network.b bVar = new io.sentry.util.network.b(null, null, -1L);
                            aVar.close();
                            return bVar;
                        }
                        io.sentry.util.network.b bVar2 = new io.sentry.util.network.b(serializableG, (z || dVar.a) ? Collections.singletonList(io.sentry.util.network.a.JSON_TRUNCATED) : dVar.b ? Collections.singletonList(io.sentry.util.network.a.INVALID_JSON) : null);
                        aVar.close();
                        return bVar2;
                    } catch (Throwable th) {
                        try {
                            aVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    g1Var.g(f6.WARNING, "Failed to parse JSON: " + e2.getMessage(), new Object[0]);
                    return new io.sentry.util.network.b((Object) null, Collections.singletonList(io.sentry.util.network.a.INVALID_JSON));
                }
            }
        }
        return new io.sentry.util.network.b(str, z ? Collections.singletonList(io.sentry.util.network.a.TEXT_TRUNCATED) : null);
    }

    public static byte[] C(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void D(h5 h5Var, io.sentry.internal.debugmeta.c cVar, g1 g1Var) {
        if (h5Var.m != null) {
            cVar.r("event_id");
            cVar.x(g1Var, h5Var.m);
        }
        cVar.r("contexts");
        cVar.x(g1Var, h5Var.n);
        if (h5Var.f198o != null) {
            cVar.r("sdk");
            cVar.x(g1Var, h5Var.f198o);
        }
        if (h5Var.p != null) {
            cVar.r("request");
            cVar.x(g1Var, h5Var.p);
        }
        AbstractMap abstractMap = h5Var.q;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            cVar.r("tags");
            cVar.x(g1Var, h5Var.q);
        }
        if (h5Var.r != null) {
            cVar.r("release");
            cVar.A(h5Var.r);
        }
        if (h5Var.s != null) {
            cVar.r("environment");
            cVar.A(h5Var.s);
        }
        if (h5Var.t != null) {
            cVar.r("platform");
            cVar.A(h5Var.t);
        }
        if (h5Var.u != null) {
            cVar.r("user");
            cVar.x(g1Var, h5Var.u);
        }
        if (h5Var.w != null) {
            cVar.r("server_name");
            cVar.A(h5Var.w);
        }
        if (h5Var.x != null) {
            cVar.r("dist");
            cVar.A(h5Var.x);
        }
        List list = h5Var.y;
        if (list != null && !list.isEmpty()) {
            cVar.r("breadcrumbs");
            cVar.x(g1Var, h5Var.y);
        }
        if (h5Var.z != null) {
            cVar.r("debug_meta");
            cVar.x(g1Var, h5Var.z);
        }
        AbstractMap abstractMap2 = h5Var.A;
        if (abstractMap2 == null || abstractMap2.isEmpty()) {
            return;
        }
        cVar.r("extra");
        cVar.x(g1Var, h5Var.A);
    }

    public static final Rect E(v56 v56Var) {
        return new Rect((int) Math.floor(v56Var.a), (int) Math.floor(v56Var.b), (int) Math.ceil(v56Var.c), (int) Math.ceil(v56Var.d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void F(View view, g gVar, l6 l6Var, g1 g1Var, List list) {
        LayoutNode root;
        l6Var.getClass();
        g1Var.getClass();
        if (view instanceof ViewGroup) {
            u14 u14Var = io.sentry.android.replay.viewhierarchy.b.a;
            if (ub7.Q(view.getClass().getName(), "AndroidComposeView", false)) {
                try {
                    Owner owner = view instanceof Owner ? (Owner) view : null;
                    if (owner != null && (root = owner.getRoot()) != null) {
                        io.sentry.android.replay.viewhierarchy.b.b(root, gVar, true, l6Var, g1Var);
                        return;
                    }
                } catch (Throwable th) {
                    g1Var.b(f6.ERROR, th, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
                    if ("true".equalsIgnoreCase(System.getProperty("io.sentry.replay.compose.fail-fast"))) {
                        throw th;
                    }
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    viewGroup.indexOfChild(childAt);
                    g gVarM = m(childAt, gVar, l6Var);
                    arrayList.add(gVarM);
                    if (list != null && (gVarM instanceof io.sentry.android.replay.viewhierarchy.e) && gVarM.e) {
                        list.add(gVarM);
                    }
                    F(childAt, gVarM, l6Var, g1Var, list);
                }
            }
            gVar.g = arrayList;
        }
    }

    public static String a(String str) {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new BigInteger("10".concat(str), 16).toByteArray());
            byteBufferWrap.get();
            return String.format("%08x-%04x-%04x-%04x-%04x%08x", Integer.valueOf(byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN).getInt()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.getShort()), Short.valueOf(byteBufferWrap.order(ByteOrder.BIG_ENDIAN).getShort()), Short.valueOf(byteBufferWrap.getShort()), Integer.valueOf(byteBufferWrap.getInt()));
        } catch (NumberFormatException | BufferUnderflowException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0176  */
    /* JADX WARN: Code duplicated, block: B:7:0x0093  */
    public static void b(n1 n1Var, ab6 ab6Var, lc6 lc6Var) {
        LinkedHashMap linkedHashMapS;
        LinkedHashMap linkedHashMapS2;
        ab6Var.getClass();
        lc6Var.getClass();
        k53 k53Var = lc6Var.r;
        o oVarS = io.sentry.util.b.s(ab6Var.a.i, n1Var.l().getDataCollectionResolver());
        io.sentry.protocol.o oVar = new io.sentry.protocol.o();
        oVar.m = "SentryOkHttpInterceptor";
        StringBuilder sb = new StringBuilder("HTTP Client Error with status code: ");
        int i = lc6Var.p;
        sb.append(i);
        v5 v5Var = new v5(new io.sentry.exception.a(oVar, new SentryHttpClientException(sb.toString()), Thread.currentThread(), true));
        p0 p0Var = new p0();
        p0Var.d(ab6Var, "okHttp:request");
        p0Var.d(lc6Var, "okHttp:response");
        r rVar = new r();
        rVar.m = (String) oVarS.b;
        rVar.f245o = (String) oVarS.c;
        rVar.v = (String) oVarS.d;
        k53 k53Var2 = ab6Var.c;
        String strA = k53Var2.a("Cookie");
        g7 g7VarL = n1Var.l();
        List list = io.sentry.util.c.a;
        if (g7VarL.getDataCollectionResolver().b()) {
            w2 w2VarA = g7VarL.getDataCollectionResolver().a();
            if (strA == null || w2VarA.a == v2.OFF) {
                strA = null;
            } else {
                String[] strArrSplit = strA.split(";", -1);
                StringBuilder sb2 = new StringBuilder();
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    if (i2 > 0) {
                        sb2.append(';');
                    }
                    sb2.append(io.sentry.util.c.a(strArrSplit[i2], w2VarA));
                }
                strA = sb2.toString();
            }
        } else if (!g7VarL.isSendDefaultPii()) {
            strA = null;
        }
        rVar.q = strA;
        rVar.n = ab6Var.b;
        if (n1Var.l().getDataCollectionResolver().b()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = k53Var2.size();
            for (int i3 = 0; i3 < size; i3++) {
                linkedHashMap.put(i67.j(k53Var2, i3), i67.l(k53Var2, i3));
            }
            w2 w2Var = (w2) n1Var.l().getDataCollectionResolver().a.getDataCollection().g.n;
            if (w2Var == null) {
                w2Var = new w2(v2.DENY_LIST, Arrays.asList(new String[0]));
            }
            linkedHashMapS = new LinkedHashMap(io.sentry.util.d.b(linkedHashMap, w2Var));
        } else {
            linkedHashMapS = s(n1Var, k53Var2);
        }
        rVar.r = io.sentry.util.b.r(linkedHashMapS);
        db6 db6Var = ab6Var.d;
        Long lValueOf = db6Var != null ? Long.valueOf(db6Var.a()) : null;
        if (lValueOf != null && lValueOf.longValue() != -1) {
            rVar.t = Long.valueOf(lValueOf.longValue());
        }
        s sVar = new s();
        String strA2 = k53Var.a("Set-Cookie");
        g7 g7VarL2 = n1Var.l();
        if (g7VarL2.getDataCollectionResolver().b()) {
            w2 w2VarA2 = g7VarL2.getDataCollectionResolver().a();
            if (strA2 == null || w2VarA2.a == v2.OFF) {
                strA2 = null;
            } else {
                int iIndexOf = strA2.indexOf(59);
                String strSubstring = iIndexOf < 0 ? strA2 : strA2.substring(0, iIndexOf);
                strA2 = io.sentry.util.c.b(strSubstring) ? io.sentry.util.c.a(strSubstring, w2VarA2).concat(iIndexOf < 0 ? "" : strA2.substring(iIndexOf)) : "[Filtered]";
            }
        } else if (!g7VarL2.isSendDefaultPii()) {
            strA2 = null;
        }
        sVar.m = strA2;
        if (n1Var.l().getDataCollectionResolver().b()) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int size2 = k53Var.size();
            for (int i4 = 0; i4 < size2; i4++) {
                linkedHashMap2.put(i67.j(k53Var, i4), i67.l(k53Var, i4));
            }
            w2 w2Var2 = (w2) n1Var.l().getDataCollectionResolver().a.getDataCollection().g.f205o;
            if (w2Var2 == null) {
                w2Var2 = new w2(v2.DENY_LIST, Arrays.asList(new String[0]));
            }
            linkedHashMapS2 = new LinkedHashMap(io.sentry.util.d.b(linkedHashMap2, w2Var2));
        } else {
            linkedHashMapS2 = s(n1Var, k53Var);
        }
        sVar.n = io.sentry.util.b.r(linkedHashMapS2);
        sVar.f246o = Integer.valueOf(i);
        nc6 nc6Var = lc6Var.s;
        Long lValueOf2 = nc6Var != null ? Long.valueOf(nc6Var.j()) : null;
        if (lValueOf2 != null && lValueOf2.longValue() != -1) {
            sVar.p = Long.valueOf(lValueOf2.longValue());
        }
        v5Var.p = rVar;
        v5Var.n.u(sVar);
        n1Var.B(v5Var, p0Var);
    }

    public static FileInputStream c(File file, FileInputStream fileInputStream) {
        return d5.c().l().isTracingEnabled() ? new f(f.e(file, fileInputStream)) : fileInputStream;
    }

    public static FileInputStream d(FileInputStream fileInputStream, FileDescriptor fileDescriptor) {
        if (!d5.c().l().isTracingEnabled()) {
            return fileInputStream;
        }
        v1 v1VarM = l.a ? d5.c().m() : d5.c().g();
        return new f(new io.sentry.instrumentation.file.c(null, v1VarM != null ? v1VarM.s("file.read") : null, fileInputStream, d5.c().l()), fileDescriptor);
    }

    public static FileInputStream e(FileInputStream fileInputStream, String str) {
        if (d5.c().l().isTracingEnabled()) {
            return new f(f.e(str != null ? new File(str) : null, fileInputStream));
        }
        return fileInputStream;
    }

    public static FileOutputStream f(File file, FileOutputStream fileOutputStream, boolean z) {
        return d5.c().l().isTracingEnabled() ? new h(h.e(file, fileOutputStream, z)) : fileOutputStream;
    }

    public static FileOutputStream g(FileOutputStream fileOutputStream, File file) {
        return d5.c().l().isTracingEnabled() ? new h(h.e(file, fileOutputStream, false)) : fileOutputStream;
    }

    public static o h(Object obj, Long l, boolean z, io.sentry.util.network.e eVar, List list, h2 h2Var) {
        LinkedHashMap linkedHashMapE;
        io.sentry.util.network.b bVarExtract = z ? eVar.extract(obj) : null;
        if ((l == null || l.longValue() == -1) && bVarExtract != null) {
            long j = bVarExtract.b;
            if (j >= 0) {
                l = Long.valueOf(j);
            }
        }
        switch (h2Var.m) {
            case 24:
                ab6 ab6Var = (ab6) obj;
                ab6Var.getClass();
                linkedHashMapE = io.sentry.okhttp.g.e(ab6Var.c);
                break;
            default:
                lc6 lc6Var = (lc6) obj;
                lc6Var.getClass();
                linkedHashMapE = io.sentry.okhttp.g.e(lc6Var.r);
                break;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                hashSet.add(str.toLowerCase(Locale.ROOT));
            }
        }
        for (Map.Entry entry : linkedHashMapE.entrySet()) {
            if (hashSet.contains(((String) entry.getKey()).toLowerCase(Locale.ROOT))) {
                linkedHashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return new o(l, bVarExtract, linkedHashMap, (byte) 9);
    }

    public static boolean i(h5 h5Var, String str, w3 w3Var, g1 g1Var) {
        byte b2 = 8;
        byte b3 = 2;
        byte b4 = 0;
        switch (str) {
            case "debug_meta":
                h5Var.z = (io.sentry.protocol.f) w3Var.q0(g1Var, new io.sentry.clientreport.a(b2));
                return true;
            case "server_name":
                h5Var.w = w3Var.H();
                return true;
            case "contexts":
                h5Var.n.m(io.sentry.clientreport.a.c(w3Var, g1Var));
                return true;
            case "environment":
                h5Var.s = w3Var.H();
                return true;
            case "breadcrumbs":
                h5Var.y = w3Var.B0(g1Var, new io.sentry.g(b4));
                return true;
            case "sdk":
                h5Var.f198o = (u) w3Var.q0(g1Var, new io.sentry.clientreport.a((byte) 21));
                return true;
            case "dist":
                h5Var.x = w3Var.H();
                return true;
            case "tags":
                h5Var.q = io.sentry.util.b.r((Map) w3Var.t0());
                return true;
            case "user":
                h5Var.u = (i0) w3Var.q0(g1Var, new d0(b3));
                return true;
            case "extra":
                h5Var.A = io.sentry.util.b.r((Map) w3Var.t0());
                return true;
            case "event_id":
                h5Var.m = (w) w3Var.q0(g1Var, new io.sentry.clientreport.a((byte) 23));
                return true;
            case "release":
                h5Var.r = w3Var.H();
                return true;
            case "request":
                h5Var.p = (r) w3Var.q0(g1Var, new io.sentry.clientreport.a((byte) 19));
                return true;
            case "platform":
                h5Var.t = w3Var.H();
                return true;
            default:
                return false;
        }
    }

    public static BigDecimal j(double d) {
        return BigDecimal.valueOf(d).setScale(6, RoundingMode.DOWN);
    }

    public static io.sentry.internal.gestures.c k(SentryAndroidOptions sentryAndroidOptions, View view, float f, float f2, io.sentry.internal.gestures.b bVar) {
        float f3;
        List<io.sentry.internal.gestures.a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new i(view, f, f2));
        io.sentry.internal.gestures.c cVar = null;
        while (!arrayDeque.isEmpty()) {
            i iVar = (i) arrayDeque.poll();
            View view2 = iVar.a;
            float f4 = iVar.c;
            float f5 = iVar.b;
            int width = view2.getWidth();
            int height = view2.getHeight();
            if (f5 < 0.0f || f5 > width || f4 < 0.0f || f4 > height) {
                cVar = cVar;
            } else {
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int scrollX = viewGroup.getScrollX();
                    int scrollY = viewGroup.getScrollY();
                    int i = 0;
                    while (i < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt != null) {
                            float left = (scrollX + f5) - childAt.getLeft();
                            float top = (scrollY + f4) - childAt.getTop();
                            Matrix matrix = childAt.getMatrix();
                            if (matrix == null || matrix.isIdentity()) {
                                f3 = f5;
                            } else {
                                f3 = f5;
                                Matrix matrix2 = new Matrix();
                                if (matrix.invert(matrix2)) {
                                    float[] fArr = {left, top};
                                    matrix2.mapPoints(fArr);
                                    float f6 = fArr[0];
                                    top = fArr[1];
                                    left = f6;
                                }
                            }
                            arrayDeque.add(new i(childAt, left, top));
                        } else {
                            f3 = f5;
                        }
                        i++;
                        cVar = cVar;
                        f5 = f3;
                    }
                }
                cVar = cVar;
                for (int i2 = 0; i2 < gestureTargetLocators.size(); i2++) {
                    io.sentry.internal.gestures.c cVarA = gestureTargetLocators.get(i2).a(view2, f, f2, bVar);
                    if (cVarA != null) {
                        if (bVar == io.sentry.internal.gestures.b.CLICKABLE) {
                            cVar = cVarA;
                        } else if (bVar == io.sentry.internal.gestures.b.SCROLLABLE) {
                            return cVarA;
                        }
                    }
                }
            }
        }
        return cVar;
    }

    public static io.sentry.util.network.b l(byte[] bArr, String str, String str2, g1 g1Var) {
        if (bArr.length != 0) {
            boolean z = bArr.length > 153600;
            long length = bArr.length;
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                if (lowerCase.contains("image/") || lowerCase.contains("video/") || lowerCase.contains("audio/") || lowerCase.contains("application/octet-stream") || lowerCase.contains("application/pdf") || lowerCase.contains("application/zip") || lowerCase.contains("application/gzip")) {
                    return new io.sentry.util.network.b("[Binary data, " + bArr.length + " bytes, type: " + str + "]", null, length);
                }
            }
            try {
                io.sentry.util.network.b bVarB = B(new String(bArr, 0, Math.min(bArr.length, 153600), str2), str, z, g1Var);
                if (bVarB != null) {
                    return new io.sentry.util.network.b(bVarB.c, (List) bVarB.d, length);
                }
            } catch (UnsupportedEncodingException e) {
                g1Var.g(f6.WARNING, "Failed to decode bytes: " + e.getMessage(), new Object[0]);
                return new io.sentry.util.network.b(to7.l(new StringBuilder("[Failed to decode bytes, "), bArr.length, " bytes]"), Collections.singletonList(io.sentry.util.network.a.BODY_PARSE_ERROR), length);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01de  */
    /* JADX WARN: Code duplicated, block: B:132:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:57:0x0107 A[LOOP:0: B:53:0x00fa->B:57:0x0107, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122 A[LOOP:1: B:59:0x0114->B:63:0x0122, LOOP_END] */
    public static g m(View view, g gVar, l6 l6Var) {
        vd5 vd5Var;
        boolean z;
        boolean z2;
        Drawable drawable;
        Bitmap bitmap;
        int extendedPaddingTop;
        Object tag;
        String str;
        Class<?> superclass;
        CopyOnWriteArraySet copyOnWriteArraySet;
        Class<?> superclass2;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        String lowerCase;
        l6Var.getClass();
        if (view.isAttachedToWindow() && view.getWindowVisibility() == 0) {
            Object parent = view;
            while (true) {
                if (!(parent instanceof View)) {
                    Rect rect = new Rect();
                    vd5Var = new vd5(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
                    break;
                }
                float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
                View view2 = (View) parent;
                if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                    vd5Var = new vd5(Boolean.FALSE, null);
                    break;
                }
                parent = view2.getParent();
            }
        } else {
            vd5Var = new vd5(Boolean.FALSE, null);
        }
        boolean zBooleanValue = ((Boolean) vd5Var.m).booleanValue();
        Rect rect2 = (Rect) vd5Var.n;
        if (zBooleanValue) {
            Object tag2 = view.getTag();
            String str2 = tag2 instanceof String ? (String) tag2 : null;
            if (str2 != null) {
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (ub7.Q(lowerCase2, "sentry-unmask", false)) {
                    l6Var.C();
                    z = false;
                } else {
                    if (im3.n(view.getTag(R.id.sentry_privacy), "unmask")) {
                        l6Var.C();
                    } else {
                        tag = view.getTag();
                        if (tag instanceof String) {
                            str = (String) tag;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (ub7.Q(lowerCase, "sentry-mask", false)) {
                                l6Var.C();
                            } else if (im3.n(view.getTag(R.id.sentry_privacy), "mask")) {
                                l6Var.C();
                            } else {
                                if (view.getParent() != null) {
                                    view.getParent().getClass();
                                }
                                superclass = view.getClass();
                                copyOnWriteArraySet = (CopyOnWriteArraySet) l6Var.b;
                                while (true) {
                                    if (superclass != null) {
                                        superclass2 = view.getClass();
                                        copyOnWriteArraySet2 = (CopyOnWriteArraySet) l6Var.a;
                                        while (true) {
                                            if (superclass2 != null) {
                                                if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                    superclass2 = superclass2.getSuperclass();
                                                }
                                            }
                                        }
                                    } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                        superclass = superclass.getSuperclass();
                                    }
                                }
                            }
                            z = true;
                        } else {
                            if (im3.n(view.getTag(R.id.sentry_privacy), "mask")) {
                                l6Var.C();
                            } else {
                                if (view.getParent() != null) {
                                    view.getParent().getClass();
                                }
                                superclass = view.getClass();
                                copyOnWriteArraySet = (CopyOnWriteArraySet) l6Var.b;
                                while (true) {
                                    if (superclass != null) {
                                        superclass2 = view.getClass();
                                        copyOnWriteArraySet2 = (CopyOnWriteArraySet) l6Var.a;
                                        while (true) {
                                            if (superclass2 != null) {
                                                if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                    superclass2 = superclass2.getSuperclass();
                                                }
                                            }
                                        }
                                    } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                        superclass = superclass.getSuperclass();
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                    z = false;
                }
            } else {
                if (im3.n(view.getTag(R.id.sentry_privacy), "unmask")) {
                    l6Var.C();
                } else {
                    tag = view.getTag();
                    if (tag instanceof String) {
                        str = (String) tag;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        lowerCase = str.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (ub7.Q(lowerCase, "sentry-mask", false)) {
                            l6Var.C();
                        } else if (im3.n(view.getTag(R.id.sentry_privacy), "mask")) {
                            l6Var.C();
                        } else {
                            if (view.getParent() != null) {
                                view.getParent().getClass();
                            }
                            superclass = view.getClass();
                            copyOnWriteArraySet = (CopyOnWriteArraySet) l6Var.b;
                            while (true) {
                                if (superclass != null) {
                                    superclass2 = view.getClass();
                                    copyOnWriteArraySet2 = (CopyOnWriteArraySet) l6Var.a;
                                    while (true) {
                                        if (superclass2 != null) {
                                            if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                superclass2 = superclass2.getSuperclass();
                                            }
                                        }
                                    }
                                } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                    superclass = superclass.getSuperclass();
                                }
                            }
                        }
                        z = true;
                    } else {
                        if (im3.n(view.getTag(R.id.sentry_privacy), "mask")) {
                            l6Var.C();
                        } else {
                            if (view.getParent() != null) {
                                view.getParent().getClass();
                            }
                            superclass = view.getClass();
                            copyOnWriteArraySet = (CopyOnWriteArraySet) l6Var.b;
                            while (true) {
                                if (superclass != null) {
                                    superclass2 = view.getClass();
                                    copyOnWriteArraySet2 = (CopyOnWriteArraySet) l6Var.a;
                                    while (true) {
                                        if (superclass2 != null) {
                                            if (copyOnWriteArraySet2.contains(superclass2.getName())) {
                                                superclass2 = superclass2.getSuperclass();
                                            }
                                        }
                                    }
                                } else if (copyOnWriteArraySet.contains(superclass.getName())) {
                                    superclass = superclass.getSuperclass();
                                }
                            }
                        }
                        z = true;
                    }
                }
                z = false;
            }
        } else {
            z = false;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            m7 m7Var = layout != null ? new m7((Object) layout, (byte) 2) : null;
            int currentTextColor = textView.getCurrentTextColor() | (-16777216);
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            try {
                extendedPaddingTop = textView.getTotalPaddingTop();
            } catch (NullPointerException unused) {
                extendedPaddingTop = textView.getExtendedPaddingTop();
            }
            textView.getX();
            textView.getY();
            float f = 0.0f;
            int width = textView.getWidth();
            int i = extendedPaddingTop;
            int height = textView.getHeight();
            if (gVar != null) {
                f = gVar.c;
            }
            return new io.sentry.android.replay.viewhierarchy.f(m7Var, Integer.valueOf(currentTextColor), totalPaddingLeft, i, width, height, textView.getElevation() + f, gVar, z, zBooleanValue, rect2);
        }
        boolean z3 = z;
        if (!(view instanceof ImageView)) {
            if (!(view instanceof SurfaceView)) {
                view.getX();
                view.getY();
                return new io.sentry.android.replay.viewhierarchy.c(view.getWidth(), view.getHeight(), (gVar != null ? gVar.c : 0.0f) + view.getElevation(), gVar, z3, zBooleanValue, rect2);
            }
            WeakReference weakReference = new WeakReference(view);
            SurfaceView surfaceView = (SurfaceView) view;
            surfaceView.getX();
            surfaceView.getY();
            return new io.sentry.android.replay.viewhierarchy.e(weakReference, surfaceView.getWidth(), surfaceView.getHeight(), surfaceView.getElevation() + (gVar != null ? gVar.c : 0.0f), gVar, z3, zBooleanValue, rect2);
        }
        ImageView imageView = (ImageView) view;
        imageView.getX();
        imageView.getY();
        int width2 = imageView.getWidth();
        int height2 = imageView.getHeight();
        float elevation = imageView.getElevation() + (gVar != null ? gVar.c : 0.0f);
        if (!z3 || (drawable = imageView.getDrawable()) == null) {
            z2 = false;
        } else {
            if (!(drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) && (!(drawable instanceof BitmapDrawable) || ((bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10))) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return new io.sentry.android.replay.viewhierarchy.d(width2, height2, elevation, gVar, z2, zBooleanValue, rect2);
    }

    public static String n() {
        byte[] bArr = new byte[16];
        p.a().b(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        byte b3 = (byte) (bArr[8] & 63);
        bArr[8] = b3;
        bArr[8] = (byte) (b3 | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return io.sentry.util.s.b(new UUID(j2, j));
    }

    public static String o(Object obj) {
        if (obj == null) {
            return null;
        }
        String canonicalName = obj.getClass().getCanonicalName();
        return canonicalName != null ? canonicalName : obj.getClass().getSimpleName();
    }

    public static Date p(String str) {
        try {
            return new Date(io.sentry.vendor.a.i(str));
        } catch (IllegalArgumentException unused) {
            hk0.g(ua5.m("timestamp is not ISO format ", str));
            return null;
        }
    }

    public static Date q(String str) {
        try {
            return new Date(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            hk0.g(ua5.m("timestamp is not millis format ", str));
            return null;
        }
    }

    public static io.sentry.internal.debugmeta.c r() {
        Method declaredMethod;
        io.sentry.internal.debugmeta.c cVar = b;
        if (cVar != null) {
            return cVar;
        }
        Method method = null;
        try {
            declaredMethod = LayoutNode.class.getDeclaredMethod("getChildren$ui_release", null);
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            declaredMethod = null;
        }
        try {
            Method declaredMethod2 = LayoutNode.class.getDeclaredMethod("getOuterCoordinator$ui_release", null);
            declaredMethod2.setAccessible(true);
            method = declaredMethod2;
        } catch (NoSuchMethodException unused2) {
        }
        io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c(declaredMethod, method);
        b = cVar2;
        return cVar2;
    }

    public static LinkedHashMap s(n1 n1Var, k53 k53Var) {
        if (!n1Var.l().isSendDefaultPii()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = k53Var.size();
        for (int i = 0; i < size; i++) {
            String strJ = i67.j(k53Var, i);
            if (!io.sentry.util.d.a.contains(strJ.toUpperCase(Locale.ROOT))) {
                linkedHashMap.put(strJ, i67.l(k53Var, i));
            }
        }
        return linkedHashMap;
    }

    public static final Window t(View view) throws IllegalAccessException {
        Field field;
        view.getClass();
        u14 u14Var = l0.a;
        View rootView = view.getRootView();
        rootView.getClass();
        Class cls = (Class) l0.a.getValue();
        if (cls == null || !cls.isInstance(rootView) || (field = (Field) l0.b.getValue()) == null) {
            return null;
        }
        Object obj = field.get(rootView);
        obj.getClass();
        return (Window) obj;
    }

    public static String u(View view) {
        int id = view.getId();
        if (id != -1 && (((-16777216) & id) != 0 || (16777215 & id) == 0)) {
            Resources resources = view.getContext().getResources();
            if (resources == null) {
                return "";
            }
            try {
                return resources.getResourceEntryName(id);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    public static boolean w(Context context) {
        io.sentry.util.b.v(context, "The application context is required.");
        return context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    public static final boolean x(io.sentry.android.replay.w wVar, io.sentry.android.replay.w wVar2) {
        wVar.getClass();
        wVar2.getClass();
        switch (v.a[wVar.ordinal()]) {
            case 1:
                return wVar2 == io.sentry.android.replay.w.STARTED || wVar2 == io.sentry.android.replay.w.CLOSED;
            case 2:
                return wVar2 == io.sentry.android.replay.w.PAUSED || wVar2 == io.sentry.android.replay.w.STOPPED || wVar2 == io.sentry.android.replay.w.CLOSED;
            case 3:
                return wVar2 == io.sentry.android.replay.w.PAUSED || wVar2 == io.sentry.android.replay.w.STOPPED || wVar2 == io.sentry.android.replay.w.CLOSED;
            case 4:
                return wVar2 == io.sentry.android.replay.w.RESUMED || wVar2 == io.sentry.android.replay.w.STOPPED || wVar2 == io.sentry.android.replay.w.CLOSED;
            case 5:
                return wVar2 == io.sentry.android.replay.w.STARTED || wVar2 == io.sentry.android.replay.w.CLOSED;
            default:
                gk0.s();
            case 6:
                return false;
        }
    }

    public static boolean z(LayoutNode layoutNode) throws IllegalAccessException, InvocationTargetException {
        Boolean bool = a;
        Boolean bool2 = Boolean.FALSE;
        if (im3.n(bool, bool2)) {
            return layoutNode.getOuterCoordinator$ui().j1();
        }
        if (im3.n(bool, Boolean.TRUE)) {
            Method method = (Method) r().f205o;
            method.getClass();
            Object objInvoke = method.invoke(layoutNode, null);
            objInvoke.getClass();
            return ((e45) objInvoke).j1();
        }
        if (bool != null) {
            gk0.s();
            return false;
        }
        try {
            boolean zJ1 = layoutNode.getOuterCoordinator$ui().j1();
            a = bool2;
            return zJ1;
        } catch (NoSuchMethodError unused) {
            a = Boolean.TRUE;
            Method method2 = (Method) r().f205o;
            method2.getClass();
            Object objInvoke2 = method2.invoke(layoutNode, null);
            objInvoke2.getClass();
            return ((e45) objInvoke2).j1();
        }
    }

    public int v() {
        return -1;
    }

    public boolean y() {
        return false;
    }
}
