package o;

import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g70 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Function1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ px4 f868o;

    public /* synthetic */ g70(Function1 function1, px4 px4Var, byte b) {
        this.m = b;
        this.n = function1;
        this.f868o = px4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        px4 px4Var = this.f868o;
        Function1 function1 = this.n;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                function1.invoke(bool);
                if (zBooleanValue) {
                    px4Var.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                wq2 wq2Var = (wq2) obj;
                wq2Var.getClass();
                if (wq2Var.a()) {
                    Boolean bool2 = Boolean.TRUE;
                    px4Var.setValue(bool2);
                    function1.invoke(bool2);
                } else if (((Boolean) px4Var.getValue()).booleanValue()) {
                    Boolean bool3 = Boolean.FALSE;
                    px4Var.setValue(bool3);
                    function1.invoke(bool3);
                }
                break;
            case 2:
                Set set = (Set) obj;
                set.getClass();
                function1.invoke(set);
                px4Var.setValue(Boolean.FALSE);
                break;
            case 3:
                function1.invoke((UUID) obj);
                px4Var.setValue(Boolean.FALSE);
                break;
            case 4:
                zr7 zr7Var = (zr7) obj;
                zr7Var.getClass();
                String str = zr7Var.a.n;
                if (str.length() <= 50) {
                    if (!im3.n(str, ((zr7) px4Var.getValue()).a.n)) {
                        function1.invoke(str);
                    }
                    px4Var.setValue(zr7Var);
                }
                break;
            case 5:
                if (!((Boolean) obj).booleanValue()) {
                    px4Var.setValue(Boolean.FALSE);
                } else {
                    function1.invoke(new la(px4Var, (byte) 24));
                }
                break;
            default:
                zr7 zr7Var2 = (zr7) obj;
                zr7Var2.getClass();
                String str2 = zr7Var2.a.n;
                if (str2.length() <= 50) {
                    if (!im3.n(str2, ((zr7) px4Var.getValue()).a.n)) {
                        function1.invoke(str2);
                    }
                    px4Var.setValue(zr7Var2);
                }
                break;
        }
        return f88Var;
    }
}
