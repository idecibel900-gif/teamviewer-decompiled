package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class fm4 extends hm4 implements Iterator, su3 {
    public final /* synthetic */ byte q;

    public fm4(im4 im4Var, byte b) {
        this.q = b;
        this.p = im4Var;
        this.n = -1;
        this.f988o = im4Var.t;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.q) {
            case 0:
                b();
                int i = this.m;
                im4 im4Var = (im4) this.p;
                if (i >= im4Var.r) {
                    yq4.p();
                    return null;
                }
                this.m = i + 1;
                this.n = i;
                gm4 gm4Var = new gm4(im4Var, i);
                c();
                return gm4Var;
            case 1:
                b();
                int i2 = this.m;
                im4 im4Var2 = (im4) this.p;
                if (i2 >= im4Var2.r) {
                    yq4.p();
                    return null;
                }
                this.m = i2 + 1;
                this.n = i2;
                Object obj = im4Var2.m[i2];
                c();
                return obj;
            default:
                b();
                int i3 = this.m;
                im4 im4Var3 = (im4) this.p;
                if (i3 >= im4Var3.r) {
                    yq4.p();
                    return null;
                }
                this.m = i3 + 1;
                this.n = i3;
                Object[] objArr = im4Var3.n;
                objArr.getClass();
                Object obj2 = objArr[this.n];
                c();
                return obj2;
        }
    }
}
