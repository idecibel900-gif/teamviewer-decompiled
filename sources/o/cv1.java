package o;

import com.teamviewer.remotecontrolviewlib.layout.ExpandablePanel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cv1 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ du2 n;

    public /* synthetic */ cv1(du2 du2Var, byte b) {
        this.m = b;
        this.n = du2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        du2 du2Var = this.n;
        String str = (String) obj;
        switch (b) {
            case 0:
                int i = fv1.O0;
                du2Var.n.setText(str);
                break;
            case 1:
                int i2 = fv1.O0;
                du2Var.p.setText(str);
                break;
            case 2:
                int i3 = fv1.O0;
                du2Var.q.setVisibility(ka0.v(str != null));
                du2Var.m.setText(str);
                break;
            case 3:
                int i4 = fv1.O0;
                ExpandablePanel expandablePanel = du2Var.l;
                expandablePanel.setVisibility(ka0.v(!(str == null || ub7.b0(str))));
                str.getClass();
                expandablePanel.setText(str);
                break;
            case 4:
                int i5 = dl4.K0;
                du2Var.n.setText(str);
                break;
            case 5:
                int i6 = dl4.K0;
                du2Var.p.setText(str);
                break;
            case 6:
                int i7 = dl4.K0;
                du2Var.q.setVisibility(ka0.v(str != null));
                du2Var.m.setText(str);
                break;
            default:
                int i8 = dl4.K0;
                ExpandablePanel expandablePanel2 = du2Var.l;
                expandablePanel2.setVisibility(ka0.v(!(str == null || ub7.b0(str))));
                str.getClass();
                expandablePanel2.setText(str);
                break;
        }
        return f88Var;
    }
}
