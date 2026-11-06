package o;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class hh {
    public static final hh a = new hh();

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        fh fhVar = fh.a;
        ViewTranslationCallback unused = fh.a;
        view.setViewTranslationCallback(fhVar);
    }
}
