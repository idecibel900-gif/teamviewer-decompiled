package o;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ih {
    public static final ih a = new ih();

    public final void a(View view, gn5 gn5Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = gn5Var instanceof yj ? PointerIcon.getSystemIcon(context, ((yj) gn5Var).b) : PointerIcon.getSystemIcon(context, 1000);
        if (im3.n(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
