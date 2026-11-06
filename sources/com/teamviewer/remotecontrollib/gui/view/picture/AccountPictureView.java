package com.teamviewer.remotecontrollib.gui.view.picture;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.teamviewer.chatviewlib.view.RoundAccountPictureImageView;
import o.oz5;
import o.x4;

/* JADX INFO: loaded from: classes.dex */
public final class AccountPictureView extends FrameLayout {
    public RoundAccountPictureImageView m;
    public ImageView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x4 f66o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPictureView(Context context) {
        super(context);
        context.getClass();
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.n = new ImageView(context);
        this.m = new RoundAccountPictureImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 51;
        RoundAccountPictureImageView roundAccountPictureImageView = this.m;
        if (roundAccountPictureImageView != null) {
            roundAccountPictureImageView.setLayoutParams(layoutParams);
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 85;
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams2);
        }
        if (attributeSet != null) {
            RoundAccountPictureImageView roundAccountPictureImageView2 = this.m;
            if (roundAccountPictureImageView2 != null) {
                roundAccountPictureImageView2.setPlaceHolder(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "src", 0));
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oz5.a, 0, 0);
            typedArrayObtainStyledAttributes.getClass();
            typedArrayObtainStyledAttributes.recycle();
        }
        addView(this.m);
        addView(this.n);
    }

    public final void setOnlineState(x4 x4Var) {
        x4Var.getClass();
        if (x4Var != this.f66o) {
            x4 x4Var2 = x4.NOSTATE;
            ImageView imageView = this.n;
            if (x4Var != x4Var2) {
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                ImageView imageView2 = this.n;
                if (imageView2 != null) {
                    imageView2.setImageResource(x4Var.n);
                }
            } else if (imageView != null) {
                imageView.setVisibility(4);
            }
            this.f66o = x4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        a(context, attributeSet);
    }
}
