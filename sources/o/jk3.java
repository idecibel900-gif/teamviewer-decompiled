package o;

import android.media.MediaPlayer;
import com.teamviewer.remotecontrolviewlib.view.session.InstructionsOverlayView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jk3 implements MediaPlayer.OnPreparedListener {
    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i = InstructionsOverlayView.v;
        mediaPlayer.setLooping(true);
    }
}
