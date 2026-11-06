package o;

import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes2.dex */
public final class sd2 extends td2 {
    public final /* synthetic */ byte a;
    public final d96 b;

    public /* synthetic */ sd2(d96 d96Var, byte b) {
        this.a = b;
        this.b = d96Var;
    }

    @Override // o.td2
    public final int a() {
        switch (this.a) {
            case 0:
                return 8;
            case 1:
                return 7;
            case 2:
                return 7;
            default:
                return 8;
        }
    }

    @Override // o.td2
    public final boolean b(o82 o82Var, o82 o82Var2) {
        byte b = this.a;
        d96 d96Var = this.b;
        switch (b) {
            case 0:
                return d96Var.b(o82Var2.h0()).mo34d();
            case 1:
                return d96Var.b(o82Var2.g0()).mo34d();
            case 2:
                Stream map = o82Var2.q.stream().map(new k82((byte) 0));
                String[] strArr = lb7.a;
                return d96Var.b((String) map.collect(Collector.of(new hb7(""), new ib7(), new jb7(), new k82((byte) 3), new Collector.Characteristics[0]))).mo34d();
            default:
                o82Var2.getClass();
                Stream map2 = ds1.i0(o82Var2, x35.class).map(new k82((byte) 0));
                String[] strArr2 = lb7.a;
                return d96Var.b((String) map2.collect(Collector.of(new hb7(""), new ib7(), new jb7(), new k82((byte) 3), new Collector.Characteristics[0]))).mo34d();
        }
    }

    public final String toString() {
        byte b = this.a;
        d96 d96Var = this.b;
        switch (b) {
            case 0:
                return String.format(":matches(%s)", d96Var);
            case 1:
                return String.format(":matchesOwn(%s)", d96Var);
            case 2:
                return String.format(":matchesWholeOwnText(%s)", d96Var);
            default:
                return String.format(":matchesWholeText(%s)", d96Var);
        }
    }
}
