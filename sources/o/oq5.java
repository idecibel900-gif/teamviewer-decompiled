package o;

import android.view.Window;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class oq5 {
    public static void a(Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
    }
}
