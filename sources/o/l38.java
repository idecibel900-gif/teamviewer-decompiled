package o;

import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDeviceRequestViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDeviceRequestViewModelSWIGJNI;
import com.teamviewer.remotecontrolviewmodellib.swig.TrustedDeviceRequestPayloadSignalCallback;

/* JADX INFO: loaded from: classes.dex */
public final class l38 extends og7 implements hw2 {
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n38 f1326o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l38(String str, String str2, n38 n38Var, int i, hc1 hc1Var) {
        super(2, hc1Var);
        this.m = str;
        this.n = str2;
        this.f1326o = n38Var;
        this.p = i;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        return new l38(this.m, this.n, this.f1326o, this.p, hc1Var);
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        l38 l38Var = (l38) create((me1) obj, (hc1) obj2);
        f88 f88Var = f88.a;
        l38Var.invokeSuspend(f88Var);
        return f88Var;
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        ct1.a0(obj);
        c36 c36Var = zu1.c;
        t38 t38VarM = c36Var != null ? c36Var.m() : null;
        if (t38VarM != null) {
            io.sentry.instrumentation.file.g gVar = new io.sentry.instrumentation.file.g(this.p, this.f1326o);
            ITrustedDeviceRequestViewModelNative iTrustedDeviceRequestViewModelNative = t38VarM.n;
            s38 s38Var = new s38(gVar);
            ITrustedDeviceRequestViewModelSWIGJNI.ITrustedDeviceRequestViewModelNative_DecryptPayload(iTrustedDeviceRequestViewModelNative.a, iTrustedDeviceRequestViewModelNative, this.m, this.n, TrustedDeviceRequestPayloadSignalCallback.getCPtr((TrustedDeviceRequestPayloadSignalCallback) s38Var), s38Var);
        }
        return f88.a;
    }
}
