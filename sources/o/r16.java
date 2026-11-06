package o;

import android.widget.ImageView;
import com.teamviewer.remotecontrolviewlib.view.session.RcSessionBottomToolbarView;
import com.teamviewer.remotecontrolviewlib.view.session.RcSessionExtraToolbarView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r16 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ nw4 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ImageView f1881o;

    public /* synthetic */ r16(nw4 nw4Var, ImageView imageView, byte b) {
        this.m = b;
        this.n = nw4Var;
        this.f1881o = imageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        ImageView imageView = this.f1881o;
        nw4 nw4Var = this.n;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                int i = RcSessionBottomToolbarView.s;
                if (!bool.booleanValue()) {
                    imageView.setVisibility(8);
                } else if (im3.n(nw4Var.getValue(), Boolean.TRUE)) {
                    imageView.setVisibility(0);
                }
                break;
            default:
                int i2 = RcSessionExtraToolbarView.n;
                if (!bool.booleanValue()) {
                    imageView.setVisibility(8);
                } else if (im3.n(nw4Var.getValue(), Boolean.TRUE)) {
                    imageView.setVisibility(0);
                }
                break;
        }
        return f88Var;
    }
}
