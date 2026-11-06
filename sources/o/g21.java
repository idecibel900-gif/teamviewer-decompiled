package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g21 implements ic1, rg6, jh7 {
    public final /* synthetic */ long m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f848o;

    public /* synthetic */ g21(long j, Object obj, Object obj2) {
        this.n = obj;
        this.f848o = obj2;
        this.m = j;
    }

    @Override // o.rg6
    public Object apply(Object obj) {
        String str = (String) this.n;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        byte b = ((ke4) this.f848o).m;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(b)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.m;
            if (z) {
                sQLiteDatabase.execSQL(to7.j(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(b)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(b));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // o.jh7
    public Object f() {
        fp1 fp1Var = (fp1) this.n;
        u00 u00Var = (u00) this.f848o;
        tg6 tg6Var = (tg6) fp1Var.c;
        long jA = ((du0) fp1Var.g).a() + this.m;
        tg6Var.getClass();
        tg6Var.q(new io.sentry.instrumentation.file.d(jA, u00Var));
        return null;
    }

    @Override // o.ic1
    public Object j(bo7 bo7Var) {
        return ((ConfigFetchHandler) this.n).lambda$fetch$0(this.m, (HashMap) this.f848o, bo7Var);
    }

    public /* synthetic */ g21(ConfigFetchHandler configFetchHandler, long j, HashMap map) {
        this.n = configFetchHandler;
        this.m = j;
        this.f848o = map;
    }
}
