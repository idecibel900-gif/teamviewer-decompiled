package o;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class z97 implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ p70 a;
    public final /* synthetic */ g76 b;

    public z97(p70 p70Var, g76 g76Var) {
        this.a = p70Var;
        this.b = g76Var;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [o.w97] */
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        final p70 p70Var = this.a;
        za5 za5Var = p70Var.b;
        w07 w07Var = za5Var.b;
        oi6 oi6Var = za5Var.c;
        f4 f4Var = me3.b;
        long jY = j51.y(width, height, w07Var, oi6Var, (w07) nv1.x(za5Var, f4Var));
        int i = (int) (jY >> 32);
        int i2 = (int) (jY & 4294967295L);
        if (width > 0 && height > 0 && (width != i || height != i2)) {
            za5 za5Var2 = p70Var.b;
            double dZ = j51.z(width, height, i, i2, za5Var2.c, (w07) nv1.x(za5Var2, f4Var));
            boolean z = dZ < 1.0d;
            this.b.m = z;
            if (z || p70Var.b.d == pp5.m) {
                imageDecoder.setTargetSize(vn4.r0(((double) width) * dZ), vn4.r0(dZ * ((double) height)));
            }
        }
        imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: o.w97
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return ((Boolean) nv1.x(p70Var.b, ne3.f)).booleanValue();
            }
        });
        za5 za5Var3 = p70Var.b;
        imageDecoder.setAllocator(ne3.a(za5Var3) == Bitmap.Config.HARDWARE ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) nv1.x(za5Var3, ne3.h)).booleanValue() ? 1 : 0);
        f4 f4Var2 = ne3.c;
        if (((ColorSpace) nv1.x(za5Var3, f4Var2)) != null) {
            imageDecoder.setTargetColorSpace((ColorSpace) nv1.x(za5Var3, f4Var2));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) nv1.x(za5Var3, ne3.d)).booleanValue());
    }
}
