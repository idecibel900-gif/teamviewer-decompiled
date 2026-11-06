package o;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* JADX INFO: loaded from: classes.dex */
public final class in6 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ SeekBarPreference a;

    public in6(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBarPreference seekBarPreference = this.a;
        if (!z || (!seekBarPreference.h0 && seekBarPreference.c0)) {
            int i2 = i + seekBarPreference.Z;
            TextView textView = seekBarPreference.e0;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
                return;
            }
            return;
        }
        int progress = seekBar.getProgress() + seekBarPreference.Z;
        if (progress != seekBarPreference.Y) {
            seekBarPreference.y(progress, false);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a.c0 = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress;
        SeekBarPreference seekBarPreference = this.a;
        seekBarPreference.c0 = false;
        int progress2 = seekBar.getProgress();
        int i = seekBarPreference.Z;
        if (progress2 + i == seekBarPreference.Y || (progress = seekBar.getProgress() + i) == seekBarPreference.Y) {
            return;
        }
        seekBarPreference.y(progress, false);
    }
}
