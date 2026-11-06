package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends g {
    public abstract void F(int i, StringBuilder sb);

    public int G(int i) {
        return i % 100000;
    }

    public final void H(StringBuilder sb, int i, int i2) {
        int iQ = iu.q(i, i2, (i70) ((iu) this.b).f1103o);
        F(iQ, sb);
        int iG = G(iQ);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (iG / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(iG);
    }
}
