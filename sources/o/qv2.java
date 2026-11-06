package o;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class qv2 extends pv2 implements jf7 {
    public final SQLiteStatement n;

    public qv2(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.n = sQLiteStatement;
    }

    @Override // o.jf7
    public final void f() {
        this.n.execute();
    }
}
