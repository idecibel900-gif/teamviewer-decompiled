package o;

import android.content.Context;
import android.media.AudioManager;
import com.teamviewer.remotecontrolviewmodellib.swig.IMarkingClientViewModel;
import com.teamviewer.remotecontrolviewmodellib.swig.IMarkingClientViewModelSWIGJNI;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sf8 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ zf8 n;

    public /* synthetic */ sf8(zf8 zf8Var, byte b) {
        this.m = b;
        this.n = zf8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        zf8 zf8Var = this.n;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AudioManager audioManager = zf8Var.z0;
                if (audioManager == null) {
                    Context contextE = zf8Var.E();
                    audioManager = (AudioManager) (contextE != null ? contextE.getSystemService("audio") : null);
                    zf8Var.z0 = audioManager;
                }
                if (audioManager != null) {
                    audioManager.setMicrophoneMute(zBooleanValue);
                }
                return f88Var;
            case 1:
                String str = (String) obj;
                str.getClass();
                IMarkingClientViewModel iMarkingClientViewModel = zf8Var.r0;
                if (iMarkingClientViewModel != null) {
                    IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_SetTextForFocusedMarker(iMarkingClientViewModel.n, iMarkingClientViewModel, str);
                    return f88Var;
                }
                im3.e0("markingClientViewModel");
                throw null;
            default:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() > 0) {
                    IMarkingClientViewModel iMarkingClientViewModel2 = zf8Var.r0;
                    if (iMarkingClientViewModel2 == null) {
                        im3.e0("markingClientViewModel");
                        throw null;
                    }
                    IMarkingClientViewModelSWIGJNI.IMarkingClientViewModel_SendText(iMarkingClientViewModel2.n, iMarkingClientViewModel2);
                }
                zf8Var.D0(vf8.n);
                xk5 xk5Var = zf8Var.A0;
                if (xk5Var != null) {
                    cl5 cl5Var = xk5Var.a.p0;
                    if (cl5Var == null) {
                        im3.e0("toolbarViewModel");
                        throw null;
                    }
                    cl5Var.n.setValue(Boolean.TRUE);
                }
                return f88Var;
        }
    }
}
