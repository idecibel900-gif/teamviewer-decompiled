package o;

import android.content.Context;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import com.teamviewer.remotecontrolviewmodellib.swig.IRemoveWallpaperViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IRemoveWallpaperViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import com.teamviewer.teamviewerlib.settings.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class b05 extends oe8 implements fd3 {
    public final IRemoveWallpaperViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Settings f379o;
    public final NativeLiveDataBool p;
    public final p q;
    public final nw4 r;

    public b05(IRemoveWallpaperViewModel iRemoveWallpaperViewModel, Settings settings) {
        settings.getClass();
        this.n = iRemoveWallpaperViewModel;
        this.f379o = settings;
        NativeLiveDataBool nativeLiveDataBoolNewInstance = NativeLiveDataBool.newInstance(IRemoveWallpaperViewModelSWIGJNI.IRemoveWallpaperViewModel_RemoveWallpaperState(iRemoveWallpaperViewModel.a, iRemoveWallpaperViewModel), false);
        this.p = nativeLiveDataBoolNewInstance;
        p pVar = new p(this, (byte) 13);
        this.q = pVar;
        nw4 nw4Var = new nw4();
        this.r = nw4Var;
        nativeLiveDataBoolNewInstance.observeForever(pVar);
        nw4Var.setValue(nativeLiveDataBoolNewInstance.getValue());
    }

    @Override // o.fd3
    public final void C0(boolean z) {
        IRemoveWallpaperViewModel iRemoveWallpaperViewModel = this.n;
        if (im3.n(NativeLiveDataBool.newInstance(IRemoveWallpaperViewModelSWIGJNI.IRemoveWallpaperViewModel_CanRemoveWallpaper(iRemoveWallpaperViewModel.a, iRemoveWallpaperViewModel), false).getValue(), Boolean.TRUE)) {
            IRemoveWallpaperViewModelSWIGJNI.IRemoveWallpaperViewModel_ToggleRemoveWallpaper(iRemoveWallpaperViewModel.a, iRemoveWallpaperViewModel);
            ca8 ca8Var = ca8.P_REMOTE_REMOVEWALLPAPER;
            this.f379o.getClass();
            Settings.k(gv6.USER, ca8Var, z);
            return;
        }
        ye4.a.g("TVRemoveWallpaperPreferenceViewModel", "Remove Wallpaper not supported by partner");
        Context context = d82.M;
        if (context != null) {
            d82.t(context, R.string.tv_supportedFeatureMessage_NoRemoveWallpaper);
        } else {
            ye4.c("TVNotificationManager", "message: could not show toast. No context available");
        }
    }

    @Override // o.oe8
    public final void U0() {
        this.p.removeObserver(this.q);
        this.n.a();
    }

    @Override // o.fd3
    public final nw4 v0() {
        return this.r;
    }
}
