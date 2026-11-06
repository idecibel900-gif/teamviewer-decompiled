package o;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class v88 extends RippleDrawable {
    public final boolean m;
    public rv0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2287o;

    public v88(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.m = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.m) {
            this.f2287o = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f2287o = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f2287o;
    }
}
