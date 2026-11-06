package io.sentry.instrumentation.file;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import o.rg6;
import o.ss5;
import o.u00;
import o.us5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements a, rg6 {
    public final /* synthetic */ long m;
    public final /* synthetic */ Object n;

    public /* synthetic */ d(long j, u00 u00Var) {
        this.m = j;
        this.n = u00Var;
    }

    @Override // o.rg6
    public Object apply(Object obj) {
        u00 u00Var = (u00) this.n;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.m));
        String str = u00Var.a;
        ss5 ss5Var = u00Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(us5.a(ss5Var))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(us5.a(ss5Var)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() {
        f fVar = (f) this.n;
        return Long.valueOf(fVar.m.skip(this.m));
    }

    public /* synthetic */ d(f fVar, long j) {
        this.n = fVar;
        this.m = j;
    }
}
