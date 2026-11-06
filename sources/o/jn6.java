package o;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* JADX INFO: loaded from: classes.dex */
public final class jn6 implements View.OnKeyListener {
    public final /* synthetic */ SeekBarPreference m;

    public jn6(SeekBarPreference seekBarPreference) {
        this.m = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            SeekBarPreference seekBarPreference = this.m;
            if ((seekBarPreference.f0 || (i != 21 && i != 22)) && i != 23 && i != 66) {
                SeekBar seekBar = seekBarPreference.d0;
                if (seekBar != null) {
                    return seekBar.onKeyDown(i, keyEvent);
                }
                io.sentry.android.core.v0.c("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
        }
        return false;
    }
}
