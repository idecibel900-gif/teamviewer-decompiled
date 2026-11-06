package o;

import android.media.MediaPlayer;
import com.teamviewer.remotecontrolviewlib.view.session.InstructionsOverlayView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p50 implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ p50(byte b) {
        this.a = b;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        switch (this.a) {
            case 0:
                io.sentry.android.core.v0.j("q50", "Failed to beep " + i + ", " + i2);
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();
                break;
            default:
                int i3 = InstructionsOverlayView.v;
                ye4.c("InstructionsOverlayView", "VideoView can't be played, errorType:" + i + ", errorCode:" + i2);
                break;
        }
        return true;
    }
}
