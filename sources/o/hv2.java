package o;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class hv2 implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ gy8 a;

    public hv2(gy8 gy8Var) {
        this.a = gy8Var;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        gy8 gy8Var = this.a;
        int i2 = gy8Var.b;
        if ((i2 & 1) != 0) {
            gy8.a(((SparseIntArray[]) gy8Var.c)[0], frameMetrics.getMetric(8));
        }
        if ((i2 & 2) != 0) {
            gy8.a(((SparseIntArray[]) gy8Var.c)[1], frameMetrics.getMetric(1));
        }
        if ((i2 & 4) != 0) {
            gy8.a(((SparseIntArray[]) gy8Var.c)[2], frameMetrics.getMetric(3));
        }
        if ((i2 & 8) != 0) {
            gy8.a(((SparseIntArray[]) gy8Var.c)[3], frameMetrics.getMetric(4));
        }
        if ((i2 & 16) != 0) {
            gy8.a(((SparseIntArray[]) gy8Var.c)[4], frameMetrics.getMetric(5));
        }
        if ((i2 & 64) != 0) {
            gy8.a(((SparseIntArray[]) gy8Var.c)[6], frameMetrics.getMetric(7));
        }
        if ((i2 & 32) != 0) {
            gy8.a(((SparseIntArray[]) gy8Var.c)[5], frameMetrics.getMetric(6));
        }
        if ((i2 & 128) != 0) {
            gy8.a(((SparseIntArray[]) gy8Var.c)[7], frameMetrics.getMetric(0));
        }
        if ((i2 & 256) != 0) {
            gy8.a(((SparseIntArray[]) gy8Var.c)[8], frameMetrics.getMetric(2));
        }
    }
}
