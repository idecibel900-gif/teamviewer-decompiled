package com.teamviewer.libs.materialtoolbar.fab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import o.kd3;
import o.nz7;
import o.oz7;

/* JADX INFO: loaded from: classes.dex */
public final class ToolbarItemViewFab extends FloatingActionButton implements kd3 {
    public oz7 C;
    public boolean D;

    public ToolbarItemViewFab(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // o.kd3
    public final void a() {
        animate().alpha(0.0f).translationY(getHeight()).setListener(new nz7(this, this, (byte) 0)).start();
    }

    @Override // o.kd3
    public final void b() {
        if (this.D) {
            setTranslationY(getHeight());
            this.D = false;
        }
        animate().alpha(1.0f).translationY(0.0f).setListener(new nz7(this, this, (byte) 1)).start();
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
    public ToolbarItemViewFab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolbarItemViewFab(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
