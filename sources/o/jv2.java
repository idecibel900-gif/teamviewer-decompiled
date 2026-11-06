package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.io.Closeable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class jv2 implements bf7 {
    public static final String[] n = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f1203o = new String[0];
    public static final u14 p;
    public static final u14 q;
    public final SQLiteDatabase m;

    static {
        uf2 uf2Var = new uf2((byte) 5);
        l54 l54Var = l54.n;
        p = ds1.X(l54Var, uf2Var);
        q = ds1.X(l54Var, new uf2((byte) 6));
    }

    public jv2(SQLiteDatabase sQLiteDatabase) {
        this.m = sQLiteDatabase;
    }

    @Override // o.bf7
    public final void D() throws IllegalAccessException, InvocationTargetException {
        u14 u14Var = q;
        if (((Method) u14Var.getValue()) != null) {
            u14 u14Var2 = p;
            if (((Method) u14Var2.getValue()) != null) {
                Method method = (Method) u14Var.getValue();
                method.getClass();
                Method method2 = (Method) u14Var2.getValue();
                method2.getClass();
                Object objInvoke = method2.invoke(this.m, null);
                if (objInvoke != null) {
                    method.invoke(objInvoke, 0, null, 0, null);
                    return;
                } else {
                    hk0.l("Required value was null.");
                    return;
                }
            }
        }
        n();
    }

    @Override // o.bf7
    public final int G0(ContentValues contentValues, Object[] objArr) {
        int i = 0;
        if (contentValues.size() == 0) {
            hk0.g("Empty values");
            return 0;
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(n[3]);
        sb.append("WorkSpec SET ");
        int i2 = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str);
            objArr2[i2] = contentValues.get(str);
            sb.append("=?");
            i2++;
        }
        for (int i3 = size; i3 < length; i3++) {
            objArr2[i3] = objArr[i3 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        Closeable closeableX = x(sb.toString());
        while (i < length) {
            Object obj = objArr2[i];
            i++;
            if (obj == null) {
                ((pv2) closeableX).m(i);
            } else if (obj instanceof byte[]) {
                ((pv2) closeableX).m.bindBlob(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                ((pv2) closeableX).B(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                ((pv2) closeableX).B(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                ((pv2) closeableX).k(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                ((pv2) closeableX).k(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                ((pv2) closeableX).k(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                ((pv2) closeableX).k(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                ((pv2) closeableX).m.bindString(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                ((pv2) closeableX).k(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return ((qv2) closeableX).n.executeUpdateDelete();
    }

    @Override // o.bf7
    public final void N(Object[] objArr) {
        this.m.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // o.bf7
    public final void O() {
        this.m.setTransactionSuccessful();
    }

    @Override // o.bf7
    public final void Q() {
        this.m.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    @Override // o.bf7
    public final void e0() {
        this.m.endTransaction();
    }

    @Override // o.bf7
    public final boolean isOpen() {
        return this.m.isOpen();
    }

    @Override // o.bf7
    public final void n() {
        this.m.beginTransaction();
    }

    @Override // o.bf7
    public final Cursor o(l07 l07Var) {
        final pj pjVar = new pj(l07Var, (byte) 1);
        Cursor cursorRawQueryWithFactory = this.m.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: o.iv2
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) pjVar.i(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, ((hf7) l07Var.n).n, f1203o, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // o.bf7
    public final void s(String str) {
        this.m.execSQL(str);
    }

    @Override // o.bf7
    public final boolean s0() {
        return this.m.inTransaction();
    }

    @Override // o.bf7
    public final jf7 x(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.m.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new qv2(sQLiteStatementCompileStatement);
    }

    @Override // o.bf7
    public final boolean y0() {
        return this.m.isWriteAheadLoggingEnabled();
    }
}
