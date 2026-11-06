package o;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ne3 {
    public static final f4 a = new f4(x45.a);
    public static final f4 b = new f4(ya8.b);
    public static final f4 c = new f4(null);
    public static final f4 d;
    public static final f4 e;
    public static final f4 f;
    public static final f4 g;
    public static final f4 h;

    static {
        Boolean bool = Boolean.TRUE;
        d = new f4(bool);
        e = new f4(null);
        f = new f4(bool);
        g = new f4(bool);
        h = new f4(Boolean.FALSE);
    }

    public static final Bitmap.Config a(za5 za5Var) {
        return (Bitmap.Config) nv1.x(za5Var, b);
    }
}
