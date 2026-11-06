package o;

import com.teamviewer.remotecontrolviewlib.view.session.RcSessionBottomToolbarView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p16 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ RcSessionBottomToolbarView n;

    public /* synthetic */ p16(RcSessionBottomToolbarView rcSessionBottomToolbarView, byte b) {
        this.m = b;
        this.n = rcSessionBottomToolbarView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        RcSessionBottomToolbarView rcSessionBottomToolbarView = this.n;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                int i = RcSessionBottomToolbarView.s;
                bool.getClass();
                rcSessionBottomToolbarView.d(bool.booleanValue());
                break;
            case 1:
                int i2 = RcSessionBottomToolbarView.s;
                rcSessionBottomToolbarView.setVisibility(bool.booleanValue() ? 0 : 8);
                rcSessionBottomToolbarView.r.setValue(bool);
                break;
            default:
                int i3 = RcSessionBottomToolbarView.s;
                if (bool.booleanValue()) {
                    rcSessionBottomToolbarView.c();
                }
                break;
        }
        return f88Var;
    }
}
