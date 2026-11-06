package o;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ee3 extends p30 {
    public final wz3 B;
    public final Rect C;
    public final Rect D;
    public final RectF E;
    public final gi4 F;
    public final t62 G;
    public s65 H;
    public nd I;

    public ee3(ei4 ei4Var, c04 c04Var) {
        super(ei4Var, c04Var);
        this.B = new wz3(3, (byte) 0);
        this.C = new Rect();
        this.D = new Rect();
        this.E = new RectF();
        String str = c04Var.g;
        qh4 qh4Var = ei4Var.m;
        this.F = qh4Var == null ? null : (gi4) ((HashMap) qh4Var.c()).get(str);
        yc4 yc4Var = this.p.x;
        if (yc4Var != null) {
            this.G = new t62(this, this, yc4Var);
        }
    }

    @Override // o.p30, o.i62
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        gi4 gi4Var = this.F;
        if (gi4Var != null) {
            float fC = ta8.c();
            this.f1698o.getClass();
            Bitmap bitmapN = n();
            if (bitmapN != null) {
                rectF.set(0.0f, 0.0f, bitmapN.getWidth() * fC, bitmapN.getHeight() * fC);
            } else {
                rectF.set(0.0f, 0.0f, gi4Var.a * fC, gi4Var.b * fC);
            }
            this.n.mapRect(rectF);
        }
    }

    @Override // o.p30
    public final void i(Canvas canvas, Matrix matrix, int i, r62 r62Var) {
        Bitmap bitmapN = n();
        if (bitmapN == null || bitmapN.isRecycled() || this.F == null) {
            return;
        }
        float fC = ta8.c();
        wz3 wz3Var = this.B;
        wz3Var.setAlpha(i);
        t62 t62Var = this.G;
        if (t62Var != null) {
            r62Var = t62Var.b(matrix, i);
        }
        int width = bitmapN.getWidth();
        int height = bitmapN.getHeight();
        Rect rect = this.C;
        rect.set(0, 0, width, height);
        this.f1698o.getClass();
        int width2 = (int) (bitmapN.getWidth() * fC);
        int height2 = (int) (bitmapN.getHeight() * fC);
        Rect rect2 = this.D;
        rect2.set(0, 0, width2, height2);
        boolean z = r62Var != null;
        if (z) {
            if (this.H == null) {
                this.H = new s65();
            }
            nd ndVar = this.I;
            if (ndVar == null) {
                ndVar = new nd((byte) 10);
                this.I = ndVar;
            }
            nd ndVar2 = ndVar;
            ndVar.n = 255;
            ndVar.f1562o = null;
            r62Var.getClass();
            r62 r62Var2 = new r62(r62Var);
            ndVar2.f1562o = r62Var2;
            r62Var2.b(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.E;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.H.e(canvas, rectF, this.I);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapN, rect, rect2, wz3Var);
        if (z) {
            this.H.c();
            if (this.H.c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    public final Bitmap n() {
        Bitmap bitmapD;
        String str = this.p.g;
        ei4 ei4Var = this.f1698o;
        iu iuVar = ei4Var.q;
        if (iuVar != null) {
            Context contextF = ei4Var.f();
            Context context = (Context) iuVar.n;
            if (contextF != null) {
                if (context instanceof Application) {
                    contextF = contextF.getApplicationContext();
                }
                if (contextF != context) {
                    ei4Var.q = null;
                }
            } else if (context != null) {
                ei4Var.q = null;
            }
        }
        iu iuVar2 = ei4Var.q;
        if (iuVar2 == null) {
            iuVar2 = new iu(ei4Var.getCallback(), ei4Var.m.c());
            ei4Var.q = iuVar2;
        }
        String str2 = (String) iuVar2.f1103o;
        gi4 gi4Var = (gi4) ((Map) iuVar2.p).get(str);
        if (gi4Var == null) {
            bitmapD = null;
        } else {
            int i = gi4Var.b;
            int i2 = gi4Var.a;
            bitmapD = gi4Var.f;
            if (bitmapD == null) {
                Context context2 = (Context) iuVar2.n;
                if (context2 == null) {
                    bitmapD = null;
                } else {
                    String str3 = gi4Var.d;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                        try {
                            if (TextUtils.isEmpty(str2)) {
                                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                            }
                            try {
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                if (bitmapDecodeStream == null) {
                                    xe4.a("Decoded image `" + str + "` is null.");
                                    bitmapD = null;
                                } else {
                                    bitmapD = ta8.d(bitmapDecodeStream, i2, i);
                                    synchronized (iu.s) {
                                        ((gi4) ((Map) iuVar2.p).get(str)).f = bitmapD;
                                    }
                                }
                            } catch (IllegalArgumentException e) {
                                xe4.b("Unable to decode image `" + str + "`.", e);
                            }
                        } catch (IOException e2) {
                            xe4.b("Unable to open asset.", e2);
                        }
                    } else {
                        try {
                            byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                            try {
                                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                if (bitmapDecodeByteArray == null) {
                                    xe4.a("Decoded image `" + str + "` is null.");
                                    bitmapD = null;
                                } else {
                                    bitmapD = ta8.d(bitmapDecodeByteArray, i2, i);
                                    synchronized (iu.s) {
                                        ((gi4) ((Map) iuVar2.p).get(str)).f = bitmapD;
                                    }
                                }
                            } catch (IllegalArgumentException e3) {
                                xe4.b("Unable to decode image `" + str + "`.", e3);
                            }
                        } catch (IllegalArgumentException e4) {
                            xe4.b("data URL did not have correct base64 format.", e4);
                        }
                    }
                }
            }
        }
        if (bitmapD != null) {
            return bitmapD;
        }
        gi4 gi4Var2 = this.F;
        if (gi4Var2 != null) {
            return gi4Var2.f;
        }
        return null;
    }
}
