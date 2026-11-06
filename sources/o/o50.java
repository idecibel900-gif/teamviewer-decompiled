package o;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o50 implements MediaPlayer.OnCompletionListener {
    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }
}
