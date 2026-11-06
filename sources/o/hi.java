package o;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class hi implements View.OnDragListener, e42 {
    public final g42 a;
    public final ax b;
    public final gi c;

    public hi() {
        g42 g42Var = new g42();
        g42Var.C = 0L;
        this.a = g42Var;
        this.b = new ax(0);
        this.c = new gi(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        xk1 xk1Var = new xk1((Object) dragEvent, (byte) 9);
        int action = dragEvent.getAction();
        k28 k28Var = k28.m;
        ax axVar = this.b;
        g42 g42Var = this.a;
        switch (action) {
            case 1:
                g76 g76Var = new g76();
                f42 f42Var = new f42(xk1Var, g42Var, g76Var);
                if (f42Var.invoke(g42Var) == k28Var) {
                    g57.s(g42Var, f42Var);
                }
                boolean z = g76Var.m;
                qw qwVar = new qw(axVar);
                while (qwVar.hasNext()) {
                    ((g42) qwVar.next()).Y0();
                }
                return z;
            case 2:
                g42Var.X0(xk1Var);
                return false;
            case 3:
                return g42Var.U0();
            case 4:
                a81 a81Var = new a81(xk1Var, (byte) 12);
                if (a81Var.invoke(g42Var) == k28Var) {
                    g57.s(g42Var, a81Var);
                }
                axVar.clear();
                return false;
            case 5:
                g42Var.V0();
                return false;
            case 6:
                g42Var.W0();
                return false;
            default:
                return false;
        }
    }
}
