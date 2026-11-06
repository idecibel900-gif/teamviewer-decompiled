package o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.teamviewer.remotecontrollib.swig.IInputMethodViewModel;
import com.teamviewer.remotecontrollib.swig.IQuickActionsViewModel;
import com.teamviewer.remotecontrollib.swig.IRemoteScreenInformationViewModel;
import com.teamviewer.remotecontrollib.swig.InputMethodViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrollib.swig.QuickActionsViewModelFactorySWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.IChangeResolutionViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IRemoteCursorViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IRemoveWallpaperViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.ISessionQualitySettingsViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.SessionSettingsViewModelFactorySWIGJNI;
import com.teamviewer.teamviewerlib.event.EventHub;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r26 implements Function0 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ mo7 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c36 f1885o;

    public /* synthetic */ r26(c36 c36Var, mo7 mo7Var) {
        this.m = (byte) 6;
        this.f1885o = c36Var;
        this.n = mo7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final Object a() {
        byte b = this.m;
        ISessionQualitySettingsViewModel iSessionQualitySettingsViewModel = null;
        IRemoteCursorViewModel iRemoteCursorViewModel = null;
        IInputMethodViewModel iInputMethodViewModel = null;
        IInputMethodViewModel iInputMethodViewModel2 = null;
        IRemoveWallpaperViewModel iRemoveWallpaperViewModel = null;
        IChangeResolutionViewModel iChangeResolutionViewModel = null;
        c36 c36Var = this.f1885o;
        mo7 mo7Var = this.n;
        switch (b) {
            case 0:
                Resources resources = c36Var.a.getResources();
                resources.getClass();
                return new ml7((ec3) mo7Var, resources, c36Var.e, c36Var.b);
            case 1:
                long jSessionSettingsViewModelFactory_GetSessionQualitySettingsViewModel = SessionSettingsViewModelFactorySWIGJNI.SessionSettingsViewModelFactory_GetSessionQualitySettingsViewModel(mo7Var.w());
                if (jSessionSettingsViewModelFactory_GetSessionQualitySettingsViewModel != 0) {
                    iSessionQualitySettingsViewModel = new ISessionQualitySettingsViewModel();
                    iSessionQualitySettingsViewModel.b = true;
                    iSessionQualitySettingsViewModel.a = jSessionSettingsViewModelFactory_GetSessionQualitySettingsViewModel;
                }
                iSessionQualitySettingsViewModel.getClass();
                Resources resources2 = c36Var.a.getResources();
                resources2.getClass();
                return new nz4(iSessionQualitySettingsViewModel, resources2, c36Var.e);
            case 2:
                long jSessionSettingsViewModelFactory_GetChangeResolutionViewModel = SessionSettingsViewModelFactorySWIGJNI.SessionSettingsViewModelFactory_GetChangeResolutionViewModel(mo7Var.w());
                if (jSessionSettingsViewModelFactory_GetChangeResolutionViewModel != 0) {
                    iChangeResolutionViewModel = new IChangeResolutionViewModel();
                    iChangeResolutionViewModel.b = true;
                    iChangeResolutionViewModel.a = jSessionSettingsViewModelFactory_GetChangeResolutionViewModel;
                }
                IChangeResolutionViewModel iChangeResolutionViewModel2 = iChangeResolutionViewModel;
                iChangeResolutionViewModel2.getClass();
                IRemoteScreenInformationViewModel iRemoteScreenInformationViewModelH = xo1.h(mo7Var.w());
                iRemoteScreenInformationViewModelH.getClass();
                Resources resources3 = c36Var.a.getResources();
                resources3.getClass();
                return new zz4(iChangeResolutionViewModel2, iRemoteScreenInformationViewModelH, resources3, c36Var.p, c36Var.b);
            case 3:
                long jSessionSettingsViewModelFactory_GetRemoveWallpaperViewModel = SessionSettingsViewModelFactorySWIGJNI.SessionSettingsViewModelFactory_GetRemoveWallpaperViewModel(mo7Var.w());
                if (jSessionSettingsViewModelFactory_GetRemoveWallpaperViewModel != 0) {
                    iRemoveWallpaperViewModel = new IRemoveWallpaperViewModel();
                    iRemoveWallpaperViewModel.b = true;
                    iRemoveWallpaperViewModel.a = jSessionSettingsViewModelFactory_GetRemoveWallpaperViewModel;
                }
                iRemoveWallpaperViewModel.getClass();
                return new b05(iRemoveWallpaperViewModel, c36Var.c);
            case 4:
                wc3 wc3Var = (wc3) mo7Var;
                g95 g95Var = new g95(wc3Var);
                ep3 ep3VarN = c36Var.n(wc3Var);
                long jQuickActionsViewModelFactory_GetLegacyQuickActionsViewModel = QuickActionsViewModelFactorySWIGJNI.QuickActionsViewModelFactory_GetLegacyQuickActionsViewModel();
                IQuickActionsViewModel iQuickActionsViewModel = jQuickActionsViewModelFactory_GetLegacyQuickActionsViewModel != 0 ? new IQuickActionsViewModel(jQuickActionsViewModelFactory_GetLegacyQuickActionsViewModel) : null;
                iQuickActionsViewModel.getClass();
                return new j26(g95Var, ep3VarN, iQuickActionsViewModel);
            case 5:
                return new il7(((a2) ((ec3) mo7Var)).f283o, c36Var.c);
            case 6:
                wc3 wc3Var2 = (wc3) mo7Var;
                ep3 ep3VarN2 = c36Var.n(wc3Var2);
                n72 n72Var = (n72) ((yd2) ((fp1) ep3VarN2.n).g).getValue();
                long jInputMethodViewModelFactory_GetInputMethodViewModel = InputMethodViewModelFactorySWIGJNI.InputMethodViewModelFactory_GetInputMethodViewModel(((a2) wc3Var2).u.c, ((n72Var == null ? -1 : b36.a[n72Var.ordinal()]) == 1 ? cb3.Mouse : cb3.Touch).m);
                if (jInputMethodViewModelFactory_GetInputMethodViewModel != 0) {
                    iInputMethodViewModel2 = new IInputMethodViewModel();
                    iInputMethodViewModel2.b = true;
                    iInputMethodViewModel2.a = jInputMethodViewModelFactory_GetInputMethodViewModel;
                }
                iInputMethodViewModel2.getClass();
                return new c26(ep3VarN2, iInputMethodViewModel2);
            case 7:
                long jInputMethodViewModelFactory_GetInputMethodViewModel2 = InputMethodViewModelFactorySWIGJNI.InputMethodViewModelFactory_GetInputMethodViewModel(mo7Var.w(), cb3.Mouse.m);
                if (jInputMethodViewModelFactory_GetInputMethodViewModel2 != 0) {
                    iInputMethodViewModel = new IInputMethodViewModel();
                    iInputMethodViewModel.b = true;
                    iInputMethodViewModel.a = jInputMethodViewModelFactory_GetInputMethodViewModel2;
                }
                SharedPreferences sharedPreferences = c36Var.b;
                EventHub eventHub = c36Var.d;
                iInputMethodViewModel.getClass();
                return new uz4(sharedPreferences, eventHub, iInputMethodViewModel);
            default:
                long jSessionSettingsViewModelFactory_GetRemoteCursorViewModel = SessionSettingsViewModelFactorySWIGJNI.SessionSettingsViewModelFactory_GetRemoteCursorViewModel(mo7Var.w());
                if (jSessionSettingsViewModelFactory_GetRemoteCursorViewModel != 0) {
                    iRemoteCursorViewModel = new IRemoteCursorViewModel();
                    iRemoteCursorViewModel.b = true;
                    iRemoteCursorViewModel.a = jSessionSettingsViewModelFactory_GetRemoteCursorViewModel;
                }
                iRemoteCursorViewModel.getClass();
                return new a05(iRemoteCursorViewModel, c36Var.c);
        }
    }

    public /* synthetic */ r26(mo7 mo7Var, c36 c36Var, byte b) {
        this.m = b;
        this.n = mo7Var;
        this.f1885o = c36Var;
    }
}
