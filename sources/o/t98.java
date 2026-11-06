package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t98 implements jh7 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ tg6 n;

    public /* synthetic */ t98(tg6 tg6Var, byte b) {
        this.m = b;
        this.n = tg6Var;
    }

    @Override // o.jh7
    public final Object f() {
        byte b = this.m;
        tg6 tg6Var = this.n;
        switch (b) {
            case 0:
                tg6Var.getClass();
                int i = ot0.e;
                j93 j93Var = new j93((byte) 9);
                j93Var.n = null;
                j93Var.f1141o = new ArrayList();
                j93Var.p = null;
                j93Var.q = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseE = tg6Var.e();
                sQLiteDatabaseE.beginTransaction();
                try {
                    ot0 ot0Var = (ot0) tg6.J(sQLiteDatabaseE.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new io.sentry.i5(tg6Var, map, j93Var, (byte) 11));
                    sQLiteDatabaseE.setTransactionSuccessful();
                    return ot0Var;
                } finally {
                    sQLiteDatabaseE.endTransaction();
                }
            default:
                long jA = tg6Var.n.a() - tg6Var.p.d;
                SQLiteDatabase sQLiteDatabaseE2 = tg6Var.e();
                sQLiteDatabaseE2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jA)};
                    Cursor cursorRawQuery = sQLiteDatabaseE2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            tg6Var.z(cursorRawQuery.getInt(0), ke4.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseE2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseE2.setTransactionSuccessful();
                    sQLiteDatabaseE2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseE2.endTransaction();
                    throw th2;
                }
        }
    }
}
