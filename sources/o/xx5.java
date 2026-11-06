package o;

import android.content.Context;
import com.journeyapps.barcodescanner.BarcodeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xx5 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ BarcodeView n;

    public /* synthetic */ xx5(BarcodeView barcodeView, byte b) {
        this.m = b;
        this.n = barcodeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        BarcodeView barcodeView = this.n;
        switch (b) {
            case 0:
                ((Context) obj).getClass();
                return barcodeView;
            case 1:
                ((r22) obj).getClass();
                return new gy5(barcodeView, (byte) 1);
            default:
                ((Context) obj).getClass();
                return barcodeView;
        }
    }
}
