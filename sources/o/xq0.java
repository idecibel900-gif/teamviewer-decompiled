package o;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
public final class xq0 extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public xq0(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ar0 ar0Var = this.a.q;
        if (ar0Var != null) {
            ar0Var.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
