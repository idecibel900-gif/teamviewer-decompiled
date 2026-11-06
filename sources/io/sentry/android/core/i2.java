package io.sentry.android.core;

import io.sentry.l6;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class i2 extends l6 {
    @Override // io.sentry.l6
    public final void v(boolean z) {
        super.v(z);
        if (z) {
            c("android.webkit.WebView");
            c("android.widget.VideoView");
            c("androidx.camera.view.PreviewView");
            c("androidx.media3.ui.PlayerView");
            c("com.google.android.exoplayer2.ui.PlayerView");
            c("com.google.android.exoplayer2.ui.StyledPlayerView");
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.a;
        copyOnWriteArraySet.remove("android.webkit.WebView");
        copyOnWriteArraySet.remove("android.widget.VideoView");
        copyOnWriteArraySet.remove("androidx.camera.view.PreviewView");
        copyOnWriteArraySet.remove("androidx.media3.ui.PlayerView");
        copyOnWriteArraySet.remove("com.google.android.exoplayer2.ui.PlayerView");
        copyOnWriteArraySet.remove("com.google.android.exoplayer2.ui.StyledPlayerView");
    }
}
