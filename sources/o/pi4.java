package o;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.teamviewer.remotecontrolviewlib.activity.M2MClientActivity;
import com.teamviewer.remotecontrolviewlib.activity.RCClientActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pi4 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ ComposeView n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f1737o;

    public /* synthetic */ pi4(ComposeView composeView, View view, byte b) {
        this.m = b;
        this.n = composeView;
        this.f1737o = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        View view = this.f1737o;
        ComposeView composeView = this.n;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                int i = M2MClientActivity.h0;
                bool.getClass();
                composeView.setVisibility(ka0.v(bool.booleanValue()));
                view.setVisibility(ka0.v(!bool.booleanValue()));
                break;
            default:
                int i2 = RCClientActivity.c0;
                composeView.setVisibility(bool.booleanValue() ? 0 : 8);
                view.setVisibility(bool.booleanValue() ? 8 : 0);
                break;
        }
        return f88Var;
    }
}
