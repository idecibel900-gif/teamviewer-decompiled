package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lm extends f30 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm(List list, byte b) {
        super(list);
        this.c = b;
    }

    @Override // o.tm
    public final o30 d() {
        switch (this.c) {
            case 0:
                return new uv0(this.b, (byte) 0);
            case 1:
                return new zz2(this.b, (byte) 0);
            case 2:
                return new uv0(this.b, (byte) 2);
            case 3:
                return new zz2(this.b, (byte) 1);
            case 4:
                return new zz2(this.b, (byte) 2);
            case 5:
                return new bx6(this.b);
            default:
                return new uv0(this.b, (byte) 3);
        }
    }
}
