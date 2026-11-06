package o;

import com.journeyapps.barcodescanner.BarcodeView;

/* JADX INFO: loaded from: classes.dex */
public final class gy5 implements q22 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BarcodeView b;

    public /* synthetic */ gy5(BarcodeView barcodeView, byte b) {
        this.a = b;
        this.b = barcodeView;
    }

    @Override // o.q22
    public final void a() {
        byte b = this.a;
        BarcodeView barcodeView = this.b;
        switch (b) {
            case 0:
                barcodeView.c();
                break;
            default:
                barcodeView.c();
                break;
        }
    }
}
