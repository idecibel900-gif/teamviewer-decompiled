package com.teamviewer.chatviewlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import o.im3;
import o.kz5;
import o.y4;
import o.z4;

/* JADX INFO: loaded from: classes.dex */
public final class AccountPictureView extends FrameLayout {
    public z4 m;
    public ImageView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y4 f59o;
    public boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.p = true;
        a(context, attributeSet);
    }

    private final void setOnlineState(y4 y4Var) {
        if (y4Var != this.f59o) {
            y4 y4Var2 = y4.NOSTATE;
            ImageView imageView = this.n;
            if (y4Var == y4Var2) {
                if (imageView == null) {
                    im3.e0("onlineStateMarker");
                    throw null;
                }
                imageView.setVisibility(4);
            } else {
                if (imageView == null) {
                    im3.e0("onlineStateMarker");
                    throw null;
                }
                imageView.setVisibility(0);
                ImageView imageView2 = this.n;
                if (imageView2 == null) {
                    im3.e0("onlineStateMarker");
                    throw null;
                }
                imageView2.setImageResource(y4Var.n);
            }
            this.f59o = y4Var;
        }
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.n = new ImageView(context);
        ImageView imageView = this.n;
        if (imageView == null) {
            im3.e0("onlineStateMarker");
            throw null;
        }
        this.m = new z4(context, imageView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 51;
        z4 z4Var = this.m;
        if (z4Var == null) {
            im3.e0("accountPictureImageView");
            throw null;
        }
        z4Var.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 85;
        ImageView imageView2 = this.n;
        if (imageView2 == null) {
            im3.e0("onlineStateMarker");
            throw null;
        }
        imageView2.setLayoutParams(layoutParams2);
        if (attributeSet != null) {
            z4 z4Var2 = this.m;
            if (z4Var2 == null) {
                im3.e0("accountPictureImageView");
                throw null;
            }
            z4Var2.setPlaceHolder(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "src", 0));
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kz5.a, 0, 0);
            this.p = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        z4 z4Var3 = this.m;
        if (z4Var3 == null) {
            im3.e0("accountPictureImageView");
            throw null;
        }
        addView(z4Var3);
        ImageView imageView3 = this.n;
        if (imageView3 != null) {
            addView(imageView3);
        } else {
            im3.e0("onlineStateMarker");
            throw null;
        }
    }

    public final void b(String str, y4 y4Var, boolean z) {
        y4Var.getClass();
        z4 z4Var = this.m;
        if (z4Var == null) {
            im3.e0("accountPictureImageView");
            throw null;
        }
        z4Var.a(str, z);
        setOnlineState(y4Var);
        if (this.p && y4.OFFLINE == y4Var) {
            z4 z4Var2 = this.m;
            if (z4Var2 != null) {
                z4Var2.setAlpha(0.5f);
                return;
            } else {
                im3.e0("accountPictureImageView");
                throw null;
            }
        }
        z4 z4Var3 = this.m;
        if (z4Var3 != null) {
            z4Var3.setAlpha(1.0f);
        } else {
            im3.e0("accountPictureImageView");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPictureView(Context context) {
        super(context);
        context.getClass();
        this.p = true;
        a(context, null);
    }
}
