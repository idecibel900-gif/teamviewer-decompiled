package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class tg6 implements Closeable {
    public static final ta2 r = new ta2("proto");
    public final fj6 m;
    public final du0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final du0 f2108o;
    public final l00 p;
    public final ex5 q;

    public tg6(du0 du0Var, du0 du0Var2, l00 l00Var, fj6 fj6Var, ex5 ex5Var) {
        this.m = fj6Var;
        this.n = du0Var;
        this.f2108o = du0Var2;
        this.p = l00Var;
        this.q = ex5Var;
    }

    public static String G(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((q00) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object J(Cursor cursor, rg6 rg6Var) {
        try {
            return rg6Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long j(SQLiteDatabase sQLiteDatabase, u00 u00Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(u00Var.a, String.valueOf(us5.a(u00Var.c))));
        byte[] bArr = u00Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final Object F(jh7 jh7Var) {
        SQLiteDatabase sQLiteDatabaseE = e();
        du0 du0Var = this.f2108o;
        long jA = du0Var.a();
        while (true) {
            try {
                sQLiteDatabaseE.beginTransaction();
                try {
                    Object objF = jh7Var.f();
                    sQLiteDatabaseE.setTransactionSuccessful();
                    return objF;
                } finally {
                    sQLiteDatabaseE.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (du0Var.a() >= ((long) this.p.c) + jA) {
                    throw new ih7("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    public final SQLiteDatabase e() {
        fj6 fj6Var = this.m;
        Objects.requireNonNull(fj6Var);
        du0 du0Var = this.f2108o;
        long jA = du0Var.a();
        while (true) {
            try {
                return fj6Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (du0Var.a() >= ((long) this.p.c) + jA) {
                    throw new ih7("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object q(rg6 rg6Var) {
        SQLiteDatabase sQLiteDatabaseE = e();
        sQLiteDatabaseE.beginTransaction();
        try {
            Object objApply = rg6Var.apply(sQLiteDatabaseE);
            sQLiteDatabaseE.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseE.endTransaction();
        }
    }

    public final ArrayList u(SQLiteDatabase sQLiteDatabase, u00 u00Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long lJ = j(sQLiteDatabase, u00Var);
        if (lJ == null) {
            return arrayList;
        }
        J(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lJ.toString()}, null, null, null, String.valueOf(i)), new io.sentry.i5(this, arrayList, u00Var, (byte) 10));
        return arrayList;
    }

    public final void z(long j, ke4 ke4Var, String str) {
        q(new g21(j, str, ke4Var));
    }
}
