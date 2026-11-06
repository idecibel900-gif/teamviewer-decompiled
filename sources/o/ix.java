package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ix implements ui2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ ix(byte b) {
        this.a = b;
    }

    @Override // o.ui2
    public final vi2 a(Object obj, za5 za5Var, i46 i46Var) {
        byte b = 0;
        byte b2 = 1;
        byte b3 = 2;
        switch (this.a) {
            case 0:
                x98 x98Var = (x98) obj;
                Bitmap.Config[] configArr = ya8.a;
                if (im3.n(x98Var.c, "file") && im3.n(lv0.o0(v67.k(x98Var)), "android_asset")) {
                    return new jx(x98Var, za5Var, b);
                }
                return null;
            case 1:
                return new q70((Bitmap) obj);
            case 2:
                return new kh0((byte[]) obj, za5Var, b);
            case 3:
                return new kh0((ByteBuffer) obj, za5Var, b2);
            case 4:
                x98 x98Var2 = (x98) obj;
                if (im3.n(x98Var2.c, "content")) {
                    return new jx(x98Var2, za5Var, b2);
                }
                return null;
            case 5:
                x98 x98Var3 = (x98) obj;
                if (im3.n(x98Var3.c, "data")) {
                    return new jx(x98Var3, za5Var, b3);
                }
                return null;
            case 6:
                return new kh0((Drawable) obj, za5Var, b3);
            case 7:
                x98 x98Var4 = (x98) obj;
                String str = x98Var4.c;
                if ((str != null && !str.equals("file")) || x98Var4.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = ya8.a;
                if (im3.n(x98Var4.c, "file") && im3.n(lv0.o0(v67.k(x98Var4)), "android_asset")) {
                    return null;
                }
                return new jx(x98Var4, za5Var, (byte) 3);
            case 8:
                x98 x98Var5 = (x98) obj;
                if (im3.n(x98Var5.c, "jar:file")) {
                    return new jx(x98Var5, za5Var, (byte) 4);
                }
                return null;
            default:
                x98 x98Var6 = (x98) obj;
                if (im3.n(x98Var6.c, "android.resource")) {
                    return new jx(x98Var6, za5Var, (byte) 5);
                }
                return null;
        }
    }
}
