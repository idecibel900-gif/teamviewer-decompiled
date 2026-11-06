package o;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface bf7 extends Closeable {
    void D();

    int G0(ContentValues contentValues, Object[] objArr);

    void N(Object[] objArr);

    void O();

    void Q();

    void e0();

    boolean isOpen();

    void n();

    Cursor o(l07 l07Var);

    void s(String str);

    boolean s0();

    jf7 x(String str);

    boolean y0();
}
