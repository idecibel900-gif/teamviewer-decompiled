package o;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class nv2 extends SQLiteOpenHelper {
    public static final /* synthetic */ int t = 0;
    public final Context m;
    public final xk1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final nd f1604o;
    public final boolean p;
    public boolean q;
    public final xs5 r;
    public boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv2(Context context, String str, final xk1 xk1Var, final nd ndVar, boolean z) {
        String string;
        super(context, str, null, ndVar.n, new DatabaseErrorHandler() { // from class: o.kv2
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = nv2.t;
                sQLiteDatabase.getClass();
                xk1 xk1Var2 = xk1Var;
                jv2 jv2Var = (jv2) xk1Var2.n;
                if (jv2Var == null || !jv2Var.m.equals(sQLiteDatabase)) {
                    jv2Var = new jv2(sQLiteDatabase);
                    xk1Var2.n = jv2Var;
                }
                SQLiteDatabase sQLiteDatabase2 = jv2Var.m;
                ndVar.getClass();
                io.sentry.android.core.v0.c("SupportSQLite", "Corruption reported by sqlite on database: " + jv2Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        nd.g(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                nd.g((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                nd.g(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    jv2Var.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        ndVar.getClass();
        this.m = context;
        this.n = xk1Var;
        this.f1604o = ndVar;
        this.p = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.r = new xs5(string, context.getCacheDir(), false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        xs5 xs5Var = this.r;
        try {
            xs5Var.a(xs5Var.a);
            super.close();
            this.n.n = null;
            this.s = false;
        } finally {
            xs5Var.b();
        }
    }

    public final bf7 e(boolean z) {
        xs5 xs5Var = this.r;
        try {
            xs5Var.a((this.s || getDatabaseName() == null) ? false : true);
            this.q = false;
            SQLiteDatabase sQLiteDatabaseQ = q(z);
            if (!this.q) {
                return j(sQLiteDatabaseQ);
            }
            close();
            return e(z);
        } finally {
            xs5Var.b();
        }
    }

    public final jv2 j(SQLiteDatabase sQLiteDatabase) {
        xk1 xk1Var = this.n;
        jv2 jv2Var = (jv2) xk1Var.n;
        if (jv2Var != null && jv2Var.m.equals(sQLiteDatabase)) {
            return jv2Var;
        }
        jv2 jv2Var2 = new jv2(sQLiteDatabase);
        xk1Var.n = jv2Var2;
        return jv2Var2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.q;
        nd ndVar = this.f1604o;
        if (!z && ndVar.n != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            j(sQLiteDatabase);
            ndVar.getClass();
        } catch (Throwable th) {
            throw new lv2(mv2.m, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((ve6) this.f1604o.f1562o).d(new ze7(j(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new lv2(mv2.n, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.q = true;
        try {
            this.f1604o.k(j(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new lv2(mv2.p, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.q) {
            try {
                nd ndVar = this.f1604o;
                jv2 jv2VarJ = j(sQLiteDatabase);
                ve6 ve6Var = (ve6) ndVar.f1562o;
                ve6Var.f(new ze7(jv2VarJ));
                ve6Var.g = jv2VarJ;
            } catch (Throwable th) {
                throw new lv2(mv2.q, th);
            }
        }
        this.s = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.q = true;
        try {
            this.f1604o.k(j(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new lv2(mv2.f1513o, th);
        }
    }

    public final SQLiteDatabase q(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.s;
        Context context = this.m;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                io.sentry.android.core.v0.j("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof lv2) {
                    lv2 lv2Var = (lv2) th;
                    int iOrdinal = lv2Var.m.ordinal();
                    th = lv2Var.n;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        gk0.s();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.p) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (lv2 e) {
                    throw e.n;
                }
            }
        }
    }
}
