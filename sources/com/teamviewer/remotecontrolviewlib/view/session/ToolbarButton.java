package com.teamviewer.remotecontrolviewlib.view.session;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import o.kd3;

/* JADX INFO: loaded from: classes.dex */
public final class ToolbarButton extends AppCompatImageButton implements kd3 {
    public ToolbarButton(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // o.kd3
    public final void a() {
    }

    @Override // o.kd3
    public final void b() {
    }

    @Override // o.kd3
    public ImageView getImageView() {
        return this;
    }

    @Override // o.kd3
    public View getView() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolbarButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolbarButton(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
