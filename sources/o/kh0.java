package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class kh0 implements vi2 {
    public final /* synthetic */ byte a;
    public final za5 b;
    public final Object c;

    public /* synthetic */ kh0(Object obj, za5 za5Var, byte b) {
        this.a = b;
        this.c = obj;
        this.b = za5Var;
    }

    @Override // o.vi2
    public final Object a(fb2 fb2Var) {
        byte b = this.a;
        zg1 zg1Var = zg1.n;
        Object obj = this.c;
        za5 za5Var = this.b;
        switch (b) {
            case 0:
                bf0 bf0Var = new bf0();
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                bf0Var.S0(bArr, bArr.length);
                return new t67(new u67(bf0Var, za5Var.f, null), null, zg1Var);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new t67(new u67(new w36(new nh0(byteBuffer)), za5Var.f, new oh0(byteBuffer)), null, zg1Var);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = ya8.a;
                boolean z = bitmapDrawable instanceof VectorDrawable;
                if (z) {
                    bitmapDrawable = new BitmapDrawable(za5Var.a.getResources(), ep1.n(bitmapDrawable, ne3.a(za5Var), za5Var.b, za5Var.c, (w07) nv1.x(za5Var, me3.b), za5Var.d == pp5.n));
                }
                return new ce3(bt1.p(bitmapDrawable), z, zg1Var);
        }
    }
}
