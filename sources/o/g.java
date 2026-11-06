package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends io.sentry.l6 {
    public final void D(int i, StringBuilder sb) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        E(sb, i, length);
    }

    public final void E(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int iQ = iu.q((i3 * 10) + i, 10, (i70) ((iu) this.b).f1103o);
            if (iQ / 100 == 0) {
                sb.append('0');
            }
            if (iQ / 10 == 0) {
                sb.append('0');
            }
            sb.append(iQ);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 13; i5++) {
            int iCharAt = sb.charAt(i5 + i2) - '0';
            if ((i5 & 1) == 0) {
                iCharAt *= 3;
            }
            i4 += iCharAt;
        }
        int i6 = 10 - (i4 % 10);
        sb.append(i6 != 10 ? i6 : 0);
    }
}
