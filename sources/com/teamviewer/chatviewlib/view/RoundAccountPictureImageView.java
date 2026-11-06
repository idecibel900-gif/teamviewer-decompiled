package com.teamviewer.chatviewlib.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import io.sentry.android.core.l2;
import io.sentry.android.core.n1;
import o.a81;
import o.bc7;
import o.bt1;
import o.f4;
import o.g12;
import o.g95;
import o.ge3;
import o.i46;
import o.ne3;
import o.of6;
import o.p46;
import o.sg2;
import o.tg2;
import o.w07;

/* JADX INFO: loaded from: classes.dex */
public class RoundAccountPictureImageView extends AppCompatImageView {
    public final l2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundAccountPictureImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.p = new l2(context, new g95(this));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    public final void a(String str, boolean z) {
        String strL;
        of6 of6Var;
        sg2 sg2Var;
        Bitmap bitmap;
        l2 l2Var = this.p;
        if (l2Var != null) {
            if (str != null) {
                int i = 16;
                while (i < l2Var.b && i < 512) {
                    i *= 2;
                }
                strL = bc7.L(str, "[size]", String.valueOf(i));
            } else {
                strL = null;
            }
            if (strL == null || strL.length() == 0) {
                l2Var.e();
                return;
            }
            i46 i46Var = (i46) l2Var.e;
            Context context = (Context) l2Var.c;
            if (z) {
                of6Var = null;
            } else {
                Drawable drawable = context.getDrawable(l2Var.a);
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                } else if (drawable != null) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.getClass();
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmap = bitmapCreateBitmap;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    Resources resources = context.getResources();
                    resources.getClass();
                    of6Var = new of6(resources, bitmap);
                    of6Var.a(true);
                } else {
                    of6Var = null;
                }
            }
            ge3 ge3Var = new ge3(context);
            f4 f4Var = ne3.a;
            Object obj = ge3Var.s;
            if (obj instanceof sg2) {
                sg2Var = (sg2) obj;
            } else {
                if (!(obj instanceof tg2)) {
                    throw new AssertionError();
                }
                sg2 sg2Var2 = new sg2((tg2) obj);
                ge3Var.s = sg2Var2;
                sg2Var = sg2Var2;
            }
            sg2Var.a.put(ne3.g, Boolean.FALSE);
            ge3Var.c = strL;
            int i2 = l2Var.b;
            g12.a(i2);
            g12 g12Var = new g12(i2);
            g12.a(i2);
            ge3Var.p = new p46(new w07(g12Var, new g12(i2)));
            ge3Var.m = new a81(of6Var != null ? bt1.p(of6Var) : null, (byte) 25);
            ge3Var.d = new n1((byte) 5, of6Var, l2Var, z);
            i46Var.a(ge3Var.a());
        }
    }

    public final void setPlaceHolder(int i) {
        l2 l2Var = this.p;
        if (l2Var != null) {
            l2Var.a = i;
            l2Var.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundAccountPictureImageView(Context context) {
        super(context);
        context.getClass();
        this.p = new l2(context, new g95(this));
    }
}
