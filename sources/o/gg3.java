package o;

import com.teamviewer.activereviews.InAppReviewLauncher;
import com.teamviewer.teamviewerlib.swig.tvconfigadapter.SettingsChangeCallback;

/* JADX INFO: loaded from: classes.dex */
public final class gg3 extends SettingsChangeCallback {
    public final /* synthetic */ InAppReviewLauncher a;

    public gg3(InAppReviewLauncher inAppReviewLauncher) {
        this.a = inAppReviewLauncher;
    }

    @Override // com.teamviewer.teamviewerlib.swig.tvconfigadapter.SettingsChangeCallback
    public final void OnSettingsChanged() {
        this.a.h = true;
    }
}
