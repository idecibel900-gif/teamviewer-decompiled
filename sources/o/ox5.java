package o;

import android.content.Context;
import android.content.res.Configuration;
import com.teamviewer.remotecontrolviewlib.activity.QRCodeAssignmentActivity;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ox5 implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ QRCodeAssignmentActivity n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f1688o;

    public /* synthetic */ ox5(QRCodeAssignmentActivity qRCodeAssignmentActivity, List list, byte b) {
        this.m = b;
        this.n = qRCodeAssignmentActivity;
        this.f1688o = list;
    }

    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        QRCodeAssignmentActivity qRCodeAssignmentActivity = this.n;
        byte b2 = 1;
        switch (b) {
            case 0:
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = QRCodeAssignmentActivity.N;
                if (!ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ux2Var.Q();
                } else {
                    ut7.a(au8.O(-1905226080, new ox5(qRCodeAssignmentActivity, this.f1688o, b2), ux2Var), ux2Var, 48);
                }
                break;
            default:
                ux2 ux2Var2 = (ux2) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i2 = QRCodeAssignmentActivity.N;
                if (!ux2Var2.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ux2Var2.Q();
                } else {
                    Configuration configuration = (Configuration) ux2Var2.j(lh.a);
                    mj8 mj8Var = (mj8) ux2Var2.j(b11.u);
                    in1 in1Var = (in1) ux2Var2.j(b11.h);
                    long jA = ((n54) mj8Var).a();
                    ml8 ml8VarA = el5.a(nv1.a(in1Var.O((int) (jA >> 32)), in1Var.O((int) (jA & 4294967295L))));
                    Context applicationContext = qRCodeAssignmentActivity.getApplicationContext();
                    applicationContext.getClass();
                    a06 a06VarD0 = ds1.d0(configuration, ml8VarA, new l51(applicationContext), ux2Var2);
                    boolean zH = ux2Var2.h(qRCodeAssignmentActivity);
                    Object objK = ux2Var2.K();
                    aw awVar = e01.a;
                    if (zH || objK == awVar) {
                        objK = new vm3(qRCodeAssignmentActivity, (byte) 25);
                        ux2Var2.g0(objK);
                    }
                    Function0 function0 = (Function0) objK;
                    boolean zH2 = ux2Var2.h(qRCodeAssignmentActivity);
                    Object objK2 = ux2Var2.K();
                    if (zH2 || objK2 == awVar) {
                        objK2 = new fj3(qRCodeAssignmentActivity, (byte) 26);
                        ux2Var2.g0(objK2);
                    }
                    io1.n(a06VarD0, this.f1688o, function0, (Function1) objK2, null, null, ux2Var2, 0);
                }
                break;
        }
        return f88Var;
    }
}
