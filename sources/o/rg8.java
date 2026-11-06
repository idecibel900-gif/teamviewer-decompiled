package o;

import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
public abstract class rg8 extends ImageButton {
    public int m;

    public final void c(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.m = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.m;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        c(i, true);
    }
}
