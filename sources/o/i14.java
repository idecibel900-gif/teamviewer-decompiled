package o;

import androidx.compose.ui.node.LayoutNode;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class i14 implements eo4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ j14 e;
    public final /* synthetic */ p14 f;
    public final /* synthetic */ Function1 g;

    public i14(int i, int i2, Map map, Function1 function1, j14 j14Var, p14 p14Var, Function1 function2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = function1;
        this.e = j14Var;
        this.f = p14Var;
        this.g = function2;
    }

    @Override // o.eo4
    public final int a() {
        return this.b;
    }

    @Override // o.eo4
    public final int b() {
        return this.a;
    }

    @Override // o.eo4
    public final Map c() {
        return this.c;
    }

    @Override // o.eo4
    public final void d() {
        si3 si3Var;
        LayoutNode layoutNode = this.f.m;
        boolean zB0 = this.e.b0();
        Function1 function1 = this.g;
        if (!zB0 || (si3Var = ((ti3) layoutNode.S.d).r0) == null) {
            function1.invoke(((ti3) layoutNode.S.d).B);
        } else {
            function1.invoke(si3Var.B);
        }
    }

    @Override // o.eo4
    public final Function1 g() {
        return this.d;
    }
}
