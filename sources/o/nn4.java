package o;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: loaded from: classes.dex */
public final class nn4 extends cs {
    public static final int[][] s = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList q;
    public boolean r;

    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.q;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iD0 = io1.d0(this, com.teamviewer.teamviewer.market.mobile.R.attr.colorControlActivated);
        int iD1 = io1.d0(this, com.teamviewer.teamviewer.market.mobile.R.attr.colorSurface);
        int iD2 = io1.d0(this, com.teamviewer.teamviewer.market.mobile.R.attr.colorOnSurface);
        ColorStateList colorStateList2 = new ColorStateList(s, new int[]{wo1.R(1.0f, iD1, iD0), wo1.R(0.54f, iD1, iD2), wo1.R(0.38f, iD1, iD2), wo1.R(0.38f, iD1, iD2)});
        this.q = colorStateList2;
        return colorStateList2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.r = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
