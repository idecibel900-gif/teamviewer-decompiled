package o;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class zd8 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static gb1 b(View view, gb1 gb1Var) {
        ContentInfo contentInfoB = gb1Var.a.B();
        Objects.requireNonNull(contentInfoB);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoB);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoB ? gb1Var : new gb1(new xc0(contentInfoPerformReceiveContent));
    }
}
