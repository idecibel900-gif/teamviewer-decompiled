package o;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ro6 {
    public static final an4 a = jk0.L;

    public static final boolean a(bn5 bn5Var) {
        MotionEvent motionEventA;
        List list = bn5Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((in5) list.get(i)).i != 2) {
                MotionEvent motionEventA2 = bn5Var.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = bn5Var.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
