package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pa implements hw2 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1719o;
    public final /* synthetic */ Object p;

    public /* synthetic */ pa(int i, String str, String str2) {
        this.m = (byte) 15;
        this.p = str;
        this.f1719o = str2;
        this.n = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hw2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.m;
        f88 f88Var = f88.a;
        int i = this.n;
        Object obj3 = this.f1719o;
        Object obj4 = this.p;
        switch (b) {
            case 0:
                List list = (List) obj4;
                Function1 function1 = (Function1) obj3;
                ux2 ux2Var = (ux2) obj;
                int iIntValue = ((Integer) obj2).intValue();
                byte b2 = 0;
                if (ux2Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i2 = 0;
                    for (Object obj5 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            qf0.U();
                            throw null;
                        }
                        String str = (String) obj5;
                        byte b3 = i == i2 ? (byte) 1 : b2;
                        boolean zF = ux2Var.f(function1) | ux2Var.d(i2);
                        Object objK = ux2Var.K();
                        if (zF || objK == e01.a) {
                            objK = new ka(function1, i2, b2);
                            ux2Var.g0(objK);
                        }
                        yy0 yy0VarO = au8.O(652295663, new qa(str, b2), ux2Var);
                        h72 h72Var = un4.a;
                        nm7.b(b3, (Function0) objK, null, false, yy0VarO, ((rn4) ux2Var.j(h72Var)).a.q, ((rn4) ux2Var.j(h72Var)).a.s, ux2Var, 24576, 300);
                        b2 = b2;
                        i2 = i3;
                    }
                } else {
                    ux2Var.Q();
                }
                return f88Var;
            case 1:
                ((Integer) obj2).getClass();
                iq8.c(i, (Function1) obj3, (fs4) obj4, (ux2) obj, yo1.Y(385));
                return f88Var;
            case 2:
                ((Integer) obj2).getClass();
                au8.g((l33) obj4, (fs4) obj3, (ux2) obj, yo1.Y(1 | i));
                return f88Var;
            case 3:
                ((Integer) obj2).getClass();
                zo.a((xo) obj3, (List) obj4, (ux2) obj, yo1.Y(1 | i));
                return f88Var;
            case 4:
                ((Integer) obj2).getClass();
                ((yy0) obj4).l(obj3, (ux2) obj, 1 | yo1.Y(i));
                return f88Var;
            case 5:
                ((Integer) obj2).getClass();
                j51.m((dx5[]) obj4, (hw2) obj3, (ux2) obj, yo1.Y(1 | i));
                return f88Var;
            case 6:
                ((Integer) obj2).intValue();
                j51.l((dx5) obj4, (hw2) obj3, (ux2) obj, yo1.Y(1 | i));
                return f88Var;
            case 7:
                ((Integer) obj2).intValue();
                db8.e((Function0) obj4, (Function0) obj3, (ux2) obj, yo1.Y(1 | i));
                return f88Var;
            case 8:
                ((Integer) obj2).intValue();
                kw1.f((sb0) obj4, (String) obj3, (ux2) obj, yo1.Y(1 | i));
                return f88Var;
            case ep1.b /* 9 */:
                ((Integer) obj2).getClass();
                kw1.c((sb0) obj4, (ov1) obj3, (ux2) obj, yo1.Y(1 | i));
                return f88Var;
            case ep1.c /* 10 */:
                ((Integer) obj2).getClass();
                me4.a((iv6) obj4, (fs4) obj3, (ux2) obj, yo1.Y(1 | i));
                return f88Var;
            case 11:
                ((Integer) obj2).getClass();
                yo1.l((String) obj4, (fs4) obj3, i, (ux2) obj, yo1.Y(1));
                return f88Var;
            case ep1.d /* 12 */:
                ((Integer) obj2).getClass();
                xs1.n((SupportSession) obj4, (fs4) obj3, (ux2) obj, yo1.Y(1 | i));
                return f88Var;
            case 13:
                ((Integer) obj2).getClass();
                n37.b((q37) obj4, (yy0) obj3, (ux2) obj, yo1.Y(1 | i));
                return f88Var;
            case 14:
                ((Integer) obj2).getClass();
                r47.h((vk7) obj4, (fs4) obj3, (ux2) obj, yo1.Y(1 | i));
                return f88Var;
            case 15:
                ((Integer) obj2).getClass();
                x67.b((String) obj4, (String) obj3, (ux2) obj, yo1.Y(1 | i));
                return f88Var;
            default:
                ((Integer) obj2).intValue();
                ((u18) obj4).a(obj3, (ux2) obj, yo1.Y(1 | i));
                return f88Var;
        }
    }

    public /* synthetic */ pa(byte b, int i, Object obj, Object obj2) {
        this.m = b;
        this.p = obj;
        this.f1719o = obj2;
        this.n = i;
    }

    public /* synthetic */ pa(int i, Function1 function1, fs4 fs4Var, int i2) {
        this.m = (byte) 1;
        this.n = i;
        this.f1719o = function1;
        this.p = fs4Var;
    }

    public /* synthetic */ pa(String str, fs4 fs4Var, int i, int i2) {
        this.m = (byte) 11;
        this.p = str;
        this.f1719o = fs4Var;
        this.n = i;
    }

    public /* synthetic */ pa(List list, int i, Function1 function1) {
        this.m = (byte) 0;
        this.p = list;
        this.n = i;
        this.f1719o = function1;
    }

    public /* synthetic */ pa(xo xoVar, List list, int i) {
        this.m = (byte) 3;
        this.f1719o = xoVar;
        this.p = list;
        this.n = i;
    }

    public /* synthetic */ pa(q37 q37Var, yy0 yy0Var, int i) {
        this.m = (byte) 13;
        this.p = q37Var;
        this.f1719o = yy0Var;
        this.n = i;
    }
}
