package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.ArrayList;
import o.iz5;
import o.tk0;
import o.uk0;
import o.wc6;
import o.x07;

/* JADX INFO: loaded from: classes.dex */
public class ViewfinderView extends View {
    public static final int[] x = {0, 64, 128, 192, 255, 192, 128, 64};
    public final Paint m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f57o;
    public final int p;
    public boolean q;
    public int r;
    public ArrayList s;
    public ArrayList t;
    public uk0 u;
    public Rect v;
    public x07 w;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new Paint(1);
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, iz5.b);
        this.n = typedArrayObtainStyledAttributes.getColor(4, resources.getColor(R.color.zxing_viewfinder_mask));
        typedArrayObtainStyledAttributes.getColor(1, resources.getColor(R.color.zxing_result_view));
        this.f57o = typedArrayObtainStyledAttributes.getColor(2, resources.getColor(R.color.zxing_viewfinder_laser));
        this.p = typedArrayObtainStyledAttributes.getColor(0, resources.getColor(R.color.zxing_possible_result_points));
        this.q = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        this.r = 0;
        this.s = new ArrayList(20);
        this.t = new ArrayList(20);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        x07 x07Var;
        uk0 uk0Var = this.u;
        if (uk0Var != null) {
            Rect framingRect = uk0Var.getFramingRect();
            x07 previewSize = this.u.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.v = framingRect;
                this.w = previewSize;
            }
        }
        Rect rect = this.v;
        if (rect == null || (x07Var = this.w) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i = this.n;
        Paint paint = this.m;
        paint.setColor(i);
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, rect.top, paint);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, paint);
        canvas.drawRect(rect.right + 1, rect.top, f, rect.bottom + 1, paint);
        canvas.drawRect(0.0f, rect.bottom + 1, f, height, paint);
        if (this.q) {
            paint.setColor(this.f57o);
            paint.setAlpha(x[this.r]);
            this.r = (this.r + 1) % 8;
            int iHeight = (rect.height() / 2) + rect.top;
            canvas.drawRect(rect.left + 2, iHeight - 1, rect.right - 1, iHeight + 2, paint);
        }
        float width2 = getWidth() / x07Var.m;
        float height2 = getHeight() / x07Var.n;
        boolean zIsEmpty = this.t.isEmpty();
        int i2 = this.p;
        if (!zIsEmpty) {
            paint.setAlpha(80);
            paint.setColor(i2);
            for (wc6 wc6Var : this.t) {
                canvas.drawCircle((int) (wc6Var.a * width2), (int) (wc6Var.b * height2), 3.0f, paint);
            }
            this.t.clear();
        }
        if (!this.s.isEmpty()) {
            paint.setAlpha(160);
            paint.setColor(i2);
            for (wc6 wc6Var2 : this.s) {
                canvas.drawCircle((int) (wc6Var2.a * width2), (int) (wc6Var2.b * height2), 6.0f, paint);
            }
            ArrayList arrayList = this.s;
            ArrayList arrayList2 = this.t;
            this.s = arrayList2;
            this.t = arrayList;
            arrayList2.clear();
        }
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }

    public void setCameraPreview(uk0 uk0Var) {
        this.u = uk0Var;
        uk0Var.v.add(new tk0(this, (byte) 2));
    }

    public void setLaserVisibility(boolean z) {
        this.q = z;
    }

    public void setMaskColor(int i) {
        this.n = i;
    }
}
