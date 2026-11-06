package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewer.market.mobile.application.RemoteControlApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ve6 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;

    public ve6(zh1 zh1Var, vy1 vy1Var) {
        int i;
        v41 v41Var;
        ye6 ye6Var = zh1Var.g;
        cf7 cf7Var = zh1Var.c;
        String str = zh1Var.b;
        this.c = zh1Var;
        this.d = vy1Var;
        Object obj = zh1Var.e;
        this.e = obj == null ? ea2.m : obj;
        qg6 qg6Var = zh1Var.p;
        if (qg6Var != null) {
            if (str == null) {
                v41Var = new v41(new cj3(this, qg6Var));
            } else {
                cj3 cj3Var = new cj3(this, qg6Var);
                int iOrdinal = ye6Var.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        an4.r(ye6Var, "Can't get max number of reader for journal mode '");
                        throw null;
                    }
                    i = 4;
                }
                int iOrdinal2 = ye6Var.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    an4.r(ye6Var, "Can't get max number of writers for journal mode '");
                    throw null;
                }
                v41Var = new v41(cj3Var, str, i);
            }
            this.f = v41Var;
        } else {
            if (cf7Var == null) {
                hk0.g("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            this.f = new af7(new l07(cf7Var.d(new zz6(zh1Var.a, str, new nd(this, vy1Var.a), false, false))));
        }
        boolean z = ye6Var == ye6.n;
        df7 df7VarC = c();
        if (df7VarC != null) {
            df7VarC.setWriteAheadLoggingEnabled(z);
        }
    }

    public static void a(pg6 pg6Var) {
        ug6 ug6VarJ0 = pg6Var.J0("PRAGMA busy_timeout");
        try {
            ug6VarJ0.F0();
            long j = ug6VarJ0.getLong(0);
            iq8.l(ug6VarJ0, null);
            if (j < 3000) {
                us1.y(pg6Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq8.l(ug6VarJ0, th);
                throw th2;
            }
        }
    }

    public void b(pg6 pg6Var) throws Throwable {
        Object sc6Var;
        vy1 vy1Var = (vy1) this.d;
        zh1 zh1Var = (zh1) this.c;
        ye6 ye6Var = zh1Var.g;
        ye6 ye6Var2 = ye6.n;
        if (ye6Var == ye6Var2) {
            us1.y(pg6Var, "PRAGMA journal_mode = WAL");
        } else {
            us1.y(pg6Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (zh1Var.g == ye6Var2) {
            us1.y(pg6Var, "PRAGMA synchronous = NORMAL");
        } else {
            us1.y(pg6Var, "PRAGMA synchronous = FULL");
        }
        a(pg6Var);
        ug6 ug6VarJ0 = pg6Var.J0("PRAGMA user_version");
        try {
            ug6VarJ0.F0();
            int i = (int) ug6VarJ0.getLong(0);
            iq8.l(ug6VarJ0, null);
            int i2 = vy1Var.a;
            int i3 = vy1Var.a;
            if (i != i2) {
                us1.y(pg6Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        d(pg6Var);
                    } else {
                        e(pg6Var, i, i3);
                    }
                    us1.y(pg6Var, "PRAGMA user_version = " + i3);
                    sc6Var = f88.a;
                } catch (Throwable th) {
                    sc6Var = new sc6(th);
                }
                if (!(sc6Var instanceof sc6)) {
                    us1.y(pg6Var, "END TRANSACTION");
                }
                Throwable thA = tc6.a(sc6Var);
                if (thA != null) {
                    us1.y(pg6Var, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            f(pg6Var);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                iq8.l(ug6VarJ0, th2);
                throw th3;
            }
        }
    }

    public df7 c() {
        s41 s41Var = (s41) this.f;
        af7 af7Var = s41Var instanceof af7 ? (af7) s41Var : null;
        if (af7Var != null) {
            return (df7) af7Var.m.n;
        }
        return null;
    }

    public void d(pg6 pg6Var) {
        vy1 vy1Var = (vy1) this.d;
        pg6Var.getClass();
        ug6 ug6VarJ0 = pg6Var.J0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (ug6VarJ0.F0() && ug6VarJ0.getLong(0) == 0) {
                z = true;
            }
            iq8.l(ug6VarJ0, null);
            vy1Var.a(pg6Var);
            if (!z) {
                io.sentry.android.core.t0 t0VarW = vy1Var.w(pg6Var);
                if (!t0VarW.a) {
                    yq4.u(t0VarW.b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            h(pg6Var);
            vy1Var.s(pg6Var);
            Iterator it = ((List) this.e).iterator();
            while (it.hasNext()) {
                ((xe6) it.next()).getClass();
                if (pg6Var instanceof ze7) {
                    ((ze7) pg6Var).m.getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq8.l(ug6VarJ0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[LOOP:4: B:9:0x0028->B:131:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    public void e(pg6 pg6Var, int i, int i2) {
        Iterable iterable;
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        vd5 vd5Var;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        boolean z2;
        vy1 vy1Var = (vy1) this.d;
        pg6Var.getClass();
        zh1 zh1Var = (zh1) this.c;
        og1 og1Var = zh1Var.d;
        if (i == i2) {
            iterable = ea2.m;
        } else {
            boolean z3 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            while (true) {
                if (z3) {
                    if (i3 < i2) {
                        linkedHashMap = og1Var.a;
                        if (z3) {
                            treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap2 == null) {
                                vd5Var = null;
                            } else {
                                vd5Var = new vd5(treeMap2, treeMap2.descendingKeySet());
                            }
                        } else {
                            treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap == null) {
                                vd5Var = null;
                            } else {
                                vd5Var = new vd5(treeMap, treeMap.keySet());
                            }
                        }
                        if (vd5Var == null) {
                            Map map = (Map) vd5Var.m;
                            it = ((Iterable) vd5Var.n).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (!z3) {
                                    if (i2 <= iIntValue && iIntValue < i3) {
                                        Object obj = map.get(Integer.valueOf(iIntValue));
                                        obj.getClass();
                                        arrayList.add(obj);
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                        break;
                                    }
                                } else if (i3 + 1 <= iIntValue && iIntValue <= i2) {
                                    Object obj2 = map.get(Integer.valueOf(iIntValue));
                                    obj2.getClass();
                                    arrayList.add(obj2);
                                    z = true;
                                    i3 = iIntValue;
                                    break;
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                } else if (i3 > i2) {
                    linkedHashMap = og1Var.a;
                    if (z3) {
                        treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap2 == null) {
                            vd5Var = null;
                        } else {
                            vd5Var = new vd5(treeMap2, treeMap2.descendingKeySet());
                        }
                    } else {
                        treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            vd5Var = null;
                        } else {
                            vd5Var = new vd5(treeMap, treeMap.keySet());
                        }
                    }
                    if (vd5Var == null) {
                        Map map2 = (Map) vd5Var.m;
                        it = ((Iterable) vd5Var.n).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            iIntValue = ((Number) it.next()).intValue();
                            if (!z3) {
                                if (i3 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i2 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z) {
                        }
                    }
                    iterable = null;
                } else {
                    iterable = arrayList;
                }
            }
        }
        if (iterable != null) {
            vy1Var.v(pg6Var);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((er4) it2.next()).a(pg6Var);
            }
            io.sentry.android.core.t0 t0VarW = vy1Var.w(pg6Var);
            if (!t0VarW.a) {
                yq4.u(t0VarW.b, "Migration didn't properly handle: ");
                return;
            } else {
                vy1Var.u(pg6Var);
                h(pg6Var);
                return;
            }
        }
        zh1Var.getClass();
        if (i <= i2 || !zh1Var.k) {
            Set set = zh1Var.l;
            if (!zh1Var.j || (set != null && set.contains(Integer.valueOf(i)))) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (zh1Var.f2701o) {
            ug6 ug6VarJ0 = pg6Var.J0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                sa4 sa4VarT = qf0.t();
                while (ug6VarJ0.F0()) {
                    String strH0 = ug6VarJ0.h0(0);
                    if (!bc7.N(false, strH0, "sqlite_") && !strH0.equals("android_metadata")) {
                        sa4VarT.add(new vd5(strH0, Boolean.valueOf(im3.n(ug6VarJ0.h0(1), "view"))));
                    }
                }
                sa4 sa4VarR = qf0.r(sa4VarT);
                iq8.l(ug6VarJ0, null);
                ListIterator listIterator = sa4VarR.listIterator(0);
                while (true) {
                    v53 v53Var = (v53) listIterator;
                    if (!v53Var.hasNext()) {
                        break;
                    }
                    vd5 vd5Var2 = (vd5) v53Var.next();
                    String str = (String) vd5Var2.m;
                    if (((Boolean) vd5Var2.n).booleanValue()) {
                        us1.y(pg6Var, "DROP VIEW IF EXISTS " + str);
                    } else {
                        us1.y(pg6Var, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    iq8.l(ug6VarJ0, th);
                    throw th2;
                }
            }
        } else {
            vy1Var.c(pg6Var);
        }
        Iterator it3 = ((List) this.e).iterator();
        while (it3.hasNext()) {
            ((xe6) it3.next()).getClass();
            if (pg6Var instanceof ze7) {
                ((ze7) pg6Var).m.getClass();
            }
        }
        vy1Var.a(pg6Var);
    }

    public void f(pg6 pg6Var) throws Throwable {
        Object sc6Var;
        pg6Var.getClass();
        vy1 vy1Var = (vy1) this.d;
        ug6 ug6VarJ0 = pg6Var.J0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = ug6VarJ0.F0() && ug6VarJ0.getLong(0) != 0;
            iq8.l(ug6VarJ0, null);
            if (z) {
                ug6 ug6VarJ1 = pg6Var.J0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strH0 = ug6VarJ1.F0() ? ug6VarJ1.h0(0) : null;
                    iq8.l(ug6VarJ1, null);
                    if (!((String) vy1Var.b).equals(strH0) && !((String) vy1Var.c).equals(strH0)) {
                        an4.v("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", (String) vy1Var.b, ", found: ", strH0);
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        iq8.l(ug6VarJ1, th);
                        throw th2;
                    }
                }
            } else {
                us1.y(pg6Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    io.sentry.android.core.t0 t0VarW = vy1Var.w(pg6Var);
                    if (!t0VarW.a) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + t0VarW.b).toString());
                    }
                    vy1Var.u(pg6Var);
                    h(pg6Var);
                    sc6Var = f88.a;
                    if (!(sc6Var instanceof sc6)) {
                        us1.y(pg6Var, "END TRANSACTION");
                    }
                    Throwable thA = tc6.a(sc6Var);
                    if (thA != null) {
                        us1.y(pg6Var, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th3) {
                    sc6Var = new sc6(th3);
                }
            }
            vy1Var.t(pg6Var);
            for (xe6 xe6Var : (List) this.e) {
                xe6Var.getClass();
                if (pg6Var instanceof ze7) {
                    xe6Var.a(((ze7) pg6Var).m);
                }
            }
            this.a = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                iq8.l(ug6VarJ0, th4);
                throw th5;
            }
        }
    }

    public void g() {
        ye4.a("Connectivity", "Connection lost.");
        if (this.a) {
            Context context = d82.M;
            if (context != null) {
                d82.t(context, R.string.tv_Connection_lost);
            } else {
                ye4.c("TVNotificationManager", "message: could not show toast. No context available");
            }
        }
        ((j25) this.c).a(od3.n);
    }

    public void h(pg6 pg6Var) {
        us1.y(pg6Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        us1.y(pg6Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((vy1) this.d).b) + "')");
    }

    public ve6(j25 j25Var, RemoteControlApplication remoteControlApplication) {
        j25Var.getClass();
        this.c = j25Var;
        Object systemService = remoteControlApplication.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        this.d = connectivityManager;
        this.e = new Handler(Looper.getMainLooper());
        this.g = new io.sentry.android.core.internal.util.b(this, (byte) 3);
        if (connectivityManager == null) {
            ye4.c("Connectivity", "could not access connectivity service");
            return;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        NetworkCapabilities networkCapabilities = activeNetwork != null ? connectivityManager.getNetworkCapabilities(activeNetwork) : null;
        ye4 ye4Var = ye4.a;
        ye4Var.f("Connectivity", " ------------------- Initial connection info ------------------- ");
        ye4Var.f("Connectivity", "  -");
        if (networkCapabilities == null) {
            ye4.c("Connectivity", "NO NETWORK ACTIVE!");
        } else {
            x37.p("Active", networkCapabilities);
        }
        ye4Var.f("Connectivity", "  -");
        ye4Var.f("Connectivity", " ------------------- Initial connection info ------------------- ");
    }

    public ve6(zh1 zh1Var, le5 le5Var) {
        this.c = zh1Var;
        this.d = new te6(-1, "", "");
        List list = zh1Var.e;
        ea2 ea2Var = ea2.m;
        this.e = list == null ? ea2Var : list;
        lv0.B0(list == null ? ea2Var : list, new ue6(new y46((Object) this, (byte) 6)));
        Executor executor = zh1Var.h;
        Executor executor2 = zh1Var.i;
        executor.getClass();
        executor2.getClass();
        throw new e55(0);
    }
}
