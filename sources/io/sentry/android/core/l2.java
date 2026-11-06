package io.sentry.android.core;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.teamviewer.chatviewlib.view.RoundAccountPictureImageView;
import o.cx;
import o.g95;
import o.hk0;
import o.im3;
import o.l47;
import o.nd;
import o.of6;
import o.s07;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class l2 {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public l2(Context context, g95 g95Var) {
        this.c = context;
        this.d = g95Var;
        this.e = s07.a(context);
    }

    public int a(long j) {
        int i = this.a + 1;
        long[] jArr = (long[]) this.c;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            cx.H0(jArr, jArr2, 0, 0, jArr.length);
            cx.I0(0, 0, 14, (int[]) this.d, iArr);
            this.c = jArr2;
            this.d = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int[] iArr2 = (int[]) this.e;
        int length2 = iArr2.length;
        if (this.b >= length2) {
            int i4 = length2 * 2;
            iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            cx.I0(0, 0, 14, (int[]) this.e, iArr2);
            this.e = iArr2;
        }
        int[] iArr3 = iArr2;
        int i7 = this.b;
        this.b = iArr2[i7];
        long[] jArr3 = (long[]) this.c;
        jArr3[i3] = j;
        ((int[]) this.d)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (im3.u(jArr3[i8], j) <= 0) {
                break;
            }
            f(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    public nd b(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        nd ndVar;
        byte b = 4;
        Object obj = null;
        int i2 = 0;
        if (l47.o((XmlPullParser) this.c, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 < 28 || i3 > 31) {
                try {
                    ndVar = nd.f(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    v0.d("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    ndVar = null;
                }
                if (ndVar == null) {
                    ndVar = new nd(b, i2, obj);
                }
            } else {
                ndVar = new nd(b, typedValue.data, obj);
            }
        } else {
            ndVar = new nd(b, i2, obj);
        }
        g(typedArray.getChangingConfigurations());
        return ndVar;
    }

    public float c(TypedArray typedArray, String str, int i, float f) {
        if (l47.o((XmlPullParser) this.c, str)) {
            f = typedArray.getFloat(i, f);
        }
        g(typedArray.getChangingConfigurations());
        return f;
    }

    public void d(Bitmap bitmap, boolean z) {
        Resources resources = ((Context) this.c).getResources();
        resources.getClass();
        bitmap.getClass();
        of6 of6Var = new of6(resources, bitmap);
        of6Var.a(true);
        if (z) {
            this.b = of6Var.l;
        }
        ((RoundAccountPictureImageView) ((g95) this.d).m).setImageDrawable(of6Var);
    }

    public void e() {
        int i = this.a;
        Bitmap bitmapCreateBitmap = null;
        if (i == 0) {
            ((RoundAccountPictureImageView) ((g95) this.d).m).setImageDrawable(null);
            return;
        }
        Drawable drawable = ((Context) this.c).getDrawable(i);
        if (drawable instanceof BitmapDrawable) {
            bitmapCreateBitmap = ((BitmapDrawable) drawable).getBitmap();
        } else if (drawable != null) {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        if (bitmapCreateBitmap != null) {
            d(bitmapCreateBitmap, true);
        } else {
            hk0.l("bitmap is null");
        }
    }

    public void f(int i, int i2) {
        long[] jArr = (long[]) this.c;
        int[] iArr = (int[]) this.d;
        int[] iArr2 = (int[]) this.e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public void g(int i) {
        this.a = i | this.a;
    }
}
