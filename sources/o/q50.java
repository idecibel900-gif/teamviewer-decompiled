package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import com.teamviewer.teamviewer.market.mobile.R;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class q50 {
    public final Context a;
    public boolean b = true;

    public q50(Activity activity) {
        activity.setVolumeControlStream(3);
        this.a = activity.getApplicationContext();
    }

    public final void a() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new o50());
        mediaPlayer.setOnErrorListener(new p50((byte) 0));
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.a.getResources().openRawResourceFd(R.raw.zxing_beep);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (Throwable th) {
                assetFileDescriptorOpenRawResourceFd.close();
                throw th;
            }
        } catch (IOException e) {
            io.sentry.android.core.v0.k("q50", e);
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }
}
