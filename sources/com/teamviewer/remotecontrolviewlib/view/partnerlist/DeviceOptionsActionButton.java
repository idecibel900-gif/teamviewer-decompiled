package com.teamviewer.remotecontrolviewlib.view.partnerlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.teamviewer.teamviewer.market.mobile.R;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceOptionsActionButton extends MaterialButton {
    public static final int[] F = {R.attr.isPrimary};
    public boolean E;

    public DeviceOptionsActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.E) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F);
        }
        iArrOnCreateDrawableState.getClass();
        return iArrOnCreateDrawableState;
    }

    public final void setPrimary(boolean z) {
        this.E = z;
        refreshDrawableState();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceOptionsActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeviceOptionsActionButton(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
