package o;

import android.widget.Switch;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hl7 implements Function1 {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Switch n;

    public /* synthetic */ hl7(Switch r1, byte b) {
        this.m = b;
        this.n = r1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.m;
        f88 f88Var = f88.a;
        Switch r2 = this.n;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (r2 != null) {
                    r2.setChecked(bool != null ? bool.booleanValue() : false);
                }
                break;
            default:
                if (r2 != null) {
                    r2.setChecked(bool != null ? bool.booleanValue() : true);
                }
                break;
        }
        return f88Var;
    }
}
