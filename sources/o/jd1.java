package o;

import com.teamviewer.apidefinitions.supportsessions.models.SupportSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jd1 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1152o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ jd1(String str, String str2, ArrayList arrayList, Function1 function1, Function1 function2, boolean z) {
        this.m = (byte) 1;
        this.f1152o = arrayList;
        this.p = str;
        this.q = str2;
        this.n = z;
        this.r = function1;
        this.s = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ns7 ns7Var;
        i04 i04Var;
        i04 i04Var2;
        byte b = this.m;
        f88 f88Var = f88.a;
        Object obj2 = this.s;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        Object obj6 = this.f1152o;
        byte b2 = 1;
        switch (b) {
            case 0:
                j64 j64Var = (j64) obj6;
                bg5 bg5Var = j64Var.f1135o;
                mj8 mj8Var = (mj8) obj5;
                pr7 pr7Var = (pr7) obj4;
                zr7 zr7Var = (zr7) obj3;
                v65 v65Var = (v65) obj2;
                i04 i04Var3 = (i04) obj;
                j64Var.h = i04Var3;
                ws7 ws7VarD = j64Var.d();
                if (ws7VarD != null) {
                    ws7VarD.b = i04Var3;
                }
                if (this.n) {
                    if (j64Var.a() == n43.n) {
                        if (((Boolean) j64Var.l.getValue()).booleanValue() && ((n54) mj8Var).b()) {
                            pr7Var.s();
                        } else {
                            pr7Var.m();
                        }
                        j64Var.m.setValue(Boolean.valueOf(l47.p(pr7Var, true)));
                        j64Var.n.setValue(Boolean.valueOf(l47.p(pr7Var, false)));
                        bg5Var.setValue(Boolean.valueOf(gt7.c(zr7Var.b)));
                    } else if (j64Var.a() == n43.f1537o) {
                        bg5Var.setValue(Boolean.valueOf(l47.p(pr7Var, true)));
                    }
                    ka0.y(j64Var, zr7Var, v65Var);
                    ws7 ws7VarD2 = j64Var.d();
                    if (ws7VarD2 != null && (ns7Var = j64Var.e) != null && j64Var.b() && (i04Var = ws7VarD2.b) != null && i04Var.m() && (i04Var2 = ws7VarD2.c) != null) {
                        vs7 vs7Var = ws7VarD2.a;
                        h16 h16Var = new h16(i04Var, (byte) 12);
                        v56 v56VarF = ep1.F(i04Var);
                        v56 v56VarB = i04Var.b(i04Var2, false);
                        if (im3.n((ns7) ns7Var.a.b.get(), ns7Var)) {
                            ns7Var.b.a(zr7Var, v65Var, vs7Var, h16Var, v56VarF, v56VarB);
                        }
                    }
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj6;
                String str = (String) obj5;
                h44 h44Var = (h44) obj;
                h44Var.getClass();
                h44.a(h44Var, null, new yy0(-1407523597, true, new u35(str, (String) obj4, b2)), 3);
                h44Var.b(arrayList.size(), null, new fk(arrayList, (byte) 1), new yy0(802480018, true, new xn6(arrayList, str, this.n, (Function1) obj3, (Function1) obj2)));
                break;
            default:
                w44 w44Var = (w44) obj2;
                h44 h44Var2 = (h44) obj;
                h44Var2.getClass();
                List list = ((or6) obj6).a;
                h44Var2.b(list.size(), new y2(new jp6((byte) 15), list, (byte) 18), new ha1(list, (byte) 9), new yy0(2039820996, true, new zq6(list, this.n, (SupportSession) obj5, (nr6) obj4, (me1) obj3, w44Var)));
                break;
        }
        return f88Var;
    }

    public /* synthetic */ jd1(Object obj, boolean z, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.m = b;
        this.f1152o = obj;
        this.n = z;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
        this.s = obj5;
    }
}
