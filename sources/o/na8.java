package o;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class na8 {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static sy3 a(oy3 oy3Var) {
        py3 py3VarO = sy3.o();
        int iQ = oy3Var.q();
        py3VarO.c();
        ((sy3) py3VarO.n).p(iQ);
        for (ny3 ny3Var : oy3Var.p()) {
            qy3 qy3VarN = ry3.n();
            String strO = ny3Var.m().o();
            qy3VarN.c();
            ((ry3) qy3VarN.n).r(strO);
            ox3 ox3VarP = ny3Var.p();
            qy3VarN.c();
            ((ry3) qy3VarN.n).q(ox3VarP);
            dc5 dc5VarO = ny3Var.o();
            qy3VarN.c();
            ((ry3) qy3VarN.n).p(dc5VarO);
            int iN = ny3Var.n();
            qy3VarN.c();
            ((ry3) qy3VarN.n).o(iN);
            ry3 ry3Var = (ry3) qy3VarN.a();
            py3VarO.c();
            ((sy3) py3VarO.n).m(ry3Var);
        }
        return (sy3) py3VarO.a();
    }
}
