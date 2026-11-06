package o;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jh8 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ LifecycleOwner n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ px4 f1167o;

    public /* synthetic */ jh8(LifecycleOwner lifecycleOwner, px4 px4Var, byte b) {
        this.m = b;
        this.n = lifecycleOwner;
        this.f1167o = px4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        final px4 px4Var = this.f1167o;
        LifecycleOwner lifecycleOwner = this.n;
        r22 r22Var = (r22) obj;
        switch (b) {
            case 0:
                r22Var.getClass();
                final byte b2 = 0;
                s84 s84Var = new s84() { // from class: o.lh8
                    @Override // o.s84
                    public final void e(LifecycleOwner lifecycleOwner2, l84 l84Var) {
                        byte b3 = b2;
                        px4 px4Var2 = px4Var;
                        switch (b3) {
                            case 0:
                                if (l84Var == l84.ON_RESUME) {
                                    px4Var2.setValue(null);
                                }
                                break;
                            case 1:
                                if (l84Var == l84.ON_RESUME) {
                                    px4Var2.setValue(null);
                                }
                                break;
                            default:
                                if (l84Var == l84.ON_RESUME) {
                                    px4Var2.setValue(null);
                                }
                                break;
                        }
                    }
                };
                lifecycleOwner.getR().a(s84Var);
                return new l9(lifecycleOwner, s84Var, (byte) 24);
            case 1:
                r22Var.getClass();
                final byte b3 = 1;
                s84 s84Var2 = new s84() { // from class: o.lh8
                    @Override // o.s84
                    public final void e(LifecycleOwner lifecycleOwner2, l84 l84Var) {
                        byte b4 = b3;
                        px4 px4Var2 = px4Var;
                        switch (b4) {
                            case 0:
                                if (l84Var == l84.ON_RESUME) {
                                    px4Var2.setValue(null);
                                }
                                break;
                            case 1:
                                if (l84Var == l84.ON_RESUME) {
                                    px4Var2.setValue(null);
                                }
                                break;
                            default:
                                if (l84Var == l84.ON_RESUME) {
                                    px4Var2.setValue(null);
                                }
                                break;
                        }
                    }
                };
                lifecycleOwner.getR().a(s84Var2);
                return new l9(lifecycleOwner, s84Var2, (byte) 25);
            default:
                r22Var.getClass();
                final byte b4 = 2;
                s84 s84Var3 = new s84() { // from class: o.lh8
                    @Override // o.s84
                    public final void e(LifecycleOwner lifecycleOwner2, l84 l84Var) {
                        byte b5 = b4;
                        px4 px4Var2 = px4Var;
                        switch (b5) {
                            case 0:
                                if (l84Var == l84.ON_RESUME) {
                                    px4Var2.setValue(null);
                                }
                                break;
                            case 1:
                                if (l84Var == l84.ON_RESUME) {
                                    px4Var2.setValue(null);
                                }
                                break;
                            default:
                                if (l84Var == l84.ON_RESUME) {
                                    px4Var2.setValue(null);
                                }
                                break;
                        }
                    }
                };
                lifecycleOwner.getR().a(s84Var3);
                return new l9(lifecycleOwner, s84Var3, (byte) 26);
        }
    }
}
