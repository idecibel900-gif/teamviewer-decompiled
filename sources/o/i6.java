package o;

import com.teamviewer.nativelivedatalib.swig.NativeLiveDataBool;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDevicePreferenceViewModelNative;
import com.teamviewer.remotecontrolviewmodellib.swig.ITrustedDevicePreferenceViewModelSWIGJNI;

/* JADX INFO: loaded from: classes.dex */
public final class i6 extends og7 implements hw2 {
    public final /* synthetic */ byte m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j6 f1040o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i6(j6 j6Var, hc1 hc1Var, byte b) {
        super(2, hc1Var);
        this.m = b;
        this.f1040o = j6Var;
    }

    @Override // o.i30
    public final hc1 create(Object obj, hc1 hc1Var) {
        byte b = this.m;
        j6 j6Var = this.f1040o;
        switch (b) {
            case 0:
                return new i6(j6Var, hc1Var, (byte) 0);
            case 1:
                return new i6(j6Var, hc1Var, (byte) 1);
            case 2:
                return new i6(j6Var, hc1Var, (byte) 2);
            default:
                return new i6(j6Var, hc1Var, (byte) 3);
        }
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        me1 me1Var = (me1) obj;
        hc1 hc1Var = (hc1) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((i6) create(me1Var, hc1Var)).invokeSuspend(f88Var);
    }

    @Override // o.i30
    public final Object invokeSuspend(Object obj) {
        byte b = this.m;
        byte b2 = 7;
        byte b3 = 0;
        f88 f88Var = f88.a;
        j6 j6Var = this.f1040o;
        ne1 ne1Var = ne1.m;
        byte b4 = 1;
        hc1 hc1Var = null;
        switch (b) {
            case 0:
                boolean z = this.n;
                if (z) {
                    if (z) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                ITrustedDevicePreferenceViewModelNative iTrustedDevicePreferenceViewModelNative = j6Var.f1133o;
                NativeLiveDataBool nativeLiveDataBoolNewInstance = NativeLiveDataBool.newInstance(ITrustedDevicePreferenceViewModelSWIGJNI.ITrustedDevicePreferenceViewModelNative_IsTfaActivated(iTrustedDevicePreferenceViewModelNative.a, iTrustedDevicePreferenceViewModelNative), false);
                nativeLiveDataBoolNewInstance.getClass();
                go2 go2VarD = lv1.D(it1.q(new ff(nativeLiveDataBoolNewInstance, hc1Var, b2)), -1);
                h6 h6Var = new h6(j6Var, b3);
                this.n = true;
                return go2VarD.b(h6Var, this) == ne1Var ? ne1Var : f88Var;
            case 1:
                boolean z2 = this.n;
                if (z2) {
                    if (z2) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                ITrustedDevicePreferenceViewModelNative iTrustedDevicePreferenceViewModelNative2 = j6Var.f1133o;
                NativeLiveDataBool nativeLiveDataBoolNewInstance2 = NativeLiveDataBool.newInstance(ITrustedDevicePreferenceViewModelSWIGJNI.ITrustedDevicePreferenceViewModelNative_IsTrustedDeviceEnabled(iTrustedDevicePreferenceViewModelNative2.a, iTrustedDevicePreferenceViewModelNative2), false);
                nativeLiveDataBoolNewInstance2.getClass();
                go2 go2VarD2 = lv1.D(it1.q(new ff(nativeLiveDataBoolNewInstance2, hc1Var, b2)), -1);
                h6 h6Var2 = new h6(j6Var, b4);
                this.n = true;
                return go2VarD2.b(h6Var2, this) == ne1Var ? ne1Var : f88Var;
            case 2:
                boolean z3 = this.n;
                if (z3) {
                    if (z3) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var = j6Var.y;
                Boolean bool = Boolean.TRUE;
                this.n = true;
                return yx6Var.c(bool, this) == ne1Var ? ne1Var : f88Var;
            default:
                boolean z4 = this.n;
                if (z4) {
                    if (z4) {
                        ct1.a0(obj);
                        return f88Var;
                    }
                    hk0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ct1.a0(obj);
                yx6 yx6Var2 = j6Var.y;
                Boolean bool2 = Boolean.FALSE;
                this.n = true;
                return yx6Var2.c(bool2, this) == ne1Var ? ne1Var : f88Var;
        }
    }
}
