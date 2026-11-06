package com.teamviewer.avatarlib.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import coil3.target.ImageViewTarget;
import io.sentry.android.replay.g0;
import java.util.HashSet;
import kotlin.jvm.functions.Function1;
import o.bc7;
import o.ep3;
import o.f4;
import o.ge3;
import o.hk0;
import o.jz5;
import o.ne3;
import o.of6;
import o.s07;
import o.wo1;
import o.yi5;

/* JADX INFO: loaded from: classes.dex */
public final class RoundAvatarImageView extends AppCompatImageView {
    public static final /* synthetic */ int t = 0;
    public int p;
    public String q;
    public boolean r;
    public final HashSet s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundAvatarImageView(Context context) {
        super(context);
        context.getClass();
        this.r = true;
        this.s = new HashSet();
        a(context, null);
    }

    private final void setAvatar(Bitmap bitmap) {
        of6 of6Var;
        if (this.r) {
            Resources resources = getResources();
            resources.getClass();
            bitmap.getClass();
            of6Var = new of6(resources, bitmap);
            of6Var.a(true);
        } else {
            Resources resources2 = getResources();
            resources2.getClass();
            bitmap.getClass();
            of6Var = new of6(resources2, bitmap);
            of6Var.a(false);
        }
        setImageDrawable(of6Var);
    }

    private final void setAvatarFromResource(int i) {
        Bitmap bitmapCreateBitmap = null;
        if (i == 0) {
            setImageDrawable(null);
            return;
        }
        Context context = getContext();
        context.getClass();
        Drawable drawable = context.getDrawable(i);
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
            setAvatar(bitmapCreateBitmap);
        } else {
            hk0.l("bitmap is null");
        }
    }

    public final void a(Context context, AttributeSet attributeSet) {
        addOnLayoutChangeListener(new g0(this, (byte) 1));
        if (attributeSet == null) {
            setImageDrawable(null);
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jz5.a, 0, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        int resourceId = 0;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 0) {
                this.r = typedArrayObtainStyledAttributes.getBoolean(index, true);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            setPlaceHolder(resourceId);
        }
    }

    public final void d(String str, final boolean z) {
        int iMin = (int) Math.min(getWidth(), getHeight());
        if (iMin == 0) {
            this.q = str;
        }
        wo1.f.getClass();
        final yi5 yi5Var = new yi5((byte) 6);
        final int i = this.p;
        final Context context = getContext();
        context.getClass();
        if (str == null || str.length() == 0) {
            setAvatarFromResource(this.p);
            return;
        }
        int i2 = 16;
        while (i2 < iMin && i2 < 512) {
            i2 *= 2;
        }
        String strL = bc7.L(str, "[size]", String.valueOf(i2));
        ge3 ge3Var = new ge3(context);
        ge3Var.c = strL;
        final byte b = 0;
        ge3Var.n = new Function1(yi5Var, context, i, b) { // from class: o.jf6
            public final /* synthetic */ byte m;
            public final /* synthetic */ Context n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ int f1161o;

            {
                this.m = b;
                this.n = context;
                this.f1161o = i;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = this.m;
                int i3 = this.f1161o;
                Context context2 = this.n;
                ke3 ke3Var = (ke3) obj;
                switch (b2) {
                    case 0:
                        ke3Var.getClass();
                        break;
                    default:
                        ke3Var.getClass();
                        break;
                }
                return yi5.i(context2, i3);
            }
        };
        final byte b2 = 1;
        ge3Var.f885o = new Function1(yi5Var, context, i, b2) { // from class: o.jf6
            public final /* synthetic */ byte m;
            public final /* synthetic */ Context n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ int f1161o;

            {
                this.m = b2;
                this.n = context;
                this.f1161o = i;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = this.m;
                int i3 = this.f1161o;
                Context context2 = this.n;
                ke3 ke3Var = (ke3) obj;
                switch (b3) {
                    case 0:
                        ke3Var.getClass();
                        break;
                    default:
                        ke3Var.getClass();
                        break;
                }
                return yi5.i(context2, i3);
            }
        };
        ge3Var.m = new Function1(z, yi5Var, context, i) { // from class: o.kf6
            public final /* synthetic */ boolean m;
            public final /* synthetic */ Context n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ int f1260o;

            {
                this.n = context;
                this.f1260o = i;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((ke3) obj).getClass();
                if (this.m) {
                    return null;
                }
                return yi5.i(this.n, this.f1260o);
            }
        };
        f4 f4Var = ne3.a;
        ge3Var.d = new ImageViewTarget(this);
        ge3Var.e = new ep3(this, yi5Var, this, (byte) 17);
        s07.a(context).a(ge3Var.a());
        this.s.add(yi5Var);
    }

    public final void e(yi5 yi5Var) {
        Drawable drawable = getDrawable();
        drawable.getClass();
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        bitmap.getClass();
        setAvatar(bitmap);
        invalidate();
        this.s.remove(yi5Var);
    }

    public final void setPlaceHolder(int i) {
        this.p = i;
        setAvatarFromResource(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundAvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.r = true;
        this.s = new HashSet();
        a(context, attributeSet);
    }
}
