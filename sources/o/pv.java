package o;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pv implements eo4 {
    public final /* synthetic */ byte a;
    public final int b;
    public final int c;
    public final Map d;
    public final Function1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ fo4 g;

    public /* synthetic */ pv(int i, int i2, Map map, Function1 function1, Function1 function2, fo4 fo4Var, byte b) {
        this.a = b;
        this.f = function2;
        this.g = fo4Var;
        this.b = i;
        this.c = i2;
        this.d = map;
        this.e = function1;
    }

    @Override // o.eo4
    public final int a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    @Override // o.eo4
    public final int b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // o.eo4
    public final Map c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    @Override // o.eo4
    public final void d() {
        byte b = this.a;
        fo4 fo4Var = this.g;
        Function1 function1 = this.f;
        switch (b) {
            case 0:
                function1.invoke(((qv) fo4Var).m.B);
                break;
            default:
                function1.invoke(((rg4) fo4Var).B);
                break;
        }
    }

    @Override // o.eo4
    public final Function1 g() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }
}
