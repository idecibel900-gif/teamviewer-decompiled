package o;

import androidx.lifecycle.LifecycleOwner;
import com.journeyapps.barcodescanner.BarcodeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wx5 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ LifecycleOwner n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ BarcodeView f2458o;

    public /* synthetic */ wx5(LifecycleOwner lifecycleOwner, BarcodeView barcodeView, byte b) {
        this.m = b;
        this.n = lifecycleOwner;
        this.f2458o = barcodeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        final BarcodeView barcodeView = this.f2458o;
        LifecycleOwner lifecycleOwner = this.n;
        r22 r22Var = (r22) obj;
        switch (b) {
            case 0:
                r22Var.getClass();
                final byte b2 = 0;
                s84 s84Var = new s84() { // from class: o.yx5
                    @Override // o.s84
                    public final void e(LifecycleOwner lifecycleOwner2, l84 l84Var) {
                        byte b3 = b2;
                        BarcodeView barcodeView2 = barcodeView;
                        switch (b3) {
                            case 0:
                                int i = hy5.a[l84Var.ordinal()];
                                if (i == 1) {
                                    barcodeView2.d();
                                    break;
                                } else if (i == 2) {
                                    barcodeView2.c();
                                    break;
                                }
                                break;
                            default:
                                int i2 = ly5.a[l84Var.ordinal()];
                                if (i2 == 1) {
                                    barcodeView2.d();
                                    break;
                                } else if (i2 == 2) {
                                    barcodeView2.c();
                                    break;
                                }
                                break;
                        }
                    }
                };
                lifecycleOwner.getR().a(s84Var);
                return new l9(lifecycleOwner, s84Var, (byte) 11);
            default:
                r22Var.getClass();
                final byte b3 = 1;
                s84 s84Var2 = new s84() { // from class: o.yx5
                    @Override // o.s84
                    public final void e(LifecycleOwner lifecycleOwner2, l84 l84Var) {
                        byte b4 = b3;
                        BarcodeView barcodeView2 = barcodeView;
                        switch (b4) {
                            case 0:
                                int i = hy5.a[l84Var.ordinal()];
                                if (i == 1) {
                                    barcodeView2.d();
                                    break;
                                } else if (i == 2) {
                                    barcodeView2.c();
                                    break;
                                }
                                break;
                            default:
                                int i2 = ly5.a[l84Var.ordinal()];
                                if (i2 == 1) {
                                    barcodeView2.d();
                                    break;
                                } else if (i2 == 2) {
                                    barcodeView2.c();
                                    break;
                                }
                                break;
                        }
                    }
                };
                lifecycleOwner.getR().a(s84Var2);
                return new l9(lifecycleOwner, s84Var2, (byte) 12);
        }
    }
}
