package o;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function0 n;

    public /* synthetic */ lg(Function0 function0, byte b) {
        this.m = b;
        this.n = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.m;
        Function0 function0 = this.n;
        switch (b) {
            case 0:
                Class cls = AndroidComposeView.U0;
                function0.a();
                break;
            case 1:
                Class cls2 = AndroidComposeView.U0;
                function0.a();
                break;
            case 2:
                function0.a();
                break;
            case 3:
                function0.a();
                break;
            case 4:
                function0.a();
                break;
            default:
                function0.a();
                break;
        }
    }
}
