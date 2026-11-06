package o;

import android.os.Build;
import android.view.SoundEffectConstants;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class og implements hw2 {
    public final AndroidComposeView m;

    public og(AndroidComposeView androidComposeView) {
        this.m = androidComposeView;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        int i = ((wp2) obj).a;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Integer numC = fq2.c(i);
        if (numC != null) {
            int iIntValue = numC.intValue();
            this.m.playSoundEffect(Build.VERSION.SDK_INT >= 31 ? hq.a.a(iIntValue, zBooleanValue) : SoundEffectConstants.getContantForFocusDirection(iIntValue));
        }
        return f88.a;
    }
}
