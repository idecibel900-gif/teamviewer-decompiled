package o;

import android.content.res.Resources;
import com.teamviewer.nativelivedatalib.swig.NativeLiveDataInt;
import com.teamviewer.remotecontrolviewmodellib.swig.ISessionQualitySettingsViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.ISessionQualitySettingsViewModelSWIGJNI;
import com.teamviewer.teamviewer.market.mobile.R;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nz4 extends oe8 implements hd3 {
    public final ISessionQualitySettingsViewModel n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Resources f1615o;
    public final yi5 p;
    public final p q;
    public final nw4 r;

    public nz4(ISessionQualitySettingsViewModel iSessionQualitySettingsViewModel, Resources resources, yi5 yi5Var) {
        yi5Var.getClass();
        this.n = iSessionQualitySettingsViewModel;
        this.f1615o = resources;
        this.p = yi5Var;
        p pVar = new p(this, (byte) 10);
        this.q = pVar;
        nw4 nw4Var = new nw4();
        this.r = nw4Var;
        NativeLiveDataInt nativeLiveDataIntNewInstance = NativeLiveDataInt.newInstance(ISessionQualitySettingsViewModelSWIGJNI.ISessionQualitySettingsViewModel_GetQualityMode(iSessionQualitySettingsViewModel.a, iSessionQualitySettingsViewModel), false);
        nativeLiveDataIntNewInstance.observeForever(pVar);
        nw4Var.setValue(Integer.valueOf(it1.H((Integer) nativeLiveDataIntNewInstance.getValue())));
    }

    @Override // o.oe8
    public final void U0() {
        ISessionQualitySettingsViewModel iSessionQualitySettingsViewModel = this.n;
        NativeLiveDataInt.newInstance(ISessionQualitySettingsViewModelSWIGJNI.ISessionQualitySettingsViewModel_GetQualityMode(iSessionQualitySettingsViewModel.a, iSessionQualitySettingsViewModel), false).removeObserver(this.q);
        iSessionQualitySettingsViewModel.a();
    }

    @Override // o.hd3
    public final void X(xt2 xt2Var, ll7 ll7Var) {
        String string;
        xt2Var.getClass();
        ISessionQualitySettingsViewModel iSessionQualitySettingsViewModel = this.n;
        Integer num = (Integer) NativeLiveDataInt.newInstance(ISessionQualitySettingsViewModelSWIGJNI.ISessionQualitySettingsViewModel_GetQualityMode(iSessionQualitySettingsViewModel.a, iSessionQualitySettingsViewModel), false).getValue();
        Resources resources = this.f1615o;
        if (num != null && num.intValue() == 0) {
            string = resources.getString(R.string.tv_options_Automatic);
            string.getClass();
        } else if (num != null && num.intValue() == 1) {
            string = resources.getString(R.string.tv_options_OptimizeQuality);
            string.getClass();
        } else if (num != null && num.intValue() == 2) {
            string = resources.getString(R.string.tv_options_OptimizeSpeed);
            string.getClass();
        } else {
            string = resources.getString(R.string.tv_options_Automatic);
            string.getClass();
        }
        String[] stringArray = resources.getStringArray(R.array.tv_options_QualitySettings);
        stringArray.getClass();
        List listG1 = cx.g1(stringArray);
        this.p.getClass();
        fc4 fc4VarD = yi5.d(string, listG1);
        fc4VarD.K0 = R.string.tv_ok;
        fc4VarD.O0 = R.string.tv_cancel;
        ll7Var.invoke(fc4VarD);
        gk7.O0(fc4VarD, xt2Var);
    }

    @Override // o.hd3
    public final void b0(String str) {
        Resources resources = this.f1615o;
        boolean zEquals = str.equals(resources.getString(R.string.tv_options_Automatic));
        ISessionQualitySettingsViewModel iSessionQualitySettingsViewModel = this.n;
        if (zEquals) {
            ISessionQualitySettingsViewModelSWIGJNI.ISessionQualitySettingsViewModel_SelectQualityModeAuto(iSessionQualitySettingsViewModel.a, iSessionQualitySettingsViewModel);
        } else if (str.equals(resources.getString(R.string.tv_options_OptimizeQuality))) {
            ISessionQualitySettingsViewModelSWIGJNI.ISessionQualitySettingsViewModel_SelectQualityModeOptimizeQuality(iSessionQualitySettingsViewModel.a, iSessionQualitySettingsViewModel);
        } else if (str.equals(resources.getString(R.string.tv_options_OptimizeSpeed))) {
            ISessionQualitySettingsViewModelSWIGJNI.ISessionQualitySettingsViewModel_SelectQualityModeOptimizeSpeed(iSessionQualitySettingsViewModel.a, iSessionQualitySettingsViewModel);
        }
    }

    @Override // o.hd3
    public final nw4 n() {
        return this.r;
    }
}
