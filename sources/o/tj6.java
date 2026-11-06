package o;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tj6 {
    public final bg5 a = h57.p(Boolean.FALSE);

    public final void a(AndroidComposeView androidComposeView, ip6 ip6Var, de1 de1Var, Consumer consumer) {
        xx4 xx4Var = new xx4(new uj6[16]);
        lq1.R(ip6Var.a(), 0, new sj6(1, xx4Var, xx4.class, "add", "add(Ljava/lang/Object;)Z", 8));
        Arrays.sort(xx4Var.m, 0, xx4Var.f2559o, new px0(new Function1[]{new ei6((byte) 28), new ei6((byte) 29)}));
        int i = xx4Var.f2559o;
        uj6 uj6Var = (uj6) (i == 0 ? null : xx4Var.m[i - 1]);
        if (uj6Var == null) {
            return;
        }
        zk3 zk3Var = uj6Var.c;
        tz0 tz0Var = new tz0(uj6Var.a, zk3Var, hm3.c(de1Var), this, androidComposeView);
        e45 e45Var = uj6Var.d;
        v56 v56VarB = vt1.s(e45Var).b(e45Var, true);
        long jE = zk3Var.e();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(androidComposeView, ds1.j0(vs1.T(v56VarB)), new Point((int) (jE >> 32), (int) (jE & 4294967295L)), tz0Var);
        scrollCaptureTarget.setScrollBounds(ds1.j0(zk3Var));
        consumer.accept(scrollCaptureTarget);
    }
}
