package o;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
public final class c12 extends ViewOutlineProvider {
    public final /* synthetic */ byte a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        me8 me8Var;
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 3:
                if (!(view instanceof me8) || (outline2 = (me8Var = (me8) view).q) == null) {
                    return;
                }
                outline.set(outline2);
                float f = me8Var.w;
                if (f == 0.0f && me8Var.x == 0.0f) {
                    return;
                }
                outline.offset((int) f, (int) me8Var.x);
                return;
            default:
                view.getClass();
                throw new ClassCastException();
        }
    }
}
