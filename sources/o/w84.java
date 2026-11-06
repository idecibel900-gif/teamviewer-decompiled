package o;

import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class w84 {
    public m84 a;
    public s84 b;

    public final void a(LifecycleOwner lifecycleOwner, l84 l84Var) {
        m84 m84VarA = l84Var.a();
        m84 m84Var = this.a;
        if (m84VarA.compareTo(m84Var) < 0) {
            m84Var = m84VarA;
        }
        this.a = m84Var;
        this.b.e(lifecycleOwner, l84Var);
        this.a = m84VarA;
    }
}
