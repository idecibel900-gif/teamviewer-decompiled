package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.widget.ImageView;
import com.teamviewer.chatviewlib.view.RoundAccountPictureImageView;

/* JADX INFO: loaded from: classes.dex */
public final class z4 extends RoundAccountPictureImageView {
    public final ImageView q;
    public final int r;
    public final Paint s;
    public Bitmap t;
    public Canvas u;

    public z4(Context context, ImageView imageView) {
        super(context);
        this.q = imageView;
        Resources resources = getResources();
        resources.getClass();
        this.r = (int) ((2.0f * resources.getDisplayMetrics().density) + 0.5f);
        Paint paint = new Paint();
        this.s = paint;
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setAntiAlias(true);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        Canvas canvas2 = this.u;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            super.onDraw(canvas2);
            ImageView imageView = this.q;
            if (imageView != null && imageView.getVisibility() == 0) {
                canvas2.drawCircle(canvas2.getWidth() - (imageView.getHeight() / 2), canvas2.getHeight() - (imageView.getHeight() / 2), (imageView.getHeight() / 2) + this.r, this.s);
            }
        }
        Bitmap bitmap = this.t;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Bitmap bitmap = this.t;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        this.t = bitmapCreateBitmap;
        bitmapCreateBitmap.eraseColor(0);
        Bitmap bitmap2 = this.t;
        bitmap2.getClass();
        this.u = new Canvas(bitmap2);
    }
}
