package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class dx6 extends jx6 {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Matrix c;

    public dx6(ArrayList arrayList, Matrix matrix) {
        this.b = arrayList;
        this.c = matrix;
    }

    @Override // o.jx6
    public final void a(Matrix matrix, nw6 nw6Var, int i, Canvas canvas) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((jx6) it.next()).a(this.c, nw6Var, i, canvas);
        }
    }
}
