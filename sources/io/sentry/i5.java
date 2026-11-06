package io.sentry;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.teamviewer.teamviewer.market.mobile.R;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.EOFException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import o.ab6;
import o.at6;
import o.bc7;
import o.bf0;
import o.bo7;
import o.ca6;
import o.cb6;
import o.cx;
import o.d11;
import o.db6;
import o.de1;
import o.ep1;
import o.fz2;
import o.gj0;
import o.gj2;
import o.hm3;
import o.hw2;
import o.ic1;
import o.ij0;
import o.im3;
import o.j93;
import o.jh7;
import o.jj2;
import o.jk0;
import o.jo4;
import o.k00;
import o.k76;
import o.ke4;
import o.ko2;
import o.l00;
import o.l12;
import o.le4;
import o.mv7;
import o.nk7;
import o.oa7;
import o.ob6;
import o.oe4;
import o.ot0;
import o.pc0;
import o.pe1;
import o.po8;
import o.q00;
import o.rg6;
import o.sa2;
import o.ss5;
import o.ta2;
import o.tg6;
import o.u00;
import o.uk1;
import o.us5;
import o.vn0;
import o.xk1;
import o.yc4;
import o.ye4;
import o.yq4;
import o.z06;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i5 implements n4, x7, o4, io.sentry.util.network.e, ic1, jh7, ij0, rg6 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f202o;
    public final /* synthetic */ Object p;

    public /* synthetic */ i5(Object obj, Object obj2, Object obj3, byte b) {
        this.m = b;
        this.n = obj;
        this.f202o = obj2;
        this.p = obj3;
    }

    @Override // io.sentry.n4
    public void a(u7 u7Var) {
        ConcurrentHashMap concurrentHashMap;
        j5 j5Var = (j5) this.n;
        v5 v5Var = (v5) this.f202o;
        p0 p0Var = (p0) this.p;
        if (u7Var == null) {
            j5Var.b.getLogger().g(f6.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String strE = null;
        t7 t7Var = v5Var.f() != null ? t7.Crashed : null;
        boolean z = t7.Crashed == t7Var || v5Var.g();
        io.sentry.protocol.r rVar = v5Var.p;
        String str = (rVar == null || (concurrentHashMap = rVar.r) == null || !concurrentHashMap.containsKey("user-agent")) ? null : (String) v5Var.p.r.get("user-agent");
        Object objB = p0Var.b("sentry:typeCheckHint");
        if (objB instanceof io.sentry.hints.a) {
            strE = ((io.sentry.hints.a) objB).e();
            t7Var = t7.Abnormal;
        }
        if (!u7Var.c(t7Var, str, z, strE) || u7Var.s == t7.Ok) {
            return;
        }
        u7Var.b(new Date());
    }

    @Override // o.rg6
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        tg6 tg6Var;
        ke4 ke4Var;
        byte b = this.m;
        int i = 6;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        ke4 ke4Var2 = ke4.CACHE_FULL;
        int i5 = 2;
        int i6 = 1;
        Object obj2 = this.p;
        Object obj3 = this.f202o;
        Object obj4 = this.n;
        int i7 = 0;
        switch (b) {
            case ep1.b /* 9 */:
                tg6 tg6Var2 = (tg6) obj4;
                k00 k00Var = (k00) obj3;
                sa2 sa2Var = k00Var.c;
                String str = k00Var.a;
                u00 u00Var = (u00) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = tg6Var2.e().compileStatement("PRAGMA page_size").simpleQueryForLong() * tg6Var2.e().compileStatement("PRAGMA page_count").simpleQueryForLong();
                l00 l00Var = tg6Var2.p;
                if (jSimpleQueryForLong >= l00Var.a) {
                    tg6Var2.z(1L, ke4Var2, str);
                    return -1L;
                }
                Long lJ = tg6.j(sQLiteDatabase, u00Var);
                if (lJ != null) {
                    jInsert = lJ.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", u00Var.a);
                    contentValues.put("priority", Integer.valueOf(us5.a(u00Var.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = u00Var.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i8 = l00Var.e;
                byte[] bArr2 = sa2Var.b;
                boolean z = bArr2.length <= i8;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(k00Var.d));
                contentValues2.put("uptime_ms", Long.valueOf(k00Var.e));
                contentValues2.put("payload_encoding", sa2Var.a.a);
                contentValues2.put("code", k00Var.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i8));
                    for (int i9 = 1; i9 <= iCeil; i9++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i9 - 1) * i8, Math.min(i9 * i8, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i9));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(k00Var.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case ep1.c /* 10 */:
                tg6 tg6Var3 = (tg6) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                u00 u00Var2 = (u00) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i10 = cursor2.getInt(7) != 0 ? i6 : 0;
                    d11 d11Var = new d11();
                    d11Var.r = new HashMap();
                    String string = cursor2.getString(i6);
                    if (string == null) {
                        yq4.l("Null transportName");
                        return null;
                    }
                    d11Var.m = string;
                    d11Var.p = Long.valueOf(cursor2.getLong(i5));
                    d11Var.q = Long.valueOf(cursor2.getLong(3));
                    if (i10 != 0) {
                        String string2 = cursor2.getString(4);
                        d11Var.f578o = new sa2(string2 == null ? tg6.r : new ta2(string2), cursor2.getBlob(5));
                        tg6Var = tg6Var3;
                    } else {
                        String string3 = cursor2.getString(4);
                        ta2 ta2Var = string3 == null ? tg6.r : new ta2(string3);
                        Cursor cursorQuery = tg6Var3.e().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i11 = 0;
                            int length2 = 0;
                            while (i11 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i11);
                                tg6 tg6Var4 = tg6Var3;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i11++;
                                    cursorQuery = cursor;
                                    tg6Var3 = tg6Var4;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            tg6Var = tg6Var3;
                            cursorQuery.close();
                            d11Var.f578o = new sa2(ta2Var, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        d11Var.n = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new q00(j, u00Var2, d11Var.k()));
                    tg6Var3 = tg6Var;
                    i5 = 2;
                    i6 = 1;
                }
                return null;
            default:
                tg6 tg6Var5 = (tg6) obj4;
                HashMap map = (HashMap) obj3;
                j93 j93Var = (j93) obj2;
                ArrayList arrayList3 = (ArrayList) j93Var.f1141o;
                Cursor cursor3 = (Cursor) obj;
                tg6Var5.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i7);
                    int i12 = cursor3.getInt(1);
                    ke4 ke4Var3 = ke4.REASON_UNKNOWN;
                    if (i12 != 0) {
                        if (i12 == 1) {
                            ke4Var3 = ke4.MESSAGE_TOO_OLD;
                        } else if (i12 == 2) {
                            ke4Var = ke4Var2;
                        } else if (i12 == i4) {
                            ke4Var3 = ke4.PAYLOAD_TOO_BIG;
                        } else if (i12 == i3) {
                            ke4Var3 = ke4.MAX_RETRIES_REACHED;
                        } else if (i12 == i2) {
                            ke4Var3 = ke4.INVALID_PAYLOD;
                        } else if (i12 == i) {
                            ke4Var3 = ke4.SERVER_ERROR;
                        } else {
                            ep1.o("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i12));
                        }
                        ke4Var = ke4Var3;
                    } else {
                        ke4Var = ke4Var3;
                    }
                    long j2 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new le4(j2, ke4Var));
                    i = 6;
                    i2 = 5;
                    i3 = 4;
                    i4 = 3;
                    i7 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i13 = oe4.c;
                    new ArrayList();
                    arrayList3.add(new oe4((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jA = tg6Var5.n.a();
                SQLiteDatabase sQLiteDatabaseE = tg6Var5.e();
                sQLiteDatabaseE.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseE.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        mv7 mv7Var = new mv7(cursorRawQuery.getLong(0), jA);
                        cursorRawQuery.close();
                        sQLiteDatabaseE.setTransactionSuccessful();
                        sQLiteDatabaseE.endTransaction();
                        j93Var.n = mv7Var;
                        j93Var.p = new fz2(new oa7(tg6Var5.e().compileStatement("PRAGMA page_size").simpleQueryForLong() * tg6Var5.e().compileStatement("PRAGMA page_count").simpleQueryForLong(), l00.f.a));
                        j93Var.q = (String) tg6Var5.q.get();
                        return new ot0((mv7) j93Var.n, Collections.unmodifiableList(arrayList3), (fz2) j93Var.p, (String) j93Var.q);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseE.endTransaction();
                    throw th4;
                }
        }
    }

    public void b(at6 at6Var, nk7[] nk7VarArr) {
        ArrayList<nk7> arrayList;
        Context context;
        Context context2;
        Context context3;
        ca6 ca6Var = (ca6) this.n;
        String str = (String) this.f202o;
        xk1 xk1Var = (xk1) this.p;
        if (at6Var != at6.m) {
            ye4.c("RemoteFileHandler", "listDirectory(): remote listing failed");
            xk1Var.U(jj2.n, new ArrayList());
            return;
        }
        if (nk7VarArr != null) {
            List<nk7> listG1 = cx.g1(nk7VarArr);
            if (ca6Var.c) {
                arrayList = new ArrayList();
                for (nk7 nk7Var : listG1) {
                    if ((nk7Var.u & 2) != 2) {
                        arrayList.add(nk7Var);
                    }
                }
            } else {
                arrayList = new ArrayList(listG1);
            }
            Collections.sort(arrayList, gj2.n);
            if (im3.n(str, "")) {
                for (nk7 nk7Var2 : arrayList) {
                    if (bc7.G(false, nk7Var2.m, "Desktop")) {
                        synchronized (jk0.s) {
                            context = jk0.t;
                        }
                        context.getClass();
                        String string = context.getString(R.string.tv_filetransfer_my_desktop);
                        string.getClass();
                        nk7Var2.m = string;
                    } else if (bc7.G(false, nk7Var2.m, "Documents")) {
                        synchronized (jk0.s) {
                            context2 = jk0.t;
                        }
                        context2.getClass();
                        String string2 = context2.getString(R.string.tv_filetransfer_my_documents);
                        string2.getClass();
                        nk7Var2.m = string2;
                    } else if (bc7.G(false, nk7Var2.m, "\\\\")) {
                        synchronized (jk0.s) {
                            context3 = jk0.t;
                        }
                        context3.getClass();
                        String string3 = context3.getString(R.string.tv_filetransfer_my_network);
                        string3.getClass();
                        nk7Var2.m = string3;
                    } else {
                        continue;
                    }
                }
            }
            xk1Var.U(jj2.m, arrayList);
        }
    }

    @Override // io.sentry.x7
    public void d(v7 v7Var) {
        io.sentry.android.core.c cVarC;
        s7 s7Var = (s7) this.n;
        x7 x7Var = (x7) this.f202o;
        AtomicReference atomicReference = (AtomicReference) this.p;
        if (x7Var != null) {
            x7Var.d(v7Var);
        }
        io.sentry.android.core.e eVar = s7Var.r.i;
        if (eVar != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) eVar.m;
            WeakReference weakReference = (WeakReference) eVar.n;
            String str = (String) eVar.f103o;
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                io.sentry.android.core.d dVar = activityLifecycleIntegration.D;
                io.sentry.protocol.w wVarR = s7Var.r();
                io.sentry.util.a aVar = (io.sentry.util.a) dVar.s;
                aVar.e();
                try {
                    if (dVar.j()) {
                        io.sentry.android.core.c cVar = null;
                        dVar.m(new io.sentry.android.core.b(dVar, activity, (byte) 1), null);
                        io.sentry.android.core.c cVar2 = (io.sentry.android.core.c) ((WeakHashMap) dVar.q).remove(activity);
                        if (cVar2 != null && (cVarC = dVar.c()) != null) {
                            cVar = new io.sentry.android.core.c(cVarC.a - cVar2.a, cVarC.b - cVar2.b, cVarC.c - cVar2.c);
                        }
                        if (cVar != null) {
                            int i = cVar.c;
                            int i2 = cVar.b;
                            int i3 = cVar.a;
                            if (i3 != 0 || i2 != 0 || i != 0) {
                                io.sentry.protocol.n nVar = new io.sentry.protocol.n((Number) Integer.valueOf(i3), "none");
                                io.sentry.protocol.n nVar2 = new io.sentry.protocol.n((Number) Integer.valueOf(i2), "none");
                                io.sentry.protocol.n nVar3 = new io.sentry.protocol.n((Number) Integer.valueOf(i), "none");
                                HashMap map = new HashMap();
                                map.put("frames_total", nVar);
                                map.put("frames_slow", nVar2);
                                map.put("frames_frozen", nVar3);
                                ((ConcurrentHashMap) dVar.p).put(wVarR, map);
                            }
                        }
                    }
                    aVar.close();
                } catch (Throwable th) {
                    try {
                        aVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.p;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().g(f6.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        p pVar = s7Var.q;
        if (pVar != null) {
            atomicReference.set(pVar.f(s7Var));
        }
    }

    @Override // io.sentry.o4
    public void e(x1 x1Var) {
        io.sentry.android.core.internal.gestures.g gVar = (io.sentry.android.core.internal.gestures.g) this.n;
        l1 l1Var = (l1) this.f202o;
        x1 x1Var2 = (x1) this.p;
        if (x1Var == null) {
            l1Var.J(x1Var2);
        } else {
            gVar.c.getLogger().g(f6.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", x1Var2.getName());
        }
    }

    @Override // io.sentry.util.network.e
    public io.sentry.util.network.b extract(Object obj) throws EOFException {
        String str;
        Charset charsetA;
        yc4 yc4Var = (yc4) this.n;
        k76 k76Var = (k76) this.f202o;
        io.sentry.okhttp.g gVar = (io.sentry.okhttp.g) this.p;
        ab6 ab6Var = (ab6) obj;
        ab6Var.getClass();
        db6 db6Var = ab6Var.d;
        if (db6Var != null) {
            bf0 bf0Var = new bf0();
            db6Var.d(bf0Var);
            byte[] bArrK0 = bf0Var.k0(bf0Var.n);
            int i = db6.a;
            jo4 jo4VarB = db6Var.b();
            int length = bArrK0.length;
            po8.a(bArrK0.length, 0L, length);
            yc4Var.P(((ab6) k76Var.m).b, new cb6(jo4VarB, length, bArrK0));
            jo4 jo4VarB2 = db6Var.b();
            g1 logger = gVar.a.l().getLogger();
            logger.getClass();
            if (jo4VarB2 != null) {
                try {
                    str = jo4VarB2.a;
                } catch (Exception e) {
                    logger.g(f6.ERROR, "Failed to parse buffered request body: " + e.getMessage(), new Object[0]);
                }
            } else {
                str = null;
            }
            String strName = (jo4VarB2 == null || (charsetA = jo4VarB2.a(vn0.a)) == null) ? null : charsetA.name();
            if (strName == null) {
                strName = "UTF-8";
            }
            return io.sentry.config.a.l(bArrK0, str, strName, logger);
        }
        return null;
    }

    @Override // o.jh7
    public Object f() {
        uk1 uk1Var = (uk1) this.n;
        u00 u00Var = (u00) this.f202o;
        k00 k00Var = (k00) this.p;
        tg6 tg6Var = uk1Var.d;
        tg6Var.getClass();
        ss5 ss5Var = u00Var.c;
        String str = k00Var.a;
        String str2 = u00Var.a;
        if (Log.isLoggable("TRuntime.SQLiteEventStore", 3)) {
            Log.d("TRuntime.SQLiteEventStore", "Storing event with priority=" + ss5Var + ", name=" + str + " for destination " + str2);
        }
        ((Long) tg6Var.q(new i5(tg6Var, k00Var, u00Var, (byte) 9))).getClass();
        uk1Var.a.D(u00Var, 1, false);
        return null;
    }

    @Override // o.ij0
    public Object h(gj0 gj0Var) {
        de1 de1Var = (de1) this.n;
        pe1 pe1Var = (pe1) this.f202o;
        hw2 hw2Var = (hw2) this.p;
        pc0 pc0Var = new pc0(de1Var.l0(z06.z), (byte) 18);
        ob6 ob6Var = gj0Var.c;
        if (ob6Var != null) {
            ob6Var.addListener(pc0Var, l12.m);
        }
        return im3.R(hm3.c(de1Var), null, pe1Var, new ko2(hw2Var, gj0Var, null, (byte) 9), 1);
    }

    @Override // o.ic1
    public Object j(bo7 bo7Var) {
        byte b = this.m;
        Object obj = this.p;
        Object obj2 = this.f202o;
        Object obj3 = this.n;
        switch (b) {
            case 4:
                return ((ConfigRealtimeHttpClient) obj3).lambda$createRealtimeConnection$0((bo7) obj2, (bo7) obj, bo7Var);
            default:
                return ((FirebaseRemoteConfig) obj3).lambda$activate$2((bo7) obj2, (bo7) obj, bo7Var);
        }
    }
}
