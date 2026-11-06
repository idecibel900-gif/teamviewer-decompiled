package o;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PointF;
import android.util.Log;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.teamviewer.teamviewerlib.event.EventHub;
import com.teamviewer.teamviewerlib.swig.tvshared.EventType;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fp1 {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public fp1(io.sentry.android.replay.screenshot.k kVar, ty4 ty4Var, fi1 fi1Var, d22 d22Var, ed8 ed8Var, h60 h60Var, rp1 rp1Var, q48 q48Var, List list) {
        ty4Var.getClass();
        fi1Var.getClass();
        ed8Var.getClass();
        h60Var.getClass();
        list.getClass();
        this.a = kVar;
        this.b = ty4Var;
        this.c = fi1Var;
        this.d = d22Var;
        this.e = ed8Var;
        this.f = h60Var;
        this.g = rp1Var;
        this.h = new q48(this, q48Var, list, "Deserializer for \"" + fi1Var.getName() + '\"', rp1Var != null ? rp1Var.d() : "[container not found]");
        this.i = new vo4(this);
    }

    public fp1 a(fi1 fi1Var, List list, ty4 ty4Var, d22 d22Var, ed8 ed8Var, h60 h60Var) {
        list.getClass();
        ty4Var.getClass();
        ed8Var.getClass();
        h60Var.getClass();
        io.sentry.android.replay.screenshot.k kVar = (io.sentry.android.replay.screenshot.k) this.a;
        int i = h60Var.b;
        if ((i != 1 || h60Var.c < 4) && i <= 1) {
            ed8Var = (ed8) this.e;
        }
        return new fp1(kVar, ty4Var, fi1Var, d22Var, ed8Var, h60Var, (rp1) this.g, (q48) this.h, list);
    }

    public void c(final u00 u00Var, int i) {
        byte[] bArr;
        long j;
        e00 e00Var;
        String str;
        e00 e00Var2;
        int i2;
        jw jwVarL;
        String str2;
        Integer numValueOf;
        io.sentry.android.core.d dVar;
        final fp1 fp1Var = this;
        final u00 u00Var2 = u00Var;
        byte[] bArr2 = u00Var2.b;
        tg6 tg6Var = (tg6) fp1Var.f;
        g28 g28VarA = ((zq4) fp1Var.b).a(u00Var2.a);
        long jMax = 0;
        while (true) {
            final byte b = 0;
            if (!((Boolean) tg6Var.F(new jh7(fp1Var) { // from class: o.v98
                public final /* synthetic */ fp1 n;

                {
                    this.n = fp1Var;
                }

                @Override // o.jh7
                public final Object f() {
                    Boolean bool;
                    byte b2 = b;
                    u00 u00Var3 = u00Var2;
                    fp1 fp1Var2 = this.n;
                    switch (b2) {
                        case 0:
                            tg6 tg6Var2 = (tg6) fp1Var2.c;
                            SQLiteDatabase sQLiteDatabaseE = tg6Var2.e();
                            sQLiteDatabaseE.beginTransaction();
                            try {
                                Long lJ = tg6.j(sQLiteDatabaseE, u00Var3);
                                if (lJ == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = tg6Var2.e().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lJ.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseE.setTransactionSuccessful();
                                sQLiteDatabaseE.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseE.endTransaction();
                                throw th2;
                            }
                        default:
                            tg6 tg6Var3 = (tg6) fp1Var2.c;
                            tg6Var3.getClass();
                            return (Iterable) tg6Var3.q(new io.sentry.q7(tg6Var3, u00Var3, (byte) 25));
                    }
                }
            })).booleanValue()) {
                tg6Var.F(new g21(jMax, fp1Var, u00Var2));
                return;
            }
            final byte b2 = 1;
            final Iterable iterable = (Iterable) tg6Var.F(new jh7(fp1Var) { // from class: o.v98
                public final /* synthetic */ fp1 n;

                {
                    this.n = fp1Var;
                }

                @Override // o.jh7
                public final Object f() {
                    Boolean bool;
                    byte b3 = b2;
                    u00 u00Var3 = u00Var2;
                    fp1 fp1Var2 = this.n;
                    switch (b3) {
                        case 0:
                            tg6 tg6Var2 = (tg6) fp1Var2.c;
                            SQLiteDatabase sQLiteDatabaseE = tg6Var2.e();
                            sQLiteDatabaseE.beginTransaction();
                            try {
                                Long lJ = tg6.j(sQLiteDatabaseE, u00Var3);
                                if (lJ == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = tg6Var2.e().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lJ.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseE.setTransactionSuccessful();
                                sQLiteDatabaseE.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseE.endTransaction();
                                throw th2;
                            }
                        default:
                            tg6 tg6Var3 = (tg6) fp1Var2.c;
                            tg6Var3.getClass();
                            return (Iterable) tg6Var3.q(new io.sentry.q7(tg6Var3, u00Var3, (byte) 25));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (g28VarA == null) {
                ep1.o("Uploader", "Unknown backend for %s, deleting event batch for it...", u00Var2);
                e00Var2 = new e00(3, -1L);
                bArr = bArr2;
                j = jMax;
            } else {
                ArrayList<k00> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((q00) it.next()).c);
                }
                if (bArr2 != null) {
                    tg6 tg6Var2 = (tg6) fp1Var.i;
                    Objects.requireNonNull(tg6Var2);
                    ot0 ot0Var = (ot0) tg6Var.F(new t98(tg6Var2, b));
                    d11 d11Var = new d11();
                    d11Var.r = new HashMap();
                    d11Var.p = Long.valueOf(((du0) fp1Var.g).a());
                    d11Var.q = Long.valueOf(((du0) fp1Var.h).a());
                    d11Var.m = "GDT_CLIENT_METRICS";
                    ta2 ta2Var = new ta2("proto");
                    ot0Var.getClass();
                    d11Var.f578o = new sa2(ta2Var, rw5.a.encode(ot0Var));
                    arrayList.add(((hm0) g28VarA).a(d11Var.k()));
                }
                hm0 hm0Var = (hm0) g28VarA;
                HashMap map = new HashMap();
                for (k00 k00Var : arrayList) {
                    String str3 = k00Var.a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(k00Var);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(k00Var);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    k00 k00Var2 = (k00) ((List) entry.getValue()).get(0);
                    vx5 vx5Var = vx5.m;
                    long jA = hm0Var.f.a();
                    long jA2 = hm0Var.e.a();
                    g00 g00Var = new g00(new d00(Integer.valueOf(k00Var2.b("sdk-version")), k00Var2.a("model"), k00Var2.a("hardware"), k00Var2.a("device"), k00Var2.a("product"), k00Var2.a("os-uild"), k00Var2.a("manufacturer"), k00Var2.a("fingerprint"), k00Var2.a("locale"), k00Var2.a("country"), k00Var2.a("mcc_mnc"), k00Var2.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (k00 k00Var3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        sa2 sa2Var = k00Var3.c;
                        ta2 ta2Var2 = sa2Var.a;
                        byte[] bArr4 = sa2Var.b;
                        long j2 = jMax;
                        if (ta2Var2.equals(new ta2("proto"))) {
                            dVar = new io.sentry.android.core.d();
                            dVar.p = bArr4;
                        } else {
                            if (ta2Var2.equals(new ta2("json"))) {
                                String str4 = new String(bArr4, Charset.forName("UTF-8"));
                                io.sentry.android.core.d dVar2 = new io.sentry.android.core.d();
                                dVar2.q = str4;
                                dVar = dVar2;
                            } else if (Log.isLoggable("TRuntime.CctTransportBackend", 5)) {
                                io.sentry.android.core.v0.j("TRuntime.CctTransportBackend", "Received event of unsupported encoding " + ta2Var2 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                        dVar.m = Long.valueOf(k00Var3.d);
                        dVar.f100o = Long.valueOf(k00Var3.e);
                        String str5 = (String) k00Var3.f.get("tz-offset");
                        dVar.r = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        dVar.s = new p00((n25) n25.m.get(k00Var3.b("net-type")), (m25) m25.m.get(k00Var3.b("mobile-subtype")));
                        Integer num = k00Var3.b;
                        if (num != null) {
                            dVar.n = num;
                        }
                        String strConcat = ((Long) dVar.m) == null ? " eventTimeMs" : "";
                        if (((Long) dVar.f100o) == null) {
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (((Long) dVar.r) == null) {
                            strConcat = strConcat.concat(" timezoneOffsetSeconds");
                        }
                        if (!strConcat.isEmpty()) {
                            hk0.l("Missing required properties:".concat(strConcat));
                            return;
                        } else {
                            arrayList4.add(new m00(((Long) dVar.m).longValue(), (Integer) dVar.n, ((Long) dVar.f100o).longValue(), (byte[]) dVar.p, (String) dVar.q, ((Long) dVar.r).longValue(), (p00) dVar.s));
                            bArr2 = bArr3;
                            jMax = j2;
                        }
                    }
                    arrayList3.add(new n00(jA, jA2, g00Var, numValueOf, str2, arrayList4));
                }
                bArr = bArr2;
                j = jMax;
                f00 f00Var = new f00(arrayList3);
                URL urlB = hm0Var.d;
                if (bArr != null) {
                    try {
                        ci0 ci0VarA = ci0.a(bArr);
                        String str6 = ci0VarA.b;
                        if (str6 == null) {
                            str6 = null;
                        }
                        urlB = hm0.b(ci0VarA.a);
                        str = str6;
                    } catch (IllegalArgumentException unused2) {
                        e00Var = new e00(3, -1L);
                    }
                } else {
                    str = null;
                }
                byte b3 = 3;
                try {
                    byte b4 = 14;
                    iu iuVar = new iu(urlB, f00Var, str, b4);
                    ar arVar = new ar(hm0Var, b3);
                    int i3 = 5;
                    do {
                        jwVarL = arVar.l(iuVar);
                        URL url = (URL) jwVarL.c;
                        if (url != null) {
                            ep1.o("CctTransportBackend", "Following redirect to: %s", url);
                            iuVar = new iu(url, (f00) iuVar.p, (String) iuVar.n, b4);
                        } else {
                            iuVar = null;
                        }
                        if (iuVar == null) {
                            break;
                        } else {
                            i3--;
                        }
                    } while (i3 >= 1);
                    int i4 = jwVarL.a;
                    if (i4 == 200) {
                        e00Var2 = new e00(1, jwVarL.b);
                    } else {
                        if (i4 >= 500 || i4 == 404) {
                            e00Var = new e00(2, -1L);
                        } else if (i4 == 400) {
                            try {
                                e00Var = new e00(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                ep1.p("CctTransportBackend", "Could not make request to the backend", e);
                                i2 = 2;
                                e00Var2 = new e00(2, -1L);
                            }
                        } else {
                            e00Var = new e00(3, -1L);
                        }
                        e00Var2 = e00Var;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            int i5 = e00Var2.a;
            if (i5 == i2) {
                final long j3 = j;
                tg6Var.F(new jh7() { // from class: o.w98
                    @Override // o.jh7
                    public final Object f() {
                        fp1 fp1Var2 = this.m;
                        tg6 tg6Var3 = (tg6) fp1Var2.c;
                        tg6Var3.getClass();
                        Iterable iterable2 = iterable;
                        if (iterable2.iterator().hasNext()) {
                            String strConcat2 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(tg6.G(iterable2));
                            SQLiteDatabase sQLiteDatabaseE = tg6Var3.e();
                            sQLiteDatabaseE.beginTransaction();
                            try {
                                sQLiteDatabaseE.compileStatement(strConcat2).execute();
                                Cursor cursorRawQuery = sQLiteDatabaseE.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                while (cursorRawQuery.moveToNext()) {
                                    try {
                                        tg6Var3.z(cursorRawQuery.getInt(0), ke4.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                cursorRawQuery.close();
                                sQLiteDatabaseE.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                sQLiteDatabaseE.setTransactionSuccessful();
                                sQLiteDatabaseE.endTransaction();
                            } catch (Throwable th2) {
                                sQLiteDatabaseE.endTransaction();
                                throw th2;
                            }
                        }
                        tg6Var3.q(new io.sentry.instrumentation.file.d(((du0) fp1Var2.g).a() + j3, u00Var));
                        return null;
                    }
                });
                ((ep3) this.d).D(u00Var, i + 1, true);
                return;
            }
            fp1Var = this;
            u00Var2 = u00Var;
            jMax = j;
            byte b5 = 27;
            tg6Var.F(new io.sentry.q7(fp1Var, iterable, b5));
            if (i5 == 1) {
                jMax = Math.max(jMax, e00Var2.b);
                if (bArr != null) {
                    tg6Var.F(new ar(fp1Var, b5));
                }
            } else if (i5 == 4) {
                HashMap map2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str7 = ((q00) it2.next()).c.a;
                    if (map2.containsKey(str7)) {
                        map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                    } else {
                        map2.put(str7, 1);
                    }
                }
                tg6Var.F(new io.sentry.q7(fp1Var, map2, (byte) 28));
            }
            bArr2 = bArr;
        }
    }

    public void d(v97 v97Var, PointF pointF) {
        na3 na3Var;
        l97 l97Var;
        v97 v97Var2;
        c1 c1Var;
        na3 na3Var2;
        l97 l97Var2;
        na3 na3Var3 = (na3) this.d;
        if (v97Var != null) {
            if (na3Var3 != null && (l97Var2 = ((a1) na3Var3).e) != null) {
                l97Var2.l(null, v97Var);
            }
            na3 na3Var4 = (na3) this.d;
            if (na3Var4 != null) {
                na3Var4.g();
            }
            na3 na3Var5 = (na3) this.d;
            if (na3Var5 != null) {
                na3Var5.b();
            }
        } else {
            if (na3Var3 != null) {
                na3Var3.g();
            }
            na3 na3Var6 = (na3) this.d;
            if (na3Var6 != null) {
                na3Var6.f(0.0f, 0.0f, 0.0f);
            }
        }
        if (pointF == null || v97Var == null || (na3Var = (na3) this.d) == null || (l97Var = ((a1) na3Var).e) == null || (v97Var2 = (v97) l97Var.getValue()) == null || (c1Var = (c1) this.e) == null) {
            return;
        }
        if (c1Var.f() && (na3Var2 = (na3) this.d) != null) {
            na3Var2.e(new PointF(v97Var2.d, v97Var2.e), v97Var.a, pointF);
        }
        c1Var.c(pointF);
    }

    public fp1(Context context, zq4 zq4Var, tg6 tg6Var, ep3 ep3Var, Executor executor, tg6 tg6Var2, du0 du0Var, du0 du0Var2, tg6 tg6Var3) {
        this.a = context;
        this.b = zq4Var;
        this.c = tg6Var;
        this.d = ep3Var;
        this.e = executor;
        this.f = tg6Var2;
        this.g = du0Var;
        this.h = du0Var2;
        this.i = tg6Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fp1(wc3 wc3Var, s7 s7Var, EventHub eventHub) {
        s7Var.getClass();
        eventHub.getClass();
        this.a = wc3Var;
        this.b = s7Var;
        this.c = eventHub;
        this.g = new yd2(eventHub, EventType.EVENT_SETTINGS_CHANGED, new ji2((byte) 25), new zz0(this, (byte) 29));
        a2 a2Var = (a2) wc3Var;
        this.h = a2Var.f283o;
        this.i = a2Var.p;
    }

    public fp1(ScrollView scrollView, Button button, Button button2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.a = scrollView;
        this.b = button;
        this.c = button2;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = textView5;
        this.h = textView6;
        this.i = textView7;
    }
}
