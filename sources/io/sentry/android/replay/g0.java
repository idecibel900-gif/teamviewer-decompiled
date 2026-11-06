package io.sentry.android.replay;

import android.view.View;
import com.teamviewer.avatarlib.view.RoundAvatarImageView;
import com.teamviewer.libs.materialtoolbar.ToolbarViewMovable;
import java.lang.ref.WeakReference;
import o.im3;
import o.lv0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public /* synthetic */ g0(Object obj, byte b) {
        this.m = b;
        this.n = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String str;
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                k0 k0Var = (k0) obj;
                int i9 = i4 - i2;
                int i10 = i8 - i6;
                if (i3 - i != i7 - i5 || i9 != i10) {
                    WeakReference weakReference = (WeakReference) lv0.w0(k0Var.s);
                    if (im3.n(view, weakReference != null ? (View) weakReference.get() : null)) {
                        view.getClass();
                        k0Var.j(view);
                        break;
                    }
                }
                break;
            case 1:
                RoundAvatarImageView roundAvatarImageView = (RoundAvatarImageView) obj;
                int i11 = RoundAvatarImageView.t;
                if ((i != i5 || i2 != i6 || i3 != i7 || i4 != i8) && i3 - i > 0 && i4 - i2 > 0 && (str = roundAvatarImageView.q) != null) {
                    roundAvatarImageView.q = null;
                    roundAvatarImageView.d(str, true);
                }
                break;
            default:
                ToolbarViewMovable toolbarViewMovable = (ToolbarViewMovable) obj;
                int i12 = ToolbarViewMovable.r;
                toolbarViewMovable.f62o = view.getWidth() - toolbarViewMovable.getWidth();
                break;
        }
    }
}
