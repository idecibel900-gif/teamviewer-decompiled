package o;

import com.teamviewer.remotecontrollib.swig.IQuickActionsViewModel;
import com.teamviewer.remotecontrollib.swig.QuickActionsViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IConnectionInfoViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.SessionSettingsViewModelFactorySWIGJNI;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v26 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ mo7 n;

    public /* synthetic */ v26(mo7 mo7Var, byte b) {
        this.m = b;
        this.n = mo7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        IConnectionInfoViewModel iConnectionInfoViewModel = null;
        IConnectionInfoViewModel iConnectionInfoViewModel2 = null;
        mo7 mo7Var = this.n;
        switch (b) {
            case 0:
                long jSessionSettingsViewModelFactory_GetConnectionInfoViewModel = SessionSettingsViewModelFactorySWIGJNI.SessionSettingsViewModelFactory_GetConnectionInfoViewModel(mo7Var.w());
                if (jSessionSettingsViewModelFactory_GetConnectionInfoViewModel != 0) {
                    iConnectionInfoViewModel = new IConnectionInfoViewModel();
                    iConnectionInfoViewModel.b = true;
                    iConnectionInfoViewModel.a = jSessionSettingsViewModelFactory_GetConnectionInfoViewModel;
                }
                iConnectionInfoViewModel.getClass();
                return new cz4(iConnectionInfoViewModel);
            case 1:
                long jSessionSettingsViewModelFactory_GetConnectionInfoViewModel2 = SessionSettingsViewModelFactorySWIGJNI.SessionSettingsViewModelFactory_GetConnectionInfoViewModel(mo7Var.w());
                if (jSessionSettingsViewModelFactory_GetConnectionInfoViewModel2 != 0) {
                    iConnectionInfoViewModel2 = new IConnectionInfoViewModel();
                    iConnectionInfoViewModel2.b = true;
                    iConnectionInfoViewModel2.a = jSessionSettingsViewModelFactory_GetConnectionInfoViewModel2;
                }
                iConnectionInfoViewModel2.getClass();
                return new ez4(iConnectionInfoViewModel2);
            default:
                long jQuickActionsViewModelFactory_GetQuickActionsViewModel = QuickActionsViewModelFactorySWIGJNI.QuickActionsViewModelFactory_GetQuickActionsViewModel(mo7Var.w());
                IQuickActionsViewModel iQuickActionsViewModel = jQuickActionsViewModelFactory_GetQuickActionsViewModel != 0 ? new IQuickActionsViewModel(jQuickActionsViewModelFactory_GetQuickActionsViewModel) : null;
                iQuickActionsViewModel.getClass();
                return new xz4(iQuickActionsViewModel);
        }
    }
}
