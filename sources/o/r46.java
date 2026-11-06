package o;

import coil3.compose.AsyncImagePainter;

/* JADX INFO: loaded from: classes.dex */
public final class r46 implements xa0 {
    public final xa0 a;
    public final AsyncImagePainter b;
    public final he c;
    public final sb1 d;

    public r46(xa0 xa0Var, AsyncImagePainter asyncImagePainter, he heVar, sb1 sb1Var) {
        this.a = xa0Var;
        this.b = asyncImagePainter;
        this.c = heVar;
        this.d = sb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r46) {
            r46 r46Var = (r46) obj;
            if (this.a.equals(r46Var.a) && this.b == r46Var.b && im3.n(this.c, r46Var.c) && im3.n(this.d, r46Var.d) && Float.compare(1.0f, 1.0f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + e41.e(1.0f, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 961)) * 31)) * 31, 961);
    }

    public final String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.a + ", painter=" + this.b + ", contentDescription=null, alignment=" + this.c + ", contentScale=" + this.d + ", alpha=1.0, colorFilter=null, clipToBounds=true)";
    }
}
